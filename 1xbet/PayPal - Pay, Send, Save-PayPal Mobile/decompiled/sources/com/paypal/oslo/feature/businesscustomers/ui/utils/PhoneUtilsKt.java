package com.paypal.oslo.feature.businesscustomers.ui.utils;

@kotlin.Metadata(d1 = {"\u00006\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a#\u0010\u0004\u001a\u0004\u0018\u00010\u00032\b\u0010\u0001\u001a\u0004\u0018\u00010\u00002\u0006\u0010\u0002\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\u0004\u0010\u0005\u001a%\u0010\n\u001a\u0004\u0018\u00010\u00002\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0000¢\u0006\u0004\b\n\u0010\u000b\u001a!\u0010\r\u001a\u00020\f2\b\u0010\u0001\u001a\u0004\u0018\u00010\u00002\u0006\u0010\u0002\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\r\u0010\u000e\u001a#\u0010\u0012\u001a\u0004\u0018\u00010\u00112\b\u0010\u000f\u001a\u0004\u0018\u00010\u00002\u0006\u0010\u0010\u001a\u00020\u0000H\u0002¢\u0006\u0004\b\u0012\u0010\u0013\"\u0019\u0010\u0012\u001a\u0006*\u00020\u00140\u00148CX\u0082\u0084\u0002¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016"}, d2 = {"", "phoneString", "defaultRegion", "Lcom/paypal/oslo/feature/businesscustomers/api/domain/model/CustomerPhoneNumber;", "parseInternationalPhone", "(Ljava/lang/String;Ljava/lang/String;)Lcom/paypal/oslo/feature/businesscustomers/api/domain/model/CustomerPhoneNumber;", "", "callingCountryCode", "", com.microblink.blinkid.entities.recognizers.blinkid.jordan.JordanCombinedRecognizer.VerificationConstants.NationalNumber, "formatNumber", "(Ljava/lang/Integer;Ljava/lang/Long;)Ljava/lang/String;", "", "isValidPhone", "(Ljava/lang/String;Ljava/lang/String;)Z", "p0", "p1", "Lcom/google/i18n/phonenumbers/Phonenumber$PhoneNumber;", "getHighResolutionOutputSizeshNQ4ISI", "(Ljava/lang/String;Ljava/lang/String;)Lcom/google/i18n/phonenumbers/Phonenumber$PhoneNumber;", "Lcom/google/i18n/phonenumbers/PhoneNumberUtil;", "Camera2StreamConfigurationMap", "Lkotlin/Lazy;"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class PhoneUtilsKt {
    private static final kotlin.Lazy Camera2StreamConfigurationMap = kotlin.LazyKt.lazy(new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.businesscustomers.ui.utils.PhoneUtilsKt$$ExternalSyntheticLambda0
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            com.google.i18n.phonenumbers.PhoneNumberUtil phoneNumberUtil;
            phoneNumberUtil = com.google.i18n.phonenumbers.PhoneNumberUtil.getInstance();
            return phoneNumberUtil;
        }
    });

    public static final com.paypal.oslo.feature.businesscustomers.api.domain.model.CustomerPhoneNumber parseInternationalPhone(java.lang.String str, java.lang.String str2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
        com.google.i18n.phonenumbers.Phonenumber.PhoneNumber highResolutionOutputSizeshNQ4ISI = getHighResolutionOutputSizeshNQ4ISI(str, str2);
        if (highResolutionOutputSizeshNQ4ISI == null) {
            return null;
        }
        int countryCode = highResolutionOutputSizeshNQ4ISI.getCountryCode();
        long nationalNumber = highResolutionOutputSizeshNQ4ISI.getNationalNumber();
        return new com.paypal.oslo.feature.businesscustomers.api.domain.model.CustomerPhoneNumber(java.lang.String.valueOf(countryCode), java.lang.String.valueOf(nationalNumber), com.paypal.oslo.feature.businesscustomers.api.domain.model.PhoneType.MOBILE);
    }

    public static final java.lang.String formatNumber(java.lang.Integer num, java.lang.Long l) {
        if (num != null && l != null) {
            com.google.i18n.phonenumbers.Phonenumber.PhoneNumber nationalNumber = new com.google.i18n.phonenumbers.Phonenumber.PhoneNumber().setCountryCode(num.intValue()).setNationalNumber(l.longValue());
            kotlin.Lazy lazy = Camera2StreamConfigurationMap;
            if ((((com.google.i18n.phonenumbers.PhoneNumberUtil) lazy.getValue()).isValidNumber(nationalNumber) ? nationalNumber : null) != null) {
                return ((com.google.i18n.phonenumbers.PhoneNumberUtil) lazy.getValue()).format(nationalNumber, com.google.i18n.phonenumbers.PhoneNumberUtil.PhoneNumberFormat.INTERNATIONAL);
            }
        }
        return null;
    }

    public static final boolean isValidPhone(java.lang.String str, java.lang.String str2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
        return getHighResolutionOutputSizeshNQ4ISI(str, str2) != null;
    }

    private static final com.google.i18n.phonenumbers.Phonenumber.PhoneNumber getHighResolutionOutputSizeshNQ4ISI(java.lang.String str, java.lang.String str2) {
        java.lang.Object m23436constructorimpl;
        java.lang.String str3 = str;
        if (str3 == null || kotlin.text.StringsKt.isBlank(str3)) {
            return null;
        }
        try {
            kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
            m23436constructorimpl = kotlin.Result.m23436constructorimpl(((com.google.i18n.phonenumbers.PhoneNumberUtil) Camera2StreamConfigurationMap.getValue()).parse(str, str2));
        } catch (java.lang.Throwable th) {
            kotlin.Result.Companion companion2 = kotlin.Result.INSTANCE;
            m23436constructorimpl = kotlin.Result.m23436constructorimpl(kotlin.ResultKt.createFailure(th));
        }
        java.lang.Throwable m23439exceptionOrNullimpl = kotlin.Result.m23439exceptionOrNullimpl(m23436constructorimpl);
        if (m23439exceptionOrNullimpl != null) {
            com.paypal.oslo.feature.businesscustomers.LoggerKt.log.e("Failed to parse phone number", m23439exceptionOrNullimpl);
        }
        if (kotlin.Result.m23441isFailureimpl(m23436constructorimpl)) {
            m23436constructorimpl = null;
        }
        com.google.i18n.phonenumbers.Phonenumber.PhoneNumber phoneNumber = (com.google.i18n.phonenumbers.Phonenumber.PhoneNumber) m23436constructorimpl;
        if (phoneNumber == null || !((com.google.i18n.phonenumbers.PhoneNumberUtil) Camera2StreamConfigurationMap.getValue()).isValidNumber(phoneNumber)) {
            return null;
        }
        return phoneNumber;
    }
}
