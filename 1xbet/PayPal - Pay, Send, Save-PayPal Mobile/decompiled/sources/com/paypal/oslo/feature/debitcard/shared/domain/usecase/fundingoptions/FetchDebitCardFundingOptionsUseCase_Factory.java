package com.paypal.oslo.feature.debitcard.shared.domain.usecase.fundingoptions;

/* loaded from: classes12.dex */
public final class FetchDebitCardFundingOptionsUseCase_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.debitcard.shared.domain.usecase.fundingoptions.FetchDebitCardFundingOptionsUseCase> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.debitcard.shared.domain.repository.fundingoptions.FundingOptionsRepository> getHighSpeedVideoFpsRanges;

    private FetchDebitCardFundingOptionsUseCase_Factory(dagger.internal.Provider<com.paypal.oslo.feature.debitcard.shared.domain.repository.fundingoptions.FundingOptionsRepository> provider) {
        this.getHighSpeedVideoFpsRanges = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.debitcard.shared.domain.usecase.fundingoptions.FetchDebitCardFundingOptionsUseCase get() {
        return newInstance(this.getHighSpeedVideoFpsRanges.get());
    }

    public static com.paypal.oslo.feature.debitcard.shared.domain.usecase.fundingoptions.FetchDebitCardFundingOptionsUseCase_Factory create(dagger.internal.Provider<com.paypal.oslo.feature.debitcard.shared.domain.repository.fundingoptions.FundingOptionsRepository> provider) {
        return new com.paypal.oslo.feature.debitcard.shared.domain.usecase.fundingoptions.FetchDebitCardFundingOptionsUseCase_Factory(provider);
    }

    public static com.paypal.oslo.feature.debitcard.shared.domain.usecase.fundingoptions.FetchDebitCardFundingOptionsUseCase newInstance(com.paypal.oslo.feature.debitcard.shared.domain.repository.fundingoptions.FundingOptionsRepository fundingOptionsRepository) {
        return new com.paypal.oslo.feature.debitcard.shared.domain.usecase.fundingoptions.FetchDebitCardFundingOptionsUseCase(fundingOptionsRepository);
    }
}
