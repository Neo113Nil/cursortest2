package androidx.compose.ui.node;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0080\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007"}, d2 = {"Landroidx/compose/ui/node/Invalidation;", "", "<init>", "(Ljava/lang/String;I)V", "LookaheadMeasurement", "LookaheadPlacement", "Measurement", "Placement"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class Invalidation {
    public static final androidx.compose.ui.node.Invalidation LookaheadMeasurement = new androidx.compose.ui.node.Invalidation("LookaheadMeasurement", 0);
    public static final androidx.compose.ui.node.Invalidation LookaheadPlacement = new androidx.compose.ui.node.Invalidation("LookaheadPlacement", 1);
    public static final androidx.compose.ui.node.Invalidation Measurement = new androidx.compose.ui.node.Invalidation("Measurement", 2);
    public static final androidx.compose.ui.node.Invalidation Placement = new androidx.compose.ui.node.Invalidation("Placement", 3);
    private static final /* synthetic */ androidx.compose.ui.node.Invalidation[] getHighResolutionOutputSizeshNQ4ISI;
    private static final /* synthetic */ kotlin.enums.EnumEntries getHighSpeedVideoFpsRanges;

    private Invalidation(java.lang.String str, int i) {
    }

    static {
        androidx.compose.ui.node.Invalidation[] Camera2StreamConfigurationMap = Camera2StreamConfigurationMap();
        getHighResolutionOutputSizeshNQ4ISI = Camera2StreamConfigurationMap;
        getHighSpeedVideoFpsRanges = kotlin.enums.EnumEntriesKt.enumEntries(Camera2StreamConfigurationMap);
    }

    public static androidx.compose.ui.node.Invalidation[] values() {
        return (androidx.compose.ui.node.Invalidation[]) getHighResolutionOutputSizeshNQ4ISI.clone();
    }

    public static androidx.compose.ui.node.Invalidation valueOf(java.lang.String str) {
        return (androidx.compose.ui.node.Invalidation) java.lang.Enum.valueOf(androidx.compose.ui.node.Invalidation.class, str);
    }

    public static kotlin.enums.EnumEntries<androidx.compose.ui.node.Invalidation> getEntries() {
        return getHighSpeedVideoFpsRanges;
    }

    private static final /* synthetic */ androidx.compose.ui.node.Invalidation[] Camera2StreamConfigurationMap() {
        return new androidx.compose.ui.node.Invalidation[]{LookaheadMeasurement, LookaheadPlacement, Measurement, Placement};
    }
}
