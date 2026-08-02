package com.paypal.oslo.feature.inappcheckout.features.switchback;

/* loaded from: classes13.dex */
public final class SwitchBackUrlMatcher_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.inappcheckout.features.switchback.SwitchBackUrlMatcher> {
    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.inappcheckout.features.switchback.SwitchBackUrlMatcher get() {
        return newInstance();
    }

    public static com.paypal.oslo.feature.inappcheckout.features.switchback.SwitchBackUrlMatcher_Factory create() {
        return com.paypal.oslo.feature.inappcheckout.features.switchback.SwitchBackUrlMatcher_Factory.InstanceHolder.getHighSpeedVideoSizes;
    }

    public static com.paypal.oslo.feature.inappcheckout.features.switchback.SwitchBackUrlMatcher newInstance() {
        return new com.paypal.oslo.feature.inappcheckout.features.switchback.SwitchBackUrlMatcher();
    }

    static final class InstanceHolder {
        static final com.paypal.oslo.feature.inappcheckout.features.switchback.SwitchBackUrlMatcher_Factory getHighSpeedVideoSizes = new com.paypal.oslo.feature.inappcheckout.features.switchback.SwitchBackUrlMatcher_Factory();

        private InstanceHolder() {
        }
    }
}
