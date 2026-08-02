package androidx.compose.ui.unit;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005"}, d2 = {"Landroidx/compose/ui/unit/LayoutDirection;", "", "<init>", "(Ljava/lang/String;I)V", "Ltr", "Rtl"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class LayoutDirection {
    private static final /* synthetic */ androidx.compose.ui.unit.LayoutDirection[] Camera2StreamConfigurationMap;
    public static final androidx.compose.ui.unit.LayoutDirection Ltr = new androidx.compose.ui.unit.LayoutDirection("Ltr", 0);
    public static final androidx.compose.ui.unit.LayoutDirection Rtl = new androidx.compose.ui.unit.LayoutDirection("Rtl", 1);
    private static final /* synthetic */ kotlin.enums.EnumEntries getHighSpeedVideoFpsRanges;

    private LayoutDirection(java.lang.String str, int i) {
    }

    static {
        androidx.compose.ui.unit.LayoutDirection[] highSpeedVideoSizes = getHighSpeedVideoSizes();
        Camera2StreamConfigurationMap = highSpeedVideoSizes;
        getHighSpeedVideoFpsRanges = kotlin.enums.EnumEntriesKt.enumEntries(highSpeedVideoSizes);
    }

    public static androidx.compose.ui.unit.LayoutDirection[] values() {
        return (androidx.compose.ui.unit.LayoutDirection[]) Camera2StreamConfigurationMap.clone();
    }

    public static androidx.compose.ui.unit.LayoutDirection valueOf(java.lang.String str) {
        return (androidx.compose.ui.unit.LayoutDirection) java.lang.Enum.valueOf(androidx.compose.ui.unit.LayoutDirection.class, str);
    }

    public static kotlin.enums.EnumEntries<androidx.compose.ui.unit.LayoutDirection> getEntries() {
        return getHighSpeedVideoFpsRanges;
    }

    private static final /* synthetic */ androidx.compose.ui.unit.LayoutDirection[] getHighSpeedVideoSizes() {
        return new androidx.compose.ui.unit.LayoutDirection[]{Ltr, Rtl};
    }
}
