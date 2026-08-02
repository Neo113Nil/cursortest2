package androidx.compose.animation.core;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005"}, d2 = {"Landroidx/compose/animation/core/RepeatMode;", "", "<init>", "(Ljava/lang/String;I)V", "Restart", "Reverse"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class RepeatMode {
    public static final androidx.compose.animation.core.RepeatMode Restart = new androidx.compose.animation.core.RepeatMode("Restart", 0);
    public static final androidx.compose.animation.core.RepeatMode Reverse = new androidx.compose.animation.core.RepeatMode("Reverse", 1);
    private static final /* synthetic */ androidx.compose.animation.core.RepeatMode[] getHighResolutionOutputSizeshNQ4ISI;
    private static final /* synthetic */ kotlin.enums.EnumEntries getHighSpeedVideoFpsRangesFor;

    private RepeatMode(java.lang.String str, int i) {
    }

    static {
        androidx.compose.animation.core.RepeatMode[] highSpeedVideoFpsRangesFor = getHighSpeedVideoFpsRangesFor();
        getHighResolutionOutputSizeshNQ4ISI = highSpeedVideoFpsRangesFor;
        getHighSpeedVideoFpsRangesFor = kotlin.enums.EnumEntriesKt.enumEntries(highSpeedVideoFpsRangesFor);
    }

    public static androidx.compose.animation.core.RepeatMode[] values() {
        return (androidx.compose.animation.core.RepeatMode[]) getHighResolutionOutputSizeshNQ4ISI.clone();
    }

    public static androidx.compose.animation.core.RepeatMode valueOf(java.lang.String str) {
        return (androidx.compose.animation.core.RepeatMode) java.lang.Enum.valueOf(androidx.compose.animation.core.RepeatMode.class, str);
    }

    public static kotlin.enums.EnumEntries<androidx.compose.animation.core.RepeatMode> getEntries() {
        return getHighSpeedVideoFpsRangesFor;
    }

    private static final /* synthetic */ androidx.compose.animation.core.RepeatMode[] getHighSpeedVideoFpsRangesFor() {
        return new androidx.compose.animation.core.RepeatMode[]{Restart, Reverse};
    }
}
