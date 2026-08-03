package com.google.android.exoplayer2.upstream;

/* loaded from: classes3.dex */
public class DefaultHttpDataSource extends com.google.android.exoplayer2.upstream.BaseDataSource implements com.google.android.exoplayer2.upstream.HttpDataSource {
    public static final int DEFAULT_CONNECT_TIMEOUT_MILLIS = 8000;
    public static final int DEFAULT_READ_TIMEOUT_MILLIS = 8000;
    private static final int HTTP_STATUS_PERMANENT_REDIRECT = 308;
    private static final int HTTP_STATUS_TEMPORARY_REDIRECT = 307;
    private static final long MAX_BYTES_TO_DRAIN = 2048;
    private static final int MAX_REDIRECTS = 20;
    private static final java.lang.String TAG = "DefaultHttpDataSource";
    private final boolean allowCrossProtocolRedirects;
    private long bytesRead;
    private long bytesToRead;
    private final int connectTimeoutMillis;
    private java.net.HttpURLConnection connection;
    private com.google.common.base.Predicate<java.lang.String> contentTypePredicate;
    private com.google.android.exoplayer2.upstream.DataSpec dataSpec;
    private final com.google.android.exoplayer2.upstream.HttpDataSource.RequestProperties defaultRequestProperties;
    private java.io.InputStream inputStream;
    private final boolean keepPostFor302Redirects;
    private boolean opened;
    private final int readTimeoutMillis;
    private final com.google.android.exoplayer2.upstream.HttpDataSource.RequestProperties requestProperties;
    private int responseCode;
    private final java.lang.String userAgent;

    public static final class Factory implements com.google.android.exoplayer2.upstream.HttpDataSource.Factory {
        private boolean allowCrossProtocolRedirects;
        private com.google.common.base.Predicate<java.lang.String> contentTypePredicate;
        private boolean keepPostFor302Redirects;
        private com.google.android.exoplayer2.upstream.TransferListener transferListener;
        private java.lang.String userAgent;
        private final com.google.android.exoplayer2.upstream.HttpDataSource.RequestProperties defaultRequestProperties = new com.google.android.exoplayer2.upstream.HttpDataSource.RequestProperties();
        private int connectTimeoutMs = 8000;
        private int readTimeoutMs = 8000;

        @Override // com.google.android.exoplayer2.upstream.HttpDataSource.Factory
        public /* bridge */ /* synthetic */ com.google.android.exoplayer2.upstream.HttpDataSource.Factory setDefaultRequestProperties(java.util.Map map) {
            return setDefaultRequestProperties((java.util.Map<java.lang.String, java.lang.String>) map);
        }

        @Override // com.google.android.exoplayer2.upstream.HttpDataSource.Factory
        public final com.google.android.exoplayer2.upstream.DefaultHttpDataSource.Factory setDefaultRequestProperties(java.util.Map<java.lang.String, java.lang.String> map) {
            this.defaultRequestProperties.clearAndSet(map);
            return this;
        }

        public com.google.android.exoplayer2.upstream.DefaultHttpDataSource.Factory setUserAgent(java.lang.String str) {
            this.userAgent = str;
            return this;
        }

        public com.google.android.exoplayer2.upstream.DefaultHttpDataSource.Factory setConnectTimeoutMs(int i) {
            this.connectTimeoutMs = i;
            return this;
        }

        public com.google.android.exoplayer2.upstream.DefaultHttpDataSource.Factory setReadTimeoutMs(int i) {
            this.readTimeoutMs = i;
            return this;
        }

        public com.google.android.exoplayer2.upstream.DefaultHttpDataSource.Factory setAllowCrossProtocolRedirects(boolean z) {
            this.allowCrossProtocolRedirects = z;
            return this;
        }

        public com.google.android.exoplayer2.upstream.DefaultHttpDataSource.Factory setContentTypePredicate(com.google.common.base.Predicate<java.lang.String> predicate) {
            this.contentTypePredicate = predicate;
            return this;
        }

