package com.paypal.oslo.feature.taptopay.ui.paymode.viewmodel;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.taptopay.ui.paymode.viewmodel.PayModeViewModel$onReAuthResult$1", f = "PayModeViewModel.kt", i = {}, l = {com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_PLAID_CHECK_LOGO_NAVBAR_LIGHT_APPEARANCE_VALUE}, m = "invokeSuspend", n = {}, nl = {com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_EXIT_BRUSHSTROKE_VALUE}, s = {}, v = 2)
/* loaded from: classes15.dex */
final class PayModeViewModel$onReAuthResult$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ boolean getHighResolutionOutputSizeshNQ4ISI;
    int getHighSpeedVideoFpsRangesFor;
    final /* synthetic */ com.paypal.oslo.feature.taptopay.ui.paymode.viewmodel.PayModeViewModel getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        kotlinx.coroutines.flow.MutableStateFlow mutableStateFlow;
        kotlinx.coroutines.flow.MutableStateFlow mutableStateFlow2;
        kotlinx.coroutines.flow.MutableStateFlow mutableStateFlow3;
        kotlinx.coroutines.flow.MutableSharedFlow mutableSharedFlow;
        com.paypal.oslo.feature.taptopay.domain.model.payment.PaymentState.Success.AuthenticationRequired pendingAuthState;
        kotlin.jvm.functions.Function1<java.lang.Boolean, kotlin.Unit> authenticated;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.getHighSpeedVideoFpsRangesFor;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            com.paypal.android.logger.Logger.d$default(com.paypal.oslo.feature.taptopay.LoggerKt.log, "Re-auth result: success=".concat(java.lang.String.valueOf(this.getHighResolutionOutputSizeshNQ4ISI)), null, null, 6, null);
            mutableStateFlow = this.getHighSpeedVideoSizes.getOutputSizes;
            com.paypal.oslo.feature.taptopay.ui.paymode.model.PayModeDataState payModeDataState = (com.paypal.oslo.feature.taptopay.ui.paymode.model.PayModeDataState) mutableStateFlow.getValue();
            if (payModeDataState != null && (pendingAuthState = payModeDataState.getPendingAuthState()) != null && (authenticated = pendingAuthState.getAuthenticated()) != null) {
                authenticated.invoke(kotlin.coroutines.jvm.internal.Boxing.boxBoolean(this.getHighResolutionOutputSizeshNQ4ISI));
            }
            mutableStateFlow2 = this.getHighSpeedVideoSizes.getOutputSizes;
            mutableStateFlow3 = this.getHighSpeedVideoSizes.getOutputSizes;
            com.paypal.oslo.feature.taptopay.ui.paymode.model.PayModeDataState payModeDataState2 = (com.paypal.oslo.feature.taptopay.ui.paymode.model.PayModeDataState) mutableStateFlow3.getValue();
            mutableStateFlow2.setValue(payModeDataState2 != null ? com.paypal.oslo.feature.taptopay.ui.paymode.model.PayModeDataState.copy$default(payModeDataState2, null, null, null, 0, null, null, null, 63, null) : null);
            if (!this.getHighResolutionOutputSizeshNQ4ISI) {
                com.paypal.android.logger.Logger.d$default(com.paypal.oslo.feature.taptopay.LoggerKt.log, "Authentication failed - dismissing pay mode", null, null, 6, null);
                mutableSharedFlow = this.getHighSpeedVideoSizes.getOutputMinFrameDurationlomOqCM;
                this.getHighSpeedVideoFpsRangesFor = 1;
                if (mutableSharedFlow.emit(com.paypal.oslo.feature.taptopay.ui.paymode.model.PayModeEvents.DismissPayModeEvent.INSTANCE, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
        } else {
            if (i != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        return kotlin.Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((com.paypal.oslo.feature.taptopay.ui.paymode.viewmodel.PayModeViewModel$onReAuthResult$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.paypal.oslo.feature.taptopay.ui.paymode.viewmodel.PayModeViewModel$onReAuthResult$1(this.getHighResolutionOutputSizeshNQ4ISI, this.getHighSpeedVideoSizes, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    PayModeViewModel$onReAuthResult$1(boolean z, com.paypal.oslo.feature.taptopay.ui.paymode.viewmodel.PayModeViewModel payModeViewModel, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.taptopay.ui.paymode.viewmodel.PayModeViewModel$onReAuthResult$1> continuation) {
        super(2, continuation);
        this.getHighResolutionOutputSizeshNQ4ISI = z;
        this.getHighSpeedVideoSizes = payModeViewModel;
    }
}
