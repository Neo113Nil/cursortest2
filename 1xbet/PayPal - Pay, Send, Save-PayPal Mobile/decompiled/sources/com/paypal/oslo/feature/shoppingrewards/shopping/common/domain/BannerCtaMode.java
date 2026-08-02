package com.paypal.oslo.feature.shoppingrewards.shopping.common.domain;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006"}, d2 = {"Lcom/paypal/oslo/feature/shoppingrewards/shopping/common/domain/BannerCtaMode;", "", "<init>", "(Ljava/lang/String;I)V", "Loading", com.paypal.oslo.feature.balance.common.BalanceConstants.StateNames.STATE_VISIBLE, "Hidden"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class BannerCtaMode {
    public static final com.paypal.oslo.feature.shoppingrewards.shopping.common.domain.BannerCtaMode Hidden;
    public static final com.paypal.oslo.feature.shoppingrewards.shopping.common.domain.BannerCtaMode Loading;
    public static final com.paypal.oslo.feature.shoppingrewards.shopping.common.domain.BannerCtaMode Visible;
    private static final /* synthetic */ kotlin.enums.EnumEntries getHighSpeedVideoFpsRangesFor;
    private static final /* synthetic */ com.paypal.oslo.feature.shoppingrewards.shopping.common.domain.BannerCtaMode[] getHighSpeedVideoSizes;

    private BannerCtaMode(java.lang.String str, int i) {
    }

    static {
        com.paypal.oslo.feature.shoppingrewards.shopping.common.domain.BannerCtaMode bannerCtaMode = new com.paypal.oslo.feature.shoppingrewards.shopping.common.domain.BannerCtaMode("Loading", 0);
        Loading = bannerCtaMode;
        com.paypal.oslo.feature.shoppingrewards.shopping.common.domain.BannerCtaMode bannerCtaMode2 = new com.paypal.oslo.feature.shoppingrewards.shopping.common.domain.BannerCtaMode(com.paypal.oslo.feature.balance.common.BalanceConstants.StateNames.STATE_VISIBLE, 1);
        Visible = bannerCtaMode2;
        com.paypal.oslo.feature.shoppingrewards.shopping.common.domain.BannerCtaMode bannerCtaMode3 = new com.paypal.oslo.feature.shoppingrewards.shopping.common.domain.BannerCtaMode("Hidden", 2);
        Hidden = bannerCtaMode3;
        com.paypal.oslo.feature.shoppingrewards.shopping.common.domain.BannerCtaMode[] bannerCtaModeArr = {bannerCtaMode, bannerCtaMode2, bannerCtaMode3};
        getHighSpeedVideoSizes = bannerCtaModeArr;
        getHighSpeedVideoFpsRangesFor = kotlin.enums.EnumEntriesKt.enumEntries(bannerCtaModeArr);
    }

    public static com.paypal.oslo.feature.shoppingrewards.shopping.common.domain.BannerCtaMode[] values() {
        return (com.paypal.oslo.feature.shoppingrewards.shopping.common.domain.BannerCtaMode[]) getHighSpeedVideoSizes.clone();
    }

    public static com.paypal.oslo.feature.shoppingrewards.shopping.common.domain.BannerCtaMode valueOf(java.lang.String str) {
        return (com.paypal.oslo.feature.shoppingrewards.shopping.common.domain.BannerCtaMode) java.lang.Enum.valueOf(com.paypal.oslo.feature.shoppingrewards.shopping.common.domain.BannerCtaMode.class, str);
    }

    public static kotlin.enums.EnumEntries<com.paypal.oslo.feature.shoppingrewards.shopping.common.domain.BannerCtaMode> getEntries() {
        return getHighSpeedVideoFpsRangesFor;
    }
}
