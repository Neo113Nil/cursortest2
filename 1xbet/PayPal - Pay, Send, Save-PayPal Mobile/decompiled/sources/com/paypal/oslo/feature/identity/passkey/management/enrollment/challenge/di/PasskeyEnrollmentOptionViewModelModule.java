package com.paypal.oslo.feature.identity.passkey.management.enrollment.challenge.di;

@kotlin.Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÁ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lcom/paypal/oslo/feature/identity/passkey/management/enrollment/challenge/di/PasskeyEnrollmentOptionViewModelModule;", "", "<init>", "()V", "Lcom/paypal/oslo/feature/identity/passkey/management/enrollment/challenge/domain/repository/PasskeyCreateChallengeRepository;", "passkeyEnrollmentOptionRepository", "Lcom/paypal/oslo/feature/identity/passkey/management/enrollment/challenge/domain/usecase/PasskeyCreateChallengeUseCase;", "providePasskeyEnrollmentOptionUseCase", "(Lcom/paypal/oslo/feature/identity/passkey/management/enrollment/challenge/domain/repository/PasskeyCreateChallengeRepository;)Lcom/paypal/oslo/feature/identity/passkey/management/enrollment/challenge/domain/usecase/PasskeyCreateChallengeUseCase;"}, k = 1, mv = {2, 3, 0}, xi = 48)
@dagger.Module
/* loaded from: classes12.dex */
public final class PasskeyEnrollmentOptionViewModelModule {
    public static final int $stable = 0;
    public static final com.paypal.oslo.feature.identity.passkey.management.enrollment.challenge.di.PasskeyEnrollmentOptionViewModelModule INSTANCE = new com.paypal.oslo.feature.identity.passkey.management.enrollment.challenge.di.PasskeyEnrollmentOptionViewModelModule();

    private PasskeyEnrollmentOptionViewModelModule() {
    }

    @dagger.Provides
    public final com.paypal.oslo.feature.identity.passkey.management.enrollment.challenge.domain.usecase.PasskeyCreateChallengeUseCase providePasskeyEnrollmentOptionUseCase(com.paypal.oslo.feature.identity.passkey.management.enrollment.challenge.domain.repository.PasskeyCreateChallengeRepository passkeyEnrollmentOptionRepository) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(passkeyEnrollmentOptionRepository, "");
        return new com.paypal.oslo.feature.identity.passkey.management.enrollment.challenge.domain.usecase.PasskeyCreateChallengeUseCase(passkeyEnrollmentOptionRepository);
    }
}
