package com.paypal.oslo.core.telemetry.analytics.event;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000b"}, d2 = {"Lcom/paypal/oslo/core/telemetry/analytics/event/EventType;", "", "<init>", "(Ljava/lang/String;I)V", "", "toString", "()Ljava/lang/String;", "Appeared", "Disappeared", "Clicked", "Available", lib.android.paypal.com.magnessdk.c.b.i}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class EventType {
    public static final com.paypal.oslo.core.telemetry.analytics.event.EventType Activity;
    public static final com.paypal.oslo.core.telemetry.analytics.event.EventType Appeared;
    public static final com.paypal.oslo.core.telemetry.analytics.event.EventType Available;
    public static final com.paypal.oslo.core.telemetry.analytics.event.EventType Clicked;
    public static final com.paypal.oslo.core.telemetry.analytics.event.EventType Disappeared;
    private static final /* synthetic */ kotlin.enums.EnumEntries getHighSpeedVideoFpsRanges;
    private static final /* synthetic */ com.paypal.oslo.core.telemetry.analytics.event.EventType[] getHighSpeedVideoFpsRangesFor;

    private EventType(java.lang.String str, int i) {
    }

    static {
        com.paypal.oslo.core.telemetry.analytics.event.EventType eventType = new com.paypal.oslo.core.telemetry.analytics.event.EventType("Appeared", 0);
        Appeared = eventType;
        com.paypal.oslo.core.telemetry.analytics.event.EventType eventType2 = new com.paypal.oslo.core.telemetry.analytics.event.EventType("Disappeared", 1);
        Disappeared = eventType2;
        com.paypal.oslo.core.telemetry.analytics.event.EventType eventType3 = new com.paypal.oslo.core.telemetry.analytics.event.EventType("Clicked", 2);
        Clicked = eventType3;
        com.paypal.oslo.core.telemetry.analytics.event.EventType eventType4 = new com.paypal.oslo.core.telemetry.analytics.event.EventType("Available", 3);
        Available = eventType4;
        com.paypal.oslo.core.telemetry.analytics.event.EventType eventType5 = new com.paypal.oslo.core.telemetry.analytics.event.EventType(lib.android.paypal.com.magnessdk.c.b.i, 4);
        Activity = eventType5;
        com.paypal.oslo.core.telemetry.analytics.event.EventType[] eventTypeArr = {eventType, eventType2, eventType3, eventType4, eventType5};
        getHighSpeedVideoFpsRangesFor = eventTypeArr;
        getHighSpeedVideoFpsRanges = kotlin.enums.EnumEntriesKt.enumEntries(eventTypeArr);
    }

    @Override // java.lang.Enum
    public final java.lang.String toString() {
        java.lang.String lowerCase = super.toString().toLowerCase(java.util.Locale.ROOT);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(lowerCase, "");
        return lowerCase;
    }

    public static com.paypal.oslo.core.telemetry.analytics.event.EventType[] values() {
        return (com.paypal.oslo.core.telemetry.analytics.event.EventType[]) getHighSpeedVideoFpsRangesFor.clone();
    }

    public static com.paypal.oslo.core.telemetry.analytics.event.EventType valueOf(java.lang.String str) {
        return (com.paypal.oslo.core.telemetry.analytics.event.EventType) java.lang.Enum.valueOf(com.paypal.oslo.core.telemetry.analytics.event.EventType.class, str);
    }

    public static kotlin.enums.EnumEntries<com.paypal.oslo.core.telemetry.analytics.event.EventType> getEntries() {
        return getHighSpeedVideoFpsRanges;
    }
}
