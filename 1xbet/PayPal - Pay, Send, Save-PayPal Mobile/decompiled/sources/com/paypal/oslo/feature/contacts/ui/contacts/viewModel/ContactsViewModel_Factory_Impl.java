package com.paypal.oslo.feature.contacts.ui.contacts.viewModel;

/* loaded from: classes12.dex */
public final class ContactsViewModel_Factory_Impl implements com.paypal.oslo.feature.contacts.ui.contacts.viewModel.ContactsViewModel.Factory {
    private final com.paypal.oslo.feature.contacts.ui.contacts.viewModel.C0335ContactsViewModel_Factory getHighSpeedVideoFpsRangesFor;

    private ContactsViewModel_Factory_Impl(com.paypal.oslo.feature.contacts.ui.contacts.viewModel.C0335ContactsViewModel_Factory c0335ContactsViewModel_Factory) {
        this.getHighSpeedVideoFpsRangesFor = c0335ContactsViewModel_Factory;
    }

    @Override // com.paypal.oslo.feature.contacts.ui.contacts.viewModel.ContactsViewModel.Factory
    public final com.paypal.oslo.feature.contacts.ui.contacts.viewModel.ContactsViewModel create(com.paypal.oslo.feature.contacts.api.searchstrategy.ContactsSearchStrategy contactsSearchStrategy, com.paypal.oslo.feature.contacts.api.configs.ContactSearchScreenConfig contactSearchScreenConfig, com.paypal.oslo.feature.contacts.api.ContactSearchNetworkType contactSearchNetworkType) {
        return this.getHighSpeedVideoFpsRangesFor.get(contactsSearchStrategy, contactSearchScreenConfig, contactSearchNetworkType);
    }

    public static javax.inject.Provider<com.paypal.oslo.feature.contacts.ui.contacts.viewModel.ContactsViewModel.Factory> create(com.paypal.oslo.feature.contacts.ui.contacts.viewModel.C0335ContactsViewModel_Factory c0335ContactsViewModel_Factory) {
        return dagger.internal.InstanceFactory.create(new com.paypal.oslo.feature.contacts.ui.contacts.viewModel.ContactsViewModel_Factory_Impl(c0335ContactsViewModel_Factory));
    }

    public static dagger.internal.Provider<com.paypal.oslo.feature.contacts.ui.contacts.viewModel.ContactsViewModel.Factory> createFactoryProvider(com.paypal.oslo.feature.contacts.ui.contacts.viewModel.C0335ContactsViewModel_Factory c0335ContactsViewModel_Factory) {
        return dagger.internal.InstanceFactory.create(new com.paypal.oslo.feature.contacts.ui.contacts.viewModel.ContactsViewModel_Factory_Impl(c0335ContactsViewModel_Factory));
    }
}
