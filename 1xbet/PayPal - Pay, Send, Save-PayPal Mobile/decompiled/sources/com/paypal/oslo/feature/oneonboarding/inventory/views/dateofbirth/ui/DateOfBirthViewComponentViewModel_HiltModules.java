package com.paypal.oslo.feature.oneonboarding.inventory.views.dateofbirth.ui;

/* loaded from: classes13.dex */
public final class DateOfBirthViewComponentViewModel_HiltModules {
    private DateOfBirthViewComponentViewModel_HiltModules() {
    }

    @dagger.Module
    public static abstract class BindsModule {
        @dagger.multibindings.LazyClassKey(com.paypal.oslo.feature.oneonboarding.inventory.views.dateofbirth.ui.DateOfBirthViewComponentViewModel.class)
        @dagger.Binds
        @dagger.multibindings.IntoMap
        public abstract androidx.view.ViewModel binds(com.paypal.oslo.feature.oneonboarding.inventory.views.dateofbirth.ui.DateOfBirthViewComponentViewModel dateOfBirthViewComponentViewModel);

        private BindsModule() {
        }
    }

    @dagger.Module
    public static final class KeyModule {
        @dagger.Provides
        @dagger.multibindings.LazyClassKey(com.paypal.oslo.feature.oneonboarding.inventory.views.dateofbirth.ui.DateOfBirthViewComponentViewModel.class)
        @dagger.multibindings.IntoMap
        public static boolean provide() {
            return true;
        }

        private KeyModule() {
        }
    }
}
