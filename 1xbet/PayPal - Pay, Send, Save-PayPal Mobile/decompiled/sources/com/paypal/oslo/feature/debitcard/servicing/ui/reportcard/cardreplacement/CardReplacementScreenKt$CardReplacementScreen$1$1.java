package com.paypal.oslo.feature.debitcard.servicing.ui.reportcard.cardreplacement;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, d2 = {"<anonymous>", "", "result", "Lcom/paypal/oslo/feature/debitcard/servicing/navigation/result/ShippingAddressNavResult;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.debitcard.servicing.ui.reportcard.cardreplacement.CardReplacementScreenKt$CardReplacementScreen$1$1", f = "CardReplacementScreen.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, nl = {}, s = {}, v = 2)
/* loaded from: classes12.dex */
final class CardReplacementScreenKt$CardReplacementScreen$1$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<com.paypal.oslo.feature.debitcard.servicing.navigation.result.ShippingAddressNavResult, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    int Camera2StreamConfigurationMap;
    final /* synthetic */ com.paypal.oslo.feature.debitcard.servicing.ui.reportcard.cardreplacement.viewmodel.CardReplacementViewModel getHighSpeedVideoFpsRanges;
    /* synthetic */ java.lang.Object getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        com.paypal.oslo.feature.debitcard.servicing.navigation.result.ShippingAddressNavResult shippingAddressNavResult = (com.paypal.oslo.feature.debitcard.servicing.navigation.result.ShippingAddressNavResult) this.getHighSpeedVideoSizes;
        kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.Camera2StreamConfigurationMap != 0) {
            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        kotlin.ResultKt.throwOnFailure(obj);
        if (shippingAddressNavResult.getAddressId().length() > 0) {
            this.getHighSpeedVideoFpsRanges.processEvent(new com.paypal.oslo.feature.debitcard.servicing.ui.reportcard.cardreplacement.mvi.CardReplacementEvent.AddressChanged(shippingAddressNavResult.getAddressId(), shippingAddressNavResult.getDisplayAddress()));
        }
        return kotlin.Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(com.paypal.oslo.feature.debitcard.servicing.navigation.result.ShippingAddressNavResult shippingAddressNavResult, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((com.paypal.oslo.feature.debitcard.servicing.ui.reportcard.cardreplacement.CardReplacementScreenKt$CardReplacementScreen$1$1) create(shippingAddressNavResult, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        com.paypal.oslo.feature.debitcard.servicing.ui.reportcard.cardreplacement.CardReplacementScreenKt$CardReplacementScreen$1$1 cardReplacementScreenKt$CardReplacementScreen$1$1 = new com.paypal.oslo.feature.debitcard.servicing.ui.reportcard.cardreplacement.CardReplacementScreenKt$CardReplacementScreen$1$1(this.getHighSpeedVideoFpsRanges, continuation);
        cardReplacementScreenKt$CardReplacementScreen$1$1.getHighSpeedVideoSizes = obj;
        return cardReplacementScreenKt$CardReplacementScreen$1$1;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    CardReplacementScreenKt$CardReplacementScreen$1$1(com.paypal.oslo.feature.debitcard.servicing.ui.reportcard.cardreplacement.viewmodel.CardReplacementViewModel cardReplacementViewModel, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.debitcard.servicing.ui.reportcard.cardreplacement.CardReplacementScreenKt$CardReplacementScreen$1$1> continuation) {
        super(2, continuation);
        this.getHighSpeedVideoFpsRanges = cardReplacementViewModel;
    }
}
