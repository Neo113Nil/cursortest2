package com.paypal.oslo.feature.verificationcapture.ui.screens.manualupload.viewmodel;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.verificationcapture.ui.screens.manualupload.viewmodel.ManualUploadViewModel$handleEvent$1", f = "ManualUploadViewModel.kt", i = {}, l = {84}, m = "invokeSuspend", n = {}, nl = {85}, s = {}, v = 2)
/* loaded from: classes15.dex */
final class ManualUploadViewModel$handleEvent$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ com.paypal.oslo.feature.verificationcapture.ui.screens.manualupload.contract.ManualUploadEvent Camera2StreamConfigurationMap;
    int getHighSpeedVideoFpsRangesFor;
    final /* synthetic */ com.paypal.oslo.feature.verificationcapture.ui.screens.manualupload.viewmodel.ManualUploadViewModel getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object highSpeedVideoSizes;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.getHighSpeedVideoFpsRangesFor;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            com.paypal.oslo.feature.verificationcapture.ui.screens.manualupload.viewmodel.ManualUploadViewModel manualUploadViewModel = this.getHighSpeedVideoSizes;
            java.util.List<android.net.Uri> uris = ((com.paypal.oslo.feature.verificationcapture.ui.screens.manualupload.contract.ManualUploadEvent.FilesSelected) this.Camera2StreamConfigurationMap).getUris();
            this.getHighSpeedVideoFpsRangesFor = 1;
            highSpeedVideoSizes = manualUploadViewModel.getHighSpeedVideoSizes((java.util.List<? extends android.net.Uri>) uris);
            if (highSpeedVideoSizes == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        return kotlin.Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((com.paypal.oslo.feature.verificationcapture.ui.screens.manualupload.viewmodel.ManualUploadViewModel$handleEvent$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.paypal.oslo.feature.verificationcapture.ui.screens.manualupload.viewmodel.ManualUploadViewModel$handleEvent$1(this.getHighSpeedVideoSizes, this.Camera2StreamConfigurationMap, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ManualUploadViewModel$handleEvent$1(com.paypal.oslo.feature.verificationcapture.ui.screens.manualupload.viewmodel.ManualUploadViewModel manualUploadViewModel, com.paypal.oslo.feature.verificationcapture.ui.screens.manualupload.contract.ManualUploadEvent manualUploadEvent, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.verificationcapture.ui.screens.manualupload.viewmodel.ManualUploadViewModel$handleEvent$1> continuation) {
        super(2, continuation);
        this.getHighSpeedVideoSizes = manualUploadViewModel;
        this.Camera2StreamConfigurationMap = manualUploadEvent;
    }
}
