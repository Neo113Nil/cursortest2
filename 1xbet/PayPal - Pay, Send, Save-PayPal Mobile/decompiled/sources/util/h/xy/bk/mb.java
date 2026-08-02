package util.h.xy.bk;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* loaded from: classes5.dex */
public final class mb {
    private static int Camera2StreamConfigurationMap = 1;
    private static final /* synthetic */ util.h.xy.bk.mb[] getHighResolutionOutputSizeshNQ4ISI;
    private static int getHighSpeedVideoFpsRanges = 0;
    private static int[] getHighSpeedVideoSizes = null;
    private static int getInputFormats = 1;
    private static int getOutputMinFrameDuration;

    /* renamed from: ˏ, reason: contains not printable characters */
    public static final util.h.xy.bk.mb f982;
    java.util.HashMap<util.h.xy.bk.b, util.h.xy.bk.ra> getHighSpeedVideoFpsRangesFor;

    private mb(java.lang.String str) {
    }

    public static util.h.xy.bk.mb valueOf(java.lang.String str) {
        getOutputMinFrameDuration = (getInputFormats + 13) % 128;
        util.h.xy.bk.mb mbVar = (util.h.xy.bk.mb) java.lang.Enum.valueOf(util.h.xy.bk.mb.class, str);
        getOutputMinFrameDuration = (getInputFormats + 9) % 128;
        return mbVar;
    }

    public static util.h.xy.bk.mb[] values() {
        getInputFormats = (getOutputMinFrameDuration + 11) % 128;
        util.h.xy.bk.mb[] mbVarArr = (util.h.xy.bk.mb[]) getHighResolutionOutputSizeshNQ4ISI.clone();
        int i = getInputFormats + 107;
        getOutputMinFrameDuration = i % 128;
        if (i % 2 == 0) {
            return mbVarArr;
        }
        throw null;
    }

    static {
        char[] cArr;
        util.h.xy.bk.mb[] mbVarArr;
        Camera2StreamConfigurationMap();
        int[] iArr = {-784378180, -1180402484, -1470606367, -1262677229};
        int touchSlop = (android.view.ViewConfiguration.getTouchSlop() >> 8) + 8;
        util.h.xz.b.c cVar = new util.h.xz.b.c();
        char[] cArr2 = new char[4];
        char[] cArr3 = new char[8];
        int[] iArr2 = getHighSpeedVideoSizes;
        if (iArr2 != null) {
            Camera2StreamConfigurationMap = (getHighSpeedVideoFpsRanges + 77) % 128;
            int length = iArr2.length;
            int[] iArr3 = new int[length];
            for (int i = 0; i < length; i++) {
                iArr3[i] = (int) (iArr2[i] ^ (-5569649899877129369L));
            }
            Camera2StreamConfigurationMap = (getHighSpeedVideoFpsRanges + 97) % 128;
            iArr2 = iArr3;
        }
        int length2 = iArr2.length;
        int[] iArr4 = new int[length2];
        int[] iArr5 = getHighSpeedVideoSizes;
        if (iArr5 != null) {
            int length3 = iArr5.length;
            int[] iArr6 = new int[length3];
            int i2 = 0;
            while (i2 < length3) {
                getHighSpeedVideoFpsRanges = (Camera2StreamConfigurationMap + 85) % 128;
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
            cArr[0] = (char) (iArr[cVar.f2626] >> 16);
            cArr[1] = (char) iArr[cVar.f2626];
            cArr[2] = (char) (iArr[cVar.f2626 + 1] >> 16);
            cArr[3] = (char) iArr[cVar.f2626 + 1];
            cVar.f2627 = (cArr[0] << 16) + cArr[1];
            cVar.f2625 = (cArr[2] << 16) + cArr[3];
            util.h.xz.b.c.m27723(iArr4);
            for (int i3 = 0; i3 < 16; i3++) {
                getHighSpeedVideoFpsRanges = (Camera2StreamConfigurationMap + 81) % 128;
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
        util.h.xy.bk.mb mbVar = new util.h.xy.bk.mb(new java.lang.String(cArr3, 0, touchSlop).intern());
        f982 = mbVar;
        int i8 = getInputFormats;
        int i9 = i8 + 89;
        getOutputMinFrameDuration = i9 % 128;
        if (i9 % 2 != 0) {
            mbVarArr = new util.h.xy.bk.mb[0];
            mbVarArr[1] = mbVar;
        } else {
            mbVarArr = new util.h.xy.bk.mb[]{mbVar};
        }
        int i10 = i8 + 95;
        int i11 = i10 % 128;
        getOutputMinFrameDuration = i11;
        if (i10 % 2 != 0) {
            throw null;
        }
        getHighResolutionOutputSizeshNQ4ISI = mbVarArr;
        int i12 = i11 + 125;
        getInputFormats = i12 % 128;
        if (i12 % 2 == 0) {
            throw null;
        }
    }

    private java.util.HashMap<util.h.xy.bk.b, util.h.xy.bk.ra> getHighSpeedVideoFpsRanges() {
        int i = getOutputMinFrameDuration + 85;
        getInputFormats = i % 128;
        if (i % 2 == 0) {
            throw null;
        }
        if (this.getHighSpeedVideoFpsRangesFor == null) {
            this.getHighSpeedVideoFpsRangesFor = new java.util.HashMap<>();
        }
        java.util.HashMap<util.h.xy.bk.b, util.h.xy.bk.ra> hashMap = this.getHighSpeedVideoFpsRangesFor;
        int i2 = getOutputMinFrameDuration + 117;
        getInputFormats = i2 % 128;
        if (i2 % 2 != 0) {
            return hashMap;
        }
        throw null;
    }

    /* renamed from: ᐝ, reason: contains not printable characters */
    public final void m25507() {
        getOutputMinFrameDuration = (getInputFormats + 1) % 128;
        getHighSpeedVideoFpsRanges().clear();
        getOutputMinFrameDuration = (getInputFormats + 105) % 128;
    }

    /* renamed from: ˋ, reason: contains not printable characters */
    public final void m25505(util.h.xy.bk.b bVar, util.h.xy.bk.ra raVar) {
        getOutputMinFrameDuration = (getInputFormats + 111) % 128;
        getHighSpeedVideoFpsRanges().put(bVar, raVar);
        getOutputMinFrameDuration = (getInputFormats + 69) % 128;
    }

    /* renamed from: ˎ, reason: contains not printable characters */
    public final util.h.xy.bk.ra m25506(util.h.xy.bk.b bVar) {
        int i = getInputFormats + 63;
        getOutputMinFrameDuration = i % 128;
        if (i % 2 != 0) {
            getHighSpeedVideoFpsRanges().get(bVar);
            throw null;
        }
        util.h.xy.bk.ra raVar = getHighSpeedVideoFpsRanges().get(bVar);
        int i2 = getInputFormats + 61;
        getOutputMinFrameDuration = i2 % 128;
        if (i2 % 2 == 0) {
            return raVar;
        }
        throw null;
    }

    static void Camera2StreamConfigurationMap() {
        getHighSpeedVideoSizes = new int[]{-512033189, -1021691069, 847815782, -622951472, 252226413, -1343282401, 1028350734, -119336188, -580663366, -890312028, 34983832, 1854722691, 493958274, 860974079, -1880746350, 852154797, 1733229223, 1584423134};
    }
}
