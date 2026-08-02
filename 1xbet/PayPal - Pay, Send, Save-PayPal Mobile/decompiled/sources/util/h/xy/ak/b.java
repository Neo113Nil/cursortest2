package util.h.xy.ak;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'ˏ' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:451)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:395)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:324)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:262)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* loaded from: classes5.dex */
public final class b {
    private static int Camera2StreamConfigurationMap = 1;
    private static int getHighResolutionOutputSizeshNQ4ISI = 0;
    private static final /* synthetic */ util.h.xy.ak.b[] getHighSpeedVideoFpsRanges;
    private static int[] getHighSpeedVideoFpsRangesFor = null;
    private static int getHighSpeedVideoSizes = 0;
    private static int getHighSpeedVideoSizesFor = 1;
    private static final java.lang.String getInputSizeshNQ4ISI;

    /* renamed from: ˏ, reason: contains not printable characters */
    public static final util.h.xy.ak.b f76;
    private final java.util.concurrent.locks.Lock getInputFormats = new java.util.concurrent.locks.ReentrantLock();
    private util.h.xy.ac.a getOutputFormats;
    private android.content.Context getOutputMinFrameDuration;

    private b(java.lang.String str) {
    }

    public static util.h.xy.ak.b valueOf(java.lang.String str) {
        int i = getHighSpeedVideoSizesFor + 53;
        getHighResolutionOutputSizeshNQ4ISI = i % 128;
        util.h.xy.ak.b bVar = (util.h.xy.ak.b) java.lang.Enum.valueOf(util.h.xy.ak.b.class, str);
        if (i % 2 == 0) {
            return bVar;
        }
        throw null;
    }

    public static util.h.xy.ak.b[] values() {
        getHighSpeedVideoSizesFor = (getHighResolutionOutputSizeshNQ4ISI + 63) % 128;
        util.h.xy.ak.b[] bVarArr = (util.h.xy.ak.b[]) getHighSpeedVideoFpsRanges.clone();
        int i = getHighSpeedVideoSizesFor + 59;
        getHighResolutionOutputSizeshNQ4ISI = i % 128;
        if (i % 2 == 0) {
            return bVarArr;
        }
        throw null;
    }

