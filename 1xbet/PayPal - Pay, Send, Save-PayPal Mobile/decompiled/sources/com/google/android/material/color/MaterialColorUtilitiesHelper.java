package com.google.android.material.color;

/* loaded from: classes8.dex */
public final class MaterialColorUtilitiesHelper {
    private static final java.util.Map<java.lang.Integer, com.google.android.material.color.utilities.DynamicColor> colorResourceIdToColorValue;
    private static final com.google.android.material.color.utilities.MaterialDynamicColors dynamicColors;

    private MaterialColorUtilitiesHelper() {
    }

    static {
        com.google.android.material.color.utilities.MaterialDynamicColors materialDynamicColors = new com.google.android.material.color.utilities.MaterialDynamicColors();
        dynamicColors = materialDynamicColors;
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put(java.lang.Integer.valueOf(com.google.android.material.R.color.material_personalized_color_primary), materialDynamicColors.primary());
        hashMap.put(java.lang.Integer.valueOf(com.google.android.material.R.color.material_personalized_color_on_primary), materialDynamicColors.onPrimary());
        hashMap.put(java.lang.Integer.valueOf(com.google.android.material.R.color.material_personalized_color_primary_inverse), materialDynamicColors.inversePrimary());
        int i = com.google.android.material.R.color.material_personalized_color_primary_container;
        hashMap.put(java.lang.Integer.valueOf(i), materialDynamicColors.primaryContainer());
        int i2 = com.google.android.material.R.color.material_personalized_color_on_primary_container;
        hashMap.put(java.lang.Integer.valueOf(i2), materialDynamicColors.onPrimaryContainer());
        hashMap.put(java.lang.Integer.valueOf(com.google.android.material.R.color.material_personalized_color_secondary), materialDynamicColors.secondary());
        hashMap.put(java.lang.Integer.valueOf(com.google.android.material.R.color.material_personalized_color_on_secondary), materialDynamicColors.onSecondary());
        int i3 = com.google.android.material.R.color.material_personalized_color_secondary_container;
        hashMap.put(java.lang.Integer.valueOf(i3), materialDynamicColors.secondaryContainer());
        int i4 = com.google.android.material.R.color.material_personalized_color_on_secondary_container;
        hashMap.put(java.lang.Integer.valueOf(i4), materialDynamicColors.onSecondaryContainer());
        hashMap.put(java.lang.Integer.valueOf(com.google.android.material.R.color.material_personalized_color_tertiary), materialDynamicColors.tertiary());
        hashMap.put(java.lang.Integer.valueOf(com.google.android.material.R.color.material_personalized_color_on_tertiary), materialDynamicColors.onTertiary());
        int i5 = com.google.android.material.R.color.material_personalized_color_tertiary_container;
        hashMap.put(java.lang.Integer.valueOf(i5), materialDynamicColors.tertiaryContainer());
        int i6 = com.google.android.material.R.color.material_personalized_color_on_tertiary_container;
        hashMap.put(java.lang.Integer.valueOf(i6), materialDynamicColors.onTertiaryContainer());
        hashMap.put(java.lang.Integer.valueOf(com.google.android.material.R.color.material_personalized_color_background), materialDynamicColors.background());
        hashMap.put(java.lang.Integer.valueOf(com.google.android.material.R.color.material_personalized_color_on_background), materialDynamicColors.onBackground());
        hashMap.put(java.lang.Integer.valueOf(com.google.android.material.R.color.material_personalized_color_surface), materialDynamicColors.surface());
        hashMap.put(java.lang.Integer.valueOf(com.google.android.material.R.color.material_personalized_color_on_surface), materialDynamicColors.onSurface());
        hashMap.put(java.lang.Integer.valueOf(com.google.android.material.R.color.material_personalized_color_surface_variant), materialDynamicColors.surfaceVariant());
        int i7 = com.google.android.material.R.color.material_personalized_color_on_surface_variant;
        hashMap.put(java.lang.Integer.valueOf(i7), materialDynamicColors.onSurfaceVariant());
        hashMap.put(java.lang.Integer.valueOf(com.google.android.material.R.color.material_personalized_color_surface_inverse), materialDynamicColors.inverseSurface());
        int i8 = com.google.android.material.R.color.material_personalized_color_on_surface_inverse;
        hashMap.put(java.lang.Integer.valueOf(i8), materialDynamicColors.inverseOnSurface());
        hashMap.put(java.lang.Integer.valueOf(com.google.android.material.R.color.material_personalized_color_surface_bright), materialDynamicColors.surfaceBright());
        hashMap.put(java.lang.Integer.valueOf(com.google.android.material.R.color.material_personalized_color_surface_dim), materialDynamicColors.surfaceDim());
        int i9 = com.google.android.material.R.color.material_personalized_color_surface_container;
        hashMap.put(java.lang.Integer.valueOf(i9), materialDynamicColors.surfaceContainer());
        int i10 = com.google.android.material.R.color.material_personalized_color_surface_container_low;
        hashMap.put(java.lang.Integer.valueOf(i10), materialDynamicColors.surfaceContainerLow());
        int i11 = com.google.android.material.R.color.material_personalized_color_surface_container_high;
        hashMap.put(java.lang.Integer.valueOf(i11), materialDynamicColors.surfaceContainerHigh());
        int i12 = com.google.android.material.R.color.material_personalized_color_surface_container_lowest;
        hashMap.put(java.lang.Integer.valueOf(i12), materialDynamicColors.surfaceContainerLowest());
        int i13 = com.google.android.material.R.color.material_personalized_color_surface_container_highest;
        hashMap.put(java.lang.Integer.valueOf(i13), materialDynamicColors.surfaceContainerHighest());
        hashMap.put(java.lang.Integer.valueOf(com.google.android.material.R.color.material_personalized_color_outline), materialDynamicColors.outline());
        hashMap.put(java.lang.Integer.valueOf(com.google.android.material.R.color.material_personalized_color_outline_variant), materialDynamicColors.outlineVariant());
        hashMap.put(java.lang.Integer.valueOf(com.google.android.material.R.color.material_personalized_color_error), materialDynamicColors.error());
        hashMap.put(java.lang.Integer.valueOf(com.google.android.material.R.color.material_personalized_color_on_error), materialDynamicColors.onError());
        hashMap.put(java.lang.Integer.valueOf(com.google.android.material.R.color.material_personalized_color_error_container), materialDynamicColors.errorContainer());
        int i14 = com.google.android.material.R.color.material_personalized_color_on_error_container;
        hashMap.put(java.lang.Integer.valueOf(i14), materialDynamicColors.onErrorContainer());
        int i15 = com.google.android.material.R.color.material_personalized_color_control_activated;
        hashMap.put(java.lang.Integer.valueOf(i15), materialDynamicColors.controlActivated());
        hashMap.put(java.lang.Integer.valueOf(com.google.android.material.R.color.material_personalized_color_control_normal), materialDynamicColors.controlNormal());
        int i16 = com.google.android.material.R.color.material_personalized_color_control_highlight;
        hashMap.put(java.lang.Integer.valueOf(i16), materialDynamicColors.controlHighlight());
        int i17 = com.google.android.material.R.color.material_personalized_color_text_primary_inverse;
        hashMap.put(java.lang.Integer.valueOf(i17), materialDynamicColors.textPrimaryInverse());
        int i18 = com.google.android.material.R.color.material_personalized_color_text_secondary_and_tertiary_inverse;
        hashMap.put(java.lang.Integer.valueOf(i18), materialDynamicColors.textSecondaryAndTertiaryInverse());
        int i19 = com.google.android.material.R.color.material_personalized_color_text_secondary_and_tertiary_inverse_disabled;
        hashMap.put(java.lang.Integer.valueOf(i19), materialDynamicColors.textSecondaryAndTertiaryInverseDisabled());
        int i20 = com.google.android.material.R.color.material_personalized_color_text_primary_inverse_disable_only;
        hashMap.put(java.lang.Integer.valueOf(i20), materialDynamicColors.textPrimaryInverseDisableOnly());
        int i21 = com.google.android.material.R.color.material_personalized_color_text_hint_foreground_inverse;
        hashMap.put(java.lang.Integer.valueOf(i21), materialDynamicColors.textHintInverse());
        colorResourceIdToColorValue = java.util.Collections.unmodifiableMap(hashMap);
    }

    public static java.util.Map<java.lang.Integer, java.lang.Integer> createColorResourcesIdsToColorValues(com.google.android.material.color.utilities.DynamicScheme dynamicScheme) {
        java.util.HashMap hashMap = new java.util.HashMap();
        for (java.util.Map.Entry<java.lang.Integer, com.google.android.material.color.utilities.DynamicColor> entry : colorResourceIdToColorValue.entrySet()) {
            hashMap.put(entry.getKey(), java.lang.Integer.valueOf(entry.getValue().getArgb(dynamicScheme)));
        }
        return java.util.Collections.unmodifiableMap(hashMap);
    }
}
