package androidx.compose.material;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0082\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006"}, d2 = {"Landroidx/compose/material/InputPhase;", "", "<init>", "(Ljava/lang/String;I)V", "getHighSpeedVideoFpsRanges", "Camera2StreamConfigurationMap", "getHighSpeedVideoFpsRangesFor"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
final class InputPhase {
    public static final androidx.compose.material.InputPhase Camera2StreamConfigurationMap;
    private static final /* synthetic */ kotlin.enums.EnumEntries getHighResolutionOutputSizeshNQ4ISI;
    public static final androidx.compose.material.InputPhase getHighSpeedVideoFpsRanges;
    public static final androidx.compose.material.InputPhase getHighSpeedVideoFpsRangesFor;
    private static final /* synthetic */ androidx.compose.material.InputPhase[] getHighSpeedVideoSizes;

    private InputPhase(java.lang.String str, int i) {
    }

    static {
        androidx.compose.material.InputPhase inputPhase = new androidx.compose.material.InputPhase("Focused", 0);
        getHighSpeedVideoFpsRanges = inputPhase;
        androidx.compose.material.InputPhase inputPhase2 = new androidx.compose.material.InputPhase("UnfocusedEmpty", 1);
        Camera2StreamConfigurationMap = inputPhase2;
        androidx.compose.material.InputPhase inputPhase3 = new androidx.compose.material.InputPhase("UnfocusedNotEmpty", 2);
        getHighSpeedVideoFpsRangesFor = inputPhase3;
        androidx.compose.material.InputPhase[] inputPhaseArr = {inputPhase, inputPhase2, inputPhase3};
        getHighSpeedVideoSizes = inputPhaseArr;
        getHighResolutionOutputSizeshNQ4ISI = kotlin.enums.EnumEntriesKt.enumEntries(inputPhaseArr);
    }

    public static androidx.compose.material.InputPhase[] values() {
        return (androidx.compose.material.InputPhase[]) getHighSpeedVideoSizes.clone();
    }

    public static androidx.compose.material.InputPhase valueOf(java.lang.String str) {
        return (androidx.compose.material.InputPhase) java.lang.Enum.valueOf(androidx.compose.material.InputPhase.class, str);
    }
}
