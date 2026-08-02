package androidx.compose.ui.graphics.layer;

@kotlin.Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "androidx.compose.ui.graphics.layer.GraphicsLayer", f = "AndroidGraphicsLayer.android.kt", i = {}, l = {869}, m = "toImageBitmap", n = {}, s = {}, v = 1)
/* loaded from: classes.dex */
final class GraphicsLayer$toImageBitmap$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    final /* synthetic */ androidx.compose.ui.graphics.layer.GraphicsLayer Camera2StreamConfigurationMap;
    int getHighSpeedVideoFpsRangesFor;
    /* synthetic */ java.lang.Object getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.getHighSpeedVideoSizes = obj;
        this.getHighSpeedVideoFpsRangesFor |= Integer.MIN_VALUE;
        return this.Camera2StreamConfigurationMap.toImageBitmap(this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    GraphicsLayer$toImageBitmap$1(androidx.compose.ui.graphics.layer.GraphicsLayer graphicsLayer, kotlin.coroutines.Continuation<? super androidx.compose.ui.graphics.layer.GraphicsLayer$toImageBitmap$1> continuation) {
        super(continuation);
        this.Camera2StreamConfigurationMap = graphicsLayer;
    }
}
