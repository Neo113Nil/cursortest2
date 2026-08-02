package com.paypal.oslo.feature.subscriptions.bulkfi.data.repository.mock;

/* loaded from: classes15.dex */
public final class MockBulkUpdateFiRepository_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.subscriptions.bulkfi.data.repository.mock.MockBulkUpdateFiRepository> {
    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.subscriptions.bulkfi.data.repository.mock.MockBulkUpdateFiRepository get() {
        return newInstance();
    }

    public static com.paypal.oslo.feature.subscriptions.bulkfi.data.repository.mock.MockBulkUpdateFiRepository_Factory create() {
        return com.paypal.oslo.feature.subscriptions.bulkfi.data.repository.mock.MockBulkUpdateFiRepository_Factory.InstanceHolder.getHighSpeedVideoSizes;
    }

    public static com.paypal.oslo.feature.subscriptions.bulkfi.data.repository.mock.MockBulkUpdateFiRepository newInstance() {
        return new com.paypal.oslo.feature.subscriptions.bulkfi.data.repository.mock.MockBulkUpdateFiRepository();
    }

    static final class InstanceHolder {
        static final com.paypal.oslo.feature.subscriptions.bulkfi.data.repository.mock.MockBulkUpdateFiRepository_Factory getHighSpeedVideoSizes = new com.paypal.oslo.feature.subscriptions.bulkfi.data.repository.mock.MockBulkUpdateFiRepository_Factory();

        private InstanceHolder() {
        }
    }
}
