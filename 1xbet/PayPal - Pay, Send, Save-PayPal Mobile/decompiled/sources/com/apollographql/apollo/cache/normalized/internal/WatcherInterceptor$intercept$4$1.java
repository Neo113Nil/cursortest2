package com.apollographql.apollo.cache.normalized.internal;

/* JADX INFO: Add missing generic type declarations: [D] */
@kotlin.Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001\"\b\b\u0000\u0010\u0002*\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0005H\n"}, d2 = {"<anonymous>", "", "D", "Lcom/apollographql/apollo/api/Operation$Data;", "response", "Lcom/apollographql/apollo/api/ApolloResponse;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.apollographql.apollo.cache.normalized.internal.WatcherInterceptor$intercept$4$1", f = "WatcherInterceptor.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes.dex */
final class WatcherInterceptor$intercept$4$1<D> extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<com.apollographql.apollo.api.ApolloResponse<D>, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    /* synthetic */ java.lang.Object Camera2StreamConfigurationMap;
    final /* synthetic */ kotlin.jvm.internal.Ref.ObjectRef<java.util.Set<java.lang.String>> getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ com.apollographql.apollo.api.ApolloRequest<D> getHighSpeedVideoFpsRanges;
    final /* synthetic */ com.apollographql.apollo.api.CustomScalarAdapters getHighSpeedVideoFpsRangesFor;
    int getHighSpeedVideoSizes;
    final /* synthetic */ com.apollographql.apollo.cache.normalized.internal.WatcherInterceptor getOutputMinFrameDuration;

    /* JADX WARN: Type inference failed for: r5v8, types: [T, java.util.Set] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.getHighSpeedVideoSizes != 0) {
            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        kotlin.ResultKt.throwOnFailure(obj);
        com.apollographql.apollo.api.ApolloResponse apolloResponse = (com.apollographql.apollo.api.ApolloResponse) this.Camera2StreamConfigurationMap;
        if (apolloResponse.data != 0) {
            kotlin.jvm.internal.Ref.ObjectRef<java.util.Set<java.lang.String>> objectRef = this.getHighResolutionOutputSizeshNQ4ISI;
            com.apollographql.apollo.cache.normalized.ApolloStore store = this.getOutputMinFrameDuration.getStore();
            com.apollographql.apollo.api.Operation<D> operation = this.getHighSpeedVideoFpsRanges.getOperation();
            D d = apolloResponse.data;
            kotlin.jvm.internal.Intrinsics.checkNotNull(d);
            objectRef.element = com.apollographql.apollo.cache.normalized.api.OperationCacheExtensionsKt.dependentKeys(store.normalize(operation, d, this.getHighSpeedVideoFpsRangesFor).values());
        }
        return kotlin.Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(java.lang.Object obj, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((com.apollographql.apollo.cache.normalized.internal.WatcherInterceptor$intercept$4$1) create((com.apollographql.apollo.api.ApolloResponse) obj, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        com.apollographql.apollo.cache.normalized.internal.WatcherInterceptor$intercept$4$1 watcherInterceptor$intercept$4$1 = new com.apollographql.apollo.cache.normalized.internal.WatcherInterceptor$intercept$4$1(this.getHighResolutionOutputSizeshNQ4ISI, this.getOutputMinFrameDuration, this.getHighSpeedVideoFpsRanges, this.getHighSpeedVideoFpsRangesFor, continuation);
        watcherInterceptor$intercept$4$1.Camera2StreamConfigurationMap = obj;
        return watcherInterceptor$intercept$4$1;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    WatcherInterceptor$intercept$4$1(kotlin.jvm.internal.Ref.ObjectRef<java.util.Set<java.lang.String>> objectRef, com.apollographql.apollo.cache.normalized.internal.WatcherInterceptor watcherInterceptor, com.apollographql.apollo.api.ApolloRequest<D> apolloRequest, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters, kotlin.coroutines.Continuation<? super com.apollographql.apollo.cache.normalized.internal.WatcherInterceptor$intercept$4$1> continuation) {
        super(2, continuation);
        this.getHighResolutionOutputSizeshNQ4ISI = objectRef;
        this.getOutputMinFrameDuration = watcherInterceptor;
        this.getHighSpeedVideoFpsRanges = apolloRequest;
        this.getHighSpeedVideoFpsRangesFor = customScalarAdapters;
    }
}
