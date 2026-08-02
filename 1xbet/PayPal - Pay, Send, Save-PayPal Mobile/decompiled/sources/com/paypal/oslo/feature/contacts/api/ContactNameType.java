package com.paypal.oslo.feature.contacts.api;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005"}, d2 = {"Lcom/paypal/oslo/feature/contacts/api/ContactNameType;", "", "<init>", "(Ljava/lang/String;I)V", "BUSINESS", "PERSON"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class ContactNameType {
    public static final com.paypal.oslo.feature.contacts.api.ContactNameType BUSINESS;
    private static final /* synthetic */ com.paypal.oslo.feature.contacts.api.ContactNameType[] Camera2StreamConfigurationMap;
    public static final com.paypal.oslo.feature.contacts.api.ContactNameType PERSON;
    private static final /* synthetic */ kotlin.enums.EnumEntries getHighResolutionOutputSizeshNQ4ISI;

    private ContactNameType(java.lang.String str, int i) {
    }

    static {
        com.paypal.oslo.feature.contacts.api.ContactNameType contactNameType = new com.paypal.oslo.feature.contacts.api.ContactNameType("BUSINESS", 0);
        BUSINESS = contactNameType;
        com.paypal.oslo.feature.contacts.api.ContactNameType contactNameType2 = new com.paypal.oslo.feature.contacts.api.ContactNameType("PERSON", 1);
        PERSON = contactNameType2;
        com.paypal.oslo.feature.contacts.api.ContactNameType[] contactNameTypeArr = {contactNameType, contactNameType2};
        Camera2StreamConfigurationMap = contactNameTypeArr;
        getHighResolutionOutputSizeshNQ4ISI = kotlin.enums.EnumEntriesKt.enumEntries(contactNameTypeArr);
    }

    public static com.paypal.oslo.feature.contacts.api.ContactNameType[] values() {
        return (com.paypal.oslo.feature.contacts.api.ContactNameType[]) Camera2StreamConfigurationMap.clone();
    }

    public static com.paypal.oslo.feature.contacts.api.ContactNameType valueOf(java.lang.String str) {
        return (com.paypal.oslo.feature.contacts.api.ContactNameType) java.lang.Enum.valueOf(com.paypal.oslo.feature.contacts.api.ContactNameType.class, str);
    }

    public static kotlin.enums.EnumEntries<com.paypal.oslo.feature.contacts.api.ContactNameType> getEntries() {
        return getHighResolutionOutputSizeshNQ4ISI;
    }
}
