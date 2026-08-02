package com.paypal.oslo.feature.moneymovement.ui.transfer.component.planaccordion.internal;

@kotlin.Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\"\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\bH\u0086@¢\u0006\u0004\b\u000b\u0010\fJ.\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\n0\r2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00060\r2\b\b\u0002\u0010\t\u001a\u00020\bH\u0086@¢\u0006\u0004\b\u000f\u0010\u0010J&\u0010\u0015\u001a\u00020\u00142\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\r2\u0006\u0010\u0013\u001a\u00020\bH\u0082@¢\u0006\u0004\b\u0015\u0010\u0010J\"\u0010\u0015\u001a\u0004\u0018\u00010\u00142\u0006\u0010\u0012\u001a\u00020\u00062\u0006\u0010\u0013\u001a\u00020\bH\u0082@¢\u0006\u0004\b\u0015\u0010\fJ.\u0010\u0018\u001a\u0004\u0018\u00010\u00142\b\u0010\u0012\u001a\u0004\u0018\u00010\u00112\b\u0010\u0013\u001a\u0004\u0018\u00010\u00162\u0006\u0010\u0017\u001a\u00020\bH\u0082@¢\u0006\u0004\b\u0018\u0010\u0019R\u0014\u0010\u0015\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u001a"}, d2 = {"Lcom/paypal/oslo/feature/moneymovement/ui/transfer/component/planaccordion/internal/PlanAccordionMapper;", "", "Lcom/paypal/oslo/feature/moneymovement/domain/util/MoneyAmountFormatter;", "moneyAmountFormatter", "<init>", "(Lcom/paypal/oslo/feature/moneymovement/domain/util/MoneyAmountFormatter;)V", "Lcom/paypal/oslo/feature/moneymovement/api/domain/PaymentPlan;", "plan", "", "isInternationalFormat", "Lcom/paypal/oslo/feature/moneymovement/ui/transfer/component/planaccordion/internal/UIPlanOption;", "mapToOption", "(Lcom/paypal/oslo/feature/moneymovement/api/domain/PaymentPlan;ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "plans", "mapToOptions", "(Ljava/util/List;ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/paypal/oslo/feature/moneymovement/api/domain/FundingSource;", "p0", "p1", "", "getHighSpeedVideoFpsRanges", "Lcom/paypal/oslo/feature/moneymovement/api/domain/FinancialInstrument;", "p2", "getHighSpeedVideoFpsRangesFor", "(Lcom/paypal/oslo/feature/moneymovement/api/domain/FundingSource;Lcom/paypal/oslo/feature/moneymovement/api/domain/FinancialInstrument;ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/paypal/oslo/feature/moneymovement/domain/util/MoneyAmountFormatter;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class PlanAccordionMapper {
    public static final int $stable = 8;
    private final com.paypal.oslo.feature.moneymovement.domain.util.MoneyAmountFormatter getHighSpeedVideoFpsRanges;

    @javax.inject.Inject
    public PlanAccordionMapper(com.paypal.oslo.feature.moneymovement.domain.util.MoneyAmountFormatter moneyAmountFormatter) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(moneyAmountFormatter, "");
        this.getHighSpeedVideoFpsRanges = moneyAmountFormatter;
    }

    public static /* synthetic */ java.lang.Object mapToOption$default(com.paypal.oslo.feature.moneymovement.ui.transfer.component.planaccordion.internal.PlanAccordionMapper planAccordionMapper, com.paypal.oslo.feature.moneymovement.api.domain.PaymentPlan paymentPlan, boolean z, kotlin.coroutines.Continuation continuation, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        return planAccordionMapper.mapToOption(paymentPlan, z, continuation);
    }

    /* JADX WARN: Code restructure failed: missing block: B:102:0x01a9, code lost:
    
        if (r15 == null) goto L54;
     */
    /* JADX WARN: Code restructure failed: missing block: B:111:0x01ce, code lost:
    
        if (r7 == null) goto L65;
     */
    /* JADX WARN: Removed duplicated region for block: B:22:0x02ba  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x032d  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x03a2  */
    /* JADX WARN: Removed duplicated region for block: B:59:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:80:0x012b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object mapToOption(com.paypal.oslo.feature.moneymovement.api.domain.PaymentPlan paymentPlan, boolean z, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.moneymovement.ui.transfer.component.planaccordion.internal.UIPlanOption> continuation) {
        com.paypal.oslo.feature.moneymovement.ui.transfer.component.planaccordion.internal.PlanAccordionMapper$mapToOption$1 planAccordionMapper$mapToOption$1;
        java.lang.Object coroutine_suspended;
        int i;
        com.paypal.oslo.feature.moneymovement.api.domain.FundingSource fundingSource;
        com.paypal.oslo.feature.moneymovement.api.domain.FinancialInstrument instrument;
        java.lang.String id;
        java.lang.String displayName;
        java.lang.String str;
        com.paypal.pds.core.Icon.Card card;
        com.paypal.pds.core.Color.ContentMuted contentMuted;
        java.lang.String str2;
        com.paypal.pds.core.Color color;
        com.paypal.oslo.feature.moneymovement.api.domain.PaymentPlan paymentPlan2;
        int i2;
        com.paypal.pds.core.Icon icon;
        com.paypal.oslo.feature.moneymovement.api.domain.FundingSourceType type;
        com.paypal.oslo.feature.moneymovement.api.domain.FundingSourceType type2;
        java.lang.String str3;
        com.paypal.pds.core.Color color2;
        java.lang.String str4;
        java.lang.String str5;
        com.paypal.oslo.feature.moneymovement.api.domain.PaymentPlan paymentPlan3;
        java.lang.String str6;
        com.paypal.oslo.feature.moneymovement.api.domain.FinancialInstrument financialInstrument;
        java.lang.String str7;
        com.paypal.oslo.feature.moneymovement.api.domain.FundingSource fundingSource2;
        java.lang.String str8;
        com.paypal.oslo.feature.moneymovement.api.domain.AmountsBreakdown amountsBreakdown;
        com.paypal.oslo.feature.moneymovement.api.domain.FinancialInstrument financialInstrument2;
        java.lang.String str9;
        java.lang.String str10;
        com.paypal.oslo.feature.moneymovement.api.domain.FundingSource fundingSource3;
        com.paypal.oslo.feature.moneymovement.api.domain.PaymentPlan paymentPlan4;
        com.paypal.oslo.feature.moneymovement.api.shared.domain.MoneyAmount totalFee;
        java.lang.String str11;
        java.lang.String str12;
        java.lang.String str13;
        com.paypal.oslo.feature.moneymovement.api.domain.FinancialInstrument financialInstrument3;
        java.util.List<com.paypal.oslo.feature.moneymovement.api.domain.PlanDisclosureInfo> disclosures;
        java.lang.Object obj;
        java.util.ArrayList arrayList;
        java.util.List<com.paypal.oslo.feature.moneymovement.api.domain.PlanContingencyInfo> contingencies;
        java.lang.Integer num;
        java.lang.Object highSpeedVideoFpsRanges;
        java.lang.Object obj2;
        java.lang.Integer num2;
        java.lang.String str14;
        java.util.List list;
        java.lang.String str15;
        com.paypal.pds.core.Color color3;
        com.paypal.pds.core.Icon icon2;
        java.lang.String str16;
        java.lang.String str17;
        java.lang.String str18;
        java.lang.String str19;
        java.lang.Object obj3;
        com.paypal.oslo.feature.moneymovement.api.domain.FinancialInstrument instrument2;
        boolean z2 = z;
        if (continuation instanceof com.paypal.oslo.feature.moneymovement.ui.transfer.component.planaccordion.internal.PlanAccordionMapper$mapToOption$1) {
            planAccordionMapper$mapToOption$1 = (com.paypal.oslo.feature.moneymovement.ui.transfer.component.planaccordion.internal.PlanAccordionMapper$mapToOption$1) continuation;
            if ((planAccordionMapper$mapToOption$1.getValidOutputFormatsForInputhNQ4ISI & Integer.MIN_VALUE) != 0) {
                planAccordionMapper$mapToOption$1.getValidOutputFormatsForInputhNQ4ISI -= 2147483648;
                java.lang.Object obj4 = planAccordionMapper$mapToOption$1.isOutputSupportedFor;
                coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = planAccordionMapper$mapToOption$1.getValidOutputFormatsForInputhNQ4ISI;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj4);
                    fundingSource = (com.paypal.oslo.feature.moneymovement.api.domain.FundingSource) kotlin.collections.CollectionsKt.firstOrNull((java.util.List) paymentPlan.getFundingSources());
                    instrument = fundingSource != null ? fundingSource.getInstrument() : null;
                    int i3 = paymentPlan.getFundingSources().size() > 1 ? 1 : 0;
                    id = paymentPlan.getId();
                    java.lang.String logoUrl = instrument != null ? instrument.getLogoUrl() : null;
                    displayName = instrument != null ? instrument.getDisplayName() : null;
                    if (instrument == null || (str = instrument.getDisplayName()) == null) {
                        str = "Payment Method";
                    }
                    if (fundingSource != null && (type2 = fundingSource.getType()) != null) {
                        switch (com.paypal.oslo.feature.moneymovement.ui.transfer.component.planaccordion.internal.PlanAccordionMapper.WhenMappings.$EnumSwitchMapping$0[type2.ordinal()]) {
                            case 1:
                                card = com.paypal.pds.core.Icon.Card.INSTANCE;
                                break;
                            case 2:
                                card = com.paypal.pds.core.Icon.Card.INSTANCE;
                                break;
                            case 3:
                                card = com.paypal.pds.core.Icon.Bank.INSTANCE;
                                break;
                            case 4:
                                card = com.paypal.pds.core.Icon.LogoPaypalMarkColor.INSTANCE;
                                break;
                            case 5:
                                card = com.paypal.pds.core.Icon.MoneyCoins.INSTANCE;
                                break;
                            case 6:
                                card = com.paypal.pds.core.Icon.Card.INSTANCE;
                                break;
                            case 7:
                                card = com.paypal.pds.core.Icon.TrophyFill.INSTANCE;
                                break;
                            default:
                                throw new kotlin.NoWhenBranchMatchedException();
                        }
                    }
                    card = com.paypal.pds.core.Icon.Card.INSTANCE;
                    if (fundingSource != null && (type = fundingSource.getType()) != null) {
                        int i4 = com.paypal.oslo.feature.moneymovement.ui.transfer.component.planaccordion.internal.PlanAccordionMapper.WhenMappings.$EnumSwitchMapping$0[type.ordinal()];
                        if (i4 == 4 || i4 == 7) {
                            contentMuted = com.paypal.pds.core.Color.Unspecified.INSTANCE;
                        } else {
                            contentMuted = com.paypal.pds.core.Color.ContentMuted.INSTANCE;
                        }
                    }
                    contentMuted = com.paypal.pds.core.Color.ContentMuted.INSTANCE;
                    if (i3 != 0) {
                        java.util.List<com.paypal.oslo.feature.moneymovement.api.domain.FundingSource> fundingSources = paymentPlan.getFundingSources();
                        planAccordionMapper$mapToOption$1.getHighSpeedVideoSizes = paymentPlan;
                        planAccordionMapper$mapToOption$1.getHighResolutionOutputSizeshNQ4ISI = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(fundingSource);
                        planAccordionMapper$mapToOption$1.getInputSizeshNQ4ISI = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(instrument);
                        planAccordionMapper$mapToOption$1.getHighSpeedVideoSizesFor = id;
                        planAccordionMapper$mapToOption$1.getOutputMinFrameDuration = logoUrl;
                        planAccordionMapper$mapToOption$1.getOutputSizes = displayName;
                        planAccordionMapper$mapToOption$1.getOutputStallDuration = str;
                        planAccordionMapper$mapToOption$1.getOutputStallDurationlomOqCM = card;
                        planAccordionMapper$mapToOption$1.getOutputSizeshNQ4ISI = contentMuted;
                        planAccordionMapper$mapToOption$1.toString = z2;
                        planAccordionMapper$mapToOption$1.getHighSpeedVideoFpsRangesFor = i3;
                        planAccordionMapper$mapToOption$1.getValidOutputFormatsForInputhNQ4ISI = 1;
                        java.lang.Object highSpeedVideoFpsRanges2 = getHighSpeedVideoFpsRanges(fundingSources, z2, planAccordionMapper$mapToOption$1);
                        if (highSpeedVideoFpsRanges2 != coroutine_suspended) {
                            str2 = logoUrl;
                            color = contentMuted;
                            com.paypal.pds.core.Icon icon3 = card;
                            paymentPlan2 = paymentPlan;
                            i2 = i3;
                            obj4 = highSpeedVideoFpsRanges2;
                            icon = icon3;
                            str3 = (java.lang.String) obj4;
                        }
                    } else {
                        planAccordionMapper$mapToOption$1.getHighSpeedVideoSizes = paymentPlan;
                        planAccordionMapper$mapToOption$1.getHighResolutionOutputSizeshNQ4ISI = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(fundingSource);
                        planAccordionMapper$mapToOption$1.getInputSizeshNQ4ISI = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(instrument);
                        planAccordionMapper$mapToOption$1.getHighSpeedVideoSizesFor = id;
                        planAccordionMapper$mapToOption$1.getOutputMinFrameDuration = logoUrl;
                        planAccordionMapper$mapToOption$1.getOutputSizes = displayName;
                        planAccordionMapper$mapToOption$1.getOutputStallDuration = str;
                        planAccordionMapper$mapToOption$1.getOutputStallDurationlomOqCM = card;
                        planAccordionMapper$mapToOption$1.getOutputSizeshNQ4ISI = contentMuted;
                        planAccordionMapper$mapToOption$1.toString = z2;
                        planAccordionMapper$mapToOption$1.getHighSpeedVideoFpsRangesFor = i3;
                        planAccordionMapper$mapToOption$1.getValidOutputFormatsForInputhNQ4ISI = 2;
                        java.lang.Object highSpeedVideoFpsRangesFor = getHighSpeedVideoFpsRangesFor(fundingSource, instrument, z2, planAccordionMapper$mapToOption$1);
                        if (highSpeedVideoFpsRangesFor != coroutine_suspended) {
                            str2 = logoUrl;
                            color = contentMuted;
                            com.paypal.pds.core.Icon icon4 = card;
                            paymentPlan2 = paymentPlan;
                            i2 = i3;
                            obj4 = highSpeedVideoFpsRangesFor;
                            icon = icon4;
                            str3 = (java.lang.String) obj4;
                        }
                    }
                    return coroutine_suspended;
                }
                if (i == 1) {
                    i2 = planAccordionMapper$mapToOption$1.getHighSpeedVideoFpsRangesFor;
                    z2 = planAccordionMapper$mapToOption$1.toString;
                    color = (com.paypal.pds.core.Color) planAccordionMapper$mapToOption$1.getOutputSizeshNQ4ISI;
                    icon = (com.paypal.pds.core.Icon) planAccordionMapper$mapToOption$1.getOutputStallDurationlomOqCM;
                    str = (java.lang.String) planAccordionMapper$mapToOption$1.getOutputStallDuration;
                    displayName = (java.lang.String) planAccordionMapper$mapToOption$1.getOutputSizes;
                    str2 = (java.lang.String) planAccordionMapper$mapToOption$1.getOutputMinFrameDuration;
                    id = (java.lang.String) planAccordionMapper$mapToOption$1.getHighSpeedVideoSizesFor;
                    instrument = (com.paypal.oslo.feature.moneymovement.api.domain.FinancialInstrument) planAccordionMapper$mapToOption$1.getInputSizeshNQ4ISI;
                    fundingSource = (com.paypal.oslo.feature.moneymovement.api.domain.FundingSource) planAccordionMapper$mapToOption$1.getHighResolutionOutputSizeshNQ4ISI;
                    paymentPlan2 = (com.paypal.oslo.feature.moneymovement.api.domain.PaymentPlan) planAccordionMapper$mapToOption$1.getHighSpeedVideoSizes;
                    kotlin.ResultKt.throwOnFailure(obj4);
                    str3 = (java.lang.String) obj4;
                } else if (i == 2) {
                    i2 = planAccordionMapper$mapToOption$1.getHighSpeedVideoFpsRangesFor;
                    z2 = planAccordionMapper$mapToOption$1.toString;
                    color = (com.paypal.pds.core.Color) planAccordionMapper$mapToOption$1.getOutputSizeshNQ4ISI;
                    icon = (com.paypal.pds.core.Icon) planAccordionMapper$mapToOption$1.getOutputStallDurationlomOqCM;
                    str = (java.lang.String) planAccordionMapper$mapToOption$1.getOutputStallDuration;
                    displayName = (java.lang.String) planAccordionMapper$mapToOption$1.getOutputSizes;
                    str2 = (java.lang.String) planAccordionMapper$mapToOption$1.getOutputMinFrameDuration;
                    id = (java.lang.String) planAccordionMapper$mapToOption$1.getHighSpeedVideoSizesFor;
                    instrument = (com.paypal.oslo.feature.moneymovement.api.domain.FinancialInstrument) planAccordionMapper$mapToOption$1.getInputSizeshNQ4ISI;
                    fundingSource = (com.paypal.oslo.feature.moneymovement.api.domain.FundingSource) planAccordionMapper$mapToOption$1.getHighResolutionOutputSizeshNQ4ISI;
                    paymentPlan2 = (com.paypal.oslo.feature.moneymovement.api.domain.PaymentPlan) planAccordionMapper$mapToOption$1.getHighSpeedVideoSizes;
                    kotlin.ResultKt.throwOnFailure(obj4);
                    str3 = (java.lang.String) obj4;
                } else {
                    if (i != 3) {
                        if (i != 4) {
                            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        int i5 = planAccordionMapper$mapToOption$1.getHighSpeedVideoFpsRangesFor;
                        boolean z3 = planAccordionMapper$mapToOption$1.toString;
                        java.lang.Integer num3 = (java.lang.Integer) planAccordionMapper$mapToOption$1.getOutputFormats;
                        java.util.List list2 = (java.util.List) planAccordionMapper$mapToOption$1.getInputFormats;
                        java.lang.String str20 = (java.lang.String) planAccordionMapper$mapToOption$1.getHighSpeedVideoFpsRanges;
                        java.lang.String str21 = (java.lang.String) planAccordionMapper$mapToOption$1.getOutputMinFrameDurationlomOqCM;
                        com.paypal.pds.core.Color color4 = (com.paypal.pds.core.Color) planAccordionMapper$mapToOption$1.getOutputSizeshNQ4ISI;
                        com.paypal.pds.core.Icon icon5 = (com.paypal.pds.core.Icon) planAccordionMapper$mapToOption$1.getOutputStallDurationlomOqCM;
                        java.lang.String str22 = (java.lang.String) planAccordionMapper$mapToOption$1.getOutputStallDuration;
                        java.lang.String str23 = (java.lang.String) planAccordionMapper$mapToOption$1.getOutputSizes;
                        java.lang.String str24 = (java.lang.String) planAccordionMapper$mapToOption$1.getOutputMinFrameDuration;
                        java.lang.String str25 = (java.lang.String) planAccordionMapper$mapToOption$1.getHighSpeedVideoSizesFor;
                        kotlin.ResultKt.throwOnFailure(obj4);
                        num2 = num3;
                        list = list2;
                        str14 = str20;
                        str15 = str21;
                        color3 = color4;
                        icon2 = icon5;
                        str16 = str22;
                        str17 = str23;
                        str18 = str24;
                        str19 = str25;
                        return new com.paypal.oslo.feature.moneymovement.ui.transfer.component.planaccordion.internal.UIPlanOption(str19, str18, str17, str16, str15, str14, null, list, num2, (java.lang.String) obj4, icon2, color3);
                    }
                    int i6 = planAccordionMapper$mapToOption$1.Camera2StreamConfigurationMap;
                    i2 = planAccordionMapper$mapToOption$1.getHighSpeedVideoFpsRangesFor;
                    z2 = planAccordionMapper$mapToOption$1.toString;
                    str4 = (java.lang.String) planAccordionMapper$mapToOption$1.getOutputMinFrameDurationlomOqCM;
                    color2 = (com.paypal.pds.core.Color) planAccordionMapper$mapToOption$1.getOutputSizeshNQ4ISI;
                    icon = (com.paypal.pds.core.Icon) planAccordionMapper$mapToOption$1.getOutputStallDurationlomOqCM;
                    java.lang.String str26 = (java.lang.String) planAccordionMapper$mapToOption$1.getOutputStallDuration;
                    java.lang.String str27 = (java.lang.String) planAccordionMapper$mapToOption$1.getOutputSizes;
                    java.lang.String str28 = (java.lang.String) planAccordionMapper$mapToOption$1.getOutputMinFrameDuration;
                    java.lang.String str29 = (java.lang.String) planAccordionMapper$mapToOption$1.getHighSpeedVideoSizesFor;
                    com.paypal.oslo.feature.moneymovement.api.domain.FinancialInstrument financialInstrument4 = (com.paypal.oslo.feature.moneymovement.api.domain.FinancialInstrument) planAccordionMapper$mapToOption$1.getInputSizeshNQ4ISI;
                    com.paypal.oslo.feature.moneymovement.api.domain.FundingSource fundingSource4 = (com.paypal.oslo.feature.moneymovement.api.domain.FundingSource) planAccordionMapper$mapToOption$1.getHighResolutionOutputSizeshNQ4ISI;
                    com.paypal.oslo.feature.moneymovement.api.domain.PaymentPlan paymentPlan5 = (com.paypal.oslo.feature.moneymovement.api.domain.PaymentPlan) planAccordionMapper$mapToOption$1.getHighSpeedVideoSizes;
                    kotlin.ResultKt.throwOnFailure(obj4);
                    str11 = str29;
                    str12 = str28;
                    str13 = str27;
                    financialInstrument3 = financialInstrument4;
                    str10 = str26;
                    fundingSource3 = fundingSource4;
                    paymentPlan4 = paymentPlan5;
                    str9 = (java.lang.String) obj4;
                    java.lang.String str30 = str11;
                    financialInstrument2 = financialInstrument3;
                    str7 = str13;
                    str8 = str12;
                    str6 = str30;
                    disclosures = paymentPlan4.getDisclosures();
                    if (disclosures != null) {
                        if (disclosures.isEmpty()) {
                            disclosures = null;
                        }
                        if (disclosures != null) {
                            java.util.List<com.paypal.oslo.feature.moneymovement.api.domain.PlanDisclosureInfo> list3 = disclosures;
                            obj = coroutine_suspended;
                            java.util.ArrayList arrayList2 = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(list3, 10));
                            for (com.paypal.oslo.feature.moneymovement.api.domain.PlanDisclosureInfo planDisclosureInfo : list3) {
                                com.paypal.oslo.feature.moneymovement.api.domain.FundingSource fundingSource5 = (com.paypal.oslo.feature.moneymovement.api.domain.FundingSource) kotlin.collections.CollectionsKt.firstOrNull((java.util.List) paymentPlan4.getFundingSources());
                                arrayList2.add(new com.paypal.oslo.feature.moneymovement.ui.transfer.component.planaccordion.internal.UIContextualAlert(planDisclosureInfo.getAlertType(), planDisclosureInfo.getType(), (fundingSource5 == null || (instrument2 = fundingSource5.getInstrument()) == null) ? null : instrument2.getDisplayName(), planDisclosureInfo.getLinkText(), planDisclosureInfo.getLinkUrl()));
                            }
                            arrayList = arrayList2;
                            contingencies = paymentPlan4.getContingencies();
                            if (contingencies != null) {
                                java.util.Iterator it = contingencies.iterator();
                                while (true) {
                                    if (it.hasNext()) {
                                        java.lang.Object next = it.next();
                                        java.util.Iterator it2 = it;
                                        if (((com.paypal.oslo.feature.moneymovement.api.domain.PlanContingencyInfo) next).getAction() == com.paypal.oslo.feature.moneymovement.api.domain.PlanContingencyAction.CARD_VERIFICATION_DATA_COLLECTION_REQUIRED) {
                                            obj3 = next;
                                        } else {
                                            it = it2;
                                        }
                                    } else {
                                        obj3 = null;
                                    }
                                }
                                com.paypal.oslo.feature.moneymovement.api.domain.PlanContingencyInfo planContingencyInfo = (com.paypal.oslo.feature.moneymovement.api.domain.PlanContingencyInfo) obj3;
                                if (planContingencyInfo != null) {
                                    java.lang.Integer cvvLength = planContingencyInfo.getCvvLength();
                                    num = kotlin.coroutines.jvm.internal.Boxing.boxInt(cvvLength != null ? cvvLength.intValue() : 3);
                                    planAccordionMapper$mapToOption$1.getHighSpeedVideoSizes = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(paymentPlan4);
                                    planAccordionMapper$mapToOption$1.getHighResolutionOutputSizeshNQ4ISI = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(fundingSource3);
                                    planAccordionMapper$mapToOption$1.getInputSizeshNQ4ISI = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(financialInstrument2);
                                    planAccordionMapper$mapToOption$1.getHighSpeedVideoSizesFor = str6;
                                    planAccordionMapper$mapToOption$1.getOutputMinFrameDuration = str8;
                                    planAccordionMapper$mapToOption$1.getOutputSizes = str7;
                                    planAccordionMapper$mapToOption$1.getOutputStallDuration = str10;
                                    planAccordionMapper$mapToOption$1.getOutputStallDurationlomOqCM = icon;
                                    planAccordionMapper$mapToOption$1.getOutputSizeshNQ4ISI = color2;
                                    planAccordionMapper$mapToOption$1.getOutputMinFrameDurationlomOqCM = str4;
                                    planAccordionMapper$mapToOption$1.getHighSpeedVideoFpsRanges = str9;
                                    planAccordionMapper$mapToOption$1.getInputFormats = arrayList;
                                    planAccordionMapper$mapToOption$1.getOutputFormats = num;
                                    planAccordionMapper$mapToOption$1.toString = z2;
                                    planAccordionMapper$mapToOption$1.getHighSpeedVideoFpsRangesFor = i2;
                                    planAccordionMapper$mapToOption$1.getValidOutputFormatsForInputhNQ4ISI = 4;
                                    highSpeedVideoFpsRanges = getHighSpeedVideoFpsRanges(paymentPlan4, z2, planAccordionMapper$mapToOption$1);
                                    obj2 = obj;
                                    if (highSpeedVideoFpsRanges != obj2) {
                                        return obj2;
                                    }
                                    num2 = num;
                                    str14 = str9;
                                    list = arrayList;
                                    str15 = str4;
                                    color3 = color2;
                                    icon2 = icon;
                                    str16 = str10;
                                    str17 = str7;
                                    str18 = str8;
                                    str19 = str6;
                                    obj4 = highSpeedVideoFpsRanges;
                                    return new com.paypal.oslo.feature.moneymovement.ui.transfer.component.planaccordion.internal.UIPlanOption(str19, str18, str17, str16, str15, str14, null, list, num2, (java.lang.String) obj4, icon2, color3);
                                }
                            }
                            num = null;
                            planAccordionMapper$mapToOption$1.getHighSpeedVideoSizes = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(paymentPlan4);
                            planAccordionMapper$mapToOption$1.getHighResolutionOutputSizeshNQ4ISI = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(fundingSource3);
                            planAccordionMapper$mapToOption$1.getInputSizeshNQ4ISI = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(financialInstrument2);
                            planAccordionMapper$mapToOption$1.getHighSpeedVideoSizesFor = str6;
                            planAccordionMapper$mapToOption$1.getOutputMinFrameDuration = str8;
                            planAccordionMapper$mapToOption$1.getOutputSizes = str7;
                            planAccordionMapper$mapToOption$1.getOutputStallDuration = str10;
                            planAccordionMapper$mapToOption$1.getOutputStallDurationlomOqCM = icon;
                            planAccordionMapper$mapToOption$1.getOutputSizeshNQ4ISI = color2;
                            planAccordionMapper$mapToOption$1.getOutputMinFrameDurationlomOqCM = str4;
                            planAccordionMapper$mapToOption$1.getHighSpeedVideoFpsRanges = str9;
                            planAccordionMapper$mapToOption$1.getInputFormats = arrayList;
                            planAccordionMapper$mapToOption$1.getOutputFormats = num;
                            planAccordionMapper$mapToOption$1.toString = z2;
                            planAccordionMapper$mapToOption$1.getHighSpeedVideoFpsRangesFor = i2;
                            planAccordionMapper$mapToOption$1.getValidOutputFormatsForInputhNQ4ISI = 4;
                            highSpeedVideoFpsRanges = getHighSpeedVideoFpsRanges(paymentPlan4, z2, planAccordionMapper$mapToOption$1);
                            obj2 = obj;
                            if (highSpeedVideoFpsRanges != obj2) {
                            }
                        }
                    }
                    obj = coroutine_suspended;
                    arrayList = null;
                    contingencies = paymentPlan4.getContingencies();
                    if (contingencies != null) {
                    }
                    num = null;
                    planAccordionMapper$mapToOption$1.getHighSpeedVideoSizes = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(paymentPlan4);
                    planAccordionMapper$mapToOption$1.getHighResolutionOutputSizeshNQ4ISI = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(fundingSource3);
                    planAccordionMapper$mapToOption$1.getInputSizeshNQ4ISI = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(financialInstrument2);
                    planAccordionMapper$mapToOption$1.getHighSpeedVideoSizesFor = str6;
                    planAccordionMapper$mapToOption$1.getOutputMinFrameDuration = str8;
                    planAccordionMapper$mapToOption$1.getOutputSizes = str7;
                    planAccordionMapper$mapToOption$1.getOutputStallDuration = str10;
                    planAccordionMapper$mapToOption$1.getOutputStallDurationlomOqCM = icon;
                    planAccordionMapper$mapToOption$1.getOutputSizeshNQ4ISI = color2;
                    planAccordionMapper$mapToOption$1.getOutputMinFrameDurationlomOqCM = str4;
                    planAccordionMapper$mapToOption$1.getHighSpeedVideoFpsRanges = str9;
                    planAccordionMapper$mapToOption$1.getInputFormats = arrayList;
                    planAccordionMapper$mapToOption$1.getOutputFormats = num;
                    planAccordionMapper$mapToOption$1.toString = z2;
                    planAccordionMapper$mapToOption$1.getHighSpeedVideoFpsRangesFor = i2;
                    planAccordionMapper$mapToOption$1.getValidOutputFormatsForInputhNQ4ISI = 4;
                    highSpeedVideoFpsRanges = getHighSpeedVideoFpsRanges(paymentPlan4, z2, planAccordionMapper$mapToOption$1);
                    obj2 = obj;
                    if (highSpeedVideoFpsRanges != obj2) {
                    }
                }
                color2 = color;
                str4 = str3;
                java.lang.String str31 = str2;
                str5 = str;
                paymentPlan3 = paymentPlan2;
                str6 = id;
                financialInstrument = instrument;
                str7 = displayName;
                fundingSource2 = fundingSource;
                str8 = str31;
                amountsBreakdown = paymentPlan3.getAmountsBreakdown();
                if (amountsBreakdown == null && (totalFee = amountsBreakdown.getTotalFee()) != null) {
                    com.paypal.oslo.feature.moneymovement.domain.util.MoneyAmountFormatter moneyAmountFormatter = this.getHighSpeedVideoFpsRanges;
                    planAccordionMapper$mapToOption$1.getHighSpeedVideoSizes = paymentPlan3;
                    planAccordionMapper$mapToOption$1.getHighResolutionOutputSizeshNQ4ISI = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(fundingSource2);
                    planAccordionMapper$mapToOption$1.getInputSizeshNQ4ISI = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(financialInstrument);
                    planAccordionMapper$mapToOption$1.getHighSpeedVideoSizesFor = str6;
                    planAccordionMapper$mapToOption$1.getOutputMinFrameDuration = str8;
                    planAccordionMapper$mapToOption$1.getOutputSizes = str7;
                    planAccordionMapper$mapToOption$1.getOutputStallDuration = str5;
                    planAccordionMapper$mapToOption$1.getOutputStallDurationlomOqCM = icon;
                    planAccordionMapper$mapToOption$1.getOutputSizeshNQ4ISI = color2;
                    planAccordionMapper$mapToOption$1.getOutputMinFrameDurationlomOqCM = str4;
                    planAccordionMapper$mapToOption$1.getHighSpeedVideoFpsRanges = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(totalFee);
                    planAccordionMapper$mapToOption$1.toString = z2;
                    planAccordionMapper$mapToOption$1.getHighSpeedVideoFpsRangesFor = i2;
                    planAccordionMapper$mapToOption$1.Camera2StreamConfigurationMap = 0;
                    planAccordionMapper$mapToOption$1.getValidOutputFormatsForInputhNQ4ISI = 3;
                    obj4 = moneyAmountFormatter.formatFee(totalFee, z2, planAccordionMapper$mapToOption$1);
                    coroutine_suspended = coroutine_suspended;
                    if (obj4 != coroutine_suspended) {
                        str11 = str6;
                        str12 = str8;
                        str13 = str7;
                        financialInstrument3 = financialInstrument;
                        str10 = str5;
                        fundingSource3 = fundingSource2;
                        paymentPlan4 = paymentPlan3;
                        str9 = (java.lang.String) obj4;
                        java.lang.String str302 = str11;
                        financialInstrument2 = financialInstrument3;
                        str7 = str13;
                        str8 = str12;
                        str6 = str302;
                        disclosures = paymentPlan4.getDisclosures();
                        if (disclosures != null) {
                        }
                        obj = coroutine_suspended;
                        arrayList = null;
                        contingencies = paymentPlan4.getContingencies();
                        if (contingencies != null) {
                        }
                        num = null;
                        planAccordionMapper$mapToOption$1.getHighSpeedVideoSizes = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(paymentPlan4);
                        planAccordionMapper$mapToOption$1.getHighResolutionOutputSizeshNQ4ISI = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(fundingSource3);
                        planAccordionMapper$mapToOption$1.getInputSizeshNQ4ISI = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(financialInstrument2);
                        planAccordionMapper$mapToOption$1.getHighSpeedVideoSizesFor = str6;
                        planAccordionMapper$mapToOption$1.getOutputMinFrameDuration = str8;
                        planAccordionMapper$mapToOption$1.getOutputSizes = str7;
                        planAccordionMapper$mapToOption$1.getOutputStallDuration = str10;
                        planAccordionMapper$mapToOption$1.getOutputStallDurationlomOqCM = icon;
                        planAccordionMapper$mapToOption$1.getOutputSizeshNQ4ISI = color2;
                        planAccordionMapper$mapToOption$1.getOutputMinFrameDurationlomOqCM = str4;
                        planAccordionMapper$mapToOption$1.getHighSpeedVideoFpsRanges = str9;
                        planAccordionMapper$mapToOption$1.getInputFormats = arrayList;
                        planAccordionMapper$mapToOption$1.getOutputFormats = num;
                        planAccordionMapper$mapToOption$1.toString = z2;
                        planAccordionMapper$mapToOption$1.getHighSpeedVideoFpsRangesFor = i2;
                        planAccordionMapper$mapToOption$1.getValidOutputFormatsForInputhNQ4ISI = 4;
                        highSpeedVideoFpsRanges = getHighSpeedVideoFpsRanges(paymentPlan4, z2, planAccordionMapper$mapToOption$1);
                        obj2 = obj;
                        if (highSpeedVideoFpsRanges != obj2) {
                        }
                    }
                    return coroutine_suspended;
                }
                financialInstrument2 = financialInstrument;
                str9 = null;
                str10 = str5;
                fundingSource3 = fundingSource2;
                paymentPlan4 = paymentPlan3;
                disclosures = paymentPlan4.getDisclosures();
                if (disclosures != null) {
                }
                obj = coroutine_suspended;
                arrayList = null;
                contingencies = paymentPlan4.getContingencies();
                if (contingencies != null) {
                }
                num = null;
                planAccordionMapper$mapToOption$1.getHighSpeedVideoSizes = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(paymentPlan4);
                planAccordionMapper$mapToOption$1.getHighResolutionOutputSizeshNQ4ISI = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(fundingSource3);
                planAccordionMapper$mapToOption$1.getInputSizeshNQ4ISI = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(financialInstrument2);
                planAccordionMapper$mapToOption$1.getHighSpeedVideoSizesFor = str6;
                planAccordionMapper$mapToOption$1.getOutputMinFrameDuration = str8;
                planAccordionMapper$mapToOption$1.getOutputSizes = str7;
                planAccordionMapper$mapToOption$1.getOutputStallDuration = str10;
                planAccordionMapper$mapToOption$1.getOutputStallDurationlomOqCM = icon;
                planAccordionMapper$mapToOption$1.getOutputSizeshNQ4ISI = color2;
                planAccordionMapper$mapToOption$1.getOutputMinFrameDurationlomOqCM = str4;
                planAccordionMapper$mapToOption$1.getHighSpeedVideoFpsRanges = str9;
                planAccordionMapper$mapToOption$1.getInputFormats = arrayList;
                planAccordionMapper$mapToOption$1.getOutputFormats = num;
                planAccordionMapper$mapToOption$1.toString = z2;
                planAccordionMapper$mapToOption$1.getHighSpeedVideoFpsRangesFor = i2;
                planAccordionMapper$mapToOption$1.getValidOutputFormatsForInputhNQ4ISI = 4;
                highSpeedVideoFpsRanges = getHighSpeedVideoFpsRanges(paymentPlan4, z2, planAccordionMapper$mapToOption$1);
                obj2 = obj;
                if (highSpeedVideoFpsRanges != obj2) {
                }
            }
        }
        planAccordionMapper$mapToOption$1 = new com.paypal.oslo.feature.moneymovement.ui.transfer.component.planaccordion.internal.PlanAccordionMapper$mapToOption$1(this, continuation);
        java.lang.Object obj42 = planAccordionMapper$mapToOption$1.isOutputSupportedFor;
        coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = planAccordionMapper$mapToOption$1.getValidOutputFormatsForInputhNQ4ISI;
        if (i != 0) {
        }
        color2 = color;
        str4 = str3;
        java.lang.String str312 = str2;
        str5 = str;
        paymentPlan3 = paymentPlan2;
        str6 = id;
        financialInstrument = instrument;
        str7 = displayName;
        fundingSource2 = fundingSource;
        str8 = str312;
        amountsBreakdown = paymentPlan3.getAmountsBreakdown();
        if (amountsBreakdown == null) {
        }
        financialInstrument2 = financialInstrument;
        str9 = null;
        str10 = str5;
        fundingSource3 = fundingSource2;
        paymentPlan4 = paymentPlan3;
        disclosures = paymentPlan4.getDisclosures();
        if (disclosures != null) {
        }
        obj = coroutine_suspended;
        arrayList = null;
        contingencies = paymentPlan4.getContingencies();
        if (contingencies != null) {
        }
        num = null;
        planAccordionMapper$mapToOption$1.getHighSpeedVideoSizes = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(paymentPlan4);
        planAccordionMapper$mapToOption$1.getHighResolutionOutputSizeshNQ4ISI = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(fundingSource3);
        planAccordionMapper$mapToOption$1.getInputSizeshNQ4ISI = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(financialInstrument2);
        planAccordionMapper$mapToOption$1.getHighSpeedVideoSizesFor = str6;
        planAccordionMapper$mapToOption$1.getOutputMinFrameDuration = str8;
        planAccordionMapper$mapToOption$1.getOutputSizes = str7;
        planAccordionMapper$mapToOption$1.getOutputStallDuration = str10;
        planAccordionMapper$mapToOption$1.getOutputStallDurationlomOqCM = icon;
        planAccordionMapper$mapToOption$1.getOutputSizeshNQ4ISI = color2;
        planAccordionMapper$mapToOption$1.getOutputMinFrameDurationlomOqCM = str4;
        planAccordionMapper$mapToOption$1.getHighSpeedVideoFpsRanges = str9;
        planAccordionMapper$mapToOption$1.getInputFormats = arrayList;
        planAccordionMapper$mapToOption$1.getOutputFormats = num;
        planAccordionMapper$mapToOption$1.toString = z2;
        planAccordionMapper$mapToOption$1.getHighSpeedVideoFpsRangesFor = i2;
        planAccordionMapper$mapToOption$1.getValidOutputFormatsForInputhNQ4ISI = 4;
        highSpeedVideoFpsRanges = getHighSpeedVideoFpsRanges(paymentPlan4, z2, planAccordionMapper$mapToOption$1);
        obj2 = obj;
        if (highSpeedVideoFpsRanges != obj2) {
        }
    }

    public static /* synthetic */ java.lang.Object mapToOptions$default(com.paypal.oslo.feature.moneymovement.ui.transfer.component.planaccordion.internal.PlanAccordionMapper planAccordionMapper, java.util.List list, boolean z, kotlin.coroutines.Continuation continuation, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        return planAccordionMapper.mapToOptions(list, z, continuation);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0029  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:17:0x00ca -> B:10:0x00cd). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object mapToOptions(java.util.List<com.paypal.oslo.feature.moneymovement.api.domain.PaymentPlan> list, boolean z, kotlin.coroutines.Continuation<? super java.util.List<com.paypal.oslo.feature.moneymovement.ui.transfer.component.planaccordion.internal.UIPlanOption>> continuation) {
        com.paypal.oslo.feature.moneymovement.ui.transfer.component.planaccordion.internal.PlanAccordionMapper$mapToOptions$1 planAccordionMapper$mapToOptions$1;
        int i;
        java.lang.Iterable iterable;
        java.lang.Iterable iterable2;
        java.util.Collection arrayList;
        int i2;
        java.util.Iterator it;
        java.util.List<com.paypal.oslo.feature.moneymovement.api.domain.PaymentPlan> list2;
        com.paypal.oslo.feature.moneymovement.ui.transfer.component.planaccordion.internal.PlanAccordionMapper$mapToOptions$1 planAccordionMapper$mapToOptions$12;
        int i3;
        boolean z2;
        if (continuation instanceof com.paypal.oslo.feature.moneymovement.ui.transfer.component.planaccordion.internal.PlanAccordionMapper$mapToOptions$1) {
            planAccordionMapper$mapToOptions$1 = (com.paypal.oslo.feature.moneymovement.ui.transfer.component.planaccordion.internal.PlanAccordionMapper$mapToOptions$1) continuation;
            if ((planAccordionMapper$mapToOptions$1.getOutputSizes & Integer.MIN_VALUE) != 0) {
                planAccordionMapper$mapToOptions$1.getOutputSizes -= 2147483648;
                java.lang.Object obj = planAccordionMapper$mapToOptions$1.getOutputSizeshNQ4ISI;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = planAccordionMapper$mapToOptions$1.getOutputSizes;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    java.util.List<com.paypal.oslo.feature.moneymovement.api.domain.PaymentPlan> list3 = list;
                    iterable = list3;
                    iterable2 = iterable;
                    arrayList = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(list3, 10));
                    i2 = 0;
                    it = list3.iterator();
                    list2 = list;
                    planAccordionMapper$mapToOptions$12 = planAccordionMapper$mapToOptions$1;
                    i3 = 0;
                    z2 = z;
                    if (it.hasNext()) {
                    }
                } else {
                    if (i != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    int i4 = planAccordionMapper$mapToOptions$1.Camera2StreamConfigurationMap;
                    int i5 = planAccordionMapper$mapToOptions$1.getHighResolutionOutputSizeshNQ4ISI;
                    int i6 = planAccordionMapper$mapToOptions$1.getHighSpeedVideoFpsRangesFor;
                    boolean z3 = planAccordionMapper$mapToOptions$1.getOutputMinFrameDurationlomOqCM;
                    arrayList = (java.util.Collection) planAccordionMapper$mapToOptions$1.getOutputStallDurationlomOqCM;
                    java.lang.Object obj2 = planAccordionMapper$mapToOptions$1.getOutputMinFrameDuration;
                    it = (java.util.Iterator) planAccordionMapper$mapToOptions$1.getHighSpeedVideoSizesFor;
                    java.util.Collection collection = (java.util.Collection) planAccordionMapper$mapToOptions$1.getInputSizeshNQ4ISI;
                    iterable = (java.lang.Iterable) planAccordionMapper$mapToOptions$1.getInputFormats;
                    iterable2 = (java.lang.Iterable) planAccordionMapper$mapToOptions$1.getHighSpeedVideoSizes;
                    java.util.List<com.paypal.oslo.feature.moneymovement.api.domain.PaymentPlan> list4 = (java.util.List) planAccordionMapper$mapToOptions$1.getHighSpeedVideoFpsRanges;
                    kotlin.ResultKt.throwOnFailure(obj);
                    planAccordionMapper$mapToOptions$12 = planAccordionMapper$mapToOptions$1;
                    z2 = z3;
                    i2 = i6;
                    i3 = i5;
                    arrayList.add((com.paypal.oslo.feature.moneymovement.ui.transfer.component.planaccordion.internal.UIPlanOption) obj);
                    arrayList = collection;
                    list2 = list4;
                    if (it.hasNext()) {
                        java.lang.Object next = it.next();
                        com.paypal.oslo.feature.moneymovement.api.domain.PaymentPlan paymentPlan = (com.paypal.oslo.feature.moneymovement.api.domain.PaymentPlan) next;
                        planAccordionMapper$mapToOptions$12.getHighSpeedVideoFpsRanges = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(list2);
                        planAccordionMapper$mapToOptions$12.getHighSpeedVideoSizes = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(iterable2);
                        planAccordionMapper$mapToOptions$12.getInputFormats = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(iterable);
                        planAccordionMapper$mapToOptions$12.getInputSizeshNQ4ISI = arrayList;
                        planAccordionMapper$mapToOptions$12.getHighSpeedVideoSizesFor = it;
                        planAccordionMapper$mapToOptions$12.getOutputMinFrameDuration = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(next);
                        planAccordionMapper$mapToOptions$12.getOutputFormats = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(paymentPlan);
                        planAccordionMapper$mapToOptions$12.getOutputStallDurationlomOqCM = arrayList;
                        planAccordionMapper$mapToOptions$12.getOutputMinFrameDurationlomOqCM = z2;
                        planAccordionMapper$mapToOptions$12.getHighSpeedVideoFpsRangesFor = i2;
                        planAccordionMapper$mapToOptions$12.getHighResolutionOutputSizeshNQ4ISI = i3;
                        planAccordionMapper$mapToOptions$12.Camera2StreamConfigurationMap = 0;
                        planAccordionMapper$mapToOptions$12.getOutputSizes = 1;
                        java.lang.Object mapToOption = mapToOption(paymentPlan, z2, planAccordionMapper$mapToOptions$12);
                        if (mapToOption == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        list4 = list2;
                        obj = mapToOption;
                        collection = arrayList;
                        arrayList.add((com.paypal.oslo.feature.moneymovement.ui.transfer.component.planaccordion.internal.UIPlanOption) obj);
                        arrayList = collection;
                        list2 = list4;
                        if (it.hasNext()) {
                            return (java.util.List) arrayList;
                        }
                    }
                }
            }
        }
        planAccordionMapper$mapToOptions$1 = new com.paypal.oslo.feature.moneymovement.ui.transfer.component.planaccordion.internal.PlanAccordionMapper$mapToOptions$1(this, continuation);
        java.lang.Object obj3 = planAccordionMapper$mapToOptions$1.getOutputSizeshNQ4ISI;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = planAccordionMapper$mapToOptions$1.getOutputSizes;
        if (i != 0) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:12:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0028  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:22:0x00aa -> B:10:0x00b5). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:23:0x00ce -> B:11:0x00d5). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object getHighSpeedVideoFpsRanges(java.util.List<com.paypal.oslo.feature.moneymovement.api.domain.FundingSource> list, boolean z, kotlin.coroutines.Continuation<? super java.lang.String> continuation) {
        com.paypal.oslo.feature.moneymovement.ui.transfer.component.planaccordion.internal.PlanAccordionMapper$buildSplitSubtitle$1 planAccordionMapper$buildSplitSubtitle$1;
        int i;
        java.util.List arrayList;
        java.util.Iterator<com.paypal.oslo.feature.moneymovement.api.domain.FundingSource> it;
        java.util.List<com.paypal.oslo.feature.moneymovement.api.domain.FundingSource> list2;
        com.paypal.oslo.feature.moneymovement.ui.transfer.component.planaccordion.internal.PlanAccordionMapper$buildSplitSubtitle$1 planAccordionMapper$buildSplitSubtitle$12;
        boolean z2;
        if (continuation instanceof com.paypal.oslo.feature.moneymovement.ui.transfer.component.planaccordion.internal.PlanAccordionMapper$buildSplitSubtitle$1) {
            planAccordionMapper$buildSplitSubtitle$1 = (com.paypal.oslo.feature.moneymovement.ui.transfer.component.planaccordion.internal.PlanAccordionMapper$buildSplitSubtitle$1) continuation;
            if ((planAccordionMapper$buildSplitSubtitle$1.getInputFormats & Integer.MIN_VALUE) != 0) {
                planAccordionMapper$buildSplitSubtitle$1.getInputFormats -= 2147483648;
                java.lang.Object obj = planAccordionMapper$buildSplitSubtitle$1.getOutputMinFrameDuration;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = planAccordionMapper$buildSplitSubtitle$1.getInputFormats;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    arrayList = new java.util.ArrayList();
                    it = list.iterator();
                    list2 = list;
                    planAccordionMapper$buildSplitSubtitle$12 = planAccordionMapper$buildSplitSubtitle$1;
                    z2 = z;
                    if (!it.hasNext()) {
                    }
                } else {
                    if (i != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    int i2 = planAccordionMapper$buildSplitSubtitle$1.getHighSpeedVideoFpsRangesFor;
                    boolean z3 = planAccordionMapper$buildSplitSubtitle$1.getOutputFormats;
                    java.lang.String str = (java.lang.String) planAccordionMapper$buildSplitSubtitle$1.getInputSizeshNQ4ISI;
                    it = (java.util.Iterator) planAccordionMapper$buildSplitSubtitle$1.getHighSpeedVideoSizes;
                    arrayList = (java.util.List) planAccordionMapper$buildSplitSubtitle$1.getHighSpeedVideoFpsRanges;
                    java.util.List<com.paypal.oslo.feature.moneymovement.api.domain.FundingSource> list3 = (java.util.List) planAccordionMapper$buildSplitSubtitle$1.Camera2StreamConfigurationMap;
                    kotlin.ResultKt.throwOnFailure(obj);
                    java.lang.StringBuilder sb = new java.lang.StringBuilder(" (");
                    sb.append(obj);
                    sb.append(")");
                    java.lang.String str2 = sb.toString();
                    boolean z4 = z3;
                    planAccordionMapper$buildSplitSubtitle$12 = planAccordionMapper$buildSplitSubtitle$1;
                    z2 = z4;
                    if (str2 == null) {
                        str2 = "";
                    }
                    java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
                    sb2.append(str);
                    sb2.append(str2);
                    arrayList.add(sb2.toString());
                    list2 = list3;
                    if (!it.hasNext()) {
                        com.paypal.oslo.feature.moneymovement.api.domain.FundingSource next = it.next();
                        java.lang.String displayName = next.getInstrument().getDisplayName();
                        com.paypal.oslo.feature.moneymovement.api.shared.domain.MoneyAmount amount = next.getAmount();
                        if (amount != null) {
                            com.paypal.oslo.feature.moneymovement.domain.util.MoneyAmountFormatter moneyAmountFormatter = this.getHighSpeedVideoFpsRanges;
                            planAccordionMapper$buildSplitSubtitle$12.Camera2StreamConfigurationMap = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(list2);
                            planAccordionMapper$buildSplitSubtitle$12.getHighSpeedVideoFpsRanges = arrayList;
                            planAccordionMapper$buildSplitSubtitle$12.getHighSpeedVideoSizes = it;
                            planAccordionMapper$buildSplitSubtitle$12.getHighResolutionOutputSizeshNQ4ISI = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(next);
                            planAccordionMapper$buildSplitSubtitle$12.getInputSizeshNQ4ISI = displayName;
                            planAccordionMapper$buildSplitSubtitle$12.getHighSpeedVideoSizesFor = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(amount);
                            planAccordionMapper$buildSplitSubtitle$12.getOutputFormats = z2;
                            planAccordionMapper$buildSplitSubtitle$12.getHighSpeedVideoFpsRangesFor = 0;
                            planAccordionMapper$buildSplitSubtitle$12.getInputFormats = 1;
                            java.lang.Object format = moneyAmountFormatter.format(amount, z2, planAccordionMapper$buildSplitSubtitle$12);
                            if (format == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                            list3 = list2;
                            obj = format;
                            str = displayName;
                            com.paypal.oslo.feature.moneymovement.ui.transfer.component.planaccordion.internal.PlanAccordionMapper$buildSplitSubtitle$1 planAccordionMapper$buildSplitSubtitle$13 = planAccordionMapper$buildSplitSubtitle$12;
                            z3 = z2;
                            planAccordionMapper$buildSplitSubtitle$1 = planAccordionMapper$buildSplitSubtitle$13;
                            java.lang.StringBuilder sb3 = new java.lang.StringBuilder(" (");
                            sb3.append(obj);
                            sb3.append(")");
                            java.lang.String str22 = sb3.toString();
                            boolean z42 = z3;
                            planAccordionMapper$buildSplitSubtitle$12 = planAccordionMapper$buildSplitSubtitle$1;
                            z2 = z42;
                            if (str22 == null) {
                            }
                            java.lang.StringBuilder sb22 = new java.lang.StringBuilder();
                            sb22.append(str);
                            sb22.append(str22);
                            arrayList.add(sb22.toString());
                            list2 = list3;
                            if (!it.hasNext()) {
                                return kotlin.collections.CollectionsKt.joinToString$default(arrayList, " + ", null, null, 0, null, null, 62, null);
                            }
                        } else {
                            list3 = list2;
                            str22 = null;
                            str = displayName;
                            if (str22 == null) {
                            }
                            java.lang.StringBuilder sb222 = new java.lang.StringBuilder();
                            sb222.append(str);
                            sb222.append(str22);
                            arrayList.add(sb222.toString());
                            list2 = list3;
                            if (!it.hasNext()) {
                            }
                        }
                    }
                }
            }
        }
        planAccordionMapper$buildSplitSubtitle$1 = new com.paypal.oslo.feature.moneymovement.ui.transfer.component.planaccordion.internal.PlanAccordionMapper$buildSplitSubtitle$1(this, continuation);
        java.lang.Object obj2 = planAccordionMapper$buildSplitSubtitle$1.getOutputMinFrameDuration;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = planAccordionMapper$buildSplitSubtitle$1.getInputFormats;
        if (i != 0) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:15:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object getHighSpeedVideoFpsRanges(com.paypal.oslo.feature.moneymovement.api.domain.PaymentPlan paymentPlan, boolean z, kotlin.coroutines.Continuation<? super java.lang.String> continuation) {
        com.paypal.oslo.feature.moneymovement.ui.transfer.component.planaccordion.internal.PlanAccordionMapper$buildBackupSubtitle$1 planAccordionMapper$buildBackupSubtitle$1;
        int i;
        com.paypal.oslo.feature.moneymovement.api.domain.FundingSource fundingSource;
        java.lang.String str;
        com.paypal.oslo.feature.moneymovement.api.shared.domain.MoneyAmount fiat;
        java.lang.String str2;
        java.lang.String str3;
        if (continuation instanceof com.paypal.oslo.feature.moneymovement.ui.transfer.component.planaccordion.internal.PlanAccordionMapper$buildBackupSubtitle$1) {
            planAccordionMapper$buildBackupSubtitle$1 = (com.paypal.oslo.feature.moneymovement.ui.transfer.component.planaccordion.internal.PlanAccordionMapper$buildBackupSubtitle$1) continuation;
            if ((planAccordionMapper$buildBackupSubtitle$1.getInputFormats & Integer.MIN_VALUE) != 0) {
                planAccordionMapper$buildBackupSubtitle$1.getInputFormats -= 2147483648;
                java.lang.Object obj = planAccordionMapper$buildBackupSubtitle$1.getOutputFormats;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = planAccordionMapper$buildBackupSubtitle$1.getInputFormats;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    java.util.List<com.paypal.oslo.feature.moneymovement.api.domain.FundingSource> backupFundingSources = paymentPlan.getBackupFundingSources();
                    if (backupFundingSources == null || (fundingSource = (com.paypal.oslo.feature.moneymovement.api.domain.FundingSource) kotlin.collections.CollectionsKt.firstOrNull((java.util.List) backupFundingSources)) == null) {
                        return null;
                    }
                    com.paypal.oslo.feature.moneymovement.api.domain.FinancialInstrument instrument = fundingSource.getInstrument();
                    int i2 = com.paypal.oslo.feature.moneymovement.ui.transfer.component.planaccordion.internal.PlanAccordionMapper.WhenMappings.$EnumSwitchMapping$0[fundingSource.getType().ordinal()];
                    if (i2 == 1) {
                        str = com.paypal.oslo.feature.bnplacquisition.ui.common.components.PlanCardTestTag.CARD;
                    } else if (i2 == 2) {
                        str = "Credit";
                    } else if (i2 == 3) {
                        str = "Bank";
                    } else {
                        str = instrument.getDisplayName();
                    }
                    java.lang.String maskedAccountNumber = instrument.getMaskedAccountNumber();
                    java.lang.String concat = maskedAccountNumber != null ? " ".concat(java.lang.String.valueOf(maskedAccountNumber)) : null;
                    if (concat == null) {
                        concat = "";
                    }
                    com.paypal.oslo.feature.moneymovement.api.domain.AmountsBreakdown amountsBreakdown = paymentPlan.getAmountsBreakdown();
                    if (amountsBreakdown == null || (fiat = amountsBreakdown.getTotalFee()) == null) {
                        fiat = com.paypal.oslo.feature.moneymovement.api.shared.domain.MoneyAmount.INSTANCE.fiat("USD", "0");
                    }
                    com.paypal.oslo.feature.moneymovement.domain.util.MoneyAmountFormatter moneyAmountFormatter = this.getHighSpeedVideoFpsRanges;
                    planAccordionMapper$buildBackupSubtitle$1.getHighSpeedVideoSizes = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(paymentPlan);
                    planAccordionMapper$buildBackupSubtitle$1.getHighSpeedVideoFpsRanges = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(fundingSource);
                    planAccordionMapper$buildBackupSubtitle$1.Camera2StreamConfigurationMap = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(instrument);
                    planAccordionMapper$buildBackupSubtitle$1.getHighResolutionOutputSizeshNQ4ISI = str;
                    planAccordionMapper$buildBackupSubtitle$1.getHighSpeedVideoFpsRangesFor = concat;
                    planAccordionMapper$buildBackupSubtitle$1.getOutputMinFrameDuration = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(fiat);
                    planAccordionMapper$buildBackupSubtitle$1.getHighSpeedVideoSizesFor = z;
                    planAccordionMapper$buildBackupSubtitle$1.getInputFormats = 1;
                    obj = moneyAmountFormatter.formatFee(fiat, z, planAccordionMapper$buildBackupSubtitle$1);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    str2 = concat;
                    str3 = str;
                } else {
                    if (i != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    boolean z2 = planAccordionMapper$buildBackupSubtitle$1.getHighSpeedVideoSizesFor;
                    str2 = (java.lang.String) planAccordionMapper$buildBackupSubtitle$1.getHighSpeedVideoFpsRangesFor;
                    str3 = (java.lang.String) planAccordionMapper$buildBackupSubtitle$1.getHighResolutionOutputSizeshNQ4ISI;
                    kotlin.ResultKt.throwOnFailure(obj);
                }
                java.lang.String concat2 = " - ".concat(java.lang.String.valueOf(obj));
                java.lang.StringBuilder sb = new java.lang.StringBuilder("Backup: ");
                sb.append(str3);
                sb.append(str2);
                sb.append(concat2);
                return sb.toString();
            }
        }
        planAccordionMapper$buildBackupSubtitle$1 = new com.paypal.oslo.feature.moneymovement.ui.transfer.component.planaccordion.internal.PlanAccordionMapper$buildBackupSubtitle$1(this, continuation);
        java.lang.Object obj2 = planAccordionMapper$buildBackupSubtitle$1.getOutputFormats;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = planAccordionMapper$buildBackupSubtitle$1.getInputFormats;
        if (i != 0) {
        }
        java.lang.String concat22 = " - ".concat(java.lang.String.valueOf(obj2));
        java.lang.StringBuilder sb2 = new java.lang.StringBuilder("Backup: ");
        sb2.append(str3);
        sb2.append(str2);
        sb2.append(concat22);
        return sb2.toString();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object getHighSpeedVideoFpsRangesFor(com.paypal.oslo.feature.moneymovement.api.domain.FundingSource fundingSource, com.paypal.oslo.feature.moneymovement.api.domain.FinancialInstrument financialInstrument, boolean z, kotlin.coroutines.Continuation<? super java.lang.String> continuation) {
        com.paypal.oslo.feature.moneymovement.ui.transfer.component.planaccordion.internal.PlanAccordionMapper$buildSubtitle$1 planAccordionMapper$buildSubtitle$1;
        int i;
        if (continuation instanceof com.paypal.oslo.feature.moneymovement.ui.transfer.component.planaccordion.internal.PlanAccordionMapper$buildSubtitle$1) {
            planAccordionMapper$buildSubtitle$1 = (com.paypal.oslo.feature.moneymovement.ui.transfer.component.planaccordion.internal.PlanAccordionMapper$buildSubtitle$1) continuation;
            if ((planAccordionMapper$buildSubtitle$1.getOutputMinFrameDuration & Integer.MIN_VALUE) != 0) {
                planAccordionMapper$buildSubtitle$1.getOutputMinFrameDuration -= 2147483648;
                java.lang.Object obj = planAccordionMapper$buildSubtitle$1.getOutputFormats;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = planAccordionMapper$buildSubtitle$1.getOutputMinFrameDuration;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    if (fundingSource != null && financialInstrument != null) {
                        switch (com.paypal.oslo.feature.moneymovement.ui.transfer.component.planaccordion.internal.PlanAccordionMapper.WhenMappings.$EnumSwitchMapping$0[fundingSource.getType().ordinal()]) {
                            case 1:
                                java.lang.String maskedAccountNumber = financialInstrument.getMaskedAccountNumber();
                                if (maskedAccountNumber != null) {
                                    return "Card ".concat(java.lang.String.valueOf(maskedAccountNumber));
                                }
                                break;
                            case 2:
                                java.lang.String maskedAccountNumber2 = financialInstrument.getMaskedAccountNumber();
                                if (maskedAccountNumber2 != null) {
                                    return "Credit ".concat(java.lang.String.valueOf(maskedAccountNumber2));
                                }
                                return null;
                            case 3:
                                java.lang.String maskedAccountNumber3 = financialInstrument.getMaskedAccountNumber();
                                if (maskedAccountNumber3 != null) {
                                    return "Bank ".concat(java.lang.String.valueOf(maskedAccountNumber3));
                                }
                                return null;
                            case 4:
                            case 5:
                                com.paypal.oslo.feature.moneymovement.api.shared.domain.MoneyAmount availableBalance = financialInstrument.getAvailableBalance();
                                if (availableBalance == null) {
                                    return null;
                                }
                                com.paypal.oslo.feature.moneymovement.domain.util.MoneyAmountFormatter moneyAmountFormatter = this.getHighSpeedVideoFpsRanges;
                                planAccordionMapper$buildSubtitle$1.getHighSpeedVideoSizes = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(fundingSource);
                                planAccordionMapper$buildSubtitle$1.getHighSpeedVideoFpsRanges = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(financialInstrument);
                                planAccordionMapper$buildSubtitle$1.getHighSpeedVideoFpsRangesFor = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(availableBalance);
                                planAccordionMapper$buildSubtitle$1.getHighResolutionOutputSizeshNQ4ISI = z;
                                planAccordionMapper$buildSubtitle$1.Camera2StreamConfigurationMap = 0;
                                planAccordionMapper$buildSubtitle$1.getOutputMinFrameDuration = 1;
                                obj = moneyAmountFormatter.format(availableBalance, z, planAccordionMapper$buildSubtitle$1);
                                if (obj == coroutine_suspended) {
                                    return coroutine_suspended;
                                }
                                break;
                            case 6:
                                return financialInstrument.getMaskedAccountNumber();
                            case 7:
                                return null;
                            default:
                                throw new kotlin.NoWhenBranchMatchedException();
                        }
                    }
                    return null;
                }
                if (i != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                int i2 = planAccordionMapper$buildSubtitle$1.Camera2StreamConfigurationMap;
                boolean z2 = planAccordionMapper$buildSubtitle$1.getHighResolutionOutputSizeshNQ4ISI;
                kotlin.ResultKt.throwOnFailure(obj);
                java.lang.StringBuilder sb = new java.lang.StringBuilder();
                sb.append(obj);
                sb.append(" available");
                return sb.toString();
            }
        }
        planAccordionMapper$buildSubtitle$1 = new com.paypal.oslo.feature.moneymovement.ui.transfer.component.planaccordion.internal.PlanAccordionMapper$buildSubtitle$1(this, continuation);
        java.lang.Object obj2 = planAccordionMapper$buildSubtitle$1.getOutputFormats;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = planAccordionMapper$buildSubtitle$1.getOutputMinFrameDuration;
        if (i != 0) {
        }
        java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
        sb2.append(obj2);
        sb2.append(" available");
        return sb2.toString();
    }

    @kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[com.paypal.oslo.feature.moneymovement.api.domain.FundingSourceType.values().length];
            try {
                iArr[com.paypal.oslo.feature.moneymovement.api.domain.FundingSourceType.CARD.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[com.paypal.oslo.feature.moneymovement.api.domain.FundingSourceType.CREDIT.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                iArr[com.paypal.oslo.feature.moneymovement.api.domain.FundingSourceType.BANK.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            try {
                iArr[com.paypal.oslo.feature.moneymovement.api.domain.FundingSourceType.BALANCE.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
            try {
                iArr[com.paypal.oslo.feature.moneymovement.api.domain.FundingSourceType.CRYPTOCURRENCY.ordinal()] = 5;
            } catch (java.lang.NoSuchFieldError unused5) {
            }
            try {
                iArr[com.paypal.oslo.feature.moneymovement.api.domain.FundingSourceType.PAYMENT_TOKEN.ordinal()] = 6;
            } catch (java.lang.NoSuchFieldError unused6) {
            }
            try {
                iArr[com.paypal.oslo.feature.moneymovement.api.domain.FundingSourceType.REWARDS.ordinal()] = 7;
            } catch (java.lang.NoSuchFieldError unused7) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }
}
