package androidx.compose.ui.graphics.painter;

@kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a3\u0010\u000b\u001a\u00020\b2\u0006\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\n"}, d2 = {"Landroidx/compose/ui/graphics/ImageBitmap;", "image", "Landroidx/compose/ui/unit/IntOffset;", "srcOffset", "Landroidx/compose/ui/unit/IntSize;", "srcSize", "Landroidx/compose/ui/graphics/FilterQuality;", "filterQuality", "Landroidx/compose/ui/graphics/painter/BitmapPainter;", "BitmapPainter-QZhYCtY", "(Landroidx/compose/ui/graphics/ImageBitmap;JJI)Landroidx/compose/ui/graphics/painter/BitmapPainter;", "BitmapPainter"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class BitmapPainterKt {
    /* renamed from: BitmapPainter-QZhYCtY$default, reason: not valid java name */
    public static /* synthetic */ androidx.compose.ui.graphics.painter.BitmapPainter m6649BitmapPainterQZhYCtY$default(androidx.compose.ui.graphics.ImageBitmap imageBitmap, long j, long j2, int i, int i2, java.lang.Object obj) {
        if ((i2 & 2) != 0) {
            j = androidx.compose.ui.unit.IntOffset.INSTANCE.m8740getZeronOccac();
        }
        long j3 = j;
        if ((i2 & 4) != 0) {
            j2 = androidx.compose.ui.unit.IntSize.m8767constructorimpl((imageBitmap.getHeight() & 4294967295L) | (imageBitmap.getWidth() << 32));
        }
        long j4 = j2;
        if ((i2 & 8) != 0) {
            i = androidx.compose.ui.graphics.FilterQuality.INSTANCE.m6091getLowfv9h1I();
        }
        return m6648BitmapPainterQZhYCtY(imageBitmap, j3, j4, i);
    }

    /* renamed from: BitmapPainter-QZhYCtY, reason: not valid java name */
    public static final androidx.compose.ui.graphics.painter.BitmapPainter m6648BitmapPainterQZhYCtY(androidx.compose.ui.graphics.ImageBitmap imageBitmap, long j, long j2, int i) {
        androidx.compose.ui.graphics.painter.BitmapPainter bitmapPainter = new androidx.compose.ui.graphics.painter.BitmapPainter(imageBitmap, j, j2, null);
        bitmapPainter.m6647setFilterQualityvDHp3xo$ui_graphics(i);
        return bitmapPainter;
    }
}
