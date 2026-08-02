package com.paypal.oslo.feature.oneonboarding.inventory.views.dateofbirth.ui;

/* loaded from: classes13.dex */
public final class DateOfBirthViewComponentViewModel_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.oneonboarding.inventory.views.dateofbirth.ui.DateOfBirthViewComponentViewModel> {
    private final dagger.internal.Provider<com.paypal.oslo.core.appidentity.domain.LocaleInformation> getHighResolutionOutputSizeshNQ4ISI;
    private final dagger.internal.Provider<com.paypal.oslo.core.i18n.domain.usecase.DateTimeFormatUseCase> getHighSpeedVideoFpsRanges;

    private DateOfBirthViewComponentViewModel_Factory(dagger.internal.Provider<com.paypal.oslo.core.i18n.domain.usecase.DateTimeFormatUseCase> provider, dagger.internal.Provider<com.paypal.oslo.core.appidentity.domain.LocaleInformation> provider2) {
        this.getHighSpeedVideoFpsRanges = provider;
        this.getHighResolutionOutputSizeshNQ4ISI = provider2;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.oneonboarding.inventory.views.dateofbirth.ui.DateOfBirthViewComponentViewModel get() {
        return newInstance(this.getHighSpeedVideoFpsRanges.get(), this.getHighResolutionOutputSizeshNQ4ISI.get());
    }

    public static com.paypal.oslo.feature.oneonboarding.inventory.views.dateofbirth.ui.DateOfBirthViewComponentViewModel_Factory create(dagger.internal.Provider<com.paypal.oslo.core.i18n.domain.usecase.DateTimeFormatUseCase> provider, dagger.internal.Provider<com.paypal.oslo.core.appidentity.domain.LocaleInformation> provider2) {
        return new com.paypal.oslo.feature.oneonboarding.inventory.views.dateofbirth.ui.DateOfBirthViewComponentViewModel_Factory(provider, provider2);
    }

    public static com.paypal.oslo.feature.oneonboarding.inventory.views.dateofbirth.ui.DateOfBirthViewComponentViewModel newInstance(com.paypal.oslo.core.i18n.domain.usecase.DateTimeFormatUseCase dateTimeFormatUseCase, com.paypal.oslo.core.appidentity.domain.LocaleInformation localeInformation) {
        return new com.paypal.oslo.feature.oneonboarding.inventory.views.dateofbirth.ui.DateOfBirthViewComponentViewModel(dateTimeFormatUseCase, localeInformation);
    }
}
