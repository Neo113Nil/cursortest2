package com.paypal.oslo.feature.cashin.ui.barcode.viewmodel;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "Lcom/paypal/oslo/feature/cashin/domain/usecase/DebitCardEligibility;", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.cashin.ui.barcode.viewmodel.BarcodeViewModel$fetchActivationDetails$1$1$eligibilityDeferred$1", f = "BarcodeViewModel.kt", i = {}, l = {114}, m = "invokeSuspend", n = {}, nl = {-1}, s = {}, v = 2)
/* loaded from: classes11.dex */
final class BarcodeViewModel$fetchActivationDetails$1$1$eligibilityDeferred$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.cashin.domain.usecase.DebitCardEligibility>, java.lang.Object> {
    int Camera2StreamConfigurationMap;
    final /* synthetic */ com.paypal.oslo.feature.cashin.ui.barcode.viewmodel.BarcodeViewModel getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        com.paypal.oslo.feature.cashin.domain.usecase.GetDebitCardEligibilityUseCase getDebitCardEligibilityUseCase;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.Camera2StreamConfigurationMap;
        if (i != 0) {
            if (i != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
            return obj;
        }
        kotlin.ResultKt.throwOnFailure(obj);
        getDebitCardEligibilityUseCase = this.getHighSpeedVideoSizes.getHighSpeedVideoSizes;
        this.Camera2StreamConfigurationMap = 1;
        java.lang.Object invoke = getDebitCardEligibilityUseCase.invoke(this);
        return invoke == coroutine_suspended ? coroutine_suspended : invoke;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.cashin.domain.usecase.DebitCardEligibility> continuation) {
        return ((com.paypal.oslo.feature.cashin.ui.barcode.viewmodel.BarcodeViewModel$fetchActivationDetails$1$1$eligibilityDeferred$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.paypal.oslo.feature.cashin.ui.barcode.viewmodel.BarcodeViewModel$fetchActivationDetails$1$1$eligibilityDeferred$1(this.getHighSpeedVideoSizes, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    BarcodeViewModel$fetchActivationDetails$1$1$eligibilityDeferred$1(com.paypal.oslo.feature.cashin.ui.barcode.viewmodel.BarcodeViewModel barcodeViewModel, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.cashin.ui.barcode.viewmodel.BarcodeViewModel$fetchActivationDetails$1$1$eligibilityDeferred$1> continuation) {
        super(2, continuation);
        this.getHighSpeedVideoSizes = barcodeViewModel;
    }
}
