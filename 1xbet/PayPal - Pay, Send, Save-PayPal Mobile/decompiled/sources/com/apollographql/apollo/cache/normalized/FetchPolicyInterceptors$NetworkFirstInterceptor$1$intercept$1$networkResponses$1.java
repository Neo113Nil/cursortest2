package com.apollographql.apollo.cache.normalized;

/* JADX INFO: Add missing generic type declarations: [D] */
@kotlin.Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001\"\b\b\u0000\u0010\u0002*\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0005H\n"}, d2 = {"<anonymous>", "", "D", "Lcom/apollographql/apollo/api/Operation$Data;", "response", "Lcom/apollographql/apollo/api/ApolloResponse;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.apollographql.apollo.cache.normalized.FetchPolicyInterceptors$NetworkFirstInterceptor$1$intercept$1$networkResponses$1", f = "FetchPolicyInterceptors.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes3.dex */
final class FetchPolicyInterceptors$NetworkFirstInterceptor$1$intercept$1$networkResponses$1<D> extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<com.apollographql.apollo.api.ApolloResponse<D>, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ kotlin.jvm.internal.Ref.ObjectRef<com.apollographql.apollo.exception.ApolloException> getHighResolutionOutputSizeshNQ4ISI;
    int getHighSpeedVideoFpsRanges;
    /* synthetic */ java.lang.Object getHighSpeedVideoFpsRangesFor;

    /* JADX WARN: Type inference failed for: r2v5, types: [T, com.apollographql.apollo.exception.ApolloException] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.getHighSpeedVideoFpsRanges != 0) {
            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        kotlin.ResultKt.throwOnFailure(obj);
        com.apollographql.apollo.api.ApolloResponse apolloResponse = (com.apollographql.apollo.api.ApolloResponse) this.getHighSpeedVideoFpsRangesFor;
        if (apolloResponse.exception != null && this.getHighResolutionOutputSizeshNQ4ISI.element == null) {
            this.getHighResolutionOutputSizeshNQ4ISI.element = apolloResponse.exception;
        }
        return kotlin.Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(java.lang.Object obj, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((com.apollographql.apollo.cache.normalized.FetchPolicyInterceptors$NetworkFirstInterceptor$1$intercept$1$networkResponses$1) create((com.apollographql.apollo.api.ApolloResponse) obj, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        com.apollographql.apollo.cache.normalized.FetchPolicyInterceptors$NetworkFirstInterceptor$1$intercept$1$networkResponses$1 fetchPolicyInterceptors$NetworkFirstInterceptor$1$intercept$1$networkResponses$1 = new com.apollographql.apollo.cache.normalized.FetchPolicyInterceptors$NetworkFirstInterceptor$1$intercept$1$networkResponses$1(this.getHighResolutionOutputSizeshNQ4ISI, continuation);
        fetchPolicyInterceptors$NetworkFirstInterceptor$1$intercept$1$networkResponses$1.getHighSpeedVideoFpsRangesFor = obj;
        return fetchPolicyInterceptors$NetworkFirstInterceptor$1$intercept$1$networkResponses$1;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    FetchPolicyInterceptors$NetworkFirstInterceptor$1$intercept$1$networkResponses$1(kotlin.jvm.internal.Ref.ObjectRef<com.apollographql.apollo.exception.ApolloException> objectRef, kotlin.coroutines.Continuation<? super com.apollographql.apollo.cache.normalized.FetchPolicyInterceptors$NetworkFirstInterceptor$1$intercept$1$networkResponses$1> continuation) {
        super(2, continuation);
        this.getHighResolutionOutputSizeshNQ4ISI = objectRef;
    }
}
