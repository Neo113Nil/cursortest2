package com.apollographql.apollo.cache.normalized;

/* JADX INFO: Add missing generic type declarations: [D] */
@kotlin.Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001\"\b\b\u0000\u0010\u0002*\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0005H\n"}, d2 = {"<anonymous>", "", "D", "Lcom/apollographql/apollo/api/Operation$Data;", "it", "Lcom/apollographql/apollo/api/ApolloResponse;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.apollographql.apollo.cache.normalized.CacheMissLoggingInterceptor$intercept$1", f = "CacheMissLoggingInterceptor.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes.dex */
final class CacheMissLoggingInterceptor$intercept$1<D> extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<com.apollographql.apollo.api.ApolloResponse<D>, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    /* synthetic */ java.lang.Object Camera2StreamConfigurationMap;
    final /* synthetic */ com.apollographql.apollo.cache.normalized.CacheMissLoggingInterceptor getHighSpeedVideoFpsRanges;
    int getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        kotlin.jvm.functions.Function1 function1;
        kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.getHighSpeedVideoSizes != 0) {
            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        kotlin.ResultKt.throwOnFailure(obj);
        com.apollographql.apollo.api.ApolloResponse apolloResponse = (com.apollographql.apollo.api.ApolloResponse) this.Camera2StreamConfigurationMap;
        if (apolloResponse.exception instanceof com.apollographql.apollo.exception.CacheMissException) {
            function1 = this.getHighSpeedVideoFpsRanges.Camera2StreamConfigurationMap;
            com.apollographql.apollo.exception.ApolloException apolloException = apolloResponse.exception;
            kotlin.jvm.internal.Intrinsics.checkNotNull(apolloException);
            function1.invoke(java.lang.String.valueOf(apolloException.getMessage()));
        }
        return kotlin.Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(java.lang.Object obj, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((com.apollographql.apollo.cache.normalized.CacheMissLoggingInterceptor$intercept$1) create((com.apollographql.apollo.api.ApolloResponse) obj, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        com.apollographql.apollo.cache.normalized.CacheMissLoggingInterceptor$intercept$1 cacheMissLoggingInterceptor$intercept$1 = new com.apollographql.apollo.cache.normalized.CacheMissLoggingInterceptor$intercept$1(this.getHighSpeedVideoFpsRanges, continuation);
        cacheMissLoggingInterceptor$intercept$1.Camera2StreamConfigurationMap = obj;
        return cacheMissLoggingInterceptor$intercept$1;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    CacheMissLoggingInterceptor$intercept$1(com.apollographql.apollo.cache.normalized.CacheMissLoggingInterceptor cacheMissLoggingInterceptor, kotlin.coroutines.Continuation<? super com.apollographql.apollo.cache.normalized.CacheMissLoggingInterceptor$intercept$1> continuation) {
        super(2, continuation);
        this.getHighSpeedVideoFpsRanges = cacheMissLoggingInterceptor;
    }
}
