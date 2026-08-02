package androidx.compose.material3;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006"}, d2 = {"Landroidx/compose/material3/SheetValue;", "", "<init>", "(Ljava/lang/String;I)V", "Hidden", "Expanded", "PartiallyExpanded"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class SheetValue {
    public static final androidx.compose.material3.SheetValue Expanded;
    public static final androidx.compose.material3.SheetValue Hidden;
    public static final androidx.compose.material3.SheetValue PartiallyExpanded;
    private static final /* synthetic */ androidx.compose.material3.SheetValue[] getHighResolutionOutputSizeshNQ4ISI;
    private static final /* synthetic */ kotlin.enums.EnumEntries getHighSpeedVideoSizes;

    private SheetValue(java.lang.String str, int i) {
    }

    static {
        androidx.compose.material3.SheetValue sheetValue = new androidx.compose.material3.SheetValue("Hidden", 0);
        Hidden = sheetValue;
        androidx.compose.material3.SheetValue sheetValue2 = new androidx.compose.material3.SheetValue("Expanded", 1);
        Expanded = sheetValue2;
        androidx.compose.material3.SheetValue sheetValue3 = new androidx.compose.material3.SheetValue("PartiallyExpanded", 2);
        PartiallyExpanded = sheetValue3;
        androidx.compose.material3.SheetValue[] sheetValueArr = {sheetValue, sheetValue2, sheetValue3};
        getHighResolutionOutputSizeshNQ4ISI = sheetValueArr;
        getHighSpeedVideoSizes = kotlin.enums.EnumEntriesKt.enumEntries(sheetValueArr);
    }

    public static androidx.compose.material3.SheetValue valueOf(java.lang.String str) {
        return (androidx.compose.material3.SheetValue) java.lang.Enum.valueOf(androidx.compose.material3.SheetValue.class, str);
    }

    public static androidx.compose.material3.SheetValue[] values() {
        return (androidx.compose.material3.SheetValue[]) getHighResolutionOutputSizeshNQ4ISI.clone();
    }

    public static kotlin.enums.EnumEntries<androidx.compose.material3.SheetValue> getEntries() {
        return getHighSpeedVideoSizes;
    }
}
