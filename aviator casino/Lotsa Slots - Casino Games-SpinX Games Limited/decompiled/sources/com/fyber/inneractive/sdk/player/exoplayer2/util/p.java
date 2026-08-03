package com.fyber.inneractive.sdk.player.exoplayer2.util;

/* loaded from: classes3.dex */
public final class p extends java.io.BufferedOutputStream {

    /* renamed from: a, reason: collision with root package name */
    public boolean f4114a;

    public p(com.fyber.inneractive.sdk.player.exoplayer2.util.b bVar) {
        super(bVar);
    }

    public final void a(java.io.OutputStream outputStream) {
        if (!this.f4114a) {
            throw new java.lang.IllegalStateException();
        }
        ((java.io.BufferedOutputStream) this).out = outputStream;
        ((java.io.BufferedOutputStream) this).count = 0;
        this.f4114a = false;
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f4114a = true;
        try {
            flush();
            th = null;
        } catch (java.lang.Throwable th) {
            th = th;
        }
        try {
            ((java.io.BufferedOutputStream) this).out.close();
        } catch (java.lang.Throwable th2) {
            if (th == null) {
                th = th2;
            }
        }
        if (th == null) {
            return;
        }
        int i = com.fyber.inneractive.sdk.player.exoplayer2.util.z.f4120a;
        throw th;
    }

    public p(java.io.OutputStream outputStream, int i) {
        super(outputStream, i);
    }
}
