package com.google.android.material.color.utilities;

/* loaded from: classes8.dex */
public class SchemeFruitSalad extends com.google.android.material.color.utilities.DynamicScheme {
    public SchemeFruitSalad(com.google.android.material.color.utilities.Hct hct, boolean z, double d) {
        super(hct, com.google.android.material.color.utilities.Variant.FRUIT_SALAD, z, d, com.google.android.material.color.utilities.TonalPalette.fromHueAndChroma(com.google.android.material.color.utilities.MathUtils.sanitizeDegreesDouble(hct.getHue() - 50.0d), 48.0d), com.google.android.material.color.utilities.TonalPalette.fromHueAndChroma(com.google.android.material.color.utilities.MathUtils.sanitizeDegreesDouble(hct.getHue() - 50.0d), 36.0d), com.google.android.material.color.utilities.TonalPalette.fromHueAndChroma(hct.getHue(), 36.0d), com.google.android.material.color.utilities.TonalPalette.fromHueAndChroma(hct.getHue(), 10.0d), com.google.android.material.color.utilities.TonalPalette.fromHueAndChroma(hct.getHue(), 16.0d));
    }
}
