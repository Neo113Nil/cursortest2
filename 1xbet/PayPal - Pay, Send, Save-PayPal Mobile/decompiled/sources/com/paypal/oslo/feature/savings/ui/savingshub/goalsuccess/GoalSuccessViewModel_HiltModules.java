package com.paypal.oslo.feature.savings.ui.savingshub.goalsuccess;

/* loaded from: classes14.dex */
public final class GoalSuccessViewModel_HiltModules {
    private GoalSuccessViewModel_HiltModules() {
    }

    @dagger.Module
    public static abstract class BindsModule {
        @dagger.multibindings.LazyClassKey(com.paypal.oslo.feature.savings.ui.savingshub.goalsuccess.GoalSuccessViewModel.class)
        @dagger.Binds
        @dagger.multibindings.IntoMap
        public abstract androidx.view.ViewModel binds(com.paypal.oslo.feature.savings.ui.savingshub.goalsuccess.GoalSuccessViewModel goalSuccessViewModel);

        private BindsModule() {
        }
    }

    @dagger.Module
    public static final class KeyModule {
        @dagger.Provides
        @dagger.multibindings.LazyClassKey(com.paypal.oslo.feature.savings.ui.savingshub.goalsuccess.GoalSuccessViewModel.class)
        @dagger.multibindings.IntoMap
        public static boolean provide() {
            return true;
        }

        private KeyModule() {
        }
    }
}
