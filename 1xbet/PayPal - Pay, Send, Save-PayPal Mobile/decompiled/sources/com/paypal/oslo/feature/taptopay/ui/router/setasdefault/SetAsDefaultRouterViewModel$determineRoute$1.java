package com.paypal.oslo.feature.taptopay.ui.router.setasdefault;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.taptopay.ui.router.setasdefault.SetAsDefaultRouterViewModel$determineRoute$1", f = "SetAsDefaultRouterViewModel.kt", i = {}, l = {54}, m = "invokeSuspend", n = {}, nl = {89}, s = {}, v = 2)
/* loaded from: classes15.dex */
final class SetAsDefaultRouterViewModel$determineRoute$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ com.paypal.oslo.feature.taptopay.ui.router.setasdefault.SetAsDefaultRouterViewModel getHighSpeedVideoFpsRanges;
    int getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        com.paypal.oslo.feature.taptopay.domain.usecase.card.paypal.PayPalGetAllCardsUseCase payPalGetAllCardsUseCase;
        kotlinx.coroutines.flow.MutableStateFlow mutableStateFlow;
        com.paypal.oslo.feature.taptopay.ui.core.util.PayLaterExpiryChecker payLaterExpiryChecker;
        com.paypal.oslo.feature.taptopay.domain.usecase.payment.paypal.PayPalIsDefaultPaymentAppUseCase payPalIsDefaultPaymentAppUseCase;
        kotlinx.coroutines.flow.MutableStateFlow mutableStateFlow2;
        kotlinx.coroutines.flow.MutableStateFlow mutableStateFlow3;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.getHighSpeedVideoSizes;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            com.paypal.android.logger.Logger.d$default(com.paypal.oslo.feature.taptopay.LoggerKt.log, "SetAsDefaultRouter: Determining route for set-as-default deeplink", null, null, 6, null);
            payPalGetAllCardsUseCase = this.getHighSpeedVideoFpsRanges.getHighSpeedVideoFpsRangesFor;
            this.getHighSpeedVideoSizes = 1;
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
        com.paypal.oslo.feature.taptopay.ui.router.setasdefault.SetAsDefaultRouterViewModel setAsDefaultRouterViewModel = this.getHighSpeedVideoFpsRanges;
        if (either instanceof arrow.core.Either.Right) {
            java.util.List list = (java.util.List) ((arrow.core.Either.Right) either).getValue();
            payLaterExpiryChecker = setAsDefaultRouterViewModel.getHighResolutionOutputSizeshNQ4ISI;
            com.paypal.android.logger.Logger.d$default(com.paypal.oslo.feature.taptopay.LoggerKt.log, "SetAsDefaultRouter: Found cards", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("totalCards", kotlin.coroutines.jvm.internal.Boxing.boxInt(list.size())), kotlin.TuplesKt.to("activeCards", kotlin.coroutines.jvm.internal.Boxing.boxInt(com.paypal.oslo.feature.taptopay.ui.setup.flow.model.CardExtensionsKt.filterActivePayPal(list, payLaterExpiryChecker).size()))), null, 4, null);
            if (!r0.isEmpty()) {
                payPalIsDefaultPaymentAppUseCase = this.getHighSpeedVideoFpsRanges.Camera2StreamConfigurationMap;
                boolean invoke = payPalIsDefaultPaymentAppUseCase.invoke();
                com.paypal.android.logger.Logger.d$default(com.paypal.oslo.feature.taptopay.LoggerKt.log, "SetAsDefaultRouter: Checking default app status", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("isDefaultApp", kotlin.coroutines.jvm.internal.Boxing.boxBoolean(invoke))), null, 4, null);
                if (invoke) {
                    com.paypal.android.logger.Logger.i$default(com.paypal.oslo.feature.taptopay.LoggerKt.log, "SetAsDefaultRouter: Already default payment app, navigating to PayMode", null, null, 6, null);
                    mutableStateFlow3 = this.getHighSpeedVideoFpsRanges.getHighSpeedVideoSizes;
                    mutableStateFlow3.setValue(com.paypal.oslo.feature.taptopay.ui.router.setasdefault.SetAsDefaultRoutingState.PayMode.INSTANCE);
                } else {
                    com.paypal.android.logger.Logger.i$default(com.paypal.oslo.feature.taptopay.LoggerKt.log, "SetAsDefaultRouter: Not default payment app, navigating to ChooseDefaultPayment", null, null, 6, null);
                    mutableStateFlow2 = this.getHighSpeedVideoFpsRanges.getHighSpeedVideoSizes;
                    mutableStateFlow2.setValue(com.paypal.oslo.feature.taptopay.ui.router.setasdefault.SetAsDefaultRoutingState.ChooseDefaultPayment.INSTANCE);
                }
                return kotlin.Unit.INSTANCE;
            }
        } else if (either instanceof arrow.core.Either.Left) {
            com.paypal.android.logger.Logger.w$default(com.paypal.oslo.feature.taptopay.LoggerKt.log, "SetAsDefaultRouter: Failed to get cards", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("error", ((com.paypal.oslo.feature.taptopay.domain.model.card.paypal.PayPalGetAllCardsError) ((arrow.core.Either.Left) either).getValue()).toString())), null, 4, null);
        } else {
            throw new kotlin.NoWhenBranchMatchedException();
        }
        com.paypal.android.logger.Logger.i$default(com.paypal.oslo.feature.taptopay.LoggerKt.log, "SetAsDefaultRouter: No active cards, navigating to SetupFlow", null, null, 6, null);
        mutableStateFlow = this.getHighSpeedVideoFpsRanges.getHighSpeedVideoSizes;
        mutableStateFlow.setValue(com.paypal.oslo.feature.taptopay.ui.router.setasdefault.SetAsDefaultRoutingState.SetupFlow.INSTANCE);
        return kotlin.Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((com.paypal.oslo.feature.taptopay.ui.router.setasdefault.SetAsDefaultRouterViewModel$determineRoute$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.paypal.oslo.feature.taptopay.ui.router.setasdefault.SetAsDefaultRouterViewModel$determineRoute$1(this.getHighSpeedVideoFpsRanges, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SetAsDefaultRouterViewModel$determineRoute$1(com.paypal.oslo.feature.taptopay.ui.router.setasdefault.SetAsDefaultRouterViewModel setAsDefaultRouterViewModel, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.taptopay.ui.router.setasdefault.SetAsDefaultRouterViewModel$determineRoute$1> continuation) {
        super(2, continuation);
        this.getHighSpeedVideoFpsRanges = setAsDefaultRouterViewModel;
    }
}
