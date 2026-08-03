package kotlin.jvm.internal;

/* loaded from: classes.dex */
public abstract class q {

    /* renamed from: a, reason: collision with root package name */
    public static final kotlin.jvm.internal.r f7961a;

    static {
        kotlin.jvm.internal.r rVar = null;
        try {
            rVar = (kotlin.jvm.internal.r) java.lang.Class.forName("kotlin.reflect.jvm.internal.ReflectionFactoryImpl").newInstance();
        } catch (java.lang.ClassCastException | java.lang.ClassNotFoundException | java.lang.IllegalAccessException | java.lang.InstantiationException unused) {
        }
        if (rVar == null) {
            rVar = new kotlin.jvm.internal.r();
        }
        f7961a = rVar;
    }

    public static kotlin.jvm.internal.d a(java.lang.Class cls) {
        f7961a.getClass();
        return new kotlin.jvm.internal.d(cls);
    }
}
