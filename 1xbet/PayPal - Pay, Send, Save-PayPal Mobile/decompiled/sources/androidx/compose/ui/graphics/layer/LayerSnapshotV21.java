package androidx.compose.ui.graphics.layer;

@kotlin.Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0096@¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Landroidx/compose/ui/graphics/layer/LayerSnapshotV21;", "Landroidx/compose/ui/graphics/layer/LayerSnapshotImpl;", "<init>", "()V", "Landroidx/compose/ui/graphics/layer/GraphicsLayer;", "graphicsLayer", "Landroid/graphics/Bitmap;", "toBitmap", "(Landroidx/compose/ui/graphics/layer/GraphicsLayer;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class LayerSnapshotV21 implements androidx.compose.ui.graphics.layer.LayerSnapshotImpl {
    public static final int $stable = 0;
    public static final androidx.compose.ui.graphics.layer.LayerSnapshotV21 INSTANCE = new androidx.compose.ui.graphics.layer.LayerSnapshotV21();

    private LayerSnapshotV21() {
    }

    @Override // androidx.compose.ui.graphics.layer.LayerSnapshotImpl
    public final java.lang.Object toBitmap(androidx.compose.ui.graphics.layer.GraphicsLayer graphicsLayer, kotlin.coroutines.Continuation<? super android.graphics.Bitmap> continuation) {
        long size = graphicsLayer.getSize();
        android.graphics.Bitmap createBitmap = android.graphics.Bitmap.createBitmap((int) (size >> 32), (int) (size & 4294967295L), android.graphics.Bitmap.Config.ARGB_8888);
        graphicsLayer.draw$ui_graphics(androidx.compose.ui.graphics.AndroidCanvas_androidKt.Canvas(new android.graphics.Canvas(createBitmap)), null);
        return createBitmap;
    }
}
