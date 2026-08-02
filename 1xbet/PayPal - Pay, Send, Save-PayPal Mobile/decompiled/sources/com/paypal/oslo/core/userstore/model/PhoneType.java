package com.paypal.oslo.core.userstore.model;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0013\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014"}, d2 = {"Lcom/paypal/oslo/core/userstore/model/PhoneType;", "", "<init>", "(Ljava/lang/String;I)V", "MAIN", "WORK", "OTHER", "CUSTOMER_SERVICE", "FAX", "NONE", "HOME", "MOBILE", "RELATIVE_OR_FRIEND", "VALIDATED_SESSION", "BUSINESS", "WAX", "UPS", "VERISIGN_BILLING", "FAX_VERISIGN_BILLING", "FAX_HOME", "FAX_BUSINESS"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class PhoneType {
    public static final com.paypal.oslo.core.userstore.model.PhoneType BUSINESS;
    public static final com.paypal.oslo.core.userstore.model.PhoneType CUSTOMER_SERVICE;
    public static final com.paypal.oslo.core.userstore.model.PhoneType FAX;
    public static final com.paypal.oslo.core.userstore.model.PhoneType FAX_BUSINESS;
    public static final com.paypal.oslo.core.userstore.model.PhoneType FAX_HOME;
    public static final com.paypal.oslo.core.userstore.model.PhoneType FAX_VERISIGN_BILLING;
    public static final com.paypal.oslo.core.userstore.model.PhoneType HOME;
    public static final com.paypal.oslo.core.userstore.model.PhoneType MAIN;
    public static final com.paypal.oslo.core.userstore.model.PhoneType MOBILE;
    public static final com.paypal.oslo.core.userstore.model.PhoneType NONE;
    public static final com.paypal.oslo.core.userstore.model.PhoneType OTHER;
    public static final com.paypal.oslo.core.userstore.model.PhoneType RELATIVE_OR_FRIEND;
    public static final com.paypal.oslo.core.userstore.model.PhoneType UPS;
    public static final com.paypal.oslo.core.userstore.model.PhoneType VALIDATED_SESSION;
    public static final com.paypal.oslo.core.userstore.model.PhoneType VERISIGN_BILLING;
    public static final com.paypal.oslo.core.userstore.model.PhoneType WAX;
    public static final com.paypal.oslo.core.userstore.model.PhoneType WORK;
    private static final /* synthetic */ com.paypal.oslo.core.userstore.model.PhoneType[] getHighSpeedVideoFpsRanges;
    private static final /* synthetic */ kotlin.enums.EnumEntries getHighSpeedVideoFpsRangesFor;

    private PhoneType(java.lang.String str, int i) {
    }

    static {
        com.paypal.oslo.core.userstore.model.PhoneType phoneType = new com.paypal.oslo.core.userstore.model.PhoneType("MAIN", 0);
        MAIN = phoneType;
        com.paypal.oslo.core.userstore.model.PhoneType phoneType2 = new com.paypal.oslo.core.userstore.model.PhoneType("WORK", 1);
        WORK = phoneType2;
        com.paypal.oslo.core.userstore.model.PhoneType phoneType3 = new com.paypal.oslo.core.userstore.model.PhoneType("OTHER", 2);
        OTHER = phoneType3;
        com.paypal.oslo.core.userstore.model.PhoneType phoneType4 = new com.paypal.oslo.core.userstore.model.PhoneType("CUSTOMER_SERVICE", 3);
        CUSTOMER_SERVICE = phoneType4;
        com.paypal.oslo.core.userstore.model.PhoneType phoneType5 = new com.paypal.oslo.core.userstore.model.PhoneType("FAX", 4);
        FAX = phoneType5;
        com.paypal.oslo.core.userstore.model.PhoneType phoneType6 = new com.paypal.oslo.core.userstore.model.PhoneType("NONE", 5);
        NONE = phoneType6;
        com.paypal.oslo.core.userstore.model.PhoneType phoneType7 = new com.paypal.oslo.core.userstore.model.PhoneType("HOME", 6);
        HOME = phoneType7;
        com.paypal.oslo.core.userstore.model.PhoneType phoneType8 = new com.paypal.oslo.core.userstore.model.PhoneType("MOBILE", 7);
        MOBILE = phoneType8;
        com.paypal.oslo.core.userstore.model.PhoneType phoneType9 = new com.paypal.oslo.core.userstore.model.PhoneType("RELATIVE_OR_FRIEND", 8);
        RELATIVE_OR_FRIEND = phoneType9;
        com.paypal.oslo.core.userstore.model.PhoneType phoneType10 = new com.paypal.oslo.core.userstore.model.PhoneType("VALIDATED_SESSION", 9);
        VALIDATED_SESSION = phoneType10;
        com.paypal.oslo.core.userstore.model.PhoneType phoneType11 = new com.paypal.oslo.core.userstore.model.PhoneType("BUSINESS", 10);
        BUSINESS = phoneType11;
        com.paypal.oslo.core.userstore.model.PhoneType phoneType12 = new com.paypal.oslo.core.userstore.model.PhoneType("WAX", 11);
        WAX = phoneType12;
        com.paypal.oslo.core.userstore.model.PhoneType phoneType13 = new com.paypal.oslo.core.userstore.model.PhoneType("UPS", 12);
        UPS = phoneType13;
        com.paypal.oslo.core.userstore.model.PhoneType phoneType14 = new com.paypal.oslo.core.userstore.model.PhoneType("VERISIGN_BILLING", 13);
        VERISIGN_BILLING = phoneType14;
        com.paypal.oslo.core.userstore.model.PhoneType phoneType15 = new com.paypal.oslo.core.userstore.model.PhoneType("FAX_VERISIGN_BILLING", 14);
        FAX_VERISIGN_BILLING = phoneType15;
        com.paypal.oslo.core.userstore.model.PhoneType phoneType16 = new com.paypal.oslo.core.userstore.model.PhoneType("FAX_HOME", 15);
        FAX_HOME = phoneType16;
        com.paypal.oslo.core.userstore.model.PhoneType phoneType17 = new com.paypal.oslo.core.userstore.model.PhoneType("FAX_BUSINESS", 16);
        FAX_BUSINESS = phoneType17;
        com.paypal.oslo.core.userstore.model.PhoneType[] phoneTypeArr = {phoneType, phoneType2, phoneType3, phoneType4, phoneType5, phoneType6, phoneType7, phoneType8, phoneType9, phoneType10, phoneType11, phoneType12, phoneType13, phoneType14, phoneType15, phoneType16, phoneType17};
        getHighSpeedVideoFpsRanges = phoneTypeArr;
        getHighSpeedVideoFpsRangesFor = kotlin.enums.EnumEntriesKt.enumEntries(phoneTypeArr);
    }

    public static com.paypal.oslo.core.userstore.model.PhoneType[] values() {
        return (com.paypal.oslo.core.userstore.model.PhoneType[]) getHighSpeedVideoFpsRanges.clone();
    }

    public static com.paypal.oslo.core.userstore.model.PhoneType valueOf(java.lang.String str) {
        return (com.paypal.oslo.core.userstore.model.PhoneType) java.lang.Enum.valueOf(com.paypal.oslo.core.userstore.model.PhoneType.class, str);
    }

    public static kotlin.enums.EnumEntries<com.paypal.oslo.core.userstore.model.PhoneType> getEntries() {
        return getHighSpeedVideoFpsRangesFor;
    }
}
