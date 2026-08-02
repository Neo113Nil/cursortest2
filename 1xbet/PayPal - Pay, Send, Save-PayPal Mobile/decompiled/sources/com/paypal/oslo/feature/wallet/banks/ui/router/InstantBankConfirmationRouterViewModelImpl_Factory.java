package com.paypal.oslo.feature.wallet.banks.ui.router;

/* loaded from: classes15.dex */
public final class InstantBankConfirmationRouterViewModelImpl_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.wallet.banks.ui.router.InstantBankConfirmationRouterViewModelImpl> {
    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.wallet.banks.ui.router.InstantBankConfirmationRouterViewModelImpl get() {
        return newInstance();
    }

    public static com.paypal.oslo.feature.wallet.banks.ui.router.InstantBankConfirmationRouterViewModelImpl_Factory create() {
        return com.paypal.oslo.feature.wallet.banks.ui.router.InstantBankConfirmationRouterViewModelImpl_Factory.InstanceHolder.Camera2StreamConfigurationMap;
    }

    public static com.paypal.oslo.feature.wallet.banks.ui.router.InstantBankConfirmationRouterViewModelImpl newInstance() {
        return new com.paypal.oslo.feature.wallet.banks.ui.router.InstantBankConfirmationRouterViewModelImpl();
    }

    static final class InstanceHolder {
        static final com.paypal.oslo.feature.wallet.banks.ui.router.InstantBankConfirmationRouterViewModelImpl_Factory Camera2StreamConfigurationMap = new com.paypal.oslo.feature.wallet.banks.ui.router.InstantBankConfirmationRouterViewModelImpl_Factory();

        private InstanceHolder() {
        }
    }
}
