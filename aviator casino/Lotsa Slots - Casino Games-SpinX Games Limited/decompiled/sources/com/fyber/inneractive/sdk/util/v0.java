package com.fyber.inneractive.sdk.util;

/* loaded from: classes3.dex */
public final class v0 extends java.io.BufferedInputStream {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.util.concurrent.atomic.AtomicInteger f4316a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v0(java.io.InputStream inputStream, java.util.concurrent.atomic.AtomicInteger atomicInteger) {
        super(inputStream);
        this.f4316a = atomicInteger;
    }

    @Override // java.io.BufferedInputStream, java.io.FilterInputStream, java.io.InputStream
    public final synchronized int read(byte[] bArr, int i, int i2) {
        int read;
        read = super.read(bArr, i, i2);
        if (read != -1) {
            this.f4316a.getAndAdd(read);
        }
        return read;
    }

    @Override // java.io.BufferedInputStream, java.io.FilterInputStream, java.io.InputStream
    public final synchronized void reset() {
        this.f4316a.set(0);
        super.reset();
    }

    @Override // java.io.BufferedInputStream, java.io.FilterInputStream, java.io.InputStream
    public final synchronized long skip(long j) {
        long skip;
        skip = super.skip(j);
        this.f4316a.addAndGet((int) skip);
        return skip;
    }
}
