package com.paypal.oslo.feature.revolvingcreditacquisition.ui.fileupload;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.revolvingcreditacquisition.ui.fileupload.FileUploadOptionsScreenKt$FileUploadOptionsScreen$2$1$1", f = "FileUploadOptionsScreen.kt", i = {}, l = {com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_DEV_FAULTY_DATA_VALUE}, m = "invokeSuspend", n = {}, nl = {140}, s = {}, v = 2)
/* loaded from: classes14.dex */
final class FileUploadOptionsScreenKt$FileUploadOptionsScreen$2$1$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    int Camera2StreamConfigurationMap;
    final /* synthetic */ com.paypal.oslo.core.permission.ui.controller.PermissionController getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ com.paypal.oslo.feature.revolvingcreditacquisition.ui.fileupload.viewmodel.FileUploadOptionsViewModel getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.Camera2StreamConfigurationMap;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            this.Camera2StreamConfigurationMap = 1;
            obj = this.getHighResolutionOutputSizeshNQ4ISI.requestPermission(new com.paypal.oslo.core.permission.domain.model.PermissionRequest(com.paypal.oslo.core.permission.domain.model.PermissionType.Camera.INSTANCE, "Camera permission is needed to capture photos for document upload", "feature-revolvingcredit-acquisition"), this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        this.getHighSpeedVideoSizes.processEvent(new com.paypal.oslo.feature.revolvingcreditacquisition.ui.fileupload.viewmodel.FileUploadOptionsEvent.OnCameraPermissionResult((com.paypal.oslo.core.permission.domain.model.PermissionStatus) obj, null, 2, null));
        return kotlin.Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((com.paypal.oslo.feature.revolvingcreditacquisition.ui.fileupload.FileUploadOptionsScreenKt$FileUploadOptionsScreen$2$1$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.paypal.oslo.feature.revolvingcreditacquisition.ui.fileupload.FileUploadOptionsScreenKt$FileUploadOptionsScreen$2$1$1(this.getHighResolutionOutputSizeshNQ4ISI, this.getHighSpeedVideoSizes, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    FileUploadOptionsScreenKt$FileUploadOptionsScreen$2$1$1(com.paypal.oslo.core.permission.ui.controller.PermissionController permissionController, com.paypal.oslo.feature.revolvingcreditacquisition.ui.fileupload.viewmodel.FileUploadOptionsViewModel fileUploadOptionsViewModel, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.revolvingcreditacquisition.ui.fileupload.FileUploadOptionsScreenKt$FileUploadOptionsScreen$2$1$1> continuation) {
        super(2, continuation);
        this.getHighResolutionOutputSizeshNQ4ISI = permissionController;
        this.getHighSpeedVideoSizes = fileUploadOptionsViewModel;
    }
}
