package com.paypal.oslo.feature.balance.data.repository.balance;

@kotlin.Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001c\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006H\u0096@¢\u0006\u0004\b\t\u0010\nJ\u001c\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u000b0\u0006H\u0096@¢\u0006\u0004\b\f\u0010\nJ#\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u000b0\u00062\u0006\u0010\r\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u001c\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00100\u0006H\u0096@¢\u0006\u0004\b\u0011\u0010\nJ)\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00100\u00062\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00130\u0012H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J3\u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u00062\u000e\u0010\u0017\u001a\n\u0012\u0004\u0012\u00020\u0016\u0018\u00010\u00122\u0006\u0010\u0018\u001a\u00020\u0007H\u0000¢\u0006\u0004\b\u0019\u0010\u001aJ+\u0010\u001c\u001a\u000e\u0012\u0004\u0012\u00020\u001b\u0012\u0004\u0012\u00020\b0\u00062\u000e\u0010\u0017\u001a\n\u0012\u0004\u0012\u00020\u0016\u0018\u00010\u0012H\u0000¢\u0006\u0004\b\u001c\u0010\u0015R\u0014\u0010\u001f\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0018\u0010\u0014\u001a\u0004\u0018\u00010\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000e\u0010 "}, d2 = {"Lcom/paypal/oslo/feature/balance/data/repository/balance/BalanceRepositoryImpl;", "Lcom/paypal/oslo/feature/balance/domain/repository/balance/BalanceRepository;", "Lcom/apollographql/apollo/ApolloClient;", "apolloClient", "<init>", "(Lcom/apollographql/apollo/ApolloClient;)V", "Larrow/core/Ior;", "Lcom/paypal/oslo/core/network/graphql/error/CallError;", "Lcom/paypal/oslo/feature/balance/domain/model/Balance;", "fetchBalance", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "fetchBalanceId", "p0", "getHighSpeedVideoSizes", "(Lcom/paypal/oslo/feature/balance/domain/model/Balance;)Larrow/core/Ior;", "Lcom/paypal/oslo/feature/balance/domain/model/TaxHoldPolicy;", "fetchTaxHoldPolicy", "Lcom/paypal/oslo/core/network/graphql/GraphQLData;", "Lcom/paypal/oslo/feature/balance/graphql/GetTaxHoldPolicyQuery$Data;", "getHighResolutionOutputSizeshNQ4ISI", "(Lcom/paypal/oslo/core/network/graphql/GraphQLData;)Larrow/core/Ior;", "Lcom/paypal/oslo/feature/balance/graphql/GetBalancesQuery$Data;", "graphQLData", "callError", "errorWithData$balance_prodRelease", "(Lcom/paypal/oslo/core/network/graphql/GraphQLData;Lcom/paypal/oslo/core/network/graphql/error/CallError;)Larrow/core/Ior;", "Lcom/paypal/oslo/core/network/graphql/error/CallError$Network;", "dataResponse$balance_prodRelease", "Camera2StreamConfigurationMap", "Lcom/apollographql/apollo/ApolloClient;", "getHighSpeedVideoFpsRanges", "Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class BalanceRepositoryImpl implements com.paypal.oslo.feature.balance.domain.repository.balance.BalanceRepository {
    public static final int $stable = 8;

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final com.apollographql.apollo.ApolloClient getHighSpeedVideoFpsRanges;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private java.lang.String getHighResolutionOutputSizeshNQ4ISI;

    @javax.inject.Inject
    public BalanceRepositoryImpl(com.apollographql.apollo.ApolloClient apolloClient) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(apolloClient, "");
        this.getHighSpeedVideoFpsRanges = apolloClient;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    @Override // com.paypal.oslo.feature.balance.domain.repository.balance.BalanceRepository
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object fetchBalance(kotlin.coroutines.Continuation<? super arrow.core.Ior<? extends com.paypal.oslo.core.network.graphql.error.CallError, com.paypal.oslo.feature.balance.domain.model.Balance>> continuation) {
        com.paypal.oslo.feature.balance.data.repository.balance.BalanceRepositoryImpl$fetchBalance$1 balanceRepositoryImpl$fetchBalance$1;
        int i;
        arrow.core.Ior ior;
        arrow.core.Ior.Left errorWithData$balance_prodRelease;
        if (continuation instanceof com.paypal.oslo.feature.balance.data.repository.balance.BalanceRepositoryImpl$fetchBalance$1) {
            balanceRepositoryImpl$fetchBalance$1 = (com.paypal.oslo.feature.balance.data.repository.balance.BalanceRepositoryImpl$fetchBalance$1) continuation;
            if ((balanceRepositoryImpl$fetchBalance$1.getHighSpeedVideoFpsRanges & Integer.MIN_VALUE) != 0) {
                balanceRepositoryImpl$fetchBalance$1.getHighSpeedVideoFpsRanges -= 2147483648;
                java.lang.Object obj = balanceRepositoryImpl$fetchBalance$1.getHighResolutionOutputSizeshNQ4ISI;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = balanceRepositoryImpl$fetchBalance$1.getHighSpeedVideoFpsRanges;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    com.paypal.oslo.feature.balance.graphql.GetBalancesQuery getBalancesQuery = new com.paypal.oslo.feature.balance.graphql.GetBalancesQuery();
                    com.apollographql.apollo.ApolloCall apolloCall = (com.apollographql.apollo.ApolloCall) com.apollographql.apollo.cache.normalized.NormalizedCache.fetchPolicy(this.getHighSpeedVideoFpsRanges.query(getBalancesQuery), com.apollographql.apollo.cache.normalized.FetchPolicy.NetworkFirst);
                    balanceRepositoryImpl$fetchBalance$1.Camera2StreamConfigurationMap = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(getBalancesQuery);
                    balanceRepositoryImpl$fetchBalance$1.getHighSpeedVideoSizes = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(apolloCall);
                    balanceRepositoryImpl$fetchBalance$1.getHighSpeedVideoFpsRanges = 1;
                    obj = com.paypal.oslo.core.network.graphql.ApolloClientExtensionKt.execute$default(apolloCall, null, balanceRepositoryImpl$fetchBalance$1, 2, null);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.ResultKt.throwOnFailure(obj);
                }
                ior = (arrow.core.Ior) obj;
                if (!(ior instanceof arrow.core.Ior.Left)) {
                    com.paypal.oslo.core.network.graphql.error.CallError callError = (com.paypal.oslo.core.network.graphql.error.CallError) ((arrow.core.Ior.Left) ior).getValue();
                    com.paypal.android.logger.Logger.w$default(com.paypal.oslo.feature.balance.LoggerKt.log, "Fetch balances failed", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("errorType", kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(callError.getClass()).getSimpleName())), null, 4, null);
                    errorWithData$balance_prodRelease = new arrow.core.Ior.Left(callError);
                } else if (ior instanceof arrow.core.Ior.Right) {
                    errorWithData$balance_prodRelease = dataResponse$balance_prodRelease((com.paypal.oslo.core.network.graphql.GraphQLData) ((arrow.core.Ior.Right) ior).getValue());
                } else if (ior instanceof arrow.core.Ior.Both) {
                    arrow.core.Ior.Both both = (arrow.core.Ior.Both) ior;
                    errorWithData$balance_prodRelease = errorWithData$balance_prodRelease((com.paypal.oslo.core.network.graphql.GraphQLData) both.getRightValue(), (com.paypal.oslo.core.network.graphql.error.CallError) both.getLeftValue());
                } else {
                    throw new kotlin.NoWhenBranchMatchedException();
                }
                com.paypal.oslo.feature.balance.analytics.BalanceApiTrackerKt.trackCallResult("get_balance_hub", "query", errorWithData$balance_prodRelease);
                return errorWithData$balance_prodRelease;
            }
        }
        balanceRepositoryImpl$fetchBalance$1 = new com.paypal.oslo.feature.balance.data.repository.balance.BalanceRepositoryImpl$fetchBalance$1(this, continuation);
        java.lang.Object obj2 = balanceRepositoryImpl$fetchBalance$1.getHighResolutionOutputSizeshNQ4ISI;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = balanceRepositoryImpl$fetchBalance$1.getHighSpeedVideoFpsRanges;
        if (i != 0) {
        }
        ior = (arrow.core.Ior) obj2;
        if (!(ior instanceof arrow.core.Ior.Left)) {
        }
        com.paypal.oslo.feature.balance.analytics.BalanceApiTrackerKt.trackCallResult("get_balance_hub", "query", errorWithData$balance_prodRelease);
        return errorWithData$balance_prodRelease;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    @Override // com.paypal.oslo.feature.balance.domain.repository.balance.BalanceRepository
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object fetchBalanceId(kotlin.coroutines.Continuation<? super arrow.core.Ior<? extends com.paypal.oslo.core.network.graphql.error.CallError, java.lang.String>> continuation) {
        com.paypal.oslo.feature.balance.data.repository.balance.BalanceRepositoryImpl$fetchBalanceId$1 balanceRepositoryImpl$fetchBalanceId$1;
        int i;
        arrow.core.Ior rightIor;
        arrow.core.Ior ior;
        if (continuation instanceof com.paypal.oslo.feature.balance.data.repository.balance.BalanceRepositoryImpl$fetchBalanceId$1) {
            balanceRepositoryImpl$fetchBalanceId$1 = (com.paypal.oslo.feature.balance.data.repository.balance.BalanceRepositoryImpl$fetchBalanceId$1) continuation;
            if ((balanceRepositoryImpl$fetchBalanceId$1.getHighSpeedVideoFpsRanges & Integer.MIN_VALUE) != 0) {
                balanceRepositoryImpl$fetchBalanceId$1.getHighSpeedVideoFpsRanges -= 2147483648;
                java.lang.Object obj = balanceRepositoryImpl$fetchBalanceId$1.getHighSpeedVideoSizes;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = balanceRepositoryImpl$fetchBalanceId$1.getHighSpeedVideoFpsRanges;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    java.lang.String str = this.getHighResolutionOutputSizeshNQ4ISI;
                    if (str != null && (rightIor = arrow.core.IorKt.rightIor(str)) != null) {
                        return rightIor;
                    }
                    balanceRepositoryImpl$fetchBalanceId$1.getHighSpeedVideoFpsRanges = 1;
                    obj = fetchBalance(balanceRepositoryImpl$fetchBalanceId$1);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.ResultKt.throwOnFailure(obj);
                }
                ior = (arrow.core.Ior) obj;
                if (!(ior instanceof arrow.core.Ior.Left)) {
                    com.paypal.oslo.core.network.graphql.error.CallError callError = (com.paypal.oslo.core.network.graphql.error.CallError) ((arrow.core.Ior.Left) ior).getValue();
                    com.paypal.android.logger.Logger.w$default(com.paypal.oslo.feature.balance.LoggerKt.log, "Failed to fetch balance for balance ID extraction", kotlin.collections.MapsKt.emptyMap(), null, 4, null);
                    return new arrow.core.Ior.Left(callError);
                }
                if (ior instanceof arrow.core.Ior.Right) {
                    return getHighSpeedVideoSizes((com.paypal.oslo.feature.balance.domain.model.Balance) ((arrow.core.Ior.Right) ior).getValue());
                }
                if (ior instanceof arrow.core.Ior.Both) {
                    arrow.core.Ior.Both both = (arrow.core.Ior.Both) ior;
                    return getHighSpeedVideoSizes((com.paypal.oslo.feature.balance.domain.model.Balance) both.getRightValue());
                }
                throw new kotlin.NoWhenBranchMatchedException();
            }
        }
        balanceRepositoryImpl$fetchBalanceId$1 = new com.paypal.oslo.feature.balance.data.repository.balance.BalanceRepositoryImpl$fetchBalanceId$1(this, continuation);
        java.lang.Object obj2 = balanceRepositoryImpl$fetchBalanceId$1.getHighSpeedVideoSizes;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = balanceRepositoryImpl$fetchBalanceId$1.getHighSpeedVideoFpsRanges;
        if (i != 0) {
        }
        ior = (arrow.core.Ior) obj2;
        if (!(ior instanceof arrow.core.Ior.Left)) {
        }
    }

    private final arrow.core.Ior<com.paypal.oslo.core.network.graphql.error.CallError, java.lang.String> getHighSpeedVideoSizes(com.paypal.oslo.feature.balance.domain.model.Balance p0) {
        java.lang.String id;
        arrow.core.Ior<com.paypal.oslo.core.network.graphql.error.CallError, java.lang.String> rightIor;
        com.paypal.oslo.feature.balance.domain.model.CurrencyBalance currencyBalance = (com.paypal.oslo.feature.balance.domain.model.CurrencyBalance) kotlin.collections.CollectionsKt.firstOrNull((java.util.List) p0.getCurrencies());
        if (currencyBalance != null && (id = currencyBalance.getId()) != null && (rightIor = arrow.core.IorKt.rightIor(id)) != null) {
            return rightIor;
        }
        com.paypal.android.logger.Logger.w$default(com.paypal.oslo.feature.balance.LoggerKt.log, "No balance ID found", kotlin.collections.MapsKt.emptyMap(), null, 4, null);
        return arrow.core.IorKt.leftIor(new com.paypal.oslo.core.network.graphql.error.CallError.Network(new com.paypal.oslo.core.network.http.error.NetworkError.UnknownError(new java.lang.IllegalStateException("No Balance ID found"))));
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    @Override // com.paypal.oslo.feature.balance.domain.repository.balance.BalanceRepository
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object fetchTaxHoldPolicy(kotlin.coroutines.Continuation<? super arrow.core.Ior<? extends com.paypal.oslo.core.network.graphql.error.CallError, com.paypal.oslo.feature.balance.domain.model.TaxHoldPolicy>> continuation) {
        com.paypal.oslo.feature.balance.data.repository.balance.BalanceRepositoryImpl$fetchTaxHoldPolicy$1 balanceRepositoryImpl$fetchTaxHoldPolicy$1;
        int i;
        arrow.core.Ior ior;
        arrow.core.Ior<com.paypal.oslo.core.network.graphql.error.CallError, com.paypal.oslo.feature.balance.domain.model.TaxHoldPolicy> highResolutionOutputSizeshNQ4ISI;
        if (continuation instanceof com.paypal.oslo.feature.balance.data.repository.balance.BalanceRepositoryImpl$fetchTaxHoldPolicy$1) {
            balanceRepositoryImpl$fetchTaxHoldPolicy$1 = (com.paypal.oslo.feature.balance.data.repository.balance.BalanceRepositoryImpl$fetchTaxHoldPolicy$1) continuation;
            if ((balanceRepositoryImpl$fetchTaxHoldPolicy$1.getHighSpeedVideoFpsRanges & Integer.MIN_VALUE) != 0) {
                balanceRepositoryImpl$fetchTaxHoldPolicy$1.getHighSpeedVideoFpsRanges -= 2147483648;
                java.lang.Object obj = balanceRepositoryImpl$fetchTaxHoldPolicy$1.getHighSpeedVideoFpsRangesFor;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = balanceRepositoryImpl$fetchTaxHoldPolicy$1.getHighSpeedVideoFpsRanges;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    com.paypal.oslo.feature.balance.graphql.GetTaxHoldPolicyQuery getTaxHoldPolicyQuery = new com.paypal.oslo.feature.balance.graphql.GetTaxHoldPolicyQuery();
                    com.apollographql.apollo.ApolloCall apolloCall = (com.apollographql.apollo.ApolloCall) com.apollographql.apollo.cache.normalized.NormalizedCache.fetchPolicy(this.getHighSpeedVideoFpsRanges.query(getTaxHoldPolicyQuery), com.apollographql.apollo.cache.normalized.FetchPolicy.NetworkOnly);
                    balanceRepositoryImpl$fetchTaxHoldPolicy$1.getHighResolutionOutputSizeshNQ4ISI = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(getTaxHoldPolicyQuery);
                    balanceRepositoryImpl$fetchTaxHoldPolicy$1.Camera2StreamConfigurationMap = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(apolloCall);
                    balanceRepositoryImpl$fetchTaxHoldPolicy$1.getHighSpeedVideoFpsRanges = 1;
                    obj = com.paypal.oslo.core.network.graphql.ApolloClientExtensionKt.execute$default(apolloCall, null, balanceRepositoryImpl$fetchTaxHoldPolicy$1, 2, null);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.ResultKt.throwOnFailure(obj);
                }
                ior = (arrow.core.Ior) obj;
                if (!(ior instanceof arrow.core.Ior.Left)) {
                    highResolutionOutputSizeshNQ4ISI = arrow.core.IorKt.leftIor((com.paypal.oslo.core.network.graphql.error.CallError) ((arrow.core.Ior.Left) ior).getValue());
                } else if (ior instanceof arrow.core.Ior.Right) {
                    highResolutionOutputSizeshNQ4ISI = getHighResolutionOutputSizeshNQ4ISI((com.paypal.oslo.core.network.graphql.GraphQLData) ((arrow.core.Ior.Right) ior).getValue());
                } else if (ior instanceof arrow.core.Ior.Both) {
                    arrow.core.Ior.Both both = (arrow.core.Ior.Both) ior;
                    highResolutionOutputSizeshNQ4ISI = getHighResolutionOutputSizeshNQ4ISI((com.paypal.oslo.core.network.graphql.GraphQLData) both.getRightValue());
                } else {
                    throw new kotlin.NoWhenBranchMatchedException();
                }
                com.paypal.oslo.feature.balance.analytics.BalanceApiTrackerKt.trackCallResult("get_hold_details", "query", highResolutionOutputSizeshNQ4ISI);
                return highResolutionOutputSizeshNQ4ISI;
            }
        }
        balanceRepositoryImpl$fetchTaxHoldPolicy$1 = new com.paypal.oslo.feature.balance.data.repository.balance.BalanceRepositoryImpl$fetchTaxHoldPolicy$1(this, continuation);
        java.lang.Object obj2 = balanceRepositoryImpl$fetchTaxHoldPolicy$1.getHighSpeedVideoFpsRangesFor;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = balanceRepositoryImpl$fetchTaxHoldPolicy$1.getHighSpeedVideoFpsRanges;
        if (i != 0) {
        }
        ior = (arrow.core.Ior) obj2;
        if (!(ior instanceof arrow.core.Ior.Left)) {
        }
        com.paypal.oslo.feature.balance.analytics.BalanceApiTrackerKt.trackCallResult("get_hold_details", "query", highResolutionOutputSizeshNQ4ISI);
        return highResolutionOutputSizeshNQ4ISI;
    }

    private final arrow.core.Ior<com.paypal.oslo.core.network.graphql.error.CallError, com.paypal.oslo.feature.balance.domain.model.TaxHoldPolicy> getHighResolutionOutputSizeshNQ4ISI(com.paypal.oslo.core.network.graphql.GraphQLData<com.paypal.oslo.feature.balance.graphql.GetTaxHoldPolicyQuery.Data> p0) {
        com.paypal.oslo.feature.balance.graphql.GetTaxHoldPolicyQuery.BalanceHoldPolicies balanceHoldPolicies;
        java.util.List<com.paypal.oslo.feature.balance.graphql.GetTaxHoldPolicyQuery.Item> items;
        com.paypal.oslo.feature.balance.graphql.GetTaxHoldPolicyQuery.Item item;
        com.paypal.oslo.feature.balance.graphql.GetTaxHoldPolicyQuery.TaxDetails taxDetails;
        java.lang.Object taxRate;
        java.lang.String obj;
        com.paypal.oslo.feature.balance.graphql.GetTaxHoldPolicyQuery.Amount amount;
        com.paypal.oslo.feature.balance.graphql.GetTaxHoldPolicyQuery.Data data = p0.getData();
        arrow.core.Ior<com.paypal.oslo.core.network.graphql.error.CallError, com.paypal.oslo.feature.balance.domain.model.TaxHoldPolicy> ior = null;
        if (data != null && (balanceHoldPolicies = data.getBalanceHoldPolicies()) != null && (items = balanceHoldPolicies.getItems()) != null && (item = (com.paypal.oslo.feature.balance.graphql.GetTaxHoldPolicyQuery.Item) kotlin.collections.CollectionsKt.firstOrNull((java.util.List) items)) != null && (taxDetails = item.getTaxDetails()) != null && (taxRate = taxDetails.getTaxRate()) != null && (obj = taxRate.toString()) != null) {
            java.lang.Object nextWithholdingDate = item.getTaxDetails().getNextWithholdingDate();
            java.lang.String obj2 = nextWithholdingDate != null ? nextWithholdingDate.toString() : null;
            if (obj2 == null) {
                obj2 = "";
            }
            java.lang.String str = obj2;
            com.paypal.oslo.feature.balance.graphql.GetTaxHoldPolicyQuery.Thresholds thresholds = item.getThresholds();
            if (thresholds != null && (amount = thresholds.getAmount()) != null) {
                ior = arrow.core.IorKt.rightIor(new com.paypal.oslo.feature.balance.domain.model.TaxHoldPolicy(item.getPolicyStatus(), item.getProcessStatus(), obj, str, new com.paypal.oslo.feature.balance.domain.model.Money(new java.math.BigDecimal(amount.getValue()), com.paypal.oslo.core.i18n.domain.model.CurrencyCode.m11384constructorimpl(amount.getCurrencyCode().toString()), null)));
            }
        }
        return ior == null ? arrow.core.IorKt.leftIor(new com.paypal.oslo.core.network.graphql.error.CallError.GraphQL(arrow.core.NonEmptyListKt.nonEmptyListOf(new com.paypal.oslo.core.network.graphql.error.GraphQLError("Missing tax hold policy data", null, null, 6, null), new com.paypal.oslo.core.network.graphql.error.GraphQLError[0]), false, null, 6, null)) : ior;
    }

    public final arrow.core.Ior<com.paypal.oslo.core.network.graphql.error.CallError, com.paypal.oslo.feature.balance.domain.model.Balance> errorWithData$balance_prodRelease(com.paypal.oslo.core.network.graphql.GraphQLData<com.paypal.oslo.feature.balance.graphql.GetBalancesQuery.Data> graphQLData, com.paypal.oslo.core.network.graphql.error.CallError callError) {
        com.paypal.oslo.feature.balance.graphql.GetBalancesQuery.Data data;
        com.paypal.oslo.feature.balance.graphql.GetBalancesQuery.Balances balances;
        com.paypal.oslo.feature.balance.domain.model.Balance balance;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(callError, "");
        if (graphQLData != null && (data = graphQLData.getData()) != null && (balances = data.getBalances()) != null && (balance = com.paypal.oslo.feature.balance.data.repository.balance.BalanceRepositoryImplKt.toBalance(balances)) != null) {
            com.paypal.oslo.feature.balance.domain.model.CurrencyBalance currencyBalance = (com.paypal.oslo.feature.balance.domain.model.CurrencyBalance) kotlin.collections.CollectionsKt.firstOrNull((java.util.List) balance.getCurrencies());
            this.getHighResolutionOutputSizeshNQ4ISI = currencyBalance != null ? currencyBalance.getId() : null;
            return new arrow.core.Ior.Both(callError, balance);
        }
        return arrow.core.IorKt.leftIor(callError);
    }

    public final arrow.core.Ior<com.paypal.oslo.core.network.graphql.error.CallError.Network, com.paypal.oslo.feature.balance.domain.model.Balance> dataResponse$balance_prodRelease(com.paypal.oslo.core.network.graphql.GraphQLData<com.paypal.oslo.feature.balance.graphql.GetBalancesQuery.Data> graphQLData) {
        com.paypal.oslo.feature.balance.graphql.GetBalancesQuery.Data data;
        com.paypal.oslo.feature.balance.graphql.GetBalancesQuery.Balances balances;
        com.paypal.oslo.feature.balance.domain.model.Balance balance;
        if (graphQLData != null && (data = graphQLData.getData()) != null && (balances = data.getBalances()) != null && (balance = com.paypal.oslo.feature.balance.data.repository.balance.BalanceRepositoryImplKt.toBalance(balances)) != null) {
            com.paypal.oslo.feature.balance.domain.model.CurrencyBalance currencyBalance = (com.paypal.oslo.feature.balance.domain.model.CurrencyBalance) kotlin.collections.CollectionsKt.firstOrNull((java.util.List) balance.getCurrencies());
            this.getHighResolutionOutputSizeshNQ4ISI = currencyBalance != null ? currencyBalance.getId() : null;
            arrow.core.Ior<com.paypal.oslo.core.network.graphql.error.CallError.Network, com.paypal.oslo.feature.balance.domain.model.Balance> rightIor = arrow.core.IorKt.rightIor(balance);
            if (rightIor != null) {
                return rightIor;
            }
        }
        java.lang.IllegalStateException illegalStateException = new java.lang.IllegalStateException("No balances data returned");
        com.paypal.oslo.feature.balance.LoggerKt.log.e("GraphQL response missing balances data", illegalStateException);
        return arrow.core.IorKt.leftIor(new com.paypal.oslo.core.network.graphql.error.CallError.Network(new com.paypal.oslo.core.network.http.error.NetworkError.UnknownError(illegalStateException)));
    }
}
