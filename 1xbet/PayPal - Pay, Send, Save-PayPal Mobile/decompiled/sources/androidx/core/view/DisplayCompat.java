package androidx.core.view;

/* loaded from: classes3.dex */
public final class DisplayCompat {
    private DisplayCompat() {
    }

    public static androidx.core.view.DisplayCompat.ModeCompat getMode(android.content.Context context, android.view.Display display) {
        return androidx.core.view.DisplayCompat.Api23Impl.getHighSpeedVideoFpsRangesFor(context, display);
    }

    public static androidx.core.view.DisplayCompat.ModeCompat[] getSupportedModes(android.content.Context context, android.view.Display display) {
        return androidx.core.view.DisplayCompat.Api23Impl.getHighSpeedVideoFpsRanges(context, display);
    }

    private static android.graphics.Point getHighSpeedVideoFpsRanges(java.lang.String str) throws java.lang.NumberFormatException {
        java.lang.String[] split = str.trim().split("x", -1);
        if (split.length == 2) {
            int parseInt = java.lang.Integer.parseInt(split[0]);
            int parseInt2 = java.lang.Integer.parseInt(split[1]);
            if (parseInt > 0 && parseInt2 > 0) {
                return new android.graphics.Point(parseInt, parseInt2);
            }
        }
        throw new java.lang.NumberFormatException();
    }

    private static java.lang.String Camera2StreamConfigurationMap(java.lang.String str) {
        try {
            java.lang.Class<?> cls = java.lang.Class.forName("android.os.SystemProperties");
            return (java.lang.String) cls.getMethod("get", java.lang.String.class).invoke(cls, str);
        } catch (java.lang.Exception unused) {
            return null;
        }
    }

    private static boolean getHighSpeedVideoSizes(android.content.Context context) {
        android.app.UiModeManager uiModeManager = (android.app.UiModeManager) context.getSystemService("uimode");
        return uiModeManager != null && uiModeManager.getCurrentModeType() == 4;
    }

    private static android.graphics.Point getHighResolutionOutputSizeshNQ4ISI(java.lang.String str, android.view.Display display) {
        if (display.getDisplayId() != 0) {
            return null;
        }
        java.lang.String Camera2StreamConfigurationMap = Camera2StreamConfigurationMap(str);
        if (!android.text.TextUtils.isEmpty(Camera2StreamConfigurationMap) && Camera2StreamConfigurationMap != null) {
            try {
                return getHighSpeedVideoFpsRanges(Camera2StreamConfigurationMap);
            } catch (java.lang.NumberFormatException unused) {
            }
        }
        return null;
    }

    static android.graphics.Point Camera2StreamConfigurationMap(android.content.Context context, android.view.Display display) {
        android.graphics.Point highResolutionOutputSizeshNQ4ISI;
        if (android.os.Build.VERSION.SDK_INT < 28) {
            highResolutionOutputSizeshNQ4ISI = getHighResolutionOutputSizeshNQ4ISI("sys.display-size", display);
        } else {
            highResolutionOutputSizeshNQ4ISI = getHighResolutionOutputSizeshNQ4ISI("vendor.display-size", display);
        }
        if (highResolutionOutputSizeshNQ4ISI != null) {
            return highResolutionOutputSizeshNQ4ISI;
        }
        if (getHighSpeedVideoFpsRangesFor(context) && getHighSpeedVideoFpsRanges(display)) {
            return new android.graphics.Point(3840, 2160);
        }
        return null;
    }

    private static boolean getHighSpeedVideoFpsRangesFor(android.content.Context context) {
        return getHighSpeedVideoSizes(context) && "Sony".equals(android.os.Build.MANUFACTURER) && android.os.Build.MODEL.startsWith("BRAVIA") && context.getPackageManager().hasSystemFeature("com.sony.dtv.hardware.panel.qfhd");
    }

    static boolean getHighSpeedVideoFpsRanges(android.view.Display display) {
        return androidx.core.view.DisplayCompat.Api23Impl.getHighSpeedVideoFpsRangesFor(display);
    }

    public static androidx.core.view.RoundedCornerCompat getRoundedCorner(android.view.Display display, int i) {
        if (android.os.Build.VERSION.SDK_INT >= 31) {
            return androidx.core.view.RoundedCornerCompat.cy_(display.getRoundedCorner(i));
        }
        return null;
    }

    public static androidx.core.view.DisplayShapeCompat getShape(android.content.Context context, android.view.Display display) {
        java.util.Objects.requireNonNull(context);
        java.util.Objects.requireNonNull(display);
        if (android.os.Build.VERSION.SDK_INT >= 34) {
            return androidx.core.view.DisplayShapeCompat.cs_(display.getShape());
        }
        android.graphics.Point Camera2StreamConfigurationMap = Camera2StreamConfigurationMap(context, display);
        androidx.core.view.RoundedCornerCompat roundedCorner = getRoundedCorner(display, 0);
        androidx.core.view.RoundedCornerCompat roundedCorner2 = getRoundedCorner(display, 1);
        androidx.core.view.RoundedCornerCompat roundedCorner3 = getRoundedCorner(display, 2);
        androidx.core.view.RoundedCornerCompat roundedCorner4 = getRoundedCorner(display, 3);
        return androidx.core.view.DisplayShapeCompat.create(Camera2StreamConfigurationMap.x, Camera2StreamConfigurationMap.y, false, roundedCorner != null ? roundedCorner.getRadius() : 0, roundedCorner2 != null ? roundedCorner2.getRadius() : 0, roundedCorner3 != null ? roundedCorner3.getRadius() : 0, roundedCorner4 != null ? roundedCorner4.getRadius() : 0);
    }

