package androidx.compose.ui.input.nestedscroll;

/* compiled from: NestedScrollModifier.kt */
@kotlin.Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "androidx.compose.ui.input.nestedscroll.NestedScrollDispatcher", f = "NestedScrollModifier.kt", i = {}, l = {206}, m = "dispatchPreFling-QWom1Mo", n = {}, s = {})
/* loaded from: classes.dex */
final class NestedScrollDispatcher$dispatchPreFling$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    int label;
    /* synthetic */ java.lang.Object result;
    final /* synthetic */ androidx.compose.ui.input.nestedscroll.NestedScrollDispatcher this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    NestedScrollDispatcher$dispatchPreFling$1(androidx.compose.ui.input.nestedscroll.NestedScrollDispatcher nestedScrollDispatcher, kotlin.coroutines.Continuation<? super androidx.compose.ui.input.nestedscroll.NestedScrollDispatcher$dispatchPreFling$1> continuation) {
        super(continuation);
        this.this$0 = nestedScrollDispatcher;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.m3158dispatchPreFlingQWom1Mo(0L, this);
    }
}
