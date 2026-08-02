package androidx.compose.foundation.layout;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005"}, d2 = {"Landroidx/compose/foundation/layout/IntrinsicSize;", "", "<init>", "(Ljava/lang/String;I)V", "Min", "Max"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class IntrinsicSize {
    private static final /* synthetic */ androidx.compose.foundation.layout.IntrinsicSize[] Camera2StreamConfigurationMap;
    private static final /* synthetic */ kotlin.enums.EnumEntries getHighSpeedVideoFpsRangesFor;
    public static final androidx.compose.foundation.layout.IntrinsicSize Min = new androidx.compose.foundation.layout.IntrinsicSize("Min", 0);
    public static final androidx.compose.foundation.layout.IntrinsicSize Max = new androidx.compose.foundation.layout.IntrinsicSize("Max", 1);

    private IntrinsicSize(java.lang.String str, int i) {
    }

    static {
        androidx.compose.foundation.layout.IntrinsicSize[] highSpeedVideoSizes = getHighSpeedVideoSizes();
        Camera2StreamConfigurationMap = highSpeedVideoSizes;
        getHighSpeedVideoFpsRangesFor = kotlin.enums.EnumEntriesKt.enumEntries(highSpeedVideoSizes);
    }

    public static androidx.compose.foundation.layout.IntrinsicSize[] values() {
        return (androidx.compose.foundation.layout.IntrinsicSize[]) Camera2StreamConfigurationMap.clone();
    }

    public static androidx.compose.foundation.layout.IntrinsicSize valueOf(java.lang.String str) {
        return (androidx.compose.foundation.layout.IntrinsicSize) java.lang.Enum.valueOf(androidx.compose.foundation.layout.IntrinsicSize.class, str);
    }

    public static kotlin.enums.EnumEntries<androidx.compose.foundation.layout.IntrinsicSize> getEntries() {
        return getHighSpeedVideoFpsRangesFor;
    }

    private static final /* synthetic */ androidx.compose.foundation.layout.IntrinsicSize[] getHighSpeedVideoSizes() {
        return new androidx.compose.foundation.layout.IntrinsicSize[]{Min, Max};
    }
}