        public com.google.android.exoplayer2.upstream.DefaultHttpDataSource.Factory setTransferListener(com.google.android.exoplayer2.upstream.TransferListener transferListener) {
            this.transferListener = transferListener;
            return this;
        }

        public com.google.android.exoplayer2.upstream.DefaultHttpDataSource.Factory setKeepPostFor302Redirects(boolean z) {
            this.keepPostFor302Redirects = z;
            return this;
        }

        @Override // com.google.android.exoplayer2.upstream.HttpDataSource.Factory, com.google.android.exoplayer2.upstream.DataSource.Factory
        public com.google.android.exoplayer2.upstream.DefaultHttpDataSource createDataSource() {
            com.google.android.exoplayer2.upstream.DefaultHttpDataSource defaultHttpDataSource = new com.google.android.exoplayer2.upstream.DefaultHttpDataSource(this.userAgent, this.connectTimeoutMs, this.readTimeoutMs, this.allowCrossProtocolRedirects, this.defaultRequestProperties, this.contentTypePredicate, this.keepPostFor302Redirects);
            com.google.android.exoplayer2.upstream.TransferListener transferListener = this.transferListener;
            if (transferListener != null) {
                defaultHttpDataSource.addTransferListener(transferListener);
            }
            return defaultHttpDataSource;
        }
    }

    @java.lang.Deprecated
    public DefaultHttpDataSource() {
        this(null, 8000, 8000);
    }

    @java.lang.Deprecated
    public DefaultHttpDataSource(java.lang.String str) {
        this(str, 8000, 8000);
    }

    @java.lang.Deprecated
    public DefaultHttpDataSource(java.lang.String str, int i, int i2) {
        this(str, i, i2, false, null);
    }

    @java.lang.Deprecated
    public DefaultHttpDataSource(java.lang.String str, int i, int i2, boolean z, com.google.android.exoplayer2.upstream.HttpDataSource.RequestProperties requestProperties) {
        this(str, i, i2, z, requestProperties, null, false);
    }

    private DefaultHttpDataSource(java.lang.String str, int i, int i2, boolean z, com.google.android.exoplayer2.upstream.HttpDataSource.RequestProperties requestProperties, com.google.common.base.Predicate<java.lang.String> predicate, boolean z2) {
        super(true);
        this.userAgent = str;
        this.connectTimeoutMillis = i;
        this.readTimeoutMillis = i2;
        this.allowCrossProtocolRedirects = z;
        this.defaultRequestProperties = requestProperties;
        this.contentTypePredicate = predicate;
        this.requestProperties = new com.google.android.exoplayer2.upstream.HttpDataSource.RequestProperties();
        this.keepPostFor302Redirects = z2;
    }

    @java.lang.Deprecated
    public void setContentTypePredicate(com.google.common.base.Predicate<java.lang.String> predicate) {
        this.contentTypePredicate = predicate;
    }

    @Override // com.google.android.exoplayer2.upstream.DataSource
    public android.net.Uri getUri() {
        java.net.HttpURLConnection httpURLConnection = this.connection;
        if (httpURLConnection == null) {
            return null;
        }
        return android.net.Uri.parse(httpURLConnection.getURL().toString());
    }

    @Override // com.google.android.exoplayer2.upstream.HttpDataSource
    public int getResponseCode() {
        int i;
        if (this.connection == null || (i = this.responseCode) <= 0) {
            return -1;
        }
        return i;
    }

    @Override // com.google.android.exoplayer2.upstream.BaseDataSource, com.google.android.exoplayer2.upstream.DataSource
    public java.util.Map<java.lang.String, java.util.List<java.lang.String>> getResponseHeaders() {
        if (this.connection == null) {
            return com.google.common.collect.ImmutableMap.of();
        }
        return new com.google.android.exoplayer2.upstream.DefaultHttpDataSource.NullFilteringHeadersMap(this.connection.getHeaderFields());
    }

