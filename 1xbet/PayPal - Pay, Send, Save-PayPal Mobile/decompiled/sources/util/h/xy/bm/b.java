package util.h.xy.bm;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* loaded from: classes18.dex */
public final class b {
    private static int Camera2StreamConfigurationMap = 1;
    private static final java.lang.String getHighResolutionOutputSizeshNQ4ISI;
    private static int getHighSpeedVideoFpsRanges = 1;
    private static int getHighSpeedVideoFpsRangesFor;
    private static int getHighSpeedVideoSizes;
    private static int[] getHighSpeedVideoSizesFor;
    private static final /* synthetic */ util.h.xy.bm.b[] getInputFormats;

    /* renamed from: ˎ, reason: contains not printable characters */
    public static final util.h.xy.bm.b f983;

    private b(java.lang.String str) {
    }

    public static util.h.xy.bm.b valueOf(java.lang.String str) {
        getHighSpeedVideoSizes = (Camera2StreamConfigurationMap + 79) % 128;
        util.h.xy.bm.b bVar = (util.h.xy.bm.b) java.lang.Enum.valueOf(util.h.xy.bm.b.class, str);
        getHighSpeedVideoSizes = (Camera2StreamConfigurationMap + 111) % 128;
        return bVar;
    }

    public static util.h.xy.bm.b[] values() {
        Camera2StreamConfigurationMap = (getHighSpeedVideoSizes + 39) % 128;
        util.h.xy.bm.b[] bVarArr = (util.h.xy.bm.b[]) getInputFormats.clone();
        Camera2StreamConfigurationMap = (getHighSpeedVideoSizes + 97) % 128;
        return bVarArr;
    }

