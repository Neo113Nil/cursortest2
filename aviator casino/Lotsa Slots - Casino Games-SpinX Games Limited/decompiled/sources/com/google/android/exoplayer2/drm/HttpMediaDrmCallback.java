package com.google.android.exoplayer2.drm;

/* loaded from: classes3.dex */
public final class HttpMediaDrmCallback implements com.google.android.exoplayer2.drm.MediaDrmCallback {
    private static final int MAX_MANUAL_REDIRECTS = 5;
    private final com.google.android.exoplayer2.upstream.DataSource.Factory dataSourceFactory;
    private final java.lang.String defaultLicenseUrl;
    private final boolean forceDefaultLicenseUrl;
    private final java.util.Map<java.lang.String, java.lang.String> keyRequestProperties;

    public HttpMediaDrmCallback(java.lang.String str, com.google.android.exoplayer2.upstream.DataSource.Factory factory) {
        this(str, false, factory);
    }

    public HttpMediaDrmCallback(java.lang.String str, boolean z, com.google.android.exoplayer2.upstream.DataSource.Factory factory) {
        com.google.android.exoplayer2.util.Assertions.checkArgument((z && android.text.TextUtils.isEmpty(str)) ? false : true);
        this.dataSourceFactory = factory;
        this.defaultLicenseUrl = str;
        this.forceDefaultLicenseUrl = z;
        this.keyRequestProperties = new java.util.HashMap();
    }

    public void setKeyRequestProperty(java.lang.String str, java.lang.String str2) {
        com.google.android.exoplayer2.util.Assertions.checkNotNull(str);
        com.google.android.exoplayer2.util.Assertions.checkNotNull(str2);
        synchronized (this.keyRequestProperties) {
            this.keyRequestProperties.put(str, str2);
        }
    }

    public void clearKeyRequestProperty(java.lang.String str) {
        com.google.android.exoplayer2.util.Assertions.checkNotNull(str);
        synchronized (this.keyRequestProperties) {
            this.keyRequestProperties.remove(str);
        }
    }

    public void clearAllKeyRequestProperties() {
        synchronized (this.keyRequestProperties) {
            this.keyRequestProperties.clear();
        }
    }

    @Override // com.google.android.exoplayer2.drm.MediaDrmCallback
    public byte[] executeProvisionRequest(java.util.UUID uuid, com.google.android.exoplayer2.drm.ExoMediaDrm.ProvisionRequest provisionRequest) throws com.google.android.exoplayer2.drm.MediaDrmCallbackException {
        return executePost(this.dataSourceFactory, provisionRequest.getDefaultUrl() + "&signedRequest=" + com.google.android.exoplayer2.util.Util.fromUtf8Bytes(provisionRequest.getData()), null, java.util.Collections.emptyMap());
    }

    @Override // com.google.android.exoplayer2.drm.MediaDrmCallback
    public byte[] executeKeyRequest(java.util.UUID uuid, com.google.android.exoplayer2.drm.ExoMediaDrm.KeyRequest keyRequest) throws com.google.android.exoplayer2.drm.MediaDrmCallbackException {
        java.lang.String str;
        java.lang.String licenseServerUrl = keyRequest.getLicenseServerUrl();
        if (this.forceDefaultLicenseUrl || android.text.TextUtils.isEmpty(licenseServerUrl)) {
            licenseServerUrl = this.defaultLicenseUrl;
        }
        if (android.text.TextUtils.isEmpty(licenseServerUrl)) {
            throw new com.google.android.exoplayer2.drm.MediaDrmCallbackException(new com.google.android.exoplayer2.upstream.DataSpec.Builder().setUri(android.net.Uri.EMPTY).build(), android.net.Uri.EMPTY, com.google.common.collect.ImmutableMap.of(), 0L, new java.lang.IllegalStateException("No license URL"));
        }
        java.util.HashMap hashMap = new java.util.HashMap();
        if (com.google.android.exoplayer2.C.PLAYREADY_UUID.equals(uuid)) {
            str = "text/xml";
        } else {
            str = com.google.android.exoplayer2.C.CLEARKEY_UUID.equals(uuid) ? com.ironsource.B5.M : "application/octet-stream";
        }
        hashMap.put("Content-Type", str);
        if (com.google.android.exoplayer2.C.PLAYREADY_UUID.equals(uuid)) {
            hashMap.put("SOAPAction", "http://schemas.microsoft.com/DRM/2007/03/protocols/AcquireLicense");
        }
        synchronized (this.keyRequestProperties) {
            hashMap.putAll(this.keyRequestProperties);
        }
        return executePost(this.dataSourceFactory, licenseServerUrl, keyRequest.getData(), hashMap);
    }

    private static byte[] executePost(com.google.android.exoplayer2.upstream.DataSource.Factory factory, java.lang.String str, byte[] bArr, java.util.Map<java.lang.String, java.lang.String> map) throws com.google.android.exoplayer2.drm.MediaDrmCallbackException {
        com.google.android.exoplayer2.upstream.StatsDataSource statsDataSource = new com.google.android.exoplayer2.upstream.StatsDataSource(factory.createDataSource());
        com.google.android.exoplayer2.upstream.DataSpec build = new com.google.android.exoplayer2.upstream.DataSpec.Builder().setUri(str).setHttpRequestHeaders(map).setHttpMethod(2).setHttpBody(bArr).setFlags(1).build();
        int i = 0;
        com.google.android.exoplayer2.upstream.DataSpec dataSpec = build;
        while (true) {
            try {
                com.google.android.exoplayer2.upstream.DataSourceInputStream dataSourceInputStream = new com.google.android.exoplayer2.upstream.DataSourceInputStream(statsDataSource, dataSpec);
                try {
                    return com.google.android.exoplayer2.util.Util.toByteArray(dataSourceInputStream);
                } catch (com.google.android.exoplayer2.upstream.HttpDataSource.InvalidResponseCodeException e) {
                    java.lang.String redirectUrl = getRedirectUrl(e, i);
                    if (redirectUrl == null) {
                        throw e;
                    }
                    i++;
                    dataSpec = dataSpec.buildUpon().setUri(redirectUrl).build();
                } finally {
                    com.google.android.exoplayer2.util.Util.closeQuietly(dataSourceInputStream);
                }
            } catch (java.lang.Exception e2) {
                throw new com.google.android.exoplayer2.drm.MediaDrmCallbackException(build, (android.net.Uri) com.google.android.exoplayer2.util.Assertions.checkNotNull(statsDataSource.getLastOpenedUri()), statsDataSource.getResponseHeaders(), statsDataSource.getBytesRead(), e2);
            }
        }
    }

    private static java.lang.String getRedirectUrl(com.google.android.exoplayer2.upstream.HttpDataSource.InvalidResponseCodeException invalidResponseCodeException, int i) {
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> map;
        java.util.List<java.lang.String> list;
        if ((invalidResponseCodeException.responseCode != 307 && invalidResponseCodeException.responseCode != 308) || i >= 5 || (map = invalidResponseCodeException.headerFields) == null || (list = map.get(com.google.common.net.HttpHeaders.LOCATION)) == null || list.isEmpty()) {
            return null;
        }
        return list.get(0);
    }
}
