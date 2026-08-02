package org.chromium.net;

/* loaded from: classes5.dex */
public abstract class CronetEngine {
    public static final int ACTIVE_REQUEST_COUNT_UNKNOWN = -1;
    public static final int CONNECTION_METRIC_UNKNOWN = -1;
    public static final int EFFECTIVE_CONNECTION_TYPE_2G = 3;
    public static final int EFFECTIVE_CONNECTION_TYPE_3G = 4;
    public static final int EFFECTIVE_CONNECTION_TYPE_4G = 5;
    public static final int EFFECTIVE_CONNECTION_TYPE_OFFLINE = 1;
    public static final int EFFECTIVE_CONNECTION_TYPE_SLOW_2G = 2;
    public static final int EFFECTIVE_CONNECTION_TYPE_UNKNOWN = 0;
    private static final java.lang.String TAG = "CronetEngine";
    public static final long UNBIND_NETWORK_HANDLE = -1;

    public void addRequestFinishedListener(org.chromium.net.RequestFinishedInfo.Listener listener) {
    }

    public void addRttListener(org.chromium.net.NetworkQualityRttListener networkQualityRttListener) {
    }

    public void addThroughputListener(org.chromium.net.NetworkQualityThroughputListener networkQualityThroughputListener) {
    }

    public void bindToNetwork(long j) {
    }

    public void configureNetworkQualityEstimatorForTesting(boolean z, boolean z2, boolean z3) {
    }

    public abstract java.net.URLStreamHandlerFactory createURLStreamHandlerFactory();

    public int getActiveRequestCount() {
        return -1;
    }

    public int getDownstreamThroughputKbps() {
        return -1;
    }

    public int getEffectiveConnectionType() {
        return 0;
    }

    @java.lang.Deprecated
    public abstract byte[] getGlobalMetricsDeltas();

    public int getHttpRttMs() {
        return -1;
    }

    public int getTransportRttMs() {
        return -1;
    }

    public abstract java.lang.String getVersionString();

    public abstract org.chromium.net.UrlRequest.Builder newUrlRequestBuilder(java.lang.String str, org.chromium.net.UrlRequest.Callback callback, java.util.concurrent.Executor executor);

    public abstract java.net.URLConnection openConnection(java.net.URL url) throws java.io.IOException;

    public void removeRequestFinishedListener(org.chromium.net.RequestFinishedInfo.Listener listener) {
    }

    public void removeRttListener(org.chromium.net.NetworkQualityRttListener networkQualityRttListener) {
    }

    public void removeThroughputListener(org.chromium.net.NetworkQualityThroughputListener networkQualityThroughputListener) {
    }

    public abstract void shutdown();

    public void startNetLogToDisk(java.lang.String str, boolean z, int i) {
    }

    public abstract void startNetLogToFile(java.lang.String str, boolean z);

    public abstract void stopNetLog();

    public static class Builder {
        public static final int HTTP_CACHE_DISABLED = 0;
        public static final int HTTP_CACHE_DISK = 3;
        public static final int HTTP_CACHE_DISK_NO_HTTP = 2;
        public static final int HTTP_CACHE_IN_MEMORY = 1;
        private static final java.lang.String TAG = "CronetEngine.Builder";
        protected final org.chromium.net.ICronetEngineBuilder mBuilderDelegate;
        private final java.util.List<org.chromium.net.ExperimentalOptionsTranslator.JsonPatch> mExperimentalOptionsPatches;
        protected org.json.JSONObject mParsedExperimentalOptions;

        /* loaded from: classes18.dex */
        public static abstract class LibraryLoader {
            public abstract void loadLibrary(java.lang.String str);
        }

        @java.lang.Deprecated
        public org.chromium.net.CronetEngine.Builder enableSdch(boolean z) {
            return this;
        }

        public Builder(android.content.Context context) {
            this(createBuilderDelegate(context));
        }

