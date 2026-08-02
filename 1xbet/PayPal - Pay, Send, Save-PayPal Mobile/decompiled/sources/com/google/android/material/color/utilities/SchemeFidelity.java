package com.google.android.material.color.utilities;

/* loaded from: classes8.dex */
public class SchemeFidelity extends com.google.android.material.color.utilities.DynamicScheme {
    public SchemeFidelity(com.google.android.material.color.utilities.Hct hct, boolean z, double d) {
        super(hct, com.google.android.material.color.utilities.Variant.FIDELITY, z, d, com.google.android.material.color.utilities.TonalPalette.fromHueAndChroma(hct.getHue(), hct.getChroma()), com.google.android.material.color.utilities.TonalPalette.fromHueAndChroma(hct.getHue(), java.lang.Math.max(hct.getChroma() - 32.0d, hct.getChroma() * 0.5d)), com.google.android.material.color.utilities.TonalPalette.fromHct(com.google.android.material.color.utilities.DislikeAnalyzer.fixIfDisliked(new com.google.android.material.color.utilities.TemperatureCache(hct).getComplement())), com.google.android.material.color.utilities.TonalPalette.fromHueAndChroma(hct.getHue(), hct.getChroma() / 8.0d), com.google.android.material.color.utilities.TonalPalette.fromHueAndChroma(hct.getHue(), (hct.getChroma() / 8.0d) + 4.0d));
    }
}
