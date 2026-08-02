package com.paypal.oslo.feature.bnplservicing.data.repository.mock;

/* loaded from: classes11.dex */
public final class MockPrequalificationSummaryRepository_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.bnplservicing.data.repository.mock.MockPrequalificationSummaryRepository> {
    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.bnplservicing.data.repository.mock.MockPrequalificationSummaryRepository get() {
        return newInstance();
    }

    public static com.paypal.oslo.feature.bnplservicing.data.repository.mock.MockPrequalificationSummaryRepository_Factory create() {
        return com.paypal.oslo.feature.bnplservicing.data.repository.mock.MockPrequalificationSummaryRepository_Factory.InstanceHolder.Camera2StreamConfigurationMap;
    }

    public static com.paypal.oslo.feature.bnplservicing.data.repository.mock.MockPrequalificationSummaryRepository newInstance() {
        return new com.paypal.oslo.feature.bnplservicing.data.repository.mock.MockPrequalificationSummaryRepository();
    }

    static final class InstanceHolder {
        static final com.paypal.oslo.feature.bnplservicing.data.repository.mock.MockPrequalificationSummaryRepository_Factory Camera2StreamConfigurationMap = new com.paypal.oslo.feature.bnplservicing.data.repository.mock.MockPrequalificationSummaryRepository_Factory();

        private InstanceHolder() {
        }
    }
}
