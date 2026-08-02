package com.paypal.pds.components;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0082\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005"}, d2 = {"Lcom/paypal/pds/components/DragState;", "", "<init>", "(Ljava/lang/String;I)V", "Camera2StreamConfigurationMap", "getHighSpeedVideoFpsRanges"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes16.dex */
final class DragState {
    public static final com.paypal.pds.components.DragState Camera2StreamConfigurationMap;
    private static final /* synthetic */ kotlin.enums.EnumEntries getHighResolutionOutputSizeshNQ4ISI;
    public static final com.paypal.pds.components.DragState getHighSpeedVideoFpsRanges;
    private static final /* synthetic */ com.paypal.pds.components.DragState[] getHighSpeedVideoSizes;

    private DragState(java.lang.String str, int i) {
    }

    static {
        com.paypal.pds.components.DragState dragState = new com.paypal.pds.components.DragState(com.paypal.oslo.feature.balance.common.BalanceConstants.StateNames.STATE_VISIBLE, 0);
        Camera2StreamConfigurationMap = dragState;
        com.paypal.pds.components.DragState dragState2 = new com.paypal.pds.components.DragState("Dismissed", 1);
        getHighSpeedVideoFpsRanges = dragState2;
        com.paypal.pds.components.DragState[] dragStateArr = {dragState, dragState2};
        getHighSpeedVideoSizes = dragStateArr;
        getHighResolutionOutputSizeshNQ4ISI = kotlin.enums.EnumEntriesKt.enumEntries(dragStateArr);
    }

    public static com.paypal.pds.components.DragState[] values() {
        return (com.paypal.pds.components.DragState[]) getHighSpeedVideoSizes.clone();
    }

    public static com.paypal.pds.components.DragState valueOf(java.lang.String str) {
        return (com.paypal.pds.components.DragState) java.lang.Enum.valueOf(com.paypal.pds.components.DragState.class, str);
    }
}
