package com.paypal.oslo.feature.p2p.domain.model;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\b"}, d2 = {"Lcom/paypal/oslo/feature/p2p/domain/model/IdentityDocumentType;", "", "<init>", "(Ljava/lang/String;I)V", "NATIONAL_ID", "PASSPORT_NUMBER", "DRIVERS_LICENSE", "TAX_IDENTIFICATION_NUMBER", "UNKNOWN"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class IdentityDocumentType {
    public static final com.paypal.oslo.feature.p2p.domain.model.IdentityDocumentType DRIVERS_LICENSE;
    public static final com.paypal.oslo.feature.p2p.domain.model.IdentityDocumentType NATIONAL_ID;
    public static final com.paypal.oslo.feature.p2p.domain.model.IdentityDocumentType PASSPORT_NUMBER;
    public static final com.paypal.oslo.feature.p2p.domain.model.IdentityDocumentType TAX_IDENTIFICATION_NUMBER;
    public static final com.paypal.oslo.feature.p2p.domain.model.IdentityDocumentType UNKNOWN;
    private static final /* synthetic */ com.paypal.oslo.feature.p2p.domain.model.IdentityDocumentType[] getHighResolutionOutputSizeshNQ4ISI;
    private static final /* synthetic */ kotlin.enums.EnumEntries getHighSpeedVideoFpsRangesFor;

    private IdentityDocumentType(java.lang.String str, int i) {
    }

    static {
        com.paypal.oslo.feature.p2p.domain.model.IdentityDocumentType identityDocumentType = new com.paypal.oslo.feature.p2p.domain.model.IdentityDocumentType("NATIONAL_ID", 0);
        NATIONAL_ID = identityDocumentType;
        com.paypal.oslo.feature.p2p.domain.model.IdentityDocumentType identityDocumentType2 = new com.paypal.oslo.feature.p2p.domain.model.IdentityDocumentType("PASSPORT_NUMBER", 1);
        PASSPORT_NUMBER = identityDocumentType2;
        com.paypal.oslo.feature.p2p.domain.model.IdentityDocumentType identityDocumentType3 = new com.paypal.oslo.feature.p2p.domain.model.IdentityDocumentType("DRIVERS_LICENSE", 2);
        DRIVERS_LICENSE = identityDocumentType3;
        com.paypal.oslo.feature.p2p.domain.model.IdentityDocumentType identityDocumentType4 = new com.paypal.oslo.feature.p2p.domain.model.IdentityDocumentType("TAX_IDENTIFICATION_NUMBER", 3);
        TAX_IDENTIFICATION_NUMBER = identityDocumentType4;
        com.paypal.oslo.feature.p2p.domain.model.IdentityDocumentType identityDocumentType5 = new com.paypal.oslo.feature.p2p.domain.model.IdentityDocumentType("UNKNOWN", 4);
        UNKNOWN = identityDocumentType5;
        com.paypal.oslo.feature.p2p.domain.model.IdentityDocumentType[] identityDocumentTypeArr = {identityDocumentType, identityDocumentType2, identityDocumentType3, identityDocumentType4, identityDocumentType5};
        getHighResolutionOutputSizeshNQ4ISI = identityDocumentTypeArr;
        getHighSpeedVideoFpsRangesFor = kotlin.enums.EnumEntriesKt.enumEntries(identityDocumentTypeArr);
    }

    public static com.paypal.oslo.feature.p2p.domain.model.IdentityDocumentType[] values() {
        return (com.paypal.oslo.feature.p2p.domain.model.IdentityDocumentType[]) getHighResolutionOutputSizeshNQ4ISI.clone();
    }

    public static com.paypal.oslo.feature.p2p.domain.model.IdentityDocumentType valueOf(java.lang.String str) {
        return (com.paypal.oslo.feature.p2p.domain.model.IdentityDocumentType) java.lang.Enum.valueOf(com.paypal.oslo.feature.p2p.domain.model.IdentityDocumentType.class, str);
    }

    public static kotlin.enums.EnumEntries<com.paypal.oslo.feature.p2p.domain.model.IdentityDocumentType> getEntries() {
        return getHighSpeedVideoFpsRangesFor;
    }
}
