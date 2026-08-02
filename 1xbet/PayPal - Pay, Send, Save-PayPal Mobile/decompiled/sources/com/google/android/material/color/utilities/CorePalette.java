package com.google.android.material.color.utilities;

/* loaded from: classes8.dex */
public final class CorePalette {
    public com.google.android.material.color.utilities.TonalPalette a1;
    public com.google.android.material.color.utilities.TonalPalette a2;
    public com.google.android.material.color.utilities.TonalPalette a3;
    public com.google.android.material.color.utilities.TonalPalette error;
    public com.google.android.material.color.utilities.TonalPalette n1;
    public com.google.android.material.color.utilities.TonalPalette n2;

    public static com.google.android.material.color.utilities.CorePalette of(int i) {
        return new com.google.android.material.color.utilities.CorePalette(i, false);
    }

    public static com.google.android.material.color.utilities.CorePalette contentOf(int i) {
        return new com.google.android.material.color.utilities.CorePalette(i, true);
    }

    private CorePalette(int i, boolean z) {
        com.google.android.material.color.utilities.Hct fromInt = com.google.android.material.color.utilities.Hct.fromInt(i);
        double hue = fromInt.getHue();
        double chroma = fromInt.getChroma();
        if (z) {
            this.a1 = com.google.android.material.color.utilities.TonalPalette.fromHueAndChroma(hue, chroma);
            this.a2 = com.google.android.material.color.utilities.TonalPalette.fromHueAndChroma(hue, chroma / 3.0d);
            this.a3 = com.google.android.material.color.utilities.TonalPalette.fromHueAndChroma(60.0d + hue, chroma / 2.0d);
            this.n1 = com.google.android.material.color.utilities.TonalPalette.fromHueAndChroma(hue, java.lang.Math.min(chroma / 12.0d, 4.0d));
            this.n2 = com.google.android.material.color.utilities.TonalPalette.fromHueAndChroma(hue, java.lang.Math.min(chroma / 6.0d, 8.0d));
        } else {
            this.a1 = com.google.android.material.color.utilities.TonalPalette.fromHueAndChroma(hue, java.lang.Math.max(48.0d, chroma));
            this.a2 = com.google.android.material.color.utilities.TonalPalette.fromHueAndChroma(hue, 16.0d);
            this.a3 = com.google.android.material.color.utilities.TonalPalette.fromHueAndChroma(60.0d + hue, 24.0d);
            this.n1 = com.google.android.material.color.utilities.TonalPalette.fromHueAndChroma(hue, 4.0d);
            this.n2 = com.google.android.material.color.utilities.TonalPalette.fromHueAndChroma(hue, 8.0d);
        }
        this.error = com.google.android.material.color.utilities.TonalPalette.fromHueAndChroma(25.0d, 84.0d);
    }
}
