package com.paypal.oslo.feature.verificationcapture.ui.screens.idcapturetimeout.viewmodel;

/* loaded from: classes15.dex */
public final class IdCaptureTimeoutViewModel_HiltModules {
    private IdCaptureTimeoutViewModel_HiltModules() {
    }

    @dagger.Module
    public static abstract class BindsModule {
        @dagger.multibindings.LazyClassKey(com.paypal.oslo.feature.verificationcapture.ui.screens.idcapturetimeout.viewmodel.IdCaptureTimeoutViewModel.class)
        @dagger.Binds
        @dagger.multibindings.IntoMap
        public abstract androidx.view.ViewModel binds(com.paypal.oslo.feature.verificationcapture.ui.screens.idcapturetimeout.viewmodel.IdCaptureTimeoutViewModel idCaptureTimeoutViewModel);

        private BindsModule() {
        }
    }

    @dagger.Module
    public static final class KeyModule {
        @dagger.Provides
        @dagger.multibindings.LazyClassKey(com.paypal.oslo.feature.verificationcapture.ui.screens.idcapturetimeout.viewmodel.IdCaptureTimeoutViewModel.class)
        @dagger.multibindings.IntoMap
        public static boolean provide() {
            return true;
        }

        private KeyModule() {
        }
    }
}
