package com.paypal.oslo.feature.cashin.data.mapper;

@kotlin.Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J!\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00042\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\b\u0010\t"}, d2 = {"Lcom/paypal/oslo/feature/cashin/data/mapper/CashInStoresMapper;", "", "<init>", "()V", "", "Lcom/paypal/oslo/feature/cashin/graphql/GetCashInStoresQuery$Item;", "items", "Lcom/paypal/oslo/feature/cashin/domain/model/CashInStore;", "map", "(Ljava/util/List;)Ljava/util/List;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class CashInStoresMapper {
    public static final int $stable = 0;

    @javax.inject.Inject
    public CashInStoresMapper() {
    }

    public final java.util.List<com.paypal.oslo.feature.cashin.domain.model.CashInStore> map(java.util.List<com.paypal.oslo.feature.cashin.graphql.GetCashInStoresQuery.Item> items) {
        java.lang.String str;
        java.lang.String str2;
        com.paypal.oslo.feature.cashin.graphql.GetCashInStoresQuery.Retailer retailer;
        com.paypal.oslo.feature.cashin.graphql.GetCashInStoresQuery.Partner partner;
        com.paypal.oslo.feature.cashin.graphql.GetCashInStoresQuery.Retailer retailer2;
        com.paypal.oslo.feature.cashin.graphql.GetCashInStoresQuery.Experience experience;
        com.paypal.oslo.feature.cashin.graphql.GetCashInStoresQuery.Retailer retailer3;
        com.paypal.oslo.feature.cashin.graphql.GetCashInStoresQuery.Fee fee;
        java.lang.String obj;
        java.lang.String longitude;
        java.lang.Double doubleOrNull;
        java.lang.String latitude;
        java.lang.Double doubleOrNull2;
        java.lang.String longitude2;
        java.lang.Double doubleOrNull3;
        java.lang.String latitude2;
        java.lang.Double doubleOrNull4;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(items, "");
        java.util.List<com.paypal.oslo.feature.cashin.graphql.GetCashInStoresQuery.Item> list = items;
        java.util.ArrayList arrayList = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(list, 10));
        for (com.paypal.oslo.feature.cashin.graphql.GetCashInStoresQuery.Item item : list) {
            java.util.List<com.paypal.oslo.feature.cashin.graphql.GetCashInStoresQuery.Experience> experiences = item.getExperiences();
            java.lang.String str3 = null;
            com.paypal.oslo.feature.cashin.graphql.GetCashInStoresQuery.Experience experience2 = experiences != null ? (com.paypal.oslo.feature.cashin.graphql.GetCashInStoresQuery.Experience) kotlin.collections.CollectionsKt.firstOrNull((java.util.List) experiences) : null;
            com.paypal.oslo.feature.cashin.graphql.GetCashInStoresQuery.GeoLocation geoLocation = item.getGeoLocation();
            double d = 0.0d;
            double doubleValue = (geoLocation == null || (latitude2 = geoLocation.getLatitude()) == null || (doubleOrNull4 = kotlin.text.StringsKt.toDoubleOrNull(latitude2)) == null) ? 0.0d : doubleOrNull4.doubleValue();
            com.paypal.oslo.feature.cashin.graphql.GetCashInStoresQuery.GeoLocation geoLocation2 = item.getGeoLocation();
            double doubleValue2 = (geoLocation2 == null || (longitude2 = geoLocation2.getLongitude()) == null || (doubleOrNull3 = kotlin.text.StringsKt.toDoubleOrNull(longitude2)) == null) ? 0.0d : doubleOrNull3.doubleValue();
            java.lang.String name2 = item.getName();
            java.lang.StringBuilder sb = new java.lang.StringBuilder();
            sb.append(name2);
            sb.append("_");
            sb.append(doubleValue);
            sb.append("_");
            sb.append(doubleValue2);
            java.lang.String replace$default = kotlin.text.StringsKt.replace$default(sb.toString(), " ", "_", false, 4, (java.lang.Object) null);
            java.lang.String name3 = item.getName();
            java.lang.Object logoUrl = item.getLogoUrl();
            java.lang.String str4 = logoUrl instanceof java.lang.String ? (java.lang.String) logoUrl : null;
            java.lang.String str5 = str4 == null ? "" : str4;
            java.lang.Object markerUrl = item.getMarkerUrl();
            java.lang.String str6 = markerUrl instanceof java.lang.String ? (java.lang.String) markerUrl : null;
            java.lang.String str7 = str6 == null ? "" : str6;
            com.paypal.oslo.feature.cashin.graphql.GetCashInStoresQuery.Address address = item.getAddress();
            java.lang.String addressLine1 = address != null ? address.getAddressLine1() : null;
            if (addressLine1 == null) {
                addressLine1 = "";
            }
            java.lang.String adminArea2 = address != null ? address.getAdminArea2() : null;
            if (adminArea2 == null) {
                adminArea2 = "";
            }
            java.lang.String adminArea1 = address != null ? address.getAdminArea1() : null;
            if (adminArea1 == null) {
                adminArea1 = "";
            }
            java.lang.String postalCode = address != null ? address.getPostalCode() : null;
            if (postalCode == null) {
                postalCode = "";
            }
            com.paypal.oslo.feature.cashin.domain.model.CashInStoreAddress cashInStoreAddress = new com.paypal.oslo.feature.cashin.domain.model.CashInStoreAddress(addressLine1, adminArea2, adminArea1, postalCode);
            com.paypal.oslo.feature.cashin.graphql.GetCashInStoresQuery.GeoLocation geoLocation3 = item.getGeoLocation();
            double doubleValue3 = (geoLocation3 == null || (latitude = geoLocation3.getLatitude()) == null || (doubleOrNull2 = kotlin.text.StringsKt.toDoubleOrNull(latitude)) == null) ? 0.0d : doubleOrNull2.doubleValue();
            if (geoLocation3 != null && (longitude = geoLocation3.getLongitude()) != null && (doubleOrNull = kotlin.text.StringsKt.toDoubleOrNull(longitude)) != null) {
                d = doubleOrNull.doubleValue();
            }
            com.paypal.oslo.feature.cashin.domain.model.CashInGeoLocation cashInGeoLocation = new com.paypal.oslo.feature.cashin.domain.model.CashInGeoLocation(doubleValue3, d);
            java.util.List<com.paypal.oslo.feature.cashin.graphql.GetCashInStoresQuery.Experience> experiences2 = item.getExperiences();
            if (experiences2 == null || (experience = (com.paypal.oslo.feature.cashin.graphql.GetCashInStoresQuery.Experience) kotlin.collections.CollectionsKt.firstOrNull((java.util.List) experiences2)) == null || (retailer3 = experience.getRetailer()) == null || (fee = retailer3.getFee()) == null) {
                str = "";
            } else {
                java.lang.Object currencyCode = fee.getCurrencyCode();
                java.lang.String str8 = currencyCode instanceof java.lang.String ? (java.lang.String) currencyCode : null;
                java.lang.String value = fee.getValue();
                if (kotlin.jvm.internal.Intrinsics.areEqual(str8, "USD")) {
                    obj = com.paypal.oslo.feature.savings.constants.SavingsConstants.Currency.SYMBOL_USD.concat(java.lang.String.valueOf(value));
                } else {
                    if (str8 == null) {
                        str8 = "";
                    }
                    java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
                    sb2.append(value);
                    sb2.append(" ");
                    sb2.append(str8);
                    obj = kotlin.text.StringsKt.trim(sb2.toString()).toString();
                }
                str = obj;
            }
            com.paypal.oslo.feature.cashin.graphql.GetCashInStoresQuery.Distance distance = item.getDistance();
            if (distance != null) {
                java.lang.String format = java.lang.String.format("%.1f", java.util.Arrays.copyOf(new java.lang.Object[]{java.lang.Double.valueOf(distance.getValue())}, 1));
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(format, "");
                str2 = format;
            } else {
                str2 = "";
            }
            java.lang.String id = (experience2 == null || (retailer2 = experience2.getRetailer()) == null) ? null : retailer2.getId();
            java.lang.String str9 = id == null ? "" : id;
            if (experience2 != null && (retailer = experience2.getRetailer()) != null && (partner = retailer.getPartner()) != null) {
                str3 = partner.getId();
            }
            arrayList.add(new com.paypal.oslo.feature.cashin.domain.model.CashInStore(replace$default, name3, str5, str7, cashInStoreAddress, cashInGeoLocation, str, str2, str9, str3 == null ? "" : str3));
        }
        return arrayList;
    }
}
