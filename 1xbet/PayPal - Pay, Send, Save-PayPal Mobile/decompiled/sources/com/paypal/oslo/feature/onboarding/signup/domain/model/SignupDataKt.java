package com.paypal.oslo.feature.onboarding.signup.domain.model;

@kotlin.Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0019\u0010\u0005\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u0019\u0010\t\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\u0004\u001a\u0019\u0010\f\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\r\u001a\u0019\u0010\u0010\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0004\u001a\u0019\u0010\u0012\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u000e¢\u0006\u0004\b\u0012\u0010\u0004\u001a\u0019\u0010\u0016\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\b\u0015\u0010\u0004\u001a\u0019\u0010\u0019\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0018\u001a\u00020\u0017¢\u0006\u0004\b\u0019\u0010\u001a\u001a\u0019\u0010\u001e\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u001c\u001a\u00020\u001b¢\u0006\u0004\b\u001d\u0010\u0004\u001a\u0019\u0010\"\u001a\u00020\u0000*\u00020\u00002\u0006\u0010 \u001a\u00020\u001f¢\u0006\u0004\b!\u0010\u0004"}, d2 = {"Lcom/paypal/oslo/feature/onboarding/signup/domain/model/SignupData;", "Lcom/paypal/oslo/feature/onboarding/api/signup/domain/model/Email;", "email", "updateEmail-TNt61W4", "(Lcom/paypal/oslo/feature/onboarding/signup/domain/model/SignupData;Ljava/lang/String;)Lcom/paypal/oslo/feature/onboarding/signup/domain/model/SignupData;", "updateEmail", "Lcom/paypal/oslo/feature/onboarding/api/signup/domain/model/PhoneNumber;", "phoneNumber", "updatePhoneNumber-Mo8Xu2s", "updatePhoneNumber", "Lcom/paypal/oslo/feature/onboarding/signup/domain/model/Name;", "name", "updateName", "(Lcom/paypal/oslo/feature/onboarding/signup/domain/model/SignupData;Lcom/paypal/oslo/feature/onboarding/signup/domain/model/Name;)Lcom/paypal/oslo/feature/onboarding/signup/domain/model/SignupData;", "", "firstName", "updateFirstName", "lastName", "updateLastName", "Lcom/paypal/oslo/feature/onboarding/signup/password/domain/model/Password;", "password", "updatePassword-OemDTCI", "updatePassword", "Lcom/paypal/oslo/core/i18n/domain/model/Address;", "address", "updateAddress", "(Lcom/paypal/oslo/feature/onboarding/signup/domain/model/SignupData;Lcom/paypal/oslo/core/i18n/domain/model/Address;)Lcom/paypal/oslo/feature/onboarding/signup/domain/model/SignupData;", "Lcom/paypal/oslo/core/i18n/domain/model/CountryCode;", "countryCode", "updateSignupCountryCode-_ygcFeA", "updateSignupCountryCode", "Lcom/paypal/oslo/feature/onboarding/api/signup/domain/model/GoogleToken;", "googleToken", "updateGoogleToken-MUset20", "updateGoogleToken"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class SignupDataKt {
    /* renamed from: updateEmail-TNt61W4, reason: not valid java name */
    public static final com.paypal.oslo.feature.onboarding.signup.domain.model.SignupData m16323updateEmailTNt61W4(com.paypal.oslo.feature.onboarding.signup.domain.model.SignupData signupData, java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(signupData, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        return com.paypal.oslo.feature.onboarding.signup.domain.model.SignupData.m16313copyEEBeQFU$default(signupData, str, null, null, null, null, null, null, 126, null);
    }

    /* renamed from: updatePhoneNumber-Mo8Xu2s, reason: not valid java name */
    public static final com.paypal.oslo.feature.onboarding.signup.domain.model.SignupData m16326updatePhoneNumberMo8Xu2s(com.paypal.oslo.feature.onboarding.signup.domain.model.SignupData signupData, java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(signupData, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        return com.paypal.oslo.feature.onboarding.signup.domain.model.SignupData.m16313copyEEBeQFU$default(signupData, null, com.paypal.oslo.feature.onboarding.signup.phone.domain.model.Phone.m16392copyBtfQNMQ$default(signupData.getPhone(), str, null, 0, 6, null), null, null, null, null, null, 125, null);
    }

    public static final com.paypal.oslo.feature.onboarding.signup.domain.model.SignupData updateName(com.paypal.oslo.feature.onboarding.signup.domain.model.SignupData signupData, com.paypal.oslo.feature.onboarding.signup.domain.model.Name name2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(signupData, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(name2, "");
        return com.paypal.oslo.feature.onboarding.signup.domain.model.SignupData.m16313copyEEBeQFU$default(signupData, null, null, null, name2, null, null, null, 119, null);
    }

    public static final com.paypal.oslo.feature.onboarding.signup.domain.model.SignupData updateFirstName(com.paypal.oslo.feature.onboarding.signup.domain.model.SignupData signupData, java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(signupData, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        return com.paypal.oslo.feature.onboarding.signup.domain.model.SignupData.m16313copyEEBeQFU$default(signupData, null, null, null, com.paypal.oslo.feature.onboarding.signup.domain.model.Name.m16300copyRV_47s$default(signupData.getName(), com.paypal.oslo.feature.onboarding.api.signup.domain.model.FirstName.m15931constructorimpl(str), null, 2, null), null, null, null, 119, null);
    }

    public static final com.paypal.oslo.feature.onboarding.signup.domain.model.SignupData updateLastName(com.paypal.oslo.feature.onboarding.signup.domain.model.SignupData signupData, java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(signupData, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        return com.paypal.oslo.feature.onboarding.signup.domain.model.SignupData.m16313copyEEBeQFU$default(signupData, null, null, null, com.paypal.oslo.feature.onboarding.signup.domain.model.Name.m16300copyRV_47s$default(signupData.getName(), null, com.paypal.oslo.feature.onboarding.api.signup.domain.model.LastName.m15970constructorimpl(str), 1, null), null, null, null, 119, null);
    }

    /* renamed from: updatePassword-OemDTCI, reason: not valid java name */
    public static final com.paypal.oslo.feature.onboarding.signup.domain.model.SignupData m16325updatePasswordOemDTCI(com.paypal.oslo.feature.onboarding.signup.domain.model.SignupData signupData, java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(signupData, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        return com.paypal.oslo.feature.onboarding.signup.domain.model.SignupData.m16313copyEEBeQFU$default(signupData, null, null, str, null, null, null, null, com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CALENDAR_VALUE, null);
    }

    public static final com.paypal.oslo.feature.onboarding.signup.domain.model.SignupData updateAddress(com.paypal.oslo.feature.onboarding.signup.domain.model.SignupData signupData, com.paypal.oslo.core.i18n.domain.model.Address address) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(signupData, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(address, "");
        return com.paypal.oslo.feature.onboarding.signup.domain.model.SignupData.m16313copyEEBeQFU$default(signupData, null, null, null, null, address, null, null, 111, null);
    }

    /* renamed from: updateSignupCountryCode-_ygcFeA, reason: not valid java name */
    public static final com.paypal.oslo.feature.onboarding.signup.domain.model.SignupData m16327updateSignupCountryCode_ygcFeA(com.paypal.oslo.feature.onboarding.signup.domain.model.SignupData signupData, java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(signupData, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        return com.paypal.oslo.feature.onboarding.signup.domain.model.SignupData.m16313copyEEBeQFU$default(signupData, null, null, null, null, null, str, null, 95, null);
    }

    /* renamed from: updateGoogleToken-MUset20, reason: not valid java name */
    public static final com.paypal.oslo.feature.onboarding.signup.domain.model.SignupData m16324updateGoogleTokenMUset20(com.paypal.oslo.feature.onboarding.signup.domain.model.SignupData signupData, java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(signupData, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        return com.paypal.oslo.feature.onboarding.signup.domain.model.SignupData.m16313copyEEBeQFU$default(signupData, null, null, null, null, null, null, str, 63, null);
    }
}
