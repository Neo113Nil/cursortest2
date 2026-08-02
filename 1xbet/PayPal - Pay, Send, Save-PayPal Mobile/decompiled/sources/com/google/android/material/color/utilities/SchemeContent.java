package com.google.android.material.color.utilities;

/* loaded from: classes8.dex */
public class SchemeContent extends com.google.android.material.color.utilities.DynamicScheme {
    public SchemeContent(com.google.android.material.color.utilities.Hct hct, boolean z, double d) {
        super(hct, com.google.android.material.color.utilities.Variant.CONTENT, z, d, com.google.android.material.color.utilities.TonalPalette.fromHueAndChroma(hct.getHue(), hct.getChroma()), com.google.android.material.color.utilities.TonalPalette.fromHueAndChroma(hct.getHue(), java.lang.Math.max(hct.getChroma() - 32.0d, hct.getChroma() * 0.5d)), com.google.android.material.color.utilities.TonalPalette.fromHct(com.google.android.material.color.utilities.DislikeAnalyzer.fixIfDisliked(new com.google.android.material.color.utilities.TemperatureCache(hct).getAnalogousColors(3, 6).get(2))), com.google.android.material.color.utilities.TonalPalette.fromHueAndChroma(hct.getHue(), hct.getChroma() / 8.0d), com.google.android.material.color.utilities.TonalPalette.fromHueAndChroma(hct.getHue(), (hct.getChroma() / 8.0d) + 4.0d));
    }
}
