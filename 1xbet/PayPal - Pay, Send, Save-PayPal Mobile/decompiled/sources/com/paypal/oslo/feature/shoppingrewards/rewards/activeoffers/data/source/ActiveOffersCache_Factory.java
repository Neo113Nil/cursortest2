package com.paypal.oslo.feature.shoppingrewards.rewards.activeoffers.data.source;

/* loaded from: classes15.dex */
public final class ActiveOffersCache_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.shoppingrewards.rewards.activeoffers.data.source.ActiveOffersCache> {
    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.shoppingrewards.rewards.activeoffers.data.source.ActiveOffersCache get() {
        return newInstance();
    }

    public static com.paypal.oslo.feature.shoppingrewards.rewards.activeoffers.data.source.ActiveOffersCache_Factory create() {
        return com.paypal.oslo.feature.shoppingrewards.rewards.activeoffers.data.source.ActiveOffersCache_Factory.InstanceHolder.getHighSpeedVideoSizes;
    }

    public static com.paypal.oslo.feature.shoppingrewards.rewards.activeoffers.data.source.ActiveOffersCache newInstance() {
        return new com.paypal.oslo.feature.shoppingrewards.rewards.activeoffers.data.source.ActiveOffersCache();
    }

    static final class InstanceHolder {
        static final com.paypal.oslo.feature.shoppingrewards.rewards.activeoffers.data.source.ActiveOffersCache_Factory getHighSpeedVideoSizes = new com.paypal.oslo.feature.shoppingrewards.rewards.activeoffers.data.source.ActiveOffersCache_Factory();

        private InstanceHolder() {
        }
    }
}
