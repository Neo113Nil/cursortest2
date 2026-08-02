package org.chromium.net;

@java.lang.Deprecated
/* loaded from: classes5.dex */
public abstract class ExperimentalCronetEngine extends org.chromium.net.CronetEngine {
    public static final int CONNECTION_METRIC_UNKNOWN = -1;
    public static final int EFFECTIVE_CONNECTION_TYPE_2G = 3;
    public static final int EFFECTIVE_CONNECTION_TYPE_3G = 4;
    public static final int EFFECTIVE_CONNECTION_TYPE_4G = 5;
    public static final int EFFECTIVE_CONNECTION_TYPE_OFFLINE = 1;
    public static final int EFFECTIVE_CONNECTION_TYPE_SLOW_2G = 2;
    public static final int EFFECTIVE_CONNECTION_TYPE_UNKNOWN = 0;
    private static final java.lang.String SHOULD_OVERRIDE_WITH_HTTPENGINE = "Cronet_OverrideWithHttpEngine";
    public static final long UNBIND_NETWORK_HANDLE = -1;

    @Override // org.chromium.net.CronetEngine
    public abstract org.chromium.net.ExperimentalBidirectionalStream.Builder newBidirectionalStreamBuilder(java.lang.String str, org.chromium.net.BidirectionalStream.Callback callback, java.util.concurrent.Executor executor);

    @Override // org.chromium.net.CronetEngine
    public abstract org.chromium.net.ExperimentalUrlRequest.Builder newUrlRequestBuilder(java.lang.String str, org.chromium.net.UrlRequest.Callback callback, java.util.concurrent.Executor executor);

    /* loaded from: classes18.dex */
    public static class Builder extends org.chromium.net.CronetEngine.Builder {
        @Override // org.chromium.net.CronetEngine.Builder
        public org.chromium.net.ExperimentalCronetEngine.Builder enableSdch(boolean z) {
            return this;
        }

        @Override // org.chromium.net.CronetEngine.Builder
        public /* bridge */ /* synthetic */ org.chromium.net.CronetEngine.Builder addPublicKeyPins(java.lang.String str, java.util.Set set, boolean z, java.util.Date date) {
            return addPublicKeyPins(str, (java.util.Set<byte[]>) set, z, date);
        }

        public Builder(android.content.Context context) {
            super(context);
        }

        public Builder(org.chromium.net.ICronetEngineBuilder iCronetEngineBuilder) {
            super(iCronetEngineBuilder);
        }

        public org.chromium.net.ExperimentalCronetEngine.Builder setExperimentalOptions(java.lang.String str) {
            this.mParsedExperimentalOptions = org.chromium.net.ExperimentalOptionsTranslator.getHighSpeedVideoFpsRangesFor(str);
            return this;
        }

        public org.chromium.net.ICronetEngineBuilder getBuilderDelegate() {
            return this.mBuilderDelegate;
        }

        @Override // org.chromium.net.CronetEngine.Builder
        public org.chromium.net.ExperimentalCronetEngine.Builder setUserAgent(java.lang.String str) {
            super.setUserAgent(str);
            return this;
        }

        @Override // org.chromium.net.CronetEngine.Builder
        public org.chromium.net.ExperimentalCronetEngine.Builder setStoragePath(java.lang.String str) {
            super.setStoragePath(str);
            return this;
        }

        @Override // org.chromium.net.CronetEngine.Builder
        public org.chromium.net.ExperimentalCronetEngine.Builder setLibraryLoader(org.chromium.net.CronetEngine.Builder.LibraryLoader libraryLoader) {
            super.setLibraryLoader(libraryLoader);
            return this;
        }

        @Override // org.chromium.net.CronetEngine.Builder
        public org.chromium.net.ExperimentalCronetEngine.Builder enableQuic(boolean z) {
            super.enableQuic(z);
            return this;
        }

        @Override // org.chromium.net.CronetEngine.Builder
        public org.chromium.net.ExperimentalCronetEngine.Builder enableHttp2(boolean z) {
            super.enableHttp2(z);
            return this;
        }

        @Override // org.chromium.net.CronetEngine.Builder
        public org.chromium.net.ExperimentalCronetEngine.Builder setQuicOptions(org.chromium.net.QuicOptions quicOptions) {
            super.setQuicOptions(quicOptions);
            return this;
        }

        @Override // org.chromium.net.CronetEngine.Builder
        public org.chromium.net.ExperimentalCronetEngine.Builder setDnsOptions(org.chromium.net.DnsOptions dnsOptions) {
            super.setDnsOptions(dnsOptions);
            return this;
        }

        @Override // org.chromium.net.CronetEngine.Builder
        public org.chromium.net.ExperimentalCronetEngine.Builder setConnectionMigrationOptions(org.chromium.net.ConnectionMigrationOptions connectionMigrationOptions) {
            super.setConnectionMigrationOptions(connectionMigrationOptions);
            return this;
        }

        @Override // org.chromium.net.CronetEngine.Builder
        public org.chromium.net.ExperimentalCronetEngine.Builder enableHttpCache(int i, long j) {
            super.enableHttpCache(i, j);
            return this;
        }

        @Override // org.chromium.net.CronetEngine.Builder
        public org.chromium.net.ExperimentalCronetEngine.Builder addQuicHint(java.lang.String str, int i, int i2) {
            super.addQuicHint(str, i, i2);
            return this;
        }

        @Override // org.chromium.net.CronetEngine.Builder
        public org.chromium.net.ExperimentalCronetEngine.Builder addPublicKeyPins(java.lang.String str, java.util.Set<byte[]> set, boolean z, java.util.Date date) {
            super.addPublicKeyPins(str, set, z, date);
            return this;
        }

        @Override // org.chromium.net.CronetEngine.Builder
        public org.chromium.net.ExperimentalCronetEngine.Builder enablePublicKeyPinningBypassForLocalTrustAnchors(boolean z) {
            super.enablePublicKeyPinningBypassForLocalTrustAnchors(z);
            return this;
        }

        @Override // org.chromium.net.CronetEngine.Builder
        public org.chromium.net.ExperimentalCronetEngine.Builder enableNetworkQualityEstimator(boolean z) {
            super.enableNetworkQualityEstimator(z);
            return this;
        }

        @Override // org.chromium.net.CronetEngine.Builder
        public org.chromium.net.ExperimentalCronetEngine.Builder setThreadPriority(int i) {
            super.setThreadPriority(i);
            return this;
        }

        @Override // org.chromium.net.CronetEngine.Builder
        public org.chromium.net.ExperimentalCronetEngine build() {
            return buildExperimental();
        }
    }

    public java.net.URLConnection openConnection(java.net.URL url, java.net.Proxy proxy) throws java.io.IOException {
        return url.openConnection(proxy);
    }

    public static boolean shouldOverrideWithHttpEngine(android.content.Context context) {
        org.chromium.net.httpflags.ResolvedFlags.Value value = org.chromium.net.HttpFlagsForApi.getHighResolutionOutputSizeshNQ4ISI(context).flags().get(SHOULD_OVERRIDE_WITH_HTTPENGINE);
        return value != null && value.getBoolValue();
    }
}
