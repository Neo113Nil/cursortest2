package com.paypal.oslo.feature.verificationcapture.ui.widget;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.verificationcapture.ui.widget.IdScanWidgetComposableKt$IdScanWidget$1$1", f = "IdScanWidgetComposable.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, nl = {}, s = {}, v = 2)
/* loaded from: classes15.dex */
final class IdScanWidgetComposableKt$IdScanWidget$1$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ com.paypal.oslo.feature.verificationcapture.ui.screens.manualupload.viewmodel.ManualUploadViewModel Camera2StreamConfigurationMap;
    int getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ androidx.compose.runtime.State<com.paypal.oslo.feature.verificationcapture.ui.screens.manualupload.contract.ManualUploadUiState> getHighSpeedVideoFpsRanges;
    final /* synthetic */ androidx.compose.runtime.State<com.paypal.oslo.feature.verificationcapture.api.widget.IdScanWidgetRenderState> getHighSpeedVideoFpsRangesFor;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.getHighResolutionOutputSizeshNQ4ISI != 0) {
            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        kotlin.ResultKt.throwOnFailure(obj);
        com.paypal.android.logger.Logger.d$default(com.paypal.oslo.feature.verificationcapture.LoggerKt.log, "[IdScanWidget] ViewModel created/retrieved", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("instance_id", com.paypal.oslo.feature.verificationcapture.ui.widget.IdScanWidgetComposableKt.access$IdScanWidget$lambda$0(this.getHighSpeedVideoFpsRangesFor).getInstanceId()), kotlin.TuplesKt.to("vm_hash", kotlin.coroutines.jvm.internal.Boxing.boxInt(this.Camera2StreamConfigurationMap.hashCode())), kotlin.TuplesKt.to("state", kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.verificationcapture.ui.widget.IdScanWidgetComposableKt.access$IdScanWidget$lambda$4(this.getHighSpeedVideoFpsRanges).getClass()).getSimpleName())), null, 4, null);
        return kotlin.Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((com.paypal.oslo.feature.verificationcapture.ui.widget.IdScanWidgetComposableKt$IdScanWidget$1$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.paypal.oslo.feature.verificationcapture.ui.widget.IdScanWidgetComposableKt$IdScanWidget$1$1(this.Camera2StreamConfigurationMap, this.getHighSpeedVideoFpsRangesFor, this.getHighSpeedVideoFpsRanges, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    IdScanWidgetComposableKt$IdScanWidget$1$1(com.paypal.oslo.feature.verificationcapture.ui.screens.manualupload.viewmodel.ManualUploadViewModel manualUploadViewModel, androidx.compose.runtime.State<com.paypal.oslo.feature.verificationcapture.api.widget.IdScanWidgetRenderState> state, androidx.compose.runtime.State<? extends com.paypal.oslo.feature.verificationcapture.ui.screens.manualupload.contract.ManualUploadUiState> state2, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.verificationcapture.ui.widget.IdScanWidgetComposableKt$IdScanWidget$1$1> continuation) {
        super(2, continuation);
        this.Camera2StreamConfigurationMap = manualUploadViewModel;
        this.getHighSpeedVideoFpsRangesFor = state;
        this.getHighSpeedVideoFpsRanges = state2;
    }
}
