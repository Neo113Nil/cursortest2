package com.paypal.oslo.core.i18n.domain.model;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u000b\b\u0086\u0001\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002B\u0011\b\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u001a\u0010\u0007\u001a\u00020\u00038\u0001X\u0080\u0004¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000e"}, d2 = {"Lcom/paypal/oslo/core/i18n/domain/model/DateMaskStyle;", "Lcom/paypal/oslo/core/i18n/domain/model/DateFormat;", "", "", "p0", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "pattern", "Ljava/lang/String;", "getPattern$i18n_release", "()Ljava/lang/String;", "DATE_SHORT", "DATE_LONG", "BANK_CARD_EXPIRY_SHORT", "BANK_CARD_EXPIRY_LONG"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class DateMaskStyle implements com.paypal.oslo.core.i18n.domain.model.DateFormat {
    public static final com.paypal.oslo.core.i18n.domain.model.DateMaskStyle BANK_CARD_EXPIRY_LONG;
    public static final com.paypal.oslo.core.i18n.domain.model.DateMaskStyle BANK_CARD_EXPIRY_SHORT;
    private static final /* synthetic */ com.paypal.oslo.core.i18n.domain.model.DateMaskStyle[] Camera2StreamConfigurationMap;
    public static final com.paypal.oslo.core.i18n.domain.model.DateMaskStyle DATE_LONG;
    public static final com.paypal.oslo.core.i18n.domain.model.DateMaskStyle DATE_SHORT;
    private static final /* synthetic */ kotlin.enums.EnumEntries getHighSpeedVideoFpsRanges;
    private final java.lang.String pattern;

    private DateMaskStyle(java.lang.String str, int i, java.lang.String str2) {
        this.pattern = str2;
    }

    /* renamed from: getPattern$i18n_release, reason: from getter */
    public final java.lang.String getPattern() {
        return this.pattern;
    }

    static {
        com.paypal.oslo.core.i18n.domain.model.DateMaskStyle dateMaskStyle = new com.paypal.oslo.core.i18n.domain.model.DateMaskStyle("DATE_SHORT", 0, "date-short");
        DATE_SHORT = dateMaskStyle;
        com.paypal.oslo.core.i18n.domain.model.DateMaskStyle dateMaskStyle2 = new com.paypal.oslo.core.i18n.domain.model.DateMaskStyle("DATE_LONG", 1, "date-short");
        DATE_LONG = dateMaskStyle2;
        com.paypal.oslo.core.i18n.domain.model.DateMaskStyle dateMaskStyle3 = new com.paypal.oslo.core.i18n.domain.model.DateMaskStyle("BANK_CARD_EXPIRY_SHORT", 2, "MM/yy");
        BANK_CARD_EXPIRY_SHORT = dateMaskStyle3;
        com.paypal.oslo.core.i18n.domain.model.DateMaskStyle dateMaskStyle4 = new com.paypal.oslo.core.i18n.domain.model.DateMaskStyle("BANK_CARD_EXPIRY_LONG", 3, "MM/yyyy");
        BANK_CARD_EXPIRY_LONG = dateMaskStyle4;
        com.paypal.oslo.core.i18n.domain.model.DateMaskStyle[] dateMaskStyleArr = {dateMaskStyle, dateMaskStyle2, dateMaskStyle3, dateMaskStyle4};
        Camera2StreamConfigurationMap = dateMaskStyleArr;
        getHighSpeedVideoFpsRanges = kotlin.enums.EnumEntriesKt.enumEntries(dateMaskStyleArr);
    }

    public static com.paypal.oslo.core.i18n.domain.model.DateMaskStyle[] values() {
        return (com.paypal.oslo.core.i18n.domain.model.DateMaskStyle[]) Camera2StreamConfigurationMap.clone();
    }

    public static com.paypal.oslo.core.i18n.domain.model.DateMaskStyle valueOf(java.lang.String str) {
        return (com.paypal.oslo.core.i18n.domain.model.DateMaskStyle) java.lang.Enum.valueOf(com.paypal.oslo.core.i18n.domain.model.DateMaskStyle.class, str);
    }

    public static kotlin.enums.EnumEntries<com.paypal.oslo.core.i18n.domain.model.DateMaskStyle> getEntries() {
        return getHighSpeedVideoFpsRanges;
    }
}
