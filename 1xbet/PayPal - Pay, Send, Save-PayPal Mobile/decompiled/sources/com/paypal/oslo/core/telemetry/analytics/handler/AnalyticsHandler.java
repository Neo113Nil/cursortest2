package com.paypal.oslo.core.telemetry.analytics.handler;

@kotlin.Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\b`\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\b\u0010\tÀ\u0006\u0003"}, d2 = {"Lcom/paypal/oslo/core/telemetry/analytics/handler/AnalyticsHandler;", "", "Lcom/paypal/oslo/core/telemetry/analytics/event/AnalyticsEvent;", "analyticsEvent", "", "handle", "(Lcom/paypal/oslo/core/telemetry/analytics/event/AnalyticsEvent;)V", "", "shouldHandle", "(Lcom/paypal/oslo/core/telemetry/analytics/event/AnalyticsEvent;)Z"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public interface AnalyticsHandler {
    void handle(com.paypal.oslo.core.telemetry.analytics.event.AnalyticsEvent analyticsEvent);

    @kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class DefaultImpls {
        @java.lang.Deprecated
        public static boolean shouldHandle(com.paypal.oslo.core.telemetry.analytics.handler.AnalyticsHandler analyticsHandler, com.paypal.oslo.core.telemetry.analytics.event.AnalyticsEvent analyticsEvent) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(analyticsEvent, "");
            return com.paypal.oslo.core.telemetry.analytics.handler.AnalyticsHandler.super.shouldHandle(analyticsEvent);
        }
    }

    default boolean shouldHandle(com.paypal.oslo.core.telemetry.analytics.event.AnalyticsEvent analyticsEvent) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(analyticsEvent, "");
        return true;
    }
}
