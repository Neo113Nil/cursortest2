package com.paypal.oslo.feature.searchandintelligence.data.repository.mock;

/* loaded from: classes14.dex */
public final class MockStartersRepository_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.searchandintelligence.data.repository.mock.MockStartersRepository> {
    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.searchandintelligence.data.repository.mock.MockStartersRepository get() {
        return newInstance();
    }

    public static com.paypal.oslo.feature.searchandintelligence.data.repository.mock.MockStartersRepository_Factory create() {
        return com.paypal.oslo.feature.searchandintelligence.data.repository.mock.MockStartersRepository_Factory.InstanceHolder.Camera2StreamConfigurationMap;
    }

    public static com.paypal.oslo.feature.searchandintelligence.data.repository.mock.MockStartersRepository newInstance() {
        return new com.paypal.oslo.feature.searchandintelligence.data.repository.mock.MockStartersRepository();
    }

    static final class InstanceHolder {
        static final com.paypal.oslo.feature.searchandintelligence.data.repository.mock.MockStartersRepository_Factory Camera2StreamConfigurationMap = new com.paypal.oslo.feature.searchandintelligence.data.repository.mock.MockStartersRepository_Factory();

        private InstanceHolder() {
        }
    }
}
