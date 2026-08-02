package com.paypal.oslo.feature.bnplacquisition.ui.address.overview;

/* loaded from: classes11.dex */
public final class AddressOverviewViewModel_HiltModules {
    private AddressOverviewViewModel_HiltModules() {
    }

    @dagger.Module
    public static abstract class BindsModule {
        @dagger.multibindings.LazyClassKey(com.paypal.oslo.feature.bnplacquisition.ui.address.overview.AddressOverviewViewModel.class)
        @dagger.Binds
        @dagger.multibindings.IntoMap
        public abstract androidx.view.ViewModel binds(com.paypal.oslo.feature.bnplacquisition.ui.address.overview.AddressOverviewViewModel addressOverviewViewModel);

        private BindsModule() {
        }
    }

    @dagger.Module
    public static final class KeyModule {
        @dagger.Provides
        @dagger.multibindings.LazyClassKey(com.paypal.oslo.feature.bnplacquisition.ui.address.overview.AddressOverviewViewModel.class)
        @dagger.multibindings.IntoMap
        public static boolean provide() {
            return true;
        }

        private KeyModule() {
        }
    }
}
