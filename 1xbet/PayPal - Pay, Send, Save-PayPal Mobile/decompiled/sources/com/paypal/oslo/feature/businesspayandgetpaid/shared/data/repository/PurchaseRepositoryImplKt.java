package com.paypal.oslo.feature.businesspayandgetpaid.shared.data.repository;

@kotlin.Metadata(d1 = {"\u0000\u0000"}, d2 = {}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class PurchaseRepositoryImplKt {
    public static final /* synthetic */ com.paypal.oslo.feature.businesspayandgetpaid.shared.domain.model.FetchedPurchase access$toDomainItem(com.paypal.oslo.feature.businesspayandgetpaid.shared.data.dto.GetPurchaseResponse getPurchaseResponse) {
        com.paypal.oslo.feature.businesspayandgetpaid.shared.domain.model.TransactionDetails transactionDetails;
        com.paypal.oslo.feature.businesspayandgetpaid.shared.data.dto.PurchaseAmountDto totalCommissionAmount;
        java.lang.String str;
        java.math.BigDecimal bigDecimal;
        com.paypal.oslo.feature.businesspayandgetpaid.shared.monetary.GetPaidMoney getPaidMoney;
        java.lang.String str2;
        java.util.Iterator it;
        java.math.BigDecimal bigDecimal2;
        com.paypal.oslo.feature.businesspayandgetpaid.shared.monetary.GetPaidMoney getPaidMoney2;
        java.lang.Integer percent;
        java.lang.String uuid = getPurchaseResponse.getUuid();
        java.lang.Integer purchaseNr = getPurchaseResponse.getPurchaseNr();
        java.lang.String valueOf = purchaseNr != null ? java.lang.String.valueOf(purchaseNr.intValue()) : null;
        java.lang.String originalPurchaseUuid = getPurchaseResponse.getOriginalPurchaseUuid();
        com.paypal.oslo.feature.businesspayandgetpaid.shared.domain.model.FetchedPurchaseState fromString = com.paypal.oslo.feature.businesspayandgetpaid.shared.domain.model.FetchedPurchaseState.INSTANCE.fromString(getPurchaseResponse.getState());
        java.lang.String created = getPurchaseResponse.getCreated();
        com.paypal.oslo.feature.businesspayandgetpaid.shared.data.dto.GetPurchaseDetailsDto purchaseDetails = getPurchaseResponse.getPurchaseDetails();
        java.util.List<com.paypal.oslo.feature.businesspayandgetpaid.shared.data.dto.PurchaseItemDto> items = purchaseDetails.getItems();
        java.util.ArrayList arrayList = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(items, 10));
        java.util.Iterator it2 = items.iterator();
        while (it2.hasNext()) {
            com.paypal.oslo.feature.businesspayandgetpaid.shared.data.dto.PurchaseItemDto purchaseItemDto = (com.paypal.oslo.feature.businesspayandgetpaid.shared.data.dto.PurchaseItemDto) it2.next();
            com.paypal.oslo.feature.businesspayandgetpaid.shared.data.dto.PurchaseAmountDto unitAmount = purchaseItemDto.getUnitAmount();
            com.paypal.oslo.feature.businesspayandgetpaid.shared.monetary.GetPaidMoney parseAsGetPaidMoneyOrThrow = com.paypal.oslo.feature.businesspayandgetpaid.shared.monetary.GetPaidMoneyKt.parseAsGetPaidMoneyOrThrow(unitAmount.getAmount(), unitAmount.getCurrency());
            java.math.BigDecimal bigDecimal3 = new java.math.BigDecimal(java.lang.String.valueOf(purchaseItemDto.getQuantity()));
            com.paypal.oslo.feature.businesspayandgetpaid.shared.monetary.GetPaidMoney times = parseAsGetPaidMoneyOrThrow.times(bigDecimal3);
            com.paypal.oslo.feature.businesspayandgetpaid.shared.data.dto.PurchaseDiscountDto discount = purchaseItemDto.getDiscount();
            if (discount == null || (percent = discount.getPercent()) == null) {
                str = valueOf;
                bigDecimal = null;
            } else {
                str = valueOf;
                bigDecimal = java.math.BigDecimal.valueOf(percent.intValue());
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(bigDecimal, "");
            }
            com.paypal.oslo.feature.businesspayandgetpaid.shared.data.dto.PurchaseDiscountDto discount2 = purchaseItemDto.getDiscount();
            if ((discount2 != null ? discount2.getAmount() : null) != null) {
                com.paypal.oslo.feature.businesspayandgetpaid.shared.data.dto.PurchaseAmountDto amount = purchaseItemDto.getDiscount().getAmount();
                getPaidMoney = com.paypal.oslo.feature.businesspayandgetpaid.shared.monetary.GetPaidMoneyKt.parseAsGetPaidMoneyOrThrow(amount.getAmount(), amount.getCurrency());
            } else if (bigDecimal != null) {
                java.math.BigDecimal divide = bigDecimal.divide(new java.math.BigDecimal(100));
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(divide, "");
                getPaidMoney = times.times(divide);
            } else {
                getPaidMoney = null;
            }
            com.paypal.oslo.feature.businesspayandgetpaid.shared.domain.model.FetchedDiscount fetchedDiscount = getPaidMoney != null ? new com.paypal.oslo.feature.businesspayandgetpaid.shared.domain.model.FetchedDiscount(bigDecimal, getPaidMoney) : null;
            com.paypal.oslo.feature.businesspayandgetpaid.shared.monetary.GetPaidMoney minus = getPaidMoney != null ? times.minus(getPaidMoney) : times;
            if (purchaseItemDto.getTax() != null) {
                str2 = created;
                it = it2;
                bigDecimal2 = java.math.BigDecimal.valueOf(r3.getPercent());
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(bigDecimal2, "");
            } else {
                str2 = created;
                it = it2;
                bigDecimal2 = null;
            }
            if (bigDecimal2 != null) {
                java.math.BigDecimal divide2 = bigDecimal2.divide(new java.math.BigDecimal(100));
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(divide2, "");
                getPaidMoney2 = minus.times(divide2);
            } else {
                getPaidMoney2 = null;
            }
            java.lang.String name2 = purchaseItemDto.getName();
            com.paypal.oslo.feature.businesspayandgetpaid.shared.data.dto.PurchaseTaxDto tax = purchaseItemDto.getTax();
            arrayList.add(new com.paypal.oslo.feature.businesspayandgetpaid.shared.domain.model.FetchedLineItem(name2, bigDecimal3, parseAsGetPaidMoneyOrThrow, times, minus, tax != null ? tax.getName() : null, bigDecimal2, getPaidMoney2, fetchedDiscount));
            valueOf = str;
            created = str2;
            it2 = it;
        }
        java.lang.String str3 = valueOf;
        java.lang.String str4 = created;
        java.util.ArrayList arrayList2 = arrayList;
        java.lang.String currency = purchaseDetails.getCurrency();
        com.paypal.oslo.feature.businesspayandgetpaid.shared.data.dto.PurchaseAmountDto totalAmount = purchaseDetails.getTotalAmount();
        com.paypal.oslo.feature.businesspayandgetpaid.shared.monetary.GetPaidMoney parseAsGetPaidMoneyOrThrow2 = totalAmount != null ? com.paypal.oslo.feature.businesspayandgetpaid.shared.monetary.GetPaidMoneyKt.parseAsGetPaidMoneyOrThrow(totalAmount.getAmount(), totalAmount.getCurrency()) : null;
        com.paypal.oslo.feature.businesspayandgetpaid.shared.data.dto.PurchaseAmountDto itemTotal = purchaseDetails.getItemTotal();
        com.paypal.oslo.feature.businesspayandgetpaid.shared.monetary.GetPaidMoney parseAsGetPaidMoneyOrThrow3 = itemTotal != null ? com.paypal.oslo.feature.businesspayandgetpaid.shared.monetary.GetPaidMoneyKt.parseAsGetPaidMoneyOrThrow(itemTotal.getAmount(), itemTotal.getCurrency()) : null;
        com.paypal.oslo.feature.businesspayandgetpaid.shared.data.dto.PurchaseAmountDto taxTotal = purchaseDetails.getTaxTotal();
        com.paypal.oslo.feature.businesspayandgetpaid.shared.monetary.GetPaidMoney parseAsGetPaidMoneyOrThrow4 = taxTotal != null ? com.paypal.oslo.feature.businesspayandgetpaid.shared.monetary.GetPaidMoneyKt.parseAsGetPaidMoneyOrThrow(taxTotal.getAmount(), taxTotal.getCurrency()) : null;
        com.paypal.oslo.feature.businesspayandgetpaid.shared.data.dto.PurchaseAmountDto itemDiscount = purchaseDetails.getItemDiscount();
        com.paypal.oslo.feature.businesspayandgetpaid.shared.domain.model.FetchedPurchaseDetails fetchedPurchaseDetails = new com.paypal.oslo.feature.businesspayandgetpaid.shared.domain.model.FetchedPurchaseDetails(arrayList2, currency, parseAsGetPaidMoneyOrThrow2, parseAsGetPaidMoneyOrThrow3, parseAsGetPaidMoneyOrThrow4, itemDiscount != null ? com.paypal.oslo.feature.businesspayandgetpaid.shared.monetary.GetPaidMoneyKt.parseAsGetPaidMoneyOrThrow(itemDiscount.getAmount(), itemDiscount.getCurrency()) : null);
        com.paypal.oslo.feature.businesspayandgetpaid.shared.data.dto.PaypalTransactionDetailsDto paypalTransactionDetails = getPurchaseResponse.getPaypalTransactionDetails();
        if (paypalTransactionDetails != null) {
            java.lang.String paypalTransactionId = paypalTransactionDetails.getPaypalTransactionId();
            com.paypal.oslo.feature.businesspayandgetpaid.shared.data.dto.PaypalTransactionFeeDto paypalTransactionFee = paypalTransactionDetails.getPaypalTransactionFee();
            com.paypal.oslo.feature.businesspayandgetpaid.shared.monetary.GetPaidMoney parseAsGetPaidMoneyOrThrow5 = (paypalTransactionFee == null || (totalCommissionAmount = paypalTransactionFee.getTotalCommissionAmount()) == null) ? null : com.paypal.oslo.feature.businesspayandgetpaid.shared.monetary.GetPaidMoneyKt.parseAsGetPaidMoneyOrThrow(totalCommissionAmount.getAmount(), totalCommissionAmount.getCurrency());
            com.paypal.oslo.feature.businesspayandgetpaid.shared.data.dto.PurchaseAmountDto merchantTotalAmount = paypalTransactionDetails.getMerchantTotalAmount();
            transactionDetails = new com.paypal.oslo.feature.businesspayandgetpaid.shared.domain.model.TransactionDetails(paypalTransactionId, parseAsGetPaidMoneyOrThrow5, merchantTotalAmount != null ? com.paypal.oslo.feature.businesspayandgetpaid.shared.monetary.GetPaidMoneyKt.parseAsGetPaidMoneyOrThrow(merchantTotalAmount.getAmount(), merchantTotalAmount.getCurrency()) : null);
        } else {
            transactionDetails = null;
        }
        return new com.paypal.oslo.feature.businesspayandgetpaid.shared.domain.model.FetchedPurchase(uuid, str3, originalPurchaseUuid, fromString, str4, fetchedPurchaseDetails, transactionDetails);
    }
}
