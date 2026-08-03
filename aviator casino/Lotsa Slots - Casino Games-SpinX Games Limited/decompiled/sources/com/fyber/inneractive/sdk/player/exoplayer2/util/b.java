package com.fyber.inneractive.sdk.player.exoplayer2.util;

/* loaded from: classes3.dex */
public final class b extends java.io.OutputStream {

    /* renamed from: a, reason: collision with root package name */
    public final java.io.FileOutputStream f4102a;
    public boolean b = false;

    public b(java.io.File file) {
        this.f4102a = new java.io.FileOutputStream(file);
    }

    @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.b) {
            return;
        }
        this.b = true;
        this.f4102a.flush();
        try {
            this.f4102a.getFD().sync();
        } catch (java.io.IOException e) {
            android.util.Log.w("AtomicFile", "Failed to sync file descriptor:", e);
        }
        this.f4102a.close();
    }

    @Override // java.io.OutputStream, java.io.Flushable
    public final void flush() {
        this.f4102a.flush();
    }

    @Override // java.io.OutputStream
    public final void write(int i) {
        this.f4102a.write(i);
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr) {
        this.f4102a.write(bArr);
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr, int i, int i2) {
        this.f4102a.write(bArr, i, i2);
    }
}
