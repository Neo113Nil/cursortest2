package com.paypal.oslo.feature.bnplacquisition.data.repository;

@kotlin.Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0016\u0018\u0000 \u001e2\u00020\u0001:\u0001\u001eB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u008a\u0001\u0010\u0018\u001a\u0010\u0012\u0004\u0012\u00020\u0017\u0012\u0006\u0012\u0004\u0018\u00018\u00010\u0016\",\b\u0000\u0010\u000b*&\u0012\u0006\u0012\u0004\u0018\u00018\u0002\u0012\u0006\u0012\u0004\u0018\u00018\u00010\tj\u0012\u0012\u0006\u0012\u0004\u0018\u00018\u0002\u0012\u0006\u0012\u0004\u0018\u00018\u0001`\n\"\u0004\b\u0001\u0010\f\"\b\b\u0002\u0010\u000e*\u00020\r*\u00020\u000f2\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00028\u00020\u00102\u0006\u0010\u0012\u001a\u00028\u00002\b\b\u0002\u0010\u0014\u001a\u00020\u00132\b\b\u0002\u0010\u0015\u001a\u00020\u0006H\u0086@¢\u0006\u0004\b\u0018\u0010\u0019J\u008a\u0001\u0010\u0018\u001a\u0010\u0012\u0004\u0012\u00020\u0017\u0012\u0006\u0012\u0004\u0018\u00018\u00010\u0016\",\b\u0000\u0010\u000b*&\u0012\u0006\u0012\u0004\u0018\u00018\u0002\u0012\u0006\u0012\u0004\u0018\u00018\u00010\tj\u0012\u0012\u0006\u0012\u0004\u0018\u00018\u0002\u0012\u0006\u0012\u0004\u0018\u00018\u0001`\n\"\u0004\b\u0001\u0010\f\"\b\b\u0002\u0010\u000e*\u00020\u001a*\u00020\u000f2\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00028\u00020\u001b2\u0006\u0010\u0012\u001a\u00028\u00002\b\b\u0002\u0010\u0014\u001a\u00020\u00132\b\b\u0002\u0010\u0015\u001a\u00020\u0006H\u0086@¢\u0006\u0004\b\u0018\u0010\u001d"}, d2 = {"Lcom/paypal/oslo/feature/bnplacquisition/data/repository/BaseRepository;", "", "<init>", "()V", "Lcom/paypal/oslo/core/identity/domain/model/AuthenticationState;", "authState", "Lcom/paypal/oslo/core/network/graphql/CallConfig;", "createCallConfig", "(Lcom/paypal/oslo/core/identity/domain/model/AuthenticationState;)Lcom/paypal/oslo/core/network/graphql/CallConfig;", "Lkotlin/Function1;", "Lcom/paypal/oslo/feature/bnplacquisition/data/mapper/Mapper;", "M", com.adobe.marketing.mobile.internal.CoreConstants.Wrapper.Type.REACT_NATIVE, "Lcom/apollographql/apollo/api/Query$Data;", "D", "Lcom/apollographql/apollo/ApolloClient;", "Lcom/apollographql/apollo/api/Query;", "query", "mapper", "Lcom/apollographql/apollo/cache/normalized/FetchPolicy;", "fetchPolicy", "callConfig", "Larrow/core/Ior;", "Lcom/paypal/oslo/feature/bnplacquisition/domain/model/error/BNPLError;", "fetchData", "(Lcom/apollographql/apollo/ApolloClient;Lcom/apollographql/apollo/api/Query;Lkotlin/jvm/functions/Function1;Lcom/apollographql/apollo/cache/normalized/FetchPolicy;Lcom/paypal/oslo/core/network/graphql/CallConfig;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/apollographql/apollo/api/Mutation$Data;", "Lcom/apollographql/apollo/api/Mutation;", "mutation", "(Lcom/apollographql/apollo/ApolloClient;Lcom/apollographql/apollo/api/Mutation;Lkotlin/jvm/functions/Function1;Lcom/apollographql/apollo/cache/normalized/FetchPolicy;Lcom/paypal/oslo/core/network/graphql/CallConfig;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Companion"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
public class BaseRepository {
    public static final int $stable = 0;
    public static final java.lang.String SOURCE = "bnpl_acquisition";

    /* JADX WARN: Multi-variable type inference failed */
    protected final com.paypal.oslo.core.network.graphql.CallConfig createCallConfig(com.paypal.oslo.core.identity.domain.model.AuthenticationState authState) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(authState, "");
        return new com.paypal.oslo.core.network.graphql.CallConfig(new com.paypal.oslo.core.network.graphql.AuthType.User(new com.paypal.oslo.core.identity.domain.model.AuthenticationContext(authState, new com.paypal.oslo.core.identity.domain.model.AuthenticationFlowInfo("bnpl_acquisition", (java.util.Map) null, 2, (kotlin.jvm.internal.DefaultConstructorMarker) null))), null, 2, 0 == true ? 1 : 0);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final <M extends kotlin.jvm.functions.Function1<? super D, ? extends R>, R, D extends com.apollographql.apollo.api.Query.Data> java.lang.Object fetchData(com.apollographql.apollo.ApolloClient apolloClient, com.apollographql.apollo.api.Query<D> query, M m, com.apollographql.apollo.cache.normalized.FetchPolicy fetchPolicy, com.paypal.oslo.core.network.graphql.CallConfig callConfig, kotlin.coroutines.Continuation<? super arrow.core.Ior<? extends com.paypal.oslo.feature.bnplacquisition.domain.model.error.BNPLError, ? extends R>> continuation) {
        com.paypal.oslo.feature.bnplacquisition.data.repository.BaseRepository$fetchData$1 baseRepository$fetchData$1;
        int i;
        arrow.core.Ior.Both both;
        com.paypal.oslo.core.network.graphql.error.CallError callError;
        java.lang.Object invoke;
        java.lang.Object invoke2;
        if (continuation instanceof com.paypal.oslo.feature.bnplacquisition.data.repository.BaseRepository$fetchData$1) {
            baseRepository$fetchData$1 = (com.paypal.oslo.feature.bnplacquisition.data.repository.BaseRepository$fetchData$1) continuation;
            if ((baseRepository$fetchData$1.getHighSpeedVideoSizesFor & Integer.MIN_VALUE) != 0) {
                baseRepository$fetchData$1.getHighSpeedVideoSizesFor -= 2147483648;
                java.lang.Object obj = baseRepository$fetchData$1.getOutputFormats;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = baseRepository$fetchData$1.getHighSpeedVideoSizesFor;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    com.apollographql.apollo.ApolloCall apolloCall = (com.apollographql.apollo.ApolloCall) com.apollographql.apollo.cache.normalized.NormalizedCache.fetchPolicy(apolloClient.query(query), fetchPolicy);
                    baseRepository$fetchData$1.getHighSpeedVideoSizes = apolloClient;
                    baseRepository$fetchData$1.getHighSpeedVideoFpsRanges = query;
                    baseRepository$fetchData$1.getHighSpeedVideoFpsRangesFor = m;
                    baseRepository$fetchData$1.getHighResolutionOutputSizeshNQ4ISI = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(fetchPolicy);
                    baseRepository$fetchData$1.Camera2StreamConfigurationMap = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(callConfig);
                    baseRepository$fetchData$1.getInputSizeshNQ4ISI = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(apolloCall);
                    baseRepository$fetchData$1.getHighSpeedVideoSizesFor = 1;
                    obj = com.paypal.oslo.core.network.graphql.ApolloClientExtensionKt.execute(apolloCall, callConfig, baseRepository$fetchData$1);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    m = (M) baseRepository$fetchData$1.getHighSpeedVideoFpsRangesFor;
                    query = (com.apollographql.apollo.api.Query) baseRepository$fetchData$1.getHighSpeedVideoFpsRanges;
                    kotlin.ResultKt.throwOnFailure(obj);
                }
                both = (arrow.core.Ior) obj;
                if (!(both instanceof arrow.core.Ior.Left)) {
                    java.lang.Object obj2 = null;
                    if (both instanceof arrow.core.Ior.Right) {
                        com.apollographql.apollo.api.Query.Data data = (com.apollographql.apollo.api.Query.Data) ((com.paypal.oslo.core.network.graphql.GraphQLData) ((arrow.core.Ior.Right) both).getValue()).getData();
                        if (data != null && (invoke2 = m.invoke(data)) != null) {
                            obj2 = invoke2;
                        }
                        both = new arrow.core.Ior.Right(obj2);
                    } else if (both instanceof arrow.core.Ior.Both) {
                        arrow.core.Ior.Both both2 = (arrow.core.Ior.Both) both;
                        java.lang.Object leftValue = both2.getLeftValue();
                        com.apollographql.apollo.api.Query.Data data2 = (com.apollographql.apollo.api.Query.Data) ((com.paypal.oslo.core.network.graphql.GraphQLData) both2.getRightValue()).getData();
                        if (data2 != null && (invoke = m.invoke(data2)) != null) {
                            obj2 = invoke;
                        }
                        both = new arrow.core.Ior.Both(leftValue, obj2);
                    } else {
                        throw new kotlin.NoWhenBranchMatchedException();
                    }
                }
                callError = (com.paypal.oslo.core.network.graphql.error.CallError) both.leftOrNull();
                if (callError != null) {
                    com.paypal.oslo.feature.bnplacquisition.logger.BnplAcqLoggerUtilsKt.logBnplAcqDownstreamError(com.paypal.oslo.feature.bnplacquisition.LoggerKt.log, callError, query.name());
                }
                if (!(both instanceof arrow.core.Ior.Left)) {
                    return new arrow.core.Ior.Left(com.paypal.oslo.feature.bnplacquisition.data.mapper.BNPLErrorMapperKt.toBNPLErrors((com.paypal.oslo.core.network.graphql.error.CallError) ((arrow.core.Ior.Left) both).getValue()));
                }
                if (both instanceof arrow.core.Ior.Right) {
                    return both;
                }
                if (!(both instanceof arrow.core.Ior.Both)) {
                    throw new kotlin.NoWhenBranchMatchedException();
                }
                arrow.core.Ior.Both both3 = (arrow.core.Ior.Both) both;
                return new arrow.core.Ior.Both(com.paypal.oslo.feature.bnplacquisition.data.mapper.BNPLErrorMapperKt.toBNPLErrors((com.paypal.oslo.core.network.graphql.error.CallError) both3.getLeftValue()), both3.getRightValue());
            }
        }
        baseRepository$fetchData$1 = new com.paypal.oslo.feature.bnplacquisition.data.repository.BaseRepository$fetchData$1(this, continuation);
        java.lang.Object obj3 = baseRepository$fetchData$1.getOutputFormats;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = baseRepository$fetchData$1.getHighSpeedVideoSizesFor;
        if (i != 0) {
        }
        both = (arrow.core.Ior) obj3;
        if (!(both instanceof arrow.core.Ior.Left)) {
        }
        callError = (com.paypal.oslo.core.network.graphql.error.CallError) both.leftOrNull();
        if (callError != null) {
        }
        if (!(both instanceof arrow.core.Ior.Left)) {
        }
    }

    public static /* synthetic */ java.lang.Object fetchData$default(com.paypal.oslo.feature.bnplacquisition.data.repository.BaseRepository baseRepository, com.apollographql.apollo.ApolloClient apolloClient, com.apollographql.apollo.api.Query query, kotlin.jvm.functions.Function1 function1, com.apollographql.apollo.cache.normalized.FetchPolicy fetchPolicy, com.paypal.oslo.core.network.graphql.CallConfig callConfig, kotlin.coroutines.Continuation continuation, int i, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: fetchData");
        }
        if ((i & 4) != 0) {
            fetchPolicy = com.apollographql.apollo.cache.normalized.FetchPolicy.NetworkOnly;
        }
        com.apollographql.apollo.cache.normalized.FetchPolicy fetchPolicy2 = fetchPolicy;
        if ((i & 8) != 0) {
            callConfig = baseRepository.createCallConfig(com.paypal.oslo.core.identity.domain.model.AuthenticationState.LOGGED_IN);
        }
        return baseRepository.fetchData(apolloClient, query, (com.apollographql.apollo.api.Query) function1, fetchPolicy2, callConfig, continuation);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final <M extends kotlin.jvm.functions.Function1<? super D, ? extends R>, R, D extends com.apollographql.apollo.api.Mutation.Data> java.lang.Object fetchData(com.apollographql.apollo.ApolloClient apolloClient, com.apollographql.apollo.api.Mutation<D> mutation, M m, com.apollographql.apollo.cache.normalized.FetchPolicy fetchPolicy, com.paypal.oslo.core.network.graphql.CallConfig callConfig, kotlin.coroutines.Continuation<? super arrow.core.Ior<? extends com.paypal.oslo.feature.bnplacquisition.domain.model.error.BNPLError, ? extends R>> continuation) {
        com.paypal.oslo.feature.bnplacquisition.data.repository.BaseRepository$fetchData$5 baseRepository$fetchData$5;
        int i;
        arrow.core.Ior.Both both;
        com.paypal.oslo.core.network.graphql.error.CallError callError;
        java.lang.Object invoke;
        java.lang.Object invoke2;
        if (continuation instanceof com.paypal.oslo.feature.bnplacquisition.data.repository.BaseRepository$fetchData$5) {
            baseRepository$fetchData$5 = (com.paypal.oslo.feature.bnplacquisition.data.repository.BaseRepository$fetchData$5) continuation;
            if ((baseRepository$fetchData$5.getOutputMinFrameDuration & Integer.MIN_VALUE) != 0) {
                baseRepository$fetchData$5.getOutputMinFrameDuration -= 2147483648;
                java.lang.Object obj = baseRepository$fetchData$5.getHighSpeedVideoSizesFor;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = baseRepository$fetchData$5.getOutputMinFrameDuration;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    com.apollographql.apollo.ApolloCall apolloCall = (com.apollographql.apollo.ApolloCall) com.apollographql.apollo.cache.normalized.NormalizedCache.fetchPolicy(apolloClient.mutation(mutation), fetchPolicy);
                    baseRepository$fetchData$5.getHighResolutionOutputSizeshNQ4ISI = apolloClient;
                    baseRepository$fetchData$5.Camera2StreamConfigurationMap = mutation;
                    baseRepository$fetchData$5.getHighSpeedVideoSizes = m;
                    baseRepository$fetchData$5.getHighSpeedVideoFpsRanges = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(fetchPolicy);
                    baseRepository$fetchData$5.getHighSpeedVideoFpsRangesFor = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(callConfig);
                    baseRepository$fetchData$5.getOutputFormats = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(apolloCall);
                    baseRepository$fetchData$5.getOutputMinFrameDuration = 1;
                    obj = com.paypal.oslo.core.network.graphql.ApolloClientExtensionKt.execute(apolloCall, callConfig, baseRepository$fetchData$5);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    m = (M) baseRepository$fetchData$5.getHighSpeedVideoSizes;
                    mutation = (com.apollographql.apollo.api.Mutation) baseRepository$fetchData$5.Camera2StreamConfigurationMap;
                    kotlin.ResultKt.throwOnFailure(obj);
                }
                both = (arrow.core.Ior) obj;
                if (!(both instanceof arrow.core.Ior.Left)) {
                    java.lang.Object obj2 = null;
                    if (both instanceof arrow.core.Ior.Right) {
                        com.apollographql.apollo.api.Mutation.Data data = (com.apollographql.apollo.api.Mutation.Data) ((com.paypal.oslo.core.network.graphql.GraphQLData) ((arrow.core.Ior.Right) both).getValue()).getData();
                        if (data != null && (invoke2 = m.invoke(data)) != null) {
                            obj2 = invoke2;
                        }
                        both = new arrow.core.Ior.Right(obj2);
                    } else if (both instanceof arrow.core.Ior.Both) {
                        arrow.core.Ior.Both both2 = (arrow.core.Ior.Both) both;
                        java.lang.Object leftValue = both2.getLeftValue();
                        com.apollographql.apollo.api.Mutation.Data data2 = (com.apollographql.apollo.api.Mutation.Data) ((com.paypal.oslo.core.network.graphql.GraphQLData) both2.getRightValue()).getData();
                        if (data2 != null && (invoke = m.invoke(data2)) != null) {
                            obj2 = invoke;
                        }
                        both = new arrow.core.Ior.Both(leftValue, obj2);
                    } else {
                        throw new kotlin.NoWhenBranchMatchedException();
                    }
                }
                callError = (com.paypal.oslo.core.network.graphql.error.CallError) both.leftOrNull();
                if (callError != null) {
                    com.paypal.oslo.feature.bnplacquisition.logger.BnplAcqLoggerUtilsKt.logBnplAcqDownstreamError(com.paypal.oslo.feature.bnplacquisition.LoggerKt.log, callError, mutation.name());
                }
                if (!(both instanceof arrow.core.Ior.Left)) {
                    return new arrow.core.Ior.Left(com.paypal.oslo.feature.bnplacquisition.data.mapper.BNPLErrorMapperKt.toBNPLErrors((com.paypal.oslo.core.network.graphql.error.CallError) ((arrow.core.Ior.Left) both).getValue()));
                }
                if (both instanceof arrow.core.Ior.Right) {
                    return both;
                }
                if (!(both instanceof arrow.core.Ior.Both)) {
                    throw new kotlin.NoWhenBranchMatchedException();
                }
                arrow.core.Ior.Both both3 = (arrow.core.Ior.Both) both;
                return new arrow.core.Ior.Both(com.paypal.oslo.feature.bnplacquisition.data.mapper.BNPLErrorMapperKt.toBNPLErrors((com.paypal.oslo.core.network.graphql.error.CallError) both3.getLeftValue()), both3.getRightValue());
            }
        }
        baseRepository$fetchData$5 = new com.paypal.oslo.feature.bnplacquisition.data.repository.BaseRepository$fetchData$5(this, continuation);
        java.lang.Object obj3 = baseRepository$fetchData$5.getHighSpeedVideoSizesFor;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = baseRepository$fetchData$5.getOutputMinFrameDuration;
        if (i != 0) {
        }
        both = (arrow.core.Ior) obj3;
        if (!(both instanceof arrow.core.Ior.Left)) {
        }
        callError = (com.paypal.oslo.core.network.graphql.error.CallError) both.leftOrNull();
        if (callError != null) {
        }
        if (!(both instanceof arrow.core.Ior.Left)) {
        }
    }

    public static /* synthetic */ java.lang.Object fetchData$default(com.paypal.oslo.feature.bnplacquisition.data.repository.BaseRepository baseRepository, com.apollographql.apollo.ApolloClient apolloClient, com.apollographql.apollo.api.Mutation mutation, kotlin.jvm.functions.Function1 function1, com.apollographql.apollo.cache.normalized.FetchPolicy fetchPolicy, com.paypal.oslo.core.network.graphql.CallConfig callConfig, kotlin.coroutines.Continuation continuation, int i, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: fetchData");
        }
        if ((i & 4) != 0) {
            fetchPolicy = com.apollographql.apollo.cache.normalized.FetchPolicy.NetworkOnly;
        }
        com.apollographql.apollo.cache.normalized.FetchPolicy fetchPolicy2 = fetchPolicy;
        if ((i & 8) != 0) {
            callConfig = baseRepository.createCallConfig(com.paypal.oslo.core.identity.domain.model.AuthenticationState.LOGGED_IN);
        }
        return baseRepository.fetchData(apolloClient, mutation, (com.apollographql.apollo.api.Mutation) function1, fetchPolicy2, callConfig, continuation);
    }
}
