package com.google.common.io;

/* loaded from: classes9.dex */
final class MultiReader extends java.io.Reader {
    private java.io.Reader current;
    private final java.util.Iterator<? extends com.google.common.io.CharSource> it;

    MultiReader(java.util.Iterator<? extends com.google.common.io.CharSource> it) throws java.io.IOException {
        this.it = it;
        advance();
    }

    private void advance() throws java.io.IOException {
        close();
        if (this.it.hasNext()) {
            this.current = this.it.next().openStream();
        }
    }

    @Override // java.io.Reader
    public final int read(char[] cArr, int i, int i2) throws java.io.IOException {
        while (true) {
            com.google.common.base.Preconditions.checkNotNull(cArr);
            java.io.Reader reader = this.current;
            if (reader == null) {
                return -1;
            }
            int read = reader.read(cArr, i, i2);
            if (read != -1) {
                return read;
            }
            advance();
        }
    }

    @Override // java.io.Reader
    public final long skip(long j) throws java.io.IOException {
        com.google.common.base.Preconditions.checkArgument(j >= 0, "n is negative");
        if (j > 0) {
            while (true) {
                java.io.Reader reader = this.current;
                if (reader == null) {
                    break;
                }
                long skip = reader.skip(j);
                if (skip > 0) {
                    return skip;
                }
                advance();
            }
        }
        return 0L;
    }

    @Override // java.io.Reader
    public final boolean ready() throws java.io.IOException {
        java.io.Reader reader = this.current;
        return reader != null && reader.ready();
    }

    @Override // java.io.Reader, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws java.io.IOException {
        java.io.Reader reader = this.current;
        if (reader != null) {
            try {
                reader.close();
            } finally {
                this.current = null;
            }
        }
    }
}
