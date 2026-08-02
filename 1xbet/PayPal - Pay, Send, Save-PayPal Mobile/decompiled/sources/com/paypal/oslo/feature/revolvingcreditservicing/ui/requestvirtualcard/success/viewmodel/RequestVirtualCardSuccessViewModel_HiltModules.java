package com.paypal.oslo.feature.revolvingcreditservicing.ui.requestvirtualcard.success.viewmodel;

/* loaded from: classes14.dex */
public final class RequestVirtualCardSuccessViewModel_HiltModules {
    private RequestVirtualCardSuccessViewModel_HiltModules() {
    }

    @dagger.Module
    public static abstract class BindsModule {
        @dagger.multibindings.LazyClassKey(com.paypal.oslo.feature.revolvingcreditservicing.ui.requestvirtualcard.success.viewmodel.RequestVirtualCardSuccessViewModel.class)
        @dagger.Binds
        @dagger.multibindings.IntoMap
        public abstract androidx.view.ViewModel binds(com.paypal.oslo.feature.revolvingcreditservicing.ui.requestvirtualcard.success.viewmodel.RequestVirtualCardSuccessViewModel requestVirtualCardSuccessViewModel);

        private BindsModule() {
        }
    }

    @dagger.Module
    public static final class KeyModule {
        @dagger.Provides
        @dagger.multibindings.LazyClassKey(com.paypal.oslo.feature.revolvingcreditservicing.ui.requestvirtualcard.success.viewmodel.RequestVirtualCardSuccessViewModel.class)
        @dagger.multibindings.IntoMap
        public static boolean provide() {
            return true;
        }

        private KeyModule() {
        }
    }
}
