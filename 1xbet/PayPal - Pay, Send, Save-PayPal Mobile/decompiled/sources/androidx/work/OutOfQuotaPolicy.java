package androidx.work;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005"}, d2 = {"Landroidx/work/OutOfQuotaPolicy;", "", "<init>", "(Ljava/lang/String;I)V", "RUN_AS_NON_EXPEDITED_WORK_REQUEST", "DROP_WORK_REQUEST"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class OutOfQuotaPolicy {
    public static final androidx.work.OutOfQuotaPolicy DROP_WORK_REQUEST;
    public static final androidx.work.OutOfQuotaPolicy RUN_AS_NON_EXPEDITED_WORK_REQUEST;
    private static final /* synthetic */ androidx.work.OutOfQuotaPolicy[] getHighSpeedVideoFpsRanges;
    private static final /* synthetic */ kotlin.enums.EnumEntries getHighSpeedVideoFpsRangesFor;

    private OutOfQuotaPolicy(java.lang.String str, int i) {
    }

    static {
        androidx.work.OutOfQuotaPolicy outOfQuotaPolicy = new androidx.work.OutOfQuotaPolicy("RUN_AS_NON_EXPEDITED_WORK_REQUEST", 0);
        RUN_AS_NON_EXPEDITED_WORK_REQUEST = outOfQuotaPolicy;
        androidx.work.OutOfQuotaPolicy outOfQuotaPolicy2 = new androidx.work.OutOfQuotaPolicy("DROP_WORK_REQUEST", 1);
        DROP_WORK_REQUEST = outOfQuotaPolicy2;
        androidx.work.OutOfQuotaPolicy[] outOfQuotaPolicyArr = {outOfQuotaPolicy, outOfQuotaPolicy2};
        getHighSpeedVideoFpsRanges = outOfQuotaPolicyArr;
        getHighSpeedVideoFpsRangesFor = kotlin.enums.EnumEntriesKt.enumEntries(outOfQuotaPolicyArr);
    }

    public static androidx.work.OutOfQuotaPolicy[] values() {
        return (androidx.work.OutOfQuotaPolicy[]) getHighSpeedVideoFpsRanges.clone();
    }

    public static androidx.work.OutOfQuotaPolicy valueOf(java.lang.String str) {
        return (androidx.work.OutOfQuotaPolicy) java.lang.Enum.valueOf(androidx.work.OutOfQuotaPolicy.class, str);
    }

    public static kotlin.enums.EnumEntries<androidx.work.OutOfQuotaPolicy> getEntries() {
        return getHighSpeedVideoFpsRangesFor;
    }
}
