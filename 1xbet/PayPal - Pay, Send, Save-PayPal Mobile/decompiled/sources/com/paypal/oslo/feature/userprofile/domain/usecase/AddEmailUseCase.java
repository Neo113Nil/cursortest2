package com.paypal.oslo.feature.userprofile.domain.usecase;

@kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J,\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0086B¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u0011\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010"}, d2 = {"Lcom/paypal/oslo/feature/userprofile/domain/usecase/AddEmailUseCase;", "", "Lcom/paypal/oslo/feature/userprofile/domain/repository/EmailRepository;", "emailRepository", "<init>", "(Lcom/paypal/oslo/feature/userprofile/domain/repository/EmailRepository;)V", "", androidx.autofill.HintConstants.AUTOFILL_HINT_EMAIL_ADDRESS, "", "makePrimary", "Larrow/core/Either;", "Lcom/paypal/oslo/feature/userprofile/domain/model/email/EmailError;", "Lcom/paypal/oslo/core/userstore/model/ProfileEmail;", "invoke", "(Ljava/lang/String;ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getHighSpeedVideoFpsRanges", "Lcom/paypal/oslo/feature/userprofile/domain/repository/EmailRepository;", "getHighSpeedVideoSizes"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class AddEmailUseCase {
    public static final int $stable = 8;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.userprofile.domain.repository.EmailRepository getHighSpeedVideoSizes;

    @javax.inject.Inject
    public AddEmailUseCase(com.paypal.oslo.feature.userprofile.domain.repository.EmailRepository emailRepository) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(emailRepository, "");
        this.getHighSpeedVideoSizes = emailRepository;
    }

    public final java.lang.Object invoke(java.lang.String str, boolean z, kotlin.coroutines.Continuation<? super arrow.core.Either<? extends com.paypal.oslo.feature.userprofile.domain.model.email.EmailError, com.paypal.oslo.core.userstore.model.ProfileEmail>> continuation) {
        return this.getHighSpeedVideoSizes.addEmail(str, z, continuation);
    }
}
