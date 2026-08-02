package com.paypal.oslo.core.telemetry.vendors.adjust;

@kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\n\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/core/telemetry/vendors/adjust/AdjustAnalyticsHandler;", "Lcom/paypal/oslo/core/telemetry/analytics/handler/AnalyticsHandler;", "<init>", "()V", "Lcom/paypal/oslo/core/telemetry/analytics/event/AnalyticsEvent;", "analyticsEvent", "", "handle", "(Lcom/paypal/oslo/core/telemetry/analytics/event/AnalyticsEvent;)V", "", "shouldHandle", "(Lcom/paypal/oslo/core/telemetry/analytics/event/AnalyticsEvent;)Z"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class AdjustAnalyticsHandler implements com.paypal.oslo.core.telemetry.analytics.handler.AnalyticsHandler {
    public static final int $stable = 0;

    @Override // com.paypal.oslo.core.telemetry.analytics.handler.AnalyticsHandler
    public final void handle(com.paypal.oslo.core.telemetry.analytics.event.AnalyticsEvent analyticsEvent) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(analyticsEvent, "");
        java.util.List<java.lang.Object> contexts$telemetry_release = analyticsEvent.getContexts$telemetry_release();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (java.lang.Object obj : contexts$telemetry_release) {
            if (obj instanceof com.paypal.oslo.core.telemetry.analytics.schema.context.AdjustContext) {
                arrayList.add(obj);
            }
        }
        com.paypal.oslo.core.telemetry.analytics.schema.context.AdjustContext adjustContext = (com.paypal.oslo.core.telemetry.analytics.schema.context.AdjustContext) kotlin.collections.CollectionsKt.firstOrNull((java.util.List) arrayList);
        if (adjustContext == null) {
            return;
        }
        java.lang.String token = adjustContext.getEventToken().getToken();
        com.adjust.sdk.AdjustEvent adjustEvent = new com.adjust.sdk.AdjustEvent(token);
        com.paypal.android.logger.Logger.d$default(com.paypal.oslo.core.telemetry.LoggerKt.log, "[Analytics] Sending event to Adjust", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("event_token", token)), null, 4, null);
        com.adjust.sdk.Adjust.trackEvent(adjustEvent);
    }

    @Override // com.paypal.oslo.core.telemetry.analytics.handler.AnalyticsHandler
    public final boolean shouldHandle(com.paypal.oslo.core.telemetry.analytics.event.AnalyticsEvent analyticsEvent) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(analyticsEvent, "");
        java.util.List<java.lang.Object> contexts$telemetry_release = analyticsEvent.getContexts$telemetry_release();
        if ((contexts$telemetry_release instanceof java.util.Collection) && contexts$telemetry_release.isEmpty()) {
            return false;
        }
        java.util.Iterator<T> it = contexts$telemetry_release.iterator();
        while (it.hasNext()) {
            if (it.next() instanceof com.paypal.oslo.core.telemetry.analytics.schema.context.AdjustContext) {
                return true;
            }
        }
        return false;
    }
}
