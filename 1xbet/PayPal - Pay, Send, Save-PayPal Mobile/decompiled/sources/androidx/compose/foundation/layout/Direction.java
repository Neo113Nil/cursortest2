package androidx.compose.foundation.layout;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0080\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006"}, d2 = {"Landroidx/compose/foundation/layout/Direction;", "", "<init>", "(Ljava/lang/String;I)V", "Vertical", "Horizontal", "Both"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class Direction {
    private static final /* synthetic */ androidx.compose.foundation.layout.Direction[] Camera2StreamConfigurationMap;
    private static final /* synthetic */ kotlin.enums.EnumEntries getHighSpeedVideoFpsRangesFor;
    public static final androidx.compose.foundation.layout.Direction Vertical = new androidx.compose.foundation.layout.Direction("Vertical", 0);
    public static final androidx.compose.foundation.layout.Direction Horizontal = new androidx.compose.foundation.layout.Direction("Horizontal", 1);
    public static final androidx.compose.foundation.layout.Direction Both = new androidx.compose.foundation.layout.Direction("Both", 2);

    private Direction(java.lang.String str, int i) {
    }

    static {
        androidx.compose.foundation.layout.Direction[] highSpeedVideoFpsRangesFor = getHighSpeedVideoFpsRangesFor();
        Camera2StreamConfigurationMap = highSpeedVideoFpsRangesFor;
        getHighSpeedVideoFpsRangesFor = kotlin.enums.EnumEntriesKt.enumEntries(highSpeedVideoFpsRangesFor);
    }

    public static androidx.compose.foundation.layout.Direction[] values() {
        return (androidx.compose.foundation.layout.Direction[]) Camera2StreamConfigurationMap.clone();
    }

    public static androidx.compose.foundation.layout.Direction valueOf(java.lang.String str) {
        return (androidx.compose.foundation.layout.Direction) java.lang.Enum.valueOf(androidx.compose.foundation.layout.Direction.class, str);
    }

    public static kotlin.enums.EnumEntries<androidx.compose.foundation.layout.Direction> getEntries() {
        return getHighSpeedVideoFpsRangesFor;
    }

    private static final /* synthetic */ androidx.compose.foundation.layout.Direction[] getHighSpeedVideoFpsRangesFor() {
        return new androidx.compose.foundation.layout.Direction[]{Vertical, Horizontal, Both};
    }
}
