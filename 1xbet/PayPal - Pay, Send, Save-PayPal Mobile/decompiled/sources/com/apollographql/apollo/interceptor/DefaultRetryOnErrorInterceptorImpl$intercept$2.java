package com.apollographql.apollo.interceptor;

/* JADX INFO: Add missing generic type declarations: [D] */
@kotlin.Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001\"\b\b\u0000\u0010\u0002*\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0005H\n"}, d2 = {"<anonymous>", "", "D", "Lcom/apollographql/apollo/api/Operation$Data;", "it", "Lcom/apollographql/apollo/api/ApolloResponse;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.apollographql.apollo.interceptor.DefaultRetryOnErrorInterceptorImpl$intercept$2", f = "RetryOnErrorInterceptor.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes3.dex */
final class DefaultRetryOnErrorInterceptorImpl$intercept$2<D> extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<com.apollographql.apollo.api.ApolloResponse<D>, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ boolean Camera2StreamConfigurationMap;
    int getHighResolutionOutputSizeshNQ4ISI;
    /* synthetic */ java.lang.Object getHighSpeedVideoFpsRangesFor;
    final /* synthetic */ kotlin.jvm.internal.Ref.IntRef getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.getHighResolutionOutputSizeshNQ4ISI != 0) {
            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        kotlin.ResultKt.throwOnFailure(obj);
        com.apollographql.apollo.api.ApolloResponse apolloResponse = (com.apollographql.apollo.api.ApolloResponse) this.getHighSpeedVideoFpsRangesFor;
        if (this.Camera2StreamConfigurationMap && apolloResponse.exception != null) {
            com.apollographql.apollo.exception.ApolloException apolloException = apolloResponse.exception;
            kotlin.jvm.internal.Intrinsics.checkNotNull(apolloException);
            if (com.apollographql.apollo.interceptor.RetryOnErrorInterceptorKt.access$isRecoverable(apolloException)) {
                throw com.apollographql.apollo.interceptor.RetryException.INSTANCE;
            }
        }
        this.getHighSpeedVideoSizes.element = 0;
        return kotlin.Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(java.lang.Object obj, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((com.apollographql.apollo.interceptor.DefaultRetryOnErrorInterceptorImpl$intercept$2) create((com.apollographql.apollo.api.ApolloResponse) obj, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        com.apollographql.apollo.interceptor.DefaultRetryOnErrorInterceptorImpl$intercept$2 defaultRetryOnErrorInterceptorImpl$intercept$2 = new com.apollographql.apollo.interceptor.DefaultRetryOnErrorInterceptorImpl$intercept$2(this.Camera2StreamConfigurationMap, this.getHighSpeedVideoSizes, continuation);
        defaultRetryOnErrorInterceptorImpl$intercept$2.getHighSpeedVideoFpsRangesFor = obj;
        return defaultRetryOnErrorInterceptorImpl$intercept$2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    DefaultRetryOnErrorInterceptorImpl$intercept$2(boolean z, kotlin.jvm.internal.Ref.IntRef intRef, kotlin.coroutines.Continuation<? super com.apollographql.apollo.interceptor.DefaultRetryOnErrorInterceptorImpl$intercept$2> continuation) {
        super(2, continuation);
        this.Camera2StreamConfigurationMap = z;
        this.getHighSpeedVideoSizes = intRef;
    }
}
