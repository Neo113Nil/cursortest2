package androidx.core.view;

/* loaded from: classes.dex */
public final class ViewConfigurationCompat {
    @androidx.annotation.ReplaceWith(expression = "config.getScaledPagingTouchSlop()")
    @java.lang.Deprecated
    public static int getScaledPagingTouchSlop(android.view.ViewConfiguration viewConfiguration) {
        return viewConfiguration.getScaledPagingTouchSlop();
    }

    @androidx.annotation.ReplaceWith(expression = "config.hasPermanentMenuKey()")
    @java.lang.Deprecated
    public static boolean hasPermanentMenuKey(android.view.ViewConfiguration viewConfiguration) {
        return viewConfiguration.hasPermanentMenuKey();
    }

    public static float getScaledHorizontalScrollFactor(android.view.ViewConfiguration viewConfiguration, android.content.Context context) {
        return androidx.core.view.ViewConfigurationCompat.Api26Impl.getHighSpeedVideoFpsRangesFor(viewConfiguration);
    }

    public static float getScaledVerticalScrollFactor(android.view.ViewConfiguration viewConfiguration, android.content.Context context) {
        return androidx.core.view.ViewConfigurationCompat.Api26Impl.getHighResolutionOutputSizeshNQ4ISI(viewConfiguration);
    }

    public static int getScaledHoverSlop(android.view.ViewConfiguration viewConfiguration) {
        if (android.os.Build.VERSION.SDK_INT >= 28) {
            return androidx.core.view.ViewConfigurationCompat.Api28Impl.Camera2StreamConfigurationMap(viewConfiguration);
        }
        return viewConfiguration.getScaledTouchSlop() / 2;
    }

    public static boolean shouldShowMenuShortcutsWhenKeyboardPresent(android.view.ViewConfiguration viewConfiguration, android.content.Context context) {
        if (android.os.Build.VERSION.SDK_INT >= 28) {
            return androidx.core.view.ViewConfigurationCompat.Api28Impl.getHighSpeedVideoSizes(viewConfiguration);
        }
        android.content.res.Resources resources = context.getResources();
        int highSpeedVideoFpsRanges = getHighSpeedVideoFpsRanges(resources, "config_showMenuShortcutsWhenKeyboardPresent", com.adobe.marketing.mobile.launch.rulesengine.LaunchRulesEngineConstants.Transform.TRANSFORM_TO_BOOL);
        return highSpeedVideoFpsRanges != 0 && resources.getBoolean(highSpeedVideoFpsRanges);
    }

    public static int getScaledMinimumFlingVelocity(android.content.Context context, final android.view.ViewConfiguration viewConfiguration, int i, int i2, int i3) {
        if (android.os.Build.VERSION.SDK_INT >= 34) {
            return androidx.core.view.ViewConfigurationCompat.Api34Impl.getHighSpeedVideoFpsRangesFor(viewConfiguration, i, i2, i3);
        }
        if (!Camera2StreamConfigurationMap(i, i2, i3)) {
            return Integer.MAX_VALUE;
        }
        android.content.res.Resources resources = context.getResources();
        int highSpeedVideoFpsRangesFor = getHighSpeedVideoFpsRangesFor(resources, i3, i2);
        java.util.Objects.requireNonNull(viewConfiguration);
        return Camera2StreamConfigurationMap(resources, highSpeedVideoFpsRangesFor, new androidx.core.util.Supplier() { // from class: androidx.core.view.ViewConfigurationCompat$$ExternalSyntheticLambda1
            @Override // androidx.core.util.Supplier
            public final java.lang.Object get() {
                int scaledMinimumFlingVelocity;
                scaledMinimumFlingVelocity = viewConfiguration.getScaledMinimumFlingVelocity();
                return java.lang.Integer.valueOf(scaledMinimumFlingVelocity);
            }
        }, Integer.MAX_VALUE);
    }

