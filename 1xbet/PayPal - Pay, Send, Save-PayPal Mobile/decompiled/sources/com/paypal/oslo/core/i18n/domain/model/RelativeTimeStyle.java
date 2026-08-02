package com.paypal.oslo.core.i18n.domain.model;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\b\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\t"}, d2 = {"Lcom/paypal/oslo/core/i18n/domain/model/RelativeTimeStyle;", "", "<init>", "(Ljava/lang/String;I)V", "LONG", "SHORT", "NARROW", "DURATION_LONG", "DURATION_SHORT", "DURATION_NARROW"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class RelativeTimeStyle {
    private static final /* synthetic */ com.paypal.oslo.core.i18n.domain.model.RelativeTimeStyle[] Camera2StreamConfigurationMap;
    public static final com.paypal.oslo.core.i18n.domain.model.RelativeTimeStyle DURATION_LONG;
    public static final com.paypal.oslo.core.i18n.domain.model.RelativeTimeStyle DURATION_NARROW;
    public static final com.paypal.oslo.core.i18n.domain.model.RelativeTimeStyle DURATION_SHORT;
    public static final com.paypal.oslo.core.i18n.domain.model.RelativeTimeStyle LONG;
    public static final com.paypal.oslo.core.i18n.domain.model.RelativeTimeStyle NARROW;
    public static final com.paypal.oslo.core.i18n.domain.model.RelativeTimeStyle SHORT;
    private static final /* synthetic */ kotlin.enums.EnumEntries getHighSpeedVideoFpsRangesFor;

    private RelativeTimeStyle(java.lang.String str, int i) {
    }

    static {
        com.paypal.oslo.core.i18n.domain.model.RelativeTimeStyle relativeTimeStyle = new com.paypal.oslo.core.i18n.domain.model.RelativeTimeStyle("LONG", 0);
        LONG = relativeTimeStyle;
        com.paypal.oslo.core.i18n.domain.model.RelativeTimeStyle relativeTimeStyle2 = new com.paypal.oslo.core.i18n.domain.model.RelativeTimeStyle("SHORT", 1);
        SHORT = relativeTimeStyle2;
        com.paypal.oslo.core.i18n.domain.model.RelativeTimeStyle relativeTimeStyle3 = new com.paypal.oslo.core.i18n.domain.model.RelativeTimeStyle("NARROW", 2);
        NARROW = relativeTimeStyle3;
        com.paypal.oslo.core.i18n.domain.model.RelativeTimeStyle relativeTimeStyle4 = new com.paypal.oslo.core.i18n.domain.model.RelativeTimeStyle("DURATION_LONG", 3);
        DURATION_LONG = relativeTimeStyle4;
        com.paypal.oslo.core.i18n.domain.model.RelativeTimeStyle relativeTimeStyle5 = new com.paypal.oslo.core.i18n.domain.model.RelativeTimeStyle("DURATION_SHORT", 4);
        DURATION_SHORT = relativeTimeStyle5;
        com.paypal.oslo.core.i18n.domain.model.RelativeTimeStyle relativeTimeStyle6 = new com.paypal.oslo.core.i18n.domain.model.RelativeTimeStyle("DURATION_NARROW", 5);
        DURATION_NARROW = relativeTimeStyle6;
        com.paypal.oslo.core.i18n.domain.model.RelativeTimeStyle[] relativeTimeStyleArr = {relativeTimeStyle, relativeTimeStyle2, relativeTimeStyle3, relativeTimeStyle4, relativeTimeStyle5, relativeTimeStyle6};
        Camera2StreamConfigurationMap = relativeTimeStyleArr;
        getHighSpeedVideoFpsRangesFor = kotlin.enums.EnumEntriesKt.enumEntries(relativeTimeStyleArr);
    }

    public static com.paypal.oslo.core.i18n.domain.model.RelativeTimeStyle[] values() {
        return (com.paypal.oslo.core.i18n.domain.model.RelativeTimeStyle[]) Camera2StreamConfigurationMap.clone();
    }

    public static com.paypal.oslo.core.i18n.domain.model.RelativeTimeStyle valueOf(java.lang.String str) {
        return (com.paypal.oslo.core.i18n.domain.model.RelativeTimeStyle) java.lang.Enum.valueOf(com.paypal.oslo.core.i18n.domain.model.RelativeTimeStyle.class, str);
    }

    public static kotlin.enums.EnumEntries<com.paypal.oslo.core.i18n.domain.model.RelativeTimeStyle> getEntries() {
        return getHighSpeedVideoFpsRangesFor;
    }
}
