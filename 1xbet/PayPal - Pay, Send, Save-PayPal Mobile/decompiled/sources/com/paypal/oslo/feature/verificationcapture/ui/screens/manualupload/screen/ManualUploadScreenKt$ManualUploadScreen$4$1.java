package com.paypal.oslo.feature.verificationcapture.ui.screens.manualupload.screen;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.verificationcapture.ui.screens.manualupload.screen.ManualUploadScreenKt$ManualUploadScreen$4$1", f = "ManualUploadScreen.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, nl = {}, s = {}, v = 2)
/* loaded from: classes15.dex */
final class ManualUploadScreenKt$ManualUploadScreen$4$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ int Camera2StreamConfigurationMap;
    final /* synthetic */ java.lang.String getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ java.lang.String getHighSpeedVideoFpsRanges;
    final /* synthetic */ int getHighSpeedVideoFpsRangesFor;
    final /* synthetic */ com.paypal.oslo.feature.verificationcapture.ui.screens.manualupload.contract.CaptureMode getHighSpeedVideoSizes;
    final /* synthetic */ androidx.compose.runtime.State<com.paypal.oslo.feature.verificationcapture.ui.screens.manualupload.contract.ManualUploadUiState> getHighSpeedVideoSizesFor;
    int getInputFormats;
    final /* synthetic */ java.util.Map<java.lang.String, java.lang.String> getInputSizeshNQ4ISI;
    final /* synthetic */ com.paypal.oslo.feature.verificationcapture.ui.screens.manualupload.viewmodel.ManualUploadViewModel getOutputFormats;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.getInputFormats != 0) {
            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        kotlin.ResultKt.throwOnFailure(obj);
        com.paypal.android.logger.Logger logger = com.paypal.oslo.feature.verificationcapture.LoggerKt.log;
        java.lang.String simpleName = kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.verificationcapture.ui.screens.manualupload.screen.ManualUploadScreenKt.access$ManualUploadScreen$lambda$1(this.getHighSpeedVideoSizesFor).getClass()).getSimpleName();
        if (simpleName == null) {
            simpleName = "unknown";
        }
        com.paypal.android.logger.Logger.d$default(logger, "[ManualUploadScreen] LaunchedEffect initializing", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("current_state", simpleName)), null, 4, null);
        this.getOutputFormats.handleEvent(new com.paypal.oslo.feature.verificationcapture.ui.screens.manualupload.contract.ManualUploadEvent.Initialize(this.getHighSpeedVideoSizes, this.getHighSpeedVideoFpsRangesFor, this.Camera2StreamConfigurationMap, 0, null, this.getHighSpeedVideoFpsRanges, this.getHighResolutionOutputSizeshNQ4ISI, this.getInputSizeshNQ4ISI, 24, null));
        return kotlin.Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((com.paypal.oslo.feature.verificationcapture.ui.screens.manualupload.screen.ManualUploadScreenKt$ManualUploadScreen$4$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.paypal.oslo.feature.verificationcapture.ui.screens.manualupload.screen.ManualUploadScreenKt$ManualUploadScreen$4$1(this.getOutputFormats, this.getHighSpeedVideoSizes, this.getHighSpeedVideoFpsRangesFor, this.Camera2StreamConfigurationMap, this.getHighSpeedVideoFpsRanges, this.getHighResolutionOutputSizeshNQ4ISI, this.getInputSizeshNQ4ISI, this.getHighSpeedVideoSizesFor, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    ManualUploadScreenKt$ManualUploadScreen$4$1(com.paypal.oslo.feature.verificationcapture.ui.screens.manualupload.viewmodel.ManualUploadViewModel manualUploadViewModel, com.paypal.oslo.feature.verificationcapture.ui.screens.manualupload.contract.CaptureMode captureMode, int i, int i2, java.lang.String str, java.lang.String str2, java.util.Map<java.lang.String, java.lang.String> map, androidx.compose.runtime.State<? extends com.paypal.oslo.feature.verificationcapture.ui.screens.manualupload.contract.ManualUploadUiState> state, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.verificationcapture.ui.screens.manualupload.screen.ManualUploadScreenKt$ManualUploadScreen$4$1> continuation) {
        super(2, continuation);
        this.getOutputFormats = manualUploadViewModel;
        this.getHighSpeedVideoSizes = captureMode;
        this.getHighSpeedVideoFpsRangesFor = i;
        this.Camera2StreamConfigurationMap = i2;
        this.getHighSpeedVideoFpsRanges = str;
        this.getHighResolutionOutputSizeshNQ4ISI = str2;
        this.getInputSizeshNQ4ISI = map;
        this.getHighSpeedVideoSizesFor = state;
    }
}
