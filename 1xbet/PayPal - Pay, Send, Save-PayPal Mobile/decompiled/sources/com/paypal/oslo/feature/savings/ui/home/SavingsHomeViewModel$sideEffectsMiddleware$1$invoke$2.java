package com.paypal.oslo.feature.savings.ui.home;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.savings.ui.home.SavingsHomeViewModel$sideEffectsMiddleware$1$invoke$2", f = "SavingsHomeViewModel.kt", i = {}, l = {314}, m = "invokeSuspend", n = {}, nl = {315}, s = {}, v = 2)
/* loaded from: classes14.dex */
final class SavingsHomeViewModel$sideEffectsMiddleware$1$invoke$2 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    int Camera2StreamConfigurationMap;
    final /* synthetic */ com.paypal.oslo.feature.savings.ui.home.SavingsHomeViewModel$sideEffectsMiddleware$1 getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ com.paypal.oslo.core.mvi.MviStateStore.Middleware.Input<com.paypal.oslo.feature.savings.ui.home.SavingsHomeState, com.paypal.oslo.feature.savings.ui.home.SavingsHomeIntent> getHighSpeedVideoFpsRanges;
    final /* synthetic */ com.paypal.oslo.feature.savings.ui.home.SavingsHomeIntent getHighSpeedVideoFpsRangesFor;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.Camera2StreamConfigurationMap;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            this.Camera2StreamConfigurationMap = 1;
            if (com.paypal.oslo.feature.savings.ui.home.SavingsHomeViewModel$sideEffectsMiddleware$1.access$updateTaxStatementDeliveryPreference(this.getHighResolutionOutputSizeshNQ4ISI, this.getHighSpeedVideoFpsRanges, ((com.paypal.oslo.feature.savings.ui.home.SavingsHomeIntent.TaxStatementDeliveryPreferenceConfirmed) this.getHighSpeedVideoFpsRangesFor).getSelectedDigital(), ((com.paypal.oslo.feature.savings.ui.home.SavingsHomeIntent.TaxStatementDeliveryPreferenceConfirmed) this.getHighSpeedVideoFpsRangesFor).getSuccessMessage(), this) == coroutine_suspended) {
                return coroutine_suspended;
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
        return ((com.paypal.oslo.feature.savings.ui.home.SavingsHomeViewModel$sideEffectsMiddleware$1$invoke$2) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.paypal.oslo.feature.savings.ui.home.SavingsHomeViewModel$sideEffectsMiddleware$1$invoke$2(this.getHighResolutionOutputSizeshNQ4ISI, this.getHighSpeedVideoFpsRanges, this.getHighSpeedVideoFpsRangesFor, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SavingsHomeViewModel$sideEffectsMiddleware$1$invoke$2(com.paypal.oslo.feature.savings.ui.home.SavingsHomeViewModel$sideEffectsMiddleware$1 savingsHomeViewModel$sideEffectsMiddleware$1, com.paypal.oslo.core.mvi.MviStateStore.Middleware.Input<com.paypal.oslo.feature.savings.ui.home.SavingsHomeState, com.paypal.oslo.feature.savings.ui.home.SavingsHomeIntent> input, com.paypal.oslo.feature.savings.ui.home.SavingsHomeIntent savingsHomeIntent, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.savings.ui.home.SavingsHomeViewModel$sideEffectsMiddleware$1$invoke$2> continuation) {
        super(2, continuation);
        this.getHighResolutionOutputSizeshNQ4ISI = savingsHomeViewModel$sideEffectsMiddleware$1;
        this.getHighSpeedVideoFpsRanges = input;
        this.getHighSpeedVideoFpsRangesFor = savingsHomeIntent;
    }
}
