package com.paypal.oslo.core.i18n.domain.model;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\b\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\t"}, d2 = {"Lcom/paypal/oslo/core/i18n/domain/model/DateTimeError;", "", "<init>", "(Ljava/lang/String;I)V", "INVALID_PATTERN", "MISSING_TIMEZONE", "INVALID_ISO_DURATION", "METADATA_FETCH_FAILED", "UNKNOWN_ERROR", "PARSE_ERROR"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class DateTimeError {
    private static final /* synthetic */ kotlin.enums.EnumEntries Camera2StreamConfigurationMap;
    public static final com.paypal.oslo.core.i18n.domain.model.DateTimeError INVALID_ISO_DURATION;
    public static final com.paypal.oslo.core.i18n.domain.model.DateTimeError INVALID_PATTERN;
    public static final com.paypal.oslo.core.i18n.domain.model.DateTimeError METADATA_FETCH_FAILED;
    public static final com.paypal.oslo.core.i18n.domain.model.DateTimeError MISSING_TIMEZONE;
    public static final com.paypal.oslo.core.i18n.domain.model.DateTimeError PARSE_ERROR;
    public static final com.paypal.oslo.core.i18n.domain.model.DateTimeError UNKNOWN_ERROR;
    private static final /* synthetic */ com.paypal.oslo.core.i18n.domain.model.DateTimeError[] getHighSpeedVideoFpsRanges;

    private DateTimeError(java.lang.String str, int i) {
    }

    static {
        com.paypal.oslo.core.i18n.domain.model.DateTimeError dateTimeError = new com.paypal.oslo.core.i18n.domain.model.DateTimeError("INVALID_PATTERN", 0);
        INVALID_PATTERN = dateTimeError;
        com.paypal.oslo.core.i18n.domain.model.DateTimeError dateTimeError2 = new com.paypal.oslo.core.i18n.domain.model.DateTimeError("MISSING_TIMEZONE", 1);
        MISSING_TIMEZONE = dateTimeError2;
        com.paypal.oslo.core.i18n.domain.model.DateTimeError dateTimeError3 = new com.paypal.oslo.core.i18n.domain.model.DateTimeError("INVALID_ISO_DURATION", 2);
        INVALID_ISO_DURATION = dateTimeError3;
        com.paypal.oslo.core.i18n.domain.model.DateTimeError dateTimeError4 = new com.paypal.oslo.core.i18n.domain.model.DateTimeError("METADATA_FETCH_FAILED", 3);
        METADATA_FETCH_FAILED = dateTimeError4;
        com.paypal.oslo.core.i18n.domain.model.DateTimeError dateTimeError5 = new com.paypal.oslo.core.i18n.domain.model.DateTimeError("UNKNOWN_ERROR", 4);
        UNKNOWN_ERROR = dateTimeError5;
        com.paypal.oslo.core.i18n.domain.model.DateTimeError dateTimeError6 = new com.paypal.oslo.core.i18n.domain.model.DateTimeError("PARSE_ERROR", 5);
        PARSE_ERROR = dateTimeError6;
        com.paypal.oslo.core.i18n.domain.model.DateTimeError[] dateTimeErrorArr = {dateTimeError, dateTimeError2, dateTimeError3, dateTimeError4, dateTimeError5, dateTimeError6};
        getHighSpeedVideoFpsRanges = dateTimeErrorArr;
        Camera2StreamConfigurationMap = kotlin.enums.EnumEntriesKt.enumEntries(dateTimeErrorArr);
    }

    public static com.paypal.oslo.core.i18n.domain.model.DateTimeError[] values() {
        return (com.paypal.oslo.core.i18n.domain.model.DateTimeError[]) getHighSpeedVideoFpsRanges.clone();
    }

    public static com.paypal.oslo.core.i18n.domain.model.DateTimeError valueOf(java.lang.String str) {
        return (com.paypal.oslo.core.i18n.domain.model.DateTimeError) java.lang.Enum.valueOf(com.paypal.oslo.core.i18n.domain.model.DateTimeError.class, str);
    }

    public static kotlin.enums.EnumEntries<com.paypal.oslo.core.i18n.domain.model.DateTimeError> getEntries() {
        return Camera2StreamConfigurationMap;
    }
}
