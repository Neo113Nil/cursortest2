package com.paypal.oslo.feature.identity.passkey.management.enrollment.attestation.data.datasource;

/* loaded from: classes12.dex */
public final class PasskeyAttestationDataSource_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.identity.passkey.management.enrollment.attestation.data.datasource.PasskeyAttestationDataSource> {
    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.identity.passkey.management.enrollment.attestation.data.datasource.PasskeyAttestationDataSource get() {
        return newInstance();
    }

    public static com.paypal.oslo.feature.identity.passkey.management.enrollment.attestation.data.datasource.PasskeyAttestationDataSource_Factory create() {
        return com.paypal.oslo.feature.identity.passkey.management.enrollment.attestation.data.datasource.PasskeyAttestationDataSource_Factory.InstanceHolder.getHighResolutionOutputSizeshNQ4ISI;
    }

    public static com.paypal.oslo.feature.identity.passkey.management.enrollment.attestation.data.datasource.PasskeyAttestationDataSource newInstance() {
        return new com.paypal.oslo.feature.identity.passkey.management.enrollment.attestation.data.datasource.PasskeyAttestationDataSource();
    }

    static final class InstanceHolder {
        static final com.paypal.oslo.feature.identity.passkey.management.enrollment.attestation.data.datasource.PasskeyAttestationDataSource_Factory getHighResolutionOutputSizeshNQ4ISI = new com.paypal.oslo.feature.identity.passkey.management.enrollment.attestation.data.datasource.PasskeyAttestationDataSource_Factory();

        private InstanceHolder() {
        }
    }
}
