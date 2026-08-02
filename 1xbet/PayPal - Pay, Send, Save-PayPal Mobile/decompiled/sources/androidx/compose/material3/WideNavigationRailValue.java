package androidx.compose.material3;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005"}, d2 = {"Landroidx/compose/material3/WideNavigationRailValue;", "", "<init>", "(Ljava/lang/String;I)V", "Collapsed", "Expanded"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class WideNavigationRailValue {
    private static final /* synthetic */ kotlin.enums.EnumEntries Camera2StreamConfigurationMap;
    public static final androidx.compose.material3.WideNavigationRailValue Collapsed;
    public static final androidx.compose.material3.WideNavigationRailValue Expanded;
    private static final /* synthetic */ androidx.compose.material3.WideNavigationRailValue[] getHighSpeedVideoSizes;

    private WideNavigationRailValue(java.lang.String str, int i) {
    }

    static {
        androidx.compose.material3.WideNavigationRailValue wideNavigationRailValue = new androidx.compose.material3.WideNavigationRailValue("Collapsed", 0);
        Collapsed = wideNavigationRailValue;
        androidx.compose.material3.WideNavigationRailValue wideNavigationRailValue2 = new androidx.compose.material3.WideNavigationRailValue("Expanded", 1);
        Expanded = wideNavigationRailValue2;
        androidx.compose.material3.WideNavigationRailValue[] wideNavigationRailValueArr = {wideNavigationRailValue, wideNavigationRailValue2};
        getHighSpeedVideoSizes = wideNavigationRailValueArr;
        Camera2StreamConfigurationMap = kotlin.enums.EnumEntriesKt.enumEntries(wideNavigationRailValueArr);
    }

    public static androidx.compose.material3.WideNavigationRailValue valueOf(java.lang.String str) {
        return (androidx.compose.material3.WideNavigationRailValue) java.lang.Enum.valueOf(androidx.compose.material3.WideNavigationRailValue.class, str);
    }

    public static androidx.compose.material3.WideNavigationRailValue[] values() {
        return (androidx.compose.material3.WideNavigationRailValue[]) getHighSpeedVideoSizes.clone();
    }

    public static kotlin.enums.EnumEntries<androidx.compose.material3.WideNavigationRailValue> getEntries() {
        return Camera2StreamConfigurationMap;
    }
}
