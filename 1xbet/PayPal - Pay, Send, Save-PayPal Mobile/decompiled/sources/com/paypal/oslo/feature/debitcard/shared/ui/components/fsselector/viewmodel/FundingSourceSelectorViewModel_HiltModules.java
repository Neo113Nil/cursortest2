package com.paypal.oslo.feature.debitcard.shared.ui.components.fsselector.viewmodel;

/* loaded from: classes12.dex */
public final class FundingSourceSelectorViewModel_HiltModules {
    private FundingSourceSelectorViewModel_HiltModules() {
    }

    @dagger.Module
    public static abstract class BindsModule {
        @dagger.multibindings.LazyClassKey(com.paypal.oslo.feature.debitcard.shared.ui.components.fsselector.viewmodel.FundingSourceSelectorViewModel.class)
        @dagger.Binds
        @dagger.multibindings.IntoMap
        public abstract androidx.view.ViewModel binds(com.paypal.oslo.feature.debitcard.shared.ui.components.fsselector.viewmodel.FundingSourceSelectorViewModel fundingSourceSelectorViewModel);

        private BindsModule() {
        }
    }

    @dagger.Module
    public static final class KeyModule {
        @dagger.Provides
        @dagger.multibindings.LazyClassKey(com.paypal.oslo.feature.debitcard.shared.ui.components.fsselector.viewmodel.FundingSourceSelectorViewModel.class)
        @dagger.multibindings.IntoMap
        public static boolean provide() {
            return true;
        }

        private KeyModule() {
        }
    }
}
