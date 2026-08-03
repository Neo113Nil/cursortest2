package com.google.android.exoplayer2.drm;

/* loaded from: classes3.dex */
public final class DefaultDrmSessionManagerProvider implements com.google.android.exoplayer2.drm.DrmSessionManagerProvider {
    private com.google.android.exoplayer2.MediaItem.DrmConfiguration drmConfiguration;
    private com.google.android.exoplayer2.upstream.DataSource.Factory drmHttpDataSourceFactory;
    private final java.lang.Object lock = new java.lang.Object();
    private com.google.android.exoplayer2.drm.DrmSessionManager manager;
    private java.lang.String userAgent;

    public void setDrmHttpDataSourceFactory(com.google.android.exoplayer2.upstream.DataSource.Factory factory) {
        this.drmHttpDataSourceFactory = factory;
    }

    @java.lang.Deprecated
    public void setDrmUserAgent(java.lang.String str) {
        this.userAgent = str;
    }

    @Override // com.google.android.exoplayer2.drm.DrmSessionManagerProvider
    public com.google.android.exoplayer2.drm.DrmSessionManager get(com.google.android.exoplayer2.MediaItem mediaItem) {
        com.google.android.exoplayer2.drm.DrmSessionManager drmSessionManager;
        com.google.android.exoplayer2.util.Assertions.checkNotNull(mediaItem.localConfiguration);
        com.google.android.exoplayer2.MediaItem.DrmConfiguration drmConfiguration = mediaItem.localConfiguration.drmConfiguration;
        if (drmConfiguration == null || com.google.android.exoplayer2.util.Util.SDK_INT < 18) {
            return com.google.android.exoplayer2.drm.DrmSessionManager.DRM_UNSUPPORTED;
        }
        synchronized (this.lock) {
            if (!com.google.android.exoplayer2.util.Util.areEqual(drmConfiguration, this.drmConfiguration)) {
                this.drmConfiguration = drmConfiguration;
                this.manager = createManager(drmConfiguration);
            }
            drmSessionManager = (com.google.android.exoplayer2.drm.DrmSessionManager) com.google.android.exoplayer2.util.Assertions.checkNotNull(this.manager);
        }
        return drmSessionManager;
    }

    private com.google.android.exoplayer2.drm.DrmSessionManager createManager(com.google.android.exoplayer2.MediaItem.DrmConfiguration drmConfiguration) {
        com.google.android.exoplayer2.upstream.DataSource.Factory factory = this.drmHttpDataSourceFactory;
        if (factory == null) {
            factory = new com.google.android.exoplayer2.upstream.DefaultHttpDataSource.Factory().setUserAgent(this.userAgent);
        }
        com.google.android.exoplayer2.drm.HttpMediaDrmCallback httpMediaDrmCallback = new com.google.android.exoplayer2.drm.HttpMediaDrmCallback(drmConfiguration.licenseUri == null ? null : drmConfiguration.licenseUri.toString(), drmConfiguration.forceDefaultLicenseUri, factory);
        com.google.common.collect.UnmodifiableIterator<java.util.Map.Entry<java.lang.String, java.lang.String>> it = drmConfiguration.licenseRequestHeaders.entrySet().iterator();
        while (it.hasNext()) {
            java.util.Map.Entry<java.lang.String, java.lang.String> next = it.next();
            httpMediaDrmCallback.setKeyRequestProperty(next.getKey(), next.getValue());
        }
        com.google.android.exoplayer2.drm.DefaultDrmSessionManager build = new com.google.android.exoplayer2.drm.DefaultDrmSessionManager.Builder().setUuidAndExoMediaDrmProvider(drmConfiguration.scheme, com.google.android.exoplayer2.drm.FrameworkMediaDrm.DEFAULT_PROVIDER).setMultiSession(drmConfiguration.multiSession).setPlayClearSamplesWithoutKeys(drmConfiguration.playClearContentWithoutKey).setUseDrmSessionsForClearContent(com.google.common.primitives.Ints.toArray(drmConfiguration.forcedSessionTrackTypes)).build(httpMediaDrmCallback);
        build.setMode(0, drmConfiguration.getKeySetId());
        return build;
    }
}
