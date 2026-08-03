package androidx.compose.foundation.gestures.snapping;

/* compiled from: SnapFlingBehavior.kt */
@kotlin.Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "androidx.compose.foundation.gestures.snapping.SnapFlingBehaviorKt", f = "SnapFlingBehavior.kt", i = {0, 0, 0}, l = {364}, m = "animateDecay", n = {"animationState", "previousValue", "targetOffset"}, s = {"L$0", "L$1", "F$0"})
/* loaded from: classes.dex */
final class SnapFlingBehaviorKt$animateDecay$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    float F$0;
    java.lang.Object L$0;
    java.lang.Object L$1;
    int label;
    /* synthetic */ java.lang.Object result;

    SnapFlingBehaviorKt$animateDecay$1(kotlin.coroutines.Continuation<? super androidx.compose.foundation.gestures.snapping.SnapFlingBehaviorKt$animateDecay$1> continuation) {
        super(continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object animateDecay;
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        animateDecay = androidx.compose.foundation.gestures.snapping.SnapFlingBehaviorKt.animateDecay(null, 0.0f, null, null, null, this);
        return animateDecay;
    }
}
