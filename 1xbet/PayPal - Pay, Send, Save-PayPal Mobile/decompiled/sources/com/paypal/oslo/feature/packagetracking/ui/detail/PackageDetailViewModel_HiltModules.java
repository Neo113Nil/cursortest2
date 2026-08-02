package com.paypal.oslo.feature.packagetracking.ui.detail;

/* loaded from: classes13.dex */
public final class PackageDetailViewModel_HiltModules {
    private PackageDetailViewModel_HiltModules() {
    }

    @dagger.Module
    public static abstract class BindsModule {
        @dagger.multibindings.LazyClassKey(com.paypal.oslo.feature.packagetracking.ui.detail.PackageDetailViewModel.class)
        @dagger.Binds
        @dagger.multibindings.IntoMap
        public abstract androidx.view.ViewModel binds(com.paypal.oslo.feature.packagetracking.ui.detail.PackageDetailViewModel packageDetailViewModel);

        private BindsModule() {
        }
    }

    @dagger.Module
    public static final class KeyModule {
        @dagger.Provides
        @dagger.multibindings.LazyClassKey(com.paypal.oslo.feature.packagetracking.ui.detail.PackageDetailViewModel.class)
        @dagger.multibindings.IntoMap
        public static boolean provide() {
            return true;
        }

        private KeyModule() {
        }
    }
}
