package util.h.xy.n;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* loaded from: classes5.dex */
public final class ma {
    private static int Camera2StreamConfigurationMap = 0;
    private static int getHighResolutionOutputSizeshNQ4ISI = 1;
    private static int getHighSpeedVideoFpsRanges = 1;
    private static char[] getHighSpeedVideoFpsRangesFor;
    private static int getHighSpeedVideoSizes;
    private static boolean getHighSpeedVideoSizesFor;
    private static final /* synthetic */ util.h.xy.n.ma[] getInputFormats;
    private static char getInputSizeshNQ4ISI;
    private static long getOutputFormats;
    private static boolean getOutputMinFrameDuration;
    private static int getOutputSizes;
    private static int getOutputStallDuration;
    private static final java.lang.String getOutputStallDurationlomOqCM;

    /* renamed from: ˎ, reason: contains not printable characters */
    public static final util.h.xy.n.ma f2247;

    /* renamed from: ˏ, reason: contains not printable characters */
    public android.content.Context f2251 = null;

    /* renamed from: ˋ, reason: contains not printable characters */
    public util.h.xy.da.ra f2250 = null;

    /* renamed from: ˊ, reason: contains not printable characters */
    public util.h.xy.da.ra f2249 = null;

    /* renamed from: ᐝ, reason: contains not printable characters */
    public util.h.xy.da.ra f2253 = null;

    /* renamed from: ͺ, reason: contains not printable characters */
    public util.h.xy.da.ra f2252 = null;

    /* renamed from: ʼ, reason: contains not printable characters */
    public util.h.xy.da.ra f2248 = null;
    private final java.util.concurrent.locks.Lock getValidOutputFormatsForInputhNQ4ISI = new java.util.concurrent.locks.ReentrantLock();
    private final java.util.concurrent.locks.Lock isOutputSupportedForhNQ4ISI = new java.util.concurrent.locks.ReentrantLock();
    private final java.util.concurrent.locks.Lock coroutineBoundary = new java.util.concurrent.locks.ReentrantLock();
    private final java.util.concurrent.locks.Lock toString = new java.util.concurrent.locks.ReentrantLock();
    private final java.util.concurrent.locks.Lock coroutineCreation = new java.util.concurrent.locks.ReentrantLock();
    private final java.util.concurrent.locks.Lock unwrapAs = new java.util.concurrent.locks.ReentrantLock();
    private final java.util.concurrent.locks.Lock accessartificialFrame = new java.util.concurrent.locks.ReentrantLock();
    private final java.util.concurrent.locks.Lock resetTransaction = new java.util.concurrent.locks.ReentrantLock();
    private final java.util.concurrent.locks.Lock AMEXKernel = new java.util.concurrent.locks.ReentrantLock();
    private final java.util.concurrent.locks.Lock d = new java.util.concurrent.locks.ReentrantLock();
    private final java.util.concurrent.locks.Lock _CREATION = new java.util.concurrent.locks.ReentrantLock();
    private final java.util.concurrent.locks.Lock getARTIFICIAL_FRAME_PACKAGE_NAME = new java.util.concurrent.locks.ReentrantLock();
    private final java.util.concurrent.locks.Lock l = new java.util.concurrent.locks.ReentrantLock();
    private final java.util.concurrent.locks.Lock b = new java.util.concurrent.locks.ReentrantLock();
    private final java.util.concurrent.locks.Lock isOutputSupportedFor = new java.util.concurrent.locks.ReentrantLock();
    private final java.util.concurrent.locks.Lock rsaCipher = new java.util.concurrent.locks.ReentrantLock();
    private final java.util.concurrent.locks.Lock kernelVersion = new java.util.concurrent.locks.ReentrantLock();
    private final java.util.concurrent.locks.Lock exchange = new java.util.concurrent.locks.ReentrantLock();
    private final java.util.concurrent.locks.Lock c = new java.util.concurrent.locks.ReentrantLock();
    private final java.util.concurrent.locks.Lock release = new java.util.concurrent.locks.ReentrantLock();
    private util.h.xy.n.b startTransaction = util.h.xy.n.b.f2246;
    private util.h.xy.n.b AMEXKernela = util.h.xy.n.b.f2246;
    private util.h.xy.n.b updateUI = util.h.xy.n.b.f2246;
    private util.h.xy.n.b AMEXKernelCallback = util.h.xy.n.b.f2246;
    private util.h.xy.n.b getOutputSizeshNQ4ISI = util.h.xy.n.b.f2246;
    private util.h.xy.n.b requestPINEntry = util.h.xy.n.b.f2246;
    private util.h.xy.n.b requestGoOnline = util.h.xy.n.b.f2246;
    private util.h.xy.n.b ArtificialStackFrames = util.h.xy.n.b.f2246;
    private util.h.xy.n.b getOutputMinFrameDurationlomOqCM = util.h.xy.n.b.f2246;
    private util.h.xy.n.b _BOUNDARY = util.h.xy.n.b.f2246;
    private util.h.xy.n.b CoroutineDebuggingKt = util.h.xy.n.b.f2246;

