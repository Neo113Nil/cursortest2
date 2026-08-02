package androidx.compose.material3;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0082\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006"}, d2 = {"Landroidx/compose/material3/TabSlots;", "", "<init>", "(Ljava/lang/String;I)V", "Camera2StreamConfigurationMap", "getHighSpeedVideoFpsRangesFor", "getHighSpeedVideoSizes"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
final class TabSlots {
    public static final androidx.compose.material3.TabSlots Camera2StreamConfigurationMap;
    private static final /* synthetic */ androidx.compose.material3.TabSlots[] getHighResolutionOutputSizeshNQ4ISI;
    private static final /* synthetic */ kotlin.enums.EnumEntries getHighSpeedVideoFpsRanges;
    public static final androidx.compose.material3.TabSlots getHighSpeedVideoFpsRangesFor;
    public static final androidx.compose.material3.TabSlots getHighSpeedVideoSizes;

    private TabSlots(java.lang.String str, int i) {
    }

    static {
        androidx.compose.material3.TabSlots tabSlots = new androidx.compose.material3.TabSlots("Tabs", 0);
        Camera2StreamConfigurationMap = tabSlots;
        androidx.compose.material3.TabSlots tabSlots2 = new androidx.compose.material3.TabSlots("Divider", 1);
        getHighSpeedVideoFpsRangesFor = tabSlots2;
        androidx.compose.material3.TabSlots tabSlots3 = new androidx.compose.material3.TabSlots("Indicator", 2);
        getHighSpeedVideoSizes = tabSlots3;
        androidx.compose.material3.TabSlots[] tabSlotsArr = {tabSlots, tabSlots2, tabSlots3};
        getHighResolutionOutputSizeshNQ4ISI = tabSlotsArr;
        getHighSpeedVideoFpsRanges = kotlin.enums.EnumEntriesKt.enumEntries(tabSlotsArr);
    }

    public static androidx.compose.material3.TabSlots valueOf(java.lang.String str) {
        return (androidx.compose.material3.TabSlots) java.lang.Enum.valueOf(androidx.compose.material3.TabSlots.class, str);
    }

    public static androidx.compose.material3.TabSlots[] values() {
        return (androidx.compose.material3.TabSlots[]) getHighResolutionOutputSizeshNQ4ISI.clone();
    }
}
