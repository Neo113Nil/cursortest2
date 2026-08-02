package com.paypal.oslo.feature.activity.ui.webview.model;

/* loaded from: classes10.dex */
public final class ActivityCommonSecureWebViewModel_HiltModules {
    private ActivityCommonSecureWebViewModel_HiltModules() {
    }

    @dagger.Module
    public static abstract class BindsModule {
        @dagger.multibindings.LazyClassKey(com.paypal.oslo.feature.activity.ui.webview.model.ActivityCommonSecureWebViewModel.class)
        @dagger.Binds
        @dagger.multibindings.IntoMap
        public abstract androidx.view.ViewModel binds(com.paypal.oslo.feature.activity.ui.webview.model.ActivityCommonSecureWebViewModel activityCommonSecureWebViewModel);

        private BindsModule() {
        }
    }

    @dagger.Module
    public static final class KeyModule {
        @dagger.Provides
        @dagger.multibindings.LazyClassKey(com.paypal.oslo.feature.activity.ui.webview.model.ActivityCommonSecureWebViewModel.class)
        @dagger.multibindings.IntoMap
        public static boolean provide() {
            return true;
        }

        private KeyModule() {
        }
    }
}
