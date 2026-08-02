package com.paypal.oslo.feature.contacts.api;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005"}, d2 = {"Lcom/paypal/oslo/feature/contacts/api/ContactActionType;", "", "<init>", "(Ljava/lang/String;I)V", "Delete", "Info"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class ContactActionType {
    private static final /* synthetic */ kotlin.enums.EnumEntries Camera2StreamConfigurationMap;
    public static final com.paypal.oslo.feature.contacts.api.ContactActionType Delete;
    public static final com.paypal.oslo.feature.contacts.api.ContactActionType Info;
    private static final /* synthetic */ com.paypal.oslo.feature.contacts.api.ContactActionType[] getHighResolutionOutputSizeshNQ4ISI;

    private ContactActionType(java.lang.String str, int i) {
    }

    static {
        com.paypal.oslo.feature.contacts.api.ContactActionType contactActionType = new com.paypal.oslo.feature.contacts.api.ContactActionType("Delete", 0);
        Delete = contactActionType;
        com.paypal.oslo.feature.contacts.api.ContactActionType contactActionType2 = new com.paypal.oslo.feature.contacts.api.ContactActionType("Info", 1);
        Info = contactActionType2;
        com.paypal.oslo.feature.contacts.api.ContactActionType[] contactActionTypeArr = {contactActionType, contactActionType2};
        getHighResolutionOutputSizeshNQ4ISI = contactActionTypeArr;
        Camera2StreamConfigurationMap = kotlin.enums.EnumEntriesKt.enumEntries(contactActionTypeArr);
    }

    public static com.paypal.oslo.feature.contacts.api.ContactActionType[] values() {
        return (com.paypal.oslo.feature.contacts.api.ContactActionType[]) getHighResolutionOutputSizeshNQ4ISI.clone();
    }

    public static com.paypal.oslo.feature.contacts.api.ContactActionType valueOf(java.lang.String str) {
        return (com.paypal.oslo.feature.contacts.api.ContactActionType) java.lang.Enum.valueOf(com.paypal.oslo.feature.contacts.api.ContactActionType.class, str);
    }

    public static kotlin.enums.EnumEntries<com.paypal.oslo.feature.contacts.api.ContactActionType> getEntries() {
        return Camera2StreamConfigurationMap;
    }
}
