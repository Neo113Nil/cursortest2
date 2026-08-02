package com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.reviewscreen;

/* loaded from: classes14.dex */
public final class ReviewScreenViewModel_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.reviewscreen.ReviewScreenViewModel> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.savings.domain.usecase.GetFinancialInstrumentsUseCase> Camera2StreamConfigurationMap;
    private final dagger.internal.Provider<com.paypal.oslo.feature.savings.domain.usecase.FetchGoalsUseCase> getHighResolutionOutputSizeshNQ4ISI;
    private final dagger.internal.Provider<com.paypal.oslo.feature.savings.domain.usecase.CreateSavingsGoalUseCase> getHighSpeedVideoFpsRanges;
    private final dagger.internal.Provider<com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.TransactionErrorToastManager> getHighSpeedVideoFpsRangesFor;
    private final dagger.internal.Provider<java.util.Set<com.paypal.oslo.feature.wallet.api.ui.cards.add.provider.AddCardWidgetProvider>> getHighSpeedVideoSizes;
    private final dagger.internal.Provider<com.paypal.oslo.feature.savings.domain.usecase.TransferMoneyboxUseCase> getInputSizeshNQ4ISI;

    private ReviewScreenViewModel_Factory(dagger.internal.Provider<com.paypal.oslo.feature.savings.domain.usecase.GetFinancialInstrumentsUseCase> provider, dagger.internal.Provider<com.paypal.oslo.feature.savings.domain.usecase.FetchGoalsUseCase> provider2, dagger.internal.Provider<com.paypal.oslo.feature.savings.domain.usecase.TransferMoneyboxUseCase> provider3, dagger.internal.Provider<com.paypal.oslo.feature.savings.domain.usecase.CreateSavingsGoalUseCase> provider4, dagger.internal.Provider<com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.TransactionErrorToastManager> provider5, dagger.internal.Provider<java.util.Set<com.paypal.oslo.feature.wallet.api.ui.cards.add.provider.AddCardWidgetProvider>> provider6) {
        this.Camera2StreamConfigurationMap = provider;
        this.getHighResolutionOutputSizeshNQ4ISI = provider2;
        this.getInputSizeshNQ4ISI = provider3;
        this.getHighSpeedVideoFpsRanges = provider4;
        this.getHighSpeedVideoFpsRangesFor = provider5;
        this.getHighSpeedVideoSizes = provider6;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.reviewscreen.ReviewScreenViewModel get() {
        return newInstance(this.Camera2StreamConfigurationMap.get(), this.getHighResolutionOutputSizeshNQ4ISI.get(), this.getInputSizeshNQ4ISI.get(), this.getHighSpeedVideoFpsRanges.get(), this.getHighSpeedVideoFpsRangesFor.get(), this.getHighSpeedVideoSizes.get());
    }

    public static com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.reviewscreen.ReviewScreenViewModel_Factory create(dagger.internal.Provider<com.paypal.oslo.feature.savings.domain.usecase.GetFinancialInstrumentsUseCase> provider, dagger.internal.Provider<com.paypal.oslo.feature.savings.domain.usecase.FetchGoalsUseCase> provider2, dagger.internal.Provider<com.paypal.oslo.feature.savings.domain.usecase.TransferMoneyboxUseCase> provider3, dagger.internal.Provider<com.paypal.oslo.feature.savings.domain.usecase.CreateSavingsGoalUseCase> provider4, dagger.internal.Provider<com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.TransactionErrorToastManager> provider5, dagger.internal.Provider<java.util.Set<com.paypal.oslo.feature.wallet.api.ui.cards.add.provider.AddCardWidgetProvider>> provider6) {
        return new com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.reviewscreen.ReviewScreenViewModel_Factory(provider, provider2, provider3, provider4, provider5, provider6);
    }

    public static com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.reviewscreen.ReviewScreenViewModel newInstance(com.paypal.oslo.feature.savings.domain.usecase.GetFinancialInstrumentsUseCase getFinancialInstrumentsUseCase, com.paypal.oslo.feature.savings.domain.usecase.FetchGoalsUseCase fetchGoalsUseCase, com.paypal.oslo.feature.savings.domain.usecase.TransferMoneyboxUseCase transferMoneyboxUseCase, com.paypal.oslo.feature.savings.domain.usecase.CreateSavingsGoalUseCase createSavingsGoalUseCase, com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.TransactionErrorToastManager transactionErrorToastManager, java.util.Set<com.paypal.oslo.feature.wallet.api.ui.cards.add.provider.AddCardWidgetProvider> set) {
        return new com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.reviewscreen.ReviewScreenViewModel(getFinancialInstrumentsUseCase, fetchGoalsUseCase, transferMoneyboxUseCase, createSavingsGoalUseCase, transactionErrorToastManager, set);
    }
}
