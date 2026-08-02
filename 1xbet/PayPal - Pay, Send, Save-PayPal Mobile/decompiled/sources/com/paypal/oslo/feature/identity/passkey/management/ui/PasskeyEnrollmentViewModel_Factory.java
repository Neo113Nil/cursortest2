package com.paypal.oslo.feature.identity.passkey.management.ui;

/* loaded from: classes12.dex */
public final class PasskeyEnrollmentViewModel_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.identity.passkey.management.ui.PasskeyEnrollmentViewModel> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.identity.passkey.management.enrollment.create.domain.usecase.PasskeyCreateUseCase> getHighResolutionOutputSizeshNQ4ISI;

    private PasskeyEnrollmentViewModel_Factory(dagger.internal.Provider<com.paypal.oslo.feature.identity.passkey.management.enrollment.create.domain.usecase.PasskeyCreateUseCase> provider) {
        this.getHighResolutionOutputSizeshNQ4ISI = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.identity.passkey.management.ui.PasskeyEnrollmentViewModel get() {
        return newInstance(this.getHighResolutionOutputSizeshNQ4ISI.get());
    }

    public static com.paypal.oslo.feature.identity.passkey.management.ui.PasskeyEnrollmentViewModel_Factory create(dagger.internal.Provider<com.paypal.oslo.feature.identity.passkey.management.enrollment.create.domain.usecase.PasskeyCreateUseCase> provider) {
        return new com.paypal.oslo.feature.identity.passkey.management.ui.PasskeyEnrollmentViewModel_Factory(provider);
    }

    public static com.paypal.oslo.feature.identity.passkey.management.ui.PasskeyEnrollmentViewModel newInstance(com.paypal.oslo.feature.identity.passkey.management.enrollment.create.domain.usecase.PasskeyCreateUseCase passkeyCreateUseCase) {
        return new com.paypal.oslo.feature.identity.passkey.management.ui.PasskeyEnrollmentViewModel(passkeyCreateUseCase);
    }
}
