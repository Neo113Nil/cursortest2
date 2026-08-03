package com.google.android.exoplayer2.upstream;

/* loaded from: classes3.dex */
public interface HttpDataSource extends com.google.android.exoplayer2.upstream.DataSource {
    public static final com.google.common.base.Predicate<java.lang.String> REJECT_PAYWALL_TYPES = new com.google.common.base.Predicate() { // from class: com.google.android.exoplayer2.upstream.HttpDataSource$$ExternalSyntheticLambda0
        @Override // com.google.common.base.Predicate
        public final boolean apply(java.lang.Object obj) {
            return com.google.android.exoplayer2.upstream.HttpDataSource.CC.lambda$static$0((java.lang.String) obj);
        }
    };

    void clearAllRequestProperties();

    void clearRequestProperty(java.lang.String str);

    @Override // com.google.android.exoplayer2.upstream.DataSource
    void close() throws com.google.android.exoplayer2.upstream.HttpDataSource.HttpDataSourceException;

    int getResponseCode();

    @Override // com.google.android.exoplayer2.upstream.DataSource
    java.util.Map<java.lang.String, java.util.List<java.lang.String>> getResponseHeaders();

    @Override // com.google.android.exoplayer2.upstream.DataSource
    long open(com.google.android.exoplayer2.upstream.DataSpec dataSpec) throws com.google.android.exoplayer2.upstream.HttpDataSource.HttpDataSourceException;

    @Override // com.google.android.exoplayer2.upstream.DataReader
    int read(byte[] bArr, int i, int i2) throws com.google.android.exoplayer2.upstream.HttpDataSource.HttpDataSourceException;

    void setRequestProperty(java.lang.String str, java.lang.String str2);

    public interface Factory extends com.google.android.exoplayer2.upstream.DataSource.Factory {
        @Override // com.google.android.exoplayer2.upstream.DataSource.Factory
        com.google.android.exoplayer2.upstream.HttpDataSource createDataSource();

        com.google.android.exoplayer2.upstream.HttpDataSource.Factory setDefaultRequestProperties(java.util.Map<java.lang.String, java.lang.String> map);

        /* renamed from: com.google.android.exoplayer2.upstream.HttpDataSource$Factory$-CC, reason: invalid class name */
        public final /* synthetic */ class CC {
        }
    }

    public static final class RequestProperties {
        private final java.util.Map<java.lang.String, java.lang.String> requestProperties = new java.util.HashMap();
        private java.util.Map<java.lang.String, java.lang.String> requestPropertiesSnapshot;

        public synchronized void set(java.lang.String str, java.lang.String str2) {
            this.requestPropertiesSnapshot = null;
            this.requestProperties.put(str, str2);
        }

        public synchronized void set(java.util.Map<java.lang.String, java.lang.String> map) {
            this.requestPropertiesSnapshot = null;
            this.requestProperties.putAll(map);
        }

        public synchronized void clearAndSet(java.util.Map<java.lang.String, java.lang.String> map) {
            this.requestPropertiesSnapshot = null;
            this.requestProperties.clear();
            this.requestProperties.putAll(map);
        }

        public synchronized void remove(java.lang.String str) {
            this.requestPropertiesSnapshot = null;
            this.requestProperties.remove(str);
        }

        public synchronized void clear() {
            this.requestPropertiesSnapshot = null;
            this.requestProperties.clear();
        }

        public synchronized java.util.Map<java.lang.String, java.lang.String> getSnapshot() {
            if (this.requestPropertiesSnapshot == null) {
                this.requestPropertiesSnapshot = java.util.Collections.unmodifiableMap(new java.util.HashMap(this.requestProperties));
            }
            return this.requestPropertiesSnapshot;
        }
    }

    public static abstract class BaseFactory implements com.google.android.exoplayer2.upstream.HttpDataSource.Factory {
        private final com.google.android.exoplayer2.upstream.HttpDataSource.RequestProperties defaultRequestProperties = new com.google.android.exoplayer2.upstream.HttpDataSource.RequestProperties();

