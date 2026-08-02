package com.paypal.oslo.feature.contacts.ui.contacts.model;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006"}, d2 = {"Lcom/paypal/oslo/feature/contacts/ui/contacts/model/SearchQueryType;", "", "<init>", "(Ljava/lang/String;I)V", "PHONE", "EMAIL", "OTHER"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class SearchQueryType {
    private static final /* synthetic */ kotlin.enums.EnumEntries Camera2StreamConfigurationMap;
    public static final com.paypal.oslo.feature.contacts.ui.contacts.model.SearchQueryType EMAIL;
    public static final com.paypal.oslo.feature.contacts.ui.contacts.model.SearchQueryType OTHER;
    public static final com.paypal.oslo.feature.contacts.ui.contacts.model.SearchQueryType PHONE;
    private static final /* synthetic */ com.paypal.oslo.feature.contacts.ui.contacts.model.SearchQueryType[] getHighSpeedVideoFpsRangesFor;

    private SearchQueryType(java.lang.String str, int i) {
    }

    static {
        com.paypal.oslo.feature.contacts.ui.contacts.model.SearchQueryType searchQueryType = new com.paypal.oslo.feature.contacts.ui.contacts.model.SearchQueryType("PHONE", 0);
        PHONE = searchQueryType;
        com.paypal.oslo.feature.contacts.ui.contacts.model.SearchQueryType searchQueryType2 = new com.paypal.oslo.feature.contacts.ui.contacts.model.SearchQueryType("EMAIL", 1);
        EMAIL = searchQueryType2;
        com.paypal.oslo.feature.contacts.ui.contacts.model.SearchQueryType searchQueryType3 = new com.paypal.oslo.feature.contacts.ui.contacts.model.SearchQueryType("OTHER", 2);
        OTHER = searchQueryType3;
        com.paypal.oslo.feature.contacts.ui.contacts.model.SearchQueryType[] searchQueryTypeArr = {searchQueryType, searchQueryType2, searchQueryType3};
        getHighSpeedVideoFpsRangesFor = searchQueryTypeArr;
        Camera2StreamConfigurationMap = kotlin.enums.EnumEntriesKt.enumEntries(searchQueryTypeArr);
    }

    public static com.paypal.oslo.feature.contacts.ui.contacts.model.SearchQueryType[] values() {
        return (com.paypal.oslo.feature.contacts.ui.contacts.model.SearchQueryType[]) getHighSpeedVideoFpsRangesFor.clone();
    }

    public static com.paypal.oslo.feature.contacts.ui.contacts.model.SearchQueryType valueOf(java.lang.String str) {
        return (com.paypal.oslo.feature.contacts.ui.contacts.model.SearchQueryType) java.lang.Enum.valueOf(com.paypal.oslo.feature.contacts.ui.contacts.model.SearchQueryType.class, str);
    }

    public static kotlin.enums.EnumEntries<com.paypal.oslo.feature.contacts.ui.contacts.model.SearchQueryType> getEntries() {
        return Camera2StreamConfigurationMap;
    }
}
