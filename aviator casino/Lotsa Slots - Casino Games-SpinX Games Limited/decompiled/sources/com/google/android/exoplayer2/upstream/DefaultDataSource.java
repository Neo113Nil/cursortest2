package com.google.android.exoplayer2.upstream;

/* loaded from: classes3.dex */
public final class DefaultDataSource implements com.google.android.exoplayer2.upstream.DataSource {
    private static final java.lang.String SCHEME_ANDROID_RESOURCE = "android.resource";
    private static final java.lang.String SCHEME_ASSET = "asset";
    private static final java.lang.String SCHEME_CONTENT = "content";
    private static final java.lang.String SCHEME_DATA = "data";
    private static final java.lang.String SCHEME_RAW = "rawresource";
    private static final java.lang.String SCHEME_RTMP = "rtmp";
    private static final java.lang.String SCHEME_UDP = "udp";
    private static final java.lang.String TAG = "DefaultDataSource";
    private com.google.android.exoplayer2.upstream.DataSource assetDataSource;
    private final com.google.android.exoplayer2.upstream.DataSource baseDataSource;
    private com.google.android.exoplayer2.upstream.DataSource contentDataSource;
    private final android.content.Context context;
    private com.google.android.exoplayer2.upstream.DataSource dataSchemeDataSource;
    private com.google.android.exoplayer2.upstream.DataSource dataSource;
    private com.google.android.exoplayer2.upstream.DataSource fileDataSource;
    private com.google.android.exoplayer2.upstream.DataSource rawResourceDataSource;
    private com.google.android.exoplayer2.upstream.DataSource rtmpDataSource;
    private final java.util.List<com.google.android.exoplayer2.upstream.TransferListener> transferListeners;
    private com.google.android.exoplayer2.upstream.DataSource udpDataSource;

    public static final class Factory implements com.google.android.exoplayer2.upstream.DataSource.Factory {
        private final com.google.android.exoplayer2.upstream.DataSource.Factory baseDataSourceFactory;
        private final android.content.Context context;
        private com.google.android.exoplayer2.upstream.TransferListener transferListener;

        public Factory(android.content.Context context) {
            this(context, new com.google.android.exoplayer2.upstream.DefaultHttpDataSource.Factory());
        }

        public Factory(android.content.Context context, com.google.android.exoplayer2.upstream.DataSource.Factory factory) {
            this.context = context.getApplicationContext();
            this.baseDataSourceFactory = factory;
        }

        public com.google.android.exoplayer2.upstream.DefaultDataSource.Factory setTransferListener(com.google.android.exoplayer2.upstream.TransferListener transferListener) {
            this.transferListener = transferListener;
            return this;
        }

        @Override // com.google.android.exoplayer2.upstream.DataSource.Factory
        public com.google.android.exoplayer2.upstream.DefaultDataSource createDataSource() {
            com.google.android.exoplayer2.upstream.DefaultDataSource defaultDataSource = new com.google.android.exoplayer2.upstream.DefaultDataSource(this.context, this.baseDataSourceFactory.createDataSource());
            com.google.android.exoplayer2.upstream.TransferListener transferListener = this.transferListener;
            if (transferListener != null) {
                defaultDataSource.addTransferListener(transferListener);
            }
            return defaultDataSource;
        }
    }

    public DefaultDataSource(android.content.Context context, boolean z) {
        this(context, null, 8000, 8000, z);
    }

    public DefaultDataSource(android.content.Context context, java.lang.String str, boolean z) {
        this(context, str, 8000, 8000, z);
    }

    public DefaultDataSource(android.content.Context context, java.lang.String str, int i, int i2, boolean z) {
        this(context, new com.google.android.exoplayer2.upstream.DefaultHttpDataSource.Factory().setUserAgent(str).setConnectTimeoutMs(i).setReadTimeoutMs(i2).setAllowCrossProtocolRedirects(z).createDataSource());
    }

