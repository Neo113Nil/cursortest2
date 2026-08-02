package com.paypal.oslo.feature.packagetracking.data.source;

@kotlin.Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001JF\u0010\u000b\u001a\u0014\u0012\u0004\u0012\u00020\t\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\n0\b\"\b\b\u0000\u0010\u0003*\u00020\u00022\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006H¦@¢\u0006\u0004\b\u000b\u0010\fJ:\u0010\u0010\u001a\u0014\u0012\u0004\u0012\u00020\t\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\n0\b\"\b\b\u0000\u0010\u0003*\u00020\r2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00000\u000eH¦@¢\u0006\u0004\b\u0010\u0010\u0011À\u0006\u0003"}, d2 = {"Lcom/paypal/oslo/feature/packagetracking/data/source/PackageGraphQLExecutor;", "", "Lcom/apollographql/apollo/api/Query$Data;", "D", "Lcom/apollographql/apollo/api/Query;", "query", "Lcom/apollographql/apollo/cache/normalized/FetchPolicy;", "fetchPolicy", "Larrow/core/Ior;", "Lcom/paypal/oslo/core/network/graphql/error/CallError;", "Lcom/paypal/oslo/core/network/graphql/GraphQLData;", "executeQuery", "(Lcom/apollographql/apollo/api/Query;Lcom/apollographql/apollo/cache/normalized/FetchPolicy;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/apollographql/apollo/api/Mutation$Data;", "Lcom/apollographql/apollo/api/Mutation;", "mutation", "executeMutation", "(Lcom/apollographql/apollo/api/Mutation;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public interface PackageGraphQLExecutor {
    <D extends com.apollographql.apollo.api.Mutation.Data> java.lang.Object executeMutation(com.apollographql.apollo.api.Mutation<D> mutation, kotlin.coroutines.Continuation<? super arrow.core.Ior<? extends com.paypal.oslo.core.network.graphql.error.CallError, com.paypal.oslo.core.network.graphql.GraphQLData<D>>> continuation);

    <D extends com.apollographql.apollo.api.Query.Data> java.lang.Object executeQuery(com.apollographql.apollo.api.Query<D> query, com.apollographql.apollo.cache.normalized.FetchPolicy fetchPolicy, kotlin.coroutines.Continuation<? super arrow.core.Ior<? extends com.paypal.oslo.core.network.graphql.error.CallError, com.paypal.oslo.core.network.graphql.GraphQLData<D>>> continuation);

    @kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes13.dex */
    public static final class DefaultImpls {
    }

    static /* synthetic */ java.lang.Object executeQuery$default(com.paypal.oslo.feature.packagetracking.data.source.PackageGraphQLExecutor packageGraphQLExecutor, com.apollographql.apollo.api.Query query, com.apollographql.apollo.cache.normalized.FetchPolicy fetchPolicy, kotlin.coroutines.Continuation continuation, int i, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: executeQuery");
        }
        if ((i & 2) != 0) {
            fetchPolicy = null;
        }
        return packageGraphQLExecutor.executeQuery(query, fetchPolicy, continuation);
    }
}
