package androidx.compose.material;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006"}, d2 = {"Landroidx/compose/material/ModalBottomSheetValue;", "", "<init>", "(Ljava/lang/String;I)V", "Hidden", "Expanded", "HalfExpanded"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class ModalBottomSheetValue {
    public static final androidx.compose.material.ModalBottomSheetValue Expanded;
    public static final androidx.compose.material.ModalBottomSheetValue HalfExpanded;
    public static final androidx.compose.material.ModalBottomSheetValue Hidden;
    private static final /* synthetic */ androidx.compose.material.ModalBottomSheetValue[] getHighSpeedVideoFpsRanges;
    private static final /* synthetic */ kotlin.enums.EnumEntries getHighSpeedVideoSizes;

    private ModalBottomSheetValue(java.lang.String str, int i) {
    }

    static {
        androidx.compose.material.ModalBottomSheetValue modalBottomSheetValue = new androidx.compose.material.ModalBottomSheetValue("Hidden", 0);
        Hidden = modalBottomSheetValue;
        androidx.compose.material.ModalBottomSheetValue modalBottomSheetValue2 = new androidx.compose.material.ModalBottomSheetValue("Expanded", 1);
        Expanded = modalBottomSheetValue2;
        androidx.compose.material.ModalBottomSheetValue modalBottomSheetValue3 = new androidx.compose.material.ModalBottomSheetValue("HalfExpanded", 2);
        HalfExpanded = modalBottomSheetValue3;
        androidx.compose.material.ModalBottomSheetValue[] modalBottomSheetValueArr = {modalBottomSheetValue, modalBottomSheetValue2, modalBottomSheetValue3};
        getHighSpeedVideoFpsRanges = modalBottomSheetValueArr;
        getHighSpeedVideoSizes = kotlin.enums.EnumEntriesKt.enumEntries(modalBottomSheetValueArr);
    }

    public static androidx.compose.material.ModalBottomSheetValue[] values() {
        return (androidx.compose.material.ModalBottomSheetValue[]) getHighSpeedVideoFpsRanges.clone();
    }

    public static androidx.compose.material.ModalBottomSheetValue valueOf(java.lang.String str) {
        return (androidx.compose.material.ModalBottomSheetValue) java.lang.Enum.valueOf(androidx.compose.material.ModalBottomSheetValue.class, str);
    }

    public static kotlin.enums.EnumEntries<androidx.compose.material.ModalBottomSheetValue> getEntries() {
        return getHighSpeedVideoSizes;
    }
}
