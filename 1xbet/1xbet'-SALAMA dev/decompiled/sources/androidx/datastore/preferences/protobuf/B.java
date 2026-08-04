package androidx.datastore.preferences.protobuf;

/* JADX INFO: loaded from: classes.dex */
public abstract class B {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final A f9103a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final A f9104b;

    static {
        Q q7 = Q.f9136c;
        A a2 = null;
        try {
            a2 = (A) Class.forName("androidx.datastore.preferences.protobuf.ListFieldSchemaFull").getDeclaredConstructor(null).newInstance(null);
        } catch (Exception unused) {
        }
        f9103a = a2;
        f9104b = new A();
    }
}
