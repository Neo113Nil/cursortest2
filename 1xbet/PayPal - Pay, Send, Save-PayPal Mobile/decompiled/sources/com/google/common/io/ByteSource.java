package com.google.common.io;

/* loaded from: classes9.dex */
public abstract class ByteSource {
    public abstract java.io.InputStream openStream() throws java.io.IOException;

    protected ByteSource() {
    }

    public com.google.common.io.CharSource asCharSource(java.nio.charset.Charset charset) {
        return new com.google.common.io.ByteSource.AsCharSource(charset);
    }

    public java.io.InputStream openBufferedStream() throws java.io.IOException {
        java.io.InputStream openStream = openStream();
        if (openStream instanceof java.io.BufferedInputStream) {
            return (java.io.BufferedInputStream) openStream;
        }
        return new java.io.BufferedInputStream(openStream);
    }

    public com.google.common.io.ByteSource slice(long j, long j2) {
        return new com.google.common.io.ByteSource.SlicedByteSource(j, j2);
    }

    public boolean isEmpty() throws java.io.IOException {
        com.google.common.base.Optional<java.lang.Long> sizeIfKnown = sizeIfKnown();
        if (sizeIfKnown.isPresent()) {
            return sizeIfKnown.get().longValue() == 0;
        }
        try {
            return ((java.io.InputStream) com.google.common.io.Closer.create().register(openStream())).read() == -1;
        } finally {
        }
    }

    public com.google.common.base.Optional<java.lang.Long> sizeIfKnown() {
        return com.google.common.base.Optional.absent();
    }

    public long size() throws java.io.IOException {
        com.google.common.base.Optional<java.lang.Long> sizeIfKnown = sizeIfKnown();
        if (sizeIfKnown.isPresent()) {
            return sizeIfKnown.get().longValue();
        }
        com.google.common.io.Closer create = com.google.common.io.Closer.create();
        try {
            return countBySkipping((java.io.InputStream) create.register(openStream()));
        } catch (java.io.IOException unused) {
            create.close();
            try {
                return com.google.common.io.ByteStreams.exhaust((java.io.InputStream) com.google.common.io.Closer.create().register(openStream()));
            } finally {
            }
        } finally {
        }
    }

    private static long countBySkipping(java.io.InputStream inputStream) throws java.io.IOException {
        long j = 0;
        while (true) {
            long skipUpTo = com.google.common.io.ByteStreams.skipUpTo(inputStream, androidx.collection.SieveCacheKt.NodeLinkMask);
            if (skipUpTo <= 0) {
                return j;
            }
            j += skipUpTo;
        }
    }

    public long copyTo(java.io.OutputStream outputStream) throws java.io.IOException {
        com.google.common.base.Preconditions.checkNotNull(outputStream);
        try {
            return com.google.common.io.ByteStreams.copy((java.io.InputStream) com.google.common.io.Closer.create().register(openStream()), outputStream);
        } finally {
        }
    }

    public long copyTo(com.google.common.io.ByteSink byteSink) throws java.io.IOException {
        com.google.common.base.Preconditions.checkNotNull(byteSink);
        com.google.common.io.Closer create = com.google.common.io.Closer.create();
        try {
            return com.google.common.io.ByteStreams.copy((java.io.InputStream) create.register(openStream()), (java.io.OutputStream) create.register(byteSink.openStream()));
        } finally {
        }
    }

    public byte[] read() throws java.io.IOException {
        byte[] byteArray;
        com.google.common.io.Closer create = com.google.common.io.Closer.create();
        try {
            java.io.InputStream inputStream = (java.io.InputStream) create.register(openStream());
            com.google.common.base.Optional<java.lang.Long> sizeIfKnown = sizeIfKnown();
            if (sizeIfKnown.isPresent()) {
                byteArray = com.google.common.io.ByteStreams.toByteArray(inputStream, sizeIfKnown.get().longValue());
            } else {
                byteArray = com.google.common.io.ByteStreams.toByteArray(inputStream);
            }
            return byteArray;
        } catch (java.lang.Throwable th) {
            try {
                throw create.rethrow(th);
            } finally {
                create.close();
            }
        }
    }

