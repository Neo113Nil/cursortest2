package coil3.compose;

@kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a'\u0010\t\u001a\u00020\u0006*\u00020\u00002\n\u0010\u0003\u001a\u00060\u0001j\u0002`\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\b\"\u001c\u0010\u000f\u001a\u00060\u000bj\u0002`\f*\u00020\n8AX\u0080\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u000e"}, d2 = {"Lcoil3/Image;", "Landroid/content/Context;", "Lcoil3/getHighResolutionOutputSizeshNQ4ISI;", "context", "Landroidx/compose/ui/graphics/FilterQuality;", "filterQuality", "Landroidx/compose/ui/graphics/painter/Painter;", "asPainter-55t9-rM", "(Lcoil3/Image;Landroid/content/Context;I)Landroidx/compose/ui/graphics/painter/Painter;", "asPainter", "Landroidx/compose/ui/graphics/Canvas;", "Landroid/graphics/Canvas;", "Landroidx/compose/ui/graphics/getHighSpeedVideoSizes;", "getNativeCanvas", "(Landroidx/compose/ui/graphics/Canvas;)Landroid/graphics/Canvas;", "nativeCanvas"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class ImagePainter_androidKt {
    /* renamed from: asPainter-55t9-rM, reason: not valid java name */
    public static final androidx.compose.ui.graphics.painter.Painter m9745asPainter55t9rM(coil3.Image image, android.content.Context context, int i) {
        if (image instanceof coil3.BitmapImage) {
            return androidx.compose.ui.graphics.painter.BitmapPainterKt.m6649BitmapPainterQZhYCtY$default(androidx.compose.ui.graphics.AndroidImageBitmap_androidKt.asImageBitmap(((coil3.BitmapImage) image).getBitmap()), 0L, 0L, i, 6, null);
        }
        if (image instanceof coil3.DrawableImage) {
            return new com.google.accompanist.drawablepainter.DrawablePainter(coil3.Image_androidKt.asDrawable(image, context.getResources()).mutate());
        }
        return new coil3.compose.ImagePainter(image);
    }

    public static final android.graphics.Canvas getNativeCanvas(androidx.compose.ui.graphics.Canvas canvas) {
        return androidx.compose.ui.graphics.AndroidCanvas_androidKt.getNativeCanvas(canvas);
    }

    /* renamed from: asPainter-55t9-rM$default, reason: not valid java name */
    public static /* synthetic */ androidx.compose.ui.graphics.painter.Painter m9746asPainter55t9rM$default(coil3.Image image, android.content.Context context, int i, int i2, java.lang.Object obj) {
        if ((i2 & 2) != 0) {
            i = androidx.compose.ui.graphics.drawscope.DrawScope.INSTANCE.m6534getDefaultFilterQualityfv9h1I();
        }
        return m9745asPainter55t9rM(image, context, i);
    }
}
