package com.paypal.oslo.feature.contacts.api;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006"}, d2 = {"Lcom/paypal/oslo/feature/contacts/api/ContactType;", "", "<init>", "(Ljava/lang/String;I)V", "USER", "EXTERNAL_CONTACT", "UNKNOWN"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class ContactType {
    private static final /* synthetic */ com.paypal.oslo.feature.contacts.api.ContactType[] Camera2StreamConfigurationMap;
    public static final com.paypal.oslo.feature.contacts.api.ContactType EXTERNAL_CONTACT;
    public static final com.paypal.oslo.feature.contacts.api.ContactType UNKNOWN;
    public static final com.paypal.oslo.feature.contacts.api.ContactType USER;
    private static final /* synthetic */ kotlin.enums.EnumEntries getHighSpeedVideoSizes;

    private ContactType(java.lang.String str, int i) {
    }

    static {
        com.paypal.oslo.feature.contacts.api.ContactType contactType = new com.paypal.oslo.feature.contacts.api.ContactType("USER", 0);
        USER = contactType;
        com.paypal.oslo.feature.contacts.api.ContactType contactType2 = new com.paypal.oslo.feature.contacts.api.ContactType("EXTERNAL_CONTACT", 1);
        EXTERNAL_CONTACT = contactType2;
        com.paypal.oslo.feature.contacts.api.ContactType contactType3 = new com.paypal.oslo.feature.contacts.api.ContactType("UNKNOWN", 2);
        UNKNOWN = contactType3;
        com.paypal.oslo.feature.contacts.api.ContactType[] contactTypeArr = {contactType, contactType2, contactType3};
        Camera2StreamConfigurationMap = contactTypeArr;
        getHighSpeedVideoSizes = kotlin.enums.EnumEntriesKt.enumEntries(contactTypeArr);
    }

    public static com.paypal.oslo.feature.contacts.api.ContactType[] values() {
        return (com.paypal.oslo.feature.contacts.api.ContactType[]) Camera2StreamConfigurationMap.clone();
    }

    public static com.paypal.oslo.feature.contacts.api.ContactType valueOf(java.lang.String str) {
        return (com.paypal.oslo.feature.contacts.api.ContactType) java.lang.Enum.valueOf(com.paypal.oslo.feature.contacts.api.ContactType.class, str);
    }

    public static kotlin.enums.EnumEntries<com.paypal.oslo.feature.contacts.api.ContactType> getEntries() {
        return getHighSpeedVideoSizes;
    }
}
