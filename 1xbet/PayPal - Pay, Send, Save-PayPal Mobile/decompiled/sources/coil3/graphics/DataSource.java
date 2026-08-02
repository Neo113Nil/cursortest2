package coil3.graphics;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007"}, d2 = {"Lcoil3/decode/DataSource;", "", "<init>", "(Ljava/lang/String;I)V", "MEMORY_CACHE", "MEMORY", "DISK", com.paypal.oslo.feature.identity.identitymanagement.domain.usecase.DisableAuthenticationMethodUseCase.NETWORK_ERROR_CODE}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
public final class DataSource {
    private static final /* synthetic */ coil3.graphics.DataSource[] getHighSpeedVideoFpsRanges;
    private static final /* synthetic */ kotlin.enums.EnumEntries getHighSpeedVideoSizes;
    public static final coil3.graphics.DataSource MEMORY_CACHE = new coil3.graphics.DataSource("MEMORY_CACHE", 0);
    public static final coil3.graphics.DataSource MEMORY = new coil3.graphics.DataSource("MEMORY", 1);
    public static final coil3.graphics.DataSource DISK = new coil3.graphics.DataSource("DISK", 2);
    public static final coil3.graphics.DataSource NETWORK = new coil3.graphics.DataSource(com.paypal.oslo.feature.identity.identitymanagement.domain.usecase.DisableAuthenticationMethodUseCase.NETWORK_ERROR_CODE, 3);

    private DataSource(java.lang.String str, int i) {
    }

    static {
        coil3.graphics.DataSource[] highSpeedVideoFpsRangesFor = getHighSpeedVideoFpsRangesFor();
        getHighSpeedVideoFpsRanges = highSpeedVideoFpsRangesFor;
        getHighSpeedVideoSizes = kotlin.enums.EnumEntriesKt.enumEntries(highSpeedVideoFpsRangesFor);
    }

    public static coil3.graphics.DataSource[] values() {
        return (coil3.graphics.DataSource[]) getHighSpeedVideoFpsRanges.clone();
    }

    public static coil3.graphics.DataSource valueOf(java.lang.String str) {
        return (coil3.graphics.DataSource) java.lang.Enum.valueOf(coil3.graphics.DataSource.class, str);
    }

    public static kotlin.enums.EnumEntries<coil3.graphics.DataSource> getEntries() {
        return getHighSpeedVideoSizes;
    }

    private static final /* synthetic */ coil3.graphics.DataSource[] getHighSpeedVideoFpsRangesFor() {
        return new coil3.graphics.DataSource[]{MEMORY_CACHE, MEMORY, DISK, NETWORK};
    }
}
