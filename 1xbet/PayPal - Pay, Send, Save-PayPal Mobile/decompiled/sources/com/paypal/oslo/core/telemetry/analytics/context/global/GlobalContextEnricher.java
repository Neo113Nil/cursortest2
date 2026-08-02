package com.paypal.oslo.core.telemetry.analytics.context.global;

@kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u001c\b\u0007\u0012\u0011\u0010\u0005\u001a\r\u0012\t\u0012\u00070\u0003¢\u0006\u0002\b\u00040\u0002¢\u0006\u0004\b\u0006\u0010\u0007J)\u0010\u000e\u001a\u00020\r2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011"}, d2 = {"Lcom/paypal/oslo/core/telemetry/analytics/context/global/GlobalContextEnricher;", "", "", "Lcom/paypal/oslo/core/telemetry/analytics/context/ContextProvider;", "Lkotlin/jvm/JvmSuppressWildcards;", "globalProviders", "<init>", "(Ljava/util/Set;)V", "Lcom/paypal/oslo/core/telemetry/analytics/event/AnalyticsEvent;", "event", "", "moduleName", "destination", "", "enrich", "(Lcom/paypal/oslo/core/telemetry/analytics/event/AnalyticsEvent;Ljava/lang/String;Ljava/lang/String;)V", "getHighResolutionOutputSizeshNQ4ISI", "Ljava/util/Set;", "getHighSpeedVideoFpsRanges"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class GlobalContextEnricher {
    public static final int $stable = 8;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final java.util.Set<com.paypal.oslo.core.telemetry.analytics.context.ContextProvider> getHighSpeedVideoFpsRanges;

    @javax.inject.Inject
    public GlobalContextEnricher(java.util.Set<com.paypal.oslo.core.telemetry.analytics.context.ContextProvider> set) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(set, "");
        this.getHighSpeedVideoFpsRanges = kotlin.collections.CollectionsKt.toSet(set);
    }

    public static /* synthetic */ void enrich$default(com.paypal.oslo.core.telemetry.analytics.context.global.GlobalContextEnricher globalContextEnricher, com.paypal.oslo.core.telemetry.analytics.event.AnalyticsEvent analyticsEvent, java.lang.String str, java.lang.String str2, int i, java.lang.Object obj) {
        if ((i & 4) != 0) {
            str2 = null;
        }
        globalContextEnricher.enrich(analyticsEvent, str, str2);
    }

    public final void enrich(com.paypal.oslo.core.telemetry.analytics.event.AnalyticsEvent event, java.lang.String moduleName, java.lang.String destination) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(event, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(moduleName, "");
        java.util.Iterator<T> it = this.getHighSpeedVideoFpsRanges.iterator();
        while (it.hasNext()) {
            ((com.paypal.oslo.core.telemetry.analytics.context.ContextProvider) it.next()).enrich(event);
        }
        event.addContext$telemetry_release(new com.paypal.oslo.core.telemetry.analytics.schema.context.operational.TechnicalContext(moduleName, destination));
    }
}
