package com.paypal.oslo.feature.p2p.data.mapper;

/* loaded from: classes13.dex */
public final class FundingOptionsMappingDelegate_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.p2p.data.mapper.FundingOptionsMappingDelegate> {
    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.p2p.data.mapper.FundingOptionsMappingDelegate get() {
        return newInstance();
    }

    public static com.paypal.oslo.feature.p2p.data.mapper.FundingOptionsMappingDelegate_Factory create() {
        return com.paypal.oslo.feature.p2p.data.mapper.FundingOptionsMappingDelegate_Factory.InstanceHolder.getHighResolutionOutputSizeshNQ4ISI;
    }

    public static com.paypal.oslo.feature.p2p.data.mapper.FundingOptionsMappingDelegate newInstance() {
        return new com.paypal.oslo.feature.p2p.data.mapper.FundingOptionsMappingDelegate();
    }

    static final class InstanceHolder {
        static final com.paypal.oslo.feature.p2p.data.mapper.FundingOptionsMappingDelegate_Factory getHighResolutionOutputSizeshNQ4ISI = new com.paypal.oslo.feature.p2p.data.mapper.FundingOptionsMappingDelegate_Factory();

        private InstanceHolder() {
        }
    }
}
