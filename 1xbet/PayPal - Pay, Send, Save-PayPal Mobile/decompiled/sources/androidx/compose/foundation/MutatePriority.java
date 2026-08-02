package androidx.compose.foundation;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006"}, d2 = {"Landroidx/compose/foundation/MutatePriority;", "", "<init>", "(Ljava/lang/String;I)V", "Default", "UserInput", "PreventUserInput"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class MutatePriority {
    private static final /* synthetic */ androidx.compose.foundation.MutatePriority[] Camera2StreamConfigurationMap;
    private static final /* synthetic */ kotlin.enums.EnumEntries getHighSpeedVideoFpsRanges;
    public static final androidx.compose.foundation.MutatePriority Default = new androidx.compose.foundation.MutatePriority("Default", 0);
    public static final androidx.compose.foundation.MutatePriority UserInput = new androidx.compose.foundation.MutatePriority("UserInput", 1);
    public static final androidx.compose.foundation.MutatePriority PreventUserInput = new androidx.compose.foundation.MutatePriority("PreventUserInput", 2);

    private MutatePriority(java.lang.String str, int i) {
    }

    static {
        androidx.compose.foundation.MutatePriority[] highResolutionOutputSizeshNQ4ISI = getHighResolutionOutputSizeshNQ4ISI();
        Camera2StreamConfigurationMap = highResolutionOutputSizeshNQ4ISI;
        getHighSpeedVideoFpsRanges = kotlin.enums.EnumEntriesKt.enumEntries(highResolutionOutputSizeshNQ4ISI);
    }

    public static androidx.compose.foundation.MutatePriority[] values() {
        return (androidx.compose.foundation.MutatePriority[]) Camera2StreamConfigurationMap.clone();
    }

    public static androidx.compose.foundation.MutatePriority valueOf(java.lang.String str) {
        return (androidx.compose.foundation.MutatePriority) java.lang.Enum.valueOf(androidx.compose.foundation.MutatePriority.class, str);
    }

    public static kotlin.enums.EnumEntries<androidx.compose.foundation.MutatePriority> getEntries() {
        return getHighSpeedVideoFpsRanges;
    }

    private static final /* synthetic */ androidx.compose.foundation.MutatePriority[] getHighResolutionOutputSizeshNQ4ISI() {
        return new androidx.compose.foundation.MutatePriority[]{Default, UserInput, PreventUserInput};
    }
}
