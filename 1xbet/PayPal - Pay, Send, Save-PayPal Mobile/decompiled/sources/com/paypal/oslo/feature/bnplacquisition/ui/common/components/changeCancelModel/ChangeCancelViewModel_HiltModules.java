package com.paypal.oslo.feature.bnplacquisition.ui.common.components.changeCancelModel;

/* loaded from: classes11.dex */
public final class ChangeCancelViewModel_HiltModules {
    private ChangeCancelViewModel_HiltModules() {
    }

    @dagger.Module
    public static abstract class BindsModule {
        @dagger.multibindings.LazyClassKey(com.paypal.oslo.feature.bnplacquisition.ui.common.components.changeCancelModel.ChangeCancelViewModel.class)
        @dagger.Binds
        @dagger.multibindings.IntoMap
        public abstract androidx.view.ViewModel binds(com.paypal.oslo.feature.bnplacquisition.ui.common.components.changeCancelModel.ChangeCancelViewModel changeCancelViewModel);

        private BindsModule() {
        }
    }

    @dagger.Module
    public static final class KeyModule {
        @dagger.Provides
        @dagger.multibindings.LazyClassKey(com.paypal.oslo.feature.bnplacquisition.ui.common.components.changeCancelModel.ChangeCancelViewModel.class)
        @dagger.multibindings.IntoMap
        public static boolean provide() {
            return true;
        }

        private KeyModule() {
        }
    }
}
