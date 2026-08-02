package androidx.work;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007"}, d2 = {"Landroidx/work/ExistingPeriodicWorkPolicy;", "", "<init>", "(Ljava/lang/String;I)V", "REPLACE", "KEEP", "UPDATE", "CANCEL_AND_REENQUEUE"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
public final class ExistingPeriodicWorkPolicy {
    public static final androidx.work.ExistingPeriodicWorkPolicy CANCEL_AND_REENQUEUE;
    private static final /* synthetic */ androidx.work.ExistingPeriodicWorkPolicy[] Camera2StreamConfigurationMap;
    public static final androidx.work.ExistingPeriodicWorkPolicy KEEP;

    @kotlin.Deprecated(message = "Deprecated in favor of the UPDATE policy. UPDATE policy has very similar behavior: next run of the worker with the same unique name, going to have new specification. However, UPDATE has better defaults: unlike REPLACE policy UPDATE won't cancel the worker if it is currently running and new worker specification will be used only on the next run. Also it preserves original enqueue time, so unlike REPLACE period isn't reset. If you want to preserve previous behavior, CANCEL_AND_REENQUEUE should be used.", replaceWith = @kotlin.ReplaceWith(expression = "UPDATE", imports = {}))
    public static final androidx.work.ExistingPeriodicWorkPolicy REPLACE;
    public static final androidx.work.ExistingPeriodicWorkPolicy UPDATE;
    private static final /* synthetic */ kotlin.enums.EnumEntries getHighResolutionOutputSizeshNQ4ISI;

    private ExistingPeriodicWorkPolicy(java.lang.String str, int i) {
    }

    static {
        androidx.work.ExistingPeriodicWorkPolicy existingPeriodicWorkPolicy = new androidx.work.ExistingPeriodicWorkPolicy("REPLACE", 0);
        REPLACE = existingPeriodicWorkPolicy;
        androidx.work.ExistingPeriodicWorkPolicy existingPeriodicWorkPolicy2 = new androidx.work.ExistingPeriodicWorkPolicy("KEEP", 1);
        KEEP = existingPeriodicWorkPolicy2;
        androidx.work.ExistingPeriodicWorkPolicy existingPeriodicWorkPolicy3 = new androidx.work.ExistingPeriodicWorkPolicy("UPDATE", 2);
        UPDATE = existingPeriodicWorkPolicy3;
        androidx.work.ExistingPeriodicWorkPolicy existingPeriodicWorkPolicy4 = new androidx.work.ExistingPeriodicWorkPolicy("CANCEL_AND_REENQUEUE", 3);
        CANCEL_AND_REENQUEUE = existingPeriodicWorkPolicy4;
        androidx.work.ExistingPeriodicWorkPolicy[] existingPeriodicWorkPolicyArr = {existingPeriodicWorkPolicy, existingPeriodicWorkPolicy2, existingPeriodicWorkPolicy3, existingPeriodicWorkPolicy4};
        Camera2StreamConfigurationMap = existingPeriodicWorkPolicyArr;
        getHighResolutionOutputSizeshNQ4ISI = kotlin.enums.EnumEntriesKt.enumEntries(existingPeriodicWorkPolicyArr);
    }

    public static androidx.work.ExistingPeriodicWorkPolicy[] values() {
        return (androidx.work.ExistingPeriodicWorkPolicy[]) Camera2StreamConfigurationMap.clone();
    }

    public static androidx.work.ExistingPeriodicWorkPolicy valueOf(java.lang.String str) {
        return (androidx.work.ExistingPeriodicWorkPolicy) java.lang.Enum.valueOf(androidx.work.ExistingPeriodicWorkPolicy.class, str);
    }

    public static kotlin.enums.EnumEntries<androidx.work.ExistingPeriodicWorkPolicy> getEntries() {
        return getHighResolutionOutputSizeshNQ4ISI;
    }
}
