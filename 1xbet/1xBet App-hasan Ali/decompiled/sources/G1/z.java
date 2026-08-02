package G1;

import A0.C0040k0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import o4.AbstractC2227e;

/* loaded from: classes.dex */
public abstract class z {

    /* renamed from: a, reason: collision with root package name */
    public final O f1972a;

    /* renamed from: b, reason: collision with root package name */
    public final String f1973b;

    /* renamed from: c, reason: collision with root package name */
    public final LinkedHashMap f1974c = new LinkedHashMap();

    /* renamed from: d, reason: collision with root package name */
    public final ArrayList f1975d = new ArrayList();

    /* renamed from: e, reason: collision with root package name */
    public final LinkedHashMap f1976e = new LinkedHashMap();

    public z(O o5, String str) {
        this.f1972a = o5;
        this.f1973b = str;
    }

    public y a() {
        LinkedHashMap linkedHashMap;
        y b3 = b();
        b3.getClass();
        Iterator it = this.f1974c.entrySet().iterator();
        while (true) {
            boolean hasNext = it.hasNext();
            linkedHashMap = b3.f1968o;
            if (!hasNext) {
                break;
            }
            Map.Entry entry = (Map.Entry) it.next();
            String str = (String) entry.getKey();
            C0135f c0135f = (C0135f) entry.getValue();
            kotlin.jvm.internal.l.f("argumentName", str);
            kotlin.jvm.internal.l.f("argument", c0135f);
            linkedHashMap.put(str, c0135f);
        }
        ArrayList arrayList = this.f1975d;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            v vVar = (v) obj;
            kotlin.jvm.internal.l.f("navDeepLink", vVar);
            ArrayList d5 = AbstractC0136g.d(linkedHashMap, new x(vVar, 0));
            if (!d5.isEmpty()) {
                throw new IllegalArgumentException(("Deep link " + vVar.f1946a + " can't be used to open destination " + b3 + ".\nFollowing required arguments are missing: " + d5).toString());
            }
            b3.f1966m.add(vVar);
        }
        Iterator it2 = this.f1976e.entrySet().iterator();
        if (it2.hasNext()) {
            Map.Entry entry2 = (Map.Entry) it2.next();
            ((Number) entry2.getKey()).intValue();
            if (entry2.getValue() != null) {
                throw new ClassCastException();
            }
            kotlin.jvm.internal.l.f("action", null);
            throw null;
        }
        String str2 = this.f1973b;
        if (str2 != null) {
            if (AbstractC2227e.H0(str2)) {
                throw new IllegalArgumentException("Cannot have an empty route");
            }
            String concat = "android-app://androidx.navigation/".concat(str2);
            kotlin.jvm.internal.l.f("uriPattern", concat);
            ArrayList d6 = AbstractC0136g.d(linkedHashMap, new x(new v(concat), 1));
            if (!d6.isEmpty()) {
                throw new IllegalArgumentException(("Cannot set route \"" + str2 + "\" for destination " + b3 + ". Following required arguments are missing: " + d6).toString());
            }
            b3.f1971r = G4.d.E(new C0040k0(9, concat));
            b3.f1969p = concat.hashCode();
            b3.f1970q = str2;
        }
        return b3;
    }

    public y b() {
        return this.f1972a.a();
    }
}
