package com.paypal.oslo.feature.directdeposit.ui.pdf;

/* loaded from: classes12.dex */
public final class DirectDepositPDFViewModel_HiltModules {
    private DirectDepositPDFViewModel_HiltModules() {
    }

    @dagger.Module
    public static abstract class BindsModule {
        @dagger.multibindings.LazyClassKey(com.paypal.oslo.feature.directdeposit.ui.pdf.DirectDepositPDFViewModel.class)
        @dagger.Binds
        @dagger.multibindings.IntoMap
        public abstract androidx.view.ViewModel binds(com.paypal.oslo.feature.directdeposit.ui.pdf.DirectDepositPDFViewModel directDepositPDFViewModel);

        private BindsModule() {
        }
    }

    @dagger.Module
    public static final class KeyModule {
        @dagger.Provides
        @dagger.multibindings.LazyClassKey(com.paypal.oslo.feature.directdeposit.ui.pdf.DirectDepositPDFViewModel.class)
        @dagger.multibindings.IntoMap
        public static boolean provide() {
            return true;
        }

        private KeyModule() {
        }
    }
}
