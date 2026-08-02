package com.paypal.oslo.feature.moneymovement.ui.transfer.component.planaccordion;

/* loaded from: classes13.dex */
public final class PlanAccordionViewModel_HiltModules {
    private PlanAccordionViewModel_HiltModules() {
    }

    @dagger.Module
    public static abstract class BindsModule {
        @dagger.multibindings.LazyClassKey(com.paypal.oslo.feature.moneymovement.ui.transfer.component.planaccordion.PlanAccordionViewModel.class)
        @dagger.Binds
        @dagger.multibindings.IntoMap
        public abstract androidx.view.ViewModel binds(com.paypal.oslo.feature.moneymovement.ui.transfer.component.planaccordion.PlanAccordionViewModel planAccordionViewModel);

        private BindsModule() {
        }
    }

    @dagger.Module
    public static final class KeyModule {
        @dagger.Provides
        @dagger.multibindings.LazyClassKey(com.paypal.oslo.feature.moneymovement.ui.transfer.component.planaccordion.PlanAccordionViewModel.class)
        @dagger.multibindings.IntoMap
        public static boolean provide() {
            return true;
        }

        private KeyModule() {
        }
    }
}
