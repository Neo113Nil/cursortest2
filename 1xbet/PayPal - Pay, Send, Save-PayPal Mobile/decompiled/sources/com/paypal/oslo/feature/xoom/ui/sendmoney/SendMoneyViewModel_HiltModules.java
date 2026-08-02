package com.paypal.oslo.feature.xoom.ui.sendmoney;

/* loaded from: classes16.dex */
public final class SendMoneyViewModel_HiltModules {
    private SendMoneyViewModel_HiltModules() {
    }

    @dagger.Module
    public static abstract class BindsModule {
        @dagger.multibindings.LazyClassKey(com.paypal.oslo.feature.xoom.ui.sendmoney.SendMoneyViewModel.class)
        @dagger.Binds
        @dagger.multibindings.IntoMap
        public abstract androidx.view.ViewModel binds(com.paypal.oslo.feature.xoom.ui.sendmoney.SendMoneyViewModel sendMoneyViewModel);

        private BindsModule() {
        }
    }

    @dagger.Module
    public static final class KeyModule {
        @dagger.Provides
        @dagger.multibindings.LazyClassKey(com.paypal.oslo.feature.xoom.ui.sendmoney.SendMoneyViewModel.class)
        @dagger.multibindings.IntoMap
        public static boolean provide() {
            return true;
        }

        private KeyModule() {
        }
    }
}
