package androidx.compose.foundation.text.selection;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0080\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006"}, d2 = {"Landroidx/compose/foundation/text/selection/Direction;", "", "<init>", "(Ljava/lang/String;I)V", "BEFORE", "ON", "AFTER"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class Direction {
    public static final androidx.compose.foundation.text.selection.Direction AFTER;
    public static final androidx.compose.foundation.text.selection.Direction BEFORE;
    public static final androidx.compose.foundation.text.selection.Direction ON;
    private static final /* synthetic */ androidx.compose.foundation.text.selection.Direction[] getHighSpeedVideoFpsRanges;
    private static final /* synthetic */ kotlin.enums.EnumEntries getHighSpeedVideoFpsRangesFor;

    private Direction(java.lang.String str, int i) {
    }

    static {
        androidx.compose.foundation.text.selection.Direction direction = new androidx.compose.foundation.text.selection.Direction("BEFORE", 0);
        BEFORE = direction;
        androidx.compose.foundation.text.selection.Direction direction2 = new androidx.compose.foundation.text.selection.Direction("ON", 1);
        ON = direction2;
        androidx.compose.foundation.text.selection.Direction direction3 = new androidx.compose.foundation.text.selection.Direction("AFTER", 2);
        AFTER = direction3;
        androidx.compose.foundation.text.selection.Direction[] directionArr = {direction, direction2, direction3};
        getHighSpeedVideoFpsRanges = directionArr;
        getHighSpeedVideoFpsRangesFor = kotlin.enums.EnumEntriesKt.enumEntries(directionArr);
    }

    public static androidx.compose.foundation.text.selection.Direction[] values() {
        return (androidx.compose.foundation.text.selection.Direction[]) getHighSpeedVideoFpsRanges.clone();
    }

    public static androidx.compose.foundation.text.selection.Direction valueOf(java.lang.String str) {
        return (androidx.compose.foundation.text.selection.Direction) java.lang.Enum.valueOf(androidx.compose.foundation.text.selection.Direction.class, str);
    }

    public static kotlin.enums.EnumEntries<androidx.compose.foundation.text.selection.Direction> getEntries() {
        return getHighSpeedVideoFpsRangesFor;
    }
}
