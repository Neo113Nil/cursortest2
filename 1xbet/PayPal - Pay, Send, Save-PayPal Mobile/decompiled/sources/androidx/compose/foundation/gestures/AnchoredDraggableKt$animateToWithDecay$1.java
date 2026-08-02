package androidx.compose.foundation.gestures;

@kotlin.Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "androidx.compose.foundation.gestures.AnchoredDraggableKt", f = "AnchoredDraggable.kt", i = {0, 0}, l = {1383}, m = "animateToWithDecay", n = {"remainingVelocity", "velocity"}, s = {"L$0", "F$0"}, v = 1)
/* loaded from: classes.dex */
final class AnchoredDraggableKt$animateToWithDecay$1<T> extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    int Camera2StreamConfigurationMap;
    java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
    float getHighSpeedVideoFpsRanges;
    /* synthetic */ java.lang.Object getHighSpeedVideoFpsRangesFor;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.getHighSpeedVideoFpsRangesFor = obj;
        this.Camera2StreamConfigurationMap |= Integer.MIN_VALUE;
        return androidx.compose.foundation.gestures.AnchoredDraggableKt.animateToWithDecay(null, null, 0.0f, null, null, this);
    }

    AnchoredDraggableKt$animateToWithDecay$1(kotlin.coroutines.Continuation<? super androidx.compose.foundation.gestures.AnchoredDraggableKt$animateToWithDecay$1> continuation) {
        super(continuation);
    }
}
