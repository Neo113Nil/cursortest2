package androidx.transition;

/* loaded from: classes7.dex */
class CanvasUtils {
    private static boolean getHighSpeedVideoFpsRanges;
    private static java.lang.reflect.Method getHighSpeedVideoFpsRangesFor;
    private static java.lang.reflect.Method getHighSpeedVideoSizes;

    static void Camera2StreamConfigurationMap(android.graphics.Canvas canvas, boolean z) {
        java.lang.reflect.Method method;
        if (android.os.Build.VERSION.SDK_INT >= 29) {
            if (z) {
                androidx.transition.CanvasUtils.Api29Impl.getHighSpeedVideoSizes(canvas);
                return;
            } else {
                androidx.transition.CanvasUtils.Api29Impl.getHighResolutionOutputSizeshNQ4ISI(canvas);
                return;
            }
        }
        if (android.os.Build.VERSION.SDK_INT == 28) {
            throw new java.lang.IllegalStateException("This method doesn't work on Pie!");
        }
        if (!getHighSpeedVideoFpsRanges) {
            try {
                java.lang.reflect.Method declaredMethod = android.graphics.Canvas.class.getDeclaredMethod("insertReorderBarrier", new java.lang.Class[0]);
                getHighSpeedVideoSizes = declaredMethod;
                declaredMethod.setAccessible(true);
                java.lang.reflect.Method declaredMethod2 = android.graphics.Canvas.class.getDeclaredMethod("insertInorderBarrier", new java.lang.Class[0]);
                getHighSpeedVideoFpsRangesFor = declaredMethod2;
                declaredMethod2.setAccessible(true);
            } catch (java.lang.NoSuchMethodException unused) {
            }
            getHighSpeedVideoFpsRanges = true;
        }
        if (z) {
            try {
                java.lang.reflect.Method method2 = getHighSpeedVideoSizes;
                if (method2 != null) {
                    method2.invoke(canvas, new java.lang.Object[0]);
                }
            } catch (java.lang.IllegalAccessException unused2) {
                return;
            } catch (java.lang.reflect.InvocationTargetException e) {
                throw new java.lang.RuntimeException(e.getCause());
            }
        }
        if (z || (method = getHighSpeedVideoFpsRangesFor) == null) {
            return;
        }
        method.invoke(canvas, new java.lang.Object[0]);
    }

    private CanvasUtils() {
    }

    static class Api29Impl {
        private Api29Impl() {
        }

        static void getHighSpeedVideoSizes(android.graphics.Canvas canvas) {
            canvas.enableZ();
        }

        static void getHighResolutionOutputSizeshNQ4ISI(android.graphics.Canvas canvas) {
            canvas.disableZ();
        }
    }
}
