package androidx.compose.foundation.text.selection;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0080\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005"}, d2 = {"Landroidx/compose/foundation/text/selection/SelectedTextType;", "", "<init>", "(Ljava/lang/String;I)V", "EditableText", "StaticText"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class SelectedTextType {
    public static final androidx.compose.foundation.text.selection.SelectedTextType EditableText;
    public static final androidx.compose.foundation.text.selection.SelectedTextType StaticText;
    private static final /* synthetic */ androidx.compose.foundation.text.selection.SelectedTextType[] getHighResolutionOutputSizeshNQ4ISI;
    private static final /* synthetic */ kotlin.enums.EnumEntries getHighSpeedVideoSizes;

    private SelectedTextType(java.lang.String str, int i) {
    }

    static {
        androidx.compose.foundation.text.selection.SelectedTextType selectedTextType = new androidx.compose.foundation.text.selection.SelectedTextType("EditableText", 0);
        EditableText = selectedTextType;
        androidx.compose.foundation.text.selection.SelectedTextType selectedTextType2 = new androidx.compose.foundation.text.selection.SelectedTextType("StaticText", 1);
        StaticText = selectedTextType2;
        androidx.compose.foundation.text.selection.SelectedTextType[] selectedTextTypeArr = {selectedTextType, selectedTextType2};
        getHighResolutionOutputSizeshNQ4ISI = selectedTextTypeArr;
        getHighSpeedVideoSizes = kotlin.enums.EnumEntriesKt.enumEntries(selectedTextTypeArr);
    }

    public static androidx.compose.foundation.text.selection.SelectedTextType[] values() {
        return (androidx.compose.foundation.text.selection.SelectedTextType[]) getHighResolutionOutputSizeshNQ4ISI.clone();
    }

    public static androidx.compose.foundation.text.selection.SelectedTextType valueOf(java.lang.String str) {
        return (androidx.compose.foundation.text.selection.SelectedTextType) java.lang.Enum.valueOf(androidx.compose.foundation.text.selection.SelectedTextType.class, str);
    }

    public static kotlin.enums.EnumEntries<androidx.compose.foundation.text.selection.SelectedTextType> getEntries() {
        return getHighSpeedVideoSizes;
    }
}
