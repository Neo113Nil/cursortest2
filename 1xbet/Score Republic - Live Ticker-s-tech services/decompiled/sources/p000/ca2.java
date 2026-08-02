package p000;

/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class ca2 extends da2 {

    /* JADX INFO: renamed from: e */
    public static final da2 f1207e;

    /* JADX INFO: renamed from: f */
    public static final da2 f1208f;

    static {
        da2 da2VarM1145b = new ca2(null, new w71(0)).m1145b();
        f1207e = da2VarM1145b;
        ca2 ca2Var = new ca2(da2VarM1145b, new w71(0));
        boolean z = !ca2Var.f1603c;
        Boolean bool = Boolean.TRUE;
        a90.m132p("Can't mutate after handing to trace", z);
        a90.m132p("Key already present", !ca2Var.m1146c());
        ca2Var.f1602b.put(da2.f1600d, bool);
        f1208f = ca2Var.m1145b();
    }
}
