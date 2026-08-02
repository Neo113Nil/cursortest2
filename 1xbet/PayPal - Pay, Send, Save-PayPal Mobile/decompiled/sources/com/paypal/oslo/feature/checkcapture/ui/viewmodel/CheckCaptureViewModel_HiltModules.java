package com.paypal.oslo.feature.checkcapture.ui.viewmodel;

/* loaded from: classes11.dex */
public final class CheckCaptureViewModel_HiltModules {
    private CheckCaptureViewModel_HiltModules() {
    }

    @dagger.Module
    public static abstract class BindsModule {
        @dagger.multibindings.LazyClassKey(com.paypal.oslo.feature.checkcapture.ui.viewmodel.CheckCaptureViewModel.class)
        @dagger.Binds
        @dagger.multibindings.IntoMap
        public abstract androidx.view.ViewModel binds(com.paypal.oslo.feature.checkcapture.ui.viewmodel.CheckCaptureViewModel checkCaptureViewModel);

        private BindsModule() {
        }
    }

    @dagger.Module
    public static final class KeyModule {
        @dagger.Provides
        @dagger.multibindings.LazyClassKey(com.paypal.oslo.feature.checkcapture.ui.viewmodel.CheckCaptureViewModel.class)
        @dagger.multibindings.IntoMap
        public static boolean provide() {
            return true;
        }

        private KeyModule() {
        }
    }
}
