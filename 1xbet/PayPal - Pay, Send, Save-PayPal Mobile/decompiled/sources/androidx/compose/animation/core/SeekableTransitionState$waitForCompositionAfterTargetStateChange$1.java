package androidx.compose.animation.core;

@kotlin.Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "androidx.compose.animation.core.SeekableTransitionState", f = "Transition.kt", i = {0, 1}, l = {my.com.softspace.ssfasstapsdk.pog.AttestationPOG.POGStatusCodes.RST_POG_ATTEST_COTS_FAIL, 2169}, m = "waitForCompositionAfterTargetStateChange", n = {"expectedState", "expectedState"}, s = {"L$0", "L$0"}, v = 1)
/* loaded from: classes.dex */
final class SeekableTransitionState$waitForCompositionAfterTargetStateChange$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    int Camera2StreamConfigurationMap;
    /* synthetic */ java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ androidx.compose.animation.core.SeekableTransitionState<S> getHighSpeedVideoFpsRangesFor;
    java.lang.Object getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object highResolutionOutputSizeshNQ4ISI;
        this.getHighResolutionOutputSizeshNQ4ISI = obj;
        this.Camera2StreamConfigurationMap |= Integer.MIN_VALUE;
        highResolutionOutputSizeshNQ4ISI = this.getHighSpeedVideoFpsRangesFor.getHighResolutionOutputSizeshNQ4ISI(this);
        return highResolutionOutputSizeshNQ4ISI;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SeekableTransitionState$waitForCompositionAfterTargetStateChange$1(androidx.compose.animation.core.SeekableTransitionState<S> seekableTransitionState, kotlin.coroutines.Continuation<? super androidx.compose.animation.core.SeekableTransitionState$waitForCompositionAfterTargetStateChange$1> continuation) {
        super(continuation);
        this.getHighSpeedVideoFpsRangesFor = seekableTransitionState;
    }
}
