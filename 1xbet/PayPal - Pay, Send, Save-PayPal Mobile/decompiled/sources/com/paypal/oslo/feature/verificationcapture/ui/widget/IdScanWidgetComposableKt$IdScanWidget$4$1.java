package com.paypal.oslo.feature.verificationcapture.ui.widget;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.verificationcapture.ui.widget.IdScanWidgetComposableKt$IdScanWidget$4$1", f = "IdScanWidgetComposable.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, nl = {}, s = {}, v = 2)
/* loaded from: classes15.dex */
final class IdScanWidgetComposableKt$IdScanWidget$4$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ com.paypal.oslo.feature.verificationcapture.ui.screens.manualupload.viewmodel.ManualUploadViewModel Camera2StreamConfigurationMap;
    final /* synthetic */ androidx.compose.runtime.State<com.paypal.oslo.feature.verificationcapture.api.widget.IdScanWidgetRenderState> getHighResolutionOutputSizeshNQ4ISI;
    int getHighSpeedVideoFpsRanges;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.getHighSpeedVideoFpsRanges != 0) {
            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        kotlin.ResultKt.throwOnFailure(obj);
        kotlin.Pair<com.paypal.oslo.feature.verificationcapture.api.widget.ErrorMessagePriority, java.lang.String> externalMessage = com.paypal.oslo.feature.verificationcapture.ui.widget.IdScanWidgetComposableKt.access$IdScanWidget$lambda$0(this.getHighResolutionOutputSizeshNQ4ISI).getExternalMessage();
        if (externalMessage != null) {
            this.Camera2StreamConfigurationMap.handleEvent(new com.paypal.oslo.feature.verificationcapture.ui.screens.manualupload.contract.ManualUploadEvent.ShowError(externalMessage.component2(), externalMessage.component1() == com.paypal.oslo.feature.verificationcapture.api.widget.ErrorMessagePriority.CRITICAL));
        }
        return kotlin.Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((com.paypal.oslo.feature.verificationcapture.ui.widget.IdScanWidgetComposableKt$IdScanWidget$4$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.paypal.oslo.feature.verificationcapture.ui.widget.IdScanWidgetComposableKt$IdScanWidget$4$1(this.getHighResolutionOutputSizeshNQ4ISI, this.Camera2StreamConfigurationMap, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    IdScanWidgetComposableKt$IdScanWidget$4$1(androidx.compose.runtime.State<com.paypal.oslo.feature.verificationcapture.api.widget.IdScanWidgetRenderState> state, com.paypal.oslo.feature.verificationcapture.ui.screens.manualupload.viewmodel.ManualUploadViewModel manualUploadViewModel, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.verificationcapture.ui.widget.IdScanWidgetComposableKt$IdScanWidget$4$1> continuation) {
        super(2, continuation);
        this.getHighResolutionOutputSizeshNQ4ISI = state;
        this.Camera2StreamConfigurationMap = manualUploadViewModel;
    }
}
