package com.paypal.oslo.feature.dataprivacy.ui.viewmodel;

/* loaded from: classes12.dex */
public final class EmailConfirmationViewModel_HiltModules {
    private EmailConfirmationViewModel_HiltModules() {
    }

    @dagger.Module
    public static abstract class BindsModule {
        @dagger.multibindings.LazyClassKey(com.paypal.oslo.feature.dataprivacy.ui.viewmodel.EmailConfirmationViewModel.class)
        @dagger.Binds
        @dagger.multibindings.IntoMap
        public abstract androidx.view.ViewModel binds(com.paypal.oslo.feature.dataprivacy.ui.viewmodel.EmailConfirmationViewModel emailConfirmationViewModel);

        private BindsModule() {
        }
    }

    @dagger.Module
    public static final class KeyModule {
        @dagger.Provides
        @dagger.multibindings.LazyClassKey(com.paypal.oslo.feature.dataprivacy.ui.viewmodel.EmailConfirmationViewModel.class)
        @dagger.multibindings.IntoMap
        public static boolean provide() {
            return true;
        }

        private KeyModule() {
        }
    }
}
