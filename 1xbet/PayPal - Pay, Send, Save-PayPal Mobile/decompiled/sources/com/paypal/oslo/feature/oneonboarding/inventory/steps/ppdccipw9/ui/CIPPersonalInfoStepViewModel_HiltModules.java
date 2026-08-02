package com.paypal.oslo.feature.oneonboarding.inventory.steps.ppdccipw9.ui;

/* loaded from: classes13.dex */
public final class CIPPersonalInfoStepViewModel_HiltModules {
    private CIPPersonalInfoStepViewModel_HiltModules() {
    }

    @dagger.Module
    public static abstract class BindsModule {
        @dagger.multibindings.LazyClassKey(com.paypal.oslo.feature.oneonboarding.inventory.steps.ppdccipw9.ui.CIPPersonalInfoStepViewModel.class)
        @dagger.Binds
        @dagger.multibindings.IntoMap
        public abstract androidx.view.ViewModel binds(com.paypal.oslo.feature.oneonboarding.inventory.steps.ppdccipw9.ui.CIPPersonalInfoStepViewModel cIPPersonalInfoStepViewModel);

        private BindsModule() {
        }
    }

    @dagger.Module
    public static final class KeyModule {
        @dagger.Provides
        @dagger.multibindings.LazyClassKey(com.paypal.oslo.feature.oneonboarding.inventory.steps.ppdccipw9.ui.CIPPersonalInfoStepViewModel.class)
        @dagger.multibindings.IntoMap
        public static boolean provide() {
            return true;
        }

        private KeyModule() {
        }
    }
}
