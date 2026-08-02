package com.apollographql.apollo.cache.normalized.internal;

/* JADX INFO: Add missing generic type declarations: [D] */
@kotlin.Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001\"\b\b\u0000\u0010\u0002*\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0005H\n"}, d2 = {"<anonymous>", "", "D", "Lcom/apollographql/apollo/api/Operation$Data;", "it", "Lcom/apollographql/apollo/api/ApolloResponse;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.apollographql.apollo.cache.normalized.internal.ApolloCacheInterceptor$readFromNetwork$1", f = "ApolloCacheInterceptor.kt", i = {}, l = {com.plaid.internal.EnumC0527g.SDK_ASSET_HEADER_SHIELD_VALUE}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes.dex */
final class ApolloCacheInterceptor$readFromNetwork$1<D> extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<com.apollographql.apollo.api.ApolloResponse<D>, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ com.apollographql.apollo.api.ApolloRequest<D> Camera2StreamConfigurationMap;
    final /* synthetic */ com.apollographql.apollo.cache.normalized.internal.ApolloCacheInterceptor getHighResolutionOutputSizeshNQ4ISI;
    /* synthetic */ java.lang.Object getHighSpeedVideoFpsRanges;
    int getHighSpeedVideoFpsRangesFor;
    final /* synthetic */ com.apollographql.apollo.api.CustomScalarAdapters getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object highSpeedVideoFpsRanges;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.getHighSpeedVideoFpsRangesFor;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            com.apollographql.apollo.api.ApolloResponse apolloResponse = (com.apollographql.apollo.api.ApolloResponse) this.getHighSpeedVideoFpsRanges;
            this.getHighSpeedVideoFpsRangesFor = 1;
            highSpeedVideoFpsRanges = this.getHighResolutionOutputSizeshNQ4ISI.getHighSpeedVideoFpsRanges(this.Camera2StreamConfigurationMap, apolloResponse, this.getHighSpeedVideoSizes, kotlin.collections.SetsKt.emptySet(), this);
            if (highSpeedVideoFpsRanges == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        return kotlin.Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(java.lang.Object obj, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((com.apollographql.apollo.cache.normalized.internal.ApolloCacheInterceptor$readFromNetwork$1) create((com.apollographql.apollo.api.ApolloResponse) obj, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        com.apollographql.apollo.cache.normalized.internal.ApolloCacheInterceptor$readFromNetwork$1 apolloCacheInterceptor$readFromNetwork$1 = new com.apollographql.apollo.cache.normalized.internal.ApolloCacheInterceptor$readFromNetwork$1(this.getHighResolutionOutputSizeshNQ4ISI, this.Camera2StreamConfigurationMap, this.getHighSpeedVideoSizes, continuation);
        apolloCacheInterceptor$readFromNetwork$1.getHighSpeedVideoFpsRanges = obj;
        return apolloCacheInterceptor$readFromNetwork$1;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ApolloCacheInterceptor$readFromNetwork$1(com.apollographql.apollo.cache.normalized.internal.ApolloCacheInterceptor apolloCacheInterceptor, com.apollographql.apollo.api.ApolloRequest<D> apolloRequest, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters, kotlin.coroutines.Continuation<? super com.apollographql.apollo.cache.normalized.internal.ApolloCacheInterceptor$readFromNetwork$1> continuation) {
        super(2, continuation);
        this.getHighResolutionOutputSizeshNQ4ISI = apolloCacheInterceptor;
        this.Camera2StreamConfigurationMap = apolloRequest;
        this.getHighSpeedVideoSizes = customScalarAdapters;
    }
}
