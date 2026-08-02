package com.paypal.oslo.core.i18n.domain.model;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005"}, d2 = {"Lcom/paypal/oslo/core/i18n/domain/model/PersonType;", "", "<init>", "(Ljava/lang/String;I)V", "LEGAL", "ALIAS"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class PersonType {
    public static final com.paypal.oslo.core.i18n.domain.model.PersonType ALIAS;
    public static final com.paypal.oslo.core.i18n.domain.model.PersonType LEGAL;
    private static final /* synthetic */ com.paypal.oslo.core.i18n.domain.model.PersonType[] getHighSpeedVideoFpsRanges;
    private static final /* synthetic */ kotlin.enums.EnumEntries getHighSpeedVideoFpsRangesFor;

    private PersonType(java.lang.String str, int i) {
    }

    static {
        com.paypal.oslo.core.i18n.domain.model.PersonType personType = new com.paypal.oslo.core.i18n.domain.model.PersonType("LEGAL", 0);
        LEGAL = personType;
        com.paypal.oslo.core.i18n.domain.model.PersonType personType2 = new com.paypal.oslo.core.i18n.domain.model.PersonType("ALIAS", 1);
        ALIAS = personType2;
        com.paypal.oslo.core.i18n.domain.model.PersonType[] personTypeArr = {personType, personType2};
        getHighSpeedVideoFpsRanges = personTypeArr;
        getHighSpeedVideoFpsRangesFor = kotlin.enums.EnumEntriesKt.enumEntries(personTypeArr);
    }

    public static com.paypal.oslo.core.i18n.domain.model.PersonType[] values() {
        return (com.paypal.oslo.core.i18n.domain.model.PersonType[]) getHighSpeedVideoFpsRanges.clone();
    }

    public static com.paypal.oslo.core.i18n.domain.model.PersonType valueOf(java.lang.String str) {
        return (com.paypal.oslo.core.i18n.domain.model.PersonType) java.lang.Enum.valueOf(com.paypal.oslo.core.i18n.domain.model.PersonType.class, str);
    }

    public static kotlin.enums.EnumEntries<com.paypal.oslo.core.i18n.domain.model.PersonType> getEntries() {
        return getHighSpeedVideoFpsRangesFor;
    }
}
