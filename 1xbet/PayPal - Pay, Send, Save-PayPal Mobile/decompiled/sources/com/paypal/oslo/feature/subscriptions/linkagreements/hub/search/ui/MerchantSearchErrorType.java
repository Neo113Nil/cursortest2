package com.paypal.oslo.feature.subscriptions.linkagreements.hub.search.ui;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0080\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006"}, d2 = {"Lcom/paypal/oslo/feature/subscriptions/linkagreements/hub/search/ui/MerchantSearchErrorType;", "", "<init>", "(Ljava/lang/String;I)V", "ERROR_FETCH_POPULAR", "SEARCH_NOT_FOUND", com.paypal.oslo.feature.oneonboarding.domain.error.FlowStepError.GENERIC_ERROR}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class MerchantSearchErrorType {
    public static final com.paypal.oslo.feature.subscriptions.linkagreements.hub.search.ui.MerchantSearchErrorType ERROR_FETCH_POPULAR;
    public static final com.paypal.oslo.feature.subscriptions.linkagreements.hub.search.ui.MerchantSearchErrorType GENERIC_ERROR;
    public static final com.paypal.oslo.feature.subscriptions.linkagreements.hub.search.ui.MerchantSearchErrorType SEARCH_NOT_FOUND;
    private static final /* synthetic */ com.paypal.oslo.feature.subscriptions.linkagreements.hub.search.ui.MerchantSearchErrorType[] getHighResolutionOutputSizeshNQ4ISI;
    private static final /* synthetic */ kotlin.enums.EnumEntries getHighSpeedVideoSizes;

    private MerchantSearchErrorType(java.lang.String str, int i) {
    }

    static {
        com.paypal.oslo.feature.subscriptions.linkagreements.hub.search.ui.MerchantSearchErrorType merchantSearchErrorType = new com.paypal.oslo.feature.subscriptions.linkagreements.hub.search.ui.MerchantSearchErrorType("ERROR_FETCH_POPULAR", 0);
        ERROR_FETCH_POPULAR = merchantSearchErrorType;
        com.paypal.oslo.feature.subscriptions.linkagreements.hub.search.ui.MerchantSearchErrorType merchantSearchErrorType2 = new com.paypal.oslo.feature.subscriptions.linkagreements.hub.search.ui.MerchantSearchErrorType("SEARCH_NOT_FOUND", 1);
        SEARCH_NOT_FOUND = merchantSearchErrorType2;
        com.paypal.oslo.feature.subscriptions.linkagreements.hub.search.ui.MerchantSearchErrorType merchantSearchErrorType3 = new com.paypal.oslo.feature.subscriptions.linkagreements.hub.search.ui.MerchantSearchErrorType(com.paypal.oslo.feature.oneonboarding.domain.error.FlowStepError.GENERIC_ERROR, 2);
        GENERIC_ERROR = merchantSearchErrorType3;
        com.paypal.oslo.feature.subscriptions.linkagreements.hub.search.ui.MerchantSearchErrorType[] merchantSearchErrorTypeArr = {merchantSearchErrorType, merchantSearchErrorType2, merchantSearchErrorType3};
        getHighResolutionOutputSizeshNQ4ISI = merchantSearchErrorTypeArr;
        getHighSpeedVideoSizes = kotlin.enums.EnumEntriesKt.enumEntries(merchantSearchErrorTypeArr);
    }

    public static com.paypal.oslo.feature.subscriptions.linkagreements.hub.search.ui.MerchantSearchErrorType[] values() {
        return (com.paypal.oslo.feature.subscriptions.linkagreements.hub.search.ui.MerchantSearchErrorType[]) getHighResolutionOutputSizeshNQ4ISI.clone();
    }

    public static com.paypal.oslo.feature.subscriptions.linkagreements.hub.search.ui.MerchantSearchErrorType valueOf(java.lang.String str) {
        return (com.paypal.oslo.feature.subscriptions.linkagreements.hub.search.ui.MerchantSearchErrorType) java.lang.Enum.valueOf(com.paypal.oslo.feature.subscriptions.linkagreements.hub.search.ui.MerchantSearchErrorType.class, str);
    }

    public static kotlin.enums.EnumEntries<com.paypal.oslo.feature.subscriptions.linkagreements.hub.search.ui.MerchantSearchErrorType> getEntries() {
        return getHighSpeedVideoSizes;
    }
}
