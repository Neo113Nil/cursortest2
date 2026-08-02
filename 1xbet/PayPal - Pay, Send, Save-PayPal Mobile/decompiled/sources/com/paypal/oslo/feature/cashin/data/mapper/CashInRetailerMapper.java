package com.paypal.oslo.feature.cashin.data.mapper;

@kotlin.Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J!\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00042\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\b\u0010\t"}, d2 = {"Lcom/paypal/oslo/feature/cashin/data/mapper/CashInRetailerMapper;", "", "<init>", "()V", "", "Lcom/paypal/oslo/feature/cashin/graphql/GetCashInRetailersQuery$Item;", "items", "Lcom/paypal/oslo/feature/cashin/domain/model/CashInRetailer;", "map", "(Ljava/util/List;)Ljava/util/List;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class CashInRetailerMapper {
    public static final int $stable = 0;

    @javax.inject.Inject
    public CashInRetailerMapper() {
    }

    public final java.util.List<com.paypal.oslo.feature.cashin.domain.model.CashInRetailer> map(java.util.List<com.paypal.oslo.feature.cashin.graphql.GetCashInRetailersQuery.Item> items) {
        java.util.ArrayList<java.lang.String> arrayList;
        java.util.ArrayList arrayList2;
        java.lang.String value;
        java.lang.Object currencyCode;
        java.lang.String str;
        com.paypal.oslo.feature.cashin.domain.model.CashInRetailerCapabilities cashInRetailerCapabilities;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(items, "");
        java.util.List<com.paypal.oslo.feature.cashin.graphql.GetCashInRetailersQuery.Item> list = items;
        java.util.ArrayList arrayList3 = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(list, 10));
        for (com.paypal.oslo.feature.cashin.graphql.GetCashInRetailersQuery.Item item : list) {
            java.lang.String id = item.getId();
            java.lang.String name2 = item.getName();
            java.lang.Object logoUrl = item.getLogoUrl();
            java.lang.String str2 = logoUrl instanceof java.lang.String ? (java.lang.String) logoUrl : null;
            java.lang.String str3 = str2 == null ? "" : str2;
            java.util.List<com.paypal.oslo.api.graphql.schema.type.CashInRetailerCapability> capabilities = item.getCapabilities();
            if (capabilities != null) {
                java.util.List<com.paypal.oslo.api.graphql.schema.type.CashInRetailerCapability> list2 = capabilities;
                java.util.ArrayList arrayList4 = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(list2, 10));
                java.util.Iterator<T> it = list2.iterator();
                while (it.hasNext()) {
                    arrayList4.add(((com.paypal.oslo.api.graphql.schema.type.CashInRetailerCapability) it.next()).getRawValue());
                }
                arrayList = arrayList4;
            } else {
                arrayList = null;
            }
            if (arrayList != null) {
                java.util.ArrayList arrayList5 = new java.util.ArrayList();
                for (java.lang.String str4 : arrayList) {
                    if (str4 != null) {
                        str = str4.toUpperCase(java.util.Locale.ROOT);
                        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(str, "");
                    } else {
                        str = null;
                    }
                    if (kotlin.jvm.internal.Intrinsics.areEqual(str, "BARCODE")) {
                        cashInRetailerCapabilities = com.paypal.oslo.feature.cashin.domain.model.CashInRetailerCapabilities.BARCODE;
                    } else {
                        cashInRetailerCapabilities = kotlin.jvm.internal.Intrinsics.areEqual(str, "SWIPE") ? com.paypal.oslo.feature.cashin.domain.model.CashInRetailerCapabilities.SWIPE : null;
                    }
                    if (cashInRetailerCapabilities != null) {
                        arrayList5.add(cashInRetailerCapabilities);
                    }
                }
                arrayList2 = arrayList5;
            } else {
                arrayList2 = null;
            }
            if (arrayList2 == null) {
                arrayList2 = kotlin.collections.CollectionsKt.emptyList();
            }
            java.util.List list3 = arrayList2;
            java.util.List<java.lang.String> tags = item.getTags();
            if (tags == null) {
                tags = kotlin.collections.CollectionsKt.emptyList();
            }
            java.util.List<java.lang.String> list4 = tags;
            com.paypal.oslo.feature.cashin.graphql.GetCashInRetailersQuery.Fee fee = item.getFee();
            java.lang.String obj = (fee == null || (currencyCode = fee.getCurrencyCode()) == null) ? null : currencyCode.toString();
            if (obj == null) {
                obj = "";
            }
            java.math.BigDecimal bigDecimal = (fee == null || (value = fee.getValue()) == null) ? java.math.BigDecimal.ZERO : new java.math.BigDecimal(value);
            kotlin.jvm.internal.Intrinsics.checkNotNull(bigDecimal);
            java.lang.String value2 = fee != null ? fee.getValue() : null;
            if (value2 == null) {
                value2 = "";
            }
            arrayList3.add(new com.paypal.oslo.feature.cashin.domain.model.CashInRetailer(id, name2, str3, list3, list4, new com.paypal.oslo.feature.cashin.domain.model.CashInMoneyAmount(obj, bigDecimal, value2), new com.paypal.oslo.feature.cashin.domain.model.CashInPartner(item.getPartner().getId())));
        }
        return arrayList3;
    }
}
