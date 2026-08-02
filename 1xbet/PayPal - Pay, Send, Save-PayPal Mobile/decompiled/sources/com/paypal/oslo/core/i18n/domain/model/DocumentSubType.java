package com.paypal.oslo.core.i18n.domain.model;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\n\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000b"}, d2 = {"Lcom/paypal/oslo/core/i18n/domain/model/DocumentSubType;", "", "<init>", "(Ljava/lang/String;I)V", "VAT_ID", "SSN", "SSN4", "TIN", "ITIN", "STEUERNUMMER", "CNPJ", "CURP_ID"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class DocumentSubType {
    public static final com.paypal.oslo.core.i18n.domain.model.DocumentSubType CNPJ;
    public static final com.paypal.oslo.core.i18n.domain.model.DocumentSubType CURP_ID;
    public static final com.paypal.oslo.core.i18n.domain.model.DocumentSubType ITIN;
    public static final com.paypal.oslo.core.i18n.domain.model.DocumentSubType SSN;
    public static final com.paypal.oslo.core.i18n.domain.model.DocumentSubType SSN4;
    public static final com.paypal.oslo.core.i18n.domain.model.DocumentSubType STEUERNUMMER;
    public static final com.paypal.oslo.core.i18n.domain.model.DocumentSubType TIN;
    public static final com.paypal.oslo.core.i18n.domain.model.DocumentSubType VAT_ID;
    private static final /* synthetic */ com.paypal.oslo.core.i18n.domain.model.DocumentSubType[] getHighResolutionOutputSizeshNQ4ISI;
    private static final /* synthetic */ kotlin.enums.EnumEntries getHighSpeedVideoFpsRangesFor;

    private DocumentSubType(java.lang.String str, int i) {
    }

    static {
        com.paypal.oslo.core.i18n.domain.model.DocumentSubType documentSubType = new com.paypal.oslo.core.i18n.domain.model.DocumentSubType("VAT_ID", 0);
        VAT_ID = documentSubType;
        com.paypal.oslo.core.i18n.domain.model.DocumentSubType documentSubType2 = new com.paypal.oslo.core.i18n.domain.model.DocumentSubType("SSN", 1);
        SSN = documentSubType2;
        com.paypal.oslo.core.i18n.domain.model.DocumentSubType documentSubType3 = new com.paypal.oslo.core.i18n.domain.model.DocumentSubType("SSN4", 2);
        SSN4 = documentSubType3;
        com.paypal.oslo.core.i18n.domain.model.DocumentSubType documentSubType4 = new com.paypal.oslo.core.i18n.domain.model.DocumentSubType("TIN", 3);
        TIN = documentSubType4;
        com.paypal.oslo.core.i18n.domain.model.DocumentSubType documentSubType5 = new com.paypal.oslo.core.i18n.domain.model.DocumentSubType("ITIN", 4);
        ITIN = documentSubType5;
        com.paypal.oslo.core.i18n.domain.model.DocumentSubType documentSubType6 = new com.paypal.oslo.core.i18n.domain.model.DocumentSubType("STEUERNUMMER", 5);
        STEUERNUMMER = documentSubType6;
        com.paypal.oslo.core.i18n.domain.model.DocumentSubType documentSubType7 = new com.paypal.oslo.core.i18n.domain.model.DocumentSubType("CNPJ", 6);
        CNPJ = documentSubType7;
        com.paypal.oslo.core.i18n.domain.model.DocumentSubType documentSubType8 = new com.paypal.oslo.core.i18n.domain.model.DocumentSubType("CURP_ID", 7);
        CURP_ID = documentSubType8;
        com.paypal.oslo.core.i18n.domain.model.DocumentSubType[] documentSubTypeArr = {documentSubType, documentSubType2, documentSubType3, documentSubType4, documentSubType5, documentSubType6, documentSubType7, documentSubType8};
        getHighResolutionOutputSizeshNQ4ISI = documentSubTypeArr;
        getHighSpeedVideoFpsRangesFor = kotlin.enums.EnumEntriesKt.enumEntries(documentSubTypeArr);
    }

    public static com.paypal.oslo.core.i18n.domain.model.DocumentSubType[] values() {
        return (com.paypal.oslo.core.i18n.domain.model.DocumentSubType[]) getHighResolutionOutputSizeshNQ4ISI.clone();
    }

    public static com.paypal.oslo.core.i18n.domain.model.DocumentSubType valueOf(java.lang.String str) {
        return (com.paypal.oslo.core.i18n.domain.model.DocumentSubType) java.lang.Enum.valueOf(com.paypal.oslo.core.i18n.domain.model.DocumentSubType.class, str);
    }

    public static kotlin.enums.EnumEntries<com.paypal.oslo.core.i18n.domain.model.DocumentSubType> getEntries() {
        return getHighSpeedVideoFpsRangesFor;
    }
}
