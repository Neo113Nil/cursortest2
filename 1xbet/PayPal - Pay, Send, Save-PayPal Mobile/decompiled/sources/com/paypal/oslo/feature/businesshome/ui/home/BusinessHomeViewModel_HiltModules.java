package com.paypal.oslo.feature.businesshome.ui.home;

/* loaded from: classes11.dex */
public final class BusinessHomeViewModel_HiltModules {
    private BusinessHomeViewModel_HiltModules() {
    }

    @dagger.Module
    public static abstract class BindsModule {
        @dagger.multibindings.LazyClassKey(com.paypal.oslo.feature.businesshome.ui.home.BusinessHomeViewModel.class)
        @dagger.Binds
        @dagger.multibindings.IntoMap
        public abstract androidx.view.ViewModel binds(com.paypal.oslo.feature.businesshome.ui.home.BusinessHomeViewModel businessHomeViewModel);

        private BindsModule() {
        }
    }

    @dagger.Module
    public static final class KeyModule {
        @dagger.Provides
        @dagger.multibindings.LazyClassKey(com.paypal.oslo.feature.businesshome.ui.home.BusinessHomeViewModel.class)
        @dagger.multibindings.IntoMap
        public static boolean provide() {
            return true;
        }

        private KeyModule() {
        }
    }
}
