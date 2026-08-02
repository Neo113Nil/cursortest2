package com.paypal.oslo.feature.revolvingcreditservicing.ui.specialfinancing.detail.viewmodel;

/* loaded from: classes14.dex */
public final class SpecialFinancingDetailViewModel_HiltModules {
    private SpecialFinancingDetailViewModel_HiltModules() {
    }

    @dagger.Module
    public static abstract class BindsModule {
        @dagger.multibindings.LazyClassKey(com.paypal.oslo.feature.revolvingcreditservicing.ui.specialfinancing.detail.viewmodel.SpecialFinancingDetailViewModel.class)
        @dagger.Binds
        @dagger.multibindings.IntoMap
        public abstract java.lang.Object bind(com.paypal.oslo.feature.revolvingcreditservicing.ui.specialfinancing.detail.viewmodel.SpecialFinancingDetailViewModel.Factory factory);

        private BindsModule() {
        }
    }

    @dagger.Module
    public static final class KeyModule {
        @dagger.Provides
        @dagger.multibindings.LazyClassKey(com.paypal.oslo.feature.revolvingcreditservicing.ui.specialfinancing.detail.viewmodel.SpecialFinancingDetailViewModel.class)
        @dagger.multibindings.IntoMap
        public static boolean provide() {
            return true;
        }

        private KeyModule() {
        }
    }
}