        public Builder(org.chromium.net.ICronetEngineBuilder iCronetEngineBuilder) {
            this.mExperimentalOptionsPatches = new java.util.ArrayList();
            this.mBuilderDelegate = iCronetEngineBuilder;
        }

        public java.lang.String getDefaultUserAgent() {
            return this.mBuilderDelegate.getDefaultUserAgent();
        }

        public org.chromium.net.CronetEngine.Builder setUserAgent(java.lang.String str) {
            this.mBuilderDelegate.setUserAgent(str);
            return this;
        }

        public org.chromium.net.CronetEngine.Builder setStoragePath(java.lang.String str) {
            this.mBuilderDelegate.setStoragePath(str);
            return this;
        }

        public org.chromium.net.CronetEngine.Builder setLibraryLoader(org.chromium.net.CronetEngine.Builder.LibraryLoader libraryLoader) {
            this.mBuilderDelegate.setLibraryLoader(libraryLoader);
            return this;
        }

        public org.chromium.net.CronetEngine.Builder enableQuic(boolean z) {
            this.mBuilderDelegate.enableQuic(z);
            return this;
        }

        public org.chromium.net.CronetEngine.Builder enableHttp2(boolean z) {
            this.mBuilderDelegate.enableHttp2(z);
            return this;
        }

        public org.chromium.net.CronetEngine.Builder enableBrotli(boolean z) {
            this.mBuilderDelegate.enableBrotli(z);
            return this;
        }

        public org.chromium.net.CronetEngine.Builder enableHttpCache(int i, long j) {
            this.mBuilderDelegate.enableHttpCache(i, j);
            return this;
        }

        public org.chromium.net.CronetEngine.Builder addQuicHint(java.lang.String str, int i, int i2) {
            this.mBuilderDelegate.addQuicHint(str, i, i2);
            return this;
        }

        public org.chromium.net.CronetEngine.Builder addPublicKeyPins(java.lang.String str, java.util.Set<byte[]> set, boolean z, java.util.Date date) {
            this.mBuilderDelegate.addPublicKeyPins(str, set, z, date);
            return this;
        }

        public org.chromium.net.CronetEngine.Builder enablePublicKeyPinningBypassForLocalTrustAnchors(boolean z) {
            this.mBuilderDelegate.enablePublicKeyPinningBypassForLocalTrustAnchors(z);
            return this;
        }

        @java.lang.Deprecated
        public org.chromium.net.CronetEngine.Builder setThreadPriority(int i) {
            this.mBuilderDelegate.setThreadPriority(i);
            return this;
        }

        public org.chromium.net.CronetEngine.Builder enableNetworkQualityEstimator(boolean z) {
            this.mBuilderDelegate.enableNetworkQualityEstimator(z);
            return this;
        }

        public org.chromium.net.CronetEngine.Builder setQuicOptions(final org.chromium.net.QuicOptions quicOptions) {
            if (this.mBuilderDelegate.getSupportedConfigOptions().contains(3)) {
                this.mBuilderDelegate.setQuicOptions(quicOptions);
                return this;
            }
            this.mExperimentalOptionsPatches.add(new org.chromium.net.ExperimentalOptionsTranslator.JsonPatch() { // from class: org.chromium.net.CronetEngine$Builder$$ExternalSyntheticLambda0
                @Override // org.chromium.net.ExperimentalOptionsTranslator.JsonPatch
                public final void applyTo(org.json.JSONObject jSONObject) {
                    org.chromium.net.ExperimentalOptionsTranslator.getHighSpeedVideoFpsRanges(jSONObject, org.chromium.net.QuicOptions.this);
                }
            });
            return this;
        }

        public org.chromium.net.CronetEngine.Builder setQuicOptions(org.chromium.net.QuicOptions.Builder builder) {
            return setQuicOptions(builder.build());
        }

