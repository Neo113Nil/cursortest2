package com.paypal.oslo.core.telemetry.analytics.context.global;

@javax.inject.Singleton
@kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0001\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\r\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u0015\u0010\u0010\u001a\u00020\u000e8CX\u0082\u0084\u0002¢\u0006\u0006\n\u0004\b\r\u0010\u000f"}, d2 = {"Lcom/paypal/oslo/core/telemetry/analytics/context/global/ApplicationContextProvider;", "Lcom/paypal/oslo/core/telemetry/analytics/context/ContextProvider;", "Lcom/paypal/oslo/core/appidentity/domain/AppIdentity;", "appIdentity", "<init>", "(Lcom/paypal/oslo/core/appidentity/domain/AppIdentity;)V", "Lcom/paypal/oslo/core/telemetry/analytics/event/AnalyticsEvent;", "event", "", "enrich", "(Lcom/paypal/oslo/core/telemetry/analytics/event/AnalyticsEvent;)V", "getHighSpeedVideoFpsRanges", "Lcom/paypal/oslo/core/appidentity/domain/AppIdentity;", "getHighSpeedVideoSizes", "Lcom/paypal/oslo/core/telemetry/analytics/schema/context/session/ApplicationContext;", "Lkotlin/Lazy;", "Camera2StreamConfigurationMap"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class ApplicationContextProvider implements com.paypal.oslo.core.telemetry.analytics.context.ContextProvider {
    public static final int $stable = 8;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final com.paypal.oslo.core.appidentity.domain.AppIdentity getHighSpeedVideoSizes;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final kotlin.Lazy Camera2StreamConfigurationMap;

    @javax.inject.Inject
    public ApplicationContextProvider(com.paypal.oslo.core.appidentity.domain.AppIdentity appIdentity) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(appIdentity, "");
        this.getHighSpeedVideoSizes = appIdentity;
        this.Camera2StreamConfigurationMap = kotlin.LazyKt.lazy(new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.core.telemetry.analytics.context.global.ApplicationContextProvider$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return com.paypal.oslo.core.telemetry.analytics.context.global.ApplicationContextProvider.$r8$lambda$aer1ONEgH4zlNbwwxu1thuK4CyQ(com.paypal.oslo.core.telemetry.analytics.context.global.ApplicationContextProvider.this);
            }
        });
    }

    public static /* synthetic */ com.paypal.oslo.core.telemetry.analytics.schema.context.session.ApplicationContext $r8$lambda$aer1ONEgH4zlNbwwxu1thuK4CyQ(com.paypal.oslo.core.telemetry.analytics.context.global.ApplicationContextProvider applicationContextProvider) {
        java.lang.String appVersion = applicationContextProvider.getHighSpeedVideoSizes.getAppVersion();
        java.lang.String appGUID = applicationContextProvider.getHighSpeedVideoSizes.getAppGUID();
        if (appGUID == null) {
            appGUID = "unknown";
        }
        return new com.paypal.oslo.core.telemetry.analytics.schema.context.session.ApplicationContext(com.paypal.oslo.feature.pushnotification.delivery.data.adapter.CommsPushNotificationClickHandler.TYPE_OSLO, appVersion, com.datadog.android.core.internal.CoreFeature.DEFAULT_SOURCE_NAME, "", appGUID);
    }

    @Override // com.paypal.oslo.core.telemetry.analytics.context.ContextProvider
    public final void enrich(com.paypal.oslo.core.telemetry.analytics.event.AnalyticsEvent event) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(event, "");
        event.addContext$telemetry_release(com.paypal.oslo.core.telemetry.analytics.schema.context.session.ApplicationContext.copy$default((com.paypal.oslo.core.telemetry.analytics.schema.context.session.ApplicationContext) this.Camera2StreamConfigurationMap.getValue(), null, null, null, this.getHighSpeedVideoSizes.getSessionID(), null, 23, null));
    }
}
