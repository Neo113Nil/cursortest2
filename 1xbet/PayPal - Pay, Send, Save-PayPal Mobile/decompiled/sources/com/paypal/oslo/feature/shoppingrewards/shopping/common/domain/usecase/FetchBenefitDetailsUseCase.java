package com.paypal.oslo.feature.shoppingrewards.shopping.common.domain.usecase;

@kotlin.Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0018\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0086\u0002¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\r\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\f"}, d2 = {"Lcom/paypal/oslo/feature/shoppingrewards/shopping/common/domain/usecase/FetchBenefitDetailsUseCase;", "", "Lcom/paypal/oslo/feature/shoppingrewards/shopping/common/domain/IabBenefitCardBuilder;", "cardBuilder", "<init>", "(Lcom/paypal/oslo/feature/shoppingrewards/shopping/common/domain/IabBenefitCardBuilder;)V", "Lcom/paypal/oslo/feature/shoppingrewards/shopping/common/domain/IabOfferDetails;", "offerDetails", "Lcom/paypal/oslo/feature/shoppingrewards/shopping/common/domain/IabBenefitDetails;", "invoke", "(Lcom/paypal/oslo/feature/shoppingrewards/shopping/common/domain/IabOfferDetails;)Lcom/paypal/oslo/feature/shoppingrewards/shopping/common/domain/IabBenefitDetails;", "getHighSpeedVideoFpsRangesFor", "Lcom/paypal/oslo/feature/shoppingrewards/shopping/common/domain/IabBenefitCardBuilder;", "getHighSpeedVideoFpsRanges"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class FetchBenefitDetailsUseCase {
    public static final int $stable = 8;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.shoppingrewards.shopping.common.domain.IabBenefitCardBuilder getHighSpeedVideoFpsRanges;

    @javax.inject.Inject
    public FetchBenefitDetailsUseCase(com.paypal.oslo.feature.shoppingrewards.shopping.common.domain.IabBenefitCardBuilder iabBenefitCardBuilder) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(iabBenefitCardBuilder, "");
        this.getHighSpeedVideoFpsRanges = iabBenefitCardBuilder;
    }

    public final com.paypal.oslo.feature.shoppingrewards.shopping.common.domain.IabBenefitDetails invoke(com.paypal.oslo.feature.shoppingrewards.shopping.common.domain.IabOfferDetails offerDetails) {
        java.util.ArrayList arrayList;
        com.paypal.oslo.feature.shoppingrewards.shopping.common.domain.BenefitData payIn4Card;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(offerDetails, "");
        java.util.List<com.paypal.oslo.feature.shoppingrewards.shopping.common.domain.BenefitType> benefits = offerDetails.getBenefits();
        if (benefits == null) {
            benefits = kotlin.collections.CollectionsKt.emptyList();
        }
        java.util.Set<com.paypal.oslo.feature.shoppingrewards.shopping.common.domain.BenefitType> keySet = offerDetails.getBnplMetadata().keySet();
        boolean contains = benefits.contains(com.paypal.oslo.feature.shoppingrewards.shopping.common.domain.BenefitType.PROMO_CASHBACK);
        boolean contains2 = benefits.contains(com.paypal.oslo.feature.shoppingrewards.shopping.common.domain.BenefitType.ZERO_APR);
        boolean contains3 = benefits.contains(com.paypal.oslo.feature.shoppingrewards.shopping.common.domain.BenefitType.PAY_LATER_GENERIC);
        java.util.List createListBuilder = kotlin.collections.CollectionsKt.createListBuilder();
        if (contains3 && contains) {
            createListBuilder.add(com.paypal.oslo.feature.shoppingrewards.shopping.common.domain.BenefitType.PAY_LATER_GENERIC);
            createListBuilder.add(com.paypal.oslo.feature.shoppingrewards.shopping.common.domain.BenefitType.PROMO_CASHBACK);
        } else if (contains3) {
            com.paypal.oslo.feature.shoppingrewards.shopping.common.domain.BenefitType[] benefitTypeArr = new com.paypal.oslo.feature.shoppingrewards.shopping.common.domain.BenefitType[2];
            com.paypal.oslo.feature.shoppingrewards.shopping.common.domain.BenefitType benefitType = com.paypal.oslo.feature.shoppingrewards.shopping.common.domain.BenefitType.PAY_IN_4;
            if (!keySet.contains(benefitType)) {
                benefitType = null;
            }
            benefitTypeArr[0] = benefitType;
            com.paypal.oslo.feature.shoppingrewards.shopping.common.domain.BenefitType benefitType2 = com.paypal.oslo.feature.shoppingrewards.shopping.common.domain.BenefitType.PAY_MONTHLY;
            if (!keySet.contains(benefitType2)) {
                benefitType2 = null;
            }
            benefitTypeArr[1] = benefitType2;
            java.util.List listOfNotNull = kotlin.collections.CollectionsKt.listOfNotNull((java.lang.Object[]) benefitTypeArr);
            if (!listOfNotNull.isEmpty()) {
                createListBuilder.addAll(listOfNotNull);
            } else {
                createListBuilder.add(com.paypal.oslo.feature.shoppingrewards.shopping.common.domain.BenefitType.PAY_LATER_GENERIC);
            }
        } else if (contains2 && contains) {
            createListBuilder.add(com.paypal.oslo.feature.shoppingrewards.shopping.common.domain.BenefitType.PROMO_CASHBACK);
            createListBuilder.add(com.paypal.oslo.feature.shoppingrewards.shopping.common.domain.BenefitType.ZERO_APR);
        } else if (contains2) {
            if (keySet.contains(com.paypal.oslo.feature.shoppingrewards.shopping.common.domain.BenefitType.PAY_IN_4)) {
                createListBuilder.add(com.paypal.oslo.feature.shoppingrewards.shopping.common.domain.BenefitType.PAY_IN_4);
            }
            if (keySet.contains(com.paypal.oslo.feature.shoppingrewards.shopping.common.domain.BenefitType.ZERO_APR)) {
                createListBuilder.add(com.paypal.oslo.feature.shoppingrewards.shopping.common.domain.BenefitType.ZERO_APR);
            }
        } else {
            if (contains) {
                createListBuilder.add(com.paypal.oslo.feature.shoppingrewards.shopping.common.domain.BenefitType.PROMO_CASHBACK);
            }
            java.util.List distinct = kotlin.collections.CollectionsKt.distinct(kotlin.collections.CollectionsKt.plus((java.util.Collection) benefits, (java.lang.Iterable) keySet));
            if (distinct.contains(com.paypal.oslo.feature.shoppingrewards.shopping.common.domain.BenefitType.PAY_IN_4)) {
                createListBuilder.add(com.paypal.oslo.feature.shoppingrewards.shopping.common.domain.BenefitType.PAY_IN_4);
            }
            if (distinct.contains(com.paypal.oslo.feature.shoppingrewards.shopping.common.domain.BenefitType.PAY_MONTHLY)) {
                createListBuilder.add(com.paypal.oslo.feature.shoppingrewards.shopping.common.domain.BenefitType.PAY_MONTHLY);
            }
        }
        java.util.List build = kotlin.collections.CollectionsKt.build(createListBuilder);
        com.paypal.android.logger.Logger logger = com.paypal.oslo.feature.shoppingrewards.LoggerKt.log;
        kotlin.Pair[] pairArr = new kotlin.Pair[5];
        java.util.List<com.paypal.oslo.feature.shoppingrewards.shopping.common.domain.BenefitType> benefits2 = offerDetails.getBenefits();
        if (benefits2 != null) {
            java.util.List<com.paypal.oslo.feature.shoppingrewards.shopping.common.domain.BenefitType> list = benefits2;
            java.util.ArrayList arrayList2 = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(list, 10));
            java.util.Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                arrayList2.add(((com.paypal.oslo.feature.shoppingrewards.shopping.common.domain.BenefitType) it.next()).name());
            }
            arrayList = arrayList2;
        } else {
            arrayList = null;
        }
        if (arrayList == null) {
            arrayList = kotlin.collections.CollectionsKt.emptyList();
        }
        pairArr[0] = kotlin.TuplesKt.to("navBenefits", arrayList);
        java.util.List list2 = build;
        java.util.ArrayList arrayList3 = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(list2, 10));
        java.util.Iterator it2 = list2.iterator();
        while (it2.hasNext()) {
            arrayList3.add(((com.paypal.oslo.feature.shoppingrewards.shopping.common.domain.BenefitType) it2.next()).name());
        }
        pairArr[1] = kotlin.TuplesKt.to("modalBenefits", arrayList3);
        java.util.Set<com.paypal.oslo.feature.shoppingrewards.shopping.common.domain.BenefitType> keySet2 = offerDetails.getBnplMetadata().keySet();
        java.util.ArrayList arrayList4 = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(keySet2, 10));
        java.util.Iterator<T> it3 = keySet2.iterator();
        while (it3.hasNext()) {
            arrayList4.add(((com.paypal.oslo.feature.shoppingrewards.shopping.common.domain.BenefitType) it3.next()).name());
        }
        pairArr[2] = kotlin.TuplesKt.to("bnplMetadataKeys", arrayList4);
        pairArr[3] = kotlin.TuplesKt.to("merchantName", offerDetails.getMerchantName());
        pairArr[4] = kotlin.TuplesKt.to("percentBack", offerDetails.getBenefitsMetadata().getPercentBack());
        com.paypal.android.logger.Logger.d$default(logger, "FetchBenefitDetails: building benefit cards", kotlin.collections.MapsKt.mapOf(pairArr), null, 4, null);
        java.util.List<com.paypal.oslo.feature.shoppingrewards.shopping.common.domain.BenefitType> benefits3 = offerDetails.getBenefits();
        if (benefits3 == null) {
            benefits3 = kotlin.collections.CollectionsKt.emptyList();
        }
        boolean contains4 = benefits3.contains(com.paypal.oslo.feature.shoppingrewards.shopping.common.domain.BenefitType.ZERO_APR);
        java.util.ArrayList arrayList5 = new java.util.ArrayList();
        java.util.Iterator it4 = list2.iterator();
        while (it4.hasNext()) {
            switch (com.paypal.oslo.feature.shoppingrewards.shopping.common.domain.usecase.FetchBenefitDetailsUseCase.WhenMappings.$EnumSwitchMapping$0[((com.paypal.oslo.feature.shoppingrewards.shopping.common.domain.BenefitType) it4.next()).ordinal()]) {
                case 1:
                    payIn4Card = this.getHighSpeedVideoFpsRanges.getPayIn4Card(offerDetails.getSecureId(), contains4);
                    break;
                case 2:
                    payIn4Card = this.getHighSpeedVideoFpsRanges.getZeroAprCard(offerDetails.getBnplMetadata().get(com.paypal.oslo.feature.shoppingrewards.shopping.common.domain.BenefitType.ZERO_APR), contains4);
                    break;
                case 3:
                    payIn4Card = this.getHighSpeedVideoFpsRanges.getPayMonthlyCard(offerDetails.getBnplMetadata().get(com.paypal.oslo.feature.shoppingrewards.shopping.common.domain.BenefitType.PAY_MONTHLY), offerDetails.getSecureId(), contains4);
                    break;
                case 4:
                    payIn4Card = this.getHighSpeedVideoFpsRanges.getCashbackCard(offerDetails);
                    break;
                case 5:
                    payIn4Card = com.paypal.oslo.feature.shoppingrewards.shopping.common.domain.IabBenefitCardBuilder.getPayLaterGeneric$default(this.getHighSpeedVideoFpsRanges, null, 1, null);
                    break;
                case 6:
                case 7:
                case 8:
                    payIn4Card = null;
                    break;
                default:
                    throw new kotlin.NoWhenBranchMatchedException();
            }
            if (payIn4Card != null) {
                arrayList5.add(payIn4Card);
            }
        }
        java.util.ArrayList arrayList6 = arrayList5;
        com.paypal.android.logger.Logger.d$default(com.paypal.oslo.feature.shoppingrewards.LoggerKt.log, "FetchBenefitDetails: benefit cards built", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("outputCardCount", java.lang.Integer.valueOf(arrayList6.size()))), null, 4, null);
        return new com.paypal.oslo.feature.shoppingrewards.shopping.common.domain.IabBenefitDetails(this.getHighSpeedVideoFpsRanges.buildTitleModal(offerDetails.getBenefits(), offerDetails.getMerchantName()), arrayList6);
    }

    @kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[com.paypal.oslo.feature.shoppingrewards.shopping.common.domain.BenefitType.values().length];
            try {
                iArr[com.paypal.oslo.feature.shoppingrewards.shopping.common.domain.BenefitType.PAY_IN_4.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[com.paypal.oslo.feature.shoppingrewards.shopping.common.domain.BenefitType.ZERO_APR.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                iArr[com.paypal.oslo.feature.shoppingrewards.shopping.common.domain.BenefitType.PAY_MONTHLY.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            try {
                iArr[com.paypal.oslo.feature.shoppingrewards.shopping.common.domain.BenefitType.PROMO_CASHBACK.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
            try {
                iArr[com.paypal.oslo.feature.shoppingrewards.shopping.common.domain.BenefitType.PAY_LATER_GENERIC.ordinal()] = 5;
            } catch (java.lang.NoSuchFieldError unused5) {
            }
            try {
                iArr[com.paypal.oslo.feature.shoppingrewards.shopping.common.domain.BenefitType.PROMO_POINTS.ordinal()] = 6;
            } catch (java.lang.NoSuchFieldError unused6) {
            }
            try {
                iArr[com.paypal.oslo.feature.shoppingrewards.shopping.common.domain.BenefitType.PROMO_REWARDS.ordinal()] = 7;
            } catch (java.lang.NoSuchFieldError unused7) {
            }
            try {
                iArr[com.paypal.oslo.feature.shoppingrewards.shopping.common.domain.BenefitType.FALLBACK.ordinal()] = 8;
            } catch (java.lang.NoSuchFieldError unused8) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }
}
