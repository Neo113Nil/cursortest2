package com.paypal.oslo.feature.oneonboarding.inventory.views.name.ui;

/* loaded from: classes13.dex */
public final class NameViewComponentViewModel_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.oneonboarding.inventory.views.name.ui.NameViewComponentViewModel> {
    private final dagger.internal.Provider<com.paypal.oslo.core.i18n.domain.usecase.NameLayoutUseCase> getHighSpeedVideoFpsRangesFor;
    private final dagger.internal.Provider<com.paypal.oslo.core.i18n.domain.usecase.NameValidationUseCase> getHighSpeedVideoSizes;

    private NameViewComponentViewModel_Factory(dagger.internal.Provider<com.paypal.oslo.core.i18n.domain.usecase.NameLayoutUseCase> provider, dagger.internal.Provider<com.paypal.oslo.core.i18n.domain.usecase.NameValidationUseCase> provider2) {
        this.getHighSpeedVideoFpsRangesFor = provider;
        this.getHighSpeedVideoSizes = provider2;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.oneonboarding.inventory.views.name.ui.NameViewComponentViewModel get() {
        return newInstance(this.getHighSpeedVideoFpsRangesFor.get(), this.getHighSpeedVideoSizes.get());
    }

    public static com.paypal.oslo.feature.oneonboarding.inventory.views.name.ui.NameViewComponentViewModel_Factory create(dagger.internal.Provider<com.paypal.oslo.core.i18n.domain.usecase.NameLayoutUseCase> provider, dagger.internal.Provider<com.paypal.oslo.core.i18n.domain.usecase.NameValidationUseCase> provider2) {
        return new com.paypal.oslo.feature.oneonboarding.inventory.views.name.ui.NameViewComponentViewModel_Factory(provider, provider2);
    }

    public static com.paypal.oslo.feature.oneonboarding.inventory.views.name.ui.NameViewComponentViewModel newInstance(com.paypal.oslo.core.i18n.domain.usecase.NameLayoutUseCase nameLayoutUseCase, com.paypal.oslo.core.i18n.domain.usecase.NameValidationUseCase nameValidationUseCase) {
        return new com.paypal.oslo.feature.oneonboarding.inventory.views.name.ui.NameViewComponentViewModel(nameLayoutUseCase, nameValidationUseCase);
    }
}
