package com.paypal.oslo.feature.onboarding.signup.domain.repository;

@kotlin.Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u0017\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\u000b\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\bH&¢\u0006\u0004\b\n\u0010\u0006J\u0017\u0010\u000e\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\fH&¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0012\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u0010H&¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0017\u001a\u00020\u00042\u0006\u0010\u0015\u001a\u00020\u0014H&¢\u0006\u0004\b\u0016\u0010\u0006J\u0017\u0010\u001b\u001a\u00020\u00042\u0006\u0010\u0019\u001a\u00020\u0018H&¢\u0006\u0004\b\u001a\u0010\u0006J\u000f\u0010\u001d\u001a\u00020\u001cH&¢\u0006\u0004\b\u001d\u0010\u001eJ\u000f\u0010\u001f\u001a\u00020\u0004H&¢\u0006\u0004\b\u001f\u0010 R\u001a\u0010$\u001a\b\u0012\u0004\u0012\u00020\u001c0!8'X¦\u0004¢\u0006\u0006\u001a\u0004\b\"\u0010#À\u0006\u0003"}, d2 = {"Lcom/paypal/oslo/feature/onboarding/signup/domain/repository/SignupDataRepository;", "", "Lcom/paypal/oslo/feature/onboarding/api/signup/domain/model/PhoneNumber;", "phone", "", "updatePhoneNumber-EzAuIyE", "(Ljava/lang/String;)V", "updatePhoneNumber", "Lcom/paypal/oslo/feature/onboarding/api/signup/domain/model/Email;", "email", "updateEmail-RQoNrjY", "updateEmail", "Lcom/paypal/oslo/feature/onboarding/signup/domain/model/Name;", "name", "updateName", "(Lcom/paypal/oslo/feature/onboarding/signup/domain/model/Name;)V", "Lcom/paypal/oslo/core/i18n/domain/model/Address;", "address", "updateAddress", "(Lcom/paypal/oslo/core/i18n/domain/model/Address;)V", "Lcom/paypal/oslo/feature/onboarding/signup/password/domain/model/Password;", "password", "updatePassword-0q9jJwI", "updatePassword", "Lcom/paypal/oslo/feature/onboarding/api/signup/domain/model/GoogleToken;", "googleToken", "updateGoogleToken-d-_PDoU", "updateGoogleToken", "Lcom/paypal/oslo/feature/onboarding/signup/domain/model/SignupData;", "getCurrentSignupState", "()Lcom/paypal/oslo/feature/onboarding/signup/domain/model/SignupData;", "clearSignupData", "()V", "Lkotlinx/coroutines/flow/StateFlow;", "getSignupData", "()Lkotlinx/coroutines/flow/StateFlow;", "signupData"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public interface SignupDataRepository {
    void clearSignupData();

    com.paypal.oslo.feature.onboarding.signup.domain.model.SignupData getCurrentSignupState();

    kotlinx.coroutines.flow.StateFlow<com.paypal.oslo.feature.onboarding.signup.domain.model.SignupData> getSignupData();

    void updateAddress(com.paypal.oslo.core.i18n.domain.model.Address address);

    /* renamed from: updateEmail-RQoNrjY */
    void mo16269updateEmailRQoNrjY(java.lang.String email);

    /* renamed from: updateGoogleToken-d-_PDoU */
    void mo16270updateGoogleTokend_PDoU(java.lang.String googleToken);

    void updateName(com.paypal.oslo.feature.onboarding.signup.domain.model.Name name2);

    /* renamed from: updatePassword-0q9jJwI */
    void mo16271updatePassword0q9jJwI(java.lang.String password);

    /* renamed from: updatePhoneNumber-EzAuIyE */
    void mo16272updatePhoneNumberEzAuIyE(java.lang.String phone);
}
