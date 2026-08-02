package com.paypal.oslo.core.remoteconfig.companion;

/* loaded from: classes10.dex */
public final class StatsigOverrideManager_Factory implements dagger.internal.Factory<com.paypal.oslo.core.remoteconfig.companion.StatsigOverrideManager> {
    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.core.remoteconfig.companion.StatsigOverrideManager get() {
        return newInstance();
    }

    public static com.paypal.oslo.core.remoteconfig.companion.StatsigOverrideManager_Factory create() {
        return com.paypal.oslo.core.remoteconfig.companion.StatsigOverrideManager_Factory.InstanceHolder.getHighSpeedVideoFpsRanges;
    }

    public static com.paypal.oslo.core.remoteconfig.companion.StatsigOverrideManager newInstance() {
        return new com.paypal.oslo.core.remoteconfig.companion.StatsigOverrideManager();
    }

    static final class InstanceHolder {
        static final com.paypal.oslo.core.remoteconfig.companion.StatsigOverrideManager_Factory getHighSpeedVideoFpsRanges = new com.paypal.oslo.core.remoteconfig.companion.StatsigOverrideManager_Factory();

        private InstanceHolder() {
        }
    }
}
