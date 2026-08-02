package v;

import A0.C0028g0;
import A0.I0;
import L4.C0226i;
import P.AbstractC0329z;
import P.C0302l;
import P.C0315s;
import P.C0326x0;
import P.InterfaceC0314r0;
import android.content.Context;
import androidx.compose.ui.input.pointer.SuspendPointerInputElement;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import i4.InterfaceC2015a;
import java.net.IDN;
import java.net.InetAddress;
import java.util.Arrays;
import java.util.Locale;
import n.AbstractC2107A;
import o4.AbstractC2227e;
import o4.AbstractC2234l;
import w.C2538a;
import x.C2592m;
import x.InterfaceC2591l0;
import y.C2654j;
import y4.C2675c;
import z.AbstractC2710l;
import z0.C2751h;
import z0.C2752i;
import z0.C2768z;
import z0.InterfaceC2753j;

/* loaded from: classes.dex */
public abstract class w0 {
    public static final void a(w.m mVar, InterfaceC2015a interfaceC2015a, b0.p pVar, C0028g0 c0028g0, C0315s c0315s, int i) {
        int i5;
        w.m mVar2;
        InterfaceC2015a interfaceC2015a2;
        C0028g0 c0028g02;
        int i6;
        c0315s.Z(645832757);
        if ((i & 6) == 0) {
            i5 = (c0315s.f(mVar) ? 4 : 2) | i;
        } else {
            i5 = i;
        }
        if ((i & 48) == 0) {
            i5 |= c0315s.h(interfaceC2015a) ? 32 : 16;
        }
        int i7 = i5 | 384;
        if ((i & 3072) == 0) {
            i7 |= c0315s.h(c0028g0) ? 2048 : 1024;
        }
        if ((i7 & 1171) == 1170 && c0315s.B()) {
            c0315s.S();
            mVar2 = mVar;
            interfaceC2015a2 = interfaceC2015a;
            c0028g02 = c0028g0;
            i6 = i;
        } else {
            pVar = b0.m.f7161k;
            w.l lVar = (w.l) mVar.f20478a.getValue();
            if (!(lVar instanceof w.k)) {
                C0326x0 s2 = c0315s.s();
                if (s2 != null) {
                    s2.f4578d = new B.I(mVar, interfaceC2015a, c0028g0, i, 3);
                    return;
                }
                return;
            }
            mVar2 = mVar;
            interfaceC2015a2 = interfaceC2015a;
            c0028g02 = c0028g0;
            i6 = i;
            boolean f = c0315s.f(lVar);
            Object M5 = c0315s.M();
            if (f || M5 == C0302l.f4480a) {
                M5 = new w.g(G4.l.K(((w.k) lVar).f20477a));
                c0315s.i0(M5);
            }
            w.p.c((w.g) M5, interfaceC2015a2, c0028g02, c0315s, i7 & 8176);
        }
        C0326x0 s5 = c0315s.s();
        if (s5 != null) {
            s5.f4578d = new M.I(mVar2, interfaceC2015a2, pVar, c0028g02, i6, 1);
        }
    }

