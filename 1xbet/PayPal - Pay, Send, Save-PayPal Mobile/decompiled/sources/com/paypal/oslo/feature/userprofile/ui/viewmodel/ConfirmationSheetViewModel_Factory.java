package com.paypal.oslo.feature.userprofile.ui.viewmodel;

/* loaded from: classes15.dex */
public final class ConfirmationSheetViewModel_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.userprofile.ui.viewmodel.ConfirmationSheetViewModel> {
    private final dagger.internal.Provider<com.paypal.oslo.core.i18n.domain.interfaces.LocaleProvider> getHighSpeedVideoFpsRangesFor;

    private ConfirmationSheetViewModel_Factory(dagger.internal.Provider<com.paypal.oslo.core.i18n.domain.interfaces.LocaleProvider> provider) {
        this.getHighSpeedVideoFpsRangesFor = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.userprofile.ui.viewmodel.ConfirmationSheetViewModel get() {
        return newInstance(this.getHighSpeedVideoFpsRangesFor.get());
    }

    public static com.paypal.oslo.feature.userprofile.ui.viewmodel.ConfirmationSheetViewModel_Factory create(dagger.internal.Provider<com.paypal.oslo.core.i18n.domain.interfaces.LocaleProvider> provider) {
        return new com.paypal.oslo.feature.userprofile.ui.viewmodel.ConfirmationSheetViewModel_Factory(provider);
    }

    public static com.paypal.oslo.feature.userprofile.ui.viewmodel.ConfirmationSheetViewModel newInstance(com.paypal.oslo.core.i18n.domain.interfaces.LocaleProvider localeProvider) {
        return new com.paypal.oslo.feature.userprofile.ui.viewmodel.ConfirmationSheetViewModel(localeProvider);
    }
}
