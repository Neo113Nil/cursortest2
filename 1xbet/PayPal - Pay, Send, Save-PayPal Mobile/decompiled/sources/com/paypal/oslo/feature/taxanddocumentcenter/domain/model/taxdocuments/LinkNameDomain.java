package com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007"}, d2 = {"Lcom/paypal/oslo/feature/taxanddocumentcenter/domain/model/taxdocuments/LinkNameDomain;", "", "<init>", "(Ljava/lang/String;I)V", "REQUEST_TRANSACTION_STATEMENT", "NOT_NOW", "REQUEST_STATEMENT", "SELF_CORRECTION_1099K"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class LinkNameDomain {
    public static final com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments.LinkNameDomain NOT_NOW;
    public static final com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments.LinkNameDomain REQUEST_STATEMENT;
    public static final com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments.LinkNameDomain REQUEST_TRANSACTION_STATEMENT;
    public static final com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments.LinkNameDomain SELF_CORRECTION_1099K;
    private static final /* synthetic */ kotlin.enums.EnumEntries getHighResolutionOutputSizeshNQ4ISI;
    private static final /* synthetic */ com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments.LinkNameDomain[] getHighSpeedVideoFpsRangesFor;

    private LinkNameDomain(java.lang.String str, int i) {
    }

    static {
        com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments.LinkNameDomain linkNameDomain = new com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments.LinkNameDomain("REQUEST_TRANSACTION_STATEMENT", 0);
        REQUEST_TRANSACTION_STATEMENT = linkNameDomain;
        com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments.LinkNameDomain linkNameDomain2 = new com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments.LinkNameDomain("NOT_NOW", 1);
        NOT_NOW = linkNameDomain2;
        com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments.LinkNameDomain linkNameDomain3 = new com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments.LinkNameDomain("REQUEST_STATEMENT", 2);
        REQUEST_STATEMENT = linkNameDomain3;
        com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments.LinkNameDomain linkNameDomain4 = new com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments.LinkNameDomain("SELF_CORRECTION_1099K", 3);
        SELF_CORRECTION_1099K = linkNameDomain4;
        com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments.LinkNameDomain[] linkNameDomainArr = {linkNameDomain, linkNameDomain2, linkNameDomain3, linkNameDomain4};
        getHighSpeedVideoFpsRangesFor = linkNameDomainArr;
        getHighResolutionOutputSizeshNQ4ISI = kotlin.enums.EnumEntriesKt.enumEntries(linkNameDomainArr);
    }

    public static com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments.LinkNameDomain[] values() {
        return (com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments.LinkNameDomain[]) getHighSpeedVideoFpsRangesFor.clone();
    }

    public static com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments.LinkNameDomain valueOf(java.lang.String str) {
        return (com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments.LinkNameDomain) java.lang.Enum.valueOf(com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments.LinkNameDomain.class, str);
    }

    public static kotlin.enums.EnumEntries<com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments.LinkNameDomain> getEntries() {
        return getHighResolutionOutputSizeshNQ4ISI;
    }
}
