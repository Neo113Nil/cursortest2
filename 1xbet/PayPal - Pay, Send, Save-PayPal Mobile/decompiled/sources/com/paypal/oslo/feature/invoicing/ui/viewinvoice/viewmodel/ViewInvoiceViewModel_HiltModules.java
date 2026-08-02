package com.paypal.oslo.feature.invoicing.ui.viewinvoice.viewmodel;

/* loaded from: classes13.dex */
public final class ViewInvoiceViewModel_HiltModules {
    private ViewInvoiceViewModel_HiltModules() {
    }

    @dagger.Module
    public static abstract class BindsModule {
        @dagger.multibindings.LazyClassKey(com.paypal.oslo.feature.invoicing.ui.viewinvoice.viewmodel.ViewInvoiceViewModel.class)
        @dagger.Binds
        @dagger.multibindings.IntoMap
        public abstract java.lang.Object bind(com.paypal.oslo.feature.invoicing.ui.viewinvoice.viewmodel.ViewInvoiceViewModel.Factory factory);

        private BindsModule() {
        }
    }

    @dagger.Module
    public static final class KeyModule {
        @dagger.Provides
        @dagger.multibindings.LazyClassKey(com.paypal.oslo.feature.invoicing.ui.viewinvoice.viewmodel.ViewInvoiceViewModel.class)
        @dagger.multibindings.IntoMap
        public static boolean provide() {
            return true;
        }

        private KeyModule() {
        }
    }
}
