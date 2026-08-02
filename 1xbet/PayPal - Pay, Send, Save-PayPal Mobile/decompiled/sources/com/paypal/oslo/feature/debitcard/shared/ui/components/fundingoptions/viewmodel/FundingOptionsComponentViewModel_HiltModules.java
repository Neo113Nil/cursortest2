package com.paypal.oslo.feature.debitcard.shared.ui.components.fundingoptions.viewmodel;

/* loaded from: classes12.dex */
public final class FundingOptionsComponentViewModel_HiltModules {
    private FundingOptionsComponentViewModel_HiltModules() {
    }

    @dagger.Module
    public static abstract class BindsModule {
        @dagger.multibindings.LazyClassKey(com.paypal.oslo.feature.debitcard.shared.ui.components.fundingoptions.viewmodel.FundingOptionsComponentViewModel.class)
        @dagger.Binds
        @dagger.multibindings.IntoMap
        public abstract androidx.view.ViewModel binds(com.paypal.oslo.feature.debitcard.shared.ui.components.fundingoptions.viewmodel.FundingOptionsComponentViewModel fundingOptionsComponentViewModel);

        private BindsModule() {
        }
    }

    @dagger.Module
    public static final class KeyModule {
        @dagger.Provides
        @dagger.multibindings.LazyClassKey(com.paypal.oslo.feature.debitcard.shared.ui.components.fundingoptions.viewmodel.FundingOptionsComponentViewModel.class)
        @dagger.multibindings.IntoMap
        public static boolean provide() {
            return true;
        }

        private KeyModule() {
        }
    }
}
