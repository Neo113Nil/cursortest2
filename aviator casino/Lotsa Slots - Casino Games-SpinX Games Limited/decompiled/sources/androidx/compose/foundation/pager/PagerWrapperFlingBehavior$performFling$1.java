package androidx.compose.foundation.pager;

/* compiled from: Pager.kt */
@kotlin.Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "androidx.compose.foundation.pager.PagerWrapperFlingBehavior", f = "Pager.kt", i = {}, l = {829}, m = "performFling", n = {}, s = {})
/* loaded from: classes.dex */
final class PagerWrapperFlingBehavior$performFling$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    int label;
    /* synthetic */ java.lang.Object result;
    final /* synthetic */ androidx.compose.foundation.pager.PagerWrapperFlingBehavior this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    PagerWrapperFlingBehavior$performFling$1(androidx.compose.foundation.pager.PagerWrapperFlingBehavior pagerWrapperFlingBehavior, kotlin.coroutines.Continuation<? super androidx.compose.foundation.pager.PagerWrapperFlingBehavior$performFling$1> continuation) {
        super(continuation);
        this.this$0 = pagerWrapperFlingBehavior;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.performFling(null, 0.0f, this);
    }
}
