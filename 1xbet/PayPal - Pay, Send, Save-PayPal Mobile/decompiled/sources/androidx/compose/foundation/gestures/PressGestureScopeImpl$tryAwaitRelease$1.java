package androidx.compose.foundation.gestures;

@kotlin.Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "androidx.compose.foundation.gestures.PressGestureScopeImpl", f = "TapGestureDetector.kt", i = {}, l = {540}, m = "tryAwaitRelease", n = {}, s = {}, v = 1)
/* loaded from: classes.dex */
final class PressGestureScopeImpl$tryAwaitRelease$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    int Camera2StreamConfigurationMap;
    final /* synthetic */ androidx.compose.foundation.gestures.PressGestureScopeImpl getHighSpeedVideoFpsRanges;
    /* synthetic */ java.lang.Object getHighSpeedVideoFpsRangesFor;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.getHighSpeedVideoFpsRangesFor = obj;
        this.Camera2StreamConfigurationMap |= Integer.MIN_VALUE;
        return this.getHighSpeedVideoFpsRanges.tryAwaitRelease(this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    PressGestureScopeImpl$tryAwaitRelease$1(androidx.compose.foundation.gestures.PressGestureScopeImpl pressGestureScopeImpl, kotlin.coroutines.Continuation<? super androidx.compose.foundation.gestures.PressGestureScopeImpl$tryAwaitRelease$1> continuation) {
        super(continuation);
        this.getHighSpeedVideoFpsRanges = pressGestureScopeImpl;
    }
}
