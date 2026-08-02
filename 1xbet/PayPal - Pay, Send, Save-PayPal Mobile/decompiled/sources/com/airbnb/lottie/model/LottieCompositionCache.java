package com.airbnb.lottie.model;

/* loaded from: classes7.dex */
public class LottieCompositionCache {
    private static final com.airbnb.lottie.model.LottieCompositionCache getHighSpeedVideoFpsRangesFor = new com.airbnb.lottie.model.LottieCompositionCache();
    private final androidx.collection.LruCache<java.lang.String, com.airbnb.lottie.LottieComposition> getHighResolutionOutputSizeshNQ4ISI = new androidx.collection.LruCache<>(20);

    public static com.airbnb.lottie.model.LottieCompositionCache getInstance() {
        return getHighSpeedVideoFpsRangesFor;
    }

    LottieCompositionCache() {
    }

    public com.airbnb.lottie.LottieComposition get(java.lang.String str) {
        if (str == null) {
            return null;
        }
        return this.getHighResolutionOutputSizeshNQ4ISI.get(str);
    }

    public void put(java.lang.String str, com.airbnb.lottie.LottieComposition lottieComposition) {
        if (str == null) {
            return;
        }
        this.getHighResolutionOutputSizeshNQ4ISI.put(str, lottieComposition);
    }

    public void clear() {
        this.getHighResolutionOutputSizeshNQ4ISI.evictAll();
    }

    public void resize(int i) {
        this.getHighResolutionOutputSizeshNQ4ISI.resize(i);
    }
}
