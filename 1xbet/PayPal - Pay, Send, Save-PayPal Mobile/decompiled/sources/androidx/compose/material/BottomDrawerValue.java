package androidx.compose.material;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006"}, d2 = {"Landroidx/compose/material/BottomDrawerValue;", "", "<init>", "(Ljava/lang/String;I)V", "Closed", "Open", "Expanded"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class BottomDrawerValue {
    private static final /* synthetic */ androidx.compose.material.BottomDrawerValue[] Camera2StreamConfigurationMap;
    public static final androidx.compose.material.BottomDrawerValue Closed;
    public static final androidx.compose.material.BottomDrawerValue Expanded;
    public static final androidx.compose.material.BottomDrawerValue Open;
    private static final /* synthetic */ kotlin.enums.EnumEntries getHighSpeedVideoFpsRangesFor;

    private BottomDrawerValue(java.lang.String str, int i) {
    }

    static {
        androidx.compose.material.BottomDrawerValue bottomDrawerValue = new androidx.compose.material.BottomDrawerValue("Closed", 0);
        Closed = bottomDrawerValue;
        androidx.compose.material.BottomDrawerValue bottomDrawerValue2 = new androidx.compose.material.BottomDrawerValue("Open", 1);
        Open = bottomDrawerValue2;
        androidx.compose.material.BottomDrawerValue bottomDrawerValue3 = new androidx.compose.material.BottomDrawerValue("Expanded", 2);
        Expanded = bottomDrawerValue3;
        androidx.compose.material.BottomDrawerValue[] bottomDrawerValueArr = {bottomDrawerValue, bottomDrawerValue2, bottomDrawerValue3};
        Camera2StreamConfigurationMap = bottomDrawerValueArr;
        getHighSpeedVideoFpsRangesFor = kotlin.enums.EnumEntriesKt.enumEntries(bottomDrawerValueArr);
    }

    public static androidx.compose.material.BottomDrawerValue[] values() {
        return (androidx.compose.material.BottomDrawerValue[]) Camera2StreamConfigurationMap.clone();
    }

    public static androidx.compose.material.BottomDrawerValue valueOf(java.lang.String str) {
        return (androidx.compose.material.BottomDrawerValue) java.lang.Enum.valueOf(androidx.compose.material.BottomDrawerValue.class, str);
    }

    public static kotlin.enums.EnumEntries<androidx.compose.material.BottomDrawerValue> getEntries() {
        return getHighSpeedVideoFpsRangesFor;
    }
}
