package com.paypal.oslo.feature.debitcard.shared.domain.usecase.fundingoptions;

/* loaded from: classes12.dex */
public final class SetDebitCardFundingOptionsUseCase_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.debitcard.shared.domain.usecase.fundingoptions.SetDebitCardFundingOptionsUseCase> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.debitcard.shared.domain.repository.fundingoptions.FundingOptionsRepository> getHighSpeedVideoFpsRanges;

    private SetDebitCardFundingOptionsUseCase_Factory(dagger.internal.Provider<com.paypal.oslo.feature.debitcard.shared.domain.repository.fundingoptions.FundingOptionsRepository> provider) {
        this.getHighSpeedVideoFpsRanges = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.debitcard.shared.domain.usecase.fundingoptions.SetDebitCardFundingOptionsUseCase get() {
        return newInstance(this.getHighSpeedVideoFpsRanges.get());
    }

    public static com.paypal.oslo.feature.debitcard.shared.domain.usecase.fundingoptions.SetDebitCardFundingOptionsUseCase_Factory create(dagger.internal.Provider<com.paypal.oslo.feature.debitcard.shared.domain.repository.fundingoptions.FundingOptionsRepository> provider) {
        return new com.paypal.oslo.feature.debitcard.shared.domain.usecase.fundingoptions.SetDebitCardFundingOptionsUseCase_Factory(provider);
    }

    public static com.paypal.oslo.feature.debitcard.shared.domain.usecase.fundingoptions.SetDebitCardFundingOptionsUseCase newInstance(com.paypal.oslo.feature.debitcard.shared.domain.repository.fundingoptions.FundingOptionsRepository fundingOptionsRepository) {
        return new com.paypal.oslo.feature.debitcard.shared.domain.usecase.fundingoptions.SetDebitCardFundingOptionsUseCase(fundingOptionsRepository);
    }
}
