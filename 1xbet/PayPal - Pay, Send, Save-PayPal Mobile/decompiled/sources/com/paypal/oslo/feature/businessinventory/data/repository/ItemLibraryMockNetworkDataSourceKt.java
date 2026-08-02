package com.paypal.oslo.feature.businessinventory.data.repository;

@kotlin.Metadata(d1 = {"\u0000\u0000"}, d2 = {}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class ItemLibraryMockNetworkDataSourceKt {
    public static final /* synthetic */ com.paypal.oslo.feature.businessinventory.api.domain.model.LibraryItem access$newLibraryItem(int i) {
        com.paypal.oslo.feature.businessinventory.api.domain.model.LibraryItemType libraryItemType;
        byte[] bytes = java.lang.String.valueOf(i).getBytes(kotlin.text.Charsets.UTF_8);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(bytes, "");
        java.lang.String obj = java.util.UUID.nameUUIDFromBytes(bytes).toString();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(obj, "");
        java.lang.String concat = "Item number ".concat(java.lang.String.valueOf(i));
        com.paypal.oslo.core.money.Money money = new com.paypal.oslo.core.money.Money(i, "USD");
        if (i % 2 == 0) {
            libraryItemType = com.paypal.oslo.feature.businessinventory.api.domain.model.LibraryItemType.PRODUCT;
        } else {
            libraryItemType = com.paypal.oslo.feature.businessinventory.api.domain.model.LibraryItemType.SERVICE;
        }
        return new com.paypal.oslo.feature.businessinventory.api.domain.model.LibraryItem(obj, concat, money, (com.paypal.oslo.feature.businessinventory.api.domain.model.TaxOption) null, libraryItemType, i % 3 == 0 ? "Description ".concat(java.lang.String.valueOf(i)) : null, 8, (kotlin.jvm.internal.DefaultConstructorMarker) null);
    }
}
