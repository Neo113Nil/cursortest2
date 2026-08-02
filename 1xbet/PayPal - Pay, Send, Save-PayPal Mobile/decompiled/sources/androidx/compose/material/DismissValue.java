package androidx.compose.material;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006"}, d2 = {"Landroidx/compose/material/DismissValue;", "", "<init>", "(Ljava/lang/String;I)V", "Default", "DismissedToEnd", "DismissedToStart"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class DismissValue {
    public static final androidx.compose.material.DismissValue Default;
    public static final androidx.compose.material.DismissValue DismissedToEnd;
    public static final androidx.compose.material.DismissValue DismissedToStart;
    private static final /* synthetic */ androidx.compose.material.DismissValue[] getHighResolutionOutputSizeshNQ4ISI;
    private static final /* synthetic */ kotlin.enums.EnumEntries getHighSpeedVideoFpsRanges;

    private DismissValue(java.lang.String str, int i) {
    }

    static {
        androidx.compose.material.DismissValue dismissValue = new androidx.compose.material.DismissValue("Default", 0);
        Default = dismissValue;
        androidx.compose.material.DismissValue dismissValue2 = new androidx.compose.material.DismissValue("DismissedToEnd", 1);
        DismissedToEnd = dismissValue2;
        androidx.compose.material.DismissValue dismissValue3 = new androidx.compose.material.DismissValue("DismissedToStart", 2);
        DismissedToStart = dismissValue3;
        androidx.compose.material.DismissValue[] dismissValueArr = {dismissValue, dismissValue2, dismissValue3};
        getHighResolutionOutputSizeshNQ4ISI = dismissValueArr;
        getHighSpeedVideoFpsRanges = kotlin.enums.EnumEntriesKt.enumEntries(dismissValueArr);
    }

    public static androidx.compose.material.DismissValue[] values() {
        return (androidx.compose.material.DismissValue[]) getHighResolutionOutputSizeshNQ4ISI.clone();
    }

    public static androidx.compose.material.DismissValue valueOf(java.lang.String str) {
        return (androidx.compose.material.DismissValue) java.lang.Enum.valueOf(androidx.compose.material.DismissValue.class, str);
    }

    public static kotlin.enums.EnumEntries<androidx.compose.material.DismissValue> getEntries() {
        return getHighSpeedVideoFpsRanges;
    }
}
