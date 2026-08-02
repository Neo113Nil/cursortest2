package androidx.compose.material;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005"}, d2 = {"Landroidx/compose/material/DismissDirection;", "", "<init>", "(Ljava/lang/String;I)V", "StartToEnd", "EndToStart"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class DismissDirection {
    public static final androidx.compose.material.DismissDirection EndToStart;
    public static final androidx.compose.material.DismissDirection StartToEnd;
    private static final /* synthetic */ androidx.compose.material.DismissDirection[] getHighResolutionOutputSizeshNQ4ISI;
    private static final /* synthetic */ kotlin.enums.EnumEntries getHighSpeedVideoFpsRangesFor;

    private DismissDirection(java.lang.String str, int i) {
    }

    static {
        androidx.compose.material.DismissDirection dismissDirection = new androidx.compose.material.DismissDirection("StartToEnd", 0);
        StartToEnd = dismissDirection;
        androidx.compose.material.DismissDirection dismissDirection2 = new androidx.compose.material.DismissDirection("EndToStart", 1);
        EndToStart = dismissDirection2;
        androidx.compose.material.DismissDirection[] dismissDirectionArr = {dismissDirection, dismissDirection2};
        getHighResolutionOutputSizeshNQ4ISI = dismissDirectionArr;
        getHighSpeedVideoFpsRangesFor = kotlin.enums.EnumEntriesKt.enumEntries(dismissDirectionArr);
    }

    public static androidx.compose.material.DismissDirection[] values() {
        return (androidx.compose.material.DismissDirection[]) getHighResolutionOutputSizeshNQ4ISI.clone();
    }

    public static androidx.compose.material.DismissDirection valueOf(java.lang.String str) {
        return (androidx.compose.material.DismissDirection) java.lang.Enum.valueOf(androidx.compose.material.DismissDirection.class, str);
    }

    public static kotlin.enums.EnumEntries<androidx.compose.material.DismissDirection> getEntries() {
        return getHighSpeedVideoFpsRangesFor;
    }
}
