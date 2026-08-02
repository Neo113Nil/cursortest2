package com.paypal.oslo.core.i18n.domain.model;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u0017\b\u0086\u0001\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002B\u0011\b\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u001a\u0010\u0007\u001a\u00020\u00038\u0001X\u0080\u0004¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017j\u0002\b\u0018j\u0002\b\u0019j\u0002\b\u001a"}, d2 = {"Lcom/paypal/oslo/core/i18n/domain/model/DateTimeStyle;", "Lcom/paypal/oslo/core/i18n/domain/model/DateFormat;", "", "", "p0", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "pattern", "Ljava/lang/String;", "getPattern$i18n_release", "()Ljava/lang/String;", "DATE_SHORT", "DATE_MEDIUM", "DATE_LONG", "DATE_FULL", "TIME_SHORT", "TIME_MEDIUM", "TIME_LONG", "TIME_FULL", "DATETIME_SHORT", "DATETIME_MEDIUM", "DATETIME_LONG", "DATETIME_FULL", "TIMEZONE_SHORT", "TIMEZONE_MEDIUM", "TIMEZONE_LONG", "BANK_CARD_EXPIRY"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class DateTimeStyle implements com.paypal.oslo.core.i18n.domain.model.DateFormat {
    public static final com.paypal.oslo.core.i18n.domain.model.DateTimeStyle BANK_CARD_EXPIRY;
    private static final /* synthetic */ com.paypal.oslo.core.i18n.domain.model.DateTimeStyle[] Camera2StreamConfigurationMap;
    public static final com.paypal.oslo.core.i18n.domain.model.DateTimeStyle DATETIME_FULL;
    public static final com.paypal.oslo.core.i18n.domain.model.DateTimeStyle DATETIME_LONG;
    public static final com.paypal.oslo.core.i18n.domain.model.DateTimeStyle DATETIME_MEDIUM;
    public static final com.paypal.oslo.core.i18n.domain.model.DateTimeStyle DATETIME_SHORT;
    public static final com.paypal.oslo.core.i18n.domain.model.DateTimeStyle DATE_FULL;
    public static final com.paypal.oslo.core.i18n.domain.model.DateTimeStyle DATE_LONG;
    public static final com.paypal.oslo.core.i18n.domain.model.DateTimeStyle DATE_MEDIUM;
    public static final com.paypal.oslo.core.i18n.domain.model.DateTimeStyle DATE_SHORT;
    public static final com.paypal.oslo.core.i18n.domain.model.DateTimeStyle TIMEZONE_LONG;
    public static final com.paypal.oslo.core.i18n.domain.model.DateTimeStyle TIMEZONE_MEDIUM;
    public static final com.paypal.oslo.core.i18n.domain.model.DateTimeStyle TIMEZONE_SHORT;
    public static final com.paypal.oslo.core.i18n.domain.model.DateTimeStyle TIME_FULL;
    public static final com.paypal.oslo.core.i18n.domain.model.DateTimeStyle TIME_LONG;
    public static final com.paypal.oslo.core.i18n.domain.model.DateTimeStyle TIME_MEDIUM;
    public static final com.paypal.oslo.core.i18n.domain.model.DateTimeStyle TIME_SHORT;
    private static final /* synthetic */ kotlin.enums.EnumEntries getHighSpeedVideoFpsRanges;
    private final java.lang.String pattern;

    private DateTimeStyle(java.lang.String str, int i, java.lang.String str2) {
        this.pattern = str2;
    }

    /* renamed from: getPattern$i18n_release, reason: from getter */
    public final java.lang.String getPattern() {
        return this.pattern;
    }

    static {
        com.paypal.oslo.core.i18n.domain.model.DateTimeStyle dateTimeStyle = new com.paypal.oslo.core.i18n.domain.model.DateTimeStyle("DATE_SHORT", 0, "date-short");
        DATE_SHORT = dateTimeStyle;
        com.paypal.oslo.core.i18n.domain.model.DateTimeStyle dateTimeStyle2 = new com.paypal.oslo.core.i18n.domain.model.DateTimeStyle("DATE_MEDIUM", 1, "date-medium");
        DATE_MEDIUM = dateTimeStyle2;
        com.paypal.oslo.core.i18n.domain.model.DateTimeStyle dateTimeStyle3 = new com.paypal.oslo.core.i18n.domain.model.DateTimeStyle("DATE_LONG", 2, "date-long");
        DATE_LONG = dateTimeStyle3;
        com.paypal.oslo.core.i18n.domain.model.DateTimeStyle dateTimeStyle4 = new com.paypal.oslo.core.i18n.domain.model.DateTimeStyle("DATE_FULL", 3, "date-full");
        DATE_FULL = dateTimeStyle4;
        com.paypal.oslo.core.i18n.domain.model.DateTimeStyle dateTimeStyle5 = new com.paypal.oslo.core.i18n.domain.model.DateTimeStyle("TIME_SHORT", 4, "time-short");
        TIME_SHORT = dateTimeStyle5;
        com.paypal.oslo.core.i18n.domain.model.DateTimeStyle dateTimeStyle6 = new com.paypal.oslo.core.i18n.domain.model.DateTimeStyle("TIME_MEDIUM", 5, "time-medium");
        TIME_MEDIUM = dateTimeStyle6;
        com.paypal.oslo.core.i18n.domain.model.DateTimeStyle dateTimeStyle7 = new com.paypal.oslo.core.i18n.domain.model.DateTimeStyle("TIME_LONG", 6, "time-long");
        TIME_LONG = dateTimeStyle7;
        com.paypal.oslo.core.i18n.domain.model.DateTimeStyle dateTimeStyle8 = new com.paypal.oslo.core.i18n.domain.model.DateTimeStyle("TIME_FULL", 7, "time-full");
        TIME_FULL = dateTimeStyle8;
        com.paypal.oslo.core.i18n.domain.model.DateTimeStyle dateTimeStyle9 = new com.paypal.oslo.core.i18n.domain.model.DateTimeStyle("DATETIME_SHORT", 8, "datetime-short");
        DATETIME_SHORT = dateTimeStyle9;
        com.paypal.oslo.core.i18n.domain.model.DateTimeStyle dateTimeStyle10 = new com.paypal.oslo.core.i18n.domain.model.DateTimeStyle("DATETIME_MEDIUM", 9, "datetime-medium");
        DATETIME_MEDIUM = dateTimeStyle10;
        com.paypal.oslo.core.i18n.domain.model.DateTimeStyle dateTimeStyle11 = new com.paypal.oslo.core.i18n.domain.model.DateTimeStyle("DATETIME_LONG", 10, "datetime-long");
        DATETIME_LONG = dateTimeStyle11;
        com.paypal.oslo.core.i18n.domain.model.DateTimeStyle dateTimeStyle12 = new com.paypal.oslo.core.i18n.domain.model.DateTimeStyle("DATETIME_FULL", 11, "datetime-full");
        DATETIME_FULL = dateTimeStyle12;
        com.paypal.oslo.core.i18n.domain.model.DateTimeStyle dateTimeStyle13 = new com.paypal.oslo.core.i18n.domain.model.DateTimeStyle("TIMEZONE_SHORT", 12, "(OOOO) v");
        TIMEZONE_SHORT = dateTimeStyle13;
        com.paypal.oslo.core.i18n.domain.model.DateTimeStyle dateTimeStyle14 = new com.paypal.oslo.core.i18n.domain.model.DateTimeStyle("TIMEZONE_MEDIUM", 13, "(OOOO) vvvv");
        TIMEZONE_MEDIUM = dateTimeStyle14;
        com.paypal.oslo.core.i18n.domain.model.DateTimeStyle dateTimeStyle15 = new com.paypal.oslo.core.i18n.domain.model.DateTimeStyle("TIMEZONE_LONG", 14, "(OOOO) vvvv (VVV)");
        TIMEZONE_LONG = dateTimeStyle15;
        com.paypal.oslo.core.i18n.domain.model.DateTimeStyle dateTimeStyle16 = new com.paypal.oslo.core.i18n.domain.model.DateTimeStyle("BANK_CARD_EXPIRY", 15, "MM/yy");
        BANK_CARD_EXPIRY = dateTimeStyle16;
        com.paypal.oslo.core.i18n.domain.model.DateTimeStyle[] dateTimeStyleArr = {dateTimeStyle, dateTimeStyle2, dateTimeStyle3, dateTimeStyle4, dateTimeStyle5, dateTimeStyle6, dateTimeStyle7, dateTimeStyle8, dateTimeStyle9, dateTimeStyle10, dateTimeStyle11, dateTimeStyle12, dateTimeStyle13, dateTimeStyle14, dateTimeStyle15, dateTimeStyle16};
        Camera2StreamConfigurationMap = dateTimeStyleArr;
        getHighSpeedVideoFpsRanges = kotlin.enums.EnumEntriesKt.enumEntries(dateTimeStyleArr);
    }

    public static com.paypal.oslo.core.i18n.domain.model.DateTimeStyle[] values() {
        return (com.paypal.oslo.core.i18n.domain.model.DateTimeStyle[]) Camera2StreamConfigurationMap.clone();
    }

    public static com.paypal.oslo.core.i18n.domain.model.DateTimeStyle valueOf(java.lang.String str) {
        return (com.paypal.oslo.core.i18n.domain.model.DateTimeStyle) java.lang.Enum.valueOf(com.paypal.oslo.core.i18n.domain.model.DateTimeStyle.class, str);
    }

    public static kotlin.enums.EnumEntries<com.paypal.oslo.core.i18n.domain.model.DateTimeStyle> getEntries() {
        return getHighSpeedVideoFpsRanges;
    }
}
