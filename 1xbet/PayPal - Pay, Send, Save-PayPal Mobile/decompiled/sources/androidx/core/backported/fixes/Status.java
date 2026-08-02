package androidx.core.backported.fixes;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007"}, d2 = {"Landroidx/core/backported/fixes/Status;", "", "<init>", "(Ljava/lang/String;I)V", "Unknown", "Fixed", "NotApplicable", "NotFixed"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class Status {
    private static final /* synthetic */ androidx.core.backported.fixes.Status[] Camera2StreamConfigurationMap;
    public static final androidx.core.backported.fixes.Status Fixed;
    public static final androidx.core.backported.fixes.Status NotApplicable;
    public static final androidx.core.backported.fixes.Status NotFixed;
    public static final androidx.core.backported.fixes.Status Unknown;
    private static final /* synthetic */ kotlin.enums.EnumEntries getHighResolutionOutputSizeshNQ4ISI;

    private Status(java.lang.String str, int i) {
    }

    static {
        androidx.core.backported.fixes.Status status = new androidx.core.backported.fixes.Status("Unknown", 0);
        Unknown = status;
        androidx.core.backported.fixes.Status status2 = new androidx.core.backported.fixes.Status("Fixed", 1);
        Fixed = status2;
        androidx.core.backported.fixes.Status status3 = new androidx.core.backported.fixes.Status("NotApplicable", 2);
        NotApplicable = status3;
        androidx.core.backported.fixes.Status status4 = new androidx.core.backported.fixes.Status("NotFixed", 3);
        NotFixed = status4;
        androidx.core.backported.fixes.Status[] statusArr = {status, status2, status3, status4};
        Camera2StreamConfigurationMap = statusArr;
        getHighResolutionOutputSizeshNQ4ISI = kotlin.enums.EnumEntriesKt.enumEntries(statusArr);
    }

    public static androidx.core.backported.fixes.Status[] values() {
        return (androidx.core.backported.fixes.Status[]) Camera2StreamConfigurationMap.clone();
    }

    public static androidx.core.backported.fixes.Status valueOf(java.lang.String str) {
        return (androidx.core.backported.fixes.Status) java.lang.Enum.valueOf(androidx.core.backported.fixes.Status.class, str);
    }

    public static kotlin.enums.EnumEntries<androidx.core.backported.fixes.Status> getEntries() {
        return getHighResolutionOutputSizeshNQ4ISI;
    }
}
