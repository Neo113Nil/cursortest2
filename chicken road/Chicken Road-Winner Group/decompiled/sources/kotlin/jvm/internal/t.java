package kotlin.jvm.internal;

import d2.InterfaceC0271a;

/* loaded from: classes.dex */
public abstract class t {
    public static void a(int i3, Object obj) {
        if (obj == null || b(i3, obj)) {
            return;
        }
        c(obj, "kotlin.jvm.functions.Function" + i3);
        throw null;
    }

    public static boolean b(int i3, Object obj) {
        if (obj instanceof InterfaceC0271a) {
            if ((obj instanceof g ? ((g) obj).getArity() : obj instanceof o2.a ? 0 : obj instanceof o2.l ? 1 : obj instanceof o2.p ? 2 : obj instanceof o2.q ? 3 : -1) == i3) {
                return true;
            }
        }
        return false;
    }

    public static void c(Object obj, String str) {
        ClassCastException classCastException = new ClassCastException((obj == null ? "null" : obj.getClass().getName()) + " cannot be cast to " + str);
        j.f(classCastException, t.class.getName());
        throw classCastException;
    }
}
