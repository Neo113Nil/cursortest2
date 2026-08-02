package p000;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class od1 {

    /* JADX INFO: renamed from: j */
    public static final od1 f5702j;

    /* JADX INFO: renamed from: k */
    public static final od1 f5703k;

    /* JADX INFO: renamed from: l */
    public static final /* synthetic */ od1[] f5704l;

    /* JADX INFO: Fake field, exist only in values array */
    od1 EF0;

    static {
        od1 od1Var = new od1("FAKE", 0);
        od1 od1Var2 = new od1("MTLS", 1);
        f5702j = od1Var2;
        od1 od1Var3 = new od1("CUSTOM_MANAGERS", 2);
        f5703k = od1Var3;
        f5704l = new od1[]{od1Var, od1Var2, od1Var3};
    }

    public static od1 valueOf(String str) {
        return (od1) Enum.valueOf(od1.class, str);
    }

    public static od1[] values() {
        return (od1[]) f5704l.clone();
    }
}
