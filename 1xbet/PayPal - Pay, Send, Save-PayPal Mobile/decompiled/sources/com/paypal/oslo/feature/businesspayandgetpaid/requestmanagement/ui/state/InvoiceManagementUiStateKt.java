package com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.ui.state;

@kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0013\u0010\u0006\u001a\u00020\u0005*\u00020\u0004H\u0000¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/businesspayandgetpaid/requestmanagement/domain/model/Item;", "Lcom/paypal/oslo/feature/businesspayandgetpaid/payandgetpaid/domain/model/LineItem;", "toLineItem", "(Lcom/paypal/oslo/feature/businesspayandgetpaid/requestmanagement/domain/model/Item;)Lcom/paypal/oslo/feature/businesspayandgetpaid/payandgetpaid/domain/model/LineItem;", "Lcom/paypal/oslo/feature/businesspayandgetpaid/requestmanagement/domain/model/invoicemanagement/Invoice;", "Lcom/paypal/oslo/feature/businesspayandgetpaid/requestmanagement/ui/state/InvoiceManagementUiState;", "toUiState", "(Lcom/paypal/oslo/feature/businesspayandgetpaid/requestmanagement/domain/model/invoicemanagement/Invoice;)Lcom/paypal/oslo/feature/businesspayandgetpaid/requestmanagement/ui/state/InvoiceManagementUiState;"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class InvoiceManagementUiStateKt {
    public static final com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.domain.model.LineItem toLineItem(com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.domain.model.Item item) {
        java.math.BigDecimal bigDecimal;
        com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.domain.model.Discount discount;
        com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.domain.model.Discount.Amount amount;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(item, "");
        if (item.getName() == null || item.getUnitAmount() == null) {
            return null;
        }
        java.lang.String name2 = item.getName();
        com.paypal.oslo.feature.businesspayandgetpaid.shared.monetary.GetPaidMoney unitAmount = item.getUnitAmount();
        java.lang.String quantity = item.getQuantity();
        if (quantity == null || (bigDecimal = kotlin.text.StringsKt.toBigDecimalOrNull(quantity)) == null) {
            bigDecimal = java.math.BigDecimal.ONE;
        }
        java.math.BigDecimal bigDecimal2 = bigDecimal;
        kotlin.jvm.internal.Intrinsics.checkNotNull(bigDecimal2);
        com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.domain.model.ItemType itemType = com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.domain.model.ItemType.PRODUCT;
        if (item.getDiscount() != null) {
            item.getDiscount();
            if (item.getDiscount().getPercent() != null) {
                amount = new com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.domain.model.Discount.Percentage(new java.math.BigDecimal(item.getDiscount().getPercent()));
            } else if (item.getDiscount().getAmount() != null) {
                amount = new com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.domain.model.Discount.Amount(item.getDiscount().getAmount());
            }
            discount = amount;
            com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.domain.model.invoicemanagement.Tax tax = item.getTax();
            return new com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.domain.model.LineItem((java.lang.String) null, name2, unitAmount, bigDecimal2, itemType, (java.lang.String) null, discount, (tax != null || tax.getAmount() == null) ? null : new com.paypal.oslo.feature.businesspayandgetpaid.shared.domain.model.Tax(tax.getName(), tax.getName(), tax.getAmount().getValue()), 33, (kotlin.jvm.internal.DefaultConstructorMarker) null);
        }
        discount = null;
        com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.domain.model.invoicemanagement.Tax tax2 = item.getTax();
        return new com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.domain.model.LineItem((java.lang.String) null, name2, unitAmount, bigDecimal2, itemType, (java.lang.String) null, discount, (tax2 != null || tax2.getAmount() == null) ? null : new com.paypal.oslo.feature.businesspayandgetpaid.shared.domain.model.Tax(tax2.getName(), tax2.getName(), tax2.getAmount().getValue()), 33, (kotlin.jvm.internal.DefaultConstructorMarker) null);
    }

    /* JADX WARN: Removed duplicated region for block: B:108:0x0218  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0223  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x024c  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x02a3  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x02d7  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x02f4  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x0253  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x0249  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.ui.state.InvoiceManagementUiState toUiState(com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.domain.model.invoicemanagement.Invoice invoice) {
        java.lang.String str;
        com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.domain.model.TempAmount tempAmount;
        com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.domain.model.TempAmount tempAmount2;
        com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.domain.model.TempAmount tempAmount3;
        java.lang.String str2;
        com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.domain.model.TempAmount amount;
        java.util.List<com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.domain.model.Item> items;
        java.util.ArrayList arrayList;
        java.util.List<com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.domain.model.invoicemanagement.Recipient> primaryRecipients;
        java.lang.String str3;
        java.util.List<com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.domain.model.invoicemanagement.Recipient.RecipientPhoneNumber> phones;
        java.util.List<com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.domain.model.invoicemanagement.Recipient> primaryRecipients2;
        com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.domain.model.invoicemanagement.Recipient recipient;
        com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.domain.model.invoicemanagement.Recipient.RecipientInfo billingInfo;
        java.util.List<com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.domain.model.invoicemanagement.Recipient.RecipientPhoneNumber> phones2;
        com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.domain.model.invoicemanagement.Recipient.RecipientPhoneNumber recipientPhoneNumber;
        java.lang.String nationalNumber;
        com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.domain.model.invoicemanagement.Recipient recipient2;
        com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.domain.model.invoicemanagement.Recipient.RecipientInfo billingInfo2;
        com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.domain.model.invoicemanagement.Recipient recipient3;
        com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.domain.model.invoicemanagement.Recipient.RecipientInfo billingInfo3;
        java.lang.String emailAddress;
        com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.domain.model.TempAmount taxTotal;
        com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.domain.model.TempAmount filterNonZero;
        com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.domain.model.AmountBreakdown.Shipping shipping;
        com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.domain.model.TempAmount amount2;
        com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.domain.model.TempAmount filterNonZero2;
        com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.domain.model.AmountBreakdown.DiscountBreakdown discount;
        com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.domain.model.invoicemanagement.Discount requestDiscount;
        com.paypal.oslo.feature.businesspayandgetpaid.shared.monetary.GetPaidMoney amount3;
        com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.domain.model.AmountBreakdown.DiscountBreakdown discount2;
        com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.domain.model.TempAmount itemDiscount;
        com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.domain.model.TempAmount filterNonZero3;
        com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.domain.model.TempAmount amount4;
        com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.domain.model.invoicemanagement.Recipient recipient4;
        java.lang.String str4;
        com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.domain.model.invoicemanagement.Recipient.RecipientName name2;
        java.lang.String str5;
        java.util.Date dueDate;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(invoice, "");
        java.text.SimpleDateFormat simpleDateFormat = new java.text.SimpleDateFormat(com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.DateTimeFormatConstants.KEY_TRANSACTION_DATE_WITH_YEAR_FORMAT, java.util.Locale.getDefault());
        java.math.BigDecimal bigDecimal = java.math.BigDecimal.ZERO;
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(bigDecimal, "");
        com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.domain.model.TempAmount tempAmount4 = new com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.domain.model.TempAmount(bigDecimal, invoice.getDetail().getCurrencyCode());
        java.util.Date invoiceDate = invoice.getDetail().getInvoiceDate();
        java.lang.String str6 = null;
        java.lang.String format = invoiceDate != null ? simpleDateFormat.format(invoiceDate) : null;
        com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.domain.model.invoicemanagement.PaymentTerm paymentTerm = invoice.getDetail().getPaymentTerm();
        java.lang.String format2 = (paymentTerm == null || (dueDate = paymentTerm.getDueDate()) == null) ? null : simpleDateFormat.format(dueDate);
        java.lang.String id = invoice.getId();
        java.lang.String invoiceNumber = invoice.getDetail().getInvoiceNumber();
        com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.ui.state.InvoiceStatusUiState invoiceStatusUiState = com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.ui.state.InvoiceStatusUiStateKt.invoiceStatusUiState(invoice);
        java.util.List<com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.domain.model.invoicemanagement.Recipient> primaryRecipients3 = invoice.getPrimaryRecipients();
        if (primaryRecipients3 == null || (recipient4 = (com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.domain.model.invoicemanagement.Recipient) kotlin.collections.CollectionsKt.firstOrNull((java.util.List) primaryRecipients3)) == null) {
            str = null;
        } else {
            com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.domain.model.invoicemanagement.Recipient.RecipientInfo billingInfo4 = recipient4.getBillingInfo();
            if (billingInfo4 != null && (name2 = billingInfo4.getName()) != null) {
                java.lang.String givenName = name2.getGivenName();
                str4 = givenName != null ? kotlin.text.StringsKt.trim(givenName).toString() : null;
                java.lang.String surname = name2.getSurname();
                java.lang.String obj = surname != null ? kotlin.text.StringsKt.trim(surname).toString() : null;
                java.lang.String str7 = str4;
                if (str7 != null && str7.length() != 0 && (str5 = obj) != null && str5.length() != 0) {
                    java.lang.StringBuilder sb = new java.lang.StringBuilder();
                    sb.append(str4);
                    sb.append(" ");
                    sb.append(obj);
                    str4 = sb.toString();
                } else if (str7 == null || str7.length() == 0) {
                    java.lang.String str8 = obj;
                    if (str8 != null && str8.length() != 0) {
                        str4 = obj;
                    }
                }
                str = str4;
            }
            str4 = null;
            str = str4;
        }
        com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.domain.model.TempAmount dueAmount = invoice.getDueAmount();
        if (dueAmount == null) {
            dueAmount = tempAmount4;
        }
        java.lang.String descriptionForLocale$default = com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.ui.state.TempAmountUiStateKt.descriptionForLocale$default(dueAmount, null, 1, null);
        com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.domain.model.TempAmount gratuity = invoice.getGratuity();
        java.lang.String descriptionForLocale$default2 = gratuity != null ? com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.ui.state.TempAmountUiStateKt.descriptionForLocale$default(gratuity, null, 1, null) : null;
        com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.domain.model.invoicemanagement.InvoiceConfiguration configuration = invoice.getConfiguration();
        boolean z = configuration != null && configuration.getAllowTip();
        com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.domain.model.invoicemanagement.InvoicePayments payments = invoice.getPayments();
        if (payments == null || (tempAmount = payments.getPaidAmount()) == null) {
            tempAmount = tempAmount4;
        }
        java.lang.String descriptionForLocale$default3 = com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.ui.state.TempAmountUiStateKt.descriptionForLocale$default(tempAmount, null, 1, null);
        com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.domain.model.invoicemanagement.InvoiceRefunds refunds = invoice.getRefunds();
        java.lang.String descriptionForLocale$default4 = (refunds == null || (amount4 = refunds.getAmount()) == null) ? null : com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.ui.state.TempAmountUiStateKt.descriptionForLocale$default(amount4, null, 1, null);
        com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.domain.model.invoicemanagement.InvoiceRefunds refunds2 = invoice.getRefunds();
        com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.domain.model.TempAmount amount5 = refunds2 != null ? refunds2.getAmount() : null;
        com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.domain.model.invoicemanagement.InvoicePayments payments2 = invoice.getPayments();
        com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.domain.model.TempAmount paidAmount = payments2 != null ? payments2.getPaidAmount() : null;
        if (amount5 == null || paidAmount == null) {
            tempAmount2 = null;
        } else {
            java.math.BigDecimal subtract = paidAmount.getValue().subtract(amount5.getValue());
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(subtract, "");
            tempAmount2 = new com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.domain.model.TempAmount(subtract, paidAmount.getCurrencyCode());
        }
        java.lang.String descriptionForLocale$default5 = tempAmount2 != null ? com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.ui.state.TempAmountUiStateKt.descriptionForLocale$default(tempAmount2, null, 1, null) : null;
        com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.domain.model.AmountBreakdown amountBreakdown = invoice.getAmountBreakdown();
        if (amountBreakdown == null || (tempAmount3 = amountBreakdown.getItemTotal()) == null) {
            tempAmount3 = tempAmount4;
        }
        java.lang.String descriptionForLocale$default6 = com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.ui.state.TempAmountUiStateKt.descriptionForLocale$default(tempAmount3, null, 1, null);
        com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.domain.model.AmountBreakdown amountBreakdown2 = invoice.getAmountBreakdown();
        java.lang.String descriptionForLocale$default7 = (amountBreakdown2 == null || (discount2 = amountBreakdown2.getDiscount()) == null || (itemDiscount = discount2.getItemDiscount()) == null || (filterNonZero3 = com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.ui.state.TempAmountUiStateKt.filterNonZero(itemDiscount)) == null) ? null : com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.ui.state.TempAmountUiStateKt.descriptionForLocale$default(filterNonZero3, null, 1, null);
        com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.domain.model.AmountBreakdown amountBreakdown3 = invoice.getAmountBreakdown();
        if (amountBreakdown3 != null && (discount = amountBreakdown3.getDiscount()) != null && (requestDiscount = discount.getRequestDiscount()) != null && (amount3 = requestDiscount.getAmount()) != null) {
            if (amount3.isZero()) {
                amount3 = null;
            }
            if (amount3 != null) {
                str2 = com.paypal.oslo.feature.businesspayandgetpaid.shared.monetary.GetPaidMoney.formatWithSymbol$default(amount3, null, 1, null);
                com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.domain.model.AmountBreakdown amountBreakdown4 = invoice.getAmountBreakdown();
                java.lang.String descriptionForLocale$default8 = (amountBreakdown4 != null || (shipping = amountBreakdown4.getShipping()) == null || (amount2 = shipping.getAmount()) == null || (filterNonZero2 = com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.ui.state.TempAmountUiStateKt.filterNonZero(amount2)) == null) ? null : com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.ui.state.TempAmountUiStateKt.descriptionForLocale$default(filterNonZero2, null, 1, null);
                com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.domain.model.AmountBreakdown amountBreakdown5 = invoice.getAmountBreakdown();
                java.lang.String descriptionForLocale$default9 = (amountBreakdown5 != null || (taxTotal = amountBreakdown5.getTaxTotal()) == null || (filterNonZero = com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.ui.state.TempAmountUiStateKt.filterNonZero(taxTotal)) == null) ? null : com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.ui.state.TempAmountUiStateKt.descriptionForLocale$default(filterNonZero, null, 1, null);
                amount = invoice.getAmount();
                if (amount != null) {
                    tempAmount4 = amount;
                }
                java.lang.String descriptionForLocale$default10 = com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.ui.state.TempAmountUiStateKt.descriptionForLocale$default(tempAmount4, null, 1, null);
                items = invoice.getItems();
                if (items == null) {
                    java.util.ArrayList arrayList2 = new java.util.ArrayList();
                    java.util.Iterator<T> it = items.iterator();
                    while (it.hasNext()) {
                        com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.domain.model.LineItem lineItem = toLineItem((com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.domain.model.Item) it.next());
                        if (lineItem != null) {
                            arrayList2.add(lineItem);
                        }
                    }
                    arrayList = arrayList2;
                } else {
                    arrayList = null;
                }
                java.util.List emptyList = arrayList != null ? kotlin.collections.CollectionsKt.emptyList() : arrayList;
                java.lang.String note = invoice.getDetail().getNote();
                primaryRecipients = invoice.getPrimaryRecipients();
                if (primaryRecipients != null || (recipient3 = (com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.domain.model.invoicemanagement.Recipient) kotlin.collections.CollectionsKt.firstOrNull((java.util.List) primaryRecipients)) == null || (billingInfo3 = recipient3.getBillingInfo()) == null || (emailAddress = billingInfo3.getEmailAddress()) == null) {
                    str3 = null;
                } else {
                    java.lang.String str9 = emailAddress;
                    if (str9.length() == 0) {
                        str9 = null;
                    }
                    str3 = str9;
                }
                java.util.List<com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.domain.model.invoicemanagement.Recipient> primaryRecipients4 = invoice.getPrimaryRecipients();
                phones = (primaryRecipients4 != null || (recipient2 = (com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.domain.model.invoicemanagement.Recipient) kotlin.collections.CollectionsKt.firstOrNull((java.util.List) primaryRecipients4)) == null || (billingInfo2 = recipient2.getBillingInfo()) == null) ? null : billingInfo2.getPhones();
                if (phones == null) {
                    phones = kotlin.collections.CollectionsKt.emptyList();
                }
                java.util.List<com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.domain.model.invoicemanagement.Recipient.RecipientPhoneNumber> list = phones;
                primaryRecipients2 = invoice.getPrimaryRecipients();
                if (primaryRecipients2 != null && (recipient = (com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.domain.model.invoicemanagement.Recipient) kotlin.collections.CollectionsKt.firstOrNull((java.util.List) primaryRecipients2)) != null && (billingInfo = recipient.getBillingInfo()) != null && (phones2 = billingInfo.getPhones()) != null && (recipientPhoneNumber = (com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.domain.model.invoicemanagement.Recipient.RecipientPhoneNumber) kotlin.collections.CollectionsKt.firstOrNull((java.util.List) phones2)) != null) {
                    if (kotlin.text.StringsKt.isBlank(recipientPhoneNumber.getCountryCode())) {
                        java.lang.String countryCode = recipientPhoneNumber.getCountryCode();
                        java.lang.String nationalNumber2 = recipientPhoneNumber.getNationalNumber();
                        java.lang.StringBuilder sb2 = new java.lang.StringBuilder("+");
                        sb2.append(countryCode);
                        sb2.append(" ");
                        sb2.append(nationalNumber2);
                        nationalNumber = sb2.toString();
                    } else {
                        nationalNumber = recipientPhoneNumber.getNationalNumber();
                    }
                    str6 = nationalNumber;
                }
                return new com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.ui.state.InvoiceManagementUiState(id, invoiceNumber, false, false, false, null, false, invoice.isCancellable(), false, false, invoice.getCanSendReminder(), false, false, invoiceStatusUiState, str, descriptionForLocale$default, descriptionForLocale$default2, z, descriptionForLocale$default3, descriptionForLocale$default4, descriptionForLocale$default5, format, format2, descriptionForLocale$default6, descriptionForLocale$default7, str2, descriptionForLocale$default8, descriptionForLocale$default9, descriptionForLocale$default10, emptyList, note, str3, list, str6, invoice.getShareUrl(), com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.ui.invoiceaction.InvoiceActionKt.actions(invoice), null, null, false, 7036, 112, null);
            }
        }
        str2 = null;
        com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.domain.model.AmountBreakdown amountBreakdown42 = invoice.getAmountBreakdown();
        if (amountBreakdown42 != null) {
        }
        com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.domain.model.AmountBreakdown amountBreakdown52 = invoice.getAmountBreakdown();
        if (amountBreakdown52 != null) {
        }
        amount = invoice.getAmount();
        if (amount != null) {
        }
        java.lang.String descriptionForLocale$default102 = com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.ui.state.TempAmountUiStateKt.descriptionForLocale$default(tempAmount4, null, 1, null);
        items = invoice.getItems();
        if (items == null) {
        }
        if (arrayList != null) {
        }
        java.lang.String note2 = invoice.getDetail().getNote();
        primaryRecipients = invoice.getPrimaryRecipients();
        if (primaryRecipients != null) {
        }
        str3 = null;
        java.util.List<com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.domain.model.invoicemanagement.Recipient> primaryRecipients42 = invoice.getPrimaryRecipients();
        if (primaryRecipients42 != null) {
        }
        if (phones == null) {
        }
        java.util.List<com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.domain.model.invoicemanagement.Recipient.RecipientPhoneNumber> list2 = phones;
        primaryRecipients2 = invoice.getPrimaryRecipients();
        if (primaryRecipients2 != null) {
            if (kotlin.text.StringsKt.isBlank(recipientPhoneNumber.getCountryCode())) {
            }
            str6 = nationalNumber;
        }
        return new com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.ui.state.InvoiceManagementUiState(id, invoiceNumber, false, false, false, null, false, invoice.isCancellable(), false, false, invoice.getCanSendReminder(), false, false, invoiceStatusUiState, str, descriptionForLocale$default, descriptionForLocale$default2, z, descriptionForLocale$default3, descriptionForLocale$default4, descriptionForLocale$default5, format, format2, descriptionForLocale$default6, descriptionForLocale$default7, str2, descriptionForLocale$default8, descriptionForLocale$default9, descriptionForLocale$default102, emptyList, note2, str3, list2, str6, invoice.getShareUrl(), com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.ui.invoiceaction.InvoiceActionKt.actions(invoice), null, null, false, 7036, 112, null);
    }
}
