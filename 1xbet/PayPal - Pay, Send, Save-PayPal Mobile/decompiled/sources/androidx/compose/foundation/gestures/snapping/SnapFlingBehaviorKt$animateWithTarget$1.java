package androidx.compose.foundation.gestures.snapping;

@kotlin.Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "androidx.compose.foundation.gestures.snapping.SnapFlingBehaviorKt", f = "SnapFlingBehavior.kt", i = {0, 0, 0, 0}, l = {349}, m = "animateWithTarget", n = {"animationState", "consumedUpToNow", "targetOffset", "initialVelocity"}, s = {"L$0", "L$1", "F$0", "F$1"}, v = 1)
/* loaded from: classes.dex */
final class SnapFlingBehaviorKt$animateWithTarget$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    float Camera2StreamConfigurationMap;
    java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
    int getHighSpeedVideoFpsRanges;
    float getHighSpeedVideoFpsRangesFor;
    java.lang.Object getHighSpeedVideoSizes;
    /* synthetic */ java.lang.Object getOutputMinFrameDuration;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object highResolutionOutputSizeshNQ4ISI;
        this.getOutputMinFrameDuration = obj;
        this.getHighSpeedVideoFpsRanges |= Integer.MIN_VALUE;
        highResolutionOutputSizeshNQ4ISI = androidx.compose.foundation.gestures.snapping.SnapFlingBehaviorKt.getHighResolutionOutputSizeshNQ4ISI(null, 0.0f, 0.0f, null, null, null, this);
        return highResolutionOutputSizeshNQ4ISI;
    }

    SnapFlingBehaviorKt$animateWithTarget$1(kotlin.coroutines.Continuation<? super androidx.compose.foundation.gestures.snapping.SnapFlingBehaviorKt$animateWithTarget$1> continuation) {
        super(continuation);
    }
}
