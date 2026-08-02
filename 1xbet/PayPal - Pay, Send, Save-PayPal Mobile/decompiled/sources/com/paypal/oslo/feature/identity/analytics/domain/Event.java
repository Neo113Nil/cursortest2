package com.paypal.oslo.feature.identity.analytics.domain;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\t\b\u0080\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0006\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tj\u0002\b\nj\u0002\b\u000b"}, d2 = {"Lcom/paypal/oslo/feature/identity/analytics/domain/Event;", "", "", "p0", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "Ljava/lang/String;", "getValue", "()Ljava/lang/String;", "LoginInitiated", "LoginSuccess"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class Event {
    public static final com.paypal.oslo.feature.identity.analytics.domain.Event LoginInitiated;
    public static final com.paypal.oslo.feature.identity.analytics.domain.Event LoginSuccess;
    private static final /* synthetic */ com.paypal.oslo.feature.identity.analytics.domain.Event[] getHighSpeedVideoFpsRanges;
    private static final /* synthetic */ kotlin.enums.EnumEntries getHighSpeedVideoSizes;
    private final java.lang.String value;

    private Event(java.lang.String str, int i, java.lang.String str2) {
        this.value = str2;
    }

    public final java.lang.String getValue() {
        return this.value;
    }

    static {
        com.paypal.oslo.feature.identity.analytics.domain.Event event = new com.paypal.oslo.feature.identity.analytics.domain.Event("LoginInitiated", 0, "login_initiated");
        LoginInitiated = event;
        com.paypal.oslo.feature.identity.analytics.domain.Event event2 = new com.paypal.oslo.feature.identity.analytics.domain.Event("LoginSuccess", 1, "login_success");
        LoginSuccess = event2;
        com.paypal.oslo.feature.identity.analytics.domain.Event[] eventArr = {event, event2};
        getHighSpeedVideoFpsRanges = eventArr;
        getHighSpeedVideoSizes = kotlin.enums.EnumEntriesKt.enumEntries(eventArr);
    }

    public static com.paypal.oslo.feature.identity.analytics.domain.Event[] values() {
        return (com.paypal.oslo.feature.identity.analytics.domain.Event[]) getHighSpeedVideoFpsRanges.clone();
    }

    public static com.paypal.oslo.feature.identity.analytics.domain.Event valueOf(java.lang.String str) {
        return (com.paypal.oslo.feature.identity.analytics.domain.Event) java.lang.Enum.valueOf(com.paypal.oslo.feature.identity.analytics.domain.Event.class, str);
    }

    public static kotlin.enums.EnumEntries<com.paypal.oslo.feature.identity.analytics.domain.Event> getEntries() {
        return getHighSpeedVideoSizes;
    }
}
