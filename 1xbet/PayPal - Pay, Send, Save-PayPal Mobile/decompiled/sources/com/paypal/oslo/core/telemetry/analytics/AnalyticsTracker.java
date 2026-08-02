package com.paypal.oslo.core.telemetry.analytics;

@kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010#\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\b\u0010\u0005J\u0015\u0010\u000b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u000f\u001a\u00020\u00028\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u001a\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00110\u00108\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0018\u0010\u0012\u001a\u0004\u0018\u00010\u00028\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u000f\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/core/telemetry/analytics/AnalyticsTracker;", "", "", "moduleName", "<init>", "(Ljava/lang/String;)V", "destination", "", "setNextDestination$telemetry_release", "Lcom/paypal/oslo/core/telemetry/analytics/event/AnalyticsEvent;", "analyticsEvent", "track", "(Lcom/paypal/oslo/core/telemetry/analytics/event/AnalyticsEvent;)V", "getHighSpeedVideoFpsRanges", "Ljava/lang/String;", "getHighSpeedVideoSizes", "", "Lcom/paypal/oslo/core/telemetry/analytics/handler/AnalyticsHandler;", "getHighResolutionOutputSizeshNQ4ISI", "Ljava/util/Set;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class AnalyticsTracker {
    public static final int $stable = 8;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final java.util.Set<com.paypal.oslo.core.telemetry.analytics.handler.AnalyticsHandler> getHighSpeedVideoFpsRanges;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final java.lang.String getHighSpeedVideoSizes;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private java.lang.String getHighResolutionOutputSizeshNQ4ISI;

    public AnalyticsTracker(java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        this.getHighSpeedVideoSizes = str;
        this.getHighSpeedVideoFpsRanges = new java.util.LinkedHashSet();
    }

    public final void setNextDestination$telemetry_release(java.lang.String destination) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(destination, "");
        this.getHighResolutionOutputSizeshNQ4ISI = destination;
    }

    public final void track(com.paypal.oslo.core.telemetry.analytics.event.AnalyticsEvent analyticsEvent) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(analyticsEvent, "");
        java.util.Iterator<T> it = this.getHighSpeedVideoFpsRanges.iterator();
        while (it.hasNext()) {
            ((com.paypal.oslo.core.telemetry.analytics.handler.AnalyticsHandler) it.next()).handle(analyticsEvent);
        }
        com.paypal.oslo.core.telemetry.analytics.GlobalAnalyticsTracker.INSTANCE.track(analyticsEvent, this.getHighSpeedVideoSizes, this.getHighResolutionOutputSizeshNQ4ISI);
        this.getHighResolutionOutputSizeshNQ4ISI = null;
    }
}
