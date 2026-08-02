package com.paypal.oslo.feature.p2p.data.mapper;

@kotlin.Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0013\b\u0000\u0018\u00002\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0001B9\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\u001b\u0010\u0013\u001a\u0004\u0018\u00010\u00032\b\u0010\u0012\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0017\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0014\u0010\u001a\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0014\u0010\u0015\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u001bR\u0014\u0010\u001d\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001cR\u0014\u0010\u001f\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0014\u0010!\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 "}, d2 = {"Lcom/paypal/oslo/feature/p2p/data/mapper/PaymentTransferAttemptFundingOptionsMapper;", "Lcom/paypal/oslo/feature/p2p/domain/common/mapper/Mapper;", "Lcom/paypal/oslo/feature/p2p/graphql/fragment/P2PFundingOptionsFragment;", "Lcom/paypal/oslo/feature/p2p/domain/model/FundingOptions;", "Lcom/paypal/oslo/feature/p2p/data/mapper/FundingOptionsMappingDelegate;", "delegate", "Lcom/paypal/oslo/feature/p2p/data/mapper/PrePaymentDisclosureMapper;", "prePaymentDisclosureMapper", "Lcom/paypal/oslo/feature/p2p/data/mapper/PaymentPlanDisclosureMapper;", "paymentPlanDisclosureMapper", "Lcom/paypal/oslo/feature/p2p/data/mapper/ContingencyMapper;", "contingencyMapper", "Lcom/paypal/oslo/feature/p2p/data/mapper/PlanContingencyMapper;", "planContingencyMapper", "Lcom/paypal/oslo/feature/p2p/data/mapper/PlanCurrencyExchangeMapper;", "planCurrencyExchangeMapper", "<init>", "(Lcom/paypal/oslo/feature/p2p/data/mapper/FundingOptionsMappingDelegate;Lcom/paypal/oslo/feature/p2p/data/mapper/PrePaymentDisclosureMapper;Lcom/paypal/oslo/feature/p2p/data/mapper/PaymentPlanDisclosureMapper;Lcom/paypal/oslo/feature/p2p/data/mapper/ContingencyMapper;Lcom/paypal/oslo/feature/p2p/data/mapper/PlanContingencyMapper;Lcom/paypal/oslo/feature/p2p/data/mapper/PlanCurrencyExchangeMapper;)V", "input", "map", "(Lcom/paypal/oslo/feature/p2p/graphql/fragment/P2PFundingOptionsFragment;)Lcom/paypal/oslo/feature/p2p/domain/model/FundingOptions;", "getHighSpeedVideoSizes", "Lcom/paypal/oslo/feature/p2p/data/mapper/FundingOptionsMappingDelegate;", "Camera2StreamConfigurationMap", "getOutputMinFrameDuration", "Lcom/paypal/oslo/feature/p2p/data/mapper/PrePaymentDisclosureMapper;", "getHighSpeedVideoFpsRanges", "Lcom/paypal/oslo/feature/p2p/data/mapper/PaymentPlanDisclosureMapper;", "Lcom/paypal/oslo/feature/p2p/data/mapper/ContingencyMapper;", "getHighResolutionOutputSizeshNQ4ISI", "Lcom/paypal/oslo/feature/p2p/data/mapper/PlanContingencyMapper;", "getHighSpeedVideoFpsRangesFor", "Lcom/paypal/oslo/feature/p2p/data/mapper/PlanCurrencyExchangeMapper;", "getInputSizeshNQ4ISI"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class PaymentTransferAttemptFundingOptionsMapper implements com.paypal.oslo.feature.p2p.domain.common.mapper.Mapper<com.paypal.oslo.feature.p2p.graphql.fragment.P2PFundingOptionsFragment, com.paypal.oslo.feature.p2p.domain.model.FundingOptions> {
    public static final int $stable = 0;

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.p2p.data.mapper.PaymentPlanDisclosureMapper getHighSpeedVideoSizes;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.p2p.data.mapper.PlanContingencyMapper getHighSpeedVideoFpsRangesFor;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.p2p.data.mapper.ContingencyMapper getHighResolutionOutputSizeshNQ4ISI;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.p2p.data.mapper.PlanCurrencyExchangeMapper getInputSizeshNQ4ISI;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.p2p.data.mapper.FundingOptionsMappingDelegate Camera2StreamConfigurationMap;

    /* renamed from: getOutputMinFrameDuration, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.p2p.data.mapper.PrePaymentDisclosureMapper getHighSpeedVideoFpsRanges;

    @javax.inject.Inject
    public PaymentTransferAttemptFundingOptionsMapper(com.paypal.oslo.feature.p2p.data.mapper.FundingOptionsMappingDelegate fundingOptionsMappingDelegate, com.paypal.oslo.feature.p2p.data.mapper.PrePaymentDisclosureMapper prePaymentDisclosureMapper, com.paypal.oslo.feature.p2p.data.mapper.PaymentPlanDisclosureMapper paymentPlanDisclosureMapper, com.paypal.oslo.feature.p2p.data.mapper.ContingencyMapper contingencyMapper, com.paypal.oslo.feature.p2p.data.mapper.PlanContingencyMapper planContingencyMapper, com.paypal.oslo.feature.p2p.data.mapper.PlanCurrencyExchangeMapper planCurrencyExchangeMapper) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(fundingOptionsMappingDelegate, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(prePaymentDisclosureMapper, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(paymentPlanDisclosureMapper, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(contingencyMapper, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(planContingencyMapper, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(planCurrencyExchangeMapper, "");
        this.Camera2StreamConfigurationMap = fundingOptionsMappingDelegate;
        this.getHighSpeedVideoFpsRanges = prePaymentDisclosureMapper;
        this.getHighSpeedVideoSizes = paymentPlanDisclosureMapper;
        this.getHighResolutionOutputSizeshNQ4ISI = contingencyMapper;
        this.getHighSpeedVideoFpsRangesFor = planContingencyMapper;
        this.getInputSizeshNQ4ISI = planCurrencyExchangeMapper;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v6 */
    /* JADX WARN: Type inference failed for: r6v7 */
    /* JADX WARN: Type inference failed for: r6v8, types: [java.util.List] */
    @Override // com.paypal.oslo.feature.p2p.domain.common.mapper.Mapper
    public final com.paypal.oslo.feature.p2p.domain.model.FundingOptions map(com.paypal.oslo.feature.p2p.graphql.fragment.P2PFundingOptionsFragment input) {
        java.util.ArrayList arrayList;
        java.util.ArrayList arrayList2;
        java.lang.Object obj;
        com.paypal.oslo.feature.p2p.data.mapper.SenderData senderData;
        com.paypal.oslo.feature.p2p.data.mapper.ReceiverData receiverData;
        java.util.ArrayList arrayList3;
        java.util.ArrayList arrayList4;
        com.paypal.oslo.feature.p2p.domain.model.TransferSpeed transferSpeed;
        java.util.Iterator it;
        java.lang.String str;
        com.paypal.oslo.feature.p2p.domain.model.ConversionProvider conversionProvider;
        com.paypal.oslo.api.graphql.schema.type.CurrencyConversionProvider currencyConversionProvider;
        com.paypal.oslo.feature.p2p.domain.model.ConversionProvider conversionProvider2;
        com.paypal.oslo.feature.p2p.data.mapper.FeeBreakdownData feeBreakdownData;
        kotlin.Pair pair;
        com.paypal.oslo.feature.p2p.data.mapper.InstrumentDetails createUnknownInstrumentDetails$p2p_prodRelease;
        com.paypal.oslo.feature.p2p.graphql.fragment.P2PFundingOptionsFragment.Receiver receiver;
        com.paypal.oslo.feature.p2p.data.mapper.InstrumentDetails createUnknownInstrumentDetails$p2p_prodRelease2;
        com.paypal.oslo.feature.p2p.domain.model.FundingSource mapFundingSource;
        com.paypal.oslo.feature.p2p.graphql.fragment.P2PFundingOptionsFragment.AmountReceived amountReceived = null;
        if (input == null) {
            return null;
        }
        java.util.List<com.paypal.oslo.feature.p2p.graphql.fragment.P2PFundingOptionsFragment.AllowedOption> allowedOptions = input.getAllowedOptions();
        int i = 10;
        java.util.ArrayList arrayList5 = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(allowedOptions, 10));
        java.util.Iterator it2 = allowedOptions.iterator();
        while (it2.hasNext()) {
            com.paypal.oslo.feature.p2p.graphql.fragment.P2PFundingOptionsFragment.AllowedOption allowedOption = (com.paypal.oslo.feature.p2p.graphql.fragment.P2PFundingOptionsFragment.AllowedOption) it2.next();
            java.lang.String obj2 = allowedOption.getId().toString();
            java.util.List<com.paypal.oslo.feature.p2p.graphql.fragment.P2PFundingOptionsFragment.FundingSource> fundingSources = allowedOption.getFundingSources();
            java.util.ArrayList arrayList6 = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(fundingSources, i));
            for (com.paypal.oslo.feature.p2p.graphql.fragment.P2PFundingOptionsFragment.FundingSource fundingSource : fundingSources) {
                com.paypal.oslo.feature.p2p.graphql.fragment.P2PFundingOptionsFragment.Amount amount = fundingSource.getAmount();
                if (amount instanceof com.paypal.oslo.feature.p2p.graphql.fragment.P2PFundingOptionsFragment.Amount) {
                    kotlin.Pair pair2 = kotlin.TuplesKt.to(amount.getCurrencyCode().toString(), amount.getValue());
                    java.lang.String str2 = (java.lang.String) pair2.component1();
                    java.lang.String str3 = (java.lang.String) pair2.component2();
                    com.paypal.oslo.feature.p2p.graphql.fragment.P2PFundingOptionsFragment.Instrument instrument = fundingSource.getInstrument();
                    if (instrument.getOnBankAccount() != null) {
                        createUnknownInstrumentDetails$p2p_prodRelease2 = this.Camera2StreamConfigurationMap.extractFromBankAccountFragment$p2p_prodRelease(instrument.getOnBankAccount().getBankAccountFields());
                    } else if (instrument.getOnCard() != null) {
                        createUnknownInstrumentDetails$p2p_prodRelease2 = this.Camera2StreamConfigurationMap.extractFromCardFragment$p2p_prodRelease(instrument.getOnCard().getCardFields());
                    } else if (instrument.getOnBalance() != null) {
                        createUnknownInstrumentDetails$p2p_prodRelease2 = this.Camera2StreamConfigurationMap.extractFromBalanceFragment$p2p_prodRelease(instrument.getOnBalance().getBalanceFields());
                    } else {
                        createUnknownInstrumentDetails$p2p_prodRelease2 = this.Camera2StreamConfigurationMap.createUnknownInstrumentDetails$p2p_prodRelease(instrument.get__typename());
                    }
                    mapFundingSource = this.Camera2StreamConfigurationMap.mapFundingSource(createUnknownInstrumentDetails$p2p_prodRelease2.getId(), createUnknownInstrumentDetails$p2p_prodRelease2.getType(), str2, str3, (r25 & 16) != 0 ? null : createUnknownInstrumentDetails$p2p_prodRelease2.getNickname(), (r25 & 32) != 0 ? null : createUnknownInstrumentDetails$p2p_prodRelease2.getBrand(), (r25 & 64) != 0 ? null : createUnknownInstrumentDetails$p2p_prodRelease2.getIssuerName(), (r25 & 128) != 0 ? null : createUnknownInstrumentDetails$p2p_prodRelease2.getLastNChars(), (r25 & 256) != 0 ? null : createUnknownInstrumentDetails$p2p_prodRelease2.getValue(), (r25 & 512) != 0 ? null : null);
                    arrayList6.add(mapFundingSource);
                } else {
                    com.paypal.android.logger.Logger logger = com.paypal.oslo.feature.p2p.LoggerKt.log;
                    kotlin.Pair[] pairArr = new kotlin.Pair[2];
                    java.lang.String getHighResolutionOutputSizeshNQ4ISI = kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(amount.getClass()).getGetHighResolutionOutputSizeshNQ4ISI();
                    if (getHighResolutionOutputSizeshNQ4ISI == null) {
                        getHighResolutionOutputSizeshNQ4ISI = "unknown";
                    }
                    pairArr[0] = kotlin.TuplesKt.to(com.paypal.oslo.feature.p2p.domain.constants.P2pConstants.Log.Attributes.AMOUNT_CLASS, getHighResolutionOutputSizeshNQ4ISI);
                    pairArr[1] = kotlin.TuplesKt.to("context", "FundingSource");
                    com.paypal.android.logger.Logger.e$default(logger, com.paypal.oslo.feature.p2p.domain.constants.P2pConstants.Log.Events.MAPPER_UNEXPECTED_AMOUNT_TYPE, kotlin.collections.MapsKt.mapOf(pairArr), null, null, 12, null);
                    throw new java.lang.IllegalArgumentException("Unexpected amount type: ".concat(java.lang.String.valueOf(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(amount.getClass()).getGetHighResolutionOutputSizeshNQ4ISI())));
                }
            }
            java.util.ArrayList arrayList7 = arrayList6;
            java.util.List<com.paypal.oslo.feature.p2p.graphql.fragment.P2PFundingOptionsFragment.BackupFundingSource> backupFundingSources = allowedOption.getBackupFundingSources();
            if (backupFundingSources != null) {
                java.util.List<com.paypal.oslo.feature.p2p.graphql.fragment.P2PFundingOptionsFragment.BackupFundingSource> list = backupFundingSources;
                java.util.ArrayList arrayList8 = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(list, i));
                for (com.paypal.oslo.feature.p2p.graphql.fragment.P2PFundingOptionsFragment.BackupFundingSource backupFundingSource : list) {
                    com.paypal.oslo.feature.p2p.graphql.fragment.P2PFundingOptionsFragment.AmountsBreakdown amountsBreakdown = allowedOption.getAmountsBreakdown();
                    com.paypal.oslo.feature.p2p.graphql.fragment.P2PFundingOptionsFragment.AmountReceived amountReceived2 = (amountsBreakdown == null || (receiver = amountsBreakdown.getReceiver()) == null) ? amountReceived : receiver.getAmountReceived();
                    com.paypal.oslo.feature.p2p.data.mapper.FundingOptionsMappingDelegate fundingOptionsMappingDelegate = this.Camera2StreamConfigurationMap;
                    if (amountReceived2 != null) {
                        pair = kotlin.TuplesKt.to(amountReceived2.getCurrencyCode().toString(), amountReceived2.getValue());
                    } else {
                        pair = kotlin.TuplesKt.to("USD", "0.00");
                    }
                    java.lang.String str4 = (java.lang.String) pair.component1();
                    java.lang.String str5 = (java.lang.String) pair.component2();
                    com.paypal.oslo.feature.p2p.graphql.fragment.P2PFundingOptionsFragment.Instrument1 instrument2 = backupFundingSource.getInstrument();
                    if (instrument2.getOnBankAccount() != null) {
                        createUnknownInstrumentDetails$p2p_prodRelease = this.Camera2StreamConfigurationMap.extractFromBankAccountFragment$p2p_prodRelease(instrument2.getOnBankAccount().getBankAccountFields());
                    } else if (instrument2.getOnCard() != null) {
                        createUnknownInstrumentDetails$p2p_prodRelease = this.Camera2StreamConfigurationMap.extractFromCardFragment$p2p_prodRelease(instrument2.getOnCard().getCardFields());
                    } else if (instrument2.getOnBalance() != null) {
                        createUnknownInstrumentDetails$p2p_prodRelease = this.Camera2StreamConfigurationMap.extractFromBalanceFragment$p2p_prodRelease(instrument2.getOnBalance().getBalanceFields());
                    } else {
                        createUnknownInstrumentDetails$p2p_prodRelease = this.Camera2StreamConfigurationMap.createUnknownInstrumentDetails$p2p_prodRelease(instrument2.get__typename());
                    }
                    arrayList8.add(fundingOptionsMappingDelegate.mapFundingSource(createUnknownInstrumentDetails$p2p_prodRelease.getId(), createUnknownInstrumentDetails$p2p_prodRelease.getType(), str4, str5, createUnknownInstrumentDetails$p2p_prodRelease.getNickname(), createUnknownInstrumentDetails$p2p_prodRelease.getBrand(), createUnknownInstrumentDetails$p2p_prodRelease.getIssuerName(), createUnknownInstrumentDetails$p2p_prodRelease.getLastNChars(), createUnknownInstrumentDetails$p2p_prodRelease.getValue(), createUnknownInstrumentDetails$p2p_prodRelease.getBankAccountType()));
                }
                obj = arrayList8;
            } else {
                obj = amountReceived;
            }
            java.util.List emptyList = obj == null ? kotlin.collections.CollectionsKt.emptyList() : obj;
            com.paypal.oslo.feature.p2p.data.mapper.FundingOptionsMappingDelegate fundingOptionsMappingDelegate2 = this.Camera2StreamConfigurationMap;
            com.paypal.oslo.feature.p2p.graphql.fragment.P2PFundingOptionsFragment.AmountsBreakdown amountsBreakdown2 = allowedOption.getAmountsBreakdown();
            if (amountsBreakdown2 != null) {
                com.paypal.oslo.feature.p2p.graphql.fragment.P2PFundingOptionsFragment.Sender sender = amountsBreakdown2.getSender();
                com.paypal.oslo.feature.p2p.data.mapper.AmountData amountData = new com.paypal.oslo.feature.p2p.data.mapper.AmountData(sender.getAmountSent().getValue(), sender.getAmountSent().getCurrencyCode().toString());
                com.paypal.oslo.feature.p2p.data.mapper.AmountData amountData2 = new com.paypal.oslo.feature.p2p.data.mapper.AmountData(sender.getTotalFee().getValue(), sender.getTotalFee().getCurrencyCode().toString());
                com.paypal.oslo.feature.p2p.graphql.fragment.P2PFundingOptionsFragment.FeeBreakdown feeBreakdown = sender.getFeeBreakdown();
                if (feeBreakdown != null) {
                    com.paypal.oslo.feature.p2p.graphql.fragment.P2PFundingOptionsFragment.InstrumentFees instrumentFees = feeBreakdown.getInstrumentFees();
                    com.paypal.oslo.feature.p2p.data.mapper.AmountData amountData3 = instrumentFees != null ? new com.paypal.oslo.feature.p2p.data.mapper.AmountData(instrumentFees.getValue(), instrumentFees.getCurrencyCode().toString()) : null;
                    com.paypal.oslo.feature.p2p.graphql.fragment.P2PFundingOptionsFragment.CrossBorderFees crossBorderFees = feeBreakdown.getCrossBorderFees();
                    feeBreakdownData = new com.paypal.oslo.feature.p2p.data.mapper.FeeBreakdownData(amountData3, crossBorderFees != null ? new com.paypal.oslo.feature.p2p.data.mapper.AmountData(crossBorderFees.getValue(), crossBorderFees.getCurrencyCode().toString()) : null);
                } else {
                    feeBreakdownData = null;
                }
                senderData = new com.paypal.oslo.feature.p2p.data.mapper.SenderData(amountData, amountData2, feeBreakdownData, new com.paypal.oslo.feature.p2p.data.mapper.AmountData(sender.getTotalAmountSent().getValue(), sender.getTotalAmountSent().getCurrencyCode().toString()));
            } else {
                senderData = null;
            }
            com.paypal.oslo.feature.p2p.graphql.fragment.P2PFundingOptionsFragment.AmountsBreakdown amountsBreakdown3 = allowedOption.getAmountsBreakdown();
            if (amountsBreakdown3 != null) {
                com.paypal.oslo.feature.p2p.graphql.fragment.P2PFundingOptionsFragment.Receiver receiver2 = amountsBreakdown3.getReceiver();
                receiverData = new com.paypal.oslo.feature.p2p.data.mapper.ReceiverData(new com.paypal.oslo.feature.p2p.data.mapper.AmountData(receiver2.getAmountReceived().getValue(), receiver2.getAmountReceived().getCurrencyCode().toString()));
            } else {
                receiverData = null;
            }
            com.paypal.oslo.feature.p2p.domain.model.AmountsBreakdown mapAmountsBreakdown = fundingOptionsMappingDelegate2.mapAmountsBreakdown(senderData, receiverData);
            boolean z = allowedOption.getDefault();
            java.util.List<com.paypal.oslo.feature.p2p.graphql.fragment.P2PFundingOptionsFragment.PaymentDisclosure> paymentDisclosures = allowedOption.getPaymentDisclosures();
            if (paymentDisclosures != null) {
                java.util.List<com.paypal.oslo.feature.p2p.graphql.fragment.P2PFundingOptionsFragment.PaymentDisclosure> list2 = paymentDisclosures;
                java.util.ArrayList arrayList9 = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(list2, i));
                java.util.Iterator it3 = list2.iterator();
                while (it3.hasNext()) {
                    arrayList9.add(this.getHighSpeedVideoSizes.map(((com.paypal.oslo.feature.p2p.graphql.fragment.P2PFundingOptionsFragment.PaymentDisclosure) it3.next()).getPaymentPlanDisclosureFragment()));
                }
                arrayList3 = arrayList9;
            } else {
                arrayList3 = null;
            }
            java.util.List emptyList2 = arrayList3 == null ? kotlin.collections.CollectionsKt.emptyList() : arrayList3;
            java.util.List<com.paypal.oslo.feature.p2p.graphql.fragment.P2PFundingOptionsFragment.PlanContingency> planContingencies = allowedOption.getPlanContingencies();
            if (planContingencies != null) {
                java.util.ArrayList arrayList10 = new java.util.ArrayList();
                java.util.Iterator it4 = planContingencies.iterator();
                while (it4.hasNext()) {
                    com.paypal.oslo.feature.p2p.domain.model.PlanContingency map = this.getHighSpeedVideoFpsRangesFor.map(((com.paypal.oslo.feature.p2p.graphql.fragment.P2PFundingOptionsFragment.PlanContingency) it4.next()).getPlanContingencyFragment());
                    if (map != null) {
                        arrayList10.add(map);
                    }
                }
                arrayList4 = arrayList10;
            } else {
                arrayList4 = null;
            }
            java.util.List emptyList3 = arrayList4 == null ? kotlin.collections.CollectionsKt.emptyList() : arrayList4;
            com.paypal.oslo.feature.p2p.domain.model.PlanCurrencyExchange map2 = this.getInputSizeshNQ4ISI.map(allowedOption.getCurrencyExchange());
            com.paypal.oslo.feature.p2p.graphql.fragment.P2PFundingOptionsFragment.PaymentDelivery paymentDelivery = allowedOption.getPaymentDelivery();
            java.lang.String upperCase = paymentDelivery.getSpeed().toString().toUpperCase(java.util.Locale.ROOT);
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(upperCase, "");
            int hashCode = upperCase.hashCode();
            if (hashCode == -1619414591) {
                if (upperCase.equals("INSTANT")) {
                    transferSpeed = com.paypal.oslo.feature.p2p.domain.model.TransferSpeed.INSTANT;
                }
                transferSpeed = com.paypal.oslo.feature.p2p.domain.model.TransferSpeed.STANDARD;
            } else if (hashCode == 1430517727) {
                if (upperCase.equals("DEFERRED")) {
                    transferSpeed = com.paypal.oslo.feature.p2p.domain.model.TransferSpeed.DEFERRED;
                }
                transferSpeed = com.paypal.oslo.feature.p2p.domain.model.TransferSpeed.STANDARD;
            } else {
                if (hashCode == 2095255229 && upperCase.equals("STANDARD")) {
                    transferSpeed = com.paypal.oslo.feature.p2p.domain.model.TransferSpeed.STANDARD;
                }
                transferSpeed = com.paypal.oslo.feature.p2p.domain.model.TransferSpeed.STANDARD;
            }
            java.lang.Object minimumDuration = paymentDelivery.getMinimumDuration();
            java.lang.String obj3 = minimumDuration != null ? minimumDuration.toString() : null;
            java.lang.Object maximumDuration = paymentDelivery.getMaximumDuration();
            java.lang.String obj4 = maximumDuration != null ? maximumDuration.toString() : null;
            java.lang.Object estimatedArrivalTime = paymentDelivery.getEstimatedArrivalTime();
            if (estimatedArrivalTime != null) {
                str = estimatedArrivalTime.toString();
                it = it2;
            } else {
                it = it2;
                str = null;
            }
            com.paypal.oslo.feature.p2p.domain.model.PaymentDelivery paymentDelivery2 = new com.paypal.oslo.feature.p2p.domain.model.PaymentDelivery(transferSpeed, obj3, obj4, str);
            com.paypal.oslo.feature.p2p.graphql.fragment.P2PFundingOptionsFragment.FundingSource fundingSource2 = (com.paypal.oslo.feature.p2p.graphql.fragment.P2PFundingOptionsFragment.FundingSource) kotlin.collections.CollectionsKt.firstOrNull((java.util.List) allowedOption.getFundingSources());
            if (fundingSource2 != null && (currencyConversionProvider = fundingSource2.getCurrencyConversionProvider()) != null) {
                int i2 = com.paypal.oslo.feature.p2p.data.mapper.PaymentTransferAttemptFundingOptionsMapper.WhenMappings.$EnumSwitchMapping$0[currencyConversionProvider.ordinal()];
                if (i2 == 1) {
                    conversionProvider2 = com.paypal.oslo.feature.p2p.domain.model.ConversionProvider.PAYPAL;
                } else if (i2 == 2) {
                    conversionProvider2 = com.paypal.oslo.feature.p2p.domain.model.ConversionProvider.ISSUER;
                }
                conversionProvider = conversionProvider2;
                arrayList5.add(new com.paypal.oslo.feature.p2p.domain.model.FundingOption(obj2, arrayList7, emptyList, mapAmountsBreakdown, z, emptyList2, emptyList3, map2, paymentDelivery2, conversionProvider));
                it2 = it;
                amountReceived = null;
                i = 10;
            }
            conversionProvider = null;
            arrayList5.add(new com.paypal.oslo.feature.p2p.domain.model.FundingOption(obj2, arrayList7, emptyList, mapAmountsBreakdown, z, emptyList2, emptyList3, map2, paymentDelivery2, conversionProvider));
            it2 = it;
            amountReceived = null;
            i = 10;
        }
        java.util.ArrayList arrayList11 = arrayList5;
        java.util.List<com.paypal.oslo.feature.p2p.graphql.fragment.P2PFundingOptionsFragment.PaymentContingency> paymentContingencies = input.getPaymentContingencies();
        if (paymentContingencies != null) {
            java.util.List<com.paypal.oslo.feature.p2p.graphql.fragment.P2PFundingOptionsFragment.PaymentContingency> list3 = paymentContingencies;
            java.util.ArrayList arrayList12 = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(list3, 10));
            java.util.Iterator it5 = list3.iterator();
            while (it5.hasNext()) {
                arrayList12.add(this.getHighResolutionOutputSizeshNQ4ISI.map(((com.paypal.oslo.feature.p2p.graphql.fragment.P2PFundingOptionsFragment.PaymentContingency) it5.next()).getPaymentContingencyFragment()));
            }
            arrayList = arrayList12;
        } else {
            arrayList = null;
        }
        if (arrayList == null) {
            arrayList = kotlin.collections.CollectionsKt.emptyList();
        }
        java.util.List<com.paypal.oslo.feature.p2p.graphql.fragment.P2PFundingOptionsFragment.PrePaymentDisclosure> prePaymentDisclosures = input.getPrePaymentDisclosures();
        if (prePaymentDisclosures != null) {
            java.util.List<com.paypal.oslo.feature.p2p.graphql.fragment.P2PFundingOptionsFragment.PrePaymentDisclosure> list4 = prePaymentDisclosures;
            java.util.ArrayList arrayList13 = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(list4, 10));
            java.util.Iterator it6 = list4.iterator();
            while (it6.hasNext()) {
                arrayList13.add(this.getHighSpeedVideoFpsRanges.map(((com.paypal.oslo.feature.p2p.graphql.fragment.P2PFundingOptionsFragment.PrePaymentDisclosure) it6.next()).getPrePaymentDisclosureFragment()));
            }
            arrayList2 = arrayList13;
        } else {
            arrayList2 = null;
        }
        if (arrayList2 == null) {
            arrayList2 = kotlin.collections.CollectionsKt.emptyList();
        }
        return new com.paypal.oslo.feature.p2p.domain.model.FundingOptions(arrayList11, arrayList2, arrayList);
    }

    @kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes13.dex */
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[com.paypal.oslo.api.graphql.schema.type.CurrencyConversionProvider.values().length];
            try {
                iArr[com.paypal.oslo.api.graphql.schema.type.CurrencyConversionProvider.PAYPAL.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[com.paypal.oslo.api.graphql.schema.type.CurrencyConversionProvider.ISSUER.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }
}
