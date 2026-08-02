package com.paypal.oslo.feature.packagetracking.domain.model.display;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0080\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006"}, d2 = {"Lcom/paypal/oslo/feature/packagetracking/domain/model/display/BannerAction;", "", "<init>", "(Ljava/lang/String;I)V", com.statsig.androidsdk.HttpUtils.CONNECTION_HEADER_CLOSE, "NAVIGATION", "NONE"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class BannerAction {
    public static final com.paypal.oslo.feature.packagetracking.domain.model.display.BannerAction CLOSE;
    public static final com.paypal.oslo.feature.packagetracking.domain.model.display.BannerAction NAVIGATION;
    public static final com.paypal.oslo.feature.packagetracking.domain.model.display.BannerAction NONE;
    private static final /* synthetic */ com.paypal.oslo.feature.packagetracking.domain.model.display.BannerAction[] getHighSpeedVideoFpsRanges;
    private static final /* synthetic */ kotlin.enums.EnumEntries getHighSpeedVideoSizes;

    private BannerAction(java.lang.String str, int i) {
    }

    static {
        com.paypal.oslo.feature.packagetracking.domain.model.display.BannerAction bannerAction = new com.paypal.oslo.feature.packagetracking.domain.model.display.BannerAction(com.statsig.androidsdk.HttpUtils.CONNECTION_HEADER_CLOSE, 0);
        CLOSE = bannerAction;
        com.paypal.oslo.feature.packagetracking.domain.model.display.BannerAction bannerAction2 = new com.paypal.oslo.feature.packagetracking.domain.model.display.BannerAction("NAVIGATION", 1);
        NAVIGATION = bannerAction2;
        com.paypal.oslo.feature.packagetracking.domain.model.display.BannerAction bannerAction3 = new com.paypal.oslo.feature.packagetracking.domain.model.display.BannerAction("NONE", 2);
        NONE = bannerAction3;
        com.paypal.oslo.feature.packagetracking.domain.model.display.BannerAction[] bannerActionArr = {bannerAction, bannerAction2, bannerAction3};
        getHighSpeedVideoFpsRanges = bannerActionArr;
        getHighSpeedVideoSizes = kotlin.enums.EnumEntriesKt.enumEntries(bannerActionArr);
    }

    public static com.paypal.oslo.feature.packagetracking.domain.model.display.BannerAction[] values() {
        return (com.paypal.oslo.feature.packagetracking.domain.model.display.BannerAction[]) getHighSpeedVideoFpsRanges.clone();
    }

    public static com.paypal.oslo.feature.packagetracking.domain.model.display.BannerAction valueOf(java.lang.String str) {
        return (com.paypal.oslo.feature.packagetracking.domain.model.display.BannerAction) java.lang.Enum.valueOf(com.paypal.oslo.feature.packagetracking.domain.model.display.BannerAction.class, str);
    }

    public static kotlin.enums.EnumEntries<com.paypal.oslo.feature.packagetracking.domain.model.display.BannerAction> getEntries() {
        return getHighSpeedVideoSizes;
    }
}
