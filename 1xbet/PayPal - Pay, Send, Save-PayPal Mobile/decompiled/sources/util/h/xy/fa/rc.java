package util.h.xy.fa;

/* loaded from: classes5.dex */
public final class rc {
    private static final short[] Camera2StreamConfigurationMap = new short[128];
    private static int getHighResolutionOutputSizeshNQ4ISI = 1;
    private static int getHighSpeedVideoFpsRanges;
    private static final byte[] getHighSpeedVideoFpsRangesFor;

    static {
        byte[] bArr = new byte[112];
        getHighSpeedVideoFpsRangesFor = bArr;
        byte[] bArr2 = new byte[128];
        getHighResolutionOutputSizeshNQ4ISI(bArr2, 0, 15, (byte) 1);
        getHighResolutionOutputSizeshNQ4ISI(bArr2, 16, 31, (byte) 2);
        getHighResolutionOutputSizeshNQ4ISI(bArr2, 32, 63, (byte) 3);
        getHighResolutionOutputSizeshNQ4ISI(bArr2, 64, 65, (byte) 0);
        getHighResolutionOutputSizeshNQ4ISI(bArr2, 66, 95, (byte) 4);
        getHighResolutionOutputSizeshNQ4ISI(bArr2, 96, 96, (byte) 5);
        getHighResolutionOutputSizeshNQ4ISI(bArr2, 97, 108, (byte) 6);
        getHighResolutionOutputSizeshNQ4ISI(bArr2, 109, 109, (byte) 7);
        getHighResolutionOutputSizeshNQ4ISI(bArr2, 110, 111, (byte) 6);
        getHighResolutionOutputSizeshNQ4ISI(bArr2, 112, 112, (byte) 8);
        getHighResolutionOutputSizeshNQ4ISI(bArr2, 113, 115, (byte) 9);
        getHighResolutionOutputSizeshNQ4ISI(bArr2, 116, 116, (byte) 10);
        getHighResolutionOutputSizeshNQ4ISI(bArr2, 117, 127, (byte) 0);
        getHighResolutionOutputSizeshNQ4ISI(bArr, 0, 111, (byte) -2);
        getHighResolutionOutputSizeshNQ4ISI(bArr, 8, 11, (byte) -1);
        getHighResolutionOutputSizeshNQ4ISI(bArr, 24, 27, (byte) 0);
        getHighResolutionOutputSizeshNQ4ISI(bArr, 40, 43, (byte) 16);
        getHighResolutionOutputSizeshNQ4ISI(bArr, 58, 59, (byte) 0);
        getHighResolutionOutputSizeshNQ4ISI(bArr, 72, 73, (byte) 0);
        getHighResolutionOutputSizeshNQ4ISI(bArr, 89, 91, (byte) 16);
        getHighResolutionOutputSizeshNQ4ISI(bArr, 104, 104, (byte) 16);
        byte[] bArr3 = {0, 0, 0, 0, com.google.common.base.Ascii.US, com.google.common.base.Ascii.SI, com.google.common.base.Ascii.SI, com.google.common.base.Ascii.SI, 7, 7, 7};
        byte[] bArr4 = {-2, -2, -2, -2, 0, 48, 16, 64, 80, 32, com.visa.cbp.getEncExpo.IResultReceiver2};
        int i = getHighSpeedVideoFpsRanges;
        int i2 = ((i | 51) << 1) - (i ^ 51);
        getHighResolutionOutputSizeshNQ4ISI = i2 % 128;
        int i3 = i2 % 2;
        for (int i4 = 0; i4 < 128; i4 = ((i4 | 1) << 1) - (i4 ^ 1)) {
            getHighResolutionOutputSizeshNQ4ISI = (getHighSpeedVideoFpsRanges + 61) % 128;
            byte b = bArr2[i4];
            Camera2StreamConfigurationMap[i4] = (short) (bArr4[b] | ((bArr3[b] & i4) << 8));
        }
        int i5 = getHighSpeedVideoFpsRanges;
        getHighResolutionOutputSizeshNQ4ISI = (((i5 | 109) << 1) - (i5 ^ 109)) % 128;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0083, code lost:
    
        if (r3 < r8.length) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x008e, code lost:
    
        r5 = r8[r3];
        r2 = r2 << 6;
        r6 = r5 & 63;
        r2 = (r2 ^ r6) | (r2 & r6);
        r5 = -(-((r5 & 255) >>> 4));
        r1 = util.h.xy.fa.rc.getHighSpeedVideoFpsRangesFor[((r1 | r5) << 1) - (r1 ^ r5)];
        r5 = util.h.xy.fa.rc.getHighSpeedVideoFpsRanges;
        util.h.xy.fa.rc.getHighResolutionOutputSizeshNQ4ISI = (((r5 | 73) << 1) - (r5 ^ 73)) % 128;
        r3 = r3 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0085, code lost:
    
        util.h.xy.fa.rc.getHighResolutionOutputSizeshNQ4ISI = (util.h.xy.fa.rc.getHighSpeedVideoFpsRanges + 75) % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x008d, code lost:
    
        return -1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x00b9, code lost:
    
        if (r1 != (-2)) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x00cd, code lost:
    
        if (r2 > 65535) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x00cf, code lost:
    
        r1 = util.h.xy.fa.rc.getHighSpeedVideoFpsRanges;
        util.h.xy.fa.rc.getHighResolutionOutputSizeshNQ4ISI = ((r1 & 89) + (r1 | 89)) % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x00db, code lost:
    
        if (r0 < r11.length) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x00de, code lost:
    
        r11[r0] = (char) r2;
        r0 = r0 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0120, code lost:
    
        r1 = util.h.xy.fa.rc.getHighSpeedVideoFpsRanges;
        util.h.xy.fa.rc.getHighResolutionOutputSizeshNQ4ISI = ((r1 ^ 3) + ((r1 & 3) << 1)) % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x00dd, code lost:
    
        return -1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x00e7, code lost:
    
        if (r0 < ((-2) - (~r11.length))) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00f2, code lost:
    
        r1 = (r0 & 1) + (r0 | 1);
        r11[r0] = (char) ((r2 >>> 10) + 55232);
        r0 = ((r1 | (-108)) << 1) - (r1 ^ (-108));
        r11[r1] = (char) ((r2 & 1023) | 56320);
        util.h.xy.fa.rc.getHighSpeedVideoFpsRanges = (util.h.xy.fa.rc.getHighResolutionOutputSizeshNQ4ISI + 121) % 128;
        r0 = ((r0 | 109) << 1) - (r0 ^ 109);
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00e9, code lost:
    
        util.h.xy.fa.rc.getHighResolutionOutputSizeshNQ4ISI = (util.h.xy.fa.rc.getHighSpeedVideoFpsRanges + 119) % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00f1, code lost:
    
        return -1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00bb, code lost:
    
        r8 = util.h.xy.fa.rc.getHighSpeedVideoFpsRanges + 23;
        util.h.xy.fa.rc.getHighResolutionOutputSizeshNQ4ISI = r8 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00c5, code lost:
    
        if ((r8 % 2) == 0) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00c7, code lost:
    
        return -1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00c9, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x003f, code lost:
    
        if (r0 < r11.length) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x005d, code lost:
    
        r4 = (r0 & (-42)) + (r0 | (-42));
        r11[r0] = (char) r1;
        util.h.xy.fa.rc.getHighSpeedVideoFpsRanges = (((r2 | 87) << 1) - (r2 ^ 87)) % 128;
        r0 = (r4 & 43) + (r4 | 43);
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x0041, code lost:
    
        r2 = r2 + 25;
        r8 = r2 % 128;
        util.h.xy.fa.rc.getHighSpeedVideoFpsRanges = r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x0049, code lost:
    
        if ((r2 % 2) != 0) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x004b, code lost:
    
        util.h.xy.fa.rc.getHighResolutionOutputSizeshNQ4ISI = (((r8 | 63) << 1) - (r8 ^ 63)) % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x0056, code lost:
    
        return -1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x005c, code lost:
    
        throw new java.lang.ArithmeticException();
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x003c, code lost:
    
        if (r1 >= 0) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x002e, code lost:
    
        if (r1 >= 0) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0077, code lost:
    
        r1 = util.h.xy.fa.rc.Camera2StreamConfigurationMap[r1 & Byte.MAX_VALUE];
        r2 = r1 >>> 8;
        r1 = (byte) r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0080, code lost:
    
        if (r1 < 0) goto L61;
     */
    /* renamed from: ˏ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static int m26815(byte[] bArr, int i, int i2, char[] cArr) {
        int i3;
        byte b;
        int i4 = getHighResolutionOutputSizeshNQ4ISI;
        getHighSpeedVideoFpsRanges = (((i4 | 11) << 1) - (i4 ^ 11)) % 128;
        int i5 = -(-i2);
        int i6 = 0;
        for (int i7 = i; i7 < (i & i5) + (i5 | i); i7 = i3) {
            int i8 = getHighSpeedVideoFpsRanges;
            int i9 = (i8 ^ 55) + ((i8 & 55) << 1);
            int i10 = i9 % 128;
            getHighResolutionOutputSizeshNQ4ISI = i10;
            if (i9 % 2 == 0) {
                i3 = i7 + 4;
                b = bArr[i7];
            } else {
                int i11 = i7 - 118;
                i3 = (i11 ^ 119) + ((i11 & 119) << 1);
                b = bArr[i7];
            }
        }
        int i12 = getHighSpeedVideoFpsRanges + 11;
        getHighResolutionOutputSizeshNQ4ISI = i12 % 128;
        if (i12 % 2 != 0) {
            return i6;
        }
        throw new java.lang.ArithmeticException();
    }

    /* renamed from: ˎ, reason: contains not printable characters */
    public static int m26814(byte[] bArr, char[] cArr) {
        int i = getHighResolutionOutputSizeshNQ4ISI + 3;
        getHighSpeedVideoFpsRanges = i % 128;
        return m26815(bArr, i % 2 != 0 ? 1 : 0, bArr.length, cArr);
    }

    private static void getHighResolutionOutputSizeshNQ4ISI(byte[] bArr, int i, int i2, byte b) {
        int i3 = ~i;
        int i4 = ((~((248990936 ^ i3) | (i3 & 248990936))) | (-2128568282)) * com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CODE_ACCOUNT_VERIFICATION_VALUE;
        int i5 = (((i4 | (-1000230715)) << 1) - (i4 ^ (-1000230715))) + ((~((2128568281 ^ i) | (i & 2128568281))) * com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CODE_ACCOUNT_VERIFICATION_VALUE);
        int i6 = ~((1879644121 ^ i3) | (i3 & 1879644121));
        int i7 = -(-(((i6 ^ 248924160) | (i6 & 248924160) | (~(((-1879577346) ^ i) | (i & (-1879577346))))) * com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CODE_ACCOUNT_VERIFICATION_VALUE));
        int i8 = ~(i3 | (-1195131029));
        int i9 = -(-(((i8 ^ 1144012816) | (i8 & 1144012816)) * 529));
        if ((i5 & i7) + (i7 | i5) > ((((i9 | 1117909414) << 1) - (i9 ^ 1117909414)) - (~(-(-(((~((i ^ (-1195131029)) | (i & (-1195131029)))) | 1282495544) * 529))))) - 1) {
            throw null;
        }
        while (i <= i2) {
            int i10 = getHighResolutionOutputSizeshNQ4ISI + 1;
            getHighSpeedVideoFpsRanges = i10 % 128;
            if (i10 % 2 != 0) {
                bArr[i] = b;
                i += 115;
            } else {
                bArr[i] = b;
                int i11 = i - 27;
                i = (i11 & 28) + (i11 | 28);
            }
        }
        int i12 = getHighResolutionOutputSizeshNQ4ISI;
        getHighSpeedVideoFpsRanges = (((i12 | 19) << 1) - (i12 ^ 19)) % 128;
    }
}
