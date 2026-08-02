package com.paypal.oslo.feature.settings.legal.ui.viewmodel;

/* loaded from: classes14.dex */
public final class LegalViewModel_HiltModules {
    private LegalViewModel_HiltModules() {
    }

    @dagger.Module
    public static abstract class BindsModule {
        @dagger.multibindings.LazyClassKey(com.paypal.oslo.feature.settings.legal.ui.viewmodel.LegalViewModel.class)
        @dagger.Binds
        @dagger.multibindings.IntoMap
        public abstract androidx.view.ViewModel binds(com.paypal.oslo.feature.settings.legal.ui.viewmodel.LegalViewModel legalViewModel);

        private BindsModule() {
        }
    }

    @dagger.Module
    public static final class KeyModule {
        @dagger.Provides
        @dagger.multibindings.LazyClassKey(com.paypal.oslo.feature.settings.legal.ui.viewmodel.LegalViewModel.class)
        @dagger.multibindings.IntoMap
        public static boolean provide() {
            return true;
        }

        private KeyModule() {
        }
    }
}
