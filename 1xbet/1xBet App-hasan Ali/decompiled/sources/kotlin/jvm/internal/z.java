package kotlin.jvm.internal;

import a3.AbstractC0467k;
import i4.InterfaceC2015a;
import java.util.Map;

/* loaded from: classes.dex */
public abstract class z {
    public static Map a(Object obj) {
        if ((obj instanceof j4.a) && !(obj instanceof j4.d)) {
            d("kotlin.collections.MutableMap", obj);
            throw null;
        }
        try {
            return (Map) obj;
        } catch (ClassCastException e3) {
            l.j(e3, z.class.getName());
            throw e3;
        }
    }

    public static void b(int i, Object obj) {
        if (obj == null || c(i, obj)) {
            return;
        }
        d("kotlin.jvm.functions.Function" + i, obj);
        throw null;
    }

    public static boolean c(int i, Object obj) {
        int i5;
        if (obj instanceof W3.c) {
            if (obj instanceof h) {
                i5 = ((h) obj).getArity();
            } else if (obj instanceof InterfaceC2015a) {
                i5 = 0;
            } else if (obj instanceof i4.c) {
                i5 = 1;
            } else if (obj instanceof i4.e) {
                i5 = 2;
            } else if (obj instanceof i4.f) {
                i5 = 3;
            } else if (obj instanceof i4.g) {
                i5 = 4;
            } else {
                boolean z3 = obj instanceof X.b;
                i5 = z3 ? 5 : z3 ? 6 : z3 ? 7 : z3 ? 8 : z3 ? 9 : z3 ? 10 : z3 ? 11 : z3 ? 13 : z3 ? 14 : z3 ? 15 : z3 ? 16 : z3 ? 17 : z3 ? 18 : z3 ? 19 : z3 ? 20 : z3 ? 21 : -1;
            }
            if (i5 == i) {
                return true;
            }
        }
        return false;
    }

    public static void d(String str, Object obj) {
        ClassCastException classCastException = new ClassCastException(AbstractC0467k.v(obj == null ? "null" : obj.getClass().getName(), " cannot be cast to ", str));
        l.j(classCastException, z.class.getName());
        throw classCastException;
    }
}
