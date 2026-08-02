package androidx.compose.ui.graphics.layer;

@kotlin.Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "androidx.compose.ui.graphics.layer.LayerSnapshotV22", f = "LayerSnapshot.android.kt", i = {0, 0, 0, 0}, l = {225}, m = "toBitmap", n = {"graphicsLayer", "looper", "reader", "$completion$iv"}, s = {"L$0", "L$1", "L$3", "L$4"}, v = 1)
/* loaded from: classes6.dex */
final class LayerSnapshotV22$toBitmap$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    java.lang.Object Camera2StreamConfigurationMap;
    java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
    java.lang.Object getHighSpeedVideoFpsRanges;
    java.lang.Object getHighSpeedVideoFpsRangesFor;
    java.lang.Object getHighSpeedVideoSizes;
    final /* synthetic */ androidx.compose.ui.graphics.layer.LayerSnapshotV22 getHighSpeedVideoSizesFor;
    /* synthetic */ java.lang.Object getInputSizeshNQ4ISI;
    int getOutputMinFrameDuration;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.getInputSizeshNQ4ISI = obj;
        this.getOutputMinFrameDuration |= Integer.MIN_VALUE;
        return this.getHighSpeedVideoSizesFor.toBitmap(null, this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    LayerSnapshotV22$toBitmap$1(androidx.compose.ui.graphics.layer.LayerSnapshotV22 layerSnapshotV22, kotlin.coroutines.Continuation<? super androidx.compose.ui.graphics.layer.LayerSnapshotV22$toBitmap$1> continuation) {
        super(continuation);
        this.getHighSpeedVideoSizesFor = layerSnapshotV22;
    }
}
