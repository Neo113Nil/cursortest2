package com.paypal.oslo.feature.shoppingrewards.shopping.common.domain;

@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u001f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0000*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u0000¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "Lcom/paypal/oslo/feature/shoppingrewards/api/shopping/navigation/NavBenefitType;", "Lcom/paypal/oslo/feature/shoppingrewards/shopping/common/domain/BenefitType;", "toInternalBenefitTypes", "(Ljava/util/List;)Ljava/util/List;"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class IabOfferDetailsKt {
    public static final java.util.List<com.paypal.oslo.feature.shoppingrewards.shopping.common.domain.BenefitType> toInternalBenefitTypes(java.util.List<? extends com.paypal.oslo.feature.shoppingrewards.api.shopping.navigation.NavBenefitType> list) {
        com.paypal.oslo.feature.shoppingrewards.shopping.common.domain.BenefitType benefitType;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
        java.util.List<? extends com.paypal.oslo.feature.shoppingrewards.api.shopping.navigation.NavBenefitType> list2 = list;
        java.util.ArrayList arrayList = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(list2, 10));
        java.util.Iterator<T> it = list2.iterator();
        while (it.hasNext()) {
            switch (com.paypal.oslo.feature.shoppingrewards.shopping.common.domain.IabOfferDetailsKt.WhenMappings.$EnumSwitchMapping$0[((com.paypal.oslo.feature.shoppingrewards.api.shopping.navigation.NavBenefitType) it.next()).ordinal()]) {
                case 1:
                    benefitType = com.paypal.oslo.feature.shoppingrewards.shopping.common.domain.BenefitType.ZERO_APR;
                    break;
                case 2:
                    benefitType = com.paypal.oslo.feature.shoppingrewards.shopping.common.domain.BenefitType.PAY_IN_4;
                    break;
                case 3:
                    benefitType = com.paypal.oslo.feature.shoppingrewards.shopping.common.domain.BenefitType.PAY_MONTHLY;
                    break;
                case 4:
                    benefitType = com.paypal.oslo.feature.shoppingrewards.shopping.common.domain.BenefitType.PROMO_CASHBACK;
                    break;
                case 5:
                    benefitType = com.paypal.oslo.feature.shoppingrewards.shopping.common.domain.BenefitType.PAY_LATER_GENERIC;
                    break;
                case 6:
                case 7:
                    benefitType = com.paypal.oslo.feature.shoppingrewards.shopping.common.domain.BenefitType.FALLBACK;
                    break;
                default:
                    throw new kotlin.NoWhenBranchMatchedException();
            }
            arrayList.add(benefitType);
        }
        java.util.ArrayList arrayList2 = arrayList;
        java.util.ArrayList arrayList3 = new java.util.ArrayList();
        for (java.lang.Object obj : arrayList2) {
            if (((com.paypal.oslo.feature.shoppingrewards.shopping.common.domain.BenefitType) obj) != com.paypal.oslo.feature.shoppingrewards.shopping.common.domain.BenefitType.FALLBACK) {
                arrayList3.add(obj);
            }
        }
        java.util.ArrayList arrayList4 = arrayList3;
        return !arrayList4.isEmpty() ? arrayList4 : arrayList2;
    }

    @kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[com.paypal.oslo.feature.shoppingrewards.api.shopping.navigation.NavBenefitType.values().length];
            try {
                iArr[com.paypal.oslo.feature.shoppingrewards.api.shopping.navigation.NavBenefitType.ZERO_APR.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[com.paypal.oslo.feature.shoppingrewards.api.shopping.navigation.NavBenefitType.PAY_IN_4.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                iArr[com.paypal.oslo.feature.shoppingrewards.api.shopping.navigation.NavBenefitType.PAY_MONTHLY.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            try {
                iArr[com.paypal.oslo.feature.shoppingrewards.api.shopping.navigation.NavBenefitType.MERCHANT_OFFER_PERCENT.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
            try {
                iArr[com.paypal.oslo.feature.shoppingrewards.api.shopping.navigation.NavBenefitType.PAY_LATER_GENERIC.ordinal()] = 5;
            } catch (java.lang.NoSuchFieldError unused5) {
            }
            try {
                iArr[com.paypal.oslo.feature.shoppingrewards.api.shopping.navigation.NavBenefitType.ACCEPTS_PAYPAL.ordinal()] = 6;
            } catch (java.lang.NoSuchFieldError unused6) {
            }
            try {
                iArr[com.paypal.oslo.feature.shoppingrewards.api.shopping.navigation.NavBenefitType.SPONSORED.ordinal()] = 7;
            } catch (java.lang.NoSuchFieldError unused7) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }
}
