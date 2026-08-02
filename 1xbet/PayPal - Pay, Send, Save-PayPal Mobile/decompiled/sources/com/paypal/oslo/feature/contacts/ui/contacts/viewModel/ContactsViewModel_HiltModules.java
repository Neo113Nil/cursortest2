package com.paypal.oslo.feature.contacts.ui.contacts.viewModel;

/* loaded from: classes12.dex */
public final class ContactsViewModel_HiltModules {
    private ContactsViewModel_HiltModules() {
    }

    @dagger.Module
    public static abstract class BindsModule {
        @dagger.multibindings.LazyClassKey(com.paypal.oslo.feature.contacts.ui.contacts.viewModel.ContactsViewModel.class)
        @dagger.Binds
        @dagger.multibindings.IntoMap
        public abstract java.lang.Object bind(com.paypal.oslo.feature.contacts.ui.contacts.viewModel.ContactsViewModel.Factory factory);

        private BindsModule() {
        }
    }

    @dagger.Module
    public static final class KeyModule {
        @dagger.Provides
        @dagger.multibindings.LazyClassKey(com.paypal.oslo.feature.contacts.ui.contacts.viewModel.ContactsViewModel.class)
        @dagger.multibindings.IntoMap
        public static boolean provide() {
            return true;
        }

        private KeyModule() {
        }
    }
}
