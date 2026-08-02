package com.paypal.oslo.feature.qrc.data.mapper;

@kotlin.Metadata(d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0004H\u0000¢\u0006\u0004\b\u0002\u0010\u0005\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0006H\u0000¢\u0006\u0004\b\u0002\u0010\u0007\u001a\u0013\u0010\n\u001a\u00020\t*\u00020\bH\u0002¢\u0006\u0004\b\n\u0010\u000b\u001a\u0013\u0010\r\u001a\u00020\f*\u00020\bH\u0002¢\u0006\u0004\b\r\u0010\u000e\u001a\u0013\u0010\u0010\u001a\u00020\u000f*\u00020\bH\u0002¢\u0006\u0004\b\u0010\u0010\u0011\u001a\u0013\u0010\u0014\u001a\u00020\u0013*\u00020\u0012H\u0002¢\u0006\u0004\b\u0014\u0010\u0015\u001a\u0015\u0010\u0014\u001a\u0004\u0018\u00010\u0017*\u00020\u0016H\u0002¢\u0006\u0004\b\u0014\u0010\u0018\u001a\u0013\u0010\r\u001a\u00020\u001a*\u00020\u0019H\u0002¢\u0006\u0004\b\r\u0010\u001b\u001a3\u0010!\u001a\u00020 *\u0010\u0012\u0004\u0012\u00020\u001d\u0012\u0006\u0012\u0004\u0018\u00010\u00170\u001c2\u0006\u0010\u001e\u001a\u00020\u001d2\b\u0010\u001f\u001a\u0004\u0018\u00010\u0016H\u0002¢\u0006\u0004\b!\u0010\""}, d2 = {"Lcom/paypal/oslo/feature/qrc/graphql/GetQrCodeSessionQuery$PaymentOptions;", "Lcom/paypal/oslo/feature/qrc/domain/model/review/PaymentOptions;", "toPaymentOptions", "(Lcom/paypal/oslo/feature/qrc/graphql/GetQrCodeSessionQuery$PaymentOptions;)Lcom/paypal/oslo/feature/qrc/domain/model/review/PaymentOptions;", "Lcom/paypal/oslo/feature/qrc/graphql/ScanQrCodeMutation$PaymentOptions;", "(Lcom/paypal/oslo/feature/qrc/graphql/ScanQrCodeMutation$PaymentOptions;)Lcom/paypal/oslo/feature/qrc/domain/model/review/PaymentOptions;", "Lcom/paypal/oslo/feature/qrc/graphql/fragment/QrcPaymentOptionsFragment;", "(Lcom/paypal/oslo/feature/qrc/graphql/fragment/QrcPaymentOptionsFragment;)Lcom/paypal/oslo/feature/qrc/domain/model/review/PaymentOptions;", "Lcom/paypal/oslo/feature/qrc/graphql/fragment/FundingSourceFragment;", "", "getHighResolutionOutputSizeshNQ4ISI", "(Lcom/paypal/oslo/feature/qrc/graphql/fragment/FundingSourceFragment;)Z", "Lcom/paypal/oslo/feature/qrc/domain/model/review/FundingSource;", "Camera2StreamConfigurationMap", "(Lcom/paypal/oslo/feature/qrc/graphql/fragment/FundingSourceFragment;)Lcom/paypal/oslo/feature/qrc/domain/model/review/FundingSource;", "Lcom/paypal/oslo/feature/qrc/domain/model/review/DisallowedFundingSource;", "getHighSpeedVideoSizes", "(Lcom/paypal/oslo/feature/qrc/graphql/fragment/FundingSourceFragment;)Lcom/paypal/oslo/feature/qrc/domain/model/review/DisallowedFundingSource;", "Lcom/paypal/oslo/feature/qrc/graphql/fragment/CurrencyConversionFragment;", "Lcom/paypal/oslo/feature/qrc/domain/model/review/CurrencyConversion;", "getHighSpeedVideoFpsRangesFor", "(Lcom/paypal/oslo/feature/qrc/graphql/fragment/CurrencyConversionFragment;)Lcom/paypal/oslo/feature/qrc/domain/model/review/CurrencyConversion;", "Lcom/paypal/oslo/feature/qrc/graphql/fragment/ContingencyFragment;", "Lcom/paypal/oslo/feature/qrc/domain/model/review/Contingency;", "(Lcom/paypal/oslo/feature/qrc/graphql/fragment/ContingencyFragment;)Lcom/paypal/oslo/feature/qrc/domain/model/review/Contingency;", "Lcom/paypal/oslo/feature/qrc/graphql/type/QRCodePaymentFundingSourceType;", "Lcom/paypal/oslo/feature/qrc/domain/model/review/InstrumentType;", "(Lcom/paypal/oslo/feature/qrc/graphql/type/QRCodePaymentFundingSourceType;)Lcom/paypal/oslo/feature/qrc/domain/model/review/InstrumentType;", "", "", "p0", "p1", "", "getHighSpeedVideoFpsRanges", "(Ljava/util/Map;Ljava/lang/String;Lcom/paypal/oslo/feature/qrc/graphql/fragment/ContingencyFragment;)V"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class PaymentOptionsMapperKt {
    public static final com.paypal.oslo.feature.qrc.domain.model.review.PaymentOptions toPaymentOptions(com.paypal.oslo.feature.qrc.graphql.GetQrCodeSessionQuery.PaymentOptions paymentOptions) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(paymentOptions, "");
        return toPaymentOptions(paymentOptions.getQrcPaymentOptionsFragment());
    }

    public static final com.paypal.oslo.feature.qrc.domain.model.review.PaymentOptions toPaymentOptions(com.paypal.oslo.feature.qrc.graphql.ScanQrCodeMutation.PaymentOptions paymentOptions) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(paymentOptions, "");
        return toPaymentOptions(paymentOptions.getQrcPaymentOptionsFragment());
    }

    /* JADX WARN: Removed duplicated region for block: B:109:0x01f6  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0215  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x024d  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x026d  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x02a1  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x02b6  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x02d7  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x02ec  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x0315  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x0325  */
    /* JADX WARN: Removed duplicated region for block: B:188:0x027f A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:206:0x01b2  */
    /* JADX WARN: Removed duplicated region for block: B:209:0x0172  */
    /* JADX WARN: Removed duplicated region for block: B:213:0x0122  */
    /* JADX WARN: Removed duplicated region for block: B:218:0x0103 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:223:0x0094 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:260:0x03e4  */
    /* JADX WARN: Removed duplicated region for block: B:263:0x03f2  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:416:0x061f  */
    /* JADX WARN: Removed duplicated region for block: B:432:0x0667  */
    /* JADX WARN: Removed duplicated region for block: B:457:0x06cf  */
    /* JADX WARN: Removed duplicated region for block: B:477:0x071d  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:506:0x078b  */
    /* JADX WARN: Removed duplicated region for block: B:554:0x0848  */
    /* JADX WARN: Removed duplicated region for block: B:564:0x086b  */
    /* JADX WARN: Removed duplicated region for block: B:578:0x08a5  */
    /* JADX WARN: Removed duplicated region for block: B:581:0x08bd  */
    /* JADX WARN: Removed duplicated region for block: B:584:0x08d5  */
    /* JADX WARN: Removed duplicated region for block: B:587:0x08e5  */
    /* JADX WARN: Removed duplicated region for block: B:588:0x08cd  */
    /* JADX WARN: Removed duplicated region for block: B:589:0x08b5  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x011f  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0136  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0141  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0153  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x015a  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x019a  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x01bc  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final com.paypal.oslo.feature.qrc.domain.model.review.PaymentOptions toPaymentOptions(com.paypal.oslo.feature.qrc.graphql.fragment.QrcPaymentOptionsFragment qrcPaymentOptionsFragment) {
        java.util.ArrayList emptyList;
        java.util.List emptyList2;
        java.lang.Object obj;
        boolean z;
        java.util.List<com.paypal.oslo.feature.qrc.graphql.fragment.QrcPaymentOptionsFragment.FundingOption> fundingOptions;
        java.util.List<com.paypal.oslo.feature.qrc.graphql.fragment.QrcPaymentOptionsFragment.FundingOption> fundingOptions2;
        java.util.List<com.paypal.oslo.feature.qrc.graphql.fragment.QrcPaymentOptionsFragment.FundingOption> fundingOptions3;
        java.util.List<com.paypal.oslo.feature.qrc.graphql.fragment.QrcPaymentOptionsFragment.FundingOption> fundingOptions4;
        java.util.List<com.paypal.oslo.feature.qrc.graphql.fragment.QrcPaymentOptionsFragment.FundingOption> fundingOptions5;
        java.util.LinkedHashMap linkedHashMap;
        com.paypal.oslo.feature.qrc.graphql.fragment.ContingencyFragment contingencyFragment;
        com.paypal.oslo.feature.qrc.graphql.type.QRCodeContingencyType type;
        java.util.Collection values;
        java.util.List<com.paypal.oslo.feature.qrc.graphql.fragment.QrcPaymentOptionsFragment.OptOutFundingOption> optOutFundingOptions;
        java.util.List<com.paypal.oslo.feature.qrc.graphql.fragment.QrcPaymentOptionsFragment.FundingSource1> fundingSources;
        java.lang.Object obj2;
        java.util.List<com.paypal.oslo.feature.qrc.graphql.fragment.QrcPaymentOptionsFragment.OptOutFundingOption> optOutFundingOptions2;
        java.util.List<com.paypal.oslo.feature.qrc.graphql.fragment.QrcPaymentOptionsFragment.FundingSource1> fundingSources2;
        java.util.ArrayList emptyList3;
        com.paypal.oslo.feature.qrc.domain.model.review.DisallowedFundingSource disallowedFundingSource;
        java.lang.Object obj3;
        com.paypal.oslo.feature.qrc.graphql.fragment.FundingSourceFragment fundingSourceFragment;
        com.paypal.oslo.feature.qrc.domain.model.review.FundingSource fundingSource;
        com.paypal.oslo.feature.qrc.graphql.fragment.QrcPaymentOptionsFragment.CurrencyConversionOverrides currencyConversionOverrides;
        com.paypal.oslo.feature.qrc.domain.model.review.FundingSource fundingSource2;
        com.paypal.oslo.feature.qrc.graphql.fragment.QrcPaymentOptionsFragment.CurrencyConversionOverrides currencyConversionOverrides2;
        com.paypal.oslo.feature.qrc.domain.model.review.FundingSource fundingSource3;
        com.paypal.oslo.feature.qrc.domain.model.review.CurrencyConverter currencyConverter;
        java.util.List build;
        com.paypal.oslo.feature.qrc.graphql.fragment.QrcPaymentOptionsFragment.CurrencyConversionOverrides currencyConversionOverrides3;
        com.paypal.oslo.feature.qrc.domain.model.review.CurrencyConverter currencyConverter2;
        int i;
        com.paypal.oslo.feature.qrc.domain.model.review.FundingOptionStatus fundingOptionStatus;
        java.util.List<com.paypal.oslo.feature.qrc.graphql.fragment.QrcPaymentOptionsFragment.FundingSource2> fundingSources3;
        com.paypal.oslo.feature.qrc.domain.model.review.FundingSource fundingSource4;
        java.util.List<com.paypal.oslo.feature.qrc.graphql.fragment.QrcPaymentOptionsFragment.FundingSource2> fundingSources4;
        com.paypal.oslo.feature.qrc.domain.model.review.FundingSource fundingSource5;
        java.util.List<com.paypal.oslo.feature.qrc.graphql.fragment.QrcPaymentOptionsFragment.OptOutFundingOption1> optOutFundingOptions3;
        com.paypal.oslo.feature.qrc.domain.model.review.FundingSource fundingSource6;
        com.paypal.oslo.feature.qrc.graphql.fragment.QrcPaymentOptionsFragment.OptOutFundingOption1 optOutFundingOption1;
        com.paypal.oslo.feature.qrc.graphql.fragment.OptOutFundingOptionFragment optOutFundingOptionFragment;
        com.paypal.oslo.feature.qrc.graphql.fragment.OptOutFundingOptionFragment.Contingency contingency;
        com.paypal.oslo.feature.qrc.graphql.fragment.ContingencyFragment contingencyFragment2;
        com.paypal.oslo.feature.qrc.graphql.fragment.ContingencyFragment contingencyFragment3;
        com.paypal.oslo.feature.qrc.graphql.fragment.QrcPaymentOptionsFragment.CurrencyConversion1 currencyConversion;
        com.paypal.oslo.feature.qrc.graphql.fragment.CurrencyConversionFragment currencyConversionFragment;
        com.paypal.oslo.feature.qrc.graphql.fragment.CurrencyConversionFragment currencyConversionFragment2;
        com.paypal.oslo.feature.qrc.graphql.fragment.QrcPaymentOptionsFragment.OptOutFundingOption1 optOutFundingOption12;
        com.paypal.oslo.feature.qrc.graphql.fragment.OptOutFundingOptionFragment optOutFundingOptionFragment2;
        java.util.List<com.paypal.oslo.feature.qrc.graphql.fragment.OptOutFundingOptionFragment.FundingSource> fundingSources5;
        java.util.Iterator<T> it;
        java.lang.Object obj4;
        com.paypal.oslo.feature.qrc.graphql.fragment.OptOutFundingOptionFragment.FundingSource fundingSource7;
        com.paypal.oslo.feature.qrc.graphql.fragment.FundingSourceFragment fundingSourceFragment2;
        java.lang.Object obj5;
        com.paypal.oslo.feature.qrc.graphql.fragment.FundingSourceFragment fundingSourceFragment3;
        com.paypal.oslo.feature.qrc.graphql.fragment.QrcPaymentOptionsFragment.OptOutFundingOption1 optOutFundingOption13;
        com.paypal.oslo.feature.qrc.graphql.fragment.OptOutFundingOptionFragment optOutFundingOptionFragment3;
        java.lang.Object obj6;
        com.paypal.oslo.feature.qrc.graphql.fragment.FundingSourceFragment fundingSourceFragment4;
        java.util.List<com.paypal.oslo.feature.qrc.graphql.fragment.QrcPaymentOptionsFragment.OptOutFundingOption> optOutFundingOptions4;
        java.util.List<com.paypal.oslo.feature.qrc.graphql.fragment.QrcPaymentOptionsFragment.OptOutFundingOption> optOutFundingOptions5;
        com.paypal.oslo.feature.qrc.graphql.fragment.QrcPaymentOptionsFragment.OptOutFundingOption optOutFundingOption;
        com.paypal.oslo.feature.qrc.graphql.fragment.OptOutFundingOptionFragment optOutFundingOptionFragment4;
        java.util.List<com.paypal.oslo.feature.qrc.graphql.fragment.OptOutFundingOptionFragment.FundingSource> fundingSources6;
        java.util.Iterator<T> it2;
        java.lang.Object obj7;
        com.paypal.oslo.feature.qrc.graphql.fragment.OptOutFundingOptionFragment.FundingSource fundingSource8;
        com.paypal.oslo.feature.qrc.graphql.fragment.FundingSourceFragment fundingSourceFragment5;
        java.util.List<com.paypal.oslo.feature.qrc.graphql.fragment.QrcPaymentOptionsFragment.DisallowedFundingSource> disallowedFundingSources;
        com.paypal.oslo.feature.qrc.graphql.fragment.QrcPaymentOptionsFragment.DisallowedFundingSource disallowedFundingSource2;
        com.paypal.oslo.feature.qrc.graphql.fragment.FundingSourceFragment fundingSourceFragment6;
        java.util.List<com.paypal.oslo.feature.qrc.graphql.fragment.QrcPaymentOptionsFragment.FundingSource1> fundingSources7;
        java.util.Iterator<T> it3;
        java.lang.Object obj8;
        com.paypal.oslo.feature.qrc.graphql.fragment.QrcPaymentOptionsFragment.FundingSource1 fundingSource1;
        com.paypal.oslo.feature.qrc.graphql.fragment.FundingSourceFragment fundingSourceFragment7;
        java.util.List<com.paypal.oslo.feature.qrc.graphql.fragment.QrcPaymentOptionsFragment.FundingSource1> fundingSources8;
        java.lang.Object obj9;
        com.paypal.oslo.feature.qrc.graphql.fragment.FundingSourceFragment fundingSourceFragment8;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(qrcPaymentOptionsFragment, "");
        java.util.List<com.paypal.oslo.feature.qrc.graphql.fragment.QrcPaymentOptionsFragment.FundingOption> fundingOptions6 = qrcPaymentOptionsFragment.getFundingOptions();
        boolean z2 = true;
        if (fundingOptions6 == null) {
            emptyList = kotlin.collections.CollectionsKt.emptyList();
        } else {
            java.util.List<com.paypal.oslo.feature.qrc.graphql.fragment.QrcPaymentOptionsFragment.FundingOption> list = fundingOptions6;
            java.util.ArrayList arrayList = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(list, 10));
            for (com.paypal.oslo.feature.qrc.graphql.fragment.QrcPaymentOptionsFragment.FundingOption fundingOption : list) {
                com.paypal.oslo.feature.qrc.graphql.fragment.QrcPaymentOptionsFragment.CurrencyConversionOverrides currencyConversionOverrides4 = fundingOption.getCurrencyConversionOverrides();
                if (currencyConversionOverrides4 != null && (fundingSources8 = currencyConversionOverrides4.getFundingSources()) != null) {
                    java.util.Iterator<T> it4 = fundingSources8.iterator();
                    while (true) {
                        if (!it4.hasNext()) {
                            obj9 = null;
                            break;
                        }
                        obj9 = it4.next();
                        if (((com.paypal.oslo.feature.qrc.graphql.fragment.QrcPaymentOptionsFragment.FundingSource1) obj9).getFundingSourceFragment().getType() == com.paypal.oslo.feature.qrc.graphql.type.QRCodePaymentFundingSourceType.BALANCE) {
                            break;
                        }
                    }
                    com.paypal.oslo.feature.qrc.graphql.fragment.QrcPaymentOptionsFragment.FundingSource1 fundingSource12 = (com.paypal.oslo.feature.qrc.graphql.fragment.QrcPaymentOptionsFragment.FundingSource1) obj9;
                    if (fundingSource12 != null && (fundingSourceFragment8 = fundingSource12.getFundingSourceFragment()) != null) {
                        fundingSource = Camera2StreamConfigurationMap(fundingSourceFragment8);
                        currencyConversionOverrides = fundingOption.getCurrencyConversionOverrides();
                        if (currencyConversionOverrides != null && (fundingSources7 = currencyConversionOverrides.getFundingSources()) != null) {
                            it3 = fundingSources7.iterator();
                            while (true) {
                                if (it3.hasNext()) {
                                    obj8 = null;
                                    break;
                                }
                                obj8 = it3.next();
                                if (getHighResolutionOutputSizeshNQ4ISI(((com.paypal.oslo.feature.qrc.graphql.fragment.QrcPaymentOptionsFragment.FundingSource1) obj8).getFundingSourceFragment())) {
                                    break;
                                }
                            }
                            fundingSource1 = (com.paypal.oslo.feature.qrc.graphql.fragment.QrcPaymentOptionsFragment.FundingSource1) obj8;
                            if (fundingSource1 != null && (fundingSourceFragment7 = fundingSource1.getFundingSourceFragment()) != null) {
                                fundingSource2 = Camera2StreamConfigurationMap(fundingSourceFragment7);
                                com.paypal.oslo.feature.qrc.graphql.fragment.QrcPaymentOptionsFragment.CurrencyConversionOverrides currencyConversionOverrides5 = fundingOption.getCurrencyConversionOverrides();
                                com.paypal.oslo.feature.qrc.domain.model.review.FundingSource Camera2StreamConfigurationMap = (currencyConversionOverrides5 != null || (disallowedFundingSources = currencyConversionOverrides5.getDisallowedFundingSources()) == null || (disallowedFundingSource2 = (com.paypal.oslo.feature.qrc.graphql.fragment.QrcPaymentOptionsFragment.DisallowedFundingSource) kotlin.collections.CollectionsKt.firstOrNull((java.util.List) disallowedFundingSources)) == null || (fundingSourceFragment6 = disallowedFundingSource2.getFundingSourceFragment()) == null) ? null : Camera2StreamConfigurationMap(fundingSourceFragment6);
                                currencyConversionOverrides2 = fundingOption.getCurrencyConversionOverrides();
                                if (currencyConversionOverrides2 != null && (optOutFundingOptions5 = currencyConversionOverrides2.getOptOutFundingOptions()) != null && (optOutFundingOption = (com.paypal.oslo.feature.qrc.graphql.fragment.QrcPaymentOptionsFragment.OptOutFundingOption) kotlin.collections.CollectionsKt.firstOrNull((java.util.List) optOutFundingOptions5)) != null && (optOutFundingOptionFragment4 = optOutFundingOption.getOptOutFundingOptionFragment()) != null && (fundingSources6 = optOutFundingOptionFragment4.getFundingSources()) != null) {
                                    it2 = fundingSources6.iterator();
                                    while (true) {
                                        if (it2.hasNext()) {
                                            obj7 = null;
                                            break;
                                        }
                                        obj7 = it2.next();
                                        if (getHighResolutionOutputSizeshNQ4ISI(((com.paypal.oslo.feature.qrc.graphql.fragment.OptOutFundingOptionFragment.FundingSource) obj7).getFundingSourceFragment())) {
                                            break;
                                        }
                                    }
                                    fundingSource8 = (com.paypal.oslo.feature.qrc.graphql.fragment.OptOutFundingOptionFragment.FundingSource) obj7;
                                    if (fundingSource8 != null && (fundingSourceFragment5 = fundingSource8.getFundingSourceFragment()) != null) {
                                        fundingSource3 = Camera2StreamConfigurationMap(fundingSourceFragment5);
                                        com.paypal.oslo.feature.qrc.data.mapper.CurrencyOverrideSources currencyOverrideSources = new com.paypal.oslo.feature.qrc.data.mapper.CurrencyOverrideSources(fundingSource, fundingSource2, Camera2StreamConfigurationMap, fundingSource3);
                                        if (fundingOption.getCurrencyConversionOverrides() == null) {
                                            currencyConverter = com.paypal.oslo.feature.qrc.domain.model.review.CurrencyConverter.ISSUER;
                                        } else {
                                            currencyConverter = fundingOption.getCurrencyConversion() != null ? com.paypal.oslo.feature.qrc.domain.model.review.CurrencyConverter.PAYPAL : null;
                                        }
                                        java.util.List createListBuilder = kotlin.collections.CollectionsKt.createListBuilder();
                                        if (fundingOption.getCurrencyConversion() != null) {
                                            createListBuilder.add(com.paypal.oslo.feature.qrc.domain.model.review.CurrencyConverter.PAYPAL);
                                        }
                                        if (fundingOption.getCurrencyConversionOverrides() != null) {
                                            createListBuilder.add(com.paypal.oslo.feature.qrc.domain.model.review.CurrencyConverter.ISSUER);
                                        }
                                        build = kotlin.collections.CollectionsKt.build(createListBuilder);
                                        if (build.isEmpty()) {
                                            build = null;
                                        }
                                        currencyConversionOverrides3 = fundingOption.getCurrencyConversionOverrides();
                                        if (currencyConversionOverrides3 == null && (optOutFundingOptions4 = currencyConversionOverrides3.getOptOutFundingOptions()) != null && (optOutFundingOptions4.isEmpty() ^ z2) == z2) {
                                            currencyConverter2 = com.paypal.oslo.feature.qrc.domain.model.review.CurrencyConverter.ISSUER;
                                        } else {
                                            java.util.List<com.paypal.oslo.feature.qrc.graphql.fragment.QrcPaymentOptionsFragment.OptOutFundingOption1> optOutFundingOptions6 = fundingOption.getOptOutFundingOptions();
                                            currencyConverter2 = (optOutFundingOptions6 == null && (optOutFundingOptions6.isEmpty() ^ z2) == z2) ? com.paypal.oslo.feature.qrc.domain.model.review.CurrencyConverter.PAYPAL : null;
                                        }
                                        com.paypal.oslo.feature.qrc.data.mapper.CurrencyConversionMeta currencyConversionMeta = new com.paypal.oslo.feature.qrc.data.mapper.CurrencyConversionMeta(currencyConverter, build, currencyConverter2);
                                        java.lang.String id = fundingOption.getId();
                                        int rank = fundingOption.getRank();
                                        i = com.paypal.oslo.feature.qrc.data.mapper.PaymentOptionsMapperKt.WhenMappings.$EnumSwitchMapping$0[fundingOption.getStatus().ordinal()];
                                        if (i != z2) {
                                            fundingOptionStatus = com.paypal.oslo.feature.qrc.domain.model.review.FundingOptionStatus.READY;
                                        } else if (i == 2) {
                                            fundingOptionStatus = com.paypal.oslo.feature.qrc.domain.model.review.FundingOptionStatus.ELIGIBLE;
                                        } else if (i == 3) {
                                            fundingOptionStatus = com.paypal.oslo.feature.qrc.domain.model.review.FundingOptionStatus.CONTINGENCY;
                                        } else {
                                            if (i != 4) {
                                                throw new kotlin.NoWhenBranchMatchedException();
                                            }
                                            fundingOptionStatus = com.paypal.oslo.feature.qrc.domain.model.review.FundingOptionStatus.UNKNOWN;
                                        }
                                        com.paypal.oslo.feature.qrc.domain.model.review.FundingOptionStatus fundingOptionStatus2 = fundingOptionStatus;
                                        fundingSources3 = fundingOption.getFundingSources();
                                        if (fundingSources3 != null) {
                                            java.util.Iterator<T> it5 = fundingSources3.iterator();
                                            while (true) {
                                                if (!it5.hasNext()) {
                                                    obj6 = null;
                                                    break;
                                                }
                                                obj6 = it5.next();
                                                if (((com.paypal.oslo.feature.qrc.graphql.fragment.QrcPaymentOptionsFragment.FundingSource2) obj6).getFundingSourceFragment().getType() == com.paypal.oslo.feature.qrc.graphql.type.QRCodePaymentFundingSourceType.BALANCE) {
                                                    break;
                                                }
                                            }
                                            com.paypal.oslo.feature.qrc.graphql.fragment.QrcPaymentOptionsFragment.FundingSource2 fundingSource22 = (com.paypal.oslo.feature.qrc.graphql.fragment.QrcPaymentOptionsFragment.FundingSource2) obj6;
                                            if (fundingSource22 != null && (fundingSourceFragment4 = fundingSource22.getFundingSourceFragment()) != null) {
                                                fundingSource4 = Camera2StreamConfigurationMap(fundingSourceFragment4);
                                                java.util.List<com.paypal.oslo.feature.qrc.graphql.fragment.QrcPaymentOptionsFragment.OptOutFundingOption1> optOutFundingOptions7 = fundingOption.getOptOutFundingOptions();
                                                boolean z3 = (optOutFundingOptions7 != null || (optOutFundingOption13 = (com.paypal.oslo.feature.qrc.graphql.fragment.QrcPaymentOptionsFragment.OptOutFundingOption1) kotlin.collections.CollectionsKt.firstOrNull((java.util.List) optOutFundingOptions7)) == null || (optOutFundingOptionFragment3 = optOutFundingOption13.getOptOutFundingOptionFragment()) == null || optOutFundingOptionFragment3.getPreferred() != z2) ? false : z2;
                                                fundingSources4 = fundingOption.getFundingSources();
                                                if (fundingSources4 != null) {
                                                    java.util.Iterator<T> it6 = fundingSources4.iterator();
                                                    while (true) {
                                                        if (!it6.hasNext()) {
                                                            obj5 = null;
                                                            break;
                                                        }
                                                        obj5 = it6.next();
                                                        if (getHighResolutionOutputSizeshNQ4ISI(((com.paypal.oslo.feature.qrc.graphql.fragment.QrcPaymentOptionsFragment.FundingSource2) obj5).getFundingSourceFragment())) {
                                                            break;
                                                        }
                                                    }
                                                    com.paypal.oslo.feature.qrc.graphql.fragment.QrcPaymentOptionsFragment.FundingSource2 fundingSource23 = (com.paypal.oslo.feature.qrc.graphql.fragment.QrcPaymentOptionsFragment.FundingSource2) obj5;
                                                    if (fundingSource23 != null && (fundingSourceFragment3 = fundingSource23.getFundingSourceFragment()) != null) {
                                                        fundingSource5 = Camera2StreamConfigurationMap(fundingSourceFragment3);
                                                        optOutFundingOptions3 = fundingOption.getOptOutFundingOptions();
                                                        if (optOutFundingOptions3 != null && (optOutFundingOption12 = (com.paypal.oslo.feature.qrc.graphql.fragment.QrcPaymentOptionsFragment.OptOutFundingOption1) kotlin.collections.CollectionsKt.firstOrNull((java.util.List) optOutFundingOptions3)) != null && (optOutFundingOptionFragment2 = optOutFundingOption12.getOptOutFundingOptionFragment()) != null && (fundingSources5 = optOutFundingOptionFragment2.getFundingSources()) != null) {
                                                            it = fundingSources5.iterator();
                                                            while (true) {
                                                                if (it.hasNext()) {
                                                                    obj4 = null;
                                                                    break;
                                                                }
                                                                obj4 = it.next();
                                                                if (getHighResolutionOutputSizeshNQ4ISI(((com.paypal.oslo.feature.qrc.graphql.fragment.OptOutFundingOptionFragment.FundingSource) obj4).getFundingSourceFragment())) {
                                                                    break;
                                                                }
                                                            }
                                                            fundingSource7 = (com.paypal.oslo.feature.qrc.graphql.fragment.OptOutFundingOptionFragment.FundingSource) obj4;
                                                            if (fundingSource7 != null && (fundingSourceFragment2 = fundingSource7.getFundingSourceFragment()) != null) {
                                                                fundingSource6 = Camera2StreamConfigurationMap(fundingSourceFragment2);
                                                                com.paypal.oslo.feature.qrc.domain.model.review.FundingSource fundingSource9 = currencyOverrideSources.getHighSpeedVideoFpsRanges;
                                                                com.paypal.oslo.feature.qrc.domain.model.review.FundingSource fundingSource10 = currencyOverrideSources.getHighSpeedVideoFpsRangesFor;
                                                                com.paypal.oslo.feature.qrc.domain.model.review.FundingSource fundingSource11 = currencyOverrideSources.getHighSpeedVideoSizes;
                                                                com.paypal.oslo.feature.qrc.domain.model.review.FundingSource fundingSource13 = currencyOverrideSources.Camera2StreamConfigurationMap;
                                                                com.paypal.oslo.feature.qrc.graphql.fragment.QrcPaymentOptionsFragment.CurrencyConversion currencyConversion2 = fundingOption.getCurrencyConversion();
                                                                com.paypal.oslo.feature.qrc.domain.model.review.CurrencyConversion highSpeedVideoFpsRangesFor = (currencyConversion2 != null || (currencyConversionFragment2 = currencyConversion2.getCurrencyConversionFragment()) == null) ? null : getHighSpeedVideoFpsRangesFor(currencyConversionFragment2);
                                                                com.paypal.oslo.feature.qrc.graphql.fragment.QrcPaymentOptionsFragment.CurrencyConversionOverrides currencyConversionOverrides6 = fundingOption.getCurrencyConversionOverrides();
                                                                com.paypal.oslo.feature.qrc.domain.model.review.CurrencyConversion highSpeedVideoFpsRangesFor2 = (currencyConversionOverrides6 != null || (currencyConversion = currencyConversionOverrides6.getCurrencyConversion()) == null || (currencyConversionFragment = currencyConversion.getCurrencyConversionFragment()) == null) ? null : getHighSpeedVideoFpsRangesFor(currencyConversionFragment);
                                                                java.util.List<com.paypal.oslo.feature.qrc.domain.model.review.CurrencyConverter> list2 = currencyConversionMeta.getHighSpeedVideoFpsRanges;
                                                                com.paypal.oslo.feature.qrc.domain.model.review.CurrencyConverter currencyConverter3 = currencyConversionMeta.getHighResolutionOutputSizeshNQ4ISI;
                                                                com.paypal.oslo.feature.qrc.domain.model.review.CurrencyConverter currencyConverter4 = currencyConversionMeta.getHighSpeedVideoFpsRangesFor;
                                                                com.paypal.oslo.feature.qrc.graphql.fragment.QrcPaymentOptionsFragment.Contingency1 contingency2 = fundingOption.getContingency();
                                                                com.paypal.oslo.feature.qrc.domain.model.review.Contingency highSpeedVideoFpsRangesFor3 = (contingency2 != null || (contingencyFragment3 = contingency2.getContingencyFragment()) == null) ? null : getHighSpeedVideoFpsRangesFor(contingencyFragment3);
                                                                java.util.List<com.paypal.oslo.feature.qrc.graphql.fragment.QrcPaymentOptionsFragment.OptOutFundingOption1> optOutFundingOptions8 = fundingOption.getOptOutFundingOptions();
                                                                com.paypal.oslo.feature.qrc.domain.model.review.Contingency highSpeedVideoFpsRangesFor4 = (optOutFundingOptions8 != null || (optOutFundingOption1 = (com.paypal.oslo.feature.qrc.graphql.fragment.QrcPaymentOptionsFragment.OptOutFundingOption1) kotlin.collections.CollectionsKt.firstOrNull((java.util.List) optOutFundingOptions8)) == null || (optOutFundingOptionFragment = optOutFundingOption1.getOptOutFundingOptionFragment()) == null || (contingency = optOutFundingOptionFragment.getContingency()) == null || (contingencyFragment2 = contingency.getContingencyFragment()) == null) ? null : getHighSpeedVideoFpsRangesFor(contingencyFragment2);
                                                                com.paypal.oslo.feature.qrc.graphql.fragment.QrcPaymentOptionsFragment.FeeAmount1 feeAmount = fundingOption.getFeeAmount();
                                                                arrayList.add(new com.paypal.oslo.feature.qrc.domain.model.review.FundingPlan(id, rank, fundingOptionStatus2, fundingSource4, z3, fundingSource5, fundingSource6, null, null, fundingSource9, fundingSource10, fundingSource11, fundingSource13, highSpeedVideoFpsRangesFor, highSpeedVideoFpsRangesFor2, list2, currencyConverter3, currencyConverter4, highSpeedVideoFpsRangesFor3, highSpeedVideoFpsRangesFor4, feeAmount == null ? new com.paypal.oslo.feature.qrc.domain.model.session.QrcMoney(feeAmount.getCurrencyCode(), feeAmount.getValue()) : null));
                                                                z2 = true;
                                                            }
                                                        }
                                                        fundingSource6 = null;
                                                        com.paypal.oslo.feature.qrc.domain.model.review.FundingSource fundingSource92 = currencyOverrideSources.getHighSpeedVideoFpsRanges;
                                                        com.paypal.oslo.feature.qrc.domain.model.review.FundingSource fundingSource102 = currencyOverrideSources.getHighSpeedVideoFpsRangesFor;
                                                        com.paypal.oslo.feature.qrc.domain.model.review.FundingSource fundingSource112 = currencyOverrideSources.getHighSpeedVideoSizes;
                                                        com.paypal.oslo.feature.qrc.domain.model.review.FundingSource fundingSource132 = currencyOverrideSources.Camera2StreamConfigurationMap;
                                                        com.paypal.oslo.feature.qrc.graphql.fragment.QrcPaymentOptionsFragment.CurrencyConversion currencyConversion22 = fundingOption.getCurrencyConversion();
                                                        if (currencyConversion22 != null) {
                                                        }
                                                        com.paypal.oslo.feature.qrc.graphql.fragment.QrcPaymentOptionsFragment.CurrencyConversionOverrides currencyConversionOverrides62 = fundingOption.getCurrencyConversionOverrides();
                                                        if (currencyConversionOverrides62 != null) {
                                                        }
                                                        java.util.List<com.paypal.oslo.feature.qrc.domain.model.review.CurrencyConverter> list22 = currencyConversionMeta.getHighSpeedVideoFpsRanges;
                                                        com.paypal.oslo.feature.qrc.domain.model.review.CurrencyConverter currencyConverter32 = currencyConversionMeta.getHighResolutionOutputSizeshNQ4ISI;
                                                        com.paypal.oslo.feature.qrc.domain.model.review.CurrencyConverter currencyConverter42 = currencyConversionMeta.getHighSpeedVideoFpsRangesFor;
                                                        com.paypal.oslo.feature.qrc.graphql.fragment.QrcPaymentOptionsFragment.Contingency1 contingency22 = fundingOption.getContingency();
                                                        if (contingency22 != null) {
                                                        }
                                                        java.util.List<com.paypal.oslo.feature.qrc.graphql.fragment.QrcPaymentOptionsFragment.OptOutFundingOption1> optOutFundingOptions82 = fundingOption.getOptOutFundingOptions();
                                                        if (optOutFundingOptions82 != null) {
                                                        }
                                                        com.paypal.oslo.feature.qrc.graphql.fragment.QrcPaymentOptionsFragment.FeeAmount1 feeAmount2 = fundingOption.getFeeAmount();
                                                        arrayList.add(new com.paypal.oslo.feature.qrc.domain.model.review.FundingPlan(id, rank, fundingOptionStatus2, fundingSource4, z3, fundingSource5, fundingSource6, null, null, fundingSource92, fundingSource102, fundingSource112, fundingSource132, highSpeedVideoFpsRangesFor, highSpeedVideoFpsRangesFor2, list22, currencyConverter32, currencyConverter42, highSpeedVideoFpsRangesFor3, highSpeedVideoFpsRangesFor4, feeAmount2 == null ? new com.paypal.oslo.feature.qrc.domain.model.session.QrcMoney(feeAmount2.getCurrencyCode(), feeAmount2.getValue()) : null));
                                                        z2 = true;
                                                    }
                                                }
                                                fundingSource5 = null;
                                                optOutFundingOptions3 = fundingOption.getOptOutFundingOptions();
                                                if (optOutFundingOptions3 != null) {
                                                    it = fundingSources5.iterator();
                                                    while (true) {
                                                        if (it.hasNext()) {
                                                        }
                                                    }
                                                    fundingSource7 = (com.paypal.oslo.feature.qrc.graphql.fragment.OptOutFundingOptionFragment.FundingSource) obj4;
                                                    if (fundingSource7 != null) {
                                                        fundingSource6 = Camera2StreamConfigurationMap(fundingSourceFragment2);
                                                        com.paypal.oslo.feature.qrc.domain.model.review.FundingSource fundingSource922 = currencyOverrideSources.getHighSpeedVideoFpsRanges;
                                                        com.paypal.oslo.feature.qrc.domain.model.review.FundingSource fundingSource1022 = currencyOverrideSources.getHighSpeedVideoFpsRangesFor;
                                                        com.paypal.oslo.feature.qrc.domain.model.review.FundingSource fundingSource1122 = currencyOverrideSources.getHighSpeedVideoSizes;
                                                        com.paypal.oslo.feature.qrc.domain.model.review.FundingSource fundingSource1322 = currencyOverrideSources.Camera2StreamConfigurationMap;
                                                        com.paypal.oslo.feature.qrc.graphql.fragment.QrcPaymentOptionsFragment.CurrencyConversion currencyConversion222 = fundingOption.getCurrencyConversion();
                                                        if (currencyConversion222 != null) {
                                                        }
                                                        com.paypal.oslo.feature.qrc.graphql.fragment.QrcPaymentOptionsFragment.CurrencyConversionOverrides currencyConversionOverrides622 = fundingOption.getCurrencyConversionOverrides();
                                                        if (currencyConversionOverrides622 != null) {
                                                        }
                                                        java.util.List<com.paypal.oslo.feature.qrc.domain.model.review.CurrencyConverter> list222 = currencyConversionMeta.getHighSpeedVideoFpsRanges;
                                                        com.paypal.oslo.feature.qrc.domain.model.review.CurrencyConverter currencyConverter322 = currencyConversionMeta.getHighResolutionOutputSizeshNQ4ISI;
                                                        com.paypal.oslo.feature.qrc.domain.model.review.CurrencyConverter currencyConverter422 = currencyConversionMeta.getHighSpeedVideoFpsRangesFor;
                                                        com.paypal.oslo.feature.qrc.graphql.fragment.QrcPaymentOptionsFragment.Contingency1 contingency222 = fundingOption.getContingency();
                                                        if (contingency222 != null) {
                                                        }
                                                        java.util.List<com.paypal.oslo.feature.qrc.graphql.fragment.QrcPaymentOptionsFragment.OptOutFundingOption1> optOutFundingOptions822 = fundingOption.getOptOutFundingOptions();
                                                        if (optOutFundingOptions822 != null) {
                                                        }
                                                        com.paypal.oslo.feature.qrc.graphql.fragment.QrcPaymentOptionsFragment.FeeAmount1 feeAmount22 = fundingOption.getFeeAmount();
                                                        arrayList.add(new com.paypal.oslo.feature.qrc.domain.model.review.FundingPlan(id, rank, fundingOptionStatus2, fundingSource4, z3, fundingSource5, fundingSource6, null, null, fundingSource922, fundingSource1022, fundingSource1122, fundingSource1322, highSpeedVideoFpsRangesFor, highSpeedVideoFpsRangesFor2, list222, currencyConverter322, currencyConverter422, highSpeedVideoFpsRangesFor3, highSpeedVideoFpsRangesFor4, feeAmount22 == null ? new com.paypal.oslo.feature.qrc.domain.model.session.QrcMoney(feeAmount22.getCurrencyCode(), feeAmount22.getValue()) : null));
                                                        z2 = true;
                                                    }
                                                }
                                                fundingSource6 = null;
                                                com.paypal.oslo.feature.qrc.domain.model.review.FundingSource fundingSource9222 = currencyOverrideSources.getHighSpeedVideoFpsRanges;
                                                com.paypal.oslo.feature.qrc.domain.model.review.FundingSource fundingSource10222 = currencyOverrideSources.getHighSpeedVideoFpsRangesFor;
                                                com.paypal.oslo.feature.qrc.domain.model.review.FundingSource fundingSource11222 = currencyOverrideSources.getHighSpeedVideoSizes;
                                                com.paypal.oslo.feature.qrc.domain.model.review.FundingSource fundingSource13222 = currencyOverrideSources.Camera2StreamConfigurationMap;
                                                com.paypal.oslo.feature.qrc.graphql.fragment.QrcPaymentOptionsFragment.CurrencyConversion currencyConversion2222 = fundingOption.getCurrencyConversion();
                                                if (currencyConversion2222 != null) {
                                                }
                                                com.paypal.oslo.feature.qrc.graphql.fragment.QrcPaymentOptionsFragment.CurrencyConversionOverrides currencyConversionOverrides6222 = fundingOption.getCurrencyConversionOverrides();
                                                if (currencyConversionOverrides6222 != null) {
                                                }
                                                java.util.List<com.paypal.oslo.feature.qrc.domain.model.review.CurrencyConverter> list2222 = currencyConversionMeta.getHighSpeedVideoFpsRanges;
                                                com.paypal.oslo.feature.qrc.domain.model.review.CurrencyConverter currencyConverter3222 = currencyConversionMeta.getHighResolutionOutputSizeshNQ4ISI;
                                                com.paypal.oslo.feature.qrc.domain.model.review.CurrencyConverter currencyConverter4222 = currencyConversionMeta.getHighSpeedVideoFpsRangesFor;
                                                com.paypal.oslo.feature.qrc.graphql.fragment.QrcPaymentOptionsFragment.Contingency1 contingency2222 = fundingOption.getContingency();
                                                if (contingency2222 != null) {
                                                }
                                                java.util.List<com.paypal.oslo.feature.qrc.graphql.fragment.QrcPaymentOptionsFragment.OptOutFundingOption1> optOutFundingOptions8222 = fundingOption.getOptOutFundingOptions();
                                                if (optOutFundingOptions8222 != null) {
                                                }
                                                com.paypal.oslo.feature.qrc.graphql.fragment.QrcPaymentOptionsFragment.FeeAmount1 feeAmount222 = fundingOption.getFeeAmount();
                                                arrayList.add(new com.paypal.oslo.feature.qrc.domain.model.review.FundingPlan(id, rank, fundingOptionStatus2, fundingSource4, z3, fundingSource5, fundingSource6, null, null, fundingSource9222, fundingSource10222, fundingSource11222, fundingSource13222, highSpeedVideoFpsRangesFor, highSpeedVideoFpsRangesFor2, list2222, currencyConverter3222, currencyConverter4222, highSpeedVideoFpsRangesFor3, highSpeedVideoFpsRangesFor4, feeAmount222 == null ? new com.paypal.oslo.feature.qrc.domain.model.session.QrcMoney(feeAmount222.getCurrencyCode(), feeAmount222.getValue()) : null));
                                                z2 = true;
                                            }
                                        }
                                        fundingSource4 = null;
                                        java.util.List<com.paypal.oslo.feature.qrc.graphql.fragment.QrcPaymentOptionsFragment.OptOutFundingOption1> optOutFundingOptions72 = fundingOption.getOptOutFundingOptions();
                                        if (optOutFundingOptions72 != null) {
                                        }
                                        fundingSources4 = fundingOption.getFundingSources();
                                        if (fundingSources4 != null) {
                                        }
                                        fundingSource5 = null;
                                        optOutFundingOptions3 = fundingOption.getOptOutFundingOptions();
                                        if (optOutFundingOptions3 != null) {
                                        }
                                        fundingSource6 = null;
                                        com.paypal.oslo.feature.qrc.domain.model.review.FundingSource fundingSource92222 = currencyOverrideSources.getHighSpeedVideoFpsRanges;
                                        com.paypal.oslo.feature.qrc.domain.model.review.FundingSource fundingSource102222 = currencyOverrideSources.getHighSpeedVideoFpsRangesFor;
                                        com.paypal.oslo.feature.qrc.domain.model.review.FundingSource fundingSource112222 = currencyOverrideSources.getHighSpeedVideoSizes;
                                        com.paypal.oslo.feature.qrc.domain.model.review.FundingSource fundingSource132222 = currencyOverrideSources.Camera2StreamConfigurationMap;
                                        com.paypal.oslo.feature.qrc.graphql.fragment.QrcPaymentOptionsFragment.CurrencyConversion currencyConversion22222 = fundingOption.getCurrencyConversion();
                                        if (currencyConversion22222 != null) {
                                        }
                                        com.paypal.oslo.feature.qrc.graphql.fragment.QrcPaymentOptionsFragment.CurrencyConversionOverrides currencyConversionOverrides62222 = fundingOption.getCurrencyConversionOverrides();
                                        if (currencyConversionOverrides62222 != null) {
                                        }
                                        java.util.List<com.paypal.oslo.feature.qrc.domain.model.review.CurrencyConverter> list22222 = currencyConversionMeta.getHighSpeedVideoFpsRanges;
                                        com.paypal.oslo.feature.qrc.domain.model.review.CurrencyConverter currencyConverter32222 = currencyConversionMeta.getHighResolutionOutputSizeshNQ4ISI;
                                        com.paypal.oslo.feature.qrc.domain.model.review.CurrencyConverter currencyConverter42222 = currencyConversionMeta.getHighSpeedVideoFpsRangesFor;
                                        com.paypal.oslo.feature.qrc.graphql.fragment.QrcPaymentOptionsFragment.Contingency1 contingency22222 = fundingOption.getContingency();
                                        if (contingency22222 != null) {
                                        }
                                        java.util.List<com.paypal.oslo.feature.qrc.graphql.fragment.QrcPaymentOptionsFragment.OptOutFundingOption1> optOutFundingOptions82222 = fundingOption.getOptOutFundingOptions();
                                        if (optOutFundingOptions82222 != null) {
                                        }
                                        com.paypal.oslo.feature.qrc.graphql.fragment.QrcPaymentOptionsFragment.FeeAmount1 feeAmount2222 = fundingOption.getFeeAmount();
                                        arrayList.add(new com.paypal.oslo.feature.qrc.domain.model.review.FundingPlan(id, rank, fundingOptionStatus2, fundingSource4, z3, fundingSource5, fundingSource6, null, null, fundingSource92222, fundingSource102222, fundingSource112222, fundingSource132222, highSpeedVideoFpsRangesFor, highSpeedVideoFpsRangesFor2, list22222, currencyConverter32222, currencyConverter42222, highSpeedVideoFpsRangesFor3, highSpeedVideoFpsRangesFor4, feeAmount2222 == null ? new com.paypal.oslo.feature.qrc.domain.model.session.QrcMoney(feeAmount2222.getCurrencyCode(), feeAmount2222.getValue()) : null));
                                        z2 = true;
                                    }
                                }
                                fundingSource3 = null;
                                com.paypal.oslo.feature.qrc.data.mapper.CurrencyOverrideSources currencyOverrideSources2 = new com.paypal.oslo.feature.qrc.data.mapper.CurrencyOverrideSources(fundingSource, fundingSource2, Camera2StreamConfigurationMap, fundingSource3);
                                if (fundingOption.getCurrencyConversionOverrides() == null) {
                                }
                                java.util.List createListBuilder2 = kotlin.collections.CollectionsKt.createListBuilder();
                                if (fundingOption.getCurrencyConversion() != null) {
                                }
                                if (fundingOption.getCurrencyConversionOverrides() != null) {
                                }
                                build = kotlin.collections.CollectionsKt.build(createListBuilder2);
                                if (build.isEmpty()) {
                                }
                                currencyConversionOverrides3 = fundingOption.getCurrencyConversionOverrides();
                                if (currencyConversionOverrides3 == null) {
                                }
                                java.util.List<com.paypal.oslo.feature.qrc.graphql.fragment.QrcPaymentOptionsFragment.OptOutFundingOption1> optOutFundingOptions62 = fundingOption.getOptOutFundingOptions();
                                if (optOutFundingOptions62 == null) {
                                }
                                com.paypal.oslo.feature.qrc.data.mapper.CurrencyConversionMeta currencyConversionMeta2 = new com.paypal.oslo.feature.qrc.data.mapper.CurrencyConversionMeta(currencyConverter, build, currencyConverter2);
                                java.lang.String id2 = fundingOption.getId();
                                int rank2 = fundingOption.getRank();
                                i = com.paypal.oslo.feature.qrc.data.mapper.PaymentOptionsMapperKt.WhenMappings.$EnumSwitchMapping$0[fundingOption.getStatus().ordinal()];
                                if (i != z2) {
                                }
                                com.paypal.oslo.feature.qrc.domain.model.review.FundingOptionStatus fundingOptionStatus22 = fundingOptionStatus;
                                fundingSources3 = fundingOption.getFundingSources();
                                if (fundingSources3 != null) {
                                }
                                fundingSource4 = null;
                                java.util.List<com.paypal.oslo.feature.qrc.graphql.fragment.QrcPaymentOptionsFragment.OptOutFundingOption1> optOutFundingOptions722 = fundingOption.getOptOutFundingOptions();
                                if (optOutFundingOptions722 != null) {
                                }
                                fundingSources4 = fundingOption.getFundingSources();
                                if (fundingSources4 != null) {
                                }
                                fundingSource5 = null;
                                optOutFundingOptions3 = fundingOption.getOptOutFundingOptions();
                                if (optOutFundingOptions3 != null) {
                                }
                                fundingSource6 = null;
                                com.paypal.oslo.feature.qrc.domain.model.review.FundingSource fundingSource922222 = currencyOverrideSources2.getHighSpeedVideoFpsRanges;
                                com.paypal.oslo.feature.qrc.domain.model.review.FundingSource fundingSource1022222 = currencyOverrideSources2.getHighSpeedVideoFpsRangesFor;
                                com.paypal.oslo.feature.qrc.domain.model.review.FundingSource fundingSource1122222 = currencyOverrideSources2.getHighSpeedVideoSizes;
                                com.paypal.oslo.feature.qrc.domain.model.review.FundingSource fundingSource1322222 = currencyOverrideSources2.Camera2StreamConfigurationMap;
                                com.paypal.oslo.feature.qrc.graphql.fragment.QrcPaymentOptionsFragment.CurrencyConversion currencyConversion222222 = fundingOption.getCurrencyConversion();
                                if (currencyConversion222222 != null) {
                                }
                                com.paypal.oslo.feature.qrc.graphql.fragment.QrcPaymentOptionsFragment.CurrencyConversionOverrides currencyConversionOverrides622222 = fundingOption.getCurrencyConversionOverrides();
                                if (currencyConversionOverrides622222 != null) {
                                }
                                java.util.List<com.paypal.oslo.feature.qrc.domain.model.review.CurrencyConverter> list222222 = currencyConversionMeta2.getHighSpeedVideoFpsRanges;
                                com.paypal.oslo.feature.qrc.domain.model.review.CurrencyConverter currencyConverter322222 = currencyConversionMeta2.getHighResolutionOutputSizeshNQ4ISI;
                                com.paypal.oslo.feature.qrc.domain.model.review.CurrencyConverter currencyConverter422222 = currencyConversionMeta2.getHighSpeedVideoFpsRangesFor;
                                com.paypal.oslo.feature.qrc.graphql.fragment.QrcPaymentOptionsFragment.Contingency1 contingency222222 = fundingOption.getContingency();
                                if (contingency222222 != null) {
                                }
                                java.util.List<com.paypal.oslo.feature.qrc.graphql.fragment.QrcPaymentOptionsFragment.OptOutFundingOption1> optOutFundingOptions822222 = fundingOption.getOptOutFundingOptions();
                                if (optOutFundingOptions822222 != null) {
                                }
                                com.paypal.oslo.feature.qrc.graphql.fragment.QrcPaymentOptionsFragment.FeeAmount1 feeAmount22222 = fundingOption.getFeeAmount();
                                arrayList.add(new com.paypal.oslo.feature.qrc.domain.model.review.FundingPlan(id2, rank2, fundingOptionStatus22, fundingSource4, z3, fundingSource5, fundingSource6, null, null, fundingSource922222, fundingSource1022222, fundingSource1122222, fundingSource1322222, highSpeedVideoFpsRangesFor, highSpeedVideoFpsRangesFor2, list222222, currencyConverter322222, currencyConverter422222, highSpeedVideoFpsRangesFor3, highSpeedVideoFpsRangesFor4, feeAmount22222 == null ? new com.paypal.oslo.feature.qrc.domain.model.session.QrcMoney(feeAmount22222.getCurrencyCode(), feeAmount22222.getValue()) : null));
                                z2 = true;
                            }
                        }
                        fundingSource2 = null;
                        com.paypal.oslo.feature.qrc.graphql.fragment.QrcPaymentOptionsFragment.CurrencyConversionOverrides currencyConversionOverrides52 = fundingOption.getCurrencyConversionOverrides();
                        if (currencyConversionOverrides52 != null) {
                        }
                        currencyConversionOverrides2 = fundingOption.getCurrencyConversionOverrides();
                        if (currencyConversionOverrides2 != null) {
                            it2 = fundingSources6.iterator();
                            while (true) {
                                if (it2.hasNext()) {
                                }
                            }
                            fundingSource8 = (com.paypal.oslo.feature.qrc.graphql.fragment.OptOutFundingOptionFragment.FundingSource) obj7;
                            if (fundingSource8 != null) {
                                fundingSource3 = Camera2StreamConfigurationMap(fundingSourceFragment5);
                                com.paypal.oslo.feature.qrc.data.mapper.CurrencyOverrideSources currencyOverrideSources22 = new com.paypal.oslo.feature.qrc.data.mapper.CurrencyOverrideSources(fundingSource, fundingSource2, Camera2StreamConfigurationMap, fundingSource3);
                                if (fundingOption.getCurrencyConversionOverrides() == null) {
                                }
                                java.util.List createListBuilder22 = kotlin.collections.CollectionsKt.createListBuilder();
                                if (fundingOption.getCurrencyConversion() != null) {
                                }
                                if (fundingOption.getCurrencyConversionOverrides() != null) {
                                }
                                build = kotlin.collections.CollectionsKt.build(createListBuilder22);
                                if (build.isEmpty()) {
                                }
                                currencyConversionOverrides3 = fundingOption.getCurrencyConversionOverrides();
                                if (currencyConversionOverrides3 == null) {
                                }
                                java.util.List<com.paypal.oslo.feature.qrc.graphql.fragment.QrcPaymentOptionsFragment.OptOutFundingOption1> optOutFundingOptions622 = fundingOption.getOptOutFundingOptions();
                                if (optOutFundingOptions622 == null) {
                                }
                                com.paypal.oslo.feature.qrc.data.mapper.CurrencyConversionMeta currencyConversionMeta22 = new com.paypal.oslo.feature.qrc.data.mapper.CurrencyConversionMeta(currencyConverter, build, currencyConverter2);
                                java.lang.String id22 = fundingOption.getId();
                                int rank22 = fundingOption.getRank();
                                i = com.paypal.oslo.feature.qrc.data.mapper.PaymentOptionsMapperKt.WhenMappings.$EnumSwitchMapping$0[fundingOption.getStatus().ordinal()];
                                if (i != z2) {
                                }
                                com.paypal.oslo.feature.qrc.domain.model.review.FundingOptionStatus fundingOptionStatus222 = fundingOptionStatus;
                                fundingSources3 = fundingOption.getFundingSources();
                                if (fundingSources3 != null) {
                                }
                                fundingSource4 = null;
                                java.util.List<com.paypal.oslo.feature.qrc.graphql.fragment.QrcPaymentOptionsFragment.OptOutFundingOption1> optOutFundingOptions7222 = fundingOption.getOptOutFundingOptions();
                                if (optOutFundingOptions7222 != null) {
                                }
                                fundingSources4 = fundingOption.getFundingSources();
                                if (fundingSources4 != null) {
                                }
                                fundingSource5 = null;
                                optOutFundingOptions3 = fundingOption.getOptOutFundingOptions();
                                if (optOutFundingOptions3 != null) {
                                }
                                fundingSource6 = null;
                                com.paypal.oslo.feature.qrc.domain.model.review.FundingSource fundingSource9222222 = currencyOverrideSources22.getHighSpeedVideoFpsRanges;
                                com.paypal.oslo.feature.qrc.domain.model.review.FundingSource fundingSource10222222 = currencyOverrideSources22.getHighSpeedVideoFpsRangesFor;
                                com.paypal.oslo.feature.qrc.domain.model.review.FundingSource fundingSource11222222 = currencyOverrideSources22.getHighSpeedVideoSizes;
                                com.paypal.oslo.feature.qrc.domain.model.review.FundingSource fundingSource13222222 = currencyOverrideSources22.Camera2StreamConfigurationMap;
                                com.paypal.oslo.feature.qrc.graphql.fragment.QrcPaymentOptionsFragment.CurrencyConversion currencyConversion2222222 = fundingOption.getCurrencyConversion();
                                if (currencyConversion2222222 != null) {
                                }
                                com.paypal.oslo.feature.qrc.graphql.fragment.QrcPaymentOptionsFragment.CurrencyConversionOverrides currencyConversionOverrides6222222 = fundingOption.getCurrencyConversionOverrides();
                                if (currencyConversionOverrides6222222 != null) {
                                }
                                java.util.List<com.paypal.oslo.feature.qrc.domain.model.review.CurrencyConverter> list2222222 = currencyConversionMeta22.getHighSpeedVideoFpsRanges;
                                com.paypal.oslo.feature.qrc.domain.model.review.CurrencyConverter currencyConverter3222222 = currencyConversionMeta22.getHighResolutionOutputSizeshNQ4ISI;
                                com.paypal.oslo.feature.qrc.domain.model.review.CurrencyConverter currencyConverter4222222 = currencyConversionMeta22.getHighSpeedVideoFpsRangesFor;
                                com.paypal.oslo.feature.qrc.graphql.fragment.QrcPaymentOptionsFragment.Contingency1 contingency2222222 = fundingOption.getContingency();
                                if (contingency2222222 != null) {
                                }
                                java.util.List<com.paypal.oslo.feature.qrc.graphql.fragment.QrcPaymentOptionsFragment.OptOutFundingOption1> optOutFundingOptions8222222 = fundingOption.getOptOutFundingOptions();
                                if (optOutFundingOptions8222222 != null) {
                                }
                                com.paypal.oslo.feature.qrc.graphql.fragment.QrcPaymentOptionsFragment.FeeAmount1 feeAmount222222 = fundingOption.getFeeAmount();
                                arrayList.add(new com.paypal.oslo.feature.qrc.domain.model.review.FundingPlan(id22, rank22, fundingOptionStatus222, fundingSource4, z3, fundingSource5, fundingSource6, null, null, fundingSource9222222, fundingSource10222222, fundingSource11222222, fundingSource13222222, highSpeedVideoFpsRangesFor, highSpeedVideoFpsRangesFor2, list2222222, currencyConverter3222222, currencyConverter4222222, highSpeedVideoFpsRangesFor3, highSpeedVideoFpsRangesFor4, feeAmount222222 == null ? new com.paypal.oslo.feature.qrc.domain.model.session.QrcMoney(feeAmount222222.getCurrencyCode(), feeAmount222222.getValue()) : null));
                                z2 = true;
                            }
                        }
                        fundingSource3 = null;
                        com.paypal.oslo.feature.qrc.data.mapper.CurrencyOverrideSources currencyOverrideSources222 = new com.paypal.oslo.feature.qrc.data.mapper.CurrencyOverrideSources(fundingSource, fundingSource2, Camera2StreamConfigurationMap, fundingSource3);
                        if (fundingOption.getCurrencyConversionOverrides() == null) {
                        }
                        java.util.List createListBuilder222 = kotlin.collections.CollectionsKt.createListBuilder();
                        if (fundingOption.getCurrencyConversion() != null) {
                        }
                        if (fundingOption.getCurrencyConversionOverrides() != null) {
                        }
                        build = kotlin.collections.CollectionsKt.build(createListBuilder222);
                        if (build.isEmpty()) {
                        }
                        currencyConversionOverrides3 = fundingOption.getCurrencyConversionOverrides();
                        if (currencyConversionOverrides3 == null) {
                        }
                        java.util.List<com.paypal.oslo.feature.qrc.graphql.fragment.QrcPaymentOptionsFragment.OptOutFundingOption1> optOutFundingOptions6222 = fundingOption.getOptOutFundingOptions();
                        if (optOutFundingOptions6222 == null) {
                        }
                        com.paypal.oslo.feature.qrc.data.mapper.CurrencyConversionMeta currencyConversionMeta222 = new com.paypal.oslo.feature.qrc.data.mapper.CurrencyConversionMeta(currencyConverter, build, currencyConverter2);
                        java.lang.String id222 = fundingOption.getId();
                        int rank222 = fundingOption.getRank();
                        i = com.paypal.oslo.feature.qrc.data.mapper.PaymentOptionsMapperKt.WhenMappings.$EnumSwitchMapping$0[fundingOption.getStatus().ordinal()];
                        if (i != z2) {
                        }
                        com.paypal.oslo.feature.qrc.domain.model.review.FundingOptionStatus fundingOptionStatus2222 = fundingOptionStatus;
                        fundingSources3 = fundingOption.getFundingSources();
                        if (fundingSources3 != null) {
                        }
                        fundingSource4 = null;
                        java.util.List<com.paypal.oslo.feature.qrc.graphql.fragment.QrcPaymentOptionsFragment.OptOutFundingOption1> optOutFundingOptions72222 = fundingOption.getOptOutFundingOptions();
                        if (optOutFundingOptions72222 != null) {
                        }
                        fundingSources4 = fundingOption.getFundingSources();
                        if (fundingSources4 != null) {
                        }
                        fundingSource5 = null;
                        optOutFundingOptions3 = fundingOption.getOptOutFundingOptions();
                        if (optOutFundingOptions3 != null) {
                        }
                        fundingSource6 = null;
                        com.paypal.oslo.feature.qrc.domain.model.review.FundingSource fundingSource92222222 = currencyOverrideSources222.getHighSpeedVideoFpsRanges;
                        com.paypal.oslo.feature.qrc.domain.model.review.FundingSource fundingSource102222222 = currencyOverrideSources222.getHighSpeedVideoFpsRangesFor;
                        com.paypal.oslo.feature.qrc.domain.model.review.FundingSource fundingSource112222222 = currencyOverrideSources222.getHighSpeedVideoSizes;
                        com.paypal.oslo.feature.qrc.domain.model.review.FundingSource fundingSource132222222 = currencyOverrideSources222.Camera2StreamConfigurationMap;
                        com.paypal.oslo.feature.qrc.graphql.fragment.QrcPaymentOptionsFragment.CurrencyConversion currencyConversion22222222 = fundingOption.getCurrencyConversion();
                        if (currencyConversion22222222 != null) {
                        }
                        com.paypal.oslo.feature.qrc.graphql.fragment.QrcPaymentOptionsFragment.CurrencyConversionOverrides currencyConversionOverrides62222222 = fundingOption.getCurrencyConversionOverrides();
                        if (currencyConversionOverrides62222222 != null) {
                        }
                        java.util.List<com.paypal.oslo.feature.qrc.domain.model.review.CurrencyConverter> list22222222 = currencyConversionMeta222.getHighSpeedVideoFpsRanges;
                        com.paypal.oslo.feature.qrc.domain.model.review.CurrencyConverter currencyConverter32222222 = currencyConversionMeta222.getHighResolutionOutputSizeshNQ4ISI;
                        com.paypal.oslo.feature.qrc.domain.model.review.CurrencyConverter currencyConverter42222222 = currencyConversionMeta222.getHighSpeedVideoFpsRangesFor;
                        com.paypal.oslo.feature.qrc.graphql.fragment.QrcPaymentOptionsFragment.Contingency1 contingency22222222 = fundingOption.getContingency();
                        if (contingency22222222 != null) {
                        }
                        java.util.List<com.paypal.oslo.feature.qrc.graphql.fragment.QrcPaymentOptionsFragment.OptOutFundingOption1> optOutFundingOptions82222222 = fundingOption.getOptOutFundingOptions();
                        if (optOutFundingOptions82222222 != null) {
                        }
                        com.paypal.oslo.feature.qrc.graphql.fragment.QrcPaymentOptionsFragment.FeeAmount1 feeAmount2222222 = fundingOption.getFeeAmount();
                        arrayList.add(new com.paypal.oslo.feature.qrc.domain.model.review.FundingPlan(id222, rank222, fundingOptionStatus2222, fundingSource4, z3, fundingSource5, fundingSource6, null, null, fundingSource92222222, fundingSource102222222, fundingSource112222222, fundingSource132222222, highSpeedVideoFpsRangesFor, highSpeedVideoFpsRangesFor2, list22222222, currencyConverter32222222, currencyConverter42222222, highSpeedVideoFpsRangesFor3, highSpeedVideoFpsRangesFor4, feeAmount2222222 == null ? new com.paypal.oslo.feature.qrc.domain.model.session.QrcMoney(feeAmount2222222.getCurrencyCode(), feeAmount2222222.getValue()) : null));
                        z2 = true;
                    }
                }
                fundingSource = null;
                currencyConversionOverrides = fundingOption.getCurrencyConversionOverrides();
                if (currencyConversionOverrides != null) {
                    it3 = fundingSources7.iterator();
                    while (true) {
                        if (it3.hasNext()) {
                        }
                    }
                    fundingSource1 = (com.paypal.oslo.feature.qrc.graphql.fragment.QrcPaymentOptionsFragment.FundingSource1) obj8;
                    if (fundingSource1 != null) {
                        fundingSource2 = Camera2StreamConfigurationMap(fundingSourceFragment7);
                        com.paypal.oslo.feature.qrc.graphql.fragment.QrcPaymentOptionsFragment.CurrencyConversionOverrides currencyConversionOverrides522 = fundingOption.getCurrencyConversionOverrides();
                        if (currencyConversionOverrides522 != null) {
                        }
                        currencyConversionOverrides2 = fundingOption.getCurrencyConversionOverrides();
                        if (currencyConversionOverrides2 != null) {
                        }
                        fundingSource3 = null;
                        com.paypal.oslo.feature.qrc.data.mapper.CurrencyOverrideSources currencyOverrideSources2222 = new com.paypal.oslo.feature.qrc.data.mapper.CurrencyOverrideSources(fundingSource, fundingSource2, Camera2StreamConfigurationMap, fundingSource3);
                        if (fundingOption.getCurrencyConversionOverrides() == null) {
                        }
                        java.util.List createListBuilder2222 = kotlin.collections.CollectionsKt.createListBuilder();
                        if (fundingOption.getCurrencyConversion() != null) {
                        }
                        if (fundingOption.getCurrencyConversionOverrides() != null) {
                        }
                        build = kotlin.collections.CollectionsKt.build(createListBuilder2222);
                        if (build.isEmpty()) {
                        }
                        currencyConversionOverrides3 = fundingOption.getCurrencyConversionOverrides();
                        if (currencyConversionOverrides3 == null) {
                        }
                        java.util.List<com.paypal.oslo.feature.qrc.graphql.fragment.QrcPaymentOptionsFragment.OptOutFundingOption1> optOutFundingOptions62222 = fundingOption.getOptOutFundingOptions();
                        if (optOutFundingOptions62222 == null) {
                        }
                        com.paypal.oslo.feature.qrc.data.mapper.CurrencyConversionMeta currencyConversionMeta2222 = new com.paypal.oslo.feature.qrc.data.mapper.CurrencyConversionMeta(currencyConverter, build, currencyConverter2);
                        java.lang.String id2222 = fundingOption.getId();
                        int rank2222 = fundingOption.getRank();
                        i = com.paypal.oslo.feature.qrc.data.mapper.PaymentOptionsMapperKt.WhenMappings.$EnumSwitchMapping$0[fundingOption.getStatus().ordinal()];
                        if (i != z2) {
                        }
                        com.paypal.oslo.feature.qrc.domain.model.review.FundingOptionStatus fundingOptionStatus22222 = fundingOptionStatus;
                        fundingSources3 = fundingOption.getFundingSources();
                        if (fundingSources3 != null) {
                        }
                        fundingSource4 = null;
                        java.util.List<com.paypal.oslo.feature.qrc.graphql.fragment.QrcPaymentOptionsFragment.OptOutFundingOption1> optOutFundingOptions722222 = fundingOption.getOptOutFundingOptions();
                        if (optOutFundingOptions722222 != null) {
                        }
                        fundingSources4 = fundingOption.getFundingSources();
                        if (fundingSources4 != null) {
                        }
                        fundingSource5 = null;
                        optOutFundingOptions3 = fundingOption.getOptOutFundingOptions();
                        if (optOutFundingOptions3 != null) {
                        }
                        fundingSource6 = null;
                        com.paypal.oslo.feature.qrc.domain.model.review.FundingSource fundingSource922222222 = currencyOverrideSources2222.getHighSpeedVideoFpsRanges;
                        com.paypal.oslo.feature.qrc.domain.model.review.FundingSource fundingSource1022222222 = currencyOverrideSources2222.getHighSpeedVideoFpsRangesFor;
                        com.paypal.oslo.feature.qrc.domain.model.review.FundingSource fundingSource1122222222 = currencyOverrideSources2222.getHighSpeedVideoSizes;
                        com.paypal.oslo.feature.qrc.domain.model.review.FundingSource fundingSource1322222222 = currencyOverrideSources2222.Camera2StreamConfigurationMap;
                        com.paypal.oslo.feature.qrc.graphql.fragment.QrcPaymentOptionsFragment.CurrencyConversion currencyConversion222222222 = fundingOption.getCurrencyConversion();
                        if (currencyConversion222222222 != null) {
                        }
                        com.paypal.oslo.feature.qrc.graphql.fragment.QrcPaymentOptionsFragment.CurrencyConversionOverrides currencyConversionOverrides622222222 = fundingOption.getCurrencyConversionOverrides();
                        if (currencyConversionOverrides622222222 != null) {
                        }
                        java.util.List<com.paypal.oslo.feature.qrc.domain.model.review.CurrencyConverter> list222222222 = currencyConversionMeta2222.getHighSpeedVideoFpsRanges;
                        com.paypal.oslo.feature.qrc.domain.model.review.CurrencyConverter currencyConverter322222222 = currencyConversionMeta2222.getHighResolutionOutputSizeshNQ4ISI;
                        com.paypal.oslo.feature.qrc.domain.model.review.CurrencyConverter currencyConverter422222222 = currencyConversionMeta2222.getHighSpeedVideoFpsRangesFor;
                        com.paypal.oslo.feature.qrc.graphql.fragment.QrcPaymentOptionsFragment.Contingency1 contingency222222222 = fundingOption.getContingency();
                        if (contingency222222222 != null) {
                        }
                        java.util.List<com.paypal.oslo.feature.qrc.graphql.fragment.QrcPaymentOptionsFragment.OptOutFundingOption1> optOutFundingOptions822222222 = fundingOption.getOptOutFundingOptions();
                        if (optOutFundingOptions822222222 != null) {
                        }
                        com.paypal.oslo.feature.qrc.graphql.fragment.QrcPaymentOptionsFragment.FeeAmount1 feeAmount22222222 = fundingOption.getFeeAmount();
                        arrayList.add(new com.paypal.oslo.feature.qrc.domain.model.review.FundingPlan(id2222, rank2222, fundingOptionStatus22222, fundingSource4, z3, fundingSource5, fundingSource6, null, null, fundingSource922222222, fundingSource1022222222, fundingSource1122222222, fundingSource1322222222, highSpeedVideoFpsRangesFor, highSpeedVideoFpsRangesFor2, list222222222, currencyConverter322222222, currencyConverter422222222, highSpeedVideoFpsRangesFor3, highSpeedVideoFpsRangesFor4, feeAmount22222222 == null ? new com.paypal.oslo.feature.qrc.domain.model.session.QrcMoney(feeAmount22222222.getCurrencyCode(), feeAmount22222222.getValue()) : null));
                        z2 = true;
                    }
                }
                fundingSource2 = null;
                com.paypal.oslo.feature.qrc.graphql.fragment.QrcPaymentOptionsFragment.CurrencyConversionOverrides currencyConversionOverrides5222 = fundingOption.getCurrencyConversionOverrides();
                if (currencyConversionOverrides5222 != null) {
                }
                currencyConversionOverrides2 = fundingOption.getCurrencyConversionOverrides();
                if (currencyConversionOverrides2 != null) {
                }
                fundingSource3 = null;
                com.paypal.oslo.feature.qrc.data.mapper.CurrencyOverrideSources currencyOverrideSources22222 = new com.paypal.oslo.feature.qrc.data.mapper.CurrencyOverrideSources(fundingSource, fundingSource2, Camera2StreamConfigurationMap, fundingSource3);
                if (fundingOption.getCurrencyConversionOverrides() == null) {
                }
                java.util.List createListBuilder22222 = kotlin.collections.CollectionsKt.createListBuilder();
                if (fundingOption.getCurrencyConversion() != null) {
                }
                if (fundingOption.getCurrencyConversionOverrides() != null) {
                }
                build = kotlin.collections.CollectionsKt.build(createListBuilder22222);
                if (build.isEmpty()) {
                }
                currencyConversionOverrides3 = fundingOption.getCurrencyConversionOverrides();
                if (currencyConversionOverrides3 == null) {
                }
                java.util.List<com.paypal.oslo.feature.qrc.graphql.fragment.QrcPaymentOptionsFragment.OptOutFundingOption1> optOutFundingOptions622222 = fundingOption.getOptOutFundingOptions();
                if (optOutFundingOptions622222 == null) {
                }
                com.paypal.oslo.feature.qrc.data.mapper.CurrencyConversionMeta currencyConversionMeta22222 = new com.paypal.oslo.feature.qrc.data.mapper.CurrencyConversionMeta(currencyConverter, build, currencyConverter2);
                java.lang.String id22222 = fundingOption.getId();
                int rank22222 = fundingOption.getRank();
                i = com.paypal.oslo.feature.qrc.data.mapper.PaymentOptionsMapperKt.WhenMappings.$EnumSwitchMapping$0[fundingOption.getStatus().ordinal()];
                if (i != z2) {
                }
                com.paypal.oslo.feature.qrc.domain.model.review.FundingOptionStatus fundingOptionStatus222222 = fundingOptionStatus;
                fundingSources3 = fundingOption.getFundingSources();
                if (fundingSources3 != null) {
                }
                fundingSource4 = null;
                java.util.List<com.paypal.oslo.feature.qrc.graphql.fragment.QrcPaymentOptionsFragment.OptOutFundingOption1> optOutFundingOptions7222222 = fundingOption.getOptOutFundingOptions();
                if (optOutFundingOptions7222222 != null) {
                }
                fundingSources4 = fundingOption.getFundingSources();
                if (fundingSources4 != null) {
                }
                fundingSource5 = null;
                optOutFundingOptions3 = fundingOption.getOptOutFundingOptions();
                if (optOutFundingOptions3 != null) {
                }
                fundingSource6 = null;
                com.paypal.oslo.feature.qrc.domain.model.review.FundingSource fundingSource9222222222 = currencyOverrideSources22222.getHighSpeedVideoFpsRanges;
                com.paypal.oslo.feature.qrc.domain.model.review.FundingSource fundingSource10222222222 = currencyOverrideSources22222.getHighSpeedVideoFpsRangesFor;
                com.paypal.oslo.feature.qrc.domain.model.review.FundingSource fundingSource11222222222 = currencyOverrideSources22222.getHighSpeedVideoSizes;
                com.paypal.oslo.feature.qrc.domain.model.review.FundingSource fundingSource13222222222 = currencyOverrideSources22222.Camera2StreamConfigurationMap;
                com.paypal.oslo.feature.qrc.graphql.fragment.QrcPaymentOptionsFragment.CurrencyConversion currencyConversion2222222222 = fundingOption.getCurrencyConversion();
                if (currencyConversion2222222222 != null) {
                }
                com.paypal.oslo.feature.qrc.graphql.fragment.QrcPaymentOptionsFragment.CurrencyConversionOverrides currencyConversionOverrides6222222222 = fundingOption.getCurrencyConversionOverrides();
                if (currencyConversionOverrides6222222222 != null) {
                }
                java.util.List<com.paypal.oslo.feature.qrc.domain.model.review.CurrencyConverter> list2222222222 = currencyConversionMeta22222.getHighSpeedVideoFpsRanges;
                com.paypal.oslo.feature.qrc.domain.model.review.CurrencyConverter currencyConverter3222222222 = currencyConversionMeta22222.getHighResolutionOutputSizeshNQ4ISI;
                com.paypal.oslo.feature.qrc.domain.model.review.CurrencyConverter currencyConverter4222222222 = currencyConversionMeta22222.getHighSpeedVideoFpsRangesFor;
                com.paypal.oslo.feature.qrc.graphql.fragment.QrcPaymentOptionsFragment.Contingency1 contingency2222222222 = fundingOption.getContingency();
                if (contingency2222222222 != null) {
                }
                java.util.List<com.paypal.oslo.feature.qrc.graphql.fragment.QrcPaymentOptionsFragment.OptOutFundingOption1> optOutFundingOptions8222222222 = fundingOption.getOptOutFundingOptions();
                if (optOutFundingOptions8222222222 != null) {
                }
                com.paypal.oslo.feature.qrc.graphql.fragment.QrcPaymentOptionsFragment.FeeAmount1 feeAmount222222222 = fundingOption.getFeeAmount();
                arrayList.add(new com.paypal.oslo.feature.qrc.domain.model.review.FundingPlan(id22222, rank22222, fundingOptionStatus222222, fundingSource4, z3, fundingSource5, fundingSource6, null, null, fundingSource9222222222, fundingSource10222222222, fundingSource11222222222, fundingSource13222222222, highSpeedVideoFpsRangesFor, highSpeedVideoFpsRangesFor2, list2222222222, currencyConverter3222222222, currencyConverter4222222222, highSpeedVideoFpsRangesFor3, highSpeedVideoFpsRangesFor4, feeAmount222222222 == null ? new com.paypal.oslo.feature.qrc.domain.model.session.QrcMoney(feeAmount222222222.getCurrencyCode(), feeAmount222222222.getValue()) : null));
                z2 = true;
            }
            emptyList = arrayList;
        }
        java.util.List list3 = emptyList;
        java.util.List<com.paypal.oslo.feature.qrc.graphql.fragment.QrcPaymentOptionsFragment.DisallowedOption> disallowedOptions = qrcPaymentOptionsFragment.getDisallowedOptions();
        if (disallowedOptions == null) {
            emptyList2 = kotlin.collections.CollectionsKt.emptyList();
        } else {
            java.util.List<com.paypal.oslo.feature.qrc.graphql.fragment.QrcPaymentOptionsFragment.DisallowedOption> list4 = disallowedOptions;
            java.util.ArrayList arrayList2 = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(list4, 10));
            for (com.paypal.oslo.feature.qrc.graphql.fragment.QrcPaymentOptionsFragment.DisallowedOption disallowedOption : list4) {
                java.util.List<com.paypal.oslo.feature.qrc.graphql.fragment.QrcPaymentOptionsFragment.FundingSource> fundingSources9 = disallowedOption.getFundingSources();
                if (fundingSources9 == null) {
                    emptyList3 = kotlin.collections.CollectionsKt.emptyList();
                } else {
                    java.util.List<com.paypal.oslo.feature.qrc.graphql.fragment.QrcPaymentOptionsFragment.FundingSource> list5 = fundingSources9;
                    java.util.ArrayList arrayList3 = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(list5, 10));
                    java.util.Iterator<T> it7 = list5.iterator();
                    while (it7.hasNext()) {
                        arrayList3.add(getHighSpeedVideoSizes(((com.paypal.oslo.feature.qrc.graphql.fragment.QrcPaymentOptionsFragment.FundingSource) it7.next()).getFundingSourceFragment()));
                    }
                    emptyList3 = arrayList3;
                }
                java.util.List<com.paypal.oslo.feature.qrc.graphql.fragment.QrcPaymentOptionsFragment.FundingSource> fundingSources10 = disallowedOption.getFundingSources();
                if (fundingSources10 != null) {
                    java.util.Iterator<T> it8 = fundingSources10.iterator();
                    while (true) {
                        if (!it8.hasNext()) {
                            obj3 = null;
                            break;
                        }
                        obj3 = it8.next();
                        if (((com.paypal.oslo.feature.qrc.graphql.fragment.QrcPaymentOptionsFragment.FundingSource) obj3).getFundingSourceFragment().getType() == com.paypal.oslo.feature.qrc.graphql.type.QRCodePaymentFundingSourceType.BALANCE) {
                            break;
                        }
                    }
                    com.paypal.oslo.feature.qrc.graphql.fragment.QrcPaymentOptionsFragment.FundingSource fundingSource14 = (com.paypal.oslo.feature.qrc.graphql.fragment.QrcPaymentOptionsFragment.FundingSource) obj3;
                    if (fundingSource14 != null && (fundingSourceFragment = fundingSource14.getFundingSourceFragment()) != null) {
                        disallowedFundingSource = getHighSpeedVideoSizes(fundingSourceFragment);
                        com.paypal.oslo.feature.qrc.graphql.fragment.QrcPaymentOptionsFragment.FeeAmount feeAmount3 = disallowedOption.getFeeAmount();
                        arrayList2.add(new com.paypal.oslo.feature.qrc.domain.model.review.DisallowedFundingPlan(emptyList3, disallowedFundingSource, feeAmount3 == null ? new com.paypal.oslo.feature.qrc.domain.model.session.QrcMoney(feeAmount3.getCurrencyCode(), feeAmount3.getValue()) : null));
                    }
                }
                disallowedFundingSource = null;
                com.paypal.oslo.feature.qrc.graphql.fragment.QrcPaymentOptionsFragment.FeeAmount feeAmount32 = disallowedOption.getFeeAmount();
                arrayList2.add(new com.paypal.oslo.feature.qrc.domain.model.review.DisallowedFundingPlan(emptyList3, disallowedFundingSource, feeAmount32 == null ? new com.paypal.oslo.feature.qrc.domain.model.session.QrcMoney(feeAmount32.getCurrencyCode(), feeAmount32.getValue()) : null));
            }
            emptyList2 = arrayList2;
        }
        java.util.List list6 = list3;
        java.util.Iterator it9 = list6.iterator();
        while (true) {
            if (!it9.hasNext()) {
                obj = null;
                break;
            }
            obj = it9.next();
            if (((com.paypal.oslo.feature.qrc.domain.model.review.FundingPlan) obj).getRank() == 1) {
                break;
            }
        }
        com.paypal.oslo.feature.qrc.domain.model.review.FundingPlan fundingPlan = (com.paypal.oslo.feature.qrc.domain.model.review.FundingPlan) obj;
        java.lang.String id3 = fundingPlan != null ? fundingPlan.getId() : null;
        java.util.ArrayList arrayList4 = new java.util.ArrayList();
        java.util.Iterator it10 = list6.iterator();
        while (it10.hasNext()) {
            com.paypal.oslo.feature.qrc.domain.model.review.FundingSource fundingInstruments = ((com.paypal.oslo.feature.qrc.domain.model.review.FundingPlan) it10.next()).getFundingInstruments();
            if (fundingInstruments != null) {
                arrayList4.add(fundingInstruments);
            }
        }
        java.util.ArrayList arrayList5 = arrayList4;
        java.util.List<com.paypal.oslo.feature.qrc.graphql.fragment.QrcPaymentOptionsFragment.FundingOption> fundingOptions7 = qrcPaymentOptionsFragment.getFundingOptions();
        java.util.List createListBuilder3 = kotlin.collections.CollectionsKt.createListBuilder();
        if (fundingOptions7 != null) {
            java.util.Iterator<T> it11 = fundingOptions7.iterator();
            while (it11.hasNext()) {
                java.util.List<com.paypal.oslo.feature.qrc.graphql.fragment.QrcPaymentOptionsFragment.OptOutFundingOption1> optOutFundingOptions9 = ((com.paypal.oslo.feature.qrc.graphql.fragment.QrcPaymentOptionsFragment.FundingOption) it11.next()).getOptOutFundingOptions();
                if (optOutFundingOptions9 != null) {
                    java.util.Iterator<T> it12 = optOutFundingOptions9.iterator();
                    while (it12.hasNext()) {
                        java.util.List<com.paypal.oslo.feature.qrc.graphql.fragment.OptOutFundingOptionFragment.FundingSource> fundingSources11 = ((com.paypal.oslo.feature.qrc.graphql.fragment.QrcPaymentOptionsFragment.OptOutFundingOption1) it12.next()).getOptOutFundingOptionFragment().getFundingSources();
                        if (fundingSources11 != null) {
                            java.util.ArrayList arrayList6 = new java.util.ArrayList();
                            for (java.lang.Object obj10 : fundingSources11) {
                                if (getHighResolutionOutputSizeshNQ4ISI(((com.paypal.oslo.feature.qrc.graphql.fragment.OptOutFundingOptionFragment.FundingSource) obj10).getFundingSourceFragment())) {
                                    arrayList6.add(obj10);
                                }
                            }
                            java.util.Iterator it13 = arrayList6.iterator();
                            while (it13.hasNext()) {
                                createListBuilder3.add(Camera2StreamConfigurationMap(((com.paypal.oslo.feature.qrc.graphql.fragment.OptOutFundingOptionFragment.FundingSource) it13.next()).getFundingSourceFragment()));
                            }
                        }
                    }
                }
            }
        }
        java.util.List build2 = kotlin.collections.CollectionsKt.build(createListBuilder3);
        java.util.List<com.paypal.oslo.feature.qrc.graphql.fragment.QrcPaymentOptionsFragment.FundingOption> fundingOptions8 = qrcPaymentOptionsFragment.getFundingOptions();
        java.util.List createListBuilder4 = kotlin.collections.CollectionsKt.createListBuilder();
        if (fundingOptions8 != null) {
            java.util.Iterator<T> it14 = fundingOptions8.iterator();
            while (it14.hasNext()) {
                com.paypal.oslo.feature.qrc.graphql.fragment.QrcPaymentOptionsFragment.CurrencyConversionOverrides currencyConversionOverrides7 = ((com.paypal.oslo.feature.qrc.graphql.fragment.QrcPaymentOptionsFragment.FundingOption) it14.next()).getCurrencyConversionOverrides();
                if (currencyConversionOverrides7 != null && (fundingSources2 = currencyConversionOverrides7.getFundingSources()) != null) {
                    java.util.ArrayList arrayList7 = new java.util.ArrayList();
                    for (java.lang.Object obj11 : fundingSources2) {
                        if (getHighResolutionOutputSizeshNQ4ISI(((com.paypal.oslo.feature.qrc.graphql.fragment.QrcPaymentOptionsFragment.FundingSource1) obj11).getFundingSourceFragment())) {
                            arrayList7.add(obj11);
                        }
                    }
                    java.util.Iterator it15 = arrayList7.iterator();
                    while (it15.hasNext()) {
                        createListBuilder4.add(Camera2StreamConfigurationMap(((com.paypal.oslo.feature.qrc.graphql.fragment.QrcPaymentOptionsFragment.FundingSource1) it15.next()).getFundingSourceFragment()));
                    }
                }
            }
        }
        java.util.List build3 = kotlin.collections.CollectionsKt.build(createListBuilder4);
        java.util.List<com.paypal.oslo.feature.qrc.graphql.fragment.QrcPaymentOptionsFragment.FundingOption> fundingOptions9 = qrcPaymentOptionsFragment.getFundingOptions();
        java.util.List createListBuilder5 = kotlin.collections.CollectionsKt.createListBuilder();
        if (fundingOptions9 != null) {
            java.util.Iterator<T> it16 = fundingOptions9.iterator();
            while (it16.hasNext()) {
                com.paypal.oslo.feature.qrc.graphql.fragment.QrcPaymentOptionsFragment.CurrencyConversionOverrides currencyConversionOverrides8 = ((com.paypal.oslo.feature.qrc.graphql.fragment.QrcPaymentOptionsFragment.FundingOption) it16.next()).getCurrencyConversionOverrides();
                if (currencyConversionOverrides8 != null && (optOutFundingOptions2 = currencyConversionOverrides8.getOptOutFundingOptions()) != null) {
                    java.util.Iterator<T> it17 = optOutFundingOptions2.iterator();
                    while (it17.hasNext()) {
                        java.util.List<com.paypal.oslo.feature.qrc.graphql.fragment.OptOutFundingOptionFragment.FundingSource> fundingSources12 = ((com.paypal.oslo.feature.qrc.graphql.fragment.QrcPaymentOptionsFragment.OptOutFundingOption) it17.next()).getOptOutFundingOptionFragment().getFundingSources();
                        if (fundingSources12 != null) {
                            java.util.ArrayList arrayList8 = new java.util.ArrayList();
                            for (java.lang.Object obj12 : fundingSources12) {
                                if (getHighResolutionOutputSizeshNQ4ISI(((com.paypal.oslo.feature.qrc.graphql.fragment.OptOutFundingOptionFragment.FundingSource) obj12).getFundingSourceFragment())) {
                                    arrayList8.add(obj12);
                                }
                            }
                            java.util.Iterator it18 = arrayList8.iterator();
                            while (it18.hasNext()) {
                                createListBuilder5.add(Camera2StreamConfigurationMap(((com.paypal.oslo.feature.qrc.graphql.fragment.OptOutFundingOptionFragment.FundingSource) it18.next()).getFundingSourceFragment()));
                            }
                        }
                    }
                }
            }
        }
        java.util.List build4 = kotlin.collections.CollectionsKt.build(createListBuilder5);
        java.util.List<com.paypal.oslo.feature.qrc.graphql.fragment.QrcPaymentOptionsFragment.FundingOption> fundingOptions10 = qrcPaymentOptionsFragment.getFundingOptions();
        if (fundingOptions10 != null) {
            java.util.Iterator<T> it19 = fundingOptions10.iterator();
            while (true) {
                if (!it19.hasNext()) {
                    obj2 = null;
                    break;
                }
                obj2 = it19.next();
                if (((com.paypal.oslo.feature.qrc.graphql.fragment.QrcPaymentOptionsFragment.FundingOption) obj2).getRank() == 1) {
                    break;
                }
            }
            com.paypal.oslo.feature.qrc.graphql.fragment.QrcPaymentOptionsFragment.FundingOption fundingOption2 = (com.paypal.oslo.feature.qrc.graphql.fragment.QrcPaymentOptionsFragment.FundingOption) obj2;
            if (fundingOption2 != null && (fundingOption2.getCurrencyConversion() != null || fundingOption2.getCurrencyConversionOverrides() != null)) {
                z = true;
                fundingOptions = qrcPaymentOptionsFragment.getFundingOptions();
                java.util.Map createMapBuilder = kotlin.collections.MapsKt.createMapBuilder();
                if (fundingOptions != null) {
                    for (com.paypal.oslo.feature.qrc.graphql.fragment.QrcPaymentOptionsFragment.FundingOption fundingOption3 : fundingOptions) {
                        java.util.List<com.paypal.oslo.feature.qrc.graphql.fragment.QrcPaymentOptionsFragment.FundingSource2> fundingSources13 = fundingOption3.getFundingSources();
                        if (fundingSources13 != null) {
                            java.util.Iterator<T> it20 = fundingSources13.iterator();
                            while (it20.hasNext()) {
                                createMapBuilder.put(((com.paypal.oslo.feature.qrc.graphql.fragment.QrcPaymentOptionsFragment.FundingSource2) it20.next()).getFundingSourceFragment().getId(), fundingOption3.getId());
                            }
                        }
                    }
                }
                java.util.Map build5 = kotlin.collections.MapsKt.build(createMapBuilder);
                fundingOptions2 = qrcPaymentOptionsFragment.getFundingOptions();
                java.util.Map createMapBuilder2 = kotlin.collections.MapsKt.createMapBuilder();
                if (fundingOptions2 != null) {
                    java.util.Iterator<T> it21 = fundingOptions2.iterator();
                    while (it21.hasNext()) {
                        java.util.List<com.paypal.oslo.feature.qrc.graphql.fragment.QrcPaymentOptionsFragment.OptOutFundingOption1> optOutFundingOptions10 = ((com.paypal.oslo.feature.qrc.graphql.fragment.QrcPaymentOptionsFragment.FundingOption) it21.next()).getOptOutFundingOptions();
                        if (optOutFundingOptions10 != null) {
                            for (com.paypal.oslo.feature.qrc.graphql.fragment.QrcPaymentOptionsFragment.OptOutFundingOption1 optOutFundingOption14 : optOutFundingOptions10) {
                                java.util.List<com.paypal.oslo.feature.qrc.graphql.fragment.OptOutFundingOptionFragment.FundingSource> fundingSources14 = optOutFundingOption14.getOptOutFundingOptionFragment().getFundingSources();
                                if (fundingSources14 != null) {
                                    java.util.Iterator<T> it22 = fundingSources14.iterator();
                                    while (it22.hasNext()) {
                                        createMapBuilder2.put(((com.paypal.oslo.feature.qrc.graphql.fragment.OptOutFundingOptionFragment.FundingSource) it22.next()).getFundingSourceFragment().getId(), optOutFundingOption14.getOptOutFundingOptionFragment().getId());
                                    }
                                }
                            }
                        }
                    }
                }
                java.util.Map build6 = kotlin.collections.MapsKt.build(createMapBuilder2);
                fundingOptions3 = qrcPaymentOptionsFragment.getFundingOptions();
                java.util.Map createMapBuilder3 = kotlin.collections.MapsKt.createMapBuilder();
                if (fundingOptions3 != null) {
                    java.util.Iterator<T> it23 = fundingOptions3.iterator();
                    while (it23.hasNext()) {
                        com.paypal.oslo.feature.qrc.graphql.fragment.QrcPaymentOptionsFragment.CurrencyConversionOverrides currencyConversionOverrides9 = ((com.paypal.oslo.feature.qrc.graphql.fragment.QrcPaymentOptionsFragment.FundingOption) it23.next()).getCurrencyConversionOverrides();
                        if (currencyConversionOverrides9 != null && (fundingSources = currencyConversionOverrides9.getFundingSources()) != null) {
                            java.util.Iterator<T> it24 = fundingSources.iterator();
                            while (it24.hasNext()) {
                                createMapBuilder3.put(((com.paypal.oslo.feature.qrc.graphql.fragment.QrcPaymentOptionsFragment.FundingSource1) it24.next()).getFundingSourceFragment().getId(), currencyConversionOverrides9.getId());
                            }
                        }
                    }
                }
                java.util.Map build7 = kotlin.collections.MapsKt.build(createMapBuilder3);
                fundingOptions4 = qrcPaymentOptionsFragment.getFundingOptions();
                java.util.Map createMapBuilder4 = kotlin.collections.MapsKt.createMapBuilder();
                if (fundingOptions4 != null) {
                    java.util.Iterator<T> it25 = fundingOptions4.iterator();
                    while (it25.hasNext()) {
                        com.paypal.oslo.feature.qrc.graphql.fragment.QrcPaymentOptionsFragment.CurrencyConversionOverrides currencyConversionOverrides10 = ((com.paypal.oslo.feature.qrc.graphql.fragment.QrcPaymentOptionsFragment.FundingOption) it25.next()).getCurrencyConversionOverrides();
                        if (currencyConversionOverrides10 != null && (optOutFundingOptions = currencyConversionOverrides10.getOptOutFundingOptions()) != null) {
                            for (com.paypal.oslo.feature.qrc.graphql.fragment.QrcPaymentOptionsFragment.OptOutFundingOption optOutFundingOption2 : optOutFundingOptions) {
                                java.util.List<com.paypal.oslo.feature.qrc.graphql.fragment.OptOutFundingOptionFragment.FundingSource> fundingSources15 = optOutFundingOption2.getOptOutFundingOptionFragment().getFundingSources();
                                if (fundingSources15 != null) {
                                    java.util.Iterator<T> it26 = fundingSources15.iterator();
                                    while (it26.hasNext()) {
                                        createMapBuilder4.put(((com.paypal.oslo.feature.qrc.graphql.fragment.OptOutFundingOptionFragment.FundingSource) it26.next()).getFundingSourceFragment().getId(), optOutFundingOption2.getOptOutFundingOptionFragment().getId());
                                    }
                                }
                            }
                        }
                    }
                }
                java.util.Map build8 = kotlin.collections.MapsKt.build(createMapBuilder4);
                fundingOptions5 = qrcPaymentOptionsFragment.getFundingOptions();
                java.util.Map createMapBuilder5 = kotlin.collections.MapsKt.createMapBuilder();
                if (fundingOptions5 != null) {
                    for (com.paypal.oslo.feature.qrc.graphql.fragment.QrcPaymentOptionsFragment.FundingOption fundingOption4 : fundingOptions5) {
                        java.lang.String id4 = fundingOption4.getId();
                        com.paypal.oslo.feature.qrc.graphql.fragment.QrcPaymentOptionsFragment.Contingency1 contingency3 = fundingOption4.getContingency();
                        getHighSpeedVideoFpsRanges(createMapBuilder5, id4, contingency3 != null ? contingency3.getContingencyFragment() : null);
                        java.util.List<com.paypal.oslo.feature.qrc.graphql.fragment.QrcPaymentOptionsFragment.OptOutFundingOption1> optOutFundingOptions11 = fundingOption4.getOptOutFundingOptions();
                        if (optOutFundingOptions11 != null) {
                            for (com.paypal.oslo.feature.qrc.graphql.fragment.QrcPaymentOptionsFragment.OptOutFundingOption1 optOutFundingOption15 : optOutFundingOptions11) {
                                java.lang.String id5 = optOutFundingOption15.getOptOutFundingOptionFragment().getId();
                                com.paypal.oslo.feature.qrc.graphql.fragment.OptOutFundingOptionFragment.Contingency contingency4 = optOutFundingOption15.getOptOutFundingOptionFragment().getContingency();
                                getHighSpeedVideoFpsRanges(createMapBuilder5, id5, contingency4 != null ? contingency4.getContingencyFragment() : null);
                            }
                        }
                        com.paypal.oslo.feature.qrc.graphql.fragment.QrcPaymentOptionsFragment.CurrencyConversionOverrides currencyConversionOverrides11 = fundingOption4.getCurrencyConversionOverrides();
                        if (currencyConversionOverrides11 != null) {
                            java.lang.String id6 = currencyConversionOverrides11.getId();
                            com.paypal.oslo.feature.qrc.graphql.fragment.QrcPaymentOptionsFragment.Contingency2 contingency5 = currencyConversionOverrides11.getContingency();
                            getHighSpeedVideoFpsRanges(createMapBuilder5, id6, contingency5 != null ? contingency5.getContingencyFragment() : null);
                            java.util.List<com.paypal.oslo.feature.qrc.graphql.fragment.QrcPaymentOptionsFragment.OptOutFundingOption> optOutFundingOptions12 = currencyConversionOverrides11.getOptOutFundingOptions();
                            if (optOutFundingOptions12 != null) {
                                for (com.paypal.oslo.feature.qrc.graphql.fragment.QrcPaymentOptionsFragment.OptOutFundingOption optOutFundingOption3 : optOutFundingOptions12) {
                                    java.lang.String id7 = optOutFundingOption3.getOptOutFundingOptionFragment().getId();
                                    com.paypal.oslo.feature.qrc.graphql.fragment.OptOutFundingOptionFragment.Contingency contingency6 = optOutFundingOption3.getOptOutFundingOptionFragment().getContingency();
                                    getHighSpeedVideoFpsRanges(createMapBuilder5, id7, contingency6 != null ? contingency6.getContingencyFragment() : null);
                                }
                            }
                        }
                    }
                }
                java.util.Map build9 = kotlin.collections.MapsKt.build(createMapBuilder5);
                java.util.LinkedHashMap linkedHashMap2 = new java.util.LinkedHashMap();
                for (java.util.Map.Entry entry : build9.entrySet()) {
                    if (((com.paypal.oslo.feature.qrc.domain.model.review.Contingency) entry.getValue()) != null) {
                        linkedHashMap2.put(entry.getKey(), entry.getValue());
                    }
                }
                linkedHashMap = linkedHashMap2;
                if (linkedHashMap.size() != 1) {
                    linkedHashMap = null;
                }
                com.paypal.oslo.feature.qrc.domain.model.review.Contingency contingency7 = (linkedHashMap != null || (values = linkedHashMap.values()) == null) ? null : (com.paypal.oslo.feature.qrc.domain.model.review.Contingency) kotlin.collections.CollectionsKt.first(values);
                com.paypal.oslo.feature.qrc.graphql.fragment.QrcPaymentOptionsFragment.Contingency contingency8 = qrcPaymentOptionsFragment.getContingency();
                boolean areEqual = kotlin.jvm.internal.Intrinsics.areEqual((contingency8 != null || (contingencyFragment = contingency8.getContingencyFragment()) == null || (type = contingencyFragment.getType()) == null) ? null : type.name(), "ERROR_FUNDING_SELECTION_INSTRUMENT_UNAVAILABLE");
                com.paypal.oslo.feature.qrc.graphql.fragment.QrcPaymentOptionsFragment.TotalAmount totalAmount = qrcPaymentOptionsFragment.getTotalAmount();
                com.paypal.oslo.feature.qrc.domain.model.session.QrcMoney qrcMoney = totalAmount == null ? new com.paypal.oslo.feature.qrc.domain.model.session.QrcMoney(totalAmount.getCurrencyCode(), totalAmount.getValue()) : null;
                com.paypal.oslo.feature.qrc.graphql.fragment.QrcPaymentOptionsFragment.PaymentAmount paymentAmount = qrcPaymentOptionsFragment.getPaymentAmount();
                com.paypal.oslo.feature.qrc.domain.model.session.QrcMoney qrcMoney2 = paymentAmount == null ? new com.paypal.oslo.feature.qrc.domain.model.session.QrcMoney(paymentAmount.getCurrencyCode(), paymentAmount.getValue()) : null;
                com.paypal.oslo.feature.qrc.graphql.fragment.QrcPaymentOptionsFragment.TipAmount tipAmount = qrcPaymentOptionsFragment.getTipAmount();
                return new com.paypal.oslo.feature.qrc.domain.model.review.PaymentOptions(list3, emptyList2, id3, arrayList5, build2, build3, build4, z, build5, build6, build7, build8, build9, contingency7, areEqual, qrcMoney, qrcMoney2, tipAmount == null ? new com.paypal.oslo.feature.qrc.domain.model.session.QrcMoney(tipAmount.getCurrencyCode(), tipAmount.getValue()) : null);
            }
        }
        z = false;
        fundingOptions = qrcPaymentOptionsFragment.getFundingOptions();
        java.util.Map createMapBuilder6 = kotlin.collections.MapsKt.createMapBuilder();
        if (fundingOptions != null) {
        }
        java.util.Map build52 = kotlin.collections.MapsKt.build(createMapBuilder6);
        fundingOptions2 = qrcPaymentOptionsFragment.getFundingOptions();
        java.util.Map createMapBuilder22 = kotlin.collections.MapsKt.createMapBuilder();
        if (fundingOptions2 != null) {
        }
        java.util.Map build62 = kotlin.collections.MapsKt.build(createMapBuilder22);
        fundingOptions3 = qrcPaymentOptionsFragment.getFundingOptions();
        java.util.Map createMapBuilder32 = kotlin.collections.MapsKt.createMapBuilder();
        if (fundingOptions3 != null) {
        }
        java.util.Map build72 = kotlin.collections.MapsKt.build(createMapBuilder32);
        fundingOptions4 = qrcPaymentOptionsFragment.getFundingOptions();
        java.util.Map createMapBuilder42 = kotlin.collections.MapsKt.createMapBuilder();
        if (fundingOptions4 != null) {
        }
        java.util.Map build82 = kotlin.collections.MapsKt.build(createMapBuilder42);
        fundingOptions5 = qrcPaymentOptionsFragment.getFundingOptions();
        java.util.Map createMapBuilder52 = kotlin.collections.MapsKt.createMapBuilder();
        if (fundingOptions5 != null) {
        }
        java.util.Map build92 = kotlin.collections.MapsKt.build(createMapBuilder52);
        java.util.LinkedHashMap linkedHashMap22 = new java.util.LinkedHashMap();
        while (r2.hasNext()) {
        }
        linkedHashMap = linkedHashMap22;
        if (linkedHashMap.size() != 1) {
        }
        if (linkedHashMap != null) {
        }
        com.paypal.oslo.feature.qrc.graphql.fragment.QrcPaymentOptionsFragment.Contingency contingency82 = qrcPaymentOptionsFragment.getContingency();
        boolean areEqual2 = kotlin.jvm.internal.Intrinsics.areEqual((contingency82 != null || (contingencyFragment = contingency82.getContingencyFragment()) == null || (type = contingencyFragment.getType()) == null) ? null : type.name(), "ERROR_FUNDING_SELECTION_INSTRUMENT_UNAVAILABLE");
        com.paypal.oslo.feature.qrc.graphql.fragment.QrcPaymentOptionsFragment.TotalAmount totalAmount2 = qrcPaymentOptionsFragment.getTotalAmount();
        if (totalAmount2 == null) {
        }
        com.paypal.oslo.feature.qrc.graphql.fragment.QrcPaymentOptionsFragment.PaymentAmount paymentAmount2 = qrcPaymentOptionsFragment.getPaymentAmount();
        if (paymentAmount2 == null) {
        }
        com.paypal.oslo.feature.qrc.graphql.fragment.QrcPaymentOptionsFragment.TipAmount tipAmount2 = qrcPaymentOptionsFragment.getTipAmount();
        return new com.paypal.oslo.feature.qrc.domain.model.review.PaymentOptions(list3, emptyList2, id3, arrayList5, build2, build3, build4, z, build52, build62, build72, build82, build92, contingency7, areEqual2, qrcMoney, qrcMoney2, tipAmount2 == null ? new com.paypal.oslo.feature.qrc.domain.model.session.QrcMoney(tipAmount2.getCurrencyCode(), tipAmount2.getValue()) : null);
    }

    private static final boolean getHighResolutionOutputSizeshNQ4ISI(com.paypal.oslo.feature.qrc.graphql.fragment.FundingSourceFragment fundingSourceFragment) {
        return fundingSourceFragment.getType() == com.paypal.oslo.feature.qrc.graphql.type.QRCodePaymentFundingSourceType.CARD || fundingSourceFragment.getType() == com.paypal.oslo.feature.qrc.graphql.type.QRCodePaymentFundingSourceType.BANK || fundingSourceFragment.getType() == com.paypal.oslo.feature.qrc.graphql.type.QRCodePaymentFundingSourceType.CREDIT;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0056  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final com.paypal.oslo.feature.qrc.domain.model.review.FundingSource Camera2StreamConfigurationMap(com.paypal.oslo.feature.qrc.graphql.fragment.FundingSourceFragment fundingSourceFragment) {
        com.paypal.oslo.feature.qrc.domain.model.review.InstrumentType instrumentType;
        java.lang.String str;
        java.lang.String primaryUrl;
        java.lang.String id = fundingSourceFragment.getId();
        com.paypal.oslo.feature.qrc.graphql.type.QRCodePaymentFundingSourceType type = fundingSourceFragment.getType();
        if (type == null || (instrumentType = Camera2StreamConfigurationMap(type)) == null) {
            instrumentType = com.paypal.oslo.feature.qrc.domain.model.review.InstrumentType.UNKNOWN;
        }
        com.paypal.oslo.feature.qrc.domain.model.review.InstrumentType instrumentType2 = instrumentType;
        java.lang.String formattedName = fundingSourceFragment.getFormattedName();
        java.lang.String typeLabel = fundingSourceFragment.getTypeLabel();
        if (fundingSourceFragment.getInstrument().getOnBalance() == null) {
            com.paypal.oslo.feature.qrc.graphql.fragment.FundingSourceFragment.InstrumentArt instrumentArt = fundingSourceFragment.getInstrumentArt();
            if (instrumentArt == null || (primaryUrl = instrumentArt.getThumbnailUrl()) == null) {
                com.paypal.oslo.feature.qrc.graphql.fragment.FundingSourceFragment.InstrumentArt instrumentArt2 = fundingSourceFragment.getInstrumentArt();
                if (instrumentArt2 != null) {
                    primaryUrl = instrumentArt2.getPrimaryUrl();
                }
            }
            str = primaryUrl;
            com.paypal.oslo.feature.qrc.graphql.fragment.FundingSourceFragment.Amount1 amount = fundingSourceFragment.getAmount();
            com.paypal.oslo.feature.qrc.domain.model.session.QrcMoney qrcMoney = amount == null ? new com.paypal.oslo.feature.qrc.domain.model.session.QrcMoney(amount.getCurrencyCode(), amount.getValue()) : null;
            com.paypal.oslo.feature.qrc.graphql.fragment.FundingSourceFragment.OnBalance onBalance = fundingSourceFragment.getInstrument().getOnBalance();
            return new com.paypal.oslo.feature.qrc.domain.model.review.FundingSource(id, instrumentType2, formattedName, typeLabel, str, qrcMoney, onBalance == null ? new com.paypal.oslo.feature.qrc.domain.model.review.Balance(fundingSourceFragment.getId(), onBalance.getAvailable().getAmount().getCurrencyCode(), onBalance.getAvailable().getAmount().getValue()) : null, false, 128, (kotlin.jvm.internal.DefaultConstructorMarker) null);
        }
        str = null;
        com.paypal.oslo.feature.qrc.graphql.fragment.FundingSourceFragment.Amount1 amount2 = fundingSourceFragment.getAmount();
        if (amount2 == null) {
        }
        com.paypal.oslo.feature.qrc.graphql.fragment.FundingSourceFragment.OnBalance onBalance2 = fundingSourceFragment.getInstrument().getOnBalance();
        return new com.paypal.oslo.feature.qrc.domain.model.review.FundingSource(id, instrumentType2, formattedName, typeLabel, str, qrcMoney, onBalance2 == null ? new com.paypal.oslo.feature.qrc.domain.model.review.Balance(fundingSourceFragment.getId(), onBalance2.getAvailable().getAmount().getCurrencyCode(), onBalance2.getAvailable().getAmount().getValue()) : null, false, 128, (kotlin.jvm.internal.DefaultConstructorMarker) null);
    }

    private static final com.paypal.oslo.feature.qrc.domain.model.review.DisallowedFundingSource getHighSpeedVideoSizes(com.paypal.oslo.feature.qrc.graphql.fragment.FundingSourceFragment fundingSourceFragment) {
        com.paypal.oslo.feature.qrc.domain.model.review.InstrumentType instrumentType;
        com.paypal.oslo.feature.qrc.graphql.type.QRCodePaymentFundingSourceType type = fundingSourceFragment.getType();
        if (type == null || (instrumentType = Camera2StreamConfigurationMap(type)) == null) {
            instrumentType = com.paypal.oslo.feature.qrc.domain.model.review.InstrumentType.UNKNOWN;
        }
        com.paypal.oslo.feature.qrc.graphql.fragment.FundingSourceFragment.OnBalance onBalance = fundingSourceFragment.getInstrument().getOnBalance();
        return new com.paypal.oslo.feature.qrc.domain.model.review.DisallowedFundingSource(instrumentType, onBalance != null ? new com.paypal.oslo.feature.qrc.domain.model.review.Balance(fundingSourceFragment.getId(), onBalance.getAvailable().getAmount().getCurrencyCode(), onBalance.getAvailable().getAmount().getValue()) : null);
    }

    private static final com.paypal.oslo.feature.qrc.domain.model.review.CurrencyConversion getHighSpeedVideoFpsRangesFor(com.paypal.oslo.feature.qrc.graphql.fragment.CurrencyConversionFragment currencyConversionFragment) {
        com.paypal.oslo.feature.qrc.graphql.fragment.CurrencyConversionFragment.OnMoney onMoney = currencyConversionFragment.getAmountFrom().getOnMoney();
        com.paypal.oslo.feature.qrc.domain.model.session.QrcMoney qrcMoney = onMoney != null ? new com.paypal.oslo.feature.qrc.domain.model.session.QrcMoney(onMoney.getCurrencyCode(), onMoney.getValue()) : null;
        com.paypal.oslo.feature.qrc.graphql.fragment.CurrencyConversionFragment.OnMoney1 onMoney2 = currencyConversionFragment.getAmountTo().getOnMoney();
        com.paypal.oslo.feature.qrc.domain.model.session.QrcMoney qrcMoney2 = onMoney2 != null ? new com.paypal.oslo.feature.qrc.domain.model.session.QrcMoney(onMoney2.getCurrencyCode(), onMoney2.getValue()) : null;
        com.paypal.oslo.feature.qrc.graphql.fragment.CurrencyConversionFragment.OnMoney2 onMoney3 = currencyConversionFragment.getExchangeRate().getFromCurrency().getOnMoney();
        com.paypal.oslo.feature.qrc.domain.model.session.QrcMoney qrcMoney3 = onMoney3 != null ? new com.paypal.oslo.feature.qrc.domain.model.session.QrcMoney(onMoney3.getCurrencyCode(), onMoney3.getValue()) : null;
        com.paypal.oslo.feature.qrc.graphql.fragment.CurrencyConversionFragment.OnMoney3 onMoney4 = currencyConversionFragment.getExchangeRate().getToCurrency().getOnMoney();
        return new com.paypal.oslo.feature.qrc.domain.model.review.CurrencyConversion(qrcMoney, qrcMoney2, qrcMoney3, onMoney4 != null ? new com.paypal.oslo.feature.qrc.domain.model.session.QrcMoney(onMoney4.getCurrencyCode(), onMoney4.getValue()) : null);
    }

    private static final com.paypal.oslo.feature.qrc.domain.model.review.Contingency getHighSpeedVideoFpsRangesFor(com.paypal.oslo.feature.qrc.graphql.fragment.ContingencyFragment contingencyFragment) {
        java.lang.Object m23436constructorimpl;
        try {
            kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
            m23436constructorimpl = kotlin.Result.m23436constructorimpl(com.paypal.oslo.feature.qrc.domain.model.review.FundingOptionContingency.valueOf(contingencyFragment.getType().name()));
        } catch (java.lang.Throwable th) {
            kotlin.Result.Companion companion2 = kotlin.Result.INSTANCE;
            m23436constructorimpl = kotlin.Result.m23436constructorimpl(kotlin.ResultKt.createFailure(th));
        }
        java.util.ArrayList arrayList = null;
        if (kotlin.Result.m23441isFailureimpl(m23436constructorimpl)) {
            m23436constructorimpl = null;
        }
        com.paypal.oslo.feature.qrc.domain.model.review.FundingOptionContingency fundingOptionContingency = (com.paypal.oslo.feature.qrc.domain.model.review.FundingOptionContingency) m23436constructorimpl;
        if (fundingOptionContingency == null) {
            return null;
        }
        java.util.List<com.paypal.oslo.feature.qrc.graphql.fragment.ContingencyFragment.Link> links = contingencyFragment.getLinks();
        if (links != null) {
            java.util.List<com.paypal.oslo.feature.qrc.graphql.fragment.ContingencyFragment.Link> list = links;
            java.util.ArrayList arrayList2 = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(list, 10));
            for (com.paypal.oslo.feature.qrc.graphql.fragment.ContingencyFragment.Link link : list) {
                arrayList2.add(new com.paypal.oslo.feature.qrc.domain.model.review.ContingencyLink(link.getUrl(), link.getOpenExternal()));
            }
            arrayList = arrayList2;
        }
        return new com.paypal.oslo.feature.qrc.domain.model.review.Contingency(fundingOptionContingency, arrayList);
    }

    private static final com.paypal.oslo.feature.qrc.domain.model.review.InstrumentType Camera2StreamConfigurationMap(com.paypal.oslo.feature.qrc.graphql.type.QRCodePaymentFundingSourceType qRCodePaymentFundingSourceType) {
        switch (com.paypal.oslo.feature.qrc.data.mapper.PaymentOptionsMapperKt.WhenMappings.$EnumSwitchMapping$1[qRCodePaymentFundingSourceType.ordinal()]) {
            case 1:
                return com.paypal.oslo.feature.qrc.domain.model.review.InstrumentType.BALANCE;
            case 2:
                return com.paypal.oslo.feature.qrc.domain.model.review.InstrumentType.BANK;
            case 3:
                return com.paypal.oslo.feature.qrc.domain.model.review.InstrumentType.CARD;
            case 4:
                return com.paypal.oslo.feature.qrc.domain.model.review.InstrumentType.CREDIT;
            case 5:
                return com.paypal.oslo.feature.qrc.domain.model.review.InstrumentType.INCENTIVE;
            case 6:
                return com.paypal.oslo.feature.qrc.domain.model.review.InstrumentType.EXTERNAL_IDENTIFIER;
            case 7:
                return com.paypal.oslo.feature.qrc.domain.model.review.InstrumentType.STORED_VALUE;
            case 8:
                return com.paypal.oslo.feature.qrc.domain.model.review.InstrumentType.UNKNOWN;
            default:
                throw new kotlin.NoWhenBranchMatchedException();
        }
    }

    private static final void getHighSpeedVideoFpsRanges(java.util.Map<java.lang.String, com.paypal.oslo.feature.qrc.domain.model.review.Contingency> map, java.lang.String str, com.paypal.oslo.feature.qrc.graphql.fragment.ContingencyFragment contingencyFragment) {
        if (contingencyFragment == null || !kotlin.jvm.internal.Intrinsics.areEqual(contingencyFragment.getType().name(), "THREE_DS_V2_AUTHENTICATION")) {
            return;
        }
        map.put(str, getHighSpeedVideoFpsRangesFor(contingencyFragment));
    }

    @kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[com.paypal.oslo.feature.qrc.graphql.type.QRCodeFundingOptionStatus.values().length];
            try {
                iArr[com.paypal.oslo.feature.qrc.graphql.type.QRCodeFundingOptionStatus.READY.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[com.paypal.oslo.feature.qrc.graphql.type.QRCodeFundingOptionStatus.ELIGIBLE.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                iArr[com.paypal.oslo.feature.qrc.graphql.type.QRCodeFundingOptionStatus.CONTINGENCY.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            try {
                iArr[com.paypal.oslo.feature.qrc.graphql.type.QRCodeFundingOptionStatus.UNKNOWN__.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[com.paypal.oslo.feature.qrc.graphql.type.QRCodePaymentFundingSourceType.values().length];
            try {
                iArr2[com.paypal.oslo.feature.qrc.graphql.type.QRCodePaymentFundingSourceType.BALANCE.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused5) {
            }
            try {
                iArr2[com.paypal.oslo.feature.qrc.graphql.type.QRCodePaymentFundingSourceType.BANK.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused6) {
            }
            try {
                iArr2[com.paypal.oslo.feature.qrc.graphql.type.QRCodePaymentFundingSourceType.CARD.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused7) {
            }
            try {
                iArr2[com.paypal.oslo.feature.qrc.graphql.type.QRCodePaymentFundingSourceType.CREDIT.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused8) {
            }
            try {
                iArr2[com.paypal.oslo.feature.qrc.graphql.type.QRCodePaymentFundingSourceType.INCENTIVE.ordinal()] = 5;
            } catch (java.lang.NoSuchFieldError unused9) {
            }
            try {
                iArr2[com.paypal.oslo.feature.qrc.graphql.type.QRCodePaymentFundingSourceType.EXTERNAL_IDENTIFIER.ordinal()] = 6;
            } catch (java.lang.NoSuchFieldError unused10) {
            }
            try {
                iArr2[com.paypal.oslo.feature.qrc.graphql.type.QRCodePaymentFundingSourceType.STORED_VALUE.ordinal()] = 7;
            } catch (java.lang.NoSuchFieldError unused11) {
            }
            try {
                iArr2[com.paypal.oslo.feature.qrc.graphql.type.QRCodePaymentFundingSourceType.UNKNOWN__.ordinal()] = 8;
            } catch (java.lang.NoSuchFieldError unused12) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }
}
