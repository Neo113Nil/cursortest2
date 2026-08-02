package com.paypal.oslo.feature.bnplservicing.ui.makepayment;

/* loaded from: classes11.dex */
public final class MakeAPaymentViewModel_HiltModules {
    private MakeAPaymentViewModel_HiltModules() {
    }

    @dagger.Module
    public static abstract class BindsModule {
        @dagger.multibindings.LazyClassKey(com.paypal.oslo.feature.bnplservicing.ui.makepayment.MakeAPaymentViewModel.class)
        @dagger.Binds
        @dagger.multibindings.IntoMap
        public abstract java.lang.Object bind(com.paypal.oslo.feature.bnplservicing.ui.makepayment.MakeAPaymentViewModel.Factory factory);

        private BindsModule() {
        }
    }

    @dagger.Module
    public static final class KeyModule {
        @dagger.Provides
        @dagger.multibindings.LazyClassKey(com.paypal.oslo.feature.bnplservicing.ui.makepayment.MakeAPaymentViewModel.class)
        @dagger.multibindings.IntoMap
        public static boolean provide() {
            return true;
        }

        private KeyModule() {
        }
    }
}
