package L0;

import a.AbstractC0009a;
import java.util.AbstractSet;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public abstract class c extends AbstractC0009a {
    public static final void L(Object[] objArr, Object[] destination, int i2, int i3, int i4) {
        kotlin.jvm.internal.j.e(objArr, "<this>");
        kotlin.jvm.internal.j.e(destination, "destination");
        System.arraycopy(objArr, i3, destination, i2, i4 - i3);
    }

    public static Object M(Object[] objArr, int i2) {
        kotlin.jvm.internal.j.e(objArr, "<this>");
        if (i2 < 0 || i2 >= objArr.length) {
            return null;
        }
        return objArr[i2];
    }

    public static String N(Object[] objArr, CharSequence separator, CharSequence prefix, CharSequence postfix, int i2, CharSequence truncated, U0.l lVar) {
        kotlin.jvm.internal.j.e(objArr, "<this>");
        kotlin.jvm.internal.j.e(separator, "separator");
        kotlin.jvm.internal.j.e(prefix, "prefix");
        kotlin.jvm.internal.j.e(postfix, "postfix");
        kotlin.jvm.internal.j.e(truncated, "truncated");
        StringBuilder sb = new StringBuilder();
        sb.append(prefix);
        int i3 = 0;
        for (Object obj : objArr) {
            i3++;
            if (i3 > 1) {
                sb.append(separator);
            }
            if (i2 >= 0 && i3 > i2) {
                break;
            }
            V.a.b(sb, obj, lVar);
        }
        if (i2 >= 0 && i3 > i2) {
            sb.append(truncated);
        }
        sb.append(postfix);
        return sb.toString();
    }

    public static final void O(Object[] objArr, AbstractSet abstractSet) {
        kotlin.jvm.internal.j.e(objArr, "<this>");
        for (Object obj : objArr) {
            abstractSet.add(obj);
        }
    }

    public static List P(int[] iArr) {
        kotlin.jvm.internal.j.e(iArr, "<this>");
        int length = iArr.length;
        if (length == 0) {
            return l.f214a;
        }
        if (length == 1) {
            return V.a.p(Integer.valueOf(iArr[0]));
        }
        ArrayList arrayList = new ArrayList(iArr.length);
        for (int i2 : iArr) {
            arrayList.add(Integer.valueOf(i2));
        }
        return arrayList;
    }

    public static List Q(Object[] objArr) {
        kotlin.jvm.internal.j.e(objArr, "<this>");
        int length = objArr.length;
        return length != 0 ? length != 1 ? new ArrayList(new a(objArr, false)) : V.a.p(objArr[0]) : l.f214a;
    }
}
