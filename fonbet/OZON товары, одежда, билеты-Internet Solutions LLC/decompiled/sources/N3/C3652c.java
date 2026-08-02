package N3;

import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import j3.C7270l;
import j3.C7272n;
import java.util.Locale;
import m3.C8049B;
import m3.C8050C;

/* renamed from: N3.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3652c {

    /* renamed from: a, reason: collision with root package name */
    private static final int[] f18557a = {2002, 2000, 1920, 1601, 1600, 1001, 1000, 960, 800, 800, 480, 400, 400, 2048};

    /* renamed from: N3.c$a */
    /* loaded from: classes8.dex */
    private static final class a {

        /* renamed from: a, reason: collision with root package name */
        public boolean f18558a = true;

        /* renamed from: b, reason: collision with root package name */
        public int f18559b = -1;

        /* renamed from: c, reason: collision with root package name */
        public int f18560c = -1;

        /* renamed from: d, reason: collision with root package name */
        public boolean f18561d = true;

        /* renamed from: e, reason: collision with root package name */
        public int f18562e = 2;

        /* renamed from: f, reason: collision with root package name */
        public int f18563f = 1;

        /* renamed from: g, reason: collision with root package name */
        public int f18564g = 0;

        a() {
        }
    }

    /* renamed from: N3.c$b */
    /* loaded from: classes8.dex */
    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        public final int f18565a;

        /* renamed from: b, reason: collision with root package name */
        public final int f18566b;

        /* renamed from: c, reason: collision with root package name */
        public final int f18567c;

        b(int i11, int i12, int i13) {
            this.f18565a = i11;
            this.f18566b = i12;
            this.f18567c = i13;
        }
    }

    public static void a(int i11, C8050C c8050c) {
        c8050c.O(7);
        byte[] e11 = c8050c.e();
        e11[0] = -84;
        e11[1] = 64;
        e11[2] = -1;
        e11[3] = -1;
        e11[4] = (byte) ((i11 >> 16) & 255);
        e11[5] = (byte) ((i11 >> 8) & 255);
        e11[6] = (byte) (i11 & 255);
    }

    /* JADX WARN: Code restructure failed: missing block: B:158:0x0127, code lost:
    
        if (r6 == 2) goto L64;
     */
    /* JADX WARN: Removed duplicated region for block: B:115:0x0303  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x0297  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0265  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x027e  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x02a3  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x034e  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0393  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static C7272n b(C8050C c8050c, String str, String str2, C7270l c7270l) throws j3.v {
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        boolean g10;
        int i19;
        int h11;
        int h12;
        int i21;
        int i22;
        int i23;
        int i24;
        boolean g11;
        int i25;
        int i26;
        boolean z11;
        int i27 = 8;
        C8049B c8049b = new C8049B();
        c8049b.m(c8050c);
        int b11 = c8049b.b();
        int h13 = c8049b.h(3);
        int i28 = 1;
        if (h13 > 1) {
            throw j3.v.e("Unsupported AC-4 DSI version: " + h13);
        }
        int h14 = c8049b.h(7);
        int i29 = c8049b.g() ? 48000 : 44100;
        c8049b.p(4);
        int h15 = c8049b.h(9);
        if (h14 > 1) {
            if (h13 == 0) {
                throw j3.v.e("Invalid AC-4 DSI version: " + h13);
            }
            if (c8049b.g()) {
                c8049b.p(16);
                if (c8049b.g()) {
                    c8049b.p(UserVerificationMethods.USER_VERIFY_PATTERN);
                }
            }
        }
        if (h13 == 1) {
            if (c8049b.b() < 66) {
                throw j3.v.e("Invalid AC-4 DSI bitrate.");
            }
            c8049b.p(66);
            c8049b.c();
        }
        a aVar = new a();
        int i31 = 0;
        while (i31 < h15) {
            if (h13 == 0) {
                g10 = c8049b.g();
                i19 = i27;
                h11 = c8049b.h(5);
                h12 = c8049b.h(5);
                i21 = 0;
                i22 = 0;
                i23 = i28;
                i24 = 0;
            } else {
                int h16 = c8049b.h(i27);
                i23 = i28;
                i24 = c8049b.h(i27);
                i19 = i27;
                if (i24 == 255) {
                    i24 += c8049b.h(16);
                }
                if (h16 > 2) {
                    c8049b.p(i24 * 8);
                    i31++;
                    i28 = i23;
                    i27 = i19;
                } else {
                    i21 = (b11 - c8049b.b()) / 8;
                    int h17 = c8049b.h(5);
                    i22 = h17 == 31 ? i23 : 0;
                    h12 = h16;
                    h11 = h17;
                    g10 = false;
                }
            }
            aVar.f18563f = h12;
            if (!g10 && i22 == 0 && h11 == 6) {
                g11 = i23;
            } else {
                aVar.f18564g = c8049b.h(3);
                if (c8049b.g()) {
                    c8049b.p(5);
                }
                c8049b.p(2);
                int i32 = i23;
                if (h13 == i32 && (h12 == i32 || h12 == 2)) {
                    c8049b.p(2);
                }
                c8049b.p(5);
                c8049b.p(10);
                if (h13 == i32) {
                    if (h12 > 0) {
                        aVar.f18558a = c8049b.g();
                    }
                    if (aVar.f18558a) {
                        if (h12 != i32) {
                            i25 = 2;
                        }
                        int h18 = c8049b.h(5);
                        if (h18 >= 0 && h18 <= 15) {
                            aVar.f18559b = h18;
                        }
                        if (h18 < 11 || h18 > 14) {
                            i25 = 2;
                        } else {
                            aVar.f18561d = c8049b.g();
                            i25 = 2;
                            aVar.f18562e = c8049b.h(2);
                        }
                        c8049b.p(24);
                    } else {
                        i25 = 2;
                    }
                    if (h12 == 1 || h12 == i25) {
                        if (c8049b.g() && c8049b.g()) {
                            c8049b.p(i25);
                        }
                        if (c8049b.g()) {
                            c8049b.o();
                            int i33 = i19;
                            int h19 = c8049b.h(i33);
                            int i34 = 0;
                            while (i34 < h19) {
                                c8049b.p(i33);
                                i34++;
                                i33 = 8;
                            }
                        }
                    }
                    i32 = 1;
                }
                if (!g10 && i22 == 0) {
                    c8049b.o();
                    if (h11 == 0 || h11 == i32 || h11 == 2) {
                        if (h12 == 0) {
                            for (int i35 = 0; i35 < 2; i35 += i32) {
                                d(c8049b, aVar);
                            }
                        } else {
                            for (int i36 = 0; i36 < 2; i36 += i32) {
                                e(c8049b, aVar);
                            }
                        }
                    } else if (h11 == 3 || h11 == 4) {
                        if (h12 == 0) {
                            for (int i37 = 0; i37 < 3; i37 += i32) {
                                d(c8049b, aVar);
                            }
                        } else {
                            for (int i38 = 0; i38 < 3; i38 += i32) {
                                e(c8049b, aVar);
                            }
                        }
                    } else if (h11 != 5) {
                        int h21 = c8049b.h(7);
                        for (int i39 = 0; i39 < h21; i39 += i32) {
                            c8049b.p(8);
                        }
                    } else if (h12 == 0) {
                        d(c8049b, aVar);
                    } else {
                        int h22 = c8049b.h(3);
                        for (int i41 = 0; i41 < h22 + 2; i41 += i32) {
                            e(c8049b, aVar);
                        }
                    }
                } else if (h12 == 0) {
                    d(c8049b, aVar);
                } else {
                    e(c8049b, aVar);
                }
                c8049b.o();
                g11 = c8049b.g();
            }
            i14 = 7;
            if (g11) {
                int h23 = c8049b.h(7);
                for (int i42 = 0; i42 < h23; i42++) {
                    c8049b.p(15);
                }
            }
            if (h12 > 0) {
                if (c8049b.g()) {
                    if (c8049b.b() < 66) {
                        z11 = false;
                    } else {
                        c8049b.p(66);
                        z11 = true;
                    }
                    if (!z11) {
                        throw j3.v.e("Can't parse bitrate DSI.");
                    }
                }
                if (c8049b.g()) {
                    c8049b.c();
                    c8049b.q(c8049b.h(16));
                    i12 = 5;
                    int h24 = c8049b.h(5);
                    for (int i43 = 0; i43 < h24; i43++) {
                        c8049b.p(3);
                        c8049b.p(8);
                    }
                    i26 = 1;
                    i11 = 8;
                    c8049b.c();
                    if (h13 == i26) {
                        int b12 = ((b11 - c8049b.b()) / i11) - i21;
                        if (i24 < b12) {
                            throw j3.v.e("pres_bytes is smaller than presentation bytes read.");
                        }
                        c8049b.q(i24 - b12);
                    }
                    if (aVar.f18558a) {
                        i13 = -1;
                    } else {
                        i13 = -1;
                        if (aVar.f18559b == -1) {
                            throw j3.v.e("Can't determine channel mode of presentation " + i31);
                        }
                    }
                    if (aVar.f18558a) {
                        int i44 = aVar.f18559b;
                        boolean z12 = aVar.f18561d;
                        int i45 = aVar.f18562e;
                        switch (i44) {
                            case 0:
                                i17 = 11;
                                i18 = 1;
                                break;
                            case 1:
                                i17 = 11;
                                i18 = 2;
                                break;
                            case 2:
                                i17 = 11;
                                i18 = 3;
                                break;
                            case 3:
                                i18 = i12;
                                i17 = 11;
                                break;
                            case 4:
                                i17 = 11;
                                i18 = 6;
                                break;
                            case 5:
                            case 7:
                            case 9:
                                i18 = i14;
                                i17 = 11;
                                break;
                            case 6:
                            case 8:
                            case 10:
                                i18 = i11;
                                i17 = 11;
                                break;
                            case 11:
                                i17 = 11;
                                i18 = 11;
                                break;
                            case 12:
                                i18 = 12;
                                i17 = 11;
                                break;
                            case 13:
                                i18 = 13;
                                i17 = 11;
                                break;
                            case 14:
                                i17 = 11;
                                i18 = 14;
                                break;
                            case 15:
                                i17 = 11;
                                i18 = 24;
                                break;
                            default:
                                i18 = i13;
                                i17 = 11;
                                break;
                        }
                        if (i44 == i17 || i44 == 12 || i44 == 13 || i44 == 14) {
                            if (!z12) {
                                i18 -= 2;
                            }
                            if (i45 == 0) {
                                i18 -= 4;
                            } else if (i45 == 1) {
                                i18 -= 2;
                            }
                        }
                        i16 = i18;
                    } else {
                        int i46 = aVar.f18560c;
                        if (i46 > 0) {
                            i16 = i46 + 1;
                            if (aVar.f18564g == 4 && i16 == 17) {
                                i16 = 21;
                            }
                        } else {
                            int i47 = aVar.f18564g;
                            if (i47 == 0) {
                                i15 = 2;
                            } else if (i47 != 1) {
                                i15 = 2;
                                if (i47 == 2) {
                                    i16 = i11;
                                } else if (i47 == 3) {
                                    i16 = 10;
                                } else if (i47 != 4) {
                                    m3.s.f("Ac4Util", "AC-4 level " + aVar.f18564g + " has not been defined.");
                                } else {
                                    i16 = 12;
                                }
                            } else {
                                i16 = 6;
                            }
                            i16 = i15;
                        }
                    }
                    if (i16 <= 0) {
                        throw j3.v.e("Cannot determine channel count of presentation.");
                    }
                    Object[] objArr = {Integer.valueOf(h14), Integer.valueOf(aVar.f18563f), Integer.valueOf(aVar.f18564g)};
                    int i48 = m3.N.f74289a;
                    String format = String.format(Locale.US, "ac-4.%02d.%02d.%02d", objArr);
                    C7272n.a aVar2 = new C7272n.a();
                    aVar2.j0(str);
                    aVar2.y0("audio/ac4");
                    aVar2.T(i16);
                    aVar2.z0(i29);
                    aVar2.c0(c7270l);
                    aVar2.n0(str2);
                    aVar2.U(format);
                    return aVar2.P();
                }
            }
            i26 = 1;
            i11 = 8;
            i12 = 5;
            c8049b.c();
            if (h13 == i26) {
            }
            if (aVar.f18558a) {
            }
            if (aVar.f18558a) {
            }
            if (i16 <= 0) {
            }
        }
        i11 = i27;
        i12 = 5;
        i13 = -1;
        i14 = 7;
        if (aVar.f18558a) {
        }
        if (i16 <= 0) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:40:0x0081, code lost:
    
        if (r9 != 11) goto L47;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x0088, code lost:
    
        if (r9 != 11) goto L47;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x008d, code lost:
    
        if (r9 != 8) goto L47;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static b c(C8049B c8049b) {
        int i11;
        int i12;
        int h11 = c8049b.h(16);
        int h12 = c8049b.h(16);
        if (h12 == 65535) {
            h12 = c8049b.h(24);
            i11 = 7;
        } else {
            i11 = 4;
        }
        int i13 = h12 + i11;
        if (h11 == 44097) {
            i13 += 2;
        }
        if (c8049b.h(2) == 3) {
            do {
                c8049b.h(2);
            } while (c8049b.g());
        }
        int h13 = c8049b.h(10);
        if (c8049b.g() && c8049b.h(3) > 0) {
            c8049b.p(2);
        }
        int i14 = c8049b.g() ? 48000 : 44100;
        int h14 = c8049b.h(4);
        int[] iArr = f18557a;
        if (i14 == 44100 && h14 == 13) {
            i12 = iArr[h14];
        } else if (i14 != 48000 || h14 >= 14) {
            i12 = 0;
        } else {
            int i15 = iArr[h14];
            int i16 = h13 % 5;
            if (i16 != 1) {
                if (i16 == 2) {
                    if (h14 != 8) {
                    }
                    i12 = i15 + 1;
                } else if (i16 != 3) {
                    if (i16 == 4) {
                        if (h14 != 3) {
                            if (h14 != 8) {
                            }
                        }
                        i12 = i15 + 1;
                    }
                    i12 = i15;
                }
            }
            if (h14 != 3) {
            }
            i12 = i15 + 1;
        }
        return new b(i14, i13, i12);
    }

    private static void d(C8049B c8049b, a aVar) throws j3.v {
        int h11 = c8049b.h(5);
        c8049b.p(2);
        if (c8049b.g()) {
            c8049b.p(5);
        }
        if (h11 >= 7 && h11 <= 10) {
            c8049b.o();
        }
        if (c8049b.g()) {
            int h12 = c8049b.h(3);
            if (aVar.f18559b == -1 && h11 >= 0 && h11 <= 15 && (h12 == 0 || h12 == 1)) {
                aVar.f18559b = h11;
            }
            if (c8049b.g()) {
                f(c8049b);
            }
        }
    }

    private static void e(C8049B c8049b, a aVar) throws j3.v {
        c8049b.p(2);
        boolean g10 = c8049b.g();
        int h11 = c8049b.h(8);
        for (int i11 = 0; i11 < h11; i11++) {
            c8049b.p(2);
            if (c8049b.g()) {
                c8049b.p(5);
            }
            if (g10) {
                c8049b.p(24);
            } else {
                if (c8049b.g()) {
                    if (!c8049b.g()) {
                        c8049b.p(4);
                    }
                    aVar.f18560c = c8049b.h(6) + 1;
                }
                c8049b.p(4);
            }
        }
        if (c8049b.g()) {
            c8049b.p(3);
            if (c8049b.g()) {
                f(c8049b);
            }
        }
    }

    private static void f(C8049B c8049b) throws j3.v {
        int h11 = c8049b.h(6);
        if (h11 < 2 || h11 > 42) {
            throw j3.v.e(String.format("Invalid language tag bytes number: %d. Must be between 2 and 42.", Integer.valueOf(h11)));
        }
        c8049b.p(h11 * 8);
    }
}
