package com.paypal.oslo.feature.bnplservicing.ui.plandetails;

/* loaded from: classes11.dex */
public final class PlanDetailsViewModel_HiltModules {
    private PlanDetailsViewModel_HiltModules() {
    }

    @dagger.Module
    public static abstract class BindsModule {
        @dagger.multibindings.LazyClassKey(com.paypal.oslo.feature.bnplservicing.ui.plandetails.PlanDetailsViewModel.class)
        @dagger.Binds
        @dagger.multibindings.IntoMap
        public abstract java.lang.Object bind(com.paypal.oslo.feature.bnplservicing.ui.plandetails.PlanDetailsViewModel.Factory factory);

        private BindsModule() {
        }
    }

    @dagger.Module
    public static final class KeyModule {
        @dagger.Provides
        @dagger.multibindings.LazyClassKey(com.paypal.oslo.feature.bnplservicing.ui.plandetails.PlanDetailsViewModel.class)
        @dagger.multibindings.IntoMap
        public static boolean provide() {
            return true;
        }

        private KeyModule() {
        }
    }
}
