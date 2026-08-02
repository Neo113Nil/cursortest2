package com.paypal.oslo.feature.consumerprivacy.ui.viewmodel;

/* loaded from: classes12.dex */
public final class AccountVisibilityViewModel_HiltModules {
    private AccountVisibilityViewModel_HiltModules() {
    }

    @dagger.Module
    public static abstract class BindsModule {
        @dagger.multibindings.LazyClassKey(com.paypal.oslo.feature.consumerprivacy.ui.viewmodel.AccountVisibilityViewModel.class)
        @dagger.Binds
        @dagger.multibindings.IntoMap
        public abstract androidx.view.ViewModel binds(com.paypal.oslo.feature.consumerprivacy.ui.viewmodel.AccountVisibilityViewModel accountVisibilityViewModel);

        private BindsModule() {
        }
    }

    @dagger.Module
    public static final class KeyModule {
        @dagger.Provides
        @dagger.multibindings.LazyClassKey(com.paypal.oslo.feature.consumerprivacy.ui.viewmodel.AccountVisibilityViewModel.class)
        @dagger.multibindings.IntoMap
        public static boolean provide() {
            return true;
        }

        private KeyModule() {
        }
    }
}
