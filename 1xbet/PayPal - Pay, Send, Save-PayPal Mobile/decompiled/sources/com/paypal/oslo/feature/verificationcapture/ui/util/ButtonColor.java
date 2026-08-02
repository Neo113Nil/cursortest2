package com.paypal.oslo.feature.verificationcapture.ui.util;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006"}, d2 = {"Lcom/paypal/oslo/feature/verificationcapture/ui/util/ButtonColor;", "", "<init>", "(Ljava/lang/String;I)V", "PRIMARY", "SECONDARY", "TERTIARY"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class ButtonColor {
    private static final /* synthetic */ kotlin.enums.EnumEntries Camera2StreamConfigurationMap;
    public static final com.paypal.oslo.feature.verificationcapture.ui.util.ButtonColor PRIMARY;
    public static final com.paypal.oslo.feature.verificationcapture.ui.util.ButtonColor SECONDARY;
    public static final com.paypal.oslo.feature.verificationcapture.ui.util.ButtonColor TERTIARY;
    private static final /* synthetic */ com.paypal.oslo.feature.verificationcapture.ui.util.ButtonColor[] getHighResolutionOutputSizeshNQ4ISI;

    private ButtonColor(java.lang.String str, int i) {
    }

    static {
        com.paypal.oslo.feature.verificationcapture.ui.util.ButtonColor buttonColor = new com.paypal.oslo.feature.verificationcapture.ui.util.ButtonColor("PRIMARY", 0);
        PRIMARY = buttonColor;
        com.paypal.oslo.feature.verificationcapture.ui.util.ButtonColor buttonColor2 = new com.paypal.oslo.feature.verificationcapture.ui.util.ButtonColor("SECONDARY", 1);
        SECONDARY = buttonColor2;
        com.paypal.oslo.feature.verificationcapture.ui.util.ButtonColor buttonColor3 = new com.paypal.oslo.feature.verificationcapture.ui.util.ButtonColor("TERTIARY", 2);
        TERTIARY = buttonColor3;
        com.paypal.oslo.feature.verificationcapture.ui.util.ButtonColor[] buttonColorArr = {buttonColor, buttonColor2, buttonColor3};
        getHighResolutionOutputSizeshNQ4ISI = buttonColorArr;
        Camera2StreamConfigurationMap = kotlin.enums.EnumEntriesKt.enumEntries(buttonColorArr);
    }

    public static com.paypal.oslo.feature.verificationcapture.ui.util.ButtonColor[] values() {
        return (com.paypal.oslo.feature.verificationcapture.ui.util.ButtonColor[]) getHighResolutionOutputSizeshNQ4ISI.clone();
    }

    public static com.paypal.oslo.feature.verificationcapture.ui.util.ButtonColor valueOf(java.lang.String str) {
        return (com.paypal.oslo.feature.verificationcapture.ui.util.ButtonColor) java.lang.Enum.valueOf(com.paypal.oslo.feature.verificationcapture.ui.util.ButtonColor.class, str);
    }

    public static kotlin.enums.EnumEntries<com.paypal.oslo.feature.verificationcapture.ui.util.ButtonColor> getEntries() {
        return Camera2StreamConfigurationMap;
    }
}
