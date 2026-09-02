package g0;

import a.AbstractC0018a;
import f0.o;
import f0.p;
import f0.q;
import f0.r;
import f0.s;
import f0.t;
import f0.u;
import f0.v;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public final class e implements j0.b, d {

    /* renamed from: b, reason: collision with root package name */
    public static final Map f539b;

    /* renamed from: a, reason: collision with root package name */
    public final Class f540a;

    static {
        Map map;
        List asList = Arrays.asList(f0.a.class, f0.l.class, p.class, o0.b.class, q.class, r.class, s.class, t.class, u.class, v.class, f0.b.class, f0.c.class, f0.d.class, f0.e.class, f0.f.class, f0.g.class, f0.h.class, f0.i.class, f0.j.class, f0.k.class, f0.m.class, f0.n.class, o.class);
        h.d(asList, "asList(...)");
        ArrayList arrayList = new ArrayList(asList.size());
        int i2 = 0;
        int i3 = 0;
        for (Object obj : asList) {
            int i4 = i3 + 1;
            if (i3 < 0) {
                throw new ArithmeticException("Index overflow has happened.");
            }
            arrayList.add(new W.b((Class) obj, Integer.valueOf(i3)));
            i3 = i4;
        }
        int size = arrayList.size();
        if (size == 0) {
            map = X.n.f403b;
        } else if (size != 1) {
            int size2 = arrayList.size();
            if (size2 >= 0) {
                size2 = size2 < 3 ? size2 + 1 : size2 < 1073741824 ? (int) ((size2 / 0.75f) + 1.0f) : Integer.MAX_VALUE;
            }
            map = new LinkedHashMap(size2);
            int size3 = arrayList.size();
            while (i2 < size3) {
                Object obj2 = arrayList.get(i2);
                i2++;
                W.b bVar = (W.b) obj2;
                map.put(bVar.f387b, bVar.f388c);
            }
        } else {
            W.b bVar2 = (W.b) arrayList.get(0);
            h.e(bVar2, "pair");
            map = Collections.singletonMap(bVar2.f387b, bVar2.f388c);
            h.d(map, "singletonMap(...)");
        }
        f539b = map;
    }

    public e(Class cls) {
        h.e(cls, "jClass");
        this.f540a = cls;
    }

    @Override // g0.d
    public final Class a() {
        return this.f540a;
    }

    public final String b() {
        String d2;
        Class cls = this.f540a;
        h.e(cls, "jClass");
        String str = null;
        if (cls.isAnonymousClass()) {
            return null;
        }
        if (!cls.isLocalClass()) {
            if (!cls.isArray()) {
                String d3 = n.d(cls.getName());
                return d3 == null ? cls.getSimpleName() : d3;
            }
            Class<?> componentType = cls.getComponentType();
            if (componentType.isPrimitive() && (d2 = n.d(componentType.getName())) != null) {
                str = d2.concat("Array");
            }
            return str == null ? "Array" : str;
        }
        String simpleName = cls.getSimpleName();
        Method enclosingMethod = cls.getEnclosingMethod();
        if (enclosingMethod != null) {
            return l0.h.H(simpleName, enclosingMethod.getName() + '$');
        }
        Constructor<?> enclosingConstructor = cls.getEnclosingConstructor();
        if (enclosingConstructor != null) {
            return l0.h.H(simpleName, enclosingConstructor.getName() + '$');
        }
        int indexOf = simpleName.indexOf(36, 0);
        if (indexOf == -1) {
            return simpleName;
        }
        String substring = simpleName.substring(indexOf + 1, simpleName.length());
        h.d(substring, "substring(...)");
        return substring;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof e) && AbstractC0018a.k(this).equals(AbstractC0018a.k((j0.b) obj));
    }

    public final int hashCode() {
        return AbstractC0018a.k(this).hashCode();
    }

    public final String toString() {
        return this.f540a.toString() + " (Kotlin reflection is not available)";
    }
}
