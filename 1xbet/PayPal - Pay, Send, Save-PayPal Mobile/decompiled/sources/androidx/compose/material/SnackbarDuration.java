package androidx.compose.material;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006"}, d2 = {"Landroidx/compose/material/SnackbarDuration;", "", "<init>", "(Ljava/lang/String;I)V", "Short", "Long", "Indefinite"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class SnackbarDuration {
    private static final /* synthetic */ androidx.compose.material.SnackbarDuration[] Camera2StreamConfigurationMap;
    public static final androidx.compose.material.SnackbarDuration Indefinite;
    public static final androidx.compose.material.SnackbarDuration Long;
    public static final androidx.compose.material.SnackbarDuration Short;
    private static final /* synthetic */ kotlin.enums.EnumEntries getHighSpeedVideoSizes;

    private SnackbarDuration(java.lang.String str, int i) {
    }

    static {
        androidx.compose.material.SnackbarDuration snackbarDuration = new androidx.compose.material.SnackbarDuration("Short", 0);
        Short = snackbarDuration;
        androidx.compose.material.SnackbarDuration snackbarDuration2 = new androidx.compose.material.SnackbarDuration("Long", 1);
        Long = snackbarDuration2;
        androidx.compose.material.SnackbarDuration snackbarDuration3 = new androidx.compose.material.SnackbarDuration("Indefinite", 2);
        Indefinite = snackbarDuration3;
        androidx.compose.material.SnackbarDuration[] snackbarDurationArr = {snackbarDuration, snackbarDuration2, snackbarDuration3};
        Camera2StreamConfigurationMap = snackbarDurationArr;
        getHighSpeedVideoSizes = kotlin.enums.EnumEntriesKt.enumEntries(snackbarDurationArr);
    }

    public static androidx.compose.material.SnackbarDuration[] values() {
        return (androidx.compose.material.SnackbarDuration[]) Camera2StreamConfigurationMap.clone();
    }

    public static androidx.compose.material.SnackbarDuration valueOf(java.lang.String str) {
        return (androidx.compose.material.SnackbarDuration) java.lang.Enum.valueOf(androidx.compose.material.SnackbarDuration.class, str);
    }

    public static kotlin.enums.EnumEntries<androidx.compose.material.SnackbarDuration> getEntries() {
        return getHighSpeedVideoSizes;
    }
}
