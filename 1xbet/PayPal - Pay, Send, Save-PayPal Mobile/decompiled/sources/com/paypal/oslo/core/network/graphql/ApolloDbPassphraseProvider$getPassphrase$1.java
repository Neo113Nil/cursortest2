package com.paypal.oslo.core.network.graphql;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0012\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.core.network.graphql.ApolloDbPassphraseProvider$getPassphrase$1", f = "ApolloDbPassphraseProvider.kt", i = {}, l = {51}, m = "invokeSuspend", n = {}, nl = {-1}, s = {}, v = 2)
/* loaded from: classes4.dex */
final class ApolloDbPassphraseProvider$getPassphrase$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super byte[]>, java.lang.Object> {
    final /* synthetic */ com.paypal.oslo.core.network.graphql.ApolloDbPassphraseProvider Camera2StreamConfigurationMap;
    int getHighResolutionOutputSizeshNQ4ISI;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        kotlinx.coroutines.Deferred deferred;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.getHighResolutionOutputSizeshNQ4ISI;
        if (i != 0) {
            if (i != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
            return obj;
        }
        kotlin.ResultKt.throwOnFailure(obj);
        deferred = this.Camera2StreamConfigurationMap.getHighSpeedVideoSizes;
        this.getHighResolutionOutputSizeshNQ4ISI = 1;
        java.lang.Object await = deferred.await(this);
        return await == coroutine_suspended ? coroutine_suspended : await;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super byte[]> continuation) {
        return ((com.paypal.oslo.core.network.graphql.ApolloDbPassphraseProvider$getPassphrase$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.paypal.oslo.core.network.graphql.ApolloDbPassphraseProvider$getPassphrase$1(this.Camera2StreamConfigurationMap, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ApolloDbPassphraseProvider$getPassphrase$1(com.paypal.oslo.core.network.graphql.ApolloDbPassphraseProvider apolloDbPassphraseProvider, kotlin.coroutines.Continuation<? super com.paypal.oslo.core.network.graphql.ApolloDbPassphraseProvider$getPassphrase$1> continuation) {
        super(2, continuation);
        this.Camera2StreamConfigurationMap = apolloDbPassphraseProvider;
    }
}
