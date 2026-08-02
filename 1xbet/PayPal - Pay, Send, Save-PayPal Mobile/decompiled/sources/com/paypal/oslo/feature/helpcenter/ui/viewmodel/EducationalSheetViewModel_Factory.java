package com.paypal.oslo.feature.helpcenter.ui.viewmodel;

/* loaded from: classes12.dex */
public final class EducationalSheetViewModel_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.helpcenter.ui.viewmodel.EducationalSheetViewModel> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.helpcenter.domain.usecase.FetchEducationalSheetDataUseCase> Camera2StreamConfigurationMap;

    private EducationalSheetViewModel_Factory(dagger.internal.Provider<com.paypal.oslo.feature.helpcenter.domain.usecase.FetchEducationalSheetDataUseCase> provider) {
        this.Camera2StreamConfigurationMap = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.helpcenter.ui.viewmodel.EducationalSheetViewModel get() {
        return newInstance(this.Camera2StreamConfigurationMap.get());
    }

    public static com.paypal.oslo.feature.helpcenter.ui.viewmodel.EducationalSheetViewModel_Factory create(dagger.internal.Provider<com.paypal.oslo.feature.helpcenter.domain.usecase.FetchEducationalSheetDataUseCase> provider) {
        return new com.paypal.oslo.feature.helpcenter.ui.viewmodel.EducationalSheetViewModel_Factory(provider);
    }

    public static com.paypal.oslo.feature.helpcenter.ui.viewmodel.EducationalSheetViewModel newInstance(com.paypal.oslo.feature.helpcenter.domain.usecase.FetchEducationalSheetDataUseCase fetchEducationalSheetDataUseCase) {
        return new com.paypal.oslo.feature.helpcenter.ui.viewmodel.EducationalSheetViewModel(fetchEducationalSheetDataUseCase);
    }
}
