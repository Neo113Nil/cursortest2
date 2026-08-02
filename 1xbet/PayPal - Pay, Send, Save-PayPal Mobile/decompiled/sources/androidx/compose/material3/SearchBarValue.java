package androidx.compose.material3;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005"}, d2 = {"Landroidx/compose/material3/SearchBarValue;", "", "<init>", "(Ljava/lang/String;I)V", "Collapsed", "Expanded"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class SearchBarValue {
    private static final /* synthetic */ kotlin.enums.EnumEntries Camera2StreamConfigurationMap;
    public static final androidx.compose.material3.SearchBarValue Collapsed;
    public static final androidx.compose.material3.SearchBarValue Expanded;
    private static final /* synthetic */ androidx.compose.material3.SearchBarValue[] getHighResolutionOutputSizeshNQ4ISI;

    private SearchBarValue(java.lang.String str, int i) {
    }

    static {
        androidx.compose.material3.SearchBarValue searchBarValue = new androidx.compose.material3.SearchBarValue("Collapsed", 0);
        Collapsed = searchBarValue;
        androidx.compose.material3.SearchBarValue searchBarValue2 = new androidx.compose.material3.SearchBarValue("Expanded", 1);
        Expanded = searchBarValue2;
        androidx.compose.material3.SearchBarValue[] searchBarValueArr = {searchBarValue, searchBarValue2};
        getHighResolutionOutputSizeshNQ4ISI = searchBarValueArr;
        Camera2StreamConfigurationMap = kotlin.enums.EnumEntriesKt.enumEntries(searchBarValueArr);
    }

    public static androidx.compose.material3.SearchBarValue valueOf(java.lang.String str) {
        return (androidx.compose.material3.SearchBarValue) java.lang.Enum.valueOf(androidx.compose.material3.SearchBarValue.class, str);
    }

    public static androidx.compose.material3.SearchBarValue[] values() {
        return (androidx.compose.material3.SearchBarValue[]) getHighResolutionOutputSizeshNQ4ISI.clone();
    }

    public static kotlin.enums.EnumEntries<androidx.compose.material3.SearchBarValue> getEntries() {
        return Camera2StreamConfigurationMap;
    }
}
