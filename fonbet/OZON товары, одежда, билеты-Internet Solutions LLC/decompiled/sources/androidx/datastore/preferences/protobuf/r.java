package androidx.datastore.preferences.protobuf;

/* loaded from: classes.dex */
final class r {

    /* renamed from: a, reason: collision with root package name */
    private static final C5371q f42610a = new C5371q();

    /* renamed from: b, reason: collision with root package name */
    private static final AbstractC5370p<?> f42611b;

    static {
        AbstractC5370p<?> abstractC5370p;
        int i11 = c0.f42503d;
        try {
            abstractC5370p = (AbstractC5370p) Class.forName("androidx.datastore.preferences.protobuf.ExtensionSchemaFull").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception unused) {
            abstractC5370p = null;
        }
        f42611b = abstractC5370p;
    }

    static AbstractC5370p<?> a() {
        AbstractC5370p<?> abstractC5370p = f42611b;
        if (abstractC5370p != null) {
            return abstractC5370p;
        }
        throw new IllegalStateException("Protobuf runtime is not correctly loaded.");
    }

    static C5371q b() {
        return f42610a;
    }
}
