package util.h.xy.s;

/* loaded from: classes5.dex */
public class me {
    private static int getHighSpeedVideoFpsRanges = 1;
    private static int getHighSpeedVideoFpsRangesFor;
    private util.h.xy.s.f[] Camera2StreamConfigurationMap;
    private byte[] getHighResolutionOutputSizeshNQ4ISI;
    private byte[] getHighSpeedVideoSizes;
    private byte[] getHighSpeedVideoSizesFor;
    private util.h.xy.s.a[] getInputFormats;
    private byte[] getInputSizeshNQ4ISI;
    private util.h.xy.s.a getOutputFormats;
    private util.h.xy.s.a getOutputMinFrameDuration;
    private byte[] getOutputStallDurationlomOqCM;

    /* renamed from: ـ, reason: contains not printable characters */
    public byte[] m27238() {
        byte[] bArr;
        int i = getHighSpeedVideoFpsRangesFor;
        int i2 = (i ^ 9) + ((i & 9) << 1);
        getHighSpeedVideoFpsRanges = i2 % 128;
        if (i2 % 2 == 0) {
            byte[] bArr2 = this.getInputSizeshNQ4ISI;
            bArr = new byte[bArr2.length];
            java.lang.System.arraycopy(bArr2, 1, bArr, 0, bArr2.length);
        } else {
            byte[] bArr3 = this.getInputSizeshNQ4ISI;
            bArr = new byte[bArr3.length];
            java.lang.System.arraycopy(bArr3, 0, bArr, 0, bArr3.length);
        }
        int i3 = getHighSpeedVideoFpsRanges;
        int i4 = (i3 & 39) + (i3 | 39);
        getHighSpeedVideoFpsRangesFor = i4 % 128;
        if (i4 % 2 == 0) {
            return bArr;
        }
        throw null;
    }

    /* renamed from: ʾ, reason: contains not printable characters */
    public void m27227(byte[] bArr) {
        getHighSpeedVideoFpsRangesFor = (getHighSpeedVideoFpsRanges + 113) % 128;
        byte[] bArr2 = new byte[bArr.length];
        java.lang.System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
        this.getInputSizeshNQ4ISI = bArr2;
        getHighSpeedVideoFpsRanges = (getHighSpeedVideoFpsRangesFor + 31) % 128;
    }

    /* renamed from: ˑ, reason: contains not printable characters */
    public byte[] m27235() {
        int i = (getHighSpeedVideoFpsRangesFor + com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CALENDAR_VALUE) % 128;
        getHighSpeedVideoFpsRanges = i;
        byte[] bArr = this.getHighSpeedVideoSizesFor;
        getHighSpeedVideoFpsRangesFor = ((i ^ 17) + ((i & 17) << 1)) % 128;
        return bArr;
    }

    /* renamed from: ʿ, reason: contains not printable characters */
    public void m27228(byte[] bArr) {
        int i = getHighSpeedVideoFpsRanges + 63;
        getHighSpeedVideoFpsRangesFor = i % 128;
        if (i % 2 == 0) {
            this.getHighSpeedVideoSizesFor = bArr;
        } else {
            this.getHighSpeedVideoSizesFor = bArr;
            throw null;
        }
    }

    /* renamed from: ˍ, reason: contains not printable characters */
    public byte[] m27232() {
        int i = getHighSpeedVideoFpsRangesFor + 107;
        getHighSpeedVideoFpsRanges = i % 128;
        if (i % 2 == 0) {
            byte[] bArr = this.getHighSpeedVideoSizes;
            byte[] bArr2 = new byte[bArr.length];
            java.lang.System.arraycopy(bArr, 0, bArr2, 1, bArr.length);
            return bArr2;
        }
        byte[] bArr3 = this.getHighSpeedVideoSizes;
        byte[] bArr4 = new byte[bArr3.length];
        java.lang.System.arraycopy(bArr3, 0, bArr4, 0, bArr3.length);
        return bArr4;
    }

    /* renamed from: ˈ, reason: contains not printable characters */
    public void m27229(byte[] bArr) {
        int i = getHighSpeedVideoFpsRanges;
        int i2 = (i ^ 31) + ((i & 31) << 1);
        getHighSpeedVideoFpsRangesFor = i2 % 128;
        if (i2 % 2 != 0) {
            byte[] bArr2 = new byte[bArr.length];
            java.lang.System.arraycopy(bArr, 1, bArr2, 1, bArr.length);
            this.getHighSpeedVideoSizes = bArr2;
        } else {
            byte[] bArr3 = new byte[bArr.length];
            java.lang.System.arraycopy(bArr, 0, bArr3, 0, bArr.length);
            this.getHighSpeedVideoSizes = bArr3;
        }
    }

