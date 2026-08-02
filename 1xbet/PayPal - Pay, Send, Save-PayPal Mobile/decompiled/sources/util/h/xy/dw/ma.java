package util.h.xy.dw;

/* loaded from: classes5.dex */
public final class ma extends util.h.xy.dh.mh {
    private static int Camera2StreamConfigurationMap = 1;
    private static int[] getHighResolutionOutputSizeshNQ4ISI = {444098927, 1992279533, -1633191861, -384067008, 2123569335, -1022284403, -514862164, 640120261, -472345980, -194607914, 49771878, -2039628226, -849865219, 1863285861, 86088793, 1282322100, 1220300424, -228728569};
    private static int getHighSpeedVideoFpsRanges = 0;
    private static int getHighSpeedVideoFpsRangesFor = 0;
    private static int getHighSpeedVideoSizes = 1;
    private util.h.xy.dh.c getInputFormats;
    private util.h.xy.dh.i getOutputMinFrameDuration;

    @Override // util.h.xy.dh.mh, util.h.xy.dh.c
    /* renamed from: ʾ */
    public final util.h.xy.dh.mi mo26279() {
        util.h.xy.dh.d dVar = new util.h.xy.dh.d(2);
        dVar.m26290(this.getOutputMinFrameDuration);
        dVar.m26290(this.getInputFormats);
        util.h.xy.dh.aa aaVar = new util.h.xy.dh.aa(dVar);
        int i = getHighSpeedVideoSizes + 29;
        getHighSpeedVideoFpsRangesFor = i % 128;
        if (i % 2 == 0) {
            return aaVar;
        }
        throw null;
    }

    /* renamed from: ˊ, reason: contains not printable characters */
    public final util.h.xy.dh.c m26433() {
        int i = getHighSpeedVideoFpsRangesFor + 91;
        getHighSpeedVideoSizes = i % 128;
        util.h.xy.dh.c cVar = this.getInputFormats;
        if (i % 2 != 0) {
            return cVar;
        }
        throw new java.lang.ArithmeticException();
    }

    /* renamed from: ˏ, reason: contains not printable characters */
    public final util.h.xy.dh.i m26434() {
        int i = getHighSpeedVideoSizes + 81;
        int i2 = i % 128;
        getHighSpeedVideoFpsRangesFor = i2;
        if (i % 2 != 0) {
            throw null;
        }
        util.h.xy.dh.i iVar = this.getOutputMinFrameDuration;
        getHighSpeedVideoSizes = (i2 + 83) % 128;
        return iVar;
    }

    public ma(util.h.xy.dh.i iVar, util.h.xy.dh.c cVar) {
        this.getOutputMinFrameDuration = iVar;
        this.getInputFormats = cVar;
    }

    /* renamed from: ˋ, reason: contains not printable characters */
    public static util.h.xy.dw.ma m26432(java.lang.Object obj) {
        java.lang.Object[] objArr;
        int[] iArr;
        if (obj instanceof util.h.xy.dw.ma) {
            int i = getHighSpeedVideoFpsRangesFor;
            getHighSpeedVideoSizes = (i + 109) % 128;
            util.h.xy.dw.ma maVar = (util.h.xy.dw.ma) obj;
            int i2 = i + 51;
            getHighSpeedVideoSizes = i2 % 128;
            if (i2 % 2 != 0) {
                return maVar;
            }
            throw null;
        }
        if (obj != null) {
            return new util.h.xy.dw.ma(util.h.xy.dh.l.m26303(obj));
        }
        int[] iArr2 = {1878842876, 1586005595, -1728169348, -276457159, -1261358835, -1220037516, 153300544, 971145990, 1206413100, 1380370397, 1684253389, -1304653558, -1111883630, 1115019240};
        java.lang.Object[] objArr2 = new java.lang.Object[1];
        int indexOf = 27 - android.text.TextUtils.indexOf("", "", 0);
        util.h.xz.b.c cVar = new util.h.xz.b.c();
        char[] cArr = new char[4];
        char[] cArr2 = new char[28];
        int[] iArr3 = getHighResolutionOutputSizeshNQ4ISI;
        if (iArr3 != null) {
            int length = iArr3.length;
            int[] iArr4 = new int[length];
            int i3 = 0;
            while (i3 < length) {
                iArr4[i3] = (int) (iArr3[i3] ^ (-5569649899877129369L));
                i3++;
                getHighSpeedVideoFpsRanges = (Camera2StreamConfigurationMap + 57) % 128;
                objArr2 = objArr2;
            }
            objArr = objArr2;
            iArr3 = iArr4;
        } else {
            objArr = objArr2;
        }
        int length2 = iArr3.length;
        int[] iArr5 = new int[length2];
        int[] iArr6 = getHighResolutionOutputSizeshNQ4ISI;
        if (iArr6 != null) {
            Camera2StreamConfigurationMap = (getHighSpeedVideoFpsRanges + 115) % 128;
            int length3 = iArr6.length;
            int[] iArr7 = new int[length3];
            int i4 = 0;
            while (i4 < length3) {
                iArr7[i4] = (int) (iArr6[i4] ^ (-5569649899877129369L));
                i4++;
                iArr2 = iArr2;
            }
            iArr = iArr2;
            iArr6 = iArr7;
        } else {
            iArr = iArr2;
        }
        java.lang.System.arraycopy(iArr6, 0, iArr5, 0, length2);
        cVar.f2626 = 0;
        while (cVar.f2626 < 14) {
            cArr[0] = (char) (iArr[cVar.f2626] >> 16);
            cArr[1] = (char) iArr[cVar.f2626];
            cArr[2] = (char) (iArr[cVar.f2626 + 1] >> 16);
            cArr[3] = (char) iArr[cVar.f2626 + 1];
            cVar.f2627 = (cArr[0] << 16) + cArr[1];
            cVar.f2625 = (cArr[2] << 16) + cArr[3];
            util.h.xz.b.c.m27723(iArr5);
            for (int i5 = 0; i5 < 16; i5++) {
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
        }
        objArr[0] = new java.lang.String(cArr2, 0, indexOf);
        throw new java.lang.IllegalArgumentException(((java.lang.String) objArr[0]).intern());
    }

    private ma(util.h.xy.dh.l lVar) {
        this.getOutputMinFrameDuration = (util.h.xy.dh.i) lVar.mo26287(0);
        this.getInputFormats = lVar.mo26287(1);
    }
}