        public org.chromium.net.CronetEngine.Builder setDnsOptions(final org.chromium.net.DnsOptions dnsOptions) {
            if (this.mBuilderDelegate.getSupportedConfigOptions().contains(2)) {
                this.mBuilderDelegate.setDnsOptions(dnsOptions);
                return this;
            }
            this.mExperimentalOptionsPatches.add(new org.chromium.net.ExperimentalOptionsTranslator.JsonPatch() { // from class: org.chromium.net.CronetEngine$Builder$$ExternalSyntheticLambda2
                @Override // org.chromium.net.ExperimentalOptionsTranslator.JsonPatch
                public final void applyTo(org.json.JSONObject jSONObject) {
                    org.chromium.net.ExperimentalOptionsTranslator.getHighSpeedVideoFpsRangesFor(jSONObject, org.chromium.net.DnsOptions.this);
                }
            });
            return this;
        }

        public org.chromium.net.CronetEngine.Builder setDnsOptions(org.chromium.net.DnsOptions.Builder builder) {
            return setDnsOptions(builder.build());
        }

        public org.chromium.net.CronetEngine.Builder setConnectionMigrationOptions(final org.chromium.net.ConnectionMigrationOptions connectionMigrationOptions) {
            if (this.mBuilderDelegate.getSupportedConfigOptions().contains(1)) {
                this.mBuilderDelegate.setConnectionMigrationOptions(connectionMigrationOptions);
                return this;
            }
            this.mExperimentalOptionsPatches.add(new org.chromium.net.ExperimentalOptionsTranslator.JsonPatch() { // from class: org.chromium.net.CronetEngine$Builder$$ExternalSyntheticLambda1
                @Override // org.chromium.net.ExperimentalOptionsTranslator.JsonPatch
                public final void applyTo(org.json.JSONObject jSONObject) {
                    org.chromium.net.ExperimentalOptionsTranslator.getHighSpeedVideoSizes(jSONObject, org.chromium.net.ConnectionMigrationOptions.this);
                }
            });
            return this;
        }

        public org.chromium.net.CronetEngine.Builder setConnectionMigrationOptions(org.chromium.net.ConnectionMigrationOptions.Builder builder) {
            return setConnectionMigrationOptions(builder.build());
        }

        public org.chromium.net.CronetEngine.Builder setProxyOptions(org.chromium.net.ProxyOptions proxyOptions) {
            if (!this.mBuilderDelegate.getSupportedConfigOptions().contains(4)) {
                throw new java.lang.UnsupportedOperationException("This Cronet implementation does not support ProxyOptions");
            }
            this.mBuilderDelegate.setProxyOptions(proxyOptions);
            return this;
        }

        protected org.chromium.net.ExperimentalCronetEngine buildExperimental() {
            if (getImplApiLevel(this.mBuilderDelegate) != -1) {
                getMaximumApiLevel();
            }
            maybeSetExperimentalOptions();
            return this.mBuilderDelegate.build();
        }

        private void maybeSetExperimentalOptions() {
            org.json.JSONObject highSpeedVideoFpsRangesFor = org.chromium.net.ExperimentalOptionsTranslator.getHighSpeedVideoFpsRangesFor(this.mParsedExperimentalOptions, this.mExperimentalOptionsPatches);
            if (highSpeedVideoFpsRangesFor != null) {
                this.mBuilderDelegate.setExperimentalOptions(highSpeedVideoFpsRangesFor.toString());
            }
        }

        public org.chromium.net.CronetEngine build() {
            return buildExperimental();
        }

