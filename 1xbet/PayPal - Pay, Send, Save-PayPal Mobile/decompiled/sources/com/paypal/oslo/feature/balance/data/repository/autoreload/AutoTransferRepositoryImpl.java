package com.paypal.oslo.feature.balance.data.repository.autoreload;

@kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001c\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006H\u0096@¢\u0006\u0004\b\t\u0010\nJ$\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\r0\u00062\u0006\u0010\f\u001a\u00020\u000bH\u0096@¢\u0006\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0012\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011"}, d2 = {"Lcom/paypal/oslo/feature/balance/data/repository/autoreload/AutoTransferRepositoryImpl;", "Lcom/paypal/oslo/feature/balance/domain/repository/autoreload/AutoTransferRepository;", "Lcom/apollographql/apollo/ApolloClient;", "apolloClient", "<init>", "(Lcom/apollographql/apollo/ApolloClient;)V", "Larrow/core/Ior;", "Lcom/paypal/oslo/feature/balance/domain/error/AutoReloadError;", "Lcom/paypal/oslo/feature/balance/domain/model/autoreload/BalanceAutoTransfer;", "fetchAutoTransfer", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "currencyCode", "", "disableAutoTransfer", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getHighSpeedVideoSizes", "Lcom/apollographql/apollo/ApolloClient;", "Camera2StreamConfigurationMap"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class AutoTransferRepositoryImpl implements com.paypal.oslo.feature.balance.domain.repository.autoreload.AutoTransferRepository {
    public static final int $stable = 8;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final com.apollographql.apollo.ApolloClient Camera2StreamConfigurationMap;

    @javax.inject.Inject
    public AutoTransferRepositoryImpl(com.apollographql.apollo.ApolloClient apolloClient) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(apolloClient, "");
        this.Camera2StreamConfigurationMap = apolloClient;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    @Override // com.paypal.oslo.feature.balance.domain.repository.autoreload.AutoTransferRepository
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object fetchAutoTransfer(kotlin.coroutines.Continuation<? super arrow.core.Ior<? extends com.paypal.oslo.feature.balance.domain.error.AutoReloadError, com.paypal.oslo.feature.balance.domain.model.autoreload.BalanceAutoTransfer>> continuation) {
        com.paypal.oslo.feature.balance.data.repository.autoreload.AutoTransferRepositoryImpl$fetchAutoTransfer$1 autoTransferRepositoryImpl$fetchAutoTransfer$1;
        int i;
        arrow.core.Ior ior;
        com.paypal.oslo.feature.balance.domain.model.autoreload.BalanceAutoTransfer balanceAutoTransfer;
        arrow.core.Ior.Right right;
        com.paypal.oslo.feature.balance.graphql.GetAutoTransferQuery.BalanceAutoTransfer balanceAutoTransfer2;
        com.paypal.oslo.feature.balance.domain.model.autoreload.BalanceAutoTransfer balanceAutoTransfer3;
        com.paypal.oslo.feature.balance.graphql.GetAutoTransferQuery.BalanceAutoTransfer balanceAutoTransfer4;
        if (continuation instanceof com.paypal.oslo.feature.balance.data.repository.autoreload.AutoTransferRepositoryImpl$fetchAutoTransfer$1) {
            autoTransferRepositoryImpl$fetchAutoTransfer$1 = (com.paypal.oslo.feature.balance.data.repository.autoreload.AutoTransferRepositoryImpl$fetchAutoTransfer$1) continuation;
            if ((autoTransferRepositoryImpl$fetchAutoTransfer$1.getHighSpeedVideoFpsRangesFor & Integer.MIN_VALUE) != 0) {
                autoTransferRepositoryImpl$fetchAutoTransfer$1.getHighSpeedVideoFpsRangesFor -= 2147483648;
                java.lang.Object obj = autoTransferRepositoryImpl$fetchAutoTransfer$1.getHighResolutionOutputSizeshNQ4ISI;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = autoTransferRepositoryImpl$fetchAutoTransfer$1.getHighSpeedVideoFpsRangesFor;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    com.paypal.oslo.feature.balance.graphql.GetAutoTransferQuery getAutoTransferQuery = new com.paypal.oslo.feature.balance.graphql.GetAutoTransferQuery();
                    com.apollographql.apollo.ApolloCall apolloCall = (com.apollographql.apollo.ApolloCall) com.apollographql.apollo.cache.normalized.NormalizedCache.fetchPolicy(this.Camera2StreamConfigurationMap.query(getAutoTransferQuery), com.apollographql.apollo.cache.normalized.FetchPolicy.NetworkOnly);
                    autoTransferRepositoryImpl$fetchAutoTransfer$1.getHighSpeedVideoSizes = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(getAutoTransferQuery);
                    autoTransferRepositoryImpl$fetchAutoTransfer$1.Camera2StreamConfigurationMap = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(apolloCall);
                    autoTransferRepositoryImpl$fetchAutoTransfer$1.getHighSpeedVideoFpsRangesFor = 1;
                    obj = com.paypal.oslo.core.network.graphql.ApolloClientExtensionKt.execute$default(apolloCall, null, autoTransferRepositoryImpl$fetchAutoTransfer$1, 2, null);
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
                    com.paypal.android.logger.Logger.w$default(com.paypal.oslo.feature.balance.LoggerKt.log, "Fetch auto transfer failed", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("errorType", kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(((com.paypal.oslo.core.network.graphql.error.CallError) ((arrow.core.Ior.Left) ior).getValue()).getClass()).getSimpleName())), null, 4, null);
                    right = new arrow.core.Ior.Left(com.paypal.oslo.feature.balance.domain.error.AutoReloadError.Network.INSTANCE);
                } else if (ior instanceof arrow.core.Ior.Right) {
                    com.paypal.oslo.feature.balance.graphql.GetAutoTransferQuery.Data data = (com.paypal.oslo.feature.balance.graphql.GetAutoTransferQuery.Data) ((com.paypal.oslo.core.network.graphql.GraphQLData) ((arrow.core.Ior.Right) ior).getValue()).getData();
                    if (data == null || (balanceAutoTransfer4 = data.getBalanceAutoTransfer()) == null) {
                        balanceAutoTransfer3 = new com.paypal.oslo.feature.balance.domain.model.autoreload.BalanceAutoTransfer(false, null, 3, null);
                    } else {
                        balanceAutoTransfer3 = new com.paypal.oslo.feature.balance.domain.model.autoreload.BalanceAutoTransfer(balanceAutoTransfer4.isActive(), java.lang.String.valueOf(balanceAutoTransfer4.getCurrencyCode()));
                    }
                    right = new arrow.core.Ior.Right(balanceAutoTransfer3);
                } else if (ior instanceof arrow.core.Ior.Both) {
                    arrow.core.Ior.Both both = (arrow.core.Ior.Both) ior;
                    com.paypal.oslo.feature.balance.graphql.GetAutoTransferQuery.Data data2 = (com.paypal.oslo.feature.balance.graphql.GetAutoTransferQuery.Data) ((com.paypal.oslo.core.network.graphql.GraphQLData) both.getRightValue()).getData();
                    if (data2 == null || (balanceAutoTransfer2 = data2.getBalanceAutoTransfer()) == null) {
                        balanceAutoTransfer = new com.paypal.oslo.feature.balance.domain.model.autoreload.BalanceAutoTransfer(false, null, 3, null);
                    } else {
                        balanceAutoTransfer = new com.paypal.oslo.feature.balance.domain.model.autoreload.BalanceAutoTransfer(balanceAutoTransfer2.isActive(), java.lang.String.valueOf(balanceAutoTransfer2.getCurrencyCode()));
                    }
                    right = new arrow.core.Ior.Right(balanceAutoTransfer);
                } else {
                    throw new kotlin.NoWhenBranchMatchedException();
                }
                com.paypal.oslo.feature.balance.analytics.BalanceApiTrackerKt.trackAutoReloadIorResult("get_auto_transfer_config", "query", right);
                return right;
            }
        }
        autoTransferRepositoryImpl$fetchAutoTransfer$1 = new com.paypal.oslo.feature.balance.data.repository.autoreload.AutoTransferRepositoryImpl$fetchAutoTransfer$1(this, continuation);
        java.lang.Object obj2 = autoTransferRepositoryImpl$fetchAutoTransfer$1.getHighResolutionOutputSizeshNQ4ISI;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = autoTransferRepositoryImpl$fetchAutoTransfer$1.getHighSpeedVideoFpsRangesFor;
        if (i != 0) {
        }
        ior = (arrow.core.Ior) obj2;
        if (!(ior instanceof arrow.core.Ior.Left)) {
        }
        com.paypal.oslo.feature.balance.analytics.BalanceApiTrackerKt.trackAutoReloadIorResult("get_auto_transfer_config", "query", right);
        return right;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:12:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    @Override // com.paypal.oslo.feature.balance.domain.repository.autoreload.AutoTransferRepository
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object disableAutoTransfer(java.lang.String str, kotlin.coroutines.Continuation<? super arrow.core.Ior<? extends com.paypal.oslo.feature.balance.domain.error.AutoReloadError, kotlin.Unit>> continuation) {
        com.paypal.oslo.feature.balance.data.repository.autoreload.AutoTransferRepositoryImpl$disableAutoTransfer$1 autoTransferRepositoryImpl$disableAutoTransfer$1;
        int i;
        arrow.core.Ior ior;
        arrow.core.Ior.Right right;
        if (continuation instanceof com.paypal.oslo.feature.balance.data.repository.autoreload.AutoTransferRepositoryImpl$disableAutoTransfer$1) {
            autoTransferRepositoryImpl$disableAutoTransfer$1 = (com.paypal.oslo.feature.balance.data.repository.autoreload.AutoTransferRepositoryImpl$disableAutoTransfer$1) continuation;
            if ((autoTransferRepositoryImpl$disableAutoTransfer$1.getHighSpeedVideoFpsRanges & Integer.MIN_VALUE) != 0) {
                autoTransferRepositoryImpl$disableAutoTransfer$1.getHighSpeedVideoFpsRanges -= 2147483648;
                java.lang.Object obj = autoTransferRepositoryImpl$disableAutoTransfer$1.getOutputMinFrameDuration;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = autoTransferRepositoryImpl$disableAutoTransfer$1.getHighSpeedVideoFpsRanges;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    com.paypal.oslo.feature.balance.graphql.DisableAutoTransferMutation disableAutoTransferMutation = new com.paypal.oslo.feature.balance.graphql.DisableAutoTransferMutation(new com.paypal.oslo.api.graphql.schema.type.DisableBalanceAutoTransferInput(str));
                    com.apollographql.apollo.ApolloCall apolloCall = (com.apollographql.apollo.ApolloCall) com.apollographql.apollo.cache.normalized.NormalizedCache.fetchPolicy(this.Camera2StreamConfigurationMap.mutation(disableAutoTransferMutation), com.apollographql.apollo.cache.normalized.FetchPolicy.NetworkOnly);
                    com.paypal.oslo.core.network.graphql.CallConfig callConfig = new com.paypal.oslo.core.network.graphql.CallConfig(new com.paypal.oslo.core.network.graphql.AuthType.User(new com.paypal.oslo.core.identity.domain.model.AuthenticationContext(com.paypal.oslo.core.identity.domain.model.AuthenticationState.LOGGED_IN, new com.paypal.oslo.core.identity.domain.model.AuthenticationFlowInfo("balance_auto_transfer_disable", (java.util.Map) null, 2, (kotlin.jvm.internal.DefaultConstructorMarker) null))), null, 2, 0 == true ? 1 : 0);
                    autoTransferRepositoryImpl$disableAutoTransfer$1.getHighSpeedVideoSizes = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(str);
                    autoTransferRepositoryImpl$disableAutoTransfer$1.getHighSpeedVideoFpsRangesFor = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(disableAutoTransferMutation);
                    autoTransferRepositoryImpl$disableAutoTransfer$1.getHighResolutionOutputSizeshNQ4ISI = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(apolloCall);
                    autoTransferRepositoryImpl$disableAutoTransfer$1.Camera2StreamConfigurationMap = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(callConfig);
                    autoTransferRepositoryImpl$disableAutoTransfer$1.getHighSpeedVideoFpsRanges = 1;
                    obj = com.paypal.oslo.core.network.graphql.ApolloClientExtensionKt.execute(apolloCall, callConfig, autoTransferRepositoryImpl$disableAutoTransfer$1);
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
                    com.paypal.android.logger.Logger.w$default(com.paypal.oslo.feature.balance.LoggerKt.log, "Disable auto transfer failed", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("errorType", kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(((com.paypal.oslo.core.network.graphql.error.CallError) ((arrow.core.Ior.Left) ior).getValue()).getClass()).getSimpleName())), null, 4, null);
                    right = new arrow.core.Ior.Left(com.paypal.oslo.feature.balance.domain.error.AutoReloadError.Network.INSTANCE);
                } else if (ior instanceof arrow.core.Ior.Right) {
                    right = new arrow.core.Ior.Right(kotlin.Unit.INSTANCE);
                } else if (ior instanceof arrow.core.Ior.Both) {
                    arrow.core.Ior.Both both = (arrow.core.Ior.Both) ior;
                    java.lang.Object leftValue = both.getLeftValue();
                    right = new arrow.core.Ior.Right(kotlin.Unit.INSTANCE);
                } else {
                    throw new kotlin.NoWhenBranchMatchedException();
                }
                com.paypal.oslo.feature.balance.analytics.BalanceApiTrackerKt.trackAutoReloadIorResult("disable_auto_transfer", "mutation", right);
                return right;
            }
        }
        autoTransferRepositoryImpl$disableAutoTransfer$1 = new com.paypal.oslo.feature.balance.data.repository.autoreload.AutoTransferRepositoryImpl$disableAutoTransfer$1(this, continuation);
        java.lang.Object obj2 = autoTransferRepositoryImpl$disableAutoTransfer$1.getOutputMinFrameDuration;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = autoTransferRepositoryImpl$disableAutoTransfer$1.getHighSpeedVideoFpsRanges;
        if (i != 0) {
        }
        ior = (arrow.core.Ior) obj2;
        if (!(ior instanceof arrow.core.Ior.Left)) {
        }
        com.paypal.oslo.feature.balance.analytics.BalanceApiTrackerKt.trackAutoReloadIorResult("disable_auto_transfer", "mutation", right);
        return right;
    }
}
