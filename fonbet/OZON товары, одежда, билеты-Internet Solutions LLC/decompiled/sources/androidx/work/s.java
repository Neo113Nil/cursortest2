package androidx.work;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class s {
    private static final /* synthetic */ s[] $VALUES;
    public static final s DROP_WORK_REQUEST;
    public static final s RUN_AS_NON_EXPEDITED_WORK_REQUEST;

    static {
        s sVar = new s("RUN_AS_NON_EXPEDITED_WORK_REQUEST", 0);
        RUN_AS_NON_EXPEDITED_WORK_REQUEST = sVar;
        s sVar2 = new s("DROP_WORK_REQUEST", 1);
        DROP_WORK_REQUEST = sVar2;
        $VALUES = new s[]{sVar, sVar2};
    }

    private s() {
        throw null;
    }

    public static s valueOf(String str) {
        return (s) Enum.valueOf(s.class, str);
    }

    public static s[] values() {
        return (s[]) $VALUES.clone();
    }
}
