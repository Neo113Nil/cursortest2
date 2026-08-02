package com.paypal.oslo.feature.wallet.preferred.ui.online;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.wallet.preferred.ui.online.OnlinePaymentViewModel$loadData$1", f = "OnlinePaymentViewModel.kt", i = {}, l = {110}, m = "invokeSuspend", n = {}, nl = {112}, s = {}, v = 2)
/* loaded from: classes16.dex */
final class OnlinePaymentViewModel$loadData$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ com.paypal.oslo.feature.wallet.preferred.ui.online.OnlinePaymentViewModel Camera2StreamConfigurationMap;
    int getHighResolutionOutputSizeshNQ4ISI;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        com.paypal.oslo.feature.wallet.preferred.domain.usecase.online.GetOnlinePaymentDataUseCase getOnlinePaymentDataUseCase;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.getHighResolutionOutputSizeshNQ4ISI;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            this.Camera2StreamConfigurationMap.getHighSpeedVideoFpsRanges.setValue(com.paypal.oslo.feature.wallet.preferred.ui.online.OnlinePaymentViewModel.UiState.Loading.INSTANCE);
            getOnlinePaymentDataUseCase = this.Camera2StreamConfigurationMap.getHighResolutionOutputSizeshNQ4ISI;
            this.getHighResolutionOutputSizeshNQ4ISI = 1;
            obj = kotlinx.coroutines.flow.FlowKt.first(getOnlinePaymentDataUseCase.invoke(), this);
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
        com.paypal.oslo.feature.wallet.preferred.ui.online.OnlinePaymentViewModel onlinePaymentViewModel = this.Camera2StreamConfigurationMap;
        if (ior instanceof arrow.core.Ior.Left) {
            com.paypal.oslo.feature.wallet.preferred.domain.model.online.OnlinePaymentError onlinePaymentError = (com.paypal.oslo.feature.wallet.preferred.domain.model.online.OnlinePaymentError) ((arrow.core.Ior.Left) ior).getValue();
            com.paypal.android.logger.Logger.w$default(com.paypal.oslo.feature.wallet.LoggerKt.log, "Failed to load online payment data", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("error", onlinePaymentError.toString())), null, 4, null);
            onlinePaymentViewModel.getHighSpeedVideoFpsRanges.setValue(com.paypal.oslo.feature.wallet.preferred.ui.online.OnlinePaymentViewModel.access$toErrorUiState(onlinePaymentViewModel, onlinePaymentError));
        } else if (ior instanceof arrow.core.Ior.Right) {
            onlinePaymentViewModel.getHighSpeedVideoFpsRanges.setValue(new com.paypal.oslo.feature.wallet.preferred.ui.online.OnlinePaymentViewModel.UiState.Content(com.paypal.oslo.feature.wallet.preferred.ui.online.OnlinePaymentViewModel.access$toScreenState(onlinePaymentViewModel, (com.paypal.oslo.feature.wallet.preferred.domain.model.online.OnlinePaymentPreference) ((arrow.core.Ior.Right) ior).getValue())));
        } else if (ior instanceof arrow.core.Ior.Both) {
            arrow.core.Ior.Both both = (arrow.core.Ior.Both) ior;
            java.lang.Object leftValue = both.getLeftValue();
            onlinePaymentViewModel.getHighSpeedVideoFpsRanges.setValue(new com.paypal.oslo.feature.wallet.preferred.ui.online.OnlinePaymentViewModel.UiState.Content(com.paypal.oslo.feature.wallet.preferred.ui.online.OnlinePaymentViewModel.access$toScreenState(onlinePaymentViewModel, (com.paypal.oslo.feature.wallet.preferred.domain.model.online.OnlinePaymentPreference) both.getRightValue())));
        } else {
            throw new kotlin.NoWhenBranchMatchedException();
        }
        return kotlin.Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((com.paypal.oslo.feature.wallet.preferred.ui.online.OnlinePaymentViewModel$loadData$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.paypal.oslo.feature.wallet.preferred.ui.online.OnlinePaymentViewModel$loadData$1(this.Camera2StreamConfigurationMap, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    OnlinePaymentViewModel$loadData$1(com.paypal.oslo.feature.wallet.preferred.ui.online.OnlinePaymentViewModel onlinePaymentViewModel, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.wallet.preferred.ui.online.OnlinePaymentViewModel$loadData$1> continuation) {
        super(2, continuation);
        this.Camera2StreamConfigurationMap = onlinePaymentViewModel;
    }
}
