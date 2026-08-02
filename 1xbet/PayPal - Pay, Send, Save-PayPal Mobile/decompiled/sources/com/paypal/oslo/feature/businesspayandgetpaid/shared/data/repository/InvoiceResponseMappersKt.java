package com.paypal.oslo.feature.businesspayandgetpaid.shared.data.repository;

@kotlin.Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a!\u0010\t\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\n\u001a\u0015\u0010\t\u001a\u0004\u0018\u00010\u000b*\u00020\u0004H\u0002¢\u0006\u0004\b\t\u0010\f\u001a\u0013\u0010\u000f\u001a\u00020\u000e*\u00020\rH\u0000¢\u0006\u0004\b\u000f\u0010\u0010\u001a\u001d\u0010\u0012\u001a\u0004\u0018\u00010\u000b*\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0012\u0010\u0013\" \u0010\u0018\u001a\u000e\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u00160\u00148\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u0017"}, d2 = {"Lcom/paypal/oslo/feature/businesspayandgetpaid/graphql/fragment/InvoiceFragment;", "Lcom/paypal/oslo/feature/businesspayandgetpaid/requestmanagement/domain/model/invoicemanagement/Invoice;", "toInvoiceDetails", "(Lcom/paypal/oslo/feature/businesspayandgetpaid/graphql/fragment/InvoiceFragment;)Lcom/paypal/oslo/feature/businesspayandgetpaid/requestmanagement/domain/model/invoicemanagement/Invoice;", "", "p0", "", "p1", "Lcom/paypal/oslo/feature/businesspayandgetpaid/requestmanagement/domain/model/TempAmount;", "getHighSpeedVideoFpsRangesFor", "(Ljava/lang/String;Ljava/lang/Object;)Lcom/paypal/oslo/feature/businesspayandgetpaid/requestmanagement/domain/model/TempAmount;", "Ljava/util/Date;", "(Ljava/lang/String;)Ljava/util/Date;", "Lcom/paypal/oslo/feature/businesspayandgetpaid/graphql/GetInvoiceConditionalRulesQuery$InvoiceConditionalRules;", "Lcom/paypal/oslo/feature/businesspayandgetpaid/requestmanagement/domain/model/invoicemanagement/InvoiceConditionalRules;", "toInvoiceRules", "(Lcom/paypal/oslo/feature/businesspayandgetpaid/graphql/GetInvoiceConditionalRulesQuery$InvoiceConditionalRules;)Lcom/paypal/oslo/feature/businesspayandgetpaid/requestmanagement/domain/model/invoicemanagement/InvoiceConditionalRules;", "Ljava/util/TimeZone;", "getHighResolutionOutputSizeshNQ4ISI", "(Ljava/lang/String;Ljava/util/TimeZone;)Ljava/util/Date;", "", "Lcom/paypal/oslo/api/graphql/schema/type/InvoiceStatus;", "Lcom/paypal/oslo/feature/businesspayandgetpaid/requestmanagement/domain/model/invoicemanagement/InvoiceStatus;", "Ljava/util/Map;", "getHighSpeedVideoFpsRanges"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class InvoiceResponseMappersKt {
    private static final java.util.Map<com.paypal.oslo.api.graphql.schema.type.InvoiceStatus, com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.domain.model.invoicemanagement.InvoiceStatus> getHighSpeedVideoFpsRangesFor = kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to(com.paypal.oslo.api.graphql.schema.type.InvoiceStatus.DRAFT, com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.domain.model.invoicemanagement.InvoiceStatus.DRAFT), kotlin.TuplesKt.to(com.paypal.oslo.api.graphql.schema.type.InvoiceStatus.SENT, com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.domain.model.invoicemanagement.InvoiceStatus.SENT), kotlin.TuplesKt.to(com.paypal.oslo.api.graphql.schema.type.InvoiceStatus.SCHEDULED, com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.domain.model.invoicemanagement.InvoiceStatus.SCHEDULED), kotlin.TuplesKt.to(com.paypal.oslo.api.graphql.schema.type.InvoiceStatus.PAID, com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.domain.model.invoicemanagement.InvoiceStatus.PAID), kotlin.TuplesKt.to(com.paypal.oslo.api.graphql.schema.type.InvoiceStatus.MARKED_AS_PAID, com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.domain.model.invoicemanagement.InvoiceStatus.MARKED_AS_PAID), kotlin.TuplesKt.to(com.paypal.oslo.api.graphql.schema.type.InvoiceStatus.CANCELLED, com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.domain.model.invoicemanagement.InvoiceStatus.CANCELLED), kotlin.TuplesKt.to(com.paypal.oslo.api.graphql.schema.type.InvoiceStatus.REFUNDED, com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.domain.model.invoicemanagement.InvoiceStatus.REFUNDED), kotlin.TuplesKt.to(com.paypal.oslo.api.graphql.schema.type.InvoiceStatus.PARTIALLY_PAID, com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.domain.model.invoicemanagement.InvoiceStatus.PARTIALLY_PAID), kotlin.TuplesKt.to(com.paypal.oslo.api.graphql.schema.type.InvoiceStatus.PARTIALLY_REFUNDED, com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.domain.model.invoicemanagement.InvoiceStatus.PARTIALLY_REFUNDED), kotlin.TuplesKt.to(com.paypal.oslo.api.graphql.schema.type.InvoiceStatus.MARKED_AS_REFUNDED, com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.domain.model.invoicemanagement.InvoiceStatus.MARKED_AS_REFUNDED), kotlin.TuplesKt.to(com.paypal.oslo.api.graphql.schema.type.InvoiceStatus.UNPAID, com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.domain.model.invoicemanagement.InvoiceStatus.UNPAID), kotlin.TuplesKt.to(com.paypal.oslo.api.graphql.schema.type.InvoiceStatus.PAYMENT_PENDING, com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.domain.model.invoicemanagement.InvoiceStatus.PAYMENT_PENDING), kotlin.TuplesKt.to(com.paypal.oslo.api.graphql.schema.type.InvoiceStatus.AUTO_CANCELLED, com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.domain.model.invoicemanagement.InvoiceStatus.AUTOCANCELLED), kotlin.TuplesKt.to(com.paypal.oslo.api.graphql.schema.type.InvoiceStatus.PAID_EXTERNAL, com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.domain.model.invoicemanagement.InvoiceStatus.PAID), kotlin.TuplesKt.to(com.paypal.oslo.api.graphql.schema.type.InvoiceStatus.REFUNDED_EXTERNAL, com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.domain.model.invoicemanagement.InvoiceStatus.REFUNDED), kotlin.TuplesKt.to(com.paypal.oslo.api.graphql.schema.type.InvoiceStatus.SHARED, com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.domain.model.invoicemanagement.InvoiceStatus.SENT), kotlin.TuplesKt.to(com.paypal.oslo.api.graphql.schema.type.InvoiceStatus.UNKNOWN__, com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.domain.model.invoicemanagement.InvoiceStatus.UNKNOWN));

    /* JADX WARN: Multi-variable type inference failed */
    public static final com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.domain.model.invoicemanagement.Invoice toInvoiceDetails(com.paypal.oslo.feature.businesspayandgetpaid.graphql.fragment.InvoiceFragment invoiceFragment) {
        com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.domain.model.AmountBreakdown.DiscountBreakdown discountBreakdown;
        java.lang.String str;
        com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.domain.model.invoicemanagement.PaymentTerm paymentTerm;
        java.util.ArrayList arrayList;
        java.util.ArrayList arrayList2;
        com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.domain.model.invoicemanagement.InvoiceConfiguration invoiceConfiguration;
        com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.domain.model.invoicemanagement.InvoicePayments invoicePayments;
        com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.domain.model.invoicemanagement.InvoiceRefunds invoiceRefunds;
        com.paypal.oslo.feature.businesspayandgetpaid.graphql.fragment.MoneyFragment moneyFragment;
        java.util.ArrayList arrayList3;
        java.util.Iterator it;
        java.lang.String str2;
        com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.domain.model.invoicemanagement.Transaction transaction;
        com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.domain.model.TempAmount tempAmount;
        com.paypal.oslo.feature.businesspayandgetpaid.graphql.fragment.MoneyFragment moneyFragment2;
        com.paypal.oslo.feature.businesspayandgetpaid.graphql.fragment.MoneyFragment moneyFragment3;
        java.util.ArrayList arrayList4;
        java.util.Iterator it2;
        com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.domain.model.invoicemanagement.Transaction transaction2;
        com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.domain.model.TempAmount tempAmount2;
        com.paypal.oslo.feature.businesspayandgetpaid.graphql.fragment.MoneyFragment moneyFragment4;
        com.paypal.oslo.feature.businesspayandgetpaid.graphql.fragment.MoneyFragment moneyFragment5;
        com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.domain.model.Item.UnitOfMeasure unitOfMeasure;
        com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.domain.model.Item.UnitOfMeasure unitOfMeasure2;
        com.paypal.oslo.feature.businesspayandgetpaid.graphql.fragment.InvoiceFragment.Price price;
        com.paypal.oslo.feature.businesspayandgetpaid.graphql.fragment.MoneyFragment moneyFragment6;
        com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.domain.model.invoicemanagement.Recipient.RecipientInfo recipientInfo;
        java.util.ArrayList arrayList5;
        java.lang.String countryCode;
        java.lang.String nationalNumber;
        com.paypal.oslo.feature.businesspayandgetpaid.graphql.fragment.InvoiceFragment.PaymentTerm paymentTerm2;
        java.lang.String invoiceDate;
        com.paypal.oslo.feature.businesspayandgetpaid.graphql.fragment.MoneyFragment moneyFragment7;
        com.paypal.oslo.feature.businesspayandgetpaid.graphql.fragment.MoneyFragment moneyFragment8;
        com.paypal.oslo.feature.businesspayandgetpaid.graphql.fragment.MoneyFragment moneyFragment9;
        com.paypal.oslo.feature.businesspayandgetpaid.graphql.fragment.MoneyFragment moneyFragment10;
        com.paypal.oslo.feature.businesspayandgetpaid.graphql.fragment.MoneyFragment moneyFragment11;
        com.paypal.oslo.feature.businesspayandgetpaid.graphql.fragment.MoneyFragment moneyFragment12;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(invoiceFragment, "");
        java.lang.String id = invoiceFragment.getId();
        com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.domain.model.invoicemanagement.InvoiceStatus invoiceStatus = getHighSpeedVideoFpsRangesFor.get(invoiceFragment.getStatus());
        if (invoiceStatus == null) {
            invoiceStatus = com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.domain.model.invoicemanagement.InvoiceStatus.UNKNOWN;
        }
        com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.domain.model.invoicemanagement.InvoiceStatus invoiceStatus2 = invoiceStatus;
        com.paypal.oslo.feature.businesspayandgetpaid.graphql.fragment.InvoiceFragment.Amount amount = invoiceFragment.getAmountBreakDown().getAmount();
        java.lang.String str3 = null;
        com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.domain.model.TempAmount highSpeedVideoFpsRangesFor = (amount == null || (moneyFragment12 = amount.getMoneyFragment()) == null) ? null : getHighSpeedVideoFpsRangesFor(moneyFragment12.getValue(), moneyFragment12.getCurrencyCode());
        com.paypal.oslo.feature.businesspayandgetpaid.graphql.fragment.InvoiceFragment.DueAmount dueAmount = invoiceFragment.getAmountBreakDown().getDueAmount();
        com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.domain.model.TempAmount highSpeedVideoFpsRangesFor2 = (dueAmount == null || (moneyFragment11 = dueAmount.getMoneyFragment()) == null) ? null : getHighSpeedVideoFpsRangesFor(moneyFragment11.getValue(), moneyFragment11.getCurrencyCode());
        com.paypal.oslo.feature.businesspayandgetpaid.graphql.fragment.InvoiceFragment.AmountBreakDown amountBreakDown = invoiceFragment.getAmountBreakDown();
        com.paypal.oslo.feature.businesspayandgetpaid.graphql.fragment.InvoiceFragment.ItemTotal itemTotal = amountBreakDown.getItemTotal();
        com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.domain.model.TempAmount highSpeedVideoFpsRangesFor3 = (itemTotal == null || (moneyFragment10 = itemTotal.getMoneyFragment()) == null) ? null : getHighSpeedVideoFpsRangesFor(moneyFragment10.getValue(), moneyFragment10.getCurrencyCode());
        if (amountBreakDown.getInvoiceDiscount() != null) {
            com.paypal.oslo.feature.businesspayandgetpaid.graphql.fragment.InvoiceFragment.ItemDiscount itemDiscount = amountBreakDown.getItemDiscount();
            discountBreakdown = new com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.domain.model.AmountBreakdown.DiscountBreakdown(null, (itemDiscount == null || (moneyFragment9 = itemDiscount.getMoneyFragment()) == null) ? null : getHighSpeedVideoFpsRangesFor(moneyFragment9.getValue(), moneyFragment9.getCurrencyCode()));
        } else {
            discountBreakdown = null;
        }
        com.paypal.oslo.feature.businesspayandgetpaid.graphql.fragment.InvoiceFragment.TaxTotal taxTotal = amountBreakDown.getTaxTotal();
        com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.domain.model.TempAmount highSpeedVideoFpsRangesFor4 = (taxTotal == null || (moneyFragment8 = taxTotal.getMoneyFragment()) == null) ? null : getHighSpeedVideoFpsRangesFor(moneyFragment8.getValue(), moneyFragment8.getCurrencyCode());
        com.paypal.oslo.feature.businesspayandgetpaid.graphql.fragment.InvoiceFragment.ShippingAmount shippingAmount = amountBreakDown.getShippingAmount();
        com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.domain.model.AmountBreakdown amountBreakdown = new com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.domain.model.AmountBreakdown(highSpeedVideoFpsRangesFor3, discountBreakdown, highSpeedVideoFpsRangesFor4, (shippingAmount == null || (moneyFragment7 = shippingAmount.getMoneyFragment()) == null) ? null : new com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.domain.model.AmountBreakdown.Shipping(getHighSpeedVideoFpsRangesFor(moneyFragment7.getValue(), moneyFragment7.getCurrencyCode()), null), null);
        com.paypal.oslo.feature.businesspayandgetpaid.graphql.fragment.InvoiceFragment.Detail detail = invoiceFragment.getDetail();
        if (detail == null || (str = detail.getCurrencyCode()) == null) {
            str = "USD";
        }
        java.lang.String str4 = str;
        java.lang.String invoiceNumber = detail != null ? detail.getInvoiceNumber() : null;
        java.util.Date highSpeedVideoFpsRangesFor5 = (detail == null || (invoiceDate = detail.getInvoiceDate()) == null) ? null : getHighSpeedVideoFpsRangesFor(invoiceDate);
        java.lang.String note = detail != null ? detail.getNote() : null;
        if (detail == null || (paymentTerm2 = detail.getPaymentTerm()) == null) {
            paymentTerm = null;
        } else {
            java.lang.String dueDate = paymentTerm2.getDueDate();
            paymentTerm = new com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.domain.model.invoicemanagement.PaymentTerm(dueDate != null ? getHighSpeedVideoFpsRangesFor(dueDate) : null);
        }
        com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.domain.model.invoicemanagement.InvoiceDetail invoiceDetail = new com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.domain.model.invoicemanagement.InvoiceDetail(str4, invoiceNumber, highSpeedVideoFpsRangesFor5, note, paymentTerm);
        java.util.List<com.paypal.oslo.feature.businesspayandgetpaid.graphql.fragment.InvoiceFragment.PrimaryRecipient> primaryRecipients = invoiceFragment.getPrimaryRecipients();
        if (primaryRecipients != null) {
            java.util.List<com.paypal.oslo.feature.businesspayandgetpaid.graphql.fragment.InvoiceFragment.PrimaryRecipient> list = primaryRecipients;
            java.util.ArrayList arrayList6 = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(list, 10));
            java.util.Iterator<T> it3 = list.iterator();
            while (it3.hasNext()) {
                com.paypal.oslo.feature.businesspayandgetpaid.graphql.fragment.InvoiceFragment.BillingDetails billingDetails = ((com.paypal.oslo.feature.businesspayandgetpaid.graphql.fragment.InvoiceFragment.PrimaryRecipient) it3.next()).getBillingDetails();
                if (billingDetails != null) {
                    com.paypal.oslo.feature.businesspayandgetpaid.graphql.fragment.InvoiceFragment.Name name2 = billingDetails.getName();
                    com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.domain.model.invoicemanagement.Recipient.RecipientName recipientName = name2 != null ? new com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.domain.model.invoicemanagement.Recipient.RecipientName(name2.getGivenName(), name2.getSurname()) : str3;
                    java.lang.Object email = billingDetails.getEmail();
                    java.lang.String obj = email != null ? email.toString() : str3;
                    java.util.List<com.paypal.oslo.feature.businesspayandgetpaid.graphql.fragment.InvoiceFragment.Phone> phones = billingDetails.getPhones();
                    if (phones != null) {
                        java.util.ArrayList arrayList7 = new java.util.ArrayList();
                        for (com.paypal.oslo.feature.businesspayandgetpaid.graphql.fragment.InvoiceFragment.Phone phone : phones) {
                            com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.domain.model.invoicemanagement.Recipient.RecipientPhoneNumber recipientPhoneNumber = (phone == null || (countryCode = phone.getCountryCode()) == null || (nationalNumber = phone.getNationalNumber()) == null) ? null : new com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.domain.model.invoicemanagement.Recipient.RecipientPhoneNumber(countryCode, nationalNumber);
                            if (recipientPhoneNumber != null) {
                                arrayList7.add(recipientPhoneNumber);
                            }
                        }
                        arrayList5 = arrayList7;
                    } else {
                        arrayList5 = null;
                    }
                    recipientInfo = new com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.domain.model.invoicemanagement.Recipient.RecipientInfo(recipientName, obj, arrayList5);
                } else {
                    recipientInfo = null;
                }
                arrayList6.add(new com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.domain.model.invoicemanagement.Recipient(recipientInfo));
                str3 = null;
            }
            arrayList = arrayList6;
        } else {
            arrayList = null;
        }
        java.util.List<com.paypal.oslo.feature.businesspayandgetpaid.graphql.fragment.InvoiceFragment.Item> items = invoiceFragment.getItems();
        if (items != null) {
            java.util.List<com.paypal.oslo.feature.businesspayandgetpaid.graphql.fragment.InvoiceFragment.Item> list2 = items;
            java.util.ArrayList arrayList8 = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(list2, 10));
            for (com.paypal.oslo.feature.businesspayandgetpaid.graphql.fragment.InvoiceFragment.Item item : list2) {
                com.paypal.oslo.feature.businesspayandgetpaid.graphql.fragment.InvoiceFragment.Item1 item2 = item.getItem();
                java.lang.String name3 = item2 != null ? item2.getName() : null;
                java.lang.String quantity = item.getQuantity();
                com.paypal.oslo.feature.businesspayandgetpaid.graphql.fragment.InvoiceFragment.Item1 item3 = item.getItem();
                com.paypal.oslo.feature.businesspayandgetpaid.shared.monetary.GetPaidMoney parseAsGetPaidMoneyOrNull = (item3 == null || (price = item3.getPrice()) == null || (moneyFragment6 = price.getMoneyFragment()) == null) ? null : com.paypal.oslo.feature.businesspayandgetpaid.shared.monetary.GetPaidMoneyKt.parseAsGetPaidMoneyOrNull(moneyFragment6.getValue(), moneyFragment6.getCurrencyCode().toString());
                com.paypal.oslo.api.graphql.schema.type.InvoiceItemUnitOfMeasure unitOfMeasure3 = item.getUnitOfMeasure();
                if (unitOfMeasure3 != null) {
                    int i = com.paypal.oslo.feature.businesspayandgetpaid.shared.data.repository.InvoiceResponseMappersKt.WhenMappings.$EnumSwitchMapping$0[unitOfMeasure3.ordinal()];
                    if (i != 1) {
                        if (i == 2) {
                            unitOfMeasure2 = com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.domain.model.Item.UnitOfMeasure.HOURS;
                        } else if (i == 3) {
                            unitOfMeasure2 = com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.domain.model.Item.UnitOfMeasure.AMOUNT;
                        } else if (i != 4) {
                            throw new kotlin.NoWhenBranchMatchedException();
                        }
                        unitOfMeasure = unitOfMeasure2;
                    }
                    unitOfMeasure2 = com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.domain.model.Item.UnitOfMeasure.QUANTITY;
                    unitOfMeasure = unitOfMeasure2;
                } else {
                    unitOfMeasure = null;
                }
                arrayList8.add(new com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.domain.model.Item(name3, quantity, parseAsGetPaidMoneyOrNull, null, null, unitOfMeasure));
            }
            arrayList2 = arrayList8;
        } else {
            arrayList2 = null;
        }
        com.paypal.oslo.feature.businesspayandgetpaid.graphql.fragment.InvoiceFragment.Configuration configuration = invoiceFragment.getConfiguration();
        if (configuration != null) {
            java.lang.Boolean allowTip = configuration.getAllowTip();
            boolean booleanValue = allowTip != null ? allowTip.booleanValue() : false;
            java.lang.Boolean taxCalculatedAfterDiscount = configuration.getTaxCalculatedAfterDiscount();
            boolean booleanValue2 = taxCalculatedAfterDiscount != null ? taxCalculatedAfterDiscount.booleanValue() : false;
            java.lang.Boolean taxInclusive = configuration.getTaxInclusive();
            boolean booleanValue3 = taxInclusive != null ? taxInclusive.booleanValue() : false;
            java.lang.Boolean conditional = configuration.getConditional();
            invoiceConfiguration = new com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.domain.model.invoicemanagement.InvoiceConfiguration(booleanValue, booleanValue2, booleanValue3, conditional != null ? conditional.booleanValue() : false);
        } else {
            invoiceConfiguration = null;
        }
        com.paypal.oslo.feature.businesspayandgetpaid.graphql.fragment.InvoiceFragment.Payments payments = invoiceFragment.getPayments();
        java.lang.String str5 = "PAYPAL";
        if (payments != null) {
            com.paypal.oslo.feature.businesspayandgetpaid.graphql.fragment.InvoiceFragment.TotalAmountPaid totalAmountPaid = payments.getTotalAmountPaid();
            com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.domain.model.TempAmount highSpeedVideoFpsRangesFor6 = (totalAmountPaid == null || (moneyFragment5 = totalAmountPaid.getMoneyFragment()) == null) ? null : getHighSpeedVideoFpsRangesFor(moneyFragment5.getValue(), moneyFragment5.getCurrencyCode());
            java.util.List<com.paypal.oslo.feature.businesspayandgetpaid.graphql.fragment.InvoiceFragment.Transaction> transactions = payments.getTransactions();
            if (transactions != null) {
                java.util.ArrayList arrayList9 = new java.util.ArrayList();
                java.util.Iterator it4 = transactions.iterator();
                while (it4.hasNext()) {
                    com.paypal.oslo.feature.businesspayandgetpaid.graphql.fragment.InvoiceTransactionFragment invoiceTransactionFragment = ((com.paypal.oslo.feature.businesspayandgetpaid.graphql.fragment.InvoiceFragment.Transaction) it4.next()).getInvoiceTransactionFragment();
                    java.lang.String id2 = invoiceTransactionFragment.getId();
                    if (id2 != null) {
                        com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.domain.model.invoicemanagement.TransactionType transactionType = kotlin.jvm.internal.Intrinsics.areEqual(invoiceTransactionFragment.getType(), "PAYPAL") ? com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.domain.model.invoicemanagement.TransactionType.PAYPAL : com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.domain.model.invoicemanagement.TransactionType.EXTERNAL;
                        com.paypal.oslo.feature.businesspayandgetpaid.graphql.fragment.InvoiceTransactionFragment.Amount amount2 = invoiceTransactionFragment.getAmount();
                        if (amount2 == null || (moneyFragment4 = amount2.getMoneyFragment()) == null) {
                            it2 = it4;
                            tempAmount2 = null;
                        } else {
                            it2 = it4;
                            tempAmount2 = getHighSpeedVideoFpsRangesFor(moneyFragment4.getValue(), moneyFragment4.getCurrencyCode());
                        }
                        transaction2 = new com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.domain.model.invoicemanagement.Transaction(transactionType, tempAmount2, id2);
                    } else {
                        it2 = it4;
                        transaction2 = null;
                    }
                    if (transaction2 != null) {
                        arrayList9.add(transaction2);
                    }
                    it4 = it2;
                }
                arrayList4 = arrayList9;
            } else {
                arrayList4 = null;
            }
            if (arrayList4 == null) {
                arrayList4 = kotlin.collections.CollectionsKt.emptyList();
            }
            invoicePayments = new com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.domain.model.invoicemanagement.InvoicePayments(highSpeedVideoFpsRangesFor6, arrayList4);
        } else {
            invoicePayments = null;
        }
        com.paypal.oslo.feature.businesspayandgetpaid.graphql.fragment.InvoiceFragment.Refunds refunds = invoiceFragment.getRefunds();
        if (refunds != null) {
            com.paypal.oslo.feature.businesspayandgetpaid.graphql.fragment.InvoiceFragment.TotalAmountRefunded totalAmountRefunded = refunds.getTotalAmountRefunded();
            com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.domain.model.TempAmount highSpeedVideoFpsRangesFor7 = (totalAmountRefunded == null || (moneyFragment3 = totalAmountRefunded.getMoneyFragment()) == null) ? null : getHighSpeedVideoFpsRangesFor(moneyFragment3.getValue(), moneyFragment3.getCurrencyCode());
            java.util.List<com.paypal.oslo.feature.businesspayandgetpaid.graphql.fragment.InvoiceFragment.Transaction1> transactions2 = refunds.getTransactions();
            if (transactions2 != null) {
                java.util.ArrayList arrayList10 = new java.util.ArrayList();
                java.util.Iterator it5 = transactions2.iterator();
                while (it5.hasNext()) {
                    com.paypal.oslo.feature.businesspayandgetpaid.graphql.fragment.InvoiceTransactionFragment invoiceTransactionFragment2 = ((com.paypal.oslo.feature.businesspayandgetpaid.graphql.fragment.InvoiceFragment.Transaction1) it5.next()).getInvoiceTransactionFragment();
                    java.lang.String id3 = invoiceTransactionFragment2.getId();
                    if (id3 != null) {
                        it = it5;
                        com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.domain.model.invoicemanagement.TransactionType transactionType2 = kotlin.jvm.internal.Intrinsics.areEqual(invoiceTransactionFragment2.getType(), str5) ? com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.domain.model.invoicemanagement.TransactionType.PAYPAL : com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.domain.model.invoicemanagement.TransactionType.EXTERNAL;
                        com.paypal.oslo.feature.businesspayandgetpaid.graphql.fragment.InvoiceTransactionFragment.Amount amount3 = invoiceTransactionFragment2.getAmount();
                        if (amount3 == null || (moneyFragment2 = amount3.getMoneyFragment()) == null) {
                            str2 = str5;
                            tempAmount = null;
                        } else {
                            str2 = str5;
                            tempAmount = getHighSpeedVideoFpsRangesFor(moneyFragment2.getValue(), moneyFragment2.getCurrencyCode());
                        }
                        transaction = new com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.domain.model.invoicemanagement.Transaction(transactionType2, tempAmount, id3);
                    } else {
                        it = it5;
                        str2 = str5;
                        transaction = null;
                    }
                    if (transaction != null) {
                        arrayList10.add(transaction);
                    }
                    it5 = it;
                    str5 = str2;
                }
                arrayList3 = arrayList10;
            } else {
                arrayList3 = null;
            }
            if (arrayList3 == null) {
                arrayList3 = kotlin.collections.CollectionsKt.emptyList();
            }
            invoiceRefunds = new com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.domain.model.invoicemanagement.InvoiceRefunds(highSpeedVideoFpsRangesFor7, arrayList3);
        } else {
            invoiceRefunds = null;
        }
        com.paypal.oslo.feature.businesspayandgetpaid.graphql.fragment.InvoiceFragment.Gratuity gratuity = invoiceFragment.getAmountBreakDown().getGratuity();
        return new com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.domain.model.invoicemanagement.Invoice(id, invoiceStatus2, highSpeedVideoFpsRangesFor, highSpeedVideoFpsRangesFor2, amountBreakdown, invoiceDetail, arrayList, arrayList2, invoiceConfiguration, invoicePayments, invoiceRefunds, (gratuity == null || (moneyFragment = gratuity.getMoneyFragment()) == null) ? null : getHighSpeedVideoFpsRangesFor(moneyFragment.getValue(), moneyFragment.getCurrencyCode()), "https://www.paypal.com/invoice/p/#".concat(java.lang.String.valueOf(invoiceFragment.getId())));
    }

    private static final com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.domain.model.TempAmount getHighSpeedVideoFpsRangesFor(java.lang.String str, java.lang.Object obj) {
        java.lang.Object m23436constructorimpl;
        try {
            kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
            m23436constructorimpl = kotlin.Result.m23436constructorimpl(new com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.domain.model.TempAmount(new java.math.BigDecimal(str), obj.toString()));
        } catch (java.lang.Throwable th) {
            kotlin.Result.Companion companion2 = kotlin.Result.INSTANCE;
            m23436constructorimpl = kotlin.Result.m23436constructorimpl(kotlin.ResultKt.createFailure(th));
        }
        if (kotlin.Result.m23441isFailureimpl(m23436constructorimpl)) {
            m23436constructorimpl = null;
        }
        return (com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.domain.model.TempAmount) m23436constructorimpl;
    }

    private static final java.util.Date getHighSpeedVideoFpsRangesFor(java.lang.String str) {
        java.lang.Object m23436constructorimpl;
        try {
            kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
            m23436constructorimpl = kotlin.Result.m23436constructorimpl(new java.text.SimpleDateFormat("yyyy-MM-dd", java.util.Locale.US).parse(str));
        } catch (java.lang.Throwable th) {
            kotlin.Result.Companion companion2 = kotlin.Result.INSTANCE;
            m23436constructorimpl = kotlin.Result.m23436constructorimpl(kotlin.ResultKt.createFailure(th));
        }
        if (kotlin.Result.m23441isFailureimpl(m23436constructorimpl)) {
            m23436constructorimpl = null;
        }
        return (java.util.Date) m23436constructorimpl;
    }

    /* JADX WARN: Removed duplicated region for block: B:48:0x0130 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x004f A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.domain.model.invoicemanagement.InvoiceConditionalRules toInvoiceRules(com.paypal.oslo.feature.businesspayandgetpaid.graphql.GetInvoiceConditionalRulesQuery.InvoiceConditionalRules invoiceConditionalRules) {
        com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.domain.model.invoicemanagement.ConditionalRuleType conditionalRuleType;
        com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.domain.model.invoicemanagement.ConditionalRuleType conditionalRuleType2;
        com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.domain.model.invoicemanagement.Rule rule;
        com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.domain.model.invoicemanagement.ConditionalRuleValueType conditionalRuleValueType;
        com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.domain.model.invoicemanagement.ConditionalRuleValue conditionalRuleValue;
        com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.domain.model.invoicemanagement.ConditionalRuleValue.Amount percent;
        com.paypal.oslo.feature.businesspayandgetpaid.graphql.fragment.MoneyFragment moneyFragment;
        com.paypal.oslo.feature.businesspayandgetpaid.graphql.fragment.MoneyFragment moneyFragment2;
        java.lang.Object currencyCode;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(invoiceConditionalRules, "");
        com.paypal.oslo.feature.businesspayandgetpaid.graphql.GetInvoiceConditionalRulesQuery.InvoiceTotalPreRules invoiceTotalPreRules = invoiceConditionalRules.getInvoiceTotalPreRules();
        java.lang.String obj = (invoiceTotalPreRules == null || (moneyFragment2 = invoiceTotalPreRules.getMoneyFragment()) == null || (currencyCode = moneyFragment2.getCurrencyCode()) == null) ? null : currencyCode.toString();
        com.paypal.oslo.feature.businesspayandgetpaid.graphql.GetInvoiceConditionalRulesQuery.InvoiceTotalPreRules invoiceTotalPreRules2 = invoiceConditionalRules.getInvoiceTotalPreRules();
        com.paypal.oslo.feature.businesspayandgetpaid.shared.monetary.GetPaidMoney parseAsGetPaidMoneyOrThrow = (invoiceTotalPreRules2 == null || (moneyFragment = invoiceTotalPreRules2.getMoneyFragment()) == null) ? null : com.paypal.oslo.feature.businesspayandgetpaid.shared.monetary.GetPaidMoneyKt.parseAsGetPaidMoneyOrThrow(moneyFragment.getValue(), moneyFragment.getCurrencyCode().toString());
        java.util.List<com.paypal.oslo.feature.businesspayandgetpaid.graphql.GetInvoiceConditionalRulesQuery.Rule> rules = invoiceConditionalRules.getRules();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (com.paypal.oslo.feature.businesspayandgetpaid.graphql.GetInvoiceConditionalRulesQuery.Rule rule2 : rules) {
            java.lang.String rawValue = rule2.getConditionalRuleType().getRawValue();
            if (kotlin.jvm.internal.Intrinsics.areEqual(rawValue, "EARLY_PAYMENT_DISCOUNT")) {
                conditionalRuleType2 = com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.domain.model.invoicemanagement.ConditionalRuleType.EARLY_PAYMENT_DISCOUNT;
            } else if (kotlin.jvm.internal.Intrinsics.areEqual(rawValue, "AUTO_CANCEL")) {
                conditionalRuleType2 = com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.domain.model.invoicemanagement.ConditionalRuleType.AUTO_CANCEL;
            } else {
                conditionalRuleType = null;
                java.lang.Object effectiveDate = rule2.getEffectiveDate();
                kotlin.jvm.internal.Intrinsics.checkNotNull(effectiveDate, "");
                java.util.TimeZone timeZone = java.util.TimeZone.getDefault();
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(timeZone, "");
                java.util.Date highResolutionOutputSizeshNQ4ISI = getHighResolutionOutputSizeshNQ4ISI((java.lang.String) effectiveDate, timeZone);
                if (conditionalRuleType != null || highResolutionOutputSizeshNQ4ISI == null) {
                    rule = null;
                } else {
                    com.paypal.oslo.api.graphql.schema.type.InvoiceDiscountType conditionalRuleValueType2 = rule2.getConditionalRuleValueType();
                    if (conditionalRuleValueType2 != null) {
                        int i = com.paypal.oslo.feature.businesspayandgetpaid.shared.data.repository.InvoiceResponseMappersKt.WhenMappings.$EnumSwitchMapping$1[conditionalRuleValueType2.ordinal()];
                        if (i == 1) {
                            conditionalRuleValueType = com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.domain.model.invoicemanagement.ConditionalRuleValueType.PERCENT;
                        } else if (i == 2) {
                            conditionalRuleValueType = com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.domain.model.invoicemanagement.ConditionalRuleValueType.AMOUNT;
                        } else {
                            if (i != 3) {
                                throw new kotlin.NoWhenBranchMatchedException();
                            }
                            conditionalRuleValueType = com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.domain.model.invoicemanagement.ConditionalRuleValueType.NO_VALUE;
                        }
                    } else {
                        conditionalRuleValueType = null;
                    }
                    java.lang.String conditionalRuleValue2 = rule2.getConditionalRuleValue();
                    if (conditionalRuleValue2 != null) {
                        com.paypal.oslo.api.graphql.schema.type.InvoiceDiscountType conditionalRuleValueType3 = rule2.getConditionalRuleValueType();
                        int i2 = conditionalRuleValueType3 == null ? -1 : com.paypal.oslo.feature.businesspayandgetpaid.shared.data.repository.InvoiceResponseMappersKt.WhenMappings.$EnumSwitchMapping$1[conditionalRuleValueType3.ordinal()];
                        if (i2 != 1) {
                            if (i2 == 2) {
                                percent = obj != null ? new com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.domain.model.invoicemanagement.ConditionalRuleValue.Amount(com.paypal.oslo.feature.businesspayandgetpaid.shared.monetary.GetPaidMoneyKt.parseAsGetPaidMoneyOrThrow(conditionalRuleValue2, obj)) : null;
                                conditionalRuleValue = percent;
                            }
                            percent = null;
                            conditionalRuleValue = percent;
                        } else {
                            java.lang.Double doubleOrNull = kotlin.text.StringsKt.toDoubleOrNull(conditionalRuleValue2);
                            if (doubleOrNull != null) {
                                com.paypal.oslo.feature.businesspayandgetpaid.shared.monetary.GetPaidMoney times = parseAsGetPaidMoneyOrThrow != null ? parseAsGetPaidMoneyOrThrow.times(doubleOrNull.doubleValue() / (-100.0d)) : null;
                                percent = times != null ? new com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.domain.model.invoicemanagement.ConditionalRuleValue.Percent(conditionalRuleValue2, times) : null;
                                conditionalRuleValue = percent;
                            }
                            percent = null;
                            conditionalRuleValue = percent;
                        }
                    } else {
                        conditionalRuleValue = null;
                    }
                    java.lang.Boolean isActive = rule2.isActive();
                    boolean booleanValue = isActive != null ? isActive.booleanValue() : false;
                    java.lang.Boolean isCurrentlyApplicable = rule2.isCurrentlyApplicable();
                    rule = new com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.domain.model.invoicemanagement.Rule(conditionalRuleType, conditionalRuleValueType, conditionalRuleValue, highResolutionOutputSizeshNQ4ISI, booleanValue, isCurrentlyApplicable != null ? isCurrentlyApplicable.booleanValue() : false);
                }
                if (rule == null) {
                    arrayList.add(rule);
                }
            }
            conditionalRuleType = conditionalRuleType2;
            java.lang.Object effectiveDate2 = rule2.getEffectiveDate();
            kotlin.jvm.internal.Intrinsics.checkNotNull(effectiveDate2, "");
            java.util.TimeZone timeZone2 = java.util.TimeZone.getDefault();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(timeZone2, "");
            java.util.Date highResolutionOutputSizeshNQ4ISI2 = getHighResolutionOutputSizeshNQ4ISI((java.lang.String) effectiveDate2, timeZone2);
            if (conditionalRuleType != null) {
            }
            rule = null;
            if (rule == null) {
            }
        }
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        for (java.lang.Object obj2 : arrayList) {
            if (((com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.domain.model.invoicemanagement.Rule) obj2).isActive()) {
                arrayList2.add(obj2);
            }
        }
        return new com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.domain.model.invoicemanagement.InvoiceConditionalRules(parseAsGetPaidMoneyOrThrow, arrayList2);
    }

    private static final java.util.Date getHighResolutionOutputSizeshNQ4ISI(java.lang.String str, java.util.TimeZone timeZone) {
        java.text.SimpleDateFormat simpleDateFormat = new java.text.SimpleDateFormat("yyyy-MM-dd");
        simpleDateFormat.setTimeZone(timeZone);
        simpleDateFormat.setLenient(false);
        try {
            return simpleDateFormat.parse(str);
        } catch (java.text.ParseException e) {
            com.paypal.oslo.feature.businesspayandgetpaid.LoggerKt.log.e("Failed to convert string to date", e);
            return null;
        }
    }

    @kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[com.paypal.oslo.api.graphql.schema.type.InvoiceItemUnitOfMeasure.values().length];
            try {
                iArr[com.paypal.oslo.api.graphql.schema.type.InvoiceItemUnitOfMeasure.QUANTITY.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[com.paypal.oslo.api.graphql.schema.type.InvoiceItemUnitOfMeasure.HOURS.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                iArr[com.paypal.oslo.api.graphql.schema.type.InvoiceItemUnitOfMeasure.AMOUNT.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            try {
                iArr[com.paypal.oslo.api.graphql.schema.type.InvoiceItemUnitOfMeasure.UNKNOWN__.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[com.paypal.oslo.api.graphql.schema.type.InvoiceDiscountType.values().length];
            try {
                iArr2[com.paypal.oslo.api.graphql.schema.type.InvoiceDiscountType.PERCENT.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused5) {
            }
            try {
                iArr2[com.paypal.oslo.api.graphql.schema.type.InvoiceDiscountType.AMOUNT.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused6) {
            }
            try {
                iArr2[com.paypal.oslo.api.graphql.schema.type.InvoiceDiscountType.UNKNOWN__.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused7) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }
}
