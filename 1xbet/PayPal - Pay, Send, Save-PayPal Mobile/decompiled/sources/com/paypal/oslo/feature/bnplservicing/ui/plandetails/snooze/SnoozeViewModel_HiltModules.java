package com.paypal.oslo.feature.bnplservicing.ui.plandetails.snooze;

/* loaded from: classes11.dex */
public final class SnoozeViewModel_HiltModules {
    private SnoozeViewModel_HiltModules() {
    }

    @dagger.Module
    public static abstract class BindsModule {
        @dagger.multibindings.LazyClassKey(com.paypal.oslo.feature.bnplservicing.ui.plandetails.snooze.SnoozeViewModel.class)
        @dagger.Binds
        @dagger.multibindings.IntoMap
        public abstract java.lang.Object bind(com.paypal.oslo.feature.bnplservicing.ui.plandetails.snooze.SnoozeViewModel.Factory factory);

        private BindsModule() {
        }
    }

    @dagger.Module
    public static final class KeyModule {
        @dagger.Provides
        @dagger.multibindings.LazyClassKey(com.paypal.oslo.feature.bnplservicing.ui.plandetails.snooze.SnoozeViewModel.class)
        @dagger.multibindings.IntoMap
        public static boolean provide() {
            return true;
        }

        private KeyModule() {
        }
    }
}
