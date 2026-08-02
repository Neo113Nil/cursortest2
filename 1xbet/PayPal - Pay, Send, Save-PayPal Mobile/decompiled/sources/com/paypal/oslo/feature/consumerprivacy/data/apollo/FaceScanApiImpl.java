package com.paypal.oslo.feature.consumerprivacy.data.apollo;

@kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\"\u0010\n\u001a\u0014\u0012\u0004\u0012\u00020\u0007\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b0\u0006H\u0096@¢\u0006\u0004\b\n\u0010\u000bJ\"\u0010\r\u001a\u0014\u0012\u0004\u0012\u00020\u0007\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\b0\u0006H\u0096@¢\u0006\u0004\b\r\u0010\u000bR\u0014\u0010\u000e\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000f"}, d2 = {"Lcom/paypal/oslo/feature/consumerprivacy/data/apollo/FaceScanApiImpl;", "Lcom/paypal/oslo/feature/consumerprivacy/data/apollo/FaceScanApi;", "Lcom/apollographql/apollo/ApolloClient;", "apolloClient", "<init>", "(Lcom/apollographql/apollo/ApolloClient;)V", "Larrow/core/Ior;", "Lcom/paypal/oslo/core/network/graphql/error/CallError;", "Lcom/paypal/oslo/core/network/graphql/GraphQLData;", "Lcom/paypal/oslo/feature/consumerprivacy/graphql/GetFaceScanStatusQuery$Data;", "getFaceScanStatus", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/paypal/oslo/feature/consumerprivacy/graphql/DeleteFaceScanDataMutation$Data;", "deleteFaceScanData", "getHighResolutionOutputSizeshNQ4ISI", "Lcom/apollographql/apollo/ApolloClient;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class FaceScanApiImpl implements com.paypal.oslo.feature.consumerprivacy.data.apollo.FaceScanApi {
    public static final int $stable = 8;
    private final com.apollographql.apollo.ApolloClient getHighResolutionOutputSizeshNQ4ISI;

    @javax.inject.Inject
    public FaceScanApiImpl(com.apollographql.apollo.ApolloClient apolloClient) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(apolloClient, "");
        this.getHighResolutionOutputSizeshNQ4ISI = apolloClient;
    }

    @Override // com.paypal.oslo.feature.consumerprivacy.data.apollo.FaceScanApi
    public final java.lang.Object getFaceScanStatus(kotlin.coroutines.Continuation<? super arrow.core.Ior<? extends com.paypal.oslo.core.network.graphql.error.CallError, com.paypal.oslo.core.network.graphql.GraphQLData<com.paypal.oslo.feature.consumerprivacy.graphql.GetFaceScanStatusQuery.Data>>> continuation) {
        return com.paypal.oslo.core.network.graphql.ApolloClientExtensionKt.execute$default((com.apollographql.apollo.ApolloCall) com.apollographql.apollo.cache.normalized.NormalizedCache.fetchPolicy(this.getHighResolutionOutputSizeshNQ4ISI.query(new com.paypal.oslo.feature.consumerprivacy.graphql.GetFaceScanStatusQuery()), com.apollographql.apollo.cache.normalized.FetchPolicy.NetworkOnly), null, continuation, 2, null);
    }

    @Override // com.paypal.oslo.feature.consumerprivacy.data.apollo.FaceScanApi
    public final java.lang.Object deleteFaceScanData(kotlin.coroutines.Continuation<? super arrow.core.Ior<? extends com.paypal.oslo.core.network.graphql.error.CallError, com.paypal.oslo.core.network.graphql.GraphQLData<com.paypal.oslo.feature.consumerprivacy.graphql.DeleteFaceScanDataMutation.Data>>> continuation) {
        return com.paypal.oslo.core.network.graphql.ApolloClientExtensionKt.execute$default(this.getHighResolutionOutputSizeshNQ4ISI.mutation(new com.paypal.oslo.feature.consumerprivacy.graphql.DeleteFaceScanDataMutation()), null, continuation, 2, null);
    }
}
