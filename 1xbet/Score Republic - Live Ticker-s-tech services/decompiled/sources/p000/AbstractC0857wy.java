package p000;

/* JADX INFO: renamed from: wy */
/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0857wy {

    /* JADX INFO: renamed from: a */
    public static final C0783uy f8720a = new C0783uy();

    /* JADX INFO: renamed from: b */
    public static final C0783uy f8721b;

    static {
        C0783uy c0783uy = null;
        try {
            c0783uy = (C0783uy) Class.forName("com.google.protobuf.ExtensionSchemaFull").getDeclaredConstructor(null).newInstance(null);
        } catch (Exception unused) {
        }
        f8721b = c0783uy;
    }
}
