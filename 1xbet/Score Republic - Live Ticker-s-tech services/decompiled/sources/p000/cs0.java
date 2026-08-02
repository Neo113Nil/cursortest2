package p000;

/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public abstract class cs0 {

    /* JADX INFO: renamed from: a */
    public static final as0 f1446a;

    /* JADX INFO: renamed from: b */
    public static final as0 f1447b;

    static {
        fy0 fy0Var = fy0.f2536c;
        as0 as0Var = null;
        try {
            as0Var = (as0) Class.forName("androidx.datastore.preferences.protobuf.NewInstanceSchemaFull").getDeclaredConstructor(null).newInstance(null);
        } catch (Exception unused) {
        }
        f1446a = as0Var;
        f1447b = new as0();
    }
}
