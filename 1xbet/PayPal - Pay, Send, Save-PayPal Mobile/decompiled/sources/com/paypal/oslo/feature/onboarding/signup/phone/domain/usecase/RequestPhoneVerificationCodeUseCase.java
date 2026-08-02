package com.paypal.oslo.feature.onboarding.signup.phone.domain.usecase;

@kotlin.Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J4\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e0\f2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH\u0086B¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0014\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013"}, d2 = {"Lcom/paypal/oslo/feature/onboarding/signup/phone/domain/usecase/RequestPhoneVerificationCodeUseCase;", "", "Lcom/paypal/oslo/feature/onboarding/signup/phone/domain/repository/PhoneRepository;", "phoneRepository", "<init>", "(Lcom/paypal/oslo/feature/onboarding/signup/phone/domain/repository/PhoneRepository;)V", "Lcom/paypal/oslo/feature/onboarding/signup/phone/domain/model/Phone;", "phone", "Lcom/paypal/oslo/core/i18n/domain/model/CountryCode;", "signupCountryCode", "Lcom/paypal/oslo/feature/onboarding/signup/phone/domain/model/PhoneConfirmationDetails;", "phoneConfirmationDetails", "Larrow/core/Either;", "Lcom/paypal/oslo/feature/onboarding/errorstruct/domain/model/ApiCallError;", "Lcom/paypal/oslo/feature/onboarding/signup/domain/model/ConfirmationState;", "invoke-AttygxE", "(Lcom/paypal/oslo/feature/onboarding/signup/phone/domain/model/Phone;Ljava/lang/String;Lcom/paypal/oslo/feature/onboarding/signup/phone/domain/model/PhoneConfirmationDetails;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "invoke", "getHighSpeedVideoFpsRangesFor", "Lcom/paypal/oslo/feature/onboarding/signup/phone/domain/repository/PhoneRepository;", "getHighResolutionOutputSizeshNQ4ISI"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class RequestPhoneVerificationCodeUseCase {
    public static final int $stable = 8;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.onboarding.signup.phone.domain.repository.PhoneRepository getHighResolutionOutputSizeshNQ4ISI;

    @javax.inject.Inject
    public RequestPhoneVerificationCodeUseCase(com.paypal.oslo.feature.onboarding.signup.phone.domain.repository.PhoneRepository phoneRepository) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(phoneRepository, "");
        this.getHighResolutionOutputSizeshNQ4ISI = phoneRepository;
    }

    /* renamed from: invoke-AttygxE, reason: not valid java name */
    public final java.lang.Object m16405invokeAttygxE(com.paypal.oslo.feature.onboarding.signup.phone.domain.model.Phone phone, java.lang.String str, com.paypal.oslo.feature.onboarding.signup.phone.domain.model.PhoneConfirmationDetails phoneConfirmationDetails, kotlin.coroutines.Continuation<? super arrow.core.Either<? extends com.paypal.oslo.feature.onboarding.errorstruct.domain.model.ApiCallError, ? extends com.paypal.oslo.feature.onboarding.signup.domain.model.ConfirmationState>> continuation) {
        return this.getHighResolutionOutputSizeshNQ4ISI.mo16390requestCodeAttygxE(phone, str, phoneConfirmationDetails, continuation);
    }
}
