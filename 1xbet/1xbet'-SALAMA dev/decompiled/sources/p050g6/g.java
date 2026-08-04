package p050g6;

import Q0.a;
import Y4.D;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.NoSuchElementException;
import t6.h;

/* JADX INFO: loaded from: classes2.dex */
public abstract class g extends a {
    public static List p0(Object[] objArr) {
        h.e(objArr, "<this>");
        List listAsList = Arrays.asList(objArr);
        h.d(listAsList, "asList(...)");
        return listAsList;
    }

    public static void q0(byte[] bArr, int i7, byte[] bArr2, int i8, int i9) {
        h.e(bArr, "<this>");
        h.e(bArr2, "destination");
        System.arraycopy(bArr, i8, bArr2, i7, i9 - i8);
    }

    public static final void r0(Object[] objArr, int i7, Object[] objArr2, int i8, int i9) {
        h.e(objArr, "<this>");
        h.e(objArr2, "destination");
        System.arraycopy(objArr, i8, objArr2, i7, i9 - i8);
    }

    public static final void s0(Object[] objArr, int i7, int i8) {
        h.e(objArr, "<this>");
        Arrays.fill(objArr, i7, i8, (Object) null);
    }

    public static Object t0(Object[] objArr) {
        h.e(objArr, "<this>");
        if (objArr.length != 0) {
            return objArr[0];
        }
        throw new NoSuchElementException("Array is empty.");
    }

    public static String u0(Object[] objArr) {
        h.e(objArr, "<this>");
        StringBuilder sb = new StringBuilder();
        sb.append((CharSequence) "[");
        int i7 = 0;
        for (Object obj : objArr) {
            i7++;
            if (i7 > 1) {
                sb.append((CharSequence) ",");
            }
            a.d(sb, obj, null);
        }
        sb.append((CharSequence) "]");
        return sb.toString();
    }

    public static List v0(long[] jArr) {
        h.e(jArr, "<this>");
        int length = jArr.length;
        if (length == 0) {
            return p.f13308a;
        }
        if (length == 1) {
            return D.D(Long.valueOf(jArr[0]));
        }
        ArrayList arrayList = new ArrayList(jArr.length);
        for (long j : jArr) {
            arrayList.add(Long.valueOf(j));
        }
        return arrayList;
    }

    public static List w0(Object[] objArr) {
        h.e(objArr, "<this>");
        int length = objArr.length;
        if (length != 0) {
            return length != 1 ? new ArrayList(new e(objArr, false)) : D.D(objArr[0]);
        }
        return p.f13308a;
    }
}