    public static int getScaledMaximumFlingVelocity(android.content.Context context, final android.view.ViewConfiguration viewConfiguration, int i, int i2, int i3) {
        if (android.os.Build.VERSION.SDK_INT >= 34) {
            return androidx.core.view.ViewConfigurationCompat.Api34Impl.Camera2StreamConfigurationMap(viewConfiguration, i, i2, i3);
        }
        if (!Camera2StreamConfigurationMap(i, i2, i3)) {
            return Integer.MIN_VALUE;
        }
        android.content.res.Resources resources = context.getResources();
        int Camera2StreamConfigurationMap = Camera2StreamConfigurationMap(resources, i3, i2);
        java.util.Objects.requireNonNull(viewConfiguration);
        return Camera2StreamConfigurationMap(resources, Camera2StreamConfigurationMap, new androidx.core.util.Supplier() { // from class: androidx.core.view.ViewConfigurationCompat$$ExternalSyntheticLambda0
            @Override // androidx.core.util.Supplier
            public final java.lang.Object get() {
                int scaledMaximumFlingVelocity;
                scaledMaximumFlingVelocity = viewConfiguration.getScaledMaximumFlingVelocity();
                return java.lang.Integer.valueOf(scaledMaximumFlingVelocity);
            }
        }, Integer.MIN_VALUE);
    }

    private ViewConfigurationCompat() {
    }

    /* loaded from: classes7.dex */
    static class Api26Impl {
        private Api26Impl() {
        }

        static float getHighSpeedVideoFpsRangesFor(android.view.ViewConfiguration viewConfiguration) {
            return viewConfiguration.getScaledHorizontalScrollFactor();
        }

        static float getHighResolutionOutputSizeshNQ4ISI(android.view.ViewConfiguration viewConfiguration) {
            return viewConfiguration.getScaledVerticalScrollFactor();
        }
    }

    /* loaded from: classes3.dex */
    static class Api28Impl {
        private Api28Impl() {
        }

        static int Camera2StreamConfigurationMap(android.view.ViewConfiguration viewConfiguration) {
            return viewConfiguration.getScaledHoverSlop();
        }

        static boolean getHighSpeedVideoSizes(android.view.ViewConfiguration viewConfiguration) {
            return viewConfiguration.shouldShowMenuShortcutsWhenKeyboardPresent();
        }
    }

    /* loaded from: classes7.dex */
    static class Api34Impl {
        private Api34Impl() {
        }

        static int Camera2StreamConfigurationMap(android.view.ViewConfiguration viewConfiguration, int i, int i2, int i3) {
            return viewConfiguration.getScaledMaximumFlingVelocity(i, i2, i3);
        }

        static int getHighSpeedVideoFpsRangesFor(android.view.ViewConfiguration viewConfiguration, int i, int i2, int i3) {
            return viewConfiguration.getScaledMinimumFlingVelocity(i, i2, i3);
        }
    }

    private static int Camera2StreamConfigurationMap(android.content.res.Resources resources, int i, int i2) {
        if (i == 4194304 && i2 == 26) {
            return getHighSpeedVideoFpsRanges(resources, "config_viewMaxRotaryEncoderFlingVelocity", "dimen");
        }
        return -1;
    }

    private static int getHighSpeedVideoFpsRangesFor(android.content.res.Resources resources, int i, int i2) {
        if (i == 4194304 && i2 == 26) {
            return getHighSpeedVideoFpsRanges(resources, "config_viewMinRotaryEncoderFlingVelocity", "dimen");
        }
        return -1;
    }

    private static int getHighSpeedVideoFpsRanges(android.content.res.Resources resources, java.lang.String str, java.lang.String str2) {
        return resources.getIdentifier(str, str2, com.datadog.android.core.internal.CoreFeature.DEFAULT_SOURCE_NAME);
    }

    private static boolean Camera2StreamConfigurationMap(int i, int i2, int i3) {
        android.view.InputDevice device = android.view.InputDevice.getDevice(i);
        return (device == null || device.getMotionRange(i2, i3) == null) ? false : true;
    }

    private static int Camera2StreamConfigurationMap(android.content.res.Resources resources, int i, androidx.core.util.Supplier<java.lang.Integer> supplier, int i2) {
        int dimensionPixelSize;
        if (i != -1) {
            return (i == 0 || (dimensionPixelSize = resources.getDimensionPixelSize(i)) < 0) ? i2 : dimensionPixelSize;
        }
        return supplier.get().intValue();
    }
}
