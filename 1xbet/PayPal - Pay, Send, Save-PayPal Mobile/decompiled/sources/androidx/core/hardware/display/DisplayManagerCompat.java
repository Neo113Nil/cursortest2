package androidx.core.hardware.display;

/* loaded from: classes7.dex */
public final class DisplayManagerCompat {
    public static final java.lang.String DISPLAY_CATEGORY_BUILT_IN_DISPLAYS = "android.hardware.display.category.BUILT_IN_DISPLAYS";
    public static final java.lang.String DISPLAY_CATEGORY_PRESENTATION = "android.hardware.display.category.PRESENTATION";
    private final android.content.Context Camera2StreamConfigurationMap;

    private DisplayManagerCompat(android.content.Context context) {
        this.Camera2StreamConfigurationMap = context;
    }

    public static androidx.core.hardware.display.DisplayManagerCompat getInstance(android.content.Context context) {
        return new androidx.core.hardware.display.DisplayManagerCompat(context);
    }

    public final android.view.Display getDisplay(int i) {
        return ((android.hardware.display.DisplayManager) this.Camera2StreamConfigurationMap.getSystemService(com.google.firebase.messaging.Constants.ScionAnalytics.MessageType.DISPLAY_NOTIFICATION)).getDisplay(i);
    }

    public final android.view.Display[] getDisplays() {
        return ((android.hardware.display.DisplayManager) this.Camera2StreamConfigurationMap.getSystemService(com.google.firebase.messaging.Constants.ScionAnalytics.MessageType.DISPLAY_NOTIFICATION)).getDisplays();
    }

    public final android.view.Display[] getDisplays(java.lang.String str) {
        android.hardware.display.DisplayManager displayManager = (android.hardware.display.DisplayManager) this.Camera2StreamConfigurationMap.getSystemService(com.google.firebase.messaging.Constants.ScionAnalytics.MessageType.DISPLAY_NOTIFICATION);
        if (DISPLAY_CATEGORY_BUILT_IN_DISPLAYS.equals(str)) {
            return getHighSpeedVideoSizes(displayManager);
        }
        return ((android.hardware.display.DisplayManager) this.Camera2StreamConfigurationMap.getSystemService(com.google.firebase.messaging.Constants.ScionAnalytics.MessageType.DISPLAY_NOTIFICATION)).getDisplays(str);
    }

    private static android.view.Display[] getHighSpeedVideoSizes(android.hardware.display.DisplayManager displayManager) {
        android.view.Display[] displays;
        if (android.os.Build.VERSION.SDK_INT >= 33) {
            displays = displayManager.getDisplays("android.hardware.display.category.ALL_INCLUDING_DISABLED");
        } else {
            displays = displayManager.getDisplays();
        }
        android.view.Display[] displayArr = new android.view.Display[getHighSpeedVideoSizes(1, displays)];
        int i = 0;
        for (android.view.Display display : displays) {
            if (1 == getHighSpeedVideoFpsRanges(display)) {
                displayArr[i] = display;
                i++;
            }
        }
        return displayArr;
    }

    private static int getHighSpeedVideoSizes(int i, android.view.Display[] displayArr) {
        int i2 = 0;
        for (android.view.Display display : displayArr) {
            if (i == getHighSpeedVideoFpsRanges(display)) {
                i2++;
            }
        }
        return i2;
    }

    static int getHighSpeedVideoFpsRanges(android.view.Display display) {
        try {
            return ((java.lang.Integer) java.util.Objects.requireNonNull(android.view.Display.class.getMethod("getType", new java.lang.Class[0]).invoke(display, new java.lang.Object[0]))).intValue();
        } catch (java.lang.NoSuchMethodException unused) {
            return 0;
        } catch (java.lang.Exception e) {
            throw new java.lang.RuntimeException(e);
        }
    }
}
