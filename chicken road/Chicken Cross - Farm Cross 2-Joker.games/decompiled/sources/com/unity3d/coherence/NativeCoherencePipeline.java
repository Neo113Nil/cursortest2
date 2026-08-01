package com.unity3d.coherence;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* loaded from: classes7.dex */
final class NativeCoherencePipeline implements CoherencePipeline {
    private final long apiPtr;
    private boolean closed;
    private byte[] currentWasm;
    private long[] vmHandles;
    private final ReentrantReadWriteLock rwLock = new ReentrantReadWriteLock();
    private final AtomicInteger rrCounter = new AtomicInteger();

    NativeCoherencePipeline(long j, byte[] bArr, int i) throws CoherenceException {
        if (bArr == null || bArr.length == 0) {
            throw new CoherenceException(5, "wasmBytes is null or empty");
        }
        if (i < 1) {
            throw new CoherenceException(5, "concurrency must be >= 1");
        }
        this.apiPtr = j;
        this.currentWasm = (byte[]) bArr.clone();
        this.vmHandles = new long[i];
        try {
            createVms();
        } catch (CoherenceException e) {
            dropAllVms(this.vmHandles);
            throw e;
        }
    }

    private void createVms() throws CoherenceException {
        for (int i = 0; i < this.vmHandles.length; i++) {
            long vmCreate = CoherenceBridge.vmCreate(this.apiPtr, this.currentWasm);
            if (vmCreate == 0) {
                throw new CoherenceException(2, "create_vm failed on slot " + i + ": " + CoherenceBridge.vmLastError(this.apiPtr));
            }
            this.vmHandles[i] = vmCreate;
        }
    }

    @Override // com.unity3d.coherence.CoherencePipeline
    public void load(byte[] bArr) throws CoherenceException {
        if (bArr == null || bArr.length == 0) {
            throw new CoherenceException(5, "wasmBytes is null or empty");
        }
        this.rwLock.writeLock().lock();
        try {
            if (this.closed) {
                throw new CoherenceException(3, "pipeline closed");
            }
            this.currentWasm = (byte[]) bArr.clone();
            String str = null;
            int i = -1;
            int i2 = 0;
            while (true) {
                long[] jArr = this.vmHandles;
                if (i2 >= jArr.length) {
                    break;
                }
                long j = jArr[i2];
                if (j != 0) {
                    CoherenceBridge.vmDrop(this.apiPtr, j);
                    this.vmHandles[i2] = 0;
                }
                long vmCreate = CoherenceBridge.vmCreate(this.apiPtr, this.currentWasm);
                if (vmCreate == 0 && str == null) {
                    str = CoherenceBridge.vmLastError(this.apiPtr);
                    i = i2;
                }
                this.vmHandles[i2] = vmCreate;
                i2++;
            }
            if (str != null) {
                throw new CoherenceException(2, "create_vm failed on slot " + i + ": " + str);
            }
        } finally {
            this.rwLock.writeLock().unlock();
        }
    }

    @Override // com.unity3d.coherence.CoherencePipeline
    public byte[] execute(byte[] bArr) throws CoherenceException {
        this.rwLock.readLock().lock();
        try {
            if (this.closed) {
                throw new CoherenceException(3, "pipeline closed");
            }
            if (this.vmHandles.length == 0) {
                throw new CoherenceException(3, "no VMs");
            }
            int floorMod = Math.floorMod(this.rrCounter.getAndIncrement(), this.vmHandles.length);
            long j = this.vmHandles[floorMod];
            if (j == 0) {
                throw new CoherenceException(3, "slot " + floorMod + " has no VM");
            }
            if (bArr == null) {
                bArr = new byte[0];
            }
            try {
                VmInvokeResult vmInvokeMain = CoherenceBridge.vmInvokeMain(this.apiPtr, j, bArr);
                if (vmInvokeMain.status == 0) {
                    return vmInvokeMain.bytes != null ? vmInvokeMain.bytes : new byte[0];
                }
                throw new CoherenceException(vmInvokeMain.status, vmInvokeMain.errorMessage != null ? vmInvokeMain.errorMessage : "");
            } catch (Throwable th) {
                throw new CoherenceException(6, th.toString());
            }
        } finally {
            this.rwLock.readLock().unlock();
        }
    }

    @Override // com.unity3d.coherence.CoherencePipeline
    public int getConcurrency() {
        this.rwLock.readLock().lock();
        try {
            long[] jArr = this.vmHandles;
            return jArr != null ? jArr.length : 0;
        } finally {
            this.rwLock.readLock().unlock();
        }
    }

    @Override // com.unity3d.coherence.CoherencePipeline, java.lang.AutoCloseable
    public void close() {
        this.rwLock.writeLock().lock();
        try {
            if (this.closed) {
                return;
            }
            this.closed = true;
            dropAllVms(this.vmHandles);
            this.vmHandles = new long[0];
        } finally {
            this.rwLock.writeLock().unlock();
        }
    }

    private void dropAllVms(long[] jArr) {
        if (jArr == null) {
            return;
        }
        for (int i = 0; i < jArr.length; i++) {
            long j = jArr[i];
            if (j != 0) {
                CoherenceBridge.vmDrop(this.apiPtr, j);
                jArr[i] = 0;
            }
        }
    }
}
