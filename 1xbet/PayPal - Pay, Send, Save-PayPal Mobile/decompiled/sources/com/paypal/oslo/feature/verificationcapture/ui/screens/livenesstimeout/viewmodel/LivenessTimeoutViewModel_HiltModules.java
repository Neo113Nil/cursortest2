package com.paypal.oslo.feature.verificationcapture.ui.screens.livenesstimeout.viewmodel;

/* loaded from: classes15.dex */
public final class LivenessTimeoutViewModel_HiltModules {
    private LivenessTimeoutViewModel_HiltModules() {
    }

    @dagger.Module
    public static abstract class BindsModule {
        @dagger.multibindings.LazyClassKey(com.paypal.oslo.feature.verificationcapture.ui.screens.livenesstimeout.viewmodel.LivenessTimeoutViewModel.class)
        @dagger.Binds
        @dagger.multibindings.IntoMap
        public abstract androidx.view.ViewModel binds(com.paypal.oslo.feature.verificationcapture.ui.screens.livenesstimeout.viewmodel.LivenessTimeoutViewModel livenessTimeoutViewModel);

        private BindsModule() {
        }
    }

    @dagger.Module
    public static final class KeyModule {
        @dagger.Provides
        @dagger.multibindings.LazyClassKey(com.paypal.oslo.feature.verificationcapture.ui.screens.livenesstimeout.viewmodel.LivenessTimeoutViewModel.class)
        @dagger.multibindings.IntoMap
        public static boolean provide() {
            return true;
        }

        private KeyModule() {
        }
    }
}
