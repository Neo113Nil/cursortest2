package androidx.datastore.preferences.protobuf;

/* loaded from: classes.dex */
public abstract class K {

    /* renamed from: a, reason: collision with root package name */
    public static final J f2168a;

    /* renamed from: b, reason: collision with root package name */
    public static final J f2169b;

    static {
        J j3;
        T t3 = T.f2190c;
        try {
            j3 = (J) Class.forName("androidx.datastore.preferences.protobuf.MapFieldSchemaFull").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception unused) {
            j3 = null;
        }
        f2168a = j3;
        f2169b = new J();
    }
}
