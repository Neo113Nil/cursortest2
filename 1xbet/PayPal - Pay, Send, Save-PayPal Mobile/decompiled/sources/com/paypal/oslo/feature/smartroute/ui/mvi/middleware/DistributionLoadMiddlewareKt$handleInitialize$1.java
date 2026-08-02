package com.paypal.oslo.feature.smartroute.ui.mvi.middleware;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.smartroute.ui.mvi.middleware.DistributionLoadMiddlewareKt$handleInitialize$1", f = "DistributionLoadMiddleware.kt", i = {}, l = {87}, m = "invokeSuspend", n = {}, nl = {174}, s = {}, v = 2)
/* loaded from: classes15.dex */
final class DistributionLoadMiddlewareKt$handleInitialize$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ com.paypal.oslo.feature.smartroute.ui.viewmodel.DistributionViewModel Camera2StreamConfigurationMap;
    final /* synthetic */ int getHighSpeedVideoFpsRanges;
    int getHighSpeedVideoFpsRangesFor;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.getHighSpeedVideoFpsRangesFor;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            this.getHighSpeedVideoFpsRangesFor = 1;
            obj = this.Camera2StreamConfigurationMap.getUseCases().getGetConfiguration().invoke(this);
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
        com.paypal.oslo.feature.smartroute.ui.viewmodel.DistributionViewModel distributionViewModel = this.Camera2StreamConfigurationMap;
        int i2 = this.getHighSpeedVideoFpsRanges;
        if (either instanceof arrow.core.Either.Right) {
            com.paypal.oslo.feature.smartroute.domain.model.DistributionConfiguration distributionConfiguration = (com.paypal.oslo.feature.smartroute.domain.model.DistributionConfiguration) ((arrow.core.Either.Right) either).getValue();
            if (!distributionConfiguration.getHasAvailableTargets()) {
                com.paypal.android.logger.Logger.w$default(com.paypal.oslo.feature.smartroute.LoggerKt.log, "No eligible accounts available for Smart Route", null, null, 6, null);
                distributionViewModel.processEvent$smart_route_prodRelease(new com.paypal.oslo.feature.smartroute.ui.mvi.DistributionEvent.SystemEvent.LoadFailed("No eligible accounts available", 2));
                return kotlin.Unit.INSTANCE;
            }
            com.paypal.android.logger.Logger.i$default(com.paypal.oslo.feature.smartroute.LoggerKt.log, "Configuration loaded successfully", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to(com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.LogConstants.OPERATION, "LOAD"), kotlin.TuplesKt.to("status", distributionConfiguration.getStatus().name()), kotlin.TuplesKt.to("autoReloadEnabled", kotlin.coroutines.jvm.internal.Boxing.boxBoolean(distributionConfiguration.getAutoReloadEnabled())), kotlin.TuplesKt.to("savingsPercentage", kotlin.coroutines.jvm.internal.Boxing.boxFloat(distributionConfiguration.getSavingsPercentage())), kotlin.TuplesKt.to("cryptoPercentage", kotlin.coroutines.jvm.internal.Boxing.boxFloat(distributionConfiguration.getCryptoPercentage()))), null, 4, null);
            distributionViewModel.processEvent$smart_route_prodRelease(new com.paypal.oslo.feature.smartroute.ui.mvi.DistributionEvent.SystemEvent.ConfigurationLoaded(distributionViewModel.getMapper().toScreenState(distributionConfiguration)));
        } else if (either instanceof arrow.core.Either.Left) {
            com.paypal.oslo.feature.smartroute.domain.error.DistributionError distributionError = (com.paypal.oslo.feature.smartroute.domain.error.DistributionError) ((arrow.core.Either.Left) either).getValue();
            com.paypal.android.logger.Logger.w$default(com.paypal.oslo.feature.smartroute.LoggerKt.log, "Configuration load failed", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("errorType", kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(distributionError.getClass()).getSimpleName())), null, 4, null);
            distributionViewModel.processEvent$smart_route_prodRelease(new com.paypal.oslo.feature.smartroute.ui.mvi.DistributionEvent.SystemEvent.LoadFailed(distributionError.getMessage(), i2));
        } else {
            throw new kotlin.NoWhenBranchMatchedException();
        }
        return kotlin.Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((com.paypal.oslo.feature.smartroute.ui.mvi.middleware.DistributionLoadMiddlewareKt$handleInitialize$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.paypal.oslo.feature.smartroute.ui.mvi.middleware.DistributionLoadMiddlewareKt$handleInitialize$1(this.Camera2StreamConfigurationMap, this.getHighSpeedVideoFpsRanges, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    DistributionLoadMiddlewareKt$handleInitialize$1(com.paypal.oslo.feature.smartroute.ui.viewmodel.DistributionViewModel distributionViewModel, int i, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.smartroute.ui.mvi.middleware.DistributionLoadMiddlewareKt$handleInitialize$1> continuation) {
        super(2, continuation);
        this.Camera2StreamConfigurationMap = distributionViewModel;
        this.getHighSpeedVideoFpsRanges = i;
    }
}
