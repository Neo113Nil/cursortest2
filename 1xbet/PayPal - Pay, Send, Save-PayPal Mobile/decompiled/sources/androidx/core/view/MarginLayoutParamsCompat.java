package androidx.core.view;

@java.lang.Deprecated
/* loaded from: classes7.dex */
public final class MarginLayoutParamsCompat {
    @androidx.annotation.ReplaceWith(expression = "lp.getMarginStart()")
    @java.lang.Deprecated
    public static int getMarginStart(android.view.ViewGroup.MarginLayoutParams marginLayoutParams) {
        return marginLayoutParams.getMarginStart();
    }

    @androidx.annotation.ReplaceWith(expression = "lp.getMarginEnd()")
    @java.lang.Deprecated
    public static int getMarginEnd(android.view.ViewGroup.MarginLayoutParams marginLayoutParams) {
        return marginLayoutParams.getMarginEnd();
    }

    @androidx.annotation.ReplaceWith(expression = "lp.setMarginStart(marginStart)")
    @java.lang.Deprecated
    public static void setMarginStart(android.view.ViewGroup.MarginLayoutParams marginLayoutParams, int i) {
        marginLayoutParams.setMarginStart(i);
    }

    @androidx.annotation.ReplaceWith(expression = "lp.setMarginEnd(marginEnd)")
    @java.lang.Deprecated
    public static void setMarginEnd(android.view.ViewGroup.MarginLayoutParams marginLayoutParams, int i) {
        marginLayoutParams.setMarginEnd(i);
    }

    @androidx.annotation.ReplaceWith(expression = "lp.isMarginRelative()")
    @java.lang.Deprecated
    public static boolean isMarginRelative(android.view.ViewGroup.MarginLayoutParams marginLayoutParams) {
        return marginLayoutParams.isMarginRelative();
    }

    @java.lang.Deprecated
    public static int getLayoutDirection(android.view.ViewGroup.MarginLayoutParams marginLayoutParams) {
        int layoutDirection = marginLayoutParams.getLayoutDirection();
        if (layoutDirection == 0 || layoutDirection == 1) {
            return layoutDirection;
        }
        return 0;
    }

    @androidx.annotation.ReplaceWith(expression = "lp.setLayoutDirection(layoutDirection)")
    @java.lang.Deprecated
    public static void setLayoutDirection(android.view.ViewGroup.MarginLayoutParams marginLayoutParams, int i) {
        marginLayoutParams.setLayoutDirection(i);
    }

    @androidx.annotation.ReplaceWith(expression = "lp.resolveLayoutDirection(layoutDirection)")
    @java.lang.Deprecated
    public static void resolveLayoutDirection(android.view.ViewGroup.MarginLayoutParams marginLayoutParams, int i) {
        marginLayoutParams.resolveLayoutDirection(i);
    }

    private MarginLayoutParamsCompat() {
    }
}
