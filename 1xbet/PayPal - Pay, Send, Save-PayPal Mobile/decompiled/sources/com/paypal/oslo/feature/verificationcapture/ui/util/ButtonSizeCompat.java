package com.paypal.oslo.feature.verificationcapture.ui.util;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006"}, d2 = {"Lcom/paypal/oslo/feature/verificationcapture/ui/util/ButtonSizeCompat;", "", "<init>", "(Ljava/lang/String;I)V", "SMALL", "MEDIUM", "LARGE"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class ButtonSizeCompat {
    private static final /* synthetic */ kotlin.enums.EnumEntries Camera2StreamConfigurationMap;
    public static final com.paypal.oslo.feature.verificationcapture.ui.util.ButtonSizeCompat LARGE;
    public static final com.paypal.oslo.feature.verificationcapture.ui.util.ButtonSizeCompat MEDIUM;
    public static final com.paypal.oslo.feature.verificationcapture.ui.util.ButtonSizeCompat SMALL;
    private static final /* synthetic */ com.paypal.oslo.feature.verificationcapture.ui.util.ButtonSizeCompat[] getHighSpeedVideoFpsRanges;

    private ButtonSizeCompat(java.lang.String str, int i) {
    }

    static {
        com.paypal.oslo.feature.verificationcapture.ui.util.ButtonSizeCompat buttonSizeCompat = new com.paypal.oslo.feature.verificationcapture.ui.util.ButtonSizeCompat("SMALL", 0);
        SMALL = buttonSizeCompat;
        com.paypal.oslo.feature.verificationcapture.ui.util.ButtonSizeCompat buttonSizeCompat2 = new com.paypal.oslo.feature.verificationcapture.ui.util.ButtonSizeCompat("MEDIUM", 1);
        MEDIUM = buttonSizeCompat2;
        com.paypal.oslo.feature.verificationcapture.ui.util.ButtonSizeCompat buttonSizeCompat3 = new com.paypal.oslo.feature.verificationcapture.ui.util.ButtonSizeCompat("LARGE", 2);
        LARGE = buttonSizeCompat3;
        com.paypal.oslo.feature.verificationcapture.ui.util.ButtonSizeCompat[] buttonSizeCompatArr = {buttonSizeCompat, buttonSizeCompat2, buttonSizeCompat3};
        getHighSpeedVideoFpsRanges = buttonSizeCompatArr;
        Camera2StreamConfigurationMap = kotlin.enums.EnumEntriesKt.enumEntries(buttonSizeCompatArr);
    }

    public static com.paypal.oslo.feature.verificationcapture.ui.util.ButtonSizeCompat[] values() {
        return (com.paypal.oslo.feature.verificationcapture.ui.util.ButtonSizeCompat[]) getHighSpeedVideoFpsRanges.clone();
    }

    public static com.paypal.oslo.feature.verificationcapture.ui.util.ButtonSizeCompat valueOf(java.lang.String str) {
        return (com.paypal.oslo.feature.verificationcapture.ui.util.ButtonSizeCompat) java.lang.Enum.valueOf(com.paypal.oslo.feature.verificationcapture.ui.util.ButtonSizeCompat.class, str);
    }

    public static kotlin.enums.EnumEntries<com.paypal.oslo.feature.verificationcapture.ui.util.ButtonSizeCompat> getEntries() {
        return Camera2StreamConfigurationMap;
    }
}
