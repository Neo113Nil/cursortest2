package com.paypal.oslo.feature.balance.ui.autoReload.frequency;

/* loaded from: classes11.dex */
public final class FrequencyViewModel_HiltModules {
    private FrequencyViewModel_HiltModules() {
    }

    @dagger.Module
    public static abstract class BindsModule {
        @dagger.multibindings.LazyClassKey(com.paypal.oslo.feature.balance.ui.autoReload.frequency.FrequencyViewModel.class)
        @dagger.Binds
        @dagger.multibindings.IntoMap
        public abstract androidx.view.ViewModel binds(com.paypal.oslo.feature.balance.ui.autoReload.frequency.FrequencyViewModel frequencyViewModel);

        private BindsModule() {
        }
    }

    @dagger.Module
    public static final class KeyModule {
        @dagger.Provides
        @dagger.multibindings.LazyClassKey(com.paypal.oslo.feature.balance.ui.autoReload.frequency.FrequencyViewModel.class)
        @dagger.multibindings.IntoMap
        public static boolean provide() {
            return true;
        }

        private KeyModule() {
        }
    }
}
