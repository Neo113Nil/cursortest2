package androidx.compose.material;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0082\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006"}, d2 = {"Landroidx/compose/material/TabSlots;", "", "<init>", "(Ljava/lang/String;I)V", "getHighSpeedVideoSizes", "getHighResolutionOutputSizeshNQ4ISI", "Camera2StreamConfigurationMap"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
final class TabSlots {
    public static final androidx.compose.material.TabSlots Camera2StreamConfigurationMap;
    public static final androidx.compose.material.TabSlots getHighResolutionOutputSizeshNQ4ISI;
    private static final /* synthetic */ androidx.compose.material.TabSlots[] getHighSpeedVideoFpsRanges;
    private static final /* synthetic */ kotlin.enums.EnumEntries getHighSpeedVideoFpsRangesFor;
    public static final androidx.compose.material.TabSlots getHighSpeedVideoSizes;

    private TabSlots(java.lang.String str, int i) {
    }

    static {
        androidx.compose.material.TabSlots tabSlots = new androidx.compose.material.TabSlots("Tabs", 0);
        getHighSpeedVideoSizes = tabSlots;
        androidx.compose.material.TabSlots tabSlots2 = new androidx.compose.material.TabSlots("Divider", 1);
        getHighResolutionOutputSizeshNQ4ISI = tabSlots2;
        androidx.compose.material.TabSlots tabSlots3 = new androidx.compose.material.TabSlots("Indicator", 2);
        Camera2StreamConfigurationMap = tabSlots3;
        androidx.compose.material.TabSlots[] tabSlotsArr = {tabSlots, tabSlots2, tabSlots3};
        getHighSpeedVideoFpsRanges = tabSlotsArr;
        getHighSpeedVideoFpsRangesFor = kotlin.enums.EnumEntriesKt.enumEntries(tabSlotsArr);
    }

    public static androidx.compose.material.TabSlots[] values() {
        return (androidx.compose.material.TabSlots[]) getHighSpeedVideoFpsRanges.clone();
    }

    public static androidx.compose.material.TabSlots valueOf(java.lang.String str) {
        return (androidx.compose.material.TabSlots) java.lang.Enum.valueOf(androidx.compose.material.TabSlots.class, str);
    }
}
