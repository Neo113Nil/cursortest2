package t6;

import kotlin.Function;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* loaded from: classes2.dex */
public abstract class s {
    public static void a(int i7, Object obj) {
        if (obj == null || b(i7, obj)) {
            return;
        }
        c(obj, "kotlin.jvm.functions.Function" + i7);
        throw null;
    }

    public static boolean b(int i7, Object obj) {
        if (obj instanceof Function) {
            return (obj instanceof f ? ((f) obj).getArity() : obj instanceof s6.a ? 0 : obj instanceof Function1 ? 1 : obj instanceof Function2 ? 2 : obj instanceof s6.o ? 3 : -1) == i7;
        }
        return false;
    }

    public static void c(Object obj, String str) {
        ClassCastException classCastException = new ClassCastException(e1.k.f(obj == null ? "null" : obj.getClass().getName(), " cannot be cast to ", str));
        h.g(classCastException, s.class.getName());
        throw classCastException;
    }
}
