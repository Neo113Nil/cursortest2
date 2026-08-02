package G1;

import android.content.Context;
import android.content.res.Resources;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/* renamed from: G1.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0136g {
    public static String a(Context context, int i) {
        String valueOf;
        kotlin.jvm.internal.l.f("context", context);
        if (i <= 16777215) {
            return String.valueOf(i);
        }
        try {
            valueOf = context.getResources().getResourceName(i);
        } catch (Resources.NotFoundException unused) {
            valueOf = String.valueOf(i);
        }
        kotlin.jvm.internal.l.e("try {\n                  …tring()\n                }", valueOf);
        return valueOf;
    }

    public static n4.g b(y yVar) {
        kotlin.jvm.internal.l.f("<this>", yVar);
        return n4.i.M(yVar, C0131b.f1884s);
    }

    public static String c(Class cls) {
        LinkedHashMap linkedHashMap = P.f1876b;
        String str = (String) linkedHashMap.get(cls);
        if (str == null) {
            N n5 = (N) cls.getAnnotation(N.class);
            str = n5 != null ? n5.value() : null;
            if (str == null || str.length() <= 0) {
                throw new IllegalArgumentException("No @Navigator.Name annotation found for ".concat(cls.getSimpleName()).toString());
            }
            linkedHashMap.put(cls, str);
        }
        kotlin.jvm.internal.l.c(str);
        return str;
    }

    public static final ArrayList d(Map map, i4.c cVar) {
        kotlin.jvm.internal.l.f("<this>", map);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry entry : map.entrySet()) {
            C0135f c0135f = (C0135f) entry.getValue();
            Boolean bool = c0135f != null ? Boolean.FALSE : null;
            kotlin.jvm.internal.l.c(bool);
            if (!bool.booleanValue() && !c0135f.f1892b) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        Set keySet = linkedHashMap.keySet();
        ArrayList arrayList = new ArrayList();
        for (Object obj : keySet) {
            if (((Boolean) cVar.c((String) obj)).booleanValue()) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    public static final H e(i4.c cVar) {
        I i = new I();
        cVar.c(i);
        boolean z3 = i.f1864b;
        G g5 = i.f1863a;
        boolean z5 = i.f1865c;
        String str = i.f1867e;
        if (str != null) {
            boolean z6 = i.f;
            g5.f1852b = str;
            g5.f1851a = -1;
            g5.f1853c = z6;
        } else {
            int i5 = i.f1866d;
            boolean z7 = i.f;
            g5.f1851a = i5;
            g5.f1852b = null;
            g5.f1853c = z7;
        }
        String str2 = g5.f1852b;
        if (str2 == null) {
            return new H(z3, z5, g5.f1851a, false, g5.f1853c, g5.f1854d, g5.f1855e);
        }
        boolean z8 = g5.f1853c;
        int i6 = g5.f1854d;
        int i7 = g5.f1855e;
        int i8 = y.f1963s;
        H h3 = new H(z3, z5, "android-app://androidx.navigation/".concat(str2).hashCode(), false, z8, i6, i7);
        h3.f1862h = str2;
        return h3;
    }
}
