package androidx.compose.ui.graphics.layer;

@kotlin.Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bÀ\u0002\u0018\u00002\u00020\u0001:\u0001\tB\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0096@¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Landroidx/compose/ui/graphics/layer/LayerSnapshotV28;", "Landroidx/compose/ui/graphics/layer/LayerSnapshotImpl;", "<init>", "()V", "Landroidx/compose/ui/graphics/layer/GraphicsLayer;", "graphicsLayer", "Landroid/graphics/Bitmap;", "toBitmap", "(Landroidx/compose/ui/graphics/layer/GraphicsLayer;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "GraphicsLayerPicture"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class LayerSnapshotV28 implements androidx.compose.ui.graphics.layer.LayerSnapshotImpl {
    public static final int $stable = 0;
    public static final androidx.compose.ui.graphics.layer.LayerSnapshotV28 INSTANCE = new androidx.compose.ui.graphics.layer.LayerSnapshotV28();

    private LayerSnapshotV28() {
    }

    @Override // androidx.compose.ui.graphics.layer.LayerSnapshotImpl
    public final java.lang.Object toBitmap(androidx.compose.ui.graphics.layer.GraphicsLayer graphicsLayer, kotlin.coroutines.Continuation<? super android.graphics.Bitmap> continuation) {
        return android.graphics.Bitmap.createBitmap(new androidx.compose.ui.graphics.layer.LayerSnapshotV28.GraphicsLayerPicture(graphicsLayer));
    }

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0010\u0010\u000fJ\u000f\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0014\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0014\u0010\u0015R\u0011\u0010\u0018\u001a\u00020\u00028\u0006¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017"}, d2 = {"Landroidx/compose/ui/graphics/layer/LayerSnapshotV28$GraphicsLayerPicture;", "Landroid/graphics/Picture;", "Landroidx/compose/ui/graphics/layer/GraphicsLayer;", "p0", "<init>", "(Landroidx/compose/ui/graphics/layer/GraphicsLayer;)V", "", "p1", "Landroid/graphics/Canvas;", "beginRecording", "(II)Landroid/graphics/Canvas;", "", "endRecording", "()V", "getWidth", "()I", "getHeight", "", "requiresHardwareAcceleration", "()Z", "draw", "(Landroid/graphics/Canvas;)V", "getHighSpeedVideoFpsRangesFor", "Landroidx/compose/ui/graphics/layer/GraphicsLayer;", "Camera2StreamConfigurationMap"}, k = 1, mv = {2, 0, 0}, xi = 48)
    static final class GraphicsLayerPicture extends android.graphics.Picture {

        /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
        private final androidx.compose.ui.graphics.layer.GraphicsLayer Camera2StreamConfigurationMap;

        @Override // android.graphics.Picture
        public final void endRecording() {
        }

        @Override // android.graphics.Picture
        public final boolean requiresHardwareAcceleration() {
            return true;
        }

        public GraphicsLayerPicture(androidx.compose.ui.graphics.layer.GraphicsLayer graphicsLayer) {
            this.Camera2StreamConfigurationMap = graphicsLayer;
        }

        @Override // android.graphics.Picture
        public final android.graphics.Canvas beginRecording(int p0, int p1) {
            return new android.graphics.Canvas();
        }

        @Override // android.graphics.Picture
        public final int getWidth() {
            return (int) (this.Camera2StreamConfigurationMap.getSize() >> 32);
        }

        @Override // android.graphics.Picture
        public final int getHeight() {
            return (int) (this.Camera2StreamConfigurationMap.getSize() & 4294967295L);
        }

        @Override // android.graphics.Picture
        public final void draw(android.graphics.Canvas p0) {
            this.Camera2StreamConfigurationMap.draw$ui_graphics(androidx.compose.ui.graphics.AndroidCanvas_androidKt.Canvas(p0), null);
        }
    }
}
