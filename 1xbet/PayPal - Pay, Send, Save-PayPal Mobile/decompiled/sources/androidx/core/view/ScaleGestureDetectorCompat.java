package androidx.core.view;

/* loaded from: classes7.dex */
public final class ScaleGestureDetectorCompat {
    private ScaleGestureDetectorCompat() {
    }

    @java.lang.Deprecated
    public static void setQuickScaleEnabled(java.lang.Object obj, boolean z) {
        setQuickScaleEnabled((android.view.ScaleGestureDetector) obj, z);
    }

    @androidx.annotation.ReplaceWith(expression = "scaleGestureDetector.setQuickScaleEnabled(enabled)")
    @java.lang.Deprecated
    public static void setQuickScaleEnabled(android.view.ScaleGestureDetector scaleGestureDetector, boolean z) {
        scaleGestureDetector.setQuickScaleEnabled(z);
    }

    @java.lang.Deprecated
    public static boolean isQuickScaleEnabled(java.lang.Object obj) {
        return isQuickScaleEnabled((android.view.ScaleGestureDetector) obj);
    }

    @androidx.annotation.ReplaceWith(expression = "scaleGestureDetector.isQuickScaleEnabled()")
    @java.lang.Deprecated
    public static boolean isQuickScaleEnabled(android.view.ScaleGestureDetector scaleGestureDetector) {
        return scaleGestureDetector.isQuickScaleEnabled();
    }
}
