package com.paypal.oslo.feature.activity.ui.widget.model;

/* loaded from: classes10.dex */
public final class ActivityWidgetViewModel_HiltModules {
    private ActivityWidgetViewModel_HiltModules() {
    }

    @dagger.Module
    public static abstract class BindsModule {
        @dagger.multibindings.LazyClassKey(com.paypal.oslo.feature.activity.ui.widget.model.ActivityWidgetViewModel.class)
        @dagger.Binds
        @dagger.multibindings.IntoMap
        public abstract androidx.view.ViewModel binds(com.paypal.oslo.feature.activity.ui.widget.model.ActivityWidgetViewModel activityWidgetViewModel);

        private BindsModule() {
        }
    }

    @dagger.Module
    public static final class KeyModule {
        @dagger.Provides
        @dagger.multibindings.LazyClassKey(com.paypal.oslo.feature.activity.ui.widget.model.ActivityWidgetViewModel.class)
        @dagger.multibindings.IntoMap
        public static boolean provide() {
            return true;
        }

        private KeyModule() {
        }
    }
}
