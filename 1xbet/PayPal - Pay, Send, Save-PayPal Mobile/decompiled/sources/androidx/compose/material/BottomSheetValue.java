package androidx.compose.material;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005"}, d2 = {"Landroidx/compose/material/BottomSheetValue;", "", "<init>", "(Ljava/lang/String;I)V", "Collapsed", "Expanded"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class BottomSheetValue {
    private static final /* synthetic */ androidx.compose.material.BottomSheetValue[] Camera2StreamConfigurationMap;
    public static final androidx.compose.material.BottomSheetValue Collapsed;
    public static final androidx.compose.material.BottomSheetValue Expanded;
    private static final /* synthetic */ kotlin.enums.EnumEntries getHighResolutionOutputSizeshNQ4ISI;

    private BottomSheetValue(java.lang.String str, int i) {
    }

    static {
        androidx.compose.material.BottomSheetValue bottomSheetValue = new androidx.compose.material.BottomSheetValue("Collapsed", 0);
        Collapsed = bottomSheetValue;
        androidx.compose.material.BottomSheetValue bottomSheetValue2 = new androidx.compose.material.BottomSheetValue("Expanded", 1);
        Expanded = bottomSheetValue2;
        androidx.compose.material.BottomSheetValue[] bottomSheetValueArr = {bottomSheetValue, bottomSheetValue2};
        Camera2StreamConfigurationMap = bottomSheetValueArr;
        getHighResolutionOutputSizeshNQ4ISI = kotlin.enums.EnumEntriesKt.enumEntries(bottomSheetValueArr);
    }

    public static androidx.compose.material.BottomSheetValue[] values() {
        return (androidx.compose.material.BottomSheetValue[]) Camera2StreamConfigurationMap.clone();
    }

    public static androidx.compose.material.BottomSheetValue valueOf(java.lang.String str) {
        return (androidx.compose.material.BottomSheetValue) java.lang.Enum.valueOf(androidx.compose.material.BottomSheetValue.class, str);
    }

    public static kotlin.enums.EnumEntries<androidx.compose.material.BottomSheetValue> getEntries() {
        return getHighResolutionOutputSizeshNQ4ISI;
    }
}
