package com.paypal.oslo.feature.consumerprivacy.ui.viewmodel;

/* loaded from: classes12.dex */
public final class PersonalizedAdsViewModel_HiltModules {
    private PersonalizedAdsViewModel_HiltModules() {
    }

    @dagger.Module
    public static abstract class BindsModule {
        @dagger.multibindings.LazyClassKey(com.paypal.oslo.feature.consumerprivacy.ui.viewmodel.PersonalizedAdsViewModel.class)
        @dagger.Binds
        @dagger.multibindings.IntoMap
        public abstract androidx.view.ViewModel binds(com.paypal.oslo.feature.consumerprivacy.ui.viewmodel.PersonalizedAdsViewModel personalizedAdsViewModel);

        private BindsModule() {
        }
    }

    @dagger.Module
    public static final class KeyModule {
        @dagger.Provides
        @dagger.multibindings.LazyClassKey(com.paypal.oslo.feature.consumerprivacy.ui.viewmodel.PersonalizedAdsViewModel.class)
        @dagger.multibindings.IntoMap
        public static boolean provide() {
            return true;
        }

        private KeyModule() {
        }
    }
}
