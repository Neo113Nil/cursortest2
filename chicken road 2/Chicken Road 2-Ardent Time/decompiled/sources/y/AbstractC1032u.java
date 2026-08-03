package y;

/* renamed from: y.u, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1032u {
    public static android.view.View.AccessibilityDelegate a(android.view.View view) {
        return view.getAccessibilityDelegate();
    }

    public static android.view.contentcapture.ContentCaptureSession b(android.view.View view) {
        return view.getContentCaptureSession();
    }

    public static java.util.List<android.graphics.Rect> c(android.view.View view) {
        return view.getSystemGestureExclusionRects();
    }

    public static void d(android.view.View view, android.content.Context context, int[] iArr, android.util.AttributeSet attributeSet, android.content.res.TypedArray typedArray, int i2, int i3) {
        view.saveAttributeDataForStyleable(context, iArr, attributeSet, typedArray, i2, i3);
    }

    public static void e(android.view.View view, B.a aVar) {
        view.setContentCaptureSession(null);
    }

    public static void f(android.view.View view, java.util.List<android.graphics.Rect> list) {
        view.setSystemGestureExclusionRects(list);
    }
}
