package com.paypal.oslo.feature.smartroute.ui.mvi.middleware;

@kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a#\u0010\u0006\u001a\u00020\u0005*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\u0006\u0010\u0007\"$\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\b*\u00020\u00008AX\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\f"}, d2 = {"Lcom/paypal/oslo/feature/smartroute/ui/viewmodel/DistributionViewModel;", "Lcom/paypal/oslo/feature/smartroute/ui/model/DistributionScreenState;", "p0", "Lcom/paypal/oslo/feature/smartroute/domain/model/AutoReloadFlowType;", "p1", "", "Camera2StreamConfigurationMap", "(Lcom/paypal/oslo/feature/smartroute/ui/viewmodel/DistributionViewModel;Lcom/paypal/oslo/feature/smartroute/ui/model/DistributionScreenState;Lcom/paypal/oslo/feature/smartroute/domain/model/AutoReloadFlowType;)V", "Lcom/paypal/oslo/core/mvi/MviStateStore$Middleware;", "Lcom/paypal/oslo/feature/smartroute/ui/mvi/DistributionState;", "Lcom/paypal/oslo/feature/smartroute/ui/mvi/DistributionEvent;", "getAutoReloadMiddleware", "(Lcom/paypal/oslo/feature/smartroute/ui/viewmodel/DistributionViewModel;)Lcom/paypal/oslo/core/mvi/MviStateStore$Middleware;", "autoReloadMiddleware"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class DistributionAutoReloadMiddlewareKt {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:12:0x015c  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0195  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final /* synthetic */ java.lang.Object access$executeDeactivateFlow(com.paypal.oslo.feature.smartroute.ui.viewmodel.DistributionViewModel distributionViewModel, com.paypal.oslo.feature.smartroute.ui.model.DistributionScreenState distributionScreenState, kotlin.coroutines.Continuation continuation) {
        com.paypal.oslo.feature.smartroute.ui.mvi.middleware.DistributionAutoReloadMiddlewareKt$executeDeactivateFlow$1 distributionAutoReloadMiddlewareKt$executeDeactivateFlow$1;
        int i;
        java.lang.Object obj;
        java.lang.Object obj2;
        com.paypal.oslo.feature.smartroute.domain.model.DistributionConfiguration copy;
        arrow.core.Either either;
        final com.paypal.oslo.feature.smartroute.ui.viewmodel.DistributionViewModel distributionViewModel2 = distributionViewModel;
        if (continuation instanceof com.paypal.oslo.feature.smartroute.ui.mvi.middleware.DistributionAutoReloadMiddlewareKt$executeDeactivateFlow$1) {
            distributionAutoReloadMiddlewareKt$executeDeactivateFlow$1 = (com.paypal.oslo.feature.smartroute.ui.mvi.middleware.DistributionAutoReloadMiddlewareKt$executeDeactivateFlow$1) continuation;
            if ((distributionAutoReloadMiddlewareKt$executeDeactivateFlow$1.getHighSpeedVideoSizesFor & Integer.MIN_VALUE) != 0) {
                distributionAutoReloadMiddlewareKt$executeDeactivateFlow$1.getHighSpeedVideoSizesFor -= 2147483648;
                com.paypal.oslo.feature.smartroute.ui.mvi.middleware.DistributionAutoReloadMiddlewareKt$executeDeactivateFlow$1 distributionAutoReloadMiddlewareKt$executeDeactivateFlow$12 = distributionAutoReloadMiddlewareKt$executeDeactivateFlow$1;
                java.lang.Object obj3 = distributionAutoReloadMiddlewareKt$executeDeactivateFlow$12.getOutputFormats;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = distributionAutoReloadMiddlewareKt$executeDeactivateFlow$12.getHighSpeedVideoSizesFor;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj3);
                    com.paypal.oslo.feature.smartroute.domain.model.DistributionConfiguration savedConfiguration = distributionScreenState.getSavedConfiguration();
                    java.util.Iterator<T> it = distributionScreenState.getAccounts().iterator();
                    while (true) {
                        obj = null;
                        if (!it.hasNext()) {
                            obj2 = null;
                            break;
                        }
                        obj2 = it.next();
                        if (kotlin.jvm.internal.Intrinsics.areEqual(((com.paypal.oslo.feature.smartroute.ui.model.DistributionAccountUi) obj2).getId(), "savings")) {
                            break;
                        }
                    }
                    com.paypal.oslo.feature.smartroute.ui.model.DistributionAccountUi distributionAccountUi = (com.paypal.oslo.feature.smartroute.ui.model.DistributionAccountUi) obj2;
                    float percentage = distributionAccountUi != null ? distributionAccountUi.getPercentage() : 0.0f;
                    java.util.Iterator<T> it2 = distributionScreenState.getAccounts().iterator();
                    while (true) {
                        if (!it2.hasNext()) {
                            break;
                        }
                        java.lang.Object next = it2.next();
                        if (kotlin.jvm.internal.Intrinsics.areEqual(((com.paypal.oslo.feature.smartroute.ui.model.DistributionAccountUi) next).getId(), "crypto")) {
                            obj = next;
                            break;
                        }
                    }
                    com.paypal.oslo.feature.smartroute.ui.model.DistributionAccountUi distributionAccountUi2 = (com.paypal.oslo.feature.smartroute.ui.model.DistributionAccountUi) obj;
                    float percentage2 = distributionAccountUi2 != null ? distributionAccountUi2.getPercentage() : 0.0f;
                    int i2 = (percentage == savedConfiguration.getSavingsPercentage() && percentage2 == savedConfiguration.getCryptoPercentage()) ? 0 : 1;
                    copy = savedConfiguration.copy((r30 & 1) != 0 ? savedConfiguration.status : null, (r30 & 2) != 0 ? savedConfiguration.savingsPercentage : percentage, (r30 & 4) != 0 ? savedConfiguration.cryptoPercentage : percentage2, (r30 & 8) != 0 ? savedConfiguration.cryptoApyRate : null, (r30 & 16) != 0 ? savedConfiguration.cryptoOptInStatus : null, (r30 & 32) != 0 ? savedConfiguration.savingsApy : null, (r30 & 64) != 0 ? savedConfiguration.autoReloadEnabled : distributionScreenState.getAutoReload().isEnabled(), (r30 & 128) != 0 ? savedConfiguration.autoReloadThresholdAmount : null, (r30 & 256) != 0 ? savedConfiguration.autoReloadAmount : null, (r30 & 512) != 0 ? savedConfiguration.autoReloadCurrency : null, (r30 & 1024) != 0 ? savedConfiguration.autoReloadFinancialInstrumentId : null, (r30 & 2048) != 0 ? savedConfiguration.version : null, (r30 & 4096) != 0 ? savedConfiguration.savingsEligibilityStatus : null, (r30 & 8192) != 0 ? savedConfiguration.pyusdEligibilityStatus : null);
                    boolean z = i2 ^ 1;
                    com.paypal.android.logger.Logger.d$default(com.paypal.oslo.feature.smartroute.LoggerKt.log, "Executing auto-reload flow via middleware", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to(com.paypal.oslo.feature.p2p.domain.constants.P2pConstants.Log.Attributes.FLOW_TYPE, "DEACTIVATE"), kotlin.TuplesKt.to("skipSave", kotlin.coroutines.jvm.internal.Boxing.boxBoolean(z))), null, 4, null);
                    com.paypal.oslo.feature.smartroute.domain.usecase.AutoReloadFlowOrchestrator autoReloadFlowOrchestrator = distributionViewModel.getAutoReloadFlowOrchestrator();
                    kotlin.jvm.functions.Function1<? super com.paypal.oslo.feature.smartroute.domain.model.AutoReloadFlowStep, kotlin.Unit> function1 = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.smartroute.ui.mvi.middleware.DistributionAutoReloadMiddlewareKt$$ExternalSyntheticLambda1
                        @Override // kotlin.jvm.functions.Function1
                        public final java.lang.Object invoke(java.lang.Object obj4) {
                            return com.paypal.oslo.feature.smartroute.ui.mvi.middleware.DistributionAutoReloadMiddlewareKt.$r8$lambda$Q19e9A63pFpuaHrHH79ZQx4c894(com.paypal.oslo.feature.smartroute.ui.viewmodel.DistributionViewModel.this, (com.paypal.oslo.feature.smartroute.domain.model.AutoReloadFlowStep) obj4);
                        }
                    };
                    distributionAutoReloadMiddlewareKt$executeDeactivateFlow$12.Camera2StreamConfigurationMap = distributionViewModel2;
                    distributionAutoReloadMiddlewareKt$executeDeactivateFlow$12.getHighResolutionOutputSizeshNQ4ISI = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(distributionScreenState);
                    distributionAutoReloadMiddlewareKt$executeDeactivateFlow$12.getOutputMinFrameDuration = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(savedConfiguration);
                    distributionAutoReloadMiddlewareKt$executeDeactivateFlow$12.getInputFormats = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(copy);
                    distributionAutoReloadMiddlewareKt$executeDeactivateFlow$12.getInputSizeshNQ4ISI = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable("balance");
                    distributionAutoReloadMiddlewareKt$executeDeactivateFlow$12.getHighSpeedVideoFpsRangesFor = percentage;
                    distributionAutoReloadMiddlewareKt$executeDeactivateFlow$12.getHighSpeedVideoFpsRanges = percentage2;
                    distributionAutoReloadMiddlewareKt$executeDeactivateFlow$12.getHighSpeedVideoSizes = i2;
                    distributionAutoReloadMiddlewareKt$executeDeactivateFlow$12.getHighSpeedVideoSizesFor = 1;
                    obj3 = autoReloadFlowOrchestrator.executeDeactivateFlow(copy, "balance", z, function1, distributionAutoReloadMiddlewareKt$executeDeactivateFlow$12);
                    if (obj3 == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    int i3 = distributionAutoReloadMiddlewareKt$executeDeactivateFlow$12.getHighSpeedVideoSizes;
                    float f = distributionAutoReloadMiddlewareKt$executeDeactivateFlow$12.getHighSpeedVideoFpsRanges;
                    float f2 = distributionAutoReloadMiddlewareKt$executeDeactivateFlow$12.getHighSpeedVideoFpsRangesFor;
                    distributionViewModel2 = (com.paypal.oslo.feature.smartroute.ui.viewmodel.DistributionViewModel) distributionAutoReloadMiddlewareKt$executeDeactivateFlow$12.Camera2StreamConfigurationMap;
                    kotlin.ResultKt.throwOnFailure(obj3);
                }
                either = (arrow.core.Either) obj3;
                if (!(either instanceof arrow.core.Either.Right)) {
                    com.paypal.oslo.feature.smartroute.domain.usecase.AutoReloadFlowOrchestrator.FlowResult flowResult = (com.paypal.oslo.feature.smartroute.domain.usecase.AutoReloadFlowOrchestrator.FlowResult) ((arrow.core.Either.Right) either).getValue();
                    com.paypal.android.logger.Logger.d$default(com.paypal.oslo.feature.smartroute.LoggerKt.log, "Auto-reload flow completed successfully", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to(com.paypal.oslo.feature.p2p.domain.constants.P2pConstants.Log.Attributes.FLOW_TYPE, "DEACTIVATE")), null, 4, null);
                    distributionViewModel2.processEvent$smart_route_prodRelease(new com.paypal.oslo.feature.smartroute.ui.mvi.DistributionEvent.SystemEvent.AutoReloadFlowSuccess(com.paypal.oslo.feature.smartroute.domain.model.AutoReloadFlowType.DEACTIVATE));
                    distributionViewModel2.processEvent$smart_route_prodRelease(new com.paypal.oslo.feature.smartroute.ui.mvi.DistributionEvent.SystemEvent.SaveSuccess(flowResult.getConfiguration(), flowResult.getToastMessage()));
                } else {
                    if (!(either instanceof arrow.core.Either.Left)) {
                        throw new kotlin.NoWhenBranchMatchedException();
                    }
                    com.paypal.oslo.feature.smartroute.domain.error.AutoReloadFlowError autoReloadFlowError = (com.paypal.oslo.feature.smartroute.domain.error.AutoReloadFlowError) ((arrow.core.Either.Left) either).getValue();
                    com.paypal.android.logger.Logger.w$default(com.paypal.oslo.feature.smartroute.LoggerKt.log, "Auto-reload flow failed", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("errorType", kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(autoReloadFlowError.getClass()).getSimpleName())), null, 4, null);
                    distributionViewModel2.processEvent$smart_route_prodRelease(new com.paypal.oslo.feature.smartroute.ui.mvi.DistributionEvent.SystemEvent.AutoReloadFlowFailed(com.paypal.oslo.feature.smartroute.domain.model.AutoReloadFlowType.DEACTIVATE, autoReloadFlowError));
                }
                return kotlin.Unit.INSTANCE;
            }
        }
        distributionAutoReloadMiddlewareKt$executeDeactivateFlow$1 = new com.paypal.oslo.feature.smartroute.ui.mvi.middleware.DistributionAutoReloadMiddlewareKt$executeDeactivateFlow$1(continuation);
        com.paypal.oslo.feature.smartroute.ui.mvi.middleware.DistributionAutoReloadMiddlewareKt$executeDeactivateFlow$1 distributionAutoReloadMiddlewareKt$executeDeactivateFlow$122 = distributionAutoReloadMiddlewareKt$executeDeactivateFlow$1;
        java.lang.Object obj32 = distributionAutoReloadMiddlewareKt$executeDeactivateFlow$122.getOutputFormats;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = distributionAutoReloadMiddlewareKt$executeDeactivateFlow$122.getHighSpeedVideoSizesFor;
        if (i != 0) {
        }
        either = (arrow.core.Either) obj32;
        if (!(either instanceof arrow.core.Either.Right)) {
        }
        return kotlin.Unit.INSTANCE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0151  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x018a  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final /* synthetic */ java.lang.Object access$executeSetupFlow(com.paypal.oslo.feature.smartroute.ui.viewmodel.DistributionViewModel distributionViewModel, com.paypal.oslo.feature.smartroute.ui.model.DistributionScreenState distributionScreenState, kotlin.coroutines.Continuation continuation) {
        com.paypal.oslo.feature.smartroute.ui.mvi.middleware.DistributionAutoReloadMiddlewareKt$executeSetupFlow$1 distributionAutoReloadMiddlewareKt$executeSetupFlow$1;
        int i;
        java.lang.Object obj;
        java.lang.Object obj2;
        com.paypal.oslo.feature.smartroute.domain.model.DistributionConfiguration copy;
        arrow.core.Either either;
        final com.paypal.oslo.feature.smartroute.ui.viewmodel.DistributionViewModel distributionViewModel2 = distributionViewModel;
        if (continuation instanceof com.paypal.oslo.feature.smartroute.ui.mvi.middleware.DistributionAutoReloadMiddlewareKt$executeSetupFlow$1) {
            distributionAutoReloadMiddlewareKt$executeSetupFlow$1 = (com.paypal.oslo.feature.smartroute.ui.mvi.middleware.DistributionAutoReloadMiddlewareKt$executeSetupFlow$1) continuation;
            if ((distributionAutoReloadMiddlewareKt$executeSetupFlow$1.getInputFormats & Integer.MIN_VALUE) != 0) {
                distributionAutoReloadMiddlewareKt$executeSetupFlow$1.getInputFormats -= 2147483648;
                java.lang.Object obj3 = distributionAutoReloadMiddlewareKt$executeSetupFlow$1.getOutputMinFrameDuration;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = distributionAutoReloadMiddlewareKt$executeSetupFlow$1.getInputFormats;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj3);
                    com.paypal.oslo.feature.smartroute.domain.model.DistributionConfiguration savedConfiguration = distributionScreenState.getSavedConfiguration();
                    java.util.Iterator<T> it = distributionScreenState.getAccounts().iterator();
                    while (true) {
                        obj = null;
                        if (!it.hasNext()) {
                            obj2 = null;
                            break;
                        }
                        obj2 = it.next();
                        if (kotlin.jvm.internal.Intrinsics.areEqual(((com.paypal.oslo.feature.smartroute.ui.model.DistributionAccountUi) obj2).getId(), "savings")) {
                            break;
                        }
                    }
                    com.paypal.oslo.feature.smartroute.ui.model.DistributionAccountUi distributionAccountUi = (com.paypal.oslo.feature.smartroute.ui.model.DistributionAccountUi) obj2;
                    float percentage = distributionAccountUi != null ? distributionAccountUi.getPercentage() : 0.0f;
                    java.util.Iterator<T> it2 = distributionScreenState.getAccounts().iterator();
                    while (true) {
                        if (!it2.hasNext()) {
                            break;
                        }
                        java.lang.Object next = it2.next();
                        if (kotlin.jvm.internal.Intrinsics.areEqual(((com.paypal.oslo.feature.smartroute.ui.model.DistributionAccountUi) next).getId(), "crypto")) {
                            obj = next;
                            break;
                        }
                    }
                    com.paypal.oslo.feature.smartroute.ui.model.DistributionAccountUi distributionAccountUi2 = (com.paypal.oslo.feature.smartroute.ui.model.DistributionAccountUi) obj;
                    float percentage2 = distributionAccountUi2 != null ? distributionAccountUi2.getPercentage() : 0.0f;
                    int i2 = (percentage == savedConfiguration.getSavingsPercentage() && percentage2 == savedConfiguration.getCryptoPercentage()) ? 0 : 1;
                    copy = savedConfiguration.copy((r30 & 1) != 0 ? savedConfiguration.status : com.paypal.oslo.feature.smartroute.api.model.SmartRouteStatus.ACTIVE, (r30 & 2) != 0 ? savedConfiguration.savingsPercentage : percentage, (r30 & 4) != 0 ? savedConfiguration.cryptoPercentage : percentage2, (r30 & 8) != 0 ? savedConfiguration.cryptoApyRate : null, (r30 & 16) != 0 ? savedConfiguration.cryptoOptInStatus : null, (r30 & 32) != 0 ? savedConfiguration.savingsApy : null, (r30 & 64) != 0 ? savedConfiguration.autoReloadEnabled : distributionScreenState.getAutoReload().isEnabled(), (r30 & 128) != 0 ? savedConfiguration.autoReloadThresholdAmount : null, (r30 & 256) != 0 ? savedConfiguration.autoReloadAmount : null, (r30 & 512) != 0 ? savedConfiguration.autoReloadCurrency : null, (r30 & 1024) != 0 ? savedConfiguration.autoReloadFinancialInstrumentId : null, (r30 & 2048) != 0 ? savedConfiguration.version : null, (r30 & 4096) != 0 ? savedConfiguration.savingsEligibilityStatus : null, (r30 & 8192) != 0 ? savedConfiguration.pyusdEligibilityStatus : null);
                    boolean z = i2 ^ 1;
                    com.paypal.android.logger.Logger.d$default(com.paypal.oslo.feature.smartroute.LoggerKt.log, "Executing auto-reload flow via middleware", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to(com.paypal.oslo.feature.p2p.domain.constants.P2pConstants.Log.Attributes.FLOW_TYPE, com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.ActivityActionsConstant.SETUP), kotlin.TuplesKt.to("skipSave", kotlin.coroutines.jvm.internal.Boxing.boxBoolean(z))), null, 4, null);
                    com.paypal.oslo.feature.smartroute.domain.usecase.AutoReloadFlowOrchestrator autoReloadFlowOrchestrator = distributionViewModel.getAutoReloadFlowOrchestrator();
                    kotlin.jvm.functions.Function1<? super com.paypal.oslo.feature.smartroute.domain.model.AutoReloadFlowStep, kotlin.Unit> function1 = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.smartroute.ui.mvi.middleware.DistributionAutoReloadMiddlewareKt$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function1
                        public final java.lang.Object invoke(java.lang.Object obj4) {
                            return com.paypal.oslo.feature.smartroute.ui.mvi.middleware.DistributionAutoReloadMiddlewareKt.$r8$lambda$v91Y5NhGF5XLTijB48rjh18QgRk(com.paypal.oslo.feature.smartroute.ui.viewmodel.DistributionViewModel.this, (com.paypal.oslo.feature.smartroute.domain.model.AutoReloadFlowStep) obj4);
                        }
                    };
                    distributionAutoReloadMiddlewareKt$executeSetupFlow$1.getHighResolutionOutputSizeshNQ4ISI = distributionViewModel2;
                    distributionAutoReloadMiddlewareKt$executeSetupFlow$1.getHighSpeedVideoFpsRangesFor = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(distributionScreenState);
                    distributionAutoReloadMiddlewareKt$executeSetupFlow$1.getHighSpeedVideoSizesFor = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(savedConfiguration);
                    distributionAutoReloadMiddlewareKt$executeSetupFlow$1.getInputSizeshNQ4ISI = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(copy);
                    distributionAutoReloadMiddlewareKt$executeSetupFlow$1.getHighSpeedVideoFpsRanges = percentage;
                    distributionAutoReloadMiddlewareKt$executeSetupFlow$1.Camera2StreamConfigurationMap = percentage2;
                    distributionAutoReloadMiddlewareKt$executeSetupFlow$1.getHighSpeedVideoSizes = i2;
                    distributionAutoReloadMiddlewareKt$executeSetupFlow$1.getInputFormats = 1;
                    obj3 = autoReloadFlowOrchestrator.executeSetupFlow(copy, z, function1, distributionAutoReloadMiddlewareKt$executeSetupFlow$1);
                    if (obj3 == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    int i3 = distributionAutoReloadMiddlewareKt$executeSetupFlow$1.getHighSpeedVideoSizes;
                    float f = distributionAutoReloadMiddlewareKt$executeSetupFlow$1.Camera2StreamConfigurationMap;
                    float f2 = distributionAutoReloadMiddlewareKt$executeSetupFlow$1.getHighSpeedVideoFpsRanges;
                    distributionViewModel2 = (com.paypal.oslo.feature.smartroute.ui.viewmodel.DistributionViewModel) distributionAutoReloadMiddlewareKt$executeSetupFlow$1.getHighResolutionOutputSizeshNQ4ISI;
                    kotlin.ResultKt.throwOnFailure(obj3);
                }
                either = (arrow.core.Either) obj3;
                if (!(either instanceof arrow.core.Either.Right)) {
                    com.paypal.oslo.feature.smartroute.domain.usecase.AutoReloadFlowOrchestrator.FlowResult flowResult = (com.paypal.oslo.feature.smartroute.domain.usecase.AutoReloadFlowOrchestrator.FlowResult) ((arrow.core.Either.Right) either).getValue();
                    com.paypal.android.logger.Logger.d$default(com.paypal.oslo.feature.smartroute.LoggerKt.log, "Auto-reload flow completed successfully", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to(com.paypal.oslo.feature.p2p.domain.constants.P2pConstants.Log.Attributes.FLOW_TYPE, com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.ActivityActionsConstant.SETUP)), null, 4, null);
                    distributionViewModel2.processEvent$smart_route_prodRelease(new com.paypal.oslo.feature.smartroute.ui.mvi.DistributionEvent.SystemEvent.AutoReloadFlowSuccess(com.paypal.oslo.feature.smartroute.domain.model.AutoReloadFlowType.SETUP));
                    distributionViewModel2.processEvent$smart_route_prodRelease(new com.paypal.oslo.feature.smartroute.ui.mvi.DistributionEvent.SystemEvent.SaveSuccess(flowResult.getConfiguration(), flowResult.getToastMessage()));
                } else {
                    if (!(either instanceof arrow.core.Either.Left)) {
                        throw new kotlin.NoWhenBranchMatchedException();
                    }
                    com.paypal.oslo.feature.smartroute.domain.error.AutoReloadFlowError autoReloadFlowError = (com.paypal.oslo.feature.smartroute.domain.error.AutoReloadFlowError) ((arrow.core.Either.Left) either).getValue();
                    com.paypal.android.logger.Logger.w$default(com.paypal.oslo.feature.smartroute.LoggerKt.log, "Auto-reload flow failed", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("errorType", kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(autoReloadFlowError.getClass()).getSimpleName())), null, 4, null);
                    distributionViewModel2.processEvent$smart_route_prodRelease(new com.paypal.oslo.feature.smartroute.ui.mvi.DistributionEvent.SystemEvent.AutoReloadFlowFailed(com.paypal.oslo.feature.smartroute.domain.model.AutoReloadFlowType.SETUP, autoReloadFlowError));
                }
                return kotlin.Unit.INSTANCE;
            }
        }
        distributionAutoReloadMiddlewareKt$executeSetupFlow$1 = new com.paypal.oslo.feature.smartroute.ui.mvi.middleware.DistributionAutoReloadMiddlewareKt$executeSetupFlow$1(continuation);
        java.lang.Object obj32 = distributionAutoReloadMiddlewareKt$executeSetupFlow$1.getOutputMinFrameDuration;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = distributionAutoReloadMiddlewareKt$executeSetupFlow$1.getInputFormats;
        if (i != 0) {
        }
        either = (arrow.core.Either) obj32;
        if (!(either instanceof arrow.core.Either.Right)) {
        }
        return kotlin.Unit.INSTANCE;
    }

    public static final com.paypal.oslo.core.mvi.MviStateStore.Middleware<com.paypal.oslo.feature.smartroute.ui.mvi.DistributionState, com.paypal.oslo.feature.smartroute.ui.mvi.DistributionEvent> getAutoReloadMiddleware(final com.paypal.oslo.feature.smartroute.ui.viewmodel.DistributionViewModel distributionViewModel) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(distributionViewModel, "");
        return new com.paypal.oslo.core.mvi.MviStateStore.Middleware<com.paypal.oslo.feature.smartroute.ui.mvi.DistributionState, com.paypal.oslo.feature.smartroute.ui.mvi.DistributionEvent>() { // from class: com.paypal.oslo.feature.smartroute.ui.mvi.middleware.DistributionAutoReloadMiddlewareKt$autoReloadMiddleware$1
            @Override // com.paypal.oslo.core.mvi.MviStateStore.Middleware
            public final void invoke(com.paypal.oslo.core.mvi.MviStateStore.Middleware.Input<com.paypal.oslo.feature.smartroute.ui.mvi.DistributionState, com.paypal.oslo.feature.smartroute.ui.mvi.DistributionEvent> input) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(input, "");
                com.paypal.oslo.feature.smartroute.ui.mvi.DistributionEvent event = input.getEvent();
                if (event instanceof com.paypal.oslo.feature.smartroute.ui.mvi.DistributionEvent.UserIntent.PrimaryButtonClicked) {
                    com.paypal.oslo.feature.smartroute.ui.mvi.middleware.DistributionAutoReloadMiddlewareKt.access$handlePrimaryButtonForAutoReload(com.paypal.oslo.feature.smartroute.ui.viewmodel.DistributionViewModel.this, input.getStates().getFirst());
                } else if (event instanceof com.paypal.oslo.feature.smartroute.ui.mvi.DistributionEvent.SystemEvent.AutoReloadFlowRetryClicked) {
                    com.paypal.oslo.feature.smartroute.ui.mvi.middleware.DistributionAutoReloadMiddlewareKt.access$handleAutoReloadFlowRetry(com.paypal.oslo.feature.smartroute.ui.viewmodel.DistributionViewModel.this, input.getStates().getFirst());
                }
            }
        };
    }

    private static final void Camera2StreamConfigurationMap(com.paypal.oslo.feature.smartroute.ui.viewmodel.DistributionViewModel distributionViewModel, com.paypal.oslo.feature.smartroute.ui.model.DistributionScreenState distributionScreenState, com.paypal.oslo.feature.smartroute.domain.model.AutoReloadFlowType autoReloadFlowType) {
        distributionViewModel.processEvent$smart_route_prodRelease(new com.paypal.oslo.feature.smartroute.ui.mvi.DistributionEvent.SystemEvent.AutoReloadFlowStarted(autoReloadFlowType));
        kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(androidx.view.ViewModelKt.getViewModelScope(distributionViewModel), null, null, new com.paypal.oslo.feature.smartroute.ui.mvi.middleware.DistributionAutoReloadMiddlewareKt$executeAutoReloadFlow$1(autoReloadFlowType, distributionViewModel, distributionScreenState, null), 3, null);
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$Q19e9A63pFpuaHrHH79ZQx4c894(com.paypal.oslo.feature.smartroute.ui.viewmodel.DistributionViewModel distributionViewModel, com.paypal.oslo.feature.smartroute.domain.model.AutoReloadFlowStep autoReloadFlowStep) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(autoReloadFlowStep, "");
        distributionViewModel.processEvent$smart_route_prodRelease(new com.paypal.oslo.feature.smartroute.ui.mvi.DistributionEvent.SystemEvent.AutoReloadFlowStepCompleted(autoReloadFlowStep, com.paypal.oslo.feature.smartroute.domain.model.AutoReloadFlowType.DEACTIVATE));
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$v91Y5NhGF5XLTijB48rjh18QgRk(com.paypal.oslo.feature.smartroute.ui.viewmodel.DistributionViewModel distributionViewModel, com.paypal.oslo.feature.smartroute.domain.model.AutoReloadFlowStep autoReloadFlowStep) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(autoReloadFlowStep, "");
        distributionViewModel.processEvent$smart_route_prodRelease(new com.paypal.oslo.feature.smartroute.ui.mvi.DistributionEvent.SystemEvent.AutoReloadFlowStepCompleted(autoReloadFlowStep, com.paypal.oslo.feature.smartroute.domain.model.AutoReloadFlowType.SETUP));
        return kotlin.Unit.INSTANCE;
    }

    public static final /* synthetic */ void access$handleAutoReloadFlowRetry(com.paypal.oslo.feature.smartroute.ui.viewmodel.DistributionViewModel distributionViewModel, com.paypal.oslo.feature.smartroute.ui.mvi.DistributionState distributionState) {
        com.paypal.oslo.feature.smartroute.domain.model.AutoReloadFlowType autoReloadFlowType;
        com.paypal.oslo.feature.smartroute.ui.mvi.DistributionState.Content content = distributionState instanceof com.paypal.oslo.feature.smartroute.ui.mvi.DistributionState.Content ? (com.paypal.oslo.feature.smartroute.ui.mvi.DistributionState.Content) distributionState : null;
        if (content != null) {
            com.paypal.oslo.feature.smartroute.ui.model.DistributionScreenState screenState = content.getScreenState();
            if (screenState.getAutoReload().isEnabled()) {
                autoReloadFlowType = com.paypal.oslo.feature.smartroute.domain.model.AutoReloadFlowType.SETUP;
            } else {
                autoReloadFlowType = com.paypal.oslo.feature.smartroute.domain.model.AutoReloadFlowType.DEACTIVATE;
            }
            com.paypal.android.logger.Logger.d$default(com.paypal.oslo.feature.smartroute.LoggerKt.log, "User initiated auto-reload flow retry", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to(com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.LogConstants.OPERATION, "AUTO_RELOAD_RETRY"), kotlin.TuplesKt.to(com.paypal.oslo.feature.p2p.domain.constants.P2pConstants.Log.Attributes.FLOW_TYPE, autoReloadFlowType.name())), null, 4, null);
            Camera2StreamConfigurationMap(distributionViewModel, screenState, autoReloadFlowType);
        }
    }

    public static final /* synthetic */ void access$handlePrimaryButtonForAutoReload(com.paypal.oslo.feature.smartroute.ui.viewmodel.DistributionViewModel distributionViewModel, com.paypal.oslo.feature.smartroute.ui.mvi.DistributionState distributionState) {
        com.paypal.oslo.feature.smartroute.domain.model.AutoReloadFlowType autoReloadFlowType;
        com.paypal.oslo.feature.smartroute.ui.mvi.DistributionState.Content content = distributionState instanceof com.paypal.oslo.feature.smartroute.ui.mvi.DistributionState.Content ? (com.paypal.oslo.feature.smartroute.ui.mvi.DistributionState.Content) distributionState : null;
        if (content != null) {
            com.paypal.oslo.feature.smartroute.ui.model.DistributionScreenState screenState = content.getScreenState();
            if (screenState.getHasAutoReloadToggleChanged()) {
                if (com.paypal.oslo.feature.smartroute.ui.model.DistributionUiModelsKt.shouldShowSavingsOnboarding(screenState)) {
                    com.paypal.android.logger.Logger.d$default(com.paypal.oslo.feature.smartroute.LoggerKt.log, "Savings onboarding needed - skipping auto-reload flow", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to(com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.LogConstants.OPERATION, "SAVINGS_ONBOARDING_REQUIRED")), null, 4, null);
                    return;
                }
                if (screenState.getAutoReload().isEnabled()) {
                    autoReloadFlowType = com.paypal.oslo.feature.smartroute.domain.model.AutoReloadFlowType.SETUP;
                } else {
                    autoReloadFlowType = com.paypal.oslo.feature.smartroute.domain.model.AutoReloadFlowType.DEACTIVATE;
                }
                if (autoReloadFlowType == com.paypal.oslo.feature.smartroute.domain.model.AutoReloadFlowType.SETUP && screenState.getStatus() == com.paypal.oslo.feature.smartroute.api.model.SmartRouteStatus.INACTIVE && screenState.isZeroPercentConfiguration()) {
                    distributionViewModel.processEvent$smart_route_prodRelease(com.paypal.oslo.feature.smartroute.ui.mvi.DistributionEvent.SystemEvent.ZeroPercentAutoReloadBlocked.INSTANCE);
                } else {
                    com.paypal.android.logger.Logger.d$default(com.paypal.oslo.feature.smartroute.LoggerKt.log, "Auto-reload toggle changed, initiating flow", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to(com.paypal.oslo.feature.p2p.domain.constants.P2pConstants.Log.Attributes.FLOW_TYPE, autoReloadFlowType.name()), kotlin.TuplesKt.to("status", screenState.getStatus().name())), null, 4, null);
                    Camera2StreamConfigurationMap(distributionViewModel, screenState, autoReloadFlowType);
                }
            }
        }
    }
}
