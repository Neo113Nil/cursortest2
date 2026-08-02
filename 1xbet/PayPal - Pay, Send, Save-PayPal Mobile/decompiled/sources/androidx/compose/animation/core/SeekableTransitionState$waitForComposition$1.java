package androidx.compose.animation.core;

@kotlin.Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "androidx.compose.animation.core.SeekableTransitionState", f = "Transition.kt", i = {0, 1}, l = {544, 2169}, m = "waitForComposition", n = {"expectedState", "expectedState"}, s = {"L$0", "L$0"}, v = 1)
/* loaded from: classes.dex */
final class SeekableTransitionState$waitForComposition$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    /* synthetic */ java.lang.Object Camera2StreamConfigurationMap;
    int getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ androidx.compose.animation.core.SeekableTransitionState<S> getHighSpeedVideoFpsRanges;
    java.lang.Object getHighSpeedVideoFpsRangesFor;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object highSpeedVideoFpsRangesFor;
        this.Camera2StreamConfigurationMap = obj;
        this.getHighResolutionOutputSizeshNQ4ISI |= Integer.MIN_VALUE;
        highSpeedVideoFpsRangesFor = this.getHighSpeedVideoFpsRanges.getHighSpeedVideoFpsRangesFor(this);
        return highSpeedVideoFpsRangesFor;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SeekableTransitionState$waitForComposition$1(androidx.compose.animation.core.SeekableTransitionState<S> seekableTransitionState, kotlin.coroutines.Continuation<? super androidx.compose.animation.core.SeekableTransitionState$waitForComposition$1> continuation) {
        super(continuation);
        this.getHighSpeedVideoFpsRanges = seekableTransitionState;
    }
}
