package q4;

import W5.AbstractC0486a1;
import i4.C1267d;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.regex.Pattern;
import n4.C1473g;
import n4.I;
import p6.AbstractC1539a;
import v4.r;

/* loaded from: classes2.dex */
public abstract class l {

    /* renamed from: a, reason: collision with root package name */
    public static final Pattern f15866a = Pattern.compile("[\\[\\]\\.#$]");

    /* renamed from: b, reason: collision with root package name */
    public static final Pattern f15867b = Pattern.compile("[\\[\\]\\.#\\$\\/\\u0000-\\u001F\\u007F]");

    public static TreeMap a(C1473g c1473g, Map map) {
        TreeMap treeMap = new TreeMap();
        for (Map.Entry entry : map.entrySet()) {
            C1473g c1473g2 = new C1473g((String) entry.getKey());
            Object value = entry.getValue();
            new I(c1473g.m(c1473g2)).g(value);
            String str = !c1473g2.isEmpty() ? c1473g2.A().f17173a : "";
            if (str.equals(".sv") || str.equals(".value")) {
                throw new C1267d("Path '" + c1473g2 + "' contains disallowed child name: " + str);
            }
            r k7 = str.equals(".priority") ? p6.c.k(c1473g2, value) : AbstractC1539a.a(value, v4.j.f17184e);
            e(value);
            treeMap.put(c1473g2, k7);
        }
        C1473g c1473g3 = null;
        for (C1473g c1473g4 : treeMap.keySet()) {
            k.c(c1473g3 == null || c1473g3.compareTo(c1473g4) < 0);
            if (c1473g3 != null && c1473g3.z(c1473g4)) {
                throw new C1267d("Path '" + c1473g3 + "' is an ancestor of '" + c1473g4 + "' in an update.");
            }
            c1473g3 = c1473g4;
        }
        return treeMap;
    }

    public static void b(String str) {
        if (str != null && !str.equals(".info") && f15867b.matcher(str).find() && !str.equals("[MAX_KEY]") && !str.equals("[MIN_NAME]")) {
            throw new C1267d(AbstractC0486a1.h("Invalid key: ", str, ". Keys must not contain '/', '.', '#', '$', '[', or ']'"));
        }
    }

    public static void c(String str) {
        if (f15866a.matcher(str).find()) {
            throw new C1267d(AbstractC0486a1.h("Invalid Firebase Database path: ", str, ". Firebase Database paths must not contain '.', '#', '$', '[', or ']'"));
        }
    }

    public static void d(String str) {
        if (str.startsWith(".info")) {
            c(str.substring(5));
        } else if (str.startsWith("/.info")) {
            c(str.substring(6));
        } else {
            c(str);
        }
    }

    public static void e(Object obj) {
        if (!(obj instanceof Map)) {
            if (obj instanceof List) {
                Iterator it = ((List) obj).iterator();
                while (it.hasNext()) {
                    e(it.next());
                }
                return;
            } else {
                if ((obj instanceof Double) || (obj instanceof Float)) {
                    double doubleValue = ((Double) obj).doubleValue();
                    if (Double.isInfinite(doubleValue) || Double.isNaN(doubleValue)) {
                        throw new C1267d("Invalid value: Value cannot be NaN, Inf or -Inf.");
                    }
                    return;
                }
                return;
            }
        }
        Map map = (Map) obj;
        if (map.containsKey(".sv")) {
            return;
        }
        for (Map.Entry entry : map.entrySet()) {
            String str = (String) entry.getKey();
            if (str == null || str.length() <= 0 || !(str.equals(".value") || str.equals(".priority") || (!str.startsWith(".") && !f15867b.matcher(str).find()))) {
                throw new C1267d(AbstractC0486a1.h("Invalid key: ", str, ". Keys must not contain '/', '.', '#', '$', '[', or ']'"));
            }
            e(entry.getValue());
        }
    }

    public static void f(C1473g c1473g) {
        v4.c B7 = c1473g.B();
        if (B7 == null || !B7.f17173a.startsWith(".")) {
            return;
        }
        throw new C1267d("Invalid write location: " + c1473g.toString());
    }
}
