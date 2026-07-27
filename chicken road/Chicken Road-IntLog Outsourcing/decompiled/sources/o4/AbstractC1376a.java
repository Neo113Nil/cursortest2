package o4;

import java.lang.reflect.Method;
import kotlin.jvm.internal.i;

/* renamed from: o4.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1376a {

    /* renamed from: a, reason: collision with root package name */
    public static final Method f11615a;

    static {
        Method method;
        Method[] methods = Throwable.class.getMethods();
        i.b(methods);
        int length = methods.length;
        int i2 = 0;
        while (true) {
            method = null;
            if (i2 >= length) {
                break;
            }
            Method method2 = methods[i2];
            if (i.a(method2.getName(), "addSuppressed")) {
                Class<?>[] parameterTypes = method2.getParameterTypes();
                i.d(parameterTypes, "getParameterTypes(...)");
                if (i.a(parameterTypes.length == 1 ? parameterTypes[0] : null, Throwable.class)) {
                    method = method2;
                    break;
                }
            }
            i2++;
        }
        f11615a = method;
        int length2 = methods.length;
        for (int i3 = 0; i3 < length2 && !i.a(methods[i3].getName(), "getSuppressed"); i3++) {
        }
    }
}