    public DefaultDataSource(android.content.Context context, com.google.android.exoplayer2.upstream.DataSource dataSource) {
        this.context = context.getApplicationContext();
        this.baseDataSource = (com.google.android.exoplayer2.upstream.DataSource) com.google.android.exoplayer2.util.Assertions.checkNotNull(dataSource);
        this.transferListeners = new java.util.ArrayList();
    }

    @Override // com.google.android.exoplayer2.upstream.DataSource
    public void addTransferListener(com.google.android.exoplayer2.upstream.TransferListener transferListener) {
        com.google.android.exoplayer2.util.Assertions.checkNotNull(transferListener);
        this.baseDataSource.addTransferListener(transferListener);
        this.transferListeners.add(transferListener);
        maybeAddListenerToDataSource(this.fileDataSource, transferListener);
        maybeAddListenerToDataSource(this.assetDataSource, transferListener);
        maybeAddListenerToDataSource(this.contentDataSource, transferListener);
        maybeAddListenerToDataSource(this.rtmpDataSource, transferListener);
        maybeAddListenerToDataSource(this.udpDataSource, transferListener);
        maybeAddListenerToDataSource(this.dataSchemeDataSource, transferListener);
        maybeAddListenerToDataSource(this.rawResourceDataSource, transferListener);
    }

    @Override // com.google.android.exoplayer2.upstream.DataSource
    public long open(com.google.android.exoplayer2.upstream.DataSpec dataSpec) throws java.io.IOException {
        com.google.android.exoplayer2.util.Assertions.checkState(this.dataSource == null);
        java.lang.String scheme = dataSpec.uri.getScheme();
        if (com.google.android.exoplayer2.util.Util.isLocalFileUri(dataSpec.uri)) {
            java.lang.String path = dataSpec.uri.getPath();
            if (path != null && path.startsWith("/android_asset/")) {
                this.dataSource = getAssetDataSource();
            } else {
                this.dataSource = getFileDataSource();
            }
        } else if (SCHEME_ASSET.equals(scheme)) {
            this.dataSource = getAssetDataSource();
        } else if ("content".equals(scheme)) {
            this.dataSource = getContentDataSource();
        } else if (SCHEME_RTMP.equals(scheme)) {
            this.dataSource = getRtmpDataSource();
        } else if (SCHEME_UDP.equals(scheme)) {
            this.dataSource = getUdpDataSource();
        } else if ("data".equals(scheme)) {
            this.dataSource = getDataSchemeDataSource();
        } else if ("rawresource".equals(scheme) || SCHEME_ANDROID_RESOURCE.equals(scheme)) {
            this.dataSource = getRawResourceDataSource();
        } else {
            this.dataSource = this.baseDataSource;
        }
        return this.dataSource.open(dataSpec);
    }

    @Override // com.google.android.exoplayer2.upstream.DataReader
    public int read(byte[] bArr, int i, int i2) throws java.io.IOException {
        return ((com.google.android.exoplayer2.upstream.DataSource) com.google.android.exoplayer2.util.Assertions.checkNotNull(this.dataSource)).read(bArr, i, i2);
    }

    @Override // com.google.android.exoplayer2.upstream.DataSource
    public android.net.Uri getUri() {
        com.google.android.exoplayer2.upstream.DataSource dataSource = this.dataSource;
        if (dataSource == null) {
            return null;
        }
        return dataSource.getUri();
    }

    @Override // com.google.android.exoplayer2.upstream.DataSource
    public java.util.Map<java.lang.String, java.util.List<java.lang.String>> getResponseHeaders() {
        com.google.android.exoplayer2.upstream.DataSource dataSource = this.dataSource;
        return dataSource == null ? java.util.Collections.emptyMap() : dataSource.getResponseHeaders();
    }

    @Override // com.google.android.exoplayer2.upstream.DataSource
    public void close() throws java.io.IOException {
        com.google.android.exoplayer2.upstream.DataSource dataSource = this.dataSource;
        if (dataSource != null) {
            try {
                dataSource.close();
            } finally {
                this.dataSource = null;
            }
        }
    }

