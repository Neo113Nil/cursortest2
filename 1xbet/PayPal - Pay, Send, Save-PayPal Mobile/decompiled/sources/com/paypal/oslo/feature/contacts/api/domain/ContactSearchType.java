package com.paypal.oslo.feature.contacts.api.domain;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005"}, d2 = {"Lcom/paypal/oslo/feature/contacts/api/domain/ContactSearchType;", "", "<init>", "(Ljava/lang/String;I)V", "CONTACTS", "DIRECTORY"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class ContactSearchType {
    public static final com.paypal.oslo.feature.contacts.api.domain.ContactSearchType CONTACTS;
    public static final com.paypal.oslo.feature.contacts.api.domain.ContactSearchType DIRECTORY;
    private static final /* synthetic */ com.paypal.oslo.feature.contacts.api.domain.ContactSearchType[] getHighSpeedVideoFpsRanges;
    private static final /* synthetic */ kotlin.enums.EnumEntries getHighSpeedVideoFpsRangesFor;

    private ContactSearchType(java.lang.String str, int i) {
    }

    static {
        com.paypal.oslo.feature.contacts.api.domain.ContactSearchType contactSearchType = new com.paypal.oslo.feature.contacts.api.domain.ContactSearchType("CONTACTS", 0);
        CONTACTS = contactSearchType;
        com.paypal.oslo.feature.contacts.api.domain.ContactSearchType contactSearchType2 = new com.paypal.oslo.feature.contacts.api.domain.ContactSearchType("DIRECTORY", 1);
        DIRECTORY = contactSearchType2;
        com.paypal.oslo.feature.contacts.api.domain.ContactSearchType[] contactSearchTypeArr = {contactSearchType, contactSearchType2};
        getHighSpeedVideoFpsRanges = contactSearchTypeArr;
        getHighSpeedVideoFpsRangesFor = kotlin.enums.EnumEntriesKt.enumEntries(contactSearchTypeArr);
    }

    public static com.paypal.oslo.feature.contacts.api.domain.ContactSearchType[] values() {
        return (com.paypal.oslo.feature.contacts.api.domain.ContactSearchType[]) getHighSpeedVideoFpsRanges.clone();
    }

    public static com.paypal.oslo.feature.contacts.api.domain.ContactSearchType valueOf(java.lang.String str) {
        return (com.paypal.oslo.feature.contacts.api.domain.ContactSearchType) java.lang.Enum.valueOf(com.paypal.oslo.feature.contacts.api.domain.ContactSearchType.class, str);
    }

    public static kotlin.enums.EnumEntries<com.paypal.oslo.feature.contacts.api.domain.ContactSearchType> getEntries() {
        return getHighSpeedVideoFpsRangesFor;
    }
}
