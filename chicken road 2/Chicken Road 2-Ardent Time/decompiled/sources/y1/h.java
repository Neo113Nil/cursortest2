package y1;

/* loaded from: classes.dex */
public abstract class h extends Q1.d {
    public static java.lang.String E(java.lang.String str) {
        java.util.List list;
        kotlin.jvm.internal.i.e(str, "<this>");
        if (y1.g.T("|")) {
            throw new java.lang.IllegalArgumentException("marginPrefix must be non-blank string.");
        }
        y1.d dVar = new y1.d(str);
        if (dVar.hasNext()) {
            java.lang.Object next = dVar.next();
            if (dVar.hasNext()) {
                java.util.ArrayList arrayList = new java.util.ArrayList();
                arrayList.add(next);
                while (dVar.hasNext()) {
                    arrayList.add(dVar.next());
                }
                list = arrayList;
            } else {
                list = u0.AbstractC0995a.q(next);
            }
        } else {
            list = i1.C0199r.f3325a;
        }
        int length = str.length();
        list.size();
        int size = list.size() - 1;
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        int i2 = 0;
        for (java.lang.Object obj : list) {
            int i3 = i2 + 1;
            java.lang.String str2 = null;
            if (i2 < 0) {
                i1.AbstractC0191j.J();
                throw null;
            }
            java.lang.String str3 = (java.lang.String) obj;
            if ((i2 != 0 && i2 != size) || !y1.g.T(str3)) {
                int length2 = str3.length();
                int i4 = 0;
                while (true) {
                    if (i4 >= length2) {
                        i4 = -1;
                        break;
                    }
                    if (!u0.AbstractC0995a.p(str3.charAt(i4))) {
                        break;
                    }
                    i4++;
                }
                if (i4 != -1 && y1.o.J(i4, str3, "|", false)) {
                    str2 = str3.substring("|".length() + i4);
                    kotlin.jvm.internal.i.d(str2, "substring(...)");
                }
                if (str2 == null) {
                    str2 = str3;
                }
            }
            if (str2 != null) {
                arrayList2.add(str2);
            }
            i2 = i3;
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder(length);
        i1.AbstractC0190i.O(arrayList2, sb, "\n", "", "", -1, "...", null);
        return sb.toString();
    }
}
