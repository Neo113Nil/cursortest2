package androidx.compose.foundation.layout;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0080\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005"}, d2 = {"Landroidx/compose/foundation/layout/LayoutOrientation;", "", "<init>", "(Ljava/lang/String;I)V", "Horizontal", "Vertical"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class LayoutOrientation {
    public static final androidx.compose.foundation.layout.LayoutOrientation Horizontal = new androidx.compose.foundation.layout.LayoutOrientation("Horizontal", 0);
    public static final androidx.compose.foundation.layout.LayoutOrientation Vertical = new androidx.compose.foundation.layout.LayoutOrientation("Vertical", 1);
    private static final /* synthetic */ androidx.compose.foundation.layout.LayoutOrientation[] getHighSpeedVideoFpsRanges;
    private static final /* synthetic */ kotlin.enums.EnumEntries getHighSpeedVideoSizes;

    private LayoutOrientation(java.lang.String str, int i) {
    }

    static {
        androidx.compose.foundation.layout.LayoutOrientation[] highSpeedVideoSizes = getHighSpeedVideoSizes();
        getHighSpeedVideoFpsRanges = highSpeedVideoSizes;
        getHighSpeedVideoSizes = kotlin.enums.EnumEntriesKt.enumEntries(highSpeedVideoSizes);
    }

    public static androidx.compose.foundation.layout.LayoutOrientation[] values() {
        return (androidx.compose.foundation.layout.LayoutOrientation[]) getHighSpeedVideoFpsRanges.clone();
    }

    public static androidx.compose.foundation.layout.LayoutOrientation valueOf(java.lang.String str) {
        return (androidx.compose.foundation.layout.LayoutOrientation) java.lang.Enum.valueOf(androidx.compose.foundation.layout.LayoutOrientation.class, str);
    }

    public static kotlin.enums.EnumEntries<androidx.compose.foundation.layout.LayoutOrientation> getEntries() {
        return getHighSpeedVideoSizes;
    }

    private static final /* synthetic */ androidx.compose.foundation.layout.LayoutOrientation[] getHighSpeedVideoSizes() {
        return new androidx.compose.foundation.layout.LayoutOrientation[]{Horizontal, Vertical};
    }
}
