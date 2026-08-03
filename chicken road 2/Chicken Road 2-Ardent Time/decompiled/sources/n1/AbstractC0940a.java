package n1;

/* renamed from: n1.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0940a {

    /* renamed from: a, reason: collision with root package name */
    public static final java.lang.reflect.Method f8096a;

    static {
        java.lang.reflect.Method method;
        java.lang.reflect.Method[] methods = java.lang.Throwable.class.getMethods();
        kotlin.jvm.internal.i.b(methods);
        int length = methods.length;
        int i2 = 0;
        while (true) {
            method = null;
            if (i2 >= length) {
                break;
            }
            java.lang.reflect.Method method2 = methods[i2];
            if (kotlin.jvm.internal.i.a(method2.getName(), "addSuppressed")) {
                java.lang.Class<?>[] parameterTypes = method2.getParameterTypes();
                kotlin.jvm.internal.i.d(parameterTypes, "getParameterTypes(...)");
                if (kotlin.jvm.internal.i.a(parameterTypes.length == 1 ? parameterTypes[0] : null, java.lang.Throwable.class)) {
                    method = method2;
                    break;
                }
            }
            i2++;
        }
        f8096a = method;
        int length2 = methods.length;
        for (int i3 = 0; i3 < length2 && !kotlin.jvm.internal.i.a(methods[i3].getName(), "getSuppressed"); i3++) {
        }
    }
}
