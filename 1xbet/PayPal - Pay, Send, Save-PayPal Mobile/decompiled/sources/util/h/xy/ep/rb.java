package util.h.xy.ep;

/* loaded from: classes5.dex */
public final class rb implements util.h.xy.ef.rc {
    private static int Camera2StreamConfigurationMap = 0;
    private static int getHighResolutionOutputSizeshNQ4ISI = 1;
    private static int getHighSpeedVideoFpsRanges = 0;
    private static int getHighSpeedVideoFpsRangesFor = 1;
    private static int[] getHighSpeedVideoSizes = {-349988187, -362970009, -173276156, -1548734144, 1678670562, 184037664, 1285994922, -1351766236, 685376617, 2044575046, -285565764, 1902709522, -1758627597, -1830531912, 1073399383, 1367661393, -1891000982, -499802069};
    private final boolean getHighSpeedVideoSizesFor;
    private final byte[] getInputFormats;
    private final byte[] getInputSizeshNQ4ISI;
    private final int getOutputFormats;
    private final byte[] getOutputMinFrameDuration;

    /* renamed from: ˎ, reason: contains not printable characters */
    public final byte[] m26675() {
        getHighSpeedVideoFpsRangesFor = (Camera2StreamConfigurationMap + 49) % 128;
        byte[] m26821 = util.h.xy.fb.a.m26821(this.getInputFormats);
        Camera2StreamConfigurationMap = (getHighSpeedVideoFpsRangesFor + 67) % 128;
        return m26821;
    }

    /* renamed from: ˏ, reason: contains not printable characters */
    public final int m26676() {
        int i = Camera2StreamConfigurationMap + 65;
        getHighSpeedVideoFpsRangesFor = i % 128;
        int i2 = this.getOutputFormats;
        if (i % 2 != 0) {
            return i2;
        }
        throw new java.lang.ArithmeticException();
    }

    /* renamed from: ᐝ, reason: contains not printable characters */
    public final boolean m26677() {
        int i = getHighSpeedVideoFpsRangesFor + 59;
        int i2 = i % 128;
        Camera2StreamConfigurationMap = i2;
        if (i % 2 != 0) {
            throw new java.lang.ArithmeticException();
        }
        boolean z = this.getHighSpeedVideoSizesFor;
        getHighSpeedVideoFpsRangesFor = (i2 + 67) % 128;
        return z;
    }

    /* renamed from: ˋ, reason: contains not printable characters */
    public final byte[] m26674() {
        int i = Camera2StreamConfigurationMap + 53;
        getHighSpeedVideoFpsRangesFor = i % 128;
        if (i % 2 != 0) {
            return this.getInputSizeshNQ4ISI;
        }
        throw null;
    }

    /* renamed from: ˊ, reason: contains not printable characters */
    public final byte[] m26673() {
        int i = (getHighSpeedVideoFpsRangesFor + 1) % 128;
        Camera2StreamConfigurationMap = i;
        byte[] bArr = this.getOutputMinFrameDuration;
        getHighSpeedVideoFpsRangesFor = (i + 15) % 128;
        return bArr;
    }

    /* renamed from: ˏ, reason: contains not printable characters */
    public static util.h.xy.ep.rb m26672(byte[] bArr, byte[] bArr2, byte[] bArr3) {
        util.h.xy.ep.rb rbVar = new util.h.xy.ep.rb(bArr, bArr2, bArr3);
        int i = getHighSpeedVideoFpsRangesFor + 15;
        Camera2StreamConfigurationMap = i % 128;
        if (i % 2 == 0) {
            return rbVar;
        }
        throw null;
    }

