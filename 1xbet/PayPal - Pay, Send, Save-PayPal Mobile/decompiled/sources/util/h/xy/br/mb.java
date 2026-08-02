package util.h.xy.br;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* loaded from: classes18.dex */
public final class mb {
    private static int Camera2StreamConfigurationMap = 0;
    private static int getHighResolutionOutputSizeshNQ4ISI = 0;
    private static int getHighSpeedVideoFpsRanges = 1;
    private static int getHighSpeedVideoFpsRangesFor = 1;
    private static int[] getHighSpeedVideoSizes;
    private static final /* synthetic */ util.h.xy.br.mb[] getInputSizeshNQ4ISI;

    /* renamed from: ˊ, reason: contains not printable characters */
    public static final util.h.xy.br.mb f1032;

    /* renamed from: ᐝ, reason: contains not printable characters */
    public static final util.h.xy.br.mb f1033;

    private mb(java.lang.String str, int i) {
    }

    public static util.h.xy.br.mb valueOf(java.lang.String str) {
        int i = getHighSpeedVideoFpsRangesFor + 117;
        getHighResolutionOutputSizeshNQ4ISI = i % 128;
        util.h.xy.br.mb mbVar = (util.h.xy.br.mb) java.lang.Enum.valueOf(util.h.xy.br.mb.class, str);
        if (i % 2 != 0) {
            throw null;
        }
        int i2 = getHighResolutionOutputSizeshNQ4ISI + 117;
        getHighSpeedVideoFpsRangesFor = i2 % 128;
        if (i2 % 2 != 0) {
            return mbVar;
        }
        throw null;
    }

    public static util.h.xy.br.mb[] values() {
        getHighResolutionOutputSizeshNQ4ISI = (getHighSpeedVideoFpsRangesFor + 39) % 128;
        util.h.xy.br.mb[] mbVarArr = (util.h.xy.br.mb[]) getInputSizeshNQ4ISI.clone();
        int i = getHighSpeedVideoFpsRangesFor + 11;
        getHighResolutionOutputSizeshNQ4ISI = i % 128;
        if (i % 2 == 0) {
            return mbVarArr;
        }
        throw null;
    }

    static {
        util.h.xy.br.mb[] mbVarArr;
        Camera2StreamConfigurationMap();
        java.lang.Object[] objArr = new java.lang.Object[1];
        Camera2StreamConfigurationMap(new int[]{1452533096, -1595091065, 678362593, -1534037523, -1926359061, 1659570491, -1086666187, 1968559827}, (android.os.SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (android.os.SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 12, objArr);
        util.h.xy.br.mb mbVar = new util.h.xy.br.mb(((java.lang.String) objArr[0]).intern(), 0);
        f1033 = mbVar;
        java.lang.Object[] objArr2 = new java.lang.Object[1];
        Camera2StreamConfigurationMap(new int[]{-2021023749, -1626458117, -602096261, -1413685750}, android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0) + 7, objArr2);
        util.h.xy.br.mb mbVar2 = new util.h.xy.br.mb(((java.lang.String) objArr2[0]).intern(), 1);
        f1032 = mbVar2;
        int i = getHighResolutionOutputSizeshNQ4ISI;
        int i2 = i + 85;
        getHighSpeedVideoFpsRangesFor = i2 % 128;
        if (i2 % 2 == 0) {
            mbVarArr = new util.h.xy.br.mb[3];
            mbVarArr[1] = mbVar;
            mbVarArr[0] = mbVar2;
        } else {
            mbVarArr = new util.h.xy.br.mb[]{mbVar, mbVar2};
        }
        int i3 = i + 119;
        int i4 = i3 % 128;
        getHighSpeedVideoFpsRangesFor = i4;
        if (i3 % 2 != 0) {
            getInputSizeshNQ4ISI = mbVarArr;
            int i5 = i4 + 73;
            getHighResolutionOutputSizeshNQ4ISI = i5 % 128;
            if (i5 % 2 != 0) {
                throw new java.lang.ArithmeticException();
            }
            return;
        }
        throw null;
    }

    private static void Camera2StreamConfigurationMap(int[] iArr, int i, java.lang.Object[] objArr) {
        int length;
        int[] iArr2;
        util.h.xz.b.c cVar = new util.h.xz.b.c();
        char[] cArr = new char[4];
        char[] cArr2 = new char[iArr.length * 2];
        int[] iArr3 = getHighSpeedVideoSizes;
        if (iArr3 != null) {
            int i2 = getHighSpeedVideoFpsRanges + 21;
            Camera2StreamConfigurationMap = i2 % 128;
            if (i2 % 2 != 0) {
                length = iArr3.length;
                iArr2 = new int[length];
            } else {
                length = iArr3.length;
                iArr2 = new int[length];
            }
            for (int i3 = 0; i3 < length; i3++) {
                iArr2[i3] = (int) (iArr3[i3] ^ (-5569649899877129369L));
            }
            iArr3 = iArr2;
        }
        int length2 = iArr3.length;
        int[] iArr4 = new int[length2];
        int[] iArr5 = getHighSpeedVideoSizes;
        if (iArr5 != null) {
            int length3 = iArr5.length;
            int[] iArr6 = new int[length3];
            for (int i4 = 0; i4 < length3; i4++) {
                iArr6[i4] = (int) (iArr5[i4] ^ (-5569649899877129369L));
            }
            getHighSpeedVideoFpsRanges = (Camera2StreamConfigurationMap + 51) % 128;
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
            for (int i5 = 0; i5 < 16; i5++) {
                cVar.f2627 ^= iArr4[i5];
                cVar.f2625 = util.h.xz.b.c.m27724(cVar.f2627) ^ cVar.f2625;
                int i6 = cVar.f2627;
                cVar.f2627 = cVar.f2625;
                cVar.f2625 = i6;
            }
            int i7 = cVar.f2627;
            cVar.f2627 = cVar.f2625;
            cVar.f2625 = i7;
            cVar.f2625 ^= iArr4[16];
            cVar.f2627 ^= iArr4[17];
            int i8 = cVar.f2627;
            int i9 = cVar.f2625;
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

    static void Camera2StreamConfigurationMap() {
        getHighSpeedVideoSizes = new int[]{1050071552, 900878377, 1543290246, 72748050, 1827290364, -1946360992, -2140215836, 693400973, -287086361, 702035611, 1449676573, 992499972, -1383286269, -432557833, -289743540, -2129794520, 20324495, -174279440};
    }
}
