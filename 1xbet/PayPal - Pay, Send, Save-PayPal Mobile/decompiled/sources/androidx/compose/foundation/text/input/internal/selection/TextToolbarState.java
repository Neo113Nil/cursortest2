package androidx.compose.foundation.text.input.internal.selection;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0080\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006"}, d2 = {"Landroidx/compose/foundation/text/input/internal/selection/TextToolbarState;", "", "<init>", "(Ljava/lang/String;I)V", com.adobe.marketing.mobile.internal.CoreConstants.Wrapper.Name.NONE, "Cursor", "Selection"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class TextToolbarState {
    public static final androidx.compose.foundation.text.input.internal.selection.TextToolbarState Cursor;
    public static final androidx.compose.foundation.text.input.internal.selection.TextToolbarState None;
    public static final androidx.compose.foundation.text.input.internal.selection.TextToolbarState Selection;
    private static final /* synthetic */ androidx.compose.foundation.text.input.internal.selection.TextToolbarState[] getHighSpeedVideoFpsRanges;
    private static final /* synthetic */ kotlin.enums.EnumEntries getHighSpeedVideoFpsRangesFor;

    private TextToolbarState(java.lang.String str, int i) {
    }

    static {
        androidx.compose.foundation.text.input.internal.selection.TextToolbarState textToolbarState = new androidx.compose.foundation.text.input.internal.selection.TextToolbarState(com.adobe.marketing.mobile.internal.CoreConstants.Wrapper.Name.NONE, 0);
        None = textToolbarState;
        androidx.compose.foundation.text.input.internal.selection.TextToolbarState textToolbarState2 = new androidx.compose.foundation.text.input.internal.selection.TextToolbarState("Cursor", 1);
        Cursor = textToolbarState2;
        androidx.compose.foundation.text.input.internal.selection.TextToolbarState textToolbarState3 = new androidx.compose.foundation.text.input.internal.selection.TextToolbarState("Selection", 2);
        Selection = textToolbarState3;
        androidx.compose.foundation.text.input.internal.selection.TextToolbarState[] textToolbarStateArr = {textToolbarState, textToolbarState2, textToolbarState3};
        getHighSpeedVideoFpsRanges = textToolbarStateArr;
        getHighSpeedVideoFpsRangesFor = kotlin.enums.EnumEntriesKt.enumEntries(textToolbarStateArr);
    }

    public static androidx.compose.foundation.text.input.internal.selection.TextToolbarState[] values() {
        return (androidx.compose.foundation.text.input.internal.selection.TextToolbarState[]) getHighSpeedVideoFpsRanges.clone();
    }

    public static androidx.compose.foundation.text.input.internal.selection.TextToolbarState valueOf(java.lang.String str) {
        return (androidx.compose.foundation.text.input.internal.selection.TextToolbarState) java.lang.Enum.valueOf(androidx.compose.foundation.text.input.internal.selection.TextToolbarState.class, str);
    }

    public static kotlin.enums.EnumEntries<androidx.compose.foundation.text.input.internal.selection.TextToolbarState> getEntries() {
        return getHighSpeedVideoFpsRangesFor;
    }
}
