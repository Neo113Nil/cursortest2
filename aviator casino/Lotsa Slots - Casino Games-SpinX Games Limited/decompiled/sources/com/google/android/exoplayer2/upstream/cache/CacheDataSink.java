package com.google.android.exoplayer2.upstream.cache;

/* loaded from: classes3.dex */
public final class CacheDataSink implements com.google.android.exoplayer2.upstream.DataSink {
    public static final int DEFAULT_BUFFER_SIZE = 20480;
    public static final long DEFAULT_FRAGMENT_SIZE = 5242880;
    private static final long MIN_RECOMMENDED_FRAGMENT_SIZE = 2097152;
    private static final java.lang.String TAG = "CacheDataSink";
    private final int bufferSize;
    private com.google.android.exoplayer2.upstream.cache.ReusableBufferedOutputStream bufferedOutputStream;
    private final com.google.android.exoplayer2.upstream.cache.Cache cache;
    private com.google.android.exoplayer2.upstream.DataSpec dataSpec;
    private long dataSpecBytesWritten;
    private long dataSpecFragmentSize;
    private java.io.File file;
    private final long fragmentSize;
    private java.io.OutputStream outputStream;
    private long outputStreamBytesWritten;

    public static final class Factory implements com.google.android.exoplayer2.upstream.DataSink.Factory {
        private com.google.android.exoplayer2.upstream.cache.Cache cache;
        private long fragmentSize = 5242880;
        private int bufferSize = 20480;

        public com.google.android.exoplayer2.upstream.cache.CacheDataSink.Factory setCache(com.google.android.exoplayer2.upstream.cache.Cache cache) {
            this.cache = cache;
            return this;
        }

        public com.google.android.exoplayer2.upstream.cache.CacheDataSink.Factory setFragmentSize(long j) {
            this.fragmentSize = j;
            return this;
        }

        public com.google.android.exoplayer2.upstream.cache.CacheDataSink.Factory setBufferSize(int i) {
            this.bufferSize = i;
            return this;
        }

        @Override // com.google.android.exoplayer2.upstream.DataSink.Factory
        public com.google.android.exoplayer2.upstream.DataSink createDataSink() {
            return new com.google.android.exoplayer2.upstream.cache.CacheDataSink((com.google.android.exoplayer2.upstream.cache.Cache) com.google.android.exoplayer2.util.Assertions.checkNotNull(this.cache), this.fragmentSize, this.bufferSize);
        }
    }

    public static final class CacheDataSinkException extends com.google.android.exoplayer2.upstream.cache.Cache.CacheException {
        public CacheDataSinkException(java.io.IOException iOException) {
            super(iOException);
        }
    }

    public CacheDataSink(com.google.android.exoplayer2.upstream.cache.Cache cache, long j) {
        this(cache, j, 20480);
    }

    public CacheDataSink(com.google.android.exoplayer2.upstream.cache.Cache cache, long j, int i) {
        com.google.android.exoplayer2.util.Assertions.checkState(j > 0 || j == -1, "fragmentSize must be positive or C.LENGTH_UNSET.");
        if (j != -1 && j < 2097152) {
            com.google.android.exoplayer2.util.Log.w(TAG, "fragmentSize is below the minimum recommended value of 2097152. This may cause poor cache performance.");
        }
        this.cache = (com.google.android.exoplayer2.upstream.cache.Cache) com.google.android.exoplayer2.util.Assertions.checkNotNull(cache);
        this.fragmentSize = j == -1 ? Long.MAX_VALUE : j;
        this.bufferSize = i;
    }

    @Override // com.google.android.exoplayer2.upstream.DataSink
    public void open(com.google.android.exoplayer2.upstream.DataSpec dataSpec) throws com.google.android.exoplayer2.upstream.cache.CacheDataSink.CacheDataSinkException {
        com.google.android.exoplayer2.util.Assertions.checkNotNull(dataSpec.key);
        if (dataSpec.length == -1 && dataSpec.isFlagSet(2)) {
            this.dataSpec = null;
            return;
        }
        this.dataSpec = dataSpec;
        this.dataSpecFragmentSize = dataSpec.isFlagSet(4) ? this.fragmentSize : Long.MAX_VALUE;
        this.dataSpecBytesWritten = 0L;
        try {
            openNextOutputStream(dataSpec);
        } catch (java.io.IOException e) {
            throw new com.google.android.exoplayer2.upstream.cache.CacheDataSink.CacheDataSinkException(e);
        }
    }

