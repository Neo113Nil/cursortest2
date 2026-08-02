package com.paypal.oslo.feature.checkcapture.ingo;

@kotlin.Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0000\u0018\u00002\u00020\u0001B\u0019\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007JY\u0010\u0018\u001a\u00020\u00122\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e2\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00112\u0016\u0010\u0017\u001a\u0012\u0012\b\u0012\u00060\u0015j\u0002`\u0016\u0012\u0004\u0012\u00020\u00120\u0014¢\u0006\u0004\b\u0018\u0010\u0019R\u0014\u0010\u001a\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0014\u0010\u001e\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001d"}, d2 = {"Lcom/paypal/oslo/feature/checkcapture/ingo/IngoSdkLauncher;", "", "Lcom/paypal/oslo/feature/checkcapture/fraudforce/CheckCaptureFraudForceManager;", "fraudForceManager", "Lcom/paypal/oslo/feature/checkcapture/ingo/IngoConfigurationProvider;", "configProvider", "<init>", "(Lcom/paypal/oslo/feature/checkcapture/fraudforce/CheckCaptureFraudForceManager;Lcom/paypal/oslo/feature/checkcapture/ingo/IngoConfigurationProvider;)V", "Landroid/content/Context;", "context", "Lcom/paypal/oslo/feature/checkcapture/domain/model/CheckCaptureSessionDetails;", "sessionDetails", "Lcom/ingo/sdk/kotlin/ux/IngoSdkTheme;", com.ingo.sdk.android.ux.activity.IngoSdkActivity.THEME, "Landroidx/activity/result/ActivityResultLauncher;", "Landroid/content/Intent;", "activityResultLauncher", "Lkotlin/Function0;", "", "onSuccess", "Lkotlin/Function1;", "Ljava/lang/Exception;", "Lkotlin/getHighResolutionOutputSizeshNQ4ISI;", "onFailure", "launch", "(Landroid/content/Context;Lcom/paypal/oslo/feature/checkcapture/domain/model/CheckCaptureSessionDetails;Lcom/ingo/sdk/kotlin/ux/IngoSdkTheme;Landroidx/activity/result/ActivityResultLauncher;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;)V", "getHighSpeedVideoFpsRanges", "Lcom/paypal/oslo/feature/checkcapture/fraudforce/CheckCaptureFraudForceManager;", "getHighSpeedVideoFpsRangesFor", "Lcom/paypal/oslo/feature/checkcapture/ingo/IngoConfigurationProvider;", "Camera2StreamConfigurationMap"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class IngoSdkLauncher {
    public static final int $stable = 8;
    private final com.paypal.oslo.feature.checkcapture.fraudforce.CheckCaptureFraudForceManager getHighSpeedVideoFpsRanges;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.checkcapture.ingo.IngoConfigurationProvider Camera2StreamConfigurationMap;

    @javax.inject.Inject
    public IngoSdkLauncher(com.paypal.oslo.feature.checkcapture.fraudforce.CheckCaptureFraudForceManager checkCaptureFraudForceManager, com.paypal.oslo.feature.checkcapture.ingo.IngoConfigurationProvider ingoConfigurationProvider) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(checkCaptureFraudForceManager, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(ingoConfigurationProvider, "");
        this.getHighSpeedVideoFpsRanges = checkCaptureFraudForceManager;
        this.Camera2StreamConfigurationMap = ingoConfigurationProvider;
    }

    public final void launch(android.content.Context context, com.paypal.oslo.feature.checkcapture.domain.model.CheckCaptureSessionDetails sessionDetails, com.ingo.sdk.kotlin.ux.IngoSdkTheme theme, androidx.view.result.ActivityResultLauncher<android.content.Intent> activityResultLauncher, final kotlin.jvm.functions.Function0<kotlin.Unit> onSuccess, final kotlin.jvm.functions.Function1<? super java.lang.Exception, kotlin.Unit> onFailure) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sessionDetails, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(theme, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(activityResultLauncher, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(onSuccess, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(onFailure, "");
        try {
            java.lang.String generateDeviceBlackbox = this.getHighSpeedVideoFpsRanges.generateDeviceBlackbox();
            java.lang.String baseUrl = this.Camera2StreamConfigurationMap.getBaseUrl();
            com.paypal.android.logger.Logger.d$default(com.paypal.oslo.feature.checkcapture.LoggerKt.log, "Launching INGO SDK", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("customerId", sessionDetails.getCustomer().getId()), kotlin.TuplesKt.to("sessionId", sessionDetails.getSessionId()), kotlin.TuplesKt.to("userStatus", sessionDetails.getCustomer().getStatus().name())), null, 4, null);
            new com.ingo.sdk.android.IngoSdkSession.Builder(context).baseUrl(baseUrl).sdkAuthorizationToken(sessionDetails.getSessionId()).customerId(sessionDetails.getCustomer().getId()).fraudforceDeviceBlackbox(generateDeviceBlackbox).activityResultLauncher(activityResultLauncher).theme(theme).isDarkModeAllowed(true).isIconTintEnabled(true).build().start(new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.checkcapture.ingo.IngoSdkLauncher$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return com.paypal.oslo.feature.checkcapture.ingo.IngoSdkLauncher.m13489$r8$lambda$GMj41kMy9MwVrh0m6WytSBty3I(kotlin.jvm.functions.Function0.this);
                }
            }, new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.checkcapture.ingo.IngoSdkLauncher$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return com.paypal.oslo.feature.checkcapture.ingo.IngoSdkLauncher.$r8$lambda$fup0_lInIunRD09l1gSC1bsSPm4(kotlin.jvm.functions.Function1.this, (java.lang.Exception) obj);
                }
            });
        } catch (java.lang.Exception e) {
            com.paypal.oslo.feature.checkcapture.LoggerKt.log.e("Error launching INGO SDK", e);
            onFailure.invoke(e);
        }
    }

    /* renamed from: $r8$lambda$-GMj41kMy9MwVrh0m6WytSBty3I, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m13489$r8$lambda$GMj41kMy9MwVrh0m6WytSBty3I(kotlin.jvm.functions.Function0 function0) {
        function0.invoke();
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$fup0_lInIunRD09l1gSC1bsSPm4(kotlin.jvm.functions.Function1 function1, java.lang.Exception exc) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(exc, "");
        function1.invoke(exc);
        return kotlin.Unit.INSTANCE;
    }
}
