package com.paypal.oslo.feature.taptopay.ui.shared.screenlock;

/* loaded from: classes15.dex */
public final class RequireScreenLockViewModel_HiltModules {
    private RequireScreenLockViewModel_HiltModules() {
    }

    @dagger.Module
    public static abstract class BindsModule {
        @dagger.multibindings.LazyClassKey(com.paypal.oslo.feature.taptopay.ui.shared.screenlock.RequireScreenLockViewModel.class)
        @dagger.Binds
        @dagger.multibindings.IntoMap
        public abstract androidx.view.ViewModel binds(com.paypal.oslo.feature.taptopay.ui.shared.screenlock.RequireScreenLockViewModel requireScreenLockViewModel);

        private BindsModule() {
        }
    }

    @dagger.Module
    public static final class KeyModule {
        @dagger.Provides
        @dagger.multibindings.LazyClassKey(com.paypal.oslo.feature.taptopay.ui.shared.screenlock.RequireScreenLockViewModel.class)
        @dagger.multibindings.IntoMap
        public static boolean provide() {
            return true;
        }

        private KeyModule() {
        }
    }
}
