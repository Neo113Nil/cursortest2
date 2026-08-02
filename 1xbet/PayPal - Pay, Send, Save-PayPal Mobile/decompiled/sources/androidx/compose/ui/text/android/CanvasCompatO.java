package androidx.compose.ui.text.android;

@kotlin.Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\bÂ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ\u001d\u0010\f\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u000b¢\u0006\u0004\b\f\u0010\rJ5\u0010\u0012\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u000e¢\u0006\u0004\b\u0012\u0010\u0013J5\u0010\u0015\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00142\u0006\u0010\u000f\u001a\u00020\u00142\u0006\u0010\u0010\u001a\u00020\u00142\u0006\u0010\u0011\u001a\u00020\u0014¢\u0006\u0004\b\u0015\u0010\u0016J\u001d\u0010\f\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0017¢\u0006\u0004\b\f\u0010\u0018"}, d2 = {"Landroidx/compose/ui/text/android/CanvasCompatO;", "", "<init>", "()V", "Landroid/graphics/Canvas;", "p0", "Landroid/graphics/RectF;", "p1", "", "getHighResolutionOutputSizeshNQ4ISI", "(Landroid/graphics/Canvas;Landroid/graphics/RectF;)Z", "Landroid/graphics/Rect;", "getHighSpeedVideoFpsRangesFor", "(Landroid/graphics/Canvas;Landroid/graphics/Rect;)Z", "", "p2", "p3", "p4", "getHighSpeedVideoSizes", "(Landroid/graphics/Canvas;FFFF)Z", "", "getHighSpeedVideoFpsRanges", "(Landroid/graphics/Canvas;IIII)Z", "Landroid/graphics/Path;", "(Landroid/graphics/Canvas;Landroid/graphics/Path;)Z"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
final class CanvasCompatO {
    public static final androidx.compose.ui.text.android.CanvasCompatO INSTANCE = new androidx.compose.ui.text.android.CanvasCompatO();

    private CanvasCompatO() {
    }

    public final boolean getHighResolutionOutputSizeshNQ4ISI(android.graphics.Canvas p0, android.graphics.RectF p1) {
        return p0.clipOutRect(p1);
    }

    public final boolean getHighSpeedVideoFpsRangesFor(android.graphics.Canvas p0, android.graphics.Rect p1) {
        return p0.clipOutRect(p1);
    }

    public final boolean getHighSpeedVideoSizes(android.graphics.Canvas p0, float p1, float p2, float p3, float p4) {
        return p0.clipOutRect(p1, p2, p3, p4);
    }

    public final boolean getHighSpeedVideoFpsRanges(android.graphics.Canvas p0, int p1, int p2, int p3, int p4) {
        return p0.clipOutRect(p1, p2, p3, p4);
    }

    public final boolean getHighSpeedVideoFpsRangesFor(android.graphics.Canvas p0, android.graphics.Path p1) {
        return p0.clipOutPath(p1);
    }
}
