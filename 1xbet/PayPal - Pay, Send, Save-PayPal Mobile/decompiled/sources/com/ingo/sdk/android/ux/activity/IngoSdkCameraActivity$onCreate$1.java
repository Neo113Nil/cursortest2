package com.ingo.sdk.android.ux.activity;

@kotlin.Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes9.dex */
final class IngoSdkCameraActivity$onCreate$1 implements kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> {
    final /* synthetic */ java.io.File getHighSpeedVideoFpsRanges;
    final /* synthetic */ com.ingo.sdk.android.ux.activity.IngoSdkCameraActivity getHighSpeedVideoFpsRangesFor;

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ kotlin.Unit invoke(androidx.compose.runtime.Composer composer, java.lang.Integer num) {
        java.util.concurrent.ExecutorService executorService;
        androidx.compose.runtime.Composer composer2 = composer;
        if ((num.intValue() & 11) != 2 || !composer2.getSkipping()) {
            com.ingo.sdk.android.ux.activity.IngoSdkCameraActivity ingoSdkCameraActivity = this.getHighSpeedVideoFpsRangesFor;
            java.io.File file = this.getHighSpeedVideoFpsRanges;
            executorService = ingoSdkCameraActivity.getHighSpeedVideoSizes;
            if (executorService == null) {
                kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("");
                executorService = null;
            }
            java.util.concurrent.ExecutorService executorService2 = executorService;
            final com.ingo.sdk.android.ux.activity.IngoSdkCameraActivity ingoSdkCameraActivity2 = this.getHighSpeedVideoFpsRangesFor;
            kotlin.jvm.functions.Function1<? super android.net.Uri, kotlin.Unit> function1 = new kotlin.jvm.functions.Function1() { // from class: com.ingo.sdk.android.ux.activity.IngoSdkCameraActivity$onCreate$1$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return com.ingo.sdk.android.ux.activity.IngoSdkCameraActivity$onCreate$1.getHighSpeedVideoSizes(com.ingo.sdk.android.ux.activity.IngoSdkCameraActivity.this, (android.net.Uri) obj);
                }
            };
            composer2.startReplaceGroup(1849434622);
            java.lang.Object rememberedValue = composer2.rememberedValue();
            if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = new kotlin.jvm.functions.Function1() { // from class: com.ingo.sdk.android.ux.activity.IngoSdkCameraActivity$onCreate$1$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return com.ingo.sdk.android.ux.activity.IngoSdkCameraActivity$onCreate$1.Camera2StreamConfigurationMap((androidx.camera.core.ImageCaptureException) obj);
                    }
                };
                composer2.updateRememberedValue(rememberedValue);
            }
            composer2.endReplaceGroup();
            ingoSdkCameraActivity.CameraView(file, executorService2, function1, (kotlin.jvm.functions.Function1) rememberedValue, composer2, 35912);
        } else {
            composer2.skipToGroupEnd();
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit Camera2StreamConfigurationMap(androidx.camera.core.ImageCaptureException imageCaptureException) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(imageCaptureException, "");
        com.ingo.sdk.kotlin.common.core.logging.IngoLogger.e$default(com.ingo.sdk.kotlin.ux.IngoCoreKt.getIngoLogging(), "Error Taking Selfie Photo", null, imageCaptureException, 2, null);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit getHighSpeedVideoSizes(com.ingo.sdk.android.ux.activity.IngoSdkCameraActivity ingoSdkCameraActivity, android.net.Uri uri) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(uri, "");
        com.ingo.sdk.kotlin.common.core.logging.IngoLogger.d$default(com.ingo.sdk.kotlin.ux.IngoCoreKt.getIngoLogging(), "Got Selfie URI: ".concat(java.lang.String.valueOf(uri)), null, 2, null);
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra(com.ingo.sdk.android.ux.activity.IngoSdkCameraActivity.SELFIE_URI, uri.getPath());
        ingoSdkCameraActivity.setResult(-1, intent);
        ingoSdkCameraActivity.finish();
        return kotlin.Unit.INSTANCE;
    }

    IngoSdkCameraActivity$onCreate$1(com.ingo.sdk.android.ux.activity.IngoSdkCameraActivity ingoSdkCameraActivity, java.io.File file) {
        this.getHighSpeedVideoFpsRangesFor = ingoSdkCameraActivity;
        this.getHighSpeedVideoFpsRanges = file;
    }
}
