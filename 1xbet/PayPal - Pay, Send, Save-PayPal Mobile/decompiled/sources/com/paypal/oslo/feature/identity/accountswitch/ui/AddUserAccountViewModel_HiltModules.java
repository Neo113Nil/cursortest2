package com.paypal.oslo.feature.identity.accountswitch.ui;

/* loaded from: classes12.dex */
public final class AddUserAccountViewModel_HiltModules {
    private AddUserAccountViewModel_HiltModules() {
    }

    @dagger.Module
    public static abstract class BindsModule {
        @dagger.multibindings.LazyClassKey(com.paypal.oslo.feature.identity.accountswitch.ui.AddUserAccountViewModel.class)
        @dagger.Binds
        @dagger.multibindings.IntoMap
        public abstract androidx.view.ViewModel binds(com.paypal.oslo.feature.identity.accountswitch.ui.AddUserAccountViewModel addUserAccountViewModel);

        private BindsModule() {
        }
    }

    @dagger.Module
    public static final class KeyModule {
        @dagger.Provides
        @dagger.multibindings.LazyClassKey(com.paypal.oslo.feature.identity.accountswitch.ui.AddUserAccountViewModel.class)
        @dagger.multibindings.IntoMap
        public static boolean provide() {
            return true;
        }

        private KeyModule() {
        }
    }
}