    @Override // com.google.android.exoplayer2.upstream.DataSink
    public void write(byte[] bArr, int i, int i2) throws com.google.android.exoplayer2.upstream.cache.CacheDataSink.CacheDataSinkException {
        com.google.android.exoplayer2.upstream.DataSpec dataSpec = this.dataSpec;
        if (dataSpec == null) {
            return;
        }
        int i3 = 0;
        while (i3 < i2) {
            try {
                if (this.outputStreamBytesWritten == this.dataSpecFragmentSize) {
                    closeCurrentOutputStream();
                    openNextOutputStream(dataSpec);
                }
                int min = (int) java.lang.Math.min(i2 - i3, this.dataSpecFragmentSize - this.outputStreamBytesWritten);
                ((java.io.OutputStream) com.google.android.exoplayer2.util.Util.castNonNull(this.outputStream)).write(bArr, i + i3, min);
                i3 += min;
                long j = min;
                this.outputStreamBytesWritten += j;
                this.dataSpecBytesWritten += j;
            } catch (java.io.IOException e) {
                throw new com.google.android.exoplayer2.upstream.cache.CacheDataSink.CacheDataSinkException(e);
            }
        }
    }

    @Override // com.google.android.exoplayer2.upstream.DataSink
    public void close() throws com.google.android.exoplayer2.upstream.cache.CacheDataSink.CacheDataSinkException {
        if (this.dataSpec == null) {
            return;
        }
        try {
            closeCurrentOutputStream();
        } catch (java.io.IOException e) {
            throw new com.google.android.exoplayer2.upstream.cache.CacheDataSink.CacheDataSinkException(e);
        }
    }

    private void openNextOutputStream(com.google.android.exoplayer2.upstream.DataSpec dataSpec) throws java.io.IOException {
        this.file = this.cache.startFile((java.lang.String) com.google.android.exoplayer2.util.Util.castNonNull(dataSpec.key), dataSpec.position + this.dataSpecBytesWritten, dataSpec.length != -1 ? java.lang.Math.min(dataSpec.length - this.dataSpecBytesWritten, this.dataSpecFragmentSize) : -1L);
        java.io.FileOutputStream fileOutputStream = new java.io.FileOutputStream(this.file);
        if (this.bufferSize > 0) {
            com.google.android.exoplayer2.upstream.cache.ReusableBufferedOutputStream reusableBufferedOutputStream = this.bufferedOutputStream;
            if (reusableBufferedOutputStream == null) {
                this.bufferedOutputStream = new com.google.android.exoplayer2.upstream.cache.ReusableBufferedOutputStream(fileOutputStream, this.bufferSize);
            } else {
                reusableBufferedOutputStream.reset(fileOutputStream);
            }
            this.outputStream = this.bufferedOutputStream;
        } else {
            this.outputStream = fileOutputStream;
        }
        this.outputStreamBytesWritten = 0L;
    }

    private void closeCurrentOutputStream() throws java.io.IOException {
        java.io.OutputStream outputStream = this.outputStream;
        if (outputStream == null) {
            return;
        }
        try {
            outputStream.flush();
            com.google.android.exoplayer2.util.Util.closeQuietly(this.outputStream);
            this.outputStream = null;
            java.io.File file = (java.io.File) com.google.android.exoplayer2.util.Util.castNonNull(this.file);
            this.file = null;
            this.cache.commitFile(file, this.outputStreamBytesWritten);
        } catch (java.lang.Throwable th) {
            com.google.android.exoplayer2.util.Util.closeQuietly(this.outputStream);
            this.outputStream = null;
            java.io.File file2 = (java.io.File) com.google.android.exoplayer2.util.Util.castNonNull(this.file);
            this.file = null;
            file2.delete();
            throw th;
        }
    }
}
