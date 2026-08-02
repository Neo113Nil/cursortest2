package androidx.transition;

/* loaded from: classes3.dex */
class ViewUtils {
    private static final androidx.transition.ViewUtilsApi19 getHighResolutionOutputSizeshNQ4ISI;
    static final android.util.Property<android.view.View, java.lang.Float> getHighSpeedVideoFpsRangesFor;
    static final android.util.Property<android.view.View, android.graphics.Rect> getHighSpeedVideoSizes;

    static {
        if (android.os.Build.VERSION.SDK_INT >= 29) {
            getHighResolutionOutputSizeshNQ4ISI = new androidx.transition.ViewUtilsApi29();
        } else {
            getHighResolutionOutputSizeshNQ4ISI = new androidx.transition.ViewUtilsApi23();
        }
        getHighSpeedVideoFpsRangesFor = new android.util.Property<android.view.View, java.lang.Float>(java.lang.Float.class, "translationAlpha") { // from class: androidx.transition.ViewUtils.1
            @Override // android.util.Property
            public /* synthetic */ java.lang.Float get(android.view.View view) {
                return java.lang.Float.valueOf(androidx.transition.ViewUtils.getHighSpeedVideoSizes(view));
            }

            @Override // android.util.Property
            public /* synthetic */ void set(android.view.View view, java.lang.Float f) {
                androidx.transition.ViewUtils.getHighResolutionOutputSizeshNQ4ISI(view, f.floatValue());
            }
        };
        getHighSpeedVideoSizes = new android.util.Property<android.view.View, android.graphics.Rect>(android.graphics.Rect.class, "clipBounds") { // from class: androidx.transition.ViewUtils.2
            @Override // android.util.Property
            public /* synthetic */ android.graphics.Rect get(android.view.View view) {
                return view.getClipBounds();
            }

            @Override // android.util.Property
            public /* synthetic */ void set(android.view.View view, android.graphics.Rect rect) {
                view.setClipBounds(rect);
            }
        };
    }

    static void getHighResolutionOutputSizeshNQ4ISI(android.view.View view, float f) {
        getHighResolutionOutputSizeshNQ4ISI.getHighSpeedVideoSizes(view, f);
    }

    static float getHighSpeedVideoSizes(android.view.View view) {
        return getHighResolutionOutputSizeshNQ4ISI.getHighSpeedVideoFpsRangesFor(view);
    }

    static void getHighSpeedVideoFpsRanges(android.view.View view) {
        getHighResolutionOutputSizeshNQ4ISI.getHighSpeedVideoSizes(view);
    }

    static void Camera2StreamConfigurationMap(android.view.View view) {
        getHighResolutionOutputSizeshNQ4ISI.Camera2StreamConfigurationMap(view);
    }

    static void getHighSpeedVideoFpsRanges(android.view.View view, int i) {
        getHighResolutionOutputSizeshNQ4ISI.Camera2StreamConfigurationMap(view, i);
    }

    static void getHighSpeedVideoFpsRangesFor(android.view.View view, android.graphics.Matrix matrix) {
        getHighResolutionOutputSizeshNQ4ISI.getHighSpeedVideoSizes(view, matrix);
    }

    static void Camera2StreamConfigurationMap(android.view.View view, android.graphics.Matrix matrix) {
        getHighResolutionOutputSizeshNQ4ISI.getHighSpeedVideoFpsRanges(view, matrix);
    }

    static void getHighResolutionOutputSizeshNQ4ISI(android.view.View view, android.graphics.Matrix matrix) {
        getHighResolutionOutputSizeshNQ4ISI.Camera2StreamConfigurationMap(view, matrix);
    }

    static void getHighResolutionOutputSizeshNQ4ISI(android.view.View view, int i, int i2, int i3, int i4) {
        getHighResolutionOutputSizeshNQ4ISI.getHighSpeedVideoFpsRangesFor(view, i, i2, i3, i4);
    }

    private ViewUtils() {
    }
}
