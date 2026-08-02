package androidx.datastore.preferences.protobuf;

/* loaded from: classes.dex */
final class N {

    /* renamed from: a, reason: collision with root package name */
    private static final L f42474a;

    /* renamed from: b, reason: collision with root package name */
    private static final M f42475b;

    static {
        L l11;
        int i11 = c0.f42503d;
        try {
            l11 = (L) Class.forName("androidx.datastore.preferences.protobuf.MapFieldSchemaFull").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception unused) {
            l11 = null;
        }
        f42474a = l11;
        f42475b = new M();
    }

    static L a() {
        return f42474a;
    }

    static M b() {
        return f42475b;
    }
}
