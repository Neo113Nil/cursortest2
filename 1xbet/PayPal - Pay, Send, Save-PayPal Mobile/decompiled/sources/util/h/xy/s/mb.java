package util.h.xy.s;

/* loaded from: classes5.dex */
public class mb {
    private static int getHighResolutionOutputSizeshNQ4ISI = 1;
    private static int getHighSpeedVideoSizes;
    private int Camera2StreamConfigurationMap;
    private byte[] getHighSpeedVideoFpsRanges;
    private byte[] getHighSpeedVideoFpsRangesFor;

    static {
        int i = getHighSpeedVideoSizes;
        int i2 = (i ^ com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CALENDAR_VALUE) + ((i & com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CALENDAR_VALUE) << 1);
        getHighResolutionOutputSizeshNQ4ISI = i2 % 128;
        if (i2 % 2 == 0) {
            throw null;
        }
    }

    /* renamed from: ˊ, reason: contains not printable characters */
    public void m27214(byte[] bArr) {
        int i;
        int i2 = getHighResolutionOutputSizeshNQ4ISI + 15;
        int i3 = i2 % 128;
        getHighSpeedVideoSizes = i3;
        if (i2 % 2 != 0) {
            throw new java.lang.ArithmeticException();
        }
        if (bArr == null || bArr.length == 0) {
            this.getHighSpeedVideoFpsRanges = new byte[0];
            i = i3 + 65;
        } else {
            this.getHighSpeedVideoFpsRanges = (byte[]) bArr.clone();
            int i4 = this.Camera2StreamConfigurationMap;
            int identityHashCode = java.lang.System.identityHashCode(this);
            int i5 = i4 * (-112);
            int i6 = (i5 & (-112)) + (i5 | (-112));
            int i7 = ~i4;
            int i8 = ~identityHashCode;
            int i9 = (i8 ^ i7) | (i7 & i8);
            int i10 = ~i9;
            int i11 = ((i10 ^ 1) | (i10 & 1)) * 226;
            int i12 = ~((i4 & (-2)) | (i4 ^ (-2)));
            int i13 = ~((identityHashCode & (-2)) | (identityHashCode ^ (-2)));
            int i14 = (i12 ^ i13) | (i13 & i12);
            int i15 = ~((i9 ^ 1) | (i9 & 1));
            this.Camera2StreamConfigurationMap = ((((i6 & i11) + (i6 | i11)) - (~(-(-(((i14 ^ i15) | (i15 & i14)) * (-113)))))) - 1) + ((~(i7 | identityHashCode)) * 113);
            int i16 = getHighSpeedVideoSizes;
            i = (i16 ^ 61) + ((i16 & 61) << 1);
        }
        getHighResolutionOutputSizeshNQ4ISI = i % 128;
        this.getHighSpeedVideoFpsRanges = bArr;
    }

    /* renamed from: ˋ, reason: contains not printable characters */
    public void m27215(byte[] bArr) {
        int i = getHighSpeedVideoSizes;
        int i2 = ((i & 63) + (i | 63)) % 128;
        getHighResolutionOutputSizeshNQ4ISI = i2;
        if (bArr != null) {
            getHighSpeedVideoSizes = (i2 + 107) % 128;
            if (bArr.length != 0) {
                this.getHighSpeedVideoFpsRangesFor = (byte[]) bArr.clone();
                int i3 = this.Camera2StreamConfigurationMap;
                int identityHashCode = java.lang.System.identityHashCode(this);
                int i4 = -(-(i3 * (-448)));
                int i5 = ~((i3 ^ (-2)) | (i3 & (-2)));
                int i6 = ~i3;
                int i7 = (i6 ^ 1) | (i6 & 1);
                int i8 = ~((i7 ^ identityHashCode) | (i7 & identityHashCode));
                int i9 = (i4 ^ 450) + ((i4 & 450) << 1) + (((i8 & i5) | (i8 ^ i5)) * 449);
                int i10 = -(-((~(i3 | (-2))) * (-1347)));
                int i11 = ~identityHashCode;
                int i12 = (i11 ^ i6) | (i11 & i6);
                int i13 = ~((i12 ^ 1) | (i12 & 1));
                this.Camera2StreamConfigurationMap = (((i9 & i10) + (i10 | i9)) - (~(((i13 & i5) | (i13 ^ i5)) * 449))) - 1;
                getHighSpeedVideoSizes = (getHighResolutionOutputSizeshNQ4ISI + 55) % 128;
                this.getHighSpeedVideoFpsRangesFor = bArr;
            }
        }
        this.getHighSpeedVideoFpsRangesFor = new byte[0];
        this.getHighSpeedVideoFpsRangesFor = bArr;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x004b, code lost:
    
        r9 = (r1 ^ 41) + ((r1 & 41) << 1);
        util.h.xy.s.mb.getHighSpeedVideoSizes = r9 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0056, code lost:
    
        if ((r9 % 2) != 0) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0058, code lost:
    
        r6[r7] = new byte[]{2};
        r0[r7] = r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0061, code lost:
    
        r6[r7] = new byte[]{2};
        r0[r7] = r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x006e, code lost:
    
        throw new java.lang.ArithmeticException();
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0071, code lost:
    
        if (r11.Camera2StreamConfigurationMap <= 0) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0073, code lost:
    
        util.h.xy.s.mb.getHighSpeedVideoSizes = (r1 + 75) % 128;
        r3 = util.h.xy.al.rd.m25024(r6, r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x007d, code lost:
    
        util.h.xy.ar.b.m25074(r3);
        util.h.xy.s.mb.getHighResolutionOutputSizeshNQ4ISI = (util.h.xy.s.mb.getHighSpeedVideoSizes + 13) % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0088, code lost:
    
        return r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0024, code lost:
    
        r7 = (r1 & 91) + (r1 | 91);
        util.h.xy.s.mb.getHighSpeedVideoSizes = r7 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x002e, code lost:
    
        if ((r7 % 2) != 0) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0030, code lost:
    
        r7 = r11.getHighSpeedVideoFpsRanges;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0033, code lost:
    
        if (r7.length <= 0) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0035, code lost:
    
        r6[0] = new byte[]{1};
        r0[0] = r7;
        r7 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x003f, code lost:
    
        r0 = r11.getHighSpeedVideoFpsRanges.length;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0042, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0022, code lost:
    
        if (r11.getHighSpeedVideoFpsRanges != null) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x0017, code lost:
    
        if (r11.getHighSpeedVideoFpsRanges != null) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0043, code lost:
    
        r7 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x0044, code lost:
    
        r8 = r11.getHighSpeedVideoFpsRangesFor;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0046, code lost:
    
        if (r8 == null) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0049, code lost:
    
        if (r8.length <= 0) goto L26;
     */
    /* renamed from: ˋ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public byte[] m27216() {
        byte[][] bArr;
        byte[][] bArr2;
        int i = getHighSpeedVideoSizes + 49;
        int i2 = i % 128;
        getHighResolutionOutputSizeshNQ4ISI = i2;
        byte[] bArr3 = null;
        if (i % 2 == 0) {
            int i3 = this.Camera2StreamConfigurationMap;
            bArr = new byte[i3][];
            bArr2 = new byte[i3][];
        } else {
            int i4 = this.Camera2StreamConfigurationMap;
            bArr = new byte[i4][];
            bArr2 = new byte[i4][];
        }
    }
}
