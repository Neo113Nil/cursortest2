package androidx.compose.ui.text.style;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005"}, d2 = {"Landroidx/compose/ui/text/style/ResolvedTextDirection;", "", "<init>", "(Ljava/lang/String;I)V", "Ltr", "Rtl"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class ResolvedTextDirection {
    public static final androidx.compose.ui.text.style.ResolvedTextDirection Ltr = new androidx.compose.ui.text.style.ResolvedTextDirection("Ltr", 0);
    public static final androidx.compose.ui.text.style.ResolvedTextDirection Rtl = new androidx.compose.ui.text.style.ResolvedTextDirection("Rtl", 1);
    private static final /* synthetic */ kotlin.enums.EnumEntries getHighSpeedVideoFpsRanges;
    private static final /* synthetic */ androidx.compose.ui.text.style.ResolvedTextDirection[] getHighSpeedVideoSizes;

    private ResolvedTextDirection(java.lang.String str, int i) {
    }

    static {
        androidx.compose.ui.text.style.ResolvedTextDirection[] Camera2StreamConfigurationMap = Camera2StreamConfigurationMap();
        getHighSpeedVideoSizes = Camera2StreamConfigurationMap;
        getHighSpeedVideoFpsRanges = kotlin.enums.EnumEntriesKt.enumEntries(Camera2StreamConfigurationMap);
    }

    public static androidx.compose.ui.text.style.ResolvedTextDirection[] values() {
        return (androidx.compose.ui.text.style.ResolvedTextDirection[]) getHighSpeedVideoSizes.clone();
    }

    public static androidx.compose.ui.text.style.ResolvedTextDirection valueOf(java.lang.String str) {
        return (androidx.compose.ui.text.style.ResolvedTextDirection) java.lang.Enum.valueOf(androidx.compose.ui.text.style.ResolvedTextDirection.class, str);
    }

    public static kotlin.enums.EnumEntries<androidx.compose.ui.text.style.ResolvedTextDirection> getEntries() {
        return getHighSpeedVideoFpsRanges;
    }

    private static final /* synthetic */ androidx.compose.ui.text.style.ResolvedTextDirection[] Camera2StreamConfigurationMap() {
        return new androidx.compose.ui.text.style.ResolvedTextDirection[]{Ltr, Rtl};
    }
}
