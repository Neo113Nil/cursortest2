package androidx.datastore.preferences.protobuf;

/* loaded from: classes.dex */
public abstract class J {

    /* renamed from: a, reason: collision with root package name */
    public static final I f4369a;

    /* renamed from: b, reason: collision with root package name */
    public static final I f4370b;

    static {
        S s2 = S.f4392c;
        I i2 = null;
        try {
            i2 = (I) Class.forName("androidx.datastore.preferences.protobuf.MapFieldSchemaFull").getDeclaredConstructor(null).newInstance(null);
        } catch (Exception unused) {
        }
        f4369a = i2;
        f4370b = new I();
    }
}
