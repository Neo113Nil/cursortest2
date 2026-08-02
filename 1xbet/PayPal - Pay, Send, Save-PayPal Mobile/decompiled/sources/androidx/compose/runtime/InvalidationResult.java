package androidx.compose.runtime;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0080\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007"}, d2 = {"Landroidx/compose/runtime/InvalidationResult;", "", "<init>", "(Ljava/lang/String;I)V", "IGNORED", "SCHEDULED", "DEFERRED", "IMMINENT"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class InvalidationResult {
    private static final /* synthetic */ kotlin.enums.EnumEntries Camera2StreamConfigurationMap;
    private static final /* synthetic */ androidx.compose.runtime.InvalidationResult[] getHighSpeedVideoFpsRangesFor;
    public static final androidx.compose.runtime.InvalidationResult IGNORED = new androidx.compose.runtime.InvalidationResult("IGNORED", 0);
    public static final androidx.compose.runtime.InvalidationResult SCHEDULED = new androidx.compose.runtime.InvalidationResult("SCHEDULED", 1);
    public static final androidx.compose.runtime.InvalidationResult DEFERRED = new androidx.compose.runtime.InvalidationResult("DEFERRED", 2);
    public static final androidx.compose.runtime.InvalidationResult IMMINENT = new androidx.compose.runtime.InvalidationResult("IMMINENT", 3);

    private InvalidationResult(java.lang.String str, int i) {
    }

    static {
        androidx.compose.runtime.InvalidationResult[] Camera2StreamConfigurationMap2 = Camera2StreamConfigurationMap();
        getHighSpeedVideoFpsRangesFor = Camera2StreamConfigurationMap2;
        Camera2StreamConfigurationMap = kotlin.enums.EnumEntriesKt.enumEntries(Camera2StreamConfigurationMap2);
    }

    public static androidx.compose.runtime.InvalidationResult[] values() {
        return (androidx.compose.runtime.InvalidationResult[]) getHighSpeedVideoFpsRangesFor.clone();
    }

    public static androidx.compose.runtime.InvalidationResult valueOf(java.lang.String str) {
        return (androidx.compose.runtime.InvalidationResult) java.lang.Enum.valueOf(androidx.compose.runtime.InvalidationResult.class, str);
    }

    public static kotlin.enums.EnumEntries<androidx.compose.runtime.InvalidationResult> getEntries() {
        return Camera2StreamConfigurationMap;
    }

    private static final /* synthetic */ androidx.compose.runtime.InvalidationResult[] Camera2StreamConfigurationMap() {
        return new androidx.compose.runtime.InvalidationResult[]{IGNORED, SCHEDULED, DEFERRED, IMMINENT};
    }
}