        protected abstract com.google.android.exoplayer2.upstream.HttpDataSource createDataSourceInternal(com.google.android.exoplayer2.upstream.HttpDataSource.RequestProperties requestProperties);

        @Override // com.google.android.exoplayer2.upstream.DataSource.Factory
        public final com.google.android.exoplayer2.upstream.HttpDataSource createDataSource() {
            return createDataSourceInternal(this.defaultRequestProperties);
        }

        @Override // com.google.android.exoplayer2.upstream.HttpDataSource.Factory
        public final com.google.android.exoplayer2.upstream.HttpDataSource.Factory setDefaultRequestProperties(java.util.Map<java.lang.String, java.lang.String> map) {
            this.defaultRequestProperties.clearAndSet(map);
            return this;
        }
    }

    /* renamed from: com.google.android.exoplayer2.upstream.HttpDataSource$-CC, reason: invalid class name */
    public final /* synthetic */ class CC {
        static {
            com.google.common.base.Predicate<java.lang.String> predicate = com.google.android.exoplayer2.upstream.HttpDataSource.REJECT_PAYWALL_TYPES;
        }

        public static /* synthetic */ boolean lambda$static$0(java.lang.String str) {
            if (str == null) {
                return false;
            }
            java.lang.String lowerCase = com.google.common.base.Ascii.toLowerCase(str);
            if (android.text.TextUtils.isEmpty(lowerCase)) {
                return false;
            }
            return ((lowerCase.contains("text") && !lowerCase.contains("text/vtt")) || lowerCase.contains("html") || lowerCase.contains("xml")) ? false : true;
        }
    }

    public static class HttpDataSourceException extends com.google.android.exoplayer2.upstream.DataSourceException {
        public static final int TYPE_CLOSE = 3;
        public static final int TYPE_OPEN = 1;
        public static final int TYPE_READ = 2;
        public final com.google.android.exoplayer2.upstream.DataSpec dataSpec;
        public final int type;

        @java.lang.annotation.Target({java.lang.annotation.ElementType.TYPE_USE})
        @java.lang.annotation.Documented
        @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
        public @interface Type {
        }

        private static int assignErrorCode(int i, int i2) {
            if (i == 2000 && i2 == 1) {
                return 2001;
            }
            return i;
        }

        public static com.google.android.exoplayer2.upstream.HttpDataSource.HttpDataSourceException createForIOException(java.io.IOException iOException, com.google.android.exoplayer2.upstream.DataSpec dataSpec, int i) {
            int i2;
            java.lang.String message = iOException.getMessage();
            if (iOException instanceof java.net.SocketTimeoutException) {
                i2 = 2002;
            } else if (iOException instanceof java.io.InterruptedIOException) {
                i2 = 1004;
            } else {
                i2 = (message == null || !com.google.common.base.Ascii.toLowerCase(message).matches("cleartext.*not permitted.*")) ? 2001 : 2007;
            }
            if (i2 == 2007) {
                return new com.google.android.exoplayer2.upstream.HttpDataSource.CleartextNotPermittedException(iOException, dataSpec);
            }
            return new com.google.android.exoplayer2.upstream.HttpDataSource.HttpDataSourceException(iOException, dataSpec, i2, i);
        }

        @java.lang.Deprecated
        public HttpDataSourceException(com.google.android.exoplayer2.upstream.DataSpec dataSpec, int i) {
            this(dataSpec, 2000, i);
        }

        public HttpDataSourceException(com.google.android.exoplayer2.upstream.DataSpec dataSpec, int i, int i2) {
            super(assignErrorCode(i, i2));
            this.dataSpec = dataSpec;
            this.type = i2;
        }

