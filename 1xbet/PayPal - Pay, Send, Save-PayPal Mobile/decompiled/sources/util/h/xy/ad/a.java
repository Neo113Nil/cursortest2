package util.h.xy.ad;

/* loaded from: classes5.dex */
public final class a {
    private static int getHighResolutionOutputSizeshNQ4ISI = 1;
    private static int getHighSpeedVideoFpsRangesFor;

    @util.h.xy.a.a
    /* renamed from: ᐝ, reason: contains not printable characters */
    public static byte[] m24550(byte[] bArr, byte[] bArr2) {
        util.h.xy.ad.c cVar = new util.h.xy.ad.c();
        util.h.xy.ad.rc rcVar = new util.h.xy.ad.rc(cVar);
        util.h.xy.ad.d dVar = new util.h.xy.ad.d(bArr);
        rcVar.getHighSpeedVideoFpsRangesFor.getHighSpeedVideoFpsRangesFor();
        int i = util.h.xy.ad.d.Camera2StreamConfigurationMap;
        int i2 = (((i | 101) << 1) - (i ^ 101)) % 128;
        util.h.xy.ad.d.getHighSpeedVideoFpsRangesFor = i2;
        byte[] bArr3 = dVar.getHighSpeedVideoSizes;
        int i3 = i2 + 1;
        util.h.xy.ad.d.Camera2StreamConfigurationMap = i3 % 128;
        if (i3 % 2 == 0) {
            throw new java.lang.ArithmeticException();
        }
        if (bArr3.length <= rcVar.getHighSpeedVideoSizesFor) {
            m24549(bArr3, 0, rcVar.getInputSizeshNQ4ISI, 0, bArr3.length);
            int length = bArr3.length;
            while (true) {
                byte[] bArr4 = rcVar.getInputSizeshNQ4ISI;
                if (length >= bArr4.length) {
                    break;
                }
                bArr4[length] = 0;
                length = ((length | 1) << 1) - (length ^ 1);
            }
        } else {
            util.h.xy.ad.rc.getHighResolutionOutputSizeshNQ4ISI = (util.h.xy.ad.rc.getHighSpeedVideoFpsRanges + 5) % 128;
            rcVar.getHighSpeedVideoFpsRangesFor.Camera2StreamConfigurationMap(bArr3, 0, bArr3.length);
            rcVar.getHighSpeedVideoFpsRangesFor.getHighResolutionOutputSizeshNQ4ISI(rcVar.getInputSizeshNQ4ISI, 0);
            int i4 = rcVar.Camera2StreamConfigurationMap;
            int i5 = util.h.xy.ad.rc.getHighResolutionOutputSizeshNQ4ISI;
            util.h.xy.ad.rc.getHighSpeedVideoFpsRanges = ((i5 & 39) + (i5 | 39)) % 128;
            while (true) {
                byte[] bArr5 = rcVar.getInputSizeshNQ4ISI;
                if (i4 >= bArr5.length) {
                    break;
                }
                int i6 = util.h.xy.ad.rc.getHighResolutionOutputSizeshNQ4ISI;
                util.h.xy.ad.rc.getHighSpeedVideoFpsRanges = ((i6 & 9) + (i6 | 9)) % 128;
                bArr5[i4] = 0;
                i4 = ((i4 | 1) << 1) - (i4 ^ 1);
            }
            util.h.xy.ad.rc.getHighResolutionOutputSizeshNQ4ISI = (util.h.xy.ad.rc.getHighSpeedVideoFpsRanges + 51) % 128;
        }
        byte[] bArr6 = rcVar.getInputSizeshNQ4ISI;
        byte[] bArr7 = new byte[bArr6.length];
        rcVar.getHighSpeedVideoSizes = bArr7;
        m24549(bArr6, 0, bArr7, 0, bArr6.length);
        int i7 = 0;
        while (true) {
            byte[] bArr8 = rcVar.getInputSizeshNQ4ISI;
            if (i7 >= bArr8.length) {
                break;
            }
            util.h.xy.ad.rc.getHighResolutionOutputSizeshNQ4ISI = (util.h.xy.ad.rc.getHighSpeedVideoFpsRanges + 47) % 128;
            byte b = bArr8[i7];
            bArr8[i7] = (byte) ((~(b & org.apache.commons.imaging.formats.pnm.PnmConstants.PPM_RAW_CODE)) & (b | org.apache.commons.imaging.formats.pnm.PnmConstants.PPM_RAW_CODE));
            int i8 = ((i7 | (-50)) << 1) - (i7 ^ (-50));
            i7 = (i8 & 51) + (i8 | 51);
        }
        int i9 = 0;
        while (true) {
            byte[] bArr9 = rcVar.getHighSpeedVideoSizes;
            if (i9 >= bArr9.length) {
                break;
            }
            bArr9[i9] = (byte) (bArr9[i9] ^ 92);
            int i10 = (i9 & 57) + (i9 | 57);
            i9 = ((i10 | (-56)) << 1) - (i10 ^ (-56));
            util.h.xy.ad.rc.getHighSpeedVideoFpsRanges = (util.h.xy.ad.rc.getHighResolutionOutputSizeshNQ4ISI + 23) % 128;
        }
        util.h.xy.ad.b bVar = rcVar.getHighSpeedVideoFpsRangesFor;
        byte[] bArr10 = rcVar.getInputSizeshNQ4ISI;
        bVar.Camera2StreamConfigurationMap(bArr10, 0, bArr10.length);
        int i11 = util.h.xy.ad.rc.getHighResolutionOutputSizeshNQ4ISI;
        util.h.xy.ad.rc.getHighSpeedVideoFpsRanges = (((i11 | 119) << 1) - (i11 ^ 119)) % 128;
        int length2 = bArr2.length;
        int i12 = util.h.xy.ad.rc.getHighResolutionOutputSizeshNQ4ISI;
        int i13 = ((i12 | 121) << 1) - (i12 ^ 121);
        util.h.xy.ad.rc.getHighSpeedVideoFpsRanges = i13 % 128;
        if (i13 % 2 == 0) {
            rcVar.getHighSpeedVideoFpsRangesFor.Camera2StreamConfigurationMap(bArr2, 0, length2);
            throw null;
        }
        rcVar.getHighSpeedVideoFpsRangesFor.Camera2StreamConfigurationMap(bArr2, 0, length2);
        byte[] bArr11 = new byte[cVar.getHighResolutionOutputSizeshNQ4ISI()];
        int i14 = util.h.xy.ad.rc.getHighSpeedVideoFpsRanges;
        util.h.xy.ad.rc.getHighResolutionOutputSizeshNQ4ISI = ((i14 & 41) + (i14 | 41)) % 128;
        int i15 = rcVar.Camera2StreamConfigurationMap;
        byte[] bArr12 = new byte[i15];
        rcVar.getHighSpeedVideoFpsRangesFor.getHighResolutionOutputSizeshNQ4ISI(bArr12, 0);
        util.h.xy.ad.b bVar2 = rcVar.getHighSpeedVideoFpsRangesFor;
        byte[] bArr13 = rcVar.getHighSpeedVideoSizes;
        bVar2.Camera2StreamConfigurationMap(bArr13, 0, bArr13.length);
        rcVar.getHighSpeedVideoFpsRangesFor.Camera2StreamConfigurationMap(bArr12, 0, i15);
        rcVar.getHighSpeedVideoFpsRangesFor.getHighResolutionOutputSizeshNQ4ISI(bArr11, 0);
        int i16 = util.h.xy.ad.rc.getHighSpeedVideoFpsRanges;
        int i17 = (i16 ^ 73) + ((i16 & 73) << 1);
        util.h.xy.ad.rc.getHighResolutionOutputSizeshNQ4ISI = i17 % 128;
        if (i17 % 2 != 0) {
            rcVar.getHighSpeedVideoFpsRangesFor.getHighSpeedVideoFpsRangesFor();
            util.h.xy.ad.b bVar3 = rcVar.getHighSpeedVideoFpsRangesFor;
            byte[] bArr14 = rcVar.getInputSizeshNQ4ISI;
            bVar3.Camera2StreamConfigurationMap(bArr14, 1, bArr14.length);
        } else {
            rcVar.getHighSpeedVideoFpsRangesFor.getHighSpeedVideoFpsRangesFor();
            util.h.xy.ad.b bVar4 = rcVar.getHighSpeedVideoFpsRangesFor;
            byte[] bArr15 = rcVar.getInputSizeshNQ4ISI;
            bVar4.Camera2StreamConfigurationMap(bArr15, 0, bArr15.length);
        }
        int i18 = util.h.xy.ad.rc.getHighSpeedVideoFpsRanges + 83;
        util.h.xy.ad.rc.getHighResolutionOutputSizeshNQ4ISI = i18 % 128;
        if (i18 % 2 != 0) {
            throw null;
        }
        int i19 = getHighSpeedVideoFpsRangesFor;
        int i20 = (i19 ^ 75) + ((i19 & 75) << 1);
        getHighResolutionOutputSizeshNQ4ISI = i20 % 128;
        if (i20 % 2 != 0) {
            return bArr11;
        }
        throw null;
    }

