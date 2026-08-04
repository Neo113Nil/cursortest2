package t6;

import kotlin.Function;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes2.dex */
public abstract class s {
    public static void a(int i7, Object obj) {
        if (obj == null || b(i7, obj)) {
            return;
        }
        c(obj, "kotlin.jvm.functions.Function" + i7);
        throw null;
    }

    public static boolean b(int i7, Object obj) {
        int arity;
        if (!(obj instanceof Function)) {
            return false;
        }
        if (obj instanceof f) {
            arity = ((f) obj).getArity();
        } else if (obj instanceof s6.a) {
            arity = 0;
        } else if (obj instanceof Function1) {
            arity = 1;
        } else if (obj instanceof Function2) {
            arity = 2;
        } else {
            arity = obj instanceof s6.o ? 3 : -1;
        }
        return arity == i7;
    }

    public static void c(Object obj, String str) {
        ClassCastException classCastException = new ClassCastException(p031e1.k.f(obj == null ? "null" : obj.getClass().getName(), " cannot be cast to ", str));
        h.g(classCastException, s.class.getName());
        throw classCastException;
    }
}
