package com.paypal.oslo.feature.debitcard.servicing.ui.requestphysicalcard;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, d2 = {"<anonymous>", "", "addressResult", "Lcom/paypal/oslo/feature/debitcard/servicing/navigation/result/ShippingAddressNavResult;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.debitcard.servicing.ui.requestphysicalcard.RequestPhysicalCardScreenKt$HandleAwaitingState$2$1", f = "RequestPhysicalCardScreen.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, nl = {}, s = {}, v = 2)
/* loaded from: classes12.dex */
final class RequestPhysicalCardScreenKt$HandleAwaitingState$2$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<com.paypal.oslo.feature.debitcard.servicing.navigation.result.ShippingAddressNavResult, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    int Camera2StreamConfigurationMap;
    final /* synthetic */ kotlin.jvm.functions.Function1<com.paypal.oslo.feature.debitcard.servicing.ui.requestphysicalcard.mvi.RequestPhysicalCardEvent, kotlin.Unit> getHighSpeedVideoFpsRangesFor;
    /* synthetic */ java.lang.Object getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        com.paypal.oslo.feature.debitcard.servicing.navigation.result.ShippingAddressNavResult shippingAddressNavResult = (com.paypal.oslo.feature.debitcard.servicing.navigation.result.ShippingAddressNavResult) this.getHighSpeedVideoSizes;
        kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.Camera2StreamConfigurationMap != 0) {
            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        kotlin.ResultKt.throwOnFailure(obj);
        if (shippingAddressNavResult.getAddressId().length() == 0) {
            this.getHighSpeedVideoFpsRangesFor.invoke(com.paypal.oslo.feature.debitcard.servicing.ui.requestphysicalcard.mvi.RequestPhysicalCardEvent.FlowCancelled.INSTANCE);
        } else {
            this.getHighSpeedVideoFpsRangesFor.invoke(new com.paypal.oslo.feature.debitcard.servicing.ui.requestphysicalcard.mvi.RequestPhysicalCardEvent.AddressSelectionSuccessful(shippingAddressNavResult.getAddressId()));
        }
        return kotlin.Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(com.paypal.oslo.feature.debitcard.servicing.navigation.result.ShippingAddressNavResult shippingAddressNavResult, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((com.paypal.oslo.feature.debitcard.servicing.ui.requestphysicalcard.RequestPhysicalCardScreenKt$HandleAwaitingState$2$1) create(shippingAddressNavResult, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        com.paypal.oslo.feature.debitcard.servicing.ui.requestphysicalcard.RequestPhysicalCardScreenKt$HandleAwaitingState$2$1 requestPhysicalCardScreenKt$HandleAwaitingState$2$1 = new com.paypal.oslo.feature.debitcard.servicing.ui.requestphysicalcard.RequestPhysicalCardScreenKt$HandleAwaitingState$2$1(this.getHighSpeedVideoFpsRangesFor, continuation);
        requestPhysicalCardScreenKt$HandleAwaitingState$2$1.getHighSpeedVideoSizes = obj;
        return requestPhysicalCardScreenKt$HandleAwaitingState$2$1;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    RequestPhysicalCardScreenKt$HandleAwaitingState$2$1(kotlin.jvm.functions.Function1<? super com.paypal.oslo.feature.debitcard.servicing.ui.requestphysicalcard.mvi.RequestPhysicalCardEvent, kotlin.Unit> function1, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.debitcard.servicing.ui.requestphysicalcard.RequestPhysicalCardScreenKt$HandleAwaitingState$2$1> continuation) {
        super(2, continuation);
        this.getHighSpeedVideoFpsRangesFor = function1;
    }
}
