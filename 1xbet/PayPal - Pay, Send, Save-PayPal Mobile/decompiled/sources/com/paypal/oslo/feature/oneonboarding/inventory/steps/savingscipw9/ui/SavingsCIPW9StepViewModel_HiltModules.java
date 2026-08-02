package com.paypal.oslo.feature.oneonboarding.inventory.steps.savingscipw9.ui;

/* loaded from: classes13.dex */
public final class SavingsCIPW9StepViewModel_HiltModules {
    private SavingsCIPW9StepViewModel_HiltModules() {
    }

    @dagger.Module
    public static abstract class BindsModule {
        @dagger.multibindings.LazyClassKey(com.paypal.oslo.feature.oneonboarding.inventory.steps.savingscipw9.ui.SavingsCIPW9StepViewModel.class)
        @dagger.Binds
        @dagger.multibindings.IntoMap
        public abstract androidx.view.ViewModel binds(com.paypal.oslo.feature.oneonboarding.inventory.steps.savingscipw9.ui.SavingsCIPW9StepViewModel savingsCIPW9StepViewModel);

        private BindsModule() {
        }
    }

    @dagger.Module
    public static final class KeyModule {
        @dagger.Provides
        @dagger.multibindings.LazyClassKey(com.paypal.oslo.feature.oneonboarding.inventory.steps.savingscipw9.ui.SavingsCIPW9StepViewModel.class)
        @dagger.multibindings.IntoMap
        public static boolean provide() {
            return true;
        }

        private KeyModule() {
        }
    }
}
