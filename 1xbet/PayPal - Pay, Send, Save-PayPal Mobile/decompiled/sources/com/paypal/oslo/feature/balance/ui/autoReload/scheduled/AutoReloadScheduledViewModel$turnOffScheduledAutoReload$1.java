package com.paypal.oslo.feature.balance.ui.autoReload.scheduled;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.balance.ui.autoReload.scheduled.AutoReloadScheduledViewModel$turnOffScheduledAutoReload$1", f = "AutoReloadScheduledViewModel.kt", i = {}, l = {204}, m = "invokeSuspend", n = {}, nl = {205}, s = {}, v = 2)
/* loaded from: classes11.dex */
final class AutoReloadScheduledViewModel$turnOffScheduledAutoReload$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    int Camera2StreamConfigurationMap;
    final /* synthetic */ com.paypal.oslo.core.mvi.MviStateStore.Middleware.Input<com.paypal.oslo.feature.balance.ui.autoReload.scheduled.AutoReloadScheduledState, com.paypal.oslo.feature.balance.ui.autoReload.scheduled.AutoReloadScheduledIntent> getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ com.paypal.oslo.feature.balance.ui.autoReload.scheduled.AutoReloadScheduledViewModel getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        com.paypal.oslo.feature.balance.domain.usecase.autoreload.TurnOffScheduledAutoReloadUseCase turnOffScheduledAutoReloadUseCase;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.Camera2StreamConfigurationMap;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            turnOffScheduledAutoReloadUseCase = this.getHighSpeedVideoSizes.Camera2StreamConfigurationMap;
            this.Camera2StreamConfigurationMap = 1;
            obj = turnOffScheduledAutoReloadUseCase.invoke(this);
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
        com.paypal.oslo.core.mvi.MviStateStore.Middleware.Input<com.paypal.oslo.feature.balance.ui.autoReload.scheduled.AutoReloadScheduledState, com.paypal.oslo.feature.balance.ui.autoReload.scheduled.AutoReloadScheduledIntent> input = this.getHighResolutionOutputSizeshNQ4ISI;
        if (ior instanceof arrow.core.Ior.Left) {
            input.getEventDispatcher().invoke(com.paypal.oslo.feature.balance.ui.autoReload.scheduled.AutoReloadScheduledIntent.OnTurnOffError.INSTANCE);
        } else if (ior instanceof arrow.core.Ior.Right) {
            input.getEventDispatcher().invoke(com.paypal.oslo.feature.balance.ui.autoReload.scheduled.AutoReloadScheduledIntent.OnTurnOffSuccess.INSTANCE);
        } else if (ior instanceof arrow.core.Ior.Both) {
            arrow.core.Ior.Both both = (arrow.core.Ior.Both) ior;
            java.lang.Object leftValue = both.getLeftValue();
            input.getEventDispatcher().invoke(com.paypal.oslo.feature.balance.ui.autoReload.scheduled.AutoReloadScheduledIntent.OnTurnOffSuccess.INSTANCE);
        } else {
            throw new kotlin.NoWhenBranchMatchedException();
        }
        return kotlin.Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((com.paypal.oslo.feature.balance.ui.autoReload.scheduled.AutoReloadScheduledViewModel$turnOffScheduledAutoReload$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.paypal.oslo.feature.balance.ui.autoReload.scheduled.AutoReloadScheduledViewModel$turnOffScheduledAutoReload$1(this.getHighSpeedVideoSizes, this.getHighResolutionOutputSizeshNQ4ISI, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AutoReloadScheduledViewModel$turnOffScheduledAutoReload$1(com.paypal.oslo.feature.balance.ui.autoReload.scheduled.AutoReloadScheduledViewModel autoReloadScheduledViewModel, com.paypal.oslo.core.mvi.MviStateStore.Middleware.Input<com.paypal.oslo.feature.balance.ui.autoReload.scheduled.AutoReloadScheduledState, com.paypal.oslo.feature.balance.ui.autoReload.scheduled.AutoReloadScheduledIntent> input, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.balance.ui.autoReload.scheduled.AutoReloadScheduledViewModel$turnOffScheduledAutoReload$1> continuation) {
        super(2, continuation);
        this.getHighSpeedVideoSizes = autoReloadScheduledViewModel;
        this.getHighResolutionOutputSizeshNQ4ISI = input;
    }
}
