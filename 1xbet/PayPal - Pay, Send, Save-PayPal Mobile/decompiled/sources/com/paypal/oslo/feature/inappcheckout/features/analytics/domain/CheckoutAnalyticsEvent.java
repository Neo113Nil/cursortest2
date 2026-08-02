package com.paypal.oslo.feature.inappcheckout.features.analytics.domain;

@kotlin.Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\b&\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u001a\u0010\u0003\u001a\u00020\u00028\u0017X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\b\u001a\u0004\b\t\u0010\nR\u001a\u0010\u0005\u001a\u00020\u00048\u0017X\u0097\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u000b\u001a\u0004\b\f\u0010\rR\u0014\u0010\u000f\u001a\u00020\u00028WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\n"}, d2 = {"Lcom/paypal/oslo/feature/inappcheckout/features/analytics/domain/CheckoutAnalyticsEvent;", "", "", "name", "Lcom/paypal/oslo/feature/inappcheckout/features/analytics/domain/AnalyticsEventType;", "eventType", "<init>", "(Ljava/lang/String;Lcom/paypal/oslo/feature/inappcheckout/features/analytics/domain/AnalyticsEventType;)V", "Ljava/lang/String;", "getName", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/inappcheckout/features/analytics/domain/AnalyticsEventType;", "getEventType", "()Lcom/paypal/oslo/feature/inappcheckout/features/analytics/domain/AnalyticsEventType;", "getExportedEventName", "exportedEventName"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public abstract class CheckoutAnalyticsEvent {
    public static final int $stable = 0;
    private final com.paypal.oslo.feature.inappcheckout.features.analytics.domain.AnalyticsEventType eventType;
    private final java.lang.String name;

    public CheckoutAnalyticsEvent(java.lang.String str, com.paypal.oslo.feature.inappcheckout.features.analytics.domain.AnalyticsEventType analyticsEventType) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(analyticsEventType, "");
        this.name = str;
        this.eventType = analyticsEventType;
    }

    public java.lang.String getName() {
        return this.name;
    }

    public com.paypal.oslo.feature.inappcheckout.features.analytics.domain.AnalyticsEventType getEventType() {
        return this.eventType;
    }

    public java.lang.String getExportedEventName() {
        return getName();
    }
}
