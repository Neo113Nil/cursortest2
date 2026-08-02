package com.paypal.oslo.feature.verificationcapture.domain.model;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\b"}, d2 = {"Lcom/paypal/oslo/feature/verificationcapture/domain/model/DocumentType;", "", "<init>", "(Ljava/lang/String;I)V", com.daon.dmds.utils.face.FaceFinderImpl.PASSPORT_DOCUMENT_CLASS, "DRIVERS_LICENSE", "NATIONAL_ID_CARD", "PROOF_OF_ADDRESS", "UNKNOWN"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class DocumentType {
    public static final com.paypal.oslo.feature.verificationcapture.domain.model.DocumentType DRIVERS_LICENSE;
    public static final com.paypal.oslo.feature.verificationcapture.domain.model.DocumentType NATIONAL_ID_CARD;
    public static final com.paypal.oslo.feature.verificationcapture.domain.model.DocumentType PASSPORT;
    public static final com.paypal.oslo.feature.verificationcapture.domain.model.DocumentType PROOF_OF_ADDRESS;
    public static final com.paypal.oslo.feature.verificationcapture.domain.model.DocumentType UNKNOWN;
    private static final /* synthetic */ kotlin.enums.EnumEntries getHighResolutionOutputSizeshNQ4ISI;
    private static final /* synthetic */ com.paypal.oslo.feature.verificationcapture.domain.model.DocumentType[] getHighSpeedVideoSizes;

    private DocumentType(java.lang.String str, int i) {
    }

    static {
        com.paypal.oslo.feature.verificationcapture.domain.model.DocumentType documentType = new com.paypal.oslo.feature.verificationcapture.domain.model.DocumentType(com.daon.dmds.utils.face.FaceFinderImpl.PASSPORT_DOCUMENT_CLASS, 0);
        PASSPORT = documentType;
        com.paypal.oslo.feature.verificationcapture.domain.model.DocumentType documentType2 = new com.paypal.oslo.feature.verificationcapture.domain.model.DocumentType("DRIVERS_LICENSE", 1);
        DRIVERS_LICENSE = documentType2;
        com.paypal.oslo.feature.verificationcapture.domain.model.DocumentType documentType3 = new com.paypal.oslo.feature.verificationcapture.domain.model.DocumentType("NATIONAL_ID_CARD", 2);
        NATIONAL_ID_CARD = documentType3;
        com.paypal.oslo.feature.verificationcapture.domain.model.DocumentType documentType4 = new com.paypal.oslo.feature.verificationcapture.domain.model.DocumentType("PROOF_OF_ADDRESS", 3);
        PROOF_OF_ADDRESS = documentType4;
        com.paypal.oslo.feature.verificationcapture.domain.model.DocumentType documentType5 = new com.paypal.oslo.feature.verificationcapture.domain.model.DocumentType("UNKNOWN", 4);
        UNKNOWN = documentType5;
        com.paypal.oslo.feature.verificationcapture.domain.model.DocumentType[] documentTypeArr = {documentType, documentType2, documentType3, documentType4, documentType5};
        getHighSpeedVideoSizes = documentTypeArr;
        getHighResolutionOutputSizeshNQ4ISI = kotlin.enums.EnumEntriesKt.enumEntries(documentTypeArr);
    }

    public static com.paypal.oslo.feature.verificationcapture.domain.model.DocumentType[] values() {
        return (com.paypal.oslo.feature.verificationcapture.domain.model.DocumentType[]) getHighSpeedVideoSizes.clone();
    }

    public static com.paypal.oslo.feature.verificationcapture.domain.model.DocumentType valueOf(java.lang.String str) {
        return (com.paypal.oslo.feature.verificationcapture.domain.model.DocumentType) java.lang.Enum.valueOf(com.paypal.oslo.feature.verificationcapture.domain.model.DocumentType.class, str);
    }

    public static kotlin.enums.EnumEntries<com.paypal.oslo.feature.verificationcapture.domain.model.DocumentType> getEntries() {
        return getHighResolutionOutputSizeshNQ4ISI;
    }
}
