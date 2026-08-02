package com.paypal.oslo.feature.inappcheckout.ui.mock.mockselection.viewmodel;

/* loaded from: classes13.dex */
public final class MockSelectionViewModel_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.inappcheckout.ui.mock.mockselection.viewmodel.MockSelectionViewModel> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.inappcheckout.domain.provider.mock.MockFileNameProvider> getHighResolutionOutputSizeshNQ4ISI;
    private final dagger.internal.Provider<com.paypal.oslo.feature.inappcheckout.ui.mock.mockselection.reducer.MockSelectionReducer> getHighSpeedVideoFpsRanges;

    private MockSelectionViewModel_Factory(dagger.internal.Provider<com.paypal.oslo.feature.inappcheckout.domain.provider.mock.MockFileNameProvider> provider, dagger.internal.Provider<com.paypal.oslo.feature.inappcheckout.ui.mock.mockselection.reducer.MockSelectionReducer> provider2) {
        this.getHighResolutionOutputSizeshNQ4ISI = provider;
        this.getHighSpeedVideoFpsRanges = provider2;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.inappcheckout.ui.mock.mockselection.viewmodel.MockSelectionViewModel get() {
        return newInstance(this.getHighResolutionOutputSizeshNQ4ISI.get(), this.getHighSpeedVideoFpsRanges.get());
    }

    public static com.paypal.oslo.feature.inappcheckout.ui.mock.mockselection.viewmodel.MockSelectionViewModel_Factory create(dagger.internal.Provider<com.paypal.oslo.feature.inappcheckout.domain.provider.mock.MockFileNameProvider> provider, dagger.internal.Provider<com.paypal.oslo.feature.inappcheckout.ui.mock.mockselection.reducer.MockSelectionReducer> provider2) {
        return new com.paypal.oslo.feature.inappcheckout.ui.mock.mockselection.viewmodel.MockSelectionViewModel_Factory(provider, provider2);
    }

    public static com.paypal.oslo.feature.inappcheckout.ui.mock.mockselection.viewmodel.MockSelectionViewModel newInstance(com.paypal.oslo.feature.inappcheckout.domain.provider.mock.MockFileNameProvider mockFileNameProvider, com.paypal.oslo.feature.inappcheckout.ui.mock.mockselection.reducer.MockSelectionReducer mockSelectionReducer) {
        return new com.paypal.oslo.feature.inappcheckout.ui.mock.mockselection.viewmodel.MockSelectionViewModel(mockFileNameProvider, mockSelectionReducer);
    }
}
