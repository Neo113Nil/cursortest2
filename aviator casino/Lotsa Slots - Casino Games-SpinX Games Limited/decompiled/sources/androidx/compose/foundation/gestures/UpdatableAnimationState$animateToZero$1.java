package androidx.compose.foundation.gestures;

/* compiled from: UpdatableAnimationState.kt */
@kotlin.Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "androidx.compose.foundation.gestures.UpdatableAnimationState", f = "UpdatableAnimationState.kt", i = {0, 0, 0, 0, 1, 1}, l = {101, 147}, m = "animateToZero", n = {"this", "beforeFrame", "afterFrame", "durationScale", "this", "afterFrame"}, s = {"L$0", "L$1", "L$2", "F$0", "L$0", "L$1"})
/* loaded from: classes.dex */
final class UpdatableAnimationState$animateToZero$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    float F$0;
    java.lang.Object L$0;
    java.lang.Object L$1;
    java.lang.Object L$2;
    int label;
    /* synthetic */ java.lang.Object result;
    final /* synthetic */ androidx.compose.foundation.gestures.UpdatableAnimationState this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    UpdatableAnimationState$animateToZero$1(androidx.compose.foundation.gestures.UpdatableAnimationState updatableAnimationState, kotlin.coroutines.Continuation<? super androidx.compose.foundation.gestures.UpdatableAnimationState$animateToZero$1> continuation) {
        super(continuation);
        this.this$0 = updatableAnimationState;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.animateToZero(null, null, this);
    }
}
