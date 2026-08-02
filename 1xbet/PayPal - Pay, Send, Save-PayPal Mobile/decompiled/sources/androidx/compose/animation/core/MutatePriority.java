package androidx.compose.animation.core;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0080\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006"}, d2 = {"Landroidx/compose/animation/core/MutatePriority;", "", "<init>", "(Ljava/lang/String;I)V", "Default", "UserInput", "PreventUserInput"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class MutatePriority {
    private static final /* synthetic */ kotlin.enums.EnumEntries getHighResolutionOutputSizeshNQ4ISI;
    private static final /* synthetic */ androidx.compose.animation.core.MutatePriority[] getHighSpeedVideoFpsRanges;
    public static final androidx.compose.animation.core.MutatePriority Default = new androidx.compose.animation.core.MutatePriority("Default", 0);
    public static final androidx.compose.animation.core.MutatePriority UserInput = new androidx.compose.animation.core.MutatePriority("UserInput", 1);
    public static final androidx.compose.animation.core.MutatePriority PreventUserInput = new androidx.compose.animation.core.MutatePriority("PreventUserInput", 2);

    private MutatePriority(java.lang.String str, int i) {
    }

    static {
        androidx.compose.animation.core.MutatePriority[] highSpeedVideoSizes = getHighSpeedVideoSizes();
        getHighSpeedVideoFpsRanges = highSpeedVideoSizes;
        getHighResolutionOutputSizeshNQ4ISI = kotlin.enums.EnumEntriesKt.enumEntries(highSpeedVideoSizes);
    }

    public static androidx.compose.animation.core.MutatePriority[] values() {
        return (androidx.compose.animation.core.MutatePriority[]) getHighSpeedVideoFpsRanges.clone();
    }

    public static androidx.compose.animation.core.MutatePriority valueOf(java.lang.String str) {
        return (androidx.compose.animation.core.MutatePriority) java.lang.Enum.valueOf(androidx.compose.animation.core.MutatePriority.class, str);
    }

    public static kotlin.enums.EnumEntries<androidx.compose.animation.core.MutatePriority> getEntries() {
        return getHighResolutionOutputSizeshNQ4ISI;
    }

    private static final /* synthetic */ androidx.compose.animation.core.MutatePriority[] getHighSpeedVideoSizes() {
        return new androidx.compose.animation.core.MutatePriority[]{Default, UserInput, PreventUserInput};
    }
}
