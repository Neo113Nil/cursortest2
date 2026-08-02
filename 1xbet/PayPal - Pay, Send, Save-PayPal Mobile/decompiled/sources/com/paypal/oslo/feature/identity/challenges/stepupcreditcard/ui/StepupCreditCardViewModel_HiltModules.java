package com.paypal.oslo.feature.identity.challenges.stepupcreditcard.ui;

/* loaded from: classes12.dex */
public final class StepupCreditCardViewModel_HiltModules {
    private StepupCreditCardViewModel_HiltModules() {
    }

    @dagger.Module
    public static abstract class BindsModule {
        @dagger.multibindings.LazyClassKey(com.paypal.oslo.feature.identity.challenges.stepupcreditcard.ui.StepupCreditCardViewModel.class)
        @dagger.Binds
        @dagger.multibindings.IntoMap
        public abstract androidx.view.ViewModel binds(com.paypal.oslo.feature.identity.challenges.stepupcreditcard.ui.StepupCreditCardViewModel stepupCreditCardViewModel);

        private BindsModule() {
        }
    }

    @dagger.Module
    public static final class KeyModule {
        @dagger.Provides
        @dagger.multibindings.LazyClassKey(com.paypal.oslo.feature.identity.challenges.stepupcreditcard.ui.StepupCreditCardViewModel.class)
        @dagger.multibindings.IntoMap
        public static boolean provide() {
            return true;
        }

        private KeyModule() {
        }
    }
}
