package com.paypal.oslo.feature.revolvingcreditservicing.data.repository.mock;

/* loaded from: classes14.dex */
public final class MockAccountSummaryRepository_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.revolvingcreditservicing.data.repository.mock.MockAccountSummaryRepository> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.revolvingcreditservicing.domain.repository.ProductConfigurationsRepository> getHighSpeedVideoFpsRangesFor;

    private MockAccountSummaryRepository_Factory(dagger.internal.Provider<com.paypal.oslo.feature.revolvingcreditservicing.domain.repository.ProductConfigurationsRepository> provider) {
        this.getHighSpeedVideoFpsRangesFor = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.revolvingcreditservicing.data.repository.mock.MockAccountSummaryRepository get() {
        return newInstance(this.getHighSpeedVideoFpsRangesFor);
    }

    public static com.paypal.oslo.feature.revolvingcreditservicing.data.repository.mock.MockAccountSummaryRepository_Factory create(dagger.internal.Provider<com.paypal.oslo.feature.revolvingcreditservicing.domain.repository.ProductConfigurationsRepository> provider) {
        return new com.paypal.oslo.feature.revolvingcreditservicing.data.repository.mock.MockAccountSummaryRepository_Factory(provider);
    }

    public static com.paypal.oslo.feature.revolvingcreditservicing.data.repository.mock.MockAccountSummaryRepository newInstance(javax.inject.Provider<com.paypal.oslo.feature.revolvingcreditservicing.domain.repository.ProductConfigurationsRepository> provider) {
        return new com.paypal.oslo.feature.revolvingcreditservicing.data.repository.mock.MockAccountSummaryRepository(provider);
    }
}
