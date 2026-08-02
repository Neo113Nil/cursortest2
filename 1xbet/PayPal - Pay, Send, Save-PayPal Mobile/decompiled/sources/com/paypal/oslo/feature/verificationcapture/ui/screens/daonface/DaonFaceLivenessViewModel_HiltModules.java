package com.paypal.oslo.feature.verificationcapture.ui.screens.daonface;

/* loaded from: classes15.dex */
public final class DaonFaceLivenessViewModel_HiltModules {
    private DaonFaceLivenessViewModel_HiltModules() {
    }

    @dagger.Module
    public static abstract class BindsModule {
        @dagger.multibindings.LazyClassKey(com.paypal.oslo.feature.verificationcapture.ui.screens.daonface.DaonFaceLivenessViewModel.class)
        @dagger.Binds
        @dagger.multibindings.IntoMap
        public abstract androidx.view.ViewModel binds(com.paypal.oslo.feature.verificationcapture.ui.screens.daonface.DaonFaceLivenessViewModel daonFaceLivenessViewModel);

        private BindsModule() {
        }
    }

    @dagger.Module
    public static final class KeyModule {
        @dagger.Provides
        @dagger.multibindings.LazyClassKey(com.paypal.oslo.feature.verificationcapture.ui.screens.daonface.DaonFaceLivenessViewModel.class)
        @dagger.multibindings.IntoMap
        public static boolean provide() {
            return true;
        }

        private KeyModule() {
        }
    }
}
