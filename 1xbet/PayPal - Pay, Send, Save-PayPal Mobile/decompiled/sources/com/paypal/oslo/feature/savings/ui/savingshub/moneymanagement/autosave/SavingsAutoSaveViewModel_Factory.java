package com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.autosave;

/* loaded from: classes14.dex */
public final class SavingsAutoSaveViewModel_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.autosave.SavingsAutoSaveViewModel> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.savings.domain.usecase.FetchGoalsUseCase> getHighSpeedVideoFpsRanges;

    private SavingsAutoSaveViewModel_Factory(dagger.internal.Provider<com.paypal.oslo.feature.savings.domain.usecase.FetchGoalsUseCase> provider) {
        this.getHighSpeedVideoFpsRanges = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.autosave.SavingsAutoSaveViewModel get() {
        return newInstance(this.getHighSpeedVideoFpsRanges.get());
    }

    public static com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.autosave.SavingsAutoSaveViewModel_Factory create(dagger.internal.Provider<com.paypal.oslo.feature.savings.domain.usecase.FetchGoalsUseCase> provider) {
        return new com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.autosave.SavingsAutoSaveViewModel_Factory(provider);
    }

    public static com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.autosave.SavingsAutoSaveViewModel newInstance(com.paypal.oslo.feature.savings.domain.usecase.FetchGoalsUseCase fetchGoalsUseCase) {
        return new com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.autosave.SavingsAutoSaveViewModel(fetchGoalsUseCase);
    }
}
