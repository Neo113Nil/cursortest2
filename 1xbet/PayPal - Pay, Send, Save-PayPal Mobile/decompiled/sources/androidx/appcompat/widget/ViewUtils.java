package androidx.appcompat.widget;

/* loaded from: classes3.dex */
public class ViewUtils {
    private static java.lang.reflect.Method getHighResolutionOutputSizeshNQ4ISI;
    static final boolean getHighSpeedVideoFpsRangesFor;
    private static boolean getHighSpeedVideoSizes;

    static {
        getHighSpeedVideoFpsRangesFor = android.os.Build.VERSION.SDK_INT >= 27;
    }

    private ViewUtils() {
    }

    public static boolean isLayoutRtl(android.view.View view) {
        return view.getLayoutDirection() == 1;
    }

    public static void computeFitSystemWindows(android.view.View view, android.graphics.Rect rect, android.graphics.Rect rect2) {
        if (android.os.Build.VERSION.SDK_INT >= 29) {
            androidx.appcompat.widget.ViewUtils.Api29Impl.getHighSpeedVideoFpsRangesFor(view, rect, rect2);
            return;
        }
        if (!getHighSpeedVideoSizes) {
            getHighSpeedVideoSizes = true;
            try {
                java.lang.reflect.Method declaredMethod = android.view.View.class.getDeclaredMethod("computeFitSystemWindows", android.graphics.Rect.class, android.graphics.Rect.class);
                getHighResolutionOutputSizeshNQ4ISI = declaredMethod;
                if (!declaredMethod.isAccessible()) {
                    getHighResolutionOutputSizeshNQ4ISI.setAccessible(true);
                }
            } catch (java.lang.NoSuchMethodException unused) {
            }
        }
        java.lang.reflect.Method method = getHighResolutionOutputSizeshNQ4ISI;
        if (method != null) {
            try {
                method.invoke(view, rect, rect2);
            } catch (java.lang.Exception unused2) {
            }
        }
    }

    public static void makeOptionalFitsSystemWindows(android.view.View view) {
        try {
            java.lang.reflect.Method method = view.getClass().getMethod("makeOptionalFitsSystemWindows", new java.lang.Class[0]);
            if (!method.isAccessible()) {
                method.setAccessible(true);
            }
            method.invoke(view, new java.lang.Object[0]);
        } catch (java.lang.IllegalAccessException | java.lang.NoSuchMethodException | java.lang.reflect.InvocationTargetException unused) {
        }
    }

    static class Api29Impl {
        private Api29Impl() {
        }

        static void getHighSpeedVideoFpsRangesFor(android.view.View view, android.graphics.Rect rect, android.graphics.Rect rect2) {
            android.graphics.Insets systemWindowInsets = view.computeSystemWindowInsets(new android.view.WindowInsets.Builder().setSystemWindowInsets(android.graphics.Insets.of(rect)).build(), rect2).getSystemWindowInsets();
            rect.set(systemWindowInsets.left, systemWindowInsets.top, systemWindowInsets.right, systemWindowInsets.bottom);
        }
    }
}
