package e4;

import java.lang.reflect.Method;
import kotlin.jvm.internal.l;

/* renamed from: e4.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1936a {

    /* renamed from: a, reason: collision with root package name */
    public static final Method f16918a;

    /* renamed from: b, reason: collision with root package name */
    public static final Method f16919b;

    static {
        Method method;
        Method method2;
        Method[] methods = Throwable.class.getMethods();
        l.c(methods);
        int length = methods.length;
        int i = 0;
        int i5 = 0;
        while (true) {
            method = null;
            if (i5 >= length) {
                method2 = null;
                break;
            }
            method2 = methods[i5];
            if (l.a(method2.getName(), "addSuppressed")) {
                Class<?>[] parameterTypes = method2.getParameterTypes();
                l.e("getParameterTypes(...)", parameterTypes);
                if (l.a(parameterTypes.length == 1 ? parameterTypes[0] : null, Throwable.class)) {
                    break;
                }
            }
            i5++;
        }
        f16918a = method2;
        int length2 = methods.length;
        while (true) {
            if (i >= length2) {
                break;
            }
            Method method3 = methods[i];
            if (l.a(method3.getName(), "getSuppressed")) {
                method = method3;
                break;
            }
            i++;
        }
        f16919b = method;
    }
}
