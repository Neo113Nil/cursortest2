package p000;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class h51 {

    /* JADX INFO: renamed from: j */
    public static final h51 f3064j;

    /* JADX INFO: renamed from: k */
    public static final h51 f3065k;

    /* JADX INFO: renamed from: l */
    public static final h51 f3066l;

    /* JADX INFO: renamed from: m */
    public static final /* synthetic */ h51[] f3067m;

    static {
        h51 h51Var = new h51("NETWORK_UNMETERED", 0);
        f3064j = h51Var;
        h51 h51Var2 = new h51("DEVICE_IDLE", 1);
        f3065k = h51Var2;
        h51 h51Var3 = new h51("DEVICE_CHARGING", 2);
        f3066l = h51Var3;
        f3067m = new h51[]{h51Var, h51Var2, h51Var3};
    }

    public static h51 valueOf(String str) {
        return (h51) Enum.valueOf(h51.class, str);
    }

    public static h51[] values() {
        return (h51[]) f3067m.clone();
    }
}
