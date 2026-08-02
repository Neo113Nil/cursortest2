package com.paypal.oslo.feature.businessinventory.data.utils;

@kotlin.Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0013\u0010\u0006\u001a\u00020\u0005*\u00020\u0004H\u0000¢\u0006\u0004\b\u0006\u0010\u0007\u001a\u0013\u0010\n\u001a\u00020\t*\u00020\bH\u0000¢\u0006\u0004\b\n\u0010\u000b\u001a\u0017\u0010\u000f\u001a\u00060\rj\u0002`\u000e*\u00020\fH\u0000¢\u0006\u0004\b\u000f\u0010\u0010\u001a\u0017\u0010\u0014\u001a\u00060\u0012j\u0002`\u0013*\u00020\u0011H\u0000¢\u0006\u0004\b\u0014\u0010\u0015"}, d2 = {"Lcom/paypal/oslo/feature/businessinventory/graphql/GetBusinessInventoryTaxesQuery$MerchantTax;", "Lcom/paypal/oslo/feature/businessinventory/api/domain/model/TaxOption;", "toTaxOption", "(Lcom/paypal/oslo/feature/businessinventory/graphql/GetBusinessInventoryTaxesQuery$MerchantTax;)Lcom/paypal/oslo/feature/businessinventory/api/domain/model/TaxOption;", "Lcom/paypal/oslo/feature/businessinventory/graphql/GetBusinessInventoryItemsQuery$MerchantItem;", "Lcom/paypal/oslo/feature/businessinventory/api/domain/model/LibraryItem;", "toLibraryItem", "(Lcom/paypal/oslo/feature/businessinventory/graphql/GetBusinessInventoryItemsQuery$MerchantItem;)Lcom/paypal/oslo/feature/businessinventory/api/domain/model/LibraryItem;", "Lcom/paypal/oslo/feature/businessinventory/api/domain/model/LibraryItemType;", "Lcom/paypal/oslo/api/graphql/schema/type/MerchantItemType;", "toMerchantItemType", "(Lcom/paypal/oslo/feature/businessinventory/api/domain/model/LibraryItemType;)Lcom/paypal/oslo/api/graphql/schema/type/MerchantItemType;", "Lcom/paypal/oslo/core/money/Money;", "Lcom/paypal/oslo/api/graphql/schema/type/MoneyInput;", "Lcom/paypal/oslo/feature/businessinventory/graphql/type/MoneyInput;", "toMoneyInput", "(Lcom/paypal/oslo/core/money/Money;)Lcom/paypal/oslo/api/graphql/schema/type/MoneyInput;", "Lcom/paypal/oslo/core/network/graphql/error/CallError;", "Ljava/lang/Exception;", "Lkotlin/getHighResolutionOutputSizeshNQ4ISI;", "toBusinessInventoryException", "(Lcom/paypal/oslo/core/network/graphql/error/CallError;)Ljava/lang/Exception;"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class GraphQLExtensionsKt {
    public static final com.paypal.oslo.feature.businessinventory.api.domain.model.TaxOption toTaxOption(com.paypal.oslo.feature.businessinventory.graphql.GetBusinessInventoryTaxesQuery.MerchantTax merchantTax) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(merchantTax, "");
        return new com.paypal.oslo.feature.businessinventory.api.domain.model.TaxOption(merchantTax.getId(), merchantTax.getName(), java.lang.Double.parseDouble(merchantTax.getPercent()));
    }

    public static final com.paypal.oslo.feature.businessinventory.api.domain.model.LibraryItem toLibraryItem(com.paypal.oslo.feature.businessinventory.graphql.GetBusinessInventoryItemsQuery.MerchantItem merchantItem) {
        com.paypal.oslo.feature.businessinventory.api.domain.model.LibraryItemType libraryItemType;
        com.paypal.oslo.feature.businessinventory.graphql.GetBusinessInventoryItemsQuery.Tax tax;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(merchantItem, "");
        java.lang.String id = merchantItem.getId();
        java.lang.String name2 = merchantItem.getName();
        com.paypal.oslo.feature.businessinventory.graphql.GetBusinessInventoryItemsQuery.Price price = merchantItem.getPrice();
        com.paypal.oslo.core.money.Money parseAsMoneyOrNull = com.paypal.oslo.core.money.MoneyKt.parseAsMoneyOrNull(price.getValue(), price.getCurrencyCode().toString());
        if (parseAsMoneyOrNull != null) {
            java.util.List<com.paypal.oslo.feature.businessinventory.graphql.GetBusinessInventoryItemsQuery.Tax> taxes = merchantItem.getTaxes();
            com.paypal.oslo.feature.businessinventory.api.domain.model.TaxOption taxOption = (taxes == null || (tax = (com.paypal.oslo.feature.businessinventory.graphql.GetBusinessInventoryItemsQuery.Tax) kotlin.collections.CollectionsKt.firstOrNull((java.util.List) taxes)) == null) ? null : new com.paypal.oslo.feature.businessinventory.api.domain.model.TaxOption(tax.getId(), tax.getName(), java.lang.Double.parseDouble(tax.getPercent()));
            com.paypal.oslo.api.graphql.schema.type.MerchantItemType type = merchantItem.getType();
            int i = type == null ? -1 : com.paypal.oslo.feature.businessinventory.data.utils.GraphQLExtensionsKt.WhenMappings.$EnumSwitchMapping$0[type.ordinal()];
            if (i != -1) {
                if (i == 1) {
                    libraryItemType = com.paypal.oslo.feature.businessinventory.api.domain.model.LibraryItemType.PRODUCT;
                } else if (i == 2) {
                    libraryItemType = com.paypal.oslo.feature.businessinventory.api.domain.model.LibraryItemType.SERVICE;
                } else if (i != 3) {
                    throw new kotlin.NoWhenBranchMatchedException();
                }
                return new com.paypal.oslo.feature.businessinventory.api.domain.model.LibraryItem(id, name2, parseAsMoneyOrNull, taxOption, libraryItemType, merchantItem.getDescription());
            }
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Unknown merchant item type: '");
            sb.append(type);
            sb.append("'");
            throw new java.lang.IllegalArgumentException(sb.toString());
        }
        java.lang.String value = price.getValue();
        java.lang.Object currencyCode = price.getCurrencyCode();
        java.lang.StringBuilder sb2 = new java.lang.StringBuilder("Unable to parse price: value='");
        sb2.append(value);
        sb2.append("', currencyCode='");
        sb2.append(currencyCode);
        sb2.append("'");
        throw new java.lang.IllegalStateException(sb2.toString().toString());
    }

    public static final com.paypal.oslo.api.graphql.schema.type.MerchantItemType toMerchantItemType(com.paypal.oslo.feature.businessinventory.api.domain.model.LibraryItemType libraryItemType) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(libraryItemType, "");
        int i = com.paypal.oslo.feature.businessinventory.data.utils.GraphQLExtensionsKt.WhenMappings.$EnumSwitchMapping$1[libraryItemType.ordinal()];
        if (i == 1) {
            return com.paypal.oslo.api.graphql.schema.type.MerchantItemType.PRODUCT;
        }
        if (i != 2) {
            throw new kotlin.NoWhenBranchMatchedException();
        }
        return com.paypal.oslo.api.graphql.schema.type.MerchantItemType.SERVICE;
    }

    public static final com.paypal.oslo.api.graphql.schema.type.MoneyInput toMoneyInput(com.paypal.oslo.core.money.Money money) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(money, "");
        return new com.paypal.oslo.api.graphql.schema.type.MoneyInput(money.getCurrencyCode(), com.paypal.oslo.core.money.MoneyFormattingKt.formatAsDecimalNumber(money));
    }

    public static final java.lang.Exception toBusinessInventoryException(com.paypal.oslo.core.network.graphql.error.CallError callError) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(callError, "");
        if (callError instanceof com.paypal.oslo.core.network.graphql.error.CallError.GraphQL) {
            return new java.lang.Exception("GraphQL error: ".concat(java.lang.String.valueOf(arrow.core.NonEmptyList.m9607toStringimpl(((com.paypal.oslo.core.network.graphql.error.CallError.GraphQL) callError).m11659getErrors1X0FAY()))));
        }
        if (callError instanceof com.paypal.oslo.core.network.graphql.error.CallError.Network) {
            return new java.lang.Exception(com.paypal.oslo.feature.checkcapture.domain.error.CheckCaptureError.NETWORK_ERROR);
        }
        throw new kotlin.NoWhenBranchMatchedException();
    }

    @kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[com.paypal.oslo.api.graphql.schema.type.MerchantItemType.values().length];
            try {
                iArr[com.paypal.oslo.api.graphql.schema.type.MerchantItemType.PRODUCT.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[com.paypal.oslo.api.graphql.schema.type.MerchantItemType.SERVICE.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                iArr[com.paypal.oslo.api.graphql.schema.type.MerchantItemType.UNKNOWN__.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[com.paypal.oslo.feature.businessinventory.api.domain.model.LibraryItemType.values().length];
            try {
                iArr2[com.paypal.oslo.feature.businessinventory.api.domain.model.LibraryItemType.PRODUCT.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
            try {
                iArr2[com.paypal.oslo.feature.businessinventory.api.domain.model.LibraryItemType.SERVICE.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused5) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }
}
