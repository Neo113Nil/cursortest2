package androidx.compose.material.ripple;

/* compiled from: RippleAnimation.kt */
@kotlin.Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "androidx.compose.material.ripple.RippleAnimation", f = "RippleAnimation.kt", i = {0, 1}, l = {80, 82, 83}, m = com.helpshift.proactive.InAppViewConstants.ANIMATE, n = {"this", "this"}, s = {"L$0", "L$0"})
/* loaded from: classes.dex */
final class RippleAnimation$animate$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    java.lang.Object L$0;
    int label;
    /* synthetic */ java.lang.Object result;
    final /* synthetic */ androidx.compose.material.ripple.RippleAnimation this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    RippleAnimation$animate$1(androidx.compose.material.ripple.RippleAnimation rippleAnimation, kotlin.coroutines.Continuation<? super androidx.compose.material.ripple.RippleAnimation$animate$1> continuation) {
        super(continuation);
        this.this$0 = rippleAnimation;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.animate(this);
    }
}
