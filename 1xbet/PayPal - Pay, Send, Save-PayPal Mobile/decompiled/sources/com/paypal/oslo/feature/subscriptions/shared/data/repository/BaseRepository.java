package com.paypal.oslo.feature.subscriptions.shared.data.repository;

@kotlin.Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0010\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003Jn\u0010\u0013\u001a\u0010\u0012\u0004\u0012\u00020\u0012\u0012\u0006\u0012\u0004\u0018\u00018\u00000\u0011\"\u0004\b\u0000\u0010\u0004\"\b\b\u0001\u0010\u0006*\u00020\u0005*\u00020\u00072\f\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00010\b2\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00000\n2\b\b\u0002\u0010\r\u001a\u00020\f2\u000e\b\u0002\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000eH\u0086@¢\u0006\u0004\b\u0013\u0010\u0014Jn\u0010\u0018\u001a\u0010\u0012\u0004\u0012\u00020\u0012\u0012\u0006\u0012\u0004\u0018\u00018\u00000\u0011\"\u0004\b\u0000\u0010\u0004\"\b\b\u0001\u0010\u0006*\u00020\u0015*\u00020\u00072\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00028\u00010\u00162\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00000\n2\b\b\u0002\u0010\r\u001a\u00020\f2\u000e\b\u0002\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000eH\u0086@¢\u0006\u0004\b\u0018\u0010\u0019"}, d2 = {"Lcom/paypal/oslo/feature/subscriptions/shared/data/repository/BaseRepository;", "", "<init>", "()V", com.adobe.marketing.mobile.internal.CoreConstants.Wrapper.Type.REACT_NATIVE, "Lcom/apollographql/apollo/api/Query$Data;", "D", "Lcom/apollographql/apollo/ApolloClient;", "Lcom/apollographql/apollo/api/Query;", "query", "Lkotlin/Function1;", "mapper", "Lcom/apollographql/apollo/cache/normalized/FetchPolicy;", "fetchPolicy", "", "Lcom/apollographql/apollo/api/ExecutionContext;", "executeContexts", "Larrow/core/Ior;", "Lcom/paypal/oslo/feature/subscriptions/shared/domain/error/SubscriptionsError;", "fetchData", "(Lcom/apollographql/apollo/ApolloClient;Lcom/apollographql/apollo/api/Query;Lkotlin/jvm/functions/Function1;Lcom/apollographql/apollo/cache/normalized/FetchPolicy;Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/apollographql/apollo/api/Mutation$Data;", "Lcom/apollographql/apollo/api/Mutation;", "mutation", "executeMutation", "(Lcom/apollographql/apollo/ApolloClient;Lcom/apollographql/apollo/api/Mutation;Lkotlin/jvm/functions/Function1;Lcom/apollographql/apollo/cache/normalized/FetchPolicy;Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public class BaseRepository {
    public static final int $stable = 0;

    /* JADX WARN: Removed duplicated region for block: B:12:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0109  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /* JADX WARN: Type inference failed for: r4v0, types: [com.paypal.oslo.core.network.graphql.AuthType, java.util.Map, kotlin.jvm.internal.DefaultConstructorMarker] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final <R, D extends com.apollographql.apollo.api.Query.Data> java.lang.Object fetchData(com.apollographql.apollo.ApolloClient apolloClient, com.apollographql.apollo.api.Query<D> query, kotlin.jvm.functions.Function1<? super D, ? extends R> function1, com.apollographql.apollo.cache.normalized.FetchPolicy fetchPolicy, java.util.List<? extends com.apollographql.apollo.api.ExecutionContext> list, kotlin.coroutines.Continuation<? super arrow.core.Ior<? extends com.paypal.oslo.feature.subscriptions.shared.domain.error.SubscriptionsError, ? extends R>> continuation) {
        com.paypal.oslo.feature.subscriptions.shared.data.repository.BaseRepository$fetchData$1 baseRepository$fetchData$1;
        int i;
        arrow.core.Ior.Both both;
        if (continuation instanceof com.paypal.oslo.feature.subscriptions.shared.data.repository.BaseRepository$fetchData$1) {
            baseRepository$fetchData$1 = (com.paypal.oslo.feature.subscriptions.shared.data.repository.BaseRepository$fetchData$1) continuation;
            if ((baseRepository$fetchData$1.getInputSizeshNQ4ISI & Integer.MIN_VALUE) != 0) {
                baseRepository$fetchData$1.getInputSizeshNQ4ISI -= 2147483648;
                java.lang.Object obj = baseRepository$fetchData$1.getOutputMinFrameDuration;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = baseRepository$fetchData$1.getInputSizeshNQ4ISI;
                ?? r4 = (R) null;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    com.apollographql.apollo.ApolloCall apolloCall = (com.apollographql.apollo.ApolloCall) com.apollographql.apollo.cache.normalized.NormalizedCache.fetchPolicy(apolloClient.query(query), fetchPolicy);
                    java.util.Iterator<? extends com.apollographql.apollo.api.ExecutionContext> it = list.iterator();
                    while (it.hasNext()) {
                        apolloCall = apolloCall.addExecutionContext(it.next());
                    }
                    com.paypal.oslo.core.network.graphql.CallConfig callConfig = new com.paypal.oslo.core.network.graphql.CallConfig(r4, r4, 3, r4);
                    baseRepository$fetchData$1.getHighResolutionOutputSizeshNQ4ISI = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(apolloClient);
                    baseRepository$fetchData$1.getHighSpeedVideoFpsRangesFor = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(query);
                    baseRepository$fetchData$1.Camera2StreamConfigurationMap = function1;
                    baseRepository$fetchData$1.getHighSpeedVideoFpsRanges = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(fetchPolicy);
                    baseRepository$fetchData$1.getHighSpeedVideoSizes = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(list);
                    baseRepository$fetchData$1.getOutputFormats = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(apolloCall);
                    baseRepository$fetchData$1.getInputSizeshNQ4ISI = 1;
                    obj = com.paypal.oslo.core.network.graphql.ApolloClientExtensionKt.execute(apolloCall, callConfig, baseRepository$fetchData$1);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    function1 = (kotlin.jvm.functions.Function1) baseRepository$fetchData$1.Camera2StreamConfigurationMap;
                    kotlin.ResultKt.throwOnFailure(obj);
                }
                both = (arrow.core.Ior) obj;
                if (!(both instanceof arrow.core.Ior.Left)) {
                    if (both instanceof arrow.core.Ior.Right) {
                        com.apollographql.apollo.api.Query.Data data = (com.apollographql.apollo.api.Query.Data) ((com.paypal.oslo.core.network.graphql.GraphQLData) ((arrow.core.Ior.Right) both).getValue()).getData();
                        java.lang.Object obj2 = r4;
                        if (data != null) {
                            obj2 = function1.invoke(data);
                        }
                        both = new arrow.core.Ior.Right(obj2);
                    } else if (both instanceof arrow.core.Ior.Both) {
                        arrow.core.Ior.Both both2 = (arrow.core.Ior.Both) both;
                        java.lang.Object leftValue = both2.getLeftValue();
                        com.apollographql.apollo.api.Query.Data data2 = (com.apollographql.apollo.api.Query.Data) ((com.paypal.oslo.core.network.graphql.GraphQLData) both2.getRightValue()).getData();
                        java.lang.Object obj3 = r4;
                        if (data2 != null) {
                            obj3 = function1.invoke(data2);
                        }
                        both = new arrow.core.Ior.Both(leftValue, obj3);
                    } else {
                        throw new kotlin.NoWhenBranchMatchedException();
                    }
                }
                if (!(both instanceof arrow.core.Ior.Left)) {
                    return new arrow.core.Ior.Left(com.paypal.oslo.feature.subscriptions.shared.data.error.CallErrorMapperKt.toSubscriptionsError((com.paypal.oslo.core.network.graphql.error.CallError) ((arrow.core.Ior.Left) both).getValue()));
                }
                if (both instanceof arrow.core.Ior.Right) {
                    return both;
                }
                if (!(both instanceof arrow.core.Ior.Both)) {
                    throw new kotlin.NoWhenBranchMatchedException();
                }
                arrow.core.Ior.Both both3 = (arrow.core.Ior.Both) both;
                return new arrow.core.Ior.Both(com.paypal.oslo.feature.subscriptions.shared.data.error.CallErrorMapperKt.toSubscriptionsError((com.paypal.oslo.core.network.graphql.error.CallError) both3.getLeftValue()), both3.getRightValue());
            }
        }
        baseRepository$fetchData$1 = new com.paypal.oslo.feature.subscriptions.shared.data.repository.BaseRepository$fetchData$1(this, continuation);
        java.lang.Object obj4 = baseRepository$fetchData$1.getOutputMinFrameDuration;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = baseRepository$fetchData$1.getInputSizeshNQ4ISI;
        ?? r42 = (R) null;
        if (i != 0) {
        }
        both = (arrow.core.Ior) obj4;
        if (!(both instanceof arrow.core.Ior.Left)) {
        }
        if (!(both instanceof arrow.core.Ior.Left)) {
        }
    }

    public static /* synthetic */ java.lang.Object fetchData$default(com.paypal.oslo.feature.subscriptions.shared.data.repository.BaseRepository baseRepository, com.apollographql.apollo.ApolloClient apolloClient, com.apollographql.apollo.api.Query query, kotlin.jvm.functions.Function1 function1, com.apollographql.apollo.cache.normalized.FetchPolicy fetchPolicy, java.util.List list, kotlin.coroutines.Continuation continuation, int i, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: fetchData");
        }
        if ((i & 4) != 0) {
            fetchPolicy = com.apollographql.apollo.cache.normalized.FetchPolicy.NetworkOnly;
        }
        com.apollographql.apollo.cache.normalized.FetchPolicy fetchPolicy2 = fetchPolicy;
        if ((i & 8) != 0) {
            list = kotlin.collections.CollectionsKt.emptyList();
        }
        return baseRepository.fetchData(apolloClient, query, function1, fetchPolicy2, list, continuation);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0109  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /* JADX WARN: Type inference failed for: r4v0, types: [com.paypal.oslo.core.network.graphql.AuthType, java.util.Map, kotlin.jvm.internal.DefaultConstructorMarker] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final <R, D extends com.apollographql.apollo.api.Mutation.Data> java.lang.Object executeMutation(com.apollographql.apollo.ApolloClient apolloClient, com.apollographql.apollo.api.Mutation<D> mutation, kotlin.jvm.functions.Function1<? super D, ? extends R> function1, com.apollographql.apollo.cache.normalized.FetchPolicy fetchPolicy, java.util.List<? extends com.apollographql.apollo.api.ExecutionContext> list, kotlin.coroutines.Continuation<? super arrow.core.Ior<? extends com.paypal.oslo.feature.subscriptions.shared.domain.error.SubscriptionsError, ? extends R>> continuation) {
        com.paypal.oslo.feature.subscriptions.shared.data.repository.BaseRepository$executeMutation$1 baseRepository$executeMutation$1;
        int i;
        arrow.core.Ior.Both both;
        if (continuation instanceof com.paypal.oslo.feature.subscriptions.shared.data.repository.BaseRepository$executeMutation$1) {
            baseRepository$executeMutation$1 = (com.paypal.oslo.feature.subscriptions.shared.data.repository.BaseRepository$executeMutation$1) continuation;
            if ((baseRepository$executeMutation$1.getInputSizeshNQ4ISI & Integer.MIN_VALUE) != 0) {
                baseRepository$executeMutation$1.getInputSizeshNQ4ISI -= 2147483648;
                java.lang.Object obj = baseRepository$executeMutation$1.getHighSpeedVideoSizesFor;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = baseRepository$executeMutation$1.getInputSizeshNQ4ISI;
                ?? r4 = (R) null;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    com.apollographql.apollo.ApolloCall apolloCall = (com.apollographql.apollo.ApolloCall) com.apollographql.apollo.cache.normalized.NormalizedCache.fetchPolicy(apolloClient.mutation(mutation), fetchPolicy);
                    java.util.Iterator<? extends com.apollographql.apollo.api.ExecutionContext> it = list.iterator();
                    while (it.hasNext()) {
                        apolloCall = apolloCall.addExecutionContext(it.next());
                    }
                    com.paypal.oslo.core.network.graphql.CallConfig callConfig = new com.paypal.oslo.core.network.graphql.CallConfig(r4, r4, 3, r4);
                    baseRepository$executeMutation$1.getHighResolutionOutputSizeshNQ4ISI = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(apolloClient);
                    baseRepository$executeMutation$1.getHighSpeedVideoFpsRanges = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(mutation);
                    baseRepository$executeMutation$1.Camera2StreamConfigurationMap = function1;
                    baseRepository$executeMutation$1.getHighSpeedVideoSizes = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(fetchPolicy);
                    baseRepository$executeMutation$1.getHighSpeedVideoFpsRangesFor = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(list);
                    baseRepository$executeMutation$1.getInputFormats = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(apolloCall);
                    baseRepository$executeMutation$1.getInputSizeshNQ4ISI = 1;
                    obj = com.paypal.oslo.core.network.graphql.ApolloClientExtensionKt.execute(apolloCall, callConfig, baseRepository$executeMutation$1);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    function1 = (kotlin.jvm.functions.Function1) baseRepository$executeMutation$1.Camera2StreamConfigurationMap;
                    kotlin.ResultKt.throwOnFailure(obj);
                }
                both = (arrow.core.Ior) obj;
                if (!(both instanceof arrow.core.Ior.Left)) {
                    if (both instanceof arrow.core.Ior.Right) {
                        com.apollographql.apollo.api.Mutation.Data data = (com.apollographql.apollo.api.Mutation.Data) ((com.paypal.oslo.core.network.graphql.GraphQLData) ((arrow.core.Ior.Right) both).getValue()).getData();
                        java.lang.Object obj2 = r4;
                        if (data != null) {
                            obj2 = function1.invoke(data);
                        }
                        both = new arrow.core.Ior.Right(obj2);
                    } else if (both instanceof arrow.core.Ior.Both) {
                        arrow.core.Ior.Both both2 = (arrow.core.Ior.Both) both;
                        java.lang.Object leftValue = both2.getLeftValue();
                        com.apollographql.apollo.api.Mutation.Data data2 = (com.apollographql.apollo.api.Mutation.Data) ((com.paypal.oslo.core.network.graphql.GraphQLData) both2.getRightValue()).getData();
                        java.lang.Object obj3 = r4;
                        if (data2 != null) {
                            obj3 = function1.invoke(data2);
                        }
                        both = new arrow.core.Ior.Both(leftValue, obj3);
                    } else {
                        throw new kotlin.NoWhenBranchMatchedException();
                    }
                }
                if (!(both instanceof arrow.core.Ior.Left)) {
                    return new arrow.core.Ior.Left(com.paypal.oslo.feature.subscriptions.shared.data.error.CallErrorMapperKt.toSubscriptionsError((com.paypal.oslo.core.network.graphql.error.CallError) ((arrow.core.Ior.Left) both).getValue()));
                }
                if (both instanceof arrow.core.Ior.Right) {
                    return both;
                }
                if (!(both instanceof arrow.core.Ior.Both)) {
                    throw new kotlin.NoWhenBranchMatchedException();
                }
                arrow.core.Ior.Both both3 = (arrow.core.Ior.Both) both;
                return new arrow.core.Ior.Both(com.paypal.oslo.feature.subscriptions.shared.data.error.CallErrorMapperKt.toSubscriptionsError((com.paypal.oslo.core.network.graphql.error.CallError) both3.getLeftValue()), both3.getRightValue());
            }
        }
        baseRepository$executeMutation$1 = new com.paypal.oslo.feature.subscriptions.shared.data.repository.BaseRepository$executeMutation$1(this, continuation);
        java.lang.Object obj4 = baseRepository$executeMutation$1.getHighSpeedVideoSizesFor;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = baseRepository$executeMutation$1.getInputSizeshNQ4ISI;
        ?? r42 = (R) null;
        if (i != 0) {
        }
        both = (arrow.core.Ior) obj4;
        if (!(both instanceof arrow.core.Ior.Left)) {
        }
        if (!(both instanceof arrow.core.Ior.Left)) {
        }
    }

    public static /* synthetic */ java.lang.Object executeMutation$default(com.paypal.oslo.feature.subscriptions.shared.data.repository.BaseRepository baseRepository, com.apollographql.apollo.ApolloClient apolloClient, com.apollographql.apollo.api.Mutation mutation, kotlin.jvm.functions.Function1 function1, com.apollographql.apollo.cache.normalized.FetchPolicy fetchPolicy, java.util.List list, kotlin.coroutines.Continuation continuation, int i, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: executeMutation");
        }
        if ((i & 4) != 0) {
            fetchPolicy = com.apollographql.apollo.cache.normalized.FetchPolicy.NetworkOnly;
        }
        com.apollographql.apollo.cache.normalized.FetchPolicy fetchPolicy2 = fetchPolicy;
        if ((i & 8) != 0) {
            list = kotlin.collections.CollectionsKt.emptyList();
        }
        return baseRepository.executeMutation(apolloClient, mutation, function1, fetchPolicy2, list, continuation);
    }
}
