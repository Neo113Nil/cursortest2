package androidx.transition;

/* loaded from: classes3.dex */
class ViewGroupUtils {
    private static boolean Camera2StreamConfigurationMap = false;
    private static boolean getHighResolutionOutputSizeshNQ4ISI = true;
    private static java.lang.reflect.Method getHighSpeedVideoSizes;

    static void Camera2StreamConfigurationMap(android.view.ViewGroup viewGroup, boolean z) {
        if (android.os.Build.VERSION.SDK_INT >= 29) {
            androidx.transition.ViewGroupUtils.Api29Impl.getHighSpeedVideoFpsRangesFor(viewGroup, z);
        } else if (getHighResolutionOutputSizeshNQ4ISI) {
            try {
                androidx.transition.ViewGroupUtils.Api29Impl.getHighSpeedVideoFpsRangesFor(viewGroup, z);
            } catch (java.lang.NoSuchMethodError unused) {
                getHighResolutionOutputSizeshNQ4ISI = false;
            }
        }
    }

    static int getHighSpeedVideoFpsRangesFor(android.view.ViewGroup viewGroup, int i) {
        if (android.os.Build.VERSION.SDK_INT >= 29) {
            return androidx.transition.ViewGroupUtils.Api29Impl.getHighSpeedVideoSizes(viewGroup, i);
        }
        if (!Camera2StreamConfigurationMap) {
            try {
                java.lang.reflect.Method declaredMethod = android.view.ViewGroup.class.getDeclaredMethod("getChildDrawingOrder", java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                getHighSpeedVideoSizes = declaredMethod;
                declaredMethod.setAccessible(true);
            } catch (java.lang.NoSuchMethodException unused) {
            }
            Camera2StreamConfigurationMap = true;
        }
        java.lang.reflect.Method method = getHighSpeedVideoSizes;
        if (method != null) {
            try {
                return ((java.lang.Integer) method.invoke(viewGroup, java.lang.Integer.valueOf(viewGroup.getChildCount()), java.lang.Integer.valueOf(i))).intValue();
            } catch (java.lang.IllegalAccessException | java.lang.reflect.InvocationTargetException unused2) {
            }
        }
        return i;
    }

    private ViewGroupUtils() {
    }

    static class Api29Impl {
        private Api29Impl() {
        }

        static void getHighSpeedVideoFpsRangesFor(android.view.ViewGroup viewGroup, boolean z) {
            viewGroup.suppressLayout(z);
        }

        static int getHighSpeedVideoSizes(android.view.ViewGroup viewGroup, int i) {
            return viewGroup.getChildDrawingOrder(i);
        }
    }
}
