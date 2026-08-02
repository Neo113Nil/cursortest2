package com.paypal.oslo.feature.identity.emailconfirmation.domain.usecase;

@kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J$\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0086B¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u000f\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/identity/emailconfirmation/domain/usecase/ConfirmEmailUseCase;", "", "Lcom/paypal/oslo/feature/identity/emailconfirmation/domain/repository/EmailConfirmationRepository;", "repository", "<init>", "(Lcom/paypal/oslo/feature/identity/emailconfirmation/domain/repository/EmailConfirmationRepository;)V", "Lcom/paypal/oslo/feature/identity/emailconfirmation/domain/model/request/EmailConfirmationRequest;", "request", "Larrow/core/Either;", "Lcom/paypal/oslo/feature/identity/emailconfirmation/domain/model/result/EmailConfirmationError;", "Lcom/paypal/oslo/feature/identity/emailconfirmation/domain/model/result/EmailConfirmationResult;", "invoke", "(Lcom/paypal/oslo/feature/identity/emailconfirmation/domain/model/request/EmailConfirmationRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Camera2StreamConfigurationMap", "Lcom/paypal/oslo/feature/identity/emailconfirmation/domain/repository/EmailConfirmationRepository;", "getHighSpeedVideoSizes"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class ConfirmEmailUseCase {
    public static final int $stable = 8;

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.identity.emailconfirmation.domain.repository.EmailConfirmationRepository getHighSpeedVideoSizes;

    @javax.inject.Inject
    public ConfirmEmailUseCase(com.paypal.oslo.feature.identity.emailconfirmation.domain.repository.EmailConfirmationRepository emailConfirmationRepository) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(emailConfirmationRepository, "");
        this.getHighSpeedVideoSizes = emailConfirmationRepository;
    }

    public final java.lang.Object invoke(com.paypal.oslo.feature.identity.emailconfirmation.domain.model.request.EmailConfirmationRequest emailConfirmationRequest, kotlin.coroutines.Continuation<? super arrow.core.Either<? extends com.paypal.oslo.feature.identity.emailconfirmation.domain.model.result.EmailConfirmationError, ? extends com.paypal.oslo.feature.identity.emailconfirmation.domain.model.result.EmailConfirmationResult>> continuation) {
        return this.getHighSpeedVideoSizes.confirmEmail(emailConfirmationRequest, continuation);
    }
}
