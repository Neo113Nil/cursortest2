package L4;

import B4.H;
import B4.I;
import U5.l0;
import U5.m0;
import com.google.protobuf.AbstractC0911k;
import java.security.SecureRandom;
import java.util.Comparator;
import java.util.Iterator;

/* loaded from: classes2.dex */
public abstract class r {

    /* renamed from: a, reason: collision with root package name */
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
        int min = Math.min(bArr.length, bArr2.length);
        for (int i7 = 0; i7 < min; i7++) {
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

    public static int c(AbstractC0911k abstractC0911k, AbstractC0911k abstractC0911k2) {
        int min = Math.min(abstractC0911k.size(), abstractC0911k2.size());
        for (int i7 = 0; i7 < min; i7++) {
            int t7 = abstractC0911k.t(i7) & 255;
            int t8 = abstractC0911k2.t(i7) & 255;
            if (t7 < t8) {
                return -1;
            }
            if (t7 > t8) {
                return 1;
            }
        }
        return d(abstractC0911k.size(), abstractC0911k2.size());
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
        int compare = Long.compare((long) d7, j);
        return compare != 0 ? compare : p3.f.H(d7, j);
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x0020, code lost:
    
        if (r0 != null) goto L19;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void f(Iterator it, Iterator it2, Comparator comparator, h hVar, h hVar2) {
        Object a2 = a(it);
        Object a4 = a(it2);
        while (true) {
            if (a2 == null && a4 == null) {
                return;
            }
            boolean z4 = false;
            boolean z7 = true;
            if (a2 != null && a4 != null) {
                int compare = comparator.compare(a2, a4);
                if (compare >= 0) {
                    if (compare <= 0) {
                        z7 = false;
                    }
                    z7 = false;
                    z4 = true;
                }
                if (z4) {
                    hVar.accept(a4);
                    a4 = a(it2);
                } else if (z7) {
                    hVar2.accept(a2);
                    a2 = a(it);
                } else {
                    a2 = a(it);
                    a4 = a(it2);
                }
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

    public static String i(AbstractC0911k abstractC0911k) {
        int size = abstractC0911k.size();
        StringBuilder sb = new StringBuilder(size * 2);
        for (int i7 = 0; i7 < size; i7++) {
            byte t7 = abstractC0911k.t(i7);
            sb.append(Character.forDigit((t7 & 255) >>> 4, 16));
            sb.append(Character.forDigit(t7 & 15, 16));
        }
        return sb.toString();
    }
}
