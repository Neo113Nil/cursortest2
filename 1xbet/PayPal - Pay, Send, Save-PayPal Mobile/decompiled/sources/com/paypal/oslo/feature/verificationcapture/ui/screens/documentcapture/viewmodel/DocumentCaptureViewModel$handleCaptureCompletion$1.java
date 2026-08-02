package com.paypal.oslo.feature.verificationcapture.ui.screens.documentcapture.viewmodel;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.verificationcapture.ui.screens.documentcapture.viewmodel.DocumentCaptureViewModel", f = "DocumentCaptureViewModel.kt", i = {0}, l = {com.plaid.internal.EnumC0527g.SDK_ASSET_INSTITUTION_CIRCLE_SOLID_VALUE}, m = "handleCaptureCompletion", n = {"eventDispatcher"}, nl = {com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_SUCCESS_CIRCLE_SOLID_VALUE}, s = {"L$0"}, v = 2)
/* loaded from: classes15.dex */
final class DocumentCaptureViewModel$handleCaptureCompletion$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    int Camera2StreamConfigurationMap;
    /* synthetic */ java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
    java.lang.Object getHighSpeedVideoFpsRanges;
    final /* synthetic */ com.paypal.oslo.feature.verificationcapture.ui.screens.documentcapture.viewmodel.DocumentCaptureViewModel getHighSpeedVideoFpsRangesFor;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.getHighResolutionOutputSizeshNQ4ISI = obj;
        this.Camera2StreamConfigurationMap |= Integer.MIN_VALUE;
        return com.paypal.oslo.feature.verificationcapture.ui.screens.documentcapture.viewmodel.DocumentCaptureViewModel.access$handleCaptureCompletion(this.getHighSpeedVideoFpsRangesFor, null, this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    DocumentCaptureViewModel$handleCaptureCompletion$1(com.paypal.oslo.feature.verificationcapture.ui.screens.documentcapture.viewmodel.DocumentCaptureViewModel documentCaptureViewModel, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.verificationcapture.ui.screens.documentcapture.viewmodel.DocumentCaptureViewModel$handleCaptureCompletion$1> continuation) {
        super(continuation);
        this.getHighSpeedVideoFpsRangesFor = documentCaptureViewModel;
    }
}
