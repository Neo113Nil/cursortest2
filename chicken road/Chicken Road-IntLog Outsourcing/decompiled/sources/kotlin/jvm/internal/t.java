package kotlin.jvm.internal;

/* loaded from: classes.dex */
public abstract class t {

    /* renamed from: a, reason: collision with root package name */
    public static final u f10742a;

    static {
        u uVar = null;
        try {
            uVar = (u) Class.forName("kotlin.reflect.jvm.internal.ReflectionFactoryImpl").newInstance();
        } catch (ClassCastException | ClassNotFoundException | IllegalAccessException | InstantiationException unused) {
        }
        if (uVar == null) {
            uVar = new u();
        }
        f10742a = uVar;
    }

    public static d a(Class cls) {
        f10742a.getClass();
        return new d(cls);
    }
}
