package p120q4;

import W5.AbstractC0486a1;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.regex.Pattern;
import p063i4.d;
import p098n4.C0934g;
import p098n4.I;
import p115p6.a;
import p115p6.c;
import v4.j;
import v4.r;

/* JADX INFO: loaded from: classes2.dex */
public abstract class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Pattern f15872a = Pattern.compile("[\\[\\]\\.#$]");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Pattern f15873b = Pattern.compile("[\\[\\]\\.#\\$\\/\\u0000-\\u001F\\u007F]");

    public static TreeMap a(C0934g c0934g, Map map) {
        TreeMap treeMap = new TreeMap();
        for (Map.Entry entry : map.entrySet()) {
            C0934g c0934g2 = new C0934g((String) entry.getKey());
            Object value = entry.getValue();
            new I(c0934g.m(c0934g2)).g(value);
            String str = !c0934g2.isEmpty() ? c0934g2.A().f17179a : "";
            if (str.equals(".sv") || str.equals(".value")) {
                throw new d("Path '" + c0934g2 + "' contains disallowed child name: " + str);
            }
            r rVarK = str.equals(".priority") ? c.k(c0934g2, value) : a.a(value, j.f17190e);
            e(value);
            treeMap.put(c0934g2, rVarK);
        }
        C0934g c0934g3 = null;
        for (C0934g c0934g4 : treeMap.keySet()) {
            k.c(c0934g3 == null || c0934g3.compareTo(c0934g4) < 0);
            if (c0934g3 != null && c0934g3.z(c0934g4)) {
                throw new d("Path '" + c0934g3 + "' is an ancestor of '" + c0934g4 + "' in an update.");
            }
            c0934g3 = c0934g4;
        }
        return treeMap;
    }

    public static void b(String str) {
        if (str != null && !str.equals(".info") && f15873b.matcher(str).find() && !str.equals("[MAX_KEY]") && !str.equals("[MIN_NAME]")) {
            throw new d(AbstractC0486a1.h("Invalid key: ", str, ". Keys must not contain '/', '.', '#', '$', '[', or ']'"));
        }
    }

    public static void c(String str) {
        if (f15872a.matcher(str).find()) {
            throw new d(AbstractC0486a1.h("Invalid Firebase Database path: ", str, ". Firebase Database paths must not contain '.', '#', '$', '[', or ']'"));
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
                    double dDoubleValue = ((Double) obj).doubleValue();
                    if (Double.isInfinite(dDoubleValue) || Double.isNaN(dDoubleValue)) {
                        throw new d("Invalid value: Value cannot be NaN, Inf or -Inf.");
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
            if (str == null || str.length() <= 0 || !(str.equals(".value") || str.equals(".priority") || (!str.startsWith(".") && !f15873b.matcher(str).find()))) {
                throw new d(AbstractC0486a1.h("Invalid key: ", str, ". Keys must not contain '/', '.', '#', '$', '[', or ']'"));
            }
            e(entry.getValue());
        }
    }

    public static void f(C0934g c0934g) {
        v4.c cVarB = c0934g.B();
        if (cVarB == null || !cVarB.f17179a.startsWith(".")) {
            return;
        }
        throw new d("Invalid write location: " + c0934g.toString());
    }
}
