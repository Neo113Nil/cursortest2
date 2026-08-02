package com.paypal.oslo.core.i18n.domain.model;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006"}, d2 = {"Lcom/paypal/oslo/core/i18n/domain/model/NameStyle;", "", "<init>", "(Ljava/lang/String;I)V", "FULL", "INFORMAL", "BUSINESS_INFORMAL"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class NameStyle {
    public static final com.paypal.oslo.core.i18n.domain.model.NameStyle BUSINESS_INFORMAL;
    public static final com.paypal.oslo.core.i18n.domain.model.NameStyle FULL;
    public static final com.paypal.oslo.core.i18n.domain.model.NameStyle INFORMAL;
    private static final /* synthetic */ com.paypal.oslo.core.i18n.domain.model.NameStyle[] getHighSpeedVideoFpsRangesFor;
    private static final /* synthetic */ kotlin.enums.EnumEntries getHighSpeedVideoSizes;

    private NameStyle(java.lang.String str, int i) {
    }

    static {
        com.paypal.oslo.core.i18n.domain.model.NameStyle nameStyle = new com.paypal.oslo.core.i18n.domain.model.NameStyle("FULL", 0);
        FULL = nameStyle;
        com.paypal.oslo.core.i18n.domain.model.NameStyle nameStyle2 = new com.paypal.oslo.core.i18n.domain.model.NameStyle("INFORMAL", 1);
        INFORMAL = nameStyle2;
        com.paypal.oslo.core.i18n.domain.model.NameStyle nameStyle3 = new com.paypal.oslo.core.i18n.domain.model.NameStyle("BUSINESS_INFORMAL", 2);
        BUSINESS_INFORMAL = nameStyle3;
        com.paypal.oslo.core.i18n.domain.model.NameStyle[] nameStyleArr = {nameStyle, nameStyle2, nameStyle3};
        getHighSpeedVideoFpsRangesFor = nameStyleArr;
        getHighSpeedVideoSizes = kotlin.enums.EnumEntriesKt.enumEntries(nameStyleArr);
    }

    public static com.paypal.oslo.core.i18n.domain.model.NameStyle[] values() {
        return (com.paypal.oslo.core.i18n.domain.model.NameStyle[]) getHighSpeedVideoFpsRangesFor.clone();
    }

    public static com.paypal.oslo.core.i18n.domain.model.NameStyle valueOf(java.lang.String str) {
        return (com.paypal.oslo.core.i18n.domain.model.NameStyle) java.lang.Enum.valueOf(com.paypal.oslo.core.i18n.domain.model.NameStyle.class, str);
    }

    public static kotlin.enums.EnumEntries<com.paypal.oslo.core.i18n.domain.model.NameStyle> getEntries() {
        return getHighSpeedVideoSizes;
    }
}
