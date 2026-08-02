package com.paypal.oslo.feature.identity.userverification.data.cache;

/* loaded from: classes13.dex */
public final class AuthOptionCache_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.identity.userverification.data.cache.AuthOptionCache> {
    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.identity.userverification.data.cache.AuthOptionCache get() {
        return newInstance();
    }

    public static com.paypal.oslo.feature.identity.userverification.data.cache.AuthOptionCache_Factory create() {
        return com.paypal.oslo.feature.identity.userverification.data.cache.AuthOptionCache_Factory.InstanceHolder.getHighSpeedVideoSizes;
    }

    public static com.paypal.oslo.feature.identity.userverification.data.cache.AuthOptionCache newInstance() {
        return new com.paypal.oslo.feature.identity.userverification.data.cache.AuthOptionCache();
    }

    static final class InstanceHolder {
        static final com.paypal.oslo.feature.identity.userverification.data.cache.AuthOptionCache_Factory getHighSpeedVideoSizes = new com.paypal.oslo.feature.identity.userverification.data.cache.AuthOptionCache_Factory();

        private InstanceHolder() {
        }
    }
}
