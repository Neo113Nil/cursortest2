package com.airbnb.lottie;

/* loaded from: classes7.dex */
public class TextDelegate {
    private final com.airbnb.lottie.LottieDrawable getHighResolutionOutputSizeshNQ4ISI;
    private final com.airbnb.lottie.LottieAnimationView getHighSpeedVideoFpsRanges;
    private final java.util.Map<java.lang.String, java.lang.String> getHighSpeedVideoFpsRangesFor;
    private boolean getHighSpeedVideoSizes;

    public java.lang.String getText(java.lang.String str) {
        return str;
    }

    TextDelegate() {
        this.getHighSpeedVideoFpsRangesFor = new java.util.HashMap();
        this.getHighSpeedVideoSizes = true;
        this.getHighSpeedVideoFpsRanges = null;
        this.getHighResolutionOutputSizeshNQ4ISI = null;
    }

    public TextDelegate(com.airbnb.lottie.LottieAnimationView lottieAnimationView) {
        this.getHighSpeedVideoFpsRangesFor = new java.util.HashMap();
        this.getHighSpeedVideoSizes = true;
        this.getHighSpeedVideoFpsRanges = lottieAnimationView;
        this.getHighResolutionOutputSizeshNQ4ISI = null;
    }

    public TextDelegate(com.airbnb.lottie.LottieDrawable lottieDrawable) {
        this.getHighSpeedVideoFpsRangesFor = new java.util.HashMap();
        this.getHighSpeedVideoSizes = true;
        this.getHighResolutionOutputSizeshNQ4ISI = lottieDrawable;
        this.getHighSpeedVideoFpsRanges = null;
    }

    public java.lang.String getText(java.lang.String str, java.lang.String str2) {
        return getText(str2);
    }

    public void setText(java.lang.String str, java.lang.String str2) {
        this.getHighSpeedVideoFpsRangesFor.put(str, str2);
        com.airbnb.lottie.LottieAnimationView lottieAnimationView = this.getHighSpeedVideoFpsRanges;
        if (lottieAnimationView != null) {
            lottieAnimationView.invalidate();
        }
        com.airbnb.lottie.LottieDrawable lottieDrawable = this.getHighResolutionOutputSizeshNQ4ISI;
        if (lottieDrawable != null) {
            lottieDrawable.invalidateSelf();
        }
    }

    public void setCacheText(boolean z) {
        this.getHighSpeedVideoSizes = z;
    }

    public void invalidateText(java.lang.String str) {
        this.getHighSpeedVideoFpsRangesFor.remove(str);
        com.airbnb.lottie.LottieAnimationView lottieAnimationView = this.getHighSpeedVideoFpsRanges;
        if (lottieAnimationView != null) {
            lottieAnimationView.invalidate();
        }
        com.airbnb.lottie.LottieDrawable lottieDrawable = this.getHighResolutionOutputSizeshNQ4ISI;
        if (lottieDrawable != null) {
            lottieDrawable.invalidateSelf();
        }
    }

    public void invalidateAllText() {
        this.getHighSpeedVideoFpsRangesFor.clear();
        com.airbnb.lottie.LottieAnimationView lottieAnimationView = this.getHighSpeedVideoFpsRanges;
        if (lottieAnimationView != null) {
            lottieAnimationView.invalidate();
        }
        com.airbnb.lottie.LottieDrawable lottieDrawable = this.getHighResolutionOutputSizeshNQ4ISI;
        if (lottieDrawable != null) {
            lottieDrawable.invalidateSelf();
        }
    }

    public final java.lang.String getTextInternal(java.lang.String str, java.lang.String str2) {
        if (this.getHighSpeedVideoSizes && this.getHighSpeedVideoFpsRangesFor.containsKey(str2)) {
            return this.getHighSpeedVideoFpsRangesFor.get(str2);
        }
        java.lang.String text = getText(str, str2);
        if (this.getHighSpeedVideoSizes) {
            this.getHighSpeedVideoFpsRangesFor.put(str2, text);
        }
        return text;
    }
}
