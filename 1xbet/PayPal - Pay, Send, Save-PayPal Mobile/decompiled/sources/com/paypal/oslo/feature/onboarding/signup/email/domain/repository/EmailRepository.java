package com.paypal.oslo.feature.onboarding.signup.email.domain.repository;

@kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J$\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00042\u0006\u0010\u0003\u001a\u00020\u0002H¦@¢\u0006\u0004\b\u0007\u0010\bJ$\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00042\u0006\u0010\u000b\u001a\u00020\nH¦@¢\u0006\u0004\b\f\u0010\bÀ\u0006\u0003"}, d2 = {"Lcom/paypal/oslo/feature/onboarding/signup/email/domain/repository/EmailRepository;", "", "Lcom/paypal/oslo/feature/onboarding/api/signup/domain/model/Email;", "email", "Larrow/core/Either;", "Lcom/paypal/oslo/feature/onboarding/errorstruct/domain/model/ApiCallError;", "Lcom/paypal/oslo/feature/onboarding/signup/domain/model/ConfirmationState;", "requestCode-E4ilnuY", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "requestCode", "Lcom/paypal/oslo/feature/onboarding/signup/domain/model/OtpCode;", "code", "confirm-LcHNf2w", "confirm"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public interface EmailRepository {
    /* renamed from: confirm-LcHNf2w */
    java.lang.Object mo16340confirmLcHNf2w(java.lang.String str, kotlin.coroutines.Continuation<? super arrow.core.Either<? extends com.paypal.oslo.feature.onboarding.errorstruct.domain.model.ApiCallError, ? extends com.paypal.oslo.feature.onboarding.signup.domain.model.ConfirmationState>> continuation);

    /* renamed from: requestCode-E4ilnuY */
    java.lang.Object mo16341requestCodeE4ilnuY(java.lang.String str, kotlin.coroutines.Continuation<? super arrow.core.Either<? extends com.paypal.oslo.feature.onboarding.errorstruct.domain.model.ApiCallError, ? extends com.paypal.oslo.feature.onboarding.signup.domain.model.ConfirmationState>> continuation);
}
