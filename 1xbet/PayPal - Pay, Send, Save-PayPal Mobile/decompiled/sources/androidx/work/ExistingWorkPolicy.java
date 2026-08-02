package androidx.work;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007"}, d2 = {"Landroidx/work/ExistingWorkPolicy;", "", "<init>", "(Ljava/lang/String;I)V", "REPLACE", "KEEP", "APPEND", "APPEND_OR_REPLACE"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
public final class ExistingWorkPolicy {
    public static final androidx.work.ExistingWorkPolicy APPEND;
    public static final androidx.work.ExistingWorkPolicy APPEND_OR_REPLACE;
    private static final /* synthetic */ androidx.work.ExistingWorkPolicy[] Camera2StreamConfigurationMap;
    public static final androidx.work.ExistingWorkPolicy KEEP;
    public static final androidx.work.ExistingWorkPolicy REPLACE;
    private static final /* synthetic */ kotlin.enums.EnumEntries getHighSpeedVideoSizes;

    private ExistingWorkPolicy(java.lang.String str, int i) {
    }

    static {
        androidx.work.ExistingWorkPolicy existingWorkPolicy = new androidx.work.ExistingWorkPolicy("REPLACE", 0);
        REPLACE = existingWorkPolicy;
        androidx.work.ExistingWorkPolicy existingWorkPolicy2 = new androidx.work.ExistingWorkPolicy("KEEP", 1);
        KEEP = existingWorkPolicy2;
        androidx.work.ExistingWorkPolicy existingWorkPolicy3 = new androidx.work.ExistingWorkPolicy("APPEND", 2);
        APPEND = existingWorkPolicy3;
        androidx.work.ExistingWorkPolicy existingWorkPolicy4 = new androidx.work.ExistingWorkPolicy("APPEND_OR_REPLACE", 3);
        APPEND_OR_REPLACE = existingWorkPolicy4;
        androidx.work.ExistingWorkPolicy[] existingWorkPolicyArr = {existingWorkPolicy, existingWorkPolicy2, existingWorkPolicy3, existingWorkPolicy4};
        Camera2StreamConfigurationMap = existingWorkPolicyArr;
        getHighSpeedVideoSizes = kotlin.enums.EnumEntriesKt.enumEntries(existingWorkPolicyArr);
    }

    public static androidx.work.ExistingWorkPolicy[] values() {
        return (androidx.work.ExistingWorkPolicy[]) Camera2StreamConfigurationMap.clone();
    }

    public static androidx.work.ExistingWorkPolicy valueOf(java.lang.String str) {
        return (androidx.work.ExistingWorkPolicy) java.lang.Enum.valueOf(androidx.work.ExistingWorkPolicy.class, str);
    }

    public static kotlin.enums.EnumEntries<androidx.work.ExistingWorkPolicy> getEntries() {
        return getHighSpeedVideoSizes;
    }
}
