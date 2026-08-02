package com.paypal.oslo.feature.balance.data.repository.autoreload;

@kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0000\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J$\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0086@¢\u0006\u0004\b\u000b\u0010\fJ\r\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000e\u0010\u000fJ+\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\b2\u000e\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u0010H\u0000¢\u0006\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0017\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0018\u0010\u0018\u001a\u0004\u0018\u00010\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019"}, d2 = {"Lcom/paypal/oslo/feature/balance/data/repository/autoreload/FetchAutoReloadConfigCall;", "", "Lcom/apollographql/apollo/ApolloClient;", "apolloClient", "<init>", "(Lcom/apollographql/apollo/ApolloClient;)V", "", "force", "Larrow/core/Ior;", "Lcom/paypal/oslo/feature/balance/domain/error/AutoReloadError;", "Lcom/paypal/oslo/feature/balance/domain/model/autoreload/AutoReloadConfig;", "execute", "(ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "invalidateCache", "()V", "Lcom/paypal/oslo/core/network/graphql/GraphQLData;", "Lcom/paypal/oslo/feature/balance/graphql/GetBalanceAutoReloadConfigQuery$Data;", "graphQLData", "parseAutoReloadConfig$balance_prodRelease", "(Lcom/paypal/oslo/core/network/graphql/GraphQLData;)Larrow/core/Ior;", "getHighSpeedVideoFpsRangesFor", "Lcom/apollographql/apollo/ApolloClient;", "getHighResolutionOutputSizeshNQ4ISI", "getHighSpeedVideoFpsRanges", "Lcom/paypal/oslo/feature/balance/domain/model/autoreload/AutoReloadConfig;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class FetchAutoReloadConfigCall {
    public static final int $stable = 8;
    private com.paypal.oslo.feature.balance.domain.model.autoreload.AutoReloadConfig getHighSpeedVideoFpsRanges;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private final com.apollographql.apollo.ApolloClient getHighResolutionOutputSizeshNQ4ISI;

    @javax.inject.Inject
    public FetchAutoReloadConfigCall(com.apollographql.apollo.ApolloClient apolloClient) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(apolloClient, "");
        this.getHighResolutionOutputSizeshNQ4ISI = apolloClient;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object execute(boolean z, kotlin.coroutines.Continuation<? super arrow.core.Ior<? extends com.paypal.oslo.feature.balance.domain.error.AutoReloadError, com.paypal.oslo.feature.balance.domain.model.autoreload.AutoReloadConfig>> continuation) {
        com.paypal.oslo.feature.balance.data.repository.autoreload.FetchAutoReloadConfigCall$execute$1 fetchAutoReloadConfigCall$execute$1;
        int i;
        com.paypal.oslo.feature.balance.data.repository.autoreload.FetchAutoReloadConfigCall fetchAutoReloadConfigCall;
        arrow.core.Ior rightIor;
        arrow.core.Ior ior;
        if (continuation instanceof com.paypal.oslo.feature.balance.data.repository.autoreload.FetchAutoReloadConfigCall$execute$1) {
            fetchAutoReloadConfigCall$execute$1 = (com.paypal.oslo.feature.balance.data.repository.autoreload.FetchAutoReloadConfigCall$execute$1) continuation;
            if ((fetchAutoReloadConfigCall$execute$1.getInputSizeshNQ4ISI & Integer.MIN_VALUE) != 0) {
                fetchAutoReloadConfigCall$execute$1.getInputSizeshNQ4ISI -= 2147483648;
                java.lang.Object obj = fetchAutoReloadConfigCall$execute$1.getOutputMinFrameDuration;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = fetchAutoReloadConfigCall$execute$1.getInputSizeshNQ4ISI;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    com.paypal.oslo.feature.balance.domain.model.autoreload.AutoReloadConfig autoReloadConfig = this.getHighSpeedVideoFpsRanges;
                    if (z) {
                        autoReloadConfig = null;
                    }
                    if (autoReloadConfig != null && (rightIor = arrow.core.IorKt.rightIor(autoReloadConfig)) != null) {
                        return rightIor;
                    }
                    com.paypal.oslo.feature.balance.graphql.GetBalanceAutoReloadConfigQuery getBalanceAutoReloadConfigQuery = new com.paypal.oslo.feature.balance.graphql.GetBalanceAutoReloadConfigQuery();
                    com.apollographql.apollo.ApolloCall apolloCall = (com.apollographql.apollo.ApolloCall) com.apollographql.apollo.cache.normalized.NormalizedCache.fetchPolicy(this.getHighResolutionOutputSizeshNQ4ISI.query(getBalanceAutoReloadConfigQuery), com.apollographql.apollo.cache.normalized.FetchPolicy.NetworkFirst);
                    fetchAutoReloadConfigCall$execute$1.getHighSpeedVideoFpsRangesFor = this;
                    fetchAutoReloadConfigCall$execute$1.Camera2StreamConfigurationMap = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(getBalanceAutoReloadConfigQuery);
                    fetchAutoReloadConfigCall$execute$1.getHighSpeedVideoSizes = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(apolloCall);
                    fetchAutoReloadConfigCall$execute$1.getHighResolutionOutputSizeshNQ4ISI = z;
                    fetchAutoReloadConfigCall$execute$1.getHighSpeedVideoFpsRanges = 0;
                    fetchAutoReloadConfigCall$execute$1.getInputSizeshNQ4ISI = 1;
                    obj = com.paypal.oslo.core.network.graphql.ApolloClientExtensionKt.execute$default(apolloCall, null, fetchAutoReloadConfigCall$execute$1, 2, null);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    fetchAutoReloadConfigCall = this;
                } else {
                    if (i != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    int i2 = fetchAutoReloadConfigCall$execute$1.getHighSpeedVideoFpsRanges;
                    boolean z2 = fetchAutoReloadConfigCall$execute$1.getHighResolutionOutputSizeshNQ4ISI;
                    fetchAutoReloadConfigCall = (com.paypal.oslo.feature.balance.data.repository.autoreload.FetchAutoReloadConfigCall) fetchAutoReloadConfigCall$execute$1.getHighSpeedVideoFpsRangesFor;
                    kotlin.ResultKt.throwOnFailure(obj);
                }
                ior = (arrow.core.Ior) obj;
                if (!(ior instanceof arrow.core.Ior.Left)) {
                    com.paypal.android.logger.Logger.w$default(com.paypal.oslo.feature.balance.LoggerKt.log, "Fetch auto reload config failed", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("errorType", kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(((com.paypal.oslo.core.network.graphql.error.CallError) ((arrow.core.Ior.Left) ior).getValue()).getClass()).getSimpleName())), null, 4, null);
                    return new arrow.core.Ior.Left(com.paypal.oslo.feature.balance.domain.error.AutoReloadError.Network.INSTANCE);
                }
                if (ior instanceof arrow.core.Ior.Right) {
                    return fetchAutoReloadConfigCall.parseAutoReloadConfig$balance_prodRelease((com.paypal.oslo.core.network.graphql.GraphQLData) ((arrow.core.Ior.Right) ior).getValue());
                }
                if (ior instanceof arrow.core.Ior.Both) {
                    arrow.core.Ior.Both both = (arrow.core.Ior.Both) ior;
                    arrow.core.Ior<com.paypal.oslo.feature.balance.domain.error.AutoReloadError, com.paypal.oslo.feature.balance.domain.model.autoreload.AutoReloadConfig> parseAutoReloadConfig$balance_prodRelease = fetchAutoReloadConfigCall.parseAutoReloadConfig$balance_prodRelease((com.paypal.oslo.core.network.graphql.GraphQLData) both.getRightValue());
                    if (parseAutoReloadConfig$balance_prodRelease instanceof arrow.core.Ior.Left) {
                        return new arrow.core.Ior.Left(com.paypal.oslo.feature.balance.domain.error.AutoReloadError.Network.INSTANCE);
                    }
                    if (parseAutoReloadConfig$balance_prodRelease instanceof arrow.core.Ior.Right) {
                        return parseAutoReloadConfig$balance_prodRelease;
                    }
                    if (!(parseAutoReloadConfig$balance_prodRelease instanceof arrow.core.Ior.Both)) {
                        throw new kotlin.NoWhenBranchMatchedException();
                    }
                    arrow.core.Ior.Both both2 = (arrow.core.Ior.Both) parseAutoReloadConfig$balance_prodRelease;
                    return new arrow.core.Ior.Both(com.paypal.oslo.feature.balance.domain.error.AutoReloadError.Network.INSTANCE, both2.getRightValue());
                }
                throw new kotlin.NoWhenBranchMatchedException();
            }
        }
        fetchAutoReloadConfigCall$execute$1 = new com.paypal.oslo.feature.balance.data.repository.autoreload.FetchAutoReloadConfigCall$execute$1(this, continuation);
        java.lang.Object obj2 = fetchAutoReloadConfigCall$execute$1.getOutputMinFrameDuration;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = fetchAutoReloadConfigCall$execute$1.getInputSizeshNQ4ISI;
        if (i != 0) {
        }
        ior = (arrow.core.Ior) obj2;
        if (!(ior instanceof arrow.core.Ior.Left)) {
        }
    }

    public final void invalidateCache() {
        this.getHighSpeedVideoFpsRanges = null;
    }

    public final arrow.core.Ior<com.paypal.oslo.feature.balance.domain.error.AutoReloadError, com.paypal.oslo.feature.balance.domain.model.autoreload.AutoReloadConfig> parseAutoReloadConfig$balance_prodRelease(com.paypal.oslo.core.network.graphql.GraphQLData<com.paypal.oslo.feature.balance.graphql.GetBalanceAutoReloadConfigQuery.Data> graphQLData) {
        com.paypal.oslo.feature.balance.domain.model.autoreload.AutoReloadConfig autoReloadConfig;
        com.paypal.oslo.feature.balance.graphql.GetBalanceAutoReloadConfigQuery.Data data;
        if (graphQLData != null && (data = graphQLData.getData()) != null) {
            autoReloadConfig = new com.paypal.oslo.feature.balance.domain.model.autoreload.AutoReloadConfig(com.paypal.oslo.feature.balance.data.repository.autoreload.AutoReloadMappersKt.parseThresholdConfig(data.getThresholdConfig()), com.paypal.oslo.feature.balance.data.repository.autoreload.AutoReloadMappersKt.parseFrequencyConfig(data.getFrequencyConfig()));
        } else {
            com.paypal.android.logger.Logger.w$default(com.paypal.oslo.feature.balance.LoggerKt.log, "GraphQL auto reload config returned null", kotlin.collections.MapsKt.emptyMap(), null, 4, null);
            autoReloadConfig = new com.paypal.oslo.feature.balance.domain.model.autoreload.AutoReloadConfig(new com.paypal.oslo.feature.balance.domain.model.autoreload.LowBalanceConfig(false, null, null, null, null, 30, null), new com.paypal.oslo.feature.balance.domain.model.autoreload.ScheduledConfig(false, null, null, null, null, null, 62, null));
        }
        this.getHighSpeedVideoFpsRanges = autoReloadConfig;
        return arrow.core.IorKt.rightIor(autoReloadConfig);
    }
}