    public <T> T read(com.google.common.io.ByteProcessor<T> byteProcessor) throws java.io.IOException {
        com.google.common.base.Preconditions.checkNotNull(byteProcessor);
        try {
            return (T) com.google.common.io.ByteStreams.readBytes((java.io.InputStream) com.google.common.io.Closer.create().register(openStream()), byteProcessor);
        } finally {
        }
    }

    public com.google.common.hash.HashCode hash(com.google.common.hash.HashFunction hashFunction) throws java.io.IOException {
        com.google.common.hash.Hasher newHasher = hashFunction.newHasher();
        copyTo(com.google.common.hash.Funnels.asOutputStream(newHasher));
        return newHasher.hash();
    }

    public boolean contentEquals(com.google.common.io.ByteSource byteSource) throws java.io.IOException {
        com.google.common.base.Preconditions.checkNotNull(byteSource);
        com.google.common.io.Closer create = com.google.common.io.Closer.create();
        try {
            return com.google.common.io.ByteStreams.contentsEqual((java.io.InputStream) create.register(openStream()), (java.io.InputStream) create.register(byteSource.openStream()));
        } finally {
        }
    }

    public static com.google.common.io.ByteSource concat(java.lang.Iterable<? extends com.google.common.io.ByteSource> iterable) {
        return new com.google.common.io.ByteSource.ConcatenatedByteSource(iterable);
    }

    public static com.google.common.io.ByteSource concat(java.util.Iterator<? extends com.google.common.io.ByteSource> it) {
        return concat(com.google.common.collect.ImmutableList.copyOf(it));
    }

    public static com.google.common.io.ByteSource concat(com.google.common.io.ByteSource... byteSourceArr) {
        return concat(com.google.common.collect.ImmutableList.copyOf(byteSourceArr));
    }

    public static com.google.common.io.ByteSource wrap(byte[] bArr) {
        return new com.google.common.io.ByteSource.ByteArrayByteSource(bArr);
    }

    public static com.google.common.io.ByteSource empty() {
        return com.google.common.io.ByteSource.EmptyByteSource.INSTANCE;
    }

    class AsCharSource extends com.google.common.io.CharSource {
        final java.nio.charset.Charset charset;

        AsCharSource(java.nio.charset.Charset charset) {
            this.charset = (java.nio.charset.Charset) com.google.common.base.Preconditions.checkNotNull(charset);
        }

        @Override // com.google.common.io.CharSource
        public com.google.common.io.ByteSource asByteSource(java.nio.charset.Charset charset) {
            if (charset.equals(this.charset)) {
                return com.google.common.io.ByteSource.this;
            }
            return super.asByteSource(charset);
        }

        @Override // com.google.common.io.CharSource
        public java.io.Reader openStream() throws java.io.IOException {
            return new java.io.InputStreamReader(com.google.common.io.ByteSource.this.openStream(), this.charset);
        }

        @Override // com.google.common.io.CharSource
        public java.lang.String read() throws java.io.IOException {
            return new java.lang.String(com.google.common.io.ByteSource.this.read(), this.charset);
        }

        public java.lang.String toString() {
            java.lang.StringBuilder sb = new java.lang.StringBuilder();
            sb.append(com.google.common.io.ByteSource.this.toString());
            sb.append(".asCharSource(");
            sb.append(this.charset);
            sb.append(")");
            return sb.toString();
        }
    }

    final class SlicedByteSource extends com.google.common.io.ByteSource {
        final long length;
        final long offset;

        SlicedByteSource(long j, long j2) {
            com.google.common.base.Preconditions.checkArgument(j >= 0, "offset (%s) may not be negative", j);
            com.google.common.base.Preconditions.checkArgument(j2 >= 0, "length (%s) may not be negative", j2);
            this.offset = j;
            this.length = j2;
        }

        @Override // com.google.common.io.ByteSource
        public final java.io.InputStream openStream() throws java.io.IOException {
            return sliceStream(com.google.common.io.ByteSource.this.openStream());
        }

        @Override // com.google.common.io.ByteSource
        public final java.io.InputStream openBufferedStream() throws java.io.IOException {
            return sliceStream(com.google.common.io.ByteSource.this.openBufferedStream());
        }

