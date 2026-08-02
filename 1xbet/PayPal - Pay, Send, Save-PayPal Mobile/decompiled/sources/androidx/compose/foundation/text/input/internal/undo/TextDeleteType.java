package androidx.compose.foundation.text.input.internal.undo;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0080\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007"}, d2 = {"Landroidx/compose/foundation/text/input/internal/undo/TextDeleteType;", "", "<init>", "(Ljava/lang/String;I)V", "Start", "End", "Inner", "NotByUser"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class TextDeleteType {
    private static final /* synthetic */ kotlin.enums.EnumEntries Camera2StreamConfigurationMap;
    public static final androidx.compose.foundation.text.input.internal.undo.TextDeleteType End;
    public static final androidx.compose.foundation.text.input.internal.undo.TextDeleteType Inner;
    public static final androidx.compose.foundation.text.input.internal.undo.TextDeleteType NotByUser;
    public static final androidx.compose.foundation.text.input.internal.undo.TextDeleteType Start;
    private static final /* synthetic */ androidx.compose.foundation.text.input.internal.undo.TextDeleteType[] getHighSpeedVideoSizes;

    private TextDeleteType(java.lang.String str, int i) {
    }

    static {
        androidx.compose.foundation.text.input.internal.undo.TextDeleteType textDeleteType = new androidx.compose.foundation.text.input.internal.undo.TextDeleteType("Start", 0);
        Start = textDeleteType;
        androidx.compose.foundation.text.input.internal.undo.TextDeleteType textDeleteType2 = new androidx.compose.foundation.text.input.internal.undo.TextDeleteType("End", 1);
        End = textDeleteType2;
        androidx.compose.foundation.text.input.internal.undo.TextDeleteType textDeleteType3 = new androidx.compose.foundation.text.input.internal.undo.TextDeleteType("Inner", 2);
        Inner = textDeleteType3;
        androidx.compose.foundation.text.input.internal.undo.TextDeleteType textDeleteType4 = new androidx.compose.foundation.text.input.internal.undo.TextDeleteType("NotByUser", 3);
        NotByUser = textDeleteType4;
        androidx.compose.foundation.text.input.internal.undo.TextDeleteType[] textDeleteTypeArr = {textDeleteType, textDeleteType2, textDeleteType3, textDeleteType4};
        getHighSpeedVideoSizes = textDeleteTypeArr;
        Camera2StreamConfigurationMap = kotlin.enums.EnumEntriesKt.enumEntries(textDeleteTypeArr);
    }

    public static androidx.compose.foundation.text.input.internal.undo.TextDeleteType[] values() {
        return (androidx.compose.foundation.text.input.internal.undo.TextDeleteType[]) getHighSpeedVideoSizes.clone();
    }

    public static androidx.compose.foundation.text.input.internal.undo.TextDeleteType valueOf(java.lang.String str) {
        return (androidx.compose.foundation.text.input.internal.undo.TextDeleteType) java.lang.Enum.valueOf(androidx.compose.foundation.text.input.internal.undo.TextDeleteType.class, str);
    }

    public static kotlin.enums.EnumEntries<androidx.compose.foundation.text.input.internal.undo.TextDeleteType> getEntries() {
        return Camera2StreamConfigurationMap;
    }
}