    @Override // com.google.android.exoplayer2.upstream.HttpDataSource
    public void setRequestProperty(java.lang.String str, java.lang.String str2) {
        com.google.android.exoplayer2.util.Assertions.checkNotNull(str);
        com.google.android.exoplayer2.util.Assertions.checkNotNull(str2);
        this.requestProperties.set(str, str2);
    }

    @Override // com.google.android.exoplayer2.upstream.HttpDataSource
    public void clearRequestProperty(java.lang.String str) {
        com.google.android.exoplayer2.util.Assertions.checkNotNull(str);
        this.requestProperties.remove(str);
    }

    @Override // com.google.android.exoplayer2.upstream.HttpDataSource
    public void clearAllRequestProperties() {
        this.requestProperties.clear();
    }

    @Override // com.google.android.exoplayer2.upstream.DataSource
    public long open(com.google.android.exoplayer2.upstream.DataSpec dataSpec) throws com.google.android.exoplayer2.upstream.HttpDataSource.HttpDataSourceException {
        byte[] bArr;
        this.dataSpec = dataSpec;
        long j = 0;
        this.bytesRead = 0L;
        this.bytesToRead = 0L;
        transferInitializing(dataSpec);
        try {
            java.net.HttpURLConnection makeConnection = makeConnection(dataSpec);
            this.connection = makeConnection;
            this.responseCode = makeConnection.getResponseCode();
            java.lang.String responseMessage = makeConnection.getResponseMessage();
            int i = this.responseCode;
            if (i < 200 || i > 299) {
                java.util.Map<java.lang.String, java.util.List<java.lang.String>> headerFields = makeConnection.getHeaderFields();
                if (this.responseCode == 416) {
                    if (dataSpec.position == com.google.android.exoplayer2.upstream.HttpUtil.getDocumentSize(makeConnection.getHeaderField(com.google.common.net.HttpHeaders.CONTENT_RANGE))) {
                        this.opened = true;
                        transferStarted(dataSpec);
                        if (dataSpec.length != -1) {
                            return dataSpec.length;
                        }
                        return 0L;
                    }
                }
                java.io.InputStream errorStream = makeConnection.getErrorStream();
                try {
                    bArr = errorStream != null ? com.google.android.exoplayer2.util.Util.toByteArray(errorStream) : com.google.android.exoplayer2.util.Util.EMPTY_BYTE_ARRAY;
                } catch (java.io.IOException unused) {
                    bArr = com.google.android.exoplayer2.util.Util.EMPTY_BYTE_ARRAY;
                }
                byte[] bArr2 = bArr;
                closeConnectionQuietly();
                throw new com.google.android.exoplayer2.upstream.HttpDataSource.InvalidResponseCodeException(this.responseCode, responseMessage, this.responseCode == 416 ? new com.google.android.exoplayer2.upstream.DataSourceException(2008) : null, headerFields, dataSpec, bArr2);
            }
            java.lang.String contentType = makeConnection.getContentType();
            com.google.common.base.Predicate<java.lang.String> predicate = this.contentTypePredicate;
            if (predicate != null && !predicate.apply(contentType)) {
                closeConnectionQuietly();
                throw new com.google.android.exoplayer2.upstream.HttpDataSource.InvalidContentTypeException(contentType, dataSpec);
            }
            if (this.responseCode == 200 && dataSpec.position != 0) {
                j = dataSpec.position;
            }
            boolean isCompressed = isCompressed(makeConnection);
            if (isCompressed) {
                this.bytesToRead = dataSpec.length;
            } else if (dataSpec.length != -1) {
                this.bytesToRead = dataSpec.length;
            } else {
                long contentLength = com.google.android.exoplayer2.upstream.HttpUtil.getContentLength(makeConnection.getHeaderField(com.google.common.net.HttpHeaders.CONTENT_LENGTH), makeConnection.getHeaderField(com.google.common.net.HttpHeaders.CONTENT_RANGE));
                this.bytesToRead = contentLength != -1 ? contentLength - j : -1L;
            }
            try {
                this.inputStream = makeConnection.getInputStream();
                if (isCompressed) {
                    this.inputStream = new java.util.zip.GZIPInputStream(this.inputStream);
                }
                this.opened = true;
                transferStarted(dataSpec);
                try {
                    skipFully(j, dataSpec);
                    return this.bytesToRead;
                } catch (java.io.IOException e) {
                    closeConnectionQuietly();
                    if (e instanceof com.google.android.exoplayer2.upstream.HttpDataSource.HttpDataSourceException) {
                        throw ((com.google.android.exoplayer2.upstream.HttpDataSource.HttpDataSourceException) e);
                    }
                    throw new com.google.android.exoplayer2.upstream.HttpDataSource.HttpDataSourceException(e, dataSpec, 2000, 1);
                }
            } catch (java.io.IOException e2) {
                closeConnectionQuietly();
                throw new com.google.android.exoplayer2.upstream.HttpDataSource.HttpDataSourceException(e2, dataSpec, 2000, 1);
            }
        } catch (java.io.IOException e3) {
            closeConnectionQuietly();
            throw com.google.android.exoplayer2.upstream.HttpDataSource.HttpDataSourceException.createForIOException(e3, dataSpec, 1);
        }
    }

