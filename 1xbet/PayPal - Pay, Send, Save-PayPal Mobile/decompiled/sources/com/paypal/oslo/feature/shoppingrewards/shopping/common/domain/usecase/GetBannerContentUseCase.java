package com.paypal.oslo.feature.shoppingrewards.shopping.common.domain.usecase;

@kotlin.Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0086\u0002¢\u0006\u0004\b\u0007\u0010\bR\u0014\u0010\u000b\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\n"}, d2 = {"Lcom/paypal/oslo/feature/shoppingrewards/shopping/common/domain/usecase/GetBannerContentUseCase;", "", "<init>", "()V", "Lcom/paypal/oslo/feature/shoppingrewards/shopping/common/domain/IabOfferDetails;", "offerDetails", "Lcom/paypal/oslo/feature/shoppingrewards/shopping/common/domain/BannerContentData;", "invoke", "(Lcom/paypal/oslo/feature/shoppingrewards/shopping/common/domain/IabOfferDetails;)Lcom/paypal/oslo/feature/shoppingrewards/shopping/common/domain/BannerContentData;", "getHighSpeedVideoFpsRanges", "Lcom/paypal/oslo/feature/shoppingrewards/shopping/common/domain/BannerContentData;", "getHighResolutionOutputSizeshNQ4ISI"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class GetBannerContentUseCase {
    public static final int $stable = 0;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.shoppingrewards.shopping.common.domain.BannerContentData getHighResolutionOutputSizeshNQ4ISI;

    @javax.inject.Inject
    public GetBannerContentUseCase() {
        int i = com.paypal.oslo.feature.shoppingrewards.R.string.feature_shopping_rewards_iab_banner_fallback;
        this.getHighResolutionOutputSizeshNQ4ISI = new com.paypal.oslo.feature.shoppingrewards.shopping.common.domain.BannerContentData(java.lang.Integer.valueOf(i), null, 0, true, com.paypal.oslo.feature.shoppingrewards.shopping.common.domain.BannerCtaMode.Hidden, 6, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x009a A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:15:? A[LOOP:0: B:4:0x0012->B:15:?, LOOP_END, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final com.paypal.oslo.feature.shoppingrewards.shopping.common.domain.BannerContentData invoke(com.paypal.oslo.feature.shoppingrewards.shopping.common.domain.IabOfferDetails offerDetails) {
        com.paypal.oslo.feature.shoppingrewards.shopping.common.domain.BannerContentData bannerContentData;
        com.paypal.oslo.feature.shoppingrewards.shopping.common.domain.BannerContentData bannerContentData2;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(offerDetails, "");
        java.util.List<com.paypal.oslo.feature.shoppingrewards.shopping.common.domain.BenefitType> benefits = offerDetails.getBenefits();
        if (benefits != null) {
            java.util.Iterator<T> it = benefits.iterator();
            while (true) {
                if (it.hasNext()) {
                    switch (com.paypal.oslo.feature.shoppingrewards.shopping.common.domain.usecase.GetBannerContentUseCase.WhenMappings.$EnumSwitchMapping$0[((com.paypal.oslo.feature.shoppingrewards.shopping.common.domain.BenefitType) it.next()).ordinal()]) {
                        case 1:
                            bannerContentData2 = new com.paypal.oslo.feature.shoppingrewards.shopping.common.domain.BannerContentData(java.lang.Integer.valueOf(com.paypal.oslo.feature.shoppingrewards.R.string.feature_shopping_rewards_iab_banner_pay_later), null, 0, true, null, 22, null);
                            bannerContentData = bannerContentData2;
                            if (bannerContentData == null) {
                                break;
                            }
                        case 2:
                            bannerContentData2 = new com.paypal.oslo.feature.shoppingrewards.shopping.common.domain.BannerContentData(java.lang.Integer.valueOf(com.paypal.oslo.feature.shoppingrewards.R.string.feature_shopping_rewards_iab_banner_pay_later_generic), null, 0, true, null, 22, null);
                            bannerContentData = bannerContentData2;
                            if (bannerContentData == null) {
                            }
                            break;
                        case 3:
                            bannerContentData2 = new com.paypal.oslo.feature.shoppingrewards.shopping.common.domain.BannerContentData(java.lang.Integer.valueOf(com.paypal.oslo.feature.shoppingrewards.R.string.feature_shopping_rewards_iab_banner_pay_in_4), null, 0, true, null, 22, null);
                            bannerContentData = bannerContentData2;
                            if (bannerContentData == null) {
                            }
                            break;
                        case 4:
                        case 5:
                            bannerContentData2 = new com.paypal.oslo.feature.shoppingrewards.shopping.common.domain.BannerContentData(java.lang.Integer.valueOf(com.paypal.oslo.feature.shoppingrewards.R.string.feature_shopping_rewards_iab_banner_pay_monthly), null, 0, true, null, 22, null);
                            bannerContentData = bannerContentData2;
                            if (bannerContentData == null) {
                            }
                            break;
                        case 6:
                        case 7:
                            bannerContentData2 = new com.paypal.oslo.feature.shoppingrewards.shopping.common.domain.BannerContentData(java.lang.Integer.valueOf(com.paypal.oslo.feature.shoppingrewards.R.string.feature_shopping_rewards_iab_banner_earn_points_pp_plus), null, 0, true, null, 22, null);
                            bannerContentData = bannerContentData2;
                            if (bannerContentData == null) {
                            }
                            break;
                        case 8:
                            bannerContentData = this.getHighResolutionOutputSizeshNQ4ISI;
                            if (bannerContentData == null) {
                            }
                            break;
                        default:
                            throw new kotlin.NoWhenBranchMatchedException();
                    }
                } else {
                    bannerContentData = null;
                }
            }
            if (bannerContentData != null) {
                return bannerContentData;
            }
        }
        java.lang.String honeyStoreId = offerDetails.getHoneyStoreId();
        if (honeyStoreId == null || kotlin.text.StringsKt.isBlank(honeyStoreId)) {
            return null;
        }
        return this.getHighResolutionOutputSizeshNQ4ISI;
    }

    @kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[com.paypal.oslo.feature.shoppingrewards.shopping.common.domain.BenefitType.values().length];
            try {
                iArr[com.paypal.oslo.feature.shoppingrewards.shopping.common.domain.BenefitType.PROMO_REWARDS.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[com.paypal.oslo.feature.shoppingrewards.shopping.common.domain.BenefitType.PAY_LATER_GENERIC.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                iArr[com.paypal.oslo.feature.shoppingrewards.shopping.common.domain.BenefitType.PAY_IN_4.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            try {
                iArr[com.paypal.oslo.feature.shoppingrewards.shopping.common.domain.BenefitType.ZERO_APR.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
            try {
                iArr[com.paypal.oslo.feature.shoppingrewards.shopping.common.domain.BenefitType.PAY_MONTHLY.ordinal()] = 5;
            } catch (java.lang.NoSuchFieldError unused5) {
            }
            try {
                iArr[com.paypal.oslo.feature.shoppingrewards.shopping.common.domain.BenefitType.PROMO_POINTS.ordinal()] = 6;
            } catch (java.lang.NoSuchFieldError unused6) {
            }
            try {
                iArr[com.paypal.oslo.feature.shoppingrewards.shopping.common.domain.BenefitType.PROMO_CASHBACK.ordinal()] = 7;
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
