package com.plaid.link;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 9, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.plaid.link.Plaid$createWithoutPreload$1", f = "Plaid.kt", i = {}, l = {250}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes3.dex */
public final class Plaid$createWithoutPreload$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ com.plaid.link.configuration.LinkTokenConfiguration $linkTokenConfiguration;
    int label;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object linkConfiguration;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            com.plaid.link.Plaid plaid = com.plaid.link.Plaid.INSTANCE;
            com.plaid.link.configuration.LinkTokenConfiguration linkTokenConfiguration = this.$linkTokenConfiguration;
            this.label = 1;
            linkConfiguration = plaid.setLinkConfiguration(linkTokenConfiguration, this);
            if (linkConfiguration == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        com.plaid.internal.C0452a6.a aVar = com.plaid.internal.C0452a6.f5996a;
        com.plaid.internal.C0452a6.a.a("Link token configuration stored to disk", true);
        return kotlin.Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    public final java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((com.plaid.link.Plaid$createWithoutPreload$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.plaid.link.Plaid$createWithoutPreload$1(this.$linkTokenConfiguration, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Plaid$createWithoutPreload$1(com.plaid.link.configuration.LinkTokenConfiguration linkTokenConfiguration, kotlin.coroutines.Continuation<? super com.plaid.link.Plaid$createWithoutPreload$1> continuation) {
        super(2, continuation);
        this.$linkTokenConfiguration = linkTokenConfiguration;
    }
}
