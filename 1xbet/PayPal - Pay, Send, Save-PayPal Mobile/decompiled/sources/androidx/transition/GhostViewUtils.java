package androidx.transition;

/* loaded from: classes7.dex */
class GhostViewUtils {
    static androidx.transition.GhostView getHighSpeedVideoFpsRangesFor(android.view.View view, android.view.ViewGroup viewGroup, android.graphics.Matrix matrix) {
        if (android.os.Build.VERSION.SDK_INT == 28) {
            return androidx.transition.GhostViewPlatform.getHighSpeedVideoFpsRangesFor(view, viewGroup, matrix);
        }
        return androidx.transition.GhostViewPort.Camera2StreamConfigurationMap(view, viewGroup, matrix);
    }

    static void getHighSpeedVideoFpsRangesFor(android.view.View view) {
        if (android.os.Build.VERSION.SDK_INT == 28) {
            androidx.transition.GhostViewPlatform.getHighSpeedVideoFpsRangesFor(view);
        } else {
            androidx.transition.GhostViewPort.Camera2StreamConfigurationMap(view);
        }
    }

    private GhostViewUtils() {
    }
}
