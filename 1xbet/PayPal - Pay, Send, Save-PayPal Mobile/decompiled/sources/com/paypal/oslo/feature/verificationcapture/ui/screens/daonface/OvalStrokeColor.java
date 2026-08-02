package com.paypal.oslo.feature.verificationcapture.ui.screens.daonface;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0080\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006"}, d2 = {"Lcom/paypal/oslo/feature/verificationcapture/ui/screens/daonface/OvalStrokeColor;", "", "<init>", "(Ljava/lang/String;I)V", "WHITE", "GREEN", "ORANGE"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class OvalStrokeColor {
    private static final /* synthetic */ com.paypal.oslo.feature.verificationcapture.ui.screens.daonface.OvalStrokeColor[] Camera2StreamConfigurationMap;
    public static final com.paypal.oslo.feature.verificationcapture.ui.screens.daonface.OvalStrokeColor GREEN;
    public static final com.paypal.oslo.feature.verificationcapture.ui.screens.daonface.OvalStrokeColor ORANGE;
    public static final com.paypal.oslo.feature.verificationcapture.ui.screens.daonface.OvalStrokeColor WHITE;
    private static final /* synthetic */ kotlin.enums.EnumEntries getHighSpeedVideoFpsRangesFor;

    private OvalStrokeColor(java.lang.String str, int i) {
    }

    static {
        com.paypal.oslo.feature.verificationcapture.ui.screens.daonface.OvalStrokeColor ovalStrokeColor = new com.paypal.oslo.feature.verificationcapture.ui.screens.daonface.OvalStrokeColor("WHITE", 0);
        WHITE = ovalStrokeColor;
        com.paypal.oslo.feature.verificationcapture.ui.screens.daonface.OvalStrokeColor ovalStrokeColor2 = new com.paypal.oslo.feature.verificationcapture.ui.screens.daonface.OvalStrokeColor("GREEN", 1);
        GREEN = ovalStrokeColor2;
        com.paypal.oslo.feature.verificationcapture.ui.screens.daonface.OvalStrokeColor ovalStrokeColor3 = new com.paypal.oslo.feature.verificationcapture.ui.screens.daonface.OvalStrokeColor("ORANGE", 2);
        ORANGE = ovalStrokeColor3;
        com.paypal.oslo.feature.verificationcapture.ui.screens.daonface.OvalStrokeColor[] ovalStrokeColorArr = {ovalStrokeColor, ovalStrokeColor2, ovalStrokeColor3};
        Camera2StreamConfigurationMap = ovalStrokeColorArr;
        getHighSpeedVideoFpsRangesFor = kotlin.enums.EnumEntriesKt.enumEntries(ovalStrokeColorArr);
    }

    public static com.paypal.oslo.feature.verificationcapture.ui.screens.daonface.OvalStrokeColor[] values() {
        return (com.paypal.oslo.feature.verificationcapture.ui.screens.daonface.OvalStrokeColor[]) Camera2StreamConfigurationMap.clone();
    }

    public static com.paypal.oslo.feature.verificationcapture.ui.screens.daonface.OvalStrokeColor valueOf(java.lang.String str) {
        return (com.paypal.oslo.feature.verificationcapture.ui.screens.daonface.OvalStrokeColor) java.lang.Enum.valueOf(com.paypal.oslo.feature.verificationcapture.ui.screens.daonface.OvalStrokeColor.class, str);
    }

    public static kotlin.enums.EnumEntries<com.paypal.oslo.feature.verificationcapture.ui.screens.daonface.OvalStrokeColor> getEntries() {
        return getHighSpeedVideoFpsRangesFor;
    }
}
