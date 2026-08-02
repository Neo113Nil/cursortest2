package com.paypal.oslo.feature.cashin.ui.barcode.viewmodel;

@kotlin.Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001*\u00020\u0004H\n"}, d2 = {"<anonymous>", "Larrow/core/Either;", "Lcom/paypal/oslo/feature/cashin/domain/error/CashInError;", "Lcom/paypal/oslo/feature/cashin/domain/model/CashInActivationDetails;", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.cashin.ui.barcode.viewmodel.BarcodeViewModel$fetchActivationDetails$1$1$activationDeferred$1", f = "BarcodeViewModel.kt", i = {}, l = {109}, m = "invokeSuspend", n = {}, nl = {112}, s = {}, v = 2)
/* loaded from: classes11.dex */
final class BarcodeViewModel$fetchActivationDetails$1$1$activationDeferred$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super arrow.core.Either<? extends com.paypal.oslo.feature.cashin.domain.error.CashInError, ? extends com.paypal.oslo.feature.cashin.domain.model.CashInActivationDetails>>, java.lang.Object> {
    final /* synthetic */ com.paypal.oslo.feature.cashin.ui.barcode.viewmodel.BarcodeViewModel Camera2StreamConfigurationMap;
    final /* synthetic */ com.paypal.oslo.feature.cashin.ui.barcode.viewmodel.BarcodeViewModel.LoadContext getHighSpeedVideoFpsRanges;
    int getHighSpeedVideoFpsRangesFor;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        com.paypal.oslo.feature.cashin.domain.usecase.GetCashInActivationDetailsUseCase getCashInActivationDetailsUseCase;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.getHighSpeedVideoFpsRangesFor;
        if (i != 0) {
            if (i != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
            return obj;
        }
        kotlin.ResultKt.throwOnFailure(obj);
        getCashInActivationDetailsUseCase = this.Camera2StreamConfigurationMap.getHighResolutionOutputSizeshNQ4ISI;
        this.getHighSpeedVideoFpsRangesFor = 1;
        java.lang.Object invoke = getCashInActivationDetailsUseCase.invoke(this.getHighSpeedVideoFpsRanges.Camera2StreamConfigurationMap, this.getHighSpeedVideoFpsRanges.getHighSpeedVideoFpsRangesFor, this);
        return invoke == coroutine_suspended ? coroutine_suspended : invoke;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super arrow.core.Either<? extends com.paypal.oslo.feature.cashin.domain.error.CashInError, ? extends com.paypal.oslo.feature.cashin.domain.model.CashInActivationDetails>> continuation) {
        return ((com.paypal.oslo.feature.cashin.ui.barcode.viewmodel.BarcodeViewModel$fetchActivationDetails$1$1$activationDeferred$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.paypal.oslo.feature.cashin.ui.barcode.viewmodel.BarcodeViewModel$fetchActivationDetails$1$1$activationDeferred$1(this.Camera2StreamConfigurationMap, this.getHighSpeedVideoFpsRanges, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    BarcodeViewModel$fetchActivationDetails$1$1$activationDeferred$1(com.paypal.oslo.feature.cashin.ui.barcode.viewmodel.BarcodeViewModel barcodeViewModel, com.paypal.oslo.feature.cashin.ui.barcode.viewmodel.BarcodeViewModel.LoadContext loadContext, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.cashin.ui.barcode.viewmodel.BarcodeViewModel$fetchActivationDetails$1$1$activationDeferred$1> continuation) {
        super(2, continuation);
        this.Camera2StreamConfigurationMap = barcodeViewModel;
        this.getHighSpeedVideoFpsRanges = loadContext;
    }
}
