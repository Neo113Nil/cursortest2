package com.paypal.oslo.feature.packagetracking.domain.model.display;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0080\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007"}, d2 = {"Lcom/paypal/oslo/feature/packagetracking/domain/model/display/BannerStyle;", "", "<init>", "(Ljava/lang/String;I)V", "ERROR", "WARNING", "INFO", "NONE"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class BannerStyle {
    public static final com.paypal.oslo.feature.packagetracking.domain.model.display.BannerStyle ERROR;
    public static final com.paypal.oslo.feature.packagetracking.domain.model.display.BannerStyle INFO;
    public static final com.paypal.oslo.feature.packagetracking.domain.model.display.BannerStyle NONE;
    public static final com.paypal.oslo.feature.packagetracking.domain.model.display.BannerStyle WARNING;
    private static final /* synthetic */ com.paypal.oslo.feature.packagetracking.domain.model.display.BannerStyle[] getHighResolutionOutputSizeshNQ4ISI;
    private static final /* synthetic */ kotlin.enums.EnumEntries getHighSpeedVideoFpsRanges;

    private BannerStyle(java.lang.String str, int i) {
    }

    static {
        com.paypal.oslo.feature.packagetracking.domain.model.display.BannerStyle bannerStyle = new com.paypal.oslo.feature.packagetracking.domain.model.display.BannerStyle("ERROR", 0);
        ERROR = bannerStyle;
        com.paypal.oslo.feature.packagetracking.domain.model.display.BannerStyle bannerStyle2 = new com.paypal.oslo.feature.packagetracking.domain.model.display.BannerStyle("WARNING", 1);
        WARNING = bannerStyle2;
        com.paypal.oslo.feature.packagetracking.domain.model.display.BannerStyle bannerStyle3 = new com.paypal.oslo.feature.packagetracking.domain.model.display.BannerStyle("INFO", 2);
        INFO = bannerStyle3;
        com.paypal.oslo.feature.packagetracking.domain.model.display.BannerStyle bannerStyle4 = new com.paypal.oslo.feature.packagetracking.domain.model.display.BannerStyle("NONE", 3);
        NONE = bannerStyle4;
        com.paypal.oslo.feature.packagetracking.domain.model.display.BannerStyle[] bannerStyleArr = {bannerStyle, bannerStyle2, bannerStyle3, bannerStyle4};
        getHighResolutionOutputSizeshNQ4ISI = bannerStyleArr;
        getHighSpeedVideoFpsRanges = kotlin.enums.EnumEntriesKt.enumEntries(bannerStyleArr);
    }

    public static com.paypal.oslo.feature.packagetracking.domain.model.display.BannerStyle[] values() {
        return (com.paypal.oslo.feature.packagetracking.domain.model.display.BannerStyle[]) getHighResolutionOutputSizeshNQ4ISI.clone();
    }

    public static com.paypal.oslo.feature.packagetracking.domain.model.display.BannerStyle valueOf(java.lang.String str) {
        return (com.paypal.oslo.feature.packagetracking.domain.model.display.BannerStyle) java.lang.Enum.valueOf(com.paypal.oslo.feature.packagetracking.domain.model.display.BannerStyle.class, str);
    }

    public static kotlin.enums.EnumEntries<com.paypal.oslo.feature.packagetracking.domain.model.display.BannerStyle> getEntries() {
        return getHighSpeedVideoFpsRanges;
    }
}
