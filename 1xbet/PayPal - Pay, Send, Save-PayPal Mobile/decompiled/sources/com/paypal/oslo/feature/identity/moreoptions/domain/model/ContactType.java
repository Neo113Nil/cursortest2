package com.paypal.oslo.feature.identity.moreoptions.domain.model;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0080\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005"}, d2 = {"Lcom/paypal/oslo/feature/identity/moreoptions/domain/model/ContactType;", "", "<init>", "(Ljava/lang/String;I)V", "EMAIL", "PHONE"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class ContactType {
    public static final com.paypal.oslo.feature.identity.moreoptions.domain.model.ContactType EMAIL;
    public static final com.paypal.oslo.feature.identity.moreoptions.domain.model.ContactType PHONE;
    private static final /* synthetic */ com.paypal.oslo.feature.identity.moreoptions.domain.model.ContactType[] getHighResolutionOutputSizeshNQ4ISI;
    private static final /* synthetic */ kotlin.enums.EnumEntries getHighSpeedVideoFpsRangesFor;

    private ContactType(java.lang.String str, int i) {
    }

    static {
        com.paypal.oslo.feature.identity.moreoptions.domain.model.ContactType contactType = new com.paypal.oslo.feature.identity.moreoptions.domain.model.ContactType("EMAIL", 0);
        EMAIL = contactType;
        com.paypal.oslo.feature.identity.moreoptions.domain.model.ContactType contactType2 = new com.paypal.oslo.feature.identity.moreoptions.domain.model.ContactType("PHONE", 1);
        PHONE = contactType2;
        com.paypal.oslo.feature.identity.moreoptions.domain.model.ContactType[] contactTypeArr = {contactType, contactType2};
        getHighResolutionOutputSizeshNQ4ISI = contactTypeArr;
        getHighSpeedVideoFpsRangesFor = kotlin.enums.EnumEntriesKt.enumEntries(contactTypeArr);
    }

    public static com.paypal.oslo.feature.identity.moreoptions.domain.model.ContactType[] values() {
        return (com.paypal.oslo.feature.identity.moreoptions.domain.model.ContactType[]) getHighResolutionOutputSizeshNQ4ISI.clone();
    }

    public static com.paypal.oslo.feature.identity.moreoptions.domain.model.ContactType valueOf(java.lang.String str) {
        return (com.paypal.oslo.feature.identity.moreoptions.domain.model.ContactType) java.lang.Enum.valueOf(com.paypal.oslo.feature.identity.moreoptions.domain.model.ContactType.class, str);
    }

    public static kotlin.enums.EnumEntries<com.paypal.oslo.feature.identity.moreoptions.domain.model.ContactType> getEntries() {
        return getHighSpeedVideoFpsRangesFor;
    }
}
