package com.paypal.oslo.feature.directdeposit.ui.form.viewmodel;

/* loaded from: classes12.dex */
public final class DirectDepositESignatureViewModel_HiltModules {
    private DirectDepositESignatureViewModel_HiltModules() {
    }

    @dagger.Module
    public static abstract class BindsModule {
        @dagger.multibindings.LazyClassKey(com.paypal.oslo.feature.directdeposit.ui.form.viewmodel.DirectDepositESignatureViewModel.class)
        @dagger.Binds
        @dagger.multibindings.IntoMap
        public abstract androidx.view.ViewModel binds(com.paypal.oslo.feature.directdeposit.ui.form.viewmodel.DirectDepositESignatureViewModel directDepositESignatureViewModel);

        private BindsModule() {
        }
    }

    @dagger.Module
    public static final class KeyModule {
        @dagger.Provides
        @dagger.multibindings.LazyClassKey(com.paypal.oslo.feature.directdeposit.ui.form.viewmodel.DirectDepositESignatureViewModel.class)
        @dagger.multibindings.IntoMap
        public static boolean provide() {
            return true;
        }

        private KeyModule() {
        }
    }
}
