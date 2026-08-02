package com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.domain.model.invoicemanagement;

@kotlin.Metadata(d1 = {"\u0000\u0000"}, d2 = {}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class InvoiceKt {
    public static final /* synthetic */ com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.domain.model.TempAmount access$sumOfType(java.util.List list, com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.domain.model.invoicemanagement.TransactionType transactionType, java.lang.String str) {
        java.util.ArrayList<com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.domain.model.invoicemanagement.Transaction> arrayList = new java.util.ArrayList();
        for (java.lang.Object obj : list) {
            if (((com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.domain.model.invoicemanagement.Transaction) obj).getType() == transactionType) {
                arrayList.add(obj);
            }
        }
        java.math.BigDecimal bigDecimal = java.math.BigDecimal.ZERO;
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(bigDecimal, "");
        com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.domain.model.TempAmount tempAmount = new com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.domain.model.TempAmount(bigDecimal, str);
        for (com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.domain.model.invoicemanagement.Transaction transaction : arrayList) {
            if (transaction.getAmount() != null) {
                java.math.BigDecimal add = tempAmount.getValue().add(transaction.getAmount().getValue());
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(add, "");
                tempAmount = com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.domain.model.TempAmount.copy$default(tempAmount, add, null, 2, null);
            }
        }
        return tempAmount;
    }
}
