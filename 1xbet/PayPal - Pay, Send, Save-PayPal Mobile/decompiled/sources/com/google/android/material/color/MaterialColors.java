package com.google.android.material.color;

/* loaded from: classes8.dex */
public class MaterialColors {
    public static final float ALPHA_DISABLED = 0.38f;
    public static final float ALPHA_DISABLED_LOW = 0.12f;
    public static final float ALPHA_FULL = 1.0f;
    public static final float ALPHA_LOW = 0.32f;
    public static final float ALPHA_MEDIUM = 0.54f;
    private static final int CHROMA_NEUTRAL = 6;
    private static final int TONE_ACCENT_CONTAINER_DARK = 30;
    private static final int TONE_ACCENT_CONTAINER_LIGHT = 90;
    private static final int TONE_ACCENT_DARK = 80;
    private static final int TONE_ACCENT_LIGHT = 40;
    private static final int TONE_ON_ACCENT_CONTAINER_DARK = 90;
    private static final int TONE_ON_ACCENT_CONTAINER_LIGHT = 10;
    private static final int TONE_ON_ACCENT_DARK = 20;
    private static final int TONE_ON_ACCENT_LIGHT = 100;
    private static final int TONE_SURFACE_CONTAINER_DARK = 12;
    private static final int TONE_SURFACE_CONTAINER_HIGH_DARK = 17;
    private static final int TONE_SURFACE_CONTAINER_HIGH_LIGHT = 92;
    private static final int TONE_SURFACE_CONTAINER_LIGHT = 94;

    private MaterialColors() {
    }

    public static int getColor(android.view.View view, int i) {
        return resolveColor(view.getContext(), com.google.android.material.resources.MaterialAttributes.resolveTypedValueOrThrow(view, i));
    }

    public static int getColor(android.content.Context context, int i, java.lang.String str) {
        return resolveColor(context, com.google.android.material.resources.MaterialAttributes.resolveTypedValueOrThrow(context, i, str));
    }

    public static int getColor(android.view.View view, int i, int i2) {
        return getColor(view.getContext(), i, i2);
    }

    public static int getColor(android.content.Context context, int i, int i2) {
        java.lang.Integer colorOrNull = getColorOrNull(context, i);
        return colorOrNull != null ? colorOrNull.intValue() : i2;
    }

    public static java.lang.Integer getColorOrNull(android.content.Context context, int i) {
        android.util.TypedValue resolve = com.google.android.material.resources.MaterialAttributes.resolve(context, i);
        if (resolve != null) {
            return java.lang.Integer.valueOf(resolveColor(context, resolve));
        }
        return null;
    }

    public static android.content.res.ColorStateList getColorStateList(android.content.Context context, int i, android.content.res.ColorStateList colorStateList) {
        android.util.TypedValue resolve = com.google.android.material.resources.MaterialAttributes.resolve(context, i);
        android.content.res.ColorStateList resolveColorStateList = resolve != null ? resolveColorStateList(context, resolve) : null;
        return resolveColorStateList == null ? colorStateList : resolveColorStateList;
    }

    public static android.content.res.ColorStateList getColorStateListOrNull(android.content.Context context, int i) {
        android.util.TypedValue resolve = com.google.android.material.resources.MaterialAttributes.resolve(context, i);
        if (resolve == null) {
            return null;
        }
        if (resolve.resourceId != 0) {
            return androidx.core.content.ContextCompat.getColorStateList(context, resolve.resourceId);
        }
        if (resolve.data != 0) {
            return android.content.res.ColorStateList.valueOf(resolve.data);
        }
        return null;
    }

    private static int resolveColor(android.content.Context context, android.util.TypedValue typedValue) {
        if (typedValue.resourceId != 0) {
            return androidx.core.content.ContextCompat.getColor(context, typedValue.resourceId);
        }
        return typedValue.data;
    }

    private static android.content.res.ColorStateList resolveColorStateList(android.content.Context context, android.util.TypedValue typedValue) {
        if (typedValue.resourceId != 0) {
            return androidx.core.content.ContextCompat.getColorStateList(context, typedValue.resourceId);
        }
        return android.content.res.ColorStateList.valueOf(typedValue.data);
    }

    public static int layer(android.view.View view, int i, int i2) {
        return layer(view, i, i2, 1.0f);
    }

    public static int layer(android.view.View view, int i, int i2, float f) {
        return layer(getColor(view, i), getColor(view, i2), f);
    }

    public static int layer(int i, int i2, float f) {
        return layer(i, androidx.core.graphics.ColorUtils.setAlphaComponent(i2, java.lang.Math.round(android.graphics.Color.alpha(i2) * f)));
    }

    public static int layer(int i, int i2) {
        return androidx.core.graphics.ColorUtils.compositeColors(i2, i);
    }

    public static int compositeARGBWithAlpha(int i, int i2) {
        return androidx.core.graphics.ColorUtils.setAlphaComponent(i, (android.graphics.Color.alpha(i) * i2) / 255);
    }

    public static boolean isColorLight(int i) {
        return i != 0 && androidx.core.graphics.ColorUtils.calculateLuminance(i) > 0.5d;
    }

    public static int harmonizeWithPrimary(android.content.Context context, int i) {
        return harmonize(i, getColor(context, com.google.android.material.R.attr.colorPrimary, com.google.android.material.color.MaterialColors.class.getCanonicalName()));
    }

    public static int harmonize(int i, int i2) {
        return com.google.android.material.color.utilities.Blend.harmonize(i, i2);
    }

    public static com.google.android.material.color.ColorRoles getColorRoles(android.content.Context context, int i) {
        return getColorRoles(i, isLightTheme(context));
    }

    public static com.google.android.material.color.ColorRoles getColorRoles(int i, boolean z) {
        if (z) {
            return new com.google.android.material.color.ColorRoles(getColorRole(i, 40), getColorRole(i, 100), getColorRole(i, 90), getColorRole(i, 10));
        }
        return new com.google.android.material.color.ColorRoles(getColorRole(i, 80), getColorRole(i, 20), getColorRole(i, 30), getColorRole(i, 90));
    }

    public static int getSurfaceContainerFromSeed(android.content.Context context, int i) {
        return getColorRole(i, isLightTheme(context) ? 94 : 12, 6);
    }

    public static int getSurfaceContainerHighFromSeed(android.content.Context context, int i) {
        return getColorRole(i, isLightTheme(context) ? 92 : 17, 6);
    }

    static boolean isLightTheme(android.content.Context context) {
        return com.google.android.material.resources.MaterialAttributes.resolveBoolean(context, com.google.android.material.R.attr.isLightTheme, true);
    }

    private static int getColorRole(int i, int i2) {
        com.google.android.material.color.utilities.Hct fromInt = com.google.android.material.color.utilities.Hct.fromInt(i);
        fromInt.setTone(i2);
        return fromInt.toInt();
    }

    private static int getColorRole(int i, int i2, int i3) {
        com.google.android.material.color.utilities.Hct fromInt = com.google.android.material.color.utilities.Hct.fromInt(getColorRole(i, i2));
        fromInt.setChroma(i3);
        return fromInt.toInt();
    }
}
