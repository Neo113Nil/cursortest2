package com.apollographql.apollo.interceptor;

@kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0002\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J;\u0010\r\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\f0\u000b\"\b\b\u0000\u0010\u0007*\u00020\u00062\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\b2\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\r\u0010\u000eR\u0016\u0010\u0011\u001a\u0004\u0018\u00010\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010"}, d2 = {"Lcom/apollographql/apollo/interceptor/DefaultRetryOnErrorInterceptorImpl;", "Lcom/apollographql/apollo/interceptor/ApolloInterceptor;", "Lcom/apollographql/apollo/network/NetworkMonitor;", "p0", "<init>", "(Lcom/apollographql/apollo/network/NetworkMonitor;)V", "Lcom/apollographql/apollo/api/Operation$Data;", "D", "Lcom/apollographql/apollo/api/ApolloRequest;", "Lcom/apollographql/apollo/interceptor/ApolloInterceptorChain;", "p1", "Lkotlinx/coroutines/flow/Flow;", "Lcom/apollographql/apollo/api/ApolloResponse;", "intercept", "(Lcom/apollographql/apollo/api/ApolloRequest;Lcom/apollographql/apollo/interceptor/ApolloInterceptorChain;)Lkotlinx/coroutines/flow/Flow;", "getHighResolutionOutputSizeshNQ4ISI", "Lcom/apollographql/apollo/network/NetworkMonitor;", "getHighSpeedVideoFpsRanges"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
final class DefaultRetryOnErrorInterceptorImpl implements com.apollographql.apollo.interceptor.ApolloInterceptor {

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final com.apollographql.apollo.network.NetworkMonitor getHighSpeedVideoFpsRanges;

    public DefaultRetryOnErrorInterceptorImpl(com.apollographql.apollo.network.NetworkMonitor networkMonitor) {
        this.getHighSpeedVideoFpsRanges = networkMonitor;
    }

    @Override // com.apollographql.apollo.interceptor.ApolloInterceptor
    public final <D extends com.apollographql.apollo.api.Operation.Data> kotlinx.coroutines.flow.Flow<com.apollographql.apollo.api.ApolloResponse<D>> intercept(com.apollographql.apollo.api.ApolloRequest<D> p0, com.apollographql.apollo.interceptor.ApolloInterceptorChain p1) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p0, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p1, "");
        java.lang.Boolean failFastIfOffline = p0.getFailFastIfOffline();
        boolean booleanValue = failFastIfOffline != null ? failFastIfOffline.booleanValue() : false;
        java.lang.Boolean retryOnError = p0.getRetryOnError();
        boolean booleanValue2 = retryOnError != null ? retryOnError.booleanValue() : false;
        if (!booleanValue && !booleanValue2) {
            return p1.proceed(p0);
        }
        kotlin.jvm.internal.Ref.IntRef intRef = new kotlin.jvm.internal.Ref.IntRef();
        return kotlinx.coroutines.flow.FlowKt.retryWhen(kotlinx.coroutines.flow.FlowKt.onEach(kotlinx.coroutines.flow.FlowKt.flow(new com.apollographql.apollo.interceptor.DefaultRetryOnErrorInterceptorImpl$intercept$1(booleanValue, this, p0, p1.proceed(p0), null)), new com.apollographql.apollo.interceptor.DefaultRetryOnErrorInterceptorImpl$intercept$2(booleanValue2, intRef, null)), new com.apollographql.apollo.interceptor.DefaultRetryOnErrorInterceptorImpl$intercept$3(intRef, this, null));
    }
}
