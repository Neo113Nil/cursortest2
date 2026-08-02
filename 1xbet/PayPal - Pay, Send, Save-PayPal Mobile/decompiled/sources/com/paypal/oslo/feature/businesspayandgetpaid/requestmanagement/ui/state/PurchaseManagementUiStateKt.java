package com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.ui.state;

@kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0015\u0010\u0005\u001a\u0004\u0018\u00010\u0004*\u00020\u0004H\u0002¢\u0006\u0004\b\u0005\u0010\u0006\u001a\u0013\u0010\u0002\u001a\u00020\b*\u00020\u0007H\u0000¢\u0006\u0004\b\u0002\u0010\t\u001a\u0013\u0010\f\u001a\u00020\u000b*\u00020\nH\u0000¢\u0006\u0004\b\f\u0010\r"}, d2 = {"Lcom/paypal/oslo/feature/businesspayandgetpaid/shared/domain/model/FetchedPurchase;", "Lcom/paypal/oslo/feature/businesspayandgetpaid/requestmanagement/ui/state/PurchaseManagementUiState;", "toUiState", "(Lcom/paypal/oslo/feature/businesspayandgetpaid/shared/domain/model/FetchedPurchase;)Lcom/paypal/oslo/feature/businesspayandgetpaid/requestmanagement/ui/state/PurchaseManagementUiState;", "", "Camera2StreamConfigurationMap", "(Ljava/lang/String;)Ljava/lang/String;", "Lcom/paypal/oslo/feature/businesspayandgetpaid/shared/domain/model/FetchedPurchaseState;", "Lcom/paypal/oslo/feature/businesspayandgetpaid/requestmanagement/ui/state/PurchaseStatusUiState;", "(Lcom/paypal/oslo/feature/businesspayandgetpaid/shared/domain/model/FetchedPurchaseState;)Lcom/paypal/oslo/feature/businesspayandgetpaid/requestmanagement/ui/state/PurchaseStatusUiState;", "Lcom/paypal/oslo/feature/businesspayandgetpaid/shared/domain/model/FetchedLineItem;", "Lcom/paypal/oslo/feature/businesspayandgetpaid/requestmanagement/ui/state/ItemUiState;", "toItemUiState", "(Lcom/paypal/oslo/feature/businesspayandgetpaid/shared/domain/model/FetchedLineItem;)Lcom/paypal/oslo/feature/businesspayandgetpaid/requestmanagement/ui/state/ItemUiState;"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class PurchaseManagementUiStateKt {
    public static final com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.ui.state.PurchaseManagementUiState toUiState(com.paypal.oslo.feature.businesspayandgetpaid.shared.domain.model.FetchedPurchase fetchedPurchase) {
        java.lang.String uuid;
        com.paypal.oslo.feature.businesspayandgetpaid.shared.monetary.GetPaidMoney merchantNetAmount;
        com.paypal.oslo.feature.businesspayandgetpaid.shared.monetary.GetPaidMoney totalFee;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(fetchedPurchase, "");
        com.paypal.oslo.feature.businesspayandgetpaid.shared.domain.model.FetchedPurchaseDetails purchaseDetails = fetchedPurchase.getPurchaseDetails();
        com.paypal.oslo.feature.businesspayandgetpaid.shared.domain.model.TransactionDetails transactionDetails = fetchedPurchase.getTransactionDetails();
        if (transactionDetails == null || (uuid = transactionDetails.getPaypalTransactionId()) == null) {
            uuid = fetchedPurchase.getUuid();
        }
        java.lang.String str = uuid;
        java.lang.String purchaseNr = fetchedPurchase.getPurchaseNr();
        java.lang.String str2 = purchaseNr == null ? "" : purchaseNr;
        com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.ui.state.PurchaseStatusUiState uiState = toUiState(fetchedPurchase.getState());
        java.util.List<com.paypal.oslo.feature.businesspayandgetpaid.shared.domain.model.FetchedLineItem> items = purchaseDetails.getItems();
        java.util.ArrayList arrayList = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(items, 10));
        java.util.Iterator<T> it = items.iterator();
        while (it.hasNext()) {
            arrayList.add(toItemUiState((com.paypal.oslo.feature.businesspayandgetpaid.shared.domain.model.FetchedLineItem) it.next()));
        }
        java.util.ArrayList arrayList2 = arrayList;
        java.lang.String createdDate = fetchedPurchase.getCreatedDate();
        java.lang.String Camera2StreamConfigurationMap = createdDate != null ? Camera2StreamConfigurationMap(createdDate) : null;
        java.lang.String str3 = Camera2StreamConfigurationMap == null ? "" : Camera2StreamConfigurationMap;
        com.paypal.oslo.feature.businesspayandgetpaid.shared.monetary.GetPaidMoney totalAmount = purchaseDetails.getTotalAmount();
        java.lang.String formatWithSymbol$default = totalAmount != null ? com.paypal.oslo.feature.businesspayandgetpaid.shared.monetary.GetPaidMoney.formatWithSymbol$default(totalAmount, null, 1, null) : null;
        java.lang.String str4 = formatWithSymbol$default == null ? "" : formatWithSymbol$default;
        com.paypal.oslo.feature.businesspayandgetpaid.shared.monetary.GetPaidMoney itemTotal = purchaseDetails.getItemTotal();
        java.lang.String formatWithSymbol$default2 = itemTotal != null ? com.paypal.oslo.feature.businesspayandgetpaid.shared.monetary.GetPaidMoney.formatWithSymbol$default(itemTotal, null, 1, null) : null;
        java.lang.String str5 = formatWithSymbol$default2 == null ? "" : formatWithSymbol$default2;
        com.paypal.oslo.feature.businesspayandgetpaid.shared.domain.model.TransactionDetails transactionDetails2 = fetchedPurchase.getTransactionDetails();
        java.lang.String formatAsNegativeNumberWithSymbol$default = (transactionDetails2 == null || (totalFee = transactionDetails2.getTotalFee()) == null) ? null : com.paypal.oslo.feature.businesspayandgetpaid.shared.monetary.GetPaidMoney.formatAsNegativeNumberWithSymbol$default(totalFee, null, 1, null);
        com.paypal.oslo.feature.businesspayandgetpaid.shared.domain.model.TransactionDetails transactionDetails3 = fetchedPurchase.getTransactionDetails();
        java.lang.String formatWithSymbol$default3 = (transactionDetails3 == null || (merchantNetAmount = transactionDetails3.getMerchantNetAmount()) == null) ? null : com.paypal.oslo.feature.businesspayandgetpaid.shared.monetary.GetPaidMoney.formatWithSymbol$default(merchantNetAmount, null, 1, null);
        com.paypal.oslo.feature.businesspayandgetpaid.shared.monetary.GetPaidMoney taxTotal = purchaseDetails.getTaxTotal();
        java.lang.String formatWithSymbol$default4 = taxTotal != null ? com.paypal.oslo.feature.businesspayandgetpaid.shared.monetary.GetPaidMoney.formatWithSymbol$default(taxTotal, null, 1, null) : null;
        com.paypal.oslo.feature.businesspayandgetpaid.shared.monetary.GetPaidMoney totalAmount2 = purchaseDetails.getTotalAmount();
        java.lang.String formatWithSymbol$default5 = totalAmount2 != null ? com.paypal.oslo.feature.businesspayandgetpaid.shared.monetary.GetPaidMoney.formatWithSymbol$default(totalAmount2, null, 1, null) : null;
        return new com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.ui.state.PurchaseManagementUiState(str, false, str2, uiState, arrayList2, str3, str4, str5, formatAsNegativeNumberWithSymbol$default, formatWithSymbol$default3, formatWithSymbol$default4, formatWithSymbol$default5 == null ? "" : formatWithSymbol$default5, null, false, false, false, false, false, fetchedPurchase.getCanRefund(), fetchedPurchase.getState() == com.paypal.oslo.feature.businesspayandgetpaid.shared.domain.model.FetchedPurchaseState.REFUND, fetchedPurchase.getOriginalPurchaseUuid(), 258048, null);
    }

    private static final java.lang.String Camera2StreamConfigurationMap(java.lang.String str) {
        try {
            java.text.SimpleDateFormat simpleDateFormat = new java.text.SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss", java.util.Locale.US);
            java.text.SimpleDateFormat simpleDateFormat2 = new java.text.SimpleDateFormat(com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.DateTimeFormatConstants.KEY_TRANSACTION_DATE_WITH_YEAR_FORMAT, java.util.Locale.getDefault());
            java.util.Date parse = simpleDateFormat.parse(kotlin.text.StringsKt.substringBefore$default(kotlin.text.StringsKt.substringBefore$default(str, org.bouncycastle.pqc.math.linearalgebra.Matrix.MATRIX_TYPE_ZERO, (java.lang.String) null, 2, (java.lang.Object) null), '+', (java.lang.String) null, 2, (java.lang.Object) null));
            if (parse != null) {
                return simpleDateFormat2.format(parse);
            }
        } catch (java.text.ParseException unused) {
        }
        return null;
    }

    public static final com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.ui.state.PurchaseStatusUiState toUiState(com.paypal.oslo.feature.businesspayandgetpaid.shared.domain.model.FetchedPurchaseState fetchedPurchaseState) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(fetchedPurchaseState, "");
        switch (com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.ui.state.PurchaseManagementUiStateKt.WhenMappings.$EnumSwitchMapping$0[fetchedPurchaseState.ordinal()]) {
            case 1:
                return new com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.ui.state.PurchaseStatusUiState(com.paypal.oslo.feature.businesspayandgetpaid.R.string.feature_business_pay_and_get_paid_status_draft, com.paypal.pds.components.BadgeStyle.Neutral.INSTANCE);
            case 2:
                return new com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.ui.state.PurchaseStatusUiState(com.paypal.oslo.feature.businesspayandgetpaid.R.string.feature_business_pay_and_get_paid_status_sent, com.paypal.pds.components.BadgeStyle.Info.INSTANCE);
            case 3:
            case 4:
                return new com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.ui.state.PurchaseStatusUiState(com.paypal.oslo.feature.businesspayandgetpaid.R.string.feature_business_pay_and_get_paid_status_paid, com.paypal.pds.components.BadgeStyle.Positive.INSTANCE);
            case 5:
                return new com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.ui.state.PurchaseStatusUiState(com.paypal.oslo.feature.businesspayandgetpaid.R.string.feature_business_pay_and_get_paid_status_refunded, com.paypal.pds.components.BadgeStyle.Positive.INSTANCE);
            case 6:
                return new com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.ui.state.PurchaseStatusUiState(com.paypal.oslo.feature.businesspayandgetpaid.R.string.feature_business_pay_and_get_paid_status_refund_in_progress, com.paypal.pds.components.BadgeStyle.Warning.INSTANCE);
            case 7:
                return new com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.ui.state.PurchaseStatusUiState(com.paypal.oslo.feature.businesspayandgetpaid.R.string.feature_business_pay_and_get_paid_refund, com.paypal.pds.components.BadgeStyle.Neutral.INSTANCE);
            default:
                throw new kotlin.NoWhenBranchMatchedException();
        }
    }

    public static final com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.ui.state.ItemUiState toItemUiState(com.paypal.oslo.feature.businesspayandgetpaid.shared.domain.model.FetchedLineItem fetchedLineItem) {
        java.lang.String str;
        java.math.BigDecimal m;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(fetchedLineItem, "");
        java.lang.String plainString = com.paypal.oslo.core.money.Tax$$ExternalSyntheticBackportWithForwarding0.m(fetchedLineItem.getQuantity()).toPlainString();
        com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.ui.state.ItemDiscountData itemDiscountData = null;
        java.lang.String formatWithSymbol$default = com.paypal.oslo.feature.businesspayandgetpaid.shared.monetary.GetPaidMoney.formatWithSymbol$default(fetchedLineItem.getUnitPrice(), null, 1, null);
        java.lang.String formatWithSymbol$default2 = com.paypal.oslo.feature.businesspayandgetpaid.shared.monetary.GetPaidMoney.formatWithSymbol$default(fetchedLineItem.getTotalAmount(), null, 1, null);
        if (fetchedLineItem.getTaxLabel() == null || fetchedLineItem.getTaxPercentage() == null || fetchedLineItem.getTaxAmount() == null) {
            str = null;
        } else {
            java.lang.String taxLabel = fetchedLineItem.getTaxLabel();
            java.lang.String plainString2 = com.paypal.oslo.core.money.Tax$$ExternalSyntheticBackportWithForwarding0.m(fetchedLineItem.getTaxPercentage()).toPlainString();
            java.lang.String formatWithSymbol$default3 = com.paypal.oslo.feature.businesspayandgetpaid.shared.monetary.GetPaidMoney.formatWithSymbol$default(fetchedLineItem.getTaxAmount(), null, 1, null);
            java.lang.StringBuilder sb = new java.lang.StringBuilder();
            sb.append(taxLabel);
            sb.append(" ");
            sb.append(plainString2);
            sb.append("% (");
            sb.append(formatWithSymbol$default3);
            sb.append(")");
            str = sb.toString();
        }
        com.paypal.oslo.feature.businesspayandgetpaid.shared.domain.model.FetchedDiscount discount = fetchedLineItem.getDiscount();
        if (discount != null) {
            java.math.BigDecimal percentage = discount.getPercentage();
            itemDiscountData = new com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.ui.state.ItemDiscountData((percentage == null || (m = com.paypal.oslo.core.money.Tax$$ExternalSyntheticBackportWithForwarding0.m(percentage)) == null) ? null : m.toPlainString(), com.paypal.oslo.feature.businesspayandgetpaid.shared.monetary.GetPaidMoney.formatWithSymbol$default(discount.getAmount(), null, 1, null));
        }
        com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.ui.state.ItemDiscountData itemDiscountData2 = itemDiscountData;
        java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
        java.lang.StringBuilder sb3 = new java.lang.StringBuilder();
        sb3.append(plainString);
        sb3.append(" x ");
        sb3.append(formatWithSymbol$default);
        sb2.append(sb3.toString());
        if (str != null) {
            sb2.append(com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.UIConstants.NEW_LINE);
            sb2.append(str);
        }
        java.lang.String obj = sb2.toString();
        java.lang.String name2 = fetchedLineItem.getName();
        kotlin.jvm.internal.Intrinsics.checkNotNull(plainString);
        return new com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.ui.state.ItemUiState(name2, plainString, formatWithSymbol$default, formatWithSymbol$default2, str, itemDiscountData2, obj);
    }

    @kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[com.paypal.oslo.feature.businesspayandgetpaid.shared.domain.model.FetchedPurchaseState.values().length];
            try {
                iArr[com.paypal.oslo.feature.businesspayandgetpaid.shared.domain.model.FetchedPurchaseState.DRAFT.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[com.paypal.oslo.feature.businesspayandgetpaid.shared.domain.model.FetchedPurchaseState.SENT.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                iArr[com.paypal.oslo.feature.businesspayandgetpaid.shared.domain.model.FetchedPurchaseState.PAID.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            try {
                iArr[com.paypal.oslo.feature.businesspayandgetpaid.shared.domain.model.FetchedPurchaseState.PENDING_CONFIRMATION.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
            try {
                iArr[com.paypal.oslo.feature.businesspayandgetpaid.shared.domain.model.FetchedPurchaseState.REFUNDED.ordinal()] = 5;
            } catch (java.lang.NoSuchFieldError unused5) {
            }
            try {
                iArr[com.paypal.oslo.feature.businesspayandgetpaid.shared.domain.model.FetchedPurchaseState.PENDING_REFUND_CONFIRMATION.ordinal()] = 6;
            } catch (java.lang.NoSuchFieldError unused6) {
            }
            try {
                iArr[com.paypal.oslo.feature.businesspayandgetpaid.shared.domain.model.FetchedPurchaseState.REFUND.ordinal()] = 7;
            } catch (java.lang.NoSuchFieldError unused7) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }
}
