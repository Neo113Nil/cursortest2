package androidx.appcompat.widget;

/* loaded from: classes3.dex */
public class ThemeUtils {
    private static final java.lang.ThreadLocal<android.util.TypedValue> getInputFormats = new java.lang.ThreadLocal<>();
    static final int[] getHighResolutionOutputSizeshNQ4ISI = {-16842910};
    static final int[] getHighSpeedVideoFpsRanges = {android.R.attr.state_focused};
    static final int[] Camera2StreamConfigurationMap = {android.R.attr.state_activated};
    static final int[] getInputSizeshNQ4ISI = {android.R.attr.state_pressed};
    static final int[] getHighSpeedVideoSizes = {android.R.attr.state_checked};
    static final int[] getHighSpeedVideoSizesFor = {android.R.attr.state_selected};
    static final int[] getOutputFormats = {-16842919, -16842908};
    static final int[] getHighSpeedVideoFpsRangesFor = new int[0];
    private static final int[] getOutputMinFrameDuration = new int[1];

    public static android.content.res.ColorStateList createDisabledStateList(int i, int i2) {
        return new android.content.res.ColorStateList(new int[][]{getHighResolutionOutputSizeshNQ4ISI, getHighSpeedVideoFpsRangesFor}, new int[]{i2, i});
    }

    public static int getThemeAttrColor(android.content.Context context, int i) {
        int[] iArr = getOutputMinFrameDuration;
        iArr[0] = i;
        androidx.appcompat.widget.TintTypedArray obtainStyledAttributes = androidx.appcompat.widget.TintTypedArray.obtainStyledAttributes(context, (android.util.AttributeSet) null, iArr);
        try {
            return obtainStyledAttributes.getColor(0, 0);
        } finally {
            obtainStyledAttributes.recycle();
        }
    }

    public static android.content.res.ColorStateList getThemeAttrColorStateList(android.content.Context context, int i) {
        int[] iArr = getOutputMinFrameDuration;
        iArr[0] = i;
        androidx.appcompat.widget.TintTypedArray obtainStyledAttributes = androidx.appcompat.widget.TintTypedArray.obtainStyledAttributes(context, (android.util.AttributeSet) null, iArr);
        try {
            return obtainStyledAttributes.getColorStateList(0);
        } finally {
            obtainStyledAttributes.recycle();
        }
    }

    public static int getDisabledThemeAttrColor(android.content.Context context, int i) {
        android.content.res.ColorStateList themeAttrColorStateList = getThemeAttrColorStateList(context, i);
        if (themeAttrColorStateList != null && themeAttrColorStateList.isStateful()) {
            return themeAttrColorStateList.getColorForState(getHighResolutionOutputSizeshNQ4ISI, themeAttrColorStateList.getDefaultColor());
        }
        java.lang.ThreadLocal<android.util.TypedValue> threadLocal = getInputFormats;
        android.util.TypedValue typedValue = threadLocal.get();
        if (typedValue == null) {
            typedValue = new android.util.TypedValue();
            threadLocal.set(typedValue);
        }
        context.getTheme().resolveAttribute(android.R.attr.disabledAlpha, typedValue, true);
        float f = typedValue.getFloat();
        return androidx.core.graphics.ColorUtils.setAlphaComponent(getThemeAttrColor(context, i), java.lang.Math.round(android.graphics.Color.alpha(r4) * f));
    }

    public static void checkAppCompatTheme(android.view.View view, android.content.Context context) {
        android.content.res.TypedArray obtainStyledAttributes = context.obtainStyledAttributes(androidx.appcompat.R.styleable.AppCompatTheme);
        try {
            obtainStyledAttributes.hasValue(androidx.appcompat.R.styleable.AppCompatTheme_windowActionBar);
        } finally {
            obtainStyledAttributes.recycle();
        }
    }

    private ThemeUtils() {
    }
}
