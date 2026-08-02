package androidx.compose.foundation.text.input.internal.undo;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0080\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006"}, d2 = {"Landroidx/compose/foundation/text/input/internal/undo/TextFieldEditUndoBehavior;", "", "<init>", "(Ljava/lang/String;I)V", "MergeIfPossible", "ClearHistory", "NeverMerge"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class TextFieldEditUndoBehavior {
    public static final androidx.compose.foundation.text.input.internal.undo.TextFieldEditUndoBehavior ClearHistory;
    public static final androidx.compose.foundation.text.input.internal.undo.TextFieldEditUndoBehavior MergeIfPossible;
    public static final androidx.compose.foundation.text.input.internal.undo.TextFieldEditUndoBehavior NeverMerge;
    private static final /* synthetic */ androidx.compose.foundation.text.input.internal.undo.TextFieldEditUndoBehavior[] getHighResolutionOutputSizeshNQ4ISI;
    private static final /* synthetic */ kotlin.enums.EnumEntries getHighSpeedVideoSizes;

    private TextFieldEditUndoBehavior(java.lang.String str, int i) {
    }

    static {
        androidx.compose.foundation.text.input.internal.undo.TextFieldEditUndoBehavior textFieldEditUndoBehavior = new androidx.compose.foundation.text.input.internal.undo.TextFieldEditUndoBehavior("MergeIfPossible", 0);
        MergeIfPossible = textFieldEditUndoBehavior;
        androidx.compose.foundation.text.input.internal.undo.TextFieldEditUndoBehavior textFieldEditUndoBehavior2 = new androidx.compose.foundation.text.input.internal.undo.TextFieldEditUndoBehavior("ClearHistory", 1);
        ClearHistory = textFieldEditUndoBehavior2;
        androidx.compose.foundation.text.input.internal.undo.TextFieldEditUndoBehavior textFieldEditUndoBehavior3 = new androidx.compose.foundation.text.input.internal.undo.TextFieldEditUndoBehavior("NeverMerge", 2);
        NeverMerge = textFieldEditUndoBehavior3;
        androidx.compose.foundation.text.input.internal.undo.TextFieldEditUndoBehavior[] textFieldEditUndoBehaviorArr = {textFieldEditUndoBehavior, textFieldEditUndoBehavior2, textFieldEditUndoBehavior3};
        getHighResolutionOutputSizeshNQ4ISI = textFieldEditUndoBehaviorArr;
        getHighSpeedVideoSizes = kotlin.enums.EnumEntriesKt.enumEntries(textFieldEditUndoBehaviorArr);
    }

    public static androidx.compose.foundation.text.input.internal.undo.TextFieldEditUndoBehavior[] values() {
        return (androidx.compose.foundation.text.input.internal.undo.TextFieldEditUndoBehavior[]) getHighResolutionOutputSizeshNQ4ISI.clone();
    }

    public static androidx.compose.foundation.text.input.internal.undo.TextFieldEditUndoBehavior valueOf(java.lang.String str) {
        return (androidx.compose.foundation.text.input.internal.undo.TextFieldEditUndoBehavior) java.lang.Enum.valueOf(androidx.compose.foundation.text.input.internal.undo.TextFieldEditUndoBehavior.class, str);
    }

    public static kotlin.enums.EnumEntries<androidx.compose.foundation.text.input.internal.undo.TextFieldEditUndoBehavior> getEntries() {
        return getHighSpeedVideoSizes;
    }
}
