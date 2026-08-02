package com.paypal.oslo.feature.businessinventory.domain;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\b"}, d2 = {"Lcom/paypal/oslo/feature/businessinventory/domain/ItemLibraryFlowOrigin;", "", "<init>", "(Ljava/lang/String;I)V", "INVOICE", "ITEM_LIST", "TAX_LIST", "CUSTOM_AMOUNT", "ITEM_EDITOR"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class ItemLibraryFlowOrigin {
    public static final com.paypal.oslo.feature.businessinventory.domain.ItemLibraryFlowOrigin CUSTOM_AMOUNT;
    private static final /* synthetic */ com.paypal.oslo.feature.businessinventory.domain.ItemLibraryFlowOrigin[] Camera2StreamConfigurationMap;
    public static final com.paypal.oslo.feature.businessinventory.domain.ItemLibraryFlowOrigin INVOICE;
    public static final com.paypal.oslo.feature.businessinventory.domain.ItemLibraryFlowOrigin ITEM_EDITOR;
    public static final com.paypal.oslo.feature.businessinventory.domain.ItemLibraryFlowOrigin ITEM_LIST;
    public static final com.paypal.oslo.feature.businessinventory.domain.ItemLibraryFlowOrigin TAX_LIST;
    private static final /* synthetic */ kotlin.enums.EnumEntries getHighSpeedVideoFpsRangesFor;

    private ItemLibraryFlowOrigin(java.lang.String str, int i) {
    }

    static {
        com.paypal.oslo.feature.businessinventory.domain.ItemLibraryFlowOrigin itemLibraryFlowOrigin = new com.paypal.oslo.feature.businessinventory.domain.ItemLibraryFlowOrigin("INVOICE", 0);
        INVOICE = itemLibraryFlowOrigin;
        com.paypal.oslo.feature.businessinventory.domain.ItemLibraryFlowOrigin itemLibraryFlowOrigin2 = new com.paypal.oslo.feature.businessinventory.domain.ItemLibraryFlowOrigin("ITEM_LIST", 1);
        ITEM_LIST = itemLibraryFlowOrigin2;
        com.paypal.oslo.feature.businessinventory.domain.ItemLibraryFlowOrigin itemLibraryFlowOrigin3 = new com.paypal.oslo.feature.businessinventory.domain.ItemLibraryFlowOrigin("TAX_LIST", 2);
        TAX_LIST = itemLibraryFlowOrigin3;
        com.paypal.oslo.feature.businessinventory.domain.ItemLibraryFlowOrigin itemLibraryFlowOrigin4 = new com.paypal.oslo.feature.businessinventory.domain.ItemLibraryFlowOrigin("CUSTOM_AMOUNT", 3);
        CUSTOM_AMOUNT = itemLibraryFlowOrigin4;
        com.paypal.oslo.feature.businessinventory.domain.ItemLibraryFlowOrigin itemLibraryFlowOrigin5 = new com.paypal.oslo.feature.businessinventory.domain.ItemLibraryFlowOrigin("ITEM_EDITOR", 4);
        ITEM_EDITOR = itemLibraryFlowOrigin5;
        com.paypal.oslo.feature.businessinventory.domain.ItemLibraryFlowOrigin[] itemLibraryFlowOriginArr = {itemLibraryFlowOrigin, itemLibraryFlowOrigin2, itemLibraryFlowOrigin3, itemLibraryFlowOrigin4, itemLibraryFlowOrigin5};
        Camera2StreamConfigurationMap = itemLibraryFlowOriginArr;
        getHighSpeedVideoFpsRangesFor = kotlin.enums.EnumEntriesKt.enumEntries(itemLibraryFlowOriginArr);
    }

    public static com.paypal.oslo.feature.businessinventory.domain.ItemLibraryFlowOrigin[] values() {
        return (com.paypal.oslo.feature.businessinventory.domain.ItemLibraryFlowOrigin[]) Camera2StreamConfigurationMap.clone();
    }

    public static com.paypal.oslo.feature.businessinventory.domain.ItemLibraryFlowOrigin valueOf(java.lang.String str) {
        return (com.paypal.oslo.feature.businessinventory.domain.ItemLibraryFlowOrigin) java.lang.Enum.valueOf(com.paypal.oslo.feature.businessinventory.domain.ItemLibraryFlowOrigin.class, str);
    }

    public static kotlin.enums.EnumEntries<com.paypal.oslo.feature.businessinventory.domain.ItemLibraryFlowOrigin> getEntries() {
        return getHighSpeedVideoFpsRangesFor;
    }
}
