package androidx.paging;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006"}, d2 = {"Landroidx/paging/LoadType;", "", "<init>", "(Ljava/lang/String;I)V", "REFRESH", "PREPEND", "APPEND"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class LoadType {
    public static final androidx.paging.LoadType APPEND;
    public static final androidx.paging.LoadType PREPEND;
    public static final androidx.paging.LoadType REFRESH;
    private static final /* synthetic */ androidx.paging.LoadType[] getHighResolutionOutputSizeshNQ4ISI;
    private static final /* synthetic */ kotlin.enums.EnumEntries getHighSpeedVideoFpsRangesFor;

    private LoadType(java.lang.String str, int i) {
    }

    static {
        androidx.paging.LoadType loadType = new androidx.paging.LoadType("REFRESH", 0);
        REFRESH = loadType;
        androidx.paging.LoadType loadType2 = new androidx.paging.LoadType("PREPEND", 1);
        PREPEND = loadType2;
        androidx.paging.LoadType loadType3 = new androidx.paging.LoadType("APPEND", 2);
        APPEND = loadType3;
        androidx.paging.LoadType[] loadTypeArr = {loadType, loadType2, loadType3};
        getHighResolutionOutputSizeshNQ4ISI = loadTypeArr;
        getHighSpeedVideoFpsRangesFor = kotlin.enums.EnumEntriesKt.enumEntries(loadTypeArr);
    }

    public static androidx.paging.LoadType[] values() {
        return (androidx.paging.LoadType[]) getHighResolutionOutputSizeshNQ4ISI.clone();
    }

    public static androidx.paging.LoadType valueOf(java.lang.String str) {
        return (androidx.paging.LoadType) java.lang.Enum.valueOf(androidx.paging.LoadType.class, str);
    }

    public static kotlin.enums.EnumEntries<androidx.paging.LoadType> getEntries() {
        return getHighSpeedVideoFpsRangesFor;
    }
}
