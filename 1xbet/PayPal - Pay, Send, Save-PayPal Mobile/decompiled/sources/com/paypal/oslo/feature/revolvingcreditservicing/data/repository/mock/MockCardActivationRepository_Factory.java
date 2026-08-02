package com.paypal.oslo.feature.revolvingcreditservicing.data.repository.mock;

/* loaded from: classes14.dex */
public final class MockCardActivationRepository_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.revolvingcreditservicing.data.repository.mock.MockCardActivationRepository> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.revolvingcreditservicing.data.repository.mock.MockAccountSummaryRepository> getHighSpeedVideoFpsRangesFor;

    private MockCardActivationRepository_Factory(dagger.internal.Provider<com.paypal.oslo.feature.revolvingcreditservicing.data.repository.mock.MockAccountSummaryRepository> provider) {
        this.getHighSpeedVideoFpsRangesFor = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.revolvingcreditservicing.data.repository.mock.MockCardActivationRepository get() {
        return newInstance(this.getHighSpeedVideoFpsRangesFor.get());
    }

    public static com.paypal.oslo.feature.revolvingcreditservicing.data.repository.mock.MockCardActivationRepository_Factory create(dagger.internal.Provider<com.paypal.oslo.feature.revolvingcreditservicing.data.repository.mock.MockAccountSummaryRepository> provider) {
        return new com.paypal.oslo.feature.revolvingcreditservicing.data.repository.mock.MockCardActivationRepository_Factory(provider);
    }

    public static com.paypal.oslo.feature.revolvingcreditservicing.data.repository.mock.MockCardActivationRepository newInstance(com.paypal.oslo.feature.revolvingcreditservicing.data.repository.mock.MockAccountSummaryRepository mockAccountSummaryRepository) {
        return new com.paypal.oslo.feature.revolvingcreditservicing.data.repository.mock.MockCardActivationRepository(mockAccountSummaryRepository);
    }
}
