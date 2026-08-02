package com.airbnb.lottie;

/* loaded from: classes7.dex */
public class L {
    private static java.lang.ThreadLocal<com.airbnb.lottie.utils.LottieTrace> Camera2StreamConfigurationMap = null;
    public static boolean DBG = false;
    public static final java.lang.String TAG = "LOTTIE";
    private static com.airbnb.lottie.network.LottieNetworkCacheProvider getHighResolutionOutputSizeshNQ4ISI = null;
    private static com.airbnb.lottie.network.LottieNetworkFetcher getHighSpeedVideoFpsRangesFor = null;
    private static boolean getHighSpeedVideoSizes = false;
    private static volatile com.airbnb.lottie.network.NetworkCache getHighSpeedVideoSizesFor = null;
    private static boolean getInputSizeshNQ4ISI = false;
    private static volatile com.airbnb.lottie.network.NetworkFetcher getOutputFormats = null;
    private static boolean getOutputMinFrameDuration = true;
    private static com.airbnb.lottie.AsyncUpdates getHighSpeedVideoFpsRanges = com.airbnb.lottie.AsyncUpdates.AUTOMATIC;
    private static com.airbnb.lottie.configurations.reducemotion.ReducedMotionOption getInputFormats = new com.airbnb.lottie.configurations.reducemotion.SystemReducedMotionOption();

    private L() {
    }

    public static void setTraceEnabled(boolean z) {
        if (getInputSizeshNQ4ISI != z) {
            getInputSizeshNQ4ISI = z;
            if (z && Camera2StreamConfigurationMap == null) {
                Camera2StreamConfigurationMap = new java.lang.ThreadLocal<>();
            }
        }
    }

    public static boolean isTraceEnabled() {
        return getInputSizeshNQ4ISI;
    }

    public static void setNetworkCacheEnabled(boolean z) {
        getOutputMinFrameDuration = z;
    }

    public static void beginSection(java.lang.String str) {
        if (getInputSizeshNQ4ISI) {
            Camera2StreamConfigurationMap().beginSection(str);
        }
    }

    public static float endSection(java.lang.String str) {
        if (getInputSizeshNQ4ISI) {
            return Camera2StreamConfigurationMap().endSection(str);
        }
        return 0.0f;
    }

    private static com.airbnb.lottie.utils.LottieTrace Camera2StreamConfigurationMap() {
        com.airbnb.lottie.utils.LottieTrace lottieTrace = Camera2StreamConfigurationMap.get();
        if (lottieTrace != null) {
            return lottieTrace;
        }
        com.airbnb.lottie.utils.LottieTrace lottieTrace2 = new com.airbnb.lottie.utils.LottieTrace();
        Camera2StreamConfigurationMap.set(lottieTrace2);
        return lottieTrace2;
    }

    public static void setFetcher(com.airbnb.lottie.network.LottieNetworkFetcher lottieNetworkFetcher) {
        com.airbnb.lottie.network.LottieNetworkFetcher lottieNetworkFetcher2 = getHighSpeedVideoFpsRangesFor;
        if (lottieNetworkFetcher2 == null && lottieNetworkFetcher == null) {
            return;
        }
        if (lottieNetworkFetcher2 == null || !lottieNetworkFetcher2.equals(lottieNetworkFetcher)) {
            getHighSpeedVideoFpsRangesFor = lottieNetworkFetcher;
            getOutputFormats = null;
        }
    }

    public static void setCacheProvider(com.airbnb.lottie.network.LottieNetworkCacheProvider lottieNetworkCacheProvider) {
        com.airbnb.lottie.network.LottieNetworkCacheProvider lottieNetworkCacheProvider2 = getHighResolutionOutputSizeshNQ4ISI;
        if (lottieNetworkCacheProvider2 == null && lottieNetworkCacheProvider == null) {
            return;
        }
        if (lottieNetworkCacheProvider2 == null || !lottieNetworkCacheProvider2.equals(lottieNetworkCacheProvider)) {
            getHighResolutionOutputSizeshNQ4ISI = lottieNetworkCacheProvider;
            getHighSpeedVideoSizesFor = null;
        }
    }

