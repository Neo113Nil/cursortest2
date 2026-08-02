package androidx.compose.material3.internal;

@kotlin.Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "androidx.compose.material3.internal.AnchoredDraggableKt", f = "AnchoredDraggable.kt", i = {}, l = {androidx.constraintlayout.core.motion.utils.TypedValues.TransitionType.TYPE_STAGGERED}, m = "restartable", n = {}, s = {})
/* loaded from: classes.dex */
final class AnchoredDraggableKt$restartable$1<I> extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    int Camera2StreamConfigurationMap;
    /* synthetic */ java.lang.Object getHighSpeedVideoFpsRanges;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object highSpeedVideoFpsRanges;
        this.getHighSpeedVideoFpsRanges = obj;
        this.Camera2StreamConfigurationMap |= Integer.MIN_VALUE;
        highSpeedVideoFpsRanges = androidx.compose.material3.internal.AnchoredDraggableKt.getHighSpeedVideoFpsRanges(null, null, this);
        return highSpeedVideoFpsRanges;
    }

    AnchoredDraggableKt$restartable$1(kotlin.coroutines.Continuation<? super androidx.compose.material3.internal.AnchoredDraggableKt$restartable$1> continuation) {
        super(continuation);
    }
}
