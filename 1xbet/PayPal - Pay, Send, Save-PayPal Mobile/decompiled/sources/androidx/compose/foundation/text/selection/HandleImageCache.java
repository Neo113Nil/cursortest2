package androidx.compose.foundation.text.selection;

@kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\bÂ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R$\u0010\t\u001a\u0004\u0018\u00010\u00048\u0007@\u0007X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR$\u0010\r\u001a\u0004\u0018\u00010\u000b8\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0007\u0010\f\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u0007\u0010\u000fR$\u0010\u0007\u001a\u0004\u0018\u00010\u00108\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b\r\u0010\u0011\u001a\u0004\b\t\u0010\u0012\"\u0004\b\u0013\u0010\u0014"}, d2 = {"Landroidx/compose/foundation/text/selection/HandleImageCache;", "", "<init>", "()V", "Landroidx/compose/ui/graphics/ImageBitmap;", "Camera2StreamConfigurationMap", "Landroidx/compose/ui/graphics/ImageBitmap;", "getHighResolutionOutputSizeshNQ4ISI", "()Landroidx/compose/ui/graphics/ImageBitmap;", "getHighSpeedVideoSizes", "(Landroidx/compose/ui/graphics/ImageBitmap;)V", "Landroidx/compose/ui/graphics/Canvas;", "Landroidx/compose/ui/graphics/Canvas;", "getHighSpeedVideoFpsRanges", "()Landroidx/compose/ui/graphics/Canvas;", "(Landroidx/compose/ui/graphics/Canvas;)V", "Landroidx/compose/ui/graphics/drawscope/CanvasDrawScope;", "Landroidx/compose/ui/graphics/drawscope/CanvasDrawScope;", "()Landroidx/compose/ui/graphics/drawscope/CanvasDrawScope;", "getHighSpeedVideoFpsRangesFor", "(Landroidx/compose/ui/graphics/drawscope/CanvasDrawScope;)V"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
final class HandleImageCache {

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private static androidx.compose.ui.graphics.ImageBitmap getHighSpeedVideoSizes;
    public static final androidx.compose.foundation.text.selection.HandleImageCache INSTANCE = new androidx.compose.foundation.text.selection.HandleImageCache();

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private static androidx.compose.ui.graphics.Canvas getHighSpeedVideoFpsRanges;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private static androidx.compose.ui.graphics.drawscope.CanvasDrawScope getHighResolutionOutputSizeshNQ4ISI;

    private HandleImageCache() {
    }

    public static androidx.compose.ui.graphics.ImageBitmap getHighResolutionOutputSizeshNQ4ISI() {
        return getHighSpeedVideoSizes;
    }

    public static void getHighSpeedVideoSizes(androidx.compose.ui.graphics.ImageBitmap imageBitmap) {
        getHighSpeedVideoSizes = imageBitmap;
    }

    public static void getHighResolutionOutputSizeshNQ4ISI(androidx.compose.ui.graphics.Canvas canvas) {
        getHighSpeedVideoFpsRanges = canvas;
    }

    public static androidx.compose.ui.graphics.Canvas getHighSpeedVideoFpsRanges() {
        return getHighSpeedVideoFpsRanges;
    }

    public static void getHighSpeedVideoFpsRangesFor(androidx.compose.ui.graphics.drawscope.CanvasDrawScope canvasDrawScope) {
        getHighResolutionOutputSizeshNQ4ISI = canvasDrawScope;
    }

    public static androidx.compose.ui.graphics.drawscope.CanvasDrawScope getHighSpeedVideoSizes() {
        return getHighResolutionOutputSizeshNQ4ISI;
    }
}
