package com.paypal.oslo.feature.shaketoreport.di;

@dagger.hilt.android.EarlyEntryPoint
@kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\ba\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0005H&¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH&¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH&¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u000eH'¢\u0006\u0004\b\u000f\u0010\u0010À\u0006\u0003"}, d2 = {"Lcom/paypal/oslo/feature/shaketoreport/di/ShakeToReportEntryPoint;", "", "Lcom/paypal/oslo/feature/shaketoreport/shake/ShakeToReport;", "shakeToReport", "()Lcom/paypal/oslo/feature/shaketoreport/shake/ShakeToReport;", "Lcom/paypal/oslo/feature/shaketoreport/shake/ActivityUiLifecycleCallbacks;", "activityUiLifecycleCallbacks", "()Lcom/paypal/oslo/feature/shaketoreport/shake/ActivityUiLifecycleCallbacks;", "Lcom/paypal/oslo/core/security/ScreenshotPreventionController;", "screenshotPreventionController", "()Lcom/paypal/oslo/core/security/ScreenshotPreventionController;", "Lcom/paypal/oslo/core/remoteconfig/contract/FeatureGate;", "featureGate", "()Lcom/paypal/oslo/core/remoteconfig/contract/FeatureGate;", "Lkotlinx/coroutines/CoroutineScope;", "ioApplicationScope", "()Lkotlinx/coroutines/CoroutineScope;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public interface ShakeToReportEntryPoint {
    com.paypal.oslo.feature.shaketoreport.shake.ActivityUiLifecycleCallbacks activityUiLifecycleCallbacks();

    com.paypal.oslo.core.remoteconfig.contract.FeatureGate featureGate();

    @com.paypal.oslo.core.di.annotations.IoApplicationScope
    kotlinx.coroutines.CoroutineScope ioApplicationScope();

    com.paypal.oslo.core.security.ScreenshotPreventionController screenshotPreventionController();

    com.paypal.oslo.feature.shaketoreport.shake.ShakeToReport shakeToReport();
}
