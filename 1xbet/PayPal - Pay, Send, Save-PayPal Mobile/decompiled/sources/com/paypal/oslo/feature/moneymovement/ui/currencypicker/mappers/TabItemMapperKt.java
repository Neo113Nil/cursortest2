package com.paypal.oslo.feature.moneymovement.ui.currencypicker.mappers;

@kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0002\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u001f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00010\u0004*\b\u0012\u0004\u0012\u00020\u00000\u0004H\u0000¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lcom/paypal/oslo/feature/moneymovement/api/currencypicker/components/tabselector/TabItem;", "Lcom/paypal/pds/components/SegmentedControlItem;", "toSegmentedControlItem", "(Lcom/paypal/oslo/feature/moneymovement/api/currencypicker/components/tabselector/TabItem;)Lcom/paypal/pds/components/SegmentedControlItem;", "", "toSegmentedControlItems", "(Ljava/util/List;)Ljava/util/List;"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class TabItemMapperKt {
    public static final com.paypal.pds.components.SegmentedControlItem toSegmentedControlItem(com.paypal.oslo.feature.moneymovement.api.currencypicker.components.tabselector.TabItem tabItem) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(tabItem, "");
        return new com.paypal.pds.components.SegmentedControlItem(tabItem.getTitle(), tabItem.getLeftIcon(), null, null, null, 28, null);
    }

    public static final java.util.List<com.paypal.pds.components.SegmentedControlItem> toSegmentedControlItems(java.util.List<com.paypal.oslo.feature.moneymovement.api.currencypicker.components.tabselector.TabItem> list) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
        java.util.List<com.paypal.oslo.feature.moneymovement.api.currencypicker.components.tabselector.TabItem> list2 = list;
        java.util.ArrayList arrayList = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(list2, 10));
        java.util.Iterator<T> it = list2.iterator();
        while (it.hasNext()) {
            arrayList.add(toSegmentedControlItem((com.paypal.oslo.feature.moneymovement.api.currencypicker.components.tabselector.TabItem) it.next()));
        }
        return arrayList;
    }
}
