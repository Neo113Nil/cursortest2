package com.paypal.oslo.feature.onboarding.signup.email.domain.service;

@kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J$\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00042\u0006\u0010\u0003\u001a\u00020\u0002H¦@¢\u0006\u0004\b\u0007\u0010\bJ\u001c\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H¦@¢\u0006\u0004\b\n\u0010\u000bJ$\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00042\u0006\u0010\r\u001a\u00020\fH¦@¢\u0006\u0004\b\u000e\u0010\bÀ\u0006\u0003"}, d2 = {"Lcom/paypal/oslo/feature/onboarding/signup/email/domain/service/EmailService;", "", "Lcom/paypal/oslo/feature/onboarding/api/signup/domain/model/Email;", "email", "Larrow/core/Either;", "Lcom/paypal/oslo/feature/onboarding/errorstruct/domain/model/ApiCallError;", "Lcom/paypal/oslo/feature/onboarding/signup/domain/model/ValidationResponse;", "initiate-E4ilnuY", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", com.paypal.oslo.feature.debitcard.shared.analytics.PushProvisioningSetupAnalytics.ACTION, com.paypal.oslo.feature.userprofile.api.analytics.UserProfileAnalytics.Actions.RESEND, "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/paypal/oslo/feature/onboarding/signup/domain/model/OtpCode;", "code", "confirm-LcHNf2w", "confirm"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public interface EmailService {
    /* renamed from: confirm-LcHNf2w */
    java.lang.Object mo16281confirmLcHNf2w(java.lang.String str, kotlin.coroutines.Continuation<? super arrow.core.Either<? extends com.paypal.oslo.feature.onboarding.errorstruct.domain.model.ApiCallError, com.paypal.oslo.feature.onboarding.signup.domain.model.ValidationResponse>> continuation);

    /* renamed from: initiate-E4ilnuY */
    java.lang.Object mo16282initiateE4ilnuY(java.lang.String str, kotlin.coroutines.Continuation<? super arrow.core.Either<? extends com.paypal.oslo.feature.onboarding.errorstruct.domain.model.ApiCallError, com.paypal.oslo.feature.onboarding.signup.domain.model.ValidationResponse>> continuation);

    java.lang.Object resend(kotlin.coroutines.Continuation<? super arrow.core.Either<? extends com.paypal.oslo.feature.onboarding.errorstruct.domain.model.ApiCallError, com.paypal.oslo.feature.onboarding.signup.domain.model.ValidationResponse>> continuation);
}
