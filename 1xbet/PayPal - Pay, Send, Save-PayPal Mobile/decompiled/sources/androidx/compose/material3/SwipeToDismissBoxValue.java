package androidx.compose.material3;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006"}, d2 = {"Landroidx/compose/material3/SwipeToDismissBoxValue;", "", "<init>", "(Ljava/lang/String;I)V", "StartToEnd", "EndToStart", "Settled"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class SwipeToDismissBoxValue {
    private static final /* synthetic */ kotlin.enums.EnumEntries Camera2StreamConfigurationMap;
    public static final androidx.compose.material3.SwipeToDismissBoxValue EndToStart;
    public static final androidx.compose.material3.SwipeToDismissBoxValue Settled;
    public static final androidx.compose.material3.SwipeToDismissBoxValue StartToEnd;
    private static final /* synthetic */ androidx.compose.material3.SwipeToDismissBoxValue[] getHighSpeedVideoSizes;

    private SwipeToDismissBoxValue(java.lang.String str, int i) {
    }

    static {
        androidx.compose.material3.SwipeToDismissBoxValue swipeToDismissBoxValue = new androidx.compose.material3.SwipeToDismissBoxValue("StartToEnd", 0);
        StartToEnd = swipeToDismissBoxValue;
        androidx.compose.material3.SwipeToDismissBoxValue swipeToDismissBoxValue2 = new androidx.compose.material3.SwipeToDismissBoxValue("EndToStart", 1);
        EndToStart = swipeToDismissBoxValue2;
        androidx.compose.material3.SwipeToDismissBoxValue swipeToDismissBoxValue3 = new androidx.compose.material3.SwipeToDismissBoxValue("Settled", 2);
        Settled = swipeToDismissBoxValue3;
        androidx.compose.material3.SwipeToDismissBoxValue[] swipeToDismissBoxValueArr = {swipeToDismissBoxValue, swipeToDismissBoxValue2, swipeToDismissBoxValue3};
        getHighSpeedVideoSizes = swipeToDismissBoxValueArr;
        Camera2StreamConfigurationMap = kotlin.enums.EnumEntriesKt.enumEntries(swipeToDismissBoxValueArr);
    }

    public static androidx.compose.material3.SwipeToDismissBoxValue valueOf(java.lang.String str) {
        return (androidx.compose.material3.SwipeToDismissBoxValue) java.lang.Enum.valueOf(androidx.compose.material3.SwipeToDismissBoxValue.class, str);
    }

    public static androidx.compose.material3.SwipeToDismissBoxValue[] values() {
        return (androidx.compose.material3.SwipeToDismissBoxValue[]) getHighSpeedVideoSizes.clone();
    }

    public static kotlin.enums.EnumEntries<androidx.compose.material3.SwipeToDismissBoxValue> getEntries() {
        return Camera2StreamConfigurationMap;
    }
}
