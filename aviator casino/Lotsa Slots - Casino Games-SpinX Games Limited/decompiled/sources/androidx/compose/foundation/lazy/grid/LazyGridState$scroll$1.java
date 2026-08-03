package androidx.compose.foundation.lazy.grid;

/* compiled from: LazyGridState.kt */
@kotlin.Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "androidx.compose.foundation.lazy.grid.LazyGridState", f = "LazyGridState.kt", i = {0, 0, 0}, l = {289, 290}, m = com.helpshift.proactive.InAppViewConstants.SCROLL, n = {"this", "scrollPriority", "block"}, s = {"L$0", "L$1", "L$2"})
/* loaded from: classes.dex */
final class LazyGridState$scroll$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    java.lang.Object L$0;
    java.lang.Object L$1;
    java.lang.Object L$2;
    int label;
    /* synthetic */ java.lang.Object result;
    final /* synthetic */ androidx.compose.foundation.lazy.grid.LazyGridState this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    LazyGridState$scroll$1(androidx.compose.foundation.lazy.grid.LazyGridState lazyGridState, kotlin.coroutines.Continuation<? super androidx.compose.foundation.lazy.grid.LazyGridState$scroll$1> continuation) {
        super(continuation);
        this.this$0 = lazyGridState;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.scroll(null, null, this);
    }
}
