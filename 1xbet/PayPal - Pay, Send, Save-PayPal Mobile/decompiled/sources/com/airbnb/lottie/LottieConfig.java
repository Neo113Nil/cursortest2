package com.airbnb.lottie;

/* loaded from: classes7.dex */
public class LottieConfig {
    final com.airbnb.lottie.AsyncUpdates Camera2StreamConfigurationMap;
    final boolean getHighResolutionOutputSizeshNQ4ISI;
    final com.airbnb.lottie.network.LottieNetworkCacheProvider getHighSpeedVideoFpsRanges;
    final boolean getHighSpeedVideoFpsRangesFor;
    final boolean getHighSpeedVideoSizes;
    final com.airbnb.lottie.configurations.reducemotion.ReducedMotionOption getInputFormats;
    final com.airbnb.lottie.network.LottieNetworkFetcher getInputSizeshNQ4ISI;

    /* synthetic */ LottieConfig(com.airbnb.lottie.network.LottieNetworkFetcher lottieNetworkFetcher, com.airbnb.lottie.network.LottieNetworkCacheProvider lottieNetworkCacheProvider, boolean z, boolean z2, boolean z3, com.airbnb.lottie.AsyncUpdates asyncUpdates, com.airbnb.lottie.configurations.reducemotion.ReducedMotionOption reducedMotionOption, byte b) {
        this(lottieNetworkFetcher, lottieNetworkCacheProvider, z, z2, z3, asyncUpdates, reducedMotionOption);
    }

    private LottieConfig(com.airbnb.lottie.network.LottieNetworkFetcher lottieNetworkFetcher, com.airbnb.lottie.network.LottieNetworkCacheProvider lottieNetworkCacheProvider, boolean z, boolean z2, boolean z3, com.airbnb.lottie.AsyncUpdates asyncUpdates, com.airbnb.lottie.configurations.reducemotion.ReducedMotionOption reducedMotionOption) {
        this.getInputSizeshNQ4ISI = lottieNetworkFetcher;
        this.getHighSpeedVideoFpsRanges = lottieNetworkCacheProvider;
        this.getHighSpeedVideoFpsRangesFor = z;
        this.getHighResolutionOutputSizeshNQ4ISI = z2;
        this.getHighSpeedVideoSizes = z3;
        this.Camera2StreamConfigurationMap = asyncUpdates;
        this.getInputFormats = reducedMotionOption;
    }

    public static final class Builder {
        private com.airbnb.lottie.network.LottieNetworkCacheProvider Camera2StreamConfigurationMap;
        private com.airbnb.lottie.network.LottieNetworkFetcher getOutputFormats;
        private boolean getHighSpeedVideoFpsRanges = false;
        private boolean getHighSpeedVideoFpsRangesFor = true;
        private boolean getHighResolutionOutputSizeshNQ4ISI = false;
        private com.airbnb.lottie.AsyncUpdates getHighSpeedVideoSizes = com.airbnb.lottie.AsyncUpdates.AUTOMATIC;
        private com.airbnb.lottie.configurations.reducemotion.ReducedMotionOption getInputSizeshNQ4ISI = new com.airbnb.lottie.configurations.reducemotion.SystemReducedMotionOption();

        public final com.airbnb.lottie.LottieConfig.Builder setNetworkFetcher(com.airbnb.lottie.network.LottieNetworkFetcher lottieNetworkFetcher) {
            this.getOutputFormats = lottieNetworkFetcher;
            return this;
        }

        public final com.airbnb.lottie.LottieConfig.Builder setNetworkCacheDir(final java.io.File file) {
            if (this.Camera2StreamConfigurationMap != null) {
                throw new java.lang.IllegalStateException("There is already a cache provider!");
            }
            this.Camera2StreamConfigurationMap = new com.airbnb.lottie.network.LottieNetworkCacheProvider() { // from class: com.airbnb.lottie.LottieConfig.Builder.1
                @Override // com.airbnb.lottie.network.LottieNetworkCacheProvider
                public java.io.File getCacheDir() {
                    if (!file.isDirectory()) {
                        throw new java.lang.IllegalArgumentException("cache file must be a directory");
                    }
                    return file;
                }
            };
            return this;
        }

        public final com.airbnb.lottie.LottieConfig.Builder setNetworkCacheProvider(final com.airbnb.lottie.network.LottieNetworkCacheProvider lottieNetworkCacheProvider) {
            if (this.Camera2StreamConfigurationMap != null) {
                throw new java.lang.IllegalStateException("There is already a cache provider!");
            }
            this.Camera2StreamConfigurationMap = new com.airbnb.lottie.network.LottieNetworkCacheProvider() { // from class: com.airbnb.lottie.LottieConfig.Builder.2
                @Override // com.airbnb.lottie.network.LottieNetworkCacheProvider
                public java.io.File getCacheDir() {
                    java.io.File cacheDir = lottieNetworkCacheProvider.getCacheDir();
                    if (cacheDir.isDirectory()) {
                        return cacheDir;
                    }
                    throw new java.lang.IllegalArgumentException("cache file must be a directory");
                }
            };
            return this;
        }

        public final com.airbnb.lottie.LottieConfig.Builder setEnableSystraceMarkers(boolean z) {
            this.getHighSpeedVideoFpsRanges = z;
            return this;
        }

        public final com.airbnb.lottie.LottieConfig.Builder setEnableNetworkCache(boolean z) {
            this.getHighSpeedVideoFpsRangesFor = z;
            return this;
        }

        public final com.airbnb.lottie.LottieConfig.Builder setDisablePathInterpolatorCache(boolean z) {
            this.getHighResolutionOutputSizeshNQ4ISI = z;
            return this;
        }

        public final com.airbnb.lottie.LottieConfig.Builder setDefaultAsyncUpdates(com.airbnb.lottie.AsyncUpdates asyncUpdates) {
            this.getHighSpeedVideoSizes = asyncUpdates;
            return this;
        }

        public final com.airbnb.lottie.LottieConfig.Builder setReducedMotionOption(com.airbnb.lottie.configurations.reducemotion.ReducedMotionOption reducedMotionOption) {
            this.getInputSizeshNQ4ISI = reducedMotionOption;
            return this;
        }

        public final com.airbnb.lottie.LottieConfig build() {
            return new com.airbnb.lottie.LottieConfig(this.getOutputFormats, this.Camera2StreamConfigurationMap, this.getHighSpeedVideoFpsRanges, this.getHighSpeedVideoFpsRangesFor, this.getHighResolutionOutputSizeshNQ4ISI, this.getHighSpeedVideoSizes, this.getInputSizeshNQ4ISI, (byte) 0);
        }
    }
}