    @util.h.xy.a.a
    /* renamed from: ˋ, reason: contains not printable characters */
    public static byte[] m24548(byte[] bArr) {
        byte[] bArr2 = new byte[32];
        util.h.xy.ad.c cVar = new util.h.xy.ad.c();
        cVar.Camera2StreamConfigurationMap(bArr, 0, bArr.length);
        cVar.getHighResolutionOutputSizeshNQ4ISI(bArr2, 0);
        getHighSpeedVideoFpsRangesFor = (getHighResolutionOutputSizeshNQ4ISI + 51) % 128;
        return bArr2;
    }

    @util.h.xy.a.a
    /* renamed from: ᐝ, reason: contains not printable characters */
    public static void m24549(byte[] bArr, int i, byte[] bArr2, int i2, int i3) {
        int i4 = getHighResolutionOutputSizeshNQ4ISI;
        int i5 = ((i4 ^ 11) + ((i4 & 11) << 1)) % 128;
        getHighSpeedVideoFpsRangesFor = i5;
        getHighResolutionOutputSizeshNQ4ISI = ((i5 & 19) + (i5 | 19)) % 128;
        int i6 = 0;
        while (i6 < i3) {
            int i7 = getHighResolutionOutputSizeshNQ4ISI;
            int i8 = ((i7 ^ 47) + ((i7 & 47) << 1)) % 128;
            getHighSpeedVideoFpsRangesFor = i8;
            int i9 = ~i2;
            int i10 = (((i2 * (-159)) - (~(i6 * (-159)))) - 1) + (((i9 ^ i6) | (i9 & i6)) * 160);
            int i11 = ~i;
            int i12 = ~((i11 & i2) | (i11 ^ i2));
            int i13 = ~((i2 ^ i6) | (i2 & i6));
            int i14 = -(-(((i12 ^ i13) | (i12 & i13)) * (-160)));
            int i15 = (i10 ^ i14) + ((i10 & i14) << 1);
            int i16 = ~i6;
            int i17 = ((~((i11 ^ i16) | (i16 & i11))) | i2) * 160;
            bArr2[(i15 & i17) + (i17 | i15)] = bArr[(i6 ^ i) + ((i6 & i) << 1)];
            i6 = (((i6 | 75) << 1) - (i6 ^ 75)) - 74;
            int i18 = (i8 & 89) + (i8 | 89);
            getHighResolutionOutputSizeshNQ4ISI = i18 % 128;
            if (i18 % 2 == 0) {
                int i19 = 4 / 3;
            }
        }
        int i20 = getHighResolutionOutputSizeshNQ4ISI;
        getHighSpeedVideoFpsRangesFor = (((i20 | 39) << 1) - (i20 ^ 39)) % 128;
    }
}
