package com.paypal.oslo.feature.shaketoreport.ui.bugreportscreen;

/* loaded from: classes14.dex */
public final class BugReportViewModel_HiltModules {
    private BugReportViewModel_HiltModules() {
    }

    @dagger.Module
    public static abstract class BindsModule {
        @dagger.multibindings.LazyClassKey(com.paypal.oslo.feature.shaketoreport.ui.bugreportscreen.BugReportViewModel.class)
        @dagger.Binds
        @dagger.multibindings.IntoMap
        public abstract androidx.view.ViewModel binds(com.paypal.oslo.feature.shaketoreport.ui.bugreportscreen.BugReportViewModel bugReportViewModel);

        private BindsModule() {
        }
    }

    @dagger.Module
    public static final class KeyModule {
        @dagger.Provides
        @dagger.multibindings.LazyClassKey(com.paypal.oslo.feature.shaketoreport.ui.bugreportscreen.BugReportViewModel.class)
        @dagger.multibindings.IntoMap
        public static boolean provide() {
            return true;
        }

        private KeyModule() {
        }
    }
}
