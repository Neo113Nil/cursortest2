package com.paypal.oslo.feature.inappcheckout.ui.card.viewmodel;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.inappcheckout.ui.card.viewmodel.CardFormViewModel$emitEffect$1", f = "CardFormViewModel.kt", i = {}, l = {com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_ACCOUNT_CIRCLE_VALUE}, m = "invokeSuspend", n = {}, nl = {224}, s = {}, v = 2)
/* loaded from: classes13.dex */
final class CardFormViewModel$emitEffect$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ com.paypal.oslo.feature.inappcheckout.ui.card.contract.CardFormContract.Effect Camera2StreamConfigurationMap;
    int getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ com.paypal.oslo.feature.inappcheckout.ui.card.viewmodel.CardFormViewModel getHighSpeedVideoFpsRanges;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        kotlinx.coroutines.flow.MutableSharedFlow mutableSharedFlow;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.getHighResolutionOutputSizeshNQ4ISI;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            mutableSharedFlow = this.getHighSpeedVideoFpsRanges.getInputFormats;
            this.getHighResolutionOutputSizeshNQ4ISI = 1;
            if (mutableSharedFlow.emit(this.Camera2StreamConfigurationMap, this) == coroutine_suspended) {
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
        return ((com.paypal.oslo.feature.inappcheckout.ui.card.viewmodel.CardFormViewModel$emitEffect$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.paypal.oslo.feature.inappcheckout.ui.card.viewmodel.CardFormViewModel$emitEffect$1(this.getHighSpeedVideoFpsRanges, this.Camera2StreamConfigurationMap, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    CardFormViewModel$emitEffect$1(com.paypal.oslo.feature.inappcheckout.ui.card.viewmodel.CardFormViewModel cardFormViewModel, com.paypal.oslo.feature.inappcheckout.ui.card.contract.CardFormContract.Effect effect, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.inappcheckout.ui.card.viewmodel.CardFormViewModel$emitEffect$1> continuation) {
        super(2, continuation);
        this.getHighSpeedVideoFpsRanges = cardFormViewModel;
        this.Camera2StreamConfigurationMap = effect;
    }
}
