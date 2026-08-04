package androidx.datastore.preferences.protobuf;

/* JADX INFO: loaded from: classes.dex */
public abstract class I {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final H f9114a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final H f9115b;

    static {
        Q q7 = Q.f9136c;
        H h6 = null;
        try {
            h6 = (H) Class.forName("androidx.datastore.preferences.protobuf.MapFieldSchemaFull").getDeclaredConstructor(null).newInstance(null);
        } catch (Exception unused) {
        }
        f9114a = h6;
        f9115b = new H();
    }
}
