package com.paypal.oslo.feature.smartroute.ui.mvi.middleware;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.smartroute.ui.mvi.middleware.DistributionSaveMiddlewareKt$executeSave$1", f = "DistributionSaveMiddleware.kt", i = {}, l = {com.plaid.internal.EnumC0527g.SDK_ASSET_HEADER_ENABLE_TRANSFERS_VALUE}, m = "invokeSuspend", n = {}, nl = {com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_PLAID_LOGO_ONLY_VALUE}, s = {}, v = 2)
/* loaded from: classes15.dex */
final class DistributionSaveMiddlewareKt$executeSave$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ com.paypal.oslo.feature.smartroute.domain.model.DistributionConfiguration getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ com.paypal.oslo.feature.smartroute.ui.viewmodel.DistributionViewModel getHighSpeedVideoFpsRangesFor;
    int getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.getHighSpeedVideoSizes;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            this.getHighSpeedVideoSizes = 1;
            obj = this.getHighSpeedVideoFpsRangesFor.getUseCases().getSaveConfiguration().invoke(this.getHighResolutionOutputSizeshNQ4ISI, this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        arrow.core.Either either = (arrow.core.Either) obj;
        com.paypal.oslo.feature.smartroute.ui.viewmodel.DistributionViewModel distributionViewModel = this.getHighSpeedVideoFpsRangesFor;
        if (either instanceof arrow.core.Either.Right) {
            com.paypal.oslo.feature.smartroute.domain.usecase.SaveDistributionConfigurationUseCase.SaveResult saveResult = (com.paypal.oslo.feature.smartroute.domain.usecase.SaveDistributionConfigurationUseCase.SaveResult) ((arrow.core.Either.Right) either).getValue();
            com.paypal.android.logger.Logger.i$default(com.paypal.oslo.feature.smartroute.LoggerKt.log, "Save operation succeeded", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to(com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.LogConstants.OPERATION, "SAVE")), null, 4, null);
            distributionViewModel.processEvent$smart_route_prodRelease(new com.paypal.oslo.feature.smartroute.ui.mvi.DistributionEvent.SystemEvent.SaveSuccess(saveResult.getConfiguration(), saveResult.getToastMessage()));
        } else if (either instanceof arrow.core.Either.Left) {
            com.paypal.oslo.feature.smartroute.domain.error.DistributionError distributionError = (com.paypal.oslo.feature.smartroute.domain.error.DistributionError) ((arrow.core.Either.Left) either).getValue();
            com.paypal.android.logger.Logger.w$default(com.paypal.oslo.feature.smartroute.LoggerKt.log, "Save operation failed", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("errorType", kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(distributionError.getClass()).getSimpleName())), null, 4, null);
            distributionViewModel.processEvent$smart_route_prodRelease(new com.paypal.oslo.feature.smartroute.ui.mvi.DistributionEvent.SystemEvent.SaveFailed(distributionError.getMessage(), distributionError instanceof com.paypal.oslo.feature.smartroute.domain.error.DistributionError.ValidationError ? (com.paypal.oslo.feature.smartroute.domain.error.DistributionError.ValidationError) distributionError : null));
        } else {
            throw new kotlin.NoWhenBranchMatchedException();
        }
        return kotlin.Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((com.paypal.oslo.feature.smartroute.ui.mvi.middleware.DistributionSaveMiddlewareKt$executeSave$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.paypal.oslo.feature.smartroute.ui.mvi.middleware.DistributionSaveMiddlewareKt$executeSave$1(this.getHighSpeedVideoFpsRangesFor, this.getHighResolutionOutputSizeshNQ4ISI, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    DistributionSaveMiddlewareKt$executeSave$1(com.paypal.oslo.feature.smartroute.ui.viewmodel.DistributionViewModel distributionViewModel, com.paypal.oslo.feature.smartroute.domain.model.DistributionConfiguration distributionConfiguration, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.smartroute.ui.mvi.middleware.DistributionSaveMiddlewareKt$executeSave$1> continuation) {
        super(2, continuation);
        this.getHighSpeedVideoFpsRangesFor = distributionViewModel;
        this.getHighResolutionOutputSizeshNQ4ISI = distributionConfiguration;
    }
}
