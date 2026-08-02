package com.paypal.oslo.feature.p2p.ui.review.composables;

@kotlin.Metadata(d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\n\u001a\u009d\u0001\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0001\u001a\u00020\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\t\u001a\u00020\b2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00102\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00122\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00142\b\b\u0002\u0010\u0016\u001a\u00020\b2\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0017H\u0000¢\u0006\u0004\b\u001a\u0010\u001b\u001a\u0019\u0010\u001f\u001a\u0004\u0018\u00010\u001e2\u0006\u0010\u001d\u001a\u00020\u001cH\u0000¢\u0006\u0004\b\u001f\u0010 \u001a\u0013\u0010\"\u001a\u00020\b*\u00020!H\u0000¢\u0006\u0004\b\"\u0010#\u001a\u0017\u0010%\u001a\u00020\u00122\u0006\u0010$\u001a\u00020\u0012H\u0000¢\u0006\u0004\b%\u0010&\u001a\u0019\u0010)\u001a\u00020\u00122\b\u0010(\u001a\u0004\u0018\u00010'H\u0000¢\u0006\u0004\b)\u0010*\u001a\u001f\u0010,\u001a\u00020\u00122\u0006\u0010+\u001a\u00020\u00122\u0006\u0010$\u001a\u00020\u0012H\u0000¢\u0006\u0004\b,\u0010-\u001a#\u0010.\u001a\u00020\u00122\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012H\u0000¢\u0006\u0004\b.\u0010/\u001a!\u00101\u001a\u00020\u00122\u0006\u00100\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012H\u0000¢\u0006\u0004\b1\u0010-"}, d2 = {"Lcom/paypal/oslo/feature/moneymovement/api/ui/plan/PlanAccordionData;", "planData", "Lcom/paypal/oslo/feature/p2p/ui/review/models/P2PContactItem;", "selectedContact", "Lcom/paypal/oslo/feature/p2p/domain/model/PaymentTransferIntent;", "intent", "Lcom/paypal/oslo/feature/p2p/ui/review/state/UiAmount;", "uiAmount", "", "isPaymentLinkSelected", "Lcom/paypal/oslo/feature/p2p/domain/model/Receiver;", "receiver", "Lcom/paypal/oslo/feature/p2p/domain/model/PaymentLink;", "paymentLink", "Lcom/paypal/oslo/feature/p2p/domain/model/FxQuote;", "cachedFxQuote", "Lcom/paypal/oslo/feature/p2p/domain/model/PlanCurrencyExchange;", "planCurrencyExchange", "", "receiveCurrencyCode", "Lcom/paypal/oslo/feature/p2p/domain/model/ConversionProvider;", "currencyConversionProvider", "hasForeignTaxDisclosure", "Lcom/paypal/oslo/feature/moneymovement/api/domain/SummaryDisclosureType;", "paymentLinkDisclosureType", "Lcom/paypal/oslo/feature/moneymovement/api/ui/summary/SummaryData;", "extractSummaryDataFromPlanData", "(Lcom/paypal/oslo/feature/moneymovement/api/ui/plan/PlanAccordionData;Lcom/paypal/oslo/feature/p2p/ui/review/models/P2PContactItem;Lcom/paypal/oslo/feature/p2p/domain/model/PaymentTransferIntent;Lcom/paypal/oslo/feature/p2p/ui/review/state/UiAmount;ZLcom/paypal/oslo/feature/p2p/domain/model/Receiver;Lcom/paypal/oslo/feature/p2p/domain/model/PaymentLink;Lcom/paypal/oslo/feature/p2p/domain/model/FxQuote;Lcom/paypal/oslo/feature/p2p/domain/model/PlanCurrencyExchange;Ljava/lang/String;Lcom/paypal/oslo/feature/p2p/domain/model/ConversionProvider;ZLcom/paypal/oslo/feature/moneymovement/api/domain/SummaryDisclosureType;)Lcom/paypal/oslo/feature/moneymovement/api/ui/summary/SummaryData;", "Lcom/paypal/oslo/feature/p2p/domain/model/UpdatePaymentTransferAttemptReceiver;", "attempt", "Lcom/paypal/oslo/feature/p2p/domain/model/PaymentTxType;", "determineTransferTypeToSelect", "(Lcom/paypal/oslo/feature/p2p/domain/model/UpdatePaymentTransferAttemptReceiver;)Lcom/paypal/oslo/feature/p2p/domain/model/PaymentTxType;", "Lcom/paypal/oslo/feature/moneymovement/api/domain/PaymentPlan;", "hasFeesLine", "(Lcom/paypal/oslo/feature/moneymovement/api/domain/PaymentPlan;)Z", "currencyCode", "getCurrencySymbol", "(Ljava/lang/String;)Ljava/lang/String;", "Lcom/paypal/oslo/feature/p2p/domain/model/ExchangeRate;", "exchangeRate", "formatExchangeRate", "(Lcom/paypal/oslo/feature/p2p/domain/model/ExchangeRate;)Ljava/lang/String;", "amount", "formatAmountWithCurrency", "(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;", "buildSenderAmountDisplayFromUiAmount", "(Lcom/paypal/oslo/feature/p2p/ui/review/state/UiAmount;Ljava/lang/String;)Ljava/lang/String;", "quantity", "buildSenderAmountDisplay"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class ReviewScreenMappersKt {
    /* JADX WARN: Code restructure failed: missing block: B:133:0x0070, code lost:
    
        if (kotlin.text.StringsKt.isBlank(r6) == false) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x005c, code lost:
    
        if (kotlin.text.StringsKt.isBlank(r6) != false) goto L40;
     */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0111  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0127  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0131  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x01fb  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0203  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0222  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0235  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x025f  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0200  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final com.paypal.oslo.feature.moneymovement.api.ui.summary.SummaryData extractSummaryDataFromPlanData(com.paypal.oslo.feature.moneymovement.api.ui.plan.PlanAccordionData planAccordionData, com.paypal.oslo.feature.p2p.ui.review.models.P2PContactItem p2PContactItem, com.paypal.oslo.feature.p2p.domain.model.PaymentTransferIntent paymentTransferIntent, com.paypal.oslo.feature.p2p.ui.review.state.UiAmount uiAmount, boolean z, com.paypal.oslo.feature.p2p.domain.model.Receiver receiver, com.paypal.oslo.feature.p2p.domain.model.PaymentLink paymentLink, com.paypal.oslo.feature.p2p.domain.model.FxQuote fxQuote, com.paypal.oslo.feature.p2p.domain.model.PlanCurrencyExchange planCurrencyExchange, java.lang.String str, com.paypal.oslo.feature.p2p.domain.model.ConversionProvider conversionProvider, boolean z2, com.paypal.oslo.feature.moneymovement.api.domain.SummaryDisclosureType summaryDisclosureType) {
        java.lang.String str2;
        com.paypal.oslo.feature.moneymovement.api.domain.Intent intent;
        com.paypal.oslo.feature.moneymovement.api.domain.PaymentPlan selectedPlan;
        com.paypal.oslo.feature.p2p.ui.review.composables.ExchangeRateData.FromFxQuote fromFxQuote;
        com.paypal.oslo.feature.moneymovement.api.domain.ConversionMethod conversionMethod;
        com.paypal.oslo.feature.moneymovement.api.shared.domain.MoneyAmount moneyAmount;
        java.util.Date date;
        com.paypal.oslo.feature.moneymovement.api.domain.PaymentPlan paymentPlan;
        com.paypal.oslo.feature.moneymovement.api.domain.PaymentPlan copy;
        java.time.Instant expirationTime;
        java.lang.String formatExchangeRate;
        com.paypal.oslo.feature.moneymovement.api.domain.ConversionMethod.PayPalRateOnly payPalRateOnly;
        str2 = "";
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(planAccordionData, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(paymentTransferIntent, "");
        boolean z3 = paymentTransferIntent == com.paypal.oslo.feature.p2p.domain.model.PaymentTransferIntent.REQUEST && paymentLink != null;
        java.util.Date date2 = null;
        if (z) {
            com.paypal.oslo.feature.p2p.domain.model.ReceiverName name2 = receiver != null ? receiver.getName() : null;
            if (name2 instanceof com.paypal.oslo.feature.p2p.domain.model.ReceiverName.PersonName) {
                com.paypal.oslo.feature.p2p.domain.model.ReceiverName.PersonName personName = (com.paypal.oslo.feature.p2p.domain.model.ReceiverName.PersonName) name2;
                java.lang.String givenName = personName.getGivenName();
                if (givenName == null) {
                    givenName = "";
                }
                java.lang.String surname = personName.getSurname();
                str2 = com.paypal.oslo.feature.p2p.ui.review.composables.accordions.ContactDisplayHelpersKt.getDisplayName(givenName, surname != null ? surname : "");
                if (kotlin.text.StringsKt.isBlank(str2)) {
                    str2 = null;
                }
                if (str2 == null) {
                    str2 = personName.getFullName();
                    if (str2 != null) {
                    }
                    str2 = null;
                }
                if (str2 == null) {
                    str2 = com.paypal.oslo.feature.p2p.ui.review.composables.ReviewHeaderKt.PaymentLinkDisplayName;
                }
            } else {
                if (name2 instanceof com.paypal.oslo.feature.p2p.domain.model.ReceiverName.BusinessName) {
                    str2 = ((com.paypal.oslo.feature.p2p.domain.model.ReceiverName.BusinessName) name2).getBusinessName();
                } else if (!(name2 instanceof com.paypal.oslo.feature.p2p.domain.model.ReceiverName.Unknown) && name2 != null) {
                    throw new kotlin.NoWhenBranchMatchedException();
                }
                str2 = null;
                if (str2 == null) {
                }
            }
        } else if (p2PContactItem != null) {
            str2 = com.paypal.oslo.feature.p2p.ui.review.composables.accordions.ContactDisplayHelpersKt.getDisplayName(p2PContactItem.getFirstName(), p2PContactItem.getLastName());
        } else if (!z3) {
            str2 = null;
        }
        if (str2 == null) {
            return new com.paypal.oslo.feature.moneymovement.api.ui.summary.SummaryData(com.paypal.oslo.feature.moneymovement.api.ui.summary.SummaryData.State.Loading.INSTANCE);
        }
        int i = com.paypal.oslo.feature.p2p.ui.review.composables.ReviewScreenMappersKt.WhenMappings.$EnumSwitchMapping$0[paymentTransferIntent.ordinal()];
        if (i != 1) {
            if (i == 2) {
                intent = com.paypal.oslo.feature.moneymovement.api.domain.Intent.REQUEST;
                com.paypal.oslo.feature.moneymovement.api.domain.Intent intent2 = intent;
                if (paymentTransferIntent != com.paypal.oslo.feature.p2p.domain.model.PaymentTransferIntent.REQUEST) {
                    com.paypal.oslo.feature.moneymovement.api.shared.domain.MoneyAmount fiat = uiAmount != null ? com.paypal.oslo.feature.moneymovement.api.shared.domain.MoneyAmount.INSTANCE.fiat(uiAmount.getCurrency(), uiAmount.getAmount()) : null;
                    selectedPlan = new com.paypal.oslo.feature.moneymovement.api.domain.PaymentPlan("", kotlin.collections.CollectionsKt.emptyList(), null, fiat != null ? new com.paypal.oslo.feature.moneymovement.api.domain.AmountsBreakdown(null, fiat, null, null, 13, null) : null, false, null, null, null, null, 500, null);
                } else {
                    com.paypal.oslo.feature.moneymovement.api.ui.plan.PlanAccordionData.State state = planAccordionData.getState();
                    com.paypal.oslo.feature.moneymovement.api.ui.plan.PlanAccordionData.State.Ready ready = state instanceof com.paypal.oslo.feature.moneymovement.api.ui.plan.PlanAccordionData.State.Ready ? (com.paypal.oslo.feature.moneymovement.api.ui.plan.PlanAccordionData.State.Ready) state : null;
                    selectedPlan = ready == null ? null : ready.getSelectedPlan();
                }
                if (selectedPlan != null) {
                    return new com.paypal.oslo.feature.moneymovement.api.ui.summary.SummaryData(com.paypal.oslo.feature.moneymovement.api.ui.summary.SummaryData.State.Loading.INSTANCE);
                }
                if (planCurrencyExchange != null) {
                    fromFxQuote = new com.paypal.oslo.feature.p2p.ui.review.composables.ExchangeRateData.FromPlanExchange(planCurrencyExchange);
                } else {
                    fromFxQuote = fxQuote != null ? new com.paypal.oslo.feature.p2p.ui.review.composables.ExchangeRateData.FromFxQuote(fxQuote) : null;
                }
                java.util.List createListBuilder = kotlin.collections.CollectionsKt.createListBuilder();
                java.lang.String str3 = str;
                if (str3 != null && str3.length() != 0 && z2) {
                    createListBuilder.add(new com.paypal.oslo.feature.moneymovement.api.domain.SummaryDisclosure(com.paypal.oslo.feature.moneymovement.api.domain.SummaryDisclosureType.TAX_DISCLOSURE, null, 2, null));
                    createListBuilder.add(new com.paypal.oslo.feature.moneymovement.api.domain.SummaryDisclosure(com.paypal.oslo.feature.moneymovement.api.domain.SummaryDisclosureType.CANCELLATION_POLICY, null, 2, null));
                }
                if (summaryDisclosureType != null) {
                    createListBuilder.add(new com.paypal.oslo.feature.moneymovement.api.domain.SummaryDisclosure(summaryDisclosureType, null, 2, null));
                }
                java.util.List build = kotlin.collections.CollectionsKt.build(createListBuilder);
                if (str3 != null && str3.length() != 0) {
                    int i2 = conversionProvider == null ? -1 : com.paypal.oslo.feature.p2p.ui.review.composables.ReviewScreenMappersKt.WhenMappings.$EnumSwitchMapping$1[conversionProvider.ordinal()];
                    if (i2 == -1 || i2 == 1) {
                        if (fromFxQuote != null) {
                            if (fromFxQuote instanceof com.paypal.oslo.feature.p2p.ui.review.composables.ExchangeRateData.FromFxQuote) {
                                formatExchangeRate = formatExchangeRate(((com.paypal.oslo.feature.p2p.ui.review.composables.ExchangeRateData.FromFxQuote) fromFxQuote).getFxQuote().getExchangeRate());
                            } else {
                                if (!(fromFxQuote instanceof com.paypal.oslo.feature.p2p.ui.review.composables.ExchangeRateData.FromPlanExchange)) {
                                    throw new kotlin.NoWhenBranchMatchedException();
                                }
                                formatExchangeRate = formatExchangeRate(((com.paypal.oslo.feature.p2p.ui.review.composables.ExchangeRateData.FromPlanExchange) fromFxQuote).getExchange().getExchangeRate());
                            }
                            if (formatExchangeRate != null && formatExchangeRate.length() != 0) {
                                if (conversionProvider == com.paypal.oslo.feature.p2p.domain.model.ConversionProvider.PAYPAL) {
                                    payPalRateOnly = new com.paypal.oslo.feature.moneymovement.api.domain.ConversionMethod.PayPal(formatExchangeRate);
                                } else {
                                    payPalRateOnly = new com.paypal.oslo.feature.moneymovement.api.domain.ConversionMethod.PayPalRateOnly(formatExchangeRate);
                                }
                                conversionMethod = payPalRateOnly;
                            }
                        }
                    } else {
                        if (i2 != 2) {
                            throw new kotlin.NoWhenBranchMatchedException();
                        }
                        conversionMethod = com.paypal.oslo.feature.moneymovement.api.domain.ConversionMethod.Issuer.INSTANCE;
                    }
                    if (str3 != null && str3.length() != 0) {
                        if ((uiAmount == null ? uiAmount.getMoney() : null) != null) {
                            com.paypal.oslo.feature.moneymovement.api.shared.domain.MoneyAmount.FiatDetails fiat2 = uiAmount.getMoney().getFiat();
                            java.lang.String quantity = fiat2 != null ? fiat2.getQuantity() : null;
                            if (quantity != null) {
                                moneyAmount = com.paypal.oslo.feature.moneymovement.api.shared.domain.MoneyAmount.INSTANCE.fiat(str, quantity);
                                if (paymentLink != null && (expirationTime = paymentLink.getExpirationTime()) != null) {
                                    date2 = new java.util.Date(expirationTime.toEpochMilli());
                                }
                                date = date2;
                                if (date != null) {
                                    copy = r29.copy((r20 & 1) != 0 ? r29.id : null, (r20 & 2) != 0 ? r29.fundingSources : null, (r20 & 4) != 0 ? r29.backupFundingSources : null, (r20 & 8) != 0 ? r29.amountsBreakdown : null, (r20 & 16) != 0 ? r29.isDefault : false, (r20 & 32) != 0 ? r29.paymentDelivery : null, (r20 & 64) != 0 ? r29.destination : null, (r20 & 128) != 0 ? r29.contingencies : null, (r20 & 256) != 0 ? selectedPlan.disclosures : null);
                                    paymentPlan = copy;
                                } else {
                                    paymentPlan = selectedPlan;
                                }
                                return new com.paypal.oslo.feature.moneymovement.api.ui.summary.SummaryData(new com.paypal.oslo.feature.moneymovement.api.ui.summary.SummaryData.State.Ready(intent2, paymentPlan, null, new com.paypal.oslo.feature.moneymovement.api.domain.PaymentReceiver(str2), null, null, hasFeesLine(selectedPlan), conversionMethod, build, date, moneyAmount, 52, null));
                            }
                        }
                    }
                    moneyAmount = null;
                    if (paymentLink != null) {
                        date2 = new java.util.Date(expirationTime.toEpochMilli());
                    }
                    date = date2;
                    if (date != null) {
                    }
                    return new com.paypal.oslo.feature.moneymovement.api.ui.summary.SummaryData(new com.paypal.oslo.feature.moneymovement.api.ui.summary.SummaryData.State.Ready(intent2, paymentPlan, null, new com.paypal.oslo.feature.moneymovement.api.domain.PaymentReceiver(str2), null, null, hasFeesLine(selectedPlan), conversionMethod, build, date, moneyAmount, 52, null));
                }
                conversionMethod = null;
                if (str3 != null) {
                    if ((uiAmount == null ? uiAmount.getMoney() : null) != null) {
                    }
                }
                moneyAmount = null;
                if (paymentLink != null) {
                }
                date = date2;
                if (date != null) {
                }
                return new com.paypal.oslo.feature.moneymovement.api.ui.summary.SummaryData(new com.paypal.oslo.feature.moneymovement.api.ui.summary.SummaryData.State.Ready(intent2, paymentPlan, null, new com.paypal.oslo.feature.moneymovement.api.domain.PaymentReceiver(str2), null, null, hasFeesLine(selectedPlan), conversionMethod, build, date, moneyAmount, 52, null));
            }
            if (i != 3) {
                throw new kotlin.NoWhenBranchMatchedException();
            }
        }
        intent = com.paypal.oslo.feature.moneymovement.api.domain.Intent.SEND;
        com.paypal.oslo.feature.moneymovement.api.domain.Intent intent22 = intent;
        if (paymentTransferIntent != com.paypal.oslo.feature.p2p.domain.model.PaymentTransferIntent.REQUEST) {
        }
        if (selectedPlan != null) {
        }
    }

    public static final com.paypal.oslo.feature.p2p.domain.model.PaymentTxType determineTransferTypeToSelect(com.paypal.oslo.feature.p2p.domain.model.UpdatePaymentTransferAttemptReceiver updatePaymentTransferAttemptReceiver) {
        java.lang.Object obj;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(updatePaymentTransferAttemptReceiver, "");
        if (updatePaymentTransferAttemptReceiver.getPaymentLink() != null || updatePaymentTransferAttemptReceiver.getPaymentLink() != null) {
            return null;
        }
        if (updatePaymentTransferAttemptReceiver.getSelectedTransferType() != null) {
            java.util.List<com.paypal.oslo.feature.p2p.domain.model.TransferType> supportedTransferTypes = updatePaymentTransferAttemptReceiver.getSupportedTransferTypes();
            if (!(supportedTransferTypes instanceof java.util.Collection) || !supportedTransferTypes.isEmpty()) {
                java.util.Iterator<T> it = supportedTransferTypes.iterator();
                while (it.hasNext()) {
                    if (((com.paypal.oslo.feature.p2p.domain.model.TransferType) it.next()).getType() == updatePaymentTransferAttemptReceiver.getSelectedTransferType()) {
                        return updatePaymentTransferAttemptReceiver.getSelectedTransferType();
                    }
                }
            }
        }
        java.util.Iterator<T> it2 = updatePaymentTransferAttemptReceiver.getSupportedTransferTypes().iterator();
        while (true) {
            if (!it2.hasNext()) {
                obj = null;
                break;
            }
            obj = it2.next();
            if (((com.paypal.oslo.feature.p2p.domain.model.TransferType) obj).getDefault()) {
                break;
            }
        }
        com.paypal.oslo.feature.p2p.domain.model.TransferType transferType = (com.paypal.oslo.feature.p2p.domain.model.TransferType) obj;
        if (transferType != null) {
            return transferType.getType();
        }
        return null;
    }

    public static final boolean hasFeesLine(com.paypal.oslo.feature.moneymovement.api.domain.PaymentPlan paymentPlan) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(paymentPlan, "");
        com.paypal.oslo.feature.moneymovement.api.domain.AmountsBreakdown amountsBreakdown = paymentPlan.getAmountsBreakdown();
        return (amountsBreakdown != null ? amountsBreakdown.getTotalFee() : null) != null;
    }

    public static final java.lang.String getCurrencySymbol(java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        try {
            java.lang.String symbol = java.util.Currency.getInstance(str).getSymbol(java.util.Locale.US);
            kotlin.jvm.internal.Intrinsics.checkNotNull(symbol);
            return symbol;
        } catch (java.lang.IllegalArgumentException unused) {
            return str;
        }
    }

    public static final java.lang.String formatExchangeRate(com.paypal.oslo.feature.p2p.domain.model.ExchangeRate exchangeRate) {
        if (exchangeRate == null) {
            return "";
        }
        java.lang.String currencyCode = exchangeRate.getFromCurrency().getCurrencyCode();
        java.lang.String value = exchangeRate.getToCurrency().getValue();
        java.lang.String currencyCode2 = exchangeRate.getToCurrency().getCurrencyCode();
        if (kotlin.text.StringsKt.isBlank(currencyCode) || kotlin.text.StringsKt.isBlank(value) || kotlin.text.StringsKt.isBlank(currencyCode2)) {
            return "";
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder("1 ");
        sb.append(currencyCode);
        sb.append(com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.UIConstants.EQUALS_SIGN_WITH_SPACES);
        sb.append(value);
        sb.append(" ");
        sb.append(currencyCode2);
        return sb.toString();
    }

    public static final java.lang.String formatAmountWithCurrency(java.lang.String str, java.lang.String str2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
        java.lang.String currencySymbol = getCurrencySymbol(str2);
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(currencySymbol);
        sb.append(str);
        sb.append(" ");
        sb.append(str2);
        return sb.toString();
    }

    public static final java.lang.String buildSenderAmountDisplayFromUiAmount(com.paypal.oslo.feature.p2p.ui.review.state.UiAmount uiAmount, java.lang.String str) {
        java.lang.String str2;
        com.paypal.oslo.feature.moneymovement.api.shared.domain.MoneyAmount money;
        com.paypal.oslo.feature.moneymovement.api.shared.domain.MoneyAmount.FiatDetails fiat;
        if (uiAmount == null || (money = uiAmount.getMoney()) == null || (fiat = money.getFiat()) == null || (str2 = fiat.getQuantity()) == null) {
            str2 = "0";
        }
        return buildSenderAmountDisplay(str2, str);
    }

    public static final java.lang.String buildSenderAmountDisplay(java.lang.String str, java.lang.String str2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        java.lang.String str3 = str2;
        return (str3 == null || str3.length() == 0) ? str : formatAmountWithCurrency(str, str2);
    }

    @kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[com.paypal.oslo.feature.p2p.domain.model.PaymentTransferIntent.values().length];
            try {
                iArr[com.paypal.oslo.feature.p2p.domain.model.PaymentTransferIntent.SEND.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[com.paypal.oslo.feature.p2p.domain.model.PaymentTransferIntent.REQUEST.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                iArr[com.paypal.oslo.feature.p2p.domain.model.PaymentTransferIntent.UNKNOWN.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[com.paypal.oslo.feature.p2p.domain.model.ConversionProvider.values().length];
            try {
                iArr2[com.paypal.oslo.feature.p2p.domain.model.ConversionProvider.PAYPAL.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
            try {
                iArr2[com.paypal.oslo.feature.p2p.domain.model.ConversionProvider.ISSUER.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused5) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }
}
