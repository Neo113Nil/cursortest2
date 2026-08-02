package com.paypal.oslo.feature.smartroute.ui.mvi.middleware;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.smartroute.ui.mvi.middleware.DistributionSaveMiddlewareKt$executeTurnOffWithAutoReloadDeactivation$1", f = "DistributionSaveMiddleware.kt", i = {1, 1, 1, 1, 1}, l = {181, 204}, m = "invokeSuspend", n = {"this_$iv", "it", "turnOffConfig", "$i$f$fold", "$i$a$-fold-DistributionSaveMiddlewareKt$executeTurnOffWithAutoReloadDeactivation$1$2"}, nl = {com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_PLAID_LOGO_ONLY_VALUE, com.plaid.internal.EnumC0527g.SDK_ASSET_LOADING_INDICATOR_VALUE}, s = {"L$0", "L$2", "L$3", "I$0", "I$1"}, v = 2)
/* loaded from: classes15.dex */
final class DistributionSaveMiddlewareKt$executeTurnOffWithAutoReloadDeactivation$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    int Camera2StreamConfigurationMap;
    final /* synthetic */ com.paypal.oslo.feature.smartroute.domain.model.DistributionConfiguration getHighResolutionOutputSizeshNQ4ISI;
    java.lang.Object getHighSpeedVideoFpsRanges;
    int getHighSpeedVideoFpsRangesFor;
    final /* synthetic */ com.paypal.oslo.feature.smartroute.ui.viewmodel.DistributionViewModel getHighSpeedVideoSizes;
    java.lang.Object getInputFormats;
    int getInputSizeshNQ4ISI;
    java.lang.Object getOutputFormats;
    java.lang.Object getOutputMinFrameDuration;

    /* JADX WARN: Code restructure failed: missing block: B:35:0x004e, code lost:
    
        if (r2 != r1) goto L12;
     */
    /* JADX WARN: Removed duplicated region for block: B:12:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x00b3  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object invoke;
        com.paypal.oslo.feature.smartroute.domain.model.DistributionConfiguration copy;
        java.lang.Object invoke2;
        com.paypal.oslo.feature.smartroute.ui.viewmodel.DistributionViewModel distributionViewModel;
        arrow.core.Either either;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.getInputSizeshNQ4ISI;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            this.getInputSizeshNQ4ISI = 1;
            invoke = this.getHighSpeedVideoSizes.getUseCases().getDeactivateAutoReload().invoke("balance", this);
        } else {
            if (i != 1) {
                if (i != 2) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                distributionViewModel = (com.paypal.oslo.feature.smartroute.ui.viewmodel.DistributionViewModel) this.getOutputMinFrameDuration;
                kotlin.ResultKt.throwOnFailure(obj);
                invoke2 = obj;
                either = (arrow.core.Either) invoke2;
                if (!(either instanceof arrow.core.Either.Right)) {
                    com.paypal.oslo.feature.smartroute.domain.usecase.SaveDistributionConfigurationUseCase.SaveResult saveResult = (com.paypal.oslo.feature.smartroute.domain.usecase.SaveDistributionConfigurationUseCase.SaveResult) ((arrow.core.Either.Right) either).getValue();
                    com.paypal.android.logger.Logger.i$default(com.paypal.oslo.feature.smartroute.LoggerKt.log, "Turn-off with auto-reload deactivation succeeded", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to(com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.LogConstants.OPERATION, "TURN_OFF")), null, 4, null);
                    distributionViewModel.processEvent$smart_route_prodRelease(new com.paypal.oslo.feature.smartroute.ui.mvi.DistributionEvent.SystemEvent.SaveSuccess(saveResult.getConfiguration(), com.paypal.oslo.feature.smartroute.domain.usecase.SaveDistributionConfigurationUseCase.ToastMessage.SmartRouteTurnedOffWithAutoReload.INSTANCE));
                } else if (either instanceof arrow.core.Either.Left) {
                    com.paypal.oslo.feature.smartroute.domain.error.DistributionError distributionError = (com.paypal.oslo.feature.smartroute.domain.error.DistributionError) ((arrow.core.Either.Left) either).getValue();
                    distributionViewModel.processEvent$smart_route_prodRelease(new com.paypal.oslo.feature.smartroute.ui.mvi.DistributionEvent.SystemEvent.SaveFailed(distributionError.getMessage(), distributionError instanceof com.paypal.oslo.feature.smartroute.domain.error.DistributionError.ValidationError ? (com.paypal.oslo.feature.smartroute.domain.error.DistributionError.ValidationError) distributionError : null));
                } else {
                    throw new kotlin.NoWhenBranchMatchedException();
                }
                return kotlin.Unit.INSTANCE;
            }
            kotlin.ResultKt.throwOnFailure(obj);
            invoke = obj;
        }
        arrow.core.Either either2 = (arrow.core.Either) invoke;
        com.paypal.oslo.feature.smartroute.ui.viewmodel.DistributionViewModel distributionViewModel2 = this.getHighSpeedVideoSizes;
        com.paypal.oslo.feature.smartroute.domain.model.DistributionConfiguration distributionConfiguration = this.getHighResolutionOutputSizeshNQ4ISI;
        if (!(either2 instanceof arrow.core.Either.Right)) {
            if (either2 instanceof arrow.core.Either.Left) {
                com.paypal.oslo.feature.smartroute.domain.error.AutoReloadError autoReloadError = (com.paypal.oslo.feature.smartroute.domain.error.AutoReloadError) ((arrow.core.Either.Left) either2).getValue();
                com.paypal.android.logger.Logger.w$default(com.paypal.oslo.feature.smartroute.LoggerKt.log, "Auto-reload deactivation failed during turn-off", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("errorType", kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(autoReloadError.getClass()).getSimpleName())), null, 4, null);
                distributionViewModel2.processEvent$smart_route_prodRelease(new com.paypal.oslo.feature.smartroute.ui.mvi.DistributionEvent.SystemEvent.SaveFailed(autoReloadError.getMessage(), null));
                return kotlin.Unit.INSTANCE;
            }
            throw new kotlin.NoWhenBranchMatchedException();
        }
        kotlin.Unit unit = (kotlin.Unit) ((arrow.core.Either.Right) either2).getValue();
        copy = distributionConfiguration.copy((r30 & 1) != 0 ? distributionConfiguration.status : com.paypal.oslo.feature.smartroute.api.model.SmartRouteStatus.INACTIVE, (r30 & 2) != 0 ? distributionConfiguration.savingsPercentage : 0.0f, (r30 & 4) != 0 ? distributionConfiguration.cryptoPercentage : 0.0f, (r30 & 8) != 0 ? distributionConfiguration.cryptoApyRate : null, (r30 & 16) != 0 ? distributionConfiguration.cryptoOptInStatus : null, (r30 & 32) != 0 ? distributionConfiguration.savingsApy : null, (r30 & 64) != 0 ? distributionConfiguration.autoReloadEnabled : false, (r30 & 128) != 0 ? distributionConfiguration.autoReloadThresholdAmount : null, (r30 & 256) != 0 ? distributionConfiguration.autoReloadAmount : null, (r30 & 512) != 0 ? distributionConfiguration.autoReloadCurrency : null, (r30 & 1024) != 0 ? distributionConfiguration.autoReloadFinancialInstrumentId : null, (r30 & 2048) != 0 ? distributionConfiguration.version : null, (r30 & 4096) != 0 ? distributionConfiguration.savingsEligibilityStatus : null, (r30 & 8192) != 0 ? distributionConfiguration.pyusdEligibilityStatus : null);
        com.paypal.oslo.feature.smartroute.domain.usecase.SaveDistributionConfigurationUseCase saveConfiguration = distributionViewModel2.getUseCases().getSaveConfiguration();
        this.getHighSpeedVideoFpsRanges = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(either2);
        this.getOutputMinFrameDuration = distributionViewModel2;
        this.getInputFormats = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(unit);
        this.getOutputFormats = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(copy);
        this.getHighSpeedVideoFpsRangesFor = 0;
        this.Camera2StreamConfigurationMap = 0;
        this.getInputSizeshNQ4ISI = 2;
        invoke2 = saveConfiguration.invoke(copy, this);
        if (invoke2 != coroutine_suspended) {
            distributionViewModel = distributionViewModel2;
            either = (arrow.core.Either) invoke2;
            if (!(either instanceof arrow.core.Either.Right)) {
            }
            return kotlin.Unit.INSTANCE;
        }
        return coroutine_suspended;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((com.paypal.oslo.feature.smartroute.ui.mvi.middleware.DistributionSaveMiddlewareKt$executeTurnOffWithAutoReloadDeactivation$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.paypal.oslo.feature.smartroute.ui.mvi.middleware.DistributionSaveMiddlewareKt$executeTurnOffWithAutoReloadDeactivation$1(this.getHighSpeedVideoSizes, this.getHighResolutionOutputSizeshNQ4ISI, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    DistributionSaveMiddlewareKt$executeTurnOffWithAutoReloadDeactivation$1(com.paypal.oslo.feature.smartroute.ui.viewmodel.DistributionViewModel distributionViewModel, com.paypal.oslo.feature.smartroute.domain.model.DistributionConfiguration distributionConfiguration, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.smartroute.ui.mvi.middleware.DistributionSaveMiddlewareKt$executeTurnOffWithAutoReloadDeactivation$1> continuation) {
        super(2, continuation);
        this.getHighSpeedVideoSizes = distributionViewModel;
        this.getHighResolutionOutputSizeshNQ4ISI = distributionConfiguration;
    }
}