    /* renamed from: a, reason: collision with root package name */
    private util.h.xy.n.b f7079a = util.h.xy.n.b.f2246;
    private java.util.concurrent.Executor init = java.util.concurrent.Executors.newFixedThreadPool(3);

    private ma(java.lang.String str) {
    }

    public static util.h.xy.n.ma valueOf(java.lang.String str) {
        getOutputStallDuration = (getHighSpeedVideoFpsRanges + 49) % 128;
        util.h.xy.n.ma maVar = (util.h.xy.n.ma) java.lang.Enum.valueOf(util.h.xy.n.ma.class, str);
        int i = getHighSpeedVideoFpsRanges + 47;
        getOutputStallDuration = i % 128;
        if (i % 2 == 0) {
            return maVar;
        }
        throw null;
    }

    public static util.h.xy.n.ma[] values() {
        getHighSpeedVideoFpsRanges = (getOutputStallDuration + 115) % 128;
        util.h.xy.n.ma[] maVarArr = (util.h.xy.n.ma[]) getInputFormats.clone();
        int i = getHighSpeedVideoFpsRanges + 103;
        getOutputStallDuration = i % 128;
        if (i % 2 == 0) {
            return maVarArr;
        }
        throw new java.lang.ArithmeticException();
    }

    static {
        Camera2StreamConfigurationMap();
        getHighResolutionOutputSizeshNQ4ISI();
        java.lang.Object[] objArr = new java.lang.Object[1];
        getHighResolutionOutputSizeshNQ4ISI(127 - (android.view.ViewConfiguration.getTouchSlop() >> 8), "\u009d\u009c\u0099\u009b\u009a\u0081\u0099\u0098", objArr);
        util.h.xy.n.ma maVar = new util.h.xy.n.ma(((java.lang.String) objArr[0]).intern());
        f2247 = maVar;
        int i = (getHighSpeedVideoFpsRanges + 117) % 128;
        getOutputStallDuration = i;
        util.h.xy.n.ma[] maVarArr = {maVar};
        int i2 = i + 47;
        getHighSpeedVideoFpsRanges = i2 % 128;
        if (i2 % 2 != 0) {
            getInputFormats = maVarArr;
            getOutputStallDurationlomOqCM = util.h.xy.n.ma.class.getName();
            getOutputStallDuration = (getHighSpeedVideoFpsRanges + 99) % 128;
            return;
        }
        throw null;
    }

    private static void Camera2StreamConfigurationMap(java.lang.String str, char c, int i, java.lang.String str2, java.lang.String str3, java.lang.Object[] objArr) {
        char[] charArray = str3.toCharArray();
        char[] charArray2 = str2.toCharArray();
        char[] charArray3 = str.toCharArray();
        util.h.xz.b.rc rcVar = new util.h.xz.b.rc();
        int length = charArray2.length;
        char[] cArr = new char[length];
        int length2 = charArray.length;
        char[] cArr2 = new char[length2];
        java.lang.System.arraycopy(charArray2, 0, cArr, 0, length);
        java.lang.System.arraycopy(charArray, 0, cArr2, 0, length2);
        cArr[0] = (char) (cArr[0] ^ c);
        cArr2[2] = (char) (cArr2[2] + ((char) i));
        int length3 = charArray3.length;
        char[] cArr3 = new char[length3];
        rcVar.f2652 = 0;
        while (rcVar.f2652 < length3) {
            int i2 = (rcVar.f2652 + 2) % 4;
            int i3 = (rcVar.f2652 + 3) % 4;
            rcVar.f2653 = (char) (((cArr[rcVar.f2652 % 4] * 32718) + cArr2[i2]) % 65535);
            cArr2[i3] = (char) (((cArr[i3] * 32718) + cArr2[i2]) / 65535);
            cArr[i3] = rcVar.f2653;
            cArr3[rcVar.f2652] = (char) ((((cArr[i3] ^ charArray3[rcVar.f2652]) ^ (getOutputFormats ^ 2457411417541981002L)) ^ ((int) (getOutputSizes ^ 2457411417541981002L))) ^ ((char) (getInputSizeshNQ4ISI ^ 2457411417541981002L)));
            rcVar.f2652++;
        }
        objArr[0] = new java.lang.String(cArr3);
    }

