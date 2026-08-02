package com.paypal.oslo.feature.wallet.banks.ui.details;

/* loaded from: classes15.dex */
public final class GetBankBannersUiUtil_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.wallet.banks.ui.details.GetBankBannersUiUtil> {
    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.wallet.banks.ui.details.GetBankBannersUiUtil get() {
        return newInstance();
    }

    public static com.paypal.oslo.feature.wallet.banks.ui.details.GetBankBannersUiUtil_Factory create() {
        return com.paypal.oslo.feature.wallet.banks.ui.details.GetBankBannersUiUtil_Factory.InstanceHolder.getHighSpeedVideoSizes;
    }

    public static com.paypal.oslo.feature.wallet.banks.ui.details.GetBankBannersUiUtil newInstance() {
        return new com.paypal.oslo.feature.wallet.banks.ui.details.GetBankBannersUiUtil();
    }

    static final class InstanceHolder {
        static final com.paypal.oslo.feature.wallet.banks.ui.details.GetBankBannersUiUtil_Factory getHighSpeedVideoSizes = new com.paypal.oslo.feature.wallet.banks.ui.details.GetBankBannersUiUtil_Factory();

        private InstanceHolder() {
        }
    }
}
