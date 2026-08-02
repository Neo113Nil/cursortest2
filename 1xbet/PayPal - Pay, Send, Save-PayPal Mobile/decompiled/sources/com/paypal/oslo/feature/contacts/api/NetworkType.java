package com.paypal.oslo.feature.contacts.api;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\b\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\t"}, d2 = {"Lcom/paypal/oslo/feature/contacts/api/NetworkType;", "", "<init>", "(Ljava/lang/String;I)V", "P2P", "P2P_SEND_MONEY", "P2P_REQUEST_MONEY", "INVOICING", com.paypal.oslo.feature.cryptocurrency.ui.provisioning.CryptoProvisioningFlowRouter.INTENT_CRYPTO, "UNKNOWN"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class NetworkType {
    public static final com.paypal.oslo.feature.contacts.api.NetworkType CRYPTO;
    public static final com.paypal.oslo.feature.contacts.api.NetworkType INVOICING;
    public static final com.paypal.oslo.feature.contacts.api.NetworkType P2P;
    public static final com.paypal.oslo.feature.contacts.api.NetworkType P2P_REQUEST_MONEY;
    public static final com.paypal.oslo.feature.contacts.api.NetworkType P2P_SEND_MONEY;
    public static final com.paypal.oslo.feature.contacts.api.NetworkType UNKNOWN;
    private static final /* synthetic */ kotlin.enums.EnumEntries getHighSpeedVideoFpsRangesFor;
    private static final /* synthetic */ com.paypal.oslo.feature.contacts.api.NetworkType[] getHighSpeedVideoSizes;

    private NetworkType(java.lang.String str, int i) {
    }

    static {
        com.paypal.oslo.feature.contacts.api.NetworkType networkType = new com.paypal.oslo.feature.contacts.api.NetworkType("P2P", 0);
        P2P = networkType;
        com.paypal.oslo.feature.contacts.api.NetworkType networkType2 = new com.paypal.oslo.feature.contacts.api.NetworkType("P2P_SEND_MONEY", 1);
        P2P_SEND_MONEY = networkType2;
        com.paypal.oslo.feature.contacts.api.NetworkType networkType3 = new com.paypal.oslo.feature.contacts.api.NetworkType("P2P_REQUEST_MONEY", 2);
        P2P_REQUEST_MONEY = networkType3;
        com.paypal.oslo.feature.contacts.api.NetworkType networkType4 = new com.paypal.oslo.feature.contacts.api.NetworkType("INVOICING", 3);
        INVOICING = networkType4;
        com.paypal.oslo.feature.contacts.api.NetworkType networkType5 = new com.paypal.oslo.feature.contacts.api.NetworkType(com.paypal.oslo.feature.cryptocurrency.ui.provisioning.CryptoProvisioningFlowRouter.INTENT_CRYPTO, 4);
        CRYPTO = networkType5;
        com.paypal.oslo.feature.contacts.api.NetworkType networkType6 = new com.paypal.oslo.feature.contacts.api.NetworkType("UNKNOWN", 5);
        UNKNOWN = networkType6;
        com.paypal.oslo.feature.contacts.api.NetworkType[] networkTypeArr = {networkType, networkType2, networkType3, networkType4, networkType5, networkType6};
        getHighSpeedVideoSizes = networkTypeArr;
        getHighSpeedVideoFpsRangesFor = kotlin.enums.EnumEntriesKt.enumEntries(networkTypeArr);
    }

    public static com.paypal.oslo.feature.contacts.api.NetworkType[] values() {
        return (com.paypal.oslo.feature.contacts.api.NetworkType[]) getHighSpeedVideoSizes.clone();
    }

    public static com.paypal.oslo.feature.contacts.api.NetworkType valueOf(java.lang.String str) {
        return (com.paypal.oslo.feature.contacts.api.NetworkType) java.lang.Enum.valueOf(com.paypal.oslo.feature.contacts.api.NetworkType.class, str);
    }

    public static kotlin.enums.EnumEntries<com.paypal.oslo.feature.contacts.api.NetworkType> getEntries() {
        return getHighSpeedVideoFpsRangesFor;
    }
}
