package com.paypal.oslo.feature.cryptocurrency.ui.loyalty;

/* loaded from: classes12.dex */
public final class LoyaltyCryptoEntryViewModel_HiltModules {
    private LoyaltyCryptoEntryViewModel_HiltModules() {
    }

    @dagger.Module
    public static abstract class BindsModule {
        @dagger.multibindings.LazyClassKey(com.paypal.oslo.feature.cryptocurrency.ui.loyalty.LoyaltyCryptoEntryViewModel.class)
        @dagger.Binds
        @dagger.multibindings.IntoMap
        public abstract androidx.view.ViewModel binds(com.paypal.oslo.feature.cryptocurrency.ui.loyalty.LoyaltyCryptoEntryViewModel loyaltyCryptoEntryViewModel);

        private BindsModule() {
        }
    }

    @dagger.Module
    public static final class KeyModule {
        @dagger.Provides
        @dagger.multibindings.LazyClassKey(com.paypal.oslo.feature.cryptocurrency.ui.loyalty.LoyaltyCryptoEntryViewModel.class)
        @dagger.multibindings.IntoMap
        public static boolean provide() {
            return true;
        }

        private KeyModule() {
        }
    }
}
