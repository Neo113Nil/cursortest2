package com.paypal.oslo.feature.identity.phoneconfirmation.data.repository;

/* loaded from: classes13.dex */
public final class PhoneConfirmationRepositoryImpl_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.identity.phoneconfirmation.data.repository.PhoneConfirmationRepositoryImpl> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.identity.phoneconfirmation.data.datasource.PhoneConfirmationDataSource> getHighSpeedVideoFpsRangesFor;

    private PhoneConfirmationRepositoryImpl_Factory(dagger.internal.Provider<com.paypal.oslo.feature.identity.phoneconfirmation.data.datasource.PhoneConfirmationDataSource> provider) {
        this.getHighSpeedVideoFpsRangesFor = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.identity.phoneconfirmation.data.repository.PhoneConfirmationRepositoryImpl get() {
        return newInstance(this.getHighSpeedVideoFpsRangesFor.get());
    }

    public static com.paypal.oslo.feature.identity.phoneconfirmation.data.repository.PhoneConfirmationRepositoryImpl_Factory create(dagger.internal.Provider<com.paypal.oslo.feature.identity.phoneconfirmation.data.datasource.PhoneConfirmationDataSource> provider) {
        return new com.paypal.oslo.feature.identity.phoneconfirmation.data.repository.PhoneConfirmationRepositoryImpl_Factory(provider);
    }

    public static com.paypal.oslo.feature.identity.phoneconfirmation.data.repository.PhoneConfirmationRepositoryImpl newInstance(com.paypal.oslo.feature.identity.phoneconfirmation.data.datasource.PhoneConfirmationDataSource phoneConfirmationDataSource) {
        return new com.paypal.oslo.feature.identity.phoneconfirmation.data.repository.PhoneConfirmationRepositoryImpl(phoneConfirmationDataSource);
    }
}
