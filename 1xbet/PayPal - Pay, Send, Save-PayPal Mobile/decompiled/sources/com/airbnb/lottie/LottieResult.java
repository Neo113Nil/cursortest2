package com.airbnb.lottie;

/* loaded from: classes7.dex */
public final class LottieResult<V> {
    private final V getHighResolutionOutputSizeshNQ4ISI;
    private final java.lang.Throwable getHighSpeedVideoSizes;

    public LottieResult(V v) {
        this.getHighResolutionOutputSizeshNQ4ISI = v;
        this.getHighSpeedVideoSizes = null;
    }

    public LottieResult(java.lang.Throwable th) {
        this.getHighSpeedVideoSizes = th;
        this.getHighResolutionOutputSizeshNQ4ISI = null;
    }

    public final V getValue() {
        return this.getHighResolutionOutputSizeshNQ4ISI;
    }

    public final java.lang.Throwable getException() {
        return this.getHighSpeedVideoSizes;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.airbnb.lottie.LottieResult)) {
            return false;
        }
        com.airbnb.lottie.LottieResult lottieResult = (com.airbnb.lottie.LottieResult) obj;
        if (getValue() != null && getValue().equals(lottieResult.getValue())) {
            return true;
        }
        if (getException() == null || lottieResult.getException() == null) {
            return false;
        }
        return getException().toString().equals(getException().toString());
    }

    public final int hashCode() {
        return java.util.Arrays.hashCode(new java.lang.Object[]{getValue(), getException()});
    }
}