    /* loaded from: classes7.dex */
    static class Api23Impl {
        private Api23Impl() {
        }

        static androidx.core.view.DisplayCompat.ModeCompat getHighSpeedVideoFpsRangesFor(android.content.Context context, android.view.Display display) {
            android.view.Display.Mode mode = display.getMode();
            android.graphics.Point Camera2StreamConfigurationMap = androidx.core.view.DisplayCompat.Camera2StreamConfigurationMap(context, display);
            if (Camera2StreamConfigurationMap == null || Camera2StreamConfigurationMap(mode, Camera2StreamConfigurationMap)) {
                return new androidx.core.view.DisplayCompat.ModeCompat(mode, true);
            }
            return new androidx.core.view.DisplayCompat.ModeCompat(mode, Camera2StreamConfigurationMap);
        }

        public static androidx.core.view.DisplayCompat.ModeCompat[] getHighSpeedVideoFpsRanges(android.content.Context context, android.view.Display display) {
            androidx.core.view.DisplayCompat.ModeCompat modeCompat;
            android.view.Display.Mode[] supportedModes = display.getSupportedModes();
            androidx.core.view.DisplayCompat.ModeCompat[] modeCompatArr = new androidx.core.view.DisplayCompat.ModeCompat[supportedModes.length];
            android.view.Display.Mode mode = display.getMode();
            android.graphics.Point Camera2StreamConfigurationMap = androidx.core.view.DisplayCompat.Camera2StreamConfigurationMap(context, display);
            if (Camera2StreamConfigurationMap == null || Camera2StreamConfigurationMap(mode, Camera2StreamConfigurationMap)) {
                for (int i = 0; i < supportedModes.length; i++) {
                    modeCompatArr[i] = new androidx.core.view.DisplayCompat.ModeCompat(supportedModes[i], Camera2StreamConfigurationMap(supportedModes[i], mode));
                }
            } else {
                for (int i2 = 0; i2 < supportedModes.length; i2++) {
                    if (Camera2StreamConfigurationMap(supportedModes[i2], mode)) {
                        modeCompat = new androidx.core.view.DisplayCompat.ModeCompat(supportedModes[i2], Camera2StreamConfigurationMap);
                    } else {
                        modeCompat = new androidx.core.view.DisplayCompat.ModeCompat(supportedModes[i2], false);
                    }
                    modeCompatArr[i2] = modeCompat;
                }
            }
            return modeCompatArr;
        }

        static boolean getHighSpeedVideoFpsRangesFor(android.view.Display display) {
            android.view.Display.Mode mode = display.getMode();
            for (android.view.Display.Mode mode2 : display.getSupportedModes()) {
                if (mode.getPhysicalHeight() < mode2.getPhysicalHeight() || mode.getPhysicalWidth() < mode2.getPhysicalWidth()) {
                    return false;
                }
            }
            return true;
        }

        static boolean Camera2StreamConfigurationMap(android.view.Display.Mode mode, android.graphics.Point point) {
            if (mode.getPhysicalWidth() == point.x && mode.getPhysicalHeight() == point.y) {
                return true;
            }
            return mode.getPhysicalWidth() == point.y && mode.getPhysicalHeight() == point.x;
        }

        static boolean Camera2StreamConfigurationMap(android.view.Display.Mode mode, android.view.Display.Mode mode2) {
            return mode.getPhysicalWidth() == mode2.getPhysicalWidth() && mode.getPhysicalHeight() == mode2.getPhysicalHeight();
        }
    }

    /* loaded from: classes7.dex */
    public static final class ModeCompat {
        private final boolean Camera2StreamConfigurationMap;
        private final android.graphics.Point getHighSpeedVideoFpsRanges;
        private final android.view.Display.Mode getHighSpeedVideoFpsRangesFor;

        ModeCompat(android.view.Display.Mode mode, boolean z) {
            androidx.core.util.Preconditions.checkNotNull(mode, "mode == null, can't wrap a null reference");
            this.getHighSpeedVideoFpsRanges = new android.graphics.Point(mode.getPhysicalWidth(), mode.getPhysicalHeight());
            this.getHighSpeedVideoFpsRangesFor = mode;
            this.Camera2StreamConfigurationMap = z;
        }

        ModeCompat(android.view.Display.Mode mode, android.graphics.Point point) {
            androidx.core.util.Preconditions.checkNotNull(mode, "mode == null, can't wrap a null reference");
            androidx.core.util.Preconditions.checkNotNull(point, "physicalSize == null");
            this.getHighSpeedVideoFpsRanges = point;
            this.getHighSpeedVideoFpsRangesFor = mode;
            this.Camera2StreamConfigurationMap = true;
        }

        public final int getPhysicalWidth() {
            return this.getHighSpeedVideoFpsRanges.x;
        }

        public final int getPhysicalHeight() {
            return this.getHighSpeedVideoFpsRanges.y;
        }

        @java.lang.Deprecated
        public final boolean isNative() {
            return this.Camera2StreamConfigurationMap;
        }

        public final android.view.Display.Mode toMode() {
            return this.getHighSpeedVideoFpsRangesFor;
        }
    }
}
