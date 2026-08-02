package com.paypal.oslo.feature.shaketoreport;

@kotlin.Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\b\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\b\u0010\tJ!\u0010\f\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\b\u0001\u0012\u0006\u0012\u0002\b\u00030\u00010\u000b0\nH\u0016¢\u0006\u0004\b\f\u0010\rJ\u001f\u0010\u0012\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0000¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0014\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u000eH\u0000¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0018\u001a\u00020\u00022\u0006\u0010\u0017\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u0018\u0010\u0019R\u0016\u0010\u001d\u001a\u00020\u001a8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u001b\u0010\u001c"}, d2 = {"Lcom/paypal/oslo/feature/shaketoreport/ShakeToReportInitializer;", "Landroidx/startup/Initializer;", "", "Lcom/paypal/oslo/feature/shaketoreport/shake/ShakeToReport$OnShakeListener;", "<init>", "()V", "Landroid/content/Context;", "context", "create", "(Landroid/content/Context;)V", "", "Ljava/lang/Class;", "dependencies", "()Ljava/util/List;", "Landroid/app/Application;", "application", "", "isShakeToSendEnabled", "evaluateAndApply$shake_to_report_prodRelease", "(Landroid/app/Application;Z)V", "teardownNative$shake_to_report_prodRelease", "(Landroid/app/Application;)V", "Landroid/app/Activity;", "activity", "onShakeDetected", "(Landroid/app/Activity;)V", "Lcom/paypal/oslo/core/security/ScreenshotPreventionController;", "getHighSpeedVideoSizes", "Lcom/paypal/oslo/core/security/ScreenshotPreventionController;", "Camera2StreamConfigurationMap"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class ShakeToReportInitializer implements androidx.startup.Initializer<kotlin.Unit>, com.paypal.oslo.feature.shaketoreport.shake.ShakeToReport.OnShakeListener {
    public static final int $stable = 8;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private com.paypal.oslo.core.security.ScreenshotPreventionController Camera2StreamConfigurationMap;

    @Override // androidx.startup.Initializer
    public final /* bridge */ /* synthetic */ kotlin.Unit create(android.content.Context context) {
        create2(context);
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: create, reason: avoid collision after fix types in other method */
    public final void create2(android.content.Context context) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "");
        android.content.Context applicationContext = context.getApplicationContext();
        kotlin.jvm.internal.Intrinsics.checkNotNull(applicationContext, "");
        android.app.Application application = (android.app.Application) applicationContext;
        java.lang.Object obj = dagger.hilt.android.EarlyEntryPoints.get(context.getApplicationContext(), com.paypal.oslo.feature.shaketoreport.di.ShakeToReportEntryPoint.class);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(obj, "");
        com.paypal.oslo.feature.shaketoreport.di.ShakeToReportEntryPoint shakeToReportEntryPoint = (com.paypal.oslo.feature.shaketoreport.di.ShakeToReportEntryPoint) obj;
        application.registerActivityLifecycleCallbacks(shakeToReportEntryPoint.activityUiLifecycleCallbacks());
        kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(shakeToReportEntryPoint.ioApplicationScope(), null, null, new com.paypal.oslo.feature.shaketoreport.ShakeToReportInitializer$create$1(shakeToReportEntryPoint, this, application, null), 3, null);
    }

    @Override // androidx.startup.Initializer
    public final java.util.List<java.lang.Class<? extends androidx.startup.Initializer<?>>> dependencies() {
        return kotlin.collections.CollectionsKt.listOf(com.paypal.oslo.core.remoteconfig.RemoteConfigInitializer.class);
    }

    public final void evaluateAndApply$shake_to_report_prodRelease(android.app.Application application, boolean isShakeToSendEnabled) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(application, "");
        if (isShakeToSendEnabled) {
            com.paypal.android.logger.Logger.d$default(com.paypal.oslo.feature.shaketoreport.LoggerKt.log, "Initializing shake-to-report feature", null, null, 6, null);
            java.lang.Object obj = dagger.hilt.android.EarlyEntryPoints.get(application.getApplicationContext(), com.paypal.oslo.feature.shaketoreport.di.ShakeToReportEntryPoint.class);
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(obj, "");
            com.paypal.oslo.feature.shaketoreport.di.ShakeToReportEntryPoint shakeToReportEntryPoint = (com.paypal.oslo.feature.shaketoreport.di.ShakeToReportEntryPoint) obj;
            com.paypal.oslo.feature.shaketoreport.shake.ShakeToReport shakeToReport = shakeToReportEntryPoint.shakeToReport();
            this.Camera2StreamConfigurationMap = shakeToReportEntryPoint.screenshotPreventionController();
            shakeToReportEntryPoint.activityUiLifecycleCallbacks().setActivityUiLifecycleListener(shakeToReport);
            shakeToReport.setOnShakeListener(this);
            shakeToReport.start$shake_to_report_prodRelease();
            com.paypal.android.logger.Logger.i$default(com.paypal.oslo.feature.shaketoreport.LoggerKt.log, "shake_to_send_start_successfully", null, null, 6, null);
            return;
        }
        com.paypal.android.logger.Logger.i$default(com.paypal.oslo.feature.shaketoreport.LoggerKt.log, "shake_to_send_start_disabled", null, null, 6, null);
        teardownNative$shake_to_report_prodRelease(application);
    }

    public final void teardownNative$shake_to_report_prodRelease(android.app.Application application) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(application, "");
        com.paypal.android.logger.Logger.d$default(com.paypal.oslo.feature.shaketoreport.LoggerKt.log, "Tearing down native shake-to-report", null, null, 6, null);
        java.lang.Object obj = dagger.hilt.android.EarlyEntryPoints.get(application.getApplicationContext(), com.paypal.oslo.feature.shaketoreport.di.ShakeToReportEntryPoint.class);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(obj, "");
        com.paypal.oslo.feature.shaketoreport.di.ShakeToReportEntryPoint shakeToReportEntryPoint = (com.paypal.oslo.feature.shaketoreport.di.ShakeToReportEntryPoint) obj;
        shakeToReportEntryPoint.activityUiLifecycleCallbacks().setActivityUiLifecycleListener(null);
        shakeToReportEntryPoint.shakeToReport().stop$shake_to_report_prodRelease();
    }

    @Override // com.paypal.oslo.feature.shaketoreport.shake.ShakeToReport.OnShakeListener
    public final void onShakeDetected(final android.app.Activity activity) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(activity, "");
        activity.getWindow().clearFlags(8192);
        com.paypal.oslo.core.security.ScreenshotPreventionController screenshotPreventionController = this.Camera2StreamConfigurationMap;
        com.paypal.oslo.core.security.ScreenshotPreventionController screenshotPreventionController2 = null;
        if (screenshotPreventionController == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("");
            screenshotPreventionController = null;
        }
        screenshotPreventionController.disable();
        try {
            com.paypal.oslo.feature.shaketoreport.utils.ScreenShotUtilKt.takeScreenShotWithOverlays(activity, new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.shaketoreport.ShakeToReportInitializer$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    kotlin.Unit highResolutionOutputSizeshNQ4ISI;
                    highResolutionOutputSizeshNQ4ISI = com.paypal.oslo.feature.shaketoreport.ShakeToReportInitializer.getHighResolutionOutputSizeshNQ4ISI(com.paypal.oslo.feature.shaketoreport.ShakeToReportInitializer.this, activity, (android.graphics.Bitmap) obj);
                    return highResolutionOutputSizeshNQ4ISI;
                }
            });
        } finally {
            com.paypal.oslo.core.security.ScreenshotPreventionController screenshotPreventionController3 = this.Camera2StreamConfigurationMap;
            if (screenshotPreventionController3 == null) {
                kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("");
            } else {
                screenshotPreventionController2 = screenshotPreventionController3;
            }
            screenshotPreventionController2.enable();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Finally extract failed */
    public static final kotlin.Unit getHighResolutionOutputSizeshNQ4ISI(com.paypal.oslo.feature.shaketoreport.ShakeToReportInitializer shakeToReportInitializer, android.app.Activity activity, android.graphics.Bitmap bitmap) {
        com.paypal.oslo.core.security.ScreenshotPreventionController screenshotPreventionController = null;
        try {
            com.paypal.android.logger.Logger.d$default(com.paypal.oslo.feature.shaketoreport.LoggerKt.log, "Launching bug report activity for: ".concat(java.lang.String.valueOf(activity.getClass().getSimpleName())), null, null, 6, null);
            activity.startActivity(com.paypal.oslo.feature.shaketoreport.ui.BugReportActivity.INSTANCE.getIntent(activity, bitmap != null ? com.paypal.oslo.feature.shaketoreport.utils.ScreenShotUtilKt.saveBitmapToTempFile(activity, bitmap) : null, "Oslo-Mobile"));
            com.paypal.oslo.core.security.ScreenshotPreventionController screenshotPreventionController2 = shakeToReportInitializer.Camera2StreamConfigurationMap;
            if (screenshotPreventionController2 == null) {
                kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("");
            } else {
                screenshotPreventionController = screenshotPreventionController2;
            }
            screenshotPreventionController.enable();
            return kotlin.Unit.INSTANCE;
        } catch (java.lang.Throwable th) {
            com.paypal.oslo.core.security.ScreenshotPreventionController screenshotPreventionController3 = shakeToReportInitializer.Camera2StreamConfigurationMap;
            if (screenshotPreventionController3 == null) {
                kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("");
            } else {
                screenshotPreventionController = screenshotPreventionController3;
            }
            screenshotPreventionController.enable();
            throw th;
        }
    }
}
