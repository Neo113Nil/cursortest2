package L4;

import B4.H;
import B4.I;
import U5.l0;
import U5.m0;
import com.google.protobuf.AbstractC0867k;
import java.security.SecureRandom;
import java.util.Comparator;
import java.util.Iterator;

/* JADX INFO: loaded from: classes2.dex */
public abstract class r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final H5.k f4389a;

    static {
        new SecureRandom();
        f4389a = new H5.k(8);
    }

    public static Object a(Iterator it) {
        if (it.hasNext()) {
            return it.next();
        }
        return null;
    }

    public static int b(byte[] bArr, byte[] bArr2) {
        int iMin = Math.min(bArr.length, bArr2.length);
        for (int i7 = 0; i7 < iMin; i7++) {
            int i8 = bArr[i7] & 255;
            int i9 = bArr2[i7] & 255;
            if (i8 < i9) {
                return -1;
            }
            if (i8 > i9) {
                return 1;
            }
        }
        return d(bArr.length, bArr2.length);
    }

    public static int c(AbstractC0867k abstractC0867k, AbstractC0867k abstractC0867k2) {
        int iMin = Math.min(abstractC0867k.size(), abstractC0867k2.size());
        for (int i7 = 0; i7 < iMin; i7++) {
            int iT = abstractC0867k.t(i7) & 255;
            int iT2 = abstractC0867k2.t(i7) & 255;
            if (iT < iT2) {
                return -1;
            }
            if (iT > iT2) {
                return 1;
            }
        }
        return d(abstractC0867k.size(), abstractC0867k2.size());
    }

    public static int d(int i7, int i8) {
        if (i7 < i8) {
            return -1;
        }
        return i7 > i8 ? 1 : 0;
    }

    public static int e(double d7, long j) {
        if (Double.isNaN(d7) || d7 < -9.223372036854776E18d) {
            return -1;
        }
        if (d7 >= 9.223372036854776E18d) {
            return 1;
        }
        int iCompare = Long.compare((long) d7, j);
        return iCompare != 0 ? iCompare : p113p3.f.H(d7, j);
    }

    /* JADX WARN: Code duplicated, block: B:18:0x0023  */
    public static void f(Iterator it, Iterator it2, Comparator comparator, h hVar, h hVar2) {
        Object objA = a(it);
        Object objA2 = a(it2);
        while (true) {
            if (objA == null && objA2 == null) {
                return;
            }
            boolean z4 = false;
            boolean z7 = true;
            if (objA != null && objA2 != null) {
                int iCompare = comparator.compare(objA, objA2);
                if (iCompare >= 0) {
                    if (iCompare > 0) {
                        z7 = false;
                        z4 = true;
                    } else {
                        z7 = false;
                    }
                }
            } else if (objA == null) {
                z7 = false;
                z4 = true;
            }
            if (z4) {
                hVar.accept(objA2);
                objA2 = a(it2);
            } else if (z7) {
                hVar2.accept(objA);
                objA = a(it);
            } else {
                objA = a(it);
                objA2 = a(it2);
            }
        }
    }

    public static I g(l0 l0Var) {
        l0Var.getClass();
        m0 m0Var = new m0(l0Var);
        return new I(m0Var.getMessage(), (H) H.f1087D.get(l0Var.f6547a.f6531a, H.UNKNOWN), m0Var);
    }

    public static StringBuilder h(String str, CharSequence charSequence, int i7) {
        StringBuilder sb = new StringBuilder();
        if (i7 != 0) {
            sb.append(charSequence);
            for (int i8 = 1; i8 < i7; i8++) {
                sb.append((CharSequence) str);
                sb.append(charSequence);
            }
        }
        return sb;
    }

    public static String i(AbstractC0867k abstractC0867k) {
        int size = abstractC0867k.size();
        StringBuilder sb = new StringBuilder(size * 2);
        for (int i7 = 0; i7 < size; i7++) {
            byte bT = abstractC0867k.t(i7);
            sb.append(Character.forDigit((bT & 255) >>> 4, 16));
            sb.append(Character.forDigit(bT & 15, 16));
        }
        return sb.toString();
    }
}
