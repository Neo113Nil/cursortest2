package com.paypal.oslo.feature.bnplservicing.data.repository.mock;

/* loaded from: classes11.dex */
public final class MockPlanListRepository_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.bnplservicing.data.repository.mock.MockPlanListRepository> {
    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.bnplservicing.data.repository.mock.MockPlanListRepository get() {
        return newInstance();
    }

    public static com.paypal.oslo.feature.bnplservicing.data.repository.mock.MockPlanListRepository_Factory create() {
        return com.paypal.oslo.feature.bnplservicing.data.repository.mock.MockPlanListRepository_Factory.InstanceHolder.getHighSpeedVideoSizes;
    }

    public static com.paypal.oslo.feature.bnplservicing.data.repository.mock.MockPlanListRepository newInstance() {
        return new com.paypal.oslo.feature.bnplservicing.data.repository.mock.MockPlanListRepository();
    }

    static final class InstanceHolder {
        static final com.paypal.oslo.feature.bnplservicing.data.repository.mock.MockPlanListRepository_Factory getHighSpeedVideoSizes = new com.paypal.oslo.feature.bnplservicing.data.repository.mock.MockPlanListRepository_Factory();

        private InstanceHolder() {
        }
    }
}
