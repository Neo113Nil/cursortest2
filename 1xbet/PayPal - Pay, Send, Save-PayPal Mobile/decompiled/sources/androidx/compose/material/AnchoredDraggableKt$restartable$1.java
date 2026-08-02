package androidx.compose.material;

@kotlin.Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "androidx.compose.material.AnchoredDraggableKt", f = "AnchoredDraggable.kt", i = {}, l = {716}, m = "restartable", n = {}, s = {}, v = 1)
/* loaded from: classes.dex */
final class AnchoredDraggableKt$restartable$1<I> extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    int Camera2StreamConfigurationMap;
    /* synthetic */ java.lang.Object getHighSpeedVideoFpsRangesFor;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object highSpeedVideoSizes;
        this.getHighSpeedVideoFpsRangesFor = obj;
        this.Camera2StreamConfigurationMap |= Integer.MIN_VALUE;
        highSpeedVideoSizes = androidx.compose.material.AnchoredDraggableKt.getHighSpeedVideoSizes(null, null, this);
        return highSpeedVideoSizes;
    }

    AnchoredDraggableKt$restartable$1(kotlin.coroutines.Continuation<? super androidx.compose.material.AnchoredDraggableKt$restartable$1> continuation) {
        super(continuation);
    }
}
