package com.paypal.oslo.feature.userprofile.domain.usecase;

@kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J$\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0086B¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\r\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/userprofile/domain/usecase/MakePrimaryEmailUseCase;", "", "Lcom/paypal/oslo/feature/userprofile/domain/repository/EmailRepository;", "emailRepository", "<init>", "(Lcom/paypal/oslo/feature/userprofile/domain/repository/EmailRepository;)V", "", "emailId", "Larrow/core/Either;", "Lcom/paypal/oslo/feature/userprofile/domain/model/email/EmailError;", "", "invoke", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getHighSpeedVideoFpsRangesFor", "Lcom/paypal/oslo/feature/userprofile/domain/repository/EmailRepository;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class MakePrimaryEmailUseCase {
    public static final int $stable = 8;
    private final com.paypal.oslo.feature.userprofile.domain.repository.EmailRepository getHighSpeedVideoFpsRangesFor;

    @javax.inject.Inject
    public MakePrimaryEmailUseCase(com.paypal.oslo.feature.userprofile.domain.repository.EmailRepository emailRepository) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(emailRepository, "");
        this.getHighSpeedVideoFpsRangesFor = emailRepository;
    }

    public final java.lang.Object invoke(java.lang.String str, kotlin.coroutines.Continuation<? super arrow.core.Either<? extends com.paypal.oslo.feature.userprofile.domain.model.email.EmailError, kotlin.Unit>> continuation) {
        return this.getHighSpeedVideoFpsRangesFor.makePrimaryEmail(str, continuation);
    }
}
