package N3;

import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import j3.C7272n;
import java.math.RoundingMode;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicInteger;
import m3.C8049B;

/* renamed from: N3.o, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3664o {

    /* renamed from: a, reason: collision with root package name */
    private static final int[] f18633a = {1, 2, 2, 2, 2, 3, 3, 4, 4, 5, 6, 6, 6, 7, 8, 8};

    /* renamed from: b, reason: collision with root package name */
    private static final int[] f18634b = {-1, 8000, 16000, 32000, -1, -1, 11025, 22050, 44100, -1, -1, 12000, 24000, 48000, -1, -1};

    /* renamed from: c, reason: collision with root package name */
    private static final int[] f18635c = {64, 112, UserVerificationMethods.USER_VERIFY_PATTERN, 192, 224, 256, 384, 448, UserVerificationMethods.USER_VERIFY_NONE, 640, 768, 896, UserVerificationMethods.USER_VERIFY_ALL, 1152, 1280, 1536, 1920, 2048, 2304, 2560, 2688, 2816, 2823, 2944, 3072, 3840, 4096, 6144, 7680};

    /* renamed from: d, reason: collision with root package name */
    private static final int[] f18636d = {8000, 16000, 32000, 64000, 128000, 22050, 44100, 88200, 176400, 352800, 12000, 24000, 48000, 96000, 192000, 384000};

    /* renamed from: e, reason: collision with root package name */
    private static final int[] f18637e = {5, 8, 10, 12};

    /* renamed from: f, reason: collision with root package name */
    private static final int[] f18638f = {6, 9, 12, 15};

    /* renamed from: g, reason: collision with root package name */
    private static final int[] f18639g = {2, 4, 6, 8};

    /* renamed from: h, reason: collision with root package name */
    private static final int[] f18640h = {9, 11, 13, 16};

    /* renamed from: i, reason: collision with root package name */
    private static final int[] f18641i = {5, 8, 10, 12};

    /* renamed from: N3.o$a */
    /* loaded from: classes8.dex */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public final String f18642a;

        /* renamed from: b, reason: collision with root package name */
        public final int f18643b;

        /* renamed from: c, reason: collision with root package name */
        public final int f18644c;

        /* renamed from: d, reason: collision with root package name */
        public final int f18645d;

        /* renamed from: e, reason: collision with root package name */
        public final long f18646e;

        a(long j11, int i11, int i12, int i13, String str) {
            this.f18642a = str;
            this.f18644c = i11;
            this.f18643b = i12;
            this.f18645d = i13;
            this.f18646e = j11;
        }
    }

    private static C8049B a(byte[] bArr) {
        byte b11 = bArr[0];
        if (b11 == Byte.MAX_VALUE || b11 == 100 || b11 == 64 || b11 == 113) {
            return new C8049B(bArr.length, bArr);
        }
        byte[] copyOf = Arrays.copyOf(bArr, bArr.length);
        byte b12 = copyOf[0];
        if (b12 == -2 || b12 == -1 || b12 == 37 || b12 == -14 || b12 == -24) {
            for (int i11 = 0; i11 < copyOf.length - 1; i11 += 2) {
                byte b13 = copyOf[i11];
                int i12 = i11 + 1;
                copyOf[i11] = copyOf[i12];
                copyOf[i12] = b13;
            }
        }
        C8049B c8049b = new C8049B(copyOf.length, copyOf);
        if (copyOf[0] == 31) {
            C8049B c8049b2 = new C8049B(copyOf.length, copyOf);
            while (c8049b2.b() >= 16) {
                c8049b2.p(2);
                c8049b.f(c8049b2.h(14));
            }
        }
        c8049b.l(copyOf.length, copyOf);
        return c8049b;
    }

    public static C7272n b(byte[] bArr, String str, String str2, int i11, String str3) {
        C8049B a11 = a(bArr);
        a11.p(60);
        int i12 = f18633a[a11.h(6)];
        int i13 = f18634b[a11.h(4)];
        int h11 = a11.h(5);
        int i14 = h11 >= 29 ? -1 : (f18635c[h11] * 1000) / 2;
        a11.p(10);
        int i15 = i12 + (a11.h(2) > 0 ? 1 : 0);
        C7272n.a aVar = new C7272n.a();
        aVar.j0(str);
        aVar.W(str3);
        aVar.y0("audio/vnd.dts");
        aVar.S(i14);
        aVar.T(i15);
        aVar.z0(i13);
        aVar.c0(null);
        aVar.n0(str2);
        aVar.w0(i11);
        return aVar.P();
    }

    public static a c(byte[] bArr) throws j3.v {
        int i11;
        int i12;
        int i13;
        int i14;
        long j11;
        int i15;
        C8049B a11 = a(bArr);
        a11.p(40);
        int h11 = a11.h(2);
        if (a11.g()) {
            i11 = 20;
            i12 = 12;
        } else {
            i11 = 16;
            i12 = 8;
        }
        a11.p(i12);
        int h12 = a11.h(i11) + 1;
        boolean g10 = a11.g();
        int i16 = -1;
        int i17 = 0;
        if (g10) {
            i13 = a11.h(2);
            int h13 = (a11.h(3) + 1) * UserVerificationMethods.USER_VERIFY_NONE;
            if (a11.g()) {
                a11.p(36);
            }
            int h14 = a11.h(3) + 1;
            int h15 = a11.h(3) + 1;
            if (h14 != 1 || h15 != 1) {
                throw j3.v.e("Multiple audio presentations or assets not supported");
            }
            int i18 = h11 + 1;
            int h16 = a11.h(i18);
            for (int i19 = 0; i19 < i18; i19++) {
                if (((h16 >> i19) & 1) == 1) {
                    a11.p(8);
                }
            }
            if (a11.g()) {
                a11.p(2);
                int h17 = (a11.h(2) + 1) << 2;
                int h18 = a11.h(2) + 1;
                while (i17 < h18) {
                    a11.p(h17);
                    i17++;
                }
            }
            i17 = h13;
        } else {
            i13 = -1;
        }
        a11.p(i11);
        a11.p(12);
        if (g10) {
            if (a11.g()) {
                a11.p(4);
            }
            if (a11.g()) {
                a11.p(24);
            }
            if (a11.g()) {
                a11.q(a11.h(10) + 1);
            }
            a11.p(5);
            i14 = f18636d[a11.h(4)];
            i16 = a11.h(8) + 1;
        } else {
            i14 = -2147483647;
        }
        int i21 = i14;
        int i22 = i16;
        if (g10) {
            if (i13 == 0) {
                i15 = 32000;
            } else if (i13 == 1) {
                i15 = 44100;
            } else {
                if (i13 != 2) {
                    throw j3.v.a(null, "Unsupported reference clock code in DTS HD header: " + i13);
                }
                i15 = 48000;
            }
            long j12 = i15;
            int i23 = m3.N.f74289a;
            j11 = m3.N.Z(i17, 1000000L, j12, RoundingMode.DOWN);
        } else {
            j11 = -9223372036854775807L;
        }
        return new a(j11, i22, i21, h12, "audio/vnd.dts.hd;profile=lbr");
    }

    public static int d(byte[] bArr) {
        C8049B a11 = a(bArr);
        a11.p(42);
        return a11.h(a11.g() ? 12 : 8) + 1;
    }

    public static a e(byte[] bArr, AtomicInteger atomicInteger) throws j3.v {
        int i11;
        long j11;
        AtomicInteger atomicInteger2;
        int i12;
        int i13;
        C8049B a11 = a(bArr);
        int i14 = a11.h(32) == 1078008818 ? 1 : 0;
        int g10 = g(a11, f18637e);
        int i15 = g10 + 1;
        if (i14 == 0) {
            i11 = -2147483647;
            j11 = -9223372036854775807L;
        } else {
            if (!a11.g()) {
                throw j3.v.e("Only supports full channel mask-based audio presentation");
            }
            int i16 = g10 - 1;
            if (((bArr[g10] & 255) | ((bArr[i16] << 8) & 65535)) != m3.N.m(i16, bArr)) {
                throw j3.v.a(null, "CRC check failed");
            }
            int h11 = a11.h(2);
            if (h11 == 0) {
                i12 = UserVerificationMethods.USER_VERIFY_NONE;
            } else if (h11 == 1) {
                i12 = 480;
            } else {
                if (h11 != 2) {
                    throw j3.v.a(null, "Unsupported base duration index in DTS UHD header: " + h11);
                }
                i12 = 384;
            }
            int h12 = (a11.h(3) + 1) * i12;
            int h13 = a11.h(2);
            if (h13 == 0) {
                i13 = 32000;
            } else if (h13 == 1) {
                i13 = 44100;
            } else {
                if (h13 != 2) {
                    throw j3.v.a(null, "Unsupported clock rate index in DTS UHD header: " + h13);
                }
                i13 = 48000;
            }
            if (a11.g()) {
                a11.p(36);
            }
            i11 = (1 << a11.h(2)) * i13;
            j11 = m3.N.Z(h12, 1000000L, i13, RoundingMode.DOWN);
        }
        int i17 = i11;
        long j12 = j11;
        int i18 = 0;
        for (int i19 = 0; i19 < i14; i19++) {
            i18 += g(a11, f18638f);
        }
        if (i14 != 0) {
            atomicInteger2 = atomicInteger;
            atomicInteger2.set(g(a11, f18639g));
        } else {
            atomicInteger2 = atomicInteger;
        }
        return new a(j12, 2, i17, i18 + (atomicInteger2.get() != 0 ? g(a11, f18640h) : 0) + i15, "audio/vnd.dts.uhd;profile=p2");
    }

    public static int f(byte[] bArr) {
        C8049B a11 = a(bArr);
        a11.p(32);
        return g(a11, f18641i) + 1;
    }

    private static int g(C8049B c8049b, int[] iArr) {
        int i11 = 0;
        for (int i12 = 0; i12 < 3 && c8049b.g(); i12++) {
            i11++;
        }
        int i13 = 0;
        for (int i14 = 0; i14 < i11; i14++) {
            i13 += 1 << iArr[i14];
        }
        return c8049b.h(iArr[i11]) + i13;
    }
}
