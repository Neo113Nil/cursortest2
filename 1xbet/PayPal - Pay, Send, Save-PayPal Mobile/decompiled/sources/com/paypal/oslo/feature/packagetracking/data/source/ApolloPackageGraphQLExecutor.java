package com.paypal.oslo.feature.packagetracking.data.source;

@kotlin.Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005JD\u0010\u000f\u001a\u0014\u0012\u0004\u0012\u00020\r\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u000e0\f\"\b\b\u0000\u0010\u0007*\u00020\u00062\f\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\b2\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0096@¢\u0006\u0004\b\u000f\u0010\u0010J:\u0010\u0014\u001a\u0014\u0012\u0004\u0012\u00020\r\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u000e0\f\"\b\b\u0000\u0010\u0007*\u00020\u00112\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00028\u00000\u0012H\u0096@¢\u0006\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0018\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017"}, d2 = {"Lcom/paypal/oslo/feature/packagetracking/data/source/ApolloPackageGraphQLExecutor;", "Lcom/paypal/oslo/feature/packagetracking/data/source/PackageGraphQLExecutor;", "Lcom/apollographql/apollo/ApolloClient;", "apolloClient", "<init>", "(Lcom/apollographql/apollo/ApolloClient;)V", "Lcom/apollographql/apollo/api/Query$Data;", "D", "Lcom/apollographql/apollo/api/Query;", "query", "Lcom/apollographql/apollo/cache/normalized/FetchPolicy;", "fetchPolicy", "Larrow/core/Ior;", "Lcom/paypal/oslo/core/network/graphql/error/CallError;", "Lcom/paypal/oslo/core/network/graphql/GraphQLData;", "executeQuery", "(Lcom/apollographql/apollo/api/Query;Lcom/apollographql/apollo/cache/normalized/FetchPolicy;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/apollographql/apollo/api/Mutation$Data;", "Lcom/apollographql/apollo/api/Mutation;", "mutation", "executeMutation", "(Lcom/apollographql/apollo/api/Mutation;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getHighResolutionOutputSizeshNQ4ISI", "Lcom/apollographql/apollo/ApolloClient;", "getHighSpeedVideoFpsRangesFor"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class ApolloPackageGraphQLExecutor implements com.paypal.oslo.feature.packagetracking.data.source.PackageGraphQLExecutor {
    public static final int $stable = 8;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final com.apollographql.apollo.ApolloClient getHighSpeedVideoFpsRangesFor;

    @javax.inject.Inject
    public ApolloPackageGraphQLExecutor(com.apollographql.apollo.ApolloClient apolloClient) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(apolloClient, "");
        this.getHighSpeedVideoFpsRangesFor = apolloClient;
    }

    @Override // com.paypal.oslo.feature.packagetracking.data.source.PackageGraphQLExecutor
    public final <D extends com.apollographql.apollo.api.Query.Data> java.lang.Object executeQuery(com.apollographql.apollo.api.Query<D> query, com.apollographql.apollo.cache.normalized.FetchPolicy fetchPolicy, kotlin.coroutines.Continuation<? super arrow.core.Ior<? extends com.paypal.oslo.core.network.graphql.error.CallError, com.paypal.oslo.core.network.graphql.GraphQLData<D>>> continuation) {
        if (fetchPolicy != null) {
            java.lang.Object execute$default = com.paypal.oslo.core.network.graphql.ApolloClientExtensionKt.execute$default((com.apollographql.apollo.ApolloCall) com.apollographql.apollo.cache.normalized.NormalizedCache.fetchPolicy(this.getHighSpeedVideoFpsRangesFor.query(query), fetchPolicy), null, continuation, 2, null);
            return execute$default == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? execute$default : (arrow.core.Ior) execute$default;
        }
        java.lang.Object execute$default2 = com.paypal.oslo.core.network.graphql.ApolloClientExtensionKt.execute$default(this.getHighSpeedVideoFpsRangesFor, query, (com.paypal.oslo.core.network.graphql.CallConfig) null, continuation, 2, (java.lang.Object) null);
        return execute$default2 == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? execute$default2 : (arrow.core.Ior) execute$default2;
    }

    @Override // com.paypal.oslo.feature.packagetracking.data.source.PackageGraphQLExecutor
    public final <D extends com.apollographql.apollo.api.Mutation.Data> java.lang.Object executeMutation(com.apollographql.apollo.api.Mutation<D> mutation, kotlin.coroutines.Continuation<? super arrow.core.Ior<? extends com.paypal.oslo.core.network.graphql.error.CallError, com.paypal.oslo.core.network.graphql.GraphQLData<D>>> continuation) {
        return com.paypal.oslo.core.network.graphql.ApolloClientExtensionKt.execute$default(this.getHighSpeedVideoFpsRangesFor, mutation, (com.paypal.oslo.core.network.graphql.CallConfig) null, continuation, 2, (java.lang.Object) null);
    }
}
