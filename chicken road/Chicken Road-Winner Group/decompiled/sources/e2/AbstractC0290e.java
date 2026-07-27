package e2;

import a.AbstractC0086a;
import io.appmetrica.analytics.impl.C0640l5;
import java.util.AbstractSet;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* renamed from: e2.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0290e extends F2.b {
    public static void T(int i3, int i4, int i5, Object[] objArr, Object[] destination) {
        kotlin.jvm.internal.j.e(objArr, "<this>");
        kotlin.jvm.internal.j.e(destination, "destination");
        System.arraycopy(objArr, i4, destination, i3, i5 - i4);
    }

    public static Object[] U(Object[] objArr, int i3, int i4) {
        kotlin.jvm.internal.j.e(objArr, "<this>");
        int length = objArr.length;
        if (i4 <= length) {
            Object[] copyOfRange = Arrays.copyOfRange(objArr, i3, i4);
            kotlin.jvm.internal.j.d(copyOfRange, "copyOfRange(...)");
            return copyOfRange;
        }
        throw new IndexOutOfBoundsException("toIndex (" + i4 + ") is greater than size (" + length + ").");
    }

    public static Object V(int i3, Object[] objArr) {
        kotlin.jvm.internal.j.e(objArr, "<this>");
        if (i3 < 0 || i3 >= objArr.length) {
            return null;
        }
        return objArr[i3];
    }

    public static String W(Object[] objArr, String str, C0640l5 c0640l5) {
        kotlin.jvm.internal.j.e(objArr, "<this>");
        StringBuilder sb = new StringBuilder();
        sb.append((CharSequence) "");
        int i3 = 0;
        for (Object obj : objArr) {
            i3++;
            if (i3 > 1) {
                sb.append((CharSequence) str);
            }
            AbstractC0086a.c(sb, obj, c0640l5);
        }
        sb.append((CharSequence) "");
        return sb.toString();
    }

    public static final void X(Object[] objArr, AbstractSet abstractSet) {
        kotlin.jvm.internal.j.e(objArr, "<this>");
        for (Object obj : objArr) {
            abstractSet.add(obj);
        }
    }

    public static List Y(int[] iArr) {
        kotlin.jvm.internal.j.e(iArr, "<this>");
        int length = iArr.length;
        if (length == 0) {
            return o.f4877a;
        }
        if (length == 1) {
            return X0.a.z(Integer.valueOf(iArr[0]));
        }
        ArrayList arrayList = new ArrayList(iArr.length);
        for (int i3 : iArr) {
            arrayList.add(Integer.valueOf(i3));
        }
        return arrayList;
    }

    public static List Z(Object[] objArr) {
        kotlin.jvm.internal.j.e(objArr, "<this>");
        int length = objArr.length;
        return length != 0 ? length != 1 ? new ArrayList(new C0288c(objArr, false)) : X0.a.z(objArr[0]) : o.f4877a;
    }
}