    /* renamed from: ˊ, reason: contains not printable characters */
    public final void m26982(android.content.Context context, boolean z) throws com.gemalto.mfs.mwsdk.exception.InternalComponentException {
        synchronized (this) {
            int i = (getHighSpeedVideoFpsRanges + 109) % 128;
            getOutputStallDuration = i;
            if (this.f2251 != null) {
                int i2 = i + 63;
                getHighSpeedVideoFpsRanges = i2 % 128;
                if (i2 % 2 == 0) {
                    throw new java.lang.ArithmeticException();
                }
                if (!z) {
                    return;
                }
            }
            try {
                getHighSpeedVideoFpsRangesFor();
                int i3 = getHighSpeedVideoFpsRanges;
                int i4 = i3 + 71;
                getOutputStallDuration = i4 % 128;
                if (i4 % 2 != 0) {
                    throw null;
                }
                if (context == null) {
                    throw new java.lang.IllegalArgumentException(util.h.xy.i.b.f2223);
                }
                if (context instanceof android.app.Activity) {
                    getOutputStallDuration = (i3 + 87) % 128;
                    this.f2251 = context.getApplicationContext();
                } else {
                    java.lang.Object[] objArr = new java.lang.Object[1];
                    Camera2StreamConfigurationMap("롬킙\uea53诒捯땝ᇃ識䜭⪾湍㶷罔냁츚怏㋶뎞鍀\ue3d2鼘\ud981ߠ", (char) android.view.KeyEvent.keyCodeFromString(""), (-947860268) - (android.view.ViewConfiguration.getJumpTapTimeout() >> 16), "푑背㛇ꃉ", "롍\ued6a섾갦", objArr);
                    if (!java.lang.Class.forName((java.lang.String) objArr[0]).isInstance(context)) {
                        throw new java.lang.IllegalArgumentException(util.h.xy.i.b.f2223);
                    }
                    int i5 = getHighSpeedVideoFpsRanges + 41;
                    getOutputStallDuration = i5 % 128;
                    if (i5 % 2 != 0) {
                        this.f2251 = context;
                        throw new java.lang.NullPointerException();
                    }
                    this.f2251 = context;
                }
                try {
                    new util.h.xy.l.a();
                    util.h.xy.l.a.m26974(context);
                    int i6 = getHighSpeedVideoFpsRanges;
                    int i7 = i6 + 49;
                    getOutputStallDuration = i7 % 128;
                    int i8 = i7 % 2;
                    getOutputStallDuration = (i6 + 7) % 128;
                    return;
                } catch (com.gemalto.mfs.mwsdk.exception.InternalComponentException e) {
                    this.f2251 = null;
                    throw e;
                }
            } catch (util.h.xy.da.b e2) {
                java.lang.Object[] objArr2 = new java.lang.Object[1];
                getHighResolutionOutputSizeshNQ4ISI(127 - android.text.TextUtils.getOffsetBefore("", 0), "\u008f\u0089\u008e\u0088\u008d\u0082\u0083\u008c\u0082\u0086\u0082\u008b\u008a\u0085\u0089\u0088\u0087\u0086\u0082\u0085\u0084\u0083\u0082\u0081", objArr2);
                throw new com.gemalto.mfs.mwsdk.exception.InternalComponentException(((java.lang.String) objArr2[0]).intern(), e2);
            }
        }
    }

