package androidx.datastore.preferences.protobuf;

/* loaded from: classes.dex */
public abstract class D {

    /* renamed from: a, reason: collision with root package name */
    public static final C f2157a;

    /* renamed from: b, reason: collision with root package name */
    public static final C f2158b;

    static {
        C c3;
        T t3 = T.f2190c;
        try {
            c3 = (C) Class.forName("androidx.datastore.preferences.protobuf.ListFieldSchemaFull").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception unused) {
            c3 = null;
        }
        f2157a = c3;
        f2158b = new C();
    }
}
