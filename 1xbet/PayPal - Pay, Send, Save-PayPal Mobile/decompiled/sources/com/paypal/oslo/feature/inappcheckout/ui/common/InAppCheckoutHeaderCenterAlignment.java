package com.paypal.oslo.feature.inappcheckout.ui.common;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0080\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005"}, d2 = {"Lcom/paypal/oslo/feature/inappcheckout/ui/common/InAppCheckoutHeaderCenterAlignment;", "", "<init>", "(Ljava/lang/String;I)V", "CENTER", "START"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class InAppCheckoutHeaderCenterAlignment {
    public static final com.paypal.oslo.feature.inappcheckout.ui.common.InAppCheckoutHeaderCenterAlignment CENTER;
    private static final /* synthetic */ com.paypal.oslo.feature.inappcheckout.ui.common.InAppCheckoutHeaderCenterAlignment[] Camera2StreamConfigurationMap;
    public static final com.paypal.oslo.feature.inappcheckout.ui.common.InAppCheckoutHeaderCenterAlignment START;
    private static final /* synthetic */ kotlin.enums.EnumEntries getHighSpeedVideoFpsRanges;

    private InAppCheckoutHeaderCenterAlignment(java.lang.String str, int i) {
    }

    static {
        com.paypal.oslo.feature.inappcheckout.ui.common.InAppCheckoutHeaderCenterAlignment inAppCheckoutHeaderCenterAlignment = new com.paypal.oslo.feature.inappcheckout.ui.common.InAppCheckoutHeaderCenterAlignment("CENTER", 0);
        CENTER = inAppCheckoutHeaderCenterAlignment;
        com.paypal.oslo.feature.inappcheckout.ui.common.InAppCheckoutHeaderCenterAlignment inAppCheckoutHeaderCenterAlignment2 = new com.paypal.oslo.feature.inappcheckout.ui.common.InAppCheckoutHeaderCenterAlignment("START", 1);
        START = inAppCheckoutHeaderCenterAlignment2;
        com.paypal.oslo.feature.inappcheckout.ui.common.InAppCheckoutHeaderCenterAlignment[] inAppCheckoutHeaderCenterAlignmentArr = {inAppCheckoutHeaderCenterAlignment, inAppCheckoutHeaderCenterAlignment2};
        Camera2StreamConfigurationMap = inAppCheckoutHeaderCenterAlignmentArr;
        getHighSpeedVideoFpsRanges = kotlin.enums.EnumEntriesKt.enumEntries(inAppCheckoutHeaderCenterAlignmentArr);
    }

    public static com.paypal.oslo.feature.inappcheckout.ui.common.InAppCheckoutHeaderCenterAlignment[] values() {
        return (com.paypal.oslo.feature.inappcheckout.ui.common.InAppCheckoutHeaderCenterAlignment[]) Camera2StreamConfigurationMap.clone();
    }

    public static com.paypal.oslo.feature.inappcheckout.ui.common.InAppCheckoutHeaderCenterAlignment valueOf(java.lang.String str) {
        return (com.paypal.oslo.feature.inappcheckout.ui.common.InAppCheckoutHeaderCenterAlignment) java.lang.Enum.valueOf(com.paypal.oslo.feature.inappcheckout.ui.common.InAppCheckoutHeaderCenterAlignment.class, str);
    }

    public static kotlin.enums.EnumEntries<com.paypal.oslo.feature.inappcheckout.ui.common.InAppCheckoutHeaderCenterAlignment> getEntries() {
        return getHighSpeedVideoFpsRanges;
    }
}
