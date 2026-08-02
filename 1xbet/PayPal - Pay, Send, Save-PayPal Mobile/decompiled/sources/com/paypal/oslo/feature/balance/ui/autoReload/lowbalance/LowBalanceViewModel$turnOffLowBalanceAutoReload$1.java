package com.paypal.oslo.feature.balance.ui.autoReload.lowbalance;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.balance.ui.autoReload.lowbalance.LowBalanceViewModel$turnOffLowBalanceAutoReload$1", f = "LowBalanceViewModel.kt", i = {}, l = {com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_ALERT_WARNING_VALUE}, m = "invokeSuspend", n = {}, nl = {com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_ARROW_DOWN_VALUE}, s = {}, v = 2)
/* loaded from: classes11.dex */
final class LowBalanceViewModel$turnOffLowBalanceAutoReload$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    int Camera2StreamConfigurationMap;
    final /* synthetic */ com.paypal.oslo.feature.balance.ui.autoReload.lowbalance.LowBalanceViewModel getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ com.paypal.oslo.core.mvi.MviStateStore.Middleware.Input<com.paypal.oslo.feature.balance.ui.autoReload.lowbalance.LowBalanceStateStore, com.paypal.oslo.feature.balance.ui.autoReload.lowbalance.LowBalanceEvent> getHighSpeedVideoFpsRanges;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        com.paypal.oslo.feature.balance.domain.usecase.autoreload.TurnOffLowBalanceAutoReloadUseCase turnOffLowBalanceAutoReloadUseCase;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.Camera2StreamConfigurationMap;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            turnOffLowBalanceAutoReloadUseCase = this.getHighResolutionOutputSizeshNQ4ISI.Camera2StreamConfigurationMap;
            this.Camera2StreamConfigurationMap = 1;
            obj = turnOffLowBalanceAutoReloadUseCase.invoke(this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        arrow.core.Ior ior = (arrow.core.Ior) obj;
        com.paypal.oslo.core.mvi.MviStateStore.Middleware.Input<com.paypal.oslo.feature.balance.ui.autoReload.lowbalance.LowBalanceStateStore, com.paypal.oslo.feature.balance.ui.autoReload.lowbalance.LowBalanceEvent> input = this.getHighSpeedVideoFpsRanges;
        com.paypal.oslo.feature.balance.ui.autoReload.lowbalance.LowBalanceViewModel lowBalanceViewModel = this.getHighResolutionOutputSizeshNQ4ISI;
        if (ior instanceof arrow.core.Ior.Left) {
            input.getEventDispatcher().invoke(com.paypal.oslo.feature.balance.ui.autoReload.lowbalance.LowBalanceEvent.OnTurnOffError.INSTANCE);
        } else if (ior instanceof arrow.core.Ior.Right) {
            com.paypal.oslo.feature.balance.ui.autoReload.lowbalance.LowBalanceViewModel.access$onTurnOffResult(lowBalanceViewModel, ((com.paypal.oslo.feature.balance.domain.model.autoreload.AutoReloadDisableResult) ((arrow.core.Ior.Right) ior).getValue()).getSuccess(), input);
        } else if (ior instanceof arrow.core.Ior.Both) {
            arrow.core.Ior.Both both = (arrow.core.Ior.Both) ior;
            com.paypal.oslo.feature.balance.ui.autoReload.lowbalance.LowBalanceViewModel.access$onTurnOffResult(lowBalanceViewModel, ((com.paypal.oslo.feature.balance.domain.model.autoreload.AutoReloadDisableResult) both.getRightValue()).getSuccess(), input);
        } else {
            throw new kotlin.NoWhenBranchMatchedException();
        }
        return kotlin.Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((com.paypal.oslo.feature.balance.ui.autoReload.lowbalance.LowBalanceViewModel$turnOffLowBalanceAutoReload$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.paypal.oslo.feature.balance.ui.autoReload.lowbalance.LowBalanceViewModel$turnOffLowBalanceAutoReload$1(this.getHighResolutionOutputSizeshNQ4ISI, this.getHighSpeedVideoFpsRanges, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    LowBalanceViewModel$turnOffLowBalanceAutoReload$1(com.paypal.oslo.feature.balance.ui.autoReload.lowbalance.LowBalanceViewModel lowBalanceViewModel, com.paypal.oslo.core.mvi.MviStateStore.Middleware.Input<com.paypal.oslo.feature.balance.ui.autoReload.lowbalance.LowBalanceStateStore, com.paypal.oslo.feature.balance.ui.autoReload.lowbalance.LowBalanceEvent> input, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.balance.ui.autoReload.lowbalance.LowBalanceViewModel$turnOffLowBalanceAutoReload$1> continuation) {
        super(2, continuation);
        this.getHighResolutionOutputSizeshNQ4ISI = lowBalanceViewModel;
        this.getHighSpeedVideoFpsRanges = input;
    }
}
