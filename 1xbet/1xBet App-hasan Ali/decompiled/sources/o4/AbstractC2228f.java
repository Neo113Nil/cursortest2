package o4;

import X3.m;
import X3.n;
import X3.o;
import X3.v;
import a.AbstractC0444a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import k4.AbstractC2036a;
import r0.AbstractC2346c;

/* renamed from: o4.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC2228f extends AbstractC2036a {
    public static String o0(String str) {
        List list;
        Comparable comparable;
        String str2;
        kotlin.jvm.internal.l.f("<this>", str);
        C2225c c2225c = new C2225c(str);
        if (c2225c.hasNext()) {
            Object next = c2225c.next();
            if (c2225c.hasNext()) {
                ArrayList arrayList = new ArrayList();
                arrayList.add(next);
                while (c2225c.hasNext()) {
                    arrayList.add(c2225c.next());
                }
                list = arrayList;
            } else {
                list = AbstractC2346c.A(next);
            }
        } else {
            list = v.f6090k;
        }
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : list) {
            if (!AbstractC2227e.H0((String) obj)) {
                arrayList2.add(obj);
            }
        }
        ArrayList arrayList3 = new ArrayList(o.S(arrayList2, 10));
        int size = arrayList2.size();
        int i = 0;
        int i5 = 0;
        while (i5 < size) {
            Object obj2 = arrayList2.get(i5);
            i5++;
            String str3 = (String) obj2;
            int length = str3.length();
            int i6 = 0;
            while (true) {
                if (i6 >= length) {
                    i6 = -1;
                    break;
                }
                if (!AbstractC0444a.S(str3.charAt(i6))) {
                    break;
                }
                i6++;
            }
            if (i6 == -1) {
                i6 = str3.length();
            }
            arrayList3.add(Integer.valueOf(i6));
        }
        Iterator it = arrayList3.iterator();
        if (it.hasNext()) {
            comparable = (Comparable) it.next();
            while (it.hasNext()) {
                Comparable comparable2 = (Comparable) it.next();
                if (comparable.compareTo(comparable2) > 0) {
                    comparable = comparable2;
                }
            }
        } else {
            comparable = null;
        }
        Integer num = (Integer) comparable;
        int intValue = num != null ? num.intValue() : 0;
        int length2 = str.length();
        list.size();
        int N5 = n.N(list);
        ArrayList arrayList4 = new ArrayList();
        for (Object obj3 : list) {
            int i7 = i + 1;
            if (i < 0) {
                n.R();
                throw null;
            }
            String str4 = (String) obj3;
            if ((i == 0 || i == N5) && AbstractC2227e.H0(str4)) {
                str2 = null;
            } else {
                kotlin.jvm.internal.l.f("<this>", str4);
                if (intValue < 0) {
                    throw new IllegalArgumentException(L1.a.l(intValue, "Requested character count ", " is less than zero.").toString());
                }
                int length3 = str4.length();
                if (intValue <= length3) {
                    length3 = intValue;
                }
                str2 = str4.substring(length3);
                kotlin.jvm.internal.l.e("substring(...)", str2);
            }
            if (str2 != null) {
                arrayList4.add(str2);
            }
            i = i7;
        }
        StringBuilder sb = new StringBuilder(length2);
        m.c0(arrayList4, sb, null, 124);
        return sb.toString();
    }

    public static String p0(String str) {
        List list;
        kotlin.jvm.internal.l.f("<this>", str);
        if (AbstractC2227e.H0("|")) {
            throw new IllegalArgumentException("marginPrefix must be non-blank string.");
        }
        C2225c c2225c = new C2225c(str);
        if (c2225c.hasNext()) {
            Object next = c2225c.next();
            if (c2225c.hasNext()) {
                ArrayList arrayList = new ArrayList();
                arrayList.add(next);
                while (c2225c.hasNext()) {
                    arrayList.add(c2225c.next());
                }
                list = arrayList;
            } else {
                list = AbstractC2346c.A(next);
            }
        } else {
            list = v.f6090k;
        }
        int length = str.length();
        list.size();
        int N5 = n.N(list);
        ArrayList arrayList2 = new ArrayList();
        Iterator it = list.iterator();
        int i = 0;
        while (true) {
            String str2 = null;
            if (!it.hasNext()) {
                StringBuilder sb = new StringBuilder(length);
                m.c0(arrayList2, sb, null, 124);
                return sb.toString();
            }
            Object next2 = it.next();
            int i5 = i + 1;
            if (i < 0) {
                n.R();
                throw null;
            }
            String str3 = (String) next2;
            if ((i != 0 && i != N5) || !AbstractC2227e.H0(str3)) {
                int length2 = str3.length();
                int i6 = 0;
                while (true) {
                    if (i6 >= length2) {
                        i6 = -1;
                        break;
                    }
                    if (!AbstractC0444a.S(str3.charAt(i6))) {
                        break;
                    }
                    i6++;
                }
                if (i6 != -1 && AbstractC2234l.w0(str3, i6, "|", false)) {
                    str2 = str3.substring("|".length() + i6);
                    kotlin.jvm.internal.l.e("substring(...)", str2);
                }
                if (str2 == null) {
                    str2 = str3;
                }
            }
            if (str2 != null) {
                arrayList2.add(str2);
            }
            i = i5;
        }
    }
}
