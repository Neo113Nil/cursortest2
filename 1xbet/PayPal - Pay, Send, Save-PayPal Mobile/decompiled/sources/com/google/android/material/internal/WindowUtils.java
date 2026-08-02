package com.google.android.material.internal;

/* loaded from: classes8.dex */
public class WindowUtils {
    private static final java.lang.String TAG = "WindowUtils";

    private WindowUtils() {
    }

    public static android.graphics.Rect getCurrentWindowBounds(android.content.Context context) {
        android.view.WindowManager windowManager = (android.view.WindowManager) context.getSystemService(com.datadog.android.sessionreplay.internal.recorder.mapper.DecorViewMapper.WINDOW_KEY_NAME);
        if (android.os.Build.VERSION.SDK_INT >= 30) {
            return com.google.android.material.internal.WindowUtils.Api30Impl.getCurrentWindowBounds(windowManager);
        }
        return com.google.android.material.internal.WindowUtils.Api17Impl.getCurrentWindowBounds(windowManager);
    }

    static class Api30Impl {
        private Api30Impl() {
        }

        static android.graphics.Rect getCurrentWindowBounds(android.view.WindowManager windowManager) {
            return windowManager.getCurrentWindowMetrics().getBounds();
        }
    }

    static class Api17Impl {
        private Api17Impl() {
        }

        static android.graphics.Rect getCurrentWindowBounds(android.view.WindowManager windowManager) {
            android.view.Display defaultDisplay = windowManager.getDefaultDisplay();
            android.graphics.Point point = new android.graphics.Point();
            defaultDisplay.getRealSize(point);
            android.graphics.Rect rect = new android.graphics.Rect();
            rect.right = point.x;
            rect.bottom = point.y;
            return rect;
        }
    }

    static class Api14Impl {
        private Api14Impl() {
        }

        static android.graphics.Rect getCurrentWindowBounds(android.view.WindowManager windowManager) {
            android.view.Display defaultDisplay = windowManager.getDefaultDisplay();
            android.graphics.Point realSizeForDisplay = getRealSizeForDisplay(defaultDisplay);
            android.graphics.Rect rect = new android.graphics.Rect();
            if (realSizeForDisplay.x == 0 || realSizeForDisplay.y == 0) {
                defaultDisplay.getRectSize(rect);
                return rect;
            }
            rect.right = realSizeForDisplay.x;
            rect.bottom = realSizeForDisplay.y;
            return rect;
        }

        private static android.graphics.Point getRealSizeForDisplay(android.view.Display display) {
            android.graphics.Point point = new android.graphics.Point();
            try {
                java.lang.reflect.Method declaredMethod = android.view.Display.class.getDeclaredMethod("getRealSize", android.graphics.Point.class);
                declaredMethod.setAccessible(true);
                declaredMethod.invoke(display, point);
                return point;
            } catch (java.lang.IllegalAccessException unused) {
                java.lang.String unused2 = com.google.android.material.internal.WindowUtils.TAG;
                return point;
            } catch (java.lang.NoSuchMethodException unused3) {
                java.lang.String unused4 = com.google.android.material.internal.WindowUtils.TAG;
                return point;
            } catch (java.lang.reflect.InvocationTargetException unused5) {
                java.lang.String unused6 = com.google.android.material.internal.WindowUtils.TAG;
                return point;
            }
        }
    }
}
