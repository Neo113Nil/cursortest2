package com.paypal.oslo.core.i18n.domain.model;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005"}, d2 = {"Lcom/paypal/oslo/core/i18n/domain/model/DocumentType;", "", "<init>", "(Ljava/lang/String;I)V", "TAX_ID", "NATIONAL_ID"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class DocumentType {
    public static final com.paypal.oslo.core.i18n.domain.model.DocumentType NATIONAL_ID;
    public static final com.paypal.oslo.core.i18n.domain.model.DocumentType TAX_ID;
    private static final /* synthetic */ kotlin.enums.EnumEntries getHighResolutionOutputSizeshNQ4ISI;
    private static final /* synthetic */ com.paypal.oslo.core.i18n.domain.model.DocumentType[] getHighSpeedVideoSizes;

    private DocumentType(java.lang.String str, int i) {
    }

    static {
        com.paypal.oslo.core.i18n.domain.model.DocumentType documentType = new com.paypal.oslo.core.i18n.domain.model.DocumentType("TAX_ID", 0);
        TAX_ID = documentType;
        com.paypal.oslo.core.i18n.domain.model.DocumentType documentType2 = new com.paypal.oslo.core.i18n.domain.model.DocumentType("NATIONAL_ID", 1);
        NATIONAL_ID = documentType2;
        com.paypal.oslo.core.i18n.domain.model.DocumentType[] documentTypeArr = {documentType, documentType2};
        getHighSpeedVideoSizes = documentTypeArr;
        getHighResolutionOutputSizeshNQ4ISI = kotlin.enums.EnumEntriesKt.enumEntries(documentTypeArr);
    }

    public static com.paypal.oslo.core.i18n.domain.model.DocumentType[] values() {
        return (com.paypal.oslo.core.i18n.domain.model.DocumentType[]) getHighSpeedVideoSizes.clone();
    }

    public static com.paypal.oslo.core.i18n.domain.model.DocumentType valueOf(java.lang.String str) {
        return (com.paypal.oslo.core.i18n.domain.model.DocumentType) java.lang.Enum.valueOf(com.paypal.oslo.core.i18n.domain.model.DocumentType.class, str);
    }

    public static kotlin.enums.EnumEntries<com.paypal.oslo.core.i18n.domain.model.DocumentType> getEntries() {
        return getHighResolutionOutputSizeshNQ4ISI;
    }
}
