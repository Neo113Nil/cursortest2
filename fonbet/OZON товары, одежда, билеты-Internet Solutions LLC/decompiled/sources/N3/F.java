package N3;

/* loaded from: classes.dex */
public final class F {

    /* renamed from: a, reason: collision with root package name */
    private static final String[] f18487a = {"audio/mpeg-L1", "audio/mpeg-L2", "audio/mpeg"};

    /* renamed from: b, reason: collision with root package name */
    private static final int[] f18488b = {44100, 48000, 32000};

    /* renamed from: c, reason: collision with root package name */
    private static final int[] f18489c = {32000, 64000, 96000, 128000, 160000, 192000, 224000, 256000, 288000, 320000, 352000, 384000, 416000, 448000};

    /* renamed from: d, reason: collision with root package name */
    private static final int[] f18490d = {32000, 48000, 56000, 64000, 80000, 96000, 112000, 128000, 144000, 160000, 176000, 192000, 224000, 256000};

    /* renamed from: e, reason: collision with root package name */
    private static final int[] f18491e = {32000, 48000, 56000, 64000, 80000, 96000, 112000, 128000, 160000, 192000, 224000, 256000, 320000, 384000};

    /* renamed from: f, reason: collision with root package name */
    private static final int[] f18492f = {32000, 40000, 48000, 56000, 64000, 80000, 96000, 112000, 128000, 160000, 192000, 224000, 256000, 320000};

    /* renamed from: g, reason: collision with root package name */
    private static final int[] f18493g = {8000, 16000, 24000, 32000, 40000, 48000, 56000, 64000, 80000, 96000, 112000, 128000, 144000, 160000};

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public int f18494a;

        /* renamed from: b, reason: collision with root package name */
        public String f18495b;

        /* renamed from: c, reason: collision with root package name */
        public int f18496c;

        /* renamed from: d, reason: collision with root package name */
        public int f18497d;

        /* renamed from: e, reason: collision with root package name */
        public int f18498e;

        /* renamed from: f, reason: collision with root package name */
        public int f18499f;

        /* renamed from: g, reason: collision with root package name */
        public int f18500g;

        public final boolean a(int i11) {
            int i12;
            int i13;
            int i14;
            int i15;
            int i16;
            if (!((i11 & (-2097152)) == -2097152) || (i12 = (i11 >>> 19) & 3) == 1 || (i13 = (i11 >>> 17) & 3) == 0 || (i14 = (i11 >>> 12) & 15) == 0 || i14 == 15 || (i15 = (i11 >>> 10) & 3) == 3) {
                return false;
            }
            this.f18494a = i12;
            this.f18495b = F.f18487a[3 - i13];
            int i17 = F.f18488b[i15];
            this.f18497d = i17;
            if (i12 == 2) {
                this.f18497d = i17 / 2;
            } else if (i12 == 0) {
                this.f18497d = i17 / 4;
            }
            int i18 = (i11 >>> 9) & 1;
            if (i13 != 1) {
                if (i13 != 2) {
                    if (i13 != 3) {
                        throw new IllegalArgumentException();
                    }
                    i16 = 384;
                }
                i16 = 1152;
            } else {
                if (i12 != 3) {
                    i16 = 576;
                }
                i16 = 1152;
            }
            this.f18500g = i16;
            if (i13 == 3) {
                int i19 = i12 == 3 ? F.f18489c[i14 - 1] : F.f18490d[i14 - 1];
                this.f18499f = i19;
                this.f18496c = (((i19 * 12) / this.f18497d) + i18) * 4;
            } else {
                if (i12 == 3) {
                    int i21 = i13 == 2 ? F.f18491e[i14 - 1] : F.f18492f[i14 - 1];
                    this.f18499f = i21;
                    this.f18496c = ((i21 * 144) / this.f18497d) + i18;
                } else {
                    int i22 = F.f18493g[i14 - 1];
                    this.f18499f = i22;
                    this.f18496c = (((i13 == 1 ? 72 : 144) * i22) / this.f18497d) + i18;
                }
            }
            this.f18498e = ((i11 >> 6) & 3) == 3 ? 1 : 2;
            return true;
        }
    }

    public static int h(int i11) {
        int i12;
        int i13;
        int i14;
        int i15;
        if (!((i11 & (-2097152)) == -2097152) || (i12 = (i11 >>> 19) & 3) == 1 || (i13 = (i11 >>> 17) & 3) == 0 || (i14 = (i11 >>> 12) & 15) == 0 || i14 == 15 || (i15 = (i11 >>> 10) & 3) == 3) {
            return -1;
        }
        int i16 = f18488b[i15];
        if (i12 == 2) {
            i16 /= 2;
        } else if (i12 == 0) {
            i16 /= 4;
        }
        int i17 = (i11 >>> 9) & 1;
        if (i13 == 3) {
            return ((((i12 == 3 ? f18489c[i14 - 1] : f18490d[i14 - 1]) * 12) / i16) + i17) * 4;
        }
        int i18 = i12 == 3 ? i13 == 2 ? f18491e[i14 - 1] : f18492f[i14 - 1] : f18493g[i14 - 1];
        if (i12 == 3) {
            return U7.i.a(i18, 144, i16, i17);
        }
        return U7.i.a(i13 == 1 ? 72 : 144, i18, i16, i17);
    }
}
