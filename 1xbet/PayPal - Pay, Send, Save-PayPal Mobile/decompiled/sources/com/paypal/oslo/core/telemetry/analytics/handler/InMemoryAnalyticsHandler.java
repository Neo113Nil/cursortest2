package com.paypal.oslo.core.telemetry.analytics.handler;

@kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0010\u0000\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bR$\u0010\r\u001a\u0012\u0012\u0004\u0012\u00020\u00040\tj\b\u0012\u0004\u0012\u00020\u0004`\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u0011\u0010\u0011\u001a\u00020\u000e8G¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00130\u00128G¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015"}, d2 = {"Lcom/paypal/oslo/core/telemetry/analytics/handler/InMemoryAnalyticsHandler;", "Lcom/paypal/oslo/core/telemetry/analytics/handler/AnalyticsHandler;", "<init>", "()V", "Lcom/paypal/oslo/core/telemetry/analytics/event/AnalyticsEvent;", "analyticsEvent", "", "handle", "(Lcom/paypal/oslo/core/telemetry/analytics/event/AnalyticsEvent;)V", "Ljava/util/ArrayList;", "Lkotlin/collections/getHighSpeedVideoFpsRanges;", "getHighSpeedVideoFpsRanges", "Ljava/util/ArrayList;", "getHighSpeedVideoSizes", "", "getTrackedEventsSize", "()I", "trackedEventsSize", "", "", "getContexts", "()Ljava/util/List;", "contexts"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class InMemoryAnalyticsHandler implements com.paypal.oslo.core.telemetry.analytics.handler.AnalyticsHandler {
    public static final int $stable = 8;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final java.util.ArrayList<com.paypal.oslo.core.telemetry.analytics.event.AnalyticsEvent> getHighSpeedVideoSizes = new java.util.ArrayList<>();

    @Override // com.paypal.oslo.core.telemetry.analytics.handler.AnalyticsHandler
    public final /* bridge */ boolean shouldHandle(com.paypal.oslo.core.telemetry.analytics.event.AnalyticsEvent analyticsEvent) {
        return super.shouldHandle(analyticsEvent);
    }

    public final int getTrackedEventsSize() {
        return this.getHighSpeedVideoSizes.size();
    }

    public final java.util.List<java.lang.Object> getContexts() {
        java.util.ArrayList<com.paypal.oslo.core.telemetry.analytics.event.AnalyticsEvent> arrayList = this.getHighSpeedVideoSizes;
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        java.util.Iterator<T> it = arrayList.iterator();
        while (it.hasNext()) {
            kotlin.collections.CollectionsKt.addAll(arrayList2, ((com.paypal.oslo.core.telemetry.analytics.event.AnalyticsEvent) it.next()).getContexts$telemetry_release());
        }
        return arrayList2;
    }

    @Override // com.paypal.oslo.core.telemetry.analytics.handler.AnalyticsHandler
    public final void handle(com.paypal.oslo.core.telemetry.analytics.event.AnalyticsEvent analyticsEvent) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(analyticsEvent, "");
        this.getHighSpeedVideoSizes.add(analyticsEvent);
    }
}
