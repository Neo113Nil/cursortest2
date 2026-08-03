package com.google.android.exoplayer2.upstream;

/* loaded from: classes3.dex */
public final class DataSpec {
    public static final int FLAG_ALLOW_CACHE_FRAGMENTATION = 4;
    public static final int FLAG_ALLOW_GZIP = 1;
    public static final int FLAG_DONT_CACHE_IF_LENGTH_UNKNOWN = 2;
    public static final int FLAG_MIGHT_NOT_USE_FULL_NETWORK_SPEED = 8;
    public static final int HTTP_METHOD_GET = 1;
    public static final int HTTP_METHOD_HEAD = 3;
    public static final int HTTP_METHOD_POST = 2;

    @java.lang.Deprecated
    public final long absoluteStreamPosition;
    public final java.lang.Object customData;
    public final int flags;
    public final byte[] httpBody;
    public final int httpMethod;
    public final java.util.Map<java.lang.String, java.lang.String> httpRequestHeaders;
    public final java.lang.String key;
    public final long length;
    public final long position;
    public final android.net.Uri uri;
    public final long uriPositionOffset;

    @java.lang.annotation.Target({java.lang.annotation.ElementType.TYPE_USE})
    @java.lang.annotation.Documented
    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public @interface Flags {
    }

    @java.lang.annotation.Target({java.lang.annotation.ElementType.TYPE_USE})
    @java.lang.annotation.Documented
    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public @interface HttpMethod {
    }

    static {
        com.google.android.exoplayer2.ExoPlayerLibraryInfo.registerModule("goog.exo.datasource");
    }

    public static final class Builder {
        private java.lang.Object customData;
        private int flags;
        private byte[] httpBody;
        private int httpMethod;
        private java.util.Map<java.lang.String, java.lang.String> httpRequestHeaders;
        private java.lang.String key;
        private long length;
        private long position;
        private android.net.Uri uri;
        private long uriPositionOffset;

        public Builder() {
            this.httpMethod = 1;
            this.httpRequestHeaders = java.util.Collections.emptyMap();
            this.length = -1L;
        }

        private Builder(com.google.android.exoplayer2.upstream.DataSpec dataSpec) {
            this.uri = dataSpec.uri;
            this.uriPositionOffset = dataSpec.uriPositionOffset;
            this.httpMethod = dataSpec.httpMethod;
            this.httpBody = dataSpec.httpBody;
            this.httpRequestHeaders = dataSpec.httpRequestHeaders;
            this.position = dataSpec.position;
            this.length = dataSpec.length;
            this.key = dataSpec.key;
            this.flags = dataSpec.flags;
            this.customData = dataSpec.customData;
        }

        public com.google.android.exoplayer2.upstream.DataSpec.Builder setUri(java.lang.String str) {
            this.uri = android.net.Uri.parse(str);
            return this;
        }

        public com.google.android.exoplayer2.upstream.DataSpec.Builder setUri(android.net.Uri uri) {
            this.uri = uri;
            return this;
        }

        public com.google.android.exoplayer2.upstream.DataSpec.Builder setUriPositionOffset(long j) {
            this.uriPositionOffset = j;
            return this;
        }

        public com.google.android.exoplayer2.upstream.DataSpec.Builder setHttpMethod(int i) {
            this.httpMethod = i;
            return this;
        }

        public com.google.android.exoplayer2.upstream.DataSpec.Builder setHttpBody(byte[] bArr) {
            this.httpBody = bArr;
            return this;
        }

        public com.google.android.exoplayer2.upstream.DataSpec.Builder setHttpRequestHeaders(java.util.Map<java.lang.String, java.lang.String> map) {
            this.httpRequestHeaders = map;
            return this;
        }

        public com.google.android.exoplayer2.upstream.DataSpec.Builder setPosition(long j) {
            this.position = j;
            return this;
        }

        public com.google.android.exoplayer2.upstream.DataSpec.Builder setLength(long j) {
            this.length = j;
            return this;
        }

        public com.google.android.exoplayer2.upstream.DataSpec.Builder setKey(java.lang.String str) {
            this.key = str;
            return this;
        }

        public com.google.android.exoplayer2.upstream.DataSpec.Builder setFlags(int i) {
            this.flags = i;
            return this;
        }

        public com.google.android.exoplayer2.upstream.DataSpec.Builder setCustomData(java.lang.Object obj) {
            this.customData = obj;
            return this;
        }

        public com.google.android.exoplayer2.upstream.DataSpec build() {
            com.google.android.exoplayer2.util.Assertions.checkStateNotNull(this.uri, "The uri must be set.");
            return new com.google.android.exoplayer2.upstream.DataSpec(this.uri, this.uriPositionOffset, this.httpMethod, this.httpBody, this.httpRequestHeaders, this.position, this.length, this.key, this.flags, this.customData);
        }
    }

    public static java.lang.String getStringForHttpMethod(int i) {
        if (i == 1) {
            return "GET";
        }
        if (i == 2) {
            return "POST";
        }
        if (i == 3) {
            return "HEAD";
        }
        throw new java.lang.IllegalStateException();
    }

    public DataSpec(android.net.Uri uri) {
        this(uri, 0L, -1L);
    }

    public DataSpec(android.net.Uri uri, long j, long j2) {
        this(uri, 0L, 1, null, java.util.Collections.emptyMap(), j, j2, null, 0, null);
    }

