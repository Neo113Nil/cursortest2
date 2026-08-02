package com.paypal.oslo.feature.directdeposit.ui.intro.viewmodel;

/* loaded from: classes12.dex */
public final class DirectDepositIntroViewModel_HiltModules {
    private DirectDepositIntroViewModel_HiltModules() {
    }

    @dagger.Module
    public static abstract class BindsModule {
        @dagger.multibindings.LazyClassKey(com.paypal.oslo.feature.directdeposit.ui.intro.viewmodel.DirectDepositIntroViewModel.class)
        @dagger.Binds
        @dagger.multibindings.IntoMap
        public abstract androidx.view.ViewModel binds(com.paypal.oslo.feature.directdeposit.ui.intro.viewmodel.DirectDepositIntroViewModel directDepositIntroViewModel);

        private BindsModule() {
        }
    }

    @dagger.Module
    public static final class KeyModule {
        @dagger.Provides
        @dagger.multibindings.LazyClassKey(com.paypal.oslo.feature.directdeposit.ui.intro.viewmodel.DirectDepositIntroViewModel.class)
        @dagger.multibindings.IntoMap
        public static boolean provide() {
            return true;
        }

        private KeyModule() {
        }
    }
}
