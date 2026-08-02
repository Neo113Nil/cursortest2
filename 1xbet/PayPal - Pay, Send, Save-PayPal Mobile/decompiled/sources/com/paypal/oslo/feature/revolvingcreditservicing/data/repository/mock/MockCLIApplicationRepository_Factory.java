package com.paypal.oslo.feature.revolvingcreditservicing.data.repository.mock;

/* loaded from: classes14.dex */
public final class MockCLIApplicationRepository_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.revolvingcreditservicing.data.repository.mock.MockCLIApplicationRepository> {
    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.revolvingcreditservicing.data.repository.mock.MockCLIApplicationRepository get() {
        return newInstance();
    }

    public static com.paypal.oslo.feature.revolvingcreditservicing.data.repository.mock.MockCLIApplicationRepository_Factory create() {
        return com.paypal.oslo.feature.revolvingcreditservicing.data.repository.mock.MockCLIApplicationRepository_Factory.InstanceHolder.getHighResolutionOutputSizeshNQ4ISI;
    }

    public static com.paypal.oslo.feature.revolvingcreditservicing.data.repository.mock.MockCLIApplicationRepository newInstance() {
        return new com.paypal.oslo.feature.revolvingcreditservicing.data.repository.mock.MockCLIApplicationRepository();
    }

    static final class InstanceHolder {
        static final com.paypal.oslo.feature.revolvingcreditservicing.data.repository.mock.MockCLIApplicationRepository_Factory getHighResolutionOutputSizeshNQ4ISI = new com.paypal.oslo.feature.revolvingcreditservicing.data.repository.mock.MockCLIApplicationRepository_Factory();

        private InstanceHolder() {
        }
    }
}
