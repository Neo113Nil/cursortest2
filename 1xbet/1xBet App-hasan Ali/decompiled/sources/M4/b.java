package M4;

import H3.l;
import L4.C;
import L4.C0226i;
import L4.F;
import L4.z;
import X3.m;
import a.AbstractC0444a;
import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.s;
import kotlin.jvm.internal.v;
import kotlin.jvm.internal.w;
import n.AbstractC2107A;
import o4.AbstractC2227e;
import o4.AbstractC2234l;

/* loaded from: classes.dex */
public abstract class b {

    /* renamed from: a, reason: collision with root package name */
    public static final char[] f3620a = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};

    public static final int a(char c5) {
        if ('0' <= c5 && c5 < ':') {
            return c5 - '0';
        }
        if ('a' <= c5 && c5 < 'g') {
            return c5 - 'W';
        }
        if ('A' <= c5 && c5 < 'G') {
            return c5 - '7';
        }
        throw new IllegalArgumentException("Unexpected hex digit: " + c5);
    }

    public static final LinkedHashMap b(ArrayList arrayList) {
        String str = z.f3126l;
        z s2 = j3.i.s("/");
        W3.h[] hVarArr = {new W3.h(s2, new g(s2, true, null, 0L, 0L, 0L, 0, 0L, 0, 0, null, null, null, 65532))};
        LinkedHashMap linkedHashMap = new LinkedHashMap(X3.z.R(1));
        X3.z.S(linkedHashMap, hVarArr);
        for (g gVar : m.k0(arrayList, new l(1))) {
            if (((g) linkedHashMap.put(gVar.f3635a, gVar)) == null) {
                while (true) {
                    z zVar = gVar.f3635a;
                    z b3 = zVar.b();
                    if (b3 != null) {
                        g gVar2 = (g) linkedHashMap.get(b3);
                        if (gVar2 != null) {
                            gVar2.f3649q.add(zVar);
                            break;
                        }
                        g gVar3 = new g(b3, true, null, 0L, 0L, 0L, 0, 0L, 0, 0, null, null, null, 65532);
                        linkedHashMap.put(b3, gVar3);
                        gVar3.f3649q.add(zVar);
                        gVar = gVar3;
                    }
                }
            }
        }
        return linkedHashMap;
    }

    public static final String c(int i) {
        AbstractC0444a.k(16);
        String num = Integer.toString(i, 16);
        kotlin.jvm.internal.l.e("toString(...)", num);
        return "0x".concat(num);
    }

    public static final g d(C c5) {
        int k5 = c5.k();
        if (k5 != 33639248) {
            throw new IOException("bad zip: expected " + c(33639248) + " but was " + c(k5));
        }
        c5.t(4L);
        short n5 = c5.n();
        int i = n5 & 65535;
        if ((n5 & 1) != 0) {
            throw new IOException("unsupported zip: general purpose bit flag=" + c(i));
        }
        int n6 = c5.n() & 65535;
        int n7 = c5.n() & 65535;
        int n8 = c5.n() & 65535;
        long k6 = c5.k() & 4294967295L;
        v vVar = new v();
        vVar.f17623k = c5.k() & 4294967295L;
        v vVar2 = new v();
        vVar2.f17623k = c5.k() & 4294967295L;
        int n9 = c5.n() & 65535;
        int n10 = c5.n() & 65535;
        int n11 = 65535 & c5.n();
        c5.t(8L);
        v vVar3 = new v();
        vVar3.f17623k = c5.k() & 4294967295L;
        String p5 = c5.p(n9);
        if (AbstractC2227e.A0(p5, (char) 0)) {
            throw new IOException("bad zip: filename contains 0x00");
        }
        long j5 = vVar2.f17623k == 4294967295L ? 8 : 0L;
        if (vVar.f17623k == 4294967295L) {
            j5 += 8;
        }
        if (vVar3.f17623k == 4294967295L) {
            j5 += 8;
        }
        w wVar = new w();
        w wVar2 = new w();
        w wVar3 = new w();
        s sVar = new s();
        e(c5, n10, new i(sVar, j5, vVar2, c5, vVar, vVar3, wVar, wVar2, wVar3));
        if (j5 > 0 && !sVar.f17620k) {
            throw new IOException("bad zip: zip64 extra required but absent");
        }
        String p6 = c5.p(n11);
        String str = z.f3126l;
        return new g(j3.i.s("/").d(p5), AbstractC2234l.r0(p5, "/", false), p6, k6, vVar.f17623k, vVar2.f17623k, n6, vVar3.f17623k, n8, n7, (Long) wVar.f17624k, (Long) wVar2.f17624k, (Long) wVar3.f17624k, 57344);
    }

    public static final void e(C c5, int i, i4.e eVar) {
        long j5 = i;
        while (j5 != 0) {
            if (j5 < 4) {
                throw new IOException("bad zip: truncated header in extra field");
            }
            int n5 = c5.n() & 65535;
            long n6 = c5.n() & 65535;
            long j6 = j5 - 4;
            if (j6 < n6) {
                throw new IOException("bad zip: truncated value in extra field");
            }
            c5.s(n6);
            C0226i c0226i = c5.f3051l;
            long j7 = c0226i.f3091l;
            eVar.invoke(Integer.valueOf(n5), Long.valueOf(n6));
            long j8 = (c0226i.f3091l + n6) - j7;
            if (j8 < 0) {
                throw new IOException(AbstractC2107A.q("unsupported zip: too many bytes processed for ", n5));
            }
            if (j8 > 0) {
                c0226i.J(j8);
            }
            j5 = j6 - n6;
        }
    }

    public static final g f(C c5, g gVar) {
        int k5 = c5.k();
        if (k5 != 67324752) {
            throw new IOException("bad zip: expected " + c(67324752) + " but was " + c(k5));
        }
        c5.t(2L);
        short n5 = c5.n();
        int i = n5 & 65535;
        if ((n5 & 1) != 0) {
            throw new IOException("unsupported zip: general purpose bit flag=" + c(i));
        }
        c5.t(18L);
        int n6 = c5.n() & 65535;
        c5.t(c5.n() & 65535);
        if (gVar == null) {
            c5.t(n6);
            return null;
        }
        w wVar = new w();
        w wVar2 = new w();
        w wVar3 = new w();
        e(c5, n6, new h(c5, wVar, wVar2, wVar3));
        return new g(gVar.f3635a, gVar.f3636b, gVar.f3637c, gVar.f3638d, gVar.f3639e, gVar.f, gVar.f3640g, gVar.f3641h, gVar.i, gVar.f3642j, gVar.f3643k, gVar.f3644l, gVar.f3645m, (Integer) wVar.f17624k, (Integer) wVar2.f17624k, (Integer) wVar3.f17624k);
    }

    public static final int g(F f, int i) {
        int i5;
        kotlin.jvm.internal.l.f("<this>", f);
        int i6 = i + 1;
        int length = f.f3062o.length;
        int[] iArr = f.f3063p;
        kotlin.jvm.internal.l.f("<this>", iArr);
        int i7 = length - 1;
        int i8 = 0;
        while (true) {
            if (i8 <= i7) {
                i5 = (i8 + i7) >>> 1;
                int i9 = iArr[i5];
                if (i9 >= i6) {
                    if (i9 <= i6) {
                        break;
                    }
                    i7 = i5 - 1;
                } else {
                    i8 = i5 + 1;
                }
            } else {
                i5 = (-i8) - 1;
                break;
            }
        }
        return i5 >= 0 ? i5 : ~i5;
    }
}
