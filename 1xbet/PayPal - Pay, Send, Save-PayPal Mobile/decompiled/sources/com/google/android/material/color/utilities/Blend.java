package com.google.android.material.color.utilities;

/* loaded from: classes8.dex */
public class Blend {
    private Blend() {
    }

    public static int harmonize(int i, int i2) {
        com.google.android.material.color.utilities.Hct fromInt = com.google.android.material.color.utilities.Hct.fromInt(i);
        com.google.android.material.color.utilities.Hct fromInt2 = com.google.android.material.color.utilities.Hct.fromInt(i2);
        return com.google.android.material.color.utilities.Hct.from(com.google.android.material.color.utilities.MathUtils.sanitizeDegreesDouble(fromInt.getHue() + (java.lang.Math.min(com.google.android.material.color.utilities.MathUtils.differenceDegrees(fromInt.getHue(), fromInt2.getHue()) * 0.5d, 15.0d) * com.google.android.material.color.utilities.MathUtils.rotationDirection(fromInt.getHue(), fromInt2.getHue()))), fromInt.getChroma(), fromInt.getTone()).toInt();
    }

    public static int hctHue(int i, int i2, double d) {
        return com.google.android.material.color.utilities.Hct.from(com.google.android.material.color.utilities.Cam16.fromInt(cam16Ucs(i, i2, d)).getHue(), com.google.android.material.color.utilities.Cam16.fromInt(i).getChroma(), com.google.android.material.color.utilities.ColorUtils.lstarFromArgb(i)).toInt();
    }

    public static int cam16Ucs(int i, int i2, double d) {
        com.google.android.material.color.utilities.Cam16 fromInt = com.google.android.material.color.utilities.Cam16.fromInt(i);
        com.google.android.material.color.utilities.Cam16 fromInt2 = com.google.android.material.color.utilities.Cam16.fromInt(i2);
        double jstar = fromInt.getJstar();
        double astar = fromInt.getAstar();
        double bstar = fromInt.getBstar();
        return com.google.android.material.color.utilities.Cam16.fromUcs(jstar + ((fromInt2.getJstar() - jstar) * d), astar + ((fromInt2.getAstar() - astar) * d), bstar + ((fromInt2.getBstar() - bstar) * d)).toInt();
    }
}
