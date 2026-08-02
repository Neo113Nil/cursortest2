package com.paypal.oslo.feature.wallet.banks.domain.model;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006"}, d2 = {"Lcom/paypal/oslo/feature/wallet/banks/domain/model/BannerStyle;", "", "<init>", "(Ljava/lang/String;I)V", "WARNING", "INFO", "ERROR"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class BannerStyle {
    public static final com.paypal.oslo.feature.wallet.banks.domain.model.BannerStyle ERROR;
    public static final com.paypal.oslo.feature.wallet.banks.domain.model.BannerStyle INFO;
    public static final com.paypal.oslo.feature.wallet.banks.domain.model.BannerStyle WARNING;
    private static final /* synthetic */ kotlin.enums.EnumEntries getHighSpeedVideoFpsRanges;
    private static final /* synthetic */ com.paypal.oslo.feature.wallet.banks.domain.model.BannerStyle[] getHighSpeedVideoSizes;

    private BannerStyle(java.lang.String str, int i) {
    }

    static {
        com.paypal.oslo.feature.wallet.banks.domain.model.BannerStyle bannerStyle = new com.paypal.oslo.feature.wallet.banks.domain.model.BannerStyle("WARNING", 0);
        WARNING = bannerStyle;
        com.paypal.oslo.feature.wallet.banks.domain.model.BannerStyle bannerStyle2 = new com.paypal.oslo.feature.wallet.banks.domain.model.BannerStyle("INFO", 1);
        INFO = bannerStyle2;
        com.paypal.oslo.feature.wallet.banks.domain.model.BannerStyle bannerStyle3 = new com.paypal.oslo.feature.wallet.banks.domain.model.BannerStyle("ERROR", 2);
        ERROR = bannerStyle3;
        com.paypal.oslo.feature.wallet.banks.domain.model.BannerStyle[] bannerStyleArr = {bannerStyle, bannerStyle2, bannerStyle3};
        getHighSpeedVideoSizes = bannerStyleArr;
        getHighSpeedVideoFpsRanges = kotlin.enums.EnumEntriesKt.enumEntries(bannerStyleArr);
    }

    public static com.paypal.oslo.feature.wallet.banks.domain.model.BannerStyle[] values() {
        return (com.paypal.oslo.feature.wallet.banks.domain.model.BannerStyle[]) getHighSpeedVideoSizes.clone();
    }

    public static com.paypal.oslo.feature.wallet.banks.domain.model.BannerStyle valueOf(java.lang.String str) {
        return (com.paypal.oslo.feature.wallet.banks.domain.model.BannerStyle) java.lang.Enum.valueOf(com.paypal.oslo.feature.wallet.banks.domain.model.BannerStyle.class, str);
    }

    public static kotlin.enums.EnumEntries<com.paypal.oslo.feature.wallet.banks.domain.model.BannerStyle> getEntries() {
        return getHighSpeedVideoFpsRanges;
    }
}
