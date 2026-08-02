package p000;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class ps0 {

    /* JADX INFO: renamed from: j */
    public static final ps0 f6243j;

    /* JADX INFO: renamed from: k */
    public static final /* synthetic */ ps0[] f6244k;

    static {
        ps0 ps0Var = new ps0("COMPLETE", 0);
        f6243j = ps0Var;
        f6244k = new ps0[]{ps0Var};
    }

    public static ps0 valueOf(String str) {
        return (ps0) Enum.valueOf(ps0.class, str);
    }

    public static ps0[] values() {
        return (ps0[]) f6244k.clone();
    }

    @Override // java.lang.Enum
    public final String toString() {
        return "NotificationLite.Complete";
    }
}
