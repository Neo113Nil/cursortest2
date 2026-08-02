package com.paypal.oslo.feature.identity.passwordrecovery.domain.usecase;

@kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u00002\u00020\u0001B\u0019\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J$\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\n2\u0006\u0010\t\u001a\u00020\bH\u0086B¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u0011\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0013\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012"}, d2 = {"Lcom/paypal/oslo/feature/identity/passwordrecovery/domain/usecase/PasswordRecoveryUseCase;", "", "Lcom/paypal/oslo/feature/identity/passwordrecovery/domain/repository/PasswordRecoveryRepository;", "repository", "Lcom/paypal/oslo/feature/identity/passwordrecovery/domain/validation/PasswordValidator;", "passwordValidator", "<init>", "(Lcom/paypal/oslo/feature/identity/passwordrecovery/domain/repository/PasswordRecoveryRepository;Lcom/paypal/oslo/feature/identity/passwordrecovery/domain/validation/PasswordValidator;)V", "Lcom/paypal/oslo/feature/identity/passwordrecovery/domain/model/CreatePasswordInput;", "input", "Larrow/core/Either;", "Lcom/paypal/oslo/feature/identity/passwordrecovery/domain/model/PasswordRecoveryError;", "Lcom/paypal/oslo/feature/identity/passwordrecovery/domain/model/CreatePasswordOutput;", "invoke", "(Lcom/paypal/oslo/feature/identity/passwordrecovery/domain/model/CreatePasswordInput;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getHighSpeedVideoFpsRanges", "Lcom/paypal/oslo/feature/identity/passwordrecovery/domain/repository/PasswordRecoveryRepository;", "getHighResolutionOutputSizeshNQ4ISI", "Lcom/paypal/oslo/feature/identity/passwordrecovery/domain/validation/PasswordValidator;", "getHighSpeedVideoFpsRangesFor"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class PasswordRecoveryUseCase {
    public static final int $stable = 0;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.identity.passwordrecovery.domain.validation.PasswordValidator getHighSpeedVideoFpsRangesFor;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.identity.passwordrecovery.domain.repository.PasswordRecoveryRepository getHighResolutionOutputSizeshNQ4ISI;

    @javax.inject.Inject
    public PasswordRecoveryUseCase(com.paypal.oslo.feature.identity.passwordrecovery.domain.repository.PasswordRecoveryRepository passwordRecoveryRepository, com.paypal.oslo.feature.identity.passwordrecovery.domain.validation.PasswordValidator passwordValidator) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(passwordRecoveryRepository, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(passwordValidator, "");
        this.getHighResolutionOutputSizeshNQ4ISI = passwordRecoveryRepository;
        this.getHighSpeedVideoFpsRangesFor = passwordValidator;
    }

    public final java.lang.Object invoke(com.paypal.oslo.feature.identity.passwordrecovery.domain.model.CreatePasswordInput createPasswordInput, kotlin.coroutines.Continuation<? super arrow.core.Either<? extends com.paypal.oslo.feature.identity.passwordrecovery.domain.model.PasswordRecoveryError, com.paypal.oslo.feature.identity.passwordrecovery.domain.model.CreatePasswordOutput>> continuation) {
        com.paypal.oslo.feature.identity.passwordrecovery.domain.model.PasswordRecoveryError.PasswordMatchesCredential passwordMatchesCredential;
        com.paypal.oslo.feature.identity.passwordrecovery.domain.validation.PasswordValidationResult validate = this.getHighSpeedVideoFpsRangesFor.validate(createPasswordInput.getNewPassword(), createPasswordInput.getPublicCredential());
        if (kotlin.jvm.internal.Intrinsics.areEqual(validate, com.paypal.oslo.feature.identity.passwordrecovery.domain.validation.PasswordValidationResult.Valid.INSTANCE)) {
            passwordMatchesCredential = null;
        } else if (kotlin.jvm.internal.Intrinsics.areEqual(validate, com.paypal.oslo.feature.identity.passwordrecovery.domain.validation.PasswordValidationResult.Empty.INSTANCE)) {
            passwordMatchesCredential = com.paypal.oslo.feature.identity.passwordrecovery.domain.model.PasswordRecoveryError.EmptyPassword.INSTANCE;
        } else if (kotlin.jvm.internal.Intrinsics.areEqual(validate, com.paypal.oslo.feature.identity.passwordrecovery.domain.validation.PasswordValidationResult.TooShort.INSTANCE)) {
            passwordMatchesCredential = com.paypal.oslo.feature.identity.passwordrecovery.domain.model.PasswordRecoveryError.PasswordTooShort.INSTANCE;
        } else if (kotlin.jvm.internal.Intrinsics.areEqual(validate, com.paypal.oslo.feature.identity.passwordrecovery.domain.validation.PasswordValidationResult.TooLong.INSTANCE)) {
            passwordMatchesCredential = com.paypal.oslo.feature.identity.passwordrecovery.domain.model.PasswordRecoveryError.PasswordTooLong.INSTANCE;
        } else if (kotlin.jvm.internal.Intrinsics.areEqual(validate, com.paypal.oslo.feature.identity.passwordrecovery.domain.validation.PasswordValidationResult.TooWeak.INSTANCE)) {
            passwordMatchesCredential = com.paypal.oslo.feature.identity.passwordrecovery.domain.model.PasswordRecoveryError.PasswordTooWeak.INSTANCE;
        } else {
            if (!kotlin.jvm.internal.Intrinsics.areEqual(validate, com.paypal.oslo.feature.identity.passwordrecovery.domain.validation.PasswordValidationResult.MatchesCredential.INSTANCE)) {
                throw new kotlin.NoWhenBranchMatchedException();
            }
            passwordMatchesCredential = com.paypal.oslo.feature.identity.passwordrecovery.domain.model.PasswordRecoveryError.PasswordMatchesCredential.INSTANCE;
        }
        if (passwordMatchesCredential != null) {
            return arrow.core.EitherKt.left(passwordMatchesCredential);
        }
        return createPasswordInput.getConfirmPassword().length() == 0 ? arrow.core.EitherKt.left(com.paypal.oslo.feature.identity.passwordrecovery.domain.model.PasswordRecoveryError.EmptyConfirmPassword.INSTANCE) : !kotlin.jvm.internal.Intrinsics.areEqual(createPasswordInput.getNewPassword(), createPasswordInput.getConfirmPassword()) ? arrow.core.EitherKt.left(com.paypal.oslo.feature.identity.passwordrecovery.domain.model.PasswordRecoveryError.PasswordsDoNotMatch.INSTANCE) : this.getHighResolutionOutputSizeshNQ4ISI.createPassword(createPasswordInput, continuation);
    }
}