    static {
        getHighSpeedVideoSizes();
        java.lang.Object[] objArr = new java.lang.Object[1];
        getHighSpeedVideoSizes(new int[]{-132838455, -102549329, 1673950860, 1880306960}, android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0) + 9, objArr);
        util.h.xy.ak.b bVar = new util.h.xy.ak.b(((java.lang.String) objArr[0]).intern());
        f76 = bVar;
        int i = getHighResolutionOutputSizeshNQ4ISI + 125;
        int i2 = i % 128;
        getHighSpeedVideoSizesFor = i2;
        int i3 = i % 2;
        getHighResolutionOutputSizeshNQ4ISI = (i2 + com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CALENDAR_VALUE) % 128;
        getHighSpeedVideoFpsRanges = new util.h.xy.ak.b[]{bVar};
        getInputSizeshNQ4ISI = util.h.xy.ak.b.class.getName();
        getHighResolutionOutputSizeshNQ4ISI = (getHighSpeedVideoSizesFor + 29) % 128;
    }

    private static void getHighSpeedVideoSizes(int[] iArr, int i, java.lang.Object[] objArr) {
        util.h.xz.b.c cVar = new util.h.xz.b.c();
        char[] cArr = new char[4];
        char[] cArr2 = new char[iArr.length * 2];
        int[] iArr2 = getHighSpeedVideoFpsRangesFor;
        if (iArr2 != null) {
            int length = iArr2.length;
            int[] iArr3 = new int[length];
            for (int i2 = 0; i2 < length; i2++) {
                Camera2StreamConfigurationMap = (getHighSpeedVideoSizes + com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CALENDAR_VALUE) % 128;
                iArr3[i2] = (int) (iArr2[i2] ^ (-5569649899877129369L));
            }
            int i3 = Camera2StreamConfigurationMap + 125;
            getHighSpeedVideoSizes = i3 % 128;
            int i4 = i3 % 2;
            iArr2 = iArr3;
        }
        int length2 = iArr2.length;
        int[] iArr4 = new int[length2];
        int[] iArr5 = getHighSpeedVideoFpsRangesFor;
        if (iArr5 != null) {
            int length3 = iArr5.length;
            int[] iArr6 = new int[length3];
            for (int i5 = 0; i5 < length3; i5++) {
                iArr6[i5] = (int) (iArr5[i5] ^ (-5569649899877129369L));
            }
            iArr5 = iArr6;
        }
        java.lang.System.arraycopy(iArr5, 0, iArr4, 0, length2);
        cVar.f2626 = 0;
        while (cVar.f2626 < iArr.length) {
            cArr[0] = (char) (iArr[cVar.f2626] >> 16);
            cArr[1] = (char) iArr[cVar.f2626];
            cArr[2] = (char) (iArr[cVar.f2626 + 1] >> 16);
            cArr[3] = (char) iArr[cVar.f2626 + 1];
            cVar.f2627 = (cArr[0] << 16) + cArr[1];
            cVar.f2625 = (cArr[2] << 16) + cArr[3];
            util.h.xz.b.c.m27723(iArr4);
            for (int i6 = 0; i6 < 16; i6++) {
                Camera2StreamConfigurationMap = (getHighSpeedVideoSizes + 63) % 128;
                cVar.f2627 ^= iArr4[i6];
                cVar.f2625 = util.h.xz.b.c.m27724(cVar.f2627) ^ cVar.f2625;
                int i7 = cVar.f2627;
                cVar.f2627 = cVar.f2625;
                cVar.f2625 = i7;
            }
            int i8 = cVar.f2627;
            cVar.f2627 = cVar.f2625;
            cVar.f2625 = i8;
            cVar.f2625 ^= iArr4[16];
            cVar.f2627 ^= iArr4[17];
            int i9 = cVar.f2627;
            int i10 = cVar.f2625;
            cArr[0] = (char) (cVar.f2627 >>> 16);
            cArr[1] = (char) cVar.f2627;
            cArr[2] = (char) (cVar.f2625 >>> 16);
            cArr[3] = (char) cVar.f2625;
            util.h.xz.b.c.m27723(iArr4);
            cArr2[cVar.f2626 * 2] = cArr[0];
            cArr2[(cVar.f2626 * 2) + 1] = cArr[1];
            cArr2[(cVar.f2626 * 2) + 2] = cArr[2];
            cArr2[(cVar.f2626 * 2) + 3] = cArr[3];
            cVar.f2626 += 2;
        }
        objArr[0] = new java.lang.String(cArr2, 0, i);
    }

    /* renamed from: ˏ, reason: contains not printable characters */
    public final void m24963(android.content.Context context) throws com.gemalto.mfs.mwsdk.exception.InternalComponentException {
        synchronized (this) {
            getHighResolutionOutputSizeshNQ4ISI = (getHighSpeedVideoSizesFor + 57) % 128;
            if (util.h.xy.ag.a.m24556().m24558() == null) {
                int i = getHighSpeedVideoSizesFor;
                getHighResolutionOutputSizeshNQ4ISI = (i + 107) % 128;
                if (context == null) {
                    java.lang.Object[] objArr = new java.lang.Object[1];
                    getHighSpeedVideoSizes(new int[]{-1621151380, -1168686602, -1547915658, -1512351057, 782092665, 849782869, -909575785, -1543093187, 62257466, -1129288092, -709574165, 899422431, -1789045726, 1494316702, -1309762706, -1481701193, 1477867993, 1122605573, -1407609816, -235483026, 282344566, -541481479, 733794683, 2017098480, -920523617, 2134508713, -1005555004, 101105663, -2049552442, -828075596}, (android.view.ViewConfiguration.getScrollBarSize() >> 8) + 57, objArr);
                    throw new com.gemalto.mfs.mwsdk.exception.InternalComponentException(((java.lang.String) objArr[0]).intern());
                }
                int i2 = i + 41;
                getHighResolutionOutputSizeshNQ4ISI = i2 % 128;
                if (i2 % 2 != 0) {
                    util.h.xy.ag.a.m24556().m24559(context);
                    this.getOutputMinFrameDuration = context;
                    throw new java.lang.ArithmeticException();
                }
                util.h.xy.ag.a.m24556().m24559(context);
                this.getOutputMinFrameDuration = context;
            } else {
                this.getOutputMinFrameDuration = util.h.xy.ag.a.m24556().m24558();
                getHighResolutionOutputSizeshNQ4ISI = (getHighSpeedVideoSizesFor + 97) % 128;
            }
            if (util.h.xy.ak.a.f74.m24961()) {
                throw new com.gemalto.mfs.mwsdk.exception.InternalComponentException(util.h.xy.al.ra.f716);
            }
            if (util.h.xy.ak.mb.f85.m24996()) {
                int i3 = getHighResolutionOutputSizeshNQ4ISI + 117;
                getHighSpeedVideoSizesFor = i3 % 128;
                try {
                    if (i3 % 2 == 0) {
                        Camera2StreamConfigurationMap();
                        util.h.xy.ak.ra.f87.m24998(this.getOutputMinFrameDuration);
                        util.h.xy.ac.d.m24541(util.h.xy.ak.ra.f87.f88, this.getOutputFormats);
                        util.h.xy.ak.mb.f85.m24997();
                        throw new java.lang.NullPointerException();
                    }
                    Camera2StreamConfigurationMap();
                    util.h.xy.ak.ra.f87.m24998(this.getOutputMinFrameDuration);
                    util.h.xy.ac.d.m24541(util.h.xy.ak.ra.f87.f88, this.getOutputFormats);
                    util.h.xy.ak.mb.f85.m24997();
                } catch (util.h.xy.ac.mc | util.h.xy.da.b unused) {
                    util.h.xy.ak.b bVar = f76;
                    java.lang.Object[] objArr2 = new java.lang.Object[1];
                    getHighSpeedVideoSizes(new int[]{-1121796521, 870561621, 1090577082, -852207458, -466268226, -364641225, 190213545, -1603260326}, 14 - android.text.TextUtils.getOffsetAfter("", 0), objArr2);
                    java.lang.String intern = ((java.lang.String) objArr2[0]).intern();
                    java.lang.Object[] objArr3 = new java.lang.Object[1];
                    getHighSpeedVideoSizes(new int[]{-1404892414, -107815944, -1909805172, 1865470100}, (android.view.ViewConfiguration.getFadingEdgeLength() >> 16) + 6, objArr3);
                    bVar.m24964(intern, ((java.lang.String) objArr3[0]).intern().getBytes());
                    if (util.h.xy.ak.mb.f85.f86 != null) {
                        util.h.xy.ak.mb.f85.m24997();
                        getHighSpeedVideoSizesFor = (getHighResolutionOutputSizeshNQ4ISI + 99) % 128;
                    }
                }
            }
            int i4 = getHighResolutionOutputSizeshNQ4ISI + 77;
            getHighSpeedVideoSizesFor = i4 % 128;
            if (i4 % 2 == 0) {
                throw new java.lang.NullPointerException();
            }
        }
    }

    /* renamed from: ˏ, reason: contains not printable characters */
    public final void m24964(java.lang.String str, byte[] bArr) throws com.gemalto.mfs.mwsdk.exception.InternalComponentException {
        int i = getHighSpeedVideoSizesFor + 59;
        getHighResolutionOutputSizeshNQ4ISI = i % 128;
        try {
            try {
                if (i % 2 == 0) {
                    this.getInputFormats.lock();
                    Camera2StreamConfigurationMap();
                    this.getOutputFormats.m24537(str.getBytes(), bArr);
                } else {
                    this.getInputFormats.lock();
                    Camera2StreamConfigurationMap();
                    this.getOutputFormats.m24537(str.getBytes(), bArr);
                    this.getInputFormats.unlock();
                    throw null;
                }
            } catch (util.h.xy.ac.mc e) {
                java.lang.Object[] objArr = new java.lang.Object[1];
                getHighSpeedVideoSizes(new int[]{1800487096, 1897437029, -2096782073, 249567687, -1309762706, -1481701193, -1040380743, 192071124, 1501252771, 448853646, -331097779, 855367250, 1252808710, 1595503765, 485791108, -1697418284}, 30 - android.text.TextUtils.getTrimmedLength(""), objArr);
                throw new com.gemalto.mfs.mwsdk.exception.InternalComponentException(((java.lang.String) objArr[0]).intern(), e);
            }
        } finally {
            this.getInputFormats.unlock();
        }
    }

    /* renamed from: ᐝ, reason: contains not printable characters */
    public final byte[] m24965(java.lang.String str) throws com.gemalto.mfs.mwsdk.exception.InternalComponentException {
        getHighSpeedVideoSizesFor = (getHighResolutionOutputSizeshNQ4ISI + 93) % 128;
        try {
            try {
                this.getInputFormats.lock();
                Camera2StreamConfigurationMap();
                byte[] m24538 = this.getOutputFormats.m24538(str.getBytes());
                this.getInputFormats.unlock();
                getHighSpeedVideoSizesFor = (getHighResolutionOutputSizeshNQ4ISI + 33) % 128;
                return m24538;
            } catch (util.h.xy.ac.mc e) {
                java.lang.Object[] objArr = new java.lang.Object[1];
                getHighSpeedVideoSizes(new int[]{1800487096, 1897437029, -2096782073, 249567687, -1309762706, -1481701193, -613918221, 670367283, -335695011, 1207998164, -1301378179, 1117722068, -1229547378, 137244602, -761279757, 604990222}, android.text.TextUtils.getOffsetAfter("", 0) + 29, objArr);
                throw new com.gemalto.mfs.mwsdk.exception.InternalComponentException(((java.lang.String) objArr[0]).intern(), e);
            }
        } catch (java.lang.Throwable th) {
            this.getInputFormats.unlock();
            throw th;
        }
    }

    /* renamed from: ˎ, reason: contains not printable characters */
    public final void m24962() throws com.gemalto.mfs.mwsdk.exception.InternalComponentException {
        Camera2StreamConfigurationMap();
        util.h.xy.ac.a aVar = this.getOutputFormats;
        if (aVar != null) {
            getHighSpeedVideoSizesFor = (getHighResolutionOutputSizeshNQ4ISI + 55) % 128;
            aVar.m24536();
            this.getOutputFormats = null;
        }
        getHighSpeedVideoSizesFor = (getHighResolutionOutputSizeshNQ4ISI + com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CALENDAR_VALUE) % 128;
    }

    private void Camera2StreamConfigurationMap() throws com.gemalto.mfs.mwsdk.exception.InternalComponentException {
        if (this.getOutputFormats == null) {
            if (this.getOutputMinFrameDuration == null) {
                int i = getHighResolutionOutputSizeshNQ4ISI + 27;
                getHighSpeedVideoSizesFor = i % 128;
                if (i % 2 != 0) {
                    if (util.h.xy.ag.a.m24556().m24558() != null) {
                        this.getOutputMinFrameDuration = util.h.xy.ag.a.m24556().m24558();
                    } else {
                        java.lang.Object[] objArr = new java.lang.Object[1];
                        getHighSpeedVideoSizes(new int[]{1800487096, 1897437029, -2096782073, 249567687, 2061255394, 527347050, 99347100, 1850462672, -1934155576, -349091443, 511166447, 160773584, 1540513402, -123310677, 1469426554, 1688237927, 651913912, 423864079, 1359525379, 951369047, -40338186, -1663811074, 1854360024, 1281135083, 2103203493, 494988767}, (android.view.ViewConfiguration.getMinimumFlingVelocity() >> 16) + 51, objArr);
                        throw new com.gemalto.mfs.mwsdk.exception.InternalComponentException(((java.lang.String) objArr[0]).intern());
                    }
                } else {
                    util.h.xy.ag.a.m24556().m24558();
                    throw null;
                }
            }
            byte[] m24548 = util.h.xy.ad.a.m24548(util.h.xy.z.mb.m27715());
            util.h.xy.al.rb.m25016(m24548);
            util.h.xy.ac.c cVar = new util.h.xy.ac.c(m24548);
            android.content.Context context = this.getOutputMinFrameDuration;
            java.lang.Object[] objArr2 = new java.lang.Object[1];
            getHighSpeedVideoSizes(new int[]{1140156097, 1624333130, -518264779, 1991620111, 120863903, -416250851}, (android.view.ViewConfiguration.getScrollBarFadeDuration() >> 16) + 10, objArr2);
            this.getOutputFormats = new util.h.xy.ac.a(context, ((java.lang.String) objArr2[0]).intern(), cVar);
            java.lang.Object[] objArr3 = new java.lang.Object[1];
            getHighSpeedVideoSizes(new int[]{-514352256, 2063106938, -108803895, -2136323208}, 5 - (android.view.ViewConfiguration.getWindowTouchSlop() >> 8), objArr3);
            util.h.xy.am.ma.m25030(((java.lang.String) objArr3[0]).intern(), m24548);
            getHighSpeedVideoSizesFor = (getHighResolutionOutputSizeshNQ4ISI + 111) % 128;
        }
    }

    static void getHighSpeedVideoSizes() {
        getHighSpeedVideoFpsRangesFor = new int[]{148359598, 826926610, 334116991, -2144353288, 248291196, -1782787932, -1304413483, -384500789, -141864515, -772655048, 1989195236, -441140097, 246960296, -767698694, 39485849, -610327679, -1087855272, 1281969743};
    }
}
