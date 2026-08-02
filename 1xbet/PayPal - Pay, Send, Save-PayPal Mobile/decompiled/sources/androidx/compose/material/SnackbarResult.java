package androidx.compose.material;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005"}, d2 = {"Landroidx/compose/material/SnackbarResult;", "", "<init>", "(Ljava/lang/String;I)V", "Dismissed", "ActionPerformed"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class SnackbarResult {
    public static final androidx.compose.material.SnackbarResult ActionPerformed;
    public static final androidx.compose.material.SnackbarResult Dismissed;
    private static final /* synthetic */ androidx.compose.material.SnackbarResult[] getHighSpeedVideoFpsRanges;
    private static final /* synthetic */ kotlin.enums.EnumEntries getHighSpeedVideoSizes;

    private SnackbarResult(java.lang.String str, int i) {
    }

    static {
        androidx.compose.material.SnackbarResult snackbarResult = new androidx.compose.material.SnackbarResult("Dismissed", 0);
        Dismissed = snackbarResult;
        androidx.compose.material.SnackbarResult snackbarResult2 = new androidx.compose.material.SnackbarResult("ActionPerformed", 1);
        ActionPerformed = snackbarResult2;
        androidx.compose.material.SnackbarResult[] snackbarResultArr = {snackbarResult, snackbarResult2};
        getHighSpeedVideoFpsRanges = snackbarResultArr;
        getHighSpeedVideoSizes = kotlin.enums.EnumEntriesKt.enumEntries(snackbarResultArr);
    }

    public static androidx.compose.material.SnackbarResult[] values() {
        return (androidx.compose.material.SnackbarResult[]) getHighSpeedVideoFpsRanges.clone();
    }

    public static androidx.compose.material.SnackbarResult valueOf(java.lang.String str) {
        return (androidx.compose.material.SnackbarResult) java.lang.Enum.valueOf(androidx.compose.material.SnackbarResult.class, str);
    }

    public static kotlin.enums.EnumEntries<androidx.compose.material.SnackbarResult> getEntries() {
        return getHighSpeedVideoSizes;
    }
}
