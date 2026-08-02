package com.paypal.oslo.feature.identity.userverification.domain.model.request;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0000¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/paypal/oslo/feature/identity/userverification/domain/model/request/PublicCredential$PhoneCredential;", "Lcom/paypal/oslo/feature/onboarding/api/signup/domain/model/InternationalDialingCode;", "toInternationalDialingCode", "(Lcom/paypal/oslo/feature/identity/userverification/domain/model/request/PublicCredential$PhoneCredential;)I"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class VerifyCredentialRequestKt {
    public static final int toInternationalDialingCode(com.paypal.oslo.feature.identity.userverification.domain.model.request.PublicCredential.PhoneCredential phoneCredential) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(phoneCredential, "");
        java.lang.Integer intOrNull = kotlin.text.StringsKt.toIntOrNull(kotlin.text.StringsKt.removePrefix(phoneCredential.getCountryCode(), (java.lang.CharSequence) "+"));
        return com.paypal.oslo.feature.onboarding.api.signup.domain.model.InternationalDialingCode.m15961constructorimpl(intOrNull != null ? intOrNull.intValue() : 1);
    }
}
