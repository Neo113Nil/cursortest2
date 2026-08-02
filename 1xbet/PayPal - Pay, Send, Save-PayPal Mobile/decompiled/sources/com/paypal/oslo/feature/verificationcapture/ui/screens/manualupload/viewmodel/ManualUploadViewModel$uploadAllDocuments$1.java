package com.paypal.oslo.feature.verificationcapture.ui.screens.manualupload.viewmodel;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.verificationcapture.ui.screens.manualupload.viewmodel.ManualUploadViewModel", f = "ManualUploadViewModel.kt", i = {0, 0, 0, 0, 0, 0, 0}, l = {com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_MD_ERROR_ATTEMPT_01_VALUE}, m = "uploadAllDocuments", n = {"currentState", "documents", "documentSide", "tempFiles", "metadata", "documentType", "hasUnuploadedDocuments"}, nl = {com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_BALANCE_BEAM_01_VALUE}, s = {"L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "I$0"}, v = 2)
/* loaded from: classes15.dex */
final class ManualUploadViewModel$uploadAllDocuments$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    java.lang.Object Camera2StreamConfigurationMap;
    int getHighResolutionOutputSizeshNQ4ISI;
    java.lang.Object getHighSpeedVideoFpsRanges;
    java.lang.Object getHighSpeedVideoFpsRangesFor;
    java.lang.Object getHighSpeedVideoSizes;
    java.lang.Object getHighSpeedVideoSizesFor;
    /* synthetic */ java.lang.Object getInputFormats;
    final /* synthetic */ com.paypal.oslo.feature.verificationcapture.ui.screens.manualupload.viewmodel.ManualUploadViewModel getInputSizeshNQ4ISI;
    int getOutputFormats;
    java.lang.Object getOutputMinFrameDuration;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object highSpeedVideoSizes;
        this.getInputFormats = obj;
        this.getOutputFormats |= Integer.MIN_VALUE;
        highSpeedVideoSizes = this.getInputSizeshNQ4ISI.getHighSpeedVideoSizes((kotlin.coroutines.Continuation<? super kotlin.Unit>) this);
        return highSpeedVideoSizes;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ManualUploadViewModel$uploadAllDocuments$1(com.paypal.oslo.feature.verificationcapture.ui.screens.manualupload.viewmodel.ManualUploadViewModel manualUploadViewModel, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.verificationcapture.ui.screens.manualupload.viewmodel.ManualUploadViewModel$uploadAllDocuments$1> continuation) {
        super(continuation);
        this.getInputSizeshNQ4ISI = manualUploadViewModel;
    }
}
