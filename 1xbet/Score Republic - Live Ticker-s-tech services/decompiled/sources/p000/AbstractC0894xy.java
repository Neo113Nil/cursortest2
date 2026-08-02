package p000;

/* JADX INFO: renamed from: xy */
/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0894xy {

    /* JADX INFO: renamed from: a */
    public static final C0820vy f9104a = new C0820vy();

    /* JADX INFO: renamed from: b */
    public static final C0820vy f9105b;

    static {
        fy0 fy0Var = fy0.f2536c;
        C0820vy c0820vy = null;
        try {
            c0820vy = (C0820vy) Class.forName("androidx.datastore.preferences.protobuf.ExtensionSchemaFull").getDeclaredConstructor(null).newInstance(null);
        } catch (Exception unused) {
        }
        f9105b = c0820vy;
    }
}
