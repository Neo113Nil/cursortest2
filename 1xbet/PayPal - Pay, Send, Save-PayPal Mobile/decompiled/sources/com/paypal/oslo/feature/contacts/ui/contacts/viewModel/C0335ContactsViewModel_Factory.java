package com.paypal.oslo.feature.contacts.ui.contacts.viewModel;

/* renamed from: com.paypal.oslo.feature.contacts.ui.contacts.viewModel.ContactsViewModel_Factory, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C0335ContactsViewModel_Factory {
    private final dagger.internal.Provider<com.paypal.oslo.core.i18n.domain.interfaces.LocaleProvider> Camera2StreamConfigurationMap;
    private final dagger.internal.Provider<com.paypal.oslo.core.i18n.domain.usecase.GetCountriesListUseCase> getHighResolutionOutputSizeshNQ4ISI;
    private final dagger.internal.Provider<com.paypal.oslo.feature.contacts.ui.utils.PhoneNumberDisplayFormatter> getHighSpeedVideoFpsRangesFor;

    private C0335ContactsViewModel_Factory(dagger.internal.Provider<com.paypal.oslo.core.i18n.domain.usecase.GetCountriesListUseCase> provider, dagger.internal.Provider<com.paypal.oslo.feature.contacts.ui.utils.PhoneNumberDisplayFormatter> provider2, dagger.internal.Provider<com.paypal.oslo.core.i18n.domain.interfaces.LocaleProvider> provider3) {
        this.getHighResolutionOutputSizeshNQ4ISI = provider;
        this.getHighSpeedVideoFpsRangesFor = provider2;
        this.Camera2StreamConfigurationMap = provider3;
    }

    public final com.paypal.oslo.feature.contacts.ui.contacts.viewModel.ContactsViewModel get(com.paypal.oslo.feature.contacts.api.searchstrategy.ContactsSearchStrategy contactsSearchStrategy, com.paypal.oslo.feature.contacts.api.configs.ContactSearchScreenConfig contactSearchScreenConfig, com.paypal.oslo.feature.contacts.api.ContactSearchNetworkType contactSearchNetworkType) {
        return newInstance(this.getHighResolutionOutputSizeshNQ4ISI.get(), this.getHighSpeedVideoFpsRangesFor.get(), contactsSearchStrategy, contactSearchScreenConfig, contactSearchNetworkType, this.Camera2StreamConfigurationMap.get());
    }

    public static com.paypal.oslo.feature.contacts.ui.contacts.viewModel.C0335ContactsViewModel_Factory create(dagger.internal.Provider<com.paypal.oslo.core.i18n.domain.usecase.GetCountriesListUseCase> provider, dagger.internal.Provider<com.paypal.oslo.feature.contacts.ui.utils.PhoneNumberDisplayFormatter> provider2, dagger.internal.Provider<com.paypal.oslo.core.i18n.domain.interfaces.LocaleProvider> provider3) {
        return new com.paypal.oslo.feature.contacts.ui.contacts.viewModel.C0335ContactsViewModel_Factory(provider, provider2, provider3);
    }

    public static com.paypal.oslo.feature.contacts.ui.contacts.viewModel.ContactsViewModel newInstance(com.paypal.oslo.core.i18n.domain.usecase.GetCountriesListUseCase getCountriesListUseCase, com.paypal.oslo.feature.contacts.ui.utils.PhoneNumberDisplayFormatter phoneNumberDisplayFormatter, com.paypal.oslo.feature.contacts.api.searchstrategy.ContactsSearchStrategy contactsSearchStrategy, com.paypal.oslo.feature.contacts.api.configs.ContactSearchScreenConfig contactSearchScreenConfig, com.paypal.oslo.feature.contacts.api.ContactSearchNetworkType contactSearchNetworkType, com.paypal.oslo.core.i18n.domain.interfaces.LocaleProvider localeProvider) {
        return new com.paypal.oslo.feature.contacts.ui.contacts.viewModel.ContactsViewModel(getCountriesListUseCase, phoneNumberDisplayFormatter, contactsSearchStrategy, contactSearchScreenConfig, contactSearchNetworkType, localeProvider);
    }
}
