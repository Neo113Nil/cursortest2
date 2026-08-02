package com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.domain.model;

@kotlin.Metadata(d1 = {"\u00006\n\u0002\u0010\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\u001a!\u0010\u0005\u001a\u00020\u0004*\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u001a!\u0010\u0007\u001a\u00020\u0004*\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\u0007\u0010\u0006\u001a!\u0010\b\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\b\u0010\t\u001a+\u0010\f\u001a\u00020\u0004*\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u000b\u001a\u00020\nH\u0000¢\u0006\u0004\b\f\u0010\r\u001a+\u0010\u000e\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u000b\u001a\u00020\nH\u0000¢\u0006\u0004\b\u000e\u0010\u000f\u001a+\u0010\u0010\u001a\u00020\u0004*\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u000b\u001a\u00020\nH\u0000¢\u0006\u0004\b\u0010\u0010\r\u001a+\u0010\u0011\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u000b\u001a\u00020\nH\u0000¢\u0006\u0004\b\u0011\u0010\u000f\u001a\u0013\u0010\u0013\u001a\u00020\u0004*\u00020\u0012H\u0000¢\u0006\u0004\b\u0013\u0010\u0014\u001a\u0013\u0010\u0016\u001a\u00020\u0001*\u00020\u0015H\u0000¢\u0006\u0004\b\u0016\u0010\u0017\"\u0014\u0010\u0019\u001a\u00020\u00188\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u0019\u0010\u001a"}, d2 = {"", "Lcom/paypal/oslo/feature/businesspayandgetpaid/payandgetpaid/domain/model/LineItem;", "", "currencyCode", "Lcom/paypal/oslo/feature/businesspayandgetpaid/shared/monetary/GetPaidMoney;", "totalDiscount", "(Ljava/util/Collection;Ljava/lang/String;)Lcom/paypal/oslo/feature/businesspayandgetpaid/shared/monetary/GetPaidMoney;", "subTotal", "subTotalFormatted", "(Ljava/util/Collection;Ljava/lang/String;)Ljava/lang/String;", "Lcom/paypal/oslo/feature/businesspayandgetpaid/shared/domain/model/TaxSettings;", "taxSettings", "totalTax", "(Ljava/util/Collection;Ljava/lang/String;Lcom/paypal/oslo/feature/businesspayandgetpaid/shared/domain/model/TaxSettings;)Lcom/paypal/oslo/feature/businesspayandgetpaid/shared/monetary/GetPaidMoney;", "totalTaxFormatted", "(Ljava/util/Collection;Ljava/lang/String;Lcom/paypal/oslo/feature/businesspayandgetpaid/shared/domain/model/TaxSettings;)Ljava/lang/String;", "total", "totalFormatted", "Lcom/paypal/oslo/core/money/Money;", "toGetPaidMoney", "(Lcom/paypal/oslo/core/money/Money;)Lcom/paypal/oslo/feature/businesspayandgetpaid/shared/monetary/GetPaidMoney;", "Lcom/paypal/oslo/feature/businessinventory/api/domain/model/LibraryItem;", "toLineItem", "(Lcom/paypal/oslo/feature/businessinventory/api/domain/model/LibraryItem;)Lcom/paypal/oslo/feature/businesspayandgetpaid/payandgetpaid/domain/model/LineItem;", "", "PercentageDivider", com.visa.cbp.getEncExpo.warmup}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class LineItemKt {
    public static final int PercentageDivider = 100;

    public static final com.paypal.oslo.feature.businesspayandgetpaid.shared.monetary.GetPaidMoney totalDiscount(java.util.Collection<com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.domain.model.LineItem> collection, java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(collection, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        com.paypal.oslo.feature.businesspayandgetpaid.shared.monetary.GetPaidMoney getPaidMoney = new com.paypal.oslo.feature.businesspayandgetpaid.shared.monetary.GetPaidMoney(0L, str);
        java.util.Iterator<T> it = collection.iterator();
        while (it.hasNext()) {
            getPaidMoney = getPaidMoney.plus(((com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.domain.model.LineItem) it.next()).getTotalDiscount());
        }
        return getPaidMoney;
    }

    public static final com.paypal.oslo.feature.businesspayandgetpaid.shared.monetary.GetPaidMoney subTotal(java.util.Collection<com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.domain.model.LineItem> collection, java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(collection, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        com.paypal.oslo.feature.businesspayandgetpaid.shared.monetary.GetPaidMoney getPaidMoney = new com.paypal.oslo.feature.businesspayandgetpaid.shared.monetary.GetPaidMoney(0L, str);
        java.util.Iterator<T> it = collection.iterator();
        while (it.hasNext()) {
            getPaidMoney = getPaidMoney.plus(((com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.domain.model.LineItem) it.next()).getSubTotal());
        }
        return getPaidMoney;
    }

    public static final java.lang.String subTotalFormatted(java.util.Collection<com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.domain.model.LineItem> collection, java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(collection, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        return com.paypal.oslo.feature.businesspayandgetpaid.shared.monetary.GetPaidMoney.formatWithSymbol$default(subTotal(collection, str), null, 1, null);
    }

    public static /* synthetic */ com.paypal.oslo.feature.businesspayandgetpaid.shared.monetary.GetPaidMoney totalTax$default(java.util.Collection collection, java.lang.String str, com.paypal.oslo.feature.businesspayandgetpaid.shared.domain.model.TaxSettings taxSettings, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            taxSettings = new com.paypal.oslo.feature.businesspayandgetpaid.shared.domain.model.TaxSettings(false, false, 3, (kotlin.jvm.internal.DefaultConstructorMarker) null);
        }
        return totalTax(collection, str, taxSettings);
    }

    public static final com.paypal.oslo.feature.businesspayandgetpaid.shared.monetary.GetPaidMoney totalTax(java.util.Collection<com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.domain.model.LineItem> collection, java.lang.String str, com.paypal.oslo.feature.businesspayandgetpaid.shared.domain.model.TaxSettings taxSettings) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(collection, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(taxSettings, "");
        com.paypal.oslo.feature.businesspayandgetpaid.shared.monetary.GetPaidMoney getPaidMoney = new com.paypal.oslo.feature.businesspayandgetpaid.shared.monetary.GetPaidMoney(0L, str);
        java.util.Iterator<T> it = collection.iterator();
        while (it.hasNext()) {
            getPaidMoney = getPaidMoney.plus(((com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.domain.model.LineItem) it.next()).totalTax(taxSettings));
        }
        return getPaidMoney;
    }

    public static final java.lang.String totalTaxFormatted(java.util.Collection<com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.domain.model.LineItem> collection, java.lang.String str, com.paypal.oslo.feature.businesspayandgetpaid.shared.domain.model.TaxSettings taxSettings) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(collection, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(taxSettings, "");
        return com.paypal.oslo.feature.businesspayandgetpaid.shared.monetary.GetPaidMoney.formatWithSymbol$default(totalTax(collection, str, taxSettings), null, 1, null);
    }

    public static /* synthetic */ java.lang.String totalTaxFormatted$default(java.util.Collection collection, java.lang.String str, com.paypal.oslo.feature.businesspayandgetpaid.shared.domain.model.TaxSettings taxSettings, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            taxSettings = new com.paypal.oslo.feature.businesspayandgetpaid.shared.domain.model.TaxSettings(false, false, 3, (kotlin.jvm.internal.DefaultConstructorMarker) null);
        }
        return totalTaxFormatted(collection, str, taxSettings);
    }

    public static final com.paypal.oslo.feature.businesspayandgetpaid.shared.monetary.GetPaidMoney total(java.util.Collection<com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.domain.model.LineItem> collection, java.lang.String str, com.paypal.oslo.feature.businesspayandgetpaid.shared.domain.model.TaxSettings taxSettings) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(collection, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(taxSettings, "");
        com.paypal.oslo.feature.businesspayandgetpaid.shared.monetary.GetPaidMoney getPaidMoney = new com.paypal.oslo.feature.businesspayandgetpaid.shared.monetary.GetPaidMoney(0L, str);
        java.util.Iterator<T> it = collection.iterator();
        while (it.hasNext()) {
            getPaidMoney = getPaidMoney.plus(((com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.domain.model.LineItem) it.next()).total(taxSettings));
        }
        return getPaidMoney;
    }

    public static /* synthetic */ com.paypal.oslo.feature.businesspayandgetpaid.shared.monetary.GetPaidMoney total$default(java.util.Collection collection, java.lang.String str, com.paypal.oslo.feature.businesspayandgetpaid.shared.domain.model.TaxSettings taxSettings, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            taxSettings = new com.paypal.oslo.feature.businesspayandgetpaid.shared.domain.model.TaxSettings(false, false, 3, (kotlin.jvm.internal.DefaultConstructorMarker) null);
        }
        return total(collection, str, taxSettings);
    }

    public static /* synthetic */ java.lang.String totalFormatted$default(java.util.Collection collection, java.lang.String str, com.paypal.oslo.feature.businesspayandgetpaid.shared.domain.model.TaxSettings taxSettings, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            taxSettings = new com.paypal.oslo.feature.businesspayandgetpaid.shared.domain.model.TaxSettings(false, false, 3, (kotlin.jvm.internal.DefaultConstructorMarker) null);
        }
        return totalFormatted(collection, str, taxSettings);
    }

    public static final java.lang.String totalFormatted(java.util.Collection<com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.domain.model.LineItem> collection, java.lang.String str, com.paypal.oslo.feature.businesspayandgetpaid.shared.domain.model.TaxSettings taxSettings) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(collection, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(taxSettings, "");
        return com.paypal.oslo.feature.businesspayandgetpaid.shared.monetary.GetPaidMoney.formatWithSymbol$default(total(collection, str, taxSettings), null, 1, null);
    }

    public static final com.paypal.oslo.feature.businesspayandgetpaid.shared.monetary.GetPaidMoney toGetPaidMoney(com.paypal.oslo.core.money.Money money) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(money, "");
        return new com.paypal.oslo.feature.businesspayandgetpaid.shared.monetary.GetPaidMoney(money.getValue(), money.getCurrencyCode());
    }

    public static final com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.domain.model.LineItem toLineItem(com.paypal.oslo.feature.businessinventory.api.domain.model.LibraryItem libraryItem) {
        com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.domain.model.ItemType itemType;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(libraryItem, "");
        java.lang.String id = libraryItem.getId();
        java.lang.String name2 = libraryItem.getName();
        com.paypal.oslo.feature.businesspayandgetpaid.shared.monetary.GetPaidMoney getPaidMoney = toGetPaidMoney(libraryItem.getPrice());
        int i = com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.domain.model.LineItemKt.WhenMappings.$EnumSwitchMapping$0[libraryItem.getType().ordinal()];
        if (i == 1) {
            itemType = com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.domain.model.ItemType.PRODUCT;
        } else {
            if (i != 2) {
                throw new kotlin.NoWhenBranchMatchedException();
            }
            itemType = com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.domain.model.ItemType.SERVICE;
        }
        com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.domain.model.ItemType itemType2 = itemType;
        com.paypal.oslo.feature.businessinventory.api.domain.model.TaxOption taxOption = libraryItem.getTaxOption();
        return new com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.domain.model.LineItem(id, name2, getPaidMoney, (java.math.BigDecimal) null, itemType2, libraryItem.getDescription(), (com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.domain.model.Discount) null, taxOption != null ? com.paypal.oslo.feature.businesspayandgetpaid.shared.domain.model.TaxKt.toTax(taxOption) : null, 72, (kotlin.jvm.internal.DefaultConstructorMarker) null);
    }

    @kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[com.paypal.oslo.feature.businessinventory.api.domain.model.LibraryItemType.values().length];
            try {
                iArr[com.paypal.oslo.feature.businessinventory.api.domain.model.LibraryItemType.PRODUCT.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[com.paypal.oslo.feature.businessinventory.api.domain.model.LibraryItemType.SERVICE.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }
}
