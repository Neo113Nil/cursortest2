package com.google.android.material.motion;

/* loaded from: classes8.dex */
public class MotionUtils {
    private static final java.lang.String EASING_TYPE_CUBIC_BEZIER = "cubic-bezier";
    private static final java.lang.String EASING_TYPE_FORMAT_END = ")";
    private static final java.lang.String EASING_TYPE_FORMAT_START = "(";
    private static final java.lang.String EASING_TYPE_PATH = "path";

    private MotionUtils() {
    }

    public static int resolveThemeDuration(android.content.Context context, int i, int i2) {
        return com.google.android.material.resources.MaterialAttributes.resolveInteger(context, i, i2);
    }

    public static android.animation.TimeInterpolator resolveThemeInterpolator(android.content.Context context, int i, android.animation.TimeInterpolator timeInterpolator) {
        android.util.TypedValue typedValue = new android.util.TypedValue();
        if (!context.getTheme().resolveAttribute(i, typedValue, true)) {
            return timeInterpolator;
        }
        if (typedValue.type != 3) {
            throw new java.lang.IllegalArgumentException("Motion easing theme attribute must be an @interpolator resource for ?attr/motionEasing*Interpolator attributes or a string for ?attr/motionEasing* attributes.");
        }
        java.lang.String valueOf = java.lang.String.valueOf(typedValue.string);
        if (isLegacyEasingAttribute(valueOf)) {
            return getLegacyThemeInterpolator(valueOf);
        }
        return android.view.animation.AnimationUtils.loadInterpolator(context, typedValue.resourceId);
    }

    private static android.animation.TimeInterpolator getLegacyThemeInterpolator(java.lang.String str) {
        if (isLegacyEasingType(str, EASING_TYPE_CUBIC_BEZIER)) {
            java.lang.String[] split = getLegacyEasingContent(str, EASING_TYPE_CUBIC_BEZIER).split(",");
            if (split.length != 4) {
                java.lang.StringBuilder sb = new java.lang.StringBuilder("Motion easing theme attribute must have 4 control points if using bezier curve format; instead got: ");
                sb.append(split.length);
                throw new java.lang.IllegalArgumentException(sb.toString());
            }
            return androidx.core.view.animation.PathInterpolatorCompat.create(getLegacyControlPoint(split, 0), getLegacyControlPoint(split, 1), getLegacyControlPoint(split, 2), getLegacyControlPoint(split, 3));
        }
        if (isLegacyEasingType(str, EASING_TYPE_PATH)) {
            return androidx.core.view.animation.PathInterpolatorCompat.create(androidx.core.graphics.PathParser.createPathFromPathData(getLegacyEasingContent(str, EASING_TYPE_PATH)));
        }
        throw new java.lang.IllegalArgumentException("Invalid motion easing type: ".concat(java.lang.String.valueOf(str)));
    }

    private static boolean isLegacyEasingAttribute(java.lang.String str) {
        return isLegacyEasingType(str, EASING_TYPE_CUBIC_BEZIER) || isLegacyEasingType(str, EASING_TYPE_PATH);
    }

    private static boolean isLegacyEasingType(java.lang.String str, java.lang.String str2) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(str2);
        sb.append(EASING_TYPE_FORMAT_START);
        return str.startsWith(sb.toString()) && str.endsWith(EASING_TYPE_FORMAT_END);
    }

    private static java.lang.String getLegacyEasingContent(java.lang.String str, java.lang.String str2) {
        return str.substring(str2.length() + 1, str.length() - 1);
    }

    private static float getLegacyControlPoint(java.lang.String[] strArr, int i) {
        float parseFloat = java.lang.Float.parseFloat(strArr[i]);
        if (parseFloat < 0.0f || parseFloat > 1.0f) {
            throw new java.lang.IllegalArgumentException("Motion easing control point value must be between 0 and 1; instead got: ".concat(java.lang.String.valueOf(parseFloat)));
        }
        return parseFloat;
    }
}
