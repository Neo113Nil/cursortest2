package com.paypal.oslo.core.telemetry.analytics.event;

@kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010!\n\u0002\b\u0005\u0018\u00002\u00020\u0001B!\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0001H\u0000¢\u0006\u0004\b\n\u0010\u000bR\u001a\u0010\u0003\u001a\u00020\u00028\u0001X\u0081\u0004¢\u0006\f\n\u0004\b\u0003\u0010\f\u001a\u0004\b\r\u0010\u000eR\u001a\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00010\u000f8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00010\u00048AX\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014"}, d2 = {"Lcom/paypal/oslo/core/telemetry/analytics/event/AnalyticsEvent;", "", "Lcom/paypal/oslo/core/telemetry/analytics/event/EventType;", "eventType", "", "contexts", "<init>", "(Lcom/paypal/oslo/core/telemetry/analytics/event/EventType;Ljava/util/List;)V", "context", "", "addContext$telemetry_release", "(Ljava/lang/Object;)V", "Lcom/paypal/oslo/core/telemetry/analytics/event/EventType;", "getEventType$telemetry_release", "()Lcom/paypal/oslo/core/telemetry/analytics/event/EventType;", "", "getHighSpeedVideoSizes", "Ljava/util/List;", "getHighSpeedVideoFpsRangesFor", "getContexts$telemetry_release", "()Ljava/util/List;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class AnalyticsEvent {
    public static final int $stable = 8;
    private final com.paypal.oslo.core.telemetry.analytics.event.EventType eventType;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final java.util.List<java.lang.Object> getHighSpeedVideoFpsRangesFor;

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.WARNING, message = "Do not instantiate AnalyticsEvent directly outside telemetry module. This will be marked as internal in near futureUse declarative context provision instead: DestinationAnalyticsContextProvider for screens, .context() modifier for interactions.")
    public AnalyticsEvent(com.paypal.oslo.core.telemetry.analytics.event.EventType eventType, java.util.List<? extends java.lang.Object> list) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(eventType, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
        this.eventType = eventType;
        this.getHighSpeedVideoFpsRangesFor = kotlin.collections.CollectionsKt.toMutableList((java.util.Collection) list);
    }

    /* renamed from: getEventType$telemetry_release, reason: from getter */
    public final com.paypal.oslo.core.telemetry.analytics.event.EventType getEventType() {
        return this.eventType;
    }

    public /* synthetic */ AnalyticsEvent(com.paypal.oslo.core.telemetry.analytics.event.EventType eventType, java.util.List list, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(eventType, (i & 2) != 0 ? kotlin.collections.CollectionsKt.emptyList() : list);
    }

    public final java.util.List<java.lang.Object> getContexts$telemetry_release() {
        return kotlin.collections.CollectionsKt.toList(this.getHighSpeedVideoFpsRangesFor);
    }

    public final void addContext$telemetry_release(java.lang.Object context) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "");
        this.getHighSpeedVideoFpsRangesFor.add(context);
    }
}
