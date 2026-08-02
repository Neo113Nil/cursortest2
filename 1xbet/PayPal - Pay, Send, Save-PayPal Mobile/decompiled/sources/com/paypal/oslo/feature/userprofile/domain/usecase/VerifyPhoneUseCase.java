package com.paypal.oslo.feature.userprofile.domain.usecase;

@kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005JD\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000f0\r2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u000bH\u0086B¢\u0006\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013"}, d2 = {"Lcom/paypal/oslo/feature/userprofile/domain/usecase/VerifyPhoneUseCase;", "", "Lcom/paypal/oslo/feature/userprofile/domain/repository/PhoneRepository;", "phoneRepository", "<init>", "(Lcom/paypal/oslo/feature/userprofile/domain/repository/PhoneRepository;)V", "", "phoneId", "authId", "challengeId", "code", "", "primary", "Larrow/core/Either;", "Lcom/paypal/oslo/feature/userprofile/domain/model/PhoneError;", "Lcom/paypal/oslo/core/userstore/model/ProfilePhone;", "invoke", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getHighResolutionOutputSizeshNQ4ISI", "Lcom/paypal/oslo/feature/userprofile/domain/repository/PhoneRepository;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class VerifyPhoneUseCase {
    public static final int $stable = 8;
    private final com.paypal.oslo.feature.userprofile.domain.repository.PhoneRepository getHighResolutionOutputSizeshNQ4ISI;

    @javax.inject.Inject
    public VerifyPhoneUseCase(com.paypal.oslo.feature.userprofile.domain.repository.PhoneRepository phoneRepository) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(phoneRepository, "");
        this.getHighResolutionOutputSizeshNQ4ISI = phoneRepository;
    }

    public final java.lang.Object invoke(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, boolean z, kotlin.coroutines.Continuation<? super arrow.core.Either<? extends com.paypal.oslo.feature.userprofile.domain.model.PhoneError, com.paypal.oslo.core.userstore.model.ProfilePhone>> continuation) {
        return this.getHighResolutionOutputSizeshNQ4ISI.verifyPhone(str, str2, str3, str4, z, continuation);
    }
}
