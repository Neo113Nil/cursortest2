package com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\b"}, d2 = {"Lcom/paypal/oslo/feature/taxanddocumentcenter/domain/model/taxdocuments/ActionTypeDomain;", "", "<init>", "(Ljava/lang/String;I)V", "DOWNLOAD", "DEEPLINK", "HALF_SHEET", "GRAPHQL", "DISMISS"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class ActionTypeDomain {
    public static final com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments.ActionTypeDomain DEEPLINK;
    public static final com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments.ActionTypeDomain DISMISS;
    public static final com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments.ActionTypeDomain DOWNLOAD;
    public static final com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments.ActionTypeDomain GRAPHQL;
    public static final com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments.ActionTypeDomain HALF_SHEET;
    private static final /* synthetic */ kotlin.enums.EnumEntries getHighSpeedVideoFpsRangesFor;
    private static final /* synthetic */ com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments.ActionTypeDomain[] getHighSpeedVideoSizes;

    private ActionTypeDomain(java.lang.String str, int i) {
    }

    static {
        com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments.ActionTypeDomain actionTypeDomain = new com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments.ActionTypeDomain("DOWNLOAD", 0);
        DOWNLOAD = actionTypeDomain;
        com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments.ActionTypeDomain actionTypeDomain2 = new com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments.ActionTypeDomain("DEEPLINK", 1);
        DEEPLINK = actionTypeDomain2;
        com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments.ActionTypeDomain actionTypeDomain3 = new com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments.ActionTypeDomain("HALF_SHEET", 2);
        HALF_SHEET = actionTypeDomain3;
        com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments.ActionTypeDomain actionTypeDomain4 = new com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments.ActionTypeDomain("GRAPHQL", 3);
        GRAPHQL = actionTypeDomain4;
        com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments.ActionTypeDomain actionTypeDomain5 = new com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments.ActionTypeDomain("DISMISS", 4);
        DISMISS = actionTypeDomain5;
        com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments.ActionTypeDomain[] actionTypeDomainArr = {actionTypeDomain, actionTypeDomain2, actionTypeDomain3, actionTypeDomain4, actionTypeDomain5};
        getHighSpeedVideoSizes = actionTypeDomainArr;
        getHighSpeedVideoFpsRangesFor = kotlin.enums.EnumEntriesKt.enumEntries(actionTypeDomainArr);
    }

    public static com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments.ActionTypeDomain[] values() {
        return (com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments.ActionTypeDomain[]) getHighSpeedVideoSizes.clone();
    }

    public static com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments.ActionTypeDomain valueOf(java.lang.String str) {
        return (com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments.ActionTypeDomain) java.lang.Enum.valueOf(com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments.ActionTypeDomain.class, str);
    }

    public static kotlin.enums.EnumEntries<com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments.ActionTypeDomain> getEntries() {
        return getHighSpeedVideoFpsRangesFor;
    }
}
