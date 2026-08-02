package androidx.compose.ui.text.android;

@kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0005\bÂ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u000b¢\u0006\u0004\b\t\u0010\fJ5\u0010\u0011\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\r¢\u0006\u0004\b\u0011\u0010\u0012"}, d2 = {"Landroidx/compose/ui/text/android/CanvasCompatR;", "", "<init>", "()V", "Landroid/graphics/Canvas;", "p0", "Landroid/graphics/RectF;", "p1", "", "getHighSpeedVideoSizes", "(Landroid/graphics/Canvas;Landroid/graphics/RectF;)Z", "Landroid/graphics/Path;", "(Landroid/graphics/Canvas;Landroid/graphics/Path;)Z", "", "p2", "p3", "p4", "Camera2StreamConfigurationMap", "(Landroid/graphics/Canvas;FFFF)Z"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
final class CanvasCompatR {
    public static final androidx.compose.ui.text.android.CanvasCompatR INSTANCE = new androidx.compose.ui.text.android.CanvasCompatR();

    private CanvasCompatR() {
    }

    public final boolean getHighSpeedVideoSizes(android.graphics.Canvas p0, android.graphics.RectF p1) {
        return p0.quickReject(p1);
    }

    public final boolean getHighSpeedVideoSizes(android.graphics.Canvas p0, android.graphics.Path p1) {
        return p0.quickReject(p1);
    }

    public final boolean Camera2StreamConfigurationMap(android.graphics.Canvas p0, float p1, float p2, float p3, float p4) {
        return p0.quickReject(p1, p2, p3, p4);
    }
}
