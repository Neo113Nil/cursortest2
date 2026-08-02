package com.paypal.oslo.feature.debitcard.shared.data.repository;

@kotlin.Metadata(d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0010\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u008c\u0001\u0010\u0016\u001a\u0010\u0012\u0004\u0012\u00020\r\u0012\u0006\u0012\u0004\u0018\u00018\u00000\u0015\"\u0004\b\u0000\u0010\u0004\"\b\b\u0001\u0010\u0006*\u00020\u0005*\u00020\u00072\f\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00010\b2\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00000\n2\u0016\b\u0002\u0010\u000e\u001a\u0010\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r\u0018\u00010\n2\b\b\u0002\u0010\u0010\u001a\u00020\u000f2\b\b\u0002\u0010\u0012\u001a\u00020\u00112\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0013H\u0086@¢\u0006\u0004\b\u0016\u0010\u0017J¤\u0001\u0010\u001e\u001a\u0010\u0012\u0004\u0012\u00020\r\u0012\u0006\u0012\u0004\u0018\u00018\u00000\u0015\"\u0004\b\u0000\u0010\u0004\"\b\b\u0001\u0010\u0006*\u00020\u0018*\u00020\u00072\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00028\u00010\u00192\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00000\n2\u0016\b\u0002\u0010\u000e\u001a\u0010\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r\u0018\u00010\n2\u0016\b\u0002\u0010\u001d\u001a\u0010\u0012\u0004\u0012\u00020\u001c\u0012\u0004\u0012\u00020\u001c\u0018\u00010\u001b2\b\b\u0002\u0010\u0010\u001a\u00020\u000f2\b\b\u0002\u0010\u0012\u001a\u00020\u00112\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0013H\u0086@¢\u0006\u0004\b\u001e\u0010\u001fJ\u0019\u0010\"\u001a\u00020\u00112\b\b\u0002\u0010!\u001a\u00020 H\u0000¢\u0006\u0004\b\"\u0010#"}, d2 = {"Lcom/paypal/oslo/feature/debitcard/shared/data/repository/BaseRepository;", "", "<init>", "()V", com.adobe.marketing.mobile.internal.CoreConstants.Wrapper.Type.REACT_NATIVE, "Lcom/apollographql/apollo/api/Query$Data;", "D", "Lcom/apollographql/apollo/ApolloClient;", "Lcom/apollographql/apollo/api/Query;", "query", "Lkotlin/Function1;", "mapper", "Lcom/paypal/oslo/core/network/graphql/error/CallError;", "Lcom/paypal/oslo/feature/debitcard/shared/domain/model/DataResultError;", "networkMapper", "Lcom/apollographql/apollo/cache/normalized/FetchPolicy;", "fetchPolicy", "Lcom/paypal/oslo/core/network/graphql/CallConfig;", "callConfig", "Lcom/paypal/oslo/core/network/graphql/RiskSourceId;", "riskSourceId", "Larrow/core/Ior;", "fetchData", "(Lcom/apollographql/apollo/ApolloClient;Lcom/apollographql/apollo/api/Query;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lcom/apollographql/apollo/cache/normalized/FetchPolicy;Lcom/paypal/oslo/core/network/graphql/CallConfig;Lcom/paypal/oslo/core/network/graphql/RiskSourceId;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/apollographql/apollo/api/Mutation$Data;", "Lcom/apollographql/apollo/api/Mutation;", "mutation", "", "", "headers", "executeMutation", "(Lcom/apollographql/apollo/ApolloClient;Lcom/apollographql/apollo/api/Mutation;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Ljava/util/Map;Lcom/apollographql/apollo/cache/normalized/FetchPolicy;Lcom/paypal/oslo/core/network/graphql/CallConfig;Lcom/paypal/oslo/core/network/graphql/RiskSourceId;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/paypal/oslo/core/identity/domain/model/AuthenticationState;", "authState", "createCallConfig$debit_card_prodRelease", "(Lcom/paypal/oslo/core/identity/domain/model/AuthenticationState;)Lcom/paypal/oslo/core/network/graphql/CallConfig;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public class BaseRepository {
    public static final int $stable = 0;

    /* JADX WARN: Removed duplicated region for block: B:12:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0116  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0128  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final <R, D extends com.apollographql.apollo.api.Query.Data> java.lang.Object fetchData(com.apollographql.apollo.ApolloClient apolloClient, com.apollographql.apollo.api.Query<D> query, kotlin.jvm.functions.Function1<? super D, ? extends R> function1, kotlin.jvm.functions.Function1<? super com.paypal.oslo.core.network.graphql.error.CallError, ? extends com.paypal.oslo.feature.debitcard.shared.domain.model.DataResultError> function12, com.apollographql.apollo.cache.normalized.FetchPolicy fetchPolicy, com.paypal.oslo.core.network.graphql.CallConfig callConfig, com.paypal.oslo.core.network.graphql.RiskSourceId riskSourceId, kotlin.coroutines.Continuation<? super arrow.core.Ior<? extends com.paypal.oslo.feature.debitcard.shared.domain.model.DataResultError, ? extends R>> continuation) {
        com.paypal.oslo.feature.debitcard.shared.data.repository.BaseRepository$fetchData$1 baseRepository$fetchData$1;
        int i;
        kotlin.jvm.functions.Function1<? super D, ? extends R> function13;
        kotlin.jvm.functions.Function1<? super com.paypal.oslo.core.network.graphql.error.CallError, ? extends com.paypal.oslo.feature.debitcard.shared.domain.model.DataResultError> function14;
        arrow.core.Ior.Both both;
        if (continuation instanceof com.paypal.oslo.feature.debitcard.shared.data.repository.BaseRepository$fetchData$1) {
            baseRepository$fetchData$1 = (com.paypal.oslo.feature.debitcard.shared.data.repository.BaseRepository$fetchData$1) continuation;
            if ((baseRepository$fetchData$1.getHighSpeedVideoSizesFor & Integer.MIN_VALUE) != 0) {
                baseRepository$fetchData$1.getHighSpeedVideoSizesFor -= 2147483648;
                java.lang.Object obj = baseRepository$fetchData$1.getOutputSizeshNQ4ISI;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = baseRepository$fetchData$1.getHighSpeedVideoSizesFor;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    com.paypal.oslo.feature.debitcard.shared.data.repository.BaseRepository$fetchData$errorMapper$1 baseRepository$fetchData$errorMapper$1 = function12 == null ? com.paypal.oslo.feature.debitcard.shared.data.repository.BaseRepository$fetchData$errorMapper$1.getHighSpeedVideoSizes : function12;
                    com.apollographql.apollo.ApolloCall apolloCall = (com.apollographql.apollo.ApolloCall) com.apollographql.apollo.cache.normalized.NormalizedCache.fetchPolicy(apolloClient.query(query), fetchPolicy);
                    if (riskSourceId != null) {
                        apolloCall.addExecutionContext((com.apollographql.apollo.api.ExecutionContext) new com.paypal.oslo.core.network.graphql.IncludeClientMetadataIdHeader(riskSourceId, null, 2, null));
                    }
                    baseRepository$fetchData$1.getHighSpeedVideoSizes = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(apolloClient);
                    baseRepository$fetchData$1.getHighSpeedVideoFpsRanges = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(query);
                    function13 = function1;
                    baseRepository$fetchData$1.getHighResolutionOutputSizeshNQ4ISI = function13;
                    baseRepository$fetchData$1.getHighSpeedVideoFpsRangesFor = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(function12);
                    baseRepository$fetchData$1.Camera2StreamConfigurationMap = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(fetchPolicy);
                    baseRepository$fetchData$1.getInputSizeshNQ4ISI = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(callConfig);
                    baseRepository$fetchData$1.getInputFormats = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(riskSourceId);
                    baseRepository$fetchData$1.getOutputMinFrameDuration = baseRepository$fetchData$errorMapper$1;
                    baseRepository$fetchData$1.getOutputFormats = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(apolloCall);
                    baseRepository$fetchData$1.getHighSpeedVideoSizesFor = 1;
                    java.lang.Object execute = com.paypal.oslo.core.network.graphql.ApolloClientExtensionKt.execute(apolloCall, callConfig, baseRepository$fetchData$1);
                    if (execute == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    kotlin.jvm.functions.Function1<? super com.paypal.oslo.core.network.graphql.error.CallError, ? extends com.paypal.oslo.feature.debitcard.shared.domain.model.DataResultError> function15 = baseRepository$fetchData$errorMapper$1;
                    obj = execute;
                    function14 = function15;
                } else {
                    if (i != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    function14 = (kotlin.jvm.functions.Function1) baseRepository$fetchData$1.getOutputMinFrameDuration;
                    kotlin.jvm.functions.Function1<? super D, ? extends R> function16 = (kotlin.jvm.functions.Function1) baseRepository$fetchData$1.getHighResolutionOutputSizeshNQ4ISI;
                    kotlin.ResultKt.throwOnFailure(obj);
                    function13 = function16;
                }
                both = (arrow.core.Ior) obj;
                if (!(both instanceof arrow.core.Ior.Left)) {
                    if (both instanceof arrow.core.Ior.Right) {
                        com.apollographql.apollo.api.Query.Data data = (com.apollographql.apollo.api.Query.Data) ((com.paypal.oslo.core.network.graphql.GraphQLData) ((arrow.core.Ior.Right) both).getValue()).getData();
                        both = new arrow.core.Ior.Right(data != null ? function13.invoke(data) : null);
                    } else if (both instanceof arrow.core.Ior.Both) {
                        arrow.core.Ior.Both both2 = (arrow.core.Ior.Both) both;
                        java.lang.Object leftValue = both2.getLeftValue();
                        com.apollographql.apollo.api.Query.Data data2 = (com.apollographql.apollo.api.Query.Data) ((com.paypal.oslo.core.network.graphql.GraphQLData) both2.getRightValue()).getData();
                        both = new arrow.core.Ior.Both(leftValue, data2 != null ? function13.invoke(data2) : null);
                    } else {
                        throw new kotlin.NoWhenBranchMatchedException();
                    }
                }
                if (!(both instanceof arrow.core.Ior.Left)) {
                    return new arrow.core.Ior.Left(function14.invoke(((arrow.core.Ior.Left) both).getValue()));
                }
                if (both instanceof arrow.core.Ior.Right) {
                    return both;
                }
                if (!(both instanceof arrow.core.Ior.Both)) {
                    throw new kotlin.NoWhenBranchMatchedException();
                }
                arrow.core.Ior.Both both3 = (arrow.core.Ior.Both) both;
                return new arrow.core.Ior.Both(function14.invoke(both3.getLeftValue()), both3.getRightValue());
            }
        }
        baseRepository$fetchData$1 = new com.paypal.oslo.feature.debitcard.shared.data.repository.BaseRepository$fetchData$1(this, continuation);
        java.lang.Object obj2 = baseRepository$fetchData$1.getOutputSizeshNQ4ISI;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = baseRepository$fetchData$1.getHighSpeedVideoSizesFor;
        if (i != 0) {
        }
        both = (arrow.core.Ior) obj2;
        if (!(both instanceof arrow.core.Ior.Left)) {
        }
        if (!(both instanceof arrow.core.Ior.Left)) {
        }
    }

    public static /* synthetic */ java.lang.Object fetchData$default(com.paypal.oslo.feature.debitcard.shared.data.repository.BaseRepository baseRepository, com.apollographql.apollo.ApolloClient apolloClient, com.apollographql.apollo.api.Query query, kotlin.jvm.functions.Function1 function1, kotlin.jvm.functions.Function1 function12, com.apollographql.apollo.cache.normalized.FetchPolicy fetchPolicy, com.paypal.oslo.core.network.graphql.CallConfig callConfig, com.paypal.oslo.core.network.graphql.RiskSourceId riskSourceId, kotlin.coroutines.Continuation continuation, int i, java.lang.Object obj) {
        if (obj == null) {
            return baseRepository.fetchData(apolloClient, query, function1, (i & 4) != 0 ? null : function12, (i & 8) != 0 ? com.apollographql.apollo.cache.normalized.FetchPolicy.NetworkOnly : fetchPolicy, (i & 16) != 0 ? createCallConfig$debit_card_prodRelease$default(baseRepository, null, 1, null) : callConfig, (i & 32) != 0 ? null : riskSourceId, continuation);
        }
        throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: fetchData");
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0142  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0154  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final <R, D extends com.apollographql.apollo.api.Mutation.Data> java.lang.Object executeMutation(com.apollographql.apollo.ApolloClient apolloClient, com.apollographql.apollo.api.Mutation<D> mutation, kotlin.jvm.functions.Function1<? super D, ? extends R> function1, kotlin.jvm.functions.Function1<? super com.paypal.oslo.core.network.graphql.error.CallError, ? extends com.paypal.oslo.feature.debitcard.shared.domain.model.DataResultError> function12, java.util.Map<java.lang.String, java.lang.String> map, com.apollographql.apollo.cache.normalized.FetchPolicy fetchPolicy, com.paypal.oslo.core.network.graphql.CallConfig callConfig, com.paypal.oslo.core.network.graphql.RiskSourceId riskSourceId, kotlin.coroutines.Continuation<? super arrow.core.Ior<? extends com.paypal.oslo.feature.debitcard.shared.domain.model.DataResultError, ? extends R>> continuation) {
        com.paypal.oslo.feature.debitcard.shared.data.repository.BaseRepository$executeMutation$1 baseRepository$executeMutation$1;
        int i;
        kotlin.jvm.functions.Function1<? super D, ? extends R> function13;
        kotlin.jvm.functions.Function1<? super com.paypal.oslo.core.network.graphql.error.CallError, ? extends com.paypal.oslo.feature.debitcard.shared.domain.model.DataResultError> function14;
        arrow.core.Ior.Both both;
        if (continuation instanceof com.paypal.oslo.feature.debitcard.shared.data.repository.BaseRepository$executeMutation$1) {
            baseRepository$executeMutation$1 = (com.paypal.oslo.feature.debitcard.shared.data.repository.BaseRepository$executeMutation$1) continuation;
            if ((baseRepository$executeMutation$1.getOutputMinFrameDurationlomOqCM & Integer.MIN_VALUE) != 0) {
                baseRepository$executeMutation$1.getOutputMinFrameDurationlomOqCM -= 2147483648;
                java.lang.Object obj = baseRepository$executeMutation$1.getOutputSizeshNQ4ISI;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = baseRepository$executeMutation$1.getOutputMinFrameDurationlomOqCM;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    com.paypal.oslo.feature.debitcard.shared.data.repository.BaseRepository$executeMutation$errorMapper$1 baseRepository$executeMutation$errorMapper$1 = function12 == null ? com.paypal.oslo.feature.debitcard.shared.data.repository.BaseRepository$executeMutation$errorMapper$1.Camera2StreamConfigurationMap : function12;
                    com.apollographql.apollo.ApolloCall apolloCall = (com.apollographql.apollo.ApolloCall) com.apollographql.apollo.cache.normalized.NormalizedCache.fetchPolicy(apolloClient.mutation(mutation), fetchPolicy);
                    if (map != null) {
                        for (java.util.Map.Entry<java.lang.String, java.lang.String> entry : map.entrySet()) {
                            apolloCall.addHttpHeader(entry.getKey(), entry.getValue());
                        }
                    }
                    if (riskSourceId != null) {
                        apolloCall.addExecutionContext((com.apollographql.apollo.api.ExecutionContext) new com.paypal.oslo.core.network.graphql.IncludeClientMetadataIdHeader(riskSourceId, null, 2, null));
                    }
                    baseRepository$executeMutation$1.Camera2StreamConfigurationMap = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(apolloClient);
                    baseRepository$executeMutation$1.getHighSpeedVideoFpsRangesFor = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(mutation);
                    function13 = function1;
                    baseRepository$executeMutation$1.getHighSpeedVideoSizes = function13;
                    baseRepository$executeMutation$1.getHighSpeedVideoFpsRanges = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(function12);
                    baseRepository$executeMutation$1.getHighResolutionOutputSizeshNQ4ISI = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(map);
                    baseRepository$executeMutation$1.getOutputMinFrameDuration = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(fetchPolicy);
                    baseRepository$executeMutation$1.getInputSizeshNQ4ISI = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(callConfig);
                    baseRepository$executeMutation$1.getOutputFormats = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(riskSourceId);
                    baseRepository$executeMutation$1.getInputFormats = baseRepository$executeMutation$errorMapper$1;
                    baseRepository$executeMutation$1.getHighSpeedVideoSizesFor = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(apolloCall);
                    baseRepository$executeMutation$1.getOutputMinFrameDurationlomOqCM = 1;
                    java.lang.Object execute = com.paypal.oslo.core.network.graphql.ApolloClientExtensionKt.execute(apolloCall, callConfig, baseRepository$executeMutation$1);
                    if (execute == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    kotlin.jvm.functions.Function1<? super com.paypal.oslo.core.network.graphql.error.CallError, ? extends com.paypal.oslo.feature.debitcard.shared.domain.model.DataResultError> function15 = baseRepository$executeMutation$errorMapper$1;
                    obj = execute;
                    function14 = function15;
                } else {
                    if (i != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    function14 = (kotlin.jvm.functions.Function1) baseRepository$executeMutation$1.getInputFormats;
                    kotlin.jvm.functions.Function1<? super D, ? extends R> function16 = (kotlin.jvm.functions.Function1) baseRepository$executeMutation$1.getHighSpeedVideoSizes;
                    kotlin.ResultKt.throwOnFailure(obj);
                    function13 = function16;
                }
                both = (arrow.core.Ior) obj;
                if (!(both instanceof arrow.core.Ior.Left)) {
                    if (both instanceof arrow.core.Ior.Right) {
                        com.apollographql.apollo.api.Mutation.Data data = (com.apollographql.apollo.api.Mutation.Data) ((com.paypal.oslo.core.network.graphql.GraphQLData) ((arrow.core.Ior.Right) both).getValue()).getData();
                        both = new arrow.core.Ior.Right(data != null ? function13.invoke(data) : null);
                    } else if (both instanceof arrow.core.Ior.Both) {
                        arrow.core.Ior.Both both2 = (arrow.core.Ior.Both) both;
                        java.lang.Object leftValue = both2.getLeftValue();
                        com.apollographql.apollo.api.Mutation.Data data2 = (com.apollographql.apollo.api.Mutation.Data) ((com.paypal.oslo.core.network.graphql.GraphQLData) both2.getRightValue()).getData();
                        both = new arrow.core.Ior.Both(leftValue, data2 != null ? function13.invoke(data2) : null);
                    } else {
                        throw new kotlin.NoWhenBranchMatchedException();
                    }
                }
                if (!(both instanceof arrow.core.Ior.Left)) {
                    return new arrow.core.Ior.Left(function14.invoke(((arrow.core.Ior.Left) both).getValue()));
                }
                if (both instanceof arrow.core.Ior.Right) {
                    return both;
                }
                if (!(both instanceof arrow.core.Ior.Both)) {
                    throw new kotlin.NoWhenBranchMatchedException();
                }
                arrow.core.Ior.Both both3 = (arrow.core.Ior.Both) both;
                return new arrow.core.Ior.Both(function14.invoke(both3.getLeftValue()), both3.getRightValue());
            }
        }
        baseRepository$executeMutation$1 = new com.paypal.oslo.feature.debitcard.shared.data.repository.BaseRepository$executeMutation$1(this, continuation);
        java.lang.Object obj2 = baseRepository$executeMutation$1.getOutputSizeshNQ4ISI;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = baseRepository$executeMutation$1.getOutputMinFrameDurationlomOqCM;
        if (i != 0) {
        }
        both = (arrow.core.Ior) obj2;
        if (!(both instanceof arrow.core.Ior.Left)) {
        }
        if (!(both instanceof arrow.core.Ior.Left)) {
        }
    }

    public static /* synthetic */ java.lang.Object executeMutation$default(com.paypal.oslo.feature.debitcard.shared.data.repository.BaseRepository baseRepository, com.apollographql.apollo.ApolloClient apolloClient, com.apollographql.apollo.api.Mutation mutation, kotlin.jvm.functions.Function1 function1, kotlin.jvm.functions.Function1 function12, java.util.Map map, com.apollographql.apollo.cache.normalized.FetchPolicy fetchPolicy, com.paypal.oslo.core.network.graphql.CallConfig callConfig, com.paypal.oslo.core.network.graphql.RiskSourceId riskSourceId, kotlin.coroutines.Continuation continuation, int i, java.lang.Object obj) {
        if (obj == null) {
            return baseRepository.executeMutation(apolloClient, mutation, function1, (i & 4) != 0 ? null : function12, (i & 8) != 0 ? null : map, (i & 16) != 0 ? com.apollographql.apollo.cache.normalized.FetchPolicy.NetworkOnly : fetchPolicy, (i & 32) != 0 ? createCallConfig$debit_card_prodRelease$default(baseRepository, null, 1, null) : callConfig, (i & 64) != 0 ? null : riskSourceId, continuation);
        }
        throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: executeMutation");
    }

    public static /* synthetic */ com.paypal.oslo.core.network.graphql.CallConfig createCallConfig$debit_card_prodRelease$default(com.paypal.oslo.feature.debitcard.shared.data.repository.BaseRepository baseRepository, com.paypal.oslo.core.identity.domain.model.AuthenticationState authenticationState, int i, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: createCallConfig");
        }
        if ((i & 1) != 0) {
            authenticationState = com.paypal.oslo.core.identity.domain.model.AuthenticationState.REMEMBERED;
        }
        return baseRepository.createCallConfig$debit_card_prodRelease(authenticationState);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final com.paypal.oslo.core.network.graphql.CallConfig createCallConfig$debit_card_prodRelease(com.paypal.oslo.core.identity.domain.model.AuthenticationState authState) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(authState, "");
        return new com.paypal.oslo.core.network.graphql.CallConfig(new com.paypal.oslo.core.network.graphql.AuthType.User(new com.paypal.oslo.core.identity.domain.model.AuthenticationContext(authState, new com.paypal.oslo.core.identity.domain.model.AuthenticationFlowInfo("debit_card", (java.util.Map) null, 2, (kotlin.jvm.internal.DefaultConstructorMarker) null))), null, 2, 0 == true ? 1 : 0);
    }
}
