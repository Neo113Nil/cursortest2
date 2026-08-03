package androidx.compose.animation.core;

/* compiled from: Transition.kt */
@kotlin.Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "androidx.compose.animation.core.SeekableTransitionState", f = "Transition.kt", i = {0}, l = {228}, m = "snapToFraction", n = {"this"}, s = {"L$0"})
/* loaded from: classes.dex */
final class SeekableTransitionState$snapToFraction$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    java.lang.Object L$0;
    int label;
    /* synthetic */ java.lang.Object result;
    final /* synthetic */ androidx.compose.animation.core.SeekableTransitionState<S> this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SeekableTransitionState$snapToFraction$1(androidx.compose.animation.core.SeekableTransitionState<S> seekableTransitionState, kotlin.coroutines.Continuation<? super androidx.compose.animation.core.SeekableTransitionState$snapToFraction$1> continuation) {
        super(continuation);
        this.this$0 = seekableTransitionState;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.snapToFraction(0.0f, this);
    }
}
