package com.paypal.oslo.feature.cashin.data.mapper;

@kotlin.Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lcom/paypal/oslo/feature/cashin/data/mapper/CashInActivationMapper;", "", "<init>", "()V", "Lcom/paypal/oslo/feature/cashin/graphql/GetCashInActivationDetailsQuery$CashInActivation;", com.google.firebase.messaging.Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "Lcom/paypal/oslo/feature/cashin/domain/model/CashInActivationDetails;", "map", "(Lcom/paypal/oslo/feature/cashin/graphql/GetCashInActivationDetailsQuery$CashInActivation;)Lcom/paypal/oslo/feature/cashin/domain/model/CashInActivationDetails;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class CashInActivationMapper {
    public static final int $stable = 0;

    @javax.inject.Inject
    public CashInActivationMapper() {
    }

    public final com.paypal.oslo.feature.cashin.domain.model.CashInActivationDetails map(com.paypal.oslo.feature.cashin.graphql.GetCashInActivationDetailsQuery.CashInActivation data) {
        java.util.ArrayList<java.lang.String> arrayList;
        java.lang.String str;
        com.paypal.oslo.feature.cashin.domain.model.CashInRetailerCapabilities cashInRetailerCapabilities;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(data, "");
        java.lang.String code = data.getCode();
        java.lang.String obj = data.getCodeActivationTime().toString();
        java.lang.String obj2 = data.getCodeExpirationTime().toString();
        java.lang.String rawValue = data.getCodeType().getRawValue();
        com.paypal.oslo.feature.cashin.graphql.GetCashInActivationDetailsQuery.Retailer retailer = data.getRetailer();
        java.lang.String id = retailer.getId();
        java.lang.String name2 = retailer.getName();
        java.lang.String obj3 = retailer.getLogoUrl().toString();
        java.util.List<com.paypal.oslo.api.graphql.schema.type.CashInRetailerCapability> capabilities = retailer.getCapabilities();
        java.util.ArrayList arrayList2 = null;
        if (capabilities != null) {
            java.util.List<com.paypal.oslo.api.graphql.schema.type.CashInRetailerCapability> list = capabilities;
            java.util.ArrayList arrayList3 = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(list, 10));
            java.util.Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                arrayList3.add(((com.paypal.oslo.api.graphql.schema.type.CashInRetailerCapability) it.next()).getRawValue());
            }
            arrayList = arrayList3;
        } else {
            arrayList = null;
        }
        if (arrayList != null) {
            java.util.ArrayList arrayList4 = new java.util.ArrayList();
            for (java.lang.String str2 : arrayList) {
                if (str2 != null) {
                    str = str2.toUpperCase(java.util.Locale.ROOT);
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
                    arrayList4.add(cashInRetailerCapabilities);
                }
            }
            arrayList2 = arrayList4;
        }
        java.util.List emptyList = arrayList2 == null ? kotlin.collections.CollectionsKt.emptyList() : arrayList2;
        java.util.List<java.lang.String> tags = retailer.getTags();
        if (tags == null) {
            tags = kotlin.collections.CollectionsKt.emptyList();
        }
        com.paypal.oslo.feature.cashin.graphql.GetCashInActivationDetailsQuery.Fee fee = retailer.getFee();
        return new com.paypal.oslo.feature.cashin.domain.model.CashInActivationDetails(code, obj, obj2, rawValue, new com.paypal.oslo.feature.cashin.domain.model.CashInActivationRetailer(id, name2, obj3, emptyList, tags, new com.paypal.oslo.feature.cashin.domain.model.CashInMoneyAmount(fee.getCurrencyCode().toString(), new java.math.BigDecimal(fee.getValue()), fee.getValue())));
    }
}
