package com.paypal.oslo.feature.shoppingrewards.shopping.common.domain.usecase;

@kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0019\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0018\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0086\u0002¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u000f\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0014\u0010\u0010\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011"}, d2 = {"Lcom/paypal/oslo/feature/shoppingrewards/shopping/common/domain/usecase/FetchInterstitialDetailsUseCase;", "", "Lcom/paypal/oslo/feature/shoppingrewards/shopping/common/domain/IabBenefitCardBuilder;", "cardBuilder", "Lcom/paypal/oslo/feature/shoppingrewards/shared/domain/usecase/StringResourceProvider;", "stringProvider", "<init>", "(Lcom/paypal/oslo/feature/shoppingrewards/shopping/common/domain/IabBenefitCardBuilder;Lcom/paypal/oslo/feature/shoppingrewards/shared/domain/usecase/StringResourceProvider;)V", "Lcom/paypal/oslo/feature/shoppingrewards/shopping/common/domain/IabOfferDetails;", "offerDetails", "Lcom/paypal/oslo/feature/shoppingrewards/shopping/common/domain/IabInterstitialDetails;", "invoke", "(Lcom/paypal/oslo/feature/shoppingrewards/shopping/common/domain/IabOfferDetails;)Lcom/paypal/oslo/feature/shoppingrewards/shopping/common/domain/IabInterstitialDetails;", "getHighSpeedVideoFpsRanges", "Lcom/paypal/oslo/feature/shoppingrewards/shopping/common/domain/IabBenefitCardBuilder;", "getHighSpeedVideoSizes", "Camera2StreamConfigurationMap", "Lcom/paypal/oslo/feature/shoppingrewards/shared/domain/usecase/StringResourceProvider;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class FetchInterstitialDetailsUseCase {
    public static final int $stable = 8;
    private final com.paypal.oslo.feature.shoppingrewards.shared.domain.usecase.StringResourceProvider Camera2StreamConfigurationMap;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.shoppingrewards.shopping.common.domain.IabBenefitCardBuilder getHighSpeedVideoSizes;

    @javax.inject.Inject
    public FetchInterstitialDetailsUseCase(com.paypal.oslo.feature.shoppingrewards.shopping.common.domain.IabBenefitCardBuilder iabBenefitCardBuilder, com.paypal.oslo.feature.shoppingrewards.shared.domain.usecase.StringResourceProvider stringResourceProvider) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(iabBenefitCardBuilder, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(stringResourceProvider, "");
        this.getHighSpeedVideoSizes = iabBenefitCardBuilder;
        this.Camera2StreamConfigurationMap = stringResourceProvider;
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0086  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final com.paypal.oslo.feature.shoppingrewards.shopping.common.domain.IabInterstitialDetails invoke(final com.paypal.oslo.feature.shoppingrewards.shopping.common.domain.IabOfferDetails offerDetails) {
        java.util.List list;
        com.paypal.oslo.feature.shoppingrewards.shopping.common.domain.BenefitType benefitType;
        com.paypal.oslo.feature.shoppingrewards.shopping.common.domain.BenefitData benefitData;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(offerDetails, "");
        java.util.List<com.paypal.oslo.feature.shoppingrewards.shopping.common.domain.BenefitType> benefits = offerDetails.getBenefits();
        java.util.ArrayList arrayList = null;
        if (benefits != null) {
            java.util.List<com.paypal.oslo.feature.shoppingrewards.shopping.common.domain.BenefitType> list2 = benefits;
            java.util.ArrayList arrayList2 = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(list2, 10));
            for (com.paypal.oslo.feature.shoppingrewards.shopping.common.domain.BenefitType benefitType2 : list2) {
                int i = com.paypal.oslo.feature.shoppingrewards.shopping.common.domain.usecase.FetchInterstitialDetailsUseCase.WhenMappings.$EnumSwitchMapping$0[benefitType2.ordinal()];
                if (i == 1 || i == 2) {
                    benefitType2 = com.paypal.oslo.feature.shoppingrewards.shopping.common.domain.BenefitType.PAY_LATER_GENERIC;
                }
                arrayList2.add(benefitType2);
            }
            list = kotlin.collections.CollectionsKt.distinct(arrayList2);
        } else {
            list = null;
        }
        if (list != null) {
            java.util.List list3 = list.size() == 1 ? list : null;
            if (list3 != null) {
                benefitType = (com.paypal.oslo.feature.shoppingrewards.shopping.common.domain.BenefitType) list3.get(0);
                if (benefitType == com.paypal.oslo.feature.shoppingrewards.shopping.common.domain.BenefitType.PAY_LATER_GENERIC) {
                    java.util.List<com.paypal.oslo.feature.shoppingrewards.shopping.common.domain.BenefitType> benefits2 = offerDetails.getBenefits();
                    if (benefits2 == null) {
                        benefits2 = kotlin.collections.CollectionsKt.emptyList();
                    }
                    boolean contains = benefits2.contains(com.paypal.oslo.feature.shoppingrewards.shopping.common.domain.BenefitType.ZERO_APR);
                    if (list != null) {
                        java.util.ArrayList arrayList3 = new java.util.ArrayList();
                        java.util.Iterator it = list.iterator();
                        while (it.hasNext()) {
                            switch (com.paypal.oslo.feature.shoppingrewards.shopping.common.domain.usecase.FetchInterstitialDetailsUseCase.WhenMappings.$EnumSwitchMapping$0[((com.paypal.oslo.feature.shoppingrewards.shopping.common.domain.BenefitType) it.next()).ordinal()]) {
                                case 1:
                                case 2:
                                case 6:
                                case 7:
                                case 8:
                                    benefitData = null;
                                    break;
                                case 3:
                                    benefitData = com.paypal.oslo.feature.shoppingrewards.shopping.common.domain.IabBenefitCardBuilder.getZeroAprCard$default(this.getHighSpeedVideoSizes, null, contains, 1, null);
                                    break;
                                case 4:
                                    benefitData = this.getHighSpeedVideoSizes.getCashbackCard(offerDetails);
                                    break;
                                case 5:
                                    benefitData = com.paypal.oslo.feature.shoppingrewards.shopping.common.domain.IabBenefitCardBuilder.getPayLaterGeneric$default(this.getHighSpeedVideoSizes, null, 1, null);
                                    break;
                                default:
                                    throw new kotlin.NoWhenBranchMatchedException();
                            }
                            if (benefitData != null) {
                                arrayList3.add(benefitData);
                            }
                        }
                        arrayList = arrayList3;
                    }
                    java.util.ArrayList arrayList4 = arrayList;
                    java.util.ArrayList arrayList5 = arrayList4;
                    if (arrayList5 != null && !arrayList5.isEmpty()) {
                        return new com.paypal.oslo.feature.shoppingrewards.shopping.common.domain.IabInterstitialDetails(this.getHighSpeedVideoSizes.buildTitle(offerDetails.getBenefits(), offerDetails.getMerchantName()), null, null, null, arrayList4, 14, null);
                    }
                    return new com.paypal.oslo.feature.shoppingrewards.shopping.common.domain.IabInterstitialDetails(com.paypal.pds.core.RichText.INSTANCE.invoke(new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.shoppingrewards.shopping.common.domain.usecase.FetchInterstitialDetailsUseCase$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function1
                        public final java.lang.Object invoke(java.lang.Object obj) {
                            return com.paypal.oslo.feature.shoppingrewards.shopping.common.domain.usecase.FetchInterstitialDetailsUseCase.m19611$r8$lambda$xuTJjtN1V4pY2pdZcTHkTUJh0(com.paypal.oslo.feature.shoppingrewards.shopping.common.domain.usecase.FetchInterstitialDetailsUseCase.this, offerDetails, (com.paypal.pds.core.Builder) obj);
                        }
                    }), this.Camera2StreamConfigurationMap.getString(com.paypal.oslo.feature.shoppingrewards.R.string.feature_shopping_rewards_promotions_fallback_description), null, null, null, 28, null);
                }
                return new com.paypal.oslo.feature.shoppingrewards.shopping.common.domain.IabInterstitialDetails(this.getHighSpeedVideoSizes.buildTitle(offerDetails.getBenefits(), offerDetails.getMerchantName()), this.Camera2StreamConfigurationMap.getString(com.paypal.oslo.feature.shoppingrewards.R.string.feature_shopping_rewards_benefits_pay_later_description), null, null, null, 28, null);
            }
        }
        benefitType = null;
        if (benefitType == com.paypal.oslo.feature.shoppingrewards.shopping.common.domain.BenefitType.PAY_LATER_GENERIC) {
        }
    }

    /* renamed from: $r8$lambda$xuTJjtN1V4pY2pd-ZcTHkTUJ-h0, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m19611$r8$lambda$xuTJjtN1V4pY2pdZcTHkTUJh0(com.paypal.oslo.feature.shoppingrewards.shopping.common.domain.usecase.FetchInterstitialDetailsUseCase fetchInterstitialDetailsUseCase, com.paypal.oslo.feature.shoppingrewards.shopping.common.domain.IabOfferDetails iabOfferDetails, com.paypal.pds.core.Builder builder) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(builder, "");
        com.paypal.pds.core.Builder.append$default(builder, fetchInterstitialDetailsUseCase.Camera2StreamConfigurationMap.getString(com.paypal.oslo.feature.shoppingrewards.R.string.feature_shopping_rewards_promotions_fallback_title), com.paypal.pds.core.Color.ContentBase.INSTANCE, false, 4, null);
        java.lang.String merchantName = iabOfferDetails.getMerchantName();
        com.paypal.pds.core.Builder.append$default(builder, " ".concat(java.lang.String.valueOf(merchantName != null ? merchantName : "")), com.paypal.pds.core.Color.ContentRoleBaseInfo.INSTANCE, false, 4, null);
        return kotlin.Unit.INSTANCE;
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
                iArr[com.paypal.oslo.feature.shoppingrewards.shopping.common.domain.BenefitType.PAY_MONTHLY.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                iArr[com.paypal.oslo.feature.shoppingrewards.shopping.common.domain.BenefitType.ZERO_APR.ordinal()] = 3;
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
