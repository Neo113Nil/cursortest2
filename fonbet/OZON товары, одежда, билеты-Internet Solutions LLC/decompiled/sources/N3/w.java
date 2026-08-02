package N3;

import N3.y;
import b4.C5531g;
import com.google.common.collect.AbstractC5880y;
import java.io.IOException;
import java.util.Arrays;
import m3.C8049B;
import m3.C8050C;

/* loaded from: classes8.dex */
public final class w {

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public y f18650a;

        public a(y yVar) {
            this.f18650a = yVar;
        }
    }

    public static boolean a(C3659j c3659j) throws IOException {
        C8050C c8050c = new C8050C(4);
        c3659j.d(c8050c.e(), 0, 4, false);
        return c8050c.G() == 1716281667;
    }

    public static int b(C3659j c3659j) throws IOException {
        c3659j.e();
        C8050C c8050c = new C8050C(2);
        c3659j.d(c8050c.e(), 0, 2, false);
        int L11 = c8050c.L();
        if ((L11 >> 2) == 16382) {
            c3659j.e();
            return L11;
        }
        c3659j.e();
        throw j3.v.a(null, "First frame does not start with sync code.");
    }

    public static j3.t c(C3659j c3659j, boolean z11) throws IOException {
        j3.t a11 = new D().a(c3659j, z11 ? null : C5531g.f55507b);
        if (a11 == null || a11.e() == 0) {
            return null;
        }
        return a11;
    }

    public static j3.t d(C3659j c3659j, boolean z11) throws IOException {
        c3659j.e();
        long f7 = c3659j.f();
        j3.t c11 = c(c3659j, z11);
        c3659j.m((int) (c3659j.f() - f7), false);
        return c11;
    }

    public static boolean e(C3659j c3659j, a aVar) throws IOException {
        c3659j.e();
        byte[] bArr = new byte[4];
        C8049B c8049b = new C8049B(4, bArr);
        c3659j.d(bArr, 0, 4, false);
        boolean g10 = c8049b.g();
        int h11 = c8049b.h(7);
        int h12 = c8049b.h(24) + 4;
        if (h11 == 0) {
            byte[] bArr2 = new byte[38];
            c3659j.b(bArr2, 0, 38, false);
            aVar.f18650a = new y(4, bArr2);
            return g10;
        }
        y yVar = aVar.f18650a;
        if (yVar == null) {
            throw new IllegalArgumentException();
        }
        if (h11 == 3) {
            C8050C c8050c = new C8050C(h12);
            c3659j.b(c8050c.e(), 0, h12, false);
            aVar.f18650a = yVar.b(f(c8050c));
            return g10;
        }
        if (h11 == 4) {
            C8050C c8050c2 = new C8050C(h12);
            c3659j.b(c8050c2.e(), 0, h12, false);
            c8050c2.S(4);
            aVar.f18650a = yVar.c(Arrays.asList(P.e(c8050c2, false, false).f18531a));
            return g10;
        }
        if (h11 != 6) {
            c3659j.m(h12, false);
            return g10;
        }
        C8050C c8050c3 = new C8050C(h12);
        c3659j.b(c8050c3.e(), 0, h12, false);
        c8050c3.S(4);
        aVar.f18650a = yVar.a(AbstractC5880y.B(Z3.a.d(c8050c3)));
        return g10;
    }

    public static y.a f(C8050C c8050c) {
        c8050c.S(1);
        int H11 = c8050c.H();
        long f7 = c8050c.f() + H11;
        int i11 = H11 / 18;
        long[] jArr = new long[i11];
        long[] jArr2 = new long[i11];
        int i12 = 0;
        while (true) {
            if (i12 >= i11) {
                break;
            }
            long y11 = c8050c.y();
            if (y11 == -1) {
                jArr = Arrays.copyOf(jArr, i12);
                jArr2 = Arrays.copyOf(jArr2, i12);
                break;
            }
            jArr[i12] = y11;
            jArr2[i12] = c8050c.y();
            c8050c.S(2);
            i12++;
        }
        c8050c.S((int) (f7 - c8050c.f()));
        return new y.a(jArr, jArr2);
    }

    public static void g(C3659j c3659j) throws IOException {
        C8050C c8050c = new C8050C(4);
        c3659j.b(c8050c.e(), 0, 4, false);
        if (c8050c.G() != 1716281667) {
            throw j3.v.a(null, "Failed to read FLAC stream marker.");
        }
    }
}
