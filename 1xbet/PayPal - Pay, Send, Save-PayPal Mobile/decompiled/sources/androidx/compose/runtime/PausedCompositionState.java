package androidx.compose.runtime;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\t\b\u0080\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\n"}, d2 = {"Landroidx/compose/runtime/PausedCompositionState;", "", "<init>", "(Ljava/lang/String;I)V", "Invalid", "Cancelled", "InitialPending", "RecomposePending", "Recomposing", "ApplyPending", "Applied"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class PausedCompositionState {
    public static final androidx.compose.runtime.PausedCompositionState Applied;
    public static final androidx.compose.runtime.PausedCompositionState ApplyPending;
    public static final androidx.compose.runtime.PausedCompositionState Cancelled;
    public static final androidx.compose.runtime.PausedCompositionState InitialPending;
    public static final androidx.compose.runtime.PausedCompositionState Invalid;
    public static final androidx.compose.runtime.PausedCompositionState RecomposePending;
    public static final androidx.compose.runtime.PausedCompositionState Recomposing;
    private static final /* synthetic */ androidx.compose.runtime.PausedCompositionState[] getHighResolutionOutputSizeshNQ4ISI;
    private static final /* synthetic */ kotlin.enums.EnumEntries getHighSpeedVideoFpsRanges;

    private PausedCompositionState(java.lang.String str, int i) {
    }

    static {
        androidx.compose.runtime.PausedCompositionState pausedCompositionState = new androidx.compose.runtime.PausedCompositionState("Invalid", 0);
        Invalid = pausedCompositionState;
        androidx.compose.runtime.PausedCompositionState pausedCompositionState2 = new androidx.compose.runtime.PausedCompositionState("Cancelled", 1);
        Cancelled = pausedCompositionState2;
        androidx.compose.runtime.PausedCompositionState pausedCompositionState3 = new androidx.compose.runtime.PausedCompositionState("InitialPending", 2);
        InitialPending = pausedCompositionState3;
        androidx.compose.runtime.PausedCompositionState pausedCompositionState4 = new androidx.compose.runtime.PausedCompositionState("RecomposePending", 3);
        RecomposePending = pausedCompositionState4;
        androidx.compose.runtime.PausedCompositionState pausedCompositionState5 = new androidx.compose.runtime.PausedCompositionState("Recomposing", 4);
        Recomposing = pausedCompositionState5;
        androidx.compose.runtime.PausedCompositionState pausedCompositionState6 = new androidx.compose.runtime.PausedCompositionState("ApplyPending", 5);
        ApplyPending = pausedCompositionState6;
        androidx.compose.runtime.PausedCompositionState pausedCompositionState7 = new androidx.compose.runtime.PausedCompositionState("Applied", 6);
        Applied = pausedCompositionState7;
        androidx.compose.runtime.PausedCompositionState[] pausedCompositionStateArr = {pausedCompositionState, pausedCompositionState2, pausedCompositionState3, pausedCompositionState4, pausedCompositionState5, pausedCompositionState6, pausedCompositionState7};
        getHighResolutionOutputSizeshNQ4ISI = pausedCompositionStateArr;
        getHighSpeedVideoFpsRanges = kotlin.enums.EnumEntriesKt.enumEntries(pausedCompositionStateArr);
    }

    public static androidx.compose.runtime.PausedCompositionState[] values() {
        return (androidx.compose.runtime.PausedCompositionState[]) getHighResolutionOutputSizeshNQ4ISI.clone();
    }

    public static androidx.compose.runtime.PausedCompositionState valueOf(java.lang.String str) {
        return (androidx.compose.runtime.PausedCompositionState) java.lang.Enum.valueOf(androidx.compose.runtime.PausedCompositionState.class, str);
    }

    public static kotlin.enums.EnumEntries<androidx.compose.runtime.PausedCompositionState> getEntries() {
        return getHighSpeedVideoFpsRanges;
    }
}
