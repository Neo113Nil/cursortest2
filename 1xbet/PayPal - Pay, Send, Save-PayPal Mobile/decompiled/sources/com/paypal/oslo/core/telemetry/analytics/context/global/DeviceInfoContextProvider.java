package com.paypal.oslo.core.telemetry.analytics.context.global;

@kotlin.Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\r\u001a\u00020\u00028\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\f"}, d2 = {"Lcom/paypal/oslo/core/telemetry/analytics/context/global/DeviceInfoContextProvider;", "Lcom/paypal/oslo/core/telemetry/analytics/context/ContextProvider;", "Lcom/paypal/oslo/core/appidentity/domain/AppIdentity;", "appIdentity", "<init>", "(Lcom/paypal/oslo/core/appidentity/domain/AppIdentity;)V", "Lcom/paypal/oslo/core/telemetry/analytics/event/AnalyticsEvent;", "event", "", "enrich", "(Lcom/paypal/oslo/core/telemetry/analytics/event/AnalyticsEvent;)V", "getHighResolutionOutputSizeshNQ4ISI", "Lcom/paypal/oslo/core/appidentity/domain/AppIdentity;", "getHighSpeedVideoSizes"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class DeviceInfoContextProvider implements com.paypal.oslo.core.telemetry.analytics.context.ContextProvider {
    public static final int $stable = 8;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final com.paypal.oslo.core.appidentity.domain.AppIdentity getHighSpeedVideoSizes;

    @javax.inject.Inject
    public DeviceInfoContextProvider(com.paypal.oslo.core.appidentity.domain.AppIdentity appIdentity) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(appIdentity, "");
        this.getHighSpeedVideoSizes = appIdentity;
    }

    @Override // com.paypal.oslo.core.telemetry.analytics.context.ContextProvider
    public final void enrich(com.paypal.oslo.core.telemetry.analytics.event.AnalyticsEvent event) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(event, "");
        java.lang.String osVersion = this.getHighSpeedVideoSizes.getOsVersion();
        java.lang.String networkCarrier = this.getHighSpeedVideoSizes.getNetworkCarrier();
        java.lang.String deviceModel = this.getHighSpeedVideoSizes.getDeviceModel();
        java.lang.String androidId = this.getHighSpeedVideoSizes.getAndroidId();
        java.lang.String lowerCase = this.getHighSpeedVideoSizes.getDeviceType().name().toLowerCase(java.util.Locale.ROOT);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(lowerCase, "");
        event.addContext$telemetry_release(new com.paypal.oslo.core.telemetry.analytics.schema.context.session.DeviceInfoContext(osVersion, networkCarrier, deviceModel, androidId, lowerCase));
    }
}
