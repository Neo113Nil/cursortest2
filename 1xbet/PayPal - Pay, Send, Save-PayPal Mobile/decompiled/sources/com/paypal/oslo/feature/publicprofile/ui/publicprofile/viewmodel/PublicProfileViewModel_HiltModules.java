package com.paypal.oslo.feature.publicprofile.ui.publicprofile.viewmodel;

/* loaded from: classes13.dex */
public final class PublicProfileViewModel_HiltModules {
    private PublicProfileViewModel_HiltModules() {
    }

    @dagger.Module
    public static abstract class BindsModule {
        @dagger.multibindings.LazyClassKey(com.paypal.oslo.feature.publicprofile.ui.publicprofile.viewmodel.PublicProfileViewModel.class)
        @dagger.Binds
        @dagger.multibindings.IntoMap
        public abstract androidx.view.ViewModel binds(com.paypal.oslo.feature.publicprofile.ui.publicprofile.viewmodel.PublicProfileViewModel publicProfileViewModel);

        private BindsModule() {
        }
    }

    @dagger.Module
    public static final class KeyModule {
        @dagger.Provides
        @dagger.multibindings.LazyClassKey(com.paypal.oslo.feature.publicprofile.ui.publicprofile.viewmodel.PublicProfileViewModel.class)
        @dagger.multibindings.IntoMap
        public static boolean provide() {
            return true;
        }

        private KeyModule() {
        }
    }
}
