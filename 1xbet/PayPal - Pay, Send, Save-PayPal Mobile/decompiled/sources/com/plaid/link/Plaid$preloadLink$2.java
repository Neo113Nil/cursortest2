package com.plaid.link;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 9, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.plaid.link.Plaid$preloadLink$2", f = "Plaid.kt", i = {0}, l = {118, 119}, m = "invokeSuspend", n = {"preloadLinkController"}, s = {"L$0"})
/* loaded from: classes3.dex */
public final class Plaid$preloadLink$2 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ com.plaid.link.OnLoadCallback $onLoad;
    java.lang.Object L$0;
    int label;

    /* JADX WARN: Code restructure failed: missing block: B:13:0x004b, code lost:
    
        if (r1.a(r5, r4) == r0) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0051, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x003e, code lost:
    
        if (r1.b(r4) != r0) goto L12;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        com.plaid.internal.InterfaceC0449a3 orCreateTokenComponent;
        com.plaid.internal.C0570k6 c0570k6;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            orCreateTokenComponent = com.plaid.link.Plaid.INSTANCE.getOrCreateTokenComponent();
            c0570k6 = ((com.plaid.internal.C0600o0) orCreateTokenComponent).q.get();
            this.L$0 = c0570k6;
            this.label = 1;
        } else {
            if (i != 1) {
                if (i != 2) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.ResultKt.throwOnFailure(obj);
                return kotlin.Unit.INSTANCE;
            }
            c0570k6 = (com.plaid.internal.C0570k6) this.L$0;
            kotlin.ResultKt.throwOnFailure(obj);
        }
        com.plaid.link.OnLoadCallback onLoadCallback = this.$onLoad;
        this.L$0 = null;
        this.label = 2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((com.plaid.link.Plaid$preloadLink$2) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.plaid.link.Plaid$preloadLink$2(this.$onLoad, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Plaid$preloadLink$2(com.plaid.link.OnLoadCallback onLoadCallback, kotlin.coroutines.Continuation<? super com.plaid.link.Plaid$preloadLink$2> continuation) {
        super(2, continuation);
        this.$onLoad = onLoadCallback;
    }
}
