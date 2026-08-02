package g6;

import Y4.D;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.NoSuchElementException;

/* renamed from: g6.g, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC1158g extends Q0.a {
    public static List p0(Object[] objArr) {
        t6.h.e(objArr, "<this>");
        List asList = Arrays.asList(objArr);
        t6.h.d(asList, "asList(...)");
        return asList;
    }

    public static void q0(byte[] bArr, int i7, byte[] bArr2, int i8, int i9) {
        t6.h.e(bArr, "<this>");
        t6.h.e(bArr2, "destination");
        System.arraycopy(bArr, i8, bArr2, i7, i9 - i8);
    }

    public static final void r0(Object[] objArr, int i7, Object[] objArr2, int i8, int i9) {
        t6.h.e(objArr, "<this>");
        t6.h.e(objArr2, "destination");
        System.arraycopy(objArr, i8, objArr2, i7, i9 - i8);
    }

    public static final void s0(Object[] objArr, int i7, int i8) {
        t6.h.e(objArr, "<this>");
        Arrays.fill(objArr, i7, i8, (Object) null);
    }

    public static Object t0(Object[] objArr) {
        t6.h.e(objArr, "<this>");
        if (objArr.length != 0) {
            return objArr[0];
        }
        throw new NoSuchElementException("Array is empty.");
    }

    public static String u0(Object[] objArr) {
        t6.h.e(objArr, "<this>");
        StringBuilder sb = new StringBuilder();
        sb.append((CharSequence) "[");
        int i7 = 0;
        for (Object obj : objArr) {
            i7++;
            if (i7 > 1) {
                sb.append((CharSequence) ",");
            }
            Q0.a.d(sb, obj, null);
        }
        sb.append((CharSequence) "]");
        return sb.toString();
    }

    public static List v0(long[] jArr) {
        t6.h.e(jArr, "<this>");
        int length = jArr.length;
        if (length == 0) {
            return C1167p.f13302a;
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
        t6.h.e(objArr, "<this>");
        int length = objArr.length;
        return length != 0 ? length != 1 ? new ArrayList(new C1156e(objArr, false)) : D.D(objArr[0]) : C1167p.f13302a;
    }
}
