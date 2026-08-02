package com.paypal.oslo.feature.revolvingcreditservicing.data.repository.mock;

/* loaded from: classes14.dex */
public final class MockStatementsRepositoryImpl_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.revolvingcreditservicing.data.repository.mock.MockStatementsRepositoryImpl> {
    private final dagger.internal.Provider<android.content.Context> getHighSpeedVideoFpsRanges;

    private MockStatementsRepositoryImpl_Factory(dagger.internal.Provider<android.content.Context> provider) {
        this.getHighSpeedVideoFpsRanges = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.revolvingcreditservicing.data.repository.mock.MockStatementsRepositoryImpl get() {
        return newInstance(this.getHighSpeedVideoFpsRanges.get());
    }

    public static com.paypal.oslo.feature.revolvingcreditservicing.data.repository.mock.MockStatementsRepositoryImpl_Factory create(dagger.internal.Provider<android.content.Context> provider) {
        return new com.paypal.oslo.feature.revolvingcreditservicing.data.repository.mock.MockStatementsRepositoryImpl_Factory(provider);
    }

    public static com.paypal.oslo.feature.revolvingcreditservicing.data.repository.mock.MockStatementsRepositoryImpl newInstance(android.content.Context context) {
        return new com.paypal.oslo.feature.revolvingcreditservicing.data.repository.mock.MockStatementsRepositoryImpl(context);
    }
}
