package util.h.xy.ak;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* loaded from: classes5.dex */
public final class mb {
    private static int Camera2StreamConfigurationMap = 1;
    private static int getHighResolutionOutputSizeshNQ4ISI = 0;
    private static int getHighSpeedVideoFpsRanges = 1;
    private static final /* synthetic */ util.h.xy.ak.mb[] getHighSpeedVideoFpsRangesFor;
    private static final java.lang.String getHighSpeedVideoSizes;
    private static int getHighSpeedVideoSizesFor;
    private static int[] getInputSizeshNQ4ISI;

    /* renamed from: ˏ, reason: contains not printable characters */
    public static final util.h.xy.ak.mb f85;

    /* renamed from: ˊ, reason: contains not printable characters */
    public util.h.xy.da.ra f86;

    private mb(java.lang.String str) {
    }

    public static util.h.xy.ak.mb valueOf(java.lang.String str) {
        int i = getHighSpeedVideoSizesFor + 5;
        Camera2StreamConfigurationMap = i % 128;
        util.h.xy.ak.mb mbVar = (util.h.xy.ak.mb) java.lang.Enum.valueOf(util.h.xy.ak.mb.class, str);
        if (i % 2 != 0) {
            return mbVar;
        }
        throw null;
    }

    public static util.h.xy.ak.mb[] values() {
        int i = Camera2StreamConfigurationMap + 83;
        getHighSpeedVideoSizesFor = i % 128;
        util.h.xy.ak.mb[] mbVarArr = getHighSpeedVideoFpsRangesFor;
        if (i % 2 == 0) {
            return (util.h.xy.ak.mb[]) mbVarArr.clone();
        }
        throw null;
    }

    static {
        util.h.xy.ak.mb[] mbVarArr;
        getHighSpeedVideoFpsRanges();
        java.lang.Object[] objArr = new java.lang.Object[1];
        Camera2StreamConfigurationMap(new int[]{442871157, 1475197278, -1261077003, -1086011240}, 8 - (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), objArr);
        util.h.xy.ak.mb mbVar = new util.h.xy.ak.mb(((java.lang.String) objArr[0]).intern());
        f85 = mbVar;
        int i = Camera2StreamConfigurationMap + 1;
        getHighSpeedVideoSizesFor = i % 128;
        if (i % 2 != 0) {
            mbVarArr = new util.h.xy.ak.mb[0];
            mbVarArr[0] = mbVar;
        } else {
            mbVarArr = new util.h.xy.ak.mb[]{mbVar};
        }
        getHighSpeedVideoFpsRangesFor = mbVarArr;
        getHighSpeedVideoSizes = util.h.xy.ak.mb.class.getName();
        Camera2StreamConfigurationMap = (getHighSpeedVideoSizesFor + 53) % 128;
    }

    /* renamed from: ˊ, reason: contains not printable characters */
    public final boolean m24996() {
        Camera2StreamConfigurationMap = (getHighSpeedVideoSizesFor + 69) % 128;
        try {
            getHighSpeedVideoFpsRangesFor();
            boolean mo26079 = this.f86.mo26079();
            int i = Camera2StreamConfigurationMap + 59;
            getHighSpeedVideoSizesFor = i % 128;
            if (i % 2 == 0) {
                return mo26079;
            }
            throw new java.lang.ArithmeticException();
        } catch (util.h.xy.da.b unused) {
            return false;
        }
    }

    /* renamed from: ˎ, reason: contains not printable characters */
    public final void m24997() {
        int i = getHighSpeedVideoSizesFor + 97;
        Camera2StreamConfigurationMap = i % 128;
        if (i % 2 != 0) {
            getHighSpeedVideoFpsRangesFor();
            util.h.xy.ak.d.m24967(this.f86);
            int i2 = getHighSpeedVideoSizesFor + 113;
            Camera2StreamConfigurationMap = i2 % 128;
            if (i2 % 2 == 0) {
                throw null;
            }
            return;
        }
        getHighSpeedVideoFpsRangesFor();
        util.h.xy.ak.d.m24967(this.f86);
        throw new java.lang.NullPointerException();
    }