        private static org.chromium.net.ICronetEngineBuilder createBuilderDelegate(android.content.Context context) {
            org.chromium.base.metrics.ScopedSysTraceEvent scoped = org.chromium.base.metrics.ScopedSysTraceEvent.scoped("CronetEngine#createBuilderDelegate");
            try {
                long uptimeMillis = android.os.SystemClock.uptimeMillis();
                org.chromium.net.CronetProvider.ProviderInfo providerInfo = getEnabledCronetProviders(context, new java.util.ArrayList(org.chromium.net.CronetProvider.getAllProviderInfos(context))).get(0);
                org.chromium.net.impl.CronetLogger createLogger = org.chromium.net.impl.CronetLoggerFactory.createLogger(context, providerInfo.getHighResolutionOutputSizeshNQ4ISI);
                org.chromium.net.impl.CronetLogger.CronetEngineBuilderInitializedInfo cronetEngineBuilderInitializedInfo = new org.chromium.net.impl.CronetLogger.CronetEngineBuilderInitializedInfo();
                try {
                    cronetEngineBuilderInitializedInfo.creationSuccessful = java.lang.Boolean.FALSE;
                    cronetEngineBuilderInitializedInfo.author = org.chromium.net.impl.CronetLogger.CronetEngineBuilderInitializedInfo.Author.API;
                    cronetEngineBuilderInitializedInfo.source = providerInfo.getHighResolutionOutputSizeshNQ4ISI;
                    cronetEngineBuilderInitializedInfo.uid = android.os.Process.myUid();
                    cronetEngineBuilderInitializedInfo.apiVersion = new org.chromium.net.impl.CronetLogger.CronetVersion(org.chromium.net.ApiVersion.getCronetVersion());
                    if (android.util.Log.isLoggable(TAG, 3)) {
                        new java.lang.Object[]{providerInfo.getHighSpeedVideoSizes};
                    }
                    org.chromium.net.ICronetEngineBuilder iCronetEngineBuilder = providerInfo.getHighSpeedVideoSizes.createBuilder().mBuilderDelegate;
                    java.lang.String implCronetVersion = getImplCronetVersion(iCronetEngineBuilder);
                    if (implCronetVersion != null) {
                        cronetEngineBuilderInitializedInfo.implVersion = new org.chromium.net.impl.CronetLogger.CronetVersion(implCronetVersion);
                    }
                    cronetEngineBuilderInitializedInfo.cronetInitializationRef = iCronetEngineBuilder.getLogCronetInitializationRef();
                    cronetEngineBuilderInitializedInfo.creationSuccessful = java.lang.Boolean.TRUE;
                    if (scoped != null) {
                        scoped.close();
                    }
                    return iCronetEngineBuilder;
                } finally {
                    cronetEngineBuilderInitializedInfo.engineBuilderCreatedLatencyMillis = (int) (android.os.SystemClock.uptimeMillis() - uptimeMillis);
                    createLogger.logCronetEngineBuilderInitializedInfo(cronetEngineBuilderInitializedInfo);
                }
            } catch (java.lang.Throwable th) {
                if (scoped != null) {
                    try {
                        scoped.close();
                    } catch (java.lang.Throwable th2) {
                        th.addSuppressed(th2);
                    }
                }
                throw th;
            }
        }

        static java.util.List<org.chromium.net.CronetProvider.ProviderInfo> getEnabledCronetProviders(android.content.Context context, java.util.List<org.chromium.net.CronetProvider.ProviderInfo> list) {
            if (list.isEmpty()) {
                throw new java.lang.RuntimeException("Unable to find any Cronet provider. Have you included all necessary jars?");
            }
            java.util.Iterator<org.chromium.net.CronetProvider.ProviderInfo> it = list.iterator();
            while (it.hasNext()) {
                if (!it.next().getHighSpeedVideoSizes.isEnabled()) {
                    it.remove();
                }
            }
            if (list.isEmpty()) {
                throw new java.lang.RuntimeException("All available Cronet providers are disabled. A provider should be enabled before it can be used.");
            }
            java.util.Collections.sort(list, new java.util.Comparator<org.chromium.net.CronetProvider.ProviderInfo>() { // from class: org.chromium.net.CronetEngine.Builder.1
                @Override // java.util.Comparator
                public /* synthetic */ int compare(org.chromium.net.CronetProvider.ProviderInfo providerInfo, org.chromium.net.CronetProvider.ProviderInfo providerInfo2) {
                    org.chromium.net.CronetProvider.ProviderInfo providerInfo3 = providerInfo;
                    org.chromium.net.CronetProvider.ProviderInfo providerInfo4 = providerInfo2;
                    if (org.chromium.net.CronetProvider.PROVIDER_NAME_FALLBACK.equals(providerInfo3.getHighSpeedVideoSizes.getName())) {
                        return 1;
                    }
                    if (org.chromium.net.CronetProvider.PROVIDER_NAME_FALLBACK.equals(providerInfo4.getHighSpeedVideoSizes.getName())) {
                        return -1;
                    }
                    return -org.chromium.net.CronetEngine.Builder.compareVersions(providerInfo3.getHighSpeedVideoSizes.getVersion(), providerInfo4.getHighSpeedVideoSizes.getVersion());
                }
            });
            return list;
        }

