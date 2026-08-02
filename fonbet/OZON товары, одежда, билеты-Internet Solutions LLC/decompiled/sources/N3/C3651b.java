package N3;

import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import j3.C7270l;
import j3.C7272n;
import java.nio.ByteBuffer;
import m3.C8049B;
import m3.C8050C;

/* renamed from: N3.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3651b {

    /* renamed from: a, reason: collision with root package name */
    private static final int[] f18545a = {1, 2, 3, 6};

    /* renamed from: b, reason: collision with root package name */
    private static final int[] f18546b = {48000, 44100, 32000};

    /* renamed from: c, reason: collision with root package name */
    private static final int[] f18547c = {24000, 22050, 16000};

    /* renamed from: d, reason: collision with root package name */
    private static final int[] f18548d = {2, 1, 2, 3, 3, 4, 4, 5};

    /* renamed from: e, reason: collision with root package name */
    private static final int[] f18549e = {32, 40, 48, 56, 64, 80, 96, 112, UserVerificationMethods.USER_VERIFY_PATTERN, 160, 192, 224, 256, 320, 384, 448, UserVerificationMethods.USER_VERIFY_NONE, 576, 640};

    /* renamed from: f, reason: collision with root package name */
    private static final int[] f18550f = {69, 87, 104, 121, 139, 174, 208, 243, 278, 348, 417, 487, 557, 696, 835, 975, 1114, 1253, 1393};

    /* renamed from: N3.b$a */
    /* loaded from: classes8.dex */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public final String f18551a;

        /* renamed from: b, reason: collision with root package name */
        public final int f18552b;

        /* renamed from: c, reason: collision with root package name */
        public final int f18553c;

        /* renamed from: d, reason: collision with root package name */
        public final int f18554d;

        /* renamed from: e, reason: collision with root package name */
        public final int f18555e;

        /* renamed from: f, reason: collision with root package name */
        public final int f18556f;

        a(String str, int i11, int i12, int i13, int i14, int i15) {
            this.f18551a = str;
            this.f18553c = i11;
            this.f18552b = i12;
            this.f18554d = i13;
            this.f18555e = i14;
            this.f18556f = i15;
        }
    }

    private static int a(int i11, int i12) {
        int i13 = i12 / 2;
        if (i11 < 0 || i11 >= 3 || i12 < 0 || i13 >= 19) {
            return -1;
        }
        int i14 = f18546b[i11];
        if (i14 == 44100) {
            return ((i12 % 2) + f18550f[i13]) * 2;
        }
        int i15 = f18549e[i13];
        return i14 == 32000 ? i15 * 6 : i15 * 4;
    }

    public static C7272n b(C8050C c8050c, String str, String str2, C7270l c7270l) {
        C8049B c8049b = new C8049B();
        c8049b.m(c8050c);
        int i11 = f18546b[c8049b.h(2)];
        c8049b.p(8);
        int i12 = f18548d[c8049b.h(3)];
        if (c8049b.h(1) != 0) {
            i12++;
        }
        int i13 = f18549e[c8049b.h(5)] * 1000;
        c8049b.c();
        c8050c.R(c8049b.d());
        C7272n.a aVar = new C7272n.a();
        aVar.j0(str);
        aVar.y0("audio/ac3");
        aVar.T(i12);
        aVar.z0(i11);
        aVar.c0(c7270l);
        aVar.n0(str2);
        aVar.S(i13);
        aVar.t0(i13);
        return aVar.P();
    }

    public static int c(ByteBuffer byteBuffer) {
        if (((byteBuffer.get(byteBuffer.position() + 5) & 248) >> 3) > 10) {
            return f18545a[((byteBuffer.get(byteBuffer.position() + 4) & 192) >> 6) != 3 ? (byteBuffer.get(byteBuffer.position() + 4) & 48) >> 4 : 3] * 256;
        }
        return 1536;
    }

    public static a d(C8049B c8049b) {
        int a11;
        int i11;
        int i12;
        int i13;
        String str;
        int i14;
        int i15;
        int h11;
        int i16;
        int i17;
        int i18;
        int i19;
        int i21;
        int i22;
        int e11 = c8049b.e();
        c8049b.p(40);
        boolean z11 = c8049b.h(5) > 10;
        c8049b.n(e11);
        int[] iArr = f18548d;
        int[] iArr2 = f18546b;
        if (z11) {
            c8049b.p(16);
            int h12 = c8049b.h(2);
            if (h12 == 0) {
                r9 = 0;
            } else if (h12 == 1) {
                r9 = 1;
            } else if (h12 == 2) {
                r9 = 2;
            }
            c8049b.p(3);
            a11 = (c8049b.h(11) + 1) * 2;
            int h13 = c8049b.h(2);
            if (h13 == 3) {
                i16 = f18547c[c8049b.h(2)];
                h11 = 3;
                i17 = 6;
            } else {
                h11 = c8049b.h(2);
                int i23 = f18545a[h11];
                i16 = iArr2[h13];
                i17 = i23;
            }
            i13 = i17 * 256;
            int i24 = (a11 * i16) / (i17 * 32);
            int h14 = c8049b.h(3);
            boolean g10 = c8049b.g();
            i12 = iArr[h14] + (g10 ? 1 : 0);
            c8049b.p(10);
            if (c8049b.g()) {
                c8049b.p(8);
            }
            if (h14 == 0) {
                c8049b.p(5);
                if (c8049b.g()) {
                    c8049b.p(8);
                }
            }
            if (r9 == 1 && c8049b.g()) {
                c8049b.p(16);
            }
            if (c8049b.g()) {
                if (h14 > 2) {
                    c8049b.p(2);
                }
                if ((h14 & 1) == 0 || h14 <= 2) {
                    i19 = 6;
                } else {
                    i19 = 6;
                    c8049b.p(6);
                }
                if ((h14 & 4) != 0) {
                    c8049b.p(i19);
                }
                if (g10 && c8049b.g()) {
                    c8049b.p(5);
                }
                if (r9 == 0) {
                    if (c8049b.g()) {
                        i21 = 6;
                        c8049b.p(6);
                    } else {
                        i21 = 6;
                    }
                    if (h14 == 0 && c8049b.g()) {
                        c8049b.p(i21);
                    }
                    if (c8049b.g()) {
                        c8049b.p(i21);
                    }
                    int h15 = c8049b.h(2);
                    if (h15 == 1) {
                        c8049b.p(5);
                        i22 = 2;
                    } else {
                        if (h15 == 2) {
                            c8049b.p(12);
                        } else if (h15 == 3) {
                            int h16 = c8049b.h(5);
                            if (c8049b.g()) {
                                c8049b.p(5);
                                if (c8049b.g()) {
                                    c8049b.p(4);
                                }
                                if (c8049b.g()) {
                                    c8049b.p(4);
                                }
                                if (c8049b.g()) {
                                    c8049b.p(4);
                                }
                                if (c8049b.g()) {
                                    c8049b.p(4);
                                }
                                if (c8049b.g()) {
                                    c8049b.p(4);
                                }
                                if (c8049b.g()) {
                                    c8049b.p(4);
                                }
                                if (c8049b.g()) {
                                    c8049b.p(4);
                                }
                                if (c8049b.g()) {
                                    if (c8049b.g()) {
                                        c8049b.p(4);
                                    }
                                    if (c8049b.g()) {
                                        c8049b.p(4);
                                    }
                                }
                            }
                            if (c8049b.g()) {
                                c8049b.p(5);
                                if (c8049b.g()) {
                                    c8049b.p(7);
                                    if (c8049b.g()) {
                                        c8049b.p(8);
                                        i22 = 2;
                                        c8049b.p((h16 + i22) * 8);
                                        c8049b.c();
                                    }
                                }
                            }
                            i22 = 2;
                            c8049b.p((h16 + i22) * 8);
                            c8049b.c();
                        }
                        i22 = 2;
                    }
                    if (h14 < i22) {
                        if (c8049b.g()) {
                            c8049b.p(14);
                        }
                        if (h14 == 0 && c8049b.g()) {
                            c8049b.p(14);
                        }
                    }
                    if (c8049b.g()) {
                        if (h11 == 0) {
                            c8049b.p(5);
                        } else {
                            for (int i25 = 0; i25 < i17; i25++) {
                                if (c8049b.g()) {
                                    c8049b.p(5);
                                }
                            }
                        }
                    }
                }
            }
            if (c8049b.g()) {
                c8049b.p(5);
                if (h14 == 2) {
                    c8049b.p(4);
                }
                if (h14 >= 6) {
                    c8049b.p(2);
                }
                if (c8049b.g()) {
                    c8049b.p(8);
                }
                if (h14 == 0 && c8049b.g()) {
                    c8049b.p(8);
                }
                if (h13 < 3) {
                    c8049b.o();
                }
            }
            if (r9 == 0 && h11 != 3) {
                c8049b.o();
            }
            if (r9 == 2 && (h11 == 3 || c8049b.g())) {
                i18 = 6;
                c8049b.p(6);
            } else {
                i18 = 6;
            }
            str = (c8049b.g() && c8049b.h(i18) == 1 && c8049b.h(8) == 1) ? "audio/eac3-joc" : "audio/eac3";
            i15 = i16;
            i14 = i24;
        } else {
            c8049b.p(32);
            int h17 = c8049b.h(2);
            String str2 = h17 == 3 ? null : "audio/ac3";
            int h18 = c8049b.h(6);
            int i26 = f18549e[h18 / 2] * 1000;
            a11 = a(h17, h18);
            c8049b.p(8);
            int h19 = c8049b.h(3);
            if ((h19 & 1) == 0 || h19 == 1) {
                i11 = 2;
            } else {
                i11 = 2;
                c8049b.p(2);
            }
            if ((h19 & 4) != 0) {
                c8049b.p(i11);
            }
            if (h19 == i11) {
                c8049b.p(i11);
            }
            r9 = h17 < 3 ? iArr2[h17] : -1;
            i12 = iArr[h19] + (c8049b.g() ? 1 : 0);
            i13 = 1536;
            str = str2;
            i14 = i26;
            i15 = r9;
        }
        return new a(str, i12, i15, a11, i13, i14);
    }

    public static int e(byte[] bArr) {
        if (bArr.length < 6) {
            return -1;
        }
        if (((bArr[5] & 248) >> 3) > 10) {
            return (((bArr[3] & 255) | ((bArr[2] & 7) << 8)) + 1) * 2;
        }
        byte b11 = bArr[4];
        return a((b11 & 192) >> 6, b11 & 63);
    }

    public static C7272n f(C8050C c8050c, String str, String str2, C7270l c7270l) {
        String str3;
        C8049B c8049b = new C8049B();
        c8049b.m(c8050c);
        int h11 = c8049b.h(13) * 1000;
        c8049b.p(3);
        int i11 = f18546b[c8049b.h(2)];
        c8049b.p(10);
        int i12 = f18548d[c8049b.h(3)];
        if (c8049b.h(1) != 0) {
            i12++;
        }
        c8049b.p(3);
        int h12 = c8049b.h(4);
        c8049b.p(1);
        if (h12 > 0) {
            c8049b.p(6);
            if (c8049b.h(1) != 0) {
                i12 += 2;
            }
            c8049b.p(1);
        }
        if (c8049b.b() > 7) {
            c8049b.p(7);
            if (c8049b.h(1) != 0) {
                str3 = "audio/eac3-joc";
                c8049b.c();
                c8050c.R(c8049b.d());
                C7272n.a aVar = new C7272n.a();
                aVar.j0(str);
                aVar.y0(str3);
                aVar.T(i12);
                aVar.z0(i11);
                aVar.c0(c7270l);
                aVar.n0(str2);
                aVar.t0(h11);
                return aVar.P();
            }
        }
        str3 = "audio/eac3";
        c8049b.c();
        c8050c.R(c8049b.d());
        C7272n.a aVar2 = new C7272n.a();
        aVar2.j0(str);
        aVar2.y0(str3);
        aVar2.T(i12);
        aVar2.z0(i11);
        aVar2.c0(c7270l);
        aVar2.n0(str2);
        aVar2.t0(h11);
        return aVar2.P();
    }
}