    /* renamed from: ՙ, reason: contains not printable characters */
    public util.h.xy.s.f[] m27236() {
        util.h.xy.s.f[] fVarArr;
        int i = getHighSpeedVideoFpsRangesFor + 23;
        getHighSpeedVideoFpsRanges = i % 128;
        if (i % 2 == 0) {
            util.h.xy.s.f[] fVarArr2 = this.Camera2StreamConfigurationMap;
            fVarArr = new util.h.xy.s.f[fVarArr2.length];
            java.lang.System.arraycopy(fVarArr2, 0, fVarArr, 0, fVarArr2.length);
        } else {
            util.h.xy.s.f[] fVarArr3 = this.Camera2StreamConfigurationMap;
            fVarArr = new util.h.xy.s.f[fVarArr3.length];
            java.lang.System.arraycopy(fVarArr3, 0, fVarArr, 0, fVarArr3.length);
        }
        int i2 = getHighSpeedVideoFpsRangesFor;
        getHighSpeedVideoFpsRanges = ((i2 & 21) + (i2 | 21)) % 128;
        return fVarArr;
    }

    /* renamed from: ˎ, reason: contains not printable characters */
    public void m27233(util.h.xy.s.f[] fVarArr) {
        int i = getHighSpeedVideoFpsRanges + 73;
        getHighSpeedVideoFpsRangesFor = i % 128;
        if (i % 2 != 0) {
            util.h.xy.s.f[] fVarArr2 = new util.h.xy.s.f[fVarArr.length];
            java.lang.System.arraycopy(fVarArr, 1, fVarArr2, 0, fVarArr.length);
            this.Camera2StreamConfigurationMap = fVarArr2;
        } else {
            util.h.xy.s.f[] fVarArr3 = new util.h.xy.s.f[fVarArr.length];
            java.lang.System.arraycopy(fVarArr, 0, fVarArr3, 0, fVarArr.length);
            this.Camera2StreamConfigurationMap = fVarArr3;
        }
        int i2 = getHighSpeedVideoFpsRanges;
        getHighSpeedVideoFpsRangesFor = (((i2 | 5) << 1) - (i2 ^ 5)) % 128;
    }

    /* renamed from: ᐨ, reason: contains not printable characters */
    public void m27240(byte[] bArr) {
        int i = getHighSpeedVideoFpsRangesFor;
        getHighSpeedVideoFpsRanges = ((i & 19) + (i | 19)) % 128;
        util.h.xy.ar.b.m25095(this.getOutputStallDurationlomOqCM);
        int length = bArr.length;
        byte[] bArr2 = new byte[length];
        this.getOutputStallDurationlomOqCM = bArr2;
        java.lang.System.arraycopy(bArr, 0, bArr2, 0, length);
        int i2 = getHighSpeedVideoFpsRangesFor;
        getHighSpeedVideoFpsRanges = (((i2 | 103) << 1) - (i2 ^ 103)) % 128;
    }

    /* renamed from: י, reason: contains not printable characters */
    public byte[] m27237() {
        int i = getHighSpeedVideoFpsRanges;
        int i2 = (((i | 63) << 1) - (i ^ 63)) % 128;
        getHighSpeedVideoFpsRangesFor = i2;
        byte[] bArr = this.getOutputStallDurationlomOqCM;
        if (bArr != null) {
            int i3 = ((i2 | 73) << 1) - (i2 ^ 73);
            getHighSpeedVideoFpsRanges = i3 % 128;
            if (i3 % 2 == 0) {
                int length = bArr.length;
                throw null;
            }
            if (bArr.length > 0) {
                int length2 = bArr.length;
                byte[] bArr2 = new byte[length2];
                java.lang.System.arraycopy(bArr, 0, bArr2, 0, length2);
                int i4 = getHighSpeedVideoFpsRangesFor;
                int i5 = (i4 & 79) + (i4 | 79);
                getHighSpeedVideoFpsRanges = i5 % 128;
                if (i5 % 2 != 0) {
                    return bArr2;
                }
                throw new java.lang.ArithmeticException();
            }
        }
        byte[] bArr3 = new byte[0];
        getHighSpeedVideoFpsRanges = (i2 + 61) % 128;
        return bArr3;
    }

    /* renamed from: ﾞ, reason: contains not printable characters */
    public util.h.xy.s.a m27243() {
        int i = getHighSpeedVideoFpsRangesFor;
        int i2 = i + 53;
        getHighSpeedVideoFpsRanges = i2 % 128;
        if (i2 % 2 == 0) {
            throw null;
        }
        util.h.xy.s.a aVar = this.getOutputMinFrameDuration;
        getHighSpeedVideoFpsRanges = ((i ^ 25) + ((i & 25) << 1)) % 128;
        return aVar;
    }

