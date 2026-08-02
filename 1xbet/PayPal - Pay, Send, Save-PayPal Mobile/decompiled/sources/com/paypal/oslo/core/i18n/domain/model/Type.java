package com.paypal.oslo.core.i18n.domain.model;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u000e\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000f"}, d2 = {"Lcom/paypal/oslo/core/i18n/domain/model/Type;", "", "<init>", "(Ljava/lang/String;I)V", "FIXED_LINE", "MOBILE", "FIXED_LINE_OR_MOBILE", "TOLL_FREE", "PREMIUM_RATE", "SHARED_COST", "VOIP", "PERSONAL_NUMBER", "PAGER", "UAN", "VOICEMAIL", "UNKNOWN"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class Type {
    public static final com.paypal.oslo.core.i18n.domain.model.Type FIXED_LINE;
    public static final com.paypal.oslo.core.i18n.domain.model.Type FIXED_LINE_OR_MOBILE;
    public static final com.paypal.oslo.core.i18n.domain.model.Type MOBILE;
    public static final com.paypal.oslo.core.i18n.domain.model.Type PAGER;
    public static final com.paypal.oslo.core.i18n.domain.model.Type PERSONAL_NUMBER;
    public static final com.paypal.oslo.core.i18n.domain.model.Type PREMIUM_RATE;
    public static final com.paypal.oslo.core.i18n.domain.model.Type SHARED_COST;
    public static final com.paypal.oslo.core.i18n.domain.model.Type TOLL_FREE;
    public static final com.paypal.oslo.core.i18n.domain.model.Type UAN;
    public static final com.paypal.oslo.core.i18n.domain.model.Type UNKNOWN;
    public static final com.paypal.oslo.core.i18n.domain.model.Type VOICEMAIL;
    public static final com.paypal.oslo.core.i18n.domain.model.Type VOIP;
    private static final /* synthetic */ kotlin.enums.EnumEntries getHighResolutionOutputSizeshNQ4ISI;
    private static final /* synthetic */ com.paypal.oslo.core.i18n.domain.model.Type[] getHighSpeedVideoFpsRanges;

    private Type(java.lang.String str, int i) {
    }

    static {
        com.paypal.oslo.core.i18n.domain.model.Type type = new com.paypal.oslo.core.i18n.domain.model.Type("FIXED_LINE", 0);
        FIXED_LINE = type;
        com.paypal.oslo.core.i18n.domain.model.Type type2 = new com.paypal.oslo.core.i18n.domain.model.Type("MOBILE", 1);
        MOBILE = type2;
        com.paypal.oslo.core.i18n.domain.model.Type type3 = new com.paypal.oslo.core.i18n.domain.model.Type("FIXED_LINE_OR_MOBILE", 2);
        FIXED_LINE_OR_MOBILE = type3;
        com.paypal.oslo.core.i18n.domain.model.Type type4 = new com.paypal.oslo.core.i18n.domain.model.Type("TOLL_FREE", 3);
        TOLL_FREE = type4;
        com.paypal.oslo.core.i18n.domain.model.Type type5 = new com.paypal.oslo.core.i18n.domain.model.Type("PREMIUM_RATE", 4);
        PREMIUM_RATE = type5;
        com.paypal.oslo.core.i18n.domain.model.Type type6 = new com.paypal.oslo.core.i18n.domain.model.Type("SHARED_COST", 5);
        SHARED_COST = type6;
        com.paypal.oslo.core.i18n.domain.model.Type type7 = new com.paypal.oslo.core.i18n.domain.model.Type("VOIP", 6);
        VOIP = type7;
        com.paypal.oslo.core.i18n.domain.model.Type type8 = new com.paypal.oslo.core.i18n.domain.model.Type("PERSONAL_NUMBER", 7);
        PERSONAL_NUMBER = type8;
        com.paypal.oslo.core.i18n.domain.model.Type type9 = new com.paypal.oslo.core.i18n.domain.model.Type("PAGER", 8);
        PAGER = type9;
        com.paypal.oslo.core.i18n.domain.model.Type type10 = new com.paypal.oslo.core.i18n.domain.model.Type("UAN", 9);
        UAN = type10;
        com.paypal.oslo.core.i18n.domain.model.Type type11 = new com.paypal.oslo.core.i18n.domain.model.Type("VOICEMAIL", 10);
        VOICEMAIL = type11;
        com.paypal.oslo.core.i18n.domain.model.Type type12 = new com.paypal.oslo.core.i18n.domain.model.Type("UNKNOWN", 11);
        UNKNOWN = type12;
        com.paypal.oslo.core.i18n.domain.model.Type[] typeArr = {type, type2, type3, type4, type5, type6, type7, type8, type9, type10, type11, type12};
        getHighSpeedVideoFpsRanges = typeArr;
        getHighResolutionOutputSizeshNQ4ISI = kotlin.enums.EnumEntriesKt.enumEntries(typeArr);
    }

    public static com.paypal.oslo.core.i18n.domain.model.Type[] values() {
        return (com.paypal.oslo.core.i18n.domain.model.Type[]) getHighSpeedVideoFpsRanges.clone();
    }

    public static com.paypal.oslo.core.i18n.domain.model.Type valueOf(java.lang.String str) {
        return (com.paypal.oslo.core.i18n.domain.model.Type) java.lang.Enum.valueOf(com.paypal.oslo.core.i18n.domain.model.Type.class, str);
    }

    public static kotlin.enums.EnumEntries<com.paypal.oslo.core.i18n.domain.model.Type> getEntries() {
        return getHighResolutionOutputSizeshNQ4ISI;
    }
}
