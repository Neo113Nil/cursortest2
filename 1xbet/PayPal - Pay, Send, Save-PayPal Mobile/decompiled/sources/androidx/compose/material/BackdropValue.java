package androidx.compose.material;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005"}, d2 = {"Landroidx/compose/material/BackdropValue;", "", "<init>", "(Ljava/lang/String;I)V", "Concealed", "Revealed"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class BackdropValue {
    public static final androidx.compose.material.BackdropValue Concealed;
    public static final androidx.compose.material.BackdropValue Revealed;
    private static final /* synthetic */ androidx.compose.material.BackdropValue[] getHighResolutionOutputSizeshNQ4ISI;
    private static final /* synthetic */ kotlin.enums.EnumEntries getHighSpeedVideoFpsRangesFor;

    private BackdropValue(java.lang.String str, int i) {
    }

    static {
        androidx.compose.material.BackdropValue backdropValue = new androidx.compose.material.BackdropValue("Concealed", 0);
        Concealed = backdropValue;
        androidx.compose.material.BackdropValue backdropValue2 = new androidx.compose.material.BackdropValue("Revealed", 1);
        Revealed = backdropValue2;
        androidx.compose.material.BackdropValue[] backdropValueArr = {backdropValue, backdropValue2};
        getHighResolutionOutputSizeshNQ4ISI = backdropValueArr;
        getHighSpeedVideoFpsRangesFor = kotlin.enums.EnumEntriesKt.enumEntries(backdropValueArr);
    }

    public static androidx.compose.material.BackdropValue[] values() {
        return (androidx.compose.material.BackdropValue[]) getHighResolutionOutputSizeshNQ4ISI.clone();
    }

    public static androidx.compose.material.BackdropValue valueOf(java.lang.String str) {
        return (androidx.compose.material.BackdropValue) java.lang.Enum.valueOf(androidx.compose.material.BackdropValue.class, str);
    }

    public static kotlin.enums.EnumEntries<androidx.compose.material.BackdropValue> getEntries() {
        return getHighSpeedVideoFpsRangesFor;
    }
}