        private java.io.InputStream sliceStream(java.io.InputStream inputStream) throws java.io.IOException {
            long j = this.offset;
            if (j > 0) {
                try {
                    if (com.google.common.io.ByteStreams.skipUpTo(inputStream, j) < this.offset) {
                        inputStream.close();
                        return new java.io.ByteArrayInputStream(new byte[0]);
                    }
                } finally {
                }
            }
            return com.google.common.io.ByteStreams.limit(inputStream, this.length);
        }

        @Override // com.google.common.io.ByteSource
        public final com.google.common.io.ByteSource slice(long j, long j2) {
            com.google.common.base.Preconditions.checkArgument(j >= 0, "offset (%s) may not be negative", j);
            com.google.common.base.Preconditions.checkArgument(j2 >= 0, "length (%s) may not be negative", j2);
            long j3 = this.length - j;
            if (j3 <= 0) {
                return com.google.common.io.ByteSource.empty();
            }
            return com.google.common.io.ByteSource.this.slice(this.offset + j, java.lang.Math.min(j2, j3));
        }

        @Override // com.google.common.io.ByteSource
        public final boolean isEmpty() throws java.io.IOException {
            return this.length == 0 || super.isEmpty();
        }

        @Override // com.google.common.io.ByteSource
        public final com.google.common.base.Optional<java.lang.Long> sizeIfKnown() {
            com.google.common.base.Optional<java.lang.Long> sizeIfKnown = com.google.common.io.ByteSource.this.sizeIfKnown();
            if (sizeIfKnown.isPresent()) {
                long longValue = sizeIfKnown.get().longValue();
                return com.google.common.base.Optional.of(java.lang.Long.valueOf(java.lang.Math.min(this.length, longValue - java.lang.Math.min(this.offset, longValue))));
            }
            return com.google.common.base.Optional.absent();
        }

        public final java.lang.String toString() {
            java.lang.StringBuilder sb = new java.lang.StringBuilder();
            sb.append(com.google.common.io.ByteSource.this.toString());
            sb.append(".slice(");
            sb.append(this.offset);
            sb.append(", ");
            sb.append(this.length);
            sb.append(")");
            return sb.toString();
        }
    }

    static class ByteArrayByteSource extends com.google.common.io.ByteSource {
        final byte[] bytes;
        final int length;
        final int offset;

        ByteArrayByteSource(byte[] bArr) {
            this(bArr, 0, bArr.length);
        }

        ByteArrayByteSource(byte[] bArr, int i, int i2) {
            this.bytes = bArr;
            this.offset = i;
            this.length = i2;
        }

        @Override // com.google.common.io.ByteSource
        public java.io.InputStream openStream() {
            return new java.io.ByteArrayInputStream(this.bytes, this.offset, this.length);
        }

        @Override // com.google.common.io.ByteSource
        public java.io.InputStream openBufferedStream() {
            return openStream();
        }

        @Override // com.google.common.io.ByteSource
        public boolean isEmpty() {
            return this.length == 0;
        }

        @Override // com.google.common.io.ByteSource
        public long size() {
            return this.length;
        }

        @Override // com.google.common.io.ByteSource
        public com.google.common.base.Optional<java.lang.Long> sizeIfKnown() {
            return com.google.common.base.Optional.of(java.lang.Long.valueOf(this.length));
        }

        @Override // com.google.common.io.ByteSource
        public byte[] read() {
            byte[] bArr = this.bytes;
            int i = this.offset;
            return java.util.Arrays.copyOfRange(bArr, i, this.length + i);
        }

        @Override // com.google.common.io.ByteSource
        public <T> T read(com.google.common.io.ByteProcessor<T> byteProcessor) throws java.io.IOException {
            byteProcessor.processBytes(this.bytes, this.offset, this.length);
            return byteProcessor.getResult();
        }

        @Override // com.google.common.io.ByteSource
        public long copyTo(java.io.OutputStream outputStream) throws java.io.IOException {
            outputStream.write(this.bytes, this.offset, this.length);
            return this.length;
        }

        @Override // com.google.common.io.ByteSource
        public com.google.common.hash.HashCode hash(com.google.common.hash.HashFunction hashFunction) throws java.io.IOException {
            return hashFunction.hashBytes(this.bytes, this.offset, this.length);
        }

