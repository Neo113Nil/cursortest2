package androidx.media3.exoplayer.drm;

/* loaded from: classes2.dex */
public final class HttpMediaDrmCallback implements androidx.media3.exoplayer.drm.MediaDrmCallback {
    private static final int MAX_MANUAL_REDIRECTS = 5;
    private final androidx.media3.datasource.DataSource.Factory dataSourceFactory;
    private final java.lang.String defaultLicenseUrl;
    private final boolean forceDefaultLicenseUrl;
    private final java.util.Map<java.lang.String, java.lang.String> keyRequestProperties;

    public HttpMediaDrmCallback(java.lang.String str, androidx.media3.datasource.DataSource.Factory factory) {
        this(str, false, factory);
    }

    public HttpMediaDrmCallback(java.lang.String str, boolean z, androidx.media3.datasource.DataSource.Factory factory) {
        androidx.media3.common.util.Assertions.checkArgument((z && android.text.TextUtils.isEmpty(str)) ? false : true);
        this.dataSourceFactory = factory;
        this.defaultLicenseUrl = str;
        this.forceDefaultLicenseUrl = z;
        this.keyRequestProperties = new java.util.HashMap();
    }

    public void setKeyRequestProperty(java.lang.String str, java.lang.String str2) {
        androidx.media3.common.util.Assertions.checkNotNull(str);
        androidx.media3.common.util.Assertions.checkNotNull(str2);
        synchronized (this.keyRequestProperties) {
            this.keyRequestProperties.put(str, str2);
        }
    }

    public void clearKeyRequestProperty(java.lang.String str) {
        androidx.media3.common.util.Assertions.checkNotNull(str);
        synchronized (this.keyRequestProperties) {
            this.keyRequestProperties.remove(str);
        }
    }

    public void clearAllKeyRequestProperties() {
        synchronized (this.keyRequestProperties) {
            this.keyRequestProperties.clear();
        }
    }

    @Override // androidx.media3.exoplayer.drm.MediaDrmCallback
    public byte[] executeProvisionRequest(java.util.UUID uuid, androidx.media3.exoplayer.drm.ExoMediaDrm.ProvisionRequest provisionRequest) throws androidx.media3.exoplayer.drm.MediaDrmCallbackException {
        return executePost(this.dataSourceFactory, provisionRequest.getDefaultUrl() + "&signedRequest=" + androidx.media3.common.util.Util.fromUtf8Bytes(provisionRequest.getData()), null, java.util.Collections.emptyMap());
    }

    @Override // androidx.media3.exoplayer.drm.MediaDrmCallback
    public byte[] executeKeyRequest(java.util.UUID uuid, androidx.media3.exoplayer.drm.ExoMediaDrm.KeyRequest keyRequest) throws androidx.media3.exoplayer.drm.MediaDrmCallbackException {
        java.lang.String str;
        java.lang.String licenseServerUrl = keyRequest.getLicenseServerUrl();
        if (this.forceDefaultLicenseUrl || android.text.TextUtils.isEmpty(licenseServerUrl)) {
            licenseServerUrl = this.defaultLicenseUrl;
        }
        if (android.text.TextUtils.isEmpty(licenseServerUrl)) {
            throw new androidx.media3.exoplayer.drm.MediaDrmCallbackException(new androidx.media3.datasource.DataSpec.Builder().setUri(android.net.Uri.EMPTY).build(), android.net.Uri.EMPTY, com.google.common.collect.ImmutableMap.of(), 0L, new java.lang.IllegalStateException("No license URL"));
        }
        java.util.HashMap hashMap = new java.util.HashMap();
        if (androidx.media3.common.C.PLAYREADY_UUID.equals(uuid)) {
            str = "text/xml";
        } else {
            str = androidx.media3.common.C.CLEARKEY_UUID.equals(uuid) ? com.ironsource.B5.M : "application/octet-stream";
        }
        hashMap.put("Content-Type", str);
        if (androidx.media3.common.C.PLAYREADY_UUID.equals(uuid)) {
            hashMap.put("SOAPAction", "http://schemas.microsoft.com/DRM/2007/03/protocols/AcquireLicense");
        }
        synchronized (this.keyRequestProperties) {
            hashMap.putAll(this.keyRequestProperties);
        }
        return executePost(this.dataSourceFactory, licenseServerUrl, keyRequest.getData(), hashMap);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(4:11|12|13|(2:15|16)(2:17|18)) */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0039, code lost:
    
        r11 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x003a, code lost:
    
        r1 = getRedirectUrl(r11, r8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x003e, code lost:
    
        if (r1 != null) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0040, code lost:
    
        r8 = r8 + 1;
        r9 = r9.buildUpon().setUri(r1).build();
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0052, code lost:
    
        throw r11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0037, code lost:
    
        r8 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0053, code lost:
    
        androidx.media3.common.util.Util.closeQuietly(r10);
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0056, code lost:
    
        throw r8;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static byte[] executePost(androidx.media3.datasource.DataSource.Factory factory, java.lang.String str, byte[] bArr, java.util.Map<java.lang.String, java.lang.String> map) throws androidx.media3.exoplayer.drm.MediaDrmCallbackException {
        androidx.media3.datasource.StatsDataSource statsDataSource = new androidx.media3.datasource.StatsDataSource(factory.createDataSource());
        androidx.media3.datasource.DataSpec build = new androidx.media3.datasource.DataSpec.Builder().setUri(str).setHttpRequestHeaders(map).setHttpMethod(2).setHttpBody(bArr).setFlags(1).build();
        int i = 0;
        androidx.media3.datasource.DataSpec dataSpec = build;
        while (true) {
            try {
                androidx.media3.datasource.DataSourceInputStream dataSourceInputStream = new androidx.media3.datasource.DataSourceInputStream(statsDataSource, dataSpec);
                return com.google.common.io.ByteStreams.toByteArray(dataSourceInputStream);
            } catch (java.lang.Exception e) {
                throw new androidx.media3.exoplayer.drm.MediaDrmCallbackException(build, (android.net.Uri) androidx.media3.common.util.Assertions.checkNotNull(statsDataSource.getLastOpenedUri()), statsDataSource.getResponseHeaders(), statsDataSource.getBytesRead(), e);
            }
        }
    }

    private static java.lang.String getRedirectUrl(androidx.media3.datasource.HttpDataSource.InvalidResponseCodeException invalidResponseCodeException, int i) {
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> map;
        java.util.List<java.lang.String> list;
        if ((invalidResponseCodeException.responseCode != 307 && invalidResponseCodeException.responseCode != 308) || i >= 5 || (map = invalidResponseCodeException.headerFields) == null || (list = map.get(com.google.common.net.HttpHeaders.LOCATION)) == null || list.isEmpty()) {
            return null;
        }
        return list.get(0);
    }
}
