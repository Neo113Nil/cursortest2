package com.apollographql.apollo.interceptor;

@kotlin.Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u00002\u00020\u0001B\u001d\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ3\u0010\u000f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u000e0\r\"\b\b\u0000\u0010\n*\u00020\t2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000\u000bH\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0014\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015"}, d2 = {"Lcom/apollographql/apollo/interceptor/DefaultInterceptorChain;", "Lcom/apollographql/apollo/interceptor/ApolloInterceptorChain;", "", "Lcom/apollographql/apollo/interceptor/ApolloInterceptor;", "interceptors", "", "index", "<init>", "(Ljava/util/List;I)V", "Lcom/apollographql/apollo/api/Operation$Data;", "D", "Lcom/apollographql/apollo/api/ApolloRequest;", "request", "Lkotlinx/coroutines/flow/Flow;", "Lcom/apollographql/apollo/api/ApolloResponse;", "proceed", "(Lcom/apollographql/apollo/api/ApolloRequest;)Lkotlinx/coroutines/flow/Flow;", "Camera2StreamConfigurationMap", "Ljava/util/List;", "getHighSpeedVideoFpsRanges", "getHighResolutionOutputSizeshNQ4ISI", com.visa.cbp.getEncExpo.warmup}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class DefaultInterceptorChain implements com.apollographql.apollo.interceptor.ApolloInterceptorChain {

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final java.util.List<com.apollographql.apollo.interceptor.ApolloInterceptor> getHighSpeedVideoFpsRanges;
    private final int getHighResolutionOutputSizeshNQ4ISI;

    /* JADX WARN: Multi-variable type inference failed */
    public DefaultInterceptorChain(java.util.List<? extends com.apollographql.apollo.interceptor.ApolloInterceptor> list, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
        this.getHighSpeedVideoFpsRanges = list;
        this.getHighResolutionOutputSizeshNQ4ISI = i;
    }

    @Override // com.apollographql.apollo.interceptor.ApolloInterceptorChain
    public final <D extends com.apollographql.apollo.api.Operation.Data> kotlinx.coroutines.flow.Flow<com.apollographql.apollo.api.ApolloResponse<D>> proceed(com.apollographql.apollo.api.ApolloRequest<D> request) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(request, "");
        if (this.getHighResolutionOutputSizeshNQ4ISI >= this.getHighSpeedVideoFpsRanges.size()) {
            throw new java.lang.IllegalStateException("Check failed.".toString());
        }
        return this.getHighSpeedVideoFpsRanges.get(this.getHighResolutionOutputSizeshNQ4ISI).intercept(request, new com.apollographql.apollo.interceptor.DefaultInterceptorChain(this.getHighSpeedVideoFpsRanges, this.getHighResolutionOutputSizeshNQ4ISI + 1));
    }
}