        @Override // com.google.common.io.ByteSource
        public com.google.common.io.ByteSource slice(long j, long j2) {
            com.google.common.base.Preconditions.checkArgument(j >= 0, "offset (%s) may not be negative", j);
            com.google.common.base.Preconditions.checkArgument(j2 >= 0, "length (%s) may not be negative", j2);
            long min = java.lang.Math.min(j, this.length);
            return new com.google.common.io.ByteSource.ByteArrayByteSource(this.bytes, this.offset + ((int) min), (int) java.lang.Math.min(j2, this.length - min));
        }

        public java.lang.String toString() {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("ByteSource.wrap(");
            sb.append(com.google.common.base.Ascii.truncate(com.google.common.io.BaseEncoding.base16().encode(this.bytes, this.offset, this.length), 30, "..."));
            sb.append(")");
            return sb.toString();
        }
    }

    static final class EmptyByteSource extends com.google.common.io.ByteSource.ByteArrayByteSource {
        static final com.google.common.io.ByteSource.EmptyByteSource INSTANCE = new com.google.common.io.ByteSource.EmptyByteSource();

        EmptyByteSource() {
            super(new byte[0]);
        }

        @Override // com.google.common.io.ByteSource
        public final com.google.common.io.CharSource asCharSource(java.nio.charset.Charset charset) {
            com.google.common.base.Preconditions.checkNotNull(charset);
            return com.google.common.io.CharSource.empty();
        }

        @Override // com.google.common.io.ByteSource.ByteArrayByteSource, com.google.common.io.ByteSource
        public final byte[] read() {
            return this.bytes;
        }

        @Override // com.google.common.io.ByteSource.ByteArrayByteSource
        public final java.lang.String toString() {
            return "ByteSource.empty()";
        }
    }

    static final class ConcatenatedByteSource extends com.google.common.io.ByteSource {
        final java.lang.Iterable<? extends com.google.common.io.ByteSource> sources;

        ConcatenatedByteSource(java.lang.Iterable<? extends com.google.common.io.ByteSource> iterable) {
            this.sources = (java.lang.Iterable) com.google.common.base.Preconditions.checkNotNull(iterable);
        }

        @Override // com.google.common.io.ByteSource
        public final java.io.InputStream openStream() throws java.io.IOException {
            return new com.google.common.io.MultiInputStream(this.sources.iterator());
        }

        @Override // com.google.common.io.ByteSource
        public final boolean isEmpty() throws java.io.IOException {
            java.util.Iterator<? extends com.google.common.io.ByteSource> it = this.sources.iterator();
            while (it.hasNext()) {
                if (!it.next().isEmpty()) {
                    return false;
                }
            }
            return true;
        }

        @Override // com.google.common.io.ByteSource
        public final com.google.common.base.Optional<java.lang.Long> sizeIfKnown() {
            java.lang.Iterable<? extends com.google.common.io.ByteSource> iterable = this.sources;
            if (!(iterable instanceof java.util.Collection)) {
                return com.google.common.base.Optional.absent();
            }
            java.util.Iterator<? extends com.google.common.io.ByteSource> it = iterable.iterator();
            long j = 0;
            while (it.hasNext()) {
                com.google.common.base.Optional<java.lang.Long> sizeIfKnown = it.next().sizeIfKnown();
                if (!sizeIfKnown.isPresent()) {
                    return com.google.common.base.Optional.absent();
                }
                j += sizeIfKnown.get().longValue();
                if (j < 0) {
                    return com.google.common.base.Optional.of(Long.MAX_VALUE);
                }
            }
            return com.google.common.base.Optional.of(java.lang.Long.valueOf(j));
        }

        @Override // com.google.common.io.ByteSource
        public final long size() throws java.io.IOException {
            java.util.Iterator<? extends com.google.common.io.ByteSource> it = this.sources.iterator();
            long j = 0;
            while (it.hasNext()) {
                j += it.next().size();
                if (j < 0) {
                    return Long.MAX_VALUE;
                }
            }
            return j;
        }

        public final java.lang.String toString() {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("ByteSource.concat(");
            sb.append(this.sources);
            sb.append(")");
            return sb.toString();
        }
    }
}
