package androidx.compose.runtime;

/* compiled from: ProduceState.kt */
@kotlin.Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "androidx.compose.runtime.ProduceStateScopeImpl", f = "ProduceState.kt", i = {0}, l = {224}, m = "awaitDispose", n = {"onDispose"}, s = {"L$0"})
/* loaded from: classes.dex */
final class ProduceStateScopeImpl$awaitDispose$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    java.lang.Object L$0;
    int label;
    /* synthetic */ java.lang.Object result;
    final /* synthetic */ androidx.compose.runtime.ProduceStateScopeImpl<T> this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ProduceStateScopeImpl$awaitDispose$1(androidx.compose.runtime.ProduceStateScopeImpl<T> produceStateScopeImpl, kotlin.coroutines.Continuation<? super androidx.compose.runtime.ProduceStateScopeImpl$awaitDispose$1> continuation) {
        super(continuation);
        this.this$0 = produceStateScopeImpl;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.awaitDispose(null, this);
    }
}
