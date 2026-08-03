package i1;

/* renamed from: i1.h, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0189h extends a.AbstractC0059a {
    public static java.util.List J(java.lang.Object[] objArr) {
        kotlin.jvm.internal.i.e(objArr, "<this>");
        java.util.List asList = java.util.Arrays.asList(objArr);
        kotlin.jvm.internal.i.d(asList, "asList(...)");
        return asList;
    }

    public static void K(int i2, int i3, int i4, byte[] bArr, byte[] destination) {
        kotlin.jvm.internal.i.e(bArr, "<this>");
        kotlin.jvm.internal.i.e(destination, "destination");
        java.lang.System.arraycopy(bArr, i3, destination, i2, i4 - i3);
    }

    public static final void L(java.lang.Object[] objArr, java.lang.Object[] destination, int i2, int i3, int i4) {
        kotlin.jvm.internal.i.e(objArr, "<this>");
        kotlin.jvm.internal.i.e(destination, "destination");
        java.lang.System.arraycopy(objArr, i3, destination, i2, i4 - i3);
    }

    public static byte[] M(byte[] bArr, int i2, int i3) {
        kotlin.jvm.internal.i.e(bArr, "<this>");
        int length = bArr.length;
        if (i3 <= length) {
            byte[] copyOfRange = java.util.Arrays.copyOfRange(bArr, i2, i3);
            kotlin.jvm.internal.i.d(copyOfRange, "copyOfRange(...)");
            return copyOfRange;
        }
        throw new java.lang.IndexOutOfBoundsException("toIndex (" + i3 + ") is greater than size (" + length + ").");
    }

    public static void N(java.lang.Object[] objArr, int i2, int i3) {
        kotlin.jvm.internal.i.e(objArr, "<this>");
        java.util.Arrays.fill(objArr, i2, i3, (java.lang.Object) null);
    }

    public static java.lang.Object O(int i2, java.lang.Object[] objArr) {
        kotlin.jvm.internal.i.e(objArr, "<this>");
        if (i2 < 0 || i2 >= objArr.length) {
            return null;
        }
        return objArr[i2];
    }

    public static java.lang.String P(java.lang.Object[] objArr, java.lang.CharSequence separator, java.lang.CharSequence prefix, java.lang.CharSequence postfix, int i2, java.lang.CharSequence truncated, s1.l lVar) {
        kotlin.jvm.internal.i.e(objArr, "<this>");
        kotlin.jvm.internal.i.e(separator, "separator");
        kotlin.jvm.internal.i.e(prefix, "prefix");
        kotlin.jvm.internal.i.e(postfix, "postfix");
        kotlin.jvm.internal.i.e(truncated, "truncated");
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(prefix);
        int i3 = 0;
        for (java.lang.Object obj : objArr) {
            i3++;
            if (i3 > 1) {
                sb.append(separator);
            }
            if (i2 >= 0 && i3 > i2) {
                break;
            }
            Q1.d.c(sb, obj, lVar);
        }
        if (i2 >= 0 && i3 > i2) {
            sb.append(truncated);
        }
        sb.append(postfix);
        return sb.toString();
    }

    public static final void Q(java.lang.Object[] objArr, java.util.AbstractSet abstractSet) {
        kotlin.jvm.internal.i.e(objArr, "<this>");
        for (java.lang.Object obj : objArr) {
            abstractSet.add(obj);
        }
    }

    public static java.util.List R(int[] iArr) {
        kotlin.jvm.internal.i.e(iArr, "<this>");
        int length = iArr.length;
        if (length == 0) {
            return i1.C0199r.f3325a;
        }
        if (length == 1) {
            return u0.AbstractC0995a.q(java.lang.Integer.valueOf(iArr[0]));
        }
        java.util.ArrayList arrayList = new java.util.ArrayList(iArr.length);
        for (int i2 : iArr) {
            arrayList.add(java.lang.Integer.valueOf(i2));
        }
        return arrayList;
    }

    public static java.util.List S(java.lang.Object[] objArr) {
        kotlin.jvm.internal.i.e(objArr, "<this>");
        int length = objArr.length;
        return length != 0 ? length != 1 ? new java.util.ArrayList(new i1.C0187f(objArr, false)) : u0.AbstractC0995a.q(objArr[0]) : i1.C0199r.f3325a;
    }
}
