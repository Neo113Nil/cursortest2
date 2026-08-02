package com.paypal.oslo.feature.taptopay.ui.router.paymode;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.taptopay.ui.router.paymode.PayModeRouterViewModel$determineRoute$1", f = "PayModeRouterViewModel.kt", i = {}, l = {51}, m = "invokeSuspend", n = {}, nl = {77}, s = {}, v = 2)
/* loaded from: classes15.dex */
final class PayModeRouterViewModel$determineRoute$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    int Camera2StreamConfigurationMap;
    final /* synthetic */ com.paypal.oslo.feature.taptopay.ui.router.paymode.PayModeRouterViewModel getHighSpeedVideoFpsRanges;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        com.paypal.oslo.feature.taptopay.domain.usecase.card.paypal.PayPalGetAllCardsUseCase payPalGetAllCardsUseCase;
        kotlinx.coroutines.flow.MutableStateFlow mutableStateFlow;
        com.paypal.oslo.feature.taptopay.ui.core.util.PayLaterExpiryChecker payLaterExpiryChecker;
        kotlinx.coroutines.flow.MutableStateFlow mutableStateFlow2;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.Camera2StreamConfigurationMap;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            com.paypal.android.logger.Logger.d$default(com.paypal.oslo.feature.taptopay.LoggerKt.log, "PayModeRouter: Determining route for pay mode", null, null, 6, null);
            payPalGetAllCardsUseCase = this.getHighSpeedVideoFpsRanges.Camera2StreamConfigurationMap;
            this.Camera2StreamConfigurationMap = 1;
            obj = com.paypal.oslo.feature.taptopay.domain.usecase.card.paypal.PayPalGetAllCardsUseCase.invoke$default(payPalGetAllCardsUseCase, false, false, this, 3, null);
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
        com.paypal.oslo.feature.taptopay.ui.router.paymode.PayModeRouterViewModel payModeRouterViewModel = this.getHighSpeedVideoFpsRanges;
        if (either instanceof arrow.core.Either.Right) {
            java.util.List list = (java.util.List) ((arrow.core.Either.Right) either).getValue();
            payLaterExpiryChecker = payModeRouterViewModel.getHighSpeedVideoFpsRanges;
            com.paypal.android.logger.Logger.d$default(com.paypal.oslo.feature.taptopay.LoggerKt.log, "PayModeRouter: Found cards", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("totalCards", kotlin.coroutines.jvm.internal.Boxing.boxInt(list.size())), kotlin.TuplesKt.to("activeCards", kotlin.coroutines.jvm.internal.Boxing.boxInt(com.paypal.oslo.feature.taptopay.ui.setup.flow.model.CardExtensionsKt.filterActivePayPal(list, payLaterExpiryChecker).size()))), null, 4, null);
            if (!r0.isEmpty()) {
                com.paypal.android.logger.Logger.i$default(com.paypal.oslo.feature.taptopay.LoggerKt.log, "PayModeRouter: Active cards found, launching Pay Mode", null, null, 6, null);
                mutableStateFlow2 = this.getHighSpeedVideoFpsRanges.getHighResolutionOutputSizeshNQ4ISI;
                mutableStateFlow2.setValue(com.paypal.oslo.feature.taptopay.ui.router.paymode.PayModeRoutingState.PayMode.INSTANCE);
                return kotlin.Unit.INSTANCE;
            }
        } else if (either instanceof arrow.core.Either.Left) {
            com.paypal.android.logger.Logger.w$default(com.paypal.oslo.feature.taptopay.LoggerKt.log, "PayModeRouter: Failed to get cards", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("error", ((com.paypal.oslo.feature.taptopay.domain.model.card.paypal.PayPalGetAllCardsError) ((arrow.core.Either.Left) either).getValue()).toString())), null, 4, null);
        } else {
            throw new kotlin.NoWhenBranchMatchedException();
        }
        com.paypal.android.logger.Logger.i$default(com.paypal.oslo.feature.taptopay.LoggerKt.log, "PayModeRouter: No active cards, navigating to SetupFlow", null, null, 6, null);
        mutableStateFlow = this.getHighSpeedVideoFpsRanges.getHighResolutionOutputSizeshNQ4ISI;
        mutableStateFlow.setValue(com.paypal.oslo.feature.taptopay.ui.router.paymode.PayModeRoutingState.SetupFlow.INSTANCE);
        return kotlin.Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((com.paypal.oslo.feature.taptopay.ui.router.paymode.PayModeRouterViewModel$determineRoute$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.paypal.oslo.feature.taptopay.ui.router.paymode.PayModeRouterViewModel$determineRoute$1(this.getHighSpeedVideoFpsRanges, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    PayModeRouterViewModel$determineRoute$1(com.paypal.oslo.feature.taptopay.ui.router.paymode.PayModeRouterViewModel payModeRouterViewModel, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.taptopay.ui.router.paymode.PayModeRouterViewModel$determineRoute$1> continuation) {
        super(2, continuation);
        this.getHighSpeedVideoFpsRanges = payModeRouterViewModel;
    }
}
