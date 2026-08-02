package androidx.datastore.preferences.protobuf;

/* loaded from: classes.dex */
final class G {

    /* renamed from: a, reason: collision with root package name */
    private static final E f42460a;

    /* renamed from: b, reason: collision with root package name */
    private static final F f42461b;

    static {
        E e11;
        int i11 = c0.f42503d;
        try {
            e11 = (E) Class.forName("androidx.datastore.preferences.protobuf.ListFieldSchemaFull").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception unused) {
            e11 = null;
        }
        f42460a = e11;
        f42461b = new F();
    }

    static E a() {
        return f42460a;
    }

    static F b() {
        return f42461b;
    }
}
