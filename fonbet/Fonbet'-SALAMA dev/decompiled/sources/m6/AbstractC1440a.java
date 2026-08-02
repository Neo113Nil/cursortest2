package m6;

import java.lang.reflect.Method;
import t6.h;

/* renamed from: m6.a, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC1440a {

    /* renamed from: a, reason: collision with root package name */
    public static final Method f15277a;

    static {
        Method method;
        Method[] methods = Throwable.class.getMethods();
        h.b(methods);
        int length = methods.length;
        int i7 = 0;
        while (true) {
            method = null;
            if (i7 >= length) {
                break;
            }
            Method method2 = methods[i7];
            if (h.a(method2.getName(), "addSuppressed")) {
                Class<?>[] parameterTypes = method2.getParameterTypes();
                h.d(parameterTypes, "getParameterTypes(...)");
                if (h.a(parameterTypes.length == 1 ? parameterTypes[0] : null, Throwable.class)) {
                    method = method2;
                    break;
                }
            }
            i7++;
        }
        f15277a = method;
        int length2 = methods.length;
        for (int i8 = 0; i8 < length2 && !h.a(methods[i8].getName(), "getSuppressed"); i8++) {
        }
    }
}
