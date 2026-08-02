package com.paypal.oslo.core.i18n.domain.model;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\r\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000e"}, d2 = {"Lcom/paypal/oslo/core/i18n/domain/model/DateTimePartType;", "", "<init>", "(Ljava/lang/String;I)V", "YEAR", "MONTH", "DAY", "DAY_PERIOD", "WEEKDAY", "HOUR", "MINUTE", "SECOND", "ERA", "ZONE", "LITERAL"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class DateTimePartType {
    public static final com.paypal.oslo.core.i18n.domain.model.DateTimePartType DAY;
    public static final com.paypal.oslo.core.i18n.domain.model.DateTimePartType DAY_PERIOD;
    public static final com.paypal.oslo.core.i18n.domain.model.DateTimePartType ERA;
    public static final com.paypal.oslo.core.i18n.domain.model.DateTimePartType HOUR;
    public static final com.paypal.oslo.core.i18n.domain.model.DateTimePartType LITERAL;
    public static final com.paypal.oslo.core.i18n.domain.model.DateTimePartType MINUTE;
    public static final com.paypal.oslo.core.i18n.domain.model.DateTimePartType MONTH;
    public static final com.paypal.oslo.core.i18n.domain.model.DateTimePartType SECOND;
    public static final com.paypal.oslo.core.i18n.domain.model.DateTimePartType WEEKDAY;
    public static final com.paypal.oslo.core.i18n.domain.model.DateTimePartType YEAR;
    public static final com.paypal.oslo.core.i18n.domain.model.DateTimePartType ZONE;
    private static final /* synthetic */ com.paypal.oslo.core.i18n.domain.model.DateTimePartType[] getHighResolutionOutputSizeshNQ4ISI;
    private static final /* synthetic */ kotlin.enums.EnumEntries getHighSpeedVideoSizes;

    private DateTimePartType(java.lang.String str, int i) {
    }

    static {
        com.paypal.oslo.core.i18n.domain.model.DateTimePartType dateTimePartType = new com.paypal.oslo.core.i18n.domain.model.DateTimePartType("YEAR", 0);
        YEAR = dateTimePartType;
        com.paypal.oslo.core.i18n.domain.model.DateTimePartType dateTimePartType2 = new com.paypal.oslo.core.i18n.domain.model.DateTimePartType("MONTH", 1);
        MONTH = dateTimePartType2;
        com.paypal.oslo.core.i18n.domain.model.DateTimePartType dateTimePartType3 = new com.paypal.oslo.core.i18n.domain.model.DateTimePartType("DAY", 2);
        DAY = dateTimePartType3;
        com.paypal.oslo.core.i18n.domain.model.DateTimePartType dateTimePartType4 = new com.paypal.oslo.core.i18n.domain.model.DateTimePartType("DAY_PERIOD", 3);
        DAY_PERIOD = dateTimePartType4;
        com.paypal.oslo.core.i18n.domain.model.DateTimePartType dateTimePartType5 = new com.paypal.oslo.core.i18n.domain.model.DateTimePartType("WEEKDAY", 4);
        WEEKDAY = dateTimePartType5;
        com.paypal.oslo.core.i18n.domain.model.DateTimePartType dateTimePartType6 = new com.paypal.oslo.core.i18n.domain.model.DateTimePartType("HOUR", 5);
        HOUR = dateTimePartType6;
        com.paypal.oslo.core.i18n.domain.model.DateTimePartType dateTimePartType7 = new com.paypal.oslo.core.i18n.domain.model.DateTimePartType("MINUTE", 6);
        MINUTE = dateTimePartType7;
        com.paypal.oslo.core.i18n.domain.model.DateTimePartType dateTimePartType8 = new com.paypal.oslo.core.i18n.domain.model.DateTimePartType("SECOND", 7);
        SECOND = dateTimePartType8;
        com.paypal.oslo.core.i18n.domain.model.DateTimePartType dateTimePartType9 = new com.paypal.oslo.core.i18n.domain.model.DateTimePartType("ERA", 8);
        ERA = dateTimePartType9;
        com.paypal.oslo.core.i18n.domain.model.DateTimePartType dateTimePartType10 = new com.paypal.oslo.core.i18n.domain.model.DateTimePartType("ZONE", 9);
        ZONE = dateTimePartType10;
        com.paypal.oslo.core.i18n.domain.model.DateTimePartType dateTimePartType11 = new com.paypal.oslo.core.i18n.domain.model.DateTimePartType("LITERAL", 10);
        LITERAL = dateTimePartType11;
        com.paypal.oslo.core.i18n.domain.model.DateTimePartType[] dateTimePartTypeArr = {dateTimePartType, dateTimePartType2, dateTimePartType3, dateTimePartType4, dateTimePartType5, dateTimePartType6, dateTimePartType7, dateTimePartType8, dateTimePartType9, dateTimePartType10, dateTimePartType11};
        getHighResolutionOutputSizeshNQ4ISI = dateTimePartTypeArr;
        getHighSpeedVideoSizes = kotlin.enums.EnumEntriesKt.enumEntries(dateTimePartTypeArr);
    }

    public static com.paypal.oslo.core.i18n.domain.model.DateTimePartType[] values() {
        return (com.paypal.oslo.core.i18n.domain.model.DateTimePartType[]) getHighResolutionOutputSizeshNQ4ISI.clone();
    }

    public static com.paypal.oslo.core.i18n.domain.model.DateTimePartType valueOf(java.lang.String str) {
        return (com.paypal.oslo.core.i18n.domain.model.DateTimePartType) java.lang.Enum.valueOf(com.paypal.oslo.core.i18n.domain.model.DateTimePartType.class, str);
    }

    public static kotlin.enums.EnumEntries<com.paypal.oslo.core.i18n.domain.model.DateTimePartType> getEntries() {
        return getHighSpeedVideoSizes;
    }
}
