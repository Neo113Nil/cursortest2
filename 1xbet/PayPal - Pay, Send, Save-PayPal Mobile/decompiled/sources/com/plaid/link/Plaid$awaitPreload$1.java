package com.plaid.link;

@kotlin.Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.plaid.link.Plaid", f = "Plaid.kt", i = {0}, l = {128}, m = "awaitPreload$link_sdk_release", n = {"this"}, s = {"L$0"})
/* loaded from: classes3.dex */
public final class Plaid$awaitPreload$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    java.lang.Object L$0;
    int label;
    /* synthetic */ java.lang.Object result;
    final /* synthetic */ com.plaid.link.Plaid this$0;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.awaitPreload$link_sdk_release(this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Plaid$awaitPreload$1(com.plaid.link.Plaid plaid, kotlin.coroutines.Continuation<? super com.plaid.link.Plaid$awaitPreload$1> continuation) {
        super(continuation);
        this.this$0 = plaid;
    }
}
