package androidx.compose.material3;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0082\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005"}, d2 = {"Landroidx/compose/material3/LayoutId;", "", "<init>", "(Ljava/lang/String;I)V", "getHighSpeedVideoFpsRangesFor", "Camera2StreamConfigurationMap"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
final class LayoutId {
    public static final androidx.compose.material3.LayoutId Camera2StreamConfigurationMap;
    private static final /* synthetic */ kotlin.enums.EnumEntries getHighSpeedVideoFpsRanges;
    public static final androidx.compose.material3.LayoutId getHighSpeedVideoFpsRangesFor;
    private static final /* synthetic */ androidx.compose.material3.LayoutId[] getHighSpeedVideoSizes;

    private LayoutId(java.lang.String str, int i) {
    }

    static {
        androidx.compose.material3.LayoutId layoutId = new androidx.compose.material3.LayoutId("Selector", 0);
        getHighSpeedVideoFpsRangesFor = layoutId;
        androidx.compose.material3.LayoutId layoutId2 = new androidx.compose.material3.LayoutId("InnerCircle", 1);
        Camera2StreamConfigurationMap = layoutId2;
        androidx.compose.material3.LayoutId[] layoutIdArr = {layoutId, layoutId2};
        getHighSpeedVideoSizes = layoutIdArr;
        getHighSpeedVideoFpsRanges = kotlin.enums.EnumEntriesKt.enumEntries(layoutIdArr);
    }

    public static androidx.compose.material3.LayoutId valueOf(java.lang.String str) {
        return (androidx.compose.material3.LayoutId) java.lang.Enum.valueOf(androidx.compose.material3.LayoutId.class, str);
    }

    public static androidx.compose.material3.LayoutId[] values() {
        return (androidx.compose.material3.LayoutId[]) getHighSpeedVideoSizes.clone();
    }
}
