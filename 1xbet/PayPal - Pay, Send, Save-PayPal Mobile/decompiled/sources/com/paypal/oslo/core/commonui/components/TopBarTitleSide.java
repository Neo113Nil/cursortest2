package com.paypal.oslo.core.commonui.components;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0082\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005"}, d2 = {"Lcom/paypal/oslo/core/commonui/components/TopBarTitleSide;", "", "<init>", "(Ljava/lang/String;I)V", "getHighSpeedVideoFpsRanges", "getHighSpeedVideoFpsRangesFor"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes10.dex */
final class TopBarTitleSide {
    private static final /* synthetic */ com.paypal.oslo.core.commonui.components.TopBarTitleSide[] Camera2StreamConfigurationMap;
    public static final com.paypal.oslo.core.commonui.components.TopBarTitleSide getHighSpeedVideoFpsRanges;
    public static final com.paypal.oslo.core.commonui.components.TopBarTitleSide getHighSpeedVideoFpsRangesFor;
    private static final /* synthetic */ kotlin.enums.EnumEntries getHighSpeedVideoSizes;

    private TopBarTitleSide(java.lang.String str, int i) {
    }

    static {
        com.paypal.oslo.core.commonui.components.TopBarTitleSide topBarTitleSide = new com.paypal.oslo.core.commonui.components.TopBarTitleSide("Start", 0);
        getHighSpeedVideoFpsRanges = topBarTitleSide;
        com.paypal.oslo.core.commonui.components.TopBarTitleSide topBarTitleSide2 = new com.paypal.oslo.core.commonui.components.TopBarTitleSide("End", 1);
        getHighSpeedVideoFpsRangesFor = topBarTitleSide2;
        com.paypal.oslo.core.commonui.components.TopBarTitleSide[] topBarTitleSideArr = {topBarTitleSide, topBarTitleSide2};
        Camera2StreamConfigurationMap = topBarTitleSideArr;
        getHighSpeedVideoSizes = kotlin.enums.EnumEntriesKt.enumEntries(topBarTitleSideArr);
    }

    public static com.paypal.oslo.core.commonui.components.TopBarTitleSide[] values() {
        return (com.paypal.oslo.core.commonui.components.TopBarTitleSide[]) Camera2StreamConfigurationMap.clone();
    }

    public static com.paypal.oslo.core.commonui.components.TopBarTitleSide valueOf(java.lang.String str) {
        return (com.paypal.oslo.core.commonui.components.TopBarTitleSide) java.lang.Enum.valueOf(com.paypal.oslo.core.commonui.components.TopBarTitleSide.class, str);
    }
}