    static {
        char[] cArr;
        util.h.xy.bm.b[] bVarArr;
        getHighResolutionOutputSizeshNQ4ISI();
        int[] iArr = {-653107545, 1257593716, -719885611, -399245217};
        int lastIndexOf = android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0) + 9;
        util.h.xz.b.c cVar = new util.h.xz.b.c();
        char[] cArr2 = new char[4];
        char[] cArr3 = new char[8];
        int[] iArr2 = getHighSpeedVideoSizesFor;
        if (iArr2 != null) {
            getHighSpeedVideoFpsRangesFor = (getHighSpeedVideoFpsRanges + 125) % 128;
            int length = iArr2.length;
            int[] iArr3 = new int[length];
            for (int i = 0; i < length; i++) {
                getHighSpeedVideoFpsRanges = (getHighSpeedVideoFpsRangesFor + 115) % 128;
                iArr3[i] = (int) (iArr2[i] ^ (-5569649899877129369L));
            }
            iArr2 = iArr3;
        }
        int length2 = iArr2.length;
        int[] iArr4 = new int[length2];
        int[] iArr5 = getHighSpeedVideoSizesFor;
        if (iArr5 != null) {
            int length3 = iArr5.length;
            int[] iArr6 = new int[length3];
            int i2 = 0;
            while (i2 < length3) {
                iArr6[i2] = (int) (iArr5[i2] ^ (-5569649899877129369L));
                i2++;
                cArr2 = cArr2;
            }
            cArr = cArr2;
            iArr5 = iArr6;
        } else {
            cArr = cArr2;
        }
        java.lang.System.arraycopy(iArr5, 0, iArr4, 0, length2);
        cVar.f2626 = 0;
        while (cVar.f2626 < 4) {
            getHighSpeedVideoFpsRangesFor = (getHighSpeedVideoFpsRanges + 97) % 128;
            cArr[0] = (char) (iArr[cVar.f2626] >> 16);
            cArr[1] = (char) iArr[cVar.f2626];
            cArr[2] = (char) (iArr[cVar.f2626 + 1] >> 16);
            cArr[3] = (char) iArr[cVar.f2626 + 1];
            cVar.f2627 = (cArr[0] << 16) + cArr[1];
            cVar.f2625 = (cArr[2] << 16) + cArr[3];
            util.h.xz.b.c.m27723(iArr4);
            for (int i3 = 0; i3 < 16; i3++) {
                getHighSpeedVideoFpsRanges = (getHighSpeedVideoFpsRangesFor + 11) % 128;
                cVar.f2627 ^= iArr4[i3];
                cVar.f2625 = util.h.xz.b.c.m27724(cVar.f2627) ^ cVar.f2625;
                int i4 = cVar.f2627;
                cVar.f2627 = cVar.f2625;
                cVar.f2625 = i4;
            }
            int i5 = cVar.f2627;
            cVar.f2627 = cVar.f2625;
            cVar.f2625 = i5;
            cVar.f2625 ^= iArr4[16];
            cVar.f2627 ^= iArr4[17];
            int i6 = cVar.f2627;
            int i7 = cVar.f2625;
            cArr[0] = (char) (cVar.f2627 >>> 16);
            cArr[1] = (char) cVar.f2627;
            cArr[2] = (char) (cVar.f2625 >>> 16);
            cArr[3] = (char) cVar.f2625;
            util.h.xz.b.c.m27723(iArr4);
            cArr3[cVar.f2626 * 2] = cArr[0];
            cArr3[(cVar.f2626 * 2) + 1] = cArr[1];
            cArr3[(cVar.f2626 * 2) + 2] = cArr[2];
            cArr3[(cVar.f2626 * 2) + 3] = cArr[3];
            cVar.f2626 += 2;
        }
        util.h.xy.bm.b bVar = new util.h.xy.bm.b(new java.lang.String(cArr3, 0, lastIndexOf).intern());
        f983 = bVar;
        int i8 = Camera2StreamConfigurationMap;
        int i9 = i8 + 15;
        getHighSpeedVideoSizes = i9 % 128;
        if (i9 % 2 != 0) {
            bVarArr = new util.h.xy.bm.b[0];
            bVarArr[0] = bVar;
        } else {
            bVarArr = new util.h.xy.bm.b[]{bVar};
        }
        getHighSpeedVideoSizes = (i8 + 49) % 128;
        getInputFormats = bVarArr;
        getHighResolutionOutputSizeshNQ4ISI = util.h.xy.cb.b.f1091;
        int i10 = i8 + 99;
        getHighSpeedVideoSizes = i10 % 128;
        if (i10 % 2 != 0) {
            throw null;
        }
    }

    /* renamed from: ˎ, reason: contains not printable characters */
    public final void m25512(boolean z, boolean z2, boolean z3) {
        int i = getHighSpeedVideoSizes + 9;
        Camera2StreamConfigurationMap = i % 128;
        if (i % 2 != 0) {
            util.h.xy.f.b.f2201.m26785(z, z2, z3);
        } else {
            util.h.xy.f.b.f2201.m26785(z, z2, z3);
            throw null;
        }
    }

    /* renamed from: ˎ, reason: contains not printable characters */
    public final boolean m25513(util.h.xy.f.a aVar) {
        getHighSpeedVideoSizes = (Camera2StreamConfigurationMap + 67) % 128;
        boolean m26755 = util.h.xy.f.b.f2201.m26755(aVar);
        int i = getHighSpeedVideoSizes + 105;
        Camera2StreamConfigurationMap = i % 128;
        if (i % 2 != 0) {
            return m26755;
        }
        throw null;
    }

    /* renamed from: ˏ, reason: contains not printable characters */
    public final byte[] m25515(com.gemalto.mfs.mwsdk.dcm.PaymentType paymentType, boolean z) throws com.gemalto.mfs.mwsdk.exception.InternalComponentException {
        Camera2StreamConfigurationMap = (getHighSpeedVideoSizes + 57) % 128;
        if (paymentType == com.gemalto.mfs.mwsdk.dcm.PaymentType.CONTACTLESS) {
            Camera2StreamConfigurationMap = (getHighSpeedVideoSizes + 33) % 128;
            return util.h.xy.t.mb.f2417.m27428(z);
        }
        if (paymentType == com.gemalto.mfs.mwsdk.dcm.PaymentType.QR) {
            return util.h.xy.t.mb.f2417.m27447(z);
        }
        if (paymentType != com.gemalto.mfs.mwsdk.dcm.PaymentType.DSRP) {
            getHighSpeedVideoSizes = (Camera2StreamConfigurationMap + 71) % 128;
            return null;
        }
        int i = Camera2StreamConfigurationMap + 107;
        getHighSpeedVideoSizes = i % 128;
        if (i % 2 != 0) {
            util.h.xy.t.mb.f2417.m27437(z);
            throw null;
        }
        byte[] m27437 = util.h.xy.t.mb.f2417.m27437(z);
        getHighSpeedVideoSizes = (Camera2StreamConfigurationMap + 67) % 128;
        return m27437;
    }

    /* renamed from: ˏ, reason: contains not printable characters */
    public final boolean m25514(java.lang.String str, com.gemalto.mfs.mwsdk.dcm.PaymentType paymentType, boolean z) throws com.gemalto.mfs.mwsdk.exception.InternalComponentException {
        int i = Camera2StreamConfigurationMap + 1;
        getHighSpeedVideoSizes = i % 128;
        util.h.xy.f.b bVar = util.h.xy.f.b.f2201;
        if (i % 2 == 0) {
            return bVar.m26772(str, paymentType, z, util.h.xy.k.ra.f2243.m26940(str).booleanValue());
        }
        bVar.m26772(str, paymentType, z, util.h.xy.k.ra.f2243.m26940(str).booleanValue());
        throw null;
    }

    static void getHighResolutionOutputSizeshNQ4ISI() {
        getHighSpeedVideoSizesFor = new int[]{653807369, 2076242793, 715991187, -489410711, 1016942924, 1026238424, -903020025, 1853979599, -2119938039, 173105, -840558298, 1103893395, 121486387, -892233, -1610437265, 1966227007, -1391413101, 792119964};
    }
}
