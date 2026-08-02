package com.paypal.oslo.feature.userprofile.domain.repository;

@kotlin.Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\b`\u0018\u00002\u00020\u0001J'\u0010\u0007\u001a\u001a\u0012\u0016\u0012\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u00040\u00030\u0002H&¢\u0006\u0004\b\u0007\u0010\bJJ\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u00060\u00102\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\t2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\t2\b\b\u0002\u0010\u000f\u001a\u00020\u000eH¦@¢\u0006\u0004\b\u0012\u0010\u0013JR\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u00060\u00102\u0006\u0010\u0014\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\t2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\t2\b\b\u0002\u0010\u000f\u001a\u00020\u000eH¦@¢\u0006\u0004\b\u0015\u0010\u0016J$\u0010\u0018\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u00170\u00102\u0006\u0010\u0014\u001a\u00020\tH¦@¢\u0006\u0004\b\u0018\u0010\u0019J$\u0010\u001a\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u00170\u00102\u0006\u0010\u0014\u001a\u00020\tH¦@¢\u0006\u0004\b\u001a\u0010\u0019J$\u0010\u001c\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u001b0\u00102\u0006\u0010\u0014\u001a\u00020\tH¦@¢\u0006\u0004\b\u001c\u0010\u0019J4\u0010\u001f\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u001b0\u00102\u0006\u0010\u0014\u001a\u00020\t2\u0006\u0010\u001d\u001a\u00020\t2\u0006\u0010\u001e\u001a\u00020\tH¦@¢\u0006\u0004\b\u001f\u0010 JD\u0010#\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u00060\u00102\u0006\u0010\u0014\u001a\u00020\t2\u0006\u0010\u001d\u001a\u00020\t2\u0006\u0010\u001e\u001a\u00020\t2\u0006\u0010!\u001a\u00020\t2\u0006\u0010\"\u001a\u00020\u000eH¦@¢\u0006\u0004\b#\u0010\u0013À\u0006\u0003"}, d2 = {"Lcom/paypal/oslo/feature/userprofile/domain/repository/PhoneRepository;", "", "Lkotlinx/coroutines/flow/Flow;", "Lcom/paypal/oslo/feature/userprofile/domain/model/DataResult;", "", "Lcom/paypal/oslo/feature/userprofile/domain/ProfileDataItem;", "Lcom/paypal/oslo/core/userstore/model/ProfilePhone;", "getPhones", "()Lkotlinx/coroutines/flow/Flow;", "", "countryCode", com.microblink.blinkid.entities.recognizers.blinkid.jordan.JordanCombinedRecognizer.VerificationConstants.NationalNumber, "phoneType", "extensionNumber", "", "refreshUserStore", "Larrow/core/Either;", "Lcom/paypal/oslo/feature/userprofile/domain/model/PhoneError;", "addPhone", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "phoneId", "replacePhone", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "deletePhone", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "makePrimaryPhone", "Lcom/paypal/oslo/feature/userprofile/domain/model/phone/PhoneConfirmationChallenge;", "initiatePhoneConfirmation", "authId", "challengeId", "reinitiatePhoneConfirmation", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "code", "primary", "verifyPhone"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public interface PhoneRepository {
    java.lang.Object addPhone(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, boolean z, kotlin.coroutines.Continuation<? super arrow.core.Either<? extends com.paypal.oslo.feature.userprofile.domain.model.PhoneError, com.paypal.oslo.core.userstore.model.ProfilePhone>> continuation);

    java.lang.Object deletePhone(java.lang.String str, kotlin.coroutines.Continuation<? super arrow.core.Either<? extends com.paypal.oslo.feature.userprofile.domain.model.PhoneError, kotlin.Unit>> continuation);

    kotlinx.coroutines.flow.Flow<com.paypal.oslo.feature.userprofile.domain.model.DataResult<java.util.List<com.paypal.oslo.feature.userprofile.domain.ProfileDataItem<com.paypal.oslo.core.userstore.model.ProfilePhone>>>> getPhones();

    java.lang.Object initiatePhoneConfirmation(java.lang.String str, kotlin.coroutines.Continuation<? super arrow.core.Either<? extends com.paypal.oslo.feature.userprofile.domain.model.PhoneError, com.paypal.oslo.feature.userprofile.domain.model.phone.PhoneConfirmationChallenge>> continuation);

    java.lang.Object makePrimaryPhone(java.lang.String str, kotlin.coroutines.Continuation<? super arrow.core.Either<? extends com.paypal.oslo.feature.userprofile.domain.model.PhoneError, kotlin.Unit>> continuation);

    java.lang.Object reinitiatePhoneConfirmation(java.lang.String str, java.lang.String str2, java.lang.String str3, kotlin.coroutines.Continuation<? super arrow.core.Either<? extends com.paypal.oslo.feature.userprofile.domain.model.PhoneError, com.paypal.oslo.feature.userprofile.domain.model.phone.PhoneConfirmationChallenge>> continuation);

    java.lang.Object replacePhone(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, boolean z, kotlin.coroutines.Continuation<? super arrow.core.Either<? extends com.paypal.oslo.feature.userprofile.domain.model.PhoneError, com.paypal.oslo.core.userstore.model.ProfilePhone>> continuation);

    java.lang.Object verifyPhone(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, boolean z, kotlin.coroutines.Continuation<? super arrow.core.Either<? extends com.paypal.oslo.feature.userprofile.domain.model.PhoneError, com.paypal.oslo.core.userstore.model.ProfilePhone>> continuation);

    @kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes15.dex */
    public static final class DefaultImpls {
    }

    static /* synthetic */ java.lang.Object addPhone$default(com.paypal.oslo.feature.userprofile.domain.repository.PhoneRepository phoneRepository, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, boolean z, kotlin.coroutines.Continuation continuation, int i, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: addPhone");
        }
        if ((i & 8) != 0) {
            str4 = null;
        }
        java.lang.String str5 = str4;
        if ((i & 16) != 0) {
            z = true;
        }
        return phoneRepository.addPhone(str, str2, str3, str5, z, continuation);
    }

    static /* synthetic */ java.lang.Object replacePhone$default(com.paypal.oslo.feature.userprofile.domain.repository.PhoneRepository phoneRepository, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, boolean z, kotlin.coroutines.Continuation continuation, int i, java.lang.Object obj) {
        if (obj == null) {
            return phoneRepository.replacePhone(str, str2, str3, str4, (i & 16) != 0 ? null : str5, (i & 32) != 0 ? true : z, continuation);
        }
        throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: replacePhone");
    }
}
