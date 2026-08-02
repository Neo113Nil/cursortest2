package com.paypal.oslo.feature.verificationcapture.ui.screens.manualcapture;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.verificationcapture.ui.screens.manualcapture.ManualCaptureScreenKt$CameraShutterScreen$4$3$1$1$onCaptureSuccess$1", f = "ManualCaptureScreen.kt", i = {}, l = {com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_DEBITCARD_OVERLAY_INSTITUTION_VALUE}, m = "invokeSuspend", n = {}, nl = {com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_EMPTY_SVG_VALUE}, s = {}, v = 2)
/* loaded from: classes15.dex */
final class ManualCaptureScreenKt$CameraShutterScreen$4$3$1$1$onCaptureSuccess$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ com.paypal.oslo.feature.verificationcapture.domain.model.DocumentSide Camera2StreamConfigurationMap;
    final /* synthetic */ android.graphics.Bitmap getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ com.paypal.oslo.feature.verificationcapture.domain.model.DocumentType getHighSpeedVideoFpsRanges;
    final /* synthetic */ kotlin.jvm.functions.Function1<com.paypal.oslo.feature.verificationcapture.domain.model.CaptureResult, kotlin.Unit> getHighSpeedVideoFpsRangesFor;
    int getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.getHighSpeedVideoSizes;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            this.getHighSpeedVideoSizes = 1;
            if (kotlinx.coroutines.DelayKt.delay(700L, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        this.getHighSpeedVideoFpsRangesFor.invoke(new com.paypal.oslo.feature.verificationcapture.domain.model.CaptureResult.Success(this.getHighResolutionOutputSizeshNQ4ISI, new com.paypal.oslo.feature.verificationcapture.domain.model.IdCaptureData(0.0f, 0, 0, 0, null, null, null, null, 0.0f, 0, com.paypal.oslo.feature.verificationcapture.domain.model.CaptureMode.MANUAL, 0.0f, null, null, null, true, 0, 97279, null), this.Camera2StreamConfigurationMap, this.getHighSpeedVideoFpsRanges, null, null, null, null, null, 496, null));
        return kotlin.Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((com.paypal.oslo.feature.verificationcapture.ui.screens.manualcapture.ManualCaptureScreenKt$CameraShutterScreen$4$3$1$1$onCaptureSuccess$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.paypal.oslo.feature.verificationcapture.ui.screens.manualcapture.ManualCaptureScreenKt$CameraShutterScreen$4$3$1$1$onCaptureSuccess$1(this.getHighSpeedVideoFpsRangesFor, this.getHighResolutionOutputSizeshNQ4ISI, this.Camera2StreamConfigurationMap, this.getHighSpeedVideoFpsRanges, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    ManualCaptureScreenKt$CameraShutterScreen$4$3$1$1$onCaptureSuccess$1(kotlin.jvm.functions.Function1<? super com.paypal.oslo.feature.verificationcapture.domain.model.CaptureResult, kotlin.Unit> function1, android.graphics.Bitmap bitmap, com.paypal.oslo.feature.verificationcapture.domain.model.DocumentSide documentSide, com.paypal.oslo.feature.verificationcapture.domain.model.DocumentType documentType, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.verificationcapture.ui.screens.manualcapture.ManualCaptureScreenKt$CameraShutterScreen$4$3$1$1$onCaptureSuccess$1> continuation) {
        super(2, continuation);
        this.getHighSpeedVideoFpsRangesFor = function1;
        this.getHighResolutionOutputSizeshNQ4ISI = bitmap;
        this.Camera2StreamConfigurationMap = documentSide;
        this.getHighSpeedVideoFpsRanges = documentType;
    }
}
