package com.paypal.oslo.feature.balance.ui.balanceDashboard;

@kotlin.Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\b\n\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001J#\u0010\u0007\u001a\u00020\u00062\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u0012\u0010\n\u001a\u0004\u0018\u00010\tH\u0082@¢\u0006\u0004\b\n\u0010\u000bJZ\u0010\u0017\u001a\u00020\u00062\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e0\f2\b\u0010\u0011\u001a\u0004\u0018\u00010\u00102\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\u00122\b\u0010\u0015\u001a\u0004\u0018\u00010\t2\u0012\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0004H\u0082@¢\u0006\u0004\b\u0017\u0010\u0018JN\u0010\n\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0011\u001a\u0004\u0018\u00010\u00102\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\u00122\b\u0010\u0015\u001a\u0004\u0018\u00010\t2\u0012\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0004H\u0082@¢\u0006\u0004\b\n\u0010\u0019JN\u0010\u0017\u001a\u00020\u00062\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00042\u0006\u0010\u0011\u001a\u00020\u000e2\b\u0010\u0014\u001a\u0004\u0018\u00010\u00102\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00130\u00122\b\u0010\u0016\u001a\u0004\u0018\u00010\tH\u0082@¢\u0006\u0004\b\u0017\u0010\u001a"}, d2 = {"Lcom/paypal/oslo/feature/balance/ui/balanceDashboard/BalanceDashboardViewModel$sideEffectsMiddleware$1;", "Lcom/paypal/oslo/core/mvi/MviStateStore$Middleware;", "Lcom/paypal/oslo/feature/balance/ui/balanceDashboard/BalanceDashboardState;", "Lcom/paypal/oslo/feature/balance/ui/balanceDashboard/BalanceDashboardIntent;", "Lcom/paypal/oslo/core/mvi/MviStateStore$Middleware$Input;", "input", "", "invoke", "(Lcom/paypal/oslo/core/mvi/MviStateStore$Middleware$Input;)V", "", "getHighSpeedVideoFpsRanges", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Larrow/core/Ior;", "Lcom/paypal/oslo/core/network/graphql/error/CallError;", "Lcom/paypal/oslo/feature/balance/domain/model/Balance;", "p0", "Lcom/paypal/oslo/feature/balance/domain/model/AutoReloadInfo;", "p1", "", "Lcom/paypal/oslo/feature/balance/domain/model/nba/NbaRecommendation;", "p2", "p3", "p4", "getHighSpeedVideoSizes", "(Larrow/core/Ior;Lcom/paypal/oslo/feature/balance/domain/model/AutoReloadInfo;Ljava/util/List;Ljava/lang/Boolean;Lcom/paypal/oslo/core/mvi/MviStateStore$Middleware$Input;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "(Lcom/paypal/oslo/feature/balance/domain/model/Balance;Lcom/paypal/oslo/feature/balance/domain/model/AutoReloadInfo;Ljava/util/List;Ljava/lang/Boolean;Lcom/paypal/oslo/core/mvi/MviStateStore$Middleware$Input;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "(Lcom/paypal/oslo/core/mvi/MviStateStore$Middleware$Input;Lcom/paypal/oslo/feature/balance/domain/model/Balance;Lcom/paypal/oslo/feature/balance/domain/model/AutoReloadInfo;Ljava/util/List;Ljava/lang/Boolean;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class BalanceDashboardViewModel$sideEffectsMiddleware$1 implements com.paypal.oslo.core.mvi.MviStateStore.Middleware<com.paypal.oslo.feature.balance.ui.balanceDashboard.BalanceDashboardState, com.paypal.oslo.feature.balance.ui.balanceDashboard.BalanceDashboardIntent> {
    final /* synthetic */ com.paypal.oslo.feature.balance.ui.balanceDashboard.BalanceDashboardViewModel getHighSpeedVideoFpsRanges;

    BalanceDashboardViewModel$sideEffectsMiddleware$1(com.paypal.oslo.feature.balance.ui.balanceDashboard.BalanceDashboardViewModel balanceDashboardViewModel) {
        this.getHighSpeedVideoFpsRanges = balanceDashboardViewModel;
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x034e, code lost:
    
        if (r26.getHighSpeedVideoSizes((arrow.core.Ior<? extends com.paypal.oslo.core.network.graphql.error.CallError, com.paypal.oslo.feature.balance.domain.model.Balance>) r1, r4, (java.util.List<com.paypal.oslo.feature.balance.domain.model.nba.NbaRecommendation>) r3, r8, (com.paypal.oslo.core.mvi.MviStateStore.Middleware.Input<com.paypal.oslo.feature.balance.ui.balanceDashboard.BalanceDashboardState, com.paypal.oslo.feature.balance.ui.balanceDashboard.BalanceDashboardIntent>) r13, r6) != r7) goto L77;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:28:0x019d  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0247  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x02b0  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x02b5  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0251  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x01e3  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x018f  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0167  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final /* synthetic */ java.lang.Object access$loadDataAndUpdateBalanceState(com.paypal.oslo.feature.balance.ui.balanceDashboard.BalanceDashboardViewModel$sideEffectsMiddleware$1 balanceDashboardViewModel$sideEffectsMiddleware$1, com.paypal.oslo.core.mvi.MviStateStore.Middleware.Input input, kotlin.coroutines.Continuation continuation) {
        com.paypal.oslo.feature.balance.ui.balanceDashboard.BalanceDashboardViewModel$sideEffectsMiddleware$1$loadDataAndUpdateBalanceState$1 balanceDashboardViewModel$sideEffectsMiddleware$1$loadDataAndUpdateBalanceState$1;
        java.lang.Object coroutine_suspended;
        int i;
        kotlinx.coroutines.Deferred async$default;
        kotlinx.coroutines.Deferred async$default2;
        kotlinx.coroutines.Deferred async$default3;
        kotlinx.coroutines.Deferred deferred;
        com.paypal.oslo.core.mvi.MviStateStore.Middleware.Input input2;
        kotlinx.coroutines.Deferred deferred2;
        kotlinx.coroutines.Deferred deferred3;
        java.lang.Object await;
        arrow.core.Ior ior;
        kotlinx.coroutines.Deferred deferred4;
        java.lang.Object await2;
        kotlinx.coroutines.Deferred deferred5;
        arrow.core.Ior ior2;
        arrow.core.Either either;
        com.paypal.oslo.feature.balance.domain.model.AutoReloadInfo autoReloadInfo;
        com.paypal.oslo.feature.balance.domain.model.AutoReloadInfo copy$default;
        java.util.List emptyList;
        arrow.core.Ior ior3;
        com.paypal.oslo.feature.balance.domain.model.AutoReloadInfo autoReloadInfo2;
        java.util.List list;
        kotlinx.coroutines.Deferred deferred6;
        arrow.core.Either either2;
        java.lang.Boolean boxBoolean;
        arrow.core.Ior ior4;
        java.lang.Boolean bool;
        java.util.List list2;
        if (continuation instanceof com.paypal.oslo.feature.balance.ui.balanceDashboard.BalanceDashboardViewModel$sideEffectsMiddleware$1$loadDataAndUpdateBalanceState$1) {
            balanceDashboardViewModel$sideEffectsMiddleware$1$loadDataAndUpdateBalanceState$1 = (com.paypal.oslo.feature.balance.ui.balanceDashboard.BalanceDashboardViewModel$sideEffectsMiddleware$1$loadDataAndUpdateBalanceState$1) continuation;
            if ((balanceDashboardViewModel$sideEffectsMiddleware$1$loadDataAndUpdateBalanceState$1.getOutputStallDuration & Integer.MIN_VALUE) != 0) {
                balanceDashboardViewModel$sideEffectsMiddleware$1$loadDataAndUpdateBalanceState$1.getOutputStallDuration -= 2147483648;
                com.paypal.oslo.feature.balance.ui.balanceDashboard.BalanceDashboardViewModel$sideEffectsMiddleware$1$loadDataAndUpdateBalanceState$1 balanceDashboardViewModel$sideEffectsMiddleware$1$loadDataAndUpdateBalanceState$12 = balanceDashboardViewModel$sideEffectsMiddleware$1$loadDataAndUpdateBalanceState$1;
                java.lang.Object obj = balanceDashboardViewModel$sideEffectsMiddleware$1$loadDataAndUpdateBalanceState$12.getOutputSizeshNQ4ISI;
                coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = balanceDashboardViewModel$sideEffectsMiddleware$1$loadDataAndUpdateBalanceState$12.getOutputStallDuration;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    async$default = kotlinx.coroutines.BuildersKt__Builders_commonKt.async$default(input.getScope(), null, null, new com.paypal.oslo.feature.balance.ui.balanceDashboard.BalanceDashboardViewModel$sideEffectsMiddleware$1$loadDataAndUpdateBalanceState$autoReloadConfigDeferred$1(balanceDashboardViewModel$sideEffectsMiddleware$1.getHighSpeedVideoFpsRanges, null), 3, null);
                    async$default2 = kotlinx.coroutines.BuildersKt__Builders_commonKt.async$default(input.getScope(), null, null, new com.paypal.oslo.feature.balance.ui.balanceDashboard.BalanceDashboardViewModel$sideEffectsMiddleware$1$loadDataAndUpdateBalanceState$balanceDeferred$1(balanceDashboardViewModel$sideEffectsMiddleware$1.getHighSpeedVideoFpsRanges, null), 3, null);
                    async$default3 = kotlinx.coroutines.BuildersKt__Builders_commonKt.async$default(input.getScope(), null, null, new com.paypal.oslo.feature.balance.ui.balanceDashboard.BalanceDashboardViewModel$sideEffectsMiddleware$1$loadDataAndUpdateBalanceState$nbaRecommendationDeferred$1(balanceDashboardViewModel$sideEffectsMiddleware$1.getHighSpeedVideoFpsRanges, null), 3, null);
                    balanceDashboardViewModel$sideEffectsMiddleware$1$loadDataAndUpdateBalanceState$12.getHighSpeedVideoFpsRangesFor = input;
                    balanceDashboardViewModel$sideEffectsMiddleware$1$loadDataAndUpdateBalanceState$12.getHighSpeedVideoSizes = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(async$default);
                    balanceDashboardViewModel$sideEffectsMiddleware$1$loadDataAndUpdateBalanceState$12.getHighSpeedVideoFpsRanges = async$default2;
                    balanceDashboardViewModel$sideEffectsMiddleware$1$loadDataAndUpdateBalanceState$12.Camera2StreamConfigurationMap = async$default3;
                    balanceDashboardViewModel$sideEffectsMiddleware$1$loadDataAndUpdateBalanceState$12.getOutputStallDuration = 1;
                    java.lang.Object await3 = async$default.await(balanceDashboardViewModel$sideEffectsMiddleware$1$loadDataAndUpdateBalanceState$12);
                    if (await3 != coroutine_suspended) {
                        deferred = async$default;
                        obj = await3;
                        input2 = input;
                        deferred2 = async$default2;
                        deferred3 = async$default3;
                    }
                    return coroutine_suspended;
                }
                if (i == 1) {
                    deferred3 = (kotlinx.coroutines.Deferred) balanceDashboardViewModel$sideEffectsMiddleware$1$loadDataAndUpdateBalanceState$12.Camera2StreamConfigurationMap;
                    deferred2 = (kotlinx.coroutines.Deferred) balanceDashboardViewModel$sideEffectsMiddleware$1$loadDataAndUpdateBalanceState$12.getHighSpeedVideoFpsRanges;
                    deferred = (kotlinx.coroutines.Deferred) balanceDashboardViewModel$sideEffectsMiddleware$1$loadDataAndUpdateBalanceState$12.getHighSpeedVideoSizes;
                    input2 = (com.paypal.oslo.core.mvi.MviStateStore.Middleware.Input) balanceDashboardViewModel$sideEffectsMiddleware$1$loadDataAndUpdateBalanceState$12.getHighSpeedVideoFpsRangesFor;
                    kotlin.ResultKt.throwOnFailure(obj);
                } else {
                    if (i == 2) {
                        ior = (arrow.core.Ior) balanceDashboardViewModel$sideEffectsMiddleware$1$loadDataAndUpdateBalanceState$12.getHighResolutionOutputSizeshNQ4ISI;
                        deferred4 = (kotlinx.coroutines.Deferred) balanceDashboardViewModel$sideEffectsMiddleware$1$loadDataAndUpdateBalanceState$12.Camera2StreamConfigurationMap;
                        deferred2 = (kotlinx.coroutines.Deferred) balanceDashboardViewModel$sideEffectsMiddleware$1$loadDataAndUpdateBalanceState$12.getHighSpeedVideoFpsRanges;
                        deferred = (kotlinx.coroutines.Deferred) balanceDashboardViewModel$sideEffectsMiddleware$1$loadDataAndUpdateBalanceState$12.getHighSpeedVideoSizes;
                        input2 = (com.paypal.oslo.core.mvi.MviStateStore.Middleware.Input) balanceDashboardViewModel$sideEffectsMiddleware$1$loadDataAndUpdateBalanceState$12.getHighSpeedVideoFpsRangesFor;
                        kotlin.ResultKt.throwOnFailure(obj);
                        arrow.core.Ior ior5 = (arrow.core.Ior) obj;
                        balanceDashboardViewModel$sideEffectsMiddleware$1$loadDataAndUpdateBalanceState$12.getHighSpeedVideoFpsRangesFor = input2;
                        balanceDashboardViewModel$sideEffectsMiddleware$1$loadDataAndUpdateBalanceState$12.getHighSpeedVideoSizes = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(deferred);
                        balanceDashboardViewModel$sideEffectsMiddleware$1$loadDataAndUpdateBalanceState$12.getHighSpeedVideoFpsRanges = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(deferred2);
                        balanceDashboardViewModel$sideEffectsMiddleware$1$loadDataAndUpdateBalanceState$12.Camera2StreamConfigurationMap = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(deferred4);
                        balanceDashboardViewModel$sideEffectsMiddleware$1$loadDataAndUpdateBalanceState$12.getHighResolutionOutputSizeshNQ4ISI = ior;
                        balanceDashboardViewModel$sideEffectsMiddleware$1$loadDataAndUpdateBalanceState$12.getHighSpeedVideoSizesFor = ior5;
                        balanceDashboardViewModel$sideEffectsMiddleware$1$loadDataAndUpdateBalanceState$12.getOutputStallDuration = 3;
                        await2 = deferred4.await(balanceDashboardViewModel$sideEffectsMiddleware$1$loadDataAndUpdateBalanceState$12);
                        if (await2 != coroutine_suspended) {
                            deferred5 = deferred4;
                            ior2 = ior5;
                            obj = await2;
                            kotlinx.coroutines.Deferred deferred7 = deferred5;
                            either = (arrow.core.Either) obj;
                            if (ior instanceof arrow.core.Ior.Left) {
                            }
                            if (!(either instanceof arrow.core.Either.Right)) {
                            }
                            if (!balanceDashboardViewModel$sideEffectsMiddleware$1.getHighSpeedVideoFpsRanges.getIsConsumerAccount()) {
                            }
                            autoReloadInfo2 = copy$default;
                            deferred6 = deferred7;
                            either2 = either;
                            ior4 = ior2;
                            bool = boxBoolean;
                            list2 = emptyList;
                            balanceDashboardViewModel$sideEffectsMiddleware$1$loadDataAndUpdateBalanceState$12.getHighSpeedVideoFpsRangesFor = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(input2);
                            balanceDashboardViewModel$sideEffectsMiddleware$1$loadDataAndUpdateBalanceState$12.getHighSpeedVideoSizes = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(deferred);
                            balanceDashboardViewModel$sideEffectsMiddleware$1$loadDataAndUpdateBalanceState$12.getHighSpeedVideoFpsRanges = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(deferred2);
                            balanceDashboardViewModel$sideEffectsMiddleware$1$loadDataAndUpdateBalanceState$12.Camera2StreamConfigurationMap = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(deferred6);
                            balanceDashboardViewModel$sideEffectsMiddleware$1$loadDataAndUpdateBalanceState$12.getHighResolutionOutputSizeshNQ4ISI = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(ior);
                            balanceDashboardViewModel$sideEffectsMiddleware$1$loadDataAndUpdateBalanceState$12.getHighSpeedVideoSizesFor = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(ior4);
                            balanceDashboardViewModel$sideEffectsMiddleware$1$loadDataAndUpdateBalanceState$12.getOutputMinFrameDuration = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(either2);
                            balanceDashboardViewModel$sideEffectsMiddleware$1$loadDataAndUpdateBalanceState$12.getInputFormats = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(autoReloadInfo2);
                            balanceDashboardViewModel$sideEffectsMiddleware$1$loadDataAndUpdateBalanceState$12.getInputSizeshNQ4ISI = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(list2);
                            balanceDashboardViewModel$sideEffectsMiddleware$1$loadDataAndUpdateBalanceState$12.getOutputFormats = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(bool);
                            balanceDashboardViewModel$sideEffectsMiddleware$1$loadDataAndUpdateBalanceState$12.getOutputStallDuration = 5;
                        }
                        return coroutine_suspended;
                    }
                    if (i == 3) {
                        arrow.core.Ior ior6 = (arrow.core.Ior) balanceDashboardViewModel$sideEffectsMiddleware$1$loadDataAndUpdateBalanceState$12.getHighSpeedVideoSizesFor;
                        arrow.core.Ior ior7 = (arrow.core.Ior) balanceDashboardViewModel$sideEffectsMiddleware$1$loadDataAndUpdateBalanceState$12.getHighResolutionOutputSizeshNQ4ISI;
                        kotlinx.coroutines.Deferred deferred8 = (kotlinx.coroutines.Deferred) balanceDashboardViewModel$sideEffectsMiddleware$1$loadDataAndUpdateBalanceState$12.Camera2StreamConfigurationMap;
                        deferred2 = (kotlinx.coroutines.Deferred) balanceDashboardViewModel$sideEffectsMiddleware$1$loadDataAndUpdateBalanceState$12.getHighSpeedVideoFpsRanges;
                        deferred = (kotlinx.coroutines.Deferred) balanceDashboardViewModel$sideEffectsMiddleware$1$loadDataAndUpdateBalanceState$12.getHighSpeedVideoSizes;
                        input2 = (com.paypal.oslo.core.mvi.MviStateStore.Middleware.Input) balanceDashboardViewModel$sideEffectsMiddleware$1$loadDataAndUpdateBalanceState$12.getHighSpeedVideoFpsRangesFor;
                        kotlin.ResultKt.throwOnFailure(obj);
                        deferred5 = deferred8;
                        ior2 = ior6;
                        ior = ior7;
                        kotlinx.coroutines.Deferred deferred72 = deferred5;
                        either = (arrow.core.Either) obj;
                        if (ior instanceof arrow.core.Ior.Left) {
                            if (ior instanceof arrow.core.Ior.Right) {
                                autoReloadInfo = com.paypal.oslo.feature.balance.domain.model.autoreload.AutoReloadConfigMapperKt.toAutoReloadInfo((com.paypal.oslo.feature.balance.domain.model.autoreload.AutoReloadConfig) ((arrow.core.Ior.Right) ior).getValue());
                                if (!balanceDashboardViewModel$sideEffectsMiddleware$1.getHighSpeedVideoFpsRanges.isAutoReloadEnabled()) {
                                    copy$default = com.paypal.oslo.feature.balance.domain.model.AutoReloadInfo.copy$default(autoReloadInfo, false, false, null, null, null, 29, null);
                                }
                                copy$default = autoReloadInfo;
                            } else {
                                if (!(ior instanceof arrow.core.Ior.Both)) {
                                    throw new kotlin.NoWhenBranchMatchedException();
                                }
                                arrow.core.Ior.Both both = (arrow.core.Ior.Both) ior;
                                autoReloadInfo = com.paypal.oslo.feature.balance.domain.model.autoreload.AutoReloadConfigMapperKt.toAutoReloadInfo((com.paypal.oslo.feature.balance.domain.model.autoreload.AutoReloadConfig) both.getRightValue());
                                if (!balanceDashboardViewModel$sideEffectsMiddleware$1.getHighSpeedVideoFpsRanges.isAutoReloadEnabled()) {
                                    copy$default = com.paypal.oslo.feature.balance.domain.model.AutoReloadInfo.copy$default(autoReloadInfo, false, false, null, null, null, 29, null);
                                }
                                copy$default = autoReloadInfo;
                            }
                            return kotlin.Unit.INSTANCE;
                        }
                        com.paypal.android.logger.Logger.w$default(com.paypal.oslo.feature.balance.LoggerKt.log, "Failed to load auto reload config", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("errorType", kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(((com.paypal.oslo.feature.balance.domain.error.AutoReloadError) ((arrow.core.Ior.Left) ior).getValue()).getClass()).getSimpleName())), null, 4, null);
                        input2.getEventDispatcher().invoke(new com.paypal.oslo.feature.balance.ui.balanceDashboard.BalanceDashboardIntent.Error("Failed to load auto reload config", null, null, null, false, 30, null));
                        copy$default = null;
                        if (!(either instanceof arrow.core.Either.Right)) {
                            emptyList = (java.util.List) ((arrow.core.Either.Right) either).getValue();
                        } else {
                            if (!(either instanceof arrow.core.Either.Left)) {
                                throw new kotlin.NoWhenBranchMatchedException();
                            }
                            com.paypal.oslo.feature.balance.api.errors.NbaError nbaError = (com.paypal.oslo.feature.balance.api.errors.NbaError) ((arrow.core.Either.Left) either).getValue();
                            if (nbaError instanceof com.paypal.oslo.feature.balance.api.errors.NbaError.NoRecommendations) {
                                com.paypal.android.logger.Logger.d$default(com.paypal.oslo.feature.balance.LoggerKt.log, "No NBA recommendations available for this context", null, null, 6, null);
                            } else {
                                if (!(nbaError instanceof com.paypal.oslo.feature.balance.api.errors.NbaError.Network) && !(nbaError instanceof com.paypal.oslo.feature.balance.api.errors.NbaError.Unknown)) {
                                    throw new kotlin.NoWhenBranchMatchedException();
                                }
                                com.paypal.android.logger.Logger.w$default(com.paypal.oslo.feature.balance.LoggerKt.log, "Failed to load NBA recommendations", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("errorType", kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(nbaError.getClass()).getSimpleName())), null, 4, null);
                            }
                            emptyList = kotlin.collections.CollectionsKt.emptyList();
                        }
                        if (!balanceDashboardViewModel$sideEffectsMiddleware$1.getHighSpeedVideoFpsRanges.getIsConsumerAccount()) {
                            boxBoolean = kotlin.coroutines.jvm.internal.Boxing.boxBoolean(true);
                        } else {
                            if (!balanceDashboardViewModel$sideEffectsMiddleware$1.getHighSpeedVideoFpsRanges.isAccountRoutingProvisioned()) {
                                balanceDashboardViewModel$sideEffectsMiddleware$1$loadDataAndUpdateBalanceState$12.getHighSpeedVideoFpsRangesFor = input2;
                                balanceDashboardViewModel$sideEffectsMiddleware$1$loadDataAndUpdateBalanceState$12.getHighSpeedVideoSizes = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(deferred);
                                balanceDashboardViewModel$sideEffectsMiddleware$1$loadDataAndUpdateBalanceState$12.getHighSpeedVideoFpsRanges = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(deferred2);
                                balanceDashboardViewModel$sideEffectsMiddleware$1$loadDataAndUpdateBalanceState$12.Camera2StreamConfigurationMap = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(deferred72);
                                balanceDashboardViewModel$sideEffectsMiddleware$1$loadDataAndUpdateBalanceState$12.getHighResolutionOutputSizeshNQ4ISI = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(ior);
                                balanceDashboardViewModel$sideEffectsMiddleware$1$loadDataAndUpdateBalanceState$12.getHighSpeedVideoSizesFor = ior2;
                                balanceDashboardViewModel$sideEffectsMiddleware$1$loadDataAndUpdateBalanceState$12.getOutputMinFrameDuration = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(either);
                                balanceDashboardViewModel$sideEffectsMiddleware$1$loadDataAndUpdateBalanceState$12.getInputFormats = copy$default;
                                balanceDashboardViewModel$sideEffectsMiddleware$1$loadDataAndUpdateBalanceState$12.getInputSizeshNQ4ISI = emptyList;
                                balanceDashboardViewModel$sideEffectsMiddleware$1$loadDataAndUpdateBalanceState$12.getOutputStallDuration = 4;
                                java.lang.Object highSpeedVideoFpsRanges = balanceDashboardViewModel$sideEffectsMiddleware$1.getHighSpeedVideoFpsRanges(balanceDashboardViewModel$sideEffectsMiddleware$1$loadDataAndUpdateBalanceState$12);
                                if (highSpeedVideoFpsRanges != coroutine_suspended) {
                                    ior3 = ior;
                                    autoReloadInfo2 = copy$default;
                                    list = emptyList;
                                    deferred6 = deferred72;
                                    either2 = either;
                                    obj = highSpeedVideoFpsRanges;
                                    list2 = list;
                                    ior = ior3;
                                    arrow.core.Ior ior8 = ior2;
                                    bool = (java.lang.Boolean) obj;
                                    ior4 = ior8;
                                    balanceDashboardViewModel$sideEffectsMiddleware$1$loadDataAndUpdateBalanceState$12.getHighSpeedVideoFpsRangesFor = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(input2);
                                    balanceDashboardViewModel$sideEffectsMiddleware$1$loadDataAndUpdateBalanceState$12.getHighSpeedVideoSizes = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(deferred);
                                    balanceDashboardViewModel$sideEffectsMiddleware$1$loadDataAndUpdateBalanceState$12.getHighSpeedVideoFpsRanges = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(deferred2);
                                    balanceDashboardViewModel$sideEffectsMiddleware$1$loadDataAndUpdateBalanceState$12.Camera2StreamConfigurationMap = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(deferred6);
                                    balanceDashboardViewModel$sideEffectsMiddleware$1$loadDataAndUpdateBalanceState$12.getHighResolutionOutputSizeshNQ4ISI = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(ior);
                                    balanceDashboardViewModel$sideEffectsMiddleware$1$loadDataAndUpdateBalanceState$12.getHighSpeedVideoSizesFor = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(ior4);
                                    balanceDashboardViewModel$sideEffectsMiddleware$1$loadDataAndUpdateBalanceState$12.getOutputMinFrameDuration = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(either2);
                                    balanceDashboardViewModel$sideEffectsMiddleware$1$loadDataAndUpdateBalanceState$12.getInputFormats = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(autoReloadInfo2);
                                    balanceDashboardViewModel$sideEffectsMiddleware$1$loadDataAndUpdateBalanceState$12.getInputSizeshNQ4ISI = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(list2);
                                    balanceDashboardViewModel$sideEffectsMiddleware$1$loadDataAndUpdateBalanceState$12.getOutputFormats = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(bool);
                                    balanceDashboardViewModel$sideEffectsMiddleware$1$loadDataAndUpdateBalanceState$12.getOutputStallDuration = 5;
                                }
                                return coroutine_suspended;
                            }
                            boxBoolean = kotlin.coroutines.jvm.internal.Boxing.boxBoolean(false);
                        }
                        autoReloadInfo2 = copy$default;
                        deferred6 = deferred72;
                        either2 = either;
                        ior4 = ior2;
                        bool = boxBoolean;
                        list2 = emptyList;
                        balanceDashboardViewModel$sideEffectsMiddleware$1$loadDataAndUpdateBalanceState$12.getHighSpeedVideoFpsRangesFor = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(input2);
                        balanceDashboardViewModel$sideEffectsMiddleware$1$loadDataAndUpdateBalanceState$12.getHighSpeedVideoSizes = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(deferred);
                        balanceDashboardViewModel$sideEffectsMiddleware$1$loadDataAndUpdateBalanceState$12.getHighSpeedVideoFpsRanges = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(deferred2);
                        balanceDashboardViewModel$sideEffectsMiddleware$1$loadDataAndUpdateBalanceState$12.Camera2StreamConfigurationMap = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(deferred6);
                        balanceDashboardViewModel$sideEffectsMiddleware$1$loadDataAndUpdateBalanceState$12.getHighResolutionOutputSizeshNQ4ISI = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(ior);
                        balanceDashboardViewModel$sideEffectsMiddleware$1$loadDataAndUpdateBalanceState$12.getHighSpeedVideoSizesFor = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(ior4);
                        balanceDashboardViewModel$sideEffectsMiddleware$1$loadDataAndUpdateBalanceState$12.getOutputMinFrameDuration = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(either2);
                        balanceDashboardViewModel$sideEffectsMiddleware$1$loadDataAndUpdateBalanceState$12.getInputFormats = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(autoReloadInfo2);
                        balanceDashboardViewModel$sideEffectsMiddleware$1$loadDataAndUpdateBalanceState$12.getInputSizeshNQ4ISI = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(list2);
                        balanceDashboardViewModel$sideEffectsMiddleware$1$loadDataAndUpdateBalanceState$12.getOutputFormats = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(bool);
                        balanceDashboardViewModel$sideEffectsMiddleware$1$loadDataAndUpdateBalanceState$12.getOutputStallDuration = 5;
                    } else {
                        if (i != 4) {
                            if (i != 5) {
                                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            kotlin.ResultKt.throwOnFailure(obj);
                            return kotlin.Unit.INSTANCE;
                        }
                        list = (java.util.List) balanceDashboardViewModel$sideEffectsMiddleware$1$loadDataAndUpdateBalanceState$12.getInputSizeshNQ4ISI;
                        autoReloadInfo2 = (com.paypal.oslo.feature.balance.domain.model.AutoReloadInfo) balanceDashboardViewModel$sideEffectsMiddleware$1$loadDataAndUpdateBalanceState$12.getInputFormats;
                        either2 = (arrow.core.Either) balanceDashboardViewModel$sideEffectsMiddleware$1$loadDataAndUpdateBalanceState$12.getOutputMinFrameDuration;
                        ior2 = (arrow.core.Ior) balanceDashboardViewModel$sideEffectsMiddleware$1$loadDataAndUpdateBalanceState$12.getHighSpeedVideoSizesFor;
                        ior3 = (arrow.core.Ior) balanceDashboardViewModel$sideEffectsMiddleware$1$loadDataAndUpdateBalanceState$12.getHighResolutionOutputSizeshNQ4ISI;
                        deferred6 = (kotlinx.coroutines.Deferred) balanceDashboardViewModel$sideEffectsMiddleware$1$loadDataAndUpdateBalanceState$12.Camera2StreamConfigurationMap;
                        deferred2 = (kotlinx.coroutines.Deferred) balanceDashboardViewModel$sideEffectsMiddleware$1$loadDataAndUpdateBalanceState$12.getHighSpeedVideoFpsRanges;
                        deferred = (kotlinx.coroutines.Deferred) balanceDashboardViewModel$sideEffectsMiddleware$1$loadDataAndUpdateBalanceState$12.getHighSpeedVideoSizes;
                        input2 = (com.paypal.oslo.core.mvi.MviStateStore.Middleware.Input) balanceDashboardViewModel$sideEffectsMiddleware$1$loadDataAndUpdateBalanceState$12.getHighSpeedVideoFpsRangesFor;
                        kotlin.ResultKt.throwOnFailure(obj);
                        list2 = list;
                        ior = ior3;
                        arrow.core.Ior ior82 = ior2;
                        bool = (java.lang.Boolean) obj;
                        ior4 = ior82;
                        balanceDashboardViewModel$sideEffectsMiddleware$1$loadDataAndUpdateBalanceState$12.getHighSpeedVideoFpsRangesFor = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(input2);
                        balanceDashboardViewModel$sideEffectsMiddleware$1$loadDataAndUpdateBalanceState$12.getHighSpeedVideoSizes = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(deferred);
                        balanceDashboardViewModel$sideEffectsMiddleware$1$loadDataAndUpdateBalanceState$12.getHighSpeedVideoFpsRanges = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(deferred2);
                        balanceDashboardViewModel$sideEffectsMiddleware$1$loadDataAndUpdateBalanceState$12.Camera2StreamConfigurationMap = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(deferred6);
                        balanceDashboardViewModel$sideEffectsMiddleware$1$loadDataAndUpdateBalanceState$12.getHighResolutionOutputSizeshNQ4ISI = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(ior);
                        balanceDashboardViewModel$sideEffectsMiddleware$1$loadDataAndUpdateBalanceState$12.getHighSpeedVideoSizesFor = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(ior4);
                        balanceDashboardViewModel$sideEffectsMiddleware$1$loadDataAndUpdateBalanceState$12.getOutputMinFrameDuration = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(either2);
                        balanceDashboardViewModel$sideEffectsMiddleware$1$loadDataAndUpdateBalanceState$12.getInputFormats = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(autoReloadInfo2);
                        balanceDashboardViewModel$sideEffectsMiddleware$1$loadDataAndUpdateBalanceState$12.getInputSizeshNQ4ISI = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(list2);
                        balanceDashboardViewModel$sideEffectsMiddleware$1$loadDataAndUpdateBalanceState$12.getOutputFormats = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(bool);
                        balanceDashboardViewModel$sideEffectsMiddleware$1$loadDataAndUpdateBalanceState$12.getOutputStallDuration = 5;
                    }
                }
                arrow.core.Ior ior9 = (arrow.core.Ior) obj;
                balanceDashboardViewModel$sideEffectsMiddleware$1$loadDataAndUpdateBalanceState$12.getHighSpeedVideoFpsRangesFor = input2;
                balanceDashboardViewModel$sideEffectsMiddleware$1$loadDataAndUpdateBalanceState$12.getHighSpeedVideoSizes = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(deferred);
                balanceDashboardViewModel$sideEffectsMiddleware$1$loadDataAndUpdateBalanceState$12.getHighSpeedVideoFpsRanges = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(deferred2);
                balanceDashboardViewModel$sideEffectsMiddleware$1$loadDataAndUpdateBalanceState$12.Camera2StreamConfigurationMap = deferred3;
                balanceDashboardViewModel$sideEffectsMiddleware$1$loadDataAndUpdateBalanceState$12.getHighResolutionOutputSizeshNQ4ISI = ior9;
                balanceDashboardViewModel$sideEffectsMiddleware$1$loadDataAndUpdateBalanceState$12.getOutputStallDuration = 2;
                await = deferred2.await(balanceDashboardViewModel$sideEffectsMiddleware$1$loadDataAndUpdateBalanceState$12);
                if (await != coroutine_suspended) {
                    kotlinx.coroutines.Deferred deferred9 = deferred3;
                    ior = ior9;
                    obj = await;
                    deferred4 = deferred9;
                    arrow.core.Ior ior52 = (arrow.core.Ior) obj;
                    balanceDashboardViewModel$sideEffectsMiddleware$1$loadDataAndUpdateBalanceState$12.getHighSpeedVideoFpsRangesFor = input2;
                    balanceDashboardViewModel$sideEffectsMiddleware$1$loadDataAndUpdateBalanceState$12.getHighSpeedVideoSizes = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(deferred);
                    balanceDashboardViewModel$sideEffectsMiddleware$1$loadDataAndUpdateBalanceState$12.getHighSpeedVideoFpsRanges = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(deferred2);
                    balanceDashboardViewModel$sideEffectsMiddleware$1$loadDataAndUpdateBalanceState$12.Camera2StreamConfigurationMap = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(deferred4);
                    balanceDashboardViewModel$sideEffectsMiddleware$1$loadDataAndUpdateBalanceState$12.getHighResolutionOutputSizeshNQ4ISI = ior;
                    balanceDashboardViewModel$sideEffectsMiddleware$1$loadDataAndUpdateBalanceState$12.getHighSpeedVideoSizesFor = ior52;
                    balanceDashboardViewModel$sideEffectsMiddleware$1$loadDataAndUpdateBalanceState$12.getOutputStallDuration = 3;
                    await2 = deferred4.await(balanceDashboardViewModel$sideEffectsMiddleware$1$loadDataAndUpdateBalanceState$12);
                    if (await2 != coroutine_suspended) {
                    }
                }
                return coroutine_suspended;
            }
        }
        balanceDashboardViewModel$sideEffectsMiddleware$1$loadDataAndUpdateBalanceState$1 = new com.paypal.oslo.feature.balance.ui.balanceDashboard.BalanceDashboardViewModel$sideEffectsMiddleware$1$loadDataAndUpdateBalanceState$1(balanceDashboardViewModel$sideEffectsMiddleware$1, continuation);
        com.paypal.oslo.feature.balance.ui.balanceDashboard.BalanceDashboardViewModel$sideEffectsMiddleware$1$loadDataAndUpdateBalanceState$1 balanceDashboardViewModel$sideEffectsMiddleware$1$loadDataAndUpdateBalanceState$122 = balanceDashboardViewModel$sideEffectsMiddleware$1$loadDataAndUpdateBalanceState$1;
        java.lang.Object obj2 = balanceDashboardViewModel$sideEffectsMiddleware$1$loadDataAndUpdateBalanceState$122.getOutputSizeshNQ4ISI;
        coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = balanceDashboardViewModel$sideEffectsMiddleware$1$loadDataAndUpdateBalanceState$122.getOutputStallDuration;
        if (i != 0) {
        }
        arrow.core.Ior ior92 = (arrow.core.Ior) obj2;
        balanceDashboardViewModel$sideEffectsMiddleware$1$loadDataAndUpdateBalanceState$122.getHighSpeedVideoFpsRangesFor = input2;
        balanceDashboardViewModel$sideEffectsMiddleware$1$loadDataAndUpdateBalanceState$122.getHighSpeedVideoSizes = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(deferred);
        balanceDashboardViewModel$sideEffectsMiddleware$1$loadDataAndUpdateBalanceState$122.getHighSpeedVideoFpsRanges = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(deferred2);
        balanceDashboardViewModel$sideEffectsMiddleware$1$loadDataAndUpdateBalanceState$122.Camera2StreamConfigurationMap = deferred3;
        balanceDashboardViewModel$sideEffectsMiddleware$1$loadDataAndUpdateBalanceState$122.getHighResolutionOutputSizeshNQ4ISI = ior92;
        balanceDashboardViewModel$sideEffectsMiddleware$1$loadDataAndUpdateBalanceState$122.getOutputStallDuration = 2;
        await = deferred2.await(balanceDashboardViewModel$sideEffectsMiddleware$1$loadDataAndUpdateBalanceState$122);
        if (await != coroutine_suspended) {
        }
        return coroutine_suspended;
    }

    @Override // com.paypal.oslo.core.mvi.MviStateStore.Middleware
    public final void invoke(com.paypal.oslo.core.mvi.MviStateStore.Middleware.Input<com.paypal.oslo.feature.balance.ui.balanceDashboard.BalanceDashboardState, com.paypal.oslo.feature.balance.ui.balanceDashboard.BalanceDashboardIntent> input) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(input, "");
        com.paypal.oslo.feature.balance.ui.balanceDashboard.BalanceDashboardIntent event = input.getEvent();
        if (kotlin.jvm.internal.Intrinsics.areEqual(event, com.paypal.oslo.feature.balance.ui.balanceDashboard.BalanceDashboardIntent.Initialize.INSTANCE) || kotlin.jvm.internal.Intrinsics.areEqual(event, com.paypal.oslo.feature.balance.ui.balanceDashboard.BalanceDashboardIntent.RefreshScreen.INSTANCE) || kotlin.jvm.internal.Intrinsics.areEqual(event, com.paypal.oslo.feature.balance.ui.balanceDashboard.BalanceDashboardIntent.RetryBalanceLoad.INSTANCE)) {
            kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(input.getScope(), null, null, new com.paypal.oslo.feature.balance.ui.balanceDashboard.BalanceDashboardViewModel$sideEffectsMiddleware$1$invoke$1(this, input, null), 3, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object getHighSpeedVideoFpsRanges(kotlin.coroutines.Continuation<? super java.lang.Boolean> continuation) {
        com.paypal.oslo.feature.balance.ui.balanceDashboard.BalanceDashboardViewModel$sideEffectsMiddleware$1$checkAccountRoutingEligibility$1 balanceDashboardViewModel$sideEffectsMiddleware$1$checkAccountRoutingEligibility$1;
        int i;
        com.paypal.oslo.feature.merchantbanking.api.usecase.CheckAccountRoutingEligibilityUseCase checkAccountRoutingEligibilityUseCase;
        kotlin.jvm.internal.Ref.ObjectRef objectRef;
        if (continuation instanceof com.paypal.oslo.feature.balance.ui.balanceDashboard.BalanceDashboardViewModel$sideEffectsMiddleware$1$checkAccountRoutingEligibility$1) {
            balanceDashboardViewModel$sideEffectsMiddleware$1$checkAccountRoutingEligibility$1 = (com.paypal.oslo.feature.balance.ui.balanceDashboard.BalanceDashboardViewModel$sideEffectsMiddleware$1$checkAccountRoutingEligibility$1) continuation;
            if ((balanceDashboardViewModel$sideEffectsMiddleware$1$checkAccountRoutingEligibility$1.getHighSpeedVideoFpsRangesFor & Integer.MIN_VALUE) != 0) {
                balanceDashboardViewModel$sideEffectsMiddleware$1$checkAccountRoutingEligibility$1.getHighSpeedVideoFpsRangesFor -= 2147483648;
                java.lang.Object obj = balanceDashboardViewModel$sideEffectsMiddleware$1$checkAccountRoutingEligibility$1.getHighSpeedVideoSizes;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = balanceDashboardViewModel$sideEffectsMiddleware$1$checkAccountRoutingEligibility$1.getHighSpeedVideoFpsRangesFor;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    final kotlin.jvm.internal.Ref.ObjectRef objectRef2 = new kotlin.jvm.internal.Ref.ObjectRef();
                    checkAccountRoutingEligibilityUseCase = this.getHighSpeedVideoFpsRanges.getInputSizeshNQ4ISI;
                    kotlinx.coroutines.flow.Flow<arrow.core.Either<com.paypal.oslo.feature.merchantbanking.api.errors.AccountRoutingError, java.lang.Boolean>> invoke = checkAccountRoutingEligibilityUseCase.invoke();
                    kotlinx.coroutines.flow.FlowCollector<? super arrow.core.Either<com.paypal.oslo.feature.merchantbanking.api.errors.AccountRoutingError, java.lang.Boolean>> flowCollector = new kotlinx.coroutines.flow.FlowCollector() { // from class: com.paypal.oslo.feature.balance.ui.balanceDashboard.BalanceDashboardViewModel$sideEffectsMiddleware$1$checkAccountRoutingEligibility$2
                        @Override // kotlinx.coroutines.flow.FlowCollector
                        public final /* synthetic */ java.lang.Object emit(java.lang.Object obj2, kotlin.coroutines.Continuation continuation2) {
                            arrow.core.Either either = (arrow.core.Either) obj2;
                            kotlin.jvm.internal.Ref.ObjectRef<java.lang.Boolean> objectRef3 = objectRef2;
                            if (either instanceof arrow.core.Either.Right) {
                                objectRef3.element = (T) kotlin.coroutines.jvm.internal.Boxing.boxBoolean(((java.lang.Boolean) ((arrow.core.Either.Right) either).getValue()).booleanValue());
                            } else if (either instanceof arrow.core.Either.Left) {
                                com.paypal.android.logger.Logger.w$default(com.paypal.oslo.feature.balance.LoggerKt.log, "Failed to check account routing eligibility", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("errorType", kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(((com.paypal.oslo.feature.merchantbanking.api.errors.AccountRoutingError) ((arrow.core.Either.Left) either).getValue()).getClass()).getSimpleName())), null, 4, null);
                            } else {
                                throw new kotlin.NoWhenBranchMatchedException();
                            }
                            return kotlin.Unit.INSTANCE;
                        }
                    };
                    balanceDashboardViewModel$sideEffectsMiddleware$1$checkAccountRoutingEligibility$1.getHighSpeedVideoFpsRanges = objectRef2;
                    balanceDashboardViewModel$sideEffectsMiddleware$1$checkAccountRoutingEligibility$1.getHighSpeedVideoFpsRangesFor = 1;
                    if (invoke.collect(flowCollector, balanceDashboardViewModel$sideEffectsMiddleware$1$checkAccountRoutingEligibility$1) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    objectRef = objectRef2;
                } else {
                    if (i != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    objectRef = (kotlin.jvm.internal.Ref.ObjectRef) balanceDashboardViewModel$sideEffectsMiddleware$1$checkAccountRoutingEligibility$1.getHighSpeedVideoFpsRanges;
                    kotlin.ResultKt.throwOnFailure(obj);
                }
                return objectRef.element;
            }
        }
        balanceDashboardViewModel$sideEffectsMiddleware$1$checkAccountRoutingEligibility$1 = new com.paypal.oslo.feature.balance.ui.balanceDashboard.BalanceDashboardViewModel$sideEffectsMiddleware$1$checkAccountRoutingEligibility$1(this, continuation);
        java.lang.Object obj2 = balanceDashboardViewModel$sideEffectsMiddleware$1$checkAccountRoutingEligibility$1.getHighSpeedVideoSizes;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = balanceDashboardViewModel$sideEffectsMiddleware$1$checkAccountRoutingEligibility$1.getHighSpeedVideoFpsRangesFor;
        if (i != 0) {
        }
        return objectRef.element;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x00ea, code lost:
    
        if (getHighSpeedVideoSizes(r22, r18, r19, r20, r21, r6) != r8) goto L23;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object getHighSpeedVideoFpsRanges(com.paypal.oslo.feature.balance.domain.model.Balance balance, com.paypal.oslo.feature.balance.domain.model.AutoReloadInfo autoReloadInfo, java.util.List<com.paypal.oslo.feature.balance.domain.model.nba.NbaRecommendation> list, java.lang.Boolean bool, com.paypal.oslo.core.mvi.MviStateStore.Middleware.Input<com.paypal.oslo.feature.balance.ui.balanceDashboard.BalanceDashboardState, com.paypal.oslo.feature.balance.ui.balanceDashboard.BalanceDashboardIntent> input, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        com.paypal.oslo.feature.balance.ui.balanceDashboard.BalanceDashboardViewModel$sideEffectsMiddleware$1$dispatchBalanceOrPrepaidError$1 balanceDashboardViewModel$sideEffectsMiddleware$1$dispatchBalanceOrPrepaidError$1;
        int i;
        kotlin.jvm.functions.Function1<com.paypal.oslo.feature.balance.ui.balanceDashboard.BalanceDashboardIntent, kotlin.Unit> eventDispatcher;
        com.paypal.oslo.feature.balance.domain.model.AutoReloadInfo autoReloadInfo2;
        java.util.List<com.paypal.oslo.feature.balance.domain.model.nba.NbaRecommendation> list2;
        java.lang.Boolean bool2;
        com.paypal.oslo.feature.balance.domain.model.Balance balance2 = balance;
        if (continuation instanceof com.paypal.oslo.feature.balance.ui.balanceDashboard.BalanceDashboardViewModel$sideEffectsMiddleware$1$dispatchBalanceOrPrepaidError$1) {
            balanceDashboardViewModel$sideEffectsMiddleware$1$dispatchBalanceOrPrepaidError$1 = (com.paypal.oslo.feature.balance.ui.balanceDashboard.BalanceDashboardViewModel$sideEffectsMiddleware$1$dispatchBalanceOrPrepaidError$1) continuation;
            if ((balanceDashboardViewModel$sideEffectsMiddleware$1$dispatchBalanceOrPrepaidError$1.getInputFormats & Integer.MIN_VALUE) != 0) {
                balanceDashboardViewModel$sideEffectsMiddleware$1$dispatchBalanceOrPrepaidError$1.getInputFormats -= 2147483648;
                com.paypal.oslo.feature.balance.ui.balanceDashboard.BalanceDashboardViewModel$sideEffectsMiddleware$1$dispatchBalanceOrPrepaidError$1 balanceDashboardViewModel$sideEffectsMiddleware$1$dispatchBalanceOrPrepaidError$12 = balanceDashboardViewModel$sideEffectsMiddleware$1$dispatchBalanceOrPrepaidError$1;
                java.lang.Object obj = balanceDashboardViewModel$sideEffectsMiddleware$1$dispatchBalanceOrPrepaidError$12.getInputSizeshNQ4ISI;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = balanceDashboardViewModel$sideEffectsMiddleware$1$dispatchBalanceOrPrepaidError$12.getInputFormats;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    if (kotlin.jvm.internal.Intrinsics.areEqual(balance.getPrepaidStatus(), kotlin.coroutines.jvm.internal.Boxing.boxBoolean(false))) {
                        com.paypal.android.logger.Logger.d$default(com.paypal.oslo.feature.balance.LoggerKt.log, "Non-prepaid account detected, showing error screen", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("prepaidStatus", kotlin.coroutines.jvm.internal.Boxing.boxBoolean(false))), null, 4, null);
                        input.getEventDispatcher().invoke(new com.paypal.oslo.feature.balance.ui.balanceDashboard.BalanceDashboardIntent.Error("Account is not eligible for balance dashboard", null, null, list, true, 6, null));
                    } else {
                        if (balance.getTaxOnHoldAmount() != null) {
                            balanceDashboardViewModel$sideEffectsMiddleware$1$dispatchBalanceOrPrepaidError$12.getHighSpeedVideoFpsRangesFor = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(balance);
                            balanceDashboardViewModel$sideEffectsMiddleware$1$dispatchBalanceOrPrepaidError$12.getHighSpeedVideoSizes = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(autoReloadInfo);
                            balanceDashboardViewModel$sideEffectsMiddleware$1$dispatchBalanceOrPrepaidError$12.Camera2StreamConfigurationMap = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(list);
                            balanceDashboardViewModel$sideEffectsMiddleware$1$dispatchBalanceOrPrepaidError$12.getHighSpeedVideoFpsRanges = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(bool);
                            balanceDashboardViewModel$sideEffectsMiddleware$1$dispatchBalanceOrPrepaidError$12.getHighResolutionOutputSizeshNQ4ISI = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(input);
                            balanceDashboardViewModel$sideEffectsMiddleware$1$dispatchBalanceOrPrepaidError$12.getInputFormats = 1;
                        } else {
                            eventDispatcher = input.getEventDispatcher();
                            com.paypal.oslo.feature.balance.ui.balanceDashboard.BalanceDashboardViewModel balanceDashboardViewModel = this.getHighSpeedVideoFpsRanges;
                            balanceDashboardViewModel$sideEffectsMiddleware$1$dispatchBalanceOrPrepaidError$12.getHighSpeedVideoFpsRangesFor = balance2;
                            balanceDashboardViewModel$sideEffectsMiddleware$1$dispatchBalanceOrPrepaidError$12.getHighSpeedVideoSizes = autoReloadInfo;
                            balanceDashboardViewModel$sideEffectsMiddleware$1$dispatchBalanceOrPrepaidError$12.Camera2StreamConfigurationMap = list;
                            balanceDashboardViewModel$sideEffectsMiddleware$1$dispatchBalanceOrPrepaidError$12.getHighSpeedVideoFpsRanges = bool;
                            balanceDashboardViewModel$sideEffectsMiddleware$1$dispatchBalanceOrPrepaidError$12.getHighResolutionOutputSizeshNQ4ISI = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(input);
                            balanceDashboardViewModel$sideEffectsMiddleware$1$dispatchBalanceOrPrepaidError$12.getHighSpeedVideoSizesFor = eventDispatcher;
                            balanceDashboardViewModel$sideEffectsMiddleware$1$dispatchBalanceOrPrepaidError$12.getInputFormats = 2;
                            obj = com.paypal.oslo.feature.balance.ui.balanceDashboard.BalanceDashboardViewModel.access$toUiModel(balanceDashboardViewModel, balance2, balanceDashboardViewModel$sideEffectsMiddleware$1$dispatchBalanceOrPrepaidError$12);
                            if (obj != coroutine_suspended) {
                                autoReloadInfo2 = autoReloadInfo;
                                list2 = list;
                                bool2 = bool;
                                eventDispatcher.invoke(new com.paypal.oslo.feature.balance.ui.balanceDashboard.BalanceDashboardIntent.BalanceLoaded((com.paypal.oslo.feature.balance.ui.balanceDashboard.BalanceUiModel) obj, balance2.getCurrencies(), autoReloadInfo2, list2, bool2, null, 32, null));
                            }
                        }
                        return coroutine_suspended;
                    }
                } else {
                    if (i == 1) {
                        kotlin.ResultKt.throwOnFailure(obj);
                        return kotlin.Unit.INSTANCE;
                    }
                    if (i != 2) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    eventDispatcher = (kotlin.jvm.functions.Function1) balanceDashboardViewModel$sideEffectsMiddleware$1$dispatchBalanceOrPrepaidError$12.getHighSpeedVideoSizesFor;
                    java.lang.Boolean bool3 = (java.lang.Boolean) balanceDashboardViewModel$sideEffectsMiddleware$1$dispatchBalanceOrPrepaidError$12.getHighSpeedVideoFpsRanges;
                    java.util.List<com.paypal.oslo.feature.balance.domain.model.nba.NbaRecommendation> list3 = (java.util.List) balanceDashboardViewModel$sideEffectsMiddleware$1$dispatchBalanceOrPrepaidError$12.Camera2StreamConfigurationMap;
                    com.paypal.oslo.feature.balance.domain.model.AutoReloadInfo autoReloadInfo3 = (com.paypal.oslo.feature.balance.domain.model.AutoReloadInfo) balanceDashboardViewModel$sideEffectsMiddleware$1$dispatchBalanceOrPrepaidError$12.getHighSpeedVideoSizes;
                    com.paypal.oslo.feature.balance.domain.model.Balance balance3 = (com.paypal.oslo.feature.balance.domain.model.Balance) balanceDashboardViewModel$sideEffectsMiddleware$1$dispatchBalanceOrPrepaidError$12.getHighSpeedVideoFpsRangesFor;
                    kotlin.ResultKt.throwOnFailure(obj);
                    bool2 = bool3;
                    list2 = list3;
                    autoReloadInfo2 = autoReloadInfo3;
                    balance2 = balance3;
                    eventDispatcher.invoke(new com.paypal.oslo.feature.balance.ui.balanceDashboard.BalanceDashboardIntent.BalanceLoaded((com.paypal.oslo.feature.balance.ui.balanceDashboard.BalanceUiModel) obj, balance2.getCurrencies(), autoReloadInfo2, list2, bool2, null, 32, null));
                }
                return kotlin.Unit.INSTANCE;
            }
        }
        balanceDashboardViewModel$sideEffectsMiddleware$1$dispatchBalanceOrPrepaidError$1 = new com.paypal.oslo.feature.balance.ui.balanceDashboard.BalanceDashboardViewModel$sideEffectsMiddleware$1$dispatchBalanceOrPrepaidError$1(this, continuation);
        com.paypal.oslo.feature.balance.ui.balanceDashboard.BalanceDashboardViewModel$sideEffectsMiddleware$1$dispatchBalanceOrPrepaidError$1 balanceDashboardViewModel$sideEffectsMiddleware$1$dispatchBalanceOrPrepaidError$122 = balanceDashboardViewModel$sideEffectsMiddleware$1$dispatchBalanceOrPrepaidError$1;
        java.lang.Object obj2 = balanceDashboardViewModel$sideEffectsMiddleware$1$dispatchBalanceOrPrepaidError$122.getInputSizeshNQ4ISI;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = balanceDashboardViewModel$sideEffectsMiddleware$1$dispatchBalanceOrPrepaidError$122.getInputFormats;
        if (i != 0) {
        }
        return kotlin.Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0121  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object getHighSpeedVideoSizes(com.paypal.oslo.core.mvi.MviStateStore.Middleware.Input<com.paypal.oslo.feature.balance.ui.balanceDashboard.BalanceDashboardState, com.paypal.oslo.feature.balance.ui.balanceDashboard.BalanceDashboardIntent> input, com.paypal.oslo.feature.balance.domain.model.Balance balance, com.paypal.oslo.feature.balance.domain.model.AutoReloadInfo autoReloadInfo, java.util.List<com.paypal.oslo.feature.balance.domain.model.nba.NbaRecommendation> list, java.lang.Boolean bool, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        com.paypal.oslo.feature.balance.ui.balanceDashboard.BalanceDashboardViewModel$sideEffectsMiddleware$1$getTaxHoldPolicy$1 balanceDashboardViewModel$sideEffectsMiddleware$1$getTaxHoldPolicy$1;
        int i;
        com.paypal.oslo.feature.balance.domain.usecase.onholddetails.GetTaxHoldPolicyUseCase getTaxHoldPolicyUseCase;
        java.lang.Boolean bool2;
        java.util.List<com.paypal.oslo.feature.balance.domain.model.nba.NbaRecommendation> list2;
        com.paypal.oslo.core.mvi.MviStateStore.Middleware.Input<com.paypal.oslo.feature.balance.ui.balanceDashboard.BalanceDashboardState, com.paypal.oslo.feature.balance.ui.balanceDashboard.BalanceDashboardIntent> input2;
        com.paypal.oslo.feature.balance.domain.model.Balance balance2;
        com.paypal.oslo.feature.balance.domain.model.AutoReloadInfo autoReloadInfo2;
        arrow.core.Ior ior;
        com.paypal.oslo.feature.balance.domain.model.TaxHoldPolicy taxHoldPolicy;
        kotlin.jvm.functions.Function1<com.paypal.oslo.feature.balance.ui.balanceDashboard.BalanceDashboardIntent, kotlin.Unit> function1;
        com.paypal.oslo.feature.balance.domain.model.AutoReloadInfo autoReloadInfo3;
        com.paypal.oslo.feature.balance.domain.model.Balance balance3;
        java.lang.Boolean bool3;
        com.paypal.oslo.feature.balance.domain.model.TaxHoldPolicy taxHoldPolicy2;
        kotlin.jvm.functions.Function1<com.paypal.oslo.feature.balance.ui.balanceDashboard.BalanceDashboardIntent, kotlin.Unit> function12;
        com.paypal.oslo.feature.balance.domain.model.AutoReloadInfo autoReloadInfo4;
        com.paypal.oslo.feature.balance.domain.model.Balance balance4;
        java.lang.Boolean bool4;
        if (continuation instanceof com.paypal.oslo.feature.balance.ui.balanceDashboard.BalanceDashboardViewModel$sideEffectsMiddleware$1$getTaxHoldPolicy$1) {
            balanceDashboardViewModel$sideEffectsMiddleware$1$getTaxHoldPolicy$1 = (com.paypal.oslo.feature.balance.ui.balanceDashboard.BalanceDashboardViewModel$sideEffectsMiddleware$1$getTaxHoldPolicy$1) continuation;
            if ((balanceDashboardViewModel$sideEffectsMiddleware$1$getTaxHoldPolicy$1.getOutputStallDuration & Integer.MIN_VALUE) != 0) {
                balanceDashboardViewModel$sideEffectsMiddleware$1$getTaxHoldPolicy$1.getOutputStallDuration -= 2147483648;
                java.lang.Object obj = balanceDashboardViewModel$sideEffectsMiddleware$1$getTaxHoldPolicy$1.getOutputStallDurationlomOqCM;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = balanceDashboardViewModel$sideEffectsMiddleware$1$getTaxHoldPolicy$1.getOutputStallDuration;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    getTaxHoldPolicyUseCase = this.getHighSpeedVideoFpsRanges.getHighSpeedVideoSizesFor;
                    balanceDashboardViewModel$sideEffectsMiddleware$1$getTaxHoldPolicy$1.Camera2StreamConfigurationMap = input;
                    balanceDashboardViewModel$sideEffectsMiddleware$1$getTaxHoldPolicy$1.getHighSpeedVideoSizes = balance;
                    balanceDashboardViewModel$sideEffectsMiddleware$1$getTaxHoldPolicy$1.getHighSpeedVideoFpsRanges = autoReloadInfo;
                    balanceDashboardViewModel$sideEffectsMiddleware$1$getTaxHoldPolicy$1.getInputSizeshNQ4ISI = list;
                    bool2 = bool;
                    balanceDashboardViewModel$sideEffectsMiddleware$1$getTaxHoldPolicy$1.getHighSpeedVideoSizesFor = bool2;
                    balanceDashboardViewModel$sideEffectsMiddleware$1$getTaxHoldPolicy$1.getOutputStallDuration = 1;
                    obj = getTaxHoldPolicyUseCase.invoke(balanceDashboardViewModel$sideEffectsMiddleware$1$getTaxHoldPolicy$1);
                    if (obj != coroutine_suspended) {
                        list2 = list;
                        input2 = input;
                        balance2 = balance;
                        autoReloadInfo2 = autoReloadInfo;
                    }
                    return coroutine_suspended;
                }
                if (i != 1) {
                    if (i == 2) {
                        int i2 = balanceDashboardViewModel$sideEffectsMiddleware$1$getTaxHoldPolicy$1.getHighResolutionOutputSizeshNQ4ISI;
                        int i3 = balanceDashboardViewModel$sideEffectsMiddleware$1$getTaxHoldPolicy$1.getHighSpeedVideoFpsRangesFor;
                        function12 = (kotlin.jvm.functions.Function1) balanceDashboardViewModel$sideEffectsMiddleware$1$getTaxHoldPolicy$1.getOutputMinFrameDuration;
                        com.paypal.oslo.feature.balance.domain.model.TaxHoldPolicy taxHoldPolicy3 = (com.paypal.oslo.feature.balance.domain.model.TaxHoldPolicy) balanceDashboardViewModel$sideEffectsMiddleware$1$getTaxHoldPolicy$1.getInputFormats;
                        java.lang.Boolean bool5 = (java.lang.Boolean) balanceDashboardViewModel$sideEffectsMiddleware$1$getTaxHoldPolicy$1.getHighSpeedVideoSizesFor;
                        java.util.List<com.paypal.oslo.feature.balance.domain.model.nba.NbaRecommendation> list3 = (java.util.List) balanceDashboardViewModel$sideEffectsMiddleware$1$getTaxHoldPolicy$1.getInputSizeshNQ4ISI;
                        autoReloadInfo4 = (com.paypal.oslo.feature.balance.domain.model.AutoReloadInfo) balanceDashboardViewModel$sideEffectsMiddleware$1$getTaxHoldPolicy$1.getHighSpeedVideoFpsRanges;
                        balance4 = (com.paypal.oslo.feature.balance.domain.model.Balance) balanceDashboardViewModel$sideEffectsMiddleware$1$getTaxHoldPolicy$1.getHighSpeedVideoSizes;
                        kotlin.ResultKt.throwOnFailure(obj);
                        taxHoldPolicy2 = taxHoldPolicy3;
                        bool4 = bool5;
                        list2 = list3;
                        function12.invoke(new com.paypal.oslo.feature.balance.ui.balanceDashboard.BalanceDashboardIntent.BalanceLoaded((com.paypal.oslo.feature.balance.ui.balanceDashboard.BalanceUiModel) obj, balance4.getCurrencies(), autoReloadInfo4, list2, bool4, taxHoldPolicy2));
                        return kotlin.Unit.INSTANCE;
                    }
                    if (i != 3) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    int i4 = balanceDashboardViewModel$sideEffectsMiddleware$1$getTaxHoldPolicy$1.getHighResolutionOutputSizeshNQ4ISI;
                    int i5 = balanceDashboardViewModel$sideEffectsMiddleware$1$getTaxHoldPolicy$1.getHighSpeedVideoFpsRangesFor;
                    function1 = (kotlin.jvm.functions.Function1) balanceDashboardViewModel$sideEffectsMiddleware$1$getTaxHoldPolicy$1.getOutputMinFrameDuration;
                    com.paypal.oslo.feature.balance.domain.model.TaxHoldPolicy taxHoldPolicy4 = (com.paypal.oslo.feature.balance.domain.model.TaxHoldPolicy) balanceDashboardViewModel$sideEffectsMiddleware$1$getTaxHoldPolicy$1.getInputFormats;
                    java.lang.Boolean bool6 = (java.lang.Boolean) balanceDashboardViewModel$sideEffectsMiddleware$1$getTaxHoldPolicy$1.getHighSpeedVideoSizesFor;
                    java.util.List<com.paypal.oslo.feature.balance.domain.model.nba.NbaRecommendation> list4 = (java.util.List) balanceDashboardViewModel$sideEffectsMiddleware$1$getTaxHoldPolicy$1.getInputSizeshNQ4ISI;
                    autoReloadInfo3 = (com.paypal.oslo.feature.balance.domain.model.AutoReloadInfo) balanceDashboardViewModel$sideEffectsMiddleware$1$getTaxHoldPolicy$1.getHighSpeedVideoFpsRanges;
                    balance3 = (com.paypal.oslo.feature.balance.domain.model.Balance) balanceDashboardViewModel$sideEffectsMiddleware$1$getTaxHoldPolicy$1.getHighSpeedVideoSizes;
                    kotlin.ResultKt.throwOnFailure(obj);
                    taxHoldPolicy = taxHoldPolicy4;
                    bool3 = bool6;
                    list2 = list4;
                    function1.invoke(new com.paypal.oslo.feature.balance.ui.balanceDashboard.BalanceDashboardIntent.BalanceLoaded((com.paypal.oslo.feature.balance.ui.balanceDashboard.BalanceUiModel) obj, balance3.getCurrencies(), autoReloadInfo3, list2, bool3, taxHoldPolicy));
                    return kotlin.Unit.INSTANCE;
                }
                java.lang.Boolean bool7 = (java.lang.Boolean) balanceDashboardViewModel$sideEffectsMiddleware$1$getTaxHoldPolicy$1.getHighSpeedVideoSizesFor;
                java.util.List<com.paypal.oslo.feature.balance.domain.model.nba.NbaRecommendation> list5 = (java.util.List) balanceDashboardViewModel$sideEffectsMiddleware$1$getTaxHoldPolicy$1.getInputSizeshNQ4ISI;
                autoReloadInfo2 = (com.paypal.oslo.feature.balance.domain.model.AutoReloadInfo) balanceDashboardViewModel$sideEffectsMiddleware$1$getTaxHoldPolicy$1.getHighSpeedVideoFpsRanges;
                balance2 = (com.paypal.oslo.feature.balance.domain.model.Balance) balanceDashboardViewModel$sideEffectsMiddleware$1$getTaxHoldPolicy$1.getHighSpeedVideoSizes;
                input2 = (com.paypal.oslo.core.mvi.MviStateStore.Middleware.Input) balanceDashboardViewModel$sideEffectsMiddleware$1$getTaxHoldPolicy$1.Camera2StreamConfigurationMap;
                kotlin.ResultKt.throwOnFailure(obj);
                bool2 = bool7;
                list2 = list5;
                ior = (arrow.core.Ior) obj;
                com.paypal.oslo.feature.balance.ui.balanceDashboard.BalanceDashboardViewModel balanceDashboardViewModel = this.getHighSpeedVideoFpsRanges;
                if (!(ior instanceof arrow.core.Ior.Left)) {
                    com.paypal.android.logger.Logger.e$default(com.paypal.oslo.feature.balance.LoggerKt.log, "Failed to load tax hold policy", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("errorType", kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(((com.paypal.oslo.core.network.graphql.error.CallError) ((arrow.core.Ior.Left) ior).getValue()).getClass()).getSimpleName())), null, null, 12, null);
                    input2.getEventDispatcher().invoke(new com.paypal.oslo.feature.balance.ui.balanceDashboard.BalanceDashboardIntent.Error("Failed to load tax hold policy", null, null, list2, false, 22, null));
                    return kotlin.Unit.INSTANCE;
                }
                if (ior instanceof arrow.core.Ior.Right) {
                    com.paypal.oslo.feature.balance.domain.model.TaxHoldPolicy taxHoldPolicy5 = (com.paypal.oslo.feature.balance.domain.model.TaxHoldPolicy) ((arrow.core.Ior.Right) ior).getValue();
                    kotlin.jvm.functions.Function1<com.paypal.oslo.feature.balance.ui.balanceDashboard.BalanceDashboardIntent, kotlin.Unit> eventDispatcher = input2.getEventDispatcher();
                    balanceDashboardViewModel$sideEffectsMiddleware$1$getTaxHoldPolicy$1.Camera2StreamConfigurationMap = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(input2);
                    balanceDashboardViewModel$sideEffectsMiddleware$1$getTaxHoldPolicy$1.getHighSpeedVideoSizes = balance2;
                    balanceDashboardViewModel$sideEffectsMiddleware$1$getTaxHoldPolicy$1.getHighSpeedVideoFpsRanges = autoReloadInfo2;
                    balanceDashboardViewModel$sideEffectsMiddleware$1$getTaxHoldPolicy$1.getInputSizeshNQ4ISI = list2;
                    balanceDashboardViewModel$sideEffectsMiddleware$1$getTaxHoldPolicy$1.getHighSpeedVideoSizesFor = bool2;
                    balanceDashboardViewModel$sideEffectsMiddleware$1$getTaxHoldPolicy$1.getOutputFormats = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(ior);
                    balanceDashboardViewModel$sideEffectsMiddleware$1$getTaxHoldPolicy$1.getInputFormats = taxHoldPolicy5;
                    balanceDashboardViewModel$sideEffectsMiddleware$1$getTaxHoldPolicy$1.getOutputMinFrameDuration = eventDispatcher;
                    balanceDashboardViewModel$sideEffectsMiddleware$1$getTaxHoldPolicy$1.getHighSpeedVideoFpsRangesFor = 0;
                    balanceDashboardViewModel$sideEffectsMiddleware$1$getTaxHoldPolicy$1.getHighResolutionOutputSizeshNQ4ISI = 0;
                    balanceDashboardViewModel$sideEffectsMiddleware$1$getTaxHoldPolicy$1.getOutputStallDuration = 2;
                    obj = com.paypal.oslo.feature.balance.ui.balanceDashboard.BalanceDashboardViewModel.access$toUiModel(balanceDashboardViewModel, balance2, balanceDashboardViewModel$sideEffectsMiddleware$1$getTaxHoldPolicy$1);
                    if (obj != coroutine_suspended) {
                        taxHoldPolicy2 = taxHoldPolicy5;
                        function12 = eventDispatcher;
                        autoReloadInfo4 = autoReloadInfo2;
                        balance4 = balance2;
                        bool4 = bool2;
                        function12.invoke(new com.paypal.oslo.feature.balance.ui.balanceDashboard.BalanceDashboardIntent.BalanceLoaded((com.paypal.oslo.feature.balance.ui.balanceDashboard.BalanceUiModel) obj, balance4.getCurrencies(), autoReloadInfo4, list2, bool4, taxHoldPolicy2));
                        return kotlin.Unit.INSTANCE;
                    }
                } else {
                    if (!(ior instanceof arrow.core.Ior.Both)) {
                        throw new kotlin.NoWhenBranchMatchedException();
                    }
                    arrow.core.Ior.Both both = (arrow.core.Ior.Both) ior;
                    java.lang.Object leftValue = both.getLeftValue();
                    com.paypal.oslo.feature.balance.domain.model.TaxHoldPolicy taxHoldPolicy6 = (com.paypal.oslo.feature.balance.domain.model.TaxHoldPolicy) both.getRightValue();
                    kotlin.jvm.functions.Function1<com.paypal.oslo.feature.balance.ui.balanceDashboard.BalanceDashboardIntent, kotlin.Unit> eventDispatcher2 = input2.getEventDispatcher();
                    balanceDashboardViewModel$sideEffectsMiddleware$1$getTaxHoldPolicy$1.Camera2StreamConfigurationMap = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(input2);
                    balanceDashboardViewModel$sideEffectsMiddleware$1$getTaxHoldPolicy$1.getHighSpeedVideoSizes = balance2;
                    balanceDashboardViewModel$sideEffectsMiddleware$1$getTaxHoldPolicy$1.getHighSpeedVideoFpsRanges = autoReloadInfo2;
                    balanceDashboardViewModel$sideEffectsMiddleware$1$getTaxHoldPolicy$1.getInputSizeshNQ4ISI = list2;
                    balanceDashboardViewModel$sideEffectsMiddleware$1$getTaxHoldPolicy$1.getHighSpeedVideoSizesFor = bool2;
                    balanceDashboardViewModel$sideEffectsMiddleware$1$getTaxHoldPolicy$1.getOutputFormats = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(ior);
                    balanceDashboardViewModel$sideEffectsMiddleware$1$getTaxHoldPolicy$1.getInputFormats = taxHoldPolicy6;
                    balanceDashboardViewModel$sideEffectsMiddleware$1$getTaxHoldPolicy$1.getOutputMinFrameDuration = eventDispatcher2;
                    balanceDashboardViewModel$sideEffectsMiddleware$1$getTaxHoldPolicy$1.getHighSpeedVideoFpsRangesFor = 0;
                    balanceDashboardViewModel$sideEffectsMiddleware$1$getTaxHoldPolicy$1.getHighResolutionOutputSizeshNQ4ISI = 0;
                    balanceDashboardViewModel$sideEffectsMiddleware$1$getTaxHoldPolicy$1.getOutputStallDuration = 3;
                    obj = com.paypal.oslo.feature.balance.ui.balanceDashboard.BalanceDashboardViewModel.access$toUiModel(balanceDashboardViewModel, balance2, balanceDashboardViewModel$sideEffectsMiddleware$1$getTaxHoldPolicy$1);
                    if (obj != coroutine_suspended) {
                        taxHoldPolicy = taxHoldPolicy6;
                        function1 = eventDispatcher2;
                        autoReloadInfo3 = autoReloadInfo2;
                        balance3 = balance2;
                        bool3 = bool2;
                        function1.invoke(new com.paypal.oslo.feature.balance.ui.balanceDashboard.BalanceDashboardIntent.BalanceLoaded((com.paypal.oslo.feature.balance.ui.balanceDashboard.BalanceUiModel) obj, balance3.getCurrencies(), autoReloadInfo3, list2, bool3, taxHoldPolicy));
                        return kotlin.Unit.INSTANCE;
                    }
                }
                return coroutine_suspended;
            }
        }
        balanceDashboardViewModel$sideEffectsMiddleware$1$getTaxHoldPolicy$1 = new com.paypal.oslo.feature.balance.ui.balanceDashboard.BalanceDashboardViewModel$sideEffectsMiddleware$1$getTaxHoldPolicy$1(this, continuation);
        java.lang.Object obj2 = balanceDashboardViewModel$sideEffectsMiddleware$1$getTaxHoldPolicy$1.getOutputStallDurationlomOqCM;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = balanceDashboardViewModel$sideEffectsMiddleware$1$getTaxHoldPolicy$1.getOutputStallDuration;
        if (i != 0) {
        }
        ior = (arrow.core.Ior) obj2;
        com.paypal.oslo.feature.balance.ui.balanceDashboard.BalanceDashboardViewModel balanceDashboardViewModel2 = this.getHighSpeedVideoFpsRanges;
        if (!(ior instanceof arrow.core.Ior.Left)) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0078  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object getHighSpeedVideoSizes(arrow.core.Ior<? extends com.paypal.oslo.core.network.graphql.error.CallError, com.paypal.oslo.feature.balance.domain.model.Balance> ior, com.paypal.oslo.feature.balance.domain.model.AutoReloadInfo autoReloadInfo, java.util.List<com.paypal.oslo.feature.balance.domain.model.nba.NbaRecommendation> list, java.lang.Boolean bool, com.paypal.oslo.core.mvi.MviStateStore.Middleware.Input<com.paypal.oslo.feature.balance.ui.balanceDashboard.BalanceDashboardState, com.paypal.oslo.feature.balance.ui.balanceDashboard.BalanceDashboardIntent> input, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        java.lang.Throwable th;
        java.lang.String str;
        kotlin.ranges.IntRange intRange;
        if (ior instanceof arrow.core.Ior.Left) {
            com.paypal.oslo.core.network.graphql.error.CallError callError = (com.paypal.oslo.core.network.graphql.error.CallError) ((arrow.core.Ior.Left) ior).getValue();
            boolean z = callError instanceof com.paypal.oslo.core.network.graphql.error.CallError.Network;
            if (z) {
                com.paypal.oslo.core.network.http.error.NetworkError error = ((com.paypal.oslo.core.network.graphql.error.CallError.Network) callError).getError();
                if (error instanceof com.paypal.oslo.core.network.http.error.NetworkError.NoInternet) {
                    th = ((com.paypal.oslo.core.network.http.error.NetworkError.NoInternet) error).getCause();
                } else if (error instanceof com.paypal.oslo.core.network.http.error.NetworkError.UnknownError) {
                    th = ((com.paypal.oslo.core.network.http.error.NetworkError.UnknownError) error).getCause();
                } else if (!(error instanceof com.paypal.oslo.core.network.http.error.NetworkError.HttpError)) {
                    throw new kotlin.NoWhenBranchMatchedException();
                }
                java.lang.Throwable th2 = th;
                if (!z) {
                    com.paypal.oslo.core.network.http.error.NetworkError error2 = ((com.paypal.oslo.core.network.graphql.error.CallError.Network) callError).getError();
                    if (!(error2 instanceof com.paypal.oslo.core.network.http.error.NetworkError.NoInternet)) {
                        if (error2 instanceof com.paypal.oslo.core.network.http.error.NetworkError.HttpError) {
                            intRange = com.paypal.oslo.feature.balance.ui.balanceDashboard.BalanceDashboardViewModelKt.getHighSpeedVideoFpsRanges;
                            int first = intRange.getFirst();
                            int last = intRange.getLast();
                            int code = ((com.paypal.oslo.core.network.http.error.NetworkError.HttpError) error2).getCode();
                            if (first <= code && code <= last) {
                                str = "client";
                                com.paypal.android.logger.Logger.e$default(com.paypal.oslo.feature.balance.LoggerKt.log, "Failed to load balance", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("errorType", kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(callError.getClass()).getSimpleName())), null, th2, 4, null);
                                input.getEventDispatcher().invoke(new com.paypal.oslo.feature.balance.ui.balanceDashboard.BalanceDashboardIntent.Error("Failed to load balance", null, str, list, false, 18, null));
                            }
                        } else if (!(error2 instanceof com.paypal.oslo.core.network.http.error.NetworkError.UnknownError)) {
                            throw new kotlin.NoWhenBranchMatchedException();
                        }
                    }
                    str = "network";
                    com.paypal.android.logger.Logger.e$default(com.paypal.oslo.feature.balance.LoggerKt.log, "Failed to load balance", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("errorType", kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(callError.getClass()).getSimpleName())), null, th2, 4, null);
                    input.getEventDispatcher().invoke(new com.paypal.oslo.feature.balance.ui.balanceDashboard.BalanceDashboardIntent.Error("Failed to load balance", null, str, list, false, 18, null));
                } else if (!(callError instanceof com.paypal.oslo.core.network.graphql.error.CallError.GraphQL)) {
                    throw new kotlin.NoWhenBranchMatchedException();
                }
                str = "server";
                com.paypal.android.logger.Logger.e$default(com.paypal.oslo.feature.balance.LoggerKt.log, "Failed to load balance", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("errorType", kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(callError.getClass()).getSimpleName())), null, th2, 4, null);
                input.getEventDispatcher().invoke(new com.paypal.oslo.feature.balance.ui.balanceDashboard.BalanceDashboardIntent.Error("Failed to load balance", null, str, list, false, 18, null));
            } else if (!(callError instanceof com.paypal.oslo.core.network.graphql.error.CallError.GraphQL)) {
                throw new kotlin.NoWhenBranchMatchedException();
            }
            th = null;
            java.lang.Throwable th22 = th;
            if (!z) {
            }
            str = "server";
            com.paypal.android.logger.Logger.e$default(com.paypal.oslo.feature.balance.LoggerKt.log, "Failed to load balance", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("errorType", kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(callError.getClass()).getSimpleName())), null, th22, 4, null);
            input.getEventDispatcher().invoke(new com.paypal.oslo.feature.balance.ui.balanceDashboard.BalanceDashboardIntent.Error("Failed to load balance", null, str, list, false, 18, null));
        } else if (ior instanceof arrow.core.Ior.Right) {
            java.lang.Object highSpeedVideoFpsRanges = getHighSpeedVideoFpsRanges((com.paypal.oslo.feature.balance.domain.model.Balance) ((arrow.core.Ior.Right) ior).getValue(), autoReloadInfo, list, bool, input, continuation);
            if (highSpeedVideoFpsRanges == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                return highSpeedVideoFpsRanges;
            }
        } else if (ior instanceof arrow.core.Ior.Both) {
            arrow.core.Ior.Both both = (arrow.core.Ior.Both) ior;
            java.lang.Object highSpeedVideoFpsRanges2 = getHighSpeedVideoFpsRanges((com.paypal.oslo.feature.balance.domain.model.Balance) both.getRightValue(), autoReloadInfo, list, bool, input, continuation);
            if (highSpeedVideoFpsRanges2 == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                return highSpeedVideoFpsRanges2;
            }
        } else {
            throw new kotlin.NoWhenBranchMatchedException();
        }
        return kotlin.Unit.INSTANCE;
    }
}
