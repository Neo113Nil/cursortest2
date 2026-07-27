package kotlin.jvm.internal;

import f4.C0430g;
import g4.AbstractC0466k;
import g4.AbstractC0467l;
import g4.AbstractC0476u;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import n2.AbstractC1341c;
import t4.InterfaceC1430a;
import t4.InterfaceC1431b;
import t4.InterfaceC1432c;
import t4.InterfaceC1433d;
import t4.InterfaceC1434e;
import t4.InterfaceC1435f;
import t4.InterfaceC1436g;
import t4.InterfaceC1437h;
import t4.InterfaceC1438i;
import t4.InterfaceC1439j;
import t4.InterfaceC1440k;
import t4.InterfaceC1441l;
import t4.InterfaceC1442m;
import t4.InterfaceC1443n;
import t4.InterfaceC1444o;
import t4.InterfaceC1445p;
import t4.InterfaceC1446q;
import t4.InterfaceC1447r;
import t4.InterfaceC1448s;
import t4.InterfaceC1449t;
import t4.InterfaceC1450u;
import t4.InterfaceC1451v;
import t4.InterfaceC1452w;
import z4.InterfaceC1586c;

/* loaded from: classes.dex */
public final class d implements InterfaceC1586c, c {

    /* renamed from: b, reason: collision with root package name */
    public static final Map f10735b;

    /* renamed from: a, reason: collision with root package name */
    public final Class f10736a;

    static {
        List A02 = AbstractC0466k.A0(InterfaceC1430a.class, InterfaceC1441l.class, InterfaceC1445p.class, InterfaceC1446q.class, InterfaceC1447r.class, InterfaceC1448s.class, InterfaceC1449t.class, InterfaceC1450u.class, InterfaceC1451v.class, InterfaceC1452w.class, InterfaceC1431b.class, InterfaceC1432c.class, InterfaceC1433d.class, InterfaceC1434e.class, InterfaceC1435f.class, InterfaceC1436g.class, InterfaceC1437h.class, InterfaceC1438i.class, InterfaceC1439j.class, InterfaceC1440k.class, InterfaceC1442m.class, InterfaceC1443n.class, InterfaceC1444o.class);
        ArrayList arrayList = new ArrayList(AbstractC0467l.D0(A02, 10));
        int i2 = 0;
        for (Object obj : A02) {
            int i3 = i2 + 1;
            if (i2 < 0) {
                AbstractC0466k.C0();
                throw null;
            }
            arrayList.add(new C0430g((Class) obj, Integer.valueOf(i2)));
            i2 = i3;
        }
        f10735b = AbstractC0476u.c0(arrayList);
    }

    public d(Class jClass) {
        i.e(jClass, "jClass");
        this.f10736a = jClass;
    }

    @Override // kotlin.jvm.internal.c
    public final Class a() {
        return this.f10736a;
    }

    public final String b() {
        String k3;
        Class jClass = this.f10736a;
        i.e(jClass, "jClass");
        String str = null;
        if (jClass.isAnonymousClass()) {
            return null;
        }
        if (!jClass.isLocalClass()) {
            if (!jClass.isArray()) {
                String k6 = i.k(jClass.getName());
                return k6 == null ? jClass.getSimpleName() : k6;
            }
            Class<?> componentType = jClass.getComponentType();
            if (componentType.isPrimitive() && (k3 = i.k(componentType.getName())) != null) {
                str = k3.concat("Array");
            }
            return str == null ? "Array" : str;
        }
        String simpleName = jClass.getSimpleName();
        Method enclosingMethod = jClass.getEnclosingMethod();
        if (enclosingMethod != null) {
            return B4.k.k0(simpleName, enclosingMethod.getName() + '$');
        }
        Constructor<?> enclosingConstructor = jClass.getEnclosingConstructor();
        if (enclosingConstructor != null) {
            return B4.k.k0(simpleName, enclosingConstructor.getName() + '$');
        }
        int W5 = B4.k.W(simpleName, '$', 0, false, 6);
        if (W5 == -1) {
            return simpleName;
        }
        String substring = simpleName.substring(W5 + 1, simpleName.length());
        i.d(substring, "substring(...)");
        return substring;
    }

    public final boolean c(Object obj) {
        Class jClass = this.f10736a;
        i.e(jClass, "jClass");
        Map map = f10735b;
        i.c(map, "null cannot be cast to non-null type kotlin.collections.Map<K of kotlin.collections.MapsKt__MapsKt.get, V of kotlin.collections.MapsKt__MapsKt.get>");
        Integer num = (Integer) map.get(jClass);
        if (num != null) {
            return v.c(num.intValue(), obj);
        }
        if (jClass.isPrimitive()) {
            jClass = AbstractC1341c.p(t.a(jClass));
        }
        return jClass.isInstance(obj);
    }

    public final boolean equals(Object obj) {
        return (obj instanceof d) && AbstractC1341c.p(this).equals(AbstractC1341c.p((InterfaceC1586c) obj));
    }

    public final int hashCode() {
        return AbstractC1341c.p(this).hashCode();
    }

    public final String toString() {
        return this.f10736a.toString() + " (Kotlin reflection is not available)";
    }
}
