package com.paypal.oslo.feature.businesshome.ui.businessexperiencedisabled;

/* loaded from: classes11.dex */
public final class BusinessExperienceDisabledViewModel_HiltModules {
    private BusinessExperienceDisabledViewModel_HiltModules() {
    }

    @dagger.Module
    public static abstract class BindsModule {
        @dagger.multibindings.LazyClassKey(com.paypal.oslo.feature.businesshome.ui.businessexperiencedisabled.BusinessExperienceDisabledViewModel.class)
        @dagger.Binds
        @dagger.multibindings.IntoMap
        public abstract androidx.view.ViewModel binds(com.paypal.oslo.feature.businesshome.ui.businessexperiencedisabled.BusinessExperienceDisabledViewModel businessExperienceDisabledViewModel);

        private BindsModule() {
        }
    }

    @dagger.Module
    public static final class KeyModule {
        @dagger.Provides
        @dagger.multibindings.LazyClassKey(com.paypal.oslo.feature.businesshome.ui.businessexperiencedisabled.BusinessExperienceDisabledViewModel.class)
        @dagger.multibindings.IntoMap
        public static boolean provide() {
            return true;
        }

        private KeyModule() {
        }
    }
}
