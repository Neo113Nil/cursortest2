package com.paypal.oslo.feature.xoom.ui.activitydetails;

/* loaded from: classes16.dex */
public final class ActivityDetailsViewModel_HiltModules {
    private ActivityDetailsViewModel_HiltModules() {
    }

    @dagger.Module
    public static abstract class BindsModule {
        @dagger.multibindings.LazyClassKey(com.paypal.oslo.feature.xoom.ui.activitydetails.ActivityDetailsViewModel.class)
        @dagger.Binds
        @dagger.multibindings.IntoMap
        public abstract androidx.view.ViewModel binds(com.paypal.oslo.feature.xoom.ui.activitydetails.ActivityDetailsViewModel activityDetailsViewModel);

        private BindsModule() {
        }
    }

    @dagger.Module
    public static final class KeyModule {
        @dagger.Provides
        @dagger.multibindings.LazyClassKey(com.paypal.oslo.feature.xoom.ui.activitydetails.ActivityDetailsViewModel.class)
        @dagger.multibindings.IntoMap
        public static boolean provide() {
            return true;
        }

        private KeyModule() {
        }
    }
}