    @java.lang.Deprecated
    public DataSpec(android.net.Uri uri, int i) {
        this(uri, 0L, -1L, null, i);
    }

    @java.lang.Deprecated
    public DataSpec(android.net.Uri uri, long j, long j2, java.lang.String str) {
        this(uri, j, j, j2, str, 0);
    }

    @java.lang.Deprecated
    public DataSpec(android.net.Uri uri, long j, long j2, java.lang.String str, int i) {
        this(uri, j, j, j2, str, i);
    }

    @java.lang.Deprecated
    public DataSpec(android.net.Uri uri, long j, long j2, java.lang.String str, int i, java.util.Map<java.lang.String, java.lang.String> map) {
        this(uri, 1, null, j, j, j2, str, i, map);
    }

    @java.lang.Deprecated
    public DataSpec(android.net.Uri uri, long j, long j2, long j3, java.lang.String str, int i) {
        this(uri, null, j, j2, j3, str, i);
    }

    @java.lang.Deprecated
    public DataSpec(android.net.Uri uri, byte[] bArr, long j, long j2, long j3, java.lang.String str, int i) {
        this(uri, bArr != null ? 2 : 1, bArr, j, j2, j3, str, i);
    }

    @java.lang.Deprecated
    public DataSpec(android.net.Uri uri, int i, byte[] bArr, long j, long j2, long j3, java.lang.String str, int i2) {
        this(uri, i, bArr, j, j2, j3, str, i2, java.util.Collections.emptyMap());
    }

    @java.lang.Deprecated
    public DataSpec(android.net.Uri uri, int i, byte[] bArr, long j, long j2, long j3, java.lang.String str, int i2, java.util.Map<java.lang.String, java.lang.String> map) {
        this(uri, j - j2, i, bArr, map, j2, j3, str, i2, null);
    }

    private DataSpec(android.net.Uri uri, long j, int i, byte[] bArr, java.util.Map<java.lang.String, java.lang.String> map, long j2, long j3, java.lang.String str, int i2, java.lang.Object obj) {
        byte[] bArr2 = bArr;
        long j4 = j + j2;
        boolean z = true;
        com.google.android.exoplayer2.util.Assertions.checkArgument(j4 >= 0);
        com.google.android.exoplayer2.util.Assertions.checkArgument(j2 >= 0);
        if (j3 <= 0 && j3 != -1) {
            z = false;
        }
        com.google.android.exoplayer2.util.Assertions.checkArgument(z);
        this.uri = uri;
        this.uriPositionOffset = j;
        this.httpMethod = i;
        this.httpBody = (bArr2 == null || bArr2.length == 0) ? null : bArr2;
        this.httpRequestHeaders = java.util.Collections.unmodifiableMap(new java.util.HashMap(map));
        this.position = j2;
        this.absoluteStreamPosition = j4;
        this.length = j3;
        this.key = str;
        this.flags = i2;
        this.customData = obj;
    }

    public boolean isFlagSet(int i) {
        return (this.flags & i) == i;
    }

    public final java.lang.String getHttpMethodString() {
        return getStringForHttpMethod(this.httpMethod);
    }

    public com.google.android.exoplayer2.upstream.DataSpec.Builder buildUpon() {
        return new com.google.android.exoplayer2.upstream.DataSpec.Builder();
    }

    public com.google.android.exoplayer2.upstream.DataSpec subrange(long j) {
        long j2 = this.length;
        return subrange(j, j2 != -1 ? j2 - j : -1L);
    }

    public com.google.android.exoplayer2.upstream.DataSpec subrange(long j, long j2) {
        return (j == 0 && this.length == j2) ? this : new com.google.android.exoplayer2.upstream.DataSpec(this.uri, this.uriPositionOffset, this.httpMethod, this.httpBody, this.httpRequestHeaders, this.position + j, j2, this.key, this.flags, this.customData);
    }

    public com.google.android.exoplayer2.upstream.DataSpec withUri(android.net.Uri uri) {
        return new com.google.android.exoplayer2.upstream.DataSpec(uri, this.uriPositionOffset, this.httpMethod, this.httpBody, this.httpRequestHeaders, this.position, this.length, this.key, this.flags, this.customData);
    }

    public com.google.android.exoplayer2.upstream.DataSpec withRequestHeaders(java.util.Map<java.lang.String, java.lang.String> map) {
        return new com.google.android.exoplayer2.upstream.DataSpec(this.uri, this.uriPositionOffset, this.httpMethod, this.httpBody, map, this.position, this.length, this.key, this.flags, this.customData);
    }

    public com.google.android.exoplayer2.upstream.DataSpec withAdditionalHeaders(java.util.Map<java.lang.String, java.lang.String> map) {
        java.util.HashMap hashMap = new java.util.HashMap(this.httpRequestHeaders);
        hashMap.putAll(map);
        return new com.google.android.exoplayer2.upstream.DataSpec(this.uri, this.uriPositionOffset, this.httpMethod, this.httpBody, hashMap, this.position, this.length, this.key, this.flags, this.customData);
    }

    public java.lang.String toString() {
        return "DataSpec[" + getHttpMethodString() + io.ktor.sse.ServerSentEventKt.SPACE + this.uri + ", " + this.position + ", " + this.length + ", " + this.key + ", " + this.flags + com.ironsource.X3.j.e;
    }
}
