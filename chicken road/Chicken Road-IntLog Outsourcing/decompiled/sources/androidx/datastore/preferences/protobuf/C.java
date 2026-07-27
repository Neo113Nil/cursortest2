package androidx.datastore.preferences.protobuf;

/* loaded from: classes.dex */
public abstract class C {

    /* renamed from: a, reason: collision with root package name */
    public static final B f4358a;

    /* renamed from: b, reason: collision with root package name */
    public static final B f4359b;

    static {
        S s2 = S.f4392c;
        B b6 = null;
        try {
            b6 = (B) Class.forName("androidx.datastore.preferences.protobuf.ListFieldSchemaFull").getDeclaredConstructor(null).newInstance(null);
        } catch (Exception unused) {
        }
        f4358a = b6;
        f4359b = new B();
    }
}
