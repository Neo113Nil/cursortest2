package com.paypal.oslo.feature.wallet.banks.data.mapper;

/* loaded from: classes15.dex */
public final class BankAccountDetailsMapper_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.wallet.banks.data.mapper.BankAccountDetailsMapper> {
    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.wallet.banks.data.mapper.BankAccountDetailsMapper get() {
        return newInstance();
    }

    public static com.paypal.oslo.feature.wallet.banks.data.mapper.BankAccountDetailsMapper_Factory create() {
        return com.paypal.oslo.feature.wallet.banks.data.mapper.BankAccountDetailsMapper_Factory.InstanceHolder.Camera2StreamConfigurationMap;
    }

    public static com.paypal.oslo.feature.wallet.banks.data.mapper.BankAccountDetailsMapper newInstance() {
        return new com.paypal.oslo.feature.wallet.banks.data.mapper.BankAccountDetailsMapper();
    }

    static final class InstanceHolder {
        static final com.paypal.oslo.feature.wallet.banks.data.mapper.BankAccountDetailsMapper_Factory Camera2StreamConfigurationMap = new com.paypal.oslo.feature.wallet.banks.data.mapper.BankAccountDetailsMapper_Factory();

        private InstanceHolder() {
        }
    }
}
