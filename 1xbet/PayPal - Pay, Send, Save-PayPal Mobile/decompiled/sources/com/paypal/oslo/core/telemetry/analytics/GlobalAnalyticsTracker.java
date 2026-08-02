package com.paypal.oslo.core.telemetry.analytics;

@kotlin.Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010#\n\u0002\b\u0003\n\u0002\u0010\"\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\r\u0010\t\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\u0003J)\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00040\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00040\u00158G¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0017R$\u0010\u001a\u001a\u0004\u0018\u00010\u00198\u0001@\u0001X\u0081\u000e¢\u0006\u0012\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001f"}, d2 = {"Lcom/paypal/oslo/core/telemetry/analytics/GlobalAnalyticsTracker;", "", "<init>", "()V", "Lcom/paypal/oslo/core/telemetry/analytics/handler/AnalyticsHandler;", "analyticsHandler", "", "addHandler", "(Lcom/paypal/oslo/core/telemetry/analytics/handler/AnalyticsHandler;)V", "clearHandlers", "Lcom/paypal/oslo/core/telemetry/analytics/event/AnalyticsEvent;", "analyticsEvent", "", "moduleName", "destination", "track", "(Lcom/paypal/oslo/core/telemetry/analytics/event/AnalyticsEvent;Ljava/lang/String;Ljava/lang/String;)V", "", "getHighSpeedVideoSizes", "Ljava/util/Set;", "Camera2StreamConfigurationMap", "", "getChainOfHandlers", "()Ljava/util/Set;", "chainOfHandlers", "Lcom/paypal/oslo/core/telemetry/analytics/context/global/GlobalContextEnricher;", "globalContextEnricher", "Lcom/paypal/oslo/core/telemetry/analytics/context/global/GlobalContextEnricher;", "getGlobalContextEnricher$telemetry_release", "()Lcom/paypal/oslo/core/telemetry/analytics/context/global/GlobalContextEnricher;", "setGlobalContextEnricher$telemetry_release", "(Lcom/paypal/oslo/core/telemetry/analytics/context/global/GlobalContextEnricher;)V"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class GlobalAnalyticsTracker {
    private static com.paypal.oslo.core.telemetry.analytics.context.global.GlobalContextEnricher globalContextEnricher;
    public static final com.paypal.oslo.core.telemetry.analytics.GlobalAnalyticsTracker INSTANCE = new com.paypal.oslo.core.telemetry.analytics.GlobalAnalyticsTracker();

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private static final java.util.Set<com.paypal.oslo.core.telemetry.analytics.handler.AnalyticsHandler> Camera2StreamConfigurationMap = new java.util.LinkedHashSet();
    public static final int $stable = 8;

    private GlobalAnalyticsTracker() {
    }

    public final java.util.Set<com.paypal.oslo.core.telemetry.analytics.handler.AnalyticsHandler> getChainOfHandlers() {
        return kotlin.collections.CollectionsKt.toSet(Camera2StreamConfigurationMap);
    }

    public final com.paypal.oslo.core.telemetry.analytics.context.global.GlobalContextEnricher getGlobalContextEnricher$telemetry_release() {
        return globalContextEnricher;
    }

    public final void setGlobalContextEnricher$telemetry_release(com.paypal.oslo.core.telemetry.analytics.context.global.GlobalContextEnricher globalContextEnricher2) {
        globalContextEnricher = globalContextEnricher2;
    }

    public final void addHandler(com.paypal.oslo.core.telemetry.analytics.handler.AnalyticsHandler analyticsHandler) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(analyticsHandler, "");
        Camera2StreamConfigurationMap.add(analyticsHandler);
    }

    public final void clearHandlers() {
        Camera2StreamConfigurationMap.clear();
    }

    public static /* synthetic */ void track$default(com.paypal.oslo.core.telemetry.analytics.GlobalAnalyticsTracker globalAnalyticsTracker, com.paypal.oslo.core.telemetry.analytics.event.AnalyticsEvent analyticsEvent, java.lang.String str, java.lang.String str2, int i, java.lang.Object obj) {
        if ((i & 4) != 0) {
            str2 = null;
        }
        globalAnalyticsTracker.track(analyticsEvent, str, str2);
    }

    public final void track(com.paypal.oslo.core.telemetry.analytics.event.AnalyticsEvent analyticsEvent, java.lang.String moduleName, java.lang.String destination) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(analyticsEvent, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(moduleName, "");
        com.paypal.oslo.core.telemetry.analytics.context.global.GlobalContextEnricher globalContextEnricher2 = globalContextEnricher;
        if (globalContextEnricher2 != null) {
            globalContextEnricher2.enrich(analyticsEvent, moduleName, destination);
        }
        for (com.paypal.oslo.core.telemetry.analytics.handler.AnalyticsHandler analyticsHandler : getChainOfHandlers()) {
            if (analyticsHandler.shouldHandle(analyticsEvent)) {
                analyticsHandler.handle(analyticsEvent);
            }
        }
    }
}
