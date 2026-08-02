package com.paypal.oslo.feature.balance.ui.autoReload;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.balance.ui.autoReload.AutoReloadViewModel$turnOffAutoTransfer$1", f = "AutoReloadViewModel.kt", i = {}, l = {com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_WALLET_VALUE}, m = "invokeSuspend", n = {}, nl = {193}, s = {}, v = 2)
/* loaded from: classes11.dex */
final class AutoReloadViewModel$turnOffAutoTransfer$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ com.paypal.oslo.feature.balance.ui.autoReload.AutoReloadViewModel Camera2StreamConfigurationMap;
    int getHighSpeedVideoFpsRanges;
    final /* synthetic */ com.paypal.oslo.core.mvi.MviStateStore.Middleware.Input<com.paypal.oslo.feature.balance.ui.autoReload.AutoReloadState, com.paypal.oslo.feature.balance.ui.autoReload.AutoReloadIntent> getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        com.paypal.oslo.feature.balance.domain.usecase.autoreload.TurnOffAutoTransferUseCase turnOffAutoTransferUseCase;
        com.paypal.oslo.feature.balance.domain.model.autoreload.BalanceAutoTransfer balanceAutoTransfer;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.getHighSpeedVideoFpsRanges;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            turnOffAutoTransferUseCase = this.Camera2StreamConfigurationMap.getHighSpeedVideoSizes;
            balanceAutoTransfer = this.Camera2StreamConfigurationMap.getInputSizeshNQ4ISI;
            this.getHighSpeedVideoFpsRanges = 1;
            obj = turnOffAutoTransferUseCase.invoke(balanceAutoTransfer.getCurrencyCode(), this);
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
        com.paypal.oslo.core.mvi.MviStateStore.Middleware.Input<com.paypal.oslo.feature.balance.ui.autoReload.AutoReloadState, com.paypal.oslo.feature.balance.ui.autoReload.AutoReloadIntent> input = this.getHighSpeedVideoSizes;
        com.paypal.oslo.feature.balance.ui.autoReload.AutoReloadViewModel autoReloadViewModel = this.Camera2StreamConfigurationMap;
        if (ior instanceof arrow.core.Ior.Left) {
            input.getEventDispatcher().invoke(new com.paypal.oslo.feature.balance.ui.autoReload.AutoReloadIntent.LoadError((com.paypal.oslo.feature.balance.domain.error.AutoReloadError) ((arrow.core.Ior.Left) ior).getValue()));
        } else if (ior instanceof arrow.core.Ior.Right) {
            kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(input.getScope(), null, null, new com.paypal.oslo.feature.balance.ui.autoReload.AutoReloadViewModel$fetchInitialAutoReloadConfig$1(autoReloadViewModel, input, null), 3, null);
        } else if (ior instanceof arrow.core.Ior.Both) {
            arrow.core.Ior.Both both = (arrow.core.Ior.Both) ior;
            java.lang.Object leftValue = both.getLeftValue();
            kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(input.getScope(), null, null, new com.paypal.oslo.feature.balance.ui.autoReload.AutoReloadViewModel$fetchInitialAutoReloadConfig$1(autoReloadViewModel, input, null), 3, null);
        } else {
            throw new kotlin.NoWhenBranchMatchedException();
        }
        return kotlin.Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((com.paypal.oslo.feature.balance.ui.autoReload.AutoReloadViewModel$turnOffAutoTransfer$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.paypal.oslo.feature.balance.ui.autoReload.AutoReloadViewModel$turnOffAutoTransfer$1(this.Camera2StreamConfigurationMap, this.getHighSpeedVideoSizes, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AutoReloadViewModel$turnOffAutoTransfer$1(com.paypal.oslo.feature.balance.ui.autoReload.AutoReloadViewModel autoReloadViewModel, com.paypal.oslo.core.mvi.MviStateStore.Middleware.Input<com.paypal.oslo.feature.balance.ui.autoReload.AutoReloadState, com.paypal.oslo.feature.balance.ui.autoReload.AutoReloadIntent> input, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.balance.ui.autoReload.AutoReloadViewModel$turnOffAutoTransfer$1> continuation) {
        super(2, continuation);
        this.Camera2StreamConfigurationMap = autoReloadViewModel;
        this.getHighSpeedVideoSizes = input;
    }
}
