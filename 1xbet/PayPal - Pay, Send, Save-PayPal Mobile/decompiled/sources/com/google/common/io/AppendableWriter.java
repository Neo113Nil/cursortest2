package com.google.common.io;

/* loaded from: classes9.dex */
final class AppendableWriter extends java.io.Writer {
    private boolean closed;
    private final java.lang.Appendable target;

    @Override // java.io.Writer, java.lang.Appendable
    public final /* bridge */ /* synthetic */ java.lang.Appendable append(char c) throws java.io.IOException {
        return append(c);
    }

    @Override // java.io.Writer, java.lang.Appendable
    public final /* bridge */ /* synthetic */ java.lang.Appendable append(java.lang.CharSequence charSequence) throws java.io.IOException {
        return append(charSequence);
    }

    @Override // java.io.Writer, java.lang.Appendable
    public final /* bridge */ /* synthetic */ java.lang.Appendable append(java.lang.CharSequence charSequence, int i, int i2) throws java.io.IOException {
        return append(charSequence, i, i2);
    }

    AppendableWriter(java.lang.Appendable appendable) {
        this.target = (java.lang.Appendable) com.google.common.base.Preconditions.checkNotNull(appendable);
    }

    @Override // java.io.Writer
    public final void write(char[] cArr, int i, int i2) throws java.io.IOException {
        checkNotClosed();
        this.target.append(new java.lang.String(cArr, i, i2));
    }

    @Override // java.io.Writer
    public final void write(int i) throws java.io.IOException {
        checkNotClosed();
        this.target.append((char) i);
    }

    @Override // java.io.Writer
    public final void write(java.lang.String str) throws java.io.IOException {
        com.google.common.base.Preconditions.checkNotNull(str);
        checkNotClosed();
        this.target.append(str);
    }

    @Override // java.io.Writer
    public final void write(java.lang.String str, int i, int i2) throws java.io.IOException {
        com.google.common.base.Preconditions.checkNotNull(str);
        checkNotClosed();
        this.target.append(str, i, i2 + i);
    }

    @Override // java.io.Writer, java.io.Flushable
    public final void flush() throws java.io.IOException {
        checkNotClosed();
        java.lang.Appendable appendable = this.target;
        if (appendable instanceof java.io.Flushable) {
            ((java.io.Flushable) appendable).flush();
        }
    }

    @Override // java.io.Writer, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws java.io.IOException {
        this.closed = true;
        java.lang.Appendable appendable = this.target;
        if (appendable instanceof java.io.Closeable) {
            ((java.io.Closeable) appendable).close();
        }
    }

    @Override // java.io.Writer, java.lang.Appendable
    public final java.io.Writer append(char c) throws java.io.IOException {
        checkNotClosed();
        this.target.append(c);
        return this;
    }

    @Override // java.io.Writer, java.lang.Appendable
    public final java.io.Writer append(java.lang.CharSequence charSequence) throws java.io.IOException {
        checkNotClosed();
        this.target.append(charSequence);
        return this;
    }

    @Override // java.io.Writer, java.lang.Appendable
    public final java.io.Writer append(java.lang.CharSequence charSequence, int i, int i2) throws java.io.IOException {
        checkNotClosed();
        this.target.append(charSequence, i, i2);
        return this;
    }

    private void checkNotClosed() throws java.io.IOException {
        if (this.closed) {
            throw new java.io.IOException("Cannot write to a closed writer.");
        }
    }
}
