package com.google.android.material.color.utilities;

/* loaded from: classes8.dex */
public class SchemeRainbow extends com.google.android.material.color.utilities.DynamicScheme {
    public SchemeRainbow(com.google.android.material.color.utilities.Hct hct, boolean z, double d) {
        super(hct, com.google.android.material.color.utilities.Variant.RAINBOW, z, d, com.google.android.material.color.utilities.TonalPalette.fromHueAndChroma(hct.getHue(), 48.0d), com.google.android.material.color.utilities.TonalPalette.fromHueAndChroma(hct.getHue(), 16.0d), com.google.android.material.color.utilities.TonalPalette.fromHueAndChroma(com.google.android.material.color.utilities.MathUtils.sanitizeDegreesDouble(hct.getHue() + 60.0d), 24.0d), com.google.android.material.color.utilities.TonalPalette.fromHueAndChroma(hct.getHue(), 0.0d), com.google.android.material.color.utilities.TonalPalette.fromHueAndChroma(hct.getHue(), 0.0d));
    }
}
