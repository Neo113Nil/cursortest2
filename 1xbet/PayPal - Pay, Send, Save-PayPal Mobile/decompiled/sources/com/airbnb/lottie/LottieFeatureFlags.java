package com.airbnb.lottie;

/* loaded from: classes7.dex */
class LottieFeatureFlags {
    final java.util.HashSet<com.airbnb.lottie.LottieFeatureFlag> getHighSpeedVideoFpsRanges = new java.util.HashSet<>();

    LottieFeatureFlags() {
    }

    public final boolean Camera2StreamConfigurationMap(com.airbnb.lottie.LottieFeatureFlag lottieFeatureFlag, boolean z) {
        if (z) {
            if (android.os.Build.VERSION.SDK_INT < lottieFeatureFlag.minRequiredSdkVersion) {
                com.airbnb.lottie.utils.Logger.warning(java.lang.String.format("%s is not supported pre SDK %d", lottieFeatureFlag.name(), java.lang.Integer.valueOf(lottieFeatureFlag.minRequiredSdkVersion)));
                return false;
            }
            return this.getHighSpeedVideoFpsRanges.add(lottieFeatureFlag);
        }
        return this.getHighSpeedVideoFpsRanges.remove(lottieFeatureFlag);
    }
}
