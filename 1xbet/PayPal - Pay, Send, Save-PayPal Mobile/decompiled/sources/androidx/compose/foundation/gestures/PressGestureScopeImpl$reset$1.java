package androidx.compose.foundation.gestures;

@kotlin.Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "androidx.compose.foundation.gestures.PressGestureScopeImpl", f = "TapGestureDetector.kt", i = {}, l = {527}, m = "reset", n = {}, s = {}, v = 1)
/* loaded from: classes.dex */
final class PressGestureScopeImpl$reset$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    /* synthetic */ java.lang.Object Camera2StreamConfigurationMap;
    final /* synthetic */ androidx.compose.foundation.gestures.PressGestureScopeImpl getHighSpeedVideoFpsRangesFor;
    int getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.Camera2StreamConfigurationMap = obj;
        this.getHighSpeedVideoSizes |= Integer.MIN_VALUE;
        return this.getHighSpeedVideoFpsRangesFor.reset(this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    PressGestureScopeImpl$reset$1(androidx.compose.foundation.gestures.PressGestureScopeImpl pressGestureScopeImpl, kotlin.coroutines.Continuation<? super androidx.compose.foundation.gestures.PressGestureScopeImpl$reset$1> continuation) {
        super(continuation);
        this.getHighSpeedVideoFpsRangesFor = pressGestureScopeImpl;
    }
}
