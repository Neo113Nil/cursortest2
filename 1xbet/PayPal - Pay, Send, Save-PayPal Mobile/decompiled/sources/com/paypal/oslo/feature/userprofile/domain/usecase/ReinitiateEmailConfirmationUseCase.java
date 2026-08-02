package com.paypal.oslo.feature.userprofile.domain.usecase;

@kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J4\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u0006H\u0086B¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u0011\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010"}, d2 = {"Lcom/paypal/oslo/feature/userprofile/domain/usecase/ReinitiateEmailConfirmationUseCase;", "", "Lcom/paypal/oslo/feature/userprofile/domain/repository/EmailRepository;", "emailRepository", "<init>", "(Lcom/paypal/oslo/feature/userprofile/domain/repository/EmailRepository;)V", "", "emailId", "authId", "challengeId", "Larrow/core/Either;", "Lcom/paypal/oslo/feature/userprofile/domain/model/email/EmailError;", "Lcom/paypal/oslo/feature/userprofile/domain/model/email/EmailConfirmationChallenge;", "invoke", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Camera2StreamConfigurationMap", "Lcom/paypal/oslo/feature/userprofile/domain/repository/EmailRepository;", "getHighResolutionOutputSizeshNQ4ISI"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class ReinitiateEmailConfirmationUseCase {
    public static final int $stable = 8;

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.userprofile.domain.repository.EmailRepository getHighResolutionOutputSizeshNQ4ISI;

    @javax.inject.Inject
    public ReinitiateEmailConfirmationUseCase(com.paypal.oslo.feature.userprofile.domain.repository.EmailRepository emailRepository) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(emailRepository, "");
        this.getHighResolutionOutputSizeshNQ4ISI = emailRepository;
    }

    public final java.lang.Object invoke(java.lang.String str, java.lang.String str2, java.lang.String str3, kotlin.coroutines.Continuation<? super arrow.core.Either<? extends com.paypal.oslo.feature.userprofile.domain.model.email.EmailError, com.paypal.oslo.feature.userprofile.domain.model.email.EmailConfirmationChallenge>> continuation) {
        return this.getHighResolutionOutputSizeshNQ4ISI.reinitiateEmailConfirmation(str, str2, str3, continuation);
    }
}
