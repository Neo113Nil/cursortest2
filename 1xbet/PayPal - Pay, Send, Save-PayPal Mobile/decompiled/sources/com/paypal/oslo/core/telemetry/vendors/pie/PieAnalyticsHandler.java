package com.paypal.oslo.core.telemetry.vendors.pie;

@kotlin.Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u001f\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0015\u0010\u0017\u001a\u00020\u00148CX\u0083\u0084\u0002¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016"}, d2 = {"Lcom/paypal/oslo/core/telemetry/vendors/pie/PieAnalyticsHandler;", "Lcom/paypal/oslo/core/telemetry/analytics/handler/AnalyticsHandler;", "Lcom/paypal/oslo/core/telemetry/analytics/transformer/AnalyticsRegistryResolver;", "analyticsRegistryResolver", "Ldagger/Lazy;", "Lcom/paypal/oslo/core/telemetry/vendors/pie/PieClient;", "pieClient", "<init>", "(Lcom/paypal/oslo/core/telemetry/analytics/transformer/AnalyticsRegistryResolver;Ldagger/Lazy;)V", "Lcom/paypal/oslo/core/telemetry/analytics/event/AnalyticsEvent;", "analyticsEvent", "", "handle", "(Lcom/paypal/oslo/core/telemetry/analytics/event/AnalyticsEvent;)V", "", "shouldHandle", "(Lcom/paypal/oslo/core/telemetry/analytics/event/AnalyticsEvent;)Z", "getHighSpeedVideoSizes", "Ldagger/Lazy;", "getHighSpeedVideoFpsRanges", "Lcom/paypal/oslo/core/telemetry/analytics/transformer/AnalyticsTransformerRegistry;", "getHighResolutionOutputSizeshNQ4ISI", "Lkotlin/properties/ReadOnlyProperty;", "getHighSpeedVideoFpsRangesFor"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class PieAnalyticsHandler implements com.paypal.oslo.core.telemetry.analytics.handler.AnalyticsHandler {

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final kotlin.properties.ReadOnlyProperty getHighSpeedVideoFpsRangesFor;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final dagger.Lazy<com.paypal.oslo.core.telemetry.vendors.pie.PieClient> getHighSpeedVideoFpsRanges;
    static final /* synthetic */ kotlin.reflect.KProperty<java.lang.Object>[] getHighSpeedVideoFpsRanges = {kotlin.jvm.internal.Reflection.property1(new kotlin.jvm.internal.PropertyReference1Impl(com.paypal.oslo.core.telemetry.vendors.pie.PieAnalyticsHandler.class, "registry", "getRegistry()Lcom/paypal/oslo/core/telemetry/analytics/transformer/AnalyticsTransformerRegistry;", 0))};
    public static final int $stable = 8;

    @javax.inject.Inject
    public PieAnalyticsHandler(com.paypal.oslo.core.telemetry.analytics.transformer.AnalyticsRegistryResolver analyticsRegistryResolver, dagger.Lazy<com.paypal.oslo.core.telemetry.vendors.pie.PieClient> lazy) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(analyticsRegistryResolver, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(lazy, "");
        this.getHighSpeedVideoFpsRanges = lazy;
        this.getHighSpeedVideoFpsRangesFor = com.paypal.oslo.core.telemetry.analytics.transformer.AnalyticsRegistryDelegateKt.analyticsRegistry(analyticsRegistryResolver, com.paypal.oslo.core.telemetry.analytics.transformer.ProviderType.PIE);
    }

    @Override // com.paypal.oslo.core.telemetry.analytics.handler.AnalyticsHandler
    public final boolean shouldHandle(com.paypal.oslo.core.telemetry.analytics.event.AnalyticsEvent analyticsEvent) {
        boolean z;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(analyticsEvent, "");
        boolean z2 = analyticsEvent.getEventType() == com.paypal.oslo.core.telemetry.analytics.event.EventType.Appeared || analyticsEvent.getEventType() == com.paypal.oslo.core.telemetry.analytics.event.EventType.Clicked;
        java.util.List<java.lang.Object> contexts$telemetry_release = analyticsEvent.getContexts$telemetry_release();
        if (!(contexts$telemetry_release instanceof java.util.Collection) || !contexts$telemetry_release.isEmpty()) {
            for (java.lang.Object obj : contexts$telemetry_release) {
                if ((obj instanceof com.paypal.oslo.core.telemetry.analytics.schema.context.domain.SORContext) && ((com.paypal.oslo.core.telemetry.analytics.schema.context.domain.SORContext) obj).getReferences().containsKey(com.paypal.oslo.core.telemetry.analytics.schema.context.domain.SORType.PIE)) {
                    z = true;
                    break;
                }
            }
        }
        z = false;
        return z2 && z;
    }

    @Override // com.paypal.oslo.core.telemetry.analytics.handler.AnalyticsHandler
    public final void handle(com.paypal.oslo.core.telemetry.analytics.event.AnalyticsEvent analyticsEvent) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(analyticsEvent, "");
        java.util.Map<java.lang.String, ? extends java.lang.Object> map = (java.util.Map) ((com.paypal.oslo.core.telemetry.analytics.transformer.AnalyticsTransformerRegistry) this.getHighSpeedVideoFpsRangesFor.getValue(this, getHighSpeedVideoFpsRanges[0])).transform(analyticsEvent.getContexts$telemetry_release());
        if (map == null) {
            map = kotlin.collections.MapsKt.emptyMap();
        }
        this.getHighSpeedVideoFpsRanges.get().sendEvent(analyticsEvent.getEventType(), map);
    }
}
