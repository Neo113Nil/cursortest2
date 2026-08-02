package N3;

import m3.C8049B;

/* renamed from: N3.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3650a {

    /* renamed from: a, reason: collision with root package name */
    private static final int[] f18540a = {96000, 88200, 64000, 48000, 44100, 32000, 24000, 22050, 16000, 12000, 11025, 8000, 7350};

    /* renamed from: b, reason: collision with root package name */
    private static final int[] f18541b = {0, 1, 2, 3, 4, 5, 6, 8, -1, -1, -1, 7, 8, -1, 8, -1};

    /* renamed from: N3.a$a, reason: collision with other inner class name */
    public static final class C0354a {

        /* renamed from: a, reason: collision with root package name */
        public final int f18542a;

        /* renamed from: b, reason: collision with root package name */
        public final int f18543b;

        /* renamed from: c, reason: collision with root package name */
        public final String f18544c;

        C0354a(int i11, int i12, String str) {
            this.f18542a = i11;
            this.f18543b = i12;
            this.f18544c = str;
        }
    }

    private static int a(C8049B c8049b) throws j3.v {
        int h11 = c8049b.h(4);
        if (h11 == 15) {
            if (c8049b.b() >= 24) {
                return c8049b.h(24);
            }
            throw j3.v.a(null, "AAC header insufficient data");
        }
        if (h11 < 13) {
            return f18540a[h11];
        }
        throw j3.v.a(null, "AAC header wrong Sampling Frequency Index");
    }

    public static C0354a b(C8049B c8049b, boolean z11) throws j3.v {
        int h11 = c8049b.h(5);
        if (h11 == 31) {
            h11 = c8049b.h(6) + 32;
        }
        int a11 = a(c8049b);
        int h12 = c8049b.h(4);
        String a12 = Ej.b.a(h11, "mp4a.40.");
        if (h11 == 5 || h11 == 29) {
            a11 = a(c8049b);
            int h13 = c8049b.h(5);
            if (h13 == 31) {
                h13 = c8049b.h(6) + 32;
            }
            h11 = h13;
            if (h11 == 22) {
                h12 = c8049b.h(4);
            }
        }
        if (z11) {
            if (h11 != 1 && h11 != 2 && h11 != 3 && h11 != 4 && h11 != 6 && h11 != 7 && h11 != 17) {
                switch (h11) {
                    case 19:
                    case 20:
                    case 21:
                    case 22:
                    case 23:
                        break;
                    default:
                        throw j3.v.e("Unsupported audio object type: " + h11);
                }
            }
            if (c8049b.g()) {
                m3.s.f("AacUtil", "Unexpected frameLengthFlag = 1");
            }
            if (c8049b.g()) {
                c8049b.p(14);
            }
            boolean g10 = c8049b.g();
            if (h12 == 0) {
                throw new UnsupportedOperationException();
            }
            if (h11 == 6 || h11 == 20) {
                c8049b.p(3);
            }
            if (g10) {
                if (h11 == 22) {
                    c8049b.p(16);
                }
                if (h11 == 17 || h11 == 19 || h11 == 20 || h11 == 23) {
                    c8049b.p(3);
                }
                c8049b.p(1);
            }
            switch (h11) {
                case 17:
                case 19:
                case 20:
                case 21:
                case 22:
                case 23:
                    int h14 = c8049b.h(2);
                    if (h14 == 2 || h14 == 3) {
                        throw j3.v.e("Unsupported epConfig: " + h14);
                    }
            }
        }
        int i11 = f18541b[h12];
        if (i11 != -1) {
            return new C0354a(a11, i11, a12);
        }
        throw j3.v.a(null, null);
    }
}
