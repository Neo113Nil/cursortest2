package androidx.compose.foundation.gestures;

@kotlin.Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "androidx.compose.foundation.gestures.UpdatableAnimationState", f = "UpdatableAnimationState.kt", i = {0, 0, 0, 1}, l = {100, 151}, m = "animateToZero", n = {"beforeFrame", "afterFrame", "durationScale", "afterFrame"}, s = {"L$0", "L$1", "F$0", "L$0"}, v = 1)
/* loaded from: classes6.dex */
final class UpdatableAnimationState$animateToZero$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    /* synthetic */ java.lang.Object Camera2StreamConfigurationMap;
    java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
    int getHighSpeedVideoFpsRanges;
    java.lang.Object getHighSpeedVideoFpsRangesFor;
    float getHighSpeedVideoSizes;
    final /* synthetic */ androidx.compose.foundation.gestures.UpdatableAnimationState getInputSizeshNQ4ISI;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.Camera2StreamConfigurationMap = obj;
        this.getHighSpeedVideoFpsRanges |= Integer.MIN_VALUE;
        return this.getInputSizeshNQ4ISI.animateToZero(null, null, this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    UpdatableAnimationState$animateToZero$1(androidx.compose.foundation.gestures.UpdatableAnimationState updatableAnimationState, kotlin.coroutines.Continuation<? super androidx.compose.foundation.gestures.UpdatableAnimationState$animateToZero$1> continuation) {
        super(continuation);
        this.getInputSizeshNQ4ISI = updatableAnimationState;
    }
}