    private static void getHighResolutionOutputSizeshNQ4ISI(int i, java.lang.String str, java.lang.Object[] objArr) {
        int length;
        char[] cArr;
        int i2;
        int i3 = getHighResolutionOutputSizeshNQ4ISI + 21;
        Camera2StreamConfigurationMap = i3 % 128;
        if (i3 % 2 != 0) {
            throw null;
        }
        byte[] bytes = str.getBytes("ISO-8859-1");
        util.h.xz.b.md mdVar = new util.h.xz.b.md();
        char[] cArr2 = getHighSpeedVideoFpsRangesFor;
        if (cArr2 != null) {
            int i4 = getHighResolutionOutputSizeshNQ4ISI + 17;
            Camera2StreamConfigurationMap = i4 % 128;
            if (i4 % 2 != 0) {
                length = cArr2.length;
                cArr = new char[length];
                i2 = 1;
            } else {
                length = cArr2.length;
                cArr = new char[length];
                i2 = 0;
            }
            while (i2 < length) {
                cArr[i2] = (char) (cArr2[i2] ^ (-3299939579226817547L));
                i2++;
            }
            cArr2 = cArr;
        }
        int i5 = (int) ((-3299939579226817547L) ^ getHighSpeedVideoSizes);
        if (!getOutputMinFrameDuration) {
            if (!getHighSpeedVideoSizesFor) {
                throw null;
            }
            getHighResolutionOutputSizeshNQ4ISI = (Camera2StreamConfigurationMap + 101) % 128;
            throw null;
        }
        mdVar.f2642 = bytes.length;
        char[] cArr3 = new char[mdVar.f2642];
        mdVar.f2643 = 0;
        while (mdVar.f2643 < mdVar.f2642) {
            cArr3[mdVar.f2643] = (char) (cArr2[bytes[(mdVar.f2642 - 1) - mdVar.f2643] + i] - i5);
            mdVar.f2643++;
        }
        objArr[0] = new java.lang.String(cArr3);
    }

