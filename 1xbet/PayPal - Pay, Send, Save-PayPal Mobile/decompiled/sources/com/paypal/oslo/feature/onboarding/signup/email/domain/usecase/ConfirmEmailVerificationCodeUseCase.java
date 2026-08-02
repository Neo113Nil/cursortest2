package com.paypal.oslo.feature.onboarding.signup.email.domain.usecase;

@kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J$\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0086B¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u0010\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000f"}, d2 = {"Lcom/paypal/oslo/feature/onboarding/signup/email/domain/usecase/ConfirmEmailVerificationCodeUseCase;", "", "Lcom/paypal/oslo/feature/onboarding/signup/email/domain/repository/EmailRepository;", "emailRepository", "<init>", "(Lcom/paypal/oslo/feature/onboarding/signup/email/domain/repository/EmailRepository;)V", "Lcom/paypal/oslo/feature/onboarding/signup/domain/model/OtpCode;", "code", "Larrow/core/Either;", "Lcom/paypal/oslo/feature/onboarding/errorstruct/domain/model/ApiCallError;", "Lcom/paypal/oslo/feature/onboarding/signup/domain/model/ConfirmationState;", "invoke-LcHNf2w", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "invoke", "getHighSpeedVideoFpsRanges", "Lcom/paypal/oslo/feature/onboarding/signup/email/domain/repository/EmailRepository;", "Camera2StreamConfigurationMap"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class ConfirmEmailVerificationCodeUseCase {
    public static final int $stable = 8;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.onboarding.signup.email.domain.repository.EmailRepository Camera2StreamConfigurationMap;

    @javax.inject.Inject
    public ConfirmEmailVerificationCodeUseCase(com.paypal.oslo.feature.onboarding.signup.email.domain.repository.EmailRepository emailRepository) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(emailRepository, "");
        this.Camera2StreamConfigurationMap = emailRepository;
    }

    /* renamed from: invoke-LcHNf2w, reason: not valid java name */
    public final java.lang.Object m16344invokeLcHNf2w(java.lang.String str, kotlin.coroutines.Continuation<? super arrow.core.Either<? extends com.paypal.oslo.feature.onboarding.errorstruct.domain.model.ApiCallError, ? extends com.paypal.oslo.feature.onboarding.signup.domain.model.ConfirmationState>> continuation) {
        return this.Camera2StreamConfigurationMap.mo16340confirmLcHNf2w(str, continuation);
    }
}
