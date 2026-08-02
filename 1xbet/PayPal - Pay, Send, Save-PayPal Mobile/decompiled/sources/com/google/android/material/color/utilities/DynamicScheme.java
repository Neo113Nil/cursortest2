package com.google.android.material.color.utilities;

/* loaded from: classes8.dex */
public class DynamicScheme {
    public final double contrastLevel;
    public final com.google.android.material.color.utilities.TonalPalette errorPalette = com.google.android.material.color.utilities.TonalPalette.fromHueAndChroma(25.0d, 84.0d);
    public final boolean isDark;
    public final com.google.android.material.color.utilities.TonalPalette neutralPalette;
    public final com.google.android.material.color.utilities.TonalPalette neutralVariantPalette;
    public final com.google.android.material.color.utilities.TonalPalette primaryPalette;
    public final com.google.android.material.color.utilities.TonalPalette secondaryPalette;
    public final int sourceColorArgb;
    public final com.google.android.material.color.utilities.Hct sourceColorHct;
    public final com.google.android.material.color.utilities.TonalPalette tertiaryPalette;
    public final com.google.android.material.color.utilities.Variant variant;

    public DynamicScheme(com.google.android.material.color.utilities.Hct hct, com.google.android.material.color.utilities.Variant variant, boolean z, double d, com.google.android.material.color.utilities.TonalPalette tonalPalette, com.google.android.material.color.utilities.TonalPalette tonalPalette2, com.google.android.material.color.utilities.TonalPalette tonalPalette3, com.google.android.material.color.utilities.TonalPalette tonalPalette4, com.google.android.material.color.utilities.TonalPalette tonalPalette5) {
        this.sourceColorArgb = hct.toInt();
        this.sourceColorHct = hct;
        this.variant = variant;
        this.isDark = z;
        this.contrastLevel = d;
        this.primaryPalette = tonalPalette;
        this.secondaryPalette = tonalPalette2;
        this.tertiaryPalette = tonalPalette3;
        this.neutralPalette = tonalPalette4;
        this.neutralVariantPalette = tonalPalette5;
    }

    public static double getRotatedHue(com.google.android.material.color.utilities.Hct hct, double[] dArr, double[] dArr2) {
        double hue = hct.getHue();
        int i = 0;
        if (dArr2.length == 1) {
            return com.google.android.material.color.utilities.MathUtils.sanitizeDegreesDouble(hue + dArr2[0]);
        }
        int length = dArr.length;
        while (i <= length - 2) {
            double d = dArr[i];
            int i2 = i + 1;
            double d2 = dArr[i2];
            if (d < hue && hue < d2) {
                return com.google.android.material.color.utilities.MathUtils.sanitizeDegreesDouble(hue + dArr2[i]);
            }
            i = i2;
        }
        return hue;
    }
}
