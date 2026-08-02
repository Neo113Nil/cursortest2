package com.paypal.oslo.feature.identity.moreoptions.data.cache;

/* loaded from: classes12.dex */
public final class MoreOptionCache_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.identity.moreoptions.data.cache.MoreOptionCache> {
    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.identity.moreoptions.data.cache.MoreOptionCache get() {
        return newInstance();
    }

    public static com.paypal.oslo.feature.identity.moreoptions.data.cache.MoreOptionCache_Factory create() {
        return com.paypal.oslo.feature.identity.moreoptions.data.cache.MoreOptionCache_Factory.InstanceHolder.getHighSpeedVideoSizes;
    }

    public static com.paypal.oslo.feature.identity.moreoptions.data.cache.MoreOptionCache newInstance() {
        return new com.paypal.oslo.feature.identity.moreoptions.data.cache.MoreOptionCache();
    }

    static final class InstanceHolder {
        static final com.paypal.oslo.feature.identity.moreoptions.data.cache.MoreOptionCache_Factory getHighSpeedVideoSizes = new com.paypal.oslo.feature.identity.moreoptions.data.cache.MoreOptionCache_Factory();

        private InstanceHolder() {
        }
    }
}
