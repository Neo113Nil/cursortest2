package com.paypal.oslo.feature.debitcard.servicing.ui.taptopay.operation;

/* loaded from: classes12.dex */
public final class ContactlessPaymentsOperationViewModel_HiltModules {
    private ContactlessPaymentsOperationViewModel_HiltModules() {
    }

    @dagger.Module
    public static abstract class BindsModule {
        @dagger.multibindings.LazyClassKey(com.paypal.oslo.feature.debitcard.servicing.ui.taptopay.operation.ContactlessPaymentsOperationViewModel.class)
        @dagger.Binds
        @dagger.multibindings.IntoMap
        public abstract androidx.view.ViewModel binds(com.paypal.oslo.feature.debitcard.servicing.ui.taptopay.operation.ContactlessPaymentsOperationViewModel contactlessPaymentsOperationViewModel);

        private BindsModule() {
        }
    }

    @dagger.Module
    public static final class KeyModule {
        @dagger.Provides
        @dagger.multibindings.LazyClassKey(com.paypal.oslo.feature.debitcard.servicing.ui.taptopay.operation.ContactlessPaymentsOperationViewModel.class)
        @dagger.multibindings.IntoMap
        public static boolean provide() {
            return true;
        }

        private KeyModule() {
        }
    }
}
