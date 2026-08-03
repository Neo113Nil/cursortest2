package androidx.compose.foundation.text.selection;

/* compiled from: AndroidSelectionHandles.android.kt */
@kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\bÂ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001c\u0010\t\u001a\u0004\u0018\u00010\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u0010X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"Landroidx/compose/foundation/text/selection/HandleImageCache;", "", "()V", "canvas", "Landroidx/compose/ui/graphics/Canvas;", "getCanvas", "()Landroidx/compose/ui/graphics/Canvas;", "setCanvas", "(Landroidx/compose/ui/graphics/Canvas;)V", "canvasDrawScope", "Landroidx/compose/ui/graphics/drawscope/CanvasDrawScope;", "getCanvasDrawScope", "()Landroidx/compose/ui/graphics/drawscope/CanvasDrawScope;", "setCanvasDrawScope", "(Landroidx/compose/ui/graphics/drawscope/CanvasDrawScope;)V", "imageBitmap", "Landroidx/compose/ui/graphics/ImageBitmap;", "getImageBitmap", "()Landroidx/compose/ui/graphics/ImageBitmap;", "setImageBitmap", "(Landroidx/compose/ui/graphics/ImageBitmap;)V", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
final class HandleImageCache {
    public static final androidx.compose.foundation.text.selection.HandleImageCache INSTANCE = new androidx.compose.foundation.text.selection.HandleImageCache();
    private static androidx.compose.ui.graphics.Canvas canvas;
    private static androidx.compose.ui.graphics.drawscope.CanvasDrawScope canvasDrawScope;
    private static androidx.compose.ui.graphics.ImageBitmap imageBitmap;

    private HandleImageCache() {
    }

    public final androidx.compose.ui.graphics.ImageBitmap getImageBitmap() {
        return imageBitmap;
    }

    public final void setImageBitmap(androidx.compose.ui.graphics.ImageBitmap imageBitmap2) {
        imageBitmap = imageBitmap2;
    }

    public final androidx.compose.ui.graphics.Canvas getCanvas() {
        return canvas;
    }

    public final void setCanvas(androidx.compose.ui.graphics.Canvas canvas2) {
        canvas = canvas2;
    }

    public final androidx.compose.ui.graphics.drawscope.CanvasDrawScope getCanvasDrawScope() {
        return canvasDrawScope;
    }

    public final void setCanvasDrawScope(androidx.compose.ui.graphics.drawscope.CanvasDrawScope canvasDrawScope2) {
        canvasDrawScope = canvasDrawScope2;
    }
}
