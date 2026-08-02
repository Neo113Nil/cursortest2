package com.paypal.oslo.feature.contacts.api;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005"}, d2 = {"Lcom/paypal/oslo/feature/contacts/api/ContactSearchNetworkType;", "", "<init>", "(Ljava/lang/String;I)V", com.paypal.oslo.feature.p2p.ui.transfer.TransferScreenKt.IntentActionSend, com.paypal.oslo.feature.p2p.ui.transfer.TransferScreenKt.IntentActionRequest}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class ContactSearchNetworkType {
    public static final com.paypal.oslo.feature.contacts.api.ContactSearchNetworkType REQUEST;
    public static final com.paypal.oslo.feature.contacts.api.ContactSearchNetworkType SEND;
    private static final /* synthetic */ com.paypal.oslo.feature.contacts.api.ContactSearchNetworkType[] getHighResolutionOutputSizeshNQ4ISI;
    private static final /* synthetic */ kotlin.enums.EnumEntries getHighSpeedVideoFpsRanges;

    private ContactSearchNetworkType(java.lang.String str, int i) {
    }

    static {
        com.paypal.oslo.feature.contacts.api.ContactSearchNetworkType contactSearchNetworkType = new com.paypal.oslo.feature.contacts.api.ContactSearchNetworkType(com.paypal.oslo.feature.p2p.ui.transfer.TransferScreenKt.IntentActionSend, 0);
        SEND = contactSearchNetworkType;
        com.paypal.oslo.feature.contacts.api.ContactSearchNetworkType contactSearchNetworkType2 = new com.paypal.oslo.feature.contacts.api.ContactSearchNetworkType(com.paypal.oslo.feature.p2p.ui.transfer.TransferScreenKt.IntentActionRequest, 1);
        REQUEST = contactSearchNetworkType2;
        com.paypal.oslo.feature.contacts.api.ContactSearchNetworkType[] contactSearchNetworkTypeArr = {contactSearchNetworkType, contactSearchNetworkType2};
        getHighResolutionOutputSizeshNQ4ISI = contactSearchNetworkTypeArr;
        getHighSpeedVideoFpsRanges = kotlin.enums.EnumEntriesKt.enumEntries(contactSearchNetworkTypeArr);
    }

    public static com.paypal.oslo.feature.contacts.api.ContactSearchNetworkType[] values() {
        return (com.paypal.oslo.feature.contacts.api.ContactSearchNetworkType[]) getHighResolutionOutputSizeshNQ4ISI.clone();
    }

    public static com.paypal.oslo.feature.contacts.api.ContactSearchNetworkType valueOf(java.lang.String str) {
        return (com.paypal.oslo.feature.contacts.api.ContactSearchNetworkType) java.lang.Enum.valueOf(com.paypal.oslo.feature.contacts.api.ContactSearchNetworkType.class, str);
    }

    public static kotlin.enums.EnumEntries<com.paypal.oslo.feature.contacts.api.ContactSearchNetworkType> getEntries() {
        return getHighSpeedVideoFpsRanges;
    }
}
