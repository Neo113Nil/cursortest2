package com.paypal.oslo.feature.userprofile.domain.usecase;

@kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005JR\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00100\u000e2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u00062\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\r\u001a\u00020\fH\u0086B¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0013\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014"}, d2 = {"Lcom/paypal/oslo/feature/userprofile/domain/usecase/ReplacePhoneUseCase;", "", "Lcom/paypal/oslo/feature/userprofile/domain/repository/PhoneRepository;", "phoneRepository", "<init>", "(Lcom/paypal/oslo/feature/userprofile/domain/repository/PhoneRepository;)V", "", "phoneId", "countryCode", com.microblink.blinkid.entities.recognizers.blinkid.jordan.JordanCombinedRecognizer.VerificationConstants.NationalNumber, "phoneType", "extensionNumber", "", "refreshUserStore", "Larrow/core/Either;", "Lcom/paypal/oslo/feature/userprofile/domain/model/PhoneError;", "Lcom/paypal/oslo/core/userstore/model/ProfilePhone;", "invoke", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getHighSpeedVideoSizes", "Lcom/paypal/oslo/feature/userprofile/domain/repository/PhoneRepository;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class ReplacePhoneUseCase {
    public static final int $stable = 8;
    private final com.paypal.oslo.feature.userprofile.domain.repository.PhoneRepository getHighSpeedVideoSizes;

    @javax.inject.Inject
    public ReplacePhoneUseCase(com.paypal.oslo.feature.userprofile.domain.repository.PhoneRepository phoneRepository) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(phoneRepository, "");
        this.getHighSpeedVideoSizes = phoneRepository;
    }

    public final java.lang.Object invoke(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, boolean z, kotlin.coroutines.Continuation<? super arrow.core.Either<? extends com.paypal.oslo.feature.userprofile.domain.model.PhoneError, com.paypal.oslo.core.userstore.model.ProfilePhone>> continuation) {
        return this.getHighSpeedVideoSizes.replacePhone(str, str2, str3, str4, str5, z, continuation);
    }
}
