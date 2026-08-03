package androidx.core.view;

@java.lang.Deprecated
/* loaded from: classes.dex */
public final class MarginLayoutParamsCompat {
    @java.lang.Deprecated
    public static int getMarginStart(android.view.ViewGroup.MarginLayoutParams marginLayoutParams) {
        return marginLayoutParams.getMarginStart();
    }

    @java.lang.Deprecated
    public static int getMarginEnd(android.view.ViewGroup.MarginLayoutParams marginLayoutParams) {
        return marginLayoutParams.getMarginEnd();
    }

    @java.lang.Deprecated
    public static void setMarginStart(android.view.ViewGroup.MarginLayoutParams marginLayoutParams, int i) {
        marginLayoutParams.setMarginStart(i);
    }

    @java.lang.Deprecated
    public static void setMarginEnd(android.view.ViewGroup.MarginLayoutParams marginLayoutParams, int i) {
        marginLayoutParams.setMarginEnd(i);
    }

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

    @java.lang.Deprecated
    public static void setLayoutDirection(android.view.ViewGroup.MarginLayoutParams marginLayoutParams, int i) {
        marginLayoutParams.setLayoutDirection(i);
    }

    @java.lang.Deprecated
    public static void resolveLayoutDirection(android.view.ViewGroup.MarginLayoutParams marginLayoutParams, int i) {
        marginLayoutParams.resolveLayoutDirection(i);
    }

    private MarginLayoutParamsCompat() {
    }
}