    @Override // com.google.android.exoplayer2.upstream.DataReader
    public int read(byte[] bArr, int i, int i2) throws com.google.android.exoplayer2.upstream.HttpDataSource.HttpDataSourceException {
        try {
            return readInternal(bArr, i, i2);
        } catch (java.io.IOException e) {
            throw com.google.android.exoplayer2.upstream.HttpDataSource.HttpDataSourceException.createForIOException(e, (com.google.android.exoplayer2.upstream.DataSpec) com.google.android.exoplayer2.util.Util.castNonNull(this.dataSpec), 2);
        }
    }

    @Override // com.google.android.exoplayer2.upstream.DataSource
    public void close() throws com.google.android.exoplayer2.upstream.HttpDataSource.HttpDataSourceException {
        try {
            java.io.InputStream inputStream = this.inputStream;
            if (inputStream != null) {
                long j = this.bytesToRead;
                long j2 = -1;
                if (j != -1) {
                    j2 = j - this.bytesRead;
                }
                maybeTerminateInputStream(this.connection, j2);
                try {
                    inputStream.close();
                } catch (java.io.IOException e) {
                    throw new com.google.android.exoplayer2.upstream.HttpDataSource.HttpDataSourceException(e, (com.google.android.exoplayer2.upstream.DataSpec) com.google.android.exoplayer2.util.Util.castNonNull(this.dataSpec), 2000, 3);
                }
            }
        } finally {
            this.inputStream = null;
            closeConnectionQuietly();
            if (this.opened) {
                this.opened = false;
                transferEnded();
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x00aa, code lost:
    
        return r0;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private java.net.HttpURLConnection makeConnection(com.google.android.exoplayer2.upstream.DataSpec dataSpec) throws java.io.IOException {
        java.net.URL url;
        java.net.URL url2 = new java.net.URL(dataSpec.uri.toString());
        int i = dataSpec.httpMethod;
        byte[] bArr = dataSpec.httpBody;
        long j = dataSpec.position;
        long j2 = dataSpec.length;
        boolean isFlagSet = dataSpec.isFlagSet(1);
        if (!this.allowCrossProtocolRedirects && !this.keepPostFor302Redirects) {
            return makeConnection(url2, i, bArr, j, j2, isFlagSet, true, dataSpec.httpRequestHeaders);
        }
        int i2 = 0;
        java.net.URL url3 = url2;
        int i3 = i;
        byte[] bArr2 = bArr;
        while (true) {
            int i4 = i2 + 1;
            if (i2 <= 20) {
                long j3 = j;
                long j4 = j;
                int i5 = i3;
                java.net.URL url4 = url3;
                long j5 = j2;
                java.net.HttpURLConnection makeConnection = makeConnection(url3, i3, bArr2, j3, j2, isFlagSet, false, dataSpec.httpRequestHeaders);
                int responseCode = makeConnection.getResponseCode();
                java.lang.String headerField = makeConnection.getHeaderField(com.google.common.net.HttpHeaders.LOCATION);
                if ((i5 == 1 || i5 == 3) && (responseCode == 300 || responseCode == 301 || responseCode == 302 || responseCode == 303 || responseCode == 307 || responseCode == 308)) {
                    makeConnection.disconnect();
                    url3 = handleRedirect(url4, headerField, dataSpec);
                    i3 = i5;
                } else {
                    if (i5 != 2 || (responseCode != 300 && responseCode != 301 && responseCode != 302 && responseCode != 303)) {
                        break;
                    }
                    makeConnection.disconnect();
                    if (this.keepPostFor302Redirects && responseCode == 302) {
                        i3 = i5;
                        url = url4;
                    } else {
                        bArr2 = null;
                        url = url4;
                        i3 = 1;
                    }
                    url3 = handleRedirect(url, headerField, dataSpec);
                }
                i2 = i4;
                j = j4;
                j2 = j5;
            } else {
                throw new com.google.android.exoplayer2.upstream.HttpDataSource.HttpDataSourceException(new java.net.NoRouteToHostException("Too many redirects: " + i4), dataSpec, 2001, 1);
            }
        }
    }

    private java.net.HttpURLConnection makeConnection(java.net.URL url, int i, byte[] bArr, long j, long j2, boolean z, boolean z2, java.util.Map<java.lang.String, java.lang.String> map) throws java.io.IOException {
        java.net.HttpURLConnection openConnection = openConnection(url);
        openConnection.setConnectTimeout(this.connectTimeoutMillis);
        openConnection.setReadTimeout(this.readTimeoutMillis);
        java.util.HashMap hashMap = new java.util.HashMap();
        com.google.android.exoplayer2.upstream.HttpDataSource.RequestProperties requestProperties = this.defaultRequestProperties;
        if (requestProperties != null) {
            hashMap.putAll(requestProperties.getSnapshot());
        }
        hashMap.putAll(this.requestProperties.getSnapshot());
        hashMap.putAll(map);
        for (java.util.Map.Entry entry : hashMap.entrySet()) {
            openConnection.setRequestProperty((java.lang.String) entry.getKey(), (java.lang.String) entry.getValue());
        }
        java.lang.String buildRangeRequestHeader = com.google.android.exoplayer2.upstream.HttpUtil.buildRangeRequestHeader(j, j2);
        if (buildRangeRequestHeader != null) {
            openConnection.setRequestProperty(com.google.common.net.HttpHeaders.RANGE, buildRangeRequestHeader);
        }
        java.lang.String str = this.userAgent;
        if (str != null) {
            openConnection.setRequestProperty(com.google.common.net.HttpHeaders.USER_AGENT, str);
        }
        openConnection.setRequestProperty(com.google.common.net.HttpHeaders.ACCEPT_ENCODING, z ? "gzip" : "identity");
        openConnection.setInstanceFollowRedirects(z2);
        openConnection.setDoOutput(bArr != null);
        openConnection.setRequestMethod(com.google.android.exoplayer2.upstream.DataSpec.getStringForHttpMethod(i));
        if (bArr != null) {
            openConnection.setFixedLengthStreamingMode(bArr.length);
            openConnection.connect();
            java.io.OutputStream outputStream = openConnection.getOutputStream();
            outputStream.write(bArr);
            outputStream.close();
        } else {
            openConnection.connect();
        }
        return openConnection;
    }

    java.net.HttpURLConnection openConnection(java.net.URL url) throws java.io.IOException {
        return (java.net.HttpURLConnection) url.openConnection();
    }

    private java.net.URL handleRedirect(java.net.URL url, java.lang.String str, com.google.android.exoplayer2.upstream.DataSpec dataSpec) throws com.google.android.exoplayer2.upstream.HttpDataSource.HttpDataSourceException {
        if (str == null) {
            throw new com.google.android.exoplayer2.upstream.HttpDataSource.HttpDataSourceException("Null location redirect", dataSpec, 2001, 1);
        }
        try {
            java.net.URL url2 = new java.net.URL(url, str);
            java.lang.String protocol = url2.getProtocol();
            if (!"https".equals(protocol) && !androidx.webkit.ProxyConfig.MATCH_HTTP.equals(protocol)) {
                throw new com.google.android.exoplayer2.upstream.HttpDataSource.HttpDataSourceException("Unsupported protocol redirect: " + protocol, dataSpec, 2001, 1);
            }
            if (this.allowCrossProtocolRedirects || protocol.equals(url.getProtocol())) {
                return url2;
            }
            throw new com.google.android.exoplayer2.upstream.HttpDataSource.HttpDataSourceException("Disallowed cross-protocol redirect (" + url.getProtocol() + " to " + protocol + ")", dataSpec, 2001, 1);
        } catch (java.net.MalformedURLException e) {
            throw new com.google.android.exoplayer2.upstream.HttpDataSource.HttpDataSourceException(e, dataSpec, 2001, 1);
        }
    }

    private void skipFully(long j, com.google.android.exoplayer2.upstream.DataSpec dataSpec) throws java.io.IOException {
        if (j == 0) {
            return;
        }
        byte[] bArr = new byte[4096];
        while (j > 0) {
            int read = ((java.io.InputStream) com.google.android.exoplayer2.util.Util.castNonNull(this.inputStream)).read(bArr, 0, (int) java.lang.Math.min(j, 4096));
            if (java.lang.Thread.currentThread().isInterrupted()) {
                throw new com.google.android.exoplayer2.upstream.HttpDataSource.HttpDataSourceException(new java.io.InterruptedIOException(), dataSpec, 2000, 1);
            }
            if (read == -1) {
                throw new com.google.android.exoplayer2.upstream.HttpDataSource.HttpDataSourceException(dataSpec, 2008, 1);
            }
            j -= read;
            bytesTransferred(read);
        }
    }

    private int readInternal(byte[] bArr, int i, int i2) throws java.io.IOException {
        if (i2 == 0) {
            return 0;
        }
        long j = this.bytesToRead;
        if (j != -1) {
            long j2 = j - this.bytesRead;
            if (j2 == 0) {
                return -1;
            }
            i2 = (int) java.lang.Math.min(i2, j2);
        }
        int read = ((java.io.InputStream) com.google.android.exoplayer2.util.Util.castNonNull(this.inputStream)).read(bArr, i, i2);
        if (read == -1) {
            return -1;
        }
        this.bytesRead += read;
        bytesTransferred(read);
        return read;
    }

    private static void maybeTerminateInputStream(java.net.HttpURLConnection httpURLConnection, long j) {
        if (httpURLConnection == null || com.google.android.exoplayer2.util.Util.SDK_INT < 19 || com.google.android.exoplayer2.util.Util.SDK_INT > 20) {
            return;
        }
        try {
            java.io.InputStream inputStream = httpURLConnection.getInputStream();
            if (j == -1) {
                if (inputStream.read() == -1) {
                    return;
                }
            } else if (j <= 2048) {
                return;
            }
            java.lang.String name = inputStream.getClass().getName();
            if ("com.android.okhttp.internal.http.HttpTransport$ChunkedInputStream".equals(name) || "com.android.okhttp.internal.http.HttpTransport$FixedLengthInputStream".equals(name)) {
                java.lang.reflect.Method declaredMethod = ((java.lang.Class) com.google.android.exoplayer2.util.Assertions.checkNotNull(inputStream.getClass().getSuperclass())).getDeclaredMethod("unexpectedEndOfInput", new java.lang.Class[0]);
                declaredMethod.setAccessible(true);
                declaredMethod.invoke(inputStream, new java.lang.Object[0]);
            }
        } catch (java.lang.Exception unused) {
        }
    }

    private void closeConnectionQuietly() {
        java.net.HttpURLConnection httpURLConnection = this.connection;
        if (httpURLConnection != null) {
            try {
                httpURLConnection.disconnect();
            } catch (java.lang.Exception e) {
                com.google.android.exoplayer2.util.Log.e(TAG, "Unexpected error while disconnecting", e);
            }
            this.connection = null;
        }
    }

    private static boolean isCompressed(java.net.HttpURLConnection httpURLConnection) {
        return "gzip".equalsIgnoreCase(httpURLConnection.getHeaderField(com.google.common.net.HttpHeaders.CONTENT_ENCODING));
    }

    /* JADX INFO: Access modifiers changed from: private */
    static class NullFilteringHeadersMap extends com.google.common.collect.ForwardingMap<java.lang.String, java.util.List<java.lang.String>> {
        private final java.util.Map<java.lang.String, java.util.List<java.lang.String>> headers;

        static /* synthetic */ boolean lambda$keySet$0(java.lang.String str) {
            return str != null;
        }

        public NullFilteringHeadersMap(java.util.Map<java.lang.String, java.util.List<java.lang.String>> map) {
            this.headers = map;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.google.common.collect.ForwardingMap, com.google.common.collect.ForwardingObject
        public java.util.Map<java.lang.String, java.util.List<java.lang.String>> delegate() {
            return this.headers;
        }

        @Override // com.google.common.collect.ForwardingMap, java.util.Map
        public boolean containsKey(java.lang.Object obj) {
            return obj != null && super.containsKey(obj);
        }

        @Override // com.google.common.collect.ForwardingMap, java.util.Map
        public java.util.List<java.lang.String> get(java.lang.Object obj) {
            if (obj == null) {
                return null;
            }
            return (java.util.List) super.get(obj);
        }

        @Override // com.google.common.collect.ForwardingMap, java.util.Map
        public java.util.Set<java.lang.String> keySet() {
            return com.google.common.collect.Sets.filter(super.keySet(), new com.google.common.base.Predicate() { // from class: com.google.android.exoplayer2.upstream.DefaultHttpDataSource$NullFilteringHeadersMap$$ExternalSyntheticLambda0
                @Override // com.google.common.base.Predicate
                public final boolean apply(java.lang.Object obj) {
                    return com.google.android.exoplayer2.upstream.DefaultHttpDataSource.NullFilteringHeadersMap.lambda$keySet$0((java.lang.String) obj);
                }
            });
        }

        static /* synthetic */ boolean lambda$entrySet$1(java.util.Map.Entry entry) {
            return entry.getKey() != null;
        }

        @Override // com.google.common.collect.ForwardingMap, java.util.Map
        public java.util.Set<java.util.Map.Entry<java.lang.String, java.util.List<java.lang.String>>> entrySet() {
            return com.google.common.collect.Sets.filter(super.entrySet(), new com.google.common.base.Predicate() { // from class: com.google.android.exoplayer2.upstream.DefaultHttpDataSource$NullFilteringHeadersMap$$ExternalSyntheticLambda1
                @Override // com.google.common.base.Predicate
                public final boolean apply(java.lang.Object obj) {
                    return com.google.android.exoplayer2.upstream.DefaultHttpDataSource.NullFilteringHeadersMap.lambda$entrySet$1((java.util.Map.Entry) obj);
                }
            });
        }

        @Override // com.google.common.collect.ForwardingMap, java.util.Map
        public int size() {
            return super.size() - (super.containsKey(null) ? 1 : 0);
        }

        @Override // com.google.common.collect.ForwardingMap, java.util.Map
        public boolean isEmpty() {
            if (super.isEmpty()) {
                return true;
            }
            return super.size() == 1 && super.containsKey(null);
        }

        @Override // com.google.common.collect.ForwardingMap, java.util.Map
        public boolean containsValue(java.lang.Object obj) {
            return super.standardContainsValue(obj);
        }

        @Override // com.google.common.collect.ForwardingMap, java.util.Map
        public boolean equals(java.lang.Object obj) {
            return obj != null && super.standardEquals(obj);
        }

        @Override // com.google.common.collect.ForwardingMap, java.util.Map
        public int hashCode() {
            return super.standardHashCode();
        }
    }
}
