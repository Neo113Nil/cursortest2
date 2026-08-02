package com.apollographql.apollo.cache.normalized.internal;

/* JADX INFO: Add missing generic type declarations: [D] */
@kotlin.Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001\"\b\b\u0000\u0010\u0002*\u00020\u0003*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00020\u00050\u0004H\n"}, d2 = {"<anonymous>", "", "D", "Lcom/apollographql/apollo/api/Query$Data;", "Lkotlinx/coroutines/flow/FlowCollector;", "Lcom/apollographql/apollo/api/ApolloResponse;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.apollographql.apollo.cache.normalized.internal.ApolloCacheInterceptor$interceptQuery$1", f = "ApolloCacheInterceptor.kt", i = {}, l = {com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_ARROW_UP_VALUE, 200}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes.dex */
final class ApolloCacheInterceptor$interceptQuery$1<D> extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.flow.FlowCollector<? super com.apollographql.apollo.api.ApolloResponse<D>>, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ com.apollographql.apollo.api.ApolloRequest<D> Camera2StreamConfigurationMap;
    final /* synthetic */ boolean getHighResolutionOutputSizeshNQ4ISI;
    int getHighSpeedVideoFpsRanges;
    final /* synthetic */ com.apollographql.apollo.interceptor.ApolloInterceptorChain getHighSpeedVideoFpsRangesFor;
    final /* synthetic */ com.apollographql.apollo.api.CustomScalarAdapters getHighSpeedVideoSizes;
    final /* synthetic */ com.apollographql.apollo.cache.normalized.internal.ApolloCacheInterceptor getInputFormats;
    private /* synthetic */ java.lang.Object getOutputMinFrameDuration;

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0039, code lost:
    
        if (r7.emit(r1, r6) == r0) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0053, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0051, code lost:
    
        if (kotlinx.coroutines.flow.FlowKt.emitAll(r7, com.apollographql.apollo.cache.normalized.internal.ApolloCacheInterceptor.access$readFromNetwork(r6.getInputFormats, r6.Camera2StreamConfigurationMap, r6.getHighSpeedVideoFpsRangesFor, r6.getHighSpeedVideoSizes), r6) == r0) goto L17;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        com.apollographql.apollo.api.ApolloResponse highResolutionOutputSizeshNQ4ISI;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.getHighSpeedVideoFpsRanges;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            kotlinx.coroutines.flow.FlowCollector flowCollector = (kotlinx.coroutines.flow.FlowCollector) this.getOutputMinFrameDuration;
            if (this.getHighResolutionOutputSizeshNQ4ISI) {
                highResolutionOutputSizeshNQ4ISI = this.getInputFormats.getHighResolutionOutputSizeshNQ4ISI(this.Camera2StreamConfigurationMap, this.getHighSpeedVideoSizes);
                this.getHighSpeedVideoFpsRanges = 1;
            } else {
                this.getHighSpeedVideoFpsRanges = 2;
            }
        } else {
            if (i != 1 && i != 2) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        return kotlin.Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(java.lang.Object obj, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((com.apollographql.apollo.cache.normalized.internal.ApolloCacheInterceptor$interceptQuery$1) create((kotlinx.coroutines.flow.FlowCollector) obj, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        com.apollographql.apollo.cache.normalized.internal.ApolloCacheInterceptor$interceptQuery$1 apolloCacheInterceptor$interceptQuery$1 = new com.apollographql.apollo.cache.normalized.internal.ApolloCacheInterceptor$interceptQuery$1(this.getHighResolutionOutputSizeshNQ4ISI, this.getInputFormats, this.Camera2StreamConfigurationMap, this.getHighSpeedVideoSizes, this.getHighSpeedVideoFpsRangesFor, continuation);
        apolloCacheInterceptor$interceptQuery$1.getOutputMinFrameDuration = obj;
        return apolloCacheInterceptor$interceptQuery$1;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ApolloCacheInterceptor$interceptQuery$1(boolean z, com.apollographql.apollo.cache.normalized.internal.ApolloCacheInterceptor apolloCacheInterceptor, com.apollographql.apollo.api.ApolloRequest<D> apolloRequest, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters, com.apollographql.apollo.interceptor.ApolloInterceptorChain apolloInterceptorChain, kotlin.coroutines.Continuation<? super com.apollographql.apollo.cache.normalized.internal.ApolloCacheInterceptor$interceptQuery$1> continuation) {
        super(2, continuation);
        this.getHighResolutionOutputSizeshNQ4ISI = z;
        this.getInputFormats = apolloCacheInterceptor;
        this.Camera2StreamConfigurationMap = apolloRequest;
        this.getHighSpeedVideoSizes = customScalarAdapters;
        this.getHighSpeedVideoFpsRangesFor = apolloInterceptorChain;
    }
}
