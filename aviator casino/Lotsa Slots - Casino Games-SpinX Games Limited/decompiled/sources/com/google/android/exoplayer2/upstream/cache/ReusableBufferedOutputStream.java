package com.google.android.exoplayer2.upstream.cache;

/* loaded from: classes3.dex */
final class ReusableBufferedOutputStream extends java.io.BufferedOutputStream {
    private boolean closed;

    public ReusableBufferedOutputStream(java.io.OutputStream outputStream) {
        super(outputStream);
    }

    public ReusableBufferedOutputStream(java.io.OutputStream outputStream, int i) {
        super(outputStream, i);
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws java.io.IOException {
        this.closed = true;
        try {
            flush();
            th = null;
        } catch (java.lang.Throwable th) {
            th = th;
        }
        try {
            this.out.close();
        } catch (java.lang.Throwable th2) {
            if (th == null) {
                th = th2;
            }
        }
        if (th != null) {
            com.google.android.exoplayer2.util.Util.sneakyThrow(th);
        }
    }

    public void reset(java.io.OutputStream outputStream) {
        com.google.android.exoplayer2.util.Assertions.checkState(this.closed);
        this.out = outputStream;
        this.count = 0;
        this.closed = false;
    }
}
