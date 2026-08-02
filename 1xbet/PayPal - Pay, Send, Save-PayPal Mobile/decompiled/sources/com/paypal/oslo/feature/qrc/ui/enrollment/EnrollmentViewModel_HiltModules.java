package com.paypal.oslo.feature.qrc.ui.enrollment;

/* loaded from: classes14.dex */
public final class EnrollmentViewModel_HiltModules {
    private EnrollmentViewModel_HiltModules() {
    }

    @dagger.Module
    public static abstract class BindsModule {
        @dagger.multibindings.LazyClassKey(com.paypal.oslo.feature.qrc.ui.enrollment.EnrollmentViewModel.class)
        @dagger.Binds
        @dagger.multibindings.IntoMap
        public abstract androidx.view.ViewModel binds(com.paypal.oslo.feature.qrc.ui.enrollment.EnrollmentViewModel enrollmentViewModel);

        private BindsModule() {
        }
    }

    @dagger.Module
    public static final class KeyModule {
        @dagger.Provides
        @dagger.multibindings.LazyClassKey(com.paypal.oslo.feature.qrc.ui.enrollment.EnrollmentViewModel.class)
        @dagger.multibindings.IntoMap
        public static boolean provide() {
            return true;
        }

        private KeyModule() {
        }
    }
}
