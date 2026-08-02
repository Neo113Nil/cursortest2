package com.paypal.oslo.feature.revolvingcreditservicing.ui.specialfinancing.list.viewmodel;

/* loaded from: classes14.dex */
public final class SpecialFinancingViewModel_SpecialFinancingStateStoreFactory_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.revolvingcreditservicing.ui.specialfinancing.list.viewmodel.SpecialFinancingViewModel.SpecialFinancingStateStoreFactory> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.revolvingcreditservicing.domain.usecase.GetSpecialFinancingPageUseCase> getHighResolutionOutputSizeshNQ4ISI;
    private final dagger.internal.Provider<com.paypal.oslo.feature.revolvingcreditservicing.ui.specialfinancing.list.mapper.SpecialFinancingMapper> getHighSpeedVideoFpsRangesFor;
    private final dagger.internal.Provider<com.paypal.oslo.feature.revolvingcreditservicing.ui.specialfinancing.list.viewmodel.SpecialFinancingReducer> getHighSpeedVideoSizes;

    private SpecialFinancingViewModel_SpecialFinancingStateStoreFactory_Factory(dagger.internal.Provider<com.paypal.oslo.feature.revolvingcreditservicing.ui.specialfinancing.list.viewmodel.SpecialFinancingReducer> provider, dagger.internal.Provider<com.paypal.oslo.feature.revolvingcreditservicing.domain.usecase.GetSpecialFinancingPageUseCase> provider2, dagger.internal.Provider<com.paypal.oslo.feature.revolvingcreditservicing.ui.specialfinancing.list.mapper.SpecialFinancingMapper> provider3) {
        this.getHighSpeedVideoSizes = provider;
        this.getHighResolutionOutputSizeshNQ4ISI = provider2;
        this.getHighSpeedVideoFpsRangesFor = provider3;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.revolvingcreditservicing.ui.specialfinancing.list.viewmodel.SpecialFinancingViewModel.SpecialFinancingStateStoreFactory get() {
        return newInstance(this.getHighSpeedVideoSizes.get(), this.getHighResolutionOutputSizeshNQ4ISI.get(), this.getHighSpeedVideoFpsRangesFor.get());
    }

    public static com.paypal.oslo.feature.revolvingcreditservicing.ui.specialfinancing.list.viewmodel.SpecialFinancingViewModel_SpecialFinancingStateStoreFactory_Factory create(dagger.internal.Provider<com.paypal.oslo.feature.revolvingcreditservicing.ui.specialfinancing.list.viewmodel.SpecialFinancingReducer> provider, dagger.internal.Provider<com.paypal.oslo.feature.revolvingcreditservicing.domain.usecase.GetSpecialFinancingPageUseCase> provider2, dagger.internal.Provider<com.paypal.oslo.feature.revolvingcreditservicing.ui.specialfinancing.list.mapper.SpecialFinancingMapper> provider3) {
        return new com.paypal.oslo.feature.revolvingcreditservicing.ui.specialfinancing.list.viewmodel.SpecialFinancingViewModel_SpecialFinancingStateStoreFactory_Factory(provider, provider2, provider3);
    }

    public static com.paypal.oslo.feature.revolvingcreditservicing.ui.specialfinancing.list.viewmodel.SpecialFinancingViewModel.SpecialFinancingStateStoreFactory newInstance(com.paypal.oslo.feature.revolvingcreditservicing.ui.specialfinancing.list.viewmodel.SpecialFinancingReducer specialFinancingReducer, com.paypal.oslo.feature.revolvingcreditservicing.domain.usecase.GetSpecialFinancingPageUseCase getSpecialFinancingPageUseCase, com.paypal.oslo.feature.revolvingcreditservicing.ui.specialfinancing.list.mapper.SpecialFinancingMapper specialFinancingMapper) {
        return new com.paypal.oslo.feature.revolvingcreditservicing.ui.specialfinancing.list.viewmodel.SpecialFinancingViewModel.SpecialFinancingStateStoreFactory(specialFinancingReducer, getSpecialFinancingPageUseCase, specialFinancingMapper);
    }
}
