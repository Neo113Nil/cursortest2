package com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.ui.invoiceaction;

@kotlin.Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\u001a\u0019\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\u0000¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u0013\u0010\u0007\u001a\u00020\u0006*\u00020\u0005H\u0000¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lcom/paypal/oslo/feature/businesspayandgetpaid/requestmanagement/domain/model/invoicemanagement/Invoice;", "", "Lcom/paypal/oslo/feature/businesspayandgetpaid/requestmanagement/ui/invoiceaction/InvoiceAction;", com.datadog.android.rum.internal.metric.SessionEndedMetric.NO_VIEW_EVENTS_COUNT_ACTIONS_KEY, "(Lcom/paypal/oslo/feature/businesspayandgetpaid/requestmanagement/domain/model/invoicemanagement/Invoice;)Ljava/util/List;", "Lcom/paypal/oslo/feature/businesspayandgetpaid/requestmanagement/domain/model/TempAmount;", "", "isPositive", "(Lcom/paypal/oslo/feature/businesspayandgetpaid/requestmanagement/domain/model/TempAmount;)Z"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class InvoiceActionKt {
    /* JADX WARN: Removed duplicated region for block: B:27:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00c6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final java.util.List<com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.ui.invoiceaction.InvoiceAction> actions(com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.domain.model.invoicemanagement.Invoice invoice) {
        com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.domain.model.TempAmount dueAmount;
        com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.domain.model.invoicemanagement.InvoicePayments payments;
        java.util.List<com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.domain.model.invoicemanagement.Transaction> transactions;
        java.util.List<com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.domain.model.invoicemanagement.Transaction> list;
        java.util.Iterator<T> it;
        int i;
        java.util.List<com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.domain.model.invoicemanagement.Transaction> transactions2;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(invoice, "");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        switch (com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.ui.invoiceaction.InvoiceActionKt.WhenMappings.$EnumSwitchMapping$0[invoice.getStatus().ordinal()]) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
                com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.domain.model.TempAmount dueAmount2 = invoice.getDueAmount();
                if (dueAmount2 != null && isPositive(dueAmount2)) {
                    arrayList.add(com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.ui.invoiceaction.InvoiceAction.RecordPayment.INSTANCE);
                }
                com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.domain.model.invoicemanagement.InvoicePayments payments2 = invoice.getPayments();
                if (payments2 != null && (transactions2 = payments2.getTransactions()) != null) {
                    java.util.List<com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.domain.model.invoicemanagement.Transaction> list2 = transactions2;
                    if (!(list2 instanceof java.util.Collection) || !list2.isEmpty()) {
                        java.util.Iterator<T> it2 = list2.iterator();
                        while (it2.hasNext()) {
                            if (((com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.domain.model.invoicemanagement.Transaction) it2.next()).getType() == com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.domain.model.invoicemanagement.TransactionType.PAYPAL) {
                            }
                        }
                    }
                    payments = invoice.getPayments();
                    if (payments != null && (transactions = payments.getTransactions()) != null) {
                        list = transactions;
                        if ((list instanceof java.util.Collection) || !list.isEmpty()) {
                            it = list.iterator();
                            i = 0;
                            while (it.hasNext()) {
                                if (((com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.domain.model.invoicemanagement.Transaction) it.next()).getType() == com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.domain.model.invoicemanagement.TransactionType.PAYPAL && (i = i + 1) < 0) {
                                    kotlin.collections.CollectionsKt.throwCountOverflow();
                                }
                            }
                            if (i == 1) {
                                java.math.BigDecimal subtract = invoice.getPaymentAmountPayPal().getValue().subtract(invoice.getRefundAmountPayPal().getValue());
                                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(subtract, "");
                                if (subtract.compareTo(java.math.BigDecimal.ZERO) > 0) {
                                    arrayList.add(com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.ui.invoiceaction.InvoiceAction.Refund.INSTANCE);
                                    break;
                                }
                            }
                        }
                    }
                }
                java.math.BigDecimal subtract2 = invoice.getPaymentAmountExternal().getValue().subtract(invoice.getRefundAmountExternal().getValue());
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(subtract2, "");
                if (subtract2.compareTo(java.math.BigDecimal.ZERO) > 0) {
                    arrayList.add(com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.ui.invoiceaction.InvoiceAction.RecordRefund.INSTANCE);
                }
                payments = invoice.getPayments();
                if (payments != null) {
                    list = transactions;
                    if (list instanceof java.util.Collection) {
                    }
                    it = list.iterator();
                    i = 0;
                    while (it.hasNext()) {
                    }
                    if (i == 1) {
                    }
                }
                break;
        }
        if ((invoice.getStatus() == com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.domain.model.invoicemanagement.InvoiceStatus.PARTIALLY_PAID || invoice.getStatus() == com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.domain.model.invoicemanagement.InvoiceStatus.PARTIALLY_REFUNDED || invoice.getStatus() == com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.domain.model.invoicemanagement.InvoiceStatus.SENT || invoice.getStatus() == com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.domain.model.invoicemanagement.InvoiceStatus.UNPAID) && (dueAmount = invoice.getDueAmount()) != null && isPositive(dueAmount)) {
            arrayList.add(com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.ui.invoiceaction.InvoiceAction.Edit.INSTANCE);
        }
        arrayList.add(com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.ui.invoiceaction.InvoiceAction.Duplicate.INSTANCE);
        return arrayList;
    }

    public static final boolean isPositive(com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.domain.model.TempAmount tempAmount) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(tempAmount, "");
        return tempAmount.getValue().compareTo(java.math.BigDecimal.ZERO) > 0;
    }

    @kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.domain.model.invoicemanagement.InvoiceStatus.values().length];
            try {
                iArr[com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.domain.model.invoicemanagement.InvoiceStatus.PARTIALLY_PAID.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.domain.model.invoicemanagement.InvoiceStatus.SENT.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                iArr[com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.domain.model.invoicemanagement.InvoiceStatus.UNPAID.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            try {
                iArr[com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.domain.model.invoicemanagement.InvoiceStatus.CANCELLED.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
            try {
                iArr[com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.domain.model.invoicemanagement.InvoiceStatus.MARKED_AS_PAID.ordinal()] = 5;
            } catch (java.lang.NoSuchFieldError unused5) {
            }
            try {
                iArr[com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.domain.model.invoicemanagement.InvoiceStatus.MARKED_AS_REFUNDED.ordinal()] = 6;
            } catch (java.lang.NoSuchFieldError unused6) {
            }
            try {
                iArr[com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.domain.model.invoicemanagement.InvoiceStatus.PAID.ordinal()] = 7;
            } catch (java.lang.NoSuchFieldError unused7) {
            }
            try {
                iArr[com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.domain.model.invoicemanagement.InvoiceStatus.PARTIALLY_REFUNDED.ordinal()] = 8;
            } catch (java.lang.NoSuchFieldError unused8) {
            }
            try {
                iArr[com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.domain.model.invoicemanagement.InvoiceStatus.REFUNDED.ordinal()] = 9;
            } catch (java.lang.NoSuchFieldError unused9) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }
}
