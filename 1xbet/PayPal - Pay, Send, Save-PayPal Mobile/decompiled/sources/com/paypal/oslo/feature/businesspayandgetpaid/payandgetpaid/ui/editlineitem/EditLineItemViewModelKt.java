package com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.editlineitem;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0000¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/paypal/oslo/feature/businesspayandgetpaid/payandgetpaid/ui/editlineitem/EditLineItemUiState;", "Lcom/paypal/oslo/feature/businesspayandgetpaid/payandgetpaid/domain/model/LineItem;", "toLineItem", "(Lcom/paypal/oslo/feature/businesspayandgetpaid/payandgetpaid/ui/editlineitem/EditLineItemUiState;)Lcom/paypal/oslo/feature/businesspayandgetpaid/payandgetpaid/domain/model/LineItem;"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class EditLineItemViewModelKt {
    /* JADX WARN: Removed duplicated region for block: B:13:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x008a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.domain.model.LineItem toLineItem(com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.editlineitem.EditLineItemUiState editLineItemUiState) {
        com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.domain.model.Discount.Amount amount;
        java.lang.String str;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(editLineItemUiState, "");
        int i = com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.editlineitem.EditLineItemViewModelKt.WhenMappings.$EnumSwitchMapping$0[editLineItemUiState.getDiscountType().ordinal()];
        if (i != 1) {
            if (i == 2) {
                java.math.BigDecimal bigDecimalOrNull = kotlin.text.StringsKt.toBigDecimalOrNull(editLineItemUiState.getDiscountPercentage());
                if (bigDecimalOrNull != null && bigDecimalOrNull.compareTo(java.math.BigDecimal.ZERO) != 0) {
                    amount = new com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.domain.model.Discount.Percentage(bigDecimalOrNull);
                    com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.domain.model.Discount discount = amount;
                    java.lang.String catalogItemId = editLineItemUiState.getCatalogItemId();
                    java.lang.String itemName = editLineItemUiState.getItemName();
                    com.paypal.oslo.feature.businesspayandgetpaid.shared.domain.model.Tax tax = editLineItemUiState.getTax();
                    java.math.BigDecimal bigDecimal = new java.math.BigDecimal(editLineItemUiState.getQuantity());
                    java.lang.String price = editLineItemUiState.getPrice();
                    str = kotlin.text.StringsKt.isBlank(price) ? null : price;
                    if (str != null || (r0 = com.paypal.oslo.feature.businesspayandgetpaid.shared.monetary.GetPaidMoneyKt.asGetPaidMoney(str, editLineItemUiState.getCurrencyCode())) == null) {
                        com.paypal.oslo.feature.businesspayandgetpaid.shared.monetary.GetPaidMoney getPaidMoney = new com.paypal.oslo.feature.businesspayandgetpaid.shared.monetary.GetPaidMoney(0L, editLineItemUiState.getCurrencyCode());
                    }
                    return new com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.domain.model.LineItem(catalogItemId, itemName, getPaidMoney, bigDecimal, editLineItemUiState.getItemType(), editLineItemUiState.getDescription(), discount, tax);
                }
            } else if (i != 3) {
                throw new kotlin.NoWhenBranchMatchedException();
            }
            amount = null;
            com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.domain.model.Discount discount2 = amount;
            java.lang.String catalogItemId2 = editLineItemUiState.getCatalogItemId();
            java.lang.String itemName2 = editLineItemUiState.getItemName();
            com.paypal.oslo.feature.businesspayandgetpaid.shared.domain.model.Tax tax2 = editLineItemUiState.getTax();
            java.math.BigDecimal bigDecimal2 = new java.math.BigDecimal(editLineItemUiState.getQuantity());
            java.lang.String price2 = editLineItemUiState.getPrice();
            if (kotlin.text.StringsKt.isBlank(price2)) {
            }
            if (str != null) {
            }
            com.paypal.oslo.feature.businesspayandgetpaid.shared.monetary.GetPaidMoney getPaidMoney2 = new com.paypal.oslo.feature.businesspayandgetpaid.shared.monetary.GetPaidMoney(0L, editLineItemUiState.getCurrencyCode());
            return new com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.domain.model.LineItem(catalogItemId2, itemName2, getPaidMoney2, bigDecimal2, editLineItemUiState.getItemType(), editLineItemUiState.getDescription(), discount2, tax2);
        }
        if (!kotlin.text.StringsKt.isBlank(editLineItemUiState.getDiscountAmount())) {
            com.paypal.oslo.feature.businesspayandgetpaid.shared.monetary.GetPaidMoney asGetPaidMoney = com.paypal.oslo.feature.businesspayandgetpaid.shared.monetary.GetPaidMoneyKt.asGetPaidMoney(editLineItemUiState.getDiscountAmount(), editLineItemUiState.getCurrencyCode());
            if (!asGetPaidMoney.isZero()) {
                amount = new com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.domain.model.Discount.Amount(asGetPaidMoney);
                com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.domain.model.Discount discount22 = amount;
                java.lang.String catalogItemId22 = editLineItemUiState.getCatalogItemId();
                java.lang.String itemName22 = editLineItemUiState.getItemName();
                com.paypal.oslo.feature.businesspayandgetpaid.shared.domain.model.Tax tax22 = editLineItemUiState.getTax();
                java.math.BigDecimal bigDecimal22 = new java.math.BigDecimal(editLineItemUiState.getQuantity());
                java.lang.String price22 = editLineItemUiState.getPrice();
                if (kotlin.text.StringsKt.isBlank(price22)) {
                }
                if (str != null) {
                }
                com.paypal.oslo.feature.businesspayandgetpaid.shared.monetary.GetPaidMoney getPaidMoney22 = new com.paypal.oslo.feature.businesspayandgetpaid.shared.monetary.GetPaidMoney(0L, editLineItemUiState.getCurrencyCode());
                return new com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.domain.model.LineItem(catalogItemId22, itemName22, getPaidMoney22, bigDecimal22, editLineItemUiState.getItemType(), editLineItemUiState.getDescription(), discount22, tax22);
            }
        }
        amount = null;
        com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.domain.model.Discount discount222 = amount;
        java.lang.String catalogItemId222 = editLineItemUiState.getCatalogItemId();
        java.lang.String itemName222 = editLineItemUiState.getItemName();
        com.paypal.oslo.feature.businesspayandgetpaid.shared.domain.model.Tax tax222 = editLineItemUiState.getTax();
        java.math.BigDecimal bigDecimal222 = new java.math.BigDecimal(editLineItemUiState.getQuantity());
        java.lang.String price222 = editLineItemUiState.getPrice();
        if (kotlin.text.StringsKt.isBlank(price222)) {
        }
        if (str != null) {
        }
        com.paypal.oslo.feature.businesspayandgetpaid.shared.monetary.GetPaidMoney getPaidMoney222 = new com.paypal.oslo.feature.businesspayandgetpaid.shared.monetary.GetPaidMoney(0L, editLineItemUiState.getCurrencyCode());
        return new com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.domain.model.LineItem(catalogItemId222, itemName222, getPaidMoney222, bigDecimal222, editLineItemUiState.getItemType(), editLineItemUiState.getDescription(), discount222, tax222);
    }

    public static final /* synthetic */ com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.editlineitem.EditLineItemUiState access$toEditLineItemUiState(com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.domain.model.LineItem lineItem) {
        kotlin.Triple triple;
        com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.domain.model.Discount discount = lineItem.getDiscount();
        if (discount instanceof com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.domain.model.Discount.Amount) {
            triple = new kotlin.Triple(com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.editlineitem.DiscountType.AMOUNT, ((com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.domain.model.Discount.Amount) lineItem.getDiscount()).getAmount().formatAsNumberUnsigned(), "");
        } else if (discount instanceof com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.domain.model.Discount.Percentage) {
            triple = new kotlin.Triple(com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.editlineitem.DiscountType.PERCENTAGE, "", ((com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.domain.model.Discount.Percentage) lineItem.getDiscount()).getPercentage().toPlainString());
        } else {
            if (discount != null) {
                throw new kotlin.NoWhenBranchMatchedException();
            }
            triple = new kotlin.Triple(com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.editlineitem.DiscountType.NONE, "", "");
        }
        com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.editlineitem.DiscountType discountType = (com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.editlineitem.DiscountType) triple.component1();
        java.lang.String str = (java.lang.String) triple.component2();
        java.lang.String str2 = (java.lang.String) triple.component3();
        java.lang.String catalogItemId = lineItem.getCatalogItemId();
        java.lang.String name2 = lineItem.getName();
        java.lang.String plainString = com.paypal.oslo.core.money.Tax$$ExternalSyntheticBackportWithForwarding0.m(lineItem.getQuantity()).toPlainString();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(plainString, "");
        long value = lineItem.getUnitPrice().getValue();
        java.lang.String currencyCode = lineItem.getUnitPrice().getCurrencyCode();
        java.lang.String description = lineItem.getDescription();
        return new com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.editlineitem.EditLineItemUiState(false, catalogItemId, name2, plainString, java.lang.String.valueOf(value), lineItem.getTax(), currencyCode, description == null ? "" : description, lineItem.getType(), discountType, str, str2, null, null, null, 28673, null);
    }

    @kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.editlineitem.DiscountType.values().length];
            try {
                iArr[com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.editlineitem.DiscountType.AMOUNT.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.editlineitem.DiscountType.PERCENTAGE.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                iArr[com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.editlineitem.DiscountType.NONE.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }
}
