package util.h.xy.au;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* loaded from: classes18.dex */
public final class rc {
    private static int[] Camera2StreamConfigurationMap = null;
    private static int getHighResolutionOutputSizeshNQ4ISI = 1;
    private static int getHighSpeedVideoFpsRanges = 0;
    private static int getHighSpeedVideoFpsRangesFor = 0;
    private static int getHighSpeedVideoSizes = 1;
    private static final /* synthetic */ util.h.xy.au.rc[] getInputSizeshNQ4ISI;
    private static final java.lang.String getOutputFormats;

    /* renamed from: ˊ, reason: contains not printable characters */
    public static final util.h.xy.au.rc f878;

    private rc(java.lang.String str) {
    }

    public static util.h.xy.au.rc valueOf(java.lang.String str) {
        int i = getHighResolutionOutputSizeshNQ4ISI + 85;
        getHighSpeedVideoFpsRangesFor = i % 128;
        util.h.xy.au.rc rcVar = (util.h.xy.au.rc) java.lang.Enum.valueOf(util.h.xy.au.rc.class, str);
        if (i % 2 == 0) {
            return rcVar;
        }
        throw null;
    }

    public static util.h.xy.au.rc[] values() {
        getHighSpeedVideoFpsRangesFor = (getHighResolutionOutputSizeshNQ4ISI + com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CALENDAR_VALUE) % 128;
        util.h.xy.au.rc[] rcVarArr = (util.h.xy.au.rc[]) getInputSizeshNQ4ISI.clone();
        getHighResolutionOutputSizeshNQ4ISI = (getHighSpeedVideoFpsRangesFor + 39) % 128;
        return rcVarArr;
    }

    static {
        util.h.xy.au.rc[] rcVarArr;
        getHighSpeedVideoFpsRanges();
        java.lang.Object[] objArr = new java.lang.Object[1];
        getHighResolutionOutputSizeshNQ4ISI(new int[]{-616370629, 1739617695, -1478791201, 30030833}, (android.view.ViewConfiguration.getPressedStateDuration() >> 16) + 8, objArr);
        util.h.xy.au.rc rcVar = new util.h.xy.au.rc(((java.lang.String) objArr[0]).intern());
        f878 = rcVar;
        int i = getHighSpeedVideoFpsRangesFor;
        int i2 = i + 107;
        getHighResolutionOutputSizeshNQ4ISI = i2 % 128;
        if (i2 % 2 == 0) {
            rcVarArr = new util.h.xy.au.rc[0];
            rcVarArr[1] = rcVar;
        } else {
            rcVarArr = new util.h.xy.au.rc[]{rcVar};
        }
        getInputSizeshNQ4ISI = rcVarArr;
        getOutputFormats = "rc";
        int i3 = i + 1;
        getHighResolutionOutputSizeshNQ4ISI = i3 % 128;
        if (i3 % 2 == 0) {
            throw null;
        }
    }

    /* renamed from: ˊ, reason: contains not printable characters */
    public final void m25204(byte[] bArr) {
        int i = getHighResolutionOutputSizeshNQ4ISI;
        getHighSpeedVideoFpsRangesFor = (i + 97) % 128;
        if (bArr == null || bArr.length == 0) {
            throw new java.lang.IllegalArgumentException(util.h.xy.al.ra.f532);
        }
        getHighSpeedVideoFpsRangesFor = (i + 33) % 128;
    }

