package com.paypal.oslo.feature.bnplacquisition.di;

@kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÁ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J&\u0010\n\u001a\u0011\u0012\u0004\u0012\u00020\u00070\u0006j\u0002`\b¢\u0006\u0002\b\t2\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH\u0007¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/bnplacquisition/di/AcquisitionConfigModule;", "", "<init>", "()V", "Lcom/paypal/oslo/feature/bnplacquisition/config/CountryResolver;", "countryResolver", "Lkotlin/Function0;", "Lcom/paypal/oslo/feature/bnplacquisition/config/Country;", "Lcom/paypal/oslo/feature/bnplacquisition/config/CountryGetter;", "Lkotlin/jvm/JvmSuppressWildcards;", "provideCountryGetter", "(Lcom/paypal/oslo/feature/bnplacquisition/config/CountryResolver;)Lkotlin/jvm/functions/Function0;", "Lcom/paypal/oslo/core/telemetry/analytics/AnalyticsTracker;", "provideAnalyticsTracker", "()Lcom/paypal/oslo/core/telemetry/analytics/AnalyticsTracker;"}, k = 1, mv = {2, 3, 0}, xi = 48)
@dagger.Module
/* loaded from: classes5.dex */
public final class AcquisitionConfigModule {
    public static final int $stable = 0;
    public static final com.paypal.oslo.feature.bnplacquisition.di.AcquisitionConfigModule INSTANCE = new com.paypal.oslo.feature.bnplacquisition.di.AcquisitionConfigModule();

    private AcquisitionConfigModule() {
    }

    @dagger.Provides
    @javax.inject.Singleton
    public final kotlin.jvm.functions.Function0<com.paypal.oslo.feature.bnplacquisition.config.Country> provideCountryGetter(com.paypal.oslo.feature.bnplacquisition.config.CountryResolver countryResolver) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(countryResolver, "");
        return new com.paypal.oslo.feature.bnplacquisition.di.AcquisitionConfigModule$provideCountryGetter$1(countryResolver);
    }

    @dagger.Provides
    @javax.inject.Singleton
    public final com.paypal.oslo.core.telemetry.analytics.AnalyticsTracker provideAnalyticsTracker() {
        return com.paypal.oslo.feature.bnplacquisition.AnalyticsTrackerKt.analyticsTracker;
    }
}
