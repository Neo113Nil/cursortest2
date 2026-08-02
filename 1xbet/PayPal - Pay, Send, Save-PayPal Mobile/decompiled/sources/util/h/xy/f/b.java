package util.h.xy.f;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* loaded from: classes5.dex */
public final class b {
    private static int Camera2StreamConfigurationMap = 0;
    private static java.lang.String getHighResolutionOutputSizeshNQ4ISI = null;
    private static int getHighSpeedVideoFpsRanges = 1;
    private static java.lang.String getHighSpeedVideoFpsRangesFor = null;
    private static byte getHighSpeedVideoSizes = 0;
    private static boolean getHighSpeedVideoSizesFor = false;
    private static char getInputFormats = 0;
    private static char getInputSizeshNQ4ISI = 0;
    private static int getOutputFormats = 0;
    private static boolean getOutputMinFrameDuration = false;
    private static int getOutputMinFrameDurationlomOqCM = 0;
    private static long getOutputSizes = 0;
    private static char[] getOutputSizeshNQ4ISI = null;
    private static char getOutputStallDuration = 0;
    private static final java.lang.String getOutputStallDurationlomOqCM;
    private static int getValidOutputFormatsForInputhNQ4ISI = 1;
    private static char isOutputSupportedForhNQ4ISI;
    private static final /* synthetic */ util.h.xy.f.b[] toString;

    /* renamed from: ˎ, reason: contains not printable characters */
    public static final util.h.xy.f.b f2201;
    private final java.util.concurrent.locks.Lock unwrapAs = new java.util.concurrent.locks.ReentrantLock();
    private util.h.xy.u.b isOutputSupportedFor = util.h.xy.u.b.f2434;
    private byte[] coroutineBoundary = null;

    private static void getHighResolutionOutputSizeshNQ4ISI(java.lang.String str, int i, java.lang.Object[] objArr) {
        char[] charArray = str.toCharArray();
        util.h.xz.b.d dVar = new util.h.xz.b.d();
        dVar.f2628 = i;
        int length = charArray.length;
        long[] jArr = new long[length];
        dVar.f2629 = 0;
        while (dVar.f2629 < charArray.length) {
            jArr[dVar.f2629] = (charArray[dVar.f2629] ^ (dVar.f2629 * dVar.f2628)) ^ (getOutputSizes ^ (-7508379876853140581L));
            dVar.f2629++;
        }
        char[] cArr = new char[length];
        dVar.f2629 = 0;
        while (dVar.f2629 < charArray.length) {
            cArr[dVar.f2629] = (char) jArr[dVar.f2629];
            dVar.f2629++;
        }
        objArr[0] = new java.lang.String(cArr);
    }

    private b(java.lang.String str) {
    }

    public static util.h.xy.f.b valueOf(java.lang.String str) {
        int i = getValidOutputFormatsForInputhNQ4ISI + 71;
        getOutputMinFrameDurationlomOqCM = i % 128;
        util.h.xy.f.b bVar = (util.h.xy.f.b) java.lang.Enum.valueOf(util.h.xy.f.b.class, str);
        if (i % 2 == 0) {
            return bVar;
        }
        throw new java.lang.ArithmeticException();
    }

    public static util.h.xy.f.b[] values() {
        int i = getOutputMinFrameDurationlomOqCM + 19;
        getValidOutputFormatsForInputhNQ4ISI = i % 128;
        if (i % 2 == 0) {
            throw null;
        }
        util.h.xy.f.b[] bVarArr = (util.h.xy.f.b[]) toString.clone();
        getOutputMinFrameDurationlomOqCM = (getValidOutputFormatsForInputhNQ4ISI + 21) % 128;
        return bVarArr;
    }

