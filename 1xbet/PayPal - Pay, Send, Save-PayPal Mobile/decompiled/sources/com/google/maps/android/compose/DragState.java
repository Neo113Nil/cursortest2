package com.google.maps.android.compose;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Deprecated(message = "START, DRAG, END are events, not states. Avoid usage.")
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0087\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006"}, d2 = {"Lcom/google/maps/android/compose/DragState;", "", "<init>", "(Ljava/lang/String;I)V", "START", "DRAG", "END"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes.dex */
public final class DragState {
    private static final /* synthetic */ kotlin.enums.EnumEntries $ENTRIES;
    private static final /* synthetic */ com.google.maps.android.compose.DragState[] $VALUES;
    public static final com.google.maps.android.compose.DragState START = new com.google.maps.android.compose.DragState("START", 0);
    public static final com.google.maps.android.compose.DragState DRAG = new com.google.maps.android.compose.DragState("DRAG", 1);
    public static final com.google.maps.android.compose.DragState END = new com.google.maps.android.compose.DragState("END", 2);

    private DragState(java.lang.String str, int i) {
    }

    static {
        com.google.maps.android.compose.DragState[] $values = $values();
        $VALUES = $values;
        $ENTRIES = kotlin.enums.EnumEntriesKt.enumEntries($values);
    }

    public static com.google.maps.android.compose.DragState[] values() {
        return (com.google.maps.android.compose.DragState[]) $VALUES.clone();
    }

    public static com.google.maps.android.compose.DragState valueOf(java.lang.String str) {
        return (com.google.maps.android.compose.DragState) java.lang.Enum.valueOf(com.google.maps.android.compose.DragState.class, str);
    }

    public static kotlin.enums.EnumEntries<com.google.maps.android.compose.DragState> getEntries() {
        return $ENTRIES;
    }

    private static final /* synthetic */ com.google.maps.android.compose.DragState[] $values() {
        return new com.google.maps.android.compose.DragState[]{START, DRAG, END};
    }
}