    private com.google.android.exoplayer2.upstream.DataSource getUdpDataSource() {
        if (this.udpDataSource == null) {
            com.google.android.exoplayer2.upstream.UdpDataSource udpDataSource = new com.google.android.exoplayer2.upstream.UdpDataSource();
            this.udpDataSource = udpDataSource;
            addListenersToDataSource(udpDataSource);
        }
        return this.udpDataSource;
    }

    private com.google.android.exoplayer2.upstream.DataSource getFileDataSource() {
        if (this.fileDataSource == null) {
            com.google.android.exoplayer2.upstream.FileDataSource fileDataSource = new com.google.android.exoplayer2.upstream.FileDataSource();
            this.fileDataSource = fileDataSource;
            addListenersToDataSource(fileDataSource);
        }
        return this.fileDataSource;
    }

    private com.google.android.exoplayer2.upstream.DataSource getAssetDataSource() {
        if (this.assetDataSource == null) {
            com.google.android.exoplayer2.upstream.AssetDataSource assetDataSource = new com.google.android.exoplayer2.upstream.AssetDataSource(this.context);
            this.assetDataSource = assetDataSource;
            addListenersToDataSource(assetDataSource);
        }
        return this.assetDataSource;
    }

    private com.google.android.exoplayer2.upstream.DataSource getContentDataSource() {
        if (this.contentDataSource == null) {
            com.google.android.exoplayer2.upstream.ContentDataSource contentDataSource = new com.google.android.exoplayer2.upstream.ContentDataSource(this.context);
            this.contentDataSource = contentDataSource;
            addListenersToDataSource(contentDataSource);
        }
        return this.contentDataSource;
    }

    private com.google.android.exoplayer2.upstream.DataSource getRtmpDataSource() {
        if (this.rtmpDataSource == null) {
            try {
                com.google.android.exoplayer2.upstream.DataSource dataSource = (com.google.android.exoplayer2.upstream.DataSource) java.lang.Class.forName("com.google.android.exoplayer2.ext.rtmp.RtmpDataSource").getConstructor(new java.lang.Class[0]).newInstance(new java.lang.Object[0]);
                this.rtmpDataSource = dataSource;
                addListenersToDataSource(dataSource);
            } catch (java.lang.ClassNotFoundException unused) {
                com.google.android.exoplayer2.util.Log.w(TAG, "Attempting to play RTMP stream without depending on the RTMP extension");
            } catch (java.lang.Exception e) {
                throw new java.lang.RuntimeException("Error instantiating RTMP extension", e);
            }
            if (this.rtmpDataSource == null) {
                this.rtmpDataSource = this.baseDataSource;
            }
        }
        return this.rtmpDataSource;
    }

    private com.google.android.exoplayer2.upstream.DataSource getDataSchemeDataSource() {
        if (this.dataSchemeDataSource == null) {
            com.google.android.exoplayer2.upstream.DataSchemeDataSource dataSchemeDataSource = new com.google.android.exoplayer2.upstream.DataSchemeDataSource();
            this.dataSchemeDataSource = dataSchemeDataSource;
            addListenersToDataSource(dataSchemeDataSource);
        }
        return this.dataSchemeDataSource;
    }

    private com.google.android.exoplayer2.upstream.DataSource getRawResourceDataSource() {
        if (this.rawResourceDataSource == null) {
            com.google.android.exoplayer2.upstream.RawResourceDataSource rawResourceDataSource = new com.google.android.exoplayer2.upstream.RawResourceDataSource(this.context);
            this.rawResourceDataSource = rawResourceDataSource;
            addListenersToDataSource(rawResourceDataSource);
        }
        return this.rawResourceDataSource;
    }

    private void addListenersToDataSource(com.google.android.exoplayer2.upstream.DataSource dataSource) {
        for (int i = 0; i < this.transferListeners.size(); i++) {
            dataSource.addTransferListener(this.transferListeners.get(i));
        }
    }

    private void maybeAddListenerToDataSource(com.google.android.exoplayer2.upstream.DataSource dataSource, com.google.android.exoplayer2.upstream.TransferListener transferListener) {
        if (dataSource != null) {
            dataSource.addTransferListener(transferListener);
        }
    }
}
