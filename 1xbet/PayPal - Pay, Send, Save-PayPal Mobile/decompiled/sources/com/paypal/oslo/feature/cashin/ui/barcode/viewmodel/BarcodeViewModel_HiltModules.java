package com.paypal.oslo.feature.cashin.ui.barcode.viewmodel;

/* loaded from: classes11.dex */
public final class BarcodeViewModel_HiltModules {
    private BarcodeViewModel_HiltModules() {
    }

    @dagger.Module
    public static abstract class BindsModule {
        @dagger.multibindings.LazyClassKey(com.paypal.oslo.feature.cashin.ui.barcode.viewmodel.BarcodeViewModel.class)
        @dagger.Binds
        @dagger.multibindings.IntoMap
        public abstract androidx.view.ViewModel binds(com.paypal.oslo.feature.cashin.ui.barcode.viewmodel.BarcodeViewModel barcodeViewModel);

        private BindsModule() {
        }
    }

    @dagger.Module
    public static final class KeyModule {
        @dagger.Provides
        @dagger.multibindings.LazyClassKey(com.paypal.oslo.feature.cashin.ui.barcode.viewmodel.BarcodeViewModel.class)
        @dagger.multibindings.IntoMap
        public static boolean provide() {
            return true;
        }

        private KeyModule() {
        }
    }
}
