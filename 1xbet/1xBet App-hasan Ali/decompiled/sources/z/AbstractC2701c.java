package z;

import A0.C0022e0;
import P.AbstractC0329z;
import P.C0302l;
import P.C0315s;
import P.C0326x0;
import P.InterfaceC0314r0;
import a.AbstractC0444a;
import g1.C1968b;
import java.util.List;
import n.AbstractC2107A;
import x0.Z;
import x0.f0;
import z0.C2751h;
import z0.C2752i;
import z0.C2768z;
import z0.InterfaceC2753j;

/* renamed from: z.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC2701c {

    /* renamed from: a, reason: collision with root package name */
    public static final C2700b f21529a = new C2700b(0);

    /* renamed from: b, reason: collision with root package name */
    public static final C2700b f21530b = new C2700b(1);

    public static final void a(b0.p pVar, b0.d dVar, boolean z3, X.d dVar2, C0315s c0315s, int i) {
        int i5;
        c0315s.Z(1781813501);
        if ((i & 6) == 0) {
            i5 = (c0315s.f(pVar) ? 4 : 2) | i;
        } else {
            i5 = i;
        }
        if ((i & 48) == 0) {
            i5 |= c0315s.f(dVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i5 |= c0315s.g(z3) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i5 |= c0315s.h(dVar2) ? 2048 : 1024;
        }
        if ((i5 & 1171) == 1170 && c0315s.B()) {
            c0315s.S();
        } else {
            x0.O e3 = AbstractC2710l.e(dVar, z3);
            boolean f = ((i5 & 7168) == 2048) | c0315s.f(e3);
            Object M5 = c0315s.M();
            if (f || M5 == C0302l.f4480a) {
                M5 = new C0022e0(21, e3, dVar2);
                c0315s.i0(M5);
            }
            f0.a(pVar, (i4.e) M5, c0315s, i5 & 14);
        }
        C0326x0 s2 = c0315s.s();
        if (s2 != null) {
            s2.f4578d = new w.o(pVar, dVar, z3, dVar2, i);
        }
    }

    public static final void b(C0315s c0315s, b0.p pVar) {
        C2709k c2709k = C2709k.f21545c;
        int p5 = AbstractC0329z.p(c0315s);
        b0.p c5 = b0.a.c(c0315s, pVar);
        InterfaceC0314r0 l5 = c0315s.l();
        InterfaceC2753j.f21834j.getClass();
        C2768z c2768z = C2752i.f21830b;
        v3.e eVar = c0315s.f4533a;
        c0315s.b0();
        if (c0315s.f4530S) {
            c0315s.k(c2768z);
        } else {
            c0315s.l0();
        }
        AbstractC0329z.y(c0315s, C2752i.f21833e, c2709k);
        AbstractC0329z.y(c0315s, C2752i.f21832d, l5);
        AbstractC0329z.y(c0315s, C2752i.f21831c, c5);
        C2751h c2751h = C2752i.f;
        if (c0315s.f4530S || !kotlin.jvm.internal.l.a(c0315s.M(), Integer.valueOf(p5))) {
            AbstractC2107A.y(p5, c0315s, p5, c2751h);
        }
        c0315s.q(true);
    }

    public static final C2684H c(x0.N n5) {
        Object k5 = n5.k();
        if (k5 instanceof C2684H) {
            return (C2684H) k5;
        }
        return null;
    }

    public static final float d(C2684H c2684h) {
        if (c2684h != null) {
            return c2684h.f21479a;
        }
        return 0.0f;
    }

    public static x0.P e(InterfaceC2683G interfaceC2683G, int i, int i5, int i6, int i7, int i8, x0.Q q5, List list, Z[] zArr, int i9) {
        int[] iArr;
        float f;
        String str;
        long j5;
        int i10;
        int i11;
        int t5;
        int i12;
        int i13;
        int i14;
        String str2;
        int i15;
        float f5;
        boolean z3;
        int i16;
        float f6;
        int i17;
        int i18;
        List list2 = list;
        int i19 = i9;
        long j6 = i8;
        int[] iArr2 = new int[i19];
        float f7 = 0.0f;
        int i20 = 0;
        int i21 = 0;
        int i22 = 0;
        int i23 = 0;
        int i24 = 0;
        while (i20 < i19) {
            x0.N n5 = (x0.N) list2.get(i20);
            float d5 = d(c(n5));
            if (d5 > 0.0f) {
                f7 += d5;
                i21++;
                i17 = i20;
            } else {
                int i25 = i6 - i22;
                Z z5 = zArr[i20];
                if (z5 == null) {
                    i17 = i20;
                    f6 = f7;
                    i18 = i25;
                    z5 = n5.e(interfaceC2683G.f(0, i6 == Integer.MAX_VALUE ? Integer.MAX_VALUE : i25 < 0 ? 0 : i25, i7, false));
                } else {
                    f6 = f7;
                    i17 = i20;
                    i18 = i25;
                }
                Z z6 = z5;
                int e3 = interfaceC2683G.e(z6);
                int i26 = interfaceC2683G.i(z6);
                iArr2[i17] = e3;
                int i27 = i18 - e3;
                if (i27 < 0) {
                    i27 = 0;
                }
                i23 = Math.min(i8, i27);
                i22 += e3 + i23;
                i24 = Math.max(i24, i26);
                zArr[i17] = z6;
                f7 = f6;
            }
            i20 = i17 + 1;
        }
        float f8 = f7;
        int i28 = i24;
        if (i21 != 0) {
            int i29 = i6 != Integer.MAX_VALUE ? i6 : i;
            long j7 = (i21 - 1) * j6;
            iArr = iArr2;
            long j8 = (i29 - i22) - j7;
            if (j8 < 0) {
                j8 = 0;
            }
            float f9 = j8 / f8;
            long j9 = j8;
            int i30 = 0;
            while (true) {
                f = f9;
                str = "fixedSpace ";
                j5 = j8;
                if (i30 >= i19) {
                    break;
                }
                int i31 = i30;
                float d6 = d(c((x0.N) list2.get(i30)));
                float f10 = f * d6;
                try {
                    j9 -= Math.round(f10);
                    i30 = i31 + 1;
                    list2 = list;
                    f9 = f;
                    j8 = j5;
                } catch (IllegalArgumentException e5) {
                    StringBuilder w5 = AbstractC2107A.w("This log indicates a hard-to-reproduce Compose issue, modified with additional debugging details. Please help us by adding your experiences to the bug link provided. Thank you for helping us improve Compose. https://issuetracker.google.com/issues/297974033 mainAxisMax ", i6, "mainAxisMin ", i, "targetSpace ");
                    w5.append(i29);
                    w5.append("arrangementSpacingPx ");
                    w5.append(j6);
                    w5.append("weightChildrenCount ");
                    w5.append(i21);
                    w5.append("fixedSpace ");
                    w5.append(i22);
                    w5.append("arrangementSpacingTotal ");
                    w5.append(j7);
                    w5.append("remainingToTarget ");
                    w5.append(j5);
                    w5.append("totalWeight ");
                    w5.append(f8);
                    w5.append("weightUnitSpace ");
                    w5.append(f);
                    w5.append("itemWeight ");
                    w5.append(d6);
                    w5.append("weightedSize ");
                    w5.append(f10);
                    throw new IllegalArgumentException(w5.toString()).initCause(e5);
                }
            }
            int i32 = i28;
            int i33 = 0;
            int i34 = 0;
            while (true) {
                long j10 = j5;
                if (i34 >= i19) {
                    i10 = i22;
                    i11 = 0;
                    i28 = i32;
                    t5 = AbstractC0444a.t((int) (i33 + j7), 0, i6 - i10);
                    break;
                }
                if (zArr[i34] == null) {
                    i12 = i34;
                    x0.N n6 = (x0.N) list.get(i34);
                    C2684H c5 = c(n6);
                    i14 = i22;
                    float d7 = d(c5);
                    if (d7 <= 0.0f) {
                        throw new IllegalStateException("All weights <= 0 should have placeables");
                    }
                    int signum = Long.signum(j9);
                    String str3 = str;
                    int i35 = i21;
                    j9 -= signum;
                    float f11 = f * d7;
                    int max = Math.max(0, Math.round(f11) + signum);
                    if (c5 != null) {
                        try {
                            z3 = c5.f21480b;
                        } catch (IllegalArgumentException e6) {
                            e = e6;
                            f5 = f11;
                            StringBuilder w6 = AbstractC2107A.w("This log indicates a hard-to-reproduce Compose issue, modified with additional debugging details. Please help us by adding your experiences to the bug link provided. Thank you for helping us improve Compose. https://issuetracker.google.com/issues/300280216 mainAxisMax ", i6, "mainAxisMin ", i, "targetSpace ");
                            w6.append(i29);
                            w6.append("arrangementSpacingPx ");
                            w6.append(j6);
                            w6.append("weightChildrenCount ");
                            w6.append(i35);
                            w6.append(str3);
                            w6.append(i14);
                            w6.append("arrangementSpacingTotal ");
                            w6.append(j7);
                            w6.append("remainingToTarget ");
                            w6.append(j10);
                            w6.append("totalWeight ");
                            w6.append(f8);
                            w6.append("weightUnitSpace ");
                            w6.append(f);
                            w6.append("weight ");
                            w6.append(d7);
                            w6.append("weightedSize ");
                            w6.append(f5);
                            w6.append("crossAxisDesiredSize nullremainderUnit ");
                            w6.append(signum);
                            w6.append("childMainAxisSize ");
                            w6.append(max);
                            throw new IllegalArgumentException(w6.toString()).initCause(e);
                        }
                    } else {
                        z3 = true;
                    }
                    try {
                        if (z3 && max != Integer.MAX_VALUE) {
                            i16 = max;
                            f5 = f11;
                            Z e7 = n6.e(interfaceC2683G.f(i16, max, i7, true));
                            int e8 = interfaceC2683G.e(e7);
                            int i36 = interfaceC2683G.i(e7);
                            iArr[i12] = e8;
                            int max2 = Math.max(i32, i36);
                            zArr[i12] = e7;
                            i15 = i33 + e8;
                            i32 = max2;
                            i13 = i35;
                            str2 = str3;
                        }
                        Z e72 = n6.e(interfaceC2683G.f(i16, max, i7, true));
                        int e82 = interfaceC2683G.e(e72);
                        int i362 = interfaceC2683G.i(e72);
                        iArr[i12] = e82;
                        int max22 = Math.max(i32, i362);
                        zArr[i12] = e72;
                        i15 = i33 + e82;
                        i32 = max22;
                        i13 = i35;
                        str2 = str3;
                    } catch (IllegalArgumentException e9) {
                        e = e9;
                        StringBuilder w62 = AbstractC2107A.w("This log indicates a hard-to-reproduce Compose issue, modified with additional debugging details. Please help us by adding your experiences to the bug link provided. Thank you for helping us improve Compose. https://issuetracker.google.com/issues/300280216 mainAxisMax ", i6, "mainAxisMin ", i, "targetSpace ");
                        w62.append(i29);
                        w62.append("arrangementSpacingPx ");
                        w62.append(j6);
                        w62.append("weightChildrenCount ");
                        w62.append(i35);
                        w62.append(str3);
                        w62.append(i14);
                        w62.append("arrangementSpacingTotal ");
                        w62.append(j7);
                        w62.append("remainingToTarget ");
                        w62.append(j10);
                        w62.append("totalWeight ");
                        w62.append(f8);
                        w62.append("weightUnitSpace ");
                        w62.append(f);
                        w62.append("weight ");
                        w62.append(d7);
                        w62.append("weightedSize ");
                        w62.append(f5);
                        w62.append("crossAxisDesiredSize nullremainderUnit ");
                        w62.append(signum);
                        w62.append("childMainAxisSize ");
                        w62.append(max);
                        throw new IllegalArgumentException(w62.toString()).initCause(e);
                    }
                    i16 = 0;
                    f5 = f11;
                } else {
                    i12 = i34;
                    i13 = i21;
                    i14 = i22;
                    str2 = str;
                    i15 = i33;
                }
                j5 = j10;
                i33 = i15;
                i34 = i12 + 1;
                str = str2;
                i22 = i14;
                i21 = i13;
                i19 = i9;
            }
        } else {
            iArr = iArr2;
            i10 = i22 - i23;
            i11 = 0;
            t5 = 0;
        }
        int i37 = i10 + t5;
        if (i37 < 0) {
            i37 = i11;
        }
        int max3 = Math.max(i37, i);
        int max4 = Math.max(i28, Math.max(i5, i11));
        int[] iArr3 = new int[i9];
        for (int i38 = i11; i38 < i9; i38++) {
            iArr3[i38] = i11;
        }
        interfaceC2683G.d(max3, q5, iArr, iArr3);
        return interfaceC2683G.g(zArr, q5, iArr3, max3, max4);
    }

    public static final C2724z f(C1968b c1968b) {
        return new C2724z(c1968b.f17073a, c1968b.f17074b, c1968b.f17075c, c1968b.f17076d);
    }
}
