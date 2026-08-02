package com.paypal.oslo.feature.debitcard.shared.domain.usecase.fundingoptions;

/* loaded from: classes12.dex */
public final class RemoveDebitCardFundingOptionUseCase_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.debitcard.shared.domain.usecase.fundingoptions.RemoveDebitCardFundingOptionUseCase> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.debitcard.shared.domain.repository.fundingoptions.FundingOptionsRepository> getHighSpeedVideoSizes;

    private RemoveDebitCardFundingOptionUseCase_Factory(dagger.internal.Provider<com.paypal.oslo.feature.debitcard.shared.domain.repository.fundingoptions.FundingOptionsRepository> provider) {
        this.getHighSpeedVideoSizes = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.debitcard.shared.domain.usecase.fundingoptions.RemoveDebitCardFundingOptionUseCase get() {
        return newInstance(this.getHighSpeedVideoSizes.get());
    }

    public static com.paypal.oslo.feature.debitcard.shared.domain.usecase.fundingoptions.RemoveDebitCardFundingOptionUseCase_Factory create(dagger.internal.Provider<com.paypal.oslo.feature.debitcard.shared.domain.repository.fundingoptions.FundingOptionsRepository> provider) {
        return new com.paypal.oslo.feature.debitcard.shared.domain.usecase.fundingoptions.RemoveDebitCardFundingOptionUseCase_Factory(provider);
    }

    public static com.paypal.oslo.feature.debitcard.shared.domain.usecase.fundingoptions.RemoveDebitCardFundingOptionUseCase newInstance(com.paypal.oslo.feature.debitcard.shared.domain.repository.fundingoptions.FundingOptionsRepository fundingOptionsRepository) {
        return new com.paypal.oslo.feature.debitcard.shared.domain.usecase.fundingoptions.RemoveDebitCardFundingOptionUseCase(fundingOptionsRepository);
    }
}
