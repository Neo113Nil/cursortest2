package com.paypal.oslo.feature.taxanddocumentcenter.domain.model;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007"}, d2 = {"Lcom/paypal/oslo/feature/taxanddocumentcenter/domain/model/MenuCardTypeDomain;", "", "<init>", "(Ljava/lang/String;I)V", "TAX_DOCUMENTS", "FILE_TAXES", "ALL_TRANSACTIONS", "CUSTOM_STATEMENT"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class MenuCardTypeDomain {
    public static final com.paypal.oslo.feature.taxanddocumentcenter.domain.model.MenuCardTypeDomain ALL_TRANSACTIONS;
    public static final com.paypal.oslo.feature.taxanddocumentcenter.domain.model.MenuCardTypeDomain CUSTOM_STATEMENT;
    public static final com.paypal.oslo.feature.taxanddocumentcenter.domain.model.MenuCardTypeDomain FILE_TAXES;
    public static final com.paypal.oslo.feature.taxanddocumentcenter.domain.model.MenuCardTypeDomain TAX_DOCUMENTS;
    private static final /* synthetic */ com.paypal.oslo.feature.taxanddocumentcenter.domain.model.MenuCardTypeDomain[] getHighSpeedVideoFpsRangesFor;
    private static final /* synthetic */ kotlin.enums.EnumEntries getHighSpeedVideoSizes;

    private MenuCardTypeDomain(java.lang.String str, int i) {
    }

    static {
        com.paypal.oslo.feature.taxanddocumentcenter.domain.model.MenuCardTypeDomain menuCardTypeDomain = new com.paypal.oslo.feature.taxanddocumentcenter.domain.model.MenuCardTypeDomain("TAX_DOCUMENTS", 0);
        TAX_DOCUMENTS = menuCardTypeDomain;
        com.paypal.oslo.feature.taxanddocumentcenter.domain.model.MenuCardTypeDomain menuCardTypeDomain2 = new com.paypal.oslo.feature.taxanddocumentcenter.domain.model.MenuCardTypeDomain("FILE_TAXES", 1);
        FILE_TAXES = menuCardTypeDomain2;
        com.paypal.oslo.feature.taxanddocumentcenter.domain.model.MenuCardTypeDomain menuCardTypeDomain3 = new com.paypal.oslo.feature.taxanddocumentcenter.domain.model.MenuCardTypeDomain("ALL_TRANSACTIONS", 2);
        ALL_TRANSACTIONS = menuCardTypeDomain3;
        com.paypal.oslo.feature.taxanddocumentcenter.domain.model.MenuCardTypeDomain menuCardTypeDomain4 = new com.paypal.oslo.feature.taxanddocumentcenter.domain.model.MenuCardTypeDomain("CUSTOM_STATEMENT", 3);
        CUSTOM_STATEMENT = menuCardTypeDomain4;
        com.paypal.oslo.feature.taxanddocumentcenter.domain.model.MenuCardTypeDomain[] menuCardTypeDomainArr = {menuCardTypeDomain, menuCardTypeDomain2, menuCardTypeDomain3, menuCardTypeDomain4};
        getHighSpeedVideoFpsRangesFor = menuCardTypeDomainArr;
        getHighSpeedVideoSizes = kotlin.enums.EnumEntriesKt.enumEntries(menuCardTypeDomainArr);
    }

    public static com.paypal.oslo.feature.taxanddocumentcenter.domain.model.MenuCardTypeDomain[] values() {
        return (com.paypal.oslo.feature.taxanddocumentcenter.domain.model.MenuCardTypeDomain[]) getHighSpeedVideoFpsRangesFor.clone();
    }

    public static com.paypal.oslo.feature.taxanddocumentcenter.domain.model.MenuCardTypeDomain valueOf(java.lang.String str) {
        return (com.paypal.oslo.feature.taxanddocumentcenter.domain.model.MenuCardTypeDomain) java.lang.Enum.valueOf(com.paypal.oslo.feature.taxanddocumentcenter.domain.model.MenuCardTypeDomain.class, str);
    }

    public static kotlin.enums.EnumEntries<com.paypal.oslo.feature.taxanddocumentcenter.domain.model.MenuCardTypeDomain> getEntries() {
        return getHighSpeedVideoSizes;
    }
}