    public static final void b(w.m mVar, InterfaceC2015a interfaceC2015a, C0028g0 c0028g0, b0.m mVar2, boolean z3, X.d dVar, C0315s c0315s, int i) {
        int i5;
        C0028g0 c0028g02;
        b0.m mVar3;
        c0315s.Z(-84584070);
        if ((i & 6) == 0) {
            i5 = (c0315s.f(mVar) ? 4 : 2) | i;
        } else {
            i5 = i;
        }
        if ((i & 48) == 0) {
            i5 |= c0315s.h(interfaceC2015a) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            c0028g02 = c0028g0;
            i5 |= c0315s.h(c0028g02) ? 256 : 128;
        } else {
            c0028g02 = c0028g0;
        }
        int i6 = i5 | 3072;
        if ((i & 24576) == 0) {
            i6 |= c0315s.g(z3) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i6 |= c0315s.h(dVar) ? 131072 : 65536;
        }
        if ((74899 & i6) == 74898 && c0315s.B()) {
            c0315s.S();
            mVar3 = mVar2;
        } else {
            mVar3 = b0.m.f7161k;
            b0.p c5 = z3 ? mVar3.c(new SuspendPointerInputElement(w.f.f20462a, null, new t0.z(new w.d(mVar, null)), 6)) : mVar3;
            x0.O e3 = AbstractC2710l.e(b0.c.f7137k, true);
            int p5 = AbstractC0329z.p(c0315s);
            InterfaceC0314r0 l5 = c0315s.l();
            b0.p c6 = b0.a.c(c0315s, c5);
            InterfaceC2753j.f21834j.getClass();
            C2768z c2768z = C2752i.f21830b;
            c0315s.b0();
            if (c0315s.f4530S) {
                c0315s.k(c2768z);
            } else {
                c0315s.l0();
            }
            AbstractC0329z.y(c0315s, C2752i.f21833e, e3);
            AbstractC0329z.y(c0315s, C2752i.f21832d, l5);
            C2751h c2751h = C2752i.f;
            if (c0315s.f4530S || !kotlin.jvm.internal.l.a(c0315s.M(), Integer.valueOf(p5))) {
                AbstractC2107A.y(p5, c0315s, p5, c2751h);
            }
            AbstractC0329z.y(c0315s, C2752i.f21831c, c6);
            dVar.invoke(c0315s, Integer.valueOf((i6 >> 15) & 14));
            a(mVar, interfaceC2015a, null, c0028g02, c0315s, (i6 & 126) | ((i6 << 3) & 7168));
            c0315s.q(true);
        }
        C0326x0 s2 = c0315s.s();
        if (s2 != null) {
            s2.f4578d = new C2538a(mVar, interfaceC2015a, c0028g0, mVar3, z3, dVar, i);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x00a2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final InetAddress c(int i, int i5, String str) {
        int i6;
        byte[] bArr = new byte[16];
        int i7 = i;
        int i8 = 0;
        int i9 = -1;
        int i10 = -1;
        while (true) {
            if (i7 >= i5) {
                break;
            }
            if (i8 == 16) {
                return null;
            }
            int i11 = i7 + 2;
            if (i11 <= i5 && AbstractC2234l.w0(str, i7, "::", false)) {
                if (i9 != -1) {
                    return null;
                }
                i8 += 2;
                i9 = i8;
                if (i11 == i5) {
                    break;
                }
                i10 = i11;
                int i12 = 0;
                i7 = i10;
                while (i7 < i5) {
                }
                i6 = i7 - i10;
                return i6 == 0 ? null : null;
            }
            if (i8 != 0) {
                if (AbstractC2234l.w0(str, i7, ":", false)) {
                    i7++;
                } else {
                    if (!AbstractC2234l.w0(str, i7, ".", false)) {
                        return null;
                    }
                    int i13 = i8 - 2;
                    int i14 = i13;
                    while (i10 < i5) {
                        if (i14 == 16) {
                            return null;
                        }
                        if (i14 != i13) {
                            if (str.charAt(i10) != '.') {
                                return null;
                            }
                            i10++;
                        }
                        int i15 = 0;
                        int i16 = i10;
                        while (i16 < i5) {
                            char charAt = str.charAt(i16);
                            if (kotlin.jvm.internal.l.g(charAt, 48) < 0 || kotlin.jvm.internal.l.g(charAt, 57) > 0) {
                                break;
                            }
                            if ((i15 == 0 && i10 != i16) || ((i15 * 10) + charAt) - 48 > 255) {
                                return null;
                            }
                            i16++;
                        }
                        if (i16 - i10 == 0) {
                            return null;
                        }
                        bArr[i14] = (byte) i15;
                        i14++;
                        i10 = i16;
                    }
                    if (i14 != i8 + 2) {
                        return null;
                    }
                    i8 += 2;
                }
            }
            i10 = i7;
            int i122 = 0;
            i7 = i10;
            while (i7 < i5) {
                int q5 = z4.b.q(str.charAt(i7));
                if (q5 == -1) {
                    break;
                }
                i122 = (i122 << 4) + q5;
                i7++;
            }
            i6 = i7 - i10;
            if (i6 == 0 && i6 <= 4) {
                int i17 = i8 + 1;
                bArr[i8] = (byte) (255 & (i122 >>> 8));
                i8 += 2;
                bArr[i17] = (byte) (i122 & 255);
            }
        }
        if (i8 != 16) {
            if (i9 == -1) {
                return null;
            }
            int i18 = i8 - i9;
            System.arraycopy(bArr, i9, bArr, 16 - i18, i18);
            Arrays.fill(bArr, i9, (16 - i8) + i9, (byte) 0);
        }
        return InetAddress.getByAddress(bArr);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0048  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static C2675c d(y4.m mVar) {
        int i;
        int i5;
        String str;
        int length;
        y4.m mVar2 = mVar;
        kotlin.jvm.internal.l.f("headers", mVar2);
        int size = mVar2.size();
        boolean z3 = true;
        boolean z5 = true;
        int i6 = 0;
        String str2 = null;
        boolean z6 = false;
        boolean z7 = false;
        int i7 = -1;
        int i8 = -1;
        boolean z8 = false;
        boolean z9 = false;
        boolean z10 = false;
        int i9 = -1;
        int i10 = -1;
        boolean z11 = false;
        boolean z12 = false;
        boolean z13 = false;
        while (i6 < size) {
            String e3 = mVar2.e(i6);
            String g5 = mVar2.g(i6);
            if (AbstractC2234l.s0(e3, "Cache-Control", z3)) {
                if (str2 == null) {
                    str2 = g5;
                    i = 0;
                    while (i < g5.length()) {
                        int length2 = g5.length();
                        boolean z14 = z3;
                        int i11 = i;
                        while (true) {
                            if (i11 >= length2) {
                                i5 = size;
                                i11 = g5.length();
                                break;
                            }
                            i5 = size;
                            if (AbstractC2227e.A0("=,;", g5.charAt(i11))) {
                                break;
                            }
                            i11++;
                            size = i5;
                        }
                        String substring = g5.substring(i, i11);
                        kotlin.jvm.internal.l.e("this as java.lang.String…ing(startIndex, endIndex)", substring);
                        String obj = AbstractC2227e.Q0(substring).toString();
                        if (i11 == g5.length() || g5.charAt(i11) == ',' || g5.charAt(i11) == ';') {
                            i = i11 + 1;
                            str = null;
                        } else {
                            int i12 = i11 + 1;
                            byte[] bArr = z4.b.f21979a;
                            int length3 = g5.length();
                            while (true) {
                                if (i12 >= length3) {
                                    i12 = g5.length();
                                    break;
                                }
                                char charAt = g5.charAt(i12);
                                int i13 = length3;
                                if (charAt != ' ' && charAt != '\t') {
                                    break;
                                }
                                i12++;
                                length3 = i13;
                            }
                            if (i12 >= g5.length() || g5.charAt(i12) != '\"') {
                                int length4 = g5.length();
                                int i14 = i12;
                                while (true) {
                                    if (i14 >= length4) {
                                        length = g5.length();
                                        break;
                                    }
                                    int i15 = length4;
                                    int i16 = i14;
                                    if (AbstractC2227e.A0(",;", g5.charAt(i14))) {
                                        length = i16;
                                        break;
                                    }
                                    i14 = i16 + 1;
                                    length4 = i15;
                                }
                                String substring2 = g5.substring(i12, length);
                                kotlin.jvm.internal.l.e("this as java.lang.String…ing(startIndex, endIndex)", substring2);
                                String obj2 = AbstractC2227e.Q0(substring2).toString();
                                i = length;
                                str = obj2;
                            } else {
                                int i17 = i12 + 1;
                                int F02 = AbstractC2227e.F0(g5, '\"', i17, 4);
                                str = g5.substring(i17, F02);
                                kotlin.jvm.internal.l.e("this as java.lang.String…ing(startIndex, endIndex)", str);
                                i = F02 + 1;
                            }
                        }
                        if ("no-cache".equalsIgnoreCase(obj)) {
                            z3 = z14;
                            z6 = z3;
                        } else if ("no-store".equalsIgnoreCase(obj)) {
                            z3 = z14;
                            z7 = z3;
                        } else {
                            if ("max-age".equalsIgnoreCase(obj)) {
                                i7 = z4.b.w(str, -1);
                            } else if ("s-maxage".equalsIgnoreCase(obj)) {
                                i8 = z4.b.w(str, -1);
                            } else if ("private".equalsIgnoreCase(obj)) {
                                z3 = z14;
                                z8 = z3;
                            } else if ("public".equalsIgnoreCase(obj)) {
                                z3 = z14;
                                z9 = z3;
                            } else if ("must-revalidate".equalsIgnoreCase(obj)) {
                                z3 = z14;
                                z10 = z3;
                            } else if ("max-stale".equalsIgnoreCase(obj)) {
                                i9 = z4.b.w(str, Integer.MAX_VALUE);
                            } else if ("min-fresh".equalsIgnoreCase(obj)) {
                                i10 = z4.b.w(str, -1);
                            } else if ("only-if-cached".equalsIgnoreCase(obj)) {
                                z3 = z14;
                                z11 = z3;
                            } else if ("no-transform".equalsIgnoreCase(obj)) {
                                z3 = z14;
                                z12 = z3;
                            } else if ("immutable".equalsIgnoreCase(obj)) {
                                z3 = z14;
                                z13 = z3;
                            }
                            z3 = z14;
                        }
                        size = i5;
                    }
                    i6++;
                    mVar2 = mVar;
                    z3 = z3;
                    size = size;
                }
            } else if (!AbstractC2234l.s0(e3, "Pragma", z3)) {
                i6++;
                mVar2 = mVar;
                z3 = z3;
                size = size;
            }
            z5 = false;
            i = 0;
            while (i < g5.length()) {
            }
            i6++;
            mVar2 = mVar;
            z3 = z3;
            size = size;
        }
        return new C2675c(z6, z7, i7, i8, z8, z9, z10, i9, i10, z11, z12, z13, !z5 ? null : str2);
    }

    public static final b0.p e(b0.p pVar, InterfaceC2591l0 interfaceC2591l0, x.P p5, boolean z3, C2592m c2592m, C2654j c2654j, C0315s c0315s) {
        k0 k0Var;
        InterfaceC2591l0 interfaceC2591l02;
        x.P p6;
        boolean z5;
        C2592m c2592m2;
        b0.p pVar2;
        boolean z6;
        C2654j c2654j2;
        Context context = (Context) c0315s.j(AndroidCompositionLocals_androidKt.f6943b);
        i0 i0Var = (i0) c0315s.j(j0.f20259a);
        if (i0Var != null) {
            c0315s.X(1586021609);
            boolean f = c0315s.f(context) | c0315s.f(i0Var);
            Object M5 = c0315s.M();
            if (f || M5 == C0302l.f4480a) {
                M5 = new C2518m(context, i0Var);
                c0315s.i0(M5);
            }
            k0Var = (C2518m) M5;
            c0315s.q(false);
        } else {
            c0315s.X(1586120933);
            c0315s.q(false);
            k0Var = h0.f20248l;
        }
        k0 k0Var2 = k0Var;
        x.P p7 = x.P.f20695k;
        b0.p c5 = pVar.c(p5 == p7 ? D.f20141c : D.f20140b).c(k0Var2.d());
        if (((W0.m) c0315s.j(I0.f292n)) != W0.m.f6017l || p5 == p7) {
            interfaceC2591l02 = interfaceC2591l0;
            p6 = p5;
            z5 = z3;
            c2592m2 = c2592m;
            pVar2 = c5;
            z6 = true;
            c2654j2 = c2654j;
        } else {
            interfaceC2591l02 = interfaceC2591l0;
            p6 = p5;
            c2592m2 = c2592m;
            c2654j2 = c2654j;
            pVar2 = c5;
            z6 = false;
            z5 = z3;
        }
        return androidx.compose.foundation.gestures.a.b(pVar2, interfaceC2591l02, p6, k0Var2, z5, z6, c2592m2, c2654j2);
    }

    public static final String f(String str) {
        kotlin.jvm.internal.l.f("<this>", str);
        int i = 0;
        int i5 = -1;
        if (!AbstractC2227e.B0(str, ":")) {
            try {
                String ascii = IDN.toASCII(str);
                kotlin.jvm.internal.l.e("toASCII(host)", ascii);
                Locale locale = Locale.US;
                kotlin.jvm.internal.l.e("US", locale);
                String lowerCase = ascii.toLowerCase(locale);
                kotlin.jvm.internal.l.e("this as java.lang.String).toLowerCase(locale)", lowerCase);
                if (lowerCase.length() == 0) {
                    return null;
                }
                int length = lowerCase.length();
                for (int i6 = 0; i6 < length; i6++) {
                    char charAt = lowerCase.charAt(i6);
                    if (kotlin.jvm.internal.l.g(charAt, 31) <= 0 || kotlin.jvm.internal.l.g(charAt, 127) >= 0 || AbstractC2227e.F0(" #%/:?@[\\]", charAt, 0, 6) != -1) {
                        return null;
                    }
                }
                return lowerCase;
            } catch (IllegalArgumentException unused) {
                return null;
            }
        }
        InetAddress c5 = (AbstractC2234l.x0(str, "[", false) && AbstractC2234l.r0(str, "]", false)) ? c(1, str.length() - 1, str) : c(0, str.length(), str);
        if (c5 == null) {
            return null;
        }
        byte[] address = c5.getAddress();
        if (address.length != 16) {
            if (address.length == 4) {
                return c5.getHostAddress();
            }
            throw new AssertionError("Invalid IPv6 address: '" + str + '\'');
        }
        int i7 = 0;
        int i8 = 0;
        while (i7 < address.length) {
            int i9 = i7;
            while (i9 < 16 && address[i9] == 0 && address[i9 + 1] == 0) {
                i9 += 2;
            }
            int i10 = i9 - i7;
            if (i10 > i8 && i10 >= 4) {
                i5 = i7;
                i8 = i10;
            }
            i7 = i9 + 2;
        }
        C0226i c0226i = new C0226i();
        while (i < address.length) {
            if (i == i5) {
                c0226i.P(58);
                i += i8;
                if (i == 16) {
                    c0226i.P(58);
                }
            } else {
                if (i > 0) {
                    c0226i.P(58);
                }
                byte b3 = address[i];
                byte[] bArr = z4.b.f21979a;
                c0226i.R(((b3 & 255) << 8) | (address[i + 1] & 255));
                i += 2;
            }
        }
        return c0226i.I();
    }
}
