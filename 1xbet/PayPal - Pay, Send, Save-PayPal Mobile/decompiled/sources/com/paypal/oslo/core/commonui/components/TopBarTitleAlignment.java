package com.paypal.oslo.core.commonui.components;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006"}, d2 = {"Lcom/paypal/oslo/core/commonui/components/TopBarTitleAlignment;", "", "<init>", "(Ljava/lang/String;I)V", "Start", "Center", "End"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class TopBarTitleAlignment {
    public static final com.paypal.oslo.core.commonui.components.TopBarTitleAlignment Center;
    public static final com.paypal.oslo.core.commonui.components.TopBarTitleAlignment End;
    public static final com.paypal.oslo.core.commonui.components.TopBarTitleAlignment Start;
    private static final /* synthetic */ com.paypal.oslo.core.commonui.components.TopBarTitleAlignment[] getHighSpeedVideoFpsRanges;
    private static final /* synthetic */ kotlin.enums.EnumEntries getHighSpeedVideoSizes;

    private TopBarTitleAlignment(java.lang.String str, int i) {
    }

    static {
        com.paypal.oslo.core.commonui.components.TopBarTitleAlignment topBarTitleAlignment = new com.paypal.oslo.core.commonui.components.TopBarTitleAlignment("Start", 0);
        Start = topBarTitleAlignment;
        com.paypal.oslo.core.commonui.components.TopBarTitleAlignment topBarTitleAlignment2 = new com.paypal.oslo.core.commonui.components.TopBarTitleAlignment("Center", 1);
        Center = topBarTitleAlignment2;
        com.paypal.oslo.core.commonui.components.TopBarTitleAlignment topBarTitleAlignment3 = new com.paypal.oslo.core.commonui.components.TopBarTitleAlignment("End", 2);
        End = topBarTitleAlignment3;
        com.paypal.oslo.core.commonui.components.TopBarTitleAlignment[] topBarTitleAlignmentArr = {topBarTitleAlignment, topBarTitleAlignment2, topBarTitleAlignment3};
        getHighSpeedVideoFpsRanges = topBarTitleAlignmentArr;
        getHighSpeedVideoSizes = kotlin.enums.EnumEntriesKt.enumEntries(topBarTitleAlignmentArr);
    }

    public static com.paypal.oslo.core.commonui.components.TopBarTitleAlignment[] values() {
        return (com.paypal.oslo.core.commonui.components.TopBarTitleAlignment[]) getHighSpeedVideoFpsRanges.clone();
    }

    public static com.paypal.oslo.core.commonui.components.TopBarTitleAlignment valueOf(java.lang.String str) {
        return (com.paypal.oslo.core.commonui.components.TopBarTitleAlignment) java.lang.Enum.valueOf(com.paypal.oslo.core.commonui.components.TopBarTitleAlignment.class, str);
    }

    public static kotlin.enums.EnumEntries<com.paypal.oslo.core.commonui.components.TopBarTitleAlignment> getEntries() {
        return getHighSpeedVideoSizes;
    }
}
