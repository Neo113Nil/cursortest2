package p000;

/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public abstract class dm0 {

    /* JADX INFO: renamed from: a */
    public static final bm0 f1748a;

    /* JADX INFO: renamed from: b */
    public static final bm0 f1749b;

    static {
        bm0 bm0Var = null;
        try {
            bm0Var = (bm0) Class.forName("com.google.protobuf.MapFieldSchemaFull").getDeclaredConstructor(null).newInstance(null);
        } catch (Exception unused) {
        }
        f1748a = bm0Var;
        f1749b = new bm0();
    }
}
