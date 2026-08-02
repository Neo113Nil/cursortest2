package com.google.common.io;

/* loaded from: classes9.dex */
public final class Resources {
    private Resources() {
    }

    public static com.google.common.io.ByteSource asByteSource(java.net.URL url) {
        return new com.google.common.io.Resources.UrlByteSource(url);
    }

    static final class UrlByteSource extends com.google.common.io.ByteSource {
        private final java.net.URL url;

        private UrlByteSource(java.net.URL url) {
            this.url = (java.net.URL) com.google.common.base.Preconditions.checkNotNull(url);
        }

        @Override // com.google.common.io.ByteSource
        public final java.io.InputStream openStream() throws java.io.IOException {
            return this.url.openStream();
        }

        public final java.lang.String toString() {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Resources.asByteSource(");
            sb.append(this.url);
            sb.append(")");
            return sb.toString();
        }
    }

    public static com.google.common.io.CharSource asCharSource(java.net.URL url, java.nio.charset.Charset charset) {
        return asByteSource(url).asCharSource(charset);
    }

    public static byte[] toByteArray(java.net.URL url) throws java.io.IOException {
        return asByteSource(url).read();
    }

    public static java.lang.String toString(java.net.URL url, java.nio.charset.Charset charset) throws java.io.IOException {
        return asCharSource(url, charset).read();
    }

    public static <T> T readLines(java.net.URL url, java.nio.charset.Charset charset, com.google.common.io.LineProcessor<T> lineProcessor) throws java.io.IOException {
        return (T) asCharSource(url, charset).readLines(lineProcessor);
    }

    public static java.util.List<java.lang.String> readLines(java.net.URL url, java.nio.charset.Charset charset) throws java.io.IOException {
        return (java.util.List) readLines(url, charset, new com.google.common.io.LineProcessor<java.util.List<java.lang.String>>() { // from class: com.google.common.io.Resources.1
            final java.util.List<java.lang.String> result = new java.util.ArrayList();

            @Override // com.google.common.io.LineProcessor
            public boolean processLine(java.lang.String str) {
                this.result.add(str);
                return true;
            }

            @Override // com.google.common.io.LineProcessor
            public java.util.List<java.lang.String> getResult() {
                return this.result;
            }
        });
    }

    public static void copy(java.net.URL url, java.io.OutputStream outputStream) throws java.io.IOException {
        asByteSource(url).copyTo(outputStream);
    }

    public static java.net.URL getResource(java.lang.String str) {
        java.net.URL resource = ((java.lang.ClassLoader) com.google.common.base.MoreObjects.firstNonNull(java.lang.Thread.currentThread().getContextClassLoader(), com.google.common.io.Resources.class.getClassLoader())).getResource(str);
        com.google.common.base.Preconditions.checkArgument(resource != null, "resource %s not found.", str);
        return resource;
    }

    public static java.net.URL getResource(java.lang.Class<?> cls, java.lang.String str) {
        java.net.URL resource = cls.getResource(str);
        com.google.common.base.Preconditions.checkArgument(resource != null, "resource %s relative to %s not found.", str, cls.getName());
        return resource;
    }
}
