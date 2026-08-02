package com.paypal.oslo.core.i18n.domain.model;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u0010\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0006\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012"}, d2 = {"Lcom/paypal/oslo/core/i18n/domain/model/PhoneNumberError;", "", "", "p0", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "message", "Ljava/lang/String;", "getMessage", "()Ljava/lang/String;", "INVALID_COUNTRY_CODE", "INVALID_PHONE_NUMBER_FOR_REGION", "TOO_SHORT", "TOO_LONG", "INVALID_LENGTH", "METADATA_FETCH_FAILURE", "UNKNOWN_ERROR", "ALPHA_CHARACTER_ERROR", "NOT_IMPLEMENTED"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class PhoneNumberError {
    public static final com.paypal.oslo.core.i18n.domain.model.PhoneNumberError ALPHA_CHARACTER_ERROR;
    private static final /* synthetic */ kotlin.enums.EnumEntries Camera2StreamConfigurationMap;
    public static final com.paypal.oslo.core.i18n.domain.model.PhoneNumberError INVALID_COUNTRY_CODE;
    public static final com.paypal.oslo.core.i18n.domain.model.PhoneNumberError INVALID_LENGTH;
    public static final com.paypal.oslo.core.i18n.domain.model.PhoneNumberError INVALID_PHONE_NUMBER_FOR_REGION;
    public static final com.paypal.oslo.core.i18n.domain.model.PhoneNumberError METADATA_FETCH_FAILURE;
    public static final com.paypal.oslo.core.i18n.domain.model.PhoneNumberError NOT_IMPLEMENTED;
    public static final com.paypal.oslo.core.i18n.domain.model.PhoneNumberError TOO_LONG;
    public static final com.paypal.oslo.core.i18n.domain.model.PhoneNumberError TOO_SHORT;
    public static final com.paypal.oslo.core.i18n.domain.model.PhoneNumberError UNKNOWN_ERROR;
    private static final /* synthetic */ com.paypal.oslo.core.i18n.domain.model.PhoneNumberError[] getHighSpeedVideoFpsRangesFor;
    private final java.lang.String message;

    private PhoneNumberError(java.lang.String str, int i, java.lang.String str2) {
        this.message = str2;
    }

    public final java.lang.String getMessage() {
        return this.message;
    }

    static {
        com.paypal.oslo.core.i18n.domain.model.PhoneNumberError phoneNumberError = new com.paypal.oslo.core.i18n.domain.model.PhoneNumberError("INVALID_COUNTRY_CODE", 0, "The country code supplied did not belong to a supported country or region");
        INVALID_COUNTRY_CODE = phoneNumberError;
        com.paypal.oslo.core.i18n.domain.model.PhoneNumberError phoneNumberError2 = new com.paypal.oslo.core.i18n.domain.model.PhoneNumberError("INVALID_PHONE_NUMBER_FOR_REGION", 1, "The phone number is not valid for the specified region");
        INVALID_PHONE_NUMBER_FOR_REGION = phoneNumberError2;
        com.paypal.oslo.core.i18n.domain.model.PhoneNumberError phoneNumberError3 = new com.paypal.oslo.core.i18n.domain.model.PhoneNumberError("TOO_SHORT", 2, "The phone number is too short");
        TOO_SHORT = phoneNumberError3;
        com.paypal.oslo.core.i18n.domain.model.PhoneNumberError phoneNumberError4 = new com.paypal.oslo.core.i18n.domain.model.PhoneNumberError("TOO_LONG", 3, "The phone number is too long");
        TOO_LONG = phoneNumberError4;
        com.paypal.oslo.core.i18n.domain.model.PhoneNumberError phoneNumberError5 = new com.paypal.oslo.core.i18n.domain.model.PhoneNumberError("INVALID_LENGTH", 4, "The phone number length is invalid for this region");
        INVALID_LENGTH = phoneNumberError5;
        com.paypal.oslo.core.i18n.domain.model.PhoneNumberError phoneNumberError6 = new com.paypal.oslo.core.i18n.domain.model.PhoneNumberError("METADATA_FETCH_FAILURE", 5, "Failed to fetch phone number metadata");
        METADATA_FETCH_FAILURE = phoneNumberError6;
        com.paypal.oslo.core.i18n.domain.model.PhoneNumberError phoneNumberError7 = new com.paypal.oslo.core.i18n.domain.model.PhoneNumberError("UNKNOWN_ERROR", 6, "An unexpected error occurred while processing the phone number");
        UNKNOWN_ERROR = phoneNumberError7;
        com.paypal.oslo.core.i18n.domain.model.PhoneNumberError phoneNumberError8 = new com.paypal.oslo.core.i18n.domain.model.PhoneNumberError("ALPHA_CHARACTER_ERROR", 7, "The phone number contains invalid alphabetic characters");
        ALPHA_CHARACTER_ERROR = phoneNumberError8;
        com.paypal.oslo.core.i18n.domain.model.PhoneNumberError phoneNumberError9 = new com.paypal.oslo.core.i18n.domain.model.PhoneNumberError("NOT_IMPLEMENTED", 8, "Feature not yet implemented");
        NOT_IMPLEMENTED = phoneNumberError9;
        com.paypal.oslo.core.i18n.domain.model.PhoneNumberError[] phoneNumberErrorArr = {phoneNumberError, phoneNumberError2, phoneNumberError3, phoneNumberError4, phoneNumberError5, phoneNumberError6, phoneNumberError7, phoneNumberError8, phoneNumberError9};
        getHighSpeedVideoFpsRangesFor = phoneNumberErrorArr;
        Camera2StreamConfigurationMap = kotlin.enums.EnumEntriesKt.enumEntries(phoneNumberErrorArr);
    }

    public static com.paypal.oslo.core.i18n.domain.model.PhoneNumberError[] values() {
        return (com.paypal.oslo.core.i18n.domain.model.PhoneNumberError[]) getHighSpeedVideoFpsRangesFor.clone();
    }

    public static com.paypal.oslo.core.i18n.domain.model.PhoneNumberError valueOf(java.lang.String str) {
        return (com.paypal.oslo.core.i18n.domain.model.PhoneNumberError) java.lang.Enum.valueOf(com.paypal.oslo.core.i18n.domain.model.PhoneNumberError.class, str);
    }

    public static kotlin.enums.EnumEntries<com.paypal.oslo.core.i18n.domain.model.PhoneNumberError> getEntries() {
        return Camera2StreamConfigurationMap;
    }
}
