package com.paypal.oslo.feature.verificationcapture.ui.screens.daonface;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.verificationcapture.ui.screens.daonface.DaonFaceLivenessViewModel$initialize$1", f = "DaonFaceLivenessViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, nl = {}, s = {}, v = 2)
/* loaded from: classes15.dex */
final class DaonFaceLivenessViewModel$initialize$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ android.content.Context Camera2StreamConfigurationMap;
    int getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ com.paypal.oslo.feature.verificationcapture.ui.screens.daonface.DaonFaceLivenessViewModel getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        kotlinx.coroutines.flow.MutableStateFlow mutableStateFlow;
        com.daon.sdk.face.DaonFace daonFace;
        com.daon.sdk.face.DaonFace daonFace2;
        com.paypal.oslo.feature.verificationcapture.ui.screens.daonface.DaonSensorCollector daonSensorCollector;
        kotlinx.coroutines.flow.MutableStateFlow mutableStateFlow2;
        kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.getHighResolutionOutputSizeshNQ4ISI != 0) {
            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        kotlin.ResultKt.throwOnFailure(obj);
        try {
            java.lang.String readLicense = com.paypal.oslo.feature.verificationcapture.ui.screens.daonface.DaonFaceConfig.INSTANCE.readLicense(this.Camera2StreamConfigurationMap);
            com.paypal.android.logger.Logger.i$default(com.paypal.oslo.feature.verificationcapture.ui.util.TempMaterial3CompatKt.getLog(), "[DaonFaceVM] License loaded successfully", null, null, 6, null);
            byte[] bytes = readLicense.getBytes(kotlin.text.Charsets.UTF_8);
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(bytes, "");
            java.io.ByteArrayInputStream byteArrayInputStream = new java.io.ByteArrayInputStream(bytes);
            this.getHighSpeedVideoSizes.getHighSpeedVideoSizes = new com.daon.sdk.face.DaonFace(this.Camera2StreamConfigurationMap, 3, byteArrayInputStream);
            daonFace = this.getHighSpeedVideoSizes.getHighSpeedVideoSizes;
            if (daonFace != null) {
                daonFace.setConsolidateResults(true);
            }
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putFloat(com.daon.sdk.face.Config.BLINK_THRESHOLD, 0.35f);
            daonFace2 = this.getHighSpeedVideoSizes.getHighSpeedVideoSizes;
            if (daonFace2 != null) {
                daonFace2.setConfiguration(bundle);
            }
            this.getHighSpeedVideoSizes.getHighSpeedVideoFpsRanges = new com.paypal.oslo.feature.verificationcapture.ui.screens.daonface.DaonSensorCollector(this.Camera2StreamConfigurationMap);
            daonSensorCollector = this.getHighSpeedVideoSizes.getHighSpeedVideoFpsRanges;
            if (daonSensorCollector != null) {
                daonSensorCollector.startMonitoring();
            }
            com.paypal.android.logger.Logger.i$default(com.paypal.oslo.feature.verificationcapture.ui.util.TempMaterial3CompatKt.getLog(), "[DaonFaceVM] Initialization complete", null, null, 6, null);
            mutableStateFlow2 = this.getHighSpeedVideoSizes.getOutputFormats;
            mutableStateFlow2.setValue(com.paypal.oslo.feature.verificationcapture.ui.screens.daonface.InitializationState.Success.INSTANCE);
        } catch (java.lang.Exception e) {
            com.paypal.android.logger.Logger log = com.paypal.oslo.feature.verificationcapture.ui.util.TempMaterial3CompatKt.getLog();
            java.lang.String message = e.getMessage();
            java.lang.String str = com.paypal.oslo.feature.settings.closeaccount.data.repository.CloseAccountRepositoryImpl.UNKNOWN_ERROR;
            if (message == null) {
                message = com.paypal.oslo.feature.settings.closeaccount.data.repository.CloseAccountRepositoryImpl.UNKNOWN_ERROR;
            }
            com.paypal.android.logger.Logger.e$default(log, "[DaonFaceVM] Initialization failed", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("error", message)), null, null, 12, null);
            mutableStateFlow = this.getHighSpeedVideoSizes.getOutputFormats;
            java.lang.String message2 = e.getMessage();
            if (message2 != null) {
                str = message2;
            }
            mutableStateFlow.setValue(new com.paypal.oslo.feature.verificationcapture.ui.screens.daonface.InitializationState.Error(str));
        }
        return kotlin.Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((com.paypal.oslo.feature.verificationcapture.ui.screens.daonface.DaonFaceLivenessViewModel$initialize$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.paypal.oslo.feature.verificationcapture.ui.screens.daonface.DaonFaceLivenessViewModel$initialize$1(this.Camera2StreamConfigurationMap, this.getHighSpeedVideoSizes, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    DaonFaceLivenessViewModel$initialize$1(android.content.Context context, com.paypal.oslo.feature.verificationcapture.ui.screens.daonface.DaonFaceLivenessViewModel daonFaceLivenessViewModel, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.verificationcapture.ui.screens.daonface.DaonFaceLivenessViewModel$initialize$1> continuation) {
        super(2, continuation);
        this.Camera2StreamConfigurationMap = context;
        this.getHighSpeedVideoSizes = daonFaceLivenessViewModel;
    }
}
