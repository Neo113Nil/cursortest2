package Sb;

import Lb.b;
import Lb.d;
import Nb.C3666a;
import Rb.a;
import java.util.Arrays;
import kotlin.collections.C7705l;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes9.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private static final byte[] f26078a;

    static {
        byte[] bArr = new byte[32];
        bArr[0] = 9;
        f26078a = bArr;
    }

    private static void a(byte[] bArr) {
        bArr[0] = (byte) (bArr[0] & 248);
        byte b11 = (byte) (bArr[31] & Byte.MAX_VALUE);
        bArr[31] = b11;
        bArr[31] = (byte) (b11 | 64);
    }

    public static byte[] b(int i11, byte[] scalar, byte[] bArr) {
        int i12 = i11 & 2;
        byte[] bArr2 = f26078a;
        byte[] point = i12 != 0 ? bArr2 : bArr;
        byte[] output = new byte[32];
        Intrinsics.checkNotNullParameter(scalar, "scalar");
        Intrinsics.checkNotNullParameter(point, "point");
        Intrinsics.checkNotNullParameter(output, "output");
        int i13 = 0;
        if (Arrays.equals(point, bArr2)) {
            byte[] bArr3 = new byte[32];
            C7705l.s(0, 0, 14, scalar, bArr3);
            a(bArr3);
            Rb.a scalar2 = a.C0495a.a(bArr3);
            Mb.a ep = new Mb.a();
            b basepoint = d.a();
            Intrinsics.checkNotNullParameter(basepoint, "basepoint");
            Intrinsics.checkNotNullParameter(scalar2, "scalar");
            basepoint.b(ep, scalar2);
            Qb.a output2 = new Qb.a(new byte[32]);
            Intrinsics.checkNotNullParameter(ep, "ep");
            Intrinsics.checkNotNullParameter(output2, "output");
            C3666a b11 = C3666a.C0371a.b(ep.d(), ep.c());
            C3666a t2 = C3666a.C0371a.l(ep.d(), ep.c());
            Intrinsics.checkNotNullParameter(t2, "t");
            C3666a.C0371a.e(t2, t2);
            b11.h(b11, t2);
            b11.n(output2.a());
            C7705l.s(0, 0, 12, output2.a(), output);
            return output;
        }
        byte[] bArr4 = new byte[32];
        C7705l.s(0, 0, 14, scalar, bArr4);
        a(bArr4);
        Rb.a scalar3 = a.C0495a.a(bArr4);
        Qb.a output3 = new Qb.a(point);
        Intrinsics.checkNotNullParameter(output3, "point");
        Intrinsics.checkNotNullParameter(scalar3, "scalar");
        Intrinsics.checkNotNullParameter(output3, "point");
        Intrinsics.checkNotNullParameter(scalar3, "scalar");
        Intrinsics.checkNotNullParameter(output3, "output");
        byte[] a11 = output3.a();
        C3666a affinePmQ = new C3666a();
        C3666a.C0371a.d(a11, 0, affinePmQ);
        Qb.b pp = new Qb.b();
        Intrinsics.checkNotNullParameter(pp, "output");
        C3666a.i(pp.b());
        C3666a.o(pp.c());
        byte[] a12 = output3.a();
        C3666a c3666a = new C3666a();
        C3666a.C0371a.d(a12, 0, c3666a);
        C3666a c3666a2 = new C3666a();
        C3666a.i(c3666a2);
        Qb.b q11 = new Qb.b(c3666a, c3666a2);
        byte[] a13 = scalar3.a();
        int i14 = 254;
        while (-1 < i14) {
            pp.a(q11, a13[i14 + 1] ^ a13[i14]);
            Intrinsics.checkNotNullParameter(pp, "p");
            Intrinsics.checkNotNullParameter(q11, "q");
            Intrinsics.checkNotNullParameter(affinePmQ, "affinePmQ");
            C3666a b12 = C3666a.C0371a.b(pp.b(), pp.c());
            C3666a l11 = C3666a.C0371a.l(pp.b(), pp.c());
            C3666a b13 = C3666a.C0371a.b(q11.b(), q11.c());
            C3666a l12 = C3666a.C0371a.l(q11.b(), q11.c());
            C3666a j11 = C3666a.C0371a.j(b12);
            C3666a j12 = C3666a.C0371a.j(l11);
            int i15 = i13;
            C3666a t11 = C3666a.C0371a.l(j11, j12);
            C3666a g10 = C3666a.C0371a.g(b12, l12);
            C3666a g11 = C3666a.C0371a.g(l11, b13);
            q11.b().a(g10, g11);
            q11.c().m(g10, g11);
            q11.b().l(q11.b());
            q11.c().l(q11.c());
            C3666a c11 = pp.c();
            c11.getClass();
            Intrinsics.checkNotNullParameter(t11, "t");
            C3666a.C0371a.h(t11, c11);
            pp.b().h(j11, j12);
            pp.c().a(pp.c(), j12);
            pp.c().h(t11, pp.c());
            q11.c().h(affinePmQ, q11.c());
            i14--;
            i13 = i15;
        }
        int i16 = i13;
        pp.a(q11, a13[i16]);
        Intrinsics.checkNotNullParameter(pp, "pp");
        Intrinsics.checkNotNullParameter(output3, "output");
        C3666a c12 = pp.c();
        C3666a c3666a3 = new C3666a();
        C3666a.C0371a.e(c12, c3666a3);
        C3666a.C0371a.g(pp.b(), c3666a3).n(output3.a());
        C7705l.s(i16, i16, 12, output3.a(), output);
        if (Tb.a.a(output, new byte[32]) != 1) {
            return output;
        }
        throw new IllegalStateException("bad input point: low order point");
    }
}
