package com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.editlineitem;

/* loaded from: classes11.dex */
public final class EditLineItemViewModel_HiltModules {
    private EditLineItemViewModel_HiltModules() {
    }

    @dagger.Module
    public static abstract class BindsModule {
        @dagger.multibindings.LazyClassKey(com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.editlineitem.EditLineItemViewModel.class)
        @dagger.Binds
        @dagger.multibindings.IntoMap
        public abstract java.lang.Object bind(com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.editlineitem.EditLineItemViewModel.Factory factory);

        private BindsModule() {
        }
    }

    @dagger.Module
    public static final class KeyModule {
        @dagger.Provides
        @dagger.multibindings.LazyClassKey(com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.editlineitem.EditLineItemViewModel.class)
        @dagger.multibindings.IntoMap
        public static boolean provide() {
            return true;
        }

        private KeyModule() {
        }
    }
}
