package androidx.compose.foundation.text.input.internal.undo;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0080\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006"}, d2 = {"Landroidx/compose/foundation/text/input/internal/undo/TextEditType;", "", "<init>", "(Ljava/lang/String;I)V", "Insert", "Delete", "Replace"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class TextEditType {
    private static final /* synthetic */ kotlin.enums.EnumEntries Camera2StreamConfigurationMap;
    public static final androidx.compose.foundation.text.input.internal.undo.TextEditType Delete;
    public static final androidx.compose.foundation.text.input.internal.undo.TextEditType Insert;
    public static final androidx.compose.foundation.text.input.internal.undo.TextEditType Replace;
    private static final /* synthetic */ androidx.compose.foundation.text.input.internal.undo.TextEditType[] getHighSpeedVideoSizes;

    private TextEditType(java.lang.String str, int i) {
    }

    static {
        androidx.compose.foundation.text.input.internal.undo.TextEditType textEditType = new androidx.compose.foundation.text.input.internal.undo.TextEditType("Insert", 0);
        Insert = textEditType;
        androidx.compose.foundation.text.input.internal.undo.TextEditType textEditType2 = new androidx.compose.foundation.text.input.internal.undo.TextEditType("Delete", 1);
        Delete = textEditType2;
        androidx.compose.foundation.text.input.internal.undo.TextEditType textEditType3 = new androidx.compose.foundation.text.input.internal.undo.TextEditType("Replace", 2);
        Replace = textEditType3;
        androidx.compose.foundation.text.input.internal.undo.TextEditType[] textEditTypeArr = {textEditType, textEditType2, textEditType3};
        getHighSpeedVideoSizes = textEditTypeArr;
        Camera2StreamConfigurationMap = kotlin.enums.EnumEntriesKt.enumEntries(textEditTypeArr);
    }

    public static androidx.compose.foundation.text.input.internal.undo.TextEditType[] values() {
        return (androidx.compose.foundation.text.input.internal.undo.TextEditType[]) getHighSpeedVideoSizes.clone();
    }

    public static androidx.compose.foundation.text.input.internal.undo.TextEditType valueOf(java.lang.String str) {
        return (androidx.compose.foundation.text.input.internal.undo.TextEditType) java.lang.Enum.valueOf(androidx.compose.foundation.text.input.internal.undo.TextEditType.class, str);
    }

    public static kotlin.enums.EnumEntries<androidx.compose.foundation.text.input.internal.undo.TextEditType> getEntries() {
        return Camera2StreamConfigurationMap;
    }
}
