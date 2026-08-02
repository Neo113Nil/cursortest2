package com.paypal.oslo.feature.wallet.banks.ui.instantrd.loading.viewmodel;

/* loaded from: classes15.dex */
public final class InstantRDLoadingViewModel_HiltModules {
    private InstantRDLoadingViewModel_HiltModules() {
    }

    @dagger.Module
    public static abstract class BindsModule {
        @dagger.multibindings.LazyClassKey(com.paypal.oslo.feature.wallet.banks.ui.instantrd.loading.viewmodel.InstantRDLoadingViewModel.class)
        @dagger.Binds
        @dagger.multibindings.IntoMap
        public abstract androidx.view.ViewModel binds(com.paypal.oslo.feature.wallet.banks.ui.instantrd.loading.viewmodel.InstantRDLoadingViewModel instantRDLoadingViewModel);

        private BindsModule() {
        }
    }

    @dagger.Module
    public static final class KeyModule {
        @dagger.Provides
        @dagger.multibindings.LazyClassKey(com.paypal.oslo.feature.wallet.banks.ui.instantrd.loading.viewmodel.InstantRDLoadingViewModel.class)
        @dagger.multibindings.IntoMap
        public static boolean provide() {
            return true;
        }

        private KeyModule() {
        }
    }
}
