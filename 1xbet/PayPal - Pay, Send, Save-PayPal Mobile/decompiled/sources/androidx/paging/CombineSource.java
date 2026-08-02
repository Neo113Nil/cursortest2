package androidx.paging;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0080\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006"}, d2 = {"Landroidx/paging/CombineSource;", "", "<init>", "(Ljava/lang/String;I)V", "INITIAL", "RECEIVER", "OTHER"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class CombineSource {
    private static final /* synthetic */ androidx.paging.CombineSource[] Camera2StreamConfigurationMap;
    public static final androidx.paging.CombineSource INITIAL;
    public static final androidx.paging.CombineSource OTHER;
    public static final androidx.paging.CombineSource RECEIVER;
    private static final /* synthetic */ kotlin.enums.EnumEntries getHighSpeedVideoFpsRanges;

    private CombineSource(java.lang.String str, int i) {
    }

    static {
        androidx.paging.CombineSource combineSource = new androidx.paging.CombineSource("INITIAL", 0);
        INITIAL = combineSource;
        androidx.paging.CombineSource combineSource2 = new androidx.paging.CombineSource("RECEIVER", 1);
        RECEIVER = combineSource2;
        androidx.paging.CombineSource combineSource3 = new androidx.paging.CombineSource("OTHER", 2);
        OTHER = combineSource3;
        androidx.paging.CombineSource[] combineSourceArr = {combineSource, combineSource2, combineSource3};
        Camera2StreamConfigurationMap = combineSourceArr;
        getHighSpeedVideoFpsRanges = kotlin.enums.EnumEntriesKt.enumEntries(combineSourceArr);
    }

    public static androidx.paging.CombineSource[] values() {
        return (androidx.paging.CombineSource[]) Camera2StreamConfigurationMap.clone();
    }

    public static androidx.paging.CombineSource valueOf(java.lang.String str) {
        return (androidx.paging.CombineSource) java.lang.Enum.valueOf(androidx.paging.CombineSource.class, str);
    }

    public static kotlin.enums.EnumEntries<androidx.paging.CombineSource> getEntries() {
        return getHighSpeedVideoFpsRanges;
    }
}
