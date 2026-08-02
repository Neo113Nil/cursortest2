package com.paypal.oslo.feature.p2p.ui.components;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007"}, d2 = {"Lcom/paypal/oslo/feature/p2p/ui/components/P2pTooltipPosition;", "", "<init>", "(Ljava/lang/String;I)V", "Top", "Bottom", "Start", "End"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class P2pTooltipPosition {
    public static final com.paypal.oslo.feature.p2p.ui.components.P2pTooltipPosition Bottom;
    public static final com.paypal.oslo.feature.p2p.ui.components.P2pTooltipPosition End;
    public static final com.paypal.oslo.feature.p2p.ui.components.P2pTooltipPosition Start;
    public static final com.paypal.oslo.feature.p2p.ui.components.P2pTooltipPosition Top;
    private static final /* synthetic */ kotlin.enums.EnumEntries getHighResolutionOutputSizeshNQ4ISI;
    private static final /* synthetic */ com.paypal.oslo.feature.p2p.ui.components.P2pTooltipPosition[] getHighSpeedVideoSizes;

    private P2pTooltipPosition(java.lang.String str, int i) {
    }

    static {
        com.paypal.oslo.feature.p2p.ui.components.P2pTooltipPosition p2pTooltipPosition = new com.paypal.oslo.feature.p2p.ui.components.P2pTooltipPosition("Top", 0);
        Top = p2pTooltipPosition;
        com.paypal.oslo.feature.p2p.ui.components.P2pTooltipPosition p2pTooltipPosition2 = new com.paypal.oslo.feature.p2p.ui.components.P2pTooltipPosition("Bottom", 1);
        Bottom = p2pTooltipPosition2;
        com.paypal.oslo.feature.p2p.ui.components.P2pTooltipPosition p2pTooltipPosition3 = new com.paypal.oslo.feature.p2p.ui.components.P2pTooltipPosition("Start", 2);
        Start = p2pTooltipPosition3;
        com.paypal.oslo.feature.p2p.ui.components.P2pTooltipPosition p2pTooltipPosition4 = new com.paypal.oslo.feature.p2p.ui.components.P2pTooltipPosition("End", 3);
        End = p2pTooltipPosition4;
        com.paypal.oslo.feature.p2p.ui.components.P2pTooltipPosition[] p2pTooltipPositionArr = {p2pTooltipPosition, p2pTooltipPosition2, p2pTooltipPosition3, p2pTooltipPosition4};
        getHighSpeedVideoSizes = p2pTooltipPositionArr;
        getHighResolutionOutputSizeshNQ4ISI = kotlin.enums.EnumEntriesKt.enumEntries(p2pTooltipPositionArr);
    }

    public static com.paypal.oslo.feature.p2p.ui.components.P2pTooltipPosition[] values() {
        return (com.paypal.oslo.feature.p2p.ui.components.P2pTooltipPosition[]) getHighSpeedVideoSizes.clone();
    }

    public static com.paypal.oslo.feature.p2p.ui.components.P2pTooltipPosition valueOf(java.lang.String str) {
        return (com.paypal.oslo.feature.p2p.ui.components.P2pTooltipPosition) java.lang.Enum.valueOf(com.paypal.oslo.feature.p2p.ui.components.P2pTooltipPosition.class, str);
    }

    public static kotlin.enums.EnumEntries<com.paypal.oslo.feature.p2p.ui.components.P2pTooltipPosition> getEntries() {
        return getHighResolutionOutputSizeshNQ4ISI;
    }
}
