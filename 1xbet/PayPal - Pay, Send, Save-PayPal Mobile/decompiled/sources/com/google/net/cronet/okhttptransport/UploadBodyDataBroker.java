package com.google.net.cronet.okhttptransport;

/* loaded from: classes4.dex */
final class UploadBodyDataBroker implements okio.Sink {
    private final java.util.concurrent.BlockingQueue pendingRead = new java.util.concurrent.ArrayBlockingQueue(1);
    private final java.util.concurrent.atomic.AtomicBoolean isClosed = new java.util.concurrent.atomic.AtomicBoolean();
    private final java.util.concurrent.atomic.AtomicReference backgroundReadThrowable = new java.util.concurrent.atomic.AtomicReference();

    enum ReadResult {
        SUCCESS,
        END_OF_BODY
    }

    @Override // okio.Sink, java.io.Flushable
    public final void flush() {
    }

    UploadBodyDataBroker() {
    }

    final java.util.concurrent.Future enqueueBodyRead(java.nio.ByteBuffer byteBuffer) {
        java.lang.Throwable th = (java.lang.Throwable) this.backgroundReadThrowable.get();
        if (th != null) {
            return com.google.common.util.concurrent.Futures.immediateFailedFuture(th);
        }
        com.google.common.util.concurrent.SettableFuture create = com.google.common.util.concurrent.SettableFuture.create();
        this.pendingRead.add(android.util.Pair.create(byteBuffer, create));
        java.lang.Throwable th2 = (java.lang.Throwable) this.backgroundReadThrowable.get();
        if (th2 != null) {
            create.setException(th2);
        }
        return create;
    }

    final void setBackgroundReadError(java.lang.Throwable th) {
        this.backgroundReadThrowable.set(th);
        android.util.Pair pair = (android.util.Pair) this.pendingRead.poll();
        if (pair != null) {
            ((com.google.common.util.concurrent.SettableFuture) pair.second).setException(th);
        }
    }

    final void handleEndOfStreamSignal() throws java.io.IOException {
        if (this.isClosed.getAndSet(true)) {
            throw new java.lang.IllegalStateException("Already closed");
        }
        ((com.google.common.util.concurrent.SettableFuture) getPendingCronetRead().second).set(com.google.net.cronet.okhttptransport.UploadBodyDataBroker.ReadResult.END_OF_BODY);
    }

    @Override // okio.Sink
    public final void write(okio.Buffer buffer, long j) throws java.io.IOException {
        com.google.common.base.Preconditions.checkState(!this.isClosed.get());
        while (j != 0) {
            android.util.Pair pendingCronetRead = getPendingCronetRead();
            java.nio.ByteBuffer byteBuffer = (java.nio.ByteBuffer) pendingCronetRead.first;
            com.google.common.util.concurrent.SettableFuture settableFuture = (com.google.common.util.concurrent.SettableFuture) pendingCronetRead.second;
            int limit = byteBuffer.limit();
            byteBuffer.limit((int) java.lang.Math.min(limit, j));
            try {
                long read = buffer.read(byteBuffer);
                if (read == -1) {
                    java.io.IOException iOException = new java.io.IOException("The source has been exhausted but we expected more!");
                    settableFuture.setException(iOException);
                    throw iOException;
                }
                j -= read;
                byteBuffer.limit(limit);
                settableFuture.set(com.google.net.cronet.okhttptransport.UploadBodyDataBroker.ReadResult.SUCCESS);
            } catch (java.io.IOException e) {
                settableFuture.setException(e);
                throw e;
            }
        }
    }

    private android.util.Pair getPendingCronetRead() throws java.io.IOException {
        try {
            return (android.util.Pair) this.pendingRead.take();
        } catch (java.lang.InterruptedException unused) {
            java.lang.Thread.currentThread().interrupt();
            throw new java.io.IOException("Interrupted while waiting for a read to finish!");
        }
    }

    @Override // okio.Sink, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.isClosed.set(true);
    }

    @Override // okio.Sink
    /* renamed from: timeout */
    public final okio.Timeout getGetHighSpeedVideoFpsRangesFor() {
        return okio.Timeout.NONE;
    }
}
