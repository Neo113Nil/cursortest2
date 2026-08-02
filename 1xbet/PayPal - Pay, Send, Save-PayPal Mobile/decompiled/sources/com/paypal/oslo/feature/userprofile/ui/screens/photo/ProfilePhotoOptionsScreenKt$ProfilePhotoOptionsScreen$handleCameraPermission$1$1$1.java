package com.paypal.oslo.feature.userprofile.ui.screens.photo;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.userprofile.ui.screens.photo.ProfilePhotoOptionsScreenKt$ProfilePhotoOptionsScreen$handleCameraPermission$1$1$1", f = "ProfilePhotoOptionsScreen.kt", i = {}, l = {175}, m = "invokeSuspend", n = {}, nl = {183}, s = {}, v = 2)
/* loaded from: classes15.dex */
final class ProfilePhotoOptionsScreenKt$ProfilePhotoOptionsScreen$handleCameraPermission$1$1$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ kotlin.jvm.functions.Function0<android.net.Uri> Camera2StreamConfigurationMap;
    final /* synthetic */ com.paypal.oslo.core.permission.ui.controller.PermissionController getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ androidx.view.compose.ManagedActivityResultLauncher<android.net.Uri, java.lang.Boolean> getHighSpeedVideoFpsRanges;
    int getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.getHighSpeedVideoSizes;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            this.getHighSpeedVideoSizes = 1;
            obj = this.getHighResolutionOutputSizeshNQ4ISI.requestPermission(new com.paypal.oslo.core.permission.domain.model.PermissionRequest(com.paypal.oslo.core.permission.domain.model.PermissionType.Camera.INSTANCE, "Camera permission is needed to take profile photos. You can also choose existing photos from your gallery.", "feature-user-profile"), this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        com.paypal.oslo.core.permission.domain.model.PermissionStatus permissionStatus = (com.paypal.oslo.core.permission.domain.model.PermissionStatus) obj;
        if (kotlin.jvm.internal.Intrinsics.areEqual(permissionStatus, com.paypal.oslo.core.permission.domain.model.PermissionStatus.Granted.INSTANCE)) {
            try {
                this.getHighSpeedVideoFpsRanges.launch(this.Camera2StreamConfigurationMap.invoke());
            } catch (java.lang.Exception e) {
                com.paypal.android.logger.Logger logger = com.paypal.oslo.feature.userprofile.LoggerKt.log;
                java.lang.String message = e.getMessage();
                if (message == null) {
                    message = "null";
                }
                com.paypal.android.logger.Logger.e$default(logger, "Failed to launch camera", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("exception_message", message)), null, e, 4, null);
            }
        } else if (!kotlin.jvm.internal.Intrinsics.areEqual(permissionStatus, com.paypal.oslo.core.permission.domain.model.PermissionStatus.ShouldShowRationale.INSTANCE) && !kotlin.jvm.internal.Intrinsics.areEqual(permissionStatus, com.paypal.oslo.core.permission.domain.model.PermissionStatus.PermanentlyDenied.INSTANCE)) {
            throw new kotlin.NoWhenBranchMatchedException();
        }
        return kotlin.Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((com.paypal.oslo.feature.userprofile.ui.screens.photo.ProfilePhotoOptionsScreenKt$ProfilePhotoOptionsScreen$handleCameraPermission$1$1$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.paypal.oslo.feature.userprofile.ui.screens.photo.ProfilePhotoOptionsScreenKt$ProfilePhotoOptionsScreen$handleCameraPermission$1$1$1(this.getHighResolutionOutputSizeshNQ4ISI, this.Camera2StreamConfigurationMap, this.getHighSpeedVideoFpsRanges, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    ProfilePhotoOptionsScreenKt$ProfilePhotoOptionsScreen$handleCameraPermission$1$1$1(com.paypal.oslo.core.permission.ui.controller.PermissionController permissionController, kotlin.jvm.functions.Function0<? extends android.net.Uri> function0, androidx.view.compose.ManagedActivityResultLauncher<android.net.Uri, java.lang.Boolean> managedActivityResultLauncher, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.userprofile.ui.screens.photo.ProfilePhotoOptionsScreenKt$ProfilePhotoOptionsScreen$handleCameraPermission$1$1$1> continuation) {
        super(2, continuation);
        this.getHighResolutionOutputSizeshNQ4ISI = permissionController;
        this.Camera2StreamConfigurationMap = function0;
        this.getHighSpeedVideoFpsRanges = managedActivityResultLauncher;
    }
}
