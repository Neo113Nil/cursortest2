package com.paypal.oslo.feature.wallet.preferred.ui.inStore;

/* loaded from: classes16.dex */
public final class InStoreConfirmationViewModel_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.wallet.preferred.ui.inStore.InStoreConfirmationViewModel> {
    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.wallet.preferred.ui.inStore.InStoreConfirmationViewModel get() {
        return newInstance();
    }

    public static com.paypal.oslo.feature.wallet.preferred.ui.inStore.InStoreConfirmationViewModel_Factory create() {
        return com.paypal.oslo.feature.wallet.preferred.ui.inStore.InStoreConfirmationViewModel_Factory.InstanceHolder.getHighSpeedVideoFpsRanges;
    }

    public static com.paypal.oslo.feature.wallet.preferred.ui.inStore.InStoreConfirmationViewModel newInstance() {
        return new com.paypal.oslo.feature.wallet.preferred.ui.inStore.InStoreConfirmationViewModel();
    }

    static final class InstanceHolder {
        static final com.paypal.oslo.feature.wallet.preferred.ui.inStore.InStoreConfirmationViewModel_Factory getHighSpeedVideoFpsRanges = new com.paypal.oslo.feature.wallet.preferred.ui.inStore.InStoreConfirmationViewModel_Factory();

        private InstanceHolder() {
        }
    }
}
