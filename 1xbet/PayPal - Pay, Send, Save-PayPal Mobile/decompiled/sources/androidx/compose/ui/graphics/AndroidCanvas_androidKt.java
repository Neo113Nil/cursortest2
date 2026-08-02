package androidx.compose.ui.graphics;

@kotlin.Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\u001a\u0017\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u0015\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\b\"\u0019\u0010\f\u001a\u00060\u0005j\u0002`\t*\u00020\u00028G¢\u0006\u0006\u001a\u0004\b\n\u0010\u000b\"\u0014\u0010\u000f\u001a\u00020\u00058\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000e*\n\u0010\u0010\"\u00020\u00052\u00020\u0005"}, d2 = {"Landroidx/compose/ui/graphics/ImageBitmap;", "image", "Landroidx/compose/ui/graphics/Canvas;", "ActualCanvas", "(Landroidx/compose/ui/graphics/ImageBitmap;)Landroidx/compose/ui/graphics/Canvas;", "Landroid/graphics/Canvas;", "c", "Canvas", "(Landroid/graphics/Canvas;)Landroidx/compose/ui/graphics/Canvas;", "Landroidx/compose/ui/graphics/getHighSpeedVideoSizes;", "getNativeCanvas", "(Landroidx/compose/ui/graphics/Canvas;)Landroid/graphics/Canvas;", "nativeCanvas", "getHighSpeedVideoFpsRangesFor", "Landroid/graphics/Canvas;", "getHighResolutionOutputSizeshNQ4ISI", "getHighSpeedVideoSizes"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class AndroidCanvas_androidKt {
    private static final android.graphics.Canvas getHighSpeedVideoFpsRangesFor = new android.graphics.Canvas();

    public static final androidx.compose.ui.graphics.Canvas ActualCanvas(androidx.compose.ui.graphics.ImageBitmap imageBitmap) {
        androidx.compose.ui.graphics.AndroidCanvas androidCanvas = new androidx.compose.ui.graphics.AndroidCanvas();
        androidCanvas.setInternalCanvas(new android.graphics.Canvas(androidx.compose.ui.graphics.AndroidImageBitmap_androidKt.asAndroidBitmap(imageBitmap)));
        return androidCanvas;
    }

    public static final androidx.compose.ui.graphics.Canvas Canvas(android.graphics.Canvas canvas) {
        androidx.compose.ui.graphics.AndroidCanvas androidCanvas = new androidx.compose.ui.graphics.AndroidCanvas();
        androidCanvas.setInternalCanvas(canvas);
        return androidCanvas;
    }

    public static final android.graphics.Canvas getNativeCanvas(androidx.compose.ui.graphics.Canvas canvas) {
        kotlin.jvm.internal.Intrinsics.checkNotNull(canvas, "");
        return ((androidx.compose.ui.graphics.AndroidCanvas) canvas).getInternalCanvas();
    }
}
