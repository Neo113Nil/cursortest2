package com.paypal.oslo.core.telemetry.analytics.schema.event.generic;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0000¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/paypal/oslo/core/telemetry/analytics/schema/event/generic/GenericAnalyticsEvent;", "Lcom/paypal/oslo/core/telemetry/analytics/schema/context/MetadataContext;", "metadataContext", "(Lcom/paypal/oslo/core/telemetry/analytics/schema/event/generic/GenericAnalyticsEvent;)Lcom/paypal/oslo/core/telemetry/analytics/schema/context/MetadataContext;"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class GenericAnalyticsEventKt {
    public static final com.paypal.oslo.core.telemetry.analytics.schema.context.MetadataContext metadataContext(com.paypal.oslo.core.telemetry.analytics.schema.event.generic.GenericAnalyticsEvent genericAnalyticsEvent) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(genericAnalyticsEvent, "");
        java.lang.String eventName = genericAnalyticsEvent.getEventName();
        com.paypal.oslo.core.telemetry.analytics.event.EventType eventType = genericAnalyticsEvent.getEventType();
        java.lang.String eventTime = genericAnalyticsEvent.getEventTime();
        if (eventTime == null) {
            eventTime = com.paypal.oslo.core.telemetry.util.TimeUtils.INSTANCE.currentFormattedUtcTime();
        }
        return new com.paypal.oslo.core.telemetry.analytics.schema.context.MetadataContext(eventType, eventName, eventTime);
    }
}
