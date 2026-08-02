package com.paypal.oslo.feature.bankingbundle.ui.acceptmoney.viewmodel;

/* loaded from: classes11.dex */
public final class AcceptMoneyChoiceViewModel_HiltModules {
    private AcceptMoneyChoiceViewModel_HiltModules() {
    }

    @dagger.Module
    public static abstract class BindsModule {
        @dagger.multibindings.LazyClassKey(com.paypal.oslo.feature.bankingbundle.ui.acceptmoney.viewmodel.AcceptMoneyChoiceViewModel.class)
        @dagger.Binds
        @dagger.multibindings.IntoMap
        public abstract androidx.view.ViewModel binds(com.paypal.oslo.feature.bankingbundle.ui.acceptmoney.viewmodel.AcceptMoneyChoiceViewModel acceptMoneyChoiceViewModel);

        private BindsModule() {
        }
    }

    @dagger.Module
    public static final class KeyModule {
        @dagger.Provides
        @dagger.multibindings.LazyClassKey(com.paypal.oslo.feature.bankingbundle.ui.acceptmoney.viewmodel.AcceptMoneyChoiceViewModel.class)
        @dagger.multibindings.IntoMap
        public static boolean provide() {
            return true;
        }

        private KeyModule() {
        }
    }
}
