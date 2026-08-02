package androidx.datastore.preferences.protobuf;

/* loaded from: classes.dex */
final class Y {

    /* renamed from: a, reason: collision with root package name */
    private static final W f42499a;

    /* renamed from: b, reason: collision with root package name */
    private static final X f42500b;

    static {
        W w11;
        int i11 = c0.f42503d;
        try {
            w11 = (W) Class.forName("androidx.datastore.preferences.protobuf.NewInstanceSchemaFull").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception unused) {
            w11 = null;
        }
        f42499a = w11;
        f42500b = new X();
    }

    static W a() {
        return f42499a;
    }

    static X b() {
        return f42500b;
    }
}