    private void getHighSpeedVideoFpsRangesFor() throws util.h.xy.da.b {
        if (this.f86 == null) {
            Camera2StreamConfigurationMap = (getHighSpeedVideoSizesFor + 21) % 128;
            util.h.xy.da.ma maVar = util.h.xy.da.ma.f1156;
            java.lang.Object[] objArr = new java.lang.Object[1];
            Camera2StreamConfigurationMap(new int[]{-1103167416, 409344344, -2055589787, -1741349864, 1780612329, 1447140553}, android.graphics.Color.argb(0, 0, 0, 0) + 10, objArr);
            this.f86 = util.h.xy.da.d.m26260(maVar, ((java.lang.String) objArr[0]).intern());
            getHighSpeedVideoSizesFor = (Camera2StreamConfigurationMap + 19) % 128;
        }
    }

    private static void Camera2StreamConfigurationMap(int[] iArr, int i, java.lang.Object[] objArr) {
        util.h.xz.b.c cVar = new util.h.xz.b.c();
        char[] cArr = new char[4];
        char[] cArr2 = new char[iArr.length * 2];
        int[] iArr2 = getInputSizeshNQ4ISI;
        if (iArr2 != null) {
            getHighResolutionOutputSizeshNQ4ISI = (getHighSpeedVideoFpsRanges + 103) % 128;
            int length = iArr2.length;
            int[] iArr3 = new int[length];
            int i2 = 0;
            while (i2 < length) {
                iArr3[i2] = (int) (iArr2[i2] ^ (-5569649899877129369L));
                i2++;
                getHighSpeedVideoFpsRanges = (getHighResolutionOutputSizeshNQ4ISI + 41) % 128;
            }
            getHighResolutionOutputSizeshNQ4ISI = (getHighSpeedVideoFpsRanges + 109) % 128;
            iArr2 = iArr3;
        }
        int length2 = iArr2.length;
        int[] iArr4 = new int[length2];
        int[] iArr5 = getInputSizeshNQ4ISI;
        if (iArr5 != null) {
            int length3 = iArr5.length;
            int[] iArr6 = new int[length3];
            int i3 = 0;
            while (i3 < length3) {
                iArr6[i3] = (int) (iArr5[i3] ^ (-5569649899877129369L));
                i3++;
                getHighResolutionOutputSizeshNQ4ISI = (getHighSpeedVideoFpsRanges + 77) % 128;
            }
            getHighResolutionOutputSizeshNQ4ISI = (getHighSpeedVideoFpsRanges + 121) % 128;
            iArr5 = iArr6;
        }
        java.lang.System.arraycopy(iArr5, 0, iArr4, 0, length2);
        cVar.f2626 = 0;
        while (cVar.f2626 < iArr.length) {
            getHighResolutionOutputSizeshNQ4ISI = (getHighSpeedVideoFpsRanges + 81) % 128;
            cArr[0] = (char) (iArr[cVar.f2626] >> 16);
            cArr[1] = (char) iArr[cVar.f2626];
            cArr[2] = (char) (iArr[cVar.f2626 + 1] >> 16);
            cArr[3] = (char) iArr[cVar.f2626 + 1];
            cVar.f2627 = (cArr[0] << 16) + cArr[1];
            cVar.f2625 = (cArr[2] << 16) + cArr[3];
            util.h.xz.b.c.m27723(iArr4);
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
        }
        objArr[0] = new java.lang.String(cArr2, 0, i);
    }

    static void getHighSpeedVideoFpsRanges() {
        getInputSizeshNQ4ISI = new int[]{183205581, 477295448, 1043864079, -1435702681, -581327776, -898694406, 1724849974, 235124361, -1085433885, 54920766, 1439735224, 473615726, 413557994, -1856876898, 391036152, -1296912000, 983111780, -2024864901};
    }
}