        @java.lang.Deprecated
        public HttpDataSourceException(java.lang.String str, com.google.android.exoplayer2.upstream.DataSpec dataSpec, int i) {
            this(str, dataSpec, 2000, i);
        }

        public HttpDataSourceException(java.lang.String str, com.google.android.exoplayer2.upstream.DataSpec dataSpec, int i, int i2) {
            super(str, assignErrorCode(i, i2));
            this.dataSpec = dataSpec;
            this.type = i2;
        }

        @java.lang.Deprecated
        public HttpDataSourceException(java.io.IOException iOException, com.google.android.exoplayer2.upstream.DataSpec dataSpec, int i) {
            this(iOException, dataSpec, 2000, i);
        }

        public HttpDataSourceException(java.io.IOException iOException, com.google.android.exoplayer2.upstream.DataSpec dataSpec, int i, int i2) {
            super(iOException, assignErrorCode(i, i2));
            this.dataSpec = dataSpec;
            this.type = i2;
        }

        @java.lang.Deprecated
        public HttpDataSourceException(java.lang.String str, java.io.IOException iOException, com.google.android.exoplayer2.upstream.DataSpec dataSpec, int i) {
            this(str, iOException, dataSpec, 2000, i);
        }

        public HttpDataSourceException(java.lang.String str, java.io.IOException iOException, com.google.android.exoplayer2.upstream.DataSpec dataSpec, int i, int i2) {
            super(str, iOException, assignErrorCode(i, i2));
            this.dataSpec = dataSpec;
            this.type = i2;
        }
    }

    public static final class CleartextNotPermittedException extends com.google.android.exoplayer2.upstream.HttpDataSource.HttpDataSourceException {
        public CleartextNotPermittedException(java.io.IOException iOException, com.google.android.exoplayer2.upstream.DataSpec dataSpec) {
            super("Cleartext HTTP traffic not permitted. See https://exoplayer.dev/issues/cleartext-not-permitted", iOException, dataSpec, 2007, 1);
        }
    }

    public static final class InvalidContentTypeException extends com.google.android.exoplayer2.upstream.HttpDataSource.HttpDataSourceException {
        public final java.lang.String contentType;

        public InvalidContentTypeException(java.lang.String str, com.google.android.exoplayer2.upstream.DataSpec dataSpec) {
            super("Invalid content type: " + str, dataSpec, 2003, 1);
            this.contentType = str;
        }
    }

    public static final class InvalidResponseCodeException extends com.google.android.exoplayer2.upstream.HttpDataSource.HttpDataSourceException {
        public final java.util.Map<java.lang.String, java.util.List<java.lang.String>> headerFields;
        public final byte[] responseBody;
        public final int responseCode;
        public final java.lang.String responseMessage;

        @java.lang.Deprecated
        public InvalidResponseCodeException(int i, java.util.Map<java.lang.String, java.util.List<java.lang.String>> map, com.google.android.exoplayer2.upstream.DataSpec dataSpec) {
            this(i, null, null, map, dataSpec, com.google.android.exoplayer2.util.Util.EMPTY_BYTE_ARRAY);
        }

        @java.lang.Deprecated
        public InvalidResponseCodeException(int i, java.lang.String str, java.util.Map<java.lang.String, java.util.List<java.lang.String>> map, com.google.android.exoplayer2.upstream.DataSpec dataSpec) {
            this(i, str, null, map, dataSpec, com.google.android.exoplayer2.util.Util.EMPTY_BYTE_ARRAY);
        }

        public InvalidResponseCodeException(int i, java.lang.String str, java.io.IOException iOException, java.util.Map<java.lang.String, java.util.List<java.lang.String>> map, com.google.android.exoplayer2.upstream.DataSpec dataSpec, byte[] bArr) {
            super("Response code: " + i, iOException, dataSpec, 2004, 1);
            this.responseCode = i;
            this.responseMessage = str;
            this.headerFields = map;
            this.responseBody = bArr;
        }
    }
}
