package com.paypal.oslo.feature.qrc.ui.payflowcontainer;

/* loaded from: classes14.dex */
public final class PayFlowContainerViewModel_HiltModules {
    private PayFlowContainerViewModel_HiltModules() {
    }

    @dagger.Module
    public static abstract class BindsModule {
        @dagger.multibindings.LazyClassKey(com.paypal.oslo.feature.qrc.ui.payflowcontainer.PayFlowContainerViewModel.class)
        @dagger.Binds
        @dagger.multibindings.IntoMap
        public abstract androidx.view.ViewModel binds(com.paypal.oslo.feature.qrc.ui.payflowcontainer.PayFlowContainerViewModel payFlowContainerViewModel);

        private BindsModule() {
        }
    }

    @dagger.Module
    public static final class KeyModule {
        @dagger.Provides
        @dagger.multibindings.LazyClassKey(com.paypal.oslo.feature.qrc.ui.payflowcontainer.PayFlowContainerViewModel.class)
        @dagger.multibindings.IntoMap
        public static boolean provide() {
            return true;
        }

        private KeyModule() {
        }
    }
}
