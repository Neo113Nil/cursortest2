package androidx.compose.ui.platform;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005"}, d2 = {"Landroidx/compose/ui/platform/TextToolbarStatus;", "", "<init>", "(Ljava/lang/String;I)V", "Shown", "Hidden"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class TextToolbarStatus {
    private static final /* synthetic */ androidx.compose.ui.platform.TextToolbarStatus[] getHighSpeedVideoFpsRanges;
    private static final /* synthetic */ kotlin.enums.EnumEntries getHighSpeedVideoFpsRangesFor;
    public static final androidx.compose.ui.platform.TextToolbarStatus Shown = new androidx.compose.ui.platform.TextToolbarStatus("Shown", 0);
    public static final androidx.compose.ui.platform.TextToolbarStatus Hidden = new androidx.compose.ui.platform.TextToolbarStatus("Hidden", 1);

    private TextToolbarStatus(java.lang.String str, int i) {
    }

    static {
        androidx.compose.ui.platform.TextToolbarStatus[] highSpeedVideoSizes = getHighSpeedVideoSizes();
        getHighSpeedVideoFpsRanges = highSpeedVideoSizes;
        getHighSpeedVideoFpsRangesFor = kotlin.enums.EnumEntriesKt.enumEntries(highSpeedVideoSizes);
    }

    public static androidx.compose.ui.platform.TextToolbarStatus[] values() {
        return (androidx.compose.ui.platform.TextToolbarStatus[]) getHighSpeedVideoFpsRanges.clone();
    }

    public static androidx.compose.ui.platform.TextToolbarStatus valueOf(java.lang.String str) {
        return (androidx.compose.ui.platform.TextToolbarStatus) java.lang.Enum.valueOf(androidx.compose.ui.platform.TextToolbarStatus.class, str);
    }

    public static kotlin.enums.EnumEntries<androidx.compose.ui.platform.TextToolbarStatus> getEntries() {
        return getHighSpeedVideoFpsRangesFor;
    }

    private static final /* synthetic */ androidx.compose.ui.platform.TextToolbarStatus[] getHighSpeedVideoSizes() {
        return new androidx.compose.ui.platform.TextToolbarStatus[]{Shown, Hidden};
    }
}
