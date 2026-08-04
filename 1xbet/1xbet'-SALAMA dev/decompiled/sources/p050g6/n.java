package p050g6;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.RandomAccess;
import kotlin.jvm.functions.Function1;
import t6.h;
import t6.s;
import u6.a;
import u6.b;

/* JADX INFO: loaded from: classes2.dex */
public abstract class n extends m {
    public static void O0(Collection collection, List list) {
        h.e(collection, "<this>");
        h.e(list, "elements");
        collection.addAll(list);
    }

    public static void P0(List list, Function1 function1) {
        int iL0;
        h.e(list, "<this>");
        h.e(function1, "predicate");
        if (!(list instanceof RandomAccess)) {
            if ((list instanceof a) && !(list instanceof b)) {
                s.c(list, "kotlin.collections.MutableIterable");
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
        int iL1 = i.L0(list);
        int i7 = 0;
        if (iL1 >= 0) {
            int i8 = 0;
            while (true) {
                Object obj = list.get(i7);
                if (!((Boolean) function1.invoke(obj)).booleanValue()) {
                    if (i8 != i7) {
                        list.set(i8, obj);
                    }
                    i8++;
                }
                if (i7 == iL1) {
                    break;
                } else {
                    i7++;
                }
            }
            i7 = i8;
        }
        if (i7 >= list.size() || i7 > (iL0 = i.L0(list))) {
            return;
        }
        while (true) {
            list.remove(iL0);
            if (iL0 == i7) {
                return;
            } else {
                iL0--;
            }
        }
    }
}
