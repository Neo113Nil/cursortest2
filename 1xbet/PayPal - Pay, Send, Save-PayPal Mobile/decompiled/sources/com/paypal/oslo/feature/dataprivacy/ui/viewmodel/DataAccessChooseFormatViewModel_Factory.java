package com.paypal.oslo.feature.dataprivacy.ui.viewmodel;

/* loaded from: classes12.dex */
public final class DataAccessChooseFormatViewModel_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.dataprivacy.ui.viewmodel.DataAccessChooseFormatViewModel> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.dataprivacy.domain.usecase.CreateDataAccessRequestUseCase> getHighSpeedVideoFpsRangesFor;

    private DataAccessChooseFormatViewModel_Factory(dagger.internal.Provider<com.paypal.oslo.feature.dataprivacy.domain.usecase.CreateDataAccessRequestUseCase> provider) {
        this.getHighSpeedVideoFpsRangesFor = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.dataprivacy.ui.viewmodel.DataAccessChooseFormatViewModel get() {
        return newInstance(this.getHighSpeedVideoFpsRangesFor.get());
    }

    public static com.paypal.oslo.feature.dataprivacy.ui.viewmodel.DataAccessChooseFormatViewModel_Factory create(dagger.internal.Provider<com.paypal.oslo.feature.dataprivacy.domain.usecase.CreateDataAccessRequestUseCase> provider) {
        return new com.paypal.oslo.feature.dataprivacy.ui.viewmodel.DataAccessChooseFormatViewModel_Factory(provider);
    }

    public static com.paypal.oslo.feature.dataprivacy.ui.viewmodel.DataAccessChooseFormatViewModel newInstance(com.paypal.oslo.feature.dataprivacy.domain.usecase.CreateDataAccessRequestUseCase createDataAccessRequestUseCase) {
        return new com.paypal.oslo.feature.dataprivacy.ui.viewmodel.DataAccessChooseFormatViewModel(createDataAccessRequestUseCase);
    }
}
