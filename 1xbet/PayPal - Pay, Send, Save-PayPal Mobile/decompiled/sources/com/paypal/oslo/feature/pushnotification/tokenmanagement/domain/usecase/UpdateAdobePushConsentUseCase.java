package com.paypal.oslo.feature.pushnotification.tokenmanagement.domain.usecase;

@kotlin.Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0007\b\u0000\u0018\u00002\u00020\u0001B\u0019\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bH\u0086\u0002¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u000b\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u0014\u0010\u000f\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/pushnotification/tokenmanagement/domain/usecase/UpdateAdobePushConsentUseCase;", "", "Lcom/paypal/oslo/core/telemetry/vendors/adobe/AdobePushManager;", "adobePushManager", "Lcom/paypal/oslo/feature/pushnotification/tokenmanagement/domain/provider/PushConsentProvider;", "consentProvider", "<init>", "(Lcom/paypal/oslo/core/telemetry/vendors/adobe/AdobePushManager;Lcom/paypal/oslo/feature/pushnotification/tokenmanagement/domain/provider/PushConsentProvider;)V", "", "invoke", "()V", "getHighSpeedVideoFpsRangesFor", "Lcom/paypal/oslo/core/telemetry/vendors/adobe/AdobePushManager;", "getHighSpeedVideoFpsRanges", "Lcom/paypal/oslo/feature/pushnotification/tokenmanagement/domain/provider/PushConsentProvider;", "Camera2StreamConfigurationMap"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class UpdateAdobePushConsentUseCase {
    public static final int $stable = 8;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.pushnotification.tokenmanagement.domain.provider.PushConsentProvider Camera2StreamConfigurationMap;
    private final com.paypal.oslo.core.telemetry.vendors.adobe.AdobePushManager getHighSpeedVideoFpsRangesFor;

    @javax.inject.Inject
    public UpdateAdobePushConsentUseCase(com.paypal.oslo.core.telemetry.vendors.adobe.AdobePushManager adobePushManager, com.paypal.oslo.feature.pushnotification.tokenmanagement.domain.provider.PushConsentProvider pushConsentProvider) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adobePushManager, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(pushConsentProvider, "");
        this.getHighSpeedVideoFpsRangesFor = adobePushManager;
        this.Camera2StreamConfigurationMap = pushConsentProvider;
    }

    public final void invoke() {
        boolean isPushPermissionGranted = this.Camera2StreamConfigurationMap.isPushPermissionGranted();
        com.paypal.android.logger.Logger.d$default(com.paypal.oslo.feature.pushnotification.LoggerKt.log, "Updating Adobe push consent", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("push_consent", java.lang.Boolean.valueOf(isPushPermissionGranted))), null, 4, null);
        this.getHighSpeedVideoFpsRangesFor.updateConsent(isPushPermissionGranted);
    }
}
