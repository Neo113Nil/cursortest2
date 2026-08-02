package com.paypal.oslo.feature.taptopay.data.repository.mock;

/* loaded from: classes15.dex */
public final class MockTapToPayService_MembersInjector implements dagger.MembersInjector<com.paypal.oslo.feature.taptopay.data.repository.mock.MockTapToPayService> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.taptopay.data.repository.mock.MockTransactionRepository> getHighResolutionOutputSizeshNQ4ISI;
    private final dagger.internal.Provider<com.paypal.oslo.feature.taptopay.domain.repository.card.CardRepository> getHighSpeedVideoFpsRanges;
    private final dagger.internal.Provider<java.util.Set<com.paypal.oslo.feature.taptopay.domain.model.card.paypal.OrphanedCardLifecycleDependency>> getHighSpeedVideoFpsRangesFor;

    private MockTapToPayService_MembersInjector(dagger.internal.Provider<com.paypal.oslo.feature.taptopay.domain.repository.card.CardRepository> provider, dagger.internal.Provider<com.paypal.oslo.feature.taptopay.data.repository.mock.MockTransactionRepository> provider2, dagger.internal.Provider<java.util.Set<com.paypal.oslo.feature.taptopay.domain.model.card.paypal.OrphanedCardLifecycleDependency>> provider3) {
        this.getHighSpeedVideoFpsRanges = provider;
        this.getHighResolutionOutputSizeshNQ4ISI = provider2;
        this.getHighSpeedVideoFpsRangesFor = provider3;
    }

    @Override // dagger.MembersInjector
    public final void injectMembers(com.paypal.oslo.feature.taptopay.data.repository.mock.MockTapToPayService mockTapToPayService) {
        injectCardRepository(mockTapToPayService, this.getHighSpeedVideoFpsRanges.get());
        injectTransactionRepository(mockTapToPayService, this.getHighResolutionOutputSizeshNQ4ISI.get());
        injectOrphanedCardLifecycleDependencies(mockTapToPayService, this.getHighSpeedVideoFpsRangesFor.get());
    }

    public static dagger.MembersInjector<com.paypal.oslo.feature.taptopay.data.repository.mock.MockTapToPayService> create(dagger.internal.Provider<com.paypal.oslo.feature.taptopay.domain.repository.card.CardRepository> provider, dagger.internal.Provider<com.paypal.oslo.feature.taptopay.data.repository.mock.MockTransactionRepository> provider2, dagger.internal.Provider<java.util.Set<com.paypal.oslo.feature.taptopay.domain.model.card.paypal.OrphanedCardLifecycleDependency>> provider3) {
        return new com.paypal.oslo.feature.taptopay.data.repository.mock.MockTapToPayService_MembersInjector(provider, provider2, provider3);
    }

    public static void injectCardRepository(com.paypal.oslo.feature.taptopay.data.repository.mock.MockTapToPayService mockTapToPayService, com.paypal.oslo.feature.taptopay.domain.repository.card.CardRepository cardRepository) {
        mockTapToPayService.cardRepository = cardRepository;
    }

    public static void injectTransactionRepository(com.paypal.oslo.feature.taptopay.data.repository.mock.MockTapToPayService mockTapToPayService, com.paypal.oslo.feature.taptopay.data.repository.mock.MockTransactionRepository mockTransactionRepository) {
        mockTapToPayService.transactionRepository = mockTransactionRepository;
    }

    public static void injectOrphanedCardLifecycleDependencies(com.paypal.oslo.feature.taptopay.data.repository.mock.MockTapToPayService mockTapToPayService, java.util.Set<com.paypal.oslo.feature.taptopay.domain.model.card.paypal.OrphanedCardLifecycleDependency> set) {
        mockTapToPayService.orphanedCardLifecycleDependencies = set;
    }
}
