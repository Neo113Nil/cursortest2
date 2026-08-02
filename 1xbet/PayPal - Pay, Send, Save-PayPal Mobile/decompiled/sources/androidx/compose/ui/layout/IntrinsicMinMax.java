package androidx.compose.ui.layout;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0080\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005"}, d2 = {"Landroidx/compose/ui/layout/IntrinsicMinMax;", "", "<init>", "(Ljava/lang/String;I)V", "Min", "Max"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class IntrinsicMinMax {
    private static final /* synthetic */ androidx.compose.ui.layout.IntrinsicMinMax[] getHighSpeedVideoFpsRangesFor;
    private static final /* synthetic */ kotlin.enums.EnumEntries getHighSpeedVideoSizes;
    public static final androidx.compose.ui.layout.IntrinsicMinMax Min = new androidx.compose.ui.layout.IntrinsicMinMax("Min", 0);
    public static final androidx.compose.ui.layout.IntrinsicMinMax Max = new androidx.compose.ui.layout.IntrinsicMinMax("Max", 1);

    private IntrinsicMinMax(java.lang.String str, int i) {
    }

    static {
        androidx.compose.ui.layout.IntrinsicMinMax[] highSpeedVideoFpsRangesFor = getHighSpeedVideoFpsRangesFor();
        getHighSpeedVideoFpsRangesFor = highSpeedVideoFpsRangesFor;
        getHighSpeedVideoSizes = kotlin.enums.EnumEntriesKt.enumEntries(highSpeedVideoFpsRangesFor);
    }

    public static androidx.compose.ui.layout.IntrinsicMinMax[] values() {
        return (androidx.compose.ui.layout.IntrinsicMinMax[]) getHighSpeedVideoFpsRangesFor.clone();
    }

    public static androidx.compose.ui.layout.IntrinsicMinMax valueOf(java.lang.String str) {
        return (androidx.compose.ui.layout.IntrinsicMinMax) java.lang.Enum.valueOf(androidx.compose.ui.layout.IntrinsicMinMax.class, str);
    }

    public static kotlin.enums.EnumEntries<androidx.compose.ui.layout.IntrinsicMinMax> getEntries() {
        return getHighSpeedVideoSizes;
    }

    private static final /* synthetic */ androidx.compose.ui.layout.IntrinsicMinMax[] getHighSpeedVideoFpsRangesFor() {
        return new androidx.compose.ui.layout.IntrinsicMinMax[]{Min, Max};
    }
}
