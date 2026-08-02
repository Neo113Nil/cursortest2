package com.paypal.oslo.feature.debitcard.shared.domain.cache;

/* loaded from: classes12.dex */
public final class DebitCardFundingOptionsCache_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.debitcard.shared.domain.cache.DebitCardFundingOptionsCache> {
    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.debitcard.shared.domain.cache.DebitCardFundingOptionsCache get() {
        return newInstance();
    }

    public static com.paypal.oslo.feature.debitcard.shared.domain.cache.DebitCardFundingOptionsCache_Factory create() {
        return com.paypal.oslo.feature.debitcard.shared.domain.cache.DebitCardFundingOptionsCache_Factory.InstanceHolder.getHighSpeedVideoFpsRanges;
    }

    public static com.paypal.oslo.feature.debitcard.shared.domain.cache.DebitCardFundingOptionsCache newInstance() {
        return new com.paypal.oslo.feature.debitcard.shared.domain.cache.DebitCardFundingOptionsCache();
    }

    static final class InstanceHolder {
        static final com.paypal.oslo.feature.debitcard.shared.domain.cache.DebitCardFundingOptionsCache_Factory getHighSpeedVideoFpsRanges = new com.paypal.oslo.feature.debitcard.shared.domain.cache.DebitCardFundingOptionsCache_Factory();

        private InstanceHolder() {
        }
    }
}
