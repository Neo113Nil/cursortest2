package com.apollographql.apollo.interceptor;

@kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J;\u0010\u000f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u000e0\r\"\b\b\u0000\u0010\b*\u00020\u00072\f\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\t2\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0013\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0014\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0012"}, d2 = {"Lcom/apollographql/apollo/interceptor/NetworkInterceptor;", "Lcom/apollographql/apollo/interceptor/ApolloInterceptor;", "Lcom/apollographql/apollo/network/NetworkTransport;", "networkTransport", "subscriptionNetworkTransport", "<init>", "(Lcom/apollographql/apollo/network/NetworkTransport;Lcom/apollographql/apollo/network/NetworkTransport;)V", "Lcom/apollographql/apollo/api/Operation$Data;", "D", "Lcom/apollographql/apollo/api/ApolloRequest;", "request", "Lcom/apollographql/apollo/interceptor/ApolloInterceptorChain;", "chain", "Lkotlinx/coroutines/flow/Flow;", "Lcom/apollographql/apollo/api/ApolloResponse;", "intercept", "(Lcom/apollographql/apollo/api/ApolloRequest;Lcom/apollographql/apollo/interceptor/ApolloInterceptorChain;)Lkotlinx/coroutines/flow/Flow;", "Camera2StreamConfigurationMap", "Lcom/apollographql/apollo/network/NetworkTransport;", "getHighResolutionOutputSizeshNQ4ISI", "getHighSpeedVideoFpsRangesFor"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class NetworkInterceptor implements com.apollographql.apollo.interceptor.ApolloInterceptor {

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final com.apollographql.apollo.network.NetworkTransport getHighResolutionOutputSizeshNQ4ISI;
    private final com.apollographql.apollo.network.NetworkTransport getHighSpeedVideoFpsRangesFor;

    public NetworkInterceptor(com.apollographql.apollo.network.NetworkTransport networkTransport, com.apollographql.apollo.network.NetworkTransport networkTransport2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(networkTransport, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(networkTransport2, "");
        this.getHighResolutionOutputSizeshNQ4ISI = networkTransport;
        this.getHighSpeedVideoFpsRangesFor = networkTransport2;
    }

    @Override // com.apollographql.apollo.interceptor.ApolloInterceptor
    public final <D extends com.apollographql.apollo.api.Operation.Data> kotlinx.coroutines.flow.Flow<com.apollographql.apollo.api.ApolloResponse<D>> intercept(com.apollographql.apollo.api.ApolloRequest<D> request, com.apollographql.apollo.interceptor.ApolloInterceptorChain chain) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(request, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(chain, "");
        com.apollographql.apollo.api.Operation<D> operation = request.getOperation();
        if (!(operation instanceof com.apollographql.apollo.api.Query) && !(operation instanceof com.apollographql.apollo.api.Mutation)) {
            if (operation instanceof com.apollographql.apollo.api.Subscription) {
                return this.getHighSpeedVideoFpsRangesFor.execute(request);
            }
            throw new java.lang.IllegalStateException("".toString());
        }
        return this.getHighResolutionOutputSizeshNQ4ISI.execute(request);
    }
}
