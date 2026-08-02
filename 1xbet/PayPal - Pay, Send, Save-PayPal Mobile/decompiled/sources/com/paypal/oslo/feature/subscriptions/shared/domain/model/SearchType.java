package com.paypal.oslo.feature.subscriptions.shared.domain.model;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006"}, d2 = {"Lcom/paypal/oslo/feature/subscriptions/shared/domain/model/SearchType;", "", "<init>", "(Ljava/lang/String;I)V", "ALL", "POPULAR", "SEARCH"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class SearchType {
    public static final com.paypal.oslo.feature.subscriptions.shared.domain.model.SearchType ALL;
    public static final com.paypal.oslo.feature.subscriptions.shared.domain.model.SearchType POPULAR;
    public static final com.paypal.oslo.feature.subscriptions.shared.domain.model.SearchType SEARCH;
    private static final /* synthetic */ kotlin.enums.EnumEntries getHighResolutionOutputSizeshNQ4ISI;
    private static final /* synthetic */ com.paypal.oslo.feature.subscriptions.shared.domain.model.SearchType[] getHighSpeedVideoFpsRanges;

    private SearchType(java.lang.String str, int i) {
    }

    static {
        com.paypal.oslo.feature.subscriptions.shared.domain.model.SearchType searchType = new com.paypal.oslo.feature.subscriptions.shared.domain.model.SearchType("ALL", 0);
        ALL = searchType;
        com.paypal.oslo.feature.subscriptions.shared.domain.model.SearchType searchType2 = new com.paypal.oslo.feature.subscriptions.shared.domain.model.SearchType("POPULAR", 1);
        POPULAR = searchType2;
        com.paypal.oslo.feature.subscriptions.shared.domain.model.SearchType searchType3 = new com.paypal.oslo.feature.subscriptions.shared.domain.model.SearchType("SEARCH", 2);
        SEARCH = searchType3;
        com.paypal.oslo.feature.subscriptions.shared.domain.model.SearchType[] searchTypeArr = {searchType, searchType2, searchType3};
        getHighSpeedVideoFpsRanges = searchTypeArr;
        getHighResolutionOutputSizeshNQ4ISI = kotlin.enums.EnumEntriesKt.enumEntries(searchTypeArr);
    }

    public static com.paypal.oslo.feature.subscriptions.shared.domain.model.SearchType[] values() {
        return (com.paypal.oslo.feature.subscriptions.shared.domain.model.SearchType[]) getHighSpeedVideoFpsRanges.clone();
    }

    public static com.paypal.oslo.feature.subscriptions.shared.domain.model.SearchType valueOf(java.lang.String str) {
        return (com.paypal.oslo.feature.subscriptions.shared.domain.model.SearchType) java.lang.Enum.valueOf(com.paypal.oslo.feature.subscriptions.shared.domain.model.SearchType.class, str);
    }

    public static kotlin.enums.EnumEntries<com.paypal.oslo.feature.subscriptions.shared.domain.model.SearchType> getEntries() {
        return getHighResolutionOutputSizeshNQ4ISI;
    }
}
