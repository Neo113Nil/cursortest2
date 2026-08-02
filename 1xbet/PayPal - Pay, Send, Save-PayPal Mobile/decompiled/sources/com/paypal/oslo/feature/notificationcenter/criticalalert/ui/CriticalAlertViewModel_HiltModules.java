package com.paypal.oslo.feature.notificationcenter.criticalalert.ui;

/* loaded from: classes13.dex */
public final class CriticalAlertViewModel_HiltModules {
    private CriticalAlertViewModel_HiltModules() {
    }

    @dagger.Module
    public static abstract class BindsModule {
        @dagger.multibindings.LazyClassKey(com.paypal.oslo.feature.notificationcenter.criticalalert.ui.CriticalAlertViewModel.class)
        @dagger.Binds
        @dagger.multibindings.IntoMap
        public abstract androidx.view.ViewModel binds(com.paypal.oslo.feature.notificationcenter.criticalalert.ui.CriticalAlertViewModel criticalAlertViewModel);

        private BindsModule() {
        }
    }

    @dagger.Module
    public static final class KeyModule {
        @dagger.Provides
        @dagger.multibindings.LazyClassKey(com.paypal.oslo.feature.notificationcenter.criticalalert.ui.CriticalAlertViewModel.class)
        @dagger.multibindings.IntoMap
        public static boolean provide() {
            return true;
        }

        private KeyModule() {
        }
    }
}
