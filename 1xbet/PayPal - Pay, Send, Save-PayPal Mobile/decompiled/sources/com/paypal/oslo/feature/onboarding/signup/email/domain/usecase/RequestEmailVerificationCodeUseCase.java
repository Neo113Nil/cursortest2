package com.paypal.oslo.feature.onboarding.signup.email.domain.usecase;

@kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J$\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0086B¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u0010\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000f"}, d2 = {"Lcom/paypal/oslo/feature/onboarding/signup/email/domain/usecase/RequestEmailVerificationCodeUseCase;", "", "Lcom/paypal/oslo/feature/onboarding/signup/email/domain/repository/EmailRepository;", "emailRepository", "<init>", "(Lcom/paypal/oslo/feature/onboarding/signup/email/domain/repository/EmailRepository;)V", "Lcom/paypal/oslo/feature/onboarding/api/signup/domain/model/Email;", "email", "Larrow/core/Either;", "Lcom/paypal/oslo/feature/onboarding/errorstruct/domain/model/ApiCallError;", "Lcom/paypal/oslo/feature/onboarding/signup/domain/model/ConfirmationState;", "invoke-E4ilnuY", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "invoke", "Camera2StreamConfigurationMap", "Lcom/paypal/oslo/feature/onboarding/signup/email/domain/repository/EmailRepository;", "getHighResolutionOutputSizeshNQ4ISI"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class RequestEmailVerificationCodeUseCase {
    public static final int $stable = 8;

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.onboarding.signup.email.domain.repository.EmailRepository getHighResolutionOutputSizeshNQ4ISI;

    @javax.inject.Inject
    public RequestEmailVerificationCodeUseCase(com.paypal.oslo.feature.onboarding.signup.email.domain.repository.EmailRepository emailRepository) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(emailRepository, "");
        this.getHighResolutionOutputSizeshNQ4ISI = emailRepository;
    }

    /* renamed from: invoke-E4ilnuY, reason: not valid java name */
    public final java.lang.Object m16345invokeE4ilnuY(java.lang.String str, kotlin.coroutines.Continuation<? super arrow.core.Either<? extends com.paypal.oslo.feature.onboarding.errorstruct.domain.model.ApiCallError, ? extends com.paypal.oslo.feature.onboarding.signup.domain.model.ConfirmationState>> continuation) {
        return this.getHighResolutionOutputSizeshNQ4ISI.mo16341requestCodeE4ilnuY(str, continuation);
    }
}
