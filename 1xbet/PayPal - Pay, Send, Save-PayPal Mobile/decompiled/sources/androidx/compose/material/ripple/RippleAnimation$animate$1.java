package androidx.compose.material.ripple;

@kotlin.Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "androidx.compose.material.ripple.RippleAnimation", f = "RippleAnimation.kt", i = {}, l = {77, 79, 80}, m = "animate", n = {}, s = {}, v = 1)
/* loaded from: classes.dex */
final class RippleAnimation$animate$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    int Camera2StreamConfigurationMap;
    final /* synthetic */ androidx.compose.material.ripple.RippleAnimation getHighSpeedVideoFpsRanges;
    /* synthetic */ java.lang.Object getHighSpeedVideoFpsRangesFor;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.getHighSpeedVideoFpsRangesFor = obj;
        this.Camera2StreamConfigurationMap |= Integer.MIN_VALUE;
        return this.getHighSpeedVideoFpsRanges.animate(this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    RippleAnimation$animate$1(androidx.compose.material.ripple.RippleAnimation rippleAnimation, kotlin.coroutines.Continuation<? super androidx.compose.material.ripple.RippleAnimation$animate$1> continuation) {
        super(continuation);
        this.getHighSpeedVideoFpsRanges = rippleAnimation;
    }
}
