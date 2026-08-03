package com.google.common.io;

@com.google.common.io.ElementTypesAreNonnullByDefault
/* loaded from: classes3.dex */
final class CharSequenceReader extends java.io.Reader {
    private int mark;
    private int pos;

    @javax.annotation.CheckForNull
    private java.lang.CharSequence seq;

    @Override // java.io.Reader
    public boolean markSupported() {
        return true;
    }

    public CharSequenceReader(java.lang.CharSequence seq) {
        this.seq = (java.lang.CharSequence) com.google.common.base.Preconditions.checkNotNull(seq);
    }

    private void checkOpen() throws java.io.IOException {
        if (this.seq == null) {
            throw new java.io.IOException("reader closed");
        }
    }

    private boolean hasRemaining() {
        return remaining() > 0;
    }

    private int remaining() {
        java.util.Objects.requireNonNull(this.seq);
        return this.seq.length() - this.pos;
    }

    @Override // java.io.Reader, java.lang.Readable
    public synchronized int read(java.nio.CharBuffer target) throws java.io.IOException {
        com.google.common.base.Preconditions.checkNotNull(target);
        checkOpen();
        java.util.Objects.requireNonNull(this.seq);
        if (!hasRemaining()) {
            return -1;
        }
        int min = java.lang.Math.min(target.remaining(), remaining());
        for (int i = 0; i < min; i++) {
            java.lang.CharSequence charSequence = this.seq;
            int i2 = this.pos;
            this.pos = i2 + 1;
            target.put(charSequence.charAt(i2));
        }
        return min;
    }

    @Override // java.io.Reader
    public synchronized int read() throws java.io.IOException {
        char c;
        checkOpen();
        java.util.Objects.requireNonNull(this.seq);
        if (hasRemaining()) {
            java.lang.CharSequence charSequence = this.seq;
            int i = this.pos;
            this.pos = i + 1;
            c = charSequence.charAt(i);
        } else {
            c = 65535;
        }
        return c;
    }

    @Override // java.io.Reader
    public synchronized int read(char[] cbuf, int off, int len) throws java.io.IOException {
        com.google.common.base.Preconditions.checkPositionIndexes(off, off + len, cbuf.length);
        checkOpen();
        java.util.Objects.requireNonNull(this.seq);
        if (!hasRemaining()) {
            return -1;
        }
        int min = java.lang.Math.min(len, remaining());
        for (int i = 0; i < min; i++) {
            java.lang.CharSequence charSequence = this.seq;
            int i2 = this.pos;
            this.pos = i2 + 1;
            cbuf[off + i] = charSequence.charAt(i2);
        }
        return min;
    }

    @Override // java.io.Reader
    public synchronized long skip(long n) throws java.io.IOException {
        int min;
        com.google.common.base.Preconditions.checkArgument(n >= 0, "n (%s) may not be negative", n);
        checkOpen();
        min = (int) java.lang.Math.min(remaining(), n);
        this.pos += min;
        return min;
    }

    @Override // java.io.Reader
    public synchronized boolean ready() throws java.io.IOException {
        checkOpen();
        return true;
    }

    @Override // java.io.Reader
    public synchronized void mark(int readAheadLimit) throws java.io.IOException {
        com.google.common.base.Preconditions.checkArgument(readAheadLimit >= 0, "readAheadLimit (%s) may not be negative", readAheadLimit);
        checkOpen();
        this.mark = this.pos;
    }

    @Override // java.io.Reader
    public synchronized void reset() throws java.io.IOException {
        checkOpen();
        this.pos = this.mark;
    }

    @Override // java.io.Reader, java.io.Closeable, java.lang.AutoCloseable
    public synchronized void close() throws java.io.IOException {
        this.seq = null;
    }
}
