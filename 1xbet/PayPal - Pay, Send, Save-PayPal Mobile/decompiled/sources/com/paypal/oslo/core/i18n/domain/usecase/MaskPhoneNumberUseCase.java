package com.paypal.oslo.core.i18n.domain.usecase;

@kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J \u0010\b\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0086\u0002¢\u0006\u0004\b\b\u0010\tR\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082D¢\u0006\u0006\n\u0004\b\u000b\u0010\f"}, d2 = {"Lcom/paypal/oslo/core/i18n/domain/usecase/MaskPhoneNumberUseCase;", "", "<init>", "()V", "Lcom/google/i18n/phonenumbers/Phonenumber$PhoneNumber;", "phoneNumber", "", "formattedPhoneNumber", "invoke", "(Lcom/google/i18n/phonenumbers/Phonenumber$PhoneNumber;Ljava/lang/String;)Ljava/lang/String;", "", "getHighSpeedVideoFpsRangesFor", com.visa.cbp.getEncExpo.warmup}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class MaskPhoneNumberUseCase {
    private final int getHighSpeedVideoFpsRangesFor = 3;

    @javax.inject.Inject
    public MaskPhoneNumberUseCase() {
    }

    public final java.lang.String invoke(com.google.i18n.phonenumbers.Phonenumber.PhoneNumber phoneNumber, java.lang.String formattedPhoneNumber) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(phoneNumber, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(formattedPhoneNumber, "");
        boolean isInternationalNumber = com.paypal.oslo.core.i18n.domain.util.PhoneUtilKt.isInternationalNumber(formattedPhoneNumber);
        int length = java.lang.String.valueOf(phoneNumber.getCountryCode()).length();
        java.lang.String str = formattedPhoneNumber;
        int i = 0;
        for (int i2 = 0; i2 < str.length(); i2++) {
            if (java.lang.Character.isDigit(str.charAt(i2))) {
                i++;
            }
        }
        int i3 = isInternationalNumber ? length + 1 : 1;
        int i4 = i - this.getHighSpeedVideoFpsRangesFor;
        if (isInternationalNumber) {
            i4 -= length;
        }
        return com.paypal.oslo.core.i18n.domain.util.PhoneUtilKt.formatObscured(i4, i3, formattedPhoneNumber);
    }
}
