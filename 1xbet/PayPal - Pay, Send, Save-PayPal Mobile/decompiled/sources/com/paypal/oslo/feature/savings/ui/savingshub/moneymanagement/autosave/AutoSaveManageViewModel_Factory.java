package com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.autosave;

/* loaded from: classes14.dex */
public final class AutoSaveManageViewModel_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.autosave.AutoSaveManageViewModel> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.savings.domain.usecase.GetFinancialInstrumentsUseCase> getHighResolutionOutputSizeshNQ4ISI;
    private final dagger.internal.Provider<com.paypal.oslo.feature.savings.domain.usecase.UpdateMoneyboxTransferScheduleUseCase> getHighSpeedVideoFpsRanges;
    private final dagger.internal.Provider<com.paypal.oslo.feature.savings.domain.usecase.DeleteMoneyboxTransferScheduleUseCase> getHighSpeedVideoFpsRangesFor;
    private final dagger.internal.Provider<java.util.Set<com.paypal.oslo.feature.wallet.api.ui.cards.add.provider.AddCardWidgetProvider>> getHighSpeedVideoSizes;

    private AutoSaveManageViewModel_Factory(dagger.internal.Provider<com.paypal.oslo.feature.savings.domain.usecase.GetFinancialInstrumentsUseCase> provider, dagger.internal.Provider<com.paypal.oslo.feature.savings.domain.usecase.DeleteMoneyboxTransferScheduleUseCase> provider2, dagger.internal.Provider<com.paypal.oslo.feature.savings.domain.usecase.UpdateMoneyboxTransferScheduleUseCase> provider3, dagger.internal.Provider<java.util.Set<com.paypal.oslo.feature.wallet.api.ui.cards.add.provider.AddCardWidgetProvider>> provider4) {
        this.getHighResolutionOutputSizeshNQ4ISI = provider;
        this.getHighSpeedVideoFpsRangesFor = provider2;
        this.getHighSpeedVideoFpsRanges = provider3;
        this.getHighSpeedVideoSizes = provider4;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.autosave.AutoSaveManageViewModel get() {
        return newInstance(this.getHighResolutionOutputSizeshNQ4ISI.get(), this.getHighSpeedVideoFpsRangesFor.get(), this.getHighSpeedVideoFpsRanges.get(), this.getHighSpeedVideoSizes.get());
    }

    public static com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.autosave.AutoSaveManageViewModel_Factory create(dagger.internal.Provider<com.paypal.oslo.feature.savings.domain.usecase.GetFinancialInstrumentsUseCase> provider, dagger.internal.Provider<com.paypal.oslo.feature.savings.domain.usecase.DeleteMoneyboxTransferScheduleUseCase> provider2, dagger.internal.Provider<com.paypal.oslo.feature.savings.domain.usecase.UpdateMoneyboxTransferScheduleUseCase> provider3, dagger.internal.Provider<java.util.Set<com.paypal.oslo.feature.wallet.api.ui.cards.add.provider.AddCardWidgetProvider>> provider4) {
        return new com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.autosave.AutoSaveManageViewModel_Factory(provider, provider2, provider3, provider4);
    }

    public static com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.autosave.AutoSaveManageViewModel newInstance(com.paypal.oslo.feature.savings.domain.usecase.GetFinancialInstrumentsUseCase getFinancialInstrumentsUseCase, com.paypal.oslo.feature.savings.domain.usecase.DeleteMoneyboxTransferScheduleUseCase deleteMoneyboxTransferScheduleUseCase, com.paypal.oslo.feature.savings.domain.usecase.UpdateMoneyboxTransferScheduleUseCase updateMoneyboxTransferScheduleUseCase, java.util.Set<com.paypal.oslo.feature.wallet.api.ui.cards.add.provider.AddCardWidgetProvider> set) {
        return new com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.autosave.AutoSaveManageViewModel(getFinancialInstrumentsUseCase, deleteMoneyboxTransferScheduleUseCase, updateMoneyboxTransferScheduleUseCase, set);
    }
}
