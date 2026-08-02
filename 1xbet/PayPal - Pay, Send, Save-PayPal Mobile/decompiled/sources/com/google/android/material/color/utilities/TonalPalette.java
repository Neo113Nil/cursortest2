package com.google.android.material.color.utilities;

/* loaded from: classes8.dex */
public final class TonalPalette {
    java.util.Map<java.lang.Integer, java.lang.Integer> cache = new java.util.HashMap();
    double chroma;
    double hue;
    com.google.android.material.color.utilities.Hct keyColor;

    public static com.google.android.material.color.utilities.TonalPalette fromInt(int i) {
        return fromHct(com.google.android.material.color.utilities.Hct.fromInt(i));
    }

    public static com.google.android.material.color.utilities.TonalPalette fromHct(com.google.android.material.color.utilities.Hct hct) {
        return new com.google.android.material.color.utilities.TonalPalette(hct.getHue(), hct.getChroma(), hct);
    }

    public static com.google.android.material.color.utilities.TonalPalette fromHueAndChroma(double d, double d2) {
        return new com.google.android.material.color.utilities.TonalPalette(d, d2, createKeyColor(d, d2));
    }

    private TonalPalette(double d, double d2, com.google.android.material.color.utilities.Hct hct) {
        this.hue = d;
        this.chroma = d2;
        this.keyColor = hct;
    }

    private static com.google.android.material.color.utilities.Hct createKeyColor(double d, double d2) {
        com.google.android.material.color.utilities.Hct from = com.google.android.material.color.utilities.Hct.from(d, d2, 50.0d);
        com.google.android.material.color.utilities.Hct hct = from;
        double abs = java.lang.Math.abs(from.getChroma() - d2);
        for (double d3 = 1.0d; d3 < 50.0d && java.lang.Math.round(d2) != java.lang.Math.round(hct.getChroma()); d3 += 1.0d) {
            com.google.android.material.color.utilities.Hct from2 = com.google.android.material.color.utilities.Hct.from(d, d2, d3 + 50.0d);
            double abs2 = java.lang.Math.abs(from2.getChroma() - d2);
            if (abs2 < abs) {
                hct = from2;
                abs = abs2;
            }
            com.google.android.material.color.utilities.Hct from3 = com.google.android.material.color.utilities.Hct.from(d, d2, 50.0d - d3);
            double abs3 = java.lang.Math.abs(from3.getChroma() - d2);
            if (abs3 < abs) {
                hct = from3;
                abs = abs3;
            }
        }
        return hct;
    }

    public final int tone(int i) {
        java.lang.Integer num = this.cache.get(java.lang.Integer.valueOf(i));
        if (num == null) {
            num = java.lang.Integer.valueOf(com.google.android.material.color.utilities.Hct.from(this.hue, this.chroma, i).toInt());
            this.cache.put(java.lang.Integer.valueOf(i), num);
        }
        return num.intValue();
    }

    public final com.google.android.material.color.utilities.Hct getHct(double d) {
        return com.google.android.material.color.utilities.Hct.from(this.hue, this.chroma, d);
    }

    public final double getChroma() {
        return this.chroma;
    }

    public final double getHue() {
        return this.hue;
    }

    public final com.google.android.material.color.utilities.Hct getKeyColor() {
        return this.keyColor;
    }
}
