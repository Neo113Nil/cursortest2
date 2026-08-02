package androidx.work;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\b\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\t"}, d2 = {"Landroidx/work/NetworkType;", "", "<init>", "(Ljava/lang/String;I)V", "NOT_REQUIRED", "CONNECTED", "UNMETERED", "NOT_ROAMING", "METERED", "TEMPORARILY_UNMETERED"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class NetworkType {
    public static final androidx.work.NetworkType CONNECTED;
    private static final /* synthetic */ kotlin.enums.EnumEntries Camera2StreamConfigurationMap;
    public static final androidx.work.NetworkType METERED;
    public static final androidx.work.NetworkType NOT_REQUIRED;
    public static final androidx.work.NetworkType NOT_ROAMING;
    public static final androidx.work.NetworkType TEMPORARILY_UNMETERED;
    public static final androidx.work.NetworkType UNMETERED;
    private static final /* synthetic */ androidx.work.NetworkType[] getHighSpeedVideoSizes;

    private NetworkType(java.lang.String str, int i) {
    }

    static {
        androidx.work.NetworkType networkType = new androidx.work.NetworkType("NOT_REQUIRED", 0);
        NOT_REQUIRED = networkType;
        androidx.work.NetworkType networkType2 = new androidx.work.NetworkType("CONNECTED", 1);
        CONNECTED = networkType2;
        androidx.work.NetworkType networkType3 = new androidx.work.NetworkType("UNMETERED", 2);
        UNMETERED = networkType3;
        androidx.work.NetworkType networkType4 = new androidx.work.NetworkType("NOT_ROAMING", 3);
        NOT_ROAMING = networkType4;
        androidx.work.NetworkType networkType5 = new androidx.work.NetworkType("METERED", 4);
        METERED = networkType5;
        androidx.work.NetworkType networkType6 = new androidx.work.NetworkType("TEMPORARILY_UNMETERED", 5);
        TEMPORARILY_UNMETERED = networkType6;
        androidx.work.NetworkType[] networkTypeArr = {networkType, networkType2, networkType3, networkType4, networkType5, networkType6};
        getHighSpeedVideoSizes = networkTypeArr;
        Camera2StreamConfigurationMap = kotlin.enums.EnumEntriesKt.enumEntries(networkTypeArr);
    }

    public static androidx.work.NetworkType[] values() {
        return (androidx.work.NetworkType[]) getHighSpeedVideoSizes.clone();
    }

    public static androidx.work.NetworkType valueOf(java.lang.String str) {
        return (androidx.work.NetworkType) java.lang.Enum.valueOf(androidx.work.NetworkType.class, str);
    }

    public static kotlin.enums.EnumEntries<androidx.work.NetworkType> getEntries() {
        return Camera2StreamConfigurationMap;
    }
}
