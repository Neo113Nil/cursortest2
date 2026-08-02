package p000;

/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public abstract class zq1 {

    /* JADX INFO: renamed from: a */
    public static final u52 f9909a;

    /* JADX INFO: renamed from: b */
    public static volatile String f9910b;

    /* JADX INFO: renamed from: c */
    public static final c32 f9911c;

    static {
        yq1 yq1Var = yq1.f9432k;
        int i = sc0.f7095l;
        f62 f62Var = new f62(yq1Var, true, w01.f8328s);
        p90 p90Var = new p90();
        p90Var.f6028k = f62Var;
        f9911c = new c32(2, p90Var);
        f9909a = new u52("__phenotype_server_token", p90Var, "");
        f9910b = null;
    }

    /* JADX INFO: renamed from: a */
    public static String m6026a() {
        return (String) f9909a.get();
    }
}
