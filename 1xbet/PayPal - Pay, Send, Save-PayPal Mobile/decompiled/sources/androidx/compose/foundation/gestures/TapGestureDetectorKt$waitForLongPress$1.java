package androidx.compose.foundation.gestures;

@kotlin.Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "androidx.compose.foundation.gestures.TapGestureDetectorKt", f = "TapGestureDetector.kt", i = {0}, l = {384}, m = "waitForLongPress", n = {"result"}, s = {"L$0"}, v = 1)
/* loaded from: classes.dex */
final class TapGestureDetectorKt$waitForLongPress$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    int Camera2StreamConfigurationMap;
    java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
    /* synthetic */ java.lang.Object getHighSpeedVideoFpsRangesFor;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.getHighSpeedVideoFpsRangesFor = obj;
        this.Camera2StreamConfigurationMap |= Integer.MIN_VALUE;
        return androidx.compose.foundation.gestures.TapGestureDetectorKt.waitForLongPress(null, null, this);
    }

    TapGestureDetectorKt$waitForLongPress$1(kotlin.coroutines.Continuation<? super androidx.compose.foundation.gestures.TapGestureDetectorKt$waitForLongPress$1> continuation) {
        super(continuation);
    }
}
