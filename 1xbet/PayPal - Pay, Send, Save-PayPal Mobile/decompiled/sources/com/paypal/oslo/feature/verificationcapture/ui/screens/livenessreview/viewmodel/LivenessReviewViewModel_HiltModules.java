package com.paypal.oslo.feature.verificationcapture.ui.screens.livenessreview.viewmodel;

/* loaded from: classes15.dex */
public final class LivenessReviewViewModel_HiltModules {
    private LivenessReviewViewModel_HiltModules() {
    }

    @dagger.Module
    public static abstract class BindsModule {
        @dagger.multibindings.LazyClassKey(com.paypal.oslo.feature.verificationcapture.ui.screens.livenessreview.viewmodel.LivenessReviewViewModel.class)
        @dagger.Binds
        @dagger.multibindings.IntoMap
        public abstract androidx.view.ViewModel binds(com.paypal.oslo.feature.verificationcapture.ui.screens.livenessreview.viewmodel.LivenessReviewViewModel livenessReviewViewModel);

        private BindsModule() {
        }
    }

    @dagger.Module
    public static final class KeyModule {
        @dagger.Provides
        @dagger.multibindings.LazyClassKey(com.paypal.oslo.feature.verificationcapture.ui.screens.livenessreview.viewmodel.LivenessReviewViewModel.class)
        @dagger.multibindings.IntoMap
        public static boolean provide() {
            return true;
        }

        private KeyModule() {
        }
    }
}
