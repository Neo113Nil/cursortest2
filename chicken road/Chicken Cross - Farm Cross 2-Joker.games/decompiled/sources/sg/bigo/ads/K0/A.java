package sg.bigo.ads.K0;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;

/* loaded from: classes3.dex */
public abstract class A {
    public static boolean a(Object[] objArr) {
        if (c(null)) {
            return (c(objArr) ? 0 : objArr.length) == 0;
        }
        throw null;
    }

    public static Object b(Object[] objArr) {
        if (c(objArr)) {
            return null;
        }
        for (Object obj : objArr) {
            if (obj != null) {
                return obj;
            }
        }
        return null;
    }

    public static boolean c(Object[] objArr) {
        return objArr == null || objArr.length == 0;
    }

    public static ArrayList a(List list, Comparable comparable) {
        if (a(list)) {
            return new ArrayList();
        }
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (comparable.compareTo(obj) > 0) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    public static boolean a(Collection collection) {
        return collection == null || collection.isEmpty();
    }

    public static boolean a(Map map) {
        return map == null || map.isEmpty();
    }
}
