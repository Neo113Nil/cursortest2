package com.paypal.oslo.feature.onboarding.validators.domain;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005"}, d2 = {"Lcom/paypal/oslo/feature/onboarding/validators/domain/ValidationErrorStyle;", "", "<init>", "(Ljava/lang/String;I)V", "NEGATIVE", "NEUTRAL"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class ValidationErrorStyle {
    public static final com.paypal.oslo.feature.onboarding.validators.domain.ValidationErrorStyle NEGATIVE;
    public static final com.paypal.oslo.feature.onboarding.validators.domain.ValidationErrorStyle NEUTRAL;
    private static final /* synthetic */ kotlin.enums.EnumEntries getHighSpeedVideoFpsRanges;
    private static final /* synthetic */ com.paypal.oslo.feature.onboarding.validators.domain.ValidationErrorStyle[] getHighSpeedVideoFpsRangesFor;

    private ValidationErrorStyle(java.lang.String str, int i) {
    }

    static {
        com.paypal.oslo.feature.onboarding.validators.domain.ValidationErrorStyle validationErrorStyle = new com.paypal.oslo.feature.onboarding.validators.domain.ValidationErrorStyle("NEGATIVE", 0);
        NEGATIVE = validationErrorStyle;
        com.paypal.oslo.feature.onboarding.validators.domain.ValidationErrorStyle validationErrorStyle2 = new com.paypal.oslo.feature.onboarding.validators.domain.ValidationErrorStyle("NEUTRAL", 1);
        NEUTRAL = validationErrorStyle2;
        com.paypal.oslo.feature.onboarding.validators.domain.ValidationErrorStyle[] validationErrorStyleArr = {validationErrorStyle, validationErrorStyle2};
        getHighSpeedVideoFpsRangesFor = validationErrorStyleArr;
        getHighSpeedVideoFpsRanges = kotlin.enums.EnumEntriesKt.enumEntries(validationErrorStyleArr);
    }

    public static com.paypal.oslo.feature.onboarding.validators.domain.ValidationErrorStyle[] values() {
        return (com.paypal.oslo.feature.onboarding.validators.domain.ValidationErrorStyle[]) getHighSpeedVideoFpsRangesFor.clone();
    }

    public static com.paypal.oslo.feature.onboarding.validators.domain.ValidationErrorStyle valueOf(java.lang.String str) {
        return (com.paypal.oslo.feature.onboarding.validators.domain.ValidationErrorStyle) java.lang.Enum.valueOf(com.paypal.oslo.feature.onboarding.validators.domain.ValidationErrorStyle.class, str);
    }

    public static kotlin.enums.EnumEntries<com.paypal.oslo.feature.onboarding.validators.domain.ValidationErrorStyle> getEntries() {
        return getHighSpeedVideoFpsRanges;
    }
}
