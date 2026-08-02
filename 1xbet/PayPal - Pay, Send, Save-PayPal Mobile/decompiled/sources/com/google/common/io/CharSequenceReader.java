package com.google.common.io;

/* loaded from: classes9.dex */
final class CharSequenceReader extends java.io.Reader {
    private int mark;
    private int pos;
    private java.lang.CharSequence seq;

    @Override // java.io.Reader
    public final boolean markSupported() {
        return true;
    }

    public CharSequenceReader(java.lang.CharSequence charSequence) {
        this.seq = (java.lang.CharSequence) com.google.common.base.Preconditions.checkNotNull(charSequence);
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
    public final int read(java.nio.CharBuffer charBuffer) throws java.io.IOException {
        synchronized (this) {
            com.google.common.base.Preconditions.checkNotNull(charBuffer);
            checkOpen();
            java.util.Objects.requireNonNull(this.seq);
            if (!hasRemaining()) {
                return -1;
            }
            int min = java.lang.Math.min(charBuffer.remaining(), remaining());
            for (int i = 0; i < min; i++) {
                java.lang.CharSequence charSequence = this.seq;
                int i2 = this.pos;
                this.pos = i2 + 1;
                charBuffer.put(charSequence.charAt(i2));
            }
            return min;
        }
    }

    @Override // java.io.Reader
    public final int read() throws java.io.IOException {
        char c;
        synchronized (this) {
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
        }
        return c;
    }

    @Override // java.io.Reader
    public final int read(char[] cArr, int i, int i2) throws java.io.IOException {
        synchronized (this) {
            com.google.common.base.Preconditions.checkPositionIndexes(i, i + i2, cArr.length);
            checkOpen();
            java.util.Objects.requireNonNull(this.seq);
            if (!hasRemaining()) {
                return -1;
            }
            int min = java.lang.Math.min(i2, remaining());
            for (int i3 = 0; i3 < min; i3++) {
                java.lang.CharSequence charSequence = this.seq;
                int i4 = this.pos;
                this.pos = i4 + 1;
                cArr[i + i3] = charSequence.charAt(i4);
            }
            return min;
        }
    }

    @Override // java.io.Reader
    public final long skip(long j) throws java.io.IOException {
        long j2;
        synchronized (this) {
            com.google.common.base.Preconditions.checkArgument(j >= 0, "n (%s) may not be negative", j);
            checkOpen();
            int min = (int) java.lang.Math.min(remaining(), j);
            this.pos += min;
            j2 = min;
        }
        return j2;
    }

    @Override // java.io.Reader
    public final boolean ready() throws java.io.IOException {
        synchronized (this) {
            checkOpen();
        }
        return true;
    }

    @Override // java.io.Reader
    public final void mark(int i) throws java.io.IOException {
        synchronized (this) {
            com.google.common.base.Preconditions.checkArgument(i >= 0, "readAheadLimit (%s) may not be negative", i);
            checkOpen();
            this.mark = this.pos;
        }
    }

    @Override // java.io.Reader
    public final void reset() throws java.io.IOException {
        synchronized (this) {
            checkOpen();
            this.pos = this.mark;
        }
    }

    @Override // java.io.Reader, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws java.io.IOException {
        synchronized (this) {
            this.seq = null;
        }
    }
}
