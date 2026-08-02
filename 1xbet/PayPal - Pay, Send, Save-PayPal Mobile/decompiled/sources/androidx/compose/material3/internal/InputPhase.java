package androidx.compose.material3.internal;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0082\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006"}, d2 = {"Landroidx/compose/material3/internal/InputPhase;", "", "<init>", "(Ljava/lang/String;I)V", "getHighSpeedVideoFpsRangesFor", "getHighResolutionOutputSizeshNQ4ISI", "getHighSpeedVideoFpsRanges"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
final class InputPhase {
    private static final /* synthetic */ androidx.compose.material3.internal.InputPhase[] Camera2StreamConfigurationMap;
    public static final androidx.compose.material3.internal.InputPhase getHighResolutionOutputSizeshNQ4ISI;
    public static final androidx.compose.material3.internal.InputPhase getHighSpeedVideoFpsRanges;
    public static final androidx.compose.material3.internal.InputPhase getHighSpeedVideoFpsRangesFor;
    private static final /* synthetic */ kotlin.enums.EnumEntries getHighSpeedVideoSizes;

    private InputPhase(java.lang.String str, int i) {
    }

    static {
        androidx.compose.material3.internal.InputPhase inputPhase = new androidx.compose.material3.internal.InputPhase("Focused", 0);
        getHighSpeedVideoFpsRangesFor = inputPhase;
        androidx.compose.material3.internal.InputPhase inputPhase2 = new androidx.compose.material3.internal.InputPhase("UnfocusedEmpty", 1);
        getHighResolutionOutputSizeshNQ4ISI = inputPhase2;
        androidx.compose.material3.internal.InputPhase inputPhase3 = new androidx.compose.material3.internal.InputPhase("UnfocusedNotEmpty", 2);
        getHighSpeedVideoFpsRanges = inputPhase3;
        androidx.compose.material3.internal.InputPhase[] inputPhaseArr = {inputPhase, inputPhase2, inputPhase3};
        Camera2StreamConfigurationMap = inputPhaseArr;
        getHighSpeedVideoSizes = kotlin.enums.EnumEntriesKt.enumEntries(inputPhaseArr);
    }

    public static androidx.compose.material3.internal.InputPhase valueOf(java.lang.String str) {
        return (androidx.compose.material3.internal.InputPhase) java.lang.Enum.valueOf(androidx.compose.material3.internal.InputPhase.class, str);
    }

    public static androidx.compose.material3.internal.InputPhase[] values() {
        return (androidx.compose.material3.internal.InputPhase[]) Camera2StreamConfigurationMap.clone();
    }
}
