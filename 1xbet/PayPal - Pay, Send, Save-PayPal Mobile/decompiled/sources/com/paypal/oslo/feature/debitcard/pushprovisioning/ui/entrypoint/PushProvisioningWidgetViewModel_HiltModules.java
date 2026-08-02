package com.paypal.oslo.feature.debitcard.pushprovisioning.ui.entrypoint;

/* loaded from: classes12.dex */
public final class PushProvisioningWidgetViewModel_HiltModules {
    private PushProvisioningWidgetViewModel_HiltModules() {
    }

    @dagger.Module
    public static abstract class BindsModule {
        @dagger.multibindings.LazyClassKey(com.paypal.oslo.feature.debitcard.pushprovisioning.ui.entrypoint.PushProvisioningWidgetViewModel.class)
        @dagger.Binds
        @dagger.multibindings.IntoMap
        public abstract androidx.view.ViewModel binds(com.paypal.oslo.feature.debitcard.pushprovisioning.ui.entrypoint.PushProvisioningWidgetViewModel pushProvisioningWidgetViewModel);

        private BindsModule() {
        }
    }

    @dagger.Module
    public static final class KeyModule {
        @dagger.Provides
        @dagger.multibindings.LazyClassKey(com.paypal.oslo.feature.debitcard.pushprovisioning.ui.entrypoint.PushProvisioningWidgetViewModel.class)
        @dagger.multibindings.IntoMap
        public static boolean provide() {
            return true;
        }

        private KeyModule() {
        }
    }
}