    public static com.airbnb.lottie.network.NetworkFetcher networkFetcher(android.content.Context context) {
        com.airbnb.lottie.network.NetworkFetcher networkFetcher;
        com.airbnb.lottie.network.NetworkFetcher networkFetcher2 = getOutputFormats;
        if (networkFetcher2 != null) {
            return networkFetcher2;
        }
        synchronized (com.airbnb.lottie.network.NetworkFetcher.class) {
            networkFetcher = getOutputFormats;
            if (networkFetcher == null) {
                com.airbnb.lottie.network.NetworkCache networkCache = networkCache(context);
                com.airbnb.lottie.network.LottieNetworkFetcher lottieNetworkFetcher = getHighSpeedVideoFpsRangesFor;
                if (lottieNetworkFetcher == null) {
                    lottieNetworkFetcher = new com.airbnb.lottie.network.DefaultLottieNetworkFetcher();
                }
                networkFetcher = new com.airbnb.lottie.network.NetworkFetcher(networkCache, lottieNetworkFetcher);
                getOutputFormats = networkFetcher;
            }
        }
        return networkFetcher;
    }

    public static com.airbnb.lottie.network.NetworkCache networkCache(android.content.Context context) {
        com.airbnb.lottie.network.NetworkCache networkCache;
        if (!getOutputMinFrameDuration) {
            return null;
        }
        final android.content.Context applicationContext = context.getApplicationContext();
        com.airbnb.lottie.network.NetworkCache networkCache2 = getHighSpeedVideoSizesFor;
        if (networkCache2 != null) {
            return networkCache2;
        }
        synchronized (com.airbnb.lottie.network.NetworkCache.class) {
            networkCache = getHighSpeedVideoSizesFor;
            if (networkCache == null) {
                com.airbnb.lottie.network.LottieNetworkCacheProvider lottieNetworkCacheProvider = getHighResolutionOutputSizeshNQ4ISI;
                if (lottieNetworkCacheProvider == null) {
                    lottieNetworkCacheProvider = new com.airbnb.lottie.network.LottieNetworkCacheProvider() { // from class: com.airbnb.lottie.L$$ExternalSyntheticLambda0
                        @Override // com.airbnb.lottie.network.LottieNetworkCacheProvider
                        public final java.io.File getCacheDir() {
                            return com.airbnb.lottie.L.getHighSpeedVideoSizes(applicationContext);
                        }
                    };
                }
                networkCache = new com.airbnb.lottie.network.NetworkCache(lottieNetworkCacheProvider);
                getHighSpeedVideoSizesFor = networkCache;
            }
        }
        return networkCache;
    }

    static /* synthetic */ java.io.File getHighSpeedVideoSizes(android.content.Context context) {
        return new java.io.File(context.getCacheDir(), "lottie_network_cache");
    }

    public static void setDisablePathInterpolatorCache(boolean z) {
        getHighSpeedVideoSizes = z;
    }

    public static boolean getDisablePathInterpolatorCache() {
        return getHighSpeedVideoSizes;
    }

    public static void setDefaultAsyncUpdates(com.airbnb.lottie.AsyncUpdates asyncUpdates) {
        getHighSpeedVideoFpsRanges = asyncUpdates;
    }

    public static com.airbnb.lottie.AsyncUpdates getDefaultAsyncUpdates() {
        return getHighSpeedVideoFpsRanges;
    }

    public static void setReducedMotionOption(com.airbnb.lottie.configurations.reducemotion.ReducedMotionOption reducedMotionOption) {
        getInputFormats = reducedMotionOption;
    }

    public static com.airbnb.lottie.configurations.reducemotion.ReducedMotionOption getReducedMotionOption() {
        return getInputFormats;
    }
}
