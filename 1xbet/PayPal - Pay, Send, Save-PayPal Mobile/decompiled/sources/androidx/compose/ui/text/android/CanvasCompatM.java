package androidx.compose.ui.text.android;

@kotlin.Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0019\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\r\n\u0002\b\u0002\bÂ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J]\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0015\u0010\u0016J]\u0010\u0018\u001a\u00020\u00142\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00172\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0018\u0010\u0019"}, d2 = {"Landroidx/compose/ui/text/android/CanvasCompatM;", "", "<init>", "()V", "Landroid/graphics/Canvas;", "p0", "", "p1", "", "p2", "p3", "p4", "p5", "", "p6", "p7", "", "p8", "Landroid/graphics/Paint;", "p9", "", "getHighSpeedVideoFpsRangesFor", "(Landroid/graphics/Canvas;[CIIIIFFZLandroid/graphics/Paint;)V", "", "Camera2StreamConfigurationMap", "(Landroid/graphics/Canvas;Ljava/lang/CharSequence;IIIIFFZLandroid/graphics/Paint;)V"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
final class CanvasCompatM {
    public static final androidx.compose.ui.text.android.CanvasCompatM INSTANCE = new androidx.compose.ui.text.android.CanvasCompatM();

    private CanvasCompatM() {
    }

    public final void getHighSpeedVideoFpsRangesFor(android.graphics.Canvas p0, char[] p1, int p2, int p3, int p4, int p5, float p6, float p7, boolean p8, android.graphics.Paint p9) {
        p0.drawTextRun(p1, p2, p3, p4, p5, p6, p7, p8, p9);
    }

    public final void Camera2StreamConfigurationMap(android.graphics.Canvas p0, java.lang.CharSequence p1, int p2, int p3, int p4, int p5, float p6, float p7, boolean p8, android.graphics.Paint p9) {
        p0.drawTextRun(p1, p2, p3, p4, p5, p6, p7, p8, p9);
    }
}
