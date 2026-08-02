package androidx.appcompat.widget;

/* loaded from: classes3.dex */
public class DrawableUtils {
    private static final int[] getHighResolutionOutputSizeshNQ4ISI = {android.R.attr.state_checked};
    private static final int[] getHighSpeedVideoFpsRangesFor = new int[0];
    public static final android.graphics.Rect INSETS_NONE = new android.graphics.Rect();

    @java.lang.Deprecated
    public static boolean canSafelyMutateDrawable(android.graphics.drawable.Drawable drawable) {
        return true;
    }

    private DrawableUtils() {
    }

    public static android.graphics.Rect getOpticalBounds(android.graphics.drawable.Drawable drawable) {
        if (android.os.Build.VERSION.SDK_INT >= 29) {
            android.graphics.Insets c_ = androidx.appcompat.widget.DrawableUtils.Api29Impl.c_(drawable);
            return new android.graphics.Rect(c_.left, c_.top, c_.right, c_.bottom);
        }
        return androidx.appcompat.widget.DrawableUtils.Api18Impl.getHighResolutionOutputSizeshNQ4ISI(androidx.core.graphics.drawable.DrawableCompat.unwrap(drawable));
    }

    static void getHighResolutionOutputSizeshNQ4ISI(android.graphics.drawable.Drawable drawable) {
        java.lang.String name2 = drawable.getClass().getName();
        if (android.os.Build.VERSION.SDK_INT < 29 || android.os.Build.VERSION.SDK_INT >= 31 || !"android.graphics.drawable.ColorStateListDrawable".equals(name2)) {
            return;
        }
        int[] state = drawable.getState();
        if (state == null || state.length == 0) {
            drawable.setState(getHighResolutionOutputSizeshNQ4ISI);
        } else {
            drawable.setState(getHighSpeedVideoFpsRangesFor);
        }
        drawable.setState(state);
    }

    public static android.graphics.PorterDuff.Mode parseTintMode(int i, android.graphics.PorterDuff.Mode mode) {
        if (i == 3) {
            return android.graphics.PorterDuff.Mode.SRC_OVER;
        }
        if (i == 5) {
            return android.graphics.PorterDuff.Mode.SRC_IN;
        }
        if (i == 9) {
            return android.graphics.PorterDuff.Mode.SRC_ATOP;
        }
        switch (i) {
            case 14:
                return android.graphics.PorterDuff.Mode.MULTIPLY;
            case 15:
                return android.graphics.PorterDuff.Mode.SCREEN;
            case 16:
                return android.graphics.PorterDuff.Mode.ADD;
            default:
                return mode;
        }
    }

    /* loaded from: classes5.dex */
    static class Api18Impl {
        private static final boolean Camera2StreamConfigurationMap;
        private static final java.lang.reflect.Field getHighResolutionOutputSizeshNQ4ISI;
        private static final java.lang.reflect.Field getHighSpeedVideoFpsRanges;
        private static final java.lang.reflect.Field getHighSpeedVideoFpsRangesFor;
        private static final java.lang.reflect.Method getHighSpeedVideoSizes;
        private static final java.lang.reflect.Field getOutputFormats;

        /* JADX WARN: Removed duplicated region for block: B:17:0x0037  */
        /* JADX WARN: Removed duplicated region for block: B:20:0x0044  */
        static {
            java.lang.reflect.Method method;
            java.lang.reflect.Field field;
            java.lang.reflect.Field field2;
            java.lang.reflect.Field field3;
            boolean z;
            java.lang.reflect.Field field4;
            java.lang.Class<?> cls;
            try {
                cls = java.lang.Class.forName("android.graphics.Insets");
                method = android.graphics.drawable.Drawable.class.getMethod("getOpticalInsets", new java.lang.Class[0]);
            } catch (java.lang.ClassNotFoundException | java.lang.NoSuchFieldException | java.lang.NoSuchMethodException unused) {
                method = null;
            }
            try {
                field = cls.getField(com.datadog.android.rum.internal.instrumentation.gestures.GesturesListener.SCROLL_DIRECTION_LEFT);
            } catch (java.lang.ClassNotFoundException | java.lang.NoSuchFieldException | java.lang.NoSuchMethodException unused2) {
                field = null;
                field2 = null;
                field3 = null;
                z = false;
                field4 = null;
                if (!z) {
                }
            }
            try {
                field2 = cls.getField(com.dyneti.android.dyscan.DyScanHelperTextPosition.TOP);
                try {
                    field3 = cls.getField(com.datadog.android.rum.internal.instrumentation.gestures.GesturesListener.SCROLL_DIRECTION_RIGHT);
                } catch (java.lang.ClassNotFoundException | java.lang.NoSuchFieldException | java.lang.NoSuchMethodException unused3) {
                    field3 = null;
                }
            } catch (java.lang.ClassNotFoundException | java.lang.NoSuchFieldException | java.lang.NoSuchMethodException unused4) {
                field2 = null;
                field3 = null;
                z = false;
                field4 = null;
                if (!z) {
                }
            }
            try {
                field4 = cls.getField(com.dyneti.android.dyscan.DyScanHelperTextPosition.BOTTOM);
                z = true;
            } catch (java.lang.ClassNotFoundException | java.lang.NoSuchFieldException | java.lang.NoSuchMethodException unused5) {
                z = false;
                field4 = null;
                if (!z) {
                }
            }
            if (!z) {
                getHighSpeedVideoSizes = method;
                getHighResolutionOutputSizeshNQ4ISI = field;
                getOutputFormats = field2;
                getHighSpeedVideoFpsRanges = field3;
                getHighSpeedVideoFpsRangesFor = field4;
                Camera2StreamConfigurationMap = true;
                return;
            }
            getHighSpeedVideoSizes = null;
            getHighResolutionOutputSizeshNQ4ISI = null;
            getOutputFormats = null;
            getHighSpeedVideoFpsRanges = null;
            getHighSpeedVideoFpsRangesFor = null;
            Camera2StreamConfigurationMap = false;
        }

        private Api18Impl() {
        }

        static android.graphics.Rect getHighResolutionOutputSizeshNQ4ISI(android.graphics.drawable.Drawable drawable) {
            if (android.os.Build.VERSION.SDK_INT < 29 && Camera2StreamConfigurationMap) {
                try {
                    java.lang.Object invoke = getHighSpeedVideoSizes.invoke(drawable, new java.lang.Object[0]);
                    if (invoke != null) {
                        return new android.graphics.Rect(getHighResolutionOutputSizeshNQ4ISI.getInt(invoke), getOutputFormats.getInt(invoke), getHighSpeedVideoFpsRanges.getInt(invoke), getHighSpeedVideoFpsRangesFor.getInt(invoke));
                    }
                } catch (java.lang.IllegalAccessException | java.lang.reflect.InvocationTargetException unused) {
                }
            }
            return androidx.appcompat.widget.DrawableUtils.INSETS_NONE;
        }
    }

    /* loaded from: classes5.dex */
    static class Api29Impl {
        private Api29Impl() {
        }

        static android.graphics.Insets c_(android.graphics.drawable.Drawable drawable) {
            return drawable.getOpticalInsets();
        }
    }
}
