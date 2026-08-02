package com.paypal.oslo.feature.debitcard.servicing.ui.managesecondarycard;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, d2 = {"<anonymous>", "", "it", "Lcom/paypal/oslo/feature/debitcard/servicing/navigation/result/DebitCardWebViewSuccessNavResult$CardholderAdded;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.debitcard.servicing.ui.managesecondarycard.ManageSecondaryCardHolderScreenKt$ManageSecondaryCardHolderScreen$1$1", f = "ManageSecondaryCardHolderScreen.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, nl = {}, s = {}, v = 2)
/* loaded from: classes12.dex */
final class ManageSecondaryCardHolderScreenKt$ManageSecondaryCardHolderScreen$1$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<com.paypal.oslo.feature.debitcard.servicing.navigation.result.DebitCardWebViewSuccessNavResult.CardholderAdded, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ com.paypal.oslo.feature.debitcard.servicing.ui.managesecondarycard.viewmodel.ManageSecondaryCardHolderViewModel Camera2StreamConfigurationMap;
    int getHighSpeedVideoFpsRangesFor;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.getHighSpeedVideoFpsRangesFor != 0) {
            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        kotlin.ResultKt.throwOnFailure(obj);
        this.Camera2StreamConfigurationMap.processEvent(com.paypal.oslo.feature.debitcard.servicing.ui.managesecondarycard.mvi.ManageSecondaryCardEvent.LoadInstruments.INSTANCE);
        return kotlin.Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(com.paypal.oslo.feature.debitcard.servicing.navigation.result.DebitCardWebViewSuccessNavResult.CardholderAdded cardholderAdded, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((com.paypal.oslo.feature.debitcard.servicing.ui.managesecondarycard.ManageSecondaryCardHolderScreenKt$ManageSecondaryCardHolderScreen$1$1) create(cardholderAdded, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.paypal.oslo.feature.debitcard.servicing.ui.managesecondarycard.ManageSecondaryCardHolderScreenKt$ManageSecondaryCardHolderScreen$1$1(this.Camera2StreamConfigurationMap, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ManageSecondaryCardHolderScreenKt$ManageSecondaryCardHolderScreen$1$1(com.paypal.oslo.feature.debitcard.servicing.ui.managesecondarycard.viewmodel.ManageSecondaryCardHolderViewModel manageSecondaryCardHolderViewModel, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.debitcard.servicing.ui.managesecondarycard.ManageSecondaryCardHolderScreenKt$ManageSecondaryCardHolderScreen$1$1> continuation) {
        super(2, continuation);
        this.Camera2StreamConfigurationMap = manageSecondaryCardHolderViewModel;
    }
}
