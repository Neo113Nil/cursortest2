package com.google.android.material.color.utilities;

/* loaded from: classes8.dex */
public final class DislikeAnalyzer {
    private DislikeAnalyzer() {
        throw new java.lang.UnsupportedOperationException();
    }

    public static boolean isDisliked(com.google.android.material.color.utilities.Hct hct) {
        return ((((double) java.lang.Math.round(hct.getHue())) > 90.0d ? 1 : (((double) java.lang.Math.round(hct.getHue())) == 90.0d ? 0 : -1)) >= 0 && (((double) java.lang.Math.round(hct.getHue())) > 111.0d ? 1 : (((double) java.lang.Math.round(hct.getHue())) == 111.0d ? 0 : -1)) <= 0) && ((((double) java.lang.Math.round(hct.getChroma())) > 16.0d ? 1 : (((double) java.lang.Math.round(hct.getChroma())) == 16.0d ? 0 : -1)) > 0) && ((((double) java.lang.Math.round(hct.getTone())) > 65.0d ? 1 : (((double) java.lang.Math.round(hct.getTone())) == 65.0d ? 0 : -1)) < 0);
    }

    public static com.google.android.material.color.utilities.Hct fixIfDisliked(com.google.android.material.color.utilities.Hct hct) {
        return isDisliked(hct) ? com.google.android.material.color.utilities.Hct.from(hct.getHue(), hct.getChroma(), 70.0d) : hct;
    }
}
