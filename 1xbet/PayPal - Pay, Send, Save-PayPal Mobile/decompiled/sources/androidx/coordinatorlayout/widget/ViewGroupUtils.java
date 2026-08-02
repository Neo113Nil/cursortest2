package androidx.coordinatorlayout.widget;

/* loaded from: classes7.dex */
public class ViewGroupUtils {
    private static final java.lang.ThreadLocal<android.graphics.Matrix> getHighSpeedVideoFpsRanges = new java.lang.ThreadLocal<>();
    private static final java.lang.ThreadLocal<android.graphics.RectF> getHighSpeedVideoFpsRangesFor = new java.lang.ThreadLocal<>();

    public static void getDescendantRect(android.view.ViewGroup viewGroup, android.view.View view, android.graphics.Rect rect) {
        rect.set(0, 0, view.getWidth(), view.getHeight());
        java.lang.ThreadLocal<android.graphics.Matrix> threadLocal = getHighSpeedVideoFpsRanges;
        android.graphics.Matrix matrix = threadLocal.get();
        if (matrix == null) {
            matrix = new android.graphics.Matrix();
            threadLocal.set(matrix);
        } else {
            matrix.reset();
        }
        Camera2StreamConfigurationMap(viewGroup, view, matrix);
        java.lang.ThreadLocal<android.graphics.RectF> threadLocal2 = getHighSpeedVideoFpsRangesFor;
        android.graphics.RectF rectF = threadLocal2.get();
        if (rectF == null) {
            rectF = new android.graphics.RectF();
            threadLocal2.set(rectF);
        }
        rectF.set(rect);
        matrix.mapRect(rectF);
        rect.set((int) (rectF.left + 0.5f), (int) (rectF.top + 0.5f), (int) (rectF.right + 0.5f), (int) (rectF.bottom + 0.5f));
    }

    private static void Camera2StreamConfigurationMap(android.view.ViewParent viewParent, android.view.View view, android.graphics.Matrix matrix) {
        java.lang.Object parent = view.getParent();
        if ((parent instanceof android.view.View) && parent != viewParent) {
            Camera2StreamConfigurationMap(viewParent, (android.view.View) parent, matrix);
            matrix.preTranslate(-r0.getScrollX(), -r0.getScrollY());
        }
        matrix.preTranslate(view.getLeft(), view.getTop());
        if (view.getMatrix().isIdentity()) {
            return;
        }
        matrix.preConcat(view.getMatrix());
    }

    private ViewGroupUtils() {
    }
}
