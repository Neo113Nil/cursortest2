package com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005"}, d2 = {"Lcom/paypal/oslo/feature/taxanddocumentcenter/domain/model/taxdocuments/SheetTypeDomain;", "", "<init>", "(Ljava/lang/String;I)V", "RECON", "MULTI_SAVING"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class SheetTypeDomain {
    private static final /* synthetic */ kotlin.enums.EnumEntries Camera2StreamConfigurationMap;
    public static final com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments.SheetTypeDomain MULTI_SAVING;
    public static final com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments.SheetTypeDomain RECON;
    private static final /* synthetic */ com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments.SheetTypeDomain[] getHighSpeedVideoFpsRangesFor;

    private SheetTypeDomain(java.lang.String str, int i) {
    }

    static {
        com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments.SheetTypeDomain sheetTypeDomain = new com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments.SheetTypeDomain("RECON", 0);
        RECON = sheetTypeDomain;
        com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments.SheetTypeDomain sheetTypeDomain2 = new com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments.SheetTypeDomain("MULTI_SAVING", 1);
        MULTI_SAVING = sheetTypeDomain2;
        com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments.SheetTypeDomain[] sheetTypeDomainArr = {sheetTypeDomain, sheetTypeDomain2};
        getHighSpeedVideoFpsRangesFor = sheetTypeDomainArr;
        Camera2StreamConfigurationMap = kotlin.enums.EnumEntriesKt.enumEntries(sheetTypeDomainArr);
    }

    public static com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments.SheetTypeDomain[] values() {
        return (com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments.SheetTypeDomain[]) getHighSpeedVideoFpsRangesFor.clone();
    }

    public static com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments.SheetTypeDomain valueOf(java.lang.String str) {
        return (com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments.SheetTypeDomain) java.lang.Enum.valueOf(com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments.SheetTypeDomain.class, str);
    }

    public static kotlin.enums.EnumEntries<com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments.SheetTypeDomain> getEntries() {
        return Camera2StreamConfigurationMap;
    }
}
