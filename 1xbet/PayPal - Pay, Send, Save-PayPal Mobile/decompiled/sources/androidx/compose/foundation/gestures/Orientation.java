package androidx.compose.foundation.gestures;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005"}, d2 = {"Landroidx/compose/foundation/gestures/Orientation;", "", "<init>", "(Ljava/lang/String;I)V", "Vertical", "Horizontal"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class Orientation {
    private static final /* synthetic */ androidx.compose.foundation.gestures.Orientation[] getHighResolutionOutputSizeshNQ4ISI;
    private static final /* synthetic */ kotlin.enums.EnumEntries getHighSpeedVideoFpsRanges;
    public static final androidx.compose.foundation.gestures.Orientation Vertical = new androidx.compose.foundation.gestures.Orientation("Vertical", 0);
    public static final androidx.compose.foundation.gestures.Orientation Horizontal = new androidx.compose.foundation.gestures.Orientation("Horizontal", 1);

    private Orientation(java.lang.String str, int i) {
    }

    static {
        androidx.compose.foundation.gestures.Orientation[] highSpeedVideoFpsRanges = getHighSpeedVideoFpsRanges();
        getHighResolutionOutputSizeshNQ4ISI = highSpeedVideoFpsRanges;
        getHighSpeedVideoFpsRanges = kotlin.enums.EnumEntriesKt.enumEntries(highSpeedVideoFpsRanges);
    }

    public static androidx.compose.foundation.gestures.Orientation[] values() {
        return (androidx.compose.foundation.gestures.Orientation[]) getHighResolutionOutputSizeshNQ4ISI.clone();
    }

    public static androidx.compose.foundation.gestures.Orientation valueOf(java.lang.String str) {
        return (androidx.compose.foundation.gestures.Orientation) java.lang.Enum.valueOf(androidx.compose.foundation.gestures.Orientation.class, str);
    }

    public static kotlin.enums.EnumEntries<androidx.compose.foundation.gestures.Orientation> getEntries() {
        return getHighSpeedVideoFpsRanges;
    }

    private static final /* synthetic */ androidx.compose.foundation.gestures.Orientation[] getHighSpeedVideoFpsRanges() {
        return new androidx.compose.foundation.gestures.Orientation[]{Vertical, Horizontal};
    }
}
