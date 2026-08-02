package androidx.compose.foundation.gestures.snapping;

@kotlin.Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "androidx.compose.foundation.gestures.snapping.SnapFlingBehaviorKt", f = "SnapFlingBehavior.kt", i = {0, 0, 0}, l = {308}, m = "animateDecay", n = {"animationState", "previousValue", "targetOffset"}, s = {"L$0", "L$1", "F$0"}, v = 1)
/* loaded from: classes.dex */
final class SnapFlingBehaviorKt$animateDecay$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    java.lang.Object Camera2StreamConfigurationMap;
    /* synthetic */ java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
    float getHighSpeedVideoFpsRanges;
    int getHighSpeedVideoFpsRangesFor;
    java.lang.Object getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object Camera2StreamConfigurationMap;
        this.getHighResolutionOutputSizeshNQ4ISI = obj;
        this.getHighSpeedVideoFpsRangesFor |= Integer.MIN_VALUE;
        Camera2StreamConfigurationMap = androidx.compose.foundation.gestures.snapping.SnapFlingBehaviorKt.Camera2StreamConfigurationMap(null, 0.0f, null, null, null, this);
        return Camera2StreamConfigurationMap;
    }

    SnapFlingBehaviorKt$animateDecay$1(kotlin.coroutines.Continuation<? super androidx.compose.foundation.gestures.snapping.SnapFlingBehaviorKt$animateDecay$1> continuation) {
        super(continuation);
    }
}
