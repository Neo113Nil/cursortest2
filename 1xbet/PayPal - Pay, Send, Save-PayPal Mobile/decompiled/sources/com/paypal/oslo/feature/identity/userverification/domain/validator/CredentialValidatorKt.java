package com.paypal.oslo.feature.identity.userverification.domain.validator;

@kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0000¢\u0006\u0004\b\u0002\u0010\u0003\"\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006"}, d2 = {"Lcom/paypal/oslo/feature/identity/userverification/domain/model/request/PublicCredential;", "", "isValidCredential", "(Lcom/paypal/oslo/feature/identity/userverification/domain/model/request/PublicCredential;)Z", "Lkotlin/ranges/IntRange;", "getHighSpeedVideoSizes", "Lkotlin/ranges/IntRange;", "Camera2StreamConfigurationMap"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class CredentialValidatorKt {
    private static final kotlin.ranges.IntRange getHighSpeedVideoSizes = new kotlin.ranges.IntRange(2, 4);

    public static final boolean isValidCredential(com.paypal.oslo.feature.identity.userverification.domain.model.request.PublicCredential publicCredential) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(publicCredential, "");
        if (!(publicCredential instanceof com.paypal.oslo.feature.identity.userverification.domain.model.request.PublicCredential.EmailCredential)) {
            if (!(publicCredential instanceof com.paypal.oslo.feature.identity.userverification.domain.model.request.PublicCredential.PhoneCredential)) {
                throw new kotlin.NoWhenBranchMatchedException();
            }
            com.paypal.oslo.feature.identity.userverification.domain.model.request.PublicCredential.PhoneCredential phoneCredential = (com.paypal.oslo.feature.identity.userverification.domain.model.request.PublicCredential.PhoneCredential) publicCredential;
            java.lang.String phoneNumber = phoneCredential.getPhoneNumber();
            if (!kotlin.text.StringsKt.isBlank(phoneNumber)) {
                int i = 0;
                while (true) {
                    if (i >= phoneNumber.length()) {
                        break;
                    }
                    if (java.lang.Character.isDigit(phoneNumber.charAt(i))) {
                        java.lang.String countryCode = phoneCredential.getCountryCode();
                        if (kotlin.text.StringsKt.startsWith$default(countryCode, "+", false, 2, (java.lang.Object) null)) {
                            java.lang.String drop = kotlin.text.StringsKt.drop(countryCode, 1);
                            int i2 = 0;
                            while (true) {
                                if (i2 >= drop.length()) {
                                    kotlin.ranges.IntRange intRange = getHighSpeedVideoSizes;
                                    int first = intRange.getFirst();
                                    int last = intRange.getLast();
                                    int length = countryCode.length();
                                    if (first > length || length > last) {
                                        break;
                                    }
                                    return true;
                                }
                                if (!java.lang.Character.isDigit(drop.charAt(i2))) {
                                    break;
                                }
                                i2++;
                            }
                        }
                    } else {
                        i++;
                    }
                }
            }
            return false;
        }
        java.lang.String email = ((com.paypal.oslo.feature.identity.userverification.domain.model.request.PublicCredential.EmailCredential) publicCredential).getEmail();
        return !kotlin.text.StringsKt.isBlank(email) && kotlin.text.StringsKt.contains$default((java.lang.CharSequence) email, (java.lang.CharSequence) "@", false, 2, (java.lang.Object) null);
    }
}
