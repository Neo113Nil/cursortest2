package com.paypal.oslo.core.telemetry.analytics.schema.event.generic;

@kotlin.Metadata(d1 = {"\u0000v\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b6\u0018\u00002\u00020\u0001B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H&¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH\u0000¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u0010\u001a\u00020\r8'X¦\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0014\u001a\u00020\u00118'X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013R$\u0010\u0015\u001a\u0004\u0018\u00010\r8\u0001@\u0001X\u0081\u000e¢\u0006\u0012\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u000f\"\u0004\b\u0018\u0010\u0019\u0082\u0001\u0011\u001a\u001b\u001c\u001d\u001e\u001f !\"#$%&'()*"}, d2 = {"Lcom/paypal/oslo/core/telemetry/analytics/schema/event/generic/GenericAnalyticsEvent;", "", "<init>", "()V", "Lcom/paypal/oslo/core/telemetry/analytics/AnalyticsTracker;", "analyticsTracker", "", "track", "(Lcom/paypal/oslo/core/telemetry/analytics/AnalyticsTracker;)V", "", "timeMillis", "attachTime$telemetry_release", "(J)V", "", "getEventName", "()Ljava/lang/String;", "eventName", "Lcom/paypal/oslo/core/telemetry/analytics/event/EventType;", "getEventType", "()Lcom/paypal/oslo/core/telemetry/analytics/event/EventType;", "eventType", "eventTime", "Ljava/lang/String;", "getEventTime$telemetry_release", "setEventTime$telemetry_release", "(Ljava/lang/String;)V", "Lcom/paypal/oslo/core/telemetry/analytics/schema/event/generic/AppBackgrounded;", "Lcom/paypal/oslo/core/telemetry/analytics/schema/event/generic/AppForegrounded;", "Lcom/paypal/oslo/core/telemetry/analytics/schema/event/generic/AppLaunch;", "Lcom/paypal/oslo/core/telemetry/analytics/schema/event/generic/ComponentAppeared;", "Lcom/paypal/oslo/core/telemetry/analytics/schema/event/generic/ComponentAvailable;", "Lcom/paypal/oslo/core/telemetry/analytics/schema/event/generic/ComponentClicked;", "Lcom/paypal/oslo/core/telemetry/analytics/schema/event/generic/ComponentDisappeared;", "Lcom/paypal/oslo/core/telemetry/analytics/schema/event/generic/ErrorShown;", "Lcom/paypal/oslo/core/telemetry/analytics/schema/event/generic/FlowTransitionEvent;", "Lcom/paypal/oslo/core/telemetry/analytics/schema/event/generic/ItemPressed;", "Lcom/paypal/oslo/core/telemetry/analytics/schema/event/generic/LinkResolved;", "Lcom/paypal/oslo/core/telemetry/analytics/schema/event/generic/ModuleAppeared;", "Lcom/paypal/oslo/core/telemetry/analytics/schema/event/generic/ModuleAvailable;", "Lcom/paypal/oslo/core/telemetry/analytics/schema/event/generic/ModuleDisappeared;", "Lcom/paypal/oslo/core/telemetry/analytics/schema/event/generic/ScreenAppeared;", "Lcom/paypal/oslo/core/telemetry/analytics/schema/event/generic/ScreenAvailable;", "Lcom/paypal/oslo/core/telemetry/analytics/schema/event/generic/ScreenDisappeared;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes2.dex */
public abstract class GenericAnalyticsEvent {
    public static final int $stable = 8;
    private java.lang.String eventTime;

    public abstract java.lang.String getEventName();

    public abstract com.paypal.oslo.core.telemetry.analytics.event.EventType getEventType();

    public abstract void track(com.paypal.oslo.core.telemetry.analytics.AnalyticsTracker analyticsTracker);

    private GenericAnalyticsEvent() {
    }

    /* renamed from: getEventTime$telemetry_release, reason: from getter */
    public final java.lang.String getEventTime() {
        return this.eventTime;
    }

    public final void setEventTime$telemetry_release(java.lang.String str) {
        this.eventTime = str;
    }

    public final void attachTime$telemetry_release(long timeMillis) {
        this.eventTime = com.paypal.oslo.core.telemetry.util.TimeUtils.INSTANCE.formattedUtcTime(timeMillis);
    }

    public /* synthetic */ GenericAnalyticsEvent(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }
}
