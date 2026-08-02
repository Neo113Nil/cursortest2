package androidx.compose.foundation.text.selection;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0080\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006"}, d2 = {"Landroidx/compose/foundation/text/selection/SelectionHandleAnchor;", "", "<init>", "(Ljava/lang/String;I)V", "Left", "Middle", "Right"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class SelectionHandleAnchor {
    private static final /* synthetic */ kotlin.enums.EnumEntries Camera2StreamConfigurationMap;
    public static final androidx.compose.foundation.text.selection.SelectionHandleAnchor Left;
    public static final androidx.compose.foundation.text.selection.SelectionHandleAnchor Middle;
    public static final androidx.compose.foundation.text.selection.SelectionHandleAnchor Right;
    private static final /* synthetic */ androidx.compose.foundation.text.selection.SelectionHandleAnchor[] getHighSpeedVideoFpsRangesFor;

    private SelectionHandleAnchor(java.lang.String str, int i) {
    }

    static {
        androidx.compose.foundation.text.selection.SelectionHandleAnchor selectionHandleAnchor = new androidx.compose.foundation.text.selection.SelectionHandleAnchor("Left", 0);
        Left = selectionHandleAnchor;
        androidx.compose.foundation.text.selection.SelectionHandleAnchor selectionHandleAnchor2 = new androidx.compose.foundation.text.selection.SelectionHandleAnchor("Middle", 1);
        Middle = selectionHandleAnchor2;
        androidx.compose.foundation.text.selection.SelectionHandleAnchor selectionHandleAnchor3 = new androidx.compose.foundation.text.selection.SelectionHandleAnchor("Right", 2);
        Right = selectionHandleAnchor3;
        androidx.compose.foundation.text.selection.SelectionHandleAnchor[] selectionHandleAnchorArr = {selectionHandleAnchor, selectionHandleAnchor2, selectionHandleAnchor3};
        getHighSpeedVideoFpsRangesFor = selectionHandleAnchorArr;
        Camera2StreamConfigurationMap = kotlin.enums.EnumEntriesKt.enumEntries(selectionHandleAnchorArr);
    }

    public static androidx.compose.foundation.text.selection.SelectionHandleAnchor[] values() {
        return (androidx.compose.foundation.text.selection.SelectionHandleAnchor[]) getHighSpeedVideoFpsRangesFor.clone();
    }

    public static androidx.compose.foundation.text.selection.SelectionHandleAnchor valueOf(java.lang.String str) {
        return (androidx.compose.foundation.text.selection.SelectionHandleAnchor) java.lang.Enum.valueOf(androidx.compose.foundation.text.selection.SelectionHandleAnchor.class, str);
    }

    public static kotlin.enums.EnumEntries<androidx.compose.foundation.text.selection.SelectionHandleAnchor> getEntries() {
        return Camera2StreamConfigurationMap;
    }
}
