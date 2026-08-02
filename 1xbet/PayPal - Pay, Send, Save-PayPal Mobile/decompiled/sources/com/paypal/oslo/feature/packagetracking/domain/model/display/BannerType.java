package com.paypal.oslo.feature.packagetracking.domain.model.display;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0014\b\u0080\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0019\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u0017\u0010\b\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000bR\u001a\u0010\f\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017j\u0002\b\u0018"}, d2 = {"Lcom/paypal/oslo/feature/packagetracking/domain/model/display/BannerType;", "", "Lcom/paypal/oslo/feature/packagetracking/domain/model/display/BannerStyle;", "p0", "Lcom/paypal/oslo/feature/packagetracking/domain/model/display/BannerAction;", "p1", "<init>", "(Ljava/lang/String;ILcom/paypal/oslo/feature/packagetracking/domain/model/display/BannerStyle;Lcom/paypal/oslo/feature/packagetracking/domain/model/display/BannerAction;)V", com.adobe.marketing.mobile.messaging.MessagingConstants.ContentCard.UIKeys.STYLE, "Lcom/paypal/oslo/feature/packagetracking/domain/model/display/BannerStyle;", "getStyle", "()Lcom/paypal/oslo/feature/packagetracking/domain/model/display/BannerStyle;", "action", "Lcom/paypal/oslo/feature/packagetracking/domain/model/display/BannerAction;", "getAction", "()Lcom/paypal/oslo/feature/packagetracking/domain/model/display/BannerAction;", "REMOVE_PACKAGE", "UNLINK_BY_SYSTEM", "UNLINK_BY_USER", "WARNING_BANNER", "INFO_BANNER", "RENAME_PACKAGE_FAILED", "MARK_AS_DELIVERED_FAILED", "AMAZON_TRACKING_TOGGLE_FAILED", "NONE"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class BannerType {
    public static final com.paypal.oslo.feature.packagetracking.domain.model.display.BannerType AMAZON_TRACKING_TOGGLE_FAILED;
    private static final /* synthetic */ com.paypal.oslo.feature.packagetracking.domain.model.display.BannerType[] Camera2StreamConfigurationMap;
    public static final com.paypal.oslo.feature.packagetracking.domain.model.display.BannerType INFO_BANNER;
    public static final com.paypal.oslo.feature.packagetracking.domain.model.display.BannerType MARK_AS_DELIVERED_FAILED;
    public static final com.paypal.oslo.feature.packagetracking.domain.model.display.BannerType NONE;
    public static final com.paypal.oslo.feature.packagetracking.domain.model.display.BannerType REMOVE_PACKAGE;
    public static final com.paypal.oslo.feature.packagetracking.domain.model.display.BannerType RENAME_PACKAGE_FAILED;
    public static final com.paypal.oslo.feature.packagetracking.domain.model.display.BannerType UNLINK_BY_SYSTEM;
    public static final com.paypal.oslo.feature.packagetracking.domain.model.display.BannerType UNLINK_BY_USER;
    public static final com.paypal.oslo.feature.packagetracking.domain.model.display.BannerType WARNING_BANNER;
    private static final /* synthetic */ kotlin.enums.EnumEntries getHighResolutionOutputSizeshNQ4ISI;
    private final com.paypal.oslo.feature.packagetracking.domain.model.display.BannerAction action;
    private final com.paypal.oslo.feature.packagetracking.domain.model.display.BannerStyle style;

    private BannerType(java.lang.String str, int i, com.paypal.oslo.feature.packagetracking.domain.model.display.BannerStyle bannerStyle, com.paypal.oslo.feature.packagetracking.domain.model.display.BannerAction bannerAction) {
        this.style = bannerStyle;
        this.action = bannerAction;
    }

    public final com.paypal.oslo.feature.packagetracking.domain.model.display.BannerAction getAction() {
        return this.action;
    }

    public final com.paypal.oslo.feature.packagetracking.domain.model.display.BannerStyle getStyle() {
        return this.style;
    }

    static {
        com.paypal.oslo.feature.packagetracking.domain.model.display.BannerType bannerType = new com.paypal.oslo.feature.packagetracking.domain.model.display.BannerType("REMOVE_PACKAGE", 0, com.paypal.oslo.feature.packagetracking.domain.model.display.BannerStyle.ERROR, com.paypal.oslo.feature.packagetracking.domain.model.display.BannerAction.CLOSE);
        REMOVE_PACKAGE = bannerType;
        com.paypal.oslo.feature.packagetracking.domain.model.display.BannerType bannerType2 = new com.paypal.oslo.feature.packagetracking.domain.model.display.BannerType("UNLINK_BY_SYSTEM", 1, com.paypal.oslo.feature.packagetracking.domain.model.display.BannerStyle.ERROR, com.paypal.oslo.feature.packagetracking.domain.model.display.BannerAction.NAVIGATION);
        UNLINK_BY_SYSTEM = bannerType2;
        com.paypal.oslo.feature.packagetracking.domain.model.display.BannerType bannerType3 = new com.paypal.oslo.feature.packagetracking.domain.model.display.BannerType("UNLINK_BY_USER", 2, com.paypal.oslo.feature.packagetracking.domain.model.display.BannerStyle.ERROR, com.paypal.oslo.feature.packagetracking.domain.model.display.BannerAction.NAVIGATION);
        UNLINK_BY_USER = bannerType3;
        com.paypal.oslo.feature.packagetracking.domain.model.display.BannerType bannerType4 = new com.paypal.oslo.feature.packagetracking.domain.model.display.BannerType("WARNING_BANNER", 3, com.paypal.oslo.feature.packagetracking.domain.model.display.BannerStyle.WARNING, com.paypal.oslo.feature.packagetracking.domain.model.display.BannerAction.CLOSE);
        WARNING_BANNER = bannerType4;
        com.paypal.oslo.feature.packagetracking.domain.model.display.BannerType bannerType5 = new com.paypal.oslo.feature.packagetracking.domain.model.display.BannerType("INFO_BANNER", 4, com.paypal.oslo.feature.packagetracking.domain.model.display.BannerStyle.INFO, com.paypal.oslo.feature.packagetracking.domain.model.display.BannerAction.NONE);
        INFO_BANNER = bannerType5;
        com.paypal.oslo.feature.packagetracking.domain.model.display.BannerType bannerType6 = new com.paypal.oslo.feature.packagetracking.domain.model.display.BannerType("RENAME_PACKAGE_FAILED", 5, com.paypal.oslo.feature.packagetracking.domain.model.display.BannerStyle.ERROR, com.paypal.oslo.feature.packagetracking.domain.model.display.BannerAction.CLOSE);
        RENAME_PACKAGE_FAILED = bannerType6;
        com.paypal.oslo.feature.packagetracking.domain.model.display.BannerType bannerType7 = new com.paypal.oslo.feature.packagetracking.domain.model.display.BannerType("MARK_AS_DELIVERED_FAILED", 6, com.paypal.oslo.feature.packagetracking.domain.model.display.BannerStyle.ERROR, com.paypal.oslo.feature.packagetracking.domain.model.display.BannerAction.CLOSE);
        MARK_AS_DELIVERED_FAILED = bannerType7;
        com.paypal.oslo.feature.packagetracking.domain.model.display.BannerType bannerType8 = new com.paypal.oslo.feature.packagetracking.domain.model.display.BannerType("AMAZON_TRACKING_TOGGLE_FAILED", 7, com.paypal.oslo.feature.packagetracking.domain.model.display.BannerStyle.ERROR, com.paypal.oslo.feature.packagetracking.domain.model.display.BannerAction.CLOSE);
        AMAZON_TRACKING_TOGGLE_FAILED = bannerType8;
        com.paypal.oslo.feature.packagetracking.domain.model.display.BannerType bannerType9 = new com.paypal.oslo.feature.packagetracking.domain.model.display.BannerType("NONE", 8, com.paypal.oslo.feature.packagetracking.domain.model.display.BannerStyle.NONE, com.paypal.oslo.feature.packagetracking.domain.model.display.BannerAction.NONE);
        NONE = bannerType9;
        com.paypal.oslo.feature.packagetracking.domain.model.display.BannerType[] bannerTypeArr = {bannerType, bannerType2, bannerType3, bannerType4, bannerType5, bannerType6, bannerType7, bannerType8, bannerType9};
        Camera2StreamConfigurationMap = bannerTypeArr;
        getHighResolutionOutputSizeshNQ4ISI = kotlin.enums.EnumEntriesKt.enumEntries(bannerTypeArr);
    }

    public static com.paypal.oslo.feature.packagetracking.domain.model.display.BannerType[] values() {
        return (com.paypal.oslo.feature.packagetracking.domain.model.display.BannerType[]) Camera2StreamConfigurationMap.clone();
    }

    public static com.paypal.oslo.feature.packagetracking.domain.model.display.BannerType valueOf(java.lang.String str) {
        return (com.paypal.oslo.feature.packagetracking.domain.model.display.BannerType) java.lang.Enum.valueOf(com.paypal.oslo.feature.packagetracking.domain.model.display.BannerType.class, str);
    }

    public static kotlin.enums.EnumEntries<com.paypal.oslo.feature.packagetracking.domain.model.display.BannerType> getEntries() {
        return getHighResolutionOutputSizeshNQ4ISI;
    }
}