    static {
        getHighResolutionOutputSizeshNQ4ISI();
        Camera2StreamConfigurationMap();
        try {
            java.lang.Object[] objArr = new java.lang.Object[1];
            getHighResolutionOutputSizeshNQ4ISI((((java.lang.Integer) java.lang.Class.forName("android.os.Process").getMethod("myPid", null).invoke(null, null)).intValue() >> 22) + 127, "\u0097\u0096\u0094\u009d\u009f\u0095\u0094\u0081", objArr);
            util.h.xy.f.b bVar = new util.h.xy.f.b(((java.lang.String) objArr[0]).intern());
            f2201 = bVar;
            int i = (getValidOutputFormatsForInputhNQ4ISI + 67) % 128;
            getOutputMinFrameDurationlomOqCM = i;
            getValidOutputFormatsForInputhNQ4ISI = (i + 109) % 128;
            toString = new util.h.xy.f.b[]{bVar};
            getOutputStallDurationlomOqCM = util.h.xy.f.b.class.getName();
            java.lang.Object[] objArr2 = new java.lang.Object[1];
            getHighSpeedVideoFpsRangesFor("䍮Ἁ\ua7ec\uddfaꔷᯉ鮕꽋㿈呵瘱胉쬳힅", 15 - (android.os.SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (android.os.SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), objArr2);
            getHighResolutionOutputSizeshNQ4ISI = ((java.lang.String) objArr2[0]).intern();
            java.lang.Object[] objArr3 = new java.lang.Object[1];
            getHighSpeedVideoFpsRangesFor("\ud944鳈\ua7ec\uddfaꔷᯉ\ue734및챽꺮↴툈", (android.view.ViewConfiguration.getMaximumFlingVelocity() >> 16) + 12, objArr3);
            getHighSpeedVideoFpsRangesFor = ((java.lang.String) objArr3[0]).intern();
            getHighSpeedVideoSizes = (byte) -1;
        } catch (java.lang.Throwable th) {
            java.lang.Throwable cause = th.getCause();
            if (cause == null) {
                throw th;
            }
            throw cause;
        }
    }

    private static void getHighSpeedVideoFpsRangesFor(java.lang.String str, int i, java.lang.Object[] objArr) {
        char[] charArray = str.toCharArray();
        util.h.xz.b.e eVar = new util.h.xz.b.e();
        char[] cArr = new char[charArray.length];
        eVar.f2630 = 0;
        char[] cArr2 = new char[2];
        while (eVar.f2630 < charArray.length) {
            cArr2[0] = charArray[eVar.f2630];
            cArr2[1] = charArray[eVar.f2630 + 1];
            int i2 = 58224;
            for (int i3 = 0; i3 < 16; i3++) {
                Camera2StreamConfigurationMap = (getHighSpeedVideoFpsRanges + 81) % 128;
                char c = cArr2[1];
                char c2 = cArr2[0];
                char c3 = (char) (c - (((c2 + i2) ^ ((c2 << 4) + ((char) (getOutputStallDuration ^ 3155153533016530592L)))) ^ ((c2 >>> 5) + ((char) (isOutputSupportedForhNQ4ISI ^ 3155153533016530592L)))));
                cArr2[1] = c3;
                cArr2[0] = (char) (c2 - ((((c3 << 4) + ((char) (getInputSizeshNQ4ISI ^ 3155153533016530592L))) ^ (c3 + i2)) ^ ((c3 >>> 5) + ((char) (getInputFormats ^ 3155153533016530592L)))));
                i2 -= 40503;
            }
            cArr[eVar.f2630] = cArr2[0];
            cArr[eVar.f2630 + 1] = cArr2[1];
            eVar.f2630 += 2;
        }
        java.lang.String str2 = new java.lang.String(cArr, 0, i);
        Camera2StreamConfigurationMap = (getHighSpeedVideoFpsRanges + 85) % 128;
        objArr[0] = str2;
    }

    /* renamed from: ˊ, reason: contains not printable characters */
    public final boolean m26755(util.h.xy.f.a aVar) {
        boolean z = true;
        int i = getValidOutputFormatsForInputhNQ4ISI + 1;
        getOutputMinFrameDurationlomOqCM = i % 128;
        try {
            if (i % 2 != 0) {
                this.unwrapAs.lock();
                byte b = util.h.xy.v.b.f2439.m27591(getHighSpeedVideoFpsRanges(aVar))[4];
            } else {
                this.unwrapAs.lock();
                if (util.h.xy.v.b.f2439.m27591(getHighSpeedVideoFpsRanges(aVar))[2] != 1) {
                    z = false;
                }
            }
            getValidOutputFormatsForInputhNQ4ISI = (getOutputMinFrameDurationlomOqCM + com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CALENDAR_VALUE) % 128;
            return z;
        } catch (com.gemalto.mfs.mwsdk.exception.InternalComponentException e) {
            e.getMessage();
            return false;
        } finally {
            this.unwrapAs.unlock();
        }
    }

    private static void getHighResolutionOutputSizeshNQ4ISI(int i, java.lang.String str, java.lang.Object[] objArr) {
        getHighSpeedVideoFpsRanges = (Camera2StreamConfigurationMap + 17) % 128;
        byte[] bytes = str.getBytes("ISO-8859-1");
        util.h.xz.b.md mdVar = new util.h.xz.b.md();
        char[] cArr = getOutputSizeshNQ4ISI;
        if (cArr != null) {
            int length = cArr.length;
            char[] cArr2 = new char[length];
            for (int i2 = 0; i2 < length; i2++) {
                cArr2[i2] = (char) (cArr[i2] ^ (-3299939579226817547L));
            }
            cArr = cArr2;
        }
        int i3 = (int) ((-3299939579226817547L) ^ getOutputFormats);
        if (!getHighSpeedVideoSizesFor) {
            if (!getOutputMinFrameDuration) {
                throw null;
            }
            throw null;
        }
        mdVar.f2642 = bytes.length;
        char[] cArr3 = new char[mdVar.f2642];
        mdVar.f2643 = 0;
        while (mdVar.f2643 < mdVar.f2642) {
            cArr3[mdVar.f2643] = (char) (cArr[bytes[(mdVar.f2642 - 1) - mdVar.f2643] + i] - i3);
            mdVar.f2643++;
        }
        java.lang.String str2 = new java.lang.String(cArr3);
        Camera2StreamConfigurationMap = (getHighSpeedVideoFpsRanges + 5) % 128;
        objArr[0] = str2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0033, code lost:
    
        if (util.h.xy.v.b.f2439.m27599(getHighSpeedVideoFpsRanges(r4))[0] == 1) goto L9;
     */
    /* renamed from: ᐝ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean m26784(util.h.xy.f.a aVar) throws com.gemalto.mfs.mwsdk.exception.InternalComponentException {
        int i = getValidOutputFormatsForInputhNQ4ISI + 55;
        getOutputMinFrameDurationlomOqCM = i % 128;
        boolean z = false;
        try {
            if (i % 2 != 0) {
                this.unwrapAs.lock();
                if (util.h.xy.v.b.f2439.m27599(getHighSpeedVideoFpsRanges(aVar))[1] == 0) {
                    getValidOutputFormatsForInputhNQ4ISI = (getOutputMinFrameDurationlomOqCM + 87) % 128;
                    z = true;
                }
                return z;
            }
            this.unwrapAs.lock();
        } finally {
            this.unwrapAs.unlock();
        }
    }

    /* renamed from: ˋ, reason: contains not printable characters */
    public final boolean m26763(util.h.xy.f.a aVar, byte[] bArr) throws com.gemalto.mfs.mwsdk.exception.InternalComponentException {
        getOutputMinFrameDurationlomOqCM = (getValidOutputFormatsForInputhNQ4ISI + 7) % 128;
        try {
            this.unwrapAs.lock();
            byte[] highSpeedVideoFpsRanges = getHighSpeedVideoFpsRanges(aVar);
            byte[] bArr2 = new byte[highSpeedVideoFpsRanges.length + bArr.length];
            int length = highSpeedVideoFpsRanges.length;
            boolean z = true;
            java.lang.System.arraycopy(highSpeedVideoFpsRanges, 0, bArr2, 0, 1);
            java.lang.System.arraycopy(bArr, 0, bArr2, highSpeedVideoFpsRanges.length, bArr.length);
            if (util.h.xy.v.b.f2439.m27599(bArr2)[0] == 1) {
                getValidOutputFormatsForInputhNQ4ISI = (getOutputMinFrameDurationlomOqCM + 19) % 128;
            } else {
                z = false;
            }
            return z;
        } finally {
            this.unwrapAs.unlock();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0041 A[Catch: all -> 0x0056, InternalComponentException -> 0x0058, TryCatch #1 {InternalComponentException -> 0x0058, blocks: (B:3:0x0001, B:4:0x0012, B:9:0x0016, B:12:0x003b, B:14:0x0041, B:17:0x004a, B:19:0x001f, B:20:0x0022, B:23:0x002b, B:25:0x0036, B:26:0x0039), top: B:2:0x0001, outer: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x004a A[Catch: all -> 0x0056, InternalComponentException -> 0x0058, TRY_LEAVE, TryCatch #1 {InternalComponentException -> 0x0058, blocks: (B:3:0x0001, B:4:0x0012, B:9:0x0016, B:12:0x003b, B:14:0x0041, B:17:0x004a, B:19:0x001f, B:20:0x0022, B:23:0x002b, B:25:0x0036, B:26:0x0039), top: B:2:0x0001, outer: #0 }] */
    @util.h.xy.a.a
    /* renamed from: ˋ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean m26764(util.h.xy.f.ma maVar, byte[] bArr, boolean z) {
        int i;
        byte b;
        boolean z2 = false;
        try {
            try {
                this.unwrapAs.lock();
                byte[] bArr2 = new byte[2];
                switch (util.h.xy.f.b.AnonymousClass5.getHighSpeedVideoFpsRanges[maVar.ordinal()]) {
                    case 1:
                        bArr2[0] = 1;
                        bArr2[1] = bArr[0];
                        if (!z) {
                            b = util.h.xy.v.b.f2439.m27631(bArr2)[0];
                        } else {
                            b = util.h.xy.v.b.f2439.m27576(bArr2)[0];
                        }
                        if (b == 1) {
                            z2 = true;
                            break;
                        }
                        break;
                    case 2:
                        bArr2[0] = 2;
                        bArr2[1] = bArr[0];
                        if (!z) {
                        }
                        if (b == 1) {
                        }
                        break;
                    case 3:
                        bArr2[0] = 3;
                        i = getOutputMinFrameDurationlomOqCM + 99;
                        getValidOutputFormatsForInputhNQ4ISI = i % 128;
                        bArr2[1] = bArr[0];
                        if (!z) {
                        }
                        if (b == 1) {
                        }
                        break;
                    case 4:
                        bArr2[0] = 4;
                        i = getOutputMinFrameDurationlomOqCM + 85;
                        getValidOutputFormatsForInputhNQ4ISI = i % 128;
                        bArr2[1] = bArr[0];
                        if (!z) {
                        }
                        if (b == 1) {
                        }
                        break;
                    case 5:
                        bArr2[0] = 5;
                        bArr2[1] = bArr[0];
                        if (!z) {
                        }
                        if (b == 1) {
                        }
                        break;
                    case 6:
                        bArr2[0] = 6;
                        i = getOutputMinFrameDurationlomOqCM + 73;
                        getValidOutputFormatsForInputhNQ4ISI = i % 128;
                        bArr2[1] = bArr[0];
                        if (!z) {
                        }
                        if (b == 1) {
                        }
                        break;
                }
            } catch (com.gemalto.mfs.mwsdk.exception.InternalComponentException e) {
                e.getMessage();
            }
            return z2;
        } finally {
            this.unwrapAs.unlock();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0034 A[Catch: all -> 0x0070, InternalComponentException -> 0x0072, PHI: r0
      0x0034: PHI (r0v12 byte[] A[IMMUTABLE_TYPE]) = (r0v4 byte[]), (r0v14 byte[]) binds: [B:24:0x0030, B:5:0x001d] A[DONT_GENERATE, DONT_INLINE], TryCatch #1 {InternalComponentException -> 0x0072, blocks: (B:4:0x000e, B:5:0x001d, B:10:0x0034, B:13:0x0055, B:16:0x005c, B:17:0x0037, B:18:0x003b, B:19:0x003e, B:20:0x0042, B:21:0x0046, B:22:0x0049, B:23:0x0021, B:24:0x0030), top: B:2:0x000c, outer: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0037 A[Catch: all -> 0x0070, InternalComponentException -> 0x0072, PHI: r0
      0x0037: PHI (r0v10 byte[] A[IMMUTABLE_TYPE]) = (r0v4 byte[]), (r0v14 byte[]) binds: [B:24:0x0030, B:5:0x001d] A[DONT_GENERATE, DONT_INLINE], TryCatch #1 {InternalComponentException -> 0x0072, blocks: (B:4:0x000e, B:5:0x001d, B:10:0x0034, B:13:0x0055, B:16:0x005c, B:17:0x0037, B:18:0x003b, B:19:0x003e, B:20:0x0042, B:21:0x0046, B:22:0x0049, B:23:0x0021, B:24:0x0030), top: B:2:0x000c, outer: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x003b A[Catch: all -> 0x0070, InternalComponentException -> 0x0072, PHI: r0
      0x003b: PHI (r0v9 byte[] A[IMMUTABLE_TYPE]) = (r0v4 byte[]), (r0v14 byte[]) binds: [B:24:0x0030, B:5:0x001d] A[DONT_GENERATE, DONT_INLINE], TryCatch #1 {InternalComponentException -> 0x0072, blocks: (B:4:0x000e, B:5:0x001d, B:10:0x0034, B:13:0x0055, B:16:0x005c, B:17:0x0037, B:18:0x003b, B:19:0x003e, B:20:0x0042, B:21:0x0046, B:22:0x0049, B:23:0x0021, B:24:0x0030), top: B:2:0x000c, outer: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x003e A[Catch: all -> 0x0070, InternalComponentException -> 0x0072, PHI: r0
      0x003e: PHI (r0v8 byte[] A[IMMUTABLE_TYPE]) = (r0v4 byte[]), (r0v14 byte[]) binds: [B:24:0x0030, B:5:0x001d] A[DONT_GENERATE, DONT_INLINE], TryCatch #1 {InternalComponentException -> 0x0072, blocks: (B:4:0x000e, B:5:0x001d, B:10:0x0034, B:13:0x0055, B:16:0x005c, B:17:0x0037, B:18:0x003b, B:19:0x003e, B:20:0x0042, B:21:0x0046, B:22:0x0049, B:23:0x0021, B:24:0x0030), top: B:2:0x000c, outer: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0042 A[Catch: all -> 0x0070, InternalComponentException -> 0x0072, PHI: r0
      0x0042: PHI (r0v7 byte[] A[IMMUTABLE_TYPE]) = (r0v4 byte[]), (r0v14 byte[]) binds: [B:24:0x0030, B:5:0x001d] A[DONT_GENERATE, DONT_INLINE], TryCatch #1 {InternalComponentException -> 0x0072, blocks: (B:4:0x000e, B:5:0x001d, B:10:0x0034, B:13:0x0055, B:16:0x005c, B:17:0x0037, B:18:0x003b, B:19:0x003e, B:20:0x0042, B:21:0x0046, B:22:0x0049, B:23:0x0021, B:24:0x0030), top: B:2:0x000c, outer: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0046 A[Catch: all -> 0x0070, InternalComponentException -> 0x0072, PHI: r0
      0x0046: PHI (r0v6 byte[] A[IMMUTABLE_TYPE]) = (r0v4 byte[]), (r0v14 byte[]) binds: [B:24:0x0030, B:5:0x001d] A[DONT_GENERATE, DONT_INLINE], TryCatch #1 {InternalComponentException -> 0x0072, blocks: (B:4:0x000e, B:5:0x001d, B:10:0x0034, B:13:0x0055, B:16:0x005c, B:17:0x0037, B:18:0x003b, B:19:0x003e, B:20:0x0042, B:21:0x0046, B:22:0x0049, B:23:0x0021, B:24:0x0030), top: B:2:0x000c, outer: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0049 A[Catch: all -> 0x0070, InternalComponentException -> 0x0072, PHI: r0
      0x0049: PHI (r0v5 byte[] A[IMMUTABLE_TYPE]) = (r0v4 byte[]), (r0v14 byte[]) binds: [B:24:0x0030, B:5:0x001d] A[DONT_GENERATE, DONT_INLINE], TRY_LEAVE, TryCatch #1 {InternalComponentException -> 0x0072, blocks: (B:4:0x000e, B:5:0x001d, B:10:0x0034, B:13:0x0055, B:16:0x005c, B:17:0x0037, B:18:0x003b, B:19:0x003e, B:20:0x0042, B:21:0x0046, B:22:0x0049, B:23:0x0021, B:24:0x0030), top: B:2:0x000c, outer: #0 }] */
    @util.h.xy.a.a
    /* renamed from: ˊ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final byte[] m26758(util.h.xy.f.ma maVar, boolean z) {
        byte[] bArr;
        byte[] m27634;
        int i = getValidOutputFormatsForInputhNQ4ISI + 5;
        getOutputMinFrameDurationlomOqCM = i % 128;
        try {
            try {
            } catch (com.gemalto.mfs.mwsdk.exception.InternalComponentException e) {
                e.getMessage();
            }
            if (i % 2 != 0) {
                this.unwrapAs.lock();
                bArr = new byte[0];
                switch (util.h.xy.f.b.AnonymousClass5.getHighSpeedVideoFpsRanges[maVar.ordinal()]) {
                    case 1:
                        bArr[0] = 1;
                        break;
                    case 2:
                        bArr[0] = 2;
                        break;
                    case 3:
                        bArr[0] = 3;
                        break;
                    case 4:
                        bArr[0] = 4;
                        break;
                    case 5:
                        bArr[0] = 5;
                        break;
                    case 6:
                        bArr[0] = 6;
                        break;
                    case 7:
                        bArr[0] = 0;
                        break;
                    default:
                        this.unwrapAs.unlock();
                        return null;
                }
            } else {
                this.unwrapAs.lock();
                bArr = new byte[1];
                switch (util.h.xy.f.b.AnonymousClass5.getHighSpeedVideoFpsRanges[maVar.ordinal()]) {
                    case 1:
                        break;
                    case 2:
                        break;
                    case 3:
                        break;
                    case 4:
                        break;
                    case 5:
                        break;
                    case 6:
                        break;
                    case 7:
                        break;
                    default:
                        this.unwrapAs.unlock();
                        return null;
                }
            }
            if (z) {
                getValidOutputFormatsForInputhNQ4ISI = (getOutputMinFrameDurationlomOqCM + 113) % 128;
                m27634 = util.h.xy.v.b.f2439.m27630(bArr);
            } else {
                m27634 = util.h.xy.v.b.f2439.m27634(bArr);
            }
            this.unwrapAs.unlock();
            getOutputMinFrameDurationlomOqCM = (getValidOutputFormatsForInputhNQ4ISI + 19) % 128;
            return m27634;
        } catch (java.lang.Throwable th) {
            this.unwrapAs.unlock();
            throw th;
        }
    }

    @util.h.xy.a.a
    /* renamed from: ˎ, reason: contains not printable characters */
    public final void m26769() throws com.gemalto.mfs.mwsdk.exception.InternalComponentException {
        int i = getValidOutputFormatsForInputhNQ4ISI + 91;
        getOutputMinFrameDurationlomOqCM = i % 128;
        try {
            if (i % 2 == 0) {
                this.unwrapAs.lock();
                if (m26755(util.h.xy.f.a.f2181)) {
                    util.h.xy.v.b.f2439.m27583(new byte[]{0, 34});
                    getValidOutputFormatsForInputhNQ4ISI = (getOutputMinFrameDurationlomOqCM + 1) % 128;
                }
                return;
            }
            this.unwrapAs.lock();
            m26755(util.h.xy.f.a.f2181);
            throw null;
        } finally {
            this.unwrapAs.unlock();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x003d, code lost:
    
        if (r6.m26179() != null) goto L9;
     */
    @util.h.xy.a.a
    /* renamed from: ˊ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m26753(util.h.xy.d.d dVar, boolean z) throws com.gemalto.mfs.mwsdk.exception.InternalComponentException {
        int i = getValidOutputFormatsForInputhNQ4ISI + 43;
        getOutputMinFrameDurationlomOqCM = i % 128;
        try {
            if (i % 2 != 0) {
                this.unwrapAs.lock();
                dVar.m26180();
                dVar.m26179();
                m26752(dVar.m26180(), false);
                if (dVar.m26179() != null) {
                    if (!dVar.m26179().isEmpty()) {
                        m26752(dVar.m26179(), true);
                    }
                }
                try {
                    m26771(dVar.m26180(), false);
                    if (dVar.m26179() != null) {
                        getOutputMinFrameDurationlomOqCM = (getValidOutputFormatsForInputhNQ4ISI + 113) % 128;
                        if (!dVar.m26179().isEmpty()) {
                            m26771(dVar.m26179(), true);
                        }
                    }
                    if (z) {
                        if (dVar.m26179() != null && !dVar.m26179().isEmpty()) {
                            getOutputMinFrameDurationlomOqCM = (getValidOutputFormatsForInputhNQ4ISI + 119) % 128;
                            m26777(dVar.m26179(), true);
                        }
                        m26777(dVar.m26180(), false);
                    }
                    return;
                } catch (org.json.JSONException e) {
                    e.getMessage();
                    java.lang.Object[] objArr = new java.lang.Object[1];
                    getHighResolutionOutputSizeshNQ4ISI(android.widget.ExpandableListView.getPackedPositionType(0L) + 127, "\u0090\u0082\u008f\u008e\u0085\u008a\u008d\u0088\u0083\u008a\u0082\u0088\u0083\u0082\u0084\u0082\u008a\u008c\u008b\u008a\u0089\u0088\u0087\u0086\u0082\u0085\u0084\u0083\u0082\u0081", objArr);
                    throw new com.gemalto.mfs.mwsdk.exception.InternalComponentException(((java.lang.String) objArr[0]).intern(), e);
                }
            }
            this.unwrapAs.lock();
            dVar.m26180();
            dVar.m26179();
            m26752(dVar.m26180(), false);
        } finally {
        }
        this.unwrapAs.unlock();
    }

    @util.h.xy.a.a
    /* renamed from: ˎ, reason: contains not printable characters */
    public final byte[] m26774(byte[] bArr, byte[] bArr2) throws com.gemalto.mfs.mwsdk.exception.InternalComponentException {
        byte[] m27604;
        getValidOutputFormatsForInputhNQ4ISI = (getOutputMinFrameDurationlomOqCM + 75) % 128;
        byte[] highSpeedVideoFpsRangesFor = getHighSpeedVideoFpsRangesFor(bArr, bArr2);
        int i = ((int) util.h.xy.bq.a.f987) / 1000;
        byte[] highSpeedVideoFpsRangesFor2 = getHighSpeedVideoFpsRangesFor(new byte[]{getHighSpeedVideoSizes}, getHighSpeedVideoFpsRangesFor(new byte[]{(byte) (((-16777216) & i) >> 24), (byte) ((16711680 & i) >> 16), (byte) ((65280 & i) >> 8), (byte) (i & 255)}, highSpeedVideoFpsRangesFor));
        try {
            this.unwrapAs.lock();
            if (util.h.xy.k.b.m26914(com.gemalto.mfs.mwsdk.dcm.PaymentType.CONTACTLESS)) {
                getValidOutputFormatsForInputhNQ4ISI = (getOutputMinFrameDurationlomOqCM + 87) % 128;
                if (util.h.xy.k.ma.m26925().mo26147(util.h.xy.k.b.m26922(com.gemalto.mfs.mwsdk.dcm.PaymentType.CONTACTLESS))) {
                    m27604 = util.h.xy.v.b.f2439.m27644(highSpeedVideoFpsRangesFor2);
                    getValidOutputFormatsForInputhNQ4ISI = (getOutputMinFrameDurationlomOqCM + 1) % 128;
                    this.unwrapAs.unlock();
                    util.h.xy.ar.b.m25095(bArr);
                    util.h.xy.ar.b.m25095(highSpeedVideoFpsRangesFor);
                    getValidOutputFormatsForInputhNQ4ISI = (getOutputMinFrameDurationlomOqCM + 125) % 128;
                    return m27604;
                }
            }
            m27604 = util.h.xy.v.b.f2439.m27604(highSpeedVideoFpsRangesFor2);
            this.unwrapAs.unlock();
            util.h.xy.ar.b.m25095(bArr);
            util.h.xy.ar.b.m25095(highSpeedVideoFpsRangesFor);
            getValidOutputFormatsForInputhNQ4ISI = (getOutputMinFrameDurationlomOqCM + 125) % 128;
            return m27604;
        } catch (java.lang.Throwable th) {
            this.unwrapAs.unlock();
            util.h.xy.ar.b.m25095(bArr);
            util.h.xy.ar.b.m25095(highSpeedVideoFpsRangesFor);
            throw th;
        }
    }

    @util.h.xy.a.a
    /* renamed from: ˋ, reason: contains not printable characters */
    public final void m26761(java.lang.String str, byte[] bArr) {
        if (bArr == null) {
            java.lang.Object[] objArr = new java.lang.Object[1];
            getHighSpeedVideoFpsRangesFor("㨭㣷暂䀙ّꓓ\ue4c5恪ꆑ艧䞇ﳮ䶇駂綧踴熡잝ّꓓ岞㶸\uf7f3\ue921", 23 - android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0), objArr);
            throw new java.lang.IllegalArgumentException(((java.lang.String) objArr[0]).intern());
        }
        if (str == null || str.length() == 0) {
            java.lang.Object[] objArr2 = new java.lang.Object[1];
            getHighSpeedVideoFpsRangesFor("ᢘ\uf74d턓ժꋅﰮ뚌૯羑\u181c뤀Ꙏ튘\ue4c0릪鍀ɘ】䶇駂羑\u181c瘋础떯撰鄼\udbbd⾂\ua87c趤\ue475", (android.view.ViewConfiguration.getPressedStateDuration() >> 16) + 32, objArr2);
            throw new java.lang.IllegalArgumentException(((java.lang.String) objArr2[0]).intern());
        }
        byte[] m25076 = util.h.xy.ar.b.m25076(str);
        byte[] bArr2 = new byte[m25076.length + bArr.length];
        java.lang.System.arraycopy(m25076, 0, bArr2, 0, m25076.length);
        java.lang.System.arraycopy(bArr, 0, bArr2, m25076.length, bArr.length);
        try {
            this.unwrapAs.lock();
            try {
                byte[] m27587 = util.h.xy.v.b.f2439.m27587(bArr2);
                if (m27587[0] == 1) {
                    util.h.xy.ar.b.m25074(bArr);
                    return;
                }
                java.lang.String str2 = new java.lang.String(java.util.Arrays.copyOfRange(m27587, 1, m27587.length));
                util.h.xy.ar.b.m25074(bArr);
                java.lang.StringBuilder sb = new java.lang.StringBuilder();
                java.lang.Object[] objArr3 = new java.lang.Object[1];
                getHighSpeedVideoFpsRangesFor("셬Ⱝ\uf3e6퉠虠㐘㘛\ueffd\ud922柉譩⫏䋡즄᳞ث諵ꗼ䶇駂铠䡊秤馟\uf7f3\ue921↴툈ꮦ⤯鯣瓝\uecf7ெ鄦躵䒞걳", android.graphics.Color.green(0) + 37, objArr3);
                sb.append(((java.lang.String) objArr3[0]).intern());
                sb.append(str);
                java.lang.Object[] objArr4 = new java.lang.Object[1];
                getHighResolutionOutputSizeshNQ4ISI(127 - (android.view.ViewConfiguration.getPressedStateDuration() >> 16), "\u0088\u0092\u0085\u008a\u0085\u0085\u0084\u0088\u0091\u0083\u008f\u008d\u0088", objArr4);
                sb.append(((java.lang.String) objArr4[0]).intern());
                sb.append(str2);
                throw new util.h.xy.ab.b(sb.toString());
            } catch (com.gemalto.mfs.mwsdk.exception.InternalComponentException e) {
                java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
                java.lang.Object[] objArr5 = new java.lang.Object[1];
                getHighSpeedVideoFpsRangesFor("셬Ⱝ\uf3e6퉠虠㐘㘛\ueffd\ud922柉譩⫏䋡즄᳞ث諵ꗼ䶇駂铠䡊秤馟\uf7f3\ue921↴툈ꮦ⤯鯣瓝\uecf7ெ鄦躵䒞걳", android.view.KeyEvent.keyCodeFromString("") + 37, objArr5);
                sb2.append(((java.lang.String) objArr5[0]).intern());
                sb2.append(str);
                try {
                    java.lang.Object[] objArr6 = new java.lang.Object[1];
                    getHighResolutionOutputSizeshNQ4ISI((((java.lang.Integer) java.lang.Class.forName("android.os.Process").getMethod("myTid", null).invoke(null, null)).intValue() >> 22) + 127, "\u0088\u0092\u0085\u008a\u0085\u0085\u0084\u0088\u0091\u0083\u008f\u008d\u0088", objArr6);
                    sb2.append(((java.lang.String) objArr6[0]).intern());
                    sb2.append(e.getMessage());
                    throw new util.h.xy.ab.b(sb2.toString());
                } catch (java.lang.Throwable th) {
                    java.lang.Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
        } finally {
            this.unwrapAs.unlock();
            util.h.xy.ar.b.m25095(bArr2);
        }
    }

    @util.h.xy.a.a
    /* renamed from: ˋ, reason: contains not printable characters */
    public final boolean m26765(byte[] bArr) {
        int i = getOutputMinFrameDurationlomOqCM + 17;
        getValidOutputFormatsForInputhNQ4ISI = i % 128;
        boolean z = true;
        if (i % 2 == 0) {
            try {
                if (m26774(bArr, util.h.xy.at.ma.m25117())[1] != 0) {
                    return true;
                }
            } catch (com.gemalto.mfs.mwsdk.exception.InternalComponentException e) {
                e = e;
                e.getMessage();
                return z;
            }
        } else {
            try {
                if (m26774(bArr, util.h.xy.at.ma.m25117())[0] != 1) {
                    return false;
                }
            } catch (com.gemalto.mfs.mwsdk.exception.InternalComponentException e2) {
                e = e2;
                z = false;
                e.getMessage();
                return z;
            }
        }
        getValidOutputFormatsForInputhNQ4ISI = (getOutputMinFrameDurationlomOqCM + 47) % 128;
        return true;
    }

    @util.h.xy.a.a
    /* renamed from: ᐝ, reason: contains not printable characters */
    public final boolean m26785(boolean z, boolean z2, boolean z3) {
        byte b;
        byte[] m27619;
        int i = (getValidOutputFormatsForInputhNQ4ISI + 17) % 128;
        getOutputMinFrameDurationlomOqCM = i;
        boolean z4 = false;
        if (z) {
            b = 1;
        } else {
            getValidOutputFormatsForInputhNQ4ISI = (i + 1) % 128;
            b = 0;
        }
        byte[] bArr = {b, z2 ? (byte) 1 : (byte) 0, getHighSpeedVideoSizes};
        try {
            try {
                this.unwrapAs.lock();
                if (z3) {
                    m27619 = util.h.xy.v.b.f2439.m27619(bArr);
                } else {
                    int i2 = getOutputMinFrameDurationlomOqCM + 97;
                    getValidOutputFormatsForInputhNQ4ISI = i2 % 128;
                    if (i2 % 2 == 0) {
                        util.h.xy.v.b.f2439.m27641(bArr);
                        throw new java.lang.ArithmeticException();
                    }
                    m27619 = util.h.xy.v.b.f2439.m27641(bArr);
                }
                this.unwrapAs.unlock();
                if (m27619[0] == 1) {
                    getValidOutputFormatsForInputhNQ4ISI = (getOutputMinFrameDurationlomOqCM + 111) % 128;
                    z4 = true;
                }
                int i3 = getOutputMinFrameDurationlomOqCM + 11;
                getValidOutputFormatsForInputhNQ4ISI = i3 % 128;
                if (i3 % 2 != 0) {
                    return z4;
                }
                throw null;
            } catch (com.gemalto.mfs.mwsdk.exception.InternalComponentException e) {
                e.getMessage();
                this.unwrapAs.unlock();
                return false;
            }
        } catch (java.lang.Throwable th) {
            this.unwrapAs.unlock();
            throw th;
        }
    }

    @util.h.xy.a.a
    /* renamed from: ˋ, reason: contains not printable characters */
    public final boolean m26762() {
        getOutputMinFrameDurationlomOqCM = (getValidOutputFormatsForInputhNQ4ISI + 33) % 128;
        try {
            try {
                this.unwrapAs.lock();
                byte[] m27572 = util.h.xy.v.b.f2439.m27572(new byte[]{0});
                this.unwrapAs.unlock();
                int i = getValidOutputFormatsForInputhNQ4ISI;
                int i2 = i + 119;
                getOutputMinFrameDurationlomOqCM = i2 % 128;
                if (i2 % 2 != 0) {
                    throw null;
                }
                if (m27572 != null && m27572.length > 0) {
                    int i3 = i + 7;
                    getOutputMinFrameDurationlomOqCM = i3 % 128;
                    if (i3 % 2 == 0 ? m27572[0] == 1 : m27572[0] == 1) {
                        getOutputMinFrameDurationlomOqCM = (i + 97) % 128;
                        return true;
                    }
                }
                return false;
            } catch (com.gemalto.mfs.mwsdk.exception.InternalComponentException e) {
                e.getMessage();
                this.unwrapAs.unlock();
                return false;
            }
        } catch (java.lang.Throwable th) {
            this.unwrapAs.unlock();
            throw th;
        }
    }

    @util.h.xy.a.a
    /* renamed from: ˊ, reason: contains not printable characters */
    public final void m26754(boolean z) {
        byte b;
        int i = getValidOutputFormatsForInputhNQ4ISI;
        getOutputMinFrameDurationlomOqCM = (i + 125) % 128;
        if (z) {
            getOutputMinFrameDurationlomOqCM = (i + 87) % 128;
            b = 1;
        } else {
            getOutputMinFrameDurationlomOqCM = (i + 115) % 128;
            b = 0;
        }
        byte[] bArr = {b};
        try {
            try {
                boolean mo26147 = util.h.xy.k.b.m26914(com.gemalto.mfs.mwsdk.dcm.PaymentType.CONTACTLESS) ? util.h.xy.k.ma.m26925().mo26147(util.h.xy.k.b.m26922(com.gemalto.mfs.mwsdk.dcm.PaymentType.CONTACTLESS)) : false;
                this.unwrapAs.lock();
                if (mo26147) {
                    util.h.xy.v.b.f2439.m27601(bArr);
                } else {
                    util.h.xy.v.b.f2439.m27574(bArr);
                }
            } catch (com.gemalto.mfs.mwsdk.exception.InternalComponentException e) {
                e.getMessage();
            }
        } finally {
            this.unwrapAs.unlock();
        }
    }

    @util.h.xy.a.a
    /* renamed from: ˎ, reason: contains not printable characters */
    public final boolean m26772(java.lang.String str, com.gemalto.mfs.mwsdk.dcm.PaymentType paymentType, boolean z, boolean z2) throws com.gemalto.mfs.mwsdk.exception.InternalComponentException {
        try {
            this.unwrapAs.lock();
            com.gemalto.mfs.mwsdk.utils.async.AsyncResult<util.h.xy.d.ra> highSpeedVideoSizes = getHighSpeedVideoSizes(str, paymentType, z, z2);
            boolean z3 = false;
            if (highSpeedVideoSizes.isSuccessful()) {
                try {
                    Camera2StreamConfigurationMap(highSpeedVideoSizes, paymentType, str, z2);
                    z3 = true;
                } catch (org.json.JSONException e) {
                    e.getMessage();
                    java.lang.Object[] objArr = new java.lang.Object[1];
                    getHighResolutionOutputSizeshNQ4ISI(android.view.Gravity.getAbsoluteGravity(0, 0) + 127, "\u0097\u0094\u0096\u0095\u0094\u0093", objArr);
                    util.h.xy.am.ma.m25029(((java.lang.String) objArr[0]).intern(), util.h.xy.al.rc.m25022(e));
                    java.lang.Object[] objArr2 = new java.lang.Object[1];
                    getHighResolutionOutputSizeshNQ4ISI(127 - (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), "\u0090\u0082\u008f\u008e\u0085\u008a\u008d\u0088\u0083\u008a\u0082\u0088\u0083\u0082\u0084\u0082\u008a\u008c\u008b\u008a\u0089\u0088\u0087\u0086\u0082\u0085\u0084\u0083\u0082\u0081", objArr2);
                    throw new com.gemalto.mfs.mwsdk.exception.InternalComponentException(((java.lang.String) objArr2[0]).intern(), e);
                }
            } else {
                highSpeedVideoSizes.getErrorMessage();
            }
            this.unwrapAs.unlock();
            int i = getOutputMinFrameDurationlomOqCM;
            getValidOutputFormatsForInputhNQ4ISI = (i + 7) % 128;
            getValidOutputFormatsForInputhNQ4ISI = (i + 23) % 128;
            return z3;
        } catch (java.lang.Throwable th) {
            this.unwrapAs.unlock();
            throw th;
        }
    }

    /* renamed from: ˎ, reason: contains not printable characters */
    public final boolean m26773(boolean z) {
        int i = getOutputMinFrameDurationlomOqCM;
        getValidOutputFormatsForInputhNQ4ISI = (i + 45) % 128;
        if (z) {
            int i2 = i + 121;
            getValidOutputFormatsForInputhNQ4ISI = i2 % 128;
            if (i2 % 2 != 0) {
                util.h.xy.f.b bVar = f2201;
                return bVar.m26755(util.h.xy.f.a.f2186) || bVar.m26755(util.h.xy.f.a.f2199) || bVar.m26755(util.h.xy.f.a.f2198);
            }
            f2201.m26755(util.h.xy.f.a.f2186);
            throw new java.lang.ArithmeticException();
        }
        util.h.xy.f.b bVar2 = f2201;
        if (!bVar2.m26755(util.h.xy.f.a.f2192)) {
            int i3 = getValidOutputFormatsForInputhNQ4ISI + 43;
            getOutputMinFrameDurationlomOqCM = i3 % 128;
            if (i3 % 2 != 0) {
                bVar2.m26755(util.h.xy.f.a.f2190);
                throw null;
            }
            if (!bVar2.m26755(util.h.xy.f.a.f2190)) {
                getOutputMinFrameDurationlomOqCM = (getValidOutputFormatsForInputhNQ4ISI + 75) % 128;
                if (!bVar2.m26755(util.h.xy.f.a.f2185)) {
                    int i4 = getValidOutputFormatsForInputhNQ4ISI + 51;
                    getOutputMinFrameDurationlomOqCM = i4 % 128;
                    int i5 = i4 % 2;
                    return false;
                }
            }
        }
        return true;
    }

    @util.h.xy.a.a
    /* renamed from: ᐝ, reason: contains not printable characters */
    public final void m26782(util.h.xy.u.b bVar) {
        synchronized (this) {
            m26764(util.h.xy.f.ma.f2206, bVar.m27489(), false);
            try {
                util.h.xy.ak.ma.f84.m24976(bVar.m27489());
            } catch (java.lang.Exception e) {
                e.getMessage();
            }
        }
    }

    /* renamed from: ˏ, reason: contains not printable characters */
    public final util.h.xy.u.b m26775() {
        util.h.xy.u.b bVar;
        synchronized (this) {
            byte[] m26758 = m26758(util.h.xy.f.ma.f2206, false);
            if (m26758[0] != 1) {
                m26758[1] = -1;
            }
            util.h.xy.u.b m27488 = util.h.xy.u.b.m27488(m26758[1]);
            this.isOutputSupportedFor = m27488;
            if (m27488 == null) {
                this.isOutputSupportedFor = util.h.xy.u.b.f2434;
            }
            bVar = this.isOutputSupportedFor;
        }
        return bVar;
    }

    @util.h.xy.a.a
    /* renamed from: ˊ, reason: contains not printable characters */
    public final util.h.xy.u.b m26750() {
        util.h.xy.k.ra raVar;
        java.lang.String str;
        int i = getValidOutputFormatsForInputhNQ4ISI + 87;
        getOutputMinFrameDurationlomOqCM = i % 128;
        com.gemalto.mfs.mwsdk.dcm.DigitalizedCard digitalizedCard = null;
        if (i % 2 != 0) {
            util.h.xy.k.b.m26914(com.gemalto.mfs.mwsdk.dcm.PaymentType.CONTACTLESS);
            throw new java.lang.NullPointerException();
        }
        if (util.h.xy.k.b.m26914(com.gemalto.mfs.mwsdk.dcm.PaymentType.CONTACTLESS)) {
            digitalizedCard = util.h.xy.k.ra.f2243.m26963(util.h.xy.k.b.m26922(com.gemalto.mfs.mwsdk.dcm.PaymentType.CONTACTLESS));
            getOutputMinFrameDurationlomOqCM = (getValidOutputFormatsForInputhNQ4ISI + 7) % 128;
        }
        if (digitalizedCard == null) {
            try {
                java.lang.String[] m26919 = util.h.xy.k.b.m26919();
                if (m26919 != null && m26919.length > 0) {
                    int i2 = getOutputMinFrameDurationlomOqCM + 113;
                    getValidOutputFormatsForInputhNQ4ISI = i2 % 128;
                    if (i2 % 2 == 0) {
                        raVar = util.h.xy.k.ra.f2243;
                        str = m26919[0];
                    } else {
                        raVar = util.h.xy.k.ra.f2243;
                        str = m26919[0];
                    }
                    digitalizedCard = raVar.m26963(str);
                }
            } catch (java.lang.Exception unused) {
            }
        }
        int Camera2StreamConfigurationMap2 = Camera2StreamConfigurationMap(digitalizedCard);
        if (Camera2StreamConfigurationMap2 == 1) {
            getOutputMinFrameDurationlomOqCM = (getValidOutputFormatsForInputhNQ4ISI + com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CALENDAR_VALUE) % 128;
            f2201.m26782(util.h.xy.u.b.f2435);
            return util.h.xy.u.b.f2435;
        }
        if (Camera2StreamConfigurationMap2 == 2) {
            f2201.m26782(util.h.xy.u.b.f2433);
            return util.h.xy.u.b.f2433;
        }
        if (Camera2StreamConfigurationMap2 == 0) {
            f2201.m26782(util.h.xy.u.b.f2432);
            try {
                util.h.xy.j.ma.f2241.m26901(com.gemalto.mfs.mwsdk.payment.CHVerificationMethod.NONE);
            } catch (com.gemalto.mfs.mwsdk.exception.InternalComponentException unused2) {
            }
            return util.h.xy.u.b.f2432;
        }
        return util.h.xy.u.b.f2434;
    }

    private static int Camera2StreamConfigurationMap(com.gemalto.mfs.mwsdk.dcm.DigitalizedCard digitalizedCard) {
        int i = (getValidOutputFormatsForInputhNQ4ISI + 19) % 128;
        getOutputMinFrameDurationlomOqCM = i;
        if (digitalizedCard == null) {
            return -1;
        }
        getValidOutputFormatsForInputhNQ4ISI = (i + 67) % 128;
        try {
            java.lang.String m26921 = util.h.xy.k.b.m26921(digitalizedCard.getTokenizedCardID(), util.h.xy.d.ma.f1140);
            java.lang.Object[] objArr = new java.lang.Object[1];
            getHighResolutionOutputSizeshNQ4ISI(android.graphics.ImageFormat.getBitsPerPixel(0) + 128, "\u0084\u008b\u0084\u0091\u0089\u0098", objArr);
            java.lang.String m27506 = util.h.xy.u.d.m27506(m26921, ((java.lang.String) objArr[0]).intern());
            java.lang.String m269212 = util.h.xy.k.b.m26921(digitalizedCard.getTokenizedCardID(), util.h.xy.d.ma.f1142);
            if (m269212 == null) {
                return -1;
            }
            int i2 = getValidOutputFormatsForInputhNQ4ISI + 1;
            getOutputMinFrameDurationlomOqCM = i2 % 128;
            if (i2 % 2 != 0) {
                throw null;
            }
            if (m269212.length() == 0) {
                return -1;
            }
            getOutputMinFrameDurationlomOqCM = (getValidOutputFormatsForInputhNQ4ISI + 5) % 128;
            java.lang.String m275062 = util.h.xy.u.d.m27506(m269212, util.h.xy.s.ma.f2350);
            if (m275062 == null) {
                return -1;
            }
            int i3 = getValidOutputFormatsForInputhNQ4ISI + 29;
            getOutputMinFrameDurationlomOqCM = i3 % 128;
            if (i3 % 2 != 0) {
                throw null;
            }
            if (m275062.length() == 0) {
                return -1;
            }
            java.lang.Object[] objArr2 = new java.lang.Object[1];
            getHighSpeedVideoFpsRangesFor("␀풻㈵⌘", 4 - android.text.TextUtils.indexOf("", ""), objArr2);
            if (((java.lang.String) objArr2[0]).intern().equalsIgnoreCase(m27506)) {
                byte[] m25076 = util.h.xy.ar.b.m25076(util.h.xy.u.d.m27506(m275062, util.h.xy.s.rh.f2414));
                util.h.xy.ar.b.m25074(m25076);
                return util.h.xy.ar.b.m25083(m25076[2], 3);
            }
            java.lang.String m275063 = util.h.xy.u.d.m27506(m275062, util.h.xy.s.ma.f2353);
            if (m275063 == null || m275063.length() == 0) {
                return -1;
            }
            byte[] m250762 = util.h.xy.ar.b.m25076(m275063);
            util.h.xy.aq.ra m25039 = new util.h.xy.aq.mb().m25046(m250762, 0, m250762.length).m25039(new util.h.xy.aq.b(-126));
            m25039.m25051();
            int m25083 = util.h.xy.ar.b.m25083(m25039.m25047()[0], 1);
            try {
                java.lang.String m27074 = util.h.xy.s.b.m27074(m26921);
                java.lang.Object[] objArr3 = new java.lang.Object[1];
                getHighSpeedVideoFpsRangesFor("ء䵏烦栨", (android.os.SystemClock.uptimeMillis() > 0L ? 1 : (android.os.SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 2, objArr3);
                if (!m27074.equalsIgnoreCase(((java.lang.String) objArr3[0]).intern())) {
                    return m25083;
                }
                java.lang.String m275064 = util.h.xy.u.d.m27506(m269212, util.h.xy.s.md.f2394);
                java.lang.Object[] objArr4 = new java.lang.Object[1];
                getHighSpeedVideoFpsRangesFor("䣹Ხ緻衴낤䶹퍑螠罄ᘸ쵎䜖", android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask) + 13, objArr4);
                if (m275064.equalsIgnoreCase(((java.lang.String) objArr4[0]).intern())) {
                    return 2;
                }
                return m25083;
            } catch (org.json.JSONException unused) {
                return m25083;
            }
        } catch (com.gemalto.mfs.mwsdk.exception.InternalComponentException e) {
            e.getMessage();
            return -1;
        }
    }

    @util.h.xy.a.a
    /* renamed from: ˏ, reason: contains not printable characters */
    public final void m26776(java.lang.String str, util.h.xy.d.mg mgVar, boolean z) {
        java.lang.Object[] objArr = new java.lang.Object[1];
        getHighSpeedVideoFpsRangesFor("ᚠ\udb4b坔ꄺ㓘ҍ\ua7e1そ\udf51ᰀ\u0de2\ud989", 11 - (android.graphics.PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (android.graphics.PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), objArr);
        ((java.lang.String) objArr[0]).intern();
        if (!util.h.xy.u.c.m27504(str, z) || mgVar == util.h.xy.d.mg.f1144) {
            try {
                try {
                    this.unwrapAs.lock();
                    if (util.h.xy.k.ra.f2243.m26968(str)) {
                        byte[] m26779 = m26779(str);
                        if (java.util.Arrays.equals(m26779, com.gemalto.mfs.mwsdk.dcm.sdkconfig.ProfileChannel.CONTACTLESS.getCode())) {
                            if (mgVar == util.h.xy.d.mg.f1144) {
                                Camera2StreamConfigurationMap(str, com.gemalto.mfs.mwsdk.dcm.PaymentType.CONTACTLESS, false, z);
                            } else {
                                Camera2StreamConfigurationMap(str, com.gemalto.mfs.mwsdk.dcm.PaymentType.CONTACTLESS, true, z);
                            }
                        } else if (java.util.Arrays.equals(m26779, com.gemalto.mfs.mwsdk.dcm.sdkconfig.ProfileChannel.QR.getCode())) {
                            com.gemalto.mfs.mwsdk.dcm.PaymentType paymentType = com.gemalto.mfs.mwsdk.dcm.PaymentType.QR;
                            java.lang.Object[] objArr2 = new java.lang.Object[1];
                            getHighSpeedVideoFpsRangesFor("袓傮", 2 - android.graphics.Color.argb(0, 0, 0, 0), objArr2);
                            ((java.lang.String) objArr2[0]).intern();
                            Camera2StreamConfigurationMap(str, paymentType, true, z);
                        } else if (java.util.Arrays.equals(m26779, com.gemalto.mfs.mwsdk.dcm.sdkconfig.ProfileChannel.DSRP.getCode())) {
                            getOutputMinFrameDurationlomOqCM = (getValidOutputFormatsForInputhNQ4ISI + 125) % 128;
                            com.gemalto.mfs.mwsdk.dcm.PaymentType paymentType2 = com.gemalto.mfs.mwsdk.dcm.PaymentType.DSRP;
                            java.lang.Object[] objArr3 = new java.lang.Object[1];
                            getHighResolutionOutputSizeshNQ4ISI((android.media.AudioTrack.getMaxVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 126, "\u009b\u009a\u0095\u0099", objArr3);
                            ((java.lang.String) objArr3[0]).intern();
                            Camera2StreamConfigurationMap(str, paymentType2, true, z);
                        } else if (java.util.Arrays.equals(m26779, com.gemalto.mfs.mwsdk.dcm.sdkconfig.ProfileChannel.CONTACTLESS_AND_QR.getCode())) {
                            Camera2StreamConfigurationMap(str, com.gemalto.mfs.mwsdk.dcm.PaymentType.CONTACTLESS, false, z);
                            com.gemalto.mfs.mwsdk.dcm.PaymentType paymentType3 = com.gemalto.mfs.mwsdk.dcm.PaymentType.QR;
                            java.lang.Object[] objArr4 = new java.lang.Object[1];
                            getHighSpeedVideoFpsRangesFor("袓傮", 1 - android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask), objArr4);
                            ((java.lang.String) objArr4[0]).intern();
                            Camera2StreamConfigurationMap(str, paymentType3, true, z);
                        } else if (java.util.Arrays.equals(m26779, com.gemalto.mfs.mwsdk.dcm.sdkconfig.ProfileChannel.CONTACTLESS_AND_DSRP.getCode())) {
                            Camera2StreamConfigurationMap(str, com.gemalto.mfs.mwsdk.dcm.PaymentType.CONTACTLESS, false, z);
                            com.gemalto.mfs.mwsdk.dcm.PaymentType paymentType4 = com.gemalto.mfs.mwsdk.dcm.PaymentType.DSRP;
                            java.lang.Object[] objArr5 = new java.lang.Object[1];
                            getHighResolutionOutputSizeshNQ4ISI((android.view.ViewConfiguration.getMinimumFlingVelocity() >> 16) + 127, "\u009b\u009a\u0095\u0099", objArr5);
                            ((java.lang.String) objArr5[0]).intern();
                            Camera2StreamConfigurationMap(str, paymentType4, true, z);
                        } else if (java.util.Arrays.equals(m26779, com.gemalto.mfs.mwsdk.dcm.sdkconfig.ProfileChannel.CONTACTLESS_AND_DSRP_AND_QR.getCode())) {
                            Camera2StreamConfigurationMap(str, com.gemalto.mfs.mwsdk.dcm.PaymentType.CONTACTLESS, false, z);
                            com.gemalto.mfs.mwsdk.dcm.PaymentType paymentType5 = com.gemalto.mfs.mwsdk.dcm.PaymentType.DSRP;
                            java.lang.Object[] objArr6 = new java.lang.Object[1];
                            getHighResolutionOutputSizeshNQ4ISI(android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask) + 128, "\u009b\u009a\u0095\u0099", objArr6);
                            ((java.lang.String) objArr6[0]).intern();
                            Camera2StreamConfigurationMap(str, paymentType5, true, z);
                            com.gemalto.mfs.mwsdk.dcm.PaymentType paymentType6 = com.gemalto.mfs.mwsdk.dcm.PaymentType.QR;
                            java.lang.Object[] objArr7 = new java.lang.Object[1];
                            getHighSpeedVideoFpsRangesFor("袓傮", (android.view.ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 1, objArr7);
                            ((java.lang.String) objArr7[0]).intern();
                            Camera2StreamConfigurationMap(str, paymentType6, true, z);
                            getOutputMinFrameDurationlomOqCM = (getValidOutputFormatsForInputhNQ4ISI + 25) % 128;
                        }
                    }
                } catch (com.gemalto.mfs.mwsdk.exception.InternalComponentException e) {
                    e.getMessage();
                }
            } finally {
                this.unwrapAs.unlock();
            }
        }
    }

    private void Camera2StreamConfigurationMap(java.lang.String str, com.gemalto.mfs.mwsdk.dcm.PaymentType paymentType, boolean z, boolean z2) throws com.gemalto.mfs.mwsdk.exception.InternalComponentException {
        int i = getValidOutputFormatsForInputhNQ4ISI + 33;
        getOutputMinFrameDurationlomOqCM = i % 128;
        if (i % 2 == 0) {
            com.gemalto.mfs.mwsdk.utils.async.AsyncResult<util.h.xy.d.ra> highSpeedVideoSizes = getHighSpeedVideoSizes(str, paymentType, z, z2);
            if (highSpeedVideoSizes == null) {
                return;
            }
            if (highSpeedVideoSizes.isSuccessful()) {
                try {
                    Camera2StreamConfigurationMap(highSpeedVideoSizes, paymentType, str, z2);
                    return;
                } catch (org.json.JSONException e) {
                    e.getMessage();
                    java.lang.Object[] objArr = new java.lang.Object[1];
                    getHighResolutionOutputSizeshNQ4ISI(android.view.KeyEvent.getDeadChar(0, 0) + 127, "\u0090\u0082\u008f\u008e\u0085\u008a\u008d\u0088\u0083\u008a\u0082\u0088\u0083\u0082\u0084\u0082\u008a\u008c\u008b\u008a\u0089\u0088\u0087\u0086\u0082\u0085\u0084\u0083\u0082\u0081", objArr);
                    throw new com.gemalto.mfs.mwsdk.exception.InternalComponentException(((java.lang.String) objArr[0]).intern(), e);
                }
            }
            highSpeedVideoSizes.getErrorMessage();
            getValidOutputFormatsForInputhNQ4ISI = (getOutputMinFrameDurationlomOqCM + 5) % 128;
            return;
        }
        getHighSpeedVideoSizes(str, paymentType, z, z2);
        throw null;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(10:0|1|(3:3|4|5)(4:19|20|21|(6:23|7|8|9|10|11))|6|7|8|9|10|11|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x003b, code lost:
    
        r4 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x003c, code lost:
    
        r1 = r0;
     */
    @util.h.xy.a.a
    /* renamed from: ˋ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean m26766(byte[] bArr, byte[] bArr2) {
        byte[] m27603;
        boolean z;
        int i = getOutputMinFrameDurationlomOqCM + 19;
        getValidOutputFormatsForInputhNQ4ISI = i % 128;
        boolean z2 = true;
        if (i % 2 == 0) {
            try {
                m27603 = util.h.xy.v.b.f2439.m27603(getHighSpeedVideoFpsRangesFor(bArr, bArr2));
                byte b = m27603[0];
            } catch (com.gemalto.mfs.mwsdk.exception.InternalComponentException e) {
                e = e;
                e.getMessage();
                z = z2;
                getOutputMinFrameDurationlomOqCM = (getValidOutputFormatsForInputhNQ4ISI + 125) % 128;
                return z;
            }
        } else {
            try {
                m27603 = util.h.xy.v.b.f2439.m27603(getHighSpeedVideoFpsRangesFor(bArr, bArr2));
            } catch (com.gemalto.mfs.mwsdk.exception.InternalComponentException e2) {
                e = e2;
                z2 = false;
                e.getMessage();
                z = z2;
                getOutputMinFrameDurationlomOqCM = (getValidOutputFormatsForInputhNQ4ISI + 125) % 128;
                return z;
            }
            if (m27603[0] != 1) {
                z = false;
                util.h.xy.ar.b.m25098(bArr);
                byte b2 = m27603[0];
                getValidOutputFormatsForInputhNQ4ISI = (getOutputMinFrameDurationlomOqCM + 1) % 128;
                getOutputMinFrameDurationlomOqCM = (getValidOutputFormatsForInputhNQ4ISI + 125) % 128;
                return z;
            }
        }
        z = true;
        util.h.xy.ar.b.m25098(bArr);
        byte b22 = m27603[0];
        getValidOutputFormatsForInputhNQ4ISI = (getOutputMinFrameDurationlomOqCM + 1) % 128;
        getOutputMinFrameDurationlomOqCM = (getValidOutputFormatsForInputhNQ4ISI + 125) % 128;
        return z;
    }

    @util.h.xy.a.a
    /* renamed from: ᐝ, reason: contains not printable characters */
    public final boolean m26783() {
        getValidOutputFormatsForInputhNQ4ISI = (getOutputMinFrameDurationlomOqCM + 61) % 128;
        boolean z = false;
        try {
            try {
                this.unwrapAs.lock();
                getOutputMinFrameDurationlomOqCM = (getValidOutputFormatsForInputhNQ4ISI + 87) % 128;
                try {
                    java.lang.Object[] objArr = new java.lang.Object[1];
                    getHighResolutionOutputSizeshNQ4ISI("儌举潢ಬⶬ초\uea55變\ua8db䠕椵١➳쒭\ue42b蕔ꊕ䏚挖8⅀\udeaa￮鼝뱑嶚", 7992 - android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0), objArr);
                    java.security.SecureRandom secureRandom = (java.security.SecureRandom) java.lang.Class.forName((java.lang.String) objArr[0]).getDeclaredConstructor(null).newInstance(null);
                    byte[] bArr = new byte[16];
                    secureRandom.nextBytes(bArr);
                    if (util.h.xy.v.b.f2439.m27625(bArr)[0] == 1) {
                        z = true;
                    }
                } catch (java.lang.Throwable th) {
                    java.lang.Throwable cause = th.getCause();
                    if (cause != null) {
                        throw cause;
                    }
                    throw th;
                }
            } finally {
                this.unwrapAs.unlock();
            }
        } catch (com.gemalto.mfs.mwsdk.exception.InternalComponentException e) {
            e.getMessage();
        }
        return z;
    }

    /* renamed from: ʼ, reason: contains not printable characters */
    public final void m26747() {
        try {
            try {
                this.unwrapAs.lock();
                getValidOutputFormatsForInputhNQ4ISI = (getOutputMinFrameDurationlomOqCM + 49) % 128;
                try {
                    java.lang.Object[] objArr = new java.lang.Object[1];
                    getHighResolutionOutputSizeshNQ4ISI("儌举潢ಬⶬ초\uea55變\ua8db䠕椵١➳쒭\ue42b蕔ꊕ䏚挖8⅀\udeaa￮鼝뱑嶚", 7993 - android.graphics.drawable.Drawable.resolveOpacity(0, 0), objArr);
                    byte[] bArr = new byte[16];
                    ((java.security.SecureRandom) java.lang.Class.forName((java.lang.String) objArr[0]).getDeclaredConstructor(null).newInstance(null)).nextBytes(bArr);
                    util.h.xy.v.b.f2439.m27606(bArr);
                    this.unwrapAs.unlock();
                    getOutputMinFrameDurationlomOqCM = (getValidOutputFormatsForInputhNQ4ISI + 99) % 128;
                } catch (java.lang.Throwable th) {
                    java.lang.Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            } catch (java.lang.Throwable th2) {
                this.unwrapAs.unlock();
                throw th2;
            }
        } catch (com.gemalto.mfs.mwsdk.exception.InternalComponentException e) {
            e.getMessage();
            this.unwrapAs.unlock();
        }
    }

    @util.h.xy.a.a
    /* renamed from: ˋ, reason: contains not printable characters */
    public final void m26760(java.lang.String str, java.lang.String str2, com.gemalto.mfs.mwsdk.dcm.PaymentType paymentType) throws com.gemalto.mfs.mwsdk.exception.InternalComponentException {
        int i = util.h.xy.f.b.AnonymousClass5.getHighSpeedVideoSizes[getHighSpeedVideoFpsRanges(str2).ordinal()];
        if (i == 1) {
            getOutputMinFrameDurationlomOqCM = (getValidOutputFormatsForInputhNQ4ISI + 79) % 128;
            try {
                util.h.xy.v.b.f2439.m27614(m26786(str));
                getValidOutputFormatsForInputhNQ4ISI = (getOutputMinFrameDurationlomOqCM + 121) % 128;
            } catch (com.gemalto.mfs.mwsdk.exception.InternalComponentException e) {
                e.getMessage();
            }
            getOutputMinFrameDurationlomOqCM = (getValidOutputFormatsForInputhNQ4ISI + 49) % 128;
        } else if (i == 2) {
            int i2 = getOutputMinFrameDurationlomOqCM + 41;
            getValidOutputFormatsForInputhNQ4ISI = i2 % 128;
            int i3 = i2 % 2;
            byte[] m26786 = m26786(str);
            if (i3 == 0) {
                int length = m26786.length;
                util.h.xy.v.b.f2439.m27582(m26786);
                throw null;
            }
            int length2 = m26786.length;
            util.h.xy.v.b.f2439.m27582(m26786);
            getValidOutputFormatsForInputhNQ4ISI = (getOutputMinFrameDurationlomOqCM + 65) % 128;
        } else if (i == 3) {
            int i4 = getValidOutputFormatsForInputhNQ4ISI + 11;
            getOutputMinFrameDurationlomOqCM = i4 % 128;
            if (i4 % 2 != 0) {
                throw new java.lang.ArithmeticException();
            }
            if (str == null || str.length() == 0) {
                getOutputMinFrameDurationlomOqCM = (getValidOutputFormatsForInputhNQ4ISI + 61) % 128;
            } else {
                byte[] m26780 = m26780(str, str2, paymentType);
                byte[] m27056 = util.h.xy.q.b.m27056(m26780);
                util.h.xy.ar.b.m25095(m26780);
                try {
                    util.h.xy.v.b.f2439.m27611(m27056);
                } catch (com.gemalto.mfs.mwsdk.exception.InternalComponentException e2) {
                    e2.getMessage();
                }
                util.h.xy.ar.b.m25095(m27056);
            }
            getOutputMinFrameDurationlomOqCM = (getValidOutputFormatsForInputhNQ4ISI + 49) % 128;
        }
        int i5 = getOutputMinFrameDurationlomOqCM + 95;
        getValidOutputFormatsForInputhNQ4ISI = i5 % 128;
        if (i5 % 2 == 0) {
            throw new java.lang.ArithmeticException();
        }
    }

    @util.h.xy.a.a
    /* renamed from: ˊ, reason: contains not printable characters */
    public final void m26751(java.lang.String str, java.lang.String str2, com.gemalto.mfs.mwsdk.dcm.PaymentType paymentType) throws com.gemalto.mfs.mwsdk.exception.InternalComponentException {
        int i = getValidOutputFormatsForInputhNQ4ISI + 9;
        getOutputMinFrameDurationlomOqCM = i % 128;
        if (i % 2 != 0) {
            int i2 = util.h.xy.f.b.AnonymousClass5.getHighSpeedVideoSizes[getHighSpeedVideoFpsRanges(str2).ordinal()];
            throw null;
        }
        int i3 = util.h.xy.f.b.AnonymousClass5.getHighSpeedVideoSizes[getHighSpeedVideoFpsRanges(str2).ordinal()];
        if (i3 == 1) {
            getValidOutputFormatsForInputhNQ4ISI = (getOutputMinFrameDurationlomOqCM + 37) % 128;
            try {
                try {
                    this.unwrapAs.lock();
                    util.h.xy.v.b.f2439.m27617(m26786(str));
                } finally {
                }
            } catch (com.gemalto.mfs.mwsdk.exception.InternalComponentException e) {
                e.getMessage();
            }
            this.unwrapAs.unlock();
            int i4 = getValidOutputFormatsForInputhNQ4ISI + 57;
            getOutputMinFrameDurationlomOqCM = i4 % 128;
            if (i4 % 2 != 0) {
                throw null;
            }
            return;
        }
        if (i3 == 2) {
            getOutputMinFrameDurationlomOqCM = (getValidOutputFormatsForInputhNQ4ISI + 83) % 128;
            byte[] m26786 = m26786(str);
            try {
                this.unwrapAs.lock();
                util.h.xy.v.b.f2439.m27600(m26786);
                this.unwrapAs.unlock();
                int i5 = (getValidOutputFormatsForInputhNQ4ISI + 119) % 128;
                getOutputMinFrameDurationlomOqCM = i5;
                int i6 = i5 + 117;
                getValidOutputFormatsForInputhNQ4ISI = i6 % 128;
                if (i6 % 2 == 0) {
                    throw null;
                }
                return;
            } finally {
            }
        }
        if (i3 != 3) {
            return;
        }
        int i7 = (getValidOutputFormatsForInputhNQ4ISI + 53) % 128;
        getOutputMinFrameDurationlomOqCM = i7;
        if (str != null) {
            getValidOutputFormatsForInputhNQ4ISI = (i7 + 95) % 128;
            if (str.length() != 0) {
                byte[] m26780 = m26780(str, str2, paymentType);
                byte[] m27056 = util.h.xy.q.b.m27056(m26780);
                util.h.xy.ar.b.m25095(m26780);
                try {
                    util.h.xy.v.b.f2439.m27620(m27056);
                } catch (com.gemalto.mfs.mwsdk.exception.InternalComponentException e2) {
                    e2.getMessage();
                }
                util.h.xy.ar.b.m25095(m27056);
            }
        }
        getOutputMinFrameDurationlomOqCM = (getValidOutputFormatsForInputhNQ4ISI + 33) % 128;
    }

    @util.h.xy.a.a
    /* renamed from: ʽ, reason: contains not printable characters */
    public final boolean m26748() {
        getValidOutputFormatsForInputhNQ4ISI = (getOutputMinFrameDurationlomOqCM + 81) % 128;
        boolean z = false;
        try {
            try {
                this.unwrapAs.lock();
                if (util.h.xy.v.b.f2439.m27612(new byte[]{0, 34})[0] == 1) {
                    int i = (getValidOutputFormatsForInputhNQ4ISI + 23) % 128;
                    getOutputMinFrameDurationlomOqCM = i;
                    getValidOutputFormatsForInputhNQ4ISI = (i + com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CALENDAR_VALUE) % 128;
                    z = true;
                }
            } catch (com.gemalto.mfs.mwsdk.exception.InternalComponentException e) {
                e.getMessage();
            }
            return z;
        } finally {
            this.unwrapAs.unlock();
        }
    }

    private static byte[] getHighSpeedVideoFpsRangesFor(byte[] bArr, byte[] bArr2) {
        byte[] bArr3;
        int i = getValidOutputFormatsForInputhNQ4ISI + 55;
        getOutputMinFrameDurationlomOqCM = i % 128;
        if (i % 2 != 0) {
            bArr3 = new byte[bArr.length >>> bArr2.length];
            java.lang.System.arraycopy(bArr2, 0, bArr3, 1, bArr2.length);
        } else {
            bArr3 = new byte[bArr.length + bArr2.length];
            java.lang.System.arraycopy(bArr2, 0, bArr3, 0, bArr2.length);
        }
        for (int length = bArr2.length; length < bArr3.length; length++) {
            bArr3[length] = bArr[length - bArr2.length];
        }
        getValidOutputFormatsForInputhNQ4ISI = (getOutputMinFrameDurationlomOqCM + 121) % 128;
        return bArr3;
    }

    /* renamed from: ˎ, reason: contains not printable characters */
    public final void m26771(java.lang.String str, boolean z) throws org.json.JSONException, com.gemalto.mfs.mwsdk.exception.InternalComponentException {
        int i = getOutputMinFrameDurationlomOqCM + 23;
        getValidOutputFormatsForInputhNQ4ISI = i % 128;
        if (i % 2 != 0) {
            getHighSpeedVideoSizes(str, z);
        } else {
            getHighSpeedVideoSizes(str, z);
            throw null;
        }
    }

    private static void getHighSpeedVideoFpsRanges(java.lang.String str, java.lang.String str2, boolean z) {
        util.h.xy.f.mb.f2209.m26788(str, str2);
        byte[] bArr = {0};
        java.lang.Object[] objArr = new java.lang.Object[1];
        getHighResolutionOutputSizeshNQ4ISI((android.view.KeyEvent.getMaxKeyCode() >> 16) + 127, "\u009d\u0095\u0081\u009c", objArr);
        if (((java.lang.String) objArr[0]).intern().equals(str2)) {
            bArr[0] = 2;
        } else {
            java.lang.Object[] objArr2 = new java.lang.Object[1];
            getHighResolutionOutputSizeshNQ4ISI(127 - android.view.KeyEvent.getDeadChar(0, 0), "\u0099\u009a\u009d\u0096\u009a\u0097\u009f\u0095\u009d\u009e", objArr2);
            if (!((java.lang.String) objArr2[0]).intern().equals(str2)) {
                java.lang.Object[] objArr3 = new java.lang.Object[1];
                getHighResolutionOutputSizeshNQ4ISI(android.graphics.Color.alpha(0) + 127, "\u0097\u009a \u009b", objArr3);
                if (((java.lang.String) objArr3[0]).intern().equals(str2)) {
                    int i = getValidOutputFormatsForInputhNQ4ISI + 7;
                    int i2 = i % 128;
                    getOutputMinFrameDurationlomOqCM = i2;
                    if (i % 2 != 0) {
                        bArr[1] = 4;
                    } else {
                        bArr[0] = 3;
                    }
                    int i3 = i2 + 115;
                    getValidOutputFormatsForInputhNQ4ISI = i3 % 128;
                    int i4 = i3 % 2;
                }
            } else {
                getOutputMinFrameDurationlomOqCM = (getValidOutputFormatsForInputhNQ4ISI + 101) % 128;
                bArr[0] = 1;
            }
        }
        f2201.m26764(util.h.xy.f.ma.f2203, bArr, z);
        util.h.xy.ar.b.m25074(bArr);
    }

    /* renamed from: ˏ, reason: contains not printable characters */
    public final void m26777(java.lang.String str, boolean z) throws com.gemalto.mfs.mwsdk.exception.InternalComponentException {
        byte[] m26779;
        com.gemalto.mfs.mwsdk.utils.async.AsyncResult<util.h.xy.d.ra> highSpeedVideoSizes;
        getOutputMinFrameDurationlomOqCM = (getValidOutputFormatsForInputhNQ4ISI + 21) % 128;
        util.h.xy.d.mg m26768 = m26768(str);
        if (m26768 == null) {
            int i = getOutputMinFrameDurationlomOqCM + 1;
            getValidOutputFormatsForInputhNQ4ISI = i % 128;
            if (i % 2 == 0) {
                throw null;
            }
            return;
        }
        if (z) {
            m26779 = m26756(str);
        } else {
            m26779 = m26779(str);
        }
        if (m26779 != null) {
            if (m26768 != util.h.xy.d.mg.f1145) {
                if (m26768 != util.h.xy.d.mg.f1144 || (highSpeedVideoSizes = getHighSpeedVideoSizes(str, com.gemalto.mfs.mwsdk.dcm.PaymentType.CONTACTLESS, false, z)) == null) {
                    return;
                }
                highSpeedVideoSizes.getResult().m26219();
                if (!highSpeedVideoSizes.isSuccessful() || highSpeedVideoSizes.getResult().m26224() <= 0) {
                    return;
                }
                try {
                    Camera2StreamConfigurationMap(highSpeedVideoSizes, com.gemalto.mfs.mwsdk.dcm.PaymentType.CONTACTLESS, str, z);
                    return;
                } catch (org.json.JSONException e) {
                    e.getMessage();
                    java.lang.Object[] objArr = new java.lang.Object[1];
                    getHighResolutionOutputSizeshNQ4ISI((android.view.ViewConfiguration.getJumpTapTimeout() >> 16) + 127, "\u0090\u0082\u008f\u008e\u0085\u008a\u008d\u0088\u0083\u008a\u0082\u0088\u0083\u0082\u0084\u0082\u008a\u008c\u008b\u008a\u0089\u0088\u0087\u0086\u0082\u0085\u0084\u0083\u0082\u0081", objArr);
                    throw new com.gemalto.mfs.mwsdk.exception.InternalComponentException(((java.lang.String) objArr[0]).intern(), e);
                }
            }
            if (!java.util.Arrays.equals(m26779, com.gemalto.mfs.mwsdk.dcm.sdkconfig.ProfileChannel.CONTACTLESS.getCode())) {
                if (java.util.Arrays.equals(m26779, com.gemalto.mfs.mwsdk.dcm.sdkconfig.ProfileChannel.QR.getCode())) {
                    getHighSpeedVideoSizes(str, com.gemalto.mfs.mwsdk.dcm.sdkconfig.ProfileChannel.QR, z);
                    return;
                }
                if (java.util.Arrays.equals(m26779, com.gemalto.mfs.mwsdk.dcm.sdkconfig.ProfileChannel.DSRP.getCode())) {
                    getHighSpeedVideoSizes(str, com.gemalto.mfs.mwsdk.dcm.sdkconfig.ProfileChannel.DSRP, z);
                    return;
                }
                if (java.util.Arrays.equals(m26779, com.gemalto.mfs.mwsdk.dcm.sdkconfig.ProfileChannel.CONTACTLESS_AND_QR.getCode())) {
                    getHighSpeedVideoSizes(str, com.gemalto.mfs.mwsdk.dcm.sdkconfig.ProfileChannel.CONTACTLESS_AND_QR, z);
                    return;
                }
                if (java.util.Arrays.equals(m26779, com.gemalto.mfs.mwsdk.dcm.sdkconfig.ProfileChannel.CONTACTLESS_AND_DSRP.getCode())) {
                    getHighSpeedVideoSizes(str, com.gemalto.mfs.mwsdk.dcm.sdkconfig.ProfileChannel.CONTACTLESS_AND_DSRP, z);
                    return;
                }
                if (java.util.Arrays.equals(m26779, com.gemalto.mfs.mwsdk.dcm.sdkconfig.ProfileChannel.CONTACTLESS_AND_DSRP_AND_QR.getCode())) {
                    int i2 = getOutputMinFrameDurationlomOqCM + 113;
                    getValidOutputFormatsForInputhNQ4ISI = i2 % 128;
                    if (i2 % 2 != 0) {
                        getHighSpeedVideoSizes(str, com.gemalto.mfs.mwsdk.dcm.sdkconfig.ProfileChannel.CONTACTLESS_AND_DSRP_AND_QR, z);
                        return;
                    } else {
                        getHighSpeedVideoSizes(str, com.gemalto.mfs.mwsdk.dcm.sdkconfig.ProfileChannel.CONTACTLESS_AND_DSRP_AND_QR, z);
                        throw null;
                    }
                }
                return;
            }
            int i3 = getOutputMinFrameDurationlomOqCM + 69;
            getValidOutputFormatsForInputhNQ4ISI = i3 % 128;
            if (i3 % 2 != 0) {
                getHighSpeedVideoSizes(str, com.gemalto.mfs.mwsdk.dcm.sdkconfig.ProfileChannel.CONTACTLESS, z);
            } else {
                getHighSpeedVideoSizes(str, com.gemalto.mfs.mwsdk.dcm.sdkconfig.ProfileChannel.CONTACTLESS, z);
                throw new java.lang.ArithmeticException();
            }
        }
    }

    /* renamed from: ˏ, reason: contains not printable characters */
    public final byte[] m26779(java.lang.String str) {
        int i = getOutputMinFrameDurationlomOqCM + 89;
        getValidOutputFormatsForInputhNQ4ISI = i % 128;
        if (i % 2 != 0) {
            byte[] m26789 = util.h.xy.f.mb.f2209.m26789(str);
            util.h.xy.ar.b.m25074(m26789);
            if (m26789 != null) {
                getOutputMinFrameDurationlomOqCM = (getValidOutputFormatsForInputhNQ4ISI + 113) % 128;
                if (m26789.length > 0) {
                    return m26789;
                }
            }
            try {
                m26789 = util.h.xy.ak.ma.f84.m24984();
                util.h.xy.f.mb.f2209.m26791(str, m26789);
                return m26789;
            } catch (java.lang.Exception unused) {
                return m26789;
            }
        }
        util.h.xy.ar.b.m25074(util.h.xy.f.mb.f2209.m26789(str));
        throw null;
    }

    /* renamed from: ˊ, reason: contains not printable characters */
    public final byte[] m26756(java.lang.String str) {
        int i = getOutputMinFrameDurationlomOqCM + 49;
        getValidOutputFormatsForInputhNQ4ISI = i % 128;
        if (i % 2 != 0) {
            byte[] m26789 = util.h.xy.f.mb.f2209.m26789(str);
            util.h.xy.ar.b.m25074(m26789);
            if (m26789 == null || m26789.length <= 0) {
                try {
                    m26789 = util.h.xy.ak.ma.f84.m24989();
                    util.h.xy.f.mb.f2209.m26791(str, m26789);
                } catch (java.lang.Exception unused) {
                }
            }
            int i2 = getOutputMinFrameDurationlomOqCM + 1;
            getValidOutputFormatsForInputhNQ4ISI = i2 % 128;
            if (i2 % 2 != 0) {
                return m26789;
            }
            throw null;
        }
        util.h.xy.ar.b.m25074(util.h.xy.f.mb.f2209.m26789(str));
        throw new java.lang.ArithmeticException();
    }

    /* renamed from: ˋ, reason: contains not printable characters */
    public final java.lang.String m26759(java.lang.String str) throws org.json.JSONException {
        java.lang.String m26790 = util.h.xy.f.mb.f2209.m26790(str);
        if (m26790 == null || m26790.length() <= 0) {
            try {
                java.lang.String m26921 = util.h.xy.k.b.m26921(str, util.h.xy.d.ma.f1140);
                if (m26921 == null) {
                    return null;
                }
                getOutputMinFrameDurationlomOqCM = (getValidOutputFormatsForInputhNQ4ISI + com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CALENDAR_VALUE) % 128;
                if (m26921.isEmpty()) {
                    return null;
                }
                org.json.JSONObject jSONObject = new org.json.JSONObject(m26921);
                java.lang.Object[] objArr = new java.lang.Object[1];
                getHighResolutionOutputSizeshNQ4ISI(android.widget.ExpandableListView.getPackedPositionType(0L) + 127, "\u0084\u008b\u0084\u0091\u0089\u0098", objArr);
                java.lang.String upperCase = jSONObject.getString(((java.lang.String) objArr[0]).intern()).toUpperCase(java.util.Locale.getDefault());
                util.h.xy.f.mb.f2209.m26788(str, upperCase);
                return upperCase;
            } catch (com.gemalto.mfs.mwsdk.exception.InternalComponentException e) {
                e.getMessage();
                return null;
            }
        }
        int i = getOutputMinFrameDurationlomOqCM + 75;
        getValidOutputFormatsForInputhNQ4ISI = i % 128;
        if (i % 2 != 0) {
            return m26790;
        }
        throw new java.lang.ArithmeticException();
    }

    private static void getHighSpeedVideoSizes(java.lang.String str, boolean z) throws org.json.JSONException, com.gemalto.mfs.mwsdk.exception.InternalComponentException {
        getOutputMinFrameDurationlomOqCM = (getValidOutputFormatsForInputhNQ4ISI + 21) % 128;
        com.gemalto.mfs.mwsdk.utils.async.AsyncResult<util.h.xy.q.b.mb> m27060 = util.h.xy.q.b.m27060(str, z);
        if (m27060.isSuccessful()) {
            util.h.xy.q.b.mb result = m27060.getResult();
            if (!z) {
                getHighSpeedVideoFpsRanges(str, result.m27062());
            } else {
                int i = getOutputMinFrameDurationlomOqCM + 99;
                getValidOutputFormatsForInputhNQ4ISI = i % 128;
                if (i % 2 == 0) {
                    getHighResolutionOutputSizeshNQ4ISI(str, result.m27062());
                    throw null;
                }
                getHighResolutionOutputSizeshNQ4ISI(str, result.m27062());
            }
            getHighSpeedVideoFpsRanges(str, result.m27061().m27376().m27066().toString().toUpperCase(), z);
            getValidOutputFormatsForInputhNQ4ISI = (getOutputMinFrameDurationlomOqCM + 91) % 128;
            return;
        }
        m27060.getErrorCode();
        m27060.getErrorMessage();
    }

    private static void getHighSpeedVideoFpsRanges(java.lang.String str, com.gemalto.mfs.mwsdk.dcm.sdkconfig.ProfileChannel profileChannel) {
        int i = getValidOutputFormatsForInputhNQ4ISI + 37;
        getOutputMinFrameDurationlomOqCM = i % 128;
        if (i % 2 == 0) {
            util.h.xy.ak.ma.f84.m24983(profileChannel.getCode());
            util.h.xy.f.mb.f2209.m26791(str, profileChannel.getCode());
            int i2 = getValidOutputFormatsForInputhNQ4ISI + 49;
            getOutputMinFrameDurationlomOqCM = i2 % 128;
            if (i2 % 2 != 0) {
                throw null;
            }
            return;
        }
        util.h.xy.ak.ma.f84.m24983(profileChannel.getCode());
        util.h.xy.f.mb.f2209.m26791(str, profileChannel.getCode());
        throw new java.lang.NullPointerException();
    }

    private static void getHighResolutionOutputSizeshNQ4ISI(java.lang.String str, com.gemalto.mfs.mwsdk.dcm.sdkconfig.ProfileChannel profileChannel) {
        getValidOutputFormatsForInputhNQ4ISI = (getOutputMinFrameDurationlomOqCM + 93) % 128;
        try {
            util.h.xy.ak.ma.f84.m24994(profileChannel.getCode());
            util.h.xy.f.mb.f2209.m26791(str, profileChannel.getCode());
        } catch (java.lang.Exception unused) {
        }
        int i = getOutputMinFrameDurationlomOqCM + 81;
        getValidOutputFormatsForInputhNQ4ISI = i % 128;
        if (i % 2 == 0) {
            throw new java.lang.ArithmeticException();
        }
    }

    /* renamed from: ᐝ, reason: contains not printable characters */
    public final byte[] m26786(java.lang.String str) {
        byte[] bytes = str.getBytes();
        int length = bytes.length;
        if (length <= 1024) {
            byte[] m25088 = util.h.xy.ar.b.m25088(length);
            byte[] bArr = new byte[m25088.length + length];
            java.lang.System.arraycopy(m25088, 0, bArr, 0, m25088.length);
            java.lang.System.arraycopy(bytes, 0, bArr, m25088.length, length);
            util.h.xy.ar.b.m25074(m25088);
            util.h.xy.ar.b.m25074(bArr);
            byte[] m27059 = util.h.xy.q.b.m27059(bArr);
            int length2 = m27059.length;
            return m27059;
        }
        int i = (getOutputMinFrameDurationlomOqCM + 97) % 128;
        getValidOutputFormatsForInputhNQ4ISI = i;
        getOutputMinFrameDurationlomOqCM = (i + 27) % 128;
        return null;
    }

    /* renamed from: ˊ, reason: contains not printable characters */
    public final void m26752(java.lang.String str, boolean z) throws com.gemalto.mfs.mwsdk.exception.InternalComponentException {
        int i = getOutputMinFrameDurationlomOqCM + 73;
        getValidOutputFormatsForInputhNQ4ISI = i % 128;
        if (i % 2 != 0) {
            byte[] m26786 = m26786(str);
            int length = m26786.length;
            if (z) {
                util.h.xy.v.b.f2439.m27639(m26786);
                return;
            } else {
                util.h.xy.v.b.f2439.m27607(m26786);
                getValidOutputFormatsForInputhNQ4ISI = (getOutputMinFrameDurationlomOqCM + 75) % 128;
                return;
            }
        }
        int length2 = m26786(str).length;
        throw null;
    }

    /* renamed from: ˏ, reason: contains not printable characters */
    public final byte[] m26780(java.lang.String str, java.lang.String str2, com.gemalto.mfs.mwsdk.dcm.PaymentType paymentType) {
        byte[] bArr;
        byte[] bArr2;
        getValidOutputFormatsForInputhNQ4ISI = (getOutputMinFrameDurationlomOqCM + 91) % 128;
        java.lang.Object[] objArr = new java.lang.Object[1];
        getHighSpeedVideoFpsRangesFor("␀풻㈵⌘", 4 - android.text.TextUtils.indexOf("", "", 0), objArr);
        if (str2.equalsIgnoreCase(((java.lang.String) objArr[0]).intern())) {
            getOutputMinFrameDurationlomOqCM = (getValidOutputFormatsForInputhNQ4ISI + 85) % 128;
            bArr = new byte[]{1};
        } else {
            java.lang.Object[] objArr2 = new java.lang.Object[1];
            getHighResolutionOutputSizeshNQ4ISI(android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0) + 128, "¡\u0085\u0086\u0089\u0085\u0084\u0083\u0098\u0086\u008b", objArr2);
            if (str2.equalsIgnoreCase(((java.lang.String) objArr2[0]).intern())) {
                getOutputMinFrameDurationlomOqCM = (getValidOutputFormatsForInputhNQ4ISI + 3) % 128;
                bArr = new byte[]{2};
            } else {
                java.lang.Object[] objArr3 = new java.lang.Object[1];
                getHighSpeedVideoFpsRangesFor("萱幏\ud944鳈", 3 - android.view.MotionEvent.axisFromString(""), objArr3);
                bArr = str2.equalsIgnoreCase(((java.lang.String) objArr3[0]).intern()) ? new byte[]{3} : new byte[0];
            }
        }
        if (paymentType == com.gemalto.mfs.mwsdk.dcm.PaymentType.CONTACTLESS) {
            int i = getOutputMinFrameDurationlomOqCM + 33;
            getValidOutputFormatsForInputhNQ4ISI = i % 128;
            if (i % 2 == 0) {
                throw new java.lang.ArithmeticException();
            }
            bArr2 = new byte[]{0};
        } else if (paymentType == com.gemalto.mfs.mwsdk.dcm.PaymentType.QR) {
            int i2 = getOutputMinFrameDurationlomOqCM + 87;
            getValidOutputFormatsForInputhNQ4ISI = i2 % 128;
            if (i2 % 2 == 0) {
                throw null;
            }
            bArr2 = new byte[]{1};
        } else {
            bArr2 = paymentType == com.gemalto.mfs.mwsdk.dcm.PaymentType.DSRP ? new byte[]{2} : new byte[0];
        }
        byte[] bytes = str.getBytes();
        byte[] m25088 = util.h.xy.ar.b.m25088(bytes.length);
        byte[] bArr3 = new byte[m25088.length + 2 + bytes.length];
        java.lang.System.arraycopy(bArr, 0, bArr3, 0, 1);
        java.lang.System.arraycopy(bArr2, 0, bArr3, 1, 1);
        java.lang.System.arraycopy(m25088, 0, bArr3, 2, 4);
        java.lang.System.arraycopy(bytes, 0, bArr3, 6, bytes.length);
        util.h.xy.ar.b.m25100(bArr, bArr2, bytes, m25088);
        int i3 = getValidOutputFormatsForInputhNQ4ISI + 71;
        getOutputMinFrameDurationlomOqCM = i3 % 128;
        if (i3 % 2 == 0) {
            return bArr3;
        }
        throw null;
    }

    /* JADX WARN: Finally extract failed */
    @util.h.xy.a.a
    /* renamed from: ˊ, reason: contains not printable characters */
    public final byte[] m26757(java.lang.String str, com.gemalto.mfs.mwsdk.dcm.PaymentType paymentType, boolean z, boolean z2) throws com.gemalto.mfs.mwsdk.exception.InternalComponentException {
        getValidOutputFormatsForInputhNQ4ISI = (getOutputMinFrameDurationlomOqCM + 111) % 128;
        try {
            this.unwrapAs.lock();
            com.gemalto.mfs.mwsdk.utils.async.AsyncResult<util.h.xy.d.ra> highSpeedVideoSizes = getHighSpeedVideoSizes(str, paymentType, z, z2);
            if (highSpeedVideoSizes.isSuccessful()) {
                byte[] highSpeedVideoFpsRanges = getHighSpeedVideoFpsRanges();
                byte[] m25117 = util.h.xy.at.ma.m25117();
                byte[] m25089 = util.h.xy.ar.b.m25089(highSpeedVideoFpsRanges, m25117);
                util.h.xy.ar.b.m25098(m25117);
                util.h.xy.ar.b.m25098(highSpeedVideoFpsRanges);
                util.h.xy.ar.b.m25098(m25089);
                util.h.xy.d.b m26219 = highSpeedVideoSizes.getResult().m26219();
                java.lang.Object[] objArr = new java.lang.Object[1];
                getHighResolutionOutputSizeshNQ4ISI((-16777089) - android.graphics.Color.rgb(0, 0, 0), "\u0084¢\u008f\u0083\u0086\u0094\u008a\u009f\u0098¡\u0084\u0085\u0096¡\u0082\u0084\u0095¡\u0082\u009d¡\u0086\u008a\u0087", objArr);
                m26219.m26140(((java.lang.String) objArr[0]).intern());
                try {
                    byte[] highResolutionOutputSizeshNQ4ISI = getHighResolutionOutputSizeshNQ4ISI(m26759(str), highSpeedVideoSizes.getResult(), m25089, m25117);
                    getValidOutputFormatsForInputhNQ4ISI = (getOutputMinFrameDurationlomOqCM + 69) % 128;
                    this.unwrapAs.unlock();
                    int i = getOutputMinFrameDurationlomOqCM + 119;
                    getValidOutputFormatsForInputhNQ4ISI = i % 128;
                    if (i % 2 != 0) {
                        return highResolutionOutputSizeshNQ4ISI;
                    }
                    throw new java.lang.ArithmeticException();
                } catch (org.json.JSONException e) {
                    e.getMessage();
                    java.lang.Object[] objArr2 = new java.lang.Object[1];
                    getHighResolutionOutputSizeshNQ4ISI((android.view.ViewConfiguration.getScrollDefaultDelay() >> 16) + 127, "\u0090\u0082\u008f\u008e\u0085\u008a\u008d\u0088\u0083\u008a\u0082\u0088\u0083\u0082\u0084\u0082\u008a\u008c\u008b\u008a\u0089\u0088\u0087\u0086\u0082\u0085\u0084\u0083\u0082\u0081", objArr2);
                    throw new com.gemalto.mfs.mwsdk.exception.InternalComponentException(((java.lang.String) objArr2[0]).intern(), e);
                }
            }
            java.lang.StringBuilder sb = new java.lang.StringBuilder();
            java.lang.Object[] objArr3 = new java.lang.Object[1];
            getHighResolutionOutputSizeshNQ4ISI(127 - android.widget.ExpandableListView.getPackedPositionType(0L), "\u0088\u0092\u0084\u0090\u0086\u0085\u008a\u0083\u0098\u0088\u008b\u008a\u0085£\u0088\u0098¡\u0084\u0085\u0089\u0088\u0090\u0082\u008f\u0083\u0083\u0084\u0090\u0088\u0084\u0087\u008f\u0091\u008d\u0088\u0083\u008a\u0090\u0088\u0085\u008a\u0085\u0085\u0097", objArr3);
            sb.append(((java.lang.String) objArr3[0]).intern());
            sb.append(highSpeedVideoSizes.getErrorMessage());
            throw new com.gemalto.mfs.mwsdk.exception.InternalComponentException(sb.toString());
        } catch (java.lang.Throwable th) {
            this.unwrapAs.unlock();
            throw th;
        }
    }

    @util.h.xy.a.a
    private void Camera2StreamConfigurationMap(com.gemalto.mfs.mwsdk.utils.async.AsyncResult<util.h.xy.d.ra> asyncResult, com.gemalto.mfs.mwsdk.dcm.PaymentType paymentType, java.lang.String str, boolean z) throws com.gemalto.mfs.mwsdk.exception.InternalComponentException, org.json.JSONException {
        getValidOutputFormatsForInputhNQ4ISI = (getOutputMinFrameDurationlomOqCM + 91) % 128;
        byte[] highSpeedVideoFpsRanges = getHighSpeedVideoFpsRanges();
        byte[] m25117 = util.h.xy.at.ma.m25117();
        byte[] m25089 = util.h.xy.ar.b.m25089(highSpeedVideoFpsRanges, m25117);
        util.h.xy.ar.b.m25098(m25117);
        util.h.xy.ar.b.m25098(highSpeedVideoFpsRanges);
        util.h.xy.ar.b.m25098(m25089);
        util.h.xy.d.b m26219 = asyncResult.getResult().m26219();
        java.lang.Object[] objArr = new java.lang.Object[1];
        getHighResolutionOutputSizeshNQ4ISI(127 - (android.view.ViewConfiguration.getMaximumFlingVelocity() >> 16), "\u0084¢\u008f\u0083\u0086\u0094\u008a\u009f\u0098¡\u0084\u0085\u0096¡\u0082\u0084\u0095¡\u0082\u009d¡\u0086\u008a\u0087", objArr);
        m26219.m26140(((java.lang.String) objArr[0]).intern());
        java.lang.Object[] objArr2 = new java.lang.Object[1];
        getHighResolutionOutputSizeshNQ4ISI(android.graphics.Color.alpha(0) + 127, "¥¤\u0095\u0095\u0094\u0093", objArr2);
        util.h.xy.am.ma.m25030(((java.lang.String) objArr2[0]).intern(), asyncResult.getResult().m26220().m26240());
        java.lang.Object[] objArr3 = new java.lang.Object[1];
        getHighResolutionOutputSizeshNQ4ISI(126 - android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask), "\u0093¥¤\u0095\u0095\u0094\u0093", objArr3);
        util.h.xy.am.ma.m25030(((java.lang.String) objArr3[0]).intern(), asyncResult.getResult().m26220().m26241());
        byte[] highResolutionOutputSizeshNQ4ISI = getHighResolutionOutputSizeshNQ4ISI(m26759(str), asyncResult.getResult(), m25089, m25117);
        getHighSpeedVideoFpsRanges(paymentType, highResolutionOutputSizeshNQ4ISI, z);
        util.h.xy.ar.b.m25095(highResolutionOutputSizeshNQ4ISI);
        util.h.xy.ar.b.m25100(highSpeedVideoFpsRanges, m25117, m25089);
        util.h.xy.at.ma.m25116();
        getValidOutputFormatsForInputhNQ4ISI = (getOutputMinFrameDurationlomOqCM + 13) % 128;
    }

    @util.h.xy.a.a
    private static byte[] getHighResolutionOutputSizeshNQ4ISI(java.lang.String str, util.h.xy.d.ra raVar, byte[] bArr, byte[] bArr2) throws util.h.xy.ab.ma, com.gemalto.mfs.mwsdk.exception.InternalComponentException {
        boolean z;
        byte[] bArr3;
        byte[] bArr4;
        byte[] m27053;
        if (raVar.m26221() == com.gemalto.mfs.mwsdk.dcm.DigitalizedCardState.ACTIVE) {
            getOutputMinFrameDurationlomOqCM = (getValidOutputFormatsForInputhNQ4ISI + 57) % 128;
            if (raVar.m26219().m26139() != 0) {
                util.h.xy.d.rc m26220 = raVar.m26220();
                util.h.xy.d.b m26219 = raVar.m26219();
                byte[] m26241 = m26220.m26241();
                byte[] m26240 = m26220.m26240();
                byte[] m26243 = m26220.m26243();
                byte[] m26242 = m26220.m26242();
                byte[] m26239 = m26220.m26239();
                if (raVar.m26223() == util.h.xy.d.mg.f1144) {
                    int i = (getOutputMinFrameDurationlomOqCM + 7) % 128;
                    getValidOutputFormatsForInputhNQ4ISI = i;
                    getOutputMinFrameDurationlomOqCM = (i + 41) % 128;
                    z = true;
                } else {
                    z = false;
                }
                int m26222 = raVar.m26222();
                byte[] bytes = java.lang.String.valueOf(raVar.m26225()).getBytes();
                try {
                    bArr3 = util.h.xy.t.mb.f2417.m27435();
                } catch (com.gemalto.mfs.mwsdk.exception.InternalComponentException e) {
                    e.getMessage();
                    bArr3 = new byte[16];
                }
                boolean equals = str.equals(util.h.xy.s.a.b.f2296.toString().toUpperCase());
                util.h.xy.s.a.b bVar = util.h.xy.s.a.b.f2296;
                if (str.equals(util.h.xy.s.a.b.f2298.toString().toUpperCase())) {
                    byte[] bArr5 = new byte[55];
                    util.h.xy.aw.mb.f882.nextBytes(bArr5);
                    byte[] bArr6 = new byte[55];
                    util.h.xy.aw.mb.f882.nextBytes(bArr6);
                    byte[] bArr7 = new byte[55];
                    util.h.xy.aw.mb.f882.nextBytes(bArr7);
                    byte[] bArr8 = new byte[55];
                    util.h.xy.aw.mb.f882.nextBytes(bArr8);
                    byte[] bArr9 = new byte[55];
                    util.h.xy.aw.mb.f882.nextBytes(bArr9);
                    byte[] bArr10 = new byte[1];
                    if (m26243 != null && m26243.length > 0) {
                        try {
                            java.lang.Object[] objArr = new java.lang.Object[1];
                            getHighResolutionOutputSizeshNQ4ISI(127 - (android.view.ViewConfiguration.getMinimumFlingVelocity() >> 16), "¨§¦\u009f ", objArr);
                            m26243 = util.h.xy.u.rc.m27548(new java.lang.String(m26243, ((java.lang.String) objArr[0]).intern()));
                        } catch (java.io.UnsupportedEncodingException unused) {
                        }
                    }
                    byte[] bArr11 = m26243;
                    m27053 = util.h.xy.q.b.m27057(m26241, bArr5, m26240, bArr6, bArr7, bArr8, m26222, bArr, bArr2, bArr3, bArr9, bArr10, bArr11);
                    bArr4 = bArr11;
                } else {
                    bArr4 = m26243;
                    m27053 = util.h.xy.q.b.m27053(equals, m26241, m26240, m26239, m26242, m26222, m26243, m26219.m26135(), bArr, bArr2, bArr3, z, bytes, m26220.m26237());
                }
                util.h.xy.ar.b.m25100(m26241, m26240, bArr4, m26242, m26239, bArr3);
                return m27053;
            }
        }
        raVar.m26221();
        raVar.m26219().m26139();
        java.lang.Object[] objArr2 = new java.lang.Object[1];
        getHighResolutionOutputSizeshNQ4ISI(android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0) + 128, "\u0090\u0082\u008f\u008e\u0085\u008a\u008d\u0088\u0083\u008a\u0082\u0088\u0083\u0082\u0084\u0082\u008a\u008c\u008b\u008a\u0089\u0088\u0087\u0086\u0082\u0085\u0084\u0083\u0082\u0081", objArr2);
        throw new com.gemalto.mfs.mwsdk.exception.InternalComponentException(((java.lang.String) objArr2[0]).intern());
    }

    @util.h.xy.a.a
    private static void getHighSpeedVideoFpsRanges(com.gemalto.mfs.mwsdk.dcm.PaymentType paymentType, byte[] bArr, boolean z) throws util.h.xy.ab.ma, com.gemalto.mfs.mwsdk.exception.InternalComponentException {
        int i = getValidOutputFormatsForInputhNQ4ISI + 15;
        getOutputMinFrameDurationlomOqCM = i % 128;
        if (i % 2 != 0) {
            com.gemalto.mfs.mwsdk.dcm.PaymentType paymentType2 = com.gemalto.mfs.mwsdk.dcm.PaymentType.CONTACTLESS;
            throw null;
        }
        if (paymentType == com.gemalto.mfs.mwsdk.dcm.PaymentType.CONTACTLESS) {
            getOutputMinFrameDurationlomOqCM = (getValidOutputFormatsForInputhNQ4ISI + 29) % 128;
            try {
                if (z) {
                    util.h.xy.v.b.f2439.m27581(bArr);
                    return;
                } else {
                    util.h.xy.v.b.f2439.m27585(bArr);
                    return;
                }
            } catch (com.gemalto.mfs.mwsdk.exception.InternalComponentException e) {
                java.lang.StringBuilder sb = new java.lang.StringBuilder();
                sb.append(com.gemalto.mfs.mwsdk.dcm.PaymentType.CONTACTLESS.toString());
                java.lang.Object[] objArr = new java.lang.Object[1];
                getHighSpeedVideoFpsRangesFor("䒞걳", android.view.KeyEvent.keyCodeFromString("") + 1, objArr);
                sb.append(((java.lang.String) objArr[0]).intern());
                java.lang.Object[] objArr2 = new java.lang.Object[1];
                getHighSpeedVideoFpsRangesFor("ꌒ⡠ἇꄯ픎\uf13fꌥ낉㘻펢⑁ժ솨鴡虠㐘쟤\ue581ข媎ꮦ⤯駅າ", 24 - android.text.TextUtils.indexOf("", ""), objArr2);
                sb.append(((java.lang.String) objArr2[0]).intern());
                sb.append(e.getMessage());
                throw new com.gemalto.mfs.mwsdk.exception.InternalComponentException(sb.toString());
            }
        }
        if (paymentType == com.gemalto.mfs.mwsdk.dcm.PaymentType.QR) {
            try {
                if (!z) {
                    util.h.xy.v.b.f2439.m27584(bArr);
                    return;
                } else {
                    getValidOutputFormatsForInputhNQ4ISI = (getOutputMinFrameDurationlomOqCM + 51) % 128;
                    util.h.xy.v.b.f2439.m27580(bArr);
                    return;
                }
            } catch (com.gemalto.mfs.mwsdk.exception.InternalComponentException e2) {
                java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
                sb2.append(com.gemalto.mfs.mwsdk.dcm.PaymentType.QR.toString());
                java.lang.Object[] objArr3 = new java.lang.Object[1];
                getHighSpeedVideoFpsRangesFor("䒞걳", (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 1, objArr3);
                sb2.append(((java.lang.String) objArr3[0]).intern());
                java.lang.Object[] objArr4 = new java.lang.Object[1];
                getHighSpeedVideoFpsRangesFor("ꌒ⡠ἇꄯ픎\uf13fꌥ낉㘻펢⑁ժ솨鴡虠㐘쟤\ue581ข媎ꮦ⤯駅າ", 23 - ((byte) android.view.KeyEvent.getModifierMetaStateMask()), objArr4);
                sb2.append(((java.lang.String) objArr4[0]).intern());
                sb2.append(e2.getMessage());
                throw new com.gemalto.mfs.mwsdk.exception.InternalComponentException(sb2.toString());
            }
        }
        if (paymentType == com.gemalto.mfs.mwsdk.dcm.PaymentType.DSRP) {
            try {
                if (z) {
                    int i2 = getValidOutputFormatsForInputhNQ4ISI + 9;
                    getOutputMinFrameDurationlomOqCM = i2 % 128;
                    if (i2 % 2 != 0) {
                        util.h.xy.v.b.f2439.m27605(bArr);
                        throw new java.lang.ArithmeticException();
                    }
                    util.h.xy.v.b.f2439.m27605(bArr);
                } else {
                    util.h.xy.v.b.f2439.m27590(bArr);
                }
                getOutputMinFrameDurationlomOqCM = (getValidOutputFormatsForInputhNQ4ISI + 79) % 128;
            } catch (com.gemalto.mfs.mwsdk.exception.InternalComponentException e3) {
                java.lang.StringBuilder sb3 = new java.lang.StringBuilder();
                sb3.append(com.gemalto.mfs.mwsdk.dcm.PaymentType.DSRP.toString());
                java.lang.Object[] objArr5 = new java.lang.Object[1];
                getHighSpeedVideoFpsRangesFor("䒞걳", 1 - (android.view.ViewConfiguration.getJumpTapTimeout() >> 16), objArr5);
                sb3.append(((java.lang.String) objArr5[0]).intern());
                java.lang.Object[] objArr6 = new java.lang.Object[1];
                getHighSpeedVideoFpsRangesFor("ꌒ⡠ἇꄯ픎\uf13fꌥ낉㘻펢⑁ժ솨鴡虠㐘쟤\ue581ข媎ꮦ⤯駅າ", 24 - android.text.TextUtils.getOffsetAfter("", 0), objArr6);
                sb3.append(((java.lang.String) objArr6[0]).intern());
                sb3.append(e3.getMessage());
                throw new com.gemalto.mfs.mwsdk.exception.InternalComponentException(sb3.toString());
            }
        }
    }

    private static byte[] getHighSpeedVideoFpsRanges() {
        int i = getOutputMinFrameDurationlomOqCM + 49;
        getValidOutputFormatsForInputhNQ4ISI = i % 128;
        try {
            if (i % 2 != 0) {
                byte[] m27415 = util.h.xy.t.mb.f2417.m27415();
                getOutputMinFrameDurationlomOqCM = (getValidOutputFormatsForInputhNQ4ISI + 101) % 128;
                return m27415;
            }
            util.h.xy.t.mb.f2417.m27415();
            throw new java.lang.ArithmeticException();
        } catch (com.gemalto.mfs.mwsdk.exception.InternalComponentException e) {
            e.getMessage();
            return null;
        }
    }

    @util.h.xy.a.a
    private static com.gemalto.mfs.mwsdk.utils.async.AsyncResult<util.h.xy.d.ra> getHighSpeedVideoSizes(java.lang.String str, com.gemalto.mfs.mwsdk.dcm.PaymentType paymentType, boolean z, boolean z2) {
        util.h.xy.d.c highSpeedVideoSizes = getHighSpeedVideoSizes();
        if (paymentType != com.gemalto.mfs.mwsdk.dcm.PaymentType.CONTACTLESS && paymentType != com.gemalto.mfs.mwsdk.dcm.PaymentType.QR) {
            com.gemalto.mfs.mwsdk.dcm.PaymentType paymentType2 = com.gemalto.mfs.mwsdk.dcm.PaymentType.DSRP;
            getOutputMinFrameDurationlomOqCM = (getValidOutputFormatsForInputhNQ4ISI + 61) % 128;
        }
        com.gemalto.mfs.mwsdk.utils.async.AsyncResult<util.h.xy.d.ra> mo26149 = highSpeedVideoSizes.mo26149(str, paymentType, z, z2);
        int i = getValidOutputFormatsForInputhNQ4ISI + 29;
        getOutputMinFrameDurationlomOqCM = i % 128;
        if (i % 2 == 0) {
            return mo26149;
        }
        throw null;
    }

    /* renamed from: util.h.xy.f.b$5, reason: invalid class name */
    static final /* synthetic */ class AnonymousClass5 {
        private static int Camera2StreamConfigurationMap = 1;
        static final /* synthetic */ int[] getHighResolutionOutputSizeshNQ4ISI;
        static final /* synthetic */ int[] getHighSpeedVideoFpsRanges;
        private static int getHighSpeedVideoFpsRangesFor;
        static final /* synthetic */ int[] getHighSpeedVideoSizes;

        static {
            int[] iArr = new int[util.h.xy.f.a.values().length];
            getHighResolutionOutputSizeshNQ4ISI = iArr;
            try {
                iArr[util.h.xy.f.a.f2192.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                getHighResolutionOutputSizeshNQ4ISI[util.h.xy.f.a.f2193.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                getHighResolutionOutputSizeshNQ4ISI[util.h.xy.f.a.f2188.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            try {
                getHighResolutionOutputSizeshNQ4ISI[util.h.xy.f.a.f2197.ordinal()] = 4;
                int i = getHighSpeedVideoFpsRangesFor + 41;
                Camera2StreamConfigurationMap = i % 128;
                if (i % 2 == 0) {
                    int i2 = 5 / 5;
                }
            } catch (java.lang.NoSuchFieldError unused4) {
            }
            try {
                getHighResolutionOutputSizeshNQ4ISI[util.h.xy.f.a.f2195.ordinal()] = 5;
            } catch (java.lang.NoSuchFieldError unused5) {
            }
            try {
                getHighResolutionOutputSizeshNQ4ISI[util.h.xy.f.a.f2182.ordinal()] = 6;
            } catch (java.lang.NoSuchFieldError unused6) {
            }
            try {
                getHighResolutionOutputSizeshNQ4ISI[util.h.xy.f.a.f2183.ordinal()] = 7;
            } catch (java.lang.NoSuchFieldError unused7) {
            }
            try {
                getHighResolutionOutputSizeshNQ4ISI[util.h.xy.f.a.f2181.ordinal()] = 8;
            } catch (java.lang.NoSuchFieldError unused8) {
            }
            try {
                getHighResolutionOutputSizeshNQ4ISI[util.h.xy.f.a.f2200.ordinal()] = 9;
            } catch (java.lang.NoSuchFieldError unused9) {
            }
            try {
                getHighResolutionOutputSizeshNQ4ISI[util.h.xy.f.a.f2185.ordinal()] = 10;
                getHighSpeedVideoFpsRangesFor = (Camera2StreamConfigurationMap + 53) % 128;
            } catch (java.lang.NoSuchFieldError unused10) {
            }
            try {
                getHighResolutionOutputSizeshNQ4ISI[util.h.xy.f.a.f2187.ordinal()] = 11;
            } catch (java.lang.NoSuchFieldError unused11) {
            }
            try {
                getHighResolutionOutputSizeshNQ4ISI[util.h.xy.f.a.f2190.ordinal()] = 12;
            } catch (java.lang.NoSuchFieldError unused12) {
            }
            try {
                getHighResolutionOutputSizeshNQ4ISI[util.h.xy.f.a.f2184.ordinal()] = 13;
                int i3 = Camera2StreamConfigurationMap;
                getHighSpeedVideoFpsRangesFor = ((i3 & 65) + (i3 | 65)) % 128;
            } catch (java.lang.NoSuchFieldError unused13) {
            }
            try {
                getHighResolutionOutputSizeshNQ4ISI[util.h.xy.f.a.f2186.ordinal()] = 14;
            } catch (java.lang.NoSuchFieldError unused14) {
            }
            try {
                getHighResolutionOutputSizeshNQ4ISI[util.h.xy.f.a.f2196.ordinal()] = 15;
            } catch (java.lang.NoSuchFieldError unused15) {
            }
            try {
                getHighResolutionOutputSizeshNQ4ISI[util.h.xy.f.a.f2194.ordinal()] = 16;
            } catch (java.lang.NoSuchFieldError unused16) {
            }
            try {
                getHighResolutionOutputSizeshNQ4ISI[util.h.xy.f.a.f2198.ordinal()] = 17;
            } catch (java.lang.NoSuchFieldError unused17) {
            }
            try {
                getHighResolutionOutputSizeshNQ4ISI[util.h.xy.f.a.f2191.ordinal()] = 18;
            } catch (java.lang.NoSuchFieldError unused18) {
            }
            try {
                getHighResolutionOutputSizeshNQ4ISI[util.h.xy.f.a.f2199.ordinal()] = 19;
            } catch (java.lang.NoSuchFieldError unused19) {
            }
            int[] iArr2 = new int[util.h.xy.s.a.b.values().length];
            getHighSpeedVideoSizes = iArr2;
            try {
                iArr2[util.h.xy.s.a.b.f2297.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused20) {
            }
            try {
                getHighSpeedVideoSizes[util.h.xy.s.a.b.f2296.ordinal()] = 2;
                int i4 = getHighSpeedVideoFpsRangesFor;
                int i5 = (i4 & 9) + (9 | i4);
                Camera2StreamConfigurationMap = i5 % 128;
                int i6 = i5 % 2;
            } catch (java.lang.NoSuchFieldError unused21) {
            }
            try {
                getHighSpeedVideoSizes[util.h.xy.s.a.b.f2298.ordinal()] = 3;
                int i7 = Camera2StreamConfigurationMap;
                int i8 = (i7 & 37) + (i7 | 37);
                getHighSpeedVideoFpsRangesFor = i8 % 128;
                int i9 = i8 % 2;
            } catch (java.lang.NoSuchFieldError unused22) {
            }
            int[] iArr3 = new int[util.h.xy.f.ma.values().length];
            getHighSpeedVideoFpsRanges = iArr3;
            try {
                iArr3[util.h.xy.f.ma.f2207.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused23) {
            }
            try {
                getHighSpeedVideoFpsRanges[util.h.xy.f.ma.f2206.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused24) {
            }
            try {
                getHighSpeedVideoFpsRanges[util.h.xy.f.ma.f2205.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused25) {
            }
            try {
                getHighSpeedVideoFpsRanges[util.h.xy.f.ma.f2208.ordinal()] = 4;
                getHighSpeedVideoFpsRangesFor = (Camera2StreamConfigurationMap + 37) % 128;
            } catch (java.lang.NoSuchFieldError unused26) {
            }
            try {
                getHighSpeedVideoFpsRanges[util.h.xy.f.ma.f2203.ordinal()] = 5;
                int i10 = getHighSpeedVideoFpsRangesFor + 41;
                Camera2StreamConfigurationMap = i10 % 128;
                int i11 = i10 % 2;
            } catch (java.lang.NoSuchFieldError unused27) {
            }
            try {
                getHighSpeedVideoFpsRanges[util.h.xy.f.ma.f2202.ordinal()] = 6;
            } catch (java.lang.NoSuchFieldError unused28) {
            }
            try {
                getHighSpeedVideoFpsRanges[util.h.xy.f.ma.f2204.ordinal()] = 7;
            } catch (java.lang.NoSuchFieldError unused29) {
            }
        }
    }

    private static byte[] getHighSpeedVideoFpsRanges(util.h.xy.f.a aVar) {
        byte[] bArr = {1};
        switch (util.h.xy.f.b.AnonymousClass5.getHighResolutionOutputSizeshNQ4ISI[aVar.ordinal()]) {
            case 1:
                bArr[0] = 2;
                break;
            case 2:
                bArr[0] = 3;
                break;
            case 3:
                bArr[0] = 4;
                break;
            case 4:
                bArr[0] = 5;
                break;
            case 5:
                bArr[0] = 6;
                break;
            case 6:
                bArr[0] = 8;
                break;
            case 7:
                bArr[0] = 9;
                break;
            case 8:
                bArr[0] = 7;
                break;
            case 9:
                bArr[0] = 17;
                break;
            case 10:
                bArr[0] = 18;
                break;
            case 11:
                bArr[0] = 19;
                break;
            case 12:
                bArr[0] = com.google.common.base.Ascii.DC4;
                break;
            case 13:
                bArr[0] = com.google.common.base.Ascii.NAK;
                getOutputMinFrameDurationlomOqCM = (getValidOutputFormatsForInputhNQ4ISI + 19) % 128;
                break;
            case 14:
                bArr[0] = com.google.common.base.Ascii.SYN;
                break;
            case 15:
                bArr[0] = com.google.common.base.Ascii.ETB;
                getValidOutputFormatsForInputhNQ4ISI = (getOutputMinFrameDurationlomOqCM + 95) % 128;
                break;
            case 16:
                bArr[0] = com.google.common.base.Ascii.CAN;
                break;
            case 17:
                bArr[0] = com.google.common.base.Ascii.EM;
                break;
            case 18:
                bArr[0] = 32;
                break;
            case 19:
                bArr[0] = 33;
                break;
        }
        return bArr;
    }

    private static util.h.xy.s.a.b getHighSpeedVideoFpsRanges(java.lang.String str) {
        util.h.xy.s.a.b bVar;
        int i;
        getValidOutputFormatsForInputhNQ4ISI = (getOutputMinFrameDurationlomOqCM + 79) % 128;
        java.lang.Object[] objArr = new java.lang.Object[1];
        getHighSpeedVideoFpsRangesFor("黝뗓㌑Ҵ쬳힅鎞缤\uf7d1\uf2a2", android.text.TextUtils.getOffsetBefore("", 0) + 10, objArr);
        if (str.equalsIgnoreCase(((java.lang.String) objArr[0]).intern())) {
            int i2 = getValidOutputFormatsForInputhNQ4ISI + 109;
            getOutputMinFrameDurationlomOqCM = i2 % 128;
            if (i2 % 2 != 0) {
                util.h.xy.s.a.b bVar2 = util.h.xy.s.a.b.f2297;
                throw new java.lang.ArithmeticException();
            }
            bVar = util.h.xy.s.a.b.f2297;
            i = getValidOutputFormatsForInputhNQ4ISI + 51;
        } else {
            java.lang.Object[] objArr2 = new java.lang.Object[1];
            getHighResolutionOutputSizeshNQ4ISI(126 - (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)), "\u0086\u0098\u008f\u009c", objArr2);
            if (!str.equalsIgnoreCase(((java.lang.String) objArr2[0]).intern())) {
                java.lang.Object[] objArr3 = new java.lang.Object[1];
                getHighResolutionOutputSizeshNQ4ISI(126 - android.view.MotionEvent.axisFromString(""), "\u0084\u0085©\u009b", objArr3);
                if (!str.equalsIgnoreCase(((java.lang.String) objArr3[0]).intern())) {
                    return util.h.xy.s.a.b.f2295;
                }
                util.h.xy.s.a.b bVar3 = util.h.xy.s.a.b.f2298;
                int i3 = getValidOutputFormatsForInputhNQ4ISI + 69;
                getOutputMinFrameDurationlomOqCM = i3 % 128;
                if (i3 % 2 == 0) {
                    return bVar3;
                }
                throw new java.lang.ArithmeticException();
            }
            getOutputMinFrameDurationlomOqCM = (getValidOutputFormatsForInputhNQ4ISI + 73) % 128;
            bVar = util.h.xy.s.a.b.f2296;
            i = getValidOutputFormatsForInputhNQ4ISI + 1;
        }
        getOutputMinFrameDurationlomOqCM = i % 128;
        return bVar;
    }

    /* renamed from: ˋ, reason: contains not printable characters */
    public final byte[] m26767(java.lang.String str, util.h.xy.d.rc rcVar, int i) throws com.gemalto.mfs.mwsdk.exception.InternalComponentException {
        boolean z;
        int i2 = getOutputMinFrameDurationlomOqCM + 23;
        getValidOutputFormatsForInputhNQ4ISI = i2 % 128;
        if (i2 % 2 != 0 ? rcVar != null : rcVar != null) {
            z = true;
        } else {
            try {
                util.h.xy.d.ra m26913 = util.h.xy.k.b.m26913(str, com.gemalto.mfs.mwsdk.dcm.PaymentType.CONTACTLESS);
                if (m26913 == null) {
                    return null;
                }
                rcVar = m26913.m26220();
                getValidOutputFormatsForInputhNQ4ISI = (getOutputMinFrameDurationlomOqCM + 75) % 128;
                z = false;
            } catch (com.gemalto.mfs.mwsdk.exception.InternalComponentException unused) {
                return null;
            }
        }
        return getHighSpeedVideoFpsRangesFor(str, rcVar, i, z);
    }

    /* JADX WARN: Code restructure failed: missing block: B:88:0x01b5, code lost:
    
        r19.m26245();
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x01b8, code lost:
    
        return null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x01bc, code lost:
    
        r19.m26245();
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x01bf, code lost:
    
        return null;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static byte[] getHighSpeedVideoFpsRangesFor(java.lang.String str, util.h.xy.d.rc rcVar, int i, boolean z) throws com.gemalto.mfs.mwsdk.exception.InternalComponentException {
        boolean z2;
        byte[] bArr;
        byte[] bArr2;
        byte[][] bArr3;
        byte[][] bArr4;
        byte[] copyOf;
        getValidOutputFormatsForInputhNQ4ISI = (getOutputMinFrameDurationlomOqCM + 11) % 128;
        try {
            util.h.xy.d.c highSpeedVideoSizes = getHighSpeedVideoSizes();
            byte[] mo26160 = highSpeedVideoSizes.mo26160();
            if (!util.h.xy.ar.b.m25070(mo26160) && !util.h.xy.ar.b.m25070(mo26160)) {
                com.gemalto.mfs.mwsdk.provisioning.sdkconfig.WalletSecureEnrollmentBusinessService walletSecureEnrollmentBusinessService = com.gemalto.mfs.mwsdk.provisioning.ProvisioningServiceManager.getWalletSecureEnrollmentBusinessService();
                if (com.gemalto.mfs.mwsdk.provisioning.model.WalletSecureEnrollmentState.WSE_REQUIRED != walletSecureEnrollmentBusinessService.getState() && com.gemalto.mfs.mwsdk.provisioning.model.WalletSecureEnrollmentState.WSE_STARTED != walletSecureEnrollmentBusinessService.getState()) {
                    if (rcVar.m26241() != null) {
                        getOutputMinFrameDurationlomOqCM = (getValidOutputFormatsForInputhNQ4ISI + 37) % 128;
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    if (z2) {
                        bArr = null;
                        bArr2 = null;
                    } else {
                        bArr = util.h.xy.u.a.f2431.m27485(rcVar.m26244());
                        if (bArr == null) {
                            int i2 = getValidOutputFormatsForInputhNQ4ISI;
                            int i3 = i2 + 59;
                            getOutputMinFrameDurationlomOqCM = i3 % 128;
                            if (i3 % 2 != 0) {
                                throw new java.lang.ArithmeticException();
                            }
                            if (rcVar != null) {
                                getOutputMinFrameDurationlomOqCM = (i2 + 103) % 128;
                                rcVar.m26245();
                            }
                            return null;
                        }
                        bArr2 = Camera2StreamConfigurationMap(bArr, 128);
                        util.h.xy.ar.b.m25095(bArr);
                    }
                    byte[] m26240 = rcVar.m26240();
                    byte[] m26241 = rcVar.m26241() != null ? rcVar.m26241() : null;
                    if (z) {
                        m26240 = Camera2StreamConfigurationMap(rcVar.m26240(), 42);
                        if (rcVar.m26241() != null) {
                            int i4 = getOutputMinFrameDurationlomOqCM + 67;
                            getValidOutputFormatsForInputhNQ4ISI = i4 % 128;
                            m26241 = i4 % 2 == 0 ? Camera2StreamConfigurationMap(rcVar.m26241(), 61) : Camera2StreamConfigurationMap(rcVar.m26241(), 42);
                        }
                    }
                    byte[] highSpeedVideoFpsRangesFor = getHighSpeedVideoFpsRangesFor(rcVar.m26242());
                    byte[] bytes = java.lang.String.valueOf(i).getBytes();
                    if (m26240 != null) {
                        int i5 = getOutputMinFrameDurationlomOqCM + 19;
                        getValidOutputFormatsForInputhNQ4ISI = i5 % 128;
                        if (i5 % 2 == 0) {
                            util.h.xy.ar.b.m25098(m26240);
                            int length = m26240.length;
                            throw new java.lang.ArithmeticException();
                        }
                        util.h.xy.ar.b.m25098(m26240);
                        int length2 = m26240.length;
                    }
                    if (mo26160 != null) {
                        getValidOutputFormatsForInputhNQ4ISI = (getOutputMinFrameDurationlomOqCM + 19) % 128;
                        util.h.xy.ar.b.m25098(mo26160);
                        int length3 = mo26160.length;
                    }
                    if (bytes != null) {
                        util.h.xy.ar.b.m25074(bytes);
                        int length4 = bytes.length;
                    }
                    if (highSpeedVideoFpsRangesFor != null) {
                        util.h.xy.ar.b.m25074(highSpeedVideoFpsRangesFor);
                        int length5 = highSpeedVideoFpsRangesFor.length;
                    }
                    if (bArr2 != null) {
                        util.h.xy.ar.b.m25074(bArr2);
                        int length6 = bArr2.length;
                    }
                    if (m26241 != null) {
                        util.h.xy.ar.b.m25098(m26241);
                        int length7 = m26241.length;
                    }
                    if (z2) {
                        bArr3 = new byte[][]{new byte[]{1}, new byte[]{4}, new byte[]{6}, new byte[]{18}};
                        bArr4 = new byte[][]{m26241, mo26160, bytes, highSpeedVideoFpsRangesFor};
                    } else {
                        bArr3 = new byte[][]{new byte[]{2}, new byte[]{4}, new byte[]{6}, new byte[]{18}, new byte[]{19}};
                        bArr4 = new byte[][]{m26240, mo26160, bytes, highSpeedVideoFpsRangesFor, bArr2};
                    }
                    byte[] m25024 = util.h.xy.al.rd.m25024(bArr3, bArr4);
                    util.h.xy.ar.b.m25100(mo26160, bArr, bArr2, m26240, highSpeedVideoFpsRangesFor, bytes, m26241);
                    util.h.xy.ar.b.m25074(m25024);
                    byte[] m27056 = util.h.xy.q.b.m27056(m25024);
                    byte[] m27623 = z2 ? util.h.xy.v.b.f2439.m27623(m27056) : util.h.xy.v.b.f2439.m27638(m27056);
                    if (util.h.xy.ar.b.m25068(m27623)) {
                        if (rcVar == null) {
                            return null;
                        }
                        rcVar.m26245();
                        return null;
                    }
                    int i6 = getOutputMinFrameDurationlomOqCM + com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CALENDAR_VALUE;
                    getValidOutputFormatsForInputhNQ4ISI = i6 % 128;
                    if (i6 % 2 == 0) {
                        copyOf = java.util.Arrays.copyOf(m27623, 16);
                        highSpeedVideoSizes.mo26157(str, copyOf);
                        util.h.xy.ar.b.m25074(copyOf);
                        if (rcVar == null) {
                            return copyOf;
                        }
                    } else {
                        copyOf = java.util.Arrays.copyOf(m27623, 8);
                        highSpeedVideoSizes.mo26157(str, copyOf);
                        util.h.xy.ar.b.m25074(copyOf);
                    }
                    return copyOf;
                }
                return null;
            }
            return null;
        } finally {
            if (rcVar != null) {
                rcVar.m26245();
            }
        }
    }

    private static byte[] Camera2StreamConfigurationMap(byte[] bArr, int i) {
        util.h.xy.aw.b bVar = new util.h.xy.aw.b();
        util.h.xy.aw.ra.m25249(bArr, bVar, i);
        byte[] m25241 = bVar.m25241();
        getOutputMinFrameDurationlomOqCM = (getValidOutputFormatsForInputhNQ4ISI + 119) % 128;
        return m25241;
    }

    private static byte[] getHighSpeedVideoFpsRangesFor(byte[] bArr) {
        byte[] bArr2;
        if (bArr.length != 7) {
            getOutputMinFrameDurationlomOqCM = (getValidOutputFormatsForInputhNQ4ISI + 59) % 128;
            return bArr;
        }
        int i = getValidOutputFormatsForInputhNQ4ISI + 55;
        getOutputMinFrameDurationlomOqCM = i % 128;
        if (i % 2 != 0) {
            bArr2 = new byte[79];
            bArr2[1] = 111;
        } else {
            bArr2 = new byte[8];
            bArr2[0] = 48;
        }
        for (int i2 = 1; i2 < 8; i2++) {
            getValidOutputFormatsForInputhNQ4ISI = (getOutputMinFrameDurationlomOqCM + 53) % 128;
            bArr2[i2] = bArr[i2 - 1];
        }
        return bArr2;
    }

    /* renamed from: ˎ, reason: contains not printable characters */
    public final util.h.xy.d.mg m26768(java.lang.String str) {
        getOutputMinFrameDurationlomOqCM = (getValidOutputFormatsForInputhNQ4ISI + 111) % 128;
        com.gemalto.mfs.mwsdk.utils.async.AsyncResult<util.h.xy.d.b> mo26148 = util.h.xy.k.ma.m26925().mo26148(str);
        if (mo26148.isSuccessful() && mo26148.getResult() != null) {
            return mo26148.getResult().m26133();
        }
        mo26148.getResult();
        getValidOutputFormatsForInputhNQ4ISI = (getOutputMinFrameDurationlomOqCM + 21) % 128;
        return null;
    }

    /*  JADX ERROR: JadxRuntimeException in pass: IfRegionVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r8v35 com.gemalto.mfs.mwsdk.utils.async.AsyncResult<util.h.xy.d.ra>, still in use, count: 2, list:
          (r8v35 com.gemalto.mfs.mwsdk.utils.async.AsyncResult<util.h.xy.d.ra>) from 0x0058: INVOKE (r8v35 com.gemalto.mfs.mwsdk.utils.async.AsyncResult<util.h.xy.d.ra>) STATIC call: util.h.xy.f.b.getHighSpeedVideoSizes(com.gemalto.mfs.mwsdk.utils.async.AsyncResult):boolean A[MD:(com.gemalto.mfs.mwsdk.utils.async.AsyncResult<util.h.xy.d.ra>):boolean (m), WRAPPED] (LINE:2364)
          (r8v35 com.gemalto.mfs.mwsdk.utils.async.AsyncResult<util.h.xy.d.ra>) from 0x006b: PHI (r8v32 com.gemalto.mfs.mwsdk.utils.async.AsyncResult<util.h.xy.d.ra>) = 
          (r8v31 com.gemalto.mfs.mwsdk.utils.async.AsyncResult<util.h.xy.d.ra>)
          (r8v35 com.gemalto.mfs.mwsdk.utils.async.AsyncResult<util.h.xy.d.ra>)
         binds: [B:30:0x0069, B:20:0x005c] A[DONT_GENERATE, DONT_INLINE]
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:162)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:127)
        	at jadx.core.dex.visitors.regions.TernaryMod.makeTernaryInsn(TernaryMod.java:114)
        	at jadx.core.dex.visitors.regions.TernaryMod.processRegion(TernaryMod.java:62)
        	at jadx.core.dex.visitors.regions.TernaryMod.enterRegion(TernaryMod.java:45)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:67)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at java.base/java.util.Collections$UnmodifiableCollection.forEach(Collections.java:1117)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at java.base/java.util.Collections$UnmodifiableCollection.forEach(Collections.java:1117)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverse(DepthRegionTraversal.java:19)
        	at jadx.core.dex.visitors.regions.TernaryMod.process(TernaryMod.java:35)
        	at jadx.core.dex.visitors.regions.IfRegionVisitor.process(IfRegionVisitor.java:34)
        	at jadx.core.dex.visitors.regions.IfRegionVisitor.visit(IfRegionVisitor.java:30)
        */
    private boolean getHighSpeedVideoSizes(java.lang.String r7, com.gemalto.mfs.mwsdk.dcm.sdkconfig.ProfileChannel r8, boolean r9) throws com.gemalto.mfs.mwsdk.exception.InternalComponentException {
        /*
            Method dump skipped, instructions count: 428
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: util.h.xy.f.b.getHighSpeedVideoSizes(java.lang.String, com.gemalto.mfs.mwsdk.dcm.sdkconfig.ProfileChannel, boolean):boolean");
    }

    private static boolean getHighSpeedVideoSizes(com.gemalto.mfs.mwsdk.utils.async.AsyncResult<util.h.xy.d.ra> asyncResult) {
        int i = (getValidOutputFormatsForInputhNQ4ISI + 111) % 128;
        getOutputMinFrameDurationlomOqCM = i;
        if (asyncResult == null) {
            return false;
        }
        int i2 = i + 5;
        getValidOutputFormatsForInputhNQ4ISI = i2 % 128;
        if (i2 % 2 == 0) {
            asyncResult.isSuccessful();
            throw new java.lang.ArithmeticException();
        }
        if (!asyncResult.isSuccessful() || asyncResult.getResult() == null) {
            return false;
        }
        getValidOutputFormatsForInputhNQ4ISI = (getOutputMinFrameDurationlomOqCM + 35) % 128;
        return asyncResult.getResult().m26224() > 0;
    }

    private static util.h.xy.d.c getHighSpeedVideoSizes() {
        int i = getValidOutputFormatsForInputhNQ4ISI + 43;
        getOutputMinFrameDurationlomOqCM = i % 128;
        android.content.Context m24558 = util.h.xy.ag.a.m24556().m24558();
        if (i % 2 == 0) {
            return util.h.xy.m.mb.m26975(m24558);
        }
        util.h.xy.m.mb.m26975(m24558);
        throw null;
    }

    /* renamed from: ι, reason: contains not printable characters */
    public final void m26787() {
        int i = getValidOutputFormatsForInputhNQ4ISI;
        getOutputMinFrameDurationlomOqCM = (i + 59) % 128;
        this.coroutineBoundary = null;
        getOutputMinFrameDurationlomOqCM = (i + 37) % 128;
    }

    /* renamed from: ͺ, reason: contains not printable characters */
    public final byte[] m26781() throws com.gemalto.mfs.mwsdk.exception.InternalComponentException {
        byte[] bArr = this.coroutineBoundary;
        if (bArr == null) {
            return util.h.xy.t.mb.f2417.m27436(util.h.xy.o.b.f2281);
        }
        int i = getOutputMinFrameDurationlomOqCM;
        getValidOutputFormatsForInputhNQ4ISI = (i + 9) % 128;
        int i2 = i + 59;
        getValidOutputFormatsForInputhNQ4ISI = i2 % 128;
        if (i2 % 2 != 0) {
            return bArr;
        }
        throw new java.lang.ArithmeticException();
    }

    /* renamed from: ˏ, reason: contains not printable characters */
    public final void m26778(byte[] bArr) throws com.gemalto.mfs.mwsdk.exception.InternalComponentException {
        getOutputMinFrameDurationlomOqCM = (getValidOutputFormatsForInputhNQ4ISI + 53) % 128;
        this.coroutineBoundary = bArr;
        util.h.xy.t.mb.f2417.m27431(util.h.xy.o.b.f2281, bArr);
        int i = getValidOutputFormatsForInputhNQ4ISI + 109;
        getOutputMinFrameDurationlomOqCM = i % 128;
        if (i % 2 != 0) {
            throw null;
        }
    }

    /* renamed from: ʻ, reason: contains not printable characters */
    public final void m26746() {
        int i = (getOutputMinFrameDurationlomOqCM + 9) % 128;
        getValidOutputFormatsForInputhNQ4ISI = i;
        getHighSpeedVideoSizes = (byte) -1;
        getOutputMinFrameDurationlomOqCM = (i + 25) % 128;
    }

    /* renamed from: ˎ, reason: contains not printable characters */
    public final void m26770(byte b) {
        int i = getOutputMinFrameDurationlomOqCM;
        int i2 = i + 81;
        getValidOutputFormatsForInputhNQ4ISI = i2 % 128;
        if (i2 % 2 != 0) {
            getHighSpeedVideoSizes = b;
            int i3 = i + 47;
            getValidOutputFormatsForInputhNQ4ISI = i3 % 128;
            if (i3 % 2 == 0) {
                throw null;
            }
            return;
        }
        getHighSpeedVideoSizes = b;
        throw null;
    }

    /* renamed from: ˈ, reason: contains not printable characters */
    public final void m26749() {
        int i = getValidOutputFormatsForInputhNQ4ISI + 9;
        getOutputMinFrameDurationlomOqCM = i % 128;
        if (i % 2 == 0) {
            this.coroutineBoundary = null;
        } else {
            this.coroutineBoundary = null;
            throw null;
        }
    }

    static void getHighResolutionOutputSizeshNQ4ISI() {
        getOutputSizes = -4962347799065763075L;
    }

    static void Camera2StreamConfigurationMap() {
        getOutputSizeshNQ4ISI = new char[]{64223, 64186, 64160, 64179, 64166, 64183, 64184, 64244, 64177, 64165, 64187, 64164, 64173, 64185, 64191, 64189, 64188, 64238, 64216, 64218, 64193, 64209, 64211, 64161, 64208, 64198, 64196, 64194, 64215, 64219, 64192, 64195, 64176, 64162, 64178, 64217, 64222, 64210, 64251, 64236, 64163};
        getOutputFormats = -1074857196;
        getOutputMinFrameDuration = true;
        getHighSpeedVideoSizesFor = true;
        getInputSizeshNQ4ISI = (char) 32627;
        getInputFormats = (char) 61309;
        getOutputStallDuration = (char) 38819;
        isOutputSupportedForhNQ4ISI = (char) 61474;
    }
}
