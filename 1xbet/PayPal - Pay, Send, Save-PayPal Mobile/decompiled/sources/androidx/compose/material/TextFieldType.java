package androidx.compose.material;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0080\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005"}, d2 = {"Landroidx/compose/material/TextFieldType;", "", "<init>", "(Ljava/lang/String;I)V", "Filled", "Outlined"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class TextFieldType {
    public static final androidx.compose.material.TextFieldType Filled;
    public static final androidx.compose.material.TextFieldType Outlined;
    private static final /* synthetic */ androidx.compose.material.TextFieldType[] getHighResolutionOutputSizeshNQ4ISI;
    private static final /* synthetic */ kotlin.enums.EnumEntries getHighSpeedVideoSizes;

    private TextFieldType(java.lang.String str, int i) {
    }

    static {
        androidx.compose.material.TextFieldType textFieldType = new androidx.compose.material.TextFieldType("Filled", 0);
        Filled = textFieldType;
        androidx.compose.material.TextFieldType textFieldType2 = new androidx.compose.material.TextFieldType("Outlined", 1);
        Outlined = textFieldType2;
        androidx.compose.material.TextFieldType[] textFieldTypeArr = {textFieldType, textFieldType2};
        getHighResolutionOutputSizeshNQ4ISI = textFieldTypeArr;
        getHighSpeedVideoSizes = kotlin.enums.EnumEntriesKt.enumEntries(textFieldTypeArr);
    }

    public static androidx.compose.material.TextFieldType[] values() {
        return (androidx.compose.material.TextFieldType[]) getHighResolutionOutputSizeshNQ4ISI.clone();
    }

    public static androidx.compose.material.TextFieldType valueOf(java.lang.String str) {
        return (androidx.compose.material.TextFieldType) java.lang.Enum.valueOf(androidx.compose.material.TextFieldType.class, str);
    }

    public static kotlin.enums.EnumEntries<androidx.compose.material.TextFieldType> getEntries() {
        return getHighSpeedVideoSizes;
    }
}
