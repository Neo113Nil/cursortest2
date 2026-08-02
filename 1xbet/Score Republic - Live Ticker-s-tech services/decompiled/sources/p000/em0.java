package p000;

/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public abstract class em0 {

    /* JADX INFO: renamed from: a */
    public static final cm0 f2143a;

    /* JADX INFO: renamed from: b */
    public static final cm0 f2144b;

    static {
        fy0 fy0Var = fy0.f2536c;
        cm0 cm0Var = null;
        try {
            cm0Var = (cm0) Class.forName("androidx.datastore.preferences.protobuf.MapFieldSchemaFull").getDeclaredConstructor(null).newInstance(null);
        } catch (Exception unused) {
        }
        f2143a = cm0Var;
        f2144b = new cm0();
    }
}
