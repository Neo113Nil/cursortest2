package t6;

/* loaded from: classes2.dex */
public abstract class q {

    /* renamed from: a, reason: collision with root package name */
    public static final r f16473a;

    static {
        r rVar = null;
        try {
            rVar = (r) Class.forName("kotlin.reflect.jvm.internal.ReflectionFactoryImpl").newInstance();
        } catch (ClassCastException | ClassNotFoundException | IllegalAccessException | InstantiationException unused) {
        }
        if (rVar == null) {
            rVar = new r();
        }
        f16473a = rVar;
    }

    public static d a(Class cls) {
        f16473a.getClass();
        return new d(cls);
    }
}
