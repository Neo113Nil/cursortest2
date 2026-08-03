package androidx.media3.datasource.cache;

/* loaded from: classes2.dex */
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
            androidx.media3.common.util.Util.sneakyThrow(th);
        }
    }

    public void reset(java.io.OutputStream outputStream) {
        androidx.media3.common.util.Assertions.checkState(this.closed);
        this.out = outputStream;
        this.count = 0;
        this.closed = false;
    }
}