    /* renamed from: ᐝ, reason: contains not printable characters */
    public void m27239(util.h.xy.s.a aVar) {
        int i = (getHighSpeedVideoFpsRangesFor + 105) % 128;
        getHighSpeedVideoFpsRanges = i;
        this.getOutputMinFrameDuration = aVar;
        int i2 = i + 43;
        getHighSpeedVideoFpsRangesFor = i2 % 128;
        if (i2 % 2 != 0) {
            throw null;
        }
    }

    /* renamed from: ﹳ, reason: contains not printable characters */
    public util.h.xy.s.a m27242() {
        int i = getHighSpeedVideoFpsRanges;
        int i2 = ((i ^ 51) + ((i & 51) << 1)) % 128;
        getHighSpeedVideoFpsRangesFor = i2;
        util.h.xy.s.a aVar = this.getOutputFormats;
        int i3 = i2 + 35;
        getHighSpeedVideoFpsRanges = i3 % 128;
        if (i3 % 2 != 0) {
            return aVar;
        }
        throw null;
    }

    /* renamed from: ʹ, reason: contains not printable characters */
    public util.h.xy.s.a[] m27226() {
        int i = getHighSpeedVideoFpsRangesFor;
        int i2 = ((i | 67) << 1) - (i ^ 67);
        getHighSpeedVideoFpsRanges = i2 % 128;
        util.h.xy.s.a[] aVarArr = this.getInputFormats;
        if (i2 % 2 != 0) {
            return aVarArr;
        }
        throw new java.lang.ArithmeticException();
    }

    /* renamed from: ˋ, reason: contains not printable characters */
    public void m27230(util.h.xy.s.a aVar) {
        int i = getHighSpeedVideoFpsRangesFor;
        int i2 = (i ^ 87) + ((i & 87) << 1);
        getHighSpeedVideoFpsRanges = i2 % 128;
        if (i2 % 2 != 0) {
            this.getOutputFormats = aVar;
        } else {
            this.getOutputFormats = aVar;
            throw new java.lang.ArithmeticException();
        }
    }

    /* renamed from: ˋ, reason: contains not printable characters */
    public void m27231(util.h.xy.s.a[] aVarArr) {
        int i = getHighSpeedVideoFpsRanges;
        int i2 = (i & 125) + (i | 125);
        getHighSpeedVideoFpsRangesFor = i2 % 128;
        if (i2 % 2 == 0) {
            this.getInputFormats = aVarArr;
            int i3 = (i ^ 15) + ((i & 15) << 1);
            getHighSpeedVideoFpsRangesFor = i3 % 128;
            if (i3 % 2 != 0) {
                throw null;
            }
            return;
        }
        this.getInputFormats = aVarArr;
        throw null;
    }

    /* renamed from: ᴵ, reason: contains not printable characters */
    public byte[] m27241() {
        int i = getHighSpeedVideoFpsRanges;
        int i2 = (i & 109) + (i | 109);
        getHighSpeedVideoFpsRangesFor = i2 % 128;
        if (i2 % 2 != 0) {
            throw null;
        }
        byte[] bArr = (byte[]) this.getHighResolutionOutputSizeshNQ4ISI.clone();
        int i3 = getHighSpeedVideoFpsRangesFor;
        int i4 = ((i3 | 119) << 1) - (i3 ^ 119);
        getHighSpeedVideoFpsRanges = i4 % 128;
        if (i4 % 2 != 0) {
            return bArr;
        }
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0046 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0047  */
    /* renamed from: ˑ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void m27234(byte[] bArr) {
        int i;
        int i2;
        int i3 = (getHighSpeedVideoFpsRanges + 111) % 128;
        getHighSpeedVideoFpsRangesFor = i3;
        if (bArr != null) {
            int i4 = i3 + 121;
            getHighSpeedVideoFpsRanges = i4 % 128;
            if (i4 % 2 == 0) {
                int length = bArr.length;
                throw null;
            }
            if (bArr.length != 0) {
                this.getHighResolutionOutputSizeshNQ4ISI = (byte[]) bArr.clone();
                i = getHighSpeedVideoFpsRangesFor + 81;
                getHighSpeedVideoFpsRanges = i % 128;
                int i5 = getHighSpeedVideoFpsRangesFor;
                i2 = ((i5 | 41) << 1) - (i5 ^ 41);
                getHighSpeedVideoFpsRanges = i2 % 128;
                if (i2 % 2 != 0) {
                    throw null;
                }
                return;
            }
        }
        this.getHighResolutionOutputSizeshNQ4ISI = new byte[0];
        i = (i3 & 105) + (i3 | 105);
        getHighSpeedVideoFpsRanges = i % 128;
        int i52 = getHighSpeedVideoFpsRangesFor;
        i2 = ((i52 | 41) << 1) - (i52 ^ 41);
        getHighSpeedVideoFpsRanges = i2 % 128;
        if (i2 % 2 != 0) {
        }
    }
}
