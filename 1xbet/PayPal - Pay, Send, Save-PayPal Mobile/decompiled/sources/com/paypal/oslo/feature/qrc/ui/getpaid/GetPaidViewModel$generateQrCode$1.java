package com.paypal.oslo.feature.qrc.ui.getpaid;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.qrc.ui.getpaid.GetPaidViewModel$generateQrCode$1", f = "GetPaidViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, nl = {}, s = {}, v = 2)
/* loaded from: classes14.dex */
final class GetPaidViewModel$generateQrCode$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ com.paypal.oslo.feature.qrc.ui.getpaid.GetPaidUiModel Camera2StreamConfigurationMap;
    final /* synthetic */ com.paypal.oslo.feature.qrc.ui.getpaid.GetPaidViewModel getHighResolutionOutputSizeshNQ4ISI;
    int getHighSpeedVideoFpsRangesFor;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        com.paypal.oslo.feature.qrc.domain.usecase.LoadPayPalLogoBitmapUseCase loadPayPalLogoBitmapUseCase;
        com.paypal.oslo.feature.qrc.domain.usecase.GenerateQrCodeUseCase generateQrCodeUseCase;
        com.paypal.oslo.core.mvi.MviStateStore mviStateStore;
        kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.getHighSpeedVideoFpsRangesFor == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            loadPayPalLogoBitmapUseCase = this.getHighResolutionOutputSizeshNQ4ISI.getHighSpeedVideoSizes;
            android.graphics.Bitmap invoke = loadPayPalLogoBitmapUseCase.invoke();
            generateQrCodeUseCase = this.getHighResolutionOutputSizeshNQ4ISI.getHighSpeedVideoFpsRanges;
            android.graphics.Bitmap invoke$default = com.paypal.oslo.feature.qrc.domain.usecase.GenerateQrCodeUseCase.invoke$default(generateQrCodeUseCase, this.Camera2StreamConfigurationMap.getQrCodeData(), invoke, 0, 4, null);
            if (invoke$default != null) {
                mviStateStore = this.getHighResolutionOutputSizeshNQ4ISI.getHighSpeedVideoFpsRangesFor;
                mviStateStore.onEvent(new com.paypal.oslo.feature.qrc.ui.getpaid.GetPaidEvent.QrCodeGenerated(invoke$default));
            }
            return kotlin.Unit.INSTANCE;
        }
        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((com.paypal.oslo.feature.qrc.ui.getpaid.GetPaidViewModel$generateQrCode$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.paypal.oslo.feature.qrc.ui.getpaid.GetPaidViewModel$generateQrCode$1(this.getHighResolutionOutputSizeshNQ4ISI, this.Camera2StreamConfigurationMap, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    GetPaidViewModel$generateQrCode$1(com.paypal.oslo.feature.qrc.ui.getpaid.GetPaidViewModel getPaidViewModel, com.paypal.oslo.feature.qrc.ui.getpaid.GetPaidUiModel getPaidUiModel, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.qrc.ui.getpaid.GetPaidViewModel$generateQrCode$1> continuation) {
        super(2, continuation);
        this.getHighResolutionOutputSizeshNQ4ISI = getPaidViewModel;
        this.Camera2StreamConfigurationMap = getPaidUiModel;
    }
}
