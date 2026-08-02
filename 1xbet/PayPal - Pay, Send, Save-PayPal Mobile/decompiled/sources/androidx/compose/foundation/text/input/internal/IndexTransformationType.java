package androidx.compose.foundation.text.input.internal;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0080\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007"}, d2 = {"Landroidx/compose/foundation/text/input/internal/IndexTransformationType;", "", "<init>", "(Ljava/lang/String;I)V", "Untransformed", "Insertion", "Replacement", "Deletion"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class IndexTransformationType {
    private static final /* synthetic */ androidx.compose.foundation.text.input.internal.IndexTransformationType[] Camera2StreamConfigurationMap;
    public static final androidx.compose.foundation.text.input.internal.IndexTransformationType Deletion;
    public static final androidx.compose.foundation.text.input.internal.IndexTransformationType Insertion;
    public static final androidx.compose.foundation.text.input.internal.IndexTransformationType Replacement;
    public static final androidx.compose.foundation.text.input.internal.IndexTransformationType Untransformed;
    private static final /* synthetic */ kotlin.enums.EnumEntries getHighSpeedVideoFpsRangesFor;

    private IndexTransformationType(java.lang.String str, int i) {
    }

    static {
        androidx.compose.foundation.text.input.internal.IndexTransformationType indexTransformationType = new androidx.compose.foundation.text.input.internal.IndexTransformationType("Untransformed", 0);
        Untransformed = indexTransformationType;
        androidx.compose.foundation.text.input.internal.IndexTransformationType indexTransformationType2 = new androidx.compose.foundation.text.input.internal.IndexTransformationType("Insertion", 1);
        Insertion = indexTransformationType2;
        androidx.compose.foundation.text.input.internal.IndexTransformationType indexTransformationType3 = new androidx.compose.foundation.text.input.internal.IndexTransformationType("Replacement", 2);
        Replacement = indexTransformationType3;
        androidx.compose.foundation.text.input.internal.IndexTransformationType indexTransformationType4 = new androidx.compose.foundation.text.input.internal.IndexTransformationType("Deletion", 3);
        Deletion = indexTransformationType4;
        androidx.compose.foundation.text.input.internal.IndexTransformationType[] indexTransformationTypeArr = {indexTransformationType, indexTransformationType2, indexTransformationType3, indexTransformationType4};
        Camera2StreamConfigurationMap = indexTransformationTypeArr;
        getHighSpeedVideoFpsRangesFor = kotlin.enums.EnumEntriesKt.enumEntries(indexTransformationTypeArr);
    }

    public static androidx.compose.foundation.text.input.internal.IndexTransformationType[] values() {
        return (androidx.compose.foundation.text.input.internal.IndexTransformationType[]) Camera2StreamConfigurationMap.clone();
    }

    public static androidx.compose.foundation.text.input.internal.IndexTransformationType valueOf(java.lang.String str) {
        return (androidx.compose.foundation.text.input.internal.IndexTransformationType) java.lang.Enum.valueOf(androidx.compose.foundation.text.input.internal.IndexTransformationType.class, str);
    }

    public static kotlin.enums.EnumEntries<androidx.compose.foundation.text.input.internal.IndexTransformationType> getEntries() {
        return getHighSpeedVideoFpsRangesFor;
    }
}
