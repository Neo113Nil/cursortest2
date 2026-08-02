package androidx.compose.animation.core;

@kotlin.Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "androidx.compose.animation.core.SeekableTransitionState", f = "Transition.kt", i = {}, l = {354, 357}, m = "runAnimations", n = {}, s = {}, v = 1)
/* loaded from: classes.dex */
final class SeekableTransitionState$runAnimations$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    final /* synthetic */ androidx.compose.animation.core.SeekableTransitionState<S> Camera2StreamConfigurationMap;
    /* synthetic */ java.lang.Object getHighSpeedVideoFpsRangesFor;
    int getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object highSpeedVideoFpsRanges;
        this.getHighSpeedVideoFpsRangesFor = obj;
        this.getHighSpeedVideoSizes |= Integer.MIN_VALUE;
        highSpeedVideoFpsRanges = this.Camera2StreamConfigurationMap.getHighSpeedVideoFpsRanges(this);
        return highSpeedVideoFpsRanges;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SeekableTransitionState$runAnimations$1(androidx.compose.animation.core.SeekableTransitionState<S> seekableTransitionState, kotlin.coroutines.Continuation<? super androidx.compose.animation.core.SeekableTransitionState$runAnimations$1> continuation) {
        super(continuation);
        this.Camera2StreamConfigurationMap = seekableTransitionState;
    }
}