    /* renamed from: ᐝ, reason: contains not printable characters */
    public final void m25205(java.lang.String str) {
        if (!android.text.TextUtils.isEmpty(str)) {
            getHighSpeedVideoFpsRangesFor = (getHighResolutionOutputSizeshNQ4ISI + 41) % 128;
            if (str.length() <= 32) {
                int i = getHighResolutionOutputSizeshNQ4ISI + 125;
                getHighSpeedVideoFpsRangesFor = i % 128;
                if (i % 2 != 0) {
                    throw new java.lang.ArithmeticException();
                }
                return;
            }
        }
        throw new java.lang.IllegalArgumentException(util.h.xy.al.ra.f556);
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x004b, code lost:
    
        if (r11.equalsIgnoreCase(((java.lang.String) r7[0]).intern()) != false) goto L8;
     */
    /* renamed from: ˊ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m25203(java.lang.String str, java.lang.String str2, java.lang.String str3) {
        if (!android.text.TextUtils.isEmpty(str)) {
            java.lang.Object[] objArr = new java.lang.Object[1];
            getHighResolutionOutputSizeshNQ4ISI(new int[]{1565691104, 1590261585, -329662715, 697671921, 1901628835, -1778006008}, android.view.View.getDefaultSize(0, 0) + 10, objArr);
            if (!str.equalsIgnoreCase(((java.lang.String) objArr[0]).intern())) {
                java.lang.Object[] objArr2 = new java.lang.Object[1];
                getHighResolutionOutputSizeshNQ4ISI(new int[]{1297574318, 1106997284}, android.text.TextUtils.getTrimmedLength("") + 4, objArr2);
            }
            if (!android.text.TextUtils.isEmpty(str2)) {
                getHighSpeedVideoFpsRangesFor = (getHighResolutionOutputSizeshNQ4ISI + 103) % 128;
                java.lang.Object[] objArr3 = new java.lang.Object[1];
                getHighResolutionOutputSizeshNQ4ISI(new int[]{655259794, -1323621223, 821829452, -1329416842, -869605897, -1164699665, 1444112091, -493207276, 645396741, 1962461523}, 19 - (android.media.AudioTrack.getMaxVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)), objArr3);
                if (str2.equalsIgnoreCase(((java.lang.String) objArr3[0]).intern())) {
                    if (android.text.TextUtils.isEmpty(str3)) {
                        throw new java.lang.IllegalArgumentException(util.h.xy.al.ra.f583);
                    }
                    try {
                        java.lang.Object[] objArr4 = new java.lang.Object[1];
                        getHighResolutionOutputSizeshNQ4ISI(new int[]{1565691104, 1590261585, -329662715, 697671921, 1901628835, -1778006008}, 10 - ((((java.lang.Integer) java.lang.Class.forName("android.os.Process").getMethod("getThreadPriority", java.lang.Integer.TYPE).invoke(null, 0)).intValue() + 20) >> 6), objArr4);
                        if (str.equalsIgnoreCase(((java.lang.String) objArr4[0]).intern())) {
                            java.lang.Object[] objArr5 = new java.lang.Object[1];
                            getHighResolutionOutputSizeshNQ4ISI(new int[]{655259794, -1323621223, 821829452, -1329416842, -869605897, -1164699665, 1444112091, -493207276, 645396741, 1962461523}, 17 - android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0), objArr5);
                            if (str2.equalsIgnoreCase(((java.lang.String) objArr5[0]).intern())) {
                                getHighSpeedVideoFpsRangesFor = (getHighResolutionOutputSizeshNQ4ISI + 81) % 128;
                                if (str3.length() > 64) {
                                    throw new java.lang.IllegalArgumentException(util.h.xy.al.ra.f583);
                                }
                            }
                        }
                        if (str3.length() > 256) {
                            throw new java.lang.IllegalArgumentException(util.h.xy.al.ra.f583);
                        }
                        return;
                    } catch (java.lang.Throwable th) {
                        java.lang.Throwable cause = th.getCause();
                        if (cause == null) {
                            throw th;
                        }
                        throw cause;
                    }
                }
            }
            throw new java.lang.IllegalArgumentException(util.h.xy.al.ra.f628);
        }
        throw new java.lang.IllegalArgumentException(util.h.xy.al.ra.f638);
    }

    /* renamed from: ˊ, reason: contains not printable characters */
    public final void m25202(java.lang.String str) {
        getHighSpeedVideoFpsRangesFor = (getHighResolutionOutputSizeshNQ4ISI + 31) % 128;
        if (!android.text.TextUtils.isEmpty(str)) {
            getHighSpeedVideoFpsRangesFor = (getHighResolutionOutputSizeshNQ4ISI + 111) % 128;
            if (str.length() <= 10) {
                return;
            }
        }
        throw new java.lang.IllegalArgumentException(util.h.xy.al.ra.f630);
    }

    private static void getHighResolutionOutputSizeshNQ4ISI(int[] iArr, int i, java.lang.Object[] objArr) {
        util.h.xz.b.c cVar = new util.h.xz.b.c();
        char[] cArr = new char[4];
        char[] cArr2 = new char[iArr.length * 2];
        int[] iArr2 = Camera2StreamConfigurationMap;
        if (iArr2 != null) {
            int length = iArr2.length;
            int[] iArr3 = new int[length];
            int i2 = 0;
            while (i2 < length) {
                iArr3[i2] = (int) (iArr2[i2] ^ (-5569649899877129369L));
                i2++;
                getHighSpeedVideoFpsRanges = (getHighSpeedVideoSizes + 29) % 128;
            }
            iArr2 = iArr3;
        }
        int length2 = iArr2.length;
        int[] iArr4 = new int[length2];
        int[] iArr5 = Camera2StreamConfigurationMap;
        if (iArr5 != null) {
            int length3 = iArr5.length;
            int[] iArr6 = new int[length3];
            for (int i3 = 0; i3 < length3; i3++) {
                iArr6[i3] = (int) (iArr5[i3] ^ (-5569649899877129369L));
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
            getHighSpeedVideoFpsRanges = (getHighSpeedVideoSizes + 55) % 128;
            for (int i4 = 0; i4 < 16; i4++) {
                cVar.f2627 ^= iArr4[i4];
                cVar.f2625 = util.h.xz.b.c.m27724(cVar.f2627) ^ cVar.f2625;
                int i5 = cVar.f2627;
                cVar.f2627 = cVar.f2625;
                cVar.f2625 = i5;
            }
            int i6 = cVar.f2627;
            cVar.f2627 = cVar.f2625;
            cVar.f2625 = i6;
            cVar.f2625 ^= iArr4[16];
            cVar.f2627 ^= iArr4[17];
            int i7 = cVar.f2627;
            int i8 = cVar.f2625;
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
            getHighSpeedVideoFpsRanges = (getHighSpeedVideoSizes + 59) % 128;
        }
        objArr[0] = new java.lang.String(cArr2, 0, i);
    }

    static void getHighSpeedVideoFpsRanges() {
        Camera2StreamConfigurationMap = new int[]{-458016442, -348609529, 1195437304, 15901752, -622315500, 1197403903, 1092632277, -518636281, -2067496438, 1832864228, -654912607, 245532669, -584964090, -1830582627, -1082792733, 272747709, 811459230, -2024684923};
    }
}
