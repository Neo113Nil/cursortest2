package com.paypal.oslo.feature.debitcard.servicing.ui.requestphysicalcarddecision.viewmodel;

/* loaded from: classes12.dex */
public final class RequestPhysicalCardDecisionViewModel_HiltModules {
    private RequestPhysicalCardDecisionViewModel_HiltModules() {
    }

    @dagger.Module
    public static abstract class BindsModule {
        @dagger.multibindings.LazyClassKey(com.paypal.oslo.feature.debitcard.servicing.ui.requestphysicalcarddecision.viewmodel.RequestPhysicalCardDecisionViewModel.class)
        @dagger.Binds
        @dagger.multibindings.IntoMap
        public abstract androidx.view.ViewModel binds(com.paypal.oslo.feature.debitcard.servicing.ui.requestphysicalcarddecision.viewmodel.RequestPhysicalCardDecisionViewModel requestPhysicalCardDecisionViewModel);

        private BindsModule() {
        }
    }

    @dagger.Module
    public static final class KeyModule {
        @dagger.Provides
        @dagger.multibindings.LazyClassKey(com.paypal.oslo.feature.debitcard.servicing.ui.requestphysicalcarddecision.viewmodel.RequestPhysicalCardDecisionViewModel.class)
        @dagger.multibindings.IntoMap
        public static boolean provide() {
            return true;
        }

        private KeyModule() {
        }
    }
}
