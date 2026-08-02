package androidx.compose.foundation.gestures;

@kotlin.Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "androidx.compose.foundation.gestures.PressGestureScopeImpl", f = "TapGestureDetector.kt", i = {}, l = {com.gemalto.mfs.mwsdk.provisioning.model.KnownCpsErrorCodes.ENROLLMENT_MOBILE_WALLET_ALREADY_ENROLLED}, m = "awaitRelease", n = {}, s = {}, v = 1)
/* loaded from: classes.dex */
final class PressGestureScopeImpl$awaitRelease$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    int getHighResolutionOutputSizeshNQ4ISI;
    /* synthetic */ java.lang.Object getHighSpeedVideoFpsRanges;
    final /* synthetic */ androidx.compose.foundation.gestures.PressGestureScopeImpl getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.getHighSpeedVideoFpsRanges = obj;
        this.getHighResolutionOutputSizeshNQ4ISI |= Integer.MIN_VALUE;
        return this.getHighSpeedVideoSizes.awaitRelease(this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    PressGestureScopeImpl$awaitRelease$1(androidx.compose.foundation.gestures.PressGestureScopeImpl pressGestureScopeImpl, kotlin.coroutines.Continuation<? super androidx.compose.foundation.gestures.PressGestureScopeImpl$awaitRelease$1> continuation) {
        super(continuation);
        this.getHighSpeedVideoSizes = pressGestureScopeImpl;
    }
}
