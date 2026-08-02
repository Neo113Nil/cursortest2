package com.paypal.pds.components;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005"}, d2 = {"Lcom/paypal/pds/components/ChipLayout;", "", "<init>", "(Ljava/lang/String;I)V", "Horizontal", "Grid"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class ChipLayout {
    private static final /* synthetic */ com.paypal.pds.components.ChipLayout[] Camera2StreamConfigurationMap;
    public static final com.paypal.pds.components.ChipLayout Grid;
    public static final com.paypal.pds.components.ChipLayout Horizontal;
    private static final /* synthetic */ kotlin.enums.EnumEntries getHighResolutionOutputSizeshNQ4ISI;

    private ChipLayout(java.lang.String str, int i) {
    }

    static {
        com.paypal.pds.components.ChipLayout chipLayout = new com.paypal.pds.components.ChipLayout("Horizontal", 0);
        Horizontal = chipLayout;
        com.paypal.pds.components.ChipLayout chipLayout2 = new com.paypal.pds.components.ChipLayout("Grid", 1);
        Grid = chipLayout2;
        com.paypal.pds.components.ChipLayout[] chipLayoutArr = {chipLayout, chipLayout2};
        Camera2StreamConfigurationMap = chipLayoutArr;
        getHighResolutionOutputSizeshNQ4ISI = kotlin.enums.EnumEntriesKt.enumEntries(chipLayoutArr);
    }

    public static com.paypal.pds.components.ChipLayout[] values() {
        return (com.paypal.pds.components.ChipLayout[]) Camera2StreamConfigurationMap.clone();
    }

    public static com.paypal.pds.components.ChipLayout valueOf(java.lang.String str) {
        return (com.paypal.pds.components.ChipLayout) java.lang.Enum.valueOf(com.paypal.pds.components.ChipLayout.class, str);
    }

    public static kotlin.enums.EnumEntries<com.paypal.pds.components.ChipLayout> getEntries() {
        return getHighResolutionOutputSizeshNQ4ISI;
    }
}
