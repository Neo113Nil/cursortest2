package androidx.compose.ui.state;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006"}, d2 = {"Landroidx/compose/ui/state/ToggleableState;", "", "<init>", "(Ljava/lang/String;I)V", "On", "Off", "Indeterminate"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class ToggleableState {
    private static final /* synthetic */ androidx.compose.ui.state.ToggleableState[] Camera2StreamConfigurationMap;
    private static final /* synthetic */ kotlin.enums.EnumEntries getHighSpeedVideoSizes;
    public static final androidx.compose.ui.state.ToggleableState On = new androidx.compose.ui.state.ToggleableState("On", 0);
    public static final androidx.compose.ui.state.ToggleableState Off = new androidx.compose.ui.state.ToggleableState("Off", 1);
    public static final androidx.compose.ui.state.ToggleableState Indeterminate = new androidx.compose.ui.state.ToggleableState("Indeterminate", 2);

    private ToggleableState(java.lang.String str, int i) {
    }

    static {
        androidx.compose.ui.state.ToggleableState[] highSpeedVideoFpsRanges = getHighSpeedVideoFpsRanges();
        Camera2StreamConfigurationMap = highSpeedVideoFpsRanges;
        getHighSpeedVideoSizes = kotlin.enums.EnumEntriesKt.enumEntries(highSpeedVideoFpsRanges);
    }

    public static androidx.compose.ui.state.ToggleableState[] values() {
        return (androidx.compose.ui.state.ToggleableState[]) Camera2StreamConfigurationMap.clone();
    }

    public static androidx.compose.ui.state.ToggleableState valueOf(java.lang.String str) {
        return (androidx.compose.ui.state.ToggleableState) java.lang.Enum.valueOf(androidx.compose.ui.state.ToggleableState.class, str);
    }

    public static kotlin.enums.EnumEntries<androidx.compose.ui.state.ToggleableState> getEntries() {
        return getHighSpeedVideoSizes;
    }

    private static final /* synthetic */ androidx.compose.ui.state.ToggleableState[] getHighSpeedVideoFpsRanges() {
        return new androidx.compose.ui.state.ToggleableState[]{On, Off, Indeterminate};
    }
}
