package com.paypal.oslo.feature.debitcard.servicing.ui.requestphysicalcard.viewmodel;

/* loaded from: classes12.dex */
public final class RequestPhysicalCardViewModel_HiltModules {
    private RequestPhysicalCardViewModel_HiltModules() {
    }

    @dagger.Module
    public static abstract class BindsModule {
        @dagger.multibindings.LazyClassKey(com.paypal.oslo.feature.debitcard.servicing.ui.requestphysicalcard.viewmodel.RequestPhysicalCardViewModel.class)
        @dagger.Binds
        @dagger.multibindings.IntoMap
        public abstract androidx.view.ViewModel binds(com.paypal.oslo.feature.debitcard.servicing.ui.requestphysicalcard.viewmodel.RequestPhysicalCardViewModel requestPhysicalCardViewModel);

        private BindsModule() {
        }
    }

    @dagger.Module
    public static final class KeyModule {
        @dagger.Provides
        @dagger.multibindings.LazyClassKey(com.paypal.oslo.feature.debitcard.servicing.ui.requestphysicalcard.viewmodel.RequestPhysicalCardViewModel.class)
        @dagger.multibindings.IntoMap
        public static boolean provide() {
            return true;
        }

        private KeyModule() {
        }
    }
}
