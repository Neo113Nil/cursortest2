package androidx.compose.ui.text.android;

@kotlin.Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0015\n\u0002\u0010\b\n\u0002\u0010\u0014\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÂ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J/\u0010\r\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\r\u0010\u000eJ/\u0010\u0010\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u000f2\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u0010\u0010\u0011JM\u0010\u001a\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00122\u0006\u0010\t\u001a\u00020\u00132\u0006\u0010\u000b\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u00132\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0019\u001a\u00020\n¢\u0006\u0004\b\u001a\u0010\u001b"}, d2 = {"Landroidx/compose/ui/text/android/CanvasCompatS;", "", "<init>", "()V", "Landroid/graphics/Canvas;", "p0", "Landroid/graphics/NinePatch;", "p1", "Landroid/graphics/Rect;", "p2", "Landroid/graphics/Paint;", "p3", "", "getHighSpeedVideoFpsRanges", "(Landroid/graphics/Canvas;Landroid/graphics/NinePatch;Landroid/graphics/Rect;Landroid/graphics/Paint;)V", "Landroid/graphics/RectF;", "getHighSpeedVideoSizes", "(Landroid/graphics/Canvas;Landroid/graphics/NinePatch;Landroid/graphics/RectF;Landroid/graphics/Paint;)V", "", "", "", "p4", "p5", "Landroid/graphics/fonts/Font;", "p6", "p7", "bb_", "(Landroid/graphics/Canvas;[II[FIILandroid/graphics/fonts/Font;Landroid/graphics/Paint;)V"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
final class CanvasCompatS {
    public static final androidx.compose.ui.text.android.CanvasCompatS INSTANCE = new androidx.compose.ui.text.android.CanvasCompatS();

    private CanvasCompatS() {
    }

    public final void getHighSpeedVideoFpsRanges(android.graphics.Canvas p0, android.graphics.NinePatch p1, android.graphics.Rect p2, android.graphics.Paint p3) {
        p0.drawPatch(p1, p2, p3);
    }

    public final void getHighSpeedVideoSizes(android.graphics.Canvas p0, android.graphics.NinePatch p1, android.graphics.RectF p2, android.graphics.Paint p3) {
        p0.drawPatch(p1, p2, p3);
    }

    public final void bb_(android.graphics.Canvas p0, int[] p1, int p2, float[] p3, int p4, int p5, android.graphics.fonts.Font p6, android.graphics.Paint p7) {
        p0.drawGlyphs(p1, p2, p3, p4, p5, p6, p7);
    }
}
