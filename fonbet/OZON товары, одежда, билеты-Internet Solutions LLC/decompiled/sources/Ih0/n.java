package Ih0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes7.dex */
public final class n {
    private static final /* synthetic */ Xc.a $ENTRIES;
    private static final /* synthetic */ n[] $VALUES;
    public static final n APP_LAUNCH;
    public static final n NOTIFICATION_EXTENSION;
    public static final n TASK_MANAGER;

    static {
        n nVar = new n("NOTIFICATION_EXTENSION", 0);
        NOTIFICATION_EXTENSION = nVar;
        n nVar2 = new n("APP_LAUNCH", 1);
        APP_LAUNCH = nVar2;
        n nVar3 = new n("TASK_MANAGER", 2);
        TASK_MANAGER = nVar3;
        n[] nVarArr = {nVar, nVar2, nVar3};
        $VALUES = nVarArr;
        $ENTRIES = Xc.b.a(nVarArr);
    }

    private n() {
        throw null;
    }

    public static n valueOf(String str) {
        return (n) Enum.valueOf(n.class, str);
    }

    public static n[] values() {
        return (n[]) $VALUES.clone();
    }
}