    private rb(byte[] bArr, byte[] bArr2, byte[] bArr3) {
        int[] iArr;
        long j;
        int i = 0;
        if (bArr != null) {
            this.getOutputMinFrameDuration = util.h.xy.fb.a.m26821(bArr);
            if (bArr3 == null) {
                this.getInputFormats = new byte[0];
            } else {
                this.getInputFormats = util.h.xy.fb.a.m26821(bArr3);
            }
            this.getOutputFormats = -1;
            if (bArr2 == null) {
                this.getInputSizeshNQ4ISI = new byte[0];
            } else {
                this.getInputSizeshNQ4ISI = util.h.xy.fb.a.m26821(bArr2);
            }
            this.getHighSpeedVideoSizesFor = false;
            return;
        }
        int[] iArr2 = {1032744730, -1559916674, -2071620698, 399407591, 1688904380, 914745960, 1964893908, -1670959773, -1129597399, -500906547, -804166436, -924068389, 544500297, -1964799891, -1710386149, 583927102, -1749695702, 35928020};
        java.lang.Object[] objArr = new java.lang.Object[1];
        int scrollBarSize = (android.view.ViewConfiguration.getScrollBarSize() >> 8) + 35;
        util.h.xz.b.c cVar = new util.h.xz.b.c();
        char[] cArr = new char[4];
        char[] cArr2 = new char[36];
        int[] iArr3 = getHighSpeedVideoSizes;
        if (iArr3 != null) {
            getHighSpeedVideoFpsRanges = (getHighResolutionOutputSizeshNQ4ISI + 105) % 128;
            int length = iArr3.length;
            int[] iArr4 = new int[length];
            int i2 = 0;
            while (i2 < length) {
                iArr4[i2] = (int) (iArr3[i2] ^ (-5569649899877129369L));
                i2++;
                iArr2 = iArr2;
            }
            iArr = iArr2;
            iArr3 = iArr4;
        } else {
            iArr = iArr2;
        }
        int length2 = iArr3.length;
        int[] iArr5 = new int[length2];
        int[] iArr6 = getHighSpeedVideoSizes;
        if (iArr6 != null) {
            int length3 = iArr6.length;
            int[] iArr7 = new int[length3];
            int i3 = 0;
            while (i3 < length3) {
                int i4 = getHighSpeedVideoFpsRanges + 39;
                getHighResolutionOutputSizeshNQ4ISI = i4 % 128;
                if (i4 % 2 == 0) {
                    j = -5569649899877129369L;
                    iArr7[i3] = (int) (iArr6[i3] / (-5569649899877129369L));
                } else {
                    j = -5569649899877129369L;
                    iArr7[i3] = (int) (iArr6[i3] ^ (-5569649899877129369L));
                    i3++;
                }
                i = 0;
            }
            iArr6 = iArr7;
        }
        java.lang.System.arraycopy(iArr6, i, iArr5, i, length2);
        cVar.f2626 = i;
        while (cVar.f2626 < 18) {
            cArr[i] = (char) (iArr[cVar.f2626] >> 16);
            cArr[1] = (char) iArr[cVar.f2626];
            cArr[2] = (char) (iArr[cVar.f2626 + 1] >> 16);
            cArr[3] = (char) iArr[cVar.f2626 + 1];
            cVar.f2627 = (cArr[0] << 16) + cArr[1];
            cVar.f2625 = (cArr[2] << 16) + cArr[3];
            util.h.xz.b.c.m27723(iArr5);
            getHighSpeedVideoFpsRanges = (getHighResolutionOutputSizeshNQ4ISI + 47) % 128;
            for (int i5 = 0; i5 < 16; i5++) {
                getHighSpeedVideoFpsRanges = (getHighResolutionOutputSizeshNQ4ISI + 57) % 128;
                cVar.f2627 ^= iArr5[i5];
                cVar.f2625 = util.h.xz.b.c.m27724(cVar.f2627) ^ cVar.f2625;
                int i6 = cVar.f2627;
                cVar.f2627 = cVar.f2625;
                cVar.f2625 = i6;
            }
            int i7 = cVar.f2627;
            cVar.f2627 = cVar.f2625;
            cVar.f2625 = i7;
            cVar.f2625 ^= iArr5[16];
            cVar.f2627 ^= iArr5[17];
            int i8 = cVar.f2627;
            int i9 = cVar.f2625;
            cArr[0] = (char) (cVar.f2627 >>> 16);
            cArr[1] = (char) cVar.f2627;
            cArr[2] = (char) (cVar.f2625 >>> 16);
            cArr[3] = (char) cVar.f2625;
            util.h.xz.b.c.m27723(iArr5);
            cArr2[cVar.f2626 * 2] = cArr[0];
            cArr2[(cVar.f2626 * 2) + 1] = cArr[1];
            cArr2[(cVar.f2626 * 2) + 2] = cArr[2];
            cArr2[(cVar.f2626 * 2) + 3] = cArr[3];
            cVar.f2626 += 2;
            i = 0;
        }
        objArr[0] = new java.lang.String(cArr2, 0, scrollBarSize);
        throw new java.lang.IllegalArgumentException(((java.lang.String) objArr[0]).intern());
    }
}
