package com.paypal.oslo.feature.contacts.api;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005"}, d2 = {"Lcom/paypal/oslo/feature/contacts/api/UnilateralType;", "", "<init>", "(Ljava/lang/String;I)V", "Phone", "Email"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class UnilateralType {
    public static final com.paypal.oslo.feature.contacts.api.UnilateralType Email;
    public static final com.paypal.oslo.feature.contacts.api.UnilateralType Phone;
    private static final /* synthetic */ com.paypal.oslo.feature.contacts.api.UnilateralType[] getHighSpeedVideoFpsRanges;
    private static final /* synthetic */ kotlin.enums.EnumEntries getHighSpeedVideoFpsRangesFor;

    private UnilateralType(java.lang.String str, int i) {
    }

    static {
        com.paypal.oslo.feature.contacts.api.UnilateralType unilateralType = new com.paypal.oslo.feature.contacts.api.UnilateralType("Phone", 0);
        Phone = unilateralType;
        com.paypal.oslo.feature.contacts.api.UnilateralType unilateralType2 = new com.paypal.oslo.feature.contacts.api.UnilateralType("Email", 1);
        Email = unilateralType2;
        com.paypal.oslo.feature.contacts.api.UnilateralType[] unilateralTypeArr = {unilateralType, unilateralType2};
        getHighSpeedVideoFpsRanges = unilateralTypeArr;
        getHighSpeedVideoFpsRangesFor = kotlin.enums.EnumEntriesKt.enumEntries(unilateralTypeArr);
    }

    public static com.paypal.oslo.feature.contacts.api.UnilateralType[] values() {
        return (com.paypal.oslo.feature.contacts.api.UnilateralType[]) getHighSpeedVideoFpsRanges.clone();
    }

    public static com.paypal.oslo.feature.contacts.api.UnilateralType valueOf(java.lang.String str) {
        return (com.paypal.oslo.feature.contacts.api.UnilateralType) java.lang.Enum.valueOf(com.paypal.oslo.feature.contacts.api.UnilateralType.class, str);
    }

    public static kotlin.enums.EnumEntries<com.paypal.oslo.feature.contacts.api.UnilateralType> getEntries() {
        return getHighSpeedVideoFpsRangesFor;
    }
}
