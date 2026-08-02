package coil3.view;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000b\n\u0002\b\u000e\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0019\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u001a\u0010\u0007\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\nR\u001a\u0010\u000b\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\b\u001a\u0004\b\f\u0010\nj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010"}, d2 = {"Lcoil3/request/CachePolicy;", "", "", "p0", "p1", "<init>", "(Ljava/lang/String;IZZ)V", "readEnabled", "Z", "getReadEnabled", "()Z", "writeEnabled", "getWriteEnabled", "ENABLED", "READ_ONLY", "WRITE_ONLY", "DISABLED"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
public final class CachePolicy {
    private static final /* synthetic */ coil3.view.CachePolicy[] getHighResolutionOutputSizeshNQ4ISI;
    private static final /* synthetic */ kotlin.enums.EnumEntries getHighSpeedVideoFpsRangesFor;
    private final boolean readEnabled;
    private final boolean writeEnabled;
    public static final coil3.view.CachePolicy ENABLED = new coil3.view.CachePolicy("ENABLED", 0, true, true);
    public static final coil3.view.CachePolicy READ_ONLY = new coil3.view.CachePolicy("READ_ONLY", 1, true, false);
    public static final coil3.view.CachePolicy WRITE_ONLY = new coil3.view.CachePolicy("WRITE_ONLY", 2, false, true);
    public static final coil3.view.CachePolicy DISABLED = new coil3.view.CachePolicy("DISABLED", 3, false, false);

    private CachePolicy(java.lang.String str, int i, boolean z, boolean z2) {
        this.readEnabled = z;
        this.writeEnabled = z2;
    }

    public final boolean getReadEnabled() {
        return this.readEnabled;
    }

    public final boolean getWriteEnabled() {
        return this.writeEnabled;
    }

    static {
        coil3.view.CachePolicy[] Camera2StreamConfigurationMap = Camera2StreamConfigurationMap();
        getHighResolutionOutputSizeshNQ4ISI = Camera2StreamConfigurationMap;
        getHighSpeedVideoFpsRangesFor = kotlin.enums.EnumEntriesKt.enumEntries(Camera2StreamConfigurationMap);
    }

    public static coil3.view.CachePolicy[] values() {
        return (coil3.view.CachePolicy[]) getHighResolutionOutputSizeshNQ4ISI.clone();
    }

    public static coil3.view.CachePolicy valueOf(java.lang.String str) {
        return (coil3.view.CachePolicy) java.lang.Enum.valueOf(coil3.view.CachePolicy.class, str);
    }

    public static kotlin.enums.EnumEntries<coil3.view.CachePolicy> getEntries() {
        return getHighSpeedVideoFpsRangesFor;
    }

    private static final /* synthetic */ coil3.view.CachePolicy[] Camera2StreamConfigurationMap() {
        return new coil3.view.CachePolicy[]{ENABLED, READ_ONLY, WRITE_ONLY, DISABLED};
    }
}
