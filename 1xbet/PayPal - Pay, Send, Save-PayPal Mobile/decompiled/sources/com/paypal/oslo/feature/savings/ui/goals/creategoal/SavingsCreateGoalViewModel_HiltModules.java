package com.paypal.oslo.feature.savings.ui.goals.creategoal;

/* loaded from: classes14.dex */
public final class SavingsCreateGoalViewModel_HiltModules {
    private SavingsCreateGoalViewModel_HiltModules() {
    }

    @dagger.Module
    public static abstract class BindsModule {
        @dagger.multibindings.LazyClassKey(com.paypal.oslo.feature.savings.ui.goals.creategoal.SavingsCreateGoalViewModel.class)
        @dagger.Binds
        @dagger.multibindings.IntoMap
        public abstract androidx.view.ViewModel binds(com.paypal.oslo.feature.savings.ui.goals.creategoal.SavingsCreateGoalViewModel savingsCreateGoalViewModel);

        private BindsModule() {
        }
    }

    @dagger.Module
    public static final class KeyModule {
        @dagger.Provides
        @dagger.multibindings.LazyClassKey(com.paypal.oslo.feature.savings.ui.goals.creategoal.SavingsCreateGoalViewModel.class)
        @dagger.multibindings.IntoMap
        public static boolean provide() {
            return true;
        }

        private KeyModule() {
        }
    }
}
