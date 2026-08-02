package com.paypal.oslo.core.telemetry.vendors.adobe;

@kotlin.Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\r\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\f"}, d2 = {"Lcom/paypal/oslo/core/telemetry/vendors/adobe/AdobePushTokenListener;", "Lcom/paypal/oslo/core/telemetry/push/PushTokenListener;", "Lcom/paypal/oslo/core/telemetry/config/TelemetryFeatureGateProvider;", "telemetryFeatureGateProvider", "<init>", "(Lcom/paypal/oslo/core/telemetry/config/TelemetryFeatureGateProvider;)V", "", com.paypal.oslo.feature.inappcheckout.domain.util.LoggerParameterKeys.TOKEN_KEY, "", "onPushTokenReceived", "(Ljava/lang/String;)V", "getHighResolutionOutputSizeshNQ4ISI", "Lcom/paypal/oslo/core/telemetry/config/TelemetryFeatureGateProvider;", "getHighSpeedVideoFpsRanges"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class AdobePushTokenListener implements com.paypal.oslo.core.telemetry.push.PushTokenListener {
    public static final int $stable = 8;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final com.paypal.oslo.core.telemetry.config.TelemetryFeatureGateProvider getHighSpeedVideoFpsRanges;

    @javax.inject.Inject
    public AdobePushTokenListener(com.paypal.oslo.core.telemetry.config.TelemetryFeatureGateProvider telemetryFeatureGateProvider) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(telemetryFeatureGateProvider, "");
        this.getHighSpeedVideoFpsRanges = telemetryFeatureGateProvider;
    }

    @Override // com.paypal.oslo.core.telemetry.push.PushTokenListener
    public final void onPushTokenReceived(java.lang.String token) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(token, "");
        if (this.getHighSpeedVideoFpsRanges.isAdobeEnabled()) {
            com.adobe.marketing.mobile.MobileCore.setPushIdentifier(token);
        }
    }
}
