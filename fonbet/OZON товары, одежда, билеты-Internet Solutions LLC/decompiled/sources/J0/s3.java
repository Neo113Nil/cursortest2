package J0;

import S0.C3969l;
import S0.InterfaceC3967k;
import a1.C4912a;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import fd.InterfaceC6511n;
import l1.C7807Z;
import m0.D0;
import m1.AbstractC8032c;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes8.dex */
final class s3 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    public static final s3 f13398a = new s3();

    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f13399a;

        static {
            int[] iArr = new int[U0.values().length];
            try {
                iArr[U0.Focused.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[U0.UnfocusedEmpty.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[U0.UnfocusedNotEmpty.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f13399a = iArr;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:79:0x0136, code lost:
    
        if (r28 != false) goto L68;
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x010c, code lost:
    
        if (r28 != false) goto L50;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0129  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x016e  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0182  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x01aa  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x01c7  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0215  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x01c9  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x01ad  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0170  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(@NotNull U0 u02, long j11, long j12, @NotNull InterfaceC6511n interfaceC6511n, boolean z11, @NotNull C4912a c4912a, InterfaceC3967k interfaceC3967k, int i11) {
        float f7;
        int i12;
        float f11;
        int i13;
        float f12;
        int i14;
        boolean n11;
        Object C11;
        boolean n12;
        Object C12;
        C3969l u11 = interfaceC3967k.u(1988729962);
        int i15 = i11 | (u11.n(u02) ? 4 : 2) | (u11.s(j11) ? 32 : 16) | (u11.s(j12) ? 256 : UserVerificationMethods.USER_VERIFY_PATTERN) | (u11.F(interfaceC6511n) ? 2048 : UserVerificationMethods.USER_VERIFY_ALL) | (u11.p(z11) ? 16384 : 8192);
        if ((74899 & i15) == 74898 && u11.b()) {
            u11.j();
        } else {
            m0.D0 g10 = m0.H0.g(u02, "TextFieldInputState", u11, (i15 & 14) | 48);
            m0.U0 b11 = m0.W0.b();
            U0 u03 = (U0) g10.h();
            u11.o(-1158004136);
            int[] iArr = a.f13399a;
            int i16 = iArr[u03.ordinal()];
            float f13 = 0.0f;
            if (i16 != 1) {
                if (i16 == 2) {
                    f7 = 0.0f;
                    u11.k();
                    Float valueOf = Float.valueOf(f7);
                    U0 u04 = (U0) g10.n();
                    u11.o(-1158004136);
                    i12 = iArr[u04.ordinal()];
                    if (i12 != 1) {
                        if (i12 == 2) {
                            f11 = 0.0f;
                            u11.k();
                            D0.d d11 = m0.H0.d(g10, valueOf, Float.valueOf(f11), p3.f13361b.invoke(g10.m(), u11, 0), b11, u11, 196608);
                            m0.U0 b12 = m0.W0.b();
                            U0 u05 = (U0) g10.h();
                            u11.o(-1376159017);
                            i13 = iArr[u05.ordinal()];
                            if (i13 != 1) {
                                if (i13 != 2) {
                                    if (i13 != 3) {
                                        throw new Sc.o();
                                    }
                                }
                                f12 = 0.0f;
                                u11.k();
                                Float valueOf2 = Float.valueOf(f12);
                                U0 u06 = (U0) g10.n();
                                u11.o(-1376159017);
                                i14 = iArr[u06.ordinal()];
                                if (i14 != 1) {
                                    if (i14 != 2) {
                                        if (i14 != 3) {
                                            throw new Sc.o();
                                        }
                                    }
                                    u11.k();
                                    D0.d d12 = m0.H0.d(g10, valueOf2, Float.valueOf(f13), r3.f13374b.invoke(g10.m(), u11, 0), b12, u11, 196608);
                                    U0 u07 = (U0) g10.n();
                                    u11.o(-1490209928);
                                    long j13 = iArr[u07.ordinal()] == 1 ? j11 : j12;
                                    u11.k();
                                    AbstractC8032c s11 = C7807Z.s(j13);
                                    n11 = u11.n(s11);
                                    C11 = u11.C();
                                    if (!n11 || C11 == InterfaceC3967k.a.a()) {
                                        C11 = (m0.U0) l0.M.a().invoke(s11);
                                        u11.x(C11);
                                    }
                                    m0.U0 u08 = (m0.U0) C11;
                                    U0 u09 = (U0) g10.h();
                                    u11.o(-1490209928);
                                    long j14 = iArr[u09.ordinal()] == 1 ? j11 : j12;
                                    u11.k();
                                    C7807Z m11 = C7807Z.m(j14);
                                    U0 u010 = (U0) g10.n();
                                    u11.o(-1490209928);
                                    long j15 = iArr[u010.ordinal()] == 1 ? j11 : j12;
                                    u11.k();
                                    D0.d d13 = m0.H0.d(g10, m11, C7807Z.m(j15), q3.f13368b.invoke(g10.m(), u11, 0), u08, u11, 196608);
                                    int i17 = (i15 & 7168) | 384;
                                    C3287e3 c3287e3 = (C3287e3) interfaceC6511n;
                                    AbstractC8032c s12 = C7807Z.s(((C7807Z) c3287e3.invoke(g10.n(), u11, Integer.valueOf((i17 >> 6) & 112))).w());
                                    n12 = u11.n(s12);
                                    C12 = u11.C();
                                    if (!n12 || C12 == InterfaceC3967k.a.a()) {
                                        C12 = (m0.U0) l0.M.a().invoke(s12);
                                        u11.x(C12);
                                    }
                                    int i18 = ((((i17 << 3) & 57344) | 3072) >> 9) & 112;
                                    c4912a.invoke(Float.valueOf(((Number) d11.getValue()).floatValue()), C7807Z.m(((C7807Z) d13.getValue()).w()), C7807Z.m(((C7807Z) m0.H0.d(g10, c3287e3.invoke(g10.h(), u11, Integer.valueOf(i18)), c3287e3.invoke(g10.n(), u11, Integer.valueOf(i18)), o3.f13345b.invoke(g10.m(), u11, 0), (m0.U0) C12, u11, 196608).getValue()).w()), Float.valueOf(((Number) d12.getValue()).floatValue()), u11, 24576);
                                }
                                f13 = 1.0f;
                                u11.k();
                                D0.d d122 = m0.H0.d(g10, valueOf2, Float.valueOf(f13), r3.f13374b.invoke(g10.m(), u11, 0), b12, u11, 196608);
                                U0 u072 = (U0) g10.n();
                                u11.o(-1490209928);
                                if (iArr[u072.ordinal()] == 1) {
                                }
                                u11.k();
                                AbstractC8032c s112 = C7807Z.s(j13);
                                n11 = u11.n(s112);
                                C11 = u11.C();
                                if (!n11) {
                                }
                                C11 = (m0.U0) l0.M.a().invoke(s112);
                                u11.x(C11);
                                m0.U0 u082 = (m0.U0) C11;
                                U0 u092 = (U0) g10.h();
                                u11.o(-1490209928);
                                if (iArr[u092.ordinal()] == 1) {
                                }
                                u11.k();
                                C7807Z m112 = C7807Z.m(j14);
                                U0 u0102 = (U0) g10.n();
                                u11.o(-1490209928);
                                if (iArr[u0102.ordinal()] == 1) {
                                }
                                u11.k();
                                D0.d d132 = m0.H0.d(g10, m112, C7807Z.m(j15), q3.f13368b.invoke(g10.m(), u11, 0), u082, u11, 196608);
                                int i172 = (i15 & 7168) | 384;
                                C3287e3 c3287e32 = (C3287e3) interfaceC6511n;
                                AbstractC8032c s122 = C7807Z.s(((C7807Z) c3287e32.invoke(g10.n(), u11, Integer.valueOf((i172 >> 6) & 112))).w());
                                n12 = u11.n(s122);
                                C12 = u11.C();
                                if (!n12) {
                                }
                                C12 = (m0.U0) l0.M.a().invoke(s122);
                                u11.x(C12);
                                int i182 = ((((i172 << 3) & 57344) | 3072) >> 9) & 112;
                                c4912a.invoke(Float.valueOf(((Number) d11.getValue()).floatValue()), C7807Z.m(((C7807Z) d132.getValue()).w()), C7807Z.m(((C7807Z) m0.H0.d(g10, c3287e32.invoke(g10.h(), u11, Integer.valueOf(i182)), c3287e32.invoke(g10.n(), u11, Integer.valueOf(i182)), o3.f13345b.invoke(g10.m(), u11, 0), (m0.U0) C12, u11, 196608).getValue()).w()), Float.valueOf(((Number) d122.getValue()).floatValue()), u11, 24576);
                            }
                            f12 = 1.0f;
                            u11.k();
                            Float valueOf22 = Float.valueOf(f12);
                            U0 u062 = (U0) g10.n();
                            u11.o(-1376159017);
                            i14 = iArr[u062.ordinal()];
                            if (i14 != 1) {
                            }
                            f13 = 1.0f;
                            u11.k();
                            D0.d d1222 = m0.H0.d(g10, valueOf22, Float.valueOf(f13), r3.f13374b.invoke(g10.m(), u11, 0), b12, u11, 196608);
                            U0 u0722 = (U0) g10.n();
                            u11.o(-1490209928);
                            if (iArr[u0722.ordinal()] == 1) {
                            }
                            u11.k();
                            AbstractC8032c s1122 = C7807Z.s(j13);
                            n11 = u11.n(s1122);
                            C11 = u11.C();
                            if (!n11) {
                            }
                            C11 = (m0.U0) l0.M.a().invoke(s1122);
                            u11.x(C11);
                            m0.U0 u0822 = (m0.U0) C11;
                            U0 u0922 = (U0) g10.h();
                            u11.o(-1490209928);
                            if (iArr[u0922.ordinal()] == 1) {
                            }
                            u11.k();
                            C7807Z m1122 = C7807Z.m(j14);
                            U0 u01022 = (U0) g10.n();
                            u11.o(-1490209928);
                            if (iArr[u01022.ordinal()] == 1) {
                            }
                            u11.k();
                            D0.d d1322 = m0.H0.d(g10, m1122, C7807Z.m(j15), q3.f13368b.invoke(g10.m(), u11, 0), u0822, u11, 196608);
                            int i1722 = (i15 & 7168) | 384;
                            C3287e3 c3287e322 = (C3287e3) interfaceC6511n;
                            AbstractC8032c s1222 = C7807Z.s(((C7807Z) c3287e322.invoke(g10.n(), u11, Integer.valueOf((i1722 >> 6) & 112))).w());
                            n12 = u11.n(s1222);
                            C12 = u11.C();
                            if (!n12) {
                            }
                            C12 = (m0.U0) l0.M.a().invoke(s1222);
                            u11.x(C12);
                            int i1822 = ((((i1722 << 3) & 57344) | 3072) >> 9) & 112;
                            c4912a.invoke(Float.valueOf(((Number) d11.getValue()).floatValue()), C7807Z.m(((C7807Z) d1322.getValue()).w()), C7807Z.m(((C7807Z) m0.H0.d(g10, c3287e322.invoke(g10.h(), u11, Integer.valueOf(i1822)), c3287e322.invoke(g10.n(), u11, Integer.valueOf(i1822)), o3.f13345b.invoke(g10.m(), u11, 0), (m0.U0) C12, u11, 196608).getValue()).w()), Float.valueOf(((Number) d1222.getValue()).floatValue()), u11, 24576);
                        } else if (i12 != 3) {
                            throw new Sc.o();
                        }
                    }
                    f11 = 1.0f;
                    u11.k();
                    D0.d d112 = m0.H0.d(g10, valueOf, Float.valueOf(f11), p3.f13361b.invoke(g10.m(), u11, 0), b11, u11, 196608);
                    m0.U0 b122 = m0.W0.b();
                    U0 u052 = (U0) g10.h();
                    u11.o(-1376159017);
                    i13 = iArr[u052.ordinal()];
                    if (i13 != 1) {
                    }
                    f12 = 1.0f;
                    u11.k();
                    Float valueOf222 = Float.valueOf(f12);
                    U0 u0622 = (U0) g10.n();
                    u11.o(-1376159017);
                    i14 = iArr[u0622.ordinal()];
                    if (i14 != 1) {
                    }
                    f13 = 1.0f;
                    u11.k();
                    D0.d d12222 = m0.H0.d(g10, valueOf222, Float.valueOf(f13), r3.f13374b.invoke(g10.m(), u11, 0), b122, u11, 196608);
                    U0 u07222 = (U0) g10.n();
                    u11.o(-1490209928);
                    if (iArr[u07222.ordinal()] == 1) {
                    }
                    u11.k();
                    AbstractC8032c s11222 = C7807Z.s(j13);
                    n11 = u11.n(s11222);
                    C11 = u11.C();
                    if (!n11) {
                    }
                    C11 = (m0.U0) l0.M.a().invoke(s11222);
                    u11.x(C11);
                    m0.U0 u08222 = (m0.U0) C11;
                    U0 u09222 = (U0) g10.h();
                    u11.o(-1490209928);
                    if (iArr[u09222.ordinal()] == 1) {
                    }
                    u11.k();
                    C7807Z m11222 = C7807Z.m(j14);
                    U0 u010222 = (U0) g10.n();
                    u11.o(-1490209928);
                    if (iArr[u010222.ordinal()] == 1) {
                    }
                    u11.k();
                    D0.d d13222 = m0.H0.d(g10, m11222, C7807Z.m(j15), q3.f13368b.invoke(g10.m(), u11, 0), u08222, u11, 196608);
                    int i17222 = (i15 & 7168) | 384;
                    C3287e3 c3287e3222 = (C3287e3) interfaceC6511n;
                    AbstractC8032c s12222 = C7807Z.s(((C7807Z) c3287e3222.invoke(g10.n(), u11, Integer.valueOf((i17222 >> 6) & 112))).w());
                    n12 = u11.n(s12222);
                    C12 = u11.C();
                    if (!n12) {
                    }
                    C12 = (m0.U0) l0.M.a().invoke(s12222);
                    u11.x(C12);
                    int i18222 = ((((i17222 << 3) & 57344) | 3072) >> 9) & 112;
                    c4912a.invoke(Float.valueOf(((Number) d112.getValue()).floatValue()), C7807Z.m(((C7807Z) d13222.getValue()).w()), C7807Z.m(((C7807Z) m0.H0.d(g10, c3287e3222.invoke(g10.h(), u11, Integer.valueOf(i18222)), c3287e3222.invoke(g10.n(), u11, Integer.valueOf(i18222)), o3.f13345b.invoke(g10.m(), u11, 0), (m0.U0) C12, u11, 196608).getValue()).w()), Float.valueOf(((Number) d12222.getValue()).floatValue()), u11, 24576);
                } else if (i16 != 3) {
                    throw new Sc.o();
                }
            }
            f7 = 1.0f;
            u11.k();
            Float valueOf3 = Float.valueOf(f7);
            U0 u042 = (U0) g10.n();
            u11.o(-1158004136);
            i12 = iArr[u042.ordinal()];
            if (i12 != 1) {
            }
            f11 = 1.0f;
            u11.k();
            D0.d d1122 = m0.H0.d(g10, valueOf3, Float.valueOf(f11), p3.f13361b.invoke(g10.m(), u11, 0), b11, u11, 196608);
            m0.U0 b1222 = m0.W0.b();
            U0 u0522 = (U0) g10.h();
            u11.o(-1376159017);
            i13 = iArr[u0522.ordinal()];
            if (i13 != 1) {
            }
            f12 = 1.0f;
            u11.k();
            Float valueOf2222 = Float.valueOf(f12);
            U0 u06222 = (U0) g10.n();
            u11.o(-1376159017);
            i14 = iArr[u06222.ordinal()];
            if (i14 != 1) {
            }
            f13 = 1.0f;
            u11.k();
            D0.d d122222 = m0.H0.d(g10, valueOf2222, Float.valueOf(f13), r3.f13374b.invoke(g10.m(), u11, 0), b1222, u11, 196608);
            U0 u072222 = (U0) g10.n();
            u11.o(-1490209928);
            if (iArr[u072222.ordinal()] == 1) {
            }
            u11.k();
            AbstractC8032c s112222 = C7807Z.s(j13);
            n11 = u11.n(s112222);
            C11 = u11.C();
            if (!n11) {
            }
            C11 = (m0.U0) l0.M.a().invoke(s112222);
            u11.x(C11);
            m0.U0 u082222 = (m0.U0) C11;
            U0 u092222 = (U0) g10.h();
            u11.o(-1490209928);
            if (iArr[u092222.ordinal()] == 1) {
            }
            u11.k();
            C7807Z m112222 = C7807Z.m(j14);
            U0 u0102222 = (U0) g10.n();
            u11.o(-1490209928);
            if (iArr[u0102222.ordinal()] == 1) {
            }
            u11.k();
            D0.d d132222 = m0.H0.d(g10, m112222, C7807Z.m(j15), q3.f13368b.invoke(g10.m(), u11, 0), u082222, u11, 196608);
            int i172222 = (i15 & 7168) | 384;
            C3287e3 c3287e32222 = (C3287e3) interfaceC6511n;
            AbstractC8032c s122222 = C7807Z.s(((C7807Z) c3287e32222.invoke(g10.n(), u11, Integer.valueOf((i172222 >> 6) & 112))).w());
            n12 = u11.n(s122222);
            C12 = u11.C();
            if (!n12) {
            }
            C12 = (m0.U0) l0.M.a().invoke(s122222);
            u11.x(C12);
            int i182222 = ((((i172222 << 3) & 57344) | 3072) >> 9) & 112;
            c4912a.invoke(Float.valueOf(((Number) d1122.getValue()).floatValue()), C7807Z.m(((C7807Z) d132222.getValue()).w()), C7807Z.m(((C7807Z) m0.H0.d(g10, c3287e32222.invoke(g10.h(), u11, Integer.valueOf(i182222)), c3287e32222.invoke(g10.n(), u11, Integer.valueOf(i182222)), o3.f13345b.invoke(g10.m(), u11, 0), (m0.U0) C12, u11, 196608).getValue()).w()), Float.valueOf(((Number) d122222.getValue()).floatValue()), u11, 24576);
        }
        S0.J0 m02 = u11.m0();
        if (m02 != null) {
            m02.G(new n3(this, u02, j11, j12, interfaceC6511n, z11, c4912a, i11));
        }
    }
}
