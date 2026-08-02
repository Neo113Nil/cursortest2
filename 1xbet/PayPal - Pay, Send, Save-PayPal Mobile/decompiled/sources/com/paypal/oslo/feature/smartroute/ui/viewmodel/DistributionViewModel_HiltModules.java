package com.paypal.oslo.feature.smartroute.ui.viewmodel;

/* loaded from: classes15.dex */
public final class DistributionViewModel_HiltModules {
    private DistributionViewModel_HiltModules() {
    }

    @dagger.Module
    public static abstract class BindsModule {
        @dagger.multibindings.LazyClassKey(com.paypal.oslo.feature.smartroute.ui.viewmodel.DistributionViewModel.class)
        @dagger.Binds
        @dagger.multibindings.IntoMap
        public abstract androidx.view.ViewModel binds(com.paypal.oslo.feature.smartroute.ui.viewmodel.DistributionViewModel distributionViewModel);

        private BindsModule() {
        }
    }

    @dagger.Module
    public static final class KeyModule {
        @dagger.Provides
        @dagger.multibindings.LazyClassKey(com.paypal.oslo.feature.smartroute.ui.viewmodel.DistributionViewModel.class)
        @dagger.multibindings.IntoMap
        public static boolean provide() {
            return true;
        }

        private KeyModule() {
        }
    }
}
