package com.paypal.oslo.feature.qrc.ui.review.mapper;

@kotlin.Metadata(d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001:\u00013B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ=\u0010\u0010\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b2\b\b\u0002\u0010\u000e\u001a\u00020\r2\b\b\u0002\u0010\u000f\u001a\u00020\r¢\u0006\u0004\b\u0010\u0010\u0011JO\u0010\u001a\u001a\u0004\u0018\u00010\u00192\b\u0010\u0012\u001a\u0004\u0018\u00010\u000b2\b\u0010\u0013\u001a\u0004\u0018\u00010\u000b2\b\b\u0002\u0010\u0014\u001a\u00020\u000b2\u0006\u0010\u0015\u001a\u00020\r2\u0006\u0010\u0016\u001a\u00020\r2\u0006\u0010\u0017\u001a\u00020\r2\u0006\u0010\u0018\u001a\u00020\rH\u0000¢\u0006\u0004\b\u001a\u0010\u001bJ%\u0010\u001e\u001a\u0004\u0018\u00010\u000b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u000b2\b\u0010\u001d\u001a\u0004\u0018\u00010\u000bH\u0002¢\u0006\u0004\b\u001e\u0010\u001fJ\u0013\u0010\"\u001a\u00020!*\u00020 H\u0002¢\u0006\u0004\b\"\u0010#J#\u0010'\u001a\u0004\u0018\u00010&2\b\u0010%\u001a\u0004\u0018\u00010$2\u0006\u0010\u000e\u001a\u00020\rH\u0000¢\u0006\u0004\b'\u0010(J'\u0010.\u001a\u00020&2\u0006\u0010*\u001a\u00020)2\u0006\u0010,\u001a\u00020+2\u0006\u0010-\u001a\u00020\rH\u0000¢\u0006\u0004\b.\u0010/J\u0013\u00101\u001a\u00020+*\u000200H\u0000¢\u0006\u0004\b1\u00102"}, d2 = {"Lcom/paypal/oslo/feature/qrc/ui/review/mapper/PaymentReviewUiModelMapper;", "", "<init>", "()V", "Lcom/paypal/oslo/feature/qrc/domain/model/session/QrcSessionNavArgs;", "navArgs", "Lcom/paypal/oslo/feature/qrc/domain/model/review/PaymentOptions;", "paymentOptions", "Lcom/paypal/oslo/feature/qrc/ui/review/PaymentReviewUiModel;", "mapPaymentOptionsToUiModel", "(Lcom/paypal/oslo/feature/qrc/domain/model/session/QrcSessionNavArgs;Lcom/paypal/oslo/feature/qrc/domain/model/review/PaymentOptions;)Lcom/paypal/oslo/feature/qrc/ui/review/PaymentReviewUiModel;", "", "selectedPlanId", "", "isBalanceOptedOut", "isCurrencyOverrideSelected", "mapPaymentOptionsToUiModelWithPlan", "(Lcom/paypal/oslo/feature/qrc/domain/model/session/QrcSessionNavArgs;Lcom/paypal/oslo/feature/qrc/domain/model/review/PaymentOptions;Ljava/lang/String;ZZ)Lcom/paypal/oslo/feature/qrc/ui/review/PaymentReviewUiModel;", "amount", "currencyCode", "chargeableAmount", "isEffectiveOptedOut", "isSelected", "isInsufficient", "isZeroBalance", "Lcom/paypal/oslo/feature/qrc/ui/review/BalanceUiData;", "getBalanceUiData$qrc_prodRelease", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZZZ)Lcom/paypal/oslo/feature/qrc/ui/review/BalanceUiData;", "p0", "p1", "getHighSpeedVideoSizes", "(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;", "Lcom/paypal/oslo/feature/qrc/domain/model/review/FundingSource;", "Lcom/paypal/oslo/feature/qrc/ui/review/FiUiItem;", "Camera2StreamConfigurationMap", "(Lcom/paypal/oslo/feature/qrc/domain/model/review/FundingSource;)Lcom/paypal/oslo/feature/qrc/ui/review/FiUiItem;", "Lcom/paypal/oslo/feature/qrc/domain/model/review/FundingPlan;", "plan", "Lcom/paypal/oslo/feature/qrc/ui/review/CurrencyConversionUiData;", "buildCurrencyConversionUiData$qrc_prodRelease", "(Lcom/paypal/oslo/feature/qrc/domain/model/review/FundingPlan;Z)Lcom/paypal/oslo/feature/qrc/ui/review/CurrencyConversionUiData;", "Lcom/paypal/oslo/feature/qrc/domain/model/review/CurrencyConversion;", "conversion", "Lcom/paypal/oslo/feature/qrc/ui/review/model/ConversionOptionTab;", "selectedTab", "isPPBalanceDisabled", "buildCurrencyConversionUiDataFromConversion$qrc_prodRelease", "(Lcom/paypal/oslo/feature/qrc/domain/model/review/CurrencyConversion;Lcom/paypal/oslo/feature/qrc/ui/review/model/ConversionOptionTab;Z)Lcom/paypal/oslo/feature/qrc/ui/review/CurrencyConversionUiData;", "Lcom/paypal/oslo/feature/qrc/domain/model/review/CurrencyConverter;", "toConversionOptionTab$qrc_prodRelease", "(Lcom/paypal/oslo/feature/qrc/domain/model/review/CurrencyConverter;)Lcom/paypal/oslo/feature/qrc/ui/review/model/ConversionOptionTab;", "BalanceFlags"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class PaymentReviewUiModelMapper {
    public static final int $stable = 0;

    @javax.inject.Inject
    public PaymentReviewUiModelMapper() {
    }

    public final com.paypal.oslo.feature.qrc.ui.review.PaymentReviewUiModel mapPaymentOptionsToUiModel(com.paypal.oslo.feature.qrc.domain.model.session.QrcSessionNavArgs navArgs, com.paypal.oslo.feature.qrc.domain.model.review.PaymentOptions paymentOptions) {
        java.lang.Object obj;
        java.lang.Object obj2;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navArgs, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(paymentOptions, "");
        java.util.List<com.paypal.oslo.feature.qrc.domain.model.review.FundingPlan> fundingOptions = paymentOptions.getFundingOptions();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (java.lang.Object obj3 : fundingOptions) {
            if (((com.paypal.oslo.feature.qrc.domain.model.review.FundingPlan) obj3).getStatus() == com.paypal.oslo.feature.qrc.domain.model.review.FundingOptionStatus.ELIGIBLE) {
                arrayList.add(obj3);
            }
        }
        java.util.ArrayList arrayList2 = arrayList;
        java.util.Iterator it = arrayList2.iterator();
        while (true) {
            obj = null;
            if (!it.hasNext()) {
                obj2 = null;
                break;
            }
            obj2 = it.next();
            if (kotlin.jvm.internal.Intrinsics.areEqual(((com.paypal.oslo.feature.qrc.domain.model.review.FundingPlan) obj2).getId(), paymentOptions.getPreferredFundingOptionId())) {
                break;
            }
        }
        com.paypal.oslo.feature.qrc.domain.model.review.FundingPlan fundingPlan = (com.paypal.oslo.feature.qrc.domain.model.review.FundingPlan) obj2;
        if (fundingPlan == null) {
            java.util.Iterator it2 = arrayList2.iterator();
            if (it2.hasNext()) {
                obj = it2.next();
                if (it2.hasNext()) {
                    int rank = ((com.paypal.oslo.feature.qrc.domain.model.review.FundingPlan) obj).getRank();
                    do {
                        java.lang.Object next = it2.next();
                        int rank2 = ((com.paypal.oslo.feature.qrc.domain.model.review.FundingPlan) next).getRank();
                        if (rank > rank2) {
                            obj = next;
                            rank = rank2;
                        }
                    } while (it2.hasNext());
                }
            }
            fundingPlan = (com.paypal.oslo.feature.qrc.domain.model.review.FundingPlan) obj;
        }
        return mapPaymentOptionsToUiModelWithPlan$default(this, navArgs, paymentOptions, null, fundingPlan != null ? fundingPlan.isPPBalanceOptOutDefaultPlan() : false, false, 16, null);
    }

    public static /* synthetic */ com.paypal.oslo.feature.qrc.ui.review.PaymentReviewUiModel mapPaymentOptionsToUiModelWithPlan$default(com.paypal.oslo.feature.qrc.ui.review.mapper.PaymentReviewUiModelMapper paymentReviewUiModelMapper, com.paypal.oslo.feature.qrc.domain.model.session.QrcSessionNavArgs qrcSessionNavArgs, com.paypal.oslo.feature.qrc.domain.model.review.PaymentOptions paymentOptions, java.lang.String str, boolean z, boolean z2, int i, java.lang.Object obj) {
        if ((i & 4) != 0) {
            str = null;
        }
        return paymentReviewUiModelMapper.mapPaymentOptionsToUiModelWithPlan(qrcSessionNavArgs, paymentOptions, str, (i & 8) != 0 ? false : z, (i & 16) != 0 ? false : z2);
    }

    /* JADX WARN: Code restructure failed: missing block: B:264:0x05ad, code lost:
    
        if (r1 == null) goto L358;
     */
    /* JADX WARN: Code restructure failed: missing block: B:340:0x0742, code lost:
    
        if (r5 == null) goto L490;
     */
    /* JADX WARN: Code restructure failed: missing block: B:341:0x0767, code lost:
    
        r27 = r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:353:0x0764, code lost:
    
        r27 = "$0.00";
     */
    /* JADX WARN: Code restructure failed: missing block: B:372:0x0762, code lost:
    
        if (r5 == null) goto L490;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:162:0x02ed A[LOOP:6: B:160:0x02e7->B:162:0x02ed, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:166:0x0308  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x0314  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x0322  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x033a  */
    /* JADX WARN: Removed duplicated region for block: B:233:0x04f4  */
    /* JADX WARN: Removed duplicated region for block: B:238:0x050f  */
    /* JADX WARN: Removed duplicated region for block: B:240:0x051c  */
    /* JADX WARN: Removed duplicated region for block: B:242:0x0524  */
    /* JADX WARN: Removed duplicated region for block: B:263:0x05ac  */
    /* JADX WARN: Removed duplicated region for block: B:267:0x05cb  */
    /* JADX WARN: Removed duplicated region for block: B:270:0x05d7  */
    /* JADX WARN: Removed duplicated region for block: B:273:0x05e3  */
    /* JADX WARN: Removed duplicated region for block: B:276:0x05ec  */
    /* JADX WARN: Removed duplicated region for block: B:278:0x05f4  */
    /* JADX WARN: Removed duplicated region for block: B:281:0x05fb  */
    /* JADX WARN: Removed duplicated region for block: B:283:0x0604  */
    /* JADX WARN: Removed duplicated region for block: B:285:0x0607  */
    /* JADX WARN: Removed duplicated region for block: B:287:0x0612  */
    /* JADX WARN: Removed duplicated region for block: B:296:0x063b  */
    /* JADX WARN: Removed duplicated region for block: B:299:0x0647  */
    /* JADX WARN: Removed duplicated region for block: B:302:0x0653  */
    /* JADX WARN: Removed duplicated region for block: B:304:0x065a  */
    /* JADX WARN: Removed duplicated region for block: B:309:0x0680  */
    /* JADX WARN: Removed duplicated region for block: B:315:0x06b5  */
    /* JADX WARN: Removed duplicated region for block: B:318:0x06c0  */
    /* JADX WARN: Removed duplicated region for block: B:344:0x076f  */
    /* JADX WARN: Removed duplicated region for block: B:365:0x0745  */
    /* JADX WARN: Removed duplicated region for block: B:375:0x06b8  */
    /* JADX WARN: Removed duplicated region for block: B:378:0x0698  */
    /* JADX WARN: Removed duplicated region for block: B:383:0x06a9  */
    /* JADX WARN: Removed duplicated region for block: B:384:0x06ae  */
    /* JADX WARN: Removed duplicated region for block: B:387:0x0672  */
    /* JADX WARN: Removed duplicated region for block: B:391:0x0656  */
    /* JADX WARN: Removed duplicated region for block: B:392:0x064c  */
    /* JADX WARN: Removed duplicated region for block: B:393:0x0640  */
    /* JADX WARN: Removed duplicated region for block: B:396:0x060e  */
    /* JADX WARN: Removed duplicated region for block: B:397:0x0600  */
    /* JADX WARN: Removed duplicated region for block: B:398:0x05f1  */
    /* JADX WARN: Removed duplicated region for block: B:399:0x05e5  */
    /* JADX WARN: Removed duplicated region for block: B:400:0x05dc  */
    /* JADX WARN: Removed duplicated region for block: B:401:0x05d0  */
    /* JADX WARN: Removed duplicated region for block: B:404:0x05ba  */
    /* JADX WARN: Removed duplicated region for block: B:406:0x05bf  */
    /* JADX WARN: Removed duplicated region for block: B:409:0x058a  */
    /* JADX WARN: Removed duplicated region for block: B:411:0x0592  */
    /* JADX WARN: Removed duplicated region for block: B:412:0x058f  */
    /* JADX WARN: Removed duplicated region for block: B:419:0x0546  */
    /* JADX WARN: Removed duplicated region for block: B:425:0x0526  */
    /* JADX WARN: Removed duplicated region for block: B:426:0x0521  */
    /* JADX WARN: Removed duplicated region for block: B:428:0x050a A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:466:0x04e2  */
    /* JADX WARN: Removed duplicated region for block: B:467:0x0319  */
    /* JADX WARN: Removed duplicated region for block: B:468:0x030d  */
    /* JADX WARN: Type inference failed for: r1v81, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v82 */
    /* JADX WARN: Type inference failed for: r1v83 */
    /* JADX WARN: Type inference failed for: r1v84 */
    /* JADX WARN: Type inference failed for: r1v85 */
    /* JADX WARN: Type inference failed for: r1v86 */
    /* JADX WARN: Type inference failed for: r1v87 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final com.paypal.oslo.feature.qrc.ui.review.PaymentReviewUiModel mapPaymentOptionsToUiModelWithPlan(com.paypal.oslo.feature.qrc.domain.model.session.QrcSessionNavArgs navArgs, com.paypal.oslo.feature.qrc.domain.model.review.PaymentOptions paymentOptions, java.lang.String selectedPlanId, boolean isBalanceOptedOut, boolean isCurrencyOverrideSelected) {
        java.lang.Object obj;
        com.paypal.oslo.feature.qrc.domain.model.review.FundingSource payPalBalanceFundingSource;
        com.paypal.oslo.feature.qrc.domain.model.review.FundingSource fundingSource;
        java.util.List<com.paypal.oslo.feature.qrc.domain.model.review.FundingSource> eligibleFiList;
        java.lang.String value;
        com.paypal.oslo.feature.qrc.domain.model.review.Balance balance;
        java.lang.String value2;
        com.paypal.oslo.feature.qrc.domain.model.review.Balance balance2;
        java.lang.String currencyCode;
        com.paypal.oslo.feature.qrc.domain.model.review.Balance balance3;
        com.paypal.oslo.feature.qrc.ui.review.FiUiItem fiUiItem;
        java.util.Iterator it;
        java.lang.String highSpeedVideoSizes;
        com.paypal.oslo.feature.qrc.domain.model.session.TipConfig tipConfiguration;
        com.paypal.oslo.feature.qrc.ui.review.model.TipConfigData tipConfigData;
        java.util.Iterator it2;
        java.lang.Object obj2;
        com.paypal.oslo.feature.qrc.domain.model.review.FundingPlan fundingPlan;
        java.util.List<com.paypal.oslo.feature.qrc.domain.model.review.DisallowedFundingPlan> disallowedOptions;
        java.util.Iterator it3;
        boolean z;
        boolean z2;
        com.paypal.oslo.feature.qrc.domain.model.session.Merchant merchant;
        java.lang.String name2;
        com.paypal.oslo.feature.qrc.domain.model.session.Merchant merchant2;
        java.lang.String extractInitials;
        java.lang.String currencyCode2;
        java.lang.String value3;
        boolean z3;
        java.lang.String value4;
        com.paypal.oslo.feature.qrc.domain.model.session.QrcMoney feeAmount;
        com.paypal.oslo.feature.qrc.domain.model.review.DisallowedFundingPlan disallowedFundingPlan;
        java.lang.String currencyCode3;
        com.paypal.oslo.feature.qrc.domain.model.session.QrcMoney feeAmount2;
        boolean z4;
        java.lang.String highSpeedVideoSizes2;
        java.lang.String str;
        com.paypal.oslo.feature.qrc.ui.review.mapper.PaymentReviewUiModelMapper paymentReviewUiModelMapper;
        boolean z5;
        java.util.List<com.paypal.oslo.feature.qrc.domain.model.review.CurrencyConverter> currencyConverterOptions;
        java.lang.String value5;
        com.paypal.oslo.feature.qrc.domain.model.session.QrcMoney feeAmount3;
        java.lang.String currencyCode4;
        java.lang.String currencyCode5;
        java.lang.Double doubleOrNull;
        com.paypal.oslo.feature.qrc.domain.model.session.QrcMoney feeAmount4;
        java.lang.String value6;
        java.lang.Double doubleOrNull2;
        com.paypal.oslo.feature.qrc.domain.model.session.QrcMoney feeAmount5;
        com.paypal.oslo.feature.qrc.domain.model.session.QrcMoney feeAmount6;
        java.util.ArrayList arrayList;
        java.lang.String value7;
        java.lang.Double doubleOrNull3;
        double doubleValue;
        double d;
        java.lang.Double doubleOrNull4;
        java.lang.String value8;
        java.lang.Double doubleOrNull5;
        java.lang.Object obj3;
        com.paypal.oslo.feature.qrc.domain.model.session.QrcMoney amount;
        com.paypal.oslo.feature.qrc.domain.model.session.QrcMoney amount2;
        com.paypal.oslo.feature.qrc.domain.model.review.Balance balance4;
        com.paypal.oslo.feature.qrc.domain.model.review.Balance balance5;
        java.lang.Double doubleOrNull6;
        com.paypal.oslo.feature.qrc.domain.model.review.Balance balance6;
        com.paypal.oslo.feature.qrc.domain.model.review.DisallowedFundingPlan disallowedFundingPlan2;
        com.paypal.oslo.feature.qrc.domain.model.review.FundingPlan next;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navArgs, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(paymentOptions, "");
        java.util.List<com.paypal.oslo.feature.qrc.domain.model.review.FundingPlan> fundingOptions = paymentOptions.getFundingOptions();
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        for (java.lang.Object obj4 : fundingOptions) {
            if (((com.paypal.oslo.feature.qrc.domain.model.review.FundingPlan) obj4).getStatus() == com.paypal.oslo.feature.qrc.domain.model.review.FundingOptionStatus.ELIGIBLE) {
                arrayList2.add(obj4);
            }
        }
        java.util.ArrayList arrayList3 = arrayList2;
        java.util.Iterator it4 = arrayList3.iterator();
        while (true) {
            if (!it4.hasNext()) {
                obj = null;
                break;
            }
            obj = it4.next();
            if (kotlin.jvm.internal.Intrinsics.areEqual(((com.paypal.oslo.feature.qrc.domain.model.review.FundingPlan) obj).getId(), selectedPlanId == null ? paymentOptions.getPreferredFundingOptionId() : selectedPlanId)) {
                break;
            }
        }
        com.paypal.oslo.feature.qrc.domain.model.review.FundingPlan fundingPlan2 = (com.paypal.oslo.feature.qrc.domain.model.review.FundingPlan) obj;
        if (fundingPlan2 == null) {
            java.util.Iterator it5 = arrayList3.iterator();
            if (it5.hasNext()) {
                next = it5.next();
                if (it5.hasNext()) {
                    int rank = ((com.paypal.oslo.feature.qrc.domain.model.review.FundingPlan) next).getRank();
                    do {
                        java.lang.Object next2 = it5.next();
                        int rank2 = ((com.paypal.oslo.feature.qrc.domain.model.review.FundingPlan) next2).getRank();
                        next = next;
                        if (rank > rank2) {
                            next = next2;
                            rank = rank2;
                        }
                    } while (it5.hasNext());
                }
            } else {
                next = 0;
            }
            fundingPlan2 = next;
        }
        com.paypal.oslo.feature.qrc.domain.model.review.FundingPlan fundingPlan3 = fundingPlan2;
        com.paypal.oslo.feature.qrc.domain.model.review.FundingSource payPalBalanceFundingSource2 = fundingPlan3 != null ? fundingPlan3.getPayPalBalanceFundingSource() : null;
        com.paypal.oslo.feature.qrc.domain.model.review.DisallowedFundingSource payPalBalanceFundingSource3 = (payPalBalanceFundingSource2 != null || (disallowedFundingPlan2 = (com.paypal.oslo.feature.qrc.domain.model.review.DisallowedFundingPlan) kotlin.collections.CollectionsKt.firstOrNull((java.util.List) paymentOptions.getDisallowedOptions())) == null) ? null : disallowedFundingPlan2.getPayPalBalanceFundingSource();
        if (isBalanceOptedOut) {
            if (fundingPlan3 != null) {
                payPalBalanceFundingSource = fundingPlan3.getChargeableFundingSourceInOptOut();
                fundingSource = payPalBalanceFundingSource;
            }
            fundingSource = null;
        } else {
            if (fundingPlan3 == null || (payPalBalanceFundingSource = fundingPlan3.getFundingInstruments()) == null) {
                if (fundingPlan3 != null) {
                    payPalBalanceFundingSource = fundingPlan3.getPayPalBalanceFundingSource();
                }
                fundingSource = null;
            }
            fundingSource = payPalBalanceFundingSource;
        }
        if (isCurrencyOverrideSelected && isBalanceOptedOut) {
            eligibleFiList = paymentOptions.getCurrencyOverrideEligibleFiListInOptOutCase();
        } else if (isCurrencyOverrideSelected) {
            eligibleFiList = paymentOptions.getCurrencyOverrideEligibleFiList();
        } else if (isBalanceOptedOut) {
            eligibleFiList = paymentOptions.getEligibleFiListInOptOutCase();
        } else {
            eligibleFiList = paymentOptions.getEligibleFiList();
        }
        java.util.ArrayList arrayList4 = new java.util.ArrayList();
        for (java.lang.Object obj5 : eligibleFiList) {
            if (((com.paypal.oslo.feature.qrc.domain.model.review.FundingSource) obj5).getType() != com.paypal.oslo.feature.qrc.domain.model.review.InstrumentType.BALANCE) {
                arrayList4.add(obj5);
            }
        }
        java.util.ArrayList arrayList5 = arrayList4;
        boolean z6 = paymentOptions.getPreferredFundingOptionId() == null && selectedPlanId == null;
        java.lang.String id = (z6 || fundingSource == null) ? null : fundingSource.getId();
        java.util.ArrayList<com.paypal.oslo.feature.qrc.domain.model.review.FundingSource> arrayList6 = arrayList5;
        java.util.ArrayList arrayList7 = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(arrayList6, 10));
        for (com.paypal.oslo.feature.qrc.domain.model.review.FundingSource fundingSource2 : arrayList6) {
            arrayList7.add(kotlin.jvm.internal.Intrinsics.areEqual(fundingSource2.getId(), id) ? fundingSource2.copy((r18 & 1) != 0 ? fundingSource2.id : null, (r18 & 2) != 0 ? fundingSource2.type : null, (r18 & 4) != 0 ? fundingSource2.formattedName : null, (r18 & 8) != 0 ? fundingSource2.typeLabel : null, (r18 & 16) != 0 ? fundingSource2.imageUrl : null, (r18 & 32) != 0 ? fundingSource2.amount : null, (r18 & 64) != 0 ? fundingSource2.balance : null, (r18 & 128) != 0 ? fundingSource2.isSelected : true) : fundingSource2.copy((r18 & 1) != 0 ? fundingSource2.id : null, (r18 & 2) != 0 ? fundingSource2.type : null, (r18 & 4) != 0 ? fundingSource2.formattedName : null, (r18 & 8) != 0 ? fundingSource2.typeLabel : null, (r18 & 16) != 0 ? fundingSource2.imageUrl : null, (r18 & 32) != 0 ? fundingSource2.amount : null, (r18 & 64) != 0 ? fundingSource2.balance : null, (r18 & 128) != 0 ? fundingSource2.isSelected : false));
        }
        java.util.ArrayList arrayList8 = arrayList7;
        boolean z7 = ((payPalBalanceFundingSource2 == null && payPalBalanceFundingSource3 == null) || isBalanceOptedOut) ? false : true;
        if (payPalBalanceFundingSource2 == null || (balance6 = payPalBalanceFundingSource2.getBalance()) == null || (value = balance6.getValue()) == null) {
            value = (payPalBalanceFundingSource3 == null || (balance = payPalBalanceFundingSource3.getBalance()) == null) ? null : balance.getValue();
        }
        double d2 = 0.0d;
        com.paypal.oslo.feature.qrc.ui.review.mapper.PaymentReviewUiModelMapper.BalanceFlags balanceFlags = new com.paypal.oslo.feature.qrc.ui.review.mapper.PaymentReviewUiModelMapper.BalanceFlags(z7, z7 && payPalBalanceFundingSource3 != null, ((value == null || (doubleOrNull6 = kotlin.text.StringsKt.toDoubleOrNull(value)) == null) ? 0.0d : doubleOrNull6.doubleValue()) <= 0.0d);
        boolean isEmpty = arrayList5.isEmpty();
        boolean z8 = z6 && !arrayList8.isEmpty();
        boolean z9 = balanceFlags.getHighSpeedVideoSizes || (balanceFlags.Camera2StreamConfigurationMap && isEmpty);
        boolean z10 = balanceFlags.getHighSpeedVideoFpsRanges && (balanceFlags.getHighSpeedVideoSizes || (balanceFlags.Camera2StreamConfigurationMap && isEmpty));
        if (payPalBalanceFundingSource2 == null || (balance5 = payPalBalanceFundingSource2.getBalance()) == null || (value2 = balance5.getValue()) == null) {
            value2 = (payPalBalanceFundingSource3 == null || (balance2 = payPalBalanceFundingSource3.getBalance()) == null) ? null : balance2.getValue();
        }
        if (payPalBalanceFundingSource2 == null || (balance4 = payPalBalanceFundingSource2.getBalance()) == null || (currencyCode = balance4.getCurrencyCode()) == null) {
            currencyCode = (payPalBalanceFundingSource3 == null || (balance3 = payPalBalanceFundingSource3.getBalance()) == null) ? null : balance3.getCurrencyCode();
        }
        java.lang.String highSpeedVideoSizes3 = getHighSpeedVideoSizes((payPalBalanceFundingSource2 == null || (amount2 = payPalBalanceFundingSource2.getAmount()) == null) ? null : amount2.getValue(), (payPalBalanceFundingSource2 == null || (amount = payPalBalanceFundingSource2.getAmount()) == null) ? null : amount.getCurrencyCode());
        java.lang.String str2 = highSpeedVideoSizes3 == null ? "" : highSpeedVideoSizes3;
        java.lang.String highSpeedVideoSizes4 = getHighSpeedVideoSizes(value2, currencyCode);
        boolean z11 = z8;
        com.paypal.oslo.feature.qrc.ui.review.BalanceUiData balanceUiData$qrc_prodRelease = getBalanceUiData$qrc_prodRelease(highSpeedVideoSizes4 == null ? value2 == null ? "" : value2 : highSpeedVideoSizes4, currencyCode, str2, isBalanceOptedOut, (isBalanceOptedOut || balanceFlags.Camera2StreamConfigurationMap) ? false : true, balanceFlags.Camera2StreamConfigurationMap, z9);
        if (!z6) {
            java.util.Iterator it6 = arrayList8.iterator();
            while (true) {
                if (!it6.hasNext()) {
                    obj3 = null;
                    break;
                }
                obj3 = it6.next();
                if (((com.paypal.oslo.feature.qrc.domain.model.review.FundingSource) obj3).isSelected()) {
                    break;
                }
            }
            com.paypal.oslo.feature.qrc.domain.model.review.FundingSource fundingSource3 = (com.paypal.oslo.feature.qrc.domain.model.review.FundingSource) obj3;
            if (fundingSource3 != null) {
                fiUiItem = Camera2StreamConfigurationMap(fundingSource3);
            } else if (fundingSource != null) {
                fiUiItem = Camera2StreamConfigurationMap(fundingSource);
            }
            java.util.ArrayList arrayList9 = arrayList8;
            java.util.ArrayList arrayList10 = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(arrayList9, 10));
            it = arrayList9.iterator();
            while (it.hasNext()) {
                arrayList10.add(Camera2StreamConfigurationMap((com.paypal.oslo.feature.qrc.domain.model.review.FundingSource) it.next()));
            }
            com.paypal.oslo.feature.qrc.ui.review.FiAccordionUiData fiAccordionUiData = new com.paypal.oslo.feature.qrc.ui.review.FiAccordionUiData(fiUiItem, arrayList10, z11);
            com.paypal.oslo.feature.qrc.domain.model.session.QrcMoney totalAmount = paymentOptions.getTotalAmount();
            java.lang.String value9 = totalAmount == null ? totalAmount.getValue() : null;
            com.paypal.oslo.feature.qrc.domain.model.session.QrcMoney totalAmount2 = paymentOptions.getTotalAmount();
            highSpeedVideoSizes = getHighSpeedVideoSizes(value9, totalAmount2 == null ? totalAmount2.getCurrencyCode() : null);
            if (highSpeedVideoSizes == null) {
                highSpeedVideoSizes = "$0.00";
            }
            com.paypal.oslo.feature.qrc.ui.review.PaymentOptionsUiModel paymentOptionsUiModel = new com.paypal.oslo.feature.qrc.ui.review.PaymentOptionsUiModel(fiAccordionUiData, highSpeedVideoSizes, z11, balanceUiData$qrc_prodRelease);
            boolean isTipEligible = navArgs.getTipDetails().isTipEligible();
            tipConfiguration = navArgs.getTipDetails().getTipConfiguration();
            if (tipConfiguration == null) {
                com.paypal.oslo.feature.qrc.domain.model.session.QrcMoney totalAmount3 = paymentOptions.getTotalAmount();
                double doubleValue2 = (totalAmount3 == null || (value8 = totalAmount3.getValue()) == null || (doubleOrNull5 = kotlin.text.StringsKt.toDoubleOrNull(value8)) == null) ? 0.0d : doubleOrNull5.doubleValue();
                com.paypal.oslo.feature.qrc.domain.model.session.QrcMoney totalAmount4 = paymentOptions.getTotalAmount();
                java.lang.String currencyCode6 = totalAmount4 != null ? totalAmount4.getCurrencyCode() : null;
                if (currencyCode6 == null) {
                    currencyCode6 = "";
                }
                boolean z12 = tipConfiguration.getThresholdType() == com.paypal.oslo.feature.qrc.domain.model.session.TipConfigThresholdType.PERCENTAGE;
                java.lang.Boolean allowCustom = tipConfiguration.getAllowCustom();
                boolean booleanValue = allowCustom != null ? allowCustom.booleanValue() : false;
                java.lang.String valueOf = java.lang.String.valueOf(doubleValue2);
                if (z12) {
                    java.util.List<java.lang.String> thresholdValuesPercentage = tipConfiguration.getThresholdValuesPercentage();
                    if (thresholdValuesPercentage == null) {
                        com.paypal.oslo.feature.qrc.domain.model.session.DefaultTipConfigs defaultConfigs = tipConfiguration.getDefaultConfigs();
                        thresholdValuesPercentage = defaultConfigs != null ? defaultConfigs.getPercentageThresholdValues() : null;
                        if (thresholdValuesPercentage == null) {
                            thresholdValuesPercentage = kotlin.collections.CollectionsKt.emptyList();
                        }
                    }
                    java.util.List<java.lang.String> list = thresholdValuesPercentage;
                    java.util.ArrayList arrayList11 = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(list, 10));
                    int i = 0;
                    for (java.lang.Object obj6 : list) {
                        if (i < 0) {
                            kotlin.collections.CollectionsKt.throwIndexOverflow();
                        }
                        java.lang.Double doubleOrNull7 = kotlin.text.StringsKt.toDoubleOrNull((java.lang.String) obj6);
                        double doubleValue3 = doubleOrNull7 != null ? doubleOrNull7.doubleValue() : 0.0d;
                        kotlin.Pair<java.lang.String, java.lang.String> formatPresetTipDisplay = com.paypal.oslo.feature.qrc.ui.review.model.TipCalculator.INSTANCE.formatPresetTipDisplay(doubleValue3, valueOf, currencyCode6, true);
                        arrayList11.add(new com.paypal.oslo.feature.qrc.ui.review.model.PresetTipOption("preset_".concat(java.lang.String.valueOf(i)), doubleValue3, formatPresetTipDisplay.component1(), formatPresetTipDisplay.component2()));
                        i++;
                    }
                    arrayList = arrayList11;
                } else {
                    java.util.List<com.paypal.oslo.feature.qrc.domain.model.session.QrcMoney> thresholdValuesAmount = tipConfiguration.getThresholdValuesAmount();
                    if (thresholdValuesAmount == null) {
                        com.paypal.oslo.feature.qrc.domain.model.session.DefaultTipConfigs defaultConfigs2 = tipConfiguration.getDefaultConfigs();
                        thresholdValuesAmount = defaultConfigs2 != null ? defaultConfigs2.getAmountThresholdValues() : null;
                        if (thresholdValuesAmount == null) {
                            thresholdValuesAmount = kotlin.collections.CollectionsKt.emptyList();
                        }
                    }
                    java.util.List<com.paypal.oslo.feature.qrc.domain.model.session.QrcMoney> list2 = thresholdValuesAmount;
                    java.util.ArrayList arrayList12 = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(list2, 10));
                    int i2 = 0;
                    for (java.lang.Object obj7 : list2) {
                        if (i2 < 0) {
                            kotlin.collections.CollectionsKt.throwIndexOverflow();
                        }
                        com.paypal.oslo.feature.qrc.domain.model.session.QrcMoney qrcMoney = (com.paypal.oslo.feature.qrc.domain.model.session.QrcMoney) obj7;
                        java.lang.Double doubleOrNull8 = kotlin.text.StringsKt.toDoubleOrNull(qrcMoney.getValue());
                        double doubleValue4 = doubleOrNull8 != null ? doubleOrNull8.doubleValue() : 0.0d;
                        kotlin.Pair<java.lang.String, java.lang.String> formatPresetTipDisplay2 = com.paypal.oslo.feature.qrc.ui.review.model.TipCalculator.INSTANCE.formatPresetTipDisplay(doubleValue4, valueOf, qrcMoney.getCurrencyCode(), false);
                        arrayList12.add(new com.paypal.oslo.feature.qrc.ui.review.model.PresetTipOption("preset_".concat(java.lang.String.valueOf(i2)), doubleValue4, formatPresetTipDisplay2.component1(), formatPresetTipDisplay2.component2()));
                        i2++;
                    }
                    arrayList = arrayList12;
                }
                java.util.ArrayList arrayList13 = arrayList;
                if (z12) {
                    java.lang.String maximumAllowedTipPercentage = tipConfiguration.getMaximumAllowedTipPercentage();
                    if (maximumAllowedTipPercentage != null && (doubleOrNull4 = kotlin.text.StringsKt.toDoubleOrNull(maximumAllowedTipPercentage)) != null) {
                        doubleValue = doubleOrNull4.doubleValue();
                        d = doubleValue;
                    }
                    d = 0.0d;
                } else {
                    com.paypal.oslo.feature.qrc.domain.model.session.QrcMoney maximumAllowedTipAmount = tipConfiguration.getMaximumAllowedTipAmount();
                    if (maximumAllowedTipAmount != null && (value7 = maximumAllowedTipAmount.getValue()) != null && (doubleOrNull3 = kotlin.text.StringsKt.toDoubleOrNull(value7)) != null) {
                        doubleValue = doubleOrNull3.doubleValue();
                        d = doubleValue;
                    }
                    d = 0.0d;
                }
                tipConfigData = new com.paypal.oslo.feature.qrc.ui.review.model.TipConfigData(tipConfiguration.getStatus() == com.paypal.oslo.feature.qrc.domain.model.session.QrcTippingStatus.ACTIVE, com.paypal.oslo.feature.qrc.ui.review.model.TipState.COLLAPSED, currencyCode6, z12, arrayList13, com.paypal.oslo.feature.qrc.ui.review.model.TipSelection.None.INSTANCE, booleanValue, d, doubleValue2);
            } else {
                tipConfigData = null;
            }
            it2 = paymentOptions.getFundingOptions().iterator();
            while (true) {
                if (it2.hasNext()) {
                    obj2 = null;
                    break;
                }
                obj2 = it2.next();
                if (kotlin.jvm.internal.Intrinsics.areEqual(((com.paypal.oslo.feature.qrc.domain.model.review.FundingPlan) obj2).getId(), paymentOptions.getPreferredFundingOptionId())) {
                    break;
                }
            }
            fundingPlan = (com.paypal.oslo.feature.qrc.domain.model.review.FundingPlan) obj2;
            if (fundingPlan == null) {
                fundingPlan = (com.paypal.oslo.feature.qrc.domain.model.review.FundingPlan) kotlin.collections.CollectionsKt.firstOrNull((java.util.List) paymentOptions.getFundingOptions());
            }
            boolean z13 = (fundingPlan == null ? fundingPlan.getPayPalBalanceFundingSource() : null) == null;
            disallowedOptions = paymentOptions.getDisallowedOptions();
            if ((disallowedOptions instanceof java.util.Collection) || !disallowedOptions.isEmpty()) {
                it3 = disallowedOptions.iterator();
                while (it3.hasNext()) {
                    if (((com.paypal.oslo.feature.qrc.domain.model.review.DisallowedFundingPlan) it3.next()).getPayPalBalanceFundingSource() != null) {
                        z = true;
                        break;
                    }
                }
            }
            z = false;
            z2 = !(paymentOptions.getEligibleFiList().isEmpty() || z13 || z) || paymentOptions.getHasFundingInstrumentContingency();
            merchant = navArgs.getParticipants().getMerchant();
            if (merchant != null || (name2 = merchant.getDisplayName()) == null) {
                com.paypal.oslo.feature.qrc.domain.model.session.Merchant merchant3 = navArgs.getParticipants().getMerchant();
                name2 = merchant3 == null ? merchant3.getName() : null;
                if (name2 == null) {
                    name2 = "";
                }
            }
            merchant2 = navArgs.getParticipants().getMerchant();
            if (merchant2 != null && (extractInitials = merchant2.getDisplayInitials()) != null) {
                if (extractInitials.length() <= 0) {
                    extractInitials = null;
                }
            }
            com.paypal.oslo.feature.qrc.domain.model.session.Merchant merchant4 = navArgs.getParticipants().getMerchant();
            extractInitials = com.paypal.oslo.feature.qrc.ui.utils.ComposableUtilsKt.extractInitials(merchant4 == null ? merchant4.getDisplayName() : null);
            java.lang.String str3 = extractInitials;
            com.paypal.oslo.feature.qrc.domain.model.session.QrcMoney paymentAmount = paymentOptions.getPaymentAmount();
            java.lang.String value10 = paymentAmount == null ? paymentAmount.getValue() : null;
            com.paypal.oslo.feature.qrc.domain.model.session.QrcMoney paymentAmount2 = paymentOptions.getPaymentAmount();
            java.lang.String highSpeedVideoSizes5 = getHighSpeedVideoSizes(value10, paymentAmount2 == null ? paymentAmount2.getCurrencyCode() : null);
            java.lang.String str4 = highSpeedVideoSizes5 != null ? "$0.00" : highSpeedVideoSizes5;
            com.paypal.oslo.feature.qrc.domain.model.session.QrcMoney paymentAmount3 = paymentOptions.getPaymentAmount();
            currencyCode2 = paymentAmount3 == null ? paymentAmount3.getCurrencyCode() : null;
            if (currencyCode2 == null) {
                currencyCode2 = "";
            }
            com.paypal.oslo.feature.qrc.domain.model.session.QrcMoney paymentAmount4 = paymentOptions.getPaymentAmount();
            value3 = paymentAmount4 == null ? paymentAmount4.getValue() : null;
            if (value3 == null) {
                value3 = "";
            }
            java.lang.String id2 = fundingPlan3 == null ? fundingPlan3.getId() : null;
            if (!z2) {
                com.paypal.oslo.feature.qrc.domain.model.review.DisallowedFundingPlan disallowedFundingPlan3 = (com.paypal.oslo.feature.qrc.domain.model.review.DisallowedFundingPlan) kotlin.collections.CollectionsKt.firstOrNull((java.util.List) paymentOptions.getDisallowedOptions());
                if ((disallowedFundingPlan3 != null ? disallowedFundingPlan3.getPayPalBalanceFundingSource() : null) != null && paymentOptions.getEligibleFiList().isEmpty()) {
                    z3 = true;
                    com.paypal.oslo.feature.qrc.domain.model.session.QrcMoney paymentAmount5 = paymentOptions.getPaymentAmount();
                    java.lang.String value11 = paymentAmount5 != null ? paymentAmount5.getValue() : null;
                    com.paypal.oslo.feature.qrc.domain.model.session.QrcMoney paymentAmount6 = paymentOptions.getPaymentAmount();
                    java.lang.String highSpeedVideoSizes6 = getHighSpeedVideoSizes(value11, paymentAmount6 != null ? paymentAmount6.getCurrencyCode() : null);
                    java.lang.String str5 = highSpeedVideoSizes6 == null ? "$0.00" : highSpeedVideoSizes6;
                    if (fundingPlan3 != null || (feeAmount6 = fundingPlan3.getFeeAmount()) == null || (value4 = feeAmount6.getValue()) == null) {
                        com.paypal.oslo.feature.qrc.domain.model.review.DisallowedFundingPlan disallowedFundingPlan4 = (com.paypal.oslo.feature.qrc.domain.model.review.DisallowedFundingPlan) kotlin.collections.CollectionsKt.firstOrNull((java.util.List) paymentOptions.getDisallowedOptions());
                        value4 = (disallowedFundingPlan4 != null || (feeAmount = disallowedFundingPlan4.getFeeAmount()) == null) ? null : feeAmount.getValue();
                    }
                    if (fundingPlan3 != null || (feeAmount5 = fundingPlan3.getFeeAmount()) == null || (currencyCode3 = feeAmount5.getCurrencyCode()) == null) {
                        disallowedFundingPlan = (com.paypal.oslo.feature.qrc.domain.model.review.DisallowedFundingPlan) kotlin.collections.CollectionsKt.firstOrNull((java.util.List) paymentOptions.getDisallowedOptions());
                        if (disallowedFundingPlan != null || (feeAmount2 = disallowedFundingPlan.getFeeAmount()) == null) {
                            com.paypal.oslo.feature.qrc.domain.model.session.QrcMoney totalAmount5 = paymentOptions.getTotalAmount();
                            currencyCode3 = totalAmount5 != null ? totalAmount5.getCurrencyCode() : null;
                        } else {
                            currencyCode3 = feeAmount2.getCurrencyCode();
                        }
                    }
                    java.lang.String highSpeedVideoSizes7 = getHighSpeedVideoSizes(value4, currencyCode3);
                    java.lang.String str6 = highSpeedVideoSizes7 == null ? "$0.00" : highSpeedVideoSizes7;
                    if (navArgs.isPayPalWorldQR()) {
                        com.paypal.oslo.feature.qrc.domain.model.session.QrcMoney paymentAmount7 = paymentOptions.getPaymentAmount();
                        double doubleValue5 = (paymentAmount7 == null || (value6 = paymentAmount7.getValue()) == null || (doubleOrNull2 = kotlin.text.StringsKt.toDoubleOrNull(value6)) == null) ? 0.0d : doubleOrNull2.doubleValue();
                        if (fundingPlan3 == null || (feeAmount4 = fundingPlan3.getFeeAmount()) == null || (value5 = feeAmount4.getValue()) == null) {
                            com.paypal.oslo.feature.qrc.domain.model.review.DisallowedFundingPlan disallowedFundingPlan5 = (com.paypal.oslo.feature.qrc.domain.model.review.DisallowedFundingPlan) kotlin.collections.CollectionsKt.firstOrNull((java.util.List) paymentOptions.getDisallowedOptions());
                            value5 = (disallowedFundingPlan5 == null || (feeAmount3 = disallowedFundingPlan5.getFeeAmount()) == null) ? null : feeAmount3.getValue();
                        }
                        if (value5 != null && (doubleOrNull = kotlin.text.StringsKt.toDoubleOrNull(value5)) != null) {
                            d2 = doubleOrNull.doubleValue();
                        }
                        com.paypal.oslo.feature.qrc.domain.model.session.QrcMoney paymentAmount8 = paymentOptions.getPaymentAmount();
                        if (paymentAmount8 == null || (currencyCode5 = paymentAmount8.getCurrencyCode()) == null) {
                            com.paypal.oslo.feature.qrc.domain.model.session.QrcMoney totalAmount6 = paymentOptions.getTotalAmount();
                            currencyCode4 = totalAmount6 != null ? totalAmount6.getCurrencyCode() : null;
                        } else {
                            currencyCode4 = currencyCode5;
                        }
                        z4 = true;
                        java.lang.String format = java.lang.String.format(com.paypal.oslo.feature.savings.constants.SavingsConstants.Currency.FORMAT_TWO_DECIMALS, java.util.Arrays.copyOf(new java.lang.Object[]{java.lang.Double.valueOf(doubleValue5 + d2)}, 1));
                        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(format, "");
                        highSpeedVideoSizes2 = getHighSpeedVideoSizes(format, currencyCode4);
                    } else {
                        z4 = true;
                        com.paypal.oslo.feature.qrc.domain.model.session.QrcMoney totalAmount7 = paymentOptions.getTotalAmount();
                        java.lang.String value12 = totalAmount7 != null ? totalAmount7.getValue() : null;
                        com.paypal.oslo.feature.qrc.domain.model.session.QrcMoney totalAmount8 = paymentOptions.getTotalAmount();
                        highSpeedVideoSizes2 = getHighSpeedVideoSizes(value12, totalAmount8 != null ? totalAmount8.getCurrencyCode() : null);
                    }
                    boolean isMultiCurrencyTransaction = paymentOptions.isMultiCurrencyTransaction();
                    if (fundingPlan3 == null && (currencyConverterOptions = fundingPlan3.getCurrencyConverterOptions()) != null && currencyConverterOptions.size() == 2) {
                        paymentReviewUiModelMapper = this;
                        z5 = z4;
                    } else {
                        paymentReviewUiModelMapper = this;
                        z5 = false;
                    }
                    return new com.paypal.oslo.feature.qrc.ui.review.PaymentReviewUiModel(name2, str3, str4, currencyCode2, value3, paymentOptions, id2, paymentOptionsUiModel, false, isMultiCurrencyTransaction, z5, false, navArgs.isPayPalWorldQR(), str5, str6, str, paymentReviewUiModelMapper.buildCurrencyConversionUiData$qrc_prodRelease(fundingPlan3, isBalanceOptedOut), null, false, false, false, z3, z2, null, z10, false, isTipEligible, tipConfigData, null, 311298304, null);
                }
            }
            z3 = false;
            com.paypal.oslo.feature.qrc.domain.model.session.QrcMoney paymentAmount52 = paymentOptions.getPaymentAmount();
            if (paymentAmount52 != null) {
            }
            com.paypal.oslo.feature.qrc.domain.model.session.QrcMoney paymentAmount62 = paymentOptions.getPaymentAmount();
            java.lang.String highSpeedVideoSizes62 = getHighSpeedVideoSizes(value11, paymentAmount62 != null ? paymentAmount62.getCurrencyCode() : null);
            if (highSpeedVideoSizes62 == null) {
            }
            if (fundingPlan3 != null) {
            }
            com.paypal.oslo.feature.qrc.domain.model.review.DisallowedFundingPlan disallowedFundingPlan42 = (com.paypal.oslo.feature.qrc.domain.model.review.DisallowedFundingPlan) kotlin.collections.CollectionsKt.firstOrNull((java.util.List) paymentOptions.getDisallowedOptions());
            if (disallowedFundingPlan42 != null) {
            }
            if (fundingPlan3 != null) {
            }
            disallowedFundingPlan = (com.paypal.oslo.feature.qrc.domain.model.review.DisallowedFundingPlan) kotlin.collections.CollectionsKt.firstOrNull((java.util.List) paymentOptions.getDisallowedOptions());
            if (disallowedFundingPlan != null) {
            }
            com.paypal.oslo.feature.qrc.domain.model.session.QrcMoney totalAmount52 = paymentOptions.getTotalAmount();
            if (totalAmount52 != null) {
            }
            java.lang.String highSpeedVideoSizes72 = getHighSpeedVideoSizes(value4, currencyCode3);
            if (highSpeedVideoSizes72 == null) {
            }
            if (navArgs.isPayPalWorldQR()) {
            }
            boolean isMultiCurrencyTransaction2 = paymentOptions.isMultiCurrencyTransaction();
            if (fundingPlan3 == null) {
            }
            paymentReviewUiModelMapper = this;
            z5 = false;
            return new com.paypal.oslo.feature.qrc.ui.review.PaymentReviewUiModel(name2, str3, str4, currencyCode2, value3, paymentOptions, id2, paymentOptionsUiModel, false, isMultiCurrencyTransaction2, z5, false, navArgs.isPayPalWorldQR(), str5, str6, str, paymentReviewUiModelMapper.buildCurrencyConversionUiData$qrc_prodRelease(fundingPlan3, isBalanceOptedOut), null, false, false, false, z3, z2, null, z10, false, isTipEligible, tipConfigData, null, 311298304, null);
        }
        fiUiItem = null;
        java.util.ArrayList arrayList92 = arrayList8;
        java.util.ArrayList arrayList102 = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(arrayList92, 10));
        it = arrayList92.iterator();
        while (it.hasNext()) {
        }
        com.paypal.oslo.feature.qrc.ui.review.FiAccordionUiData fiAccordionUiData2 = new com.paypal.oslo.feature.qrc.ui.review.FiAccordionUiData(fiUiItem, arrayList102, z11);
        com.paypal.oslo.feature.qrc.domain.model.session.QrcMoney totalAmount9 = paymentOptions.getTotalAmount();
        if (totalAmount9 == null) {
        }
        com.paypal.oslo.feature.qrc.domain.model.session.QrcMoney totalAmount22 = paymentOptions.getTotalAmount();
        highSpeedVideoSizes = getHighSpeedVideoSizes(value9, totalAmount22 == null ? totalAmount22.getCurrencyCode() : null);
        if (highSpeedVideoSizes == null) {
        }
        com.paypal.oslo.feature.qrc.ui.review.PaymentOptionsUiModel paymentOptionsUiModel2 = new com.paypal.oslo.feature.qrc.ui.review.PaymentOptionsUiModel(fiAccordionUiData2, highSpeedVideoSizes, z11, balanceUiData$qrc_prodRelease);
        boolean isTipEligible2 = navArgs.getTipDetails().isTipEligible();
        tipConfiguration = navArgs.getTipDetails().getTipConfiguration();
        if (tipConfiguration == null) {
        }
        it2 = paymentOptions.getFundingOptions().iterator();
        while (true) {
            if (it2.hasNext()) {
            }
        }
        fundingPlan = (com.paypal.oslo.feature.qrc.domain.model.review.FundingPlan) obj2;
        if (fundingPlan == null) {
        }
        if ((fundingPlan == null ? fundingPlan.getPayPalBalanceFundingSource() : null) == null) {
        }
        disallowedOptions = paymentOptions.getDisallowedOptions();
        if (disallowedOptions instanceof java.util.Collection) {
        }
        it3 = disallowedOptions.iterator();
        while (it3.hasNext()) {
        }
        z = false;
        if (paymentOptions.getEligibleFiList().isEmpty()) {
        }
        merchant = navArgs.getParticipants().getMerchant();
        if (merchant != null) {
        }
        com.paypal.oslo.feature.qrc.domain.model.session.Merchant merchant32 = navArgs.getParticipants().getMerchant();
        if (merchant32 == null) {
        }
        if (name2 == null) {
        }
        merchant2 = navArgs.getParticipants().getMerchant();
        if (merchant2 != null) {
            if (extractInitials.length() <= 0) {
            }
        }
        com.paypal.oslo.feature.qrc.domain.model.session.Merchant merchant42 = navArgs.getParticipants().getMerchant();
        extractInitials = com.paypal.oslo.feature.qrc.ui.utils.ComposableUtilsKt.extractInitials(merchant42 == null ? merchant42.getDisplayName() : null);
        java.lang.String str32 = extractInitials;
        com.paypal.oslo.feature.qrc.domain.model.session.QrcMoney paymentAmount9 = paymentOptions.getPaymentAmount();
        if (paymentAmount9 == null) {
        }
        com.paypal.oslo.feature.qrc.domain.model.session.QrcMoney paymentAmount22 = paymentOptions.getPaymentAmount();
        java.lang.String highSpeedVideoSizes52 = getHighSpeedVideoSizes(value10, paymentAmount22 == null ? paymentAmount22.getCurrencyCode() : null);
        if (highSpeedVideoSizes52 != null) {
        }
        com.paypal.oslo.feature.qrc.domain.model.session.QrcMoney paymentAmount32 = paymentOptions.getPaymentAmount();
        if (paymentAmount32 == null) {
        }
        if (currencyCode2 == null) {
        }
        com.paypal.oslo.feature.qrc.domain.model.session.QrcMoney paymentAmount42 = paymentOptions.getPaymentAmount();
        if (paymentAmount42 == null) {
        }
        if (value3 == null) {
        }
        if (fundingPlan3 == null) {
        }
        if (!z2) {
        }
        z3 = false;
        com.paypal.oslo.feature.qrc.domain.model.session.QrcMoney paymentAmount522 = paymentOptions.getPaymentAmount();
        if (paymentAmount522 != null) {
        }
        com.paypal.oslo.feature.qrc.domain.model.session.QrcMoney paymentAmount622 = paymentOptions.getPaymentAmount();
        java.lang.String highSpeedVideoSizes622 = getHighSpeedVideoSizes(value11, paymentAmount622 != null ? paymentAmount622.getCurrencyCode() : null);
        if (highSpeedVideoSizes622 == null) {
        }
        if (fundingPlan3 != null) {
        }
        com.paypal.oslo.feature.qrc.domain.model.review.DisallowedFundingPlan disallowedFundingPlan422 = (com.paypal.oslo.feature.qrc.domain.model.review.DisallowedFundingPlan) kotlin.collections.CollectionsKt.firstOrNull((java.util.List) paymentOptions.getDisallowedOptions());
        if (disallowedFundingPlan422 != null) {
        }
        if (fundingPlan3 != null) {
        }
        disallowedFundingPlan = (com.paypal.oslo.feature.qrc.domain.model.review.DisallowedFundingPlan) kotlin.collections.CollectionsKt.firstOrNull((java.util.List) paymentOptions.getDisallowedOptions());
        if (disallowedFundingPlan != null) {
        }
        com.paypal.oslo.feature.qrc.domain.model.session.QrcMoney totalAmount522 = paymentOptions.getTotalAmount();
        if (totalAmount522 != null) {
        }
        java.lang.String highSpeedVideoSizes722 = getHighSpeedVideoSizes(value4, currencyCode3);
        if (highSpeedVideoSizes722 == null) {
        }
        if (navArgs.isPayPalWorldQR()) {
        }
        boolean isMultiCurrencyTransaction22 = paymentOptions.isMultiCurrencyTransaction();
        if (fundingPlan3 == null) {
        }
        paymentReviewUiModelMapper = this;
        z5 = false;
        return new com.paypal.oslo.feature.qrc.ui.review.PaymentReviewUiModel(name2, str32, str4, currencyCode2, value3, paymentOptions, id2, paymentOptionsUiModel2, false, isMultiCurrencyTransaction22, z5, false, navArgs.isPayPalWorldQR(), str5, str6, str, paymentReviewUiModelMapper.buildCurrencyConversionUiData$qrc_prodRelease(fundingPlan3, isBalanceOptedOut), null, false, false, false, z3, z2, null, z10, false, isTipEligible2, tipConfigData, null, 311298304, null);
    }

    public final com.paypal.oslo.feature.qrc.ui.review.BalanceUiData getBalanceUiData$qrc_prodRelease(java.lang.String amount, java.lang.String currencyCode, java.lang.String chargeableAmount, boolean isEffectiveOptedOut, boolean isSelected, boolean isInsufficient, boolean isZeroBalance) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(chargeableAmount, "");
        if (amount == null || currencyCode == null) {
            return null;
        }
        return new com.paypal.oslo.feature.qrc.ui.review.BalanceUiData(amount, currencyCode, isSelected, isInsufficient, isZeroBalance, false, isEffectiveOptedOut, chargeableAmount);
    }

    @kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0082\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00022\b\u0010\u0003\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0012\u001a\u00020\u00028\u0007¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0013\u001a\u00020\u00028\u0007¢\u0006\u0006\n\u0004\b\u0013\u0010\u0011R\u0011\u0010\u0014\u001a\u00020\u00028\u0007¢\u0006\u0006\n\u0004\b\u0012\u0010\u0011"}, d2 = {"Lcom/paypal/oslo/feature/qrc/ui/review/mapper/PaymentReviewUiModelMapper$BalanceFlags;", "", "", "p0", "p1", "p2", "<init>", "(ZZZ)V", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "getHighSpeedVideoFpsRangesFor", "Z", "getHighSpeedVideoFpsRanges", "Camera2StreamConfigurationMap", "getHighSpeedVideoSizes"}, k = 1, mv = {2, 3, 0}, xi = 48)
    static final /* data */ class BalanceFlags {
        final boolean Camera2StreamConfigurationMap;

        /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
        final boolean getHighSpeedVideoSizes;

        /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
        final boolean getHighSpeedVideoFpsRanges;

        public BalanceFlags(boolean z, boolean z2, boolean z3) {
            this.getHighSpeedVideoFpsRanges = z;
            this.Camera2StreamConfigurationMap = z2;
            this.getHighSpeedVideoSizes = z3;
        }

        public final java.lang.String toString() {
            boolean z = this.getHighSpeedVideoFpsRanges;
            boolean z2 = this.Camera2StreamConfigurationMap;
            boolean z3 = this.getHighSpeedVideoSizes;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("BalanceFlags(getHighSpeedVideoFpsRanges=");
            sb.append(z);
            sb.append(", Camera2StreamConfigurationMap=");
            sb.append(z2);
            sb.append(", getHighSpeedVideoSizes=");
            sb.append(z3);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return (((java.lang.Boolean.hashCode(this.getHighSpeedVideoFpsRanges) * 31) + java.lang.Boolean.hashCode(this.Camera2StreamConfigurationMap)) * 31) + java.lang.Boolean.hashCode(this.getHighSpeedVideoSizes);
        }

        public final boolean equals(java.lang.Object p0) {
            if (this == p0) {
                return true;
            }
            if (!(p0 instanceof com.paypal.oslo.feature.qrc.ui.review.mapper.PaymentReviewUiModelMapper.BalanceFlags)) {
                return false;
            }
            com.paypal.oslo.feature.qrc.ui.review.mapper.PaymentReviewUiModelMapper.BalanceFlags balanceFlags = (com.paypal.oslo.feature.qrc.ui.review.mapper.PaymentReviewUiModelMapper.BalanceFlags) p0;
            return this.getHighSpeedVideoFpsRanges == balanceFlags.getHighSpeedVideoFpsRanges && this.Camera2StreamConfigurationMap == balanceFlags.Camera2StreamConfigurationMap && this.getHighSpeedVideoSizes == balanceFlags.getHighSpeedVideoSizes;
        }
    }

    private static java.lang.String getHighSpeedVideoSizes(java.lang.String p0, java.lang.String p1) {
        if (p0 == null || p1 == null) {
            return null;
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder(com.paypal.oslo.feature.savings.constants.SavingsConstants.Currency.SYMBOL_USD);
        sb.append(p0);
        sb.append(" ");
        sb.append(p1);
        return sb.toString();
    }

    private static com.paypal.oslo.feature.qrc.ui.review.FiUiItem Camera2StreamConfigurationMap(com.paypal.oslo.feature.qrc.domain.model.review.FundingSource fundingSource) {
        java.lang.String str;
        java.lang.String id = fundingSource.getId();
        java.lang.String formattedName = fundingSource.getFormattedName();
        java.lang.String str2 = formattedName == null ? "" : formattedName;
        java.lang.String typeLabel = fundingSource.getTypeLabel();
        java.lang.String str3 = typeLabel == null ? "" : typeLabel;
        java.lang.String imageUrl = fundingSource.getImageUrl();
        java.lang.String str4 = imageUrl == null ? "" : imageUrl;
        com.paypal.oslo.feature.qrc.domain.model.session.QrcMoney amount = fundingSource.getAmount();
        java.lang.String value = amount != null ? amount.getValue() : null;
        com.paypal.oslo.feature.qrc.domain.model.session.QrcMoney amount2 = fundingSource.getAmount();
        java.lang.String highSpeedVideoSizes = getHighSpeedVideoSizes(value, amount2 != null ? amount2.getCurrencyCode() : null);
        if (highSpeedVideoSizes == null) {
            com.paypal.oslo.feature.qrc.domain.model.session.QrcMoney amount3 = fundingSource.getAmount();
            str = amount3 != null ? amount3.getValue() : null;
            if (str == null) {
                str = "";
            }
        } else {
            str = highSpeedVideoSizes;
        }
        return new com.paypal.oslo.feature.qrc.ui.review.FiUiItem(id, str2, str3, str4, str, fundingSource.isSelected());
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x009a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final com.paypal.oslo.feature.qrc.ui.review.CurrencyConversionUiData buildCurrencyConversionUiData$qrc_prodRelease(com.paypal.oslo.feature.qrc.domain.model.review.FundingPlan plan, boolean isBalanceOptedOut) {
        com.paypal.oslo.feature.qrc.domain.model.review.CurrencyConversion currencyConversionOverride;
        com.paypal.oslo.feature.qrc.domain.model.review.CurrencyConverter currencyConversionProvider;
        kotlin.Pair pair;
        boolean z;
        com.paypal.oslo.feature.qrc.domain.model.review.CurrencyConversion currencyConversionOverrideInOptOut;
        com.paypal.oslo.feature.qrc.domain.model.review.CurrencyConverter currencyConversionProviderInOptOut;
        if (isBalanceOptedOut) {
            if (plan == null || (currencyConversionOverrideInOptOut = plan.getCurrencyConversionInOptOut()) == null) {
                currencyConversionOverrideInOptOut = plan != null ? plan.getCurrencyConversionOverrideInOptOut() : null;
            }
            if ((plan != null ? plan.getCurrencyConversionInOptOut() : null) != null) {
                currencyConversionProviderInOptOut = com.paypal.oslo.feature.qrc.domain.model.review.CurrencyConverter.PAYPAL;
            } else {
                if ((plan != null ? plan.getCurrencyConversionOverrideInOptOut() : null) != null) {
                    currencyConversionProviderInOptOut = com.paypal.oslo.feature.qrc.domain.model.review.CurrencyConverter.ISSUER;
                } else {
                    currencyConversionProviderInOptOut = plan != null ? plan.getCurrencyConversionProviderInOptOut() : null;
                }
            }
            pair = kotlin.TuplesKt.to(currencyConversionOverrideInOptOut, currencyConversionProviderInOptOut);
        } else {
            if (plan == null || (currencyConversionOverride = plan.getCurrencyConversion()) == null) {
                currencyConversionOverride = plan != null ? plan.getCurrencyConversionOverride() : null;
            }
            if ((plan != null ? plan.getCurrencyConversion() : null) != null) {
                currencyConversionProvider = com.paypal.oslo.feature.qrc.domain.model.review.CurrencyConverter.PAYPAL;
            } else {
                if ((plan != null ? plan.getCurrencyConversionOverride() : null) != null) {
                    currencyConversionProvider = com.paypal.oslo.feature.qrc.domain.model.review.CurrencyConverter.ISSUER;
                } else {
                    currencyConversionProvider = plan != null ? plan.getCurrencyConversionProvider() : null;
                }
            }
            pair = kotlin.TuplesKt.to(currencyConversionOverride, currencyConversionProvider);
        }
        com.paypal.oslo.feature.qrc.domain.model.review.CurrencyConversion currencyConversion = (com.paypal.oslo.feature.qrc.domain.model.review.CurrencyConversion) pair.component1();
        com.paypal.oslo.feature.qrc.domain.model.review.CurrencyConverter currencyConverter = (com.paypal.oslo.feature.qrc.domain.model.review.CurrencyConverter) pair.component2();
        if (currencyConverter == null) {
            return null;
        }
        com.paypal.oslo.feature.qrc.ui.review.model.ConversionOptionTab conversionOptionTab$qrc_prodRelease = toConversionOptionTab$qrc_prodRelease(currencyConverter);
        if (conversionOptionTab$qrc_prodRelease == com.paypal.oslo.feature.qrc.ui.review.model.ConversionOptionTab.ISSUER) {
            if ((plan != null ? plan.getCurrencyOverrideDisallowedFundingSource() : null) != null) {
                z = true;
                boolean z2 = z;
                if (currencyConversion == null) {
                    return buildCurrencyConversionUiDataFromConversion$qrc_prodRelease(currencyConversion, conversionOptionTab$qrc_prodRelease, z2);
                }
                return new com.paypal.oslo.feature.qrc.ui.review.CurrencyConversionUiData("", "", "", "", conversionOptionTab$qrc_prodRelease, null, false, z2, 32, null);
            }
        }
        z = false;
        boolean z22 = z;
        if (currencyConversion == null) {
        }
    }

    public final com.paypal.oslo.feature.qrc.ui.review.CurrencyConversionUiData buildCurrencyConversionUiDataFromConversion$qrc_prodRelease(com.paypal.oslo.feature.qrc.domain.model.review.CurrencyConversion conversion, com.paypal.oslo.feature.qrc.ui.review.model.ConversionOptionTab selectedTab, boolean isPPBalanceDisabled) {
        java.lang.String value;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(conversion, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(selectedTab, "");
        com.paypal.oslo.feature.qrc.domain.model.session.QrcMoney amountFrom = conversion.getAmountFrom();
        java.lang.Double d = null;
        java.lang.String value2 = amountFrom != null ? amountFrom.getValue() : null;
        java.lang.String str = value2 == null ? "" : value2;
        com.paypal.oslo.feature.qrc.domain.model.session.QrcMoney amountFrom2 = conversion.getAmountFrom();
        java.lang.String currencyCode = amountFrom2 != null ? amountFrom2.getCurrencyCode() : null;
        java.lang.String str2 = currencyCode == null ? "" : currencyCode;
        com.paypal.oslo.feature.qrc.domain.model.session.QrcMoney amountTo = conversion.getAmountTo();
        java.lang.String value3 = amountTo != null ? amountTo.getValue() : null;
        java.lang.String str3 = value3 == null ? "" : value3;
        com.paypal.oslo.feature.qrc.domain.model.session.QrcMoney amountTo2 = conversion.getAmountTo();
        java.lang.String currencyCode2 = amountTo2 != null ? amountTo2.getCurrencyCode() : null;
        java.lang.String str4 = currencyCode2 == null ? "" : currencyCode2;
        com.paypal.oslo.feature.qrc.domain.model.session.QrcMoney exchangeRateTo = conversion.getExchangeRateTo();
        if (exchangeRateTo != null && (value = exchangeRateTo.getValue()) != null) {
            d = kotlin.text.StringsKt.toDoubleOrNull(value);
        }
        return new com.paypal.oslo.feature.qrc.ui.review.CurrencyConversionUiData(str, str2, str3, str4, selectedTab, d, false, isPPBalanceDisabled);
    }

    public final com.paypal.oslo.feature.qrc.ui.review.model.ConversionOptionTab toConversionOptionTab$qrc_prodRelease(com.paypal.oslo.feature.qrc.domain.model.review.CurrencyConverter currencyConverter) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(currencyConverter, "");
        int i = com.paypal.oslo.feature.qrc.ui.review.mapper.PaymentReviewUiModelMapper.WhenMappings.$EnumSwitchMapping$0[currencyConverter.ordinal()];
        if (i == 1) {
            return com.paypal.oslo.feature.qrc.ui.review.model.ConversionOptionTab.PAYPAL;
        }
        if (i != 2) {
            throw new kotlin.NoWhenBranchMatchedException();
        }
        return com.paypal.oslo.feature.qrc.ui.review.model.ConversionOptionTab.ISSUER;
    }

    @kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[com.paypal.oslo.feature.qrc.domain.model.review.CurrencyConverter.values().length];
            try {
                iArr[com.paypal.oslo.feature.qrc.domain.model.review.CurrencyConverter.PAYPAL.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[com.paypal.oslo.feature.qrc.domain.model.review.CurrencyConverter.ISSUER.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }
}
