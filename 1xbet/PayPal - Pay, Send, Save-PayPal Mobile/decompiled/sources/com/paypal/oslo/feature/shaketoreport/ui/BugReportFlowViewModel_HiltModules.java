package com.paypal.oslo.feature.shaketoreport.ui;

/* loaded from: classes14.dex */
public final class BugReportFlowViewModel_HiltModules {
    private BugReportFlowViewModel_HiltModules() {
    }

    @dagger.Module
    public static abstract class BindsModule {
        @dagger.multibindings.LazyClassKey(com.paypal.oslo.feature.shaketoreport.ui.BugReportFlowViewModel.class)
        @dagger.Binds
        @dagger.multibindings.IntoMap
        public abstract androidx.view.ViewModel binds(com.paypal.oslo.feature.shaketoreport.ui.BugReportFlowViewModel bugReportFlowViewModel);

        private BindsModule() {
        }
    }

    @dagger.Module
    public static final class KeyModule {
        @dagger.Provides
        @dagger.multibindings.LazyClassKey(com.paypal.oslo.feature.shaketoreport.ui.BugReportFlowViewModel.class)
        @dagger.multibindings.IntoMap
        public static boolean provide() {
            return true;
        }

        private KeyModule() {
        }
    }
}
