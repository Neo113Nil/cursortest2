package com.paypal.oslo.core.telemetry.vendors.adobe;

@kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u0000 \u00122\u00020\u0001:\u0001\u0012B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\f\u0010\rR\u0015\u0010\u0011\u001a\u00020\u000e8CX\u0082\u0084\u0002¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010"}, d2 = {"Lcom/paypal/oslo/core/telemetry/vendors/adobe/AdobeAnalyticsHandler;", "Lcom/paypal/oslo/core/telemetry/analytics/handler/AnalyticsHandler;", "Lcom/paypal/oslo/core/telemetry/analytics/transformer/AnalyticsRegistryResolver;", "analyticsRegistryResolver", "<init>", "(Lcom/paypal/oslo/core/telemetry/analytics/transformer/AnalyticsRegistryResolver;)V", "Lcom/paypal/oslo/core/telemetry/analytics/event/AnalyticsEvent;", "analyticsEvent", "", "handle", "(Lcom/paypal/oslo/core/telemetry/analytics/event/AnalyticsEvent;)V", "", "shouldHandle", "(Lcom/paypal/oslo/core/telemetry/analytics/event/AnalyticsEvent;)Z", "Lcom/paypal/oslo/core/telemetry/analytics/transformer/AnalyticsTransformerRegistry;", "getHighSpeedVideoFpsRangesFor", "Lkotlin/properties/ReadOnlyProperty;", "Camera2StreamConfigurationMap", "Companion"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class AdobeAnalyticsHandler implements com.paypal.oslo.core.telemetry.analytics.handler.AnalyticsHandler {

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private final kotlin.properties.ReadOnlyProperty Camera2StreamConfigurationMap;
    static final /* synthetic */ kotlin.reflect.KProperty<java.lang.Object>[] getHighResolutionOutputSizeshNQ4ISI = {kotlin.jvm.internal.Reflection.property1(new kotlin.jvm.internal.PropertyReference1Impl(com.paypal.oslo.core.telemetry.vendors.adobe.AdobeAnalyticsHandler.class, "registry", "getRegistry()Lcom/paypal/oslo/core/telemetry/analytics/transformer/AnalyticsTransformerRegistry;", 0))};
    public static final int $stable = 8;
    private static final java.util.Map<java.lang.String, java.lang.Object> getHighSpeedVideoSizes = kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("_paypal", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("paypalEvent", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("tenantName", "paypal"))))));

    @javax.inject.Inject
    public AdobeAnalyticsHandler(com.paypal.oslo.core.telemetry.analytics.transformer.AnalyticsRegistryResolver analyticsRegistryResolver) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(analyticsRegistryResolver, "");
        this.Camera2StreamConfigurationMap = com.paypal.oslo.core.telemetry.analytics.transformer.AnalyticsRegistryDelegateKt.analyticsRegistry(analyticsRegistryResolver, com.paypal.oslo.core.telemetry.analytics.transformer.ProviderType.ADOBE);
    }

    @Override // com.paypal.oslo.core.telemetry.analytics.handler.AnalyticsHandler
    public final void handle(com.paypal.oslo.core.telemetry.analytics.event.AnalyticsEvent analyticsEvent) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(analyticsEvent, "");
        java.util.Map<java.lang.String, java.lang.Object> map = (java.util.Map) ((com.paypal.oslo.core.telemetry.analytics.transformer.AnalyticsTransformerRegistry) this.Camera2StreamConfigurationMap.getValue(this, getHighResolutionOutputSizeshNQ4ISI[0])).transform(analyticsEvent.getContexts$telemetry_release());
        if (map == null) {
            map = kotlin.collections.MapsKt.emptyMap();
        }
        java.util.Map<java.lang.String, java.lang.Object> map2 = map;
        com.adobe.marketing.mobile.ExperienceEvent.Builder builder = new com.adobe.marketing.mobile.ExperienceEvent.Builder();
        builder.setXdmSchema(getHighSpeedVideoSizes);
        builder.setData(map2);
        com.paypal.android.logger.Logger.d$default(com.paypal.oslo.core.telemetry.LoggerKt.log, "[Analytics] Sending event to Adobe", map2, null, 4, null);
        com.adobe.marketing.mobile.Edge.sendEvent(builder.build(), null);
    }

    @Override // com.paypal.oslo.core.telemetry.analytics.handler.AnalyticsHandler
    public final boolean shouldHandle(com.paypal.oslo.core.telemetry.analytics.event.AnalyticsEvent analyticsEvent) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(analyticsEvent, "");
        return false;
    }
}
