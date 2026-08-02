package com.paypal.oslo.feature.mosaic.ui.webview;

@kotlin.Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u000f\u0010\u0001\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lcom/paypal/oslo/feature/mosaic/ui/webview/FileUploadManager;", "rememberFileUploadManager", "(Landroidx/compose/runtime/Composer;I)Lcom/paypal/oslo/feature/mosaic/ui/webview/FileUploadManager;"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class FileUploadManagerKt {
    public static final com.paypal.oslo.feature.mosaic.ui.webview.FileUploadManager rememberFileUploadManager(androidx.compose.runtime.Composer composer, int i) {
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventStart(-978107803, i, -1, "com.paypal.oslo.feature.mosaic.ui.webview.rememberFileUploadManager (FileUploadManager.kt:268)");
        }
        android.content.Context context = (android.content.Context) composer.consume(androidx.compose.ui.platform.AndroidCompositionLocals_androidKt.getLocalContext());
        com.paypal.oslo.feature.mosaic.ui.webview.RuntimePermissionHelper rememberRuntimePermissionHelper = com.paypal.oslo.feature.mosaic.ui.webview.RuntimePermissionHelperKt.rememberRuntimePermissionHelper(composer, 0);
        java.lang.Object rememberedValue = composer.rememberedValue();
        if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
            rememberedValue = new com.paypal.oslo.feature.mosaic.ui.webview.FileUploadManager(context, rememberRuntimePermissionHelper);
            composer.updateRememberedValue(rememberedValue);
        }
        final com.paypal.oslo.feature.mosaic.ui.webview.FileUploadManager fileUploadManager = (com.paypal.oslo.feature.mosaic.ui.webview.FileUploadManager) rememberedValue;
        androidx.activity.result.contract.ActivityResultContracts.StartActivityForResult startActivityForResult = new androidx.activity.result.contract.ActivityResultContracts.StartActivityForResult();
        boolean changedInstance = composer.changedInstance(fileUploadManager);
        java.lang.Object rememberedValue2 = composer.rememberedValue();
        if (changedInstance || rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
            rememberedValue2 = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.mosaic.ui.webview.FileUploadManagerKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return com.paypal.oslo.feature.mosaic.ui.webview.FileUploadManagerKt.m15809$r8$lambda$6fHIII_nCZIIWftCRmwNhzg46U(com.paypal.oslo.feature.mosaic.ui.webview.FileUploadManager.this, (androidx.view.result.ActivityResult) obj);
                }
            };
            composer.updateRememberedValue(rememberedValue2);
        }
        fileUploadManager.setFilePickerLauncher(androidx.view.compose.ActivityResultRegistryKt.rememberLauncherForActivityResult(startActivityForResult, (kotlin.jvm.functions.Function1) rememberedValue2, composer, 0));
        androidx.activity.result.contract.ActivityResultContracts.TakePicture takePicture = new androidx.activity.result.contract.ActivityResultContracts.TakePicture();
        boolean changedInstance2 = composer.changedInstance(fileUploadManager);
        java.lang.Object rememberedValue3 = composer.rememberedValue();
        if (changedInstance2 || rememberedValue3 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
            rememberedValue3 = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.mosaic.ui.webview.FileUploadManagerKt$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return com.paypal.oslo.feature.mosaic.ui.webview.FileUploadManagerKt.$r8$lambda$jZkZbEwHN7PqZp8ERR0rLjJ9z_c(com.paypal.oslo.feature.mosaic.ui.webview.FileUploadManager.this, ((java.lang.Boolean) obj).booleanValue());
                }
            };
            composer.updateRememberedValue(rememberedValue3);
        }
        fileUploadManager.setCaptureImageLauncher(androidx.view.compose.ActivityResultRegistryKt.rememberLauncherForActivityResult(takePicture, (kotlin.jvm.functions.Function1) rememberedValue3, composer, 0));
        androidx.activity.result.contract.ActivityResultContracts.PickMultipleVisualMedia pickMultipleVisualMedia = new androidx.activity.result.contract.ActivityResultContracts.PickMultipleVisualMedia(2);
        boolean changedInstance3 = composer.changedInstance(fileUploadManager);
        java.lang.Object rememberedValue4 = composer.rememberedValue();
        if (changedInstance3 || rememberedValue4 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
            rememberedValue4 = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.mosaic.ui.webview.FileUploadManagerKt$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return com.paypal.oslo.feature.mosaic.ui.webview.FileUploadManagerKt.$r8$lambda$4XW8ZbbFYG2KM_1loEVi71AdrsE(com.paypal.oslo.feature.mosaic.ui.webview.FileUploadManager.this, (java.util.List) obj);
                }
            };
            composer.updateRememberedValue(rememberedValue4);
        }
        fileUploadManager.setPickMultipleVisualMediaLauncher(androidx.view.compose.ActivityResultRegistryKt.rememberLauncherForActivityResult(pickMultipleVisualMedia, (kotlin.jvm.functions.Function1) rememberedValue4, composer, 0));
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventEnd();
        }
        return fileUploadManager;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$4XW8ZbbFYG2KM_1loEVi71AdrsE(com.paypal.oslo.feature.mosaic.ui.webview.FileUploadManager fileUploadManager, java.util.List list) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
        fileUploadManager.onMultipleVisualMediaResult(list);
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$6fHIII_nCZII-WftCRmwNhzg46U, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m15809$r8$lambda$6fHIII_nCZIIWftCRmwNhzg46U(com.paypal.oslo.feature.mosaic.ui.webview.FileUploadManager fileUploadManager, androidx.view.result.ActivityResult activityResult) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(activityResult, "");
        fileUploadManager.onFilePickerResult(activityResult);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$jZkZbEwHN7PqZp8ERR0rLjJ9z_c(com.paypal.oslo.feature.mosaic.ui.webview.FileUploadManager fileUploadManager, boolean z) {
        fileUploadManager.onCameraResult(z);
        return kotlin.Unit.INSTANCE;
    }
}