        static int compareVersions(java.lang.String str, java.lang.String str2) {
            if (str == null || str2 == null) {
                throw new java.lang.IllegalArgumentException("The input values cannot be null");
            }
            java.lang.String[] split = str.split("\\.");
            java.lang.String[] split2 = str2.split("\\.");
            for (int i = 0; i < split.length && i < split2.length; i++) {
                try {
                    int parseInt = java.lang.Integer.parseInt(split[i]);
                    int parseInt2 = java.lang.Integer.parseInt(split2[i]);
                    if (parseInt != parseInt2) {
                        return java.lang.Integer.signum(parseInt - parseInt2);
                    }
                } catch (java.lang.NumberFormatException e) {
                    java.lang.String str3 = split[i];
                    java.lang.String str4 = split2[i];
                    java.lang.StringBuilder sb = new java.lang.StringBuilder("Unable to convert version segments into integers: ");
                    sb.append(str3);
                    sb.append(" & ");
                    sb.append(str4);
                    throw new java.lang.IllegalArgumentException(sb.toString(), e);
                }
            }
            return java.lang.Integer.signum(split.length - split2.length);
        }

        private int getMaximumApiLevel() {
            return org.chromium.net.ApiVersion.getMaximumAvailableApiLevel();
        }

        private static java.lang.reflect.Method getImplVersionMethod(org.chromium.net.ICronetEngineBuilder iCronetEngineBuilder, java.lang.String str) {
            try {
                return iCronetEngineBuilder.getClass().getClassLoader().loadClass("org.chromium.net.impl.ImplVersion").getMethod(str, new java.lang.Class[0]);
            } catch (java.lang.ClassNotFoundException | java.lang.NoSuchMethodException unused) {
                return null;
            }
        }

        private static int getImplApiLevel(org.chromium.net.ICronetEngineBuilder iCronetEngineBuilder) {
            try {
                java.lang.reflect.Method implVersionMethod = getImplVersionMethod(iCronetEngineBuilder, "getApiLevel");
                if (implVersionMethod == null) {
                    return -1;
                }
                return ((java.lang.Integer) implVersionMethod.invoke(null, new java.lang.Object[0])).intValue();
            } catch (java.lang.ReflectiveOperationException e) {
                throw new java.lang.RuntimeException("Failed to retrieve Cronet impl API level", e);
            }
        }

        private static java.lang.String getImplCronetVersion(org.chromium.net.ICronetEngineBuilder iCronetEngineBuilder) {
            try {
                java.lang.reflect.Method implVersionMethod = getImplVersionMethod(iCronetEngineBuilder, "getCronetVersion");
                if (implVersionMethod == null) {
                    return null;
                }
                return (java.lang.String) implVersionMethod.invoke(null, new java.lang.Object[0]);
            } catch (java.lang.ReflectiveOperationException e) {
                throw new java.lang.RuntimeException("Failed to retrieve Cronet impl version", e);
            }
        }
    }

    public org.chromium.net.BidirectionalStream.Builder newBidirectionalStreamBuilder(java.lang.String str, org.chromium.net.BidirectionalStream.Callback callback, java.util.concurrent.Executor executor) {
        throw new java.lang.UnsupportedOperationException("Not implemented.");
    }
}
