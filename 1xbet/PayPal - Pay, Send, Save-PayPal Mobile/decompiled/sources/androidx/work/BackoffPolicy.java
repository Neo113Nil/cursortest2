package androidx.work;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005"}, d2 = {"Landroidx/work/BackoffPolicy;", "", "<init>", "(Ljava/lang/String;I)V", "EXPONENTIAL", "LINEAR"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class BackoffPolicy {
    private static final /* synthetic */ androidx.work.BackoffPolicy[] Camera2StreamConfigurationMap;
    public static final androidx.work.BackoffPolicy EXPONENTIAL;
    public static final androidx.work.BackoffPolicy LINEAR;
    private static final /* synthetic */ kotlin.enums.EnumEntries getHighSpeedVideoFpsRangesFor;

    private BackoffPolicy(java.lang.String str, int i) {
    }

    static {
        androidx.work.BackoffPolicy backoffPolicy = new androidx.work.BackoffPolicy("EXPONENTIAL", 0);
        EXPONENTIAL = backoffPolicy;
        androidx.work.BackoffPolicy backoffPolicy2 = new androidx.work.BackoffPolicy("LINEAR", 1);
        LINEAR = backoffPolicy2;
        androidx.work.BackoffPolicy[] backoffPolicyArr = {backoffPolicy, backoffPolicy2};
        Camera2StreamConfigurationMap = backoffPolicyArr;
        getHighSpeedVideoFpsRangesFor = kotlin.enums.EnumEntriesKt.enumEntries(backoffPolicyArr);
    }

    public static androidx.work.BackoffPolicy[] values() {
        return (androidx.work.BackoffPolicy[]) Camera2StreamConfigurationMap.clone();
    }

    public static androidx.work.BackoffPolicy valueOf(java.lang.String str) {
        return (androidx.work.BackoffPolicy) java.lang.Enum.valueOf(androidx.work.BackoffPolicy.class, str);
    }

    public static kotlin.enums.EnumEntries<androidx.work.BackoffPolicy> getEntries() {
        return getHighSpeedVideoFpsRangesFor;
    }
}
