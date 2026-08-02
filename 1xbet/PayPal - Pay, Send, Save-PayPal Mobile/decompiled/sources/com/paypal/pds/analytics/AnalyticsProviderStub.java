package com.paypal.pds.analytics;

@kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\n\u0010\u000b"}, d2 = {"Lcom/paypal/pds/analytics/AnalyticsProviderStub;", "Lcom/paypal/pds/analytics/AnalyticsProvider;", "<init>", "()V", "Lcom/paypal/pds/analytics/AnalyticsEvent;", "event", "", "track", "(Lcom/paypal/pds/analytics/AnalyticsEvent;)V", "", "currentTimestamp", "()J"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class AnalyticsProviderStub implements com.paypal.pds.analytics.AnalyticsProvider {
    public static final int $stable = 0;
    public static final com.paypal.pds.analytics.AnalyticsProviderStub INSTANCE = new com.paypal.pds.analytics.AnalyticsProviderStub();

    @Override // com.paypal.pds.analytics.AnalyticsProvider
    public final long currentTimestamp() {
        return 0L;
    }

    private AnalyticsProviderStub() {
    }

    @Override // com.paypal.pds.analytics.AnalyticsProvider
    public final void track(com.paypal.pds.analytics.AnalyticsEvent event) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(event, "");
    }
}
