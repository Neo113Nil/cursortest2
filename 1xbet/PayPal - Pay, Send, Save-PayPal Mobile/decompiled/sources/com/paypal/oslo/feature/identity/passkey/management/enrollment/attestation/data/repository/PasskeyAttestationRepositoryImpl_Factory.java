package com.paypal.oslo.feature.identity.passkey.management.enrollment.attestation.data.repository;

/* loaded from: classes12.dex */
public final class PasskeyAttestationRepositoryImpl_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.identity.passkey.management.enrollment.attestation.data.repository.PasskeyAttestationRepositoryImpl> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.identity.passkey.management.enrollment.attestation.data.datasource.PasskeyAttestationDataSource> getHighSpeedVideoFpsRanges;

    private PasskeyAttestationRepositoryImpl_Factory(dagger.internal.Provider<com.paypal.oslo.feature.identity.passkey.management.enrollment.attestation.data.datasource.PasskeyAttestationDataSource> provider) {
        this.getHighSpeedVideoFpsRanges = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.identity.passkey.management.enrollment.attestation.data.repository.PasskeyAttestationRepositoryImpl get() {
        return newInstance(this.getHighSpeedVideoFpsRanges.get());
    }

    public static com.paypal.oslo.feature.identity.passkey.management.enrollment.attestation.data.repository.PasskeyAttestationRepositoryImpl_Factory create(dagger.internal.Provider<com.paypal.oslo.feature.identity.passkey.management.enrollment.attestation.data.datasource.PasskeyAttestationDataSource> provider) {
        return new com.paypal.oslo.feature.identity.passkey.management.enrollment.attestation.data.repository.PasskeyAttestationRepositoryImpl_Factory(provider);
    }

    public static com.paypal.oslo.feature.identity.passkey.management.enrollment.attestation.data.repository.PasskeyAttestationRepositoryImpl newInstance(com.paypal.oslo.feature.identity.passkey.management.enrollment.attestation.data.datasource.PasskeyAttestationDataSource passkeyAttestationDataSource) {
        return new com.paypal.oslo.feature.identity.passkey.management.enrollment.attestation.data.repository.PasskeyAttestationRepositoryImpl(passkeyAttestationDataSource);
    }
}
