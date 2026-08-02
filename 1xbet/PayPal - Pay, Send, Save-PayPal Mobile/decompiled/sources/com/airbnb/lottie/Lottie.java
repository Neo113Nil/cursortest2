package com.airbnb.lottie;

/* loaded from: classes7.dex */
public class Lottie {
    private Lottie() {
    }

    public static void initialize(com.airbnb.lottie.LottieConfig lottieConfig) {
        com.airbnb.lottie.L.setFetcher(lottieConfig.getInputSizeshNQ4ISI);
        com.airbnb.lottie.L.setCacheProvider(lottieConfig.getHighSpeedVideoFpsRanges);
        com.airbnb.lottie.L.setTraceEnabled(lottieConfig.getHighSpeedVideoFpsRangesFor);
        com.airbnb.lottie.L.setNetworkCacheEnabled(lottieConfig.getHighResolutionOutputSizeshNQ4ISI);
        com.airbnb.lottie.L.setDisablePathInterpolatorCache(lottieConfig.getHighSpeedVideoSizes);
        com.airbnb.lottie.L.setDefaultAsyncUpdates(lottieConfig.Camera2StreamConfigurationMap);
        com.airbnb.lottie.L.setReducedMotionOption(lottieConfig.getInputFormats);
    }
}
