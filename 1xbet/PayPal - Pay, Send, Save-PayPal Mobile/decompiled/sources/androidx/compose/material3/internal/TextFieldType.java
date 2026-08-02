package androidx.compose.material3.internal;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0080\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005"}, d2 = {"Landroidx/compose/material3/internal/TextFieldType;", "", "<init>", "(Ljava/lang/String;I)V", "Filled", "Outlined"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class TextFieldType {
    public static final androidx.compose.material3.internal.TextFieldType Filled;
    public static final androidx.compose.material3.internal.TextFieldType Outlined;
    private static final /* synthetic */ kotlin.enums.EnumEntries getHighSpeedVideoFpsRanges;
    private static final /* synthetic */ androidx.compose.material3.internal.TextFieldType[] getHighSpeedVideoSizes;

    private TextFieldType(java.lang.String str, int i) {
    }

    static {
        androidx.compose.material3.internal.TextFieldType textFieldType = new androidx.compose.material3.internal.TextFieldType("Filled", 0);
        Filled = textFieldType;
        androidx.compose.material3.internal.TextFieldType textFieldType2 = new androidx.compose.material3.internal.TextFieldType("Outlined", 1);
        Outlined = textFieldType2;
        androidx.compose.material3.internal.TextFieldType[] textFieldTypeArr = {textFieldType, textFieldType2};
        getHighSpeedVideoSizes = textFieldTypeArr;
        getHighSpeedVideoFpsRanges = kotlin.enums.EnumEntriesKt.enumEntries(textFieldTypeArr);
    }

    public static androidx.compose.material3.internal.TextFieldType valueOf(java.lang.String str) {
        return (androidx.compose.material3.internal.TextFieldType) java.lang.Enum.valueOf(androidx.compose.material3.internal.TextFieldType.class, str);
    }

    public static androidx.compose.material3.internal.TextFieldType[] values() {
        return (androidx.compose.material3.internal.TextFieldType[]) getHighSpeedVideoSizes.clone();
    }

    public static kotlin.enums.EnumEntries<androidx.compose.material3.internal.TextFieldType> getEntries() {
        return getHighSpeedVideoFpsRanges;
    }
}
