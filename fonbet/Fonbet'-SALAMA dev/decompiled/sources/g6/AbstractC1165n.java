package g6;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.RandomAccess;
import kotlin.jvm.functions.Function1;

/* renamed from: g6.n, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC1165n extends AbstractC1164m {
    public static void O0(Collection collection, List list) {
        t6.h.e(collection, "<this>");
        t6.h.e(list, "elements");
        collection.addAll(list);
    }

    public static void P0(List list, Function1 function1) {
        int L02;
        t6.h.e(list, "<this>");
        t6.h.e(function1, "predicate");
        if (!(list instanceof RandomAccess)) {
            if ((list instanceof u6.a) && !(list instanceof u6.b)) {
                t6.s.c(list, "kotlin.collections.MutableIterable");
                throw null;
            }
            Iterator it = list.iterator();
            while (it.hasNext()) {
                if (((Boolean) function1.invoke(it.next())).booleanValue()) {
                    it.remove();
                }
            }
            return;
        }
        int L03 = AbstractC1160i.L0(list);
        int i7 = 0;
        if (L03 >= 0) {
            int i8 = 0;
            while (true) {
                Object obj = list.get(i7);
                if (!((Boolean) function1.invoke(obj)).booleanValue()) {
                    if (i8 != i7) {
                        list.set(i8, obj);
                    }
                    i8++;
                }
                if (i7 == L03) {
                    break;
                } else {
                    i7++;
                }
            }
            i7 = i8;
        }
        if (i7 >= list.size() || i7 > (L02 = AbstractC1160i.L0(list))) {
            return;
        }
        while (true) {
            list.remove(L02);
            if (L02 == i7) {
                return;
            } else {
                L02--;
            }
        }
    }
}
