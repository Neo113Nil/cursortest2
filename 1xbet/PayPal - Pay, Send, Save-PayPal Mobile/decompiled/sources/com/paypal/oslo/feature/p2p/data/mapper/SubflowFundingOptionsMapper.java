package com.paypal.oslo.feature.p2p.data.mapper;

@kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\b\u0000\u0018\u00002\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0001B)\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u001b\u0010\u000f\u001a\u0004\u0018\u00010\u00032\b\u0010\u000e\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0013\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0016\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0017\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0014\u0010\u0011\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0019"}, d2 = {"Lcom/paypal/oslo/feature/p2p/data/mapper/SubflowFundingOptionsMapper;", "Lcom/paypal/oslo/feature/p2p/domain/common/mapper/Mapper;", "Lcom/paypal/oslo/feature/p2p/graphql/StartPaymentTransferAttemptForSubflowMutation$FundingOptions;", "Lcom/paypal/oslo/feature/p2p/domain/model/FundingOptions;", "Lcom/paypal/oslo/feature/p2p/data/mapper/FundingOptionsMappingDelegate;", "delegate", "Lcom/paypal/oslo/feature/p2p/data/mapper/PrePaymentDisclosureMapper;", "prePaymentDisclosureMapper", "Lcom/paypal/oslo/feature/p2p/data/mapper/PaymentPlanDisclosureMapper;", "paymentPlanDisclosureMapper", "Lcom/paypal/oslo/feature/p2p/data/mapper/PlanContingencyMapper;", "planContingencyMapper", "<init>", "(Lcom/paypal/oslo/feature/p2p/data/mapper/FundingOptionsMappingDelegate;Lcom/paypal/oslo/feature/p2p/data/mapper/PrePaymentDisclosureMapper;Lcom/paypal/oslo/feature/p2p/data/mapper/PaymentPlanDisclosureMapper;Lcom/paypal/oslo/feature/p2p/data/mapper/PlanContingencyMapper;)V", "input", "map", "(Lcom/paypal/oslo/feature/p2p/graphql/StartPaymentTransferAttemptForSubflowMutation$FundingOptions;)Lcom/paypal/oslo/feature/p2p/domain/model/FundingOptions;", "getHighSpeedVideoSizes", "Lcom/paypal/oslo/feature/p2p/data/mapper/FundingOptionsMappingDelegate;", "Camera2StreamConfigurationMap", "getHighSpeedVideoFpsRanges", "Lcom/paypal/oslo/feature/p2p/data/mapper/PrePaymentDisclosureMapper;", "getHighResolutionOutputSizeshNQ4ISI", "getHighSpeedVideoFpsRangesFor", "Lcom/paypal/oslo/feature/p2p/data/mapper/PaymentPlanDisclosureMapper;", "Lcom/paypal/oslo/feature/p2p/data/mapper/PlanContingencyMapper;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class SubflowFundingOptionsMapper implements com.paypal.oslo.feature.p2p.domain.common.mapper.Mapper<com.paypal.oslo.feature.p2p.graphql.StartPaymentTransferAttemptForSubflowMutation.FundingOptions, com.paypal.oslo.feature.p2p.domain.model.FundingOptions> {
    public static final int $stable = 0;

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.p2p.data.mapper.PlanContingencyMapper getHighSpeedVideoSizes;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.p2p.data.mapper.PrePaymentDisclosureMapper getHighResolutionOutputSizeshNQ4ISI;
    private final com.paypal.oslo.feature.p2p.data.mapper.PaymentPlanDisclosureMapper getHighSpeedVideoFpsRangesFor;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.p2p.data.mapper.FundingOptionsMappingDelegate Camera2StreamConfigurationMap;

    @javax.inject.Inject
    public SubflowFundingOptionsMapper(com.paypal.oslo.feature.p2p.data.mapper.FundingOptionsMappingDelegate fundingOptionsMappingDelegate, com.paypal.oslo.feature.p2p.data.mapper.PrePaymentDisclosureMapper prePaymentDisclosureMapper, com.paypal.oslo.feature.p2p.data.mapper.PaymentPlanDisclosureMapper paymentPlanDisclosureMapper, com.paypal.oslo.feature.p2p.data.mapper.PlanContingencyMapper planContingencyMapper) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(fundingOptionsMappingDelegate, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(prePaymentDisclosureMapper, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(paymentPlanDisclosureMapper, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(planContingencyMapper, "");
        this.Camera2StreamConfigurationMap = fundingOptionsMappingDelegate;
        this.getHighResolutionOutputSizeshNQ4ISI = prePaymentDisclosureMapper;
        this.getHighSpeedVideoFpsRangesFor = paymentPlanDisclosureMapper;
        this.getHighSpeedVideoSizes = planContingencyMapper;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v0 */
    /* JADX WARN: Type inference failed for: r10v1, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r10v2 */
    @Override // com.paypal.oslo.feature.p2p.domain.common.mapper.Mapper
    public final com.paypal.oslo.feature.p2p.domain.model.FundingOptions map(com.paypal.oslo.feature.p2p.graphql.StartPaymentTransferAttemptForSubflowMutation.FundingOptions input) {
        java.util.ArrayList arrayList;
        java.lang.Object obj;
        com.paypal.oslo.feature.p2p.data.mapper.SenderData senderData;
        com.paypal.oslo.feature.p2p.data.mapper.ReceiverData receiverData;
        java.util.ArrayList arrayList2;
        java.util.ArrayList arrayList3;
        com.paypal.oslo.feature.p2p.data.mapper.FeeBreakdownData feeBreakdownData;
        kotlin.Pair pair;
        com.paypal.oslo.feature.p2p.data.mapper.InstrumentDetails createUnknownInstrumentDetails$p2p_prodRelease;
        com.paypal.oslo.feature.p2p.graphql.StartPaymentTransferAttemptForSubflowMutation.Receiver1 receiver;
        com.paypal.oslo.feature.p2p.data.mapper.InstrumentDetails createUnknownInstrumentDetails$p2p_prodRelease2;
        com.paypal.oslo.feature.p2p.domain.model.FundingSource mapFundingSource;
        com.paypal.oslo.feature.p2p.graphql.StartPaymentTransferAttemptForSubflowMutation.AmountReceived amountReceived = null;
        if (input == null) {
            return null;
        }
        java.util.List<com.paypal.oslo.feature.p2p.graphql.StartPaymentTransferAttemptForSubflowMutation.AllowedOption> allowedOptions = input.getAllowedOptions();
        java.util.ArrayList arrayList4 = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(allowedOptions, 10));
        for (com.paypal.oslo.feature.p2p.graphql.StartPaymentTransferAttemptForSubflowMutation.AllowedOption allowedOption : allowedOptions) {
            java.lang.String obj2 = allowedOption.getId().toString();
            java.util.List<com.paypal.oslo.feature.p2p.graphql.StartPaymentTransferAttemptForSubflowMutation.FundingSource> fundingSources = allowedOption.getFundingSources();
            java.util.ArrayList arrayList5 = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(fundingSources, 10));
            for (com.paypal.oslo.feature.p2p.graphql.StartPaymentTransferAttemptForSubflowMutation.FundingSource fundingSource : fundingSources) {
                com.paypal.oslo.feature.p2p.graphql.StartPaymentTransferAttemptForSubflowMutation.Amount amount = fundingSource.getAmount();
                if (amount instanceof com.paypal.oslo.feature.p2p.graphql.StartPaymentTransferAttemptForSubflowMutation.Amount) {
                    kotlin.Pair pair2 = kotlin.TuplesKt.to(amount.getCurrencyCode().toString(), amount.getValue());
                    java.lang.String str = (java.lang.String) pair2.component1();
                    java.lang.String str2 = (java.lang.String) pair2.component2();
                    com.paypal.oslo.feature.p2p.graphql.StartPaymentTransferAttemptForSubflowMutation.Instrument instrument = fundingSource.getInstrument();
                    if (instrument.getOnBankAccount() != null) {
                        createUnknownInstrumentDetails$p2p_prodRelease2 = this.Camera2StreamConfigurationMap.extractFromBankAccountFragment$p2p_prodRelease(instrument.getOnBankAccount().getBankAccountFields());
                    } else if (instrument.getOnCard() != null) {
                        createUnknownInstrumentDetails$p2p_prodRelease2 = this.Camera2StreamConfigurationMap.extractFromCardFragment$p2p_prodRelease(instrument.getOnCard().getCardFields());
                    } else if (instrument.getOnBalance() != null) {
                        createUnknownInstrumentDetails$p2p_prodRelease2 = this.Camera2StreamConfigurationMap.extractFromBalanceFragment$p2p_prodRelease(instrument.getOnBalance().getBalanceFields());
                    } else {
                        createUnknownInstrumentDetails$p2p_prodRelease2 = this.Camera2StreamConfigurationMap.createUnknownInstrumentDetails$p2p_prodRelease(instrument.get__typename());
                    }
                    mapFundingSource = this.Camera2StreamConfigurationMap.mapFundingSource(createUnknownInstrumentDetails$p2p_prodRelease2.getId(), createUnknownInstrumentDetails$p2p_prodRelease2.getType(), str, str2, (r25 & 16) != 0 ? null : createUnknownInstrumentDetails$p2p_prodRelease2.getNickname(), (r25 & 32) != 0 ? null : createUnknownInstrumentDetails$p2p_prodRelease2.getBrand(), (r25 & 64) != 0 ? null : createUnknownInstrumentDetails$p2p_prodRelease2.getIssuerName(), (r25 & 128) != 0 ? null : createUnknownInstrumentDetails$p2p_prodRelease2.getLastNChars(), (r25 & 256) != 0 ? null : createUnknownInstrumentDetails$p2p_prodRelease2.getValue(), (r25 & 512) != 0 ? null : null);
                    arrayList5.add(mapFundingSource);
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
            java.util.ArrayList arrayList6 = arrayList5;
            java.util.List<com.paypal.oslo.feature.p2p.graphql.StartPaymentTransferAttemptForSubflowMutation.BackupFundingSource> backupFundingSources = allowedOption.getBackupFundingSources();
            if (backupFundingSources != null) {
                java.util.List<com.paypal.oslo.feature.p2p.graphql.StartPaymentTransferAttemptForSubflowMutation.BackupFundingSource> list = backupFundingSources;
                java.util.ArrayList arrayList7 = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(list, 10));
                for (com.paypal.oslo.feature.p2p.graphql.StartPaymentTransferAttemptForSubflowMutation.BackupFundingSource backupFundingSource : list) {
                    com.paypal.oslo.feature.p2p.graphql.StartPaymentTransferAttemptForSubflowMutation.AmountsBreakdown amountsBreakdown = allowedOption.getAmountsBreakdown();
                    com.paypal.oslo.feature.p2p.graphql.StartPaymentTransferAttemptForSubflowMutation.AmountReceived amountReceived2 = (amountsBreakdown == null || (receiver = amountsBreakdown.getReceiver()) == null) ? amountReceived : receiver.getAmountReceived();
                    com.paypal.oslo.feature.p2p.data.mapper.FundingOptionsMappingDelegate fundingOptionsMappingDelegate = this.Camera2StreamConfigurationMap;
                    if (amountReceived2 != null) {
                        pair = kotlin.TuplesKt.to(amountReceived2.getCurrencyCode().toString(), amountReceived2.getValue());
                    } else {
                        pair = kotlin.TuplesKt.to("USD", "0.00");
                    }
                    java.lang.String str3 = (java.lang.String) pair.component1();
                    java.lang.String str4 = (java.lang.String) pair.component2();
                    com.paypal.oslo.feature.p2p.graphql.StartPaymentTransferAttemptForSubflowMutation.Instrument1 instrument2 = backupFundingSource.getInstrument();
                    if (instrument2.getOnBankAccount() != null) {
                        createUnknownInstrumentDetails$p2p_prodRelease = this.Camera2StreamConfigurationMap.extractFromBankAccountFragment$p2p_prodRelease(instrument2.getOnBankAccount().getBankAccountFields());
                    } else if (instrument2.getOnCard() != null) {
                        createUnknownInstrumentDetails$p2p_prodRelease = this.Camera2StreamConfigurationMap.extractFromCardFragment$p2p_prodRelease(instrument2.getOnCard().getCardFields());
                    } else if (instrument2.getOnBalance() != null) {
                        createUnknownInstrumentDetails$p2p_prodRelease = this.Camera2StreamConfigurationMap.extractFromBalanceFragment$p2p_prodRelease(instrument2.getOnBalance().getBalanceFields());
                    } else {
                        createUnknownInstrumentDetails$p2p_prodRelease = this.Camera2StreamConfigurationMap.createUnknownInstrumentDetails$p2p_prodRelease(instrument2.get__typename());
                    }
                    arrayList7.add(fundingOptionsMappingDelegate.mapFundingSource(createUnknownInstrumentDetails$p2p_prodRelease.getId(), createUnknownInstrumentDetails$p2p_prodRelease.getType(), str3, str4, createUnknownInstrumentDetails$p2p_prodRelease.getNickname(), createUnknownInstrumentDetails$p2p_prodRelease.getBrand(), createUnknownInstrumentDetails$p2p_prodRelease.getIssuerName(), createUnknownInstrumentDetails$p2p_prodRelease.getLastNChars(), createUnknownInstrumentDetails$p2p_prodRelease.getValue(), createUnknownInstrumentDetails$p2p_prodRelease.getBankAccountType()));
                }
                obj = arrayList7;
            } else {
                obj = amountReceived;
            }
            ?? emptyList = obj == null ? kotlin.collections.CollectionsKt.emptyList() : obj;
            com.paypal.oslo.feature.p2p.data.mapper.FundingOptionsMappingDelegate fundingOptionsMappingDelegate2 = this.Camera2StreamConfigurationMap;
            com.paypal.oslo.feature.p2p.graphql.StartPaymentTransferAttemptForSubflowMutation.AmountsBreakdown amountsBreakdown2 = allowedOption.getAmountsBreakdown();
            if (amountsBreakdown2 != null) {
                com.paypal.oslo.feature.p2p.graphql.StartPaymentTransferAttemptForSubflowMutation.Sender sender = amountsBreakdown2.getSender();
                com.paypal.oslo.feature.p2p.data.mapper.AmountData amountData = new com.paypal.oslo.feature.p2p.data.mapper.AmountData(sender.getAmountSent().getValue(), sender.getAmountSent().getCurrencyCode().toString());
                com.paypal.oslo.feature.p2p.data.mapper.AmountData amountData2 = new com.paypal.oslo.feature.p2p.data.mapper.AmountData(sender.getTotalFee().getValue(), sender.getTotalFee().getCurrencyCode().toString());
                com.paypal.oslo.feature.p2p.graphql.StartPaymentTransferAttemptForSubflowMutation.FeeBreakdown feeBreakdown = sender.getFeeBreakdown();
                if (feeBreakdown != null) {
                    com.paypal.oslo.feature.p2p.graphql.StartPaymentTransferAttemptForSubflowMutation.InstrumentFees instrumentFees = feeBreakdown.getInstrumentFees();
                    com.paypal.oslo.feature.p2p.data.mapper.AmountData amountData3 = instrumentFees != null ? new com.paypal.oslo.feature.p2p.data.mapper.AmountData(instrumentFees.getValue(), instrumentFees.getCurrencyCode().toString()) : null;
                    com.paypal.oslo.feature.p2p.graphql.StartPaymentTransferAttemptForSubflowMutation.CrossBorderFees crossBorderFees = feeBreakdown.getCrossBorderFees();
                    feeBreakdownData = new com.paypal.oslo.feature.p2p.data.mapper.FeeBreakdownData(amountData3, crossBorderFees != null ? new com.paypal.oslo.feature.p2p.data.mapper.AmountData(crossBorderFees.getValue(), crossBorderFees.getCurrencyCode().toString()) : null);
                } else {
                    feeBreakdownData = null;
                }
                senderData = new com.paypal.oslo.feature.p2p.data.mapper.SenderData(amountData, amountData2, feeBreakdownData, new com.paypal.oslo.feature.p2p.data.mapper.AmountData(sender.getTotalAmountSent().getValue(), sender.getTotalAmountSent().getCurrencyCode().toString()));
            } else {
                senderData = null;
            }
            com.paypal.oslo.feature.p2p.graphql.StartPaymentTransferAttemptForSubflowMutation.AmountsBreakdown amountsBreakdown3 = allowedOption.getAmountsBreakdown();
            if (amountsBreakdown3 != null) {
                com.paypal.oslo.feature.p2p.graphql.StartPaymentTransferAttemptForSubflowMutation.Receiver1 receiver2 = amountsBreakdown3.getReceiver();
                receiverData = new com.paypal.oslo.feature.p2p.data.mapper.ReceiverData(new com.paypal.oslo.feature.p2p.data.mapper.AmountData(receiver2.getAmountReceived().getValue(), receiver2.getAmountReceived().getCurrencyCode().toString()));
            } else {
                receiverData = null;
            }
            com.paypal.oslo.feature.p2p.domain.model.AmountsBreakdown mapAmountsBreakdown = fundingOptionsMappingDelegate2.mapAmountsBreakdown(senderData, receiverData);
            boolean z = allowedOption.getDefault();
            java.util.List<com.paypal.oslo.feature.p2p.graphql.StartPaymentTransferAttemptForSubflowMutation.PaymentDisclosure> paymentDisclosures = allowedOption.getPaymentDisclosures();
            if (paymentDisclosures != null) {
                java.util.List<com.paypal.oslo.feature.p2p.graphql.StartPaymentTransferAttemptForSubflowMutation.PaymentDisclosure> list2 = paymentDisclosures;
                java.util.ArrayList arrayList8 = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(list2, 10));
                java.util.Iterator it = list2.iterator();
                while (it.hasNext()) {
                    arrayList8.add(this.getHighSpeedVideoFpsRangesFor.map(((com.paypal.oslo.feature.p2p.graphql.StartPaymentTransferAttemptForSubflowMutation.PaymentDisclosure) it.next()).getPaymentPlanDisclosureFragment()));
                }
                arrayList2 = arrayList8;
            } else {
                arrayList2 = null;
            }
            java.util.List emptyList2 = arrayList2 == null ? kotlin.collections.CollectionsKt.emptyList() : arrayList2;
            java.util.List<com.paypal.oslo.feature.p2p.graphql.StartPaymentTransferAttemptForSubflowMutation.Contingency> contingencies = allowedOption.getContingencies();
            if (contingencies != null) {
                java.util.ArrayList arrayList9 = new java.util.ArrayList();
                java.util.Iterator it2 = contingencies.iterator();
                while (it2.hasNext()) {
                    com.paypal.oslo.feature.p2p.domain.model.PlanContingency map = this.getHighSpeedVideoSizes.map(((com.paypal.oslo.feature.p2p.graphql.StartPaymentTransferAttemptForSubflowMutation.Contingency) it2.next()).getPlanContingencyFragment());
                    if (map != null) {
                        arrayList9.add(map);
                    }
                }
                arrayList3 = arrayList9;
            } else {
                arrayList3 = null;
            }
            arrayList4.add(new com.paypal.oslo.feature.p2p.domain.model.FundingOption(obj2, arrayList6, emptyList, mapAmountsBreakdown, z, emptyList2, arrayList3 == null ? kotlin.collections.CollectionsKt.emptyList() : arrayList3, null, null, null, 896, null));
            amountReceived = null;
        }
        java.util.ArrayList arrayList10 = arrayList4;
        java.util.List<com.paypal.oslo.feature.p2p.graphql.StartPaymentTransferAttemptForSubflowMutation.PrePaymentDisclosure> prePaymentDisclosures = input.getPrePaymentDisclosures();
        if (prePaymentDisclosures != null) {
            java.util.List<com.paypal.oslo.feature.p2p.graphql.StartPaymentTransferAttemptForSubflowMutation.PrePaymentDisclosure> list3 = prePaymentDisclosures;
            java.util.ArrayList arrayList11 = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(list3, 10));
            java.util.Iterator it3 = list3.iterator();
            while (it3.hasNext()) {
                arrayList11.add(this.getHighResolutionOutputSizeshNQ4ISI.map(((com.paypal.oslo.feature.p2p.graphql.StartPaymentTransferAttemptForSubflowMutation.PrePaymentDisclosure) it3.next()).getPrePaymentDisclosureFragment()));
            }
            arrayList = arrayList11;
        } else {
            arrayList = null;
        }
        if (arrayList == null) {
            arrayList = kotlin.collections.CollectionsKt.emptyList();
        }
        return new com.paypal.oslo.feature.p2p.domain.model.FundingOptions(arrayList10, arrayList, null, 4, null);
    }
}