    private void getHighSpeedVideoFpsRangesFor() throws util.h.xy.da.b {
        util.h.xy.da.ma maVar;
        java.lang.Object obj;
        util.h.xy.da.mc.m26263(util.h.xy.ag.a.m24556().m24558());
        if (this.f2250 == null) {
            util.h.xy.da.ma maVar2 = util.h.xy.da.ma.f1156;
            java.lang.Object[] objArr = new java.lang.Object[1];
            getHighResolutionOutputSizeshNQ4ISI(127 - android.text.TextUtils.indexOf("", ""), "\u0092\u0091\u0090\u0090", objArr);
            this.f2250 = util.h.xy.da.d.m26260(maVar2, ((java.lang.String) objArr[0]).intern());
        }
        if (this.f2249 == null) {
            getHighSpeedVideoFpsRanges = (getOutputStallDuration + 65) % 128;
            util.h.xy.da.ma maVar3 = util.h.xy.da.ma.f1156;
            java.lang.Object[] objArr2 = new java.lang.Object[1];
            getHighResolutionOutputSizeshNQ4ISI(128 - (android.view.ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)), "\u0093\u0091\u0090\u0090", objArr2);
            this.f2249 = util.h.xy.da.d.m26260(maVar3, ((java.lang.String) objArr2[0]).intern());
        }
        if (this.f2253 == null) {
            getHighSpeedVideoFpsRanges = (getOutputStallDuration + 111) % 128;
            util.h.xy.da.ma maVar4 = util.h.xy.da.ma.f1156;
            try {
                java.lang.Object[] objArr3 = new java.lang.Object[1];
                getHighResolutionOutputSizeshNQ4ISI(((java.lang.Integer) java.lang.Class.forName("android.os.Process").getMethod("getGidForName", java.lang.String.class).invoke(null, "")).intValue() + 128, "\u0094\u0091\u0090\u0090", objArr3);
                this.f2253 = util.h.xy.da.d.m26260(maVar4, ((java.lang.String) objArr3[0]).intern());
            } catch (java.lang.Throwable th) {
                java.lang.Throwable cause = th.getCause();
                if (cause == null) {
                    throw th;
                }
                throw cause;
            }
        }
        if (this.f2252 == null) {
            util.h.xy.da.ma maVar5 = util.h.xy.da.ma.f1156;
            java.lang.Object[] objArr4 = new java.lang.Object[1];
            getHighResolutionOutputSizeshNQ4ISI(127 - android.text.TextUtils.getTrimmedLength(""), "\u0095\u0091\u0090\u0090", objArr4);
            this.f2252 = util.h.xy.da.d.m26260(maVar5, ((java.lang.String) objArr4[0]).intern());
            getHighSpeedVideoFpsRanges = (getOutputStallDuration + 47) % 128;
        }
        if (this.f2248 == null) {
            int i = getOutputStallDuration + 91;
            getHighSpeedVideoFpsRanges = i % 128;
            if (i % 2 == 0) {
                maVar = util.h.xy.da.ma.f1156;
                java.lang.Object[] objArr5 = new java.lang.Object[1];
                getHighResolutionOutputSizeshNQ4ISI(49 - android.text.TextUtils.indexOf("", "", 1), "\u0097\u0096\u0090\u0090", objArr5);
                obj = objArr5[0];
            } else {
                maVar = util.h.xy.da.ma.f1156;
                java.lang.Object[] objArr6 = new java.lang.Object[1];
                getHighResolutionOutputSizeshNQ4ISI(android.text.TextUtils.indexOf("", "", 0) + 127, "\u0097\u0096\u0090\u0090", objArr6);
                obj = objArr6[0];
            }
            this.f2248 = util.h.xy.da.d.m26260(maVar, ((java.lang.String) obj).intern());
        }
    }

    /* renamed from: ˏ, reason: contains not printable characters */
    public final void m26983() {
        try {
            getHighSpeedVideoFpsRangesFor();
        } catch (util.h.xy.da.b unused) {
        }
        try {
            this.getValidOutputFormatsForInputhNQ4ISI.lock();
            this.coroutineBoundary.lock();
            this.toString.lock();
            this.coroutineCreation.lock();
            this.unwrapAs.lock();
            this.accessartificialFrame.lock();
            this.c.lock();
            this.exchange.lock();
            this.resetTransaction.lock();
            this.b.lock();
            this.isOutputSupportedFor.lock();
            this.rsaCipher.lock();
            try {
                if (this.f2250.mo26080()) {
                    getOutputStallDuration = (getHighSpeedVideoFpsRanges + 53) % 128;
                    this.f2250.mo26074();
                    getOutputStallDuration = (getHighSpeedVideoFpsRanges + 71) % 128;
                }
            } catch (java.lang.Exception unused2) {
            }
            try {
                if (this.f2249.mo26080()) {
                    int i = getOutputStallDuration + 45;
                    getHighSpeedVideoFpsRanges = i % 128;
                    if (i % 2 == 0) {
                        this.f2249.mo26074();
                        throw new java.lang.NullPointerException();
                    }
                    this.f2249.mo26074();
                    getOutputStallDuration = (getHighSpeedVideoFpsRanges + 13) % 128;
                }
            } catch (java.lang.Exception unused3) {
            }
            try {
                if (this.f2253.mo26080()) {
                    getHighSpeedVideoFpsRanges = (getOutputStallDuration + 73) % 128;
                    this.f2253.mo26074();
                }
            } catch (java.lang.Exception unused4) {
            }
            try {
                if (this.f2252.mo26080()) {
                    int i2 = getHighSpeedVideoFpsRanges + 73;
                    getOutputStallDuration = i2 % 128;
                    if (i2 % 2 != 0) {
                        this.f2252.mo26074();
                        throw null;
                    }
                    this.f2252.mo26074();
                }
            } catch (java.lang.Exception unused5) {
            }
            try {
                if (this.f2248.mo26080()) {
                    this.f2248.mo26074();
                }
            } catch (java.lang.Exception unused6) {
            }
            util.h.xy.ak.d.m24967(this.f2250);
            util.h.xy.ak.d.m24967(this.f2249);
            util.h.xy.ak.d.m24967(this.f2253);
            util.h.xy.ak.d.m24967(this.f2252);
            util.h.xy.ak.d.m24967(this.f2248);
        } finally {
            this.getValidOutputFormatsForInputhNQ4ISI.unlock();
            this.coroutineBoundary.unlock();
            this.toString.unlock();
            this.coroutineCreation.unlock();
            this.unwrapAs.unlock();
            this.accessartificialFrame.unlock();
            this.c.unlock();
            this.exchange.unlock();
            this.resetTransaction.unlock();
            this.b.unlock();
            this.isOutputSupportedFor.unlock();
            this.rsaCipher.unlock();
        }
    }

    static void Camera2StreamConfigurationMap() {
        getOutputFormats = -8197470973147051257L;
        getOutputSizes = 294925130;
        getInputSizeshNQ4ISI = (char) 13130;
    }

    static void getHighResolutionOutputSizeshNQ4ISI() {
        getHighSpeedVideoFpsRangesFor = new char[]{64364, 64350, 64348, 64334, 64333, 64403, 64332, 64335, 64320, 64338, 64344, 64331, 64323, 64346, 64321, 64336, 64386, 64398, 64392, 64395, 64394, 64397, 64387, 64378, 64353, 64367, 64370, 64380, 64382};
        getHighSpeedVideoSizes = -1074857037;
        getHighSpeedVideoSizesFor = true;
        getOutputMinFrameDuration = true;
    }
}
