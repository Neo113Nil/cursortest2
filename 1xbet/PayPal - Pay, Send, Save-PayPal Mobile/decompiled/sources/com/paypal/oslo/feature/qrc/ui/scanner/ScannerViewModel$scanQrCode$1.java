package com.paypal.oslo.feature.qrc.ui.scanner;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.qrc.ui.scanner.ScannerViewModel$scanQrCode$1", f = "ScannerViewModel.kt", i = {0}, l = {com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_SIGNATURE_VALUE}, m = "invokeSuspend", n = {"request"}, nl = {256}, s = {"L$0"}, v = 2)
/* loaded from: classes14.dex */
final class ScannerViewModel$scanQrCode$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ com.paypal.oslo.feature.qrc.ui.scanner.ScannerViewModel Camera2StreamConfigurationMap;
    int getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ java.lang.String getHighSpeedVideoFpsRangesFor;
    java.lang.Object getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        com.paypal.oslo.feature.qrc.domain.usecase.ScanQrCodeUseCase scanQrCodeUseCase;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.getHighResolutionOutputSizeshNQ4ISI;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            com.paypal.oslo.feature.qrc.domain.model.scanner.ScannedData scannedData = new com.paypal.oslo.feature.qrc.domain.model.scanner.ScannedData(this.getHighSpeedVideoFpsRangesFor, null, null, null, 14, null);
            scanQrCodeUseCase = this.Camera2StreamConfigurationMap.getHighSpeedVideoFpsRanges;
            this.getHighSpeedVideoSizes = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(scannedData);
            this.getHighResolutionOutputSizeshNQ4ISI = 1;
            obj = scanQrCodeUseCase.invoke(scannedData, this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        arrow.core.Either either = ((arrow.core.Ior) obj).toEither();
        com.paypal.oslo.feature.qrc.ui.scanner.ScannerViewModel scannerViewModel = this.Camera2StreamConfigurationMap;
        if (either instanceof arrow.core.Either.Right) {
            scannerViewModel.handleIntent(com.paypal.oslo.feature.qrc.ui.scanner.ScannerViewModel.access$handleSessionResultAction(scannerViewModel, (com.paypal.oslo.feature.qrc.domain.session.QrcSessionResultAction.Action) ((arrow.core.Either.Right) either).getValue()));
        } else if (either instanceof arrow.core.Either.Left) {
            com.paypal.oslo.feature.qrc.ui.scanner.ScannerViewModel.access$handlePollingError(scannerViewModel, (com.paypal.oslo.feature.qrc.domain.session.QrcSessionResultAction.Error) ((arrow.core.Either.Left) either).getValue());
        } else {
            throw new kotlin.NoWhenBranchMatchedException();
        }
        return kotlin.Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((com.paypal.oslo.feature.qrc.ui.scanner.ScannerViewModel$scanQrCode$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.paypal.oslo.feature.qrc.ui.scanner.ScannerViewModel$scanQrCode$1(this.getHighSpeedVideoFpsRangesFor, this.Camera2StreamConfigurationMap, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ScannerViewModel$scanQrCode$1(java.lang.String str, com.paypal.oslo.feature.qrc.ui.scanner.ScannerViewModel scannerViewModel, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.qrc.ui.scanner.ScannerViewModel$scanQrCode$1> continuation) {
        super(2, continuation);
        this.getHighSpeedVideoFpsRangesFor = str;
        this.Camera2StreamConfigurationMap = scannerViewModel;
    }
}
