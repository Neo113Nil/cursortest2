package kotlin.jvm.internal;

/* loaded from: classes.dex */
public abstract class r {

    /* renamed from: a, reason: collision with root package name */
    public static final s f9673a;

    static {
        s sVar = null;
        try {
            sVar = (s) Class.forName("kotlin.reflect.jvm.internal.ReflectionFactoryImpl").newInstance();
        } catch (ClassCastException | ClassNotFoundException | IllegalAccessException | InstantiationException unused) {
        }
        if (sVar == null) {
            sVar = new s();
        }
        f9673a = sVar;
    }

    public static e a(Class cls) {
        f9673a.getClass();
        return new e(cls);
    }
}
