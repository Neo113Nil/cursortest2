package com.paypal.oslo.feature.publicprofile;

@kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÁ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lcom/paypal/oslo/feature/publicprofile/AnalyticsModule;", "", "<init>", "()V", "Lcom/paypal/oslo/core/telemetry/analytics/AnalyticsTracker;", "provideAnalyticsTracker", "()Lcom/paypal/oslo/core/telemetry/analytics/AnalyticsTracker;"}, k = 1, mv = {2, 3, 0}, xi = 48)
@dagger.Module
/* loaded from: classes13.dex */
public final class AnalyticsModule {
    public static final int $stable = 0;
    public static final com.paypal.oslo.feature.publicprofile.AnalyticsModule INSTANCE = new com.paypal.oslo.feature.publicprofile.AnalyticsModule();

    private AnalyticsModule() {
    }

    @dagger.Provides
    @dagger.multibindings.IntoMap
    @dagger.multibindings.StringKey("feature:publicprofile")
    public final com.paypal.oslo.core.telemetry.analytics.AnalyticsTracker provideAnalyticsTracker() {
        return com.paypal.oslo.feature.publicprofile.AnalyticsTrackerKt.analyticsTracker;
    }
}
