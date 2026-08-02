package p000;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: pg */
/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class C0580pg implements InterfaceC0543og {

    /* JADX INFO: renamed from: a */
    public final Class f6133a;

    static {
        List listM3539q = AbstractC0508ni.m3539q(f60.class, h60.class, v60.class, x60.class, y60.class, z60.class, a70.class, b70.class, c70.class, d70.class, g60.class, i60.class, j60.class, k60.class, l60.class, m60.class, n60.class, o60.class, p60.class, q60.class, s60.class, t60.class, u60.class);
        ArrayList arrayList = new ArrayList(listM3539q.size());
        int i = 0;
        for (Object obj : listM3539q) {
            int i2 = i + 1;
            if (i < 0) {
                throw new ArithmeticException("Index overflow has happened.");
            }
            arrayList.add(new kv0((Class) obj, Integer.valueOf(i)));
            i = i2;
        }
        fm0.m1882H(arrayList);
    }

    public C0580pg(Class cls) {
        this.f6133a = cls;
    }

    /* JADX INFO: renamed from: a */
    public final String m3904a() {
        String strM2319o;
        Class cls = this.f6133a;
        String strConcat = null;
        if (cls.isAnonymousClass()) {
            return null;
        }
        if (!cls.isLocalClass()) {
            if (!cls.isArray()) {
                String strM2319o2 = hn0.m2319o(cls.getName());
                return strM2319o2 == null ? cls.getSimpleName() : strM2319o2;
            }
            Class<?> componentType = cls.getComponentType();
            if (componentType.isPrimitive() && (strM2319o = hn0.m2319o(componentType.getName())) != null) {
                strConcat = strM2319o.concat("Array");
            }
            return strConcat == null ? "Array" : strConcat;
        }
        String simpleName = cls.getSimpleName();
        Method enclosingMethod = cls.getEnclosingMethod();
        if (enclosingMethod != null) {
            return fb1.m1763y(simpleName, enclosingMethod.getName() + '$');
        }
        Constructor<?> enclosingConstructor = cls.getEnclosingConstructor();
        if (enclosingConstructor == null) {
            int iIndexOf = simpleName.indexOf(36, 0);
            return iIndexOf == -1 ? simpleName : simpleName.substring(iIndexOf + 1, simpleName.length());
        }
        return fb1.m1763y(simpleName, enclosingConstructor.getName() + '$');
    }

    public final boolean equals(Object obj) {
        return (obj instanceof C0580pg) && vt1.m5192c(this).equals(vt1.m5192c((C0580pg) obj));
    }

    public final int hashCode() {
        return vt1.m5192c(this).hashCode();
    }

    public final String toString() {
        return this.f6133a.toString() + " (Kotlin reflection is not available)";
    }
}
