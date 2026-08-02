package p000;

/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public abstract class qi0 {

    /* JADX INFO: renamed from: a */
    public static final pi0 f6503a;

    /* JADX INFO: renamed from: b */
    public static final pi0 f6504b;

    static {
        fy0 fy0Var = fy0.f2536c;
        pi0 pi0Var = null;
        try {
            pi0Var = (pi0) Class.forName("androidx.datastore.preferences.protobuf.ListFieldSchemaFull").getDeclaredConstructor(null).newInstance(null);
        } catch (Exception unused) {
        }
        f6503a = pi0Var;
        f6504b = new pi0();
    }
}
