package com.paypal.oslo.feature.inappcheckout.data.repository.mock;

/* loaded from: classes13.dex */
public final class MockCardJsonParser_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.inappcheckout.data.repository.mock.MockCardJsonParser> {
    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.inappcheckout.data.repository.mock.MockCardJsonParser get() {
        return newInstance();
    }

    public static com.paypal.oslo.feature.inappcheckout.data.repository.mock.MockCardJsonParser_Factory create() {
        return com.paypal.oslo.feature.inappcheckout.data.repository.mock.MockCardJsonParser_Factory.InstanceHolder.getHighSpeedVideoFpsRanges;
    }

    public static com.paypal.oslo.feature.inappcheckout.data.repository.mock.MockCardJsonParser newInstance() {
        return new com.paypal.oslo.feature.inappcheckout.data.repository.mock.MockCardJsonParser();
    }

    static final class InstanceHolder {
        static final com.paypal.oslo.feature.inappcheckout.data.repository.mock.MockCardJsonParser_Factory getHighSpeedVideoFpsRanges = new com.paypal.oslo.feature.inappcheckout.data.repository.mock.MockCardJsonParser_Factory();

        private InstanceHolder() {
        }
    }
}
