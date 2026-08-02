package androidx.compose.foundation.text.contextmenu.modifier;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0080\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006"}, d2 = {"Landroidx/compose/foundation/text/contextmenu/modifier/ToolbarHandlerState;", "", "<init>", "(Ljava/lang/String;I)V", "Uninitialized", "Detached", "Attached"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class ToolbarHandlerState {
    public static final androidx.compose.foundation.text.contextmenu.modifier.ToolbarHandlerState Attached;
    public static final androidx.compose.foundation.text.contextmenu.modifier.ToolbarHandlerState Detached;
    public static final androidx.compose.foundation.text.contextmenu.modifier.ToolbarHandlerState Uninitialized;
    private static final /* synthetic */ kotlin.enums.EnumEntries getHighSpeedVideoFpsRanges;
    private static final /* synthetic */ androidx.compose.foundation.text.contextmenu.modifier.ToolbarHandlerState[] getHighSpeedVideoFpsRangesFor;

    private ToolbarHandlerState(java.lang.String str, int i) {
    }

    static {
        androidx.compose.foundation.text.contextmenu.modifier.ToolbarHandlerState toolbarHandlerState = new androidx.compose.foundation.text.contextmenu.modifier.ToolbarHandlerState("Uninitialized", 0);
        Uninitialized = toolbarHandlerState;
        androidx.compose.foundation.text.contextmenu.modifier.ToolbarHandlerState toolbarHandlerState2 = new androidx.compose.foundation.text.contextmenu.modifier.ToolbarHandlerState("Detached", 1);
        Detached = toolbarHandlerState2;
        androidx.compose.foundation.text.contextmenu.modifier.ToolbarHandlerState toolbarHandlerState3 = new androidx.compose.foundation.text.contextmenu.modifier.ToolbarHandlerState("Attached", 2);
        Attached = toolbarHandlerState3;
        androidx.compose.foundation.text.contextmenu.modifier.ToolbarHandlerState[] toolbarHandlerStateArr = {toolbarHandlerState, toolbarHandlerState2, toolbarHandlerState3};
        getHighSpeedVideoFpsRangesFor = toolbarHandlerStateArr;
        getHighSpeedVideoFpsRanges = kotlin.enums.EnumEntriesKt.enumEntries(toolbarHandlerStateArr);
    }

    public static androidx.compose.foundation.text.contextmenu.modifier.ToolbarHandlerState[] values() {
        return (androidx.compose.foundation.text.contextmenu.modifier.ToolbarHandlerState[]) getHighSpeedVideoFpsRangesFor.clone();
    }

    public static androidx.compose.foundation.text.contextmenu.modifier.ToolbarHandlerState valueOf(java.lang.String str) {
        return (androidx.compose.foundation.text.contextmenu.modifier.ToolbarHandlerState) java.lang.Enum.valueOf(androidx.compose.foundation.text.contextmenu.modifier.ToolbarHandlerState.class, str);
    }

    public static kotlin.enums.EnumEntries<androidx.compose.foundation.text.contextmenu.modifier.ToolbarHandlerState> getEntries() {
        return getHighSpeedVideoFpsRanges;
    }
}
