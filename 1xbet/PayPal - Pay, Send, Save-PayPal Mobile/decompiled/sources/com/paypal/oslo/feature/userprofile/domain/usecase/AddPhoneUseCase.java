package com.paypal.oslo.feature.userprofile.domain.usecase;

@kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005JJ\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000f0\r2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u00062\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\f\u001a\u00020\u000bH\u0086B¢\u0006\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0014\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013"}, d2 = {"Lcom/paypal/oslo/feature/userprofile/domain/usecase/AddPhoneUseCase;", "", "Lcom/paypal/oslo/feature/userprofile/domain/repository/PhoneRepository;", "phoneRepository", "<init>", "(Lcom/paypal/oslo/feature/userprofile/domain/repository/PhoneRepository;)V", "", "countryCode", com.microblink.blinkid.entities.recognizers.blinkid.jordan.JordanCombinedRecognizer.VerificationConstants.NationalNumber, "phoneType", "extensionNumber", "", "refreshUserStore", "Larrow/core/Either;", "Lcom/paypal/oslo/feature/userprofile/domain/model/PhoneError;", "Lcom/paypal/oslo/core/userstore/model/ProfilePhone;", "invoke", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Camera2StreamConfigurationMap", "Lcom/paypal/oslo/feature/userprofile/domain/repository/PhoneRepository;", "getHighResolutionOutputSizeshNQ4ISI"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class AddPhoneUseCase {
    public static final int $stable = 8;

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.userprofile.domain.repository.PhoneRepository getHighResolutionOutputSizeshNQ4ISI;

    @javax.inject.Inject
    public AddPhoneUseCase(com.paypal.oslo.feature.userprofile.domain.repository.PhoneRepository phoneRepository) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(phoneRepository, "");
        this.getHighResolutionOutputSizeshNQ4ISI = phoneRepository;
    }

    public static /* synthetic */ java.lang.Object invoke$default(com.paypal.oslo.feature.userprofile.domain.usecase.AddPhoneUseCase addPhoneUseCase, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, boolean z, kotlin.coroutines.Continuation continuation, int i, java.lang.Object obj) {
        if ((i & 8) != 0) {
            str4 = null;
        }
        java.lang.String str5 = str4;
        if ((i & 16) != 0) {
            z = true;
        }
        return addPhoneUseCase.invoke(str, str2, str3, str5, z, continuation);
    }

    public final java.lang.Object invoke(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, boolean z, kotlin.coroutines.Continuation<? super arrow.core.Either<? extends com.paypal.oslo.feature.userprofile.domain.model.PhoneError, com.paypal.oslo.core.userstore.model.ProfilePhone>> continuation) {
        return this.getHighResolutionOutputSizeshNQ4ISI.addPhone(str, str2, str3, str4, z, continuation);
    }
}
