package com.google.android.material.color.utilities;

/* loaded from: classes8.dex */
public class SchemeTonalSpot extends com.google.android.material.color.utilities.DynamicScheme {
    public SchemeTonalSpot(com.google.android.material.color.utilities.Hct hct, boolean z, double d) {
        super(hct, com.google.android.material.color.utilities.Variant.TONAL_SPOT, z, d, com.google.android.material.color.utilities.TonalPalette.fromHueAndChroma(hct.getHue(), 36.0d), com.google.android.material.color.utilities.TonalPalette.fromHueAndChroma(hct.getHue(), 16.0d), com.google.android.material.color.utilities.TonalPalette.fromHueAndChroma(com.google.android.material.color.utilities.MathUtils.sanitizeDegreesDouble(hct.getHue() + 60.0d), 24.0d), com.google.android.material.color.utilities.TonalPalette.fromHueAndChroma(hct.getHue(), 6.0d), com.google.android.material.color.utilities.TonalPalette.fromHueAndChroma(hct.getHue(), 8.0d));
    }
}
