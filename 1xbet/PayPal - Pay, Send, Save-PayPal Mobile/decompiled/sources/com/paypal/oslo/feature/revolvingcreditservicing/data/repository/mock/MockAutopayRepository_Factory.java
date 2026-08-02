package com.paypal.oslo.feature.revolvingcreditservicing.data.repository.mock;

/* loaded from: classes14.dex */
public final class MockAutopayRepository_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.revolvingcreditservicing.data.repository.mock.MockAutopayRepository> {
    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.revolvingcreditservicing.data.repository.mock.MockAutopayRepository get() {
        return newInstance();
    }

    public static com.paypal.oslo.feature.revolvingcreditservicing.data.repository.mock.MockAutopayRepository_Factory create() {
        return com.paypal.oslo.feature.revolvingcreditservicing.data.repository.mock.MockAutopayRepository_Factory.InstanceHolder.getHighSpeedVideoFpsRanges;
    }

    public static com.paypal.oslo.feature.revolvingcreditservicing.data.repository.mock.MockAutopayRepository newInstance() {
        return new com.paypal.oslo.feature.revolvingcreditservicing.data.repository.mock.MockAutopayRepository();
    }

    static final class InstanceHolder {
        static final com.paypal.oslo.feature.revolvingcreditservicing.data.repository.mock.MockAutopayRepository_Factory getHighSpeedVideoFpsRanges = new com.paypal.oslo.feature.revolvingcreditservicing.data.repository.mock.MockAutopayRepository_Factory();

        private InstanceHolder() {
        }
    }
}
