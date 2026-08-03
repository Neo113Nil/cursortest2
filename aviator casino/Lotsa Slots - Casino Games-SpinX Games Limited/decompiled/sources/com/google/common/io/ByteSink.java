package com.google.common.io;

@com.google.common.io.ElementTypesAreNonnullByDefault
/* loaded from: classes3.dex */
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

    public void write(byte[] bytes) throws java.io.IOException {
        com.google.common.base.Preconditions.checkNotNull(bytes);
        try {
            java.io.OutputStream outputStream = (java.io.OutputStream) com.google.common.io.Closer.create().register(openStream());
            outputStream.write(bytes);
            outputStream.flush();
        } finally {
        }
    }

    public long writeFrom(java.io.InputStream input) throws java.io.IOException {
        com.google.common.base.Preconditions.checkNotNull(input);
        try {
            java.io.OutputStream outputStream = (java.io.OutputStream) com.google.common.io.Closer.create().register(openStream());
            long copy = com.google.common.io.ByteStreams.copy(input, outputStream);
            outputStream.flush();
            return copy;
        } finally {
        }
    }

    private final class AsCharSink extends com.google.common.io.CharSink {
        private final java.nio.charset.Charset charset;

        private AsCharSink(java.nio.charset.Charset charset) {
            this.charset = (java.nio.charset.Charset) com.google.common.base.Preconditions.checkNotNull(charset);
        }

        @Override // com.google.common.io.CharSink
        public java.io.Writer openStream() throws java.io.IOException {
            return new java.io.OutputStreamWriter(com.google.common.io.ByteSink.this.openStream(), this.charset);
        }

        public java.lang.String toString() {
            return com.google.common.io.ByteSink.this.toString() + ".asCharSink(" + this.charset + ")";
        }
    }
}
