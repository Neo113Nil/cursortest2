package androidx.compose.foundation.gestures.snapping;

/* compiled from: SnapFlingBehavior.kt */
@kotlin.Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "androidx.compose.foundation.gestures.snapping.SnapFlingBehaviorKt", f = "SnapFlingBehavior.kt", i = {0, 0, 0, 0}, l = {com.ironsource.InterfaceC3141l1.a.b.i}, m = "animateWithTarget", n = {"animationState", "consumedUpToNow", "targetOffset", "initialVelocity"}, s = {"L$0", "L$1", "F$0", "F$1"})
/* loaded from: classes.dex */
final class SnapFlingBehaviorKt$animateWithTarget$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    float F$0;
    float F$1;
    java.lang.Object L$0;
    java.lang.Object L$1;
    int label;
    /* synthetic */ java.lang.Object result;

    SnapFlingBehaviorKt$animateWithTarget$1(kotlin.coroutines.Continuation<? super androidx.compose.foundation.gestures.snapping.SnapFlingBehaviorKt$animateWithTarget$1> continuation) {
        super(continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object animateWithTarget;
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        animateWithTarget = androidx.compose.foundation.gestures.snapping.SnapFlingBehaviorKt.animateWithTarget(null, 0.0f, 0.0f, null, null, null, this);
        return animateWithTarget;
    }
}
