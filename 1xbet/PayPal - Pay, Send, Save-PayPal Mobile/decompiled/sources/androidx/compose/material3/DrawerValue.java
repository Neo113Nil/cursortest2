package androidx.compose.material3;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005"}, d2 = {"Landroidx/compose/material3/DrawerValue;", "", "<init>", "(Ljava/lang/String;I)V", "Closed", "Open"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class DrawerValue {
    public static final androidx.compose.material3.DrawerValue Closed;
    public static final androidx.compose.material3.DrawerValue Open;
    private static final /* synthetic */ kotlin.enums.EnumEntries getHighSpeedVideoFpsRangesFor;
    private static final /* synthetic */ androidx.compose.material3.DrawerValue[] getHighSpeedVideoSizes;

    private DrawerValue(java.lang.String str, int i) {
    }

    static {
        androidx.compose.material3.DrawerValue drawerValue = new androidx.compose.material3.DrawerValue("Closed", 0);
        Closed = drawerValue;
        androidx.compose.material3.DrawerValue drawerValue2 = new androidx.compose.material3.DrawerValue("Open", 1);
        Open = drawerValue2;
        androidx.compose.material3.DrawerValue[] drawerValueArr = {drawerValue, drawerValue2};
        getHighSpeedVideoSizes = drawerValueArr;
        getHighSpeedVideoFpsRangesFor = kotlin.enums.EnumEntriesKt.enumEntries(drawerValueArr);
    }

    public static androidx.compose.material3.DrawerValue valueOf(java.lang.String str) {
        return (androidx.compose.material3.DrawerValue) java.lang.Enum.valueOf(androidx.compose.material3.DrawerValue.class, str);
    }

    public static androidx.compose.material3.DrawerValue[] values() {
        return (androidx.compose.material3.DrawerValue[]) getHighSpeedVideoSizes.clone();
    }

    public static kotlin.enums.EnumEntries<androidx.compose.material3.DrawerValue> getEntries() {
        return getHighSpeedVideoFpsRangesFor;
    }
}
