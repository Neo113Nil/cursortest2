package androidx.compose.ui.input.pointer;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006"}, d2 = {"Landroidx/compose/ui/input/pointer/PointerEventPass;", "", "<init>", "(Ljava/lang/String;I)V", "Initial", "Main", "Final"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class PointerEventPass {
    private static final /* synthetic */ androidx.compose.ui.input.pointer.PointerEventPass[] Camera2StreamConfigurationMap;
    private static final /* synthetic */ kotlin.enums.EnumEntries getHighSpeedVideoFpsRanges;
    public static final androidx.compose.ui.input.pointer.PointerEventPass Initial = new androidx.compose.ui.input.pointer.PointerEventPass("Initial", 0);
    public static final androidx.compose.ui.input.pointer.PointerEventPass Main = new androidx.compose.ui.input.pointer.PointerEventPass("Main", 1);
    public static final androidx.compose.ui.input.pointer.PointerEventPass Final = new androidx.compose.ui.input.pointer.PointerEventPass("Final", 2);

    private PointerEventPass(java.lang.String str, int i) {
    }

    static {
        androidx.compose.ui.input.pointer.PointerEventPass[] highResolutionOutputSizeshNQ4ISI = getHighResolutionOutputSizeshNQ4ISI();
        Camera2StreamConfigurationMap = highResolutionOutputSizeshNQ4ISI;
        getHighSpeedVideoFpsRanges = kotlin.enums.EnumEntriesKt.enumEntries(highResolutionOutputSizeshNQ4ISI);
    }

    public static androidx.compose.ui.input.pointer.PointerEventPass[] values() {
        return (androidx.compose.ui.input.pointer.PointerEventPass[]) Camera2StreamConfigurationMap.clone();
    }

    public static androidx.compose.ui.input.pointer.PointerEventPass valueOf(java.lang.String str) {
        return (androidx.compose.ui.input.pointer.PointerEventPass) java.lang.Enum.valueOf(androidx.compose.ui.input.pointer.PointerEventPass.class, str);
    }

    public static kotlin.enums.EnumEntries<androidx.compose.ui.input.pointer.PointerEventPass> getEntries() {
        return getHighSpeedVideoFpsRanges;
    }

    private static final /* synthetic */ androidx.compose.ui.input.pointer.PointerEventPass[] getHighResolutionOutputSizeshNQ4ISI() {
        return new androidx.compose.ui.input.pointer.PointerEventPass[]{Initial, Main, Final};
    }
}
