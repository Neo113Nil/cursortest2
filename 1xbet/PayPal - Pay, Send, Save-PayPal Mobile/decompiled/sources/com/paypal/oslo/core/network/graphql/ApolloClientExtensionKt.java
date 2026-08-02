package com.paypal.oslo.core.network.graphql;

@kotlin.Metadata(d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0003\u001aH\u0010\n\u001a\u0014\u0012\u0004\u0012\u00020\b\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\t0\u0007\"\b\b\u0000\u0010\u0001*\u00020\u0000*\u00020\u00022\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0005H\u0086@¢\u0006\u0004\b\n\u0010\u000b\u001aH\u0010\n\u001a\u0014\u0012\u0004\u0012\u00020\b\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\t0\u0007\"\b\b\u0000\u0010\u0001*\u00020\f*\u00020\u00022\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00000\r2\b\b\u0002\u0010\u0006\u001a\u00020\u0005H\u0086@¢\u0006\u0004\b\n\u0010\u000f\u001aD\u0010\n\u001a\u0014\u0012\u0004\u0012\u00020\b\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\t0\u0007\"\b\b\u0000\u0010\u0001*\u00020\u00102\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00028\u00000\u00112\b\b\u0002\u0010\u0006\u001a\u00020\u0005H\u0086@¢\u0006\u0004\b\n\u0010\u0013\u001aM\u0010\u0018\u001a\u001a\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00020\b\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\t0\u00070\u0017\"\b\b\u0000\u0010\u0001*\u00020\u0014*\u00020\u00022\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00028\u00000\u00152\b\b\u0002\u0010\u0006\u001a\u00020\u0005H\u0000¢\u0006\u0004\b\u0018\u0010\u0019\u001aI\u0010\u0018\u001a\u001a\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00020\b\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\t0\u00070\u0017\"\b\b\u0000\u0010\u0001*\u00020\u00142\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00028\u00000\u00112\b\b\u0002\u0010\u0006\u001a\u00020\u0005H\u0000¢\u0006\u0004\b\u0018\u0010\u001a\u001a1\u0010\u001d\u001a\b\u0012\u0004\u0012\u00028\u00000\u0011\"\b\b\u0000\u0010\u0001*\u00020\u0010*\b\u0012\u0004\u0012\u00028\u00000\u00112\u0006\u0010\u001c\u001a\u00020\u001bH\u0002¢\u0006\u0004\b\u001d\u0010\u001e\u001a=\u0010!\u001a\b\u0012\u0004\u0012\u00028\u00000\u0011\"\b\b\u0000\u0010\u0001*\u00020\u0010*\b\u0012\u0004\u0012\u00028\u00000\u00112\u0012\u0010\u001c\u001a\u000e\u0012\u0004\u0012\u00020 \u0012\u0004\u0012\u00020 0\u001fH\u0002¢\u0006\u0004\b!\u0010\"\"\u001a\u0010'\u001a\b\u0012\u0004\u0012\u00020$0#8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b%\u0010&"}, d2 = {"Lcom/apollographql/apollo/api/Query$Data;", "D", "Lcom/apollographql/apollo/ApolloClient;", "Lcom/apollographql/apollo/api/Query;", "query", "Lcom/paypal/oslo/core/network/graphql/CallConfig;", "config", "Larrow/core/Ior;", "Lcom/paypal/oslo/core/network/graphql/error/CallError;", "Lcom/paypal/oslo/core/network/graphql/GraphQLData;", "execute", "(Lcom/apollographql/apollo/ApolloClient;Lcom/apollographql/apollo/api/Query;Lcom/paypal/oslo/core/network/graphql/CallConfig;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/apollographql/apollo/api/Mutation$Data;", "Lcom/apollographql/apollo/api/Mutation;", "mutation", "(Lcom/apollographql/apollo/ApolloClient;Lcom/apollographql/apollo/api/Mutation;Lcom/paypal/oslo/core/network/graphql/CallConfig;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/apollographql/apollo/api/Operation$Data;", "Lcom/apollographql/apollo/ApolloCall;", androidx.core.app.NotificationCompat.CATEGORY_CALL, "(Lcom/apollographql/apollo/ApolloCall;Lcom/paypal/oslo/core/network/graphql/CallConfig;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/apollographql/apollo/api/Subscription$Data;", "Lcom/apollographql/apollo/api/Subscription;", "subscription", "Lkotlinx/coroutines/flow/Flow;", "toFlow", "(Lcom/apollographql/apollo/ApolloClient;Lcom/apollographql/apollo/api/Subscription;Lcom/paypal/oslo/core/network/graphql/CallConfig;)Lkotlinx/coroutines/flow/Flow;", "(Lcom/apollographql/apollo/ApolloCall;Lcom/paypal/oslo/core/network/graphql/CallConfig;)Lkotlinx/coroutines/flow/Flow;", "Lcom/paypal/oslo/core/network/graphql/AuthType;", "p0", "getHighSpeedVideoFpsRanges", "(Lcom/apollographql/apollo/ApolloCall;Lcom/paypal/oslo/core/network/graphql/AuthType;)Lcom/apollographql/apollo/ApolloCall;", "", "", "getHighResolutionOutputSizeshNQ4ISI", "(Lcom/apollographql/apollo/ApolloCall;Ljava/util/Map;)Lcom/apollographql/apollo/ApolloCall;", "", "Lcom/paypal/oslo/core/network/http/error/NetworkErrorMapper;", "getHighSpeedVideoFpsRangesFor", "Ljava/util/Set;", "Camera2StreamConfigurationMap"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class ApolloClientExtensionKt {
    private static final java.util.Set<com.paypal.oslo.core.network.http.error.NetworkErrorMapper> getHighSpeedVideoFpsRangesFor = kotlin.collections.SetsKt.setOf((java.lang.Object[]) new com.paypal.oslo.core.network.http.error.NetworkErrorMapper[]{new com.paypal.oslo.core.network.graphql.error.ApolloErrorMapper(), new com.paypal.oslo.core.network.http.error.HttpErrorMapper()});

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ java.lang.Object execute$default(com.apollographql.apollo.ApolloClient apolloClient, com.apollographql.apollo.api.Query query, com.paypal.oslo.core.network.graphql.CallConfig callConfig, kotlin.coroutines.Continuation continuation, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            callConfig = new com.paypal.oslo.core.network.graphql.CallConfig(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
        }
        return execute(apolloClient, query, callConfig, continuation);
    }

    public static final <D extends com.apollographql.apollo.api.Query.Data> java.lang.Object execute(com.apollographql.apollo.ApolloClient apolloClient, com.apollographql.apollo.api.Query<D> query, com.paypal.oslo.core.network.graphql.CallConfig callConfig, kotlin.coroutines.Continuation<? super arrow.core.Ior<? extends com.paypal.oslo.core.network.graphql.error.CallError, com.paypal.oslo.core.network.graphql.GraphQLData<D>>> continuation) {
        return execute(apolloClient.query(query), callConfig, continuation);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ java.lang.Object execute$default(com.apollographql.apollo.ApolloClient apolloClient, com.apollographql.apollo.api.Mutation mutation, com.paypal.oslo.core.network.graphql.CallConfig callConfig, kotlin.coroutines.Continuation continuation, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            callConfig = new com.paypal.oslo.core.network.graphql.CallConfig(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
        }
        return execute(apolloClient, mutation, callConfig, continuation);
    }

    public static final <D extends com.apollographql.apollo.api.Mutation.Data> java.lang.Object execute(com.apollographql.apollo.ApolloClient apolloClient, com.apollographql.apollo.api.Mutation<D> mutation, com.paypal.oslo.core.network.graphql.CallConfig callConfig, kotlin.coroutines.Continuation<? super arrow.core.Ior<? extends com.paypal.oslo.core.network.graphql.error.CallError, com.paypal.oslo.core.network.graphql.GraphQLData<D>>> continuation) {
        return execute(apolloClient.mutation(mutation), callConfig, continuation);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ java.lang.Object execute$default(com.apollographql.apollo.ApolloCall apolloCall, com.paypal.oslo.core.network.graphql.CallConfig callConfig, kotlin.coroutines.Continuation continuation, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            callConfig = new com.paypal.oslo.core.network.graphql.CallConfig(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
        }
        return execute(apolloCall, callConfig, continuation);
    }

    public static final <D extends com.apollographql.apollo.api.Operation.Data> java.lang.Object execute(com.apollographql.apollo.ApolloCall<D> apolloCall, com.paypal.oslo.core.network.graphql.CallConfig callConfig, kotlin.coroutines.Continuation<? super arrow.core.Ior<? extends com.paypal.oslo.core.network.graphql.error.CallError, com.paypal.oslo.core.network.graphql.GraphQLData<D>>> continuation) {
        return new com.paypal.oslo.core.network.graphql.error.ApolloQueryExecutor(getHighSpeedVideoFpsRangesFor).execute(getHighResolutionOutputSizeshNQ4ISI(getHighSpeedVideoFpsRanges(apolloCall, callConfig.getAuthType()), callConfig.getHeaders()), continuation);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ kotlinx.coroutines.flow.Flow toFlow$default(com.apollographql.apollo.ApolloClient apolloClient, com.apollographql.apollo.api.Subscription subscription, com.paypal.oslo.core.network.graphql.CallConfig callConfig, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            callConfig = new com.paypal.oslo.core.network.graphql.CallConfig(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
        }
        return toFlow(apolloClient, subscription, callConfig);
    }

    public static final <D extends com.apollographql.apollo.api.Subscription.Data> kotlinx.coroutines.flow.Flow<arrow.core.Ior<com.paypal.oslo.core.network.graphql.error.CallError, com.paypal.oslo.core.network.graphql.GraphQLData<D>>> toFlow(com.apollographql.apollo.ApolloClient apolloClient, com.apollographql.apollo.api.Subscription<D> subscription, com.paypal.oslo.core.network.graphql.CallConfig callConfig) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(apolloClient, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(subscription, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(callConfig, "");
        return toFlow(apolloClient.subscription(subscription), callConfig);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ kotlinx.coroutines.flow.Flow toFlow$default(com.apollographql.apollo.ApolloCall apolloCall, com.paypal.oslo.core.network.graphql.CallConfig callConfig, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            callConfig = new com.paypal.oslo.core.network.graphql.CallConfig(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
        }
        return toFlow(apolloCall, callConfig);
    }

    public static final <D extends com.apollographql.apollo.api.Subscription.Data> kotlinx.coroutines.flow.Flow<arrow.core.Ior<com.paypal.oslo.core.network.graphql.error.CallError, com.paypal.oslo.core.network.graphql.GraphQLData<D>>> toFlow(com.apollographql.apollo.ApolloCall<D> apolloCall, com.paypal.oslo.core.network.graphql.CallConfig callConfig) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(apolloCall, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(callConfig, "");
        return new com.paypal.oslo.core.network.graphql.error.ApolloQueryExecutor(getHighSpeedVideoFpsRangesFor).toFlow(getHighResolutionOutputSizeshNQ4ISI(getHighSpeedVideoFpsRanges(apolloCall, callConfig.getAuthType()), callConfig.getHeaders()));
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static final <D extends com.apollographql.apollo.api.Operation.Data> com.apollographql.apollo.ApolloCall<D> getHighSpeedVideoFpsRanges(com.apollographql.apollo.ApolloCall<D> apolloCall, com.paypal.oslo.core.network.graphql.AuthType authType) {
        com.apollographql.apollo.ApolloCall<D> apolloCall2;
        try {
            kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
            com.paypal.oslo.core.network.graphql.AuthType.User user = authType instanceof com.paypal.oslo.core.network.graphql.AuthType.User ? (com.paypal.oslo.core.network.graphql.AuthType.User) authType : null;
            if (user != null) {
                if (!kotlin.jvm.internal.Intrinsics.areEqual(user.getAuthenticationContext().getAuthenticationFlowInfo().getSource(), "default_source")) {
                    user = null;
                }
                if (user != null) {
                    com.paypal.oslo.core.network.graphql.AuthType.User copy = user.copy(com.paypal.oslo.core.identity.domain.model.AuthenticationContext.copy$default(user.getAuthenticationContext(), null, com.paypal.oslo.core.identity.domain.model.AuthenticationFlowInfo.copy$default(user.getAuthenticationContext().getAuthenticationFlowInfo(), apolloCall.getOperation().name(), null, 2, null), 1, null));
                    if (copy != null) {
                        authType = copy;
                    }
                }
            }
            kotlinx.serialization.json.Json.Companion companion2 = kotlinx.serialization.json.Json.INSTANCE;
            companion2.getSerializersModule();
            apolloCall2 = kotlin.Result.m23436constructorimpl(apolloCall.addHttpHeader(com.paypal.oslo.core.network.graphql.AuthType.AUTH_TYPE_HEADER, companion2.encodeToString(com.paypal.oslo.core.network.graphql.AuthType.INSTANCE.serializer(), authType)));
        } catch (java.lang.Throwable th) {
            kotlin.Result.Companion companion3 = kotlin.Result.INSTANCE;
            apolloCall2 = kotlin.Result.m23436constructorimpl(kotlin.ResultKt.createFailure(th));
        }
        if (kotlin.Result.m23439exceptionOrNullimpl(apolloCall2) == null) {
            apolloCall = apolloCall2;
        }
        return apolloCall;
    }

    private static final <D extends com.apollographql.apollo.api.Operation.Data> com.apollographql.apollo.ApolloCall<D> getHighResolutionOutputSizeshNQ4ISI(com.apollographql.apollo.ApolloCall<D> apolloCall, java.util.Map<java.lang.String, java.lang.String> map) {
        java.util.Iterator<T> it = map.entrySet().iterator();
        while (it.hasNext()) {
            java.util.Map.Entry entry = (java.util.Map.Entry) it.next();
            apolloCall = apolloCall.addHttpHeader((java.lang.String) entry.getKey(), (java.lang.String) entry.getValue());
        }
        return apolloCall;
    }
}
