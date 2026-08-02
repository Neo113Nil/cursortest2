package com.paypal.oslo.feature.userprofile.domain.usecase;

@kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J6\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r0\u000b2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00062\b\b\u0002\u0010\n\u001a\u00020\tH\u0086B¢\u0006\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0012\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011"}, d2 = {"Lcom/paypal/oslo/feature/userprofile/domain/usecase/EditEmailUseCase;", "", "Lcom/paypal/oslo/feature/userprofile/domain/repository/EmailRepository;", "emailRepository", "<init>", "(Lcom/paypal/oslo/feature/userprofile/domain/repository/EmailRepository;)V", "", "emailId", androidx.autofill.HintConstants.AUTOFILL_HINT_EMAIL_ADDRESS, "", "isPrimary", "Larrow/core/Either;", "Lcom/paypal/oslo/feature/userprofile/domain/model/email/EmailError;", "Lcom/paypal/oslo/core/userstore/model/ProfileEmail;", "invoke", "(Ljava/lang/String;Ljava/lang/String;ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getHighSpeedVideoFpsRangesFor", "Lcom/paypal/oslo/feature/userprofile/domain/repository/EmailRepository;", "getHighResolutionOutputSizeshNQ4ISI"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class EditEmailUseCase {
    public static final int $stable = 8;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.userprofile.domain.repository.EmailRepository getHighResolutionOutputSizeshNQ4ISI;

    @javax.inject.Inject
    public EditEmailUseCase(com.paypal.oslo.feature.userprofile.domain.repository.EmailRepository emailRepository) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(emailRepository, "");
        this.getHighResolutionOutputSizeshNQ4ISI = emailRepository;
    }

    public static /* synthetic */ java.lang.Object invoke$default(com.paypal.oslo.feature.userprofile.domain.usecase.EditEmailUseCase editEmailUseCase, java.lang.String str, java.lang.String str2, boolean z, kotlin.coroutines.Continuation continuation, int i, java.lang.Object obj) {
        if ((i & 4) != 0) {
            z = false;
        }
        return editEmailUseCase.invoke(str, str2, z, continuation);
    }

    public final java.lang.Object invoke(java.lang.String str, java.lang.String str2, boolean z, kotlin.coroutines.Continuation<? super arrow.core.Either<? extends com.paypal.oslo.feature.userprofile.domain.model.email.EmailError, com.paypal.oslo.core.userstore.model.ProfileEmail>> continuation) {
        return this.getHighResolutionOutputSizeshNQ4ISI.updateEmail(str, str2, z, continuation);
    }
}
