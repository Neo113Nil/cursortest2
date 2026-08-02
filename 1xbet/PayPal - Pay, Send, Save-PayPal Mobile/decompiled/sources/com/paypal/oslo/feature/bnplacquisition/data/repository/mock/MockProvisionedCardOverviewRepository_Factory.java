package com.paypal.oslo.feature.bnplacquisition.data.repository.mock;

/* loaded from: classes11.dex */
public final class MockProvisionedCardOverviewRepository_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.bnplacquisition.data.repository.mock.MockProvisionedCardOverviewRepository> {
    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.bnplacquisition.data.repository.mock.MockProvisionedCardOverviewRepository get() {
        return newInstance();
    }

    public static com.paypal.oslo.feature.bnplacquisition.data.repository.mock.MockProvisionedCardOverviewRepository_Factory create() {
        return com.paypal.oslo.feature.bnplacquisition.data.repository.mock.MockProvisionedCardOverviewRepository_Factory.InstanceHolder.Camera2StreamConfigurationMap;
    }

    public static com.paypal.oslo.feature.bnplacquisition.data.repository.mock.MockProvisionedCardOverviewRepository newInstance() {
        return new com.paypal.oslo.feature.bnplacquisition.data.repository.mock.MockProvisionedCardOverviewRepository();
    }

    static final class InstanceHolder {
        static final com.paypal.oslo.feature.bnplacquisition.data.repository.mock.MockProvisionedCardOverviewRepository_Factory Camera2StreamConfigurationMap = new com.paypal.oslo.feature.bnplacquisition.data.repository.mock.MockProvisionedCardOverviewRepository_Factory();

        private InstanceHolder() {
        }
    }
}
