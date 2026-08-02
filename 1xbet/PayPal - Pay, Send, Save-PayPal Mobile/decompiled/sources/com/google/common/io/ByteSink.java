package com.google.common.io;

/* loaded from: classes9.dex */
public abstract class ByteSink {
    public abstract java.io.OutputStream openStream() throws java.io.IOException;

    protected ByteSink() {
    }

    public com.google.common.io.CharSink asCharSink(java.nio.charset.Charset charset) {
        return new com.google.common.io.ByteSink.AsCharSink(charset);
    }

    public java.io.OutputStream openBufferedStream() throws java.io.IOException {
        java.io.OutputStream openStream = openStream();
        if (openStream instanceof java.io.BufferedOutputStream) {
            return (java.io.BufferedOutputStream) openStream;
        }
        return new java.io.BufferedOutputStream(openStream);
    }

    public void write(byte[] bArr) throws java.io.IOException {
        com.google.common.base.Preconditions.checkNotNull(bArr);
        java.io.OutputStream openStream = openStream();
        try {
            openStream.write(bArr);
            if (openStream != null) {
                openStream.close();
            }
        } catch (java.lang.Throwable th) {
            if (openStream != null) {
                try {
                    openStream.close();
                } catch (java.lang.Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    public long writeFrom(java.io.InputStream inputStream) throws java.io.IOException {
        com.google.common.base.Preconditions.checkNotNull(inputStream);
        java.io.OutputStream openStream = openStream();
        try {
            long copy = com.google.common.io.ByteStreams.copy(inputStream, openStream);
            if (openStream != null) {
                openStream.close();
            }
            return copy;
        } catch (java.lang.Throwable th) {
            if (openStream != null) {
                try {
                    openStream.close();
                } catch (java.lang.Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    final class AsCharSink extends com.google.common.io.CharSink {
        private final java.nio.charset.Charset charset;

        private AsCharSink(java.nio.charset.Charset charset) {
            this.charset = (java.nio.charset.Charset) com.google.common.base.Preconditions.checkNotNull(charset);
        }

        @Override // com.google.common.io.CharSink
        public final java.io.Writer openStream() throws java.io.IOException {
            return new java.io.OutputStreamWriter(com.google.common.io.ByteSink.this.openStream(), this.charset);
        }

        public final java.lang.String toString() {
            java.lang.StringBuilder sb = new java.lang.StringBuilder();
            sb.append(com.google.common.io.ByteSink.this.toString());
            sb.append(".asCharSink(");
            sb.append(this.charset);
            sb.append(")");
            return sb.toString();
        }
    }
}
