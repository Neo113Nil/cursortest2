package util.h.xy.s;

/* loaded from: classes5.dex */
public final class rc extends util.h.xy.s.me {
    private static int Camera2StreamConfigurationMap = 1;
    private static int getHighSpeedVideoSizes;
    private byte[] getHighResolutionOutputSizeshNQ4ISI;
    private byte[] getHighSpeedVideoFpsRanges;
    private byte[] getHighSpeedVideoFpsRangesFor;
    private byte[] getHighSpeedVideoSizesFor;
    private byte[] getInputFormats;
    private byte[] getInputSizeshNQ4ISI;
    private byte[] getOutputFormats;
    private byte[] getOutputMinFrameDuration;
    private byte[] getOutputMinFrameDurationlomOqCM;
    private byte[] getOutputSizes;
    private java.lang.String getOutputSizeshNQ4ISI;
    private byte[] getOutputStallDuration;
    private byte[] getOutputStallDurationlomOqCM;
    private int getValidOutputFormatsForInputhNQ4ISI;
    private byte[] isOutputSupportedFor;
    private byte[] isOutputSupportedForhNQ4ISI;
    private byte[] unwrapAs;

    /* renamed from: ˋ, reason: contains not printable characters */
    public final int m27315() {
        int i = getHighSpeedVideoSizes;
        Camera2StreamConfigurationMap = ((i & 3) + (i | 3)) % 128;
        int i2 = this.getValidOutputFormatsForInputhNQ4ISI;
        int identityHashCode = java.lang.System.identityHashCode(this);
        int i3 = (((identityHashCode ^ 1076326555) | (identityHashCode & 1076326555)) * 988) - 198968077;
        int i4 = ~identityHashCode;
        int i5 = ((~(1076884155 | i4)) | 273680384) * (-1976);
        int i6 = ((i3 | i5) << 1) - (i3 ^ i5);
        int i7 = ~((identityHashCode ^ (-274237985)) | (identityHashCode & (-274237985)));
        int i8 = (i7 ^ 1076326555) | (i7 & 1076326555);
        int i9 = ~(274237984 | i4);
        int i10 = -(-(((i8 ^ i9) | (i9 & i8)) * 988));
        int identityHashCode2 = java.lang.System.identityHashCode(this);
        int i11 = ~(identityHashCode2 | 910023542);
        int i12 = ((i11 ^ 205073728) | (i11 & 205073728)) * (-668);
        int i13 = ~(identityHashCode2 | 205073728);
        int i14 = ((((i12 | (-60460031)) << 1) - (i12 ^ (-60460031))) - (~(-(-(((i13 & 910023542) | (i13 ^ 910023542)) * 1336))))) - 1;
        int i15 = (identityHashCode2 ^ 910023542) | (identityHashCode2 & 910023542);
        int i16 = -(-(((i15 ^ 205073728) | (i15 & 205073728)) * 668));
        if ((i6 ^ i10) + ((i10 & i6) << 1) > ((i14 | i16) << 1) - (i16 ^ i14)) {
            return i2;
        }
        throw null;
    }

    /* renamed from: ˋ, reason: contains not printable characters */
    public final void m27316(int i) {
        int i2 = getHighSpeedVideoSizes;
        int i3 = (((i2 | 3) << 1) - (i2 ^ 3)) % 128;
        Camera2StreamConfigurationMap = i3;
        this.getValidOutputFormatsForInputhNQ4ISI = i;
        int i4 = i3 + 35;
        getHighSpeedVideoSizes = i4 % 128;
        if (i4 % 2 != 0) {
            throw null;
        }
    }

    /* renamed from: ˏ, reason: contains not printable characters */
    public final byte[] m27325() {
        int i = getHighSpeedVideoSizes + 25;
        Camera2StreamConfigurationMap = i % 128;
        if (i % 2 == 0) {
            throw null;
        }
        byte[] bArr = (byte[]) this.getOutputSizes.clone();
        int i2 = getHighSpeedVideoSizes;
        int i3 = ((i2 | 15) << 1) - (i2 ^ 15);
        Camera2StreamConfigurationMap = i3 % 128;
        if (i3 % 2 != 0) {
            return bArr;
        }
        throw null;
    }

    /* renamed from: ˊ, reason: contains not printable characters */
    public final void m27313(byte[] bArr) {
        int i = getHighSpeedVideoSizes;
        int i2 = (i & 81) + (i | 81);
        int i3 = i2 % 128;
        Camera2StreamConfigurationMap = i3;
        if (i2 % 2 != 0) {
            if (bArr == null || bArr.length == 0) {
                this.getOutputSizes = new byte[0];
                getHighSpeedVideoSizes = (i3 + 101) % 128;
                return;
            } else {
                this.getOutputSizes = (byte[]) bArr.clone();
                return;
            }
        }
        throw new java.lang.ArithmeticException();
    }

    /* renamed from: ᐝ, reason: contains not printable characters */
    public final byte[] m27330() {
        Camera2StreamConfigurationMap = (getHighSpeedVideoSizes + 3) % 128;
        byte[] bArr = (byte[]) this.getHighSpeedVideoSizesFor.clone();
        getHighSpeedVideoSizes = (Camera2StreamConfigurationMap + 39) % 128;
        return bArr;
    }

    /* renamed from: ˎ, reason: contains not printable characters */
    public final void m27321(byte[] bArr) {
        int i = getHighSpeedVideoSizes;
        Camera2StreamConfigurationMap = (i + 115) % 128;
        if (bArr != null) {
            int i2 = (i & 77) + (i | 77);
            Camera2StreamConfigurationMap = i2 % 128;
            if (i2 % 2 == 0) {
                int length = bArr.length;
                throw null;
            }
            if (bArr.length != 0) {
                this.getHighSpeedVideoSizesFor = (byte[]) bArr.clone();
                getHighSpeedVideoSizes = (Camera2StreamConfigurationMap + 53) % 128;
                int i3 = getHighSpeedVideoSizes;
                Camera2StreamConfigurationMap = ((i3 & 61) + (i3 | 61)) % 128;
            }
        }
        this.getHighSpeedVideoSizesFor = new byte[0];
        Camera2StreamConfigurationMap = (i + 65) % 128;
        int i32 = getHighSpeedVideoSizes;
        Camera2StreamConfigurationMap = ((i32 & 61) + (i32 | 61)) % 128;
    }

    /* renamed from: ˊ, reason: contains not printable characters */
    public final byte[] m27314() {
        int i = Camera2StreamConfigurationMap;
        getHighSpeedVideoSizes = (((i | 41) << 1) - (i ^ 41)) % 128;
        byte[] bArr = (byte[]) this.getOutputMinFrameDurationlomOqCM.clone();
        int i2 = Camera2StreamConfigurationMap;
        getHighSpeedVideoSizes = ((i2 ^ 75) + ((i2 & 75) << 1)) % 128;
        return bArr;
    }

    /* renamed from: ᐝ, reason: contains not printable characters */
    public final void m27329(byte[] bArr) {
        int i = getHighSpeedVideoSizes;
        int i2 = (((i | com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CALENDAR_VALUE) << 1) - (i ^ com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CALENDAR_VALUE)) % 128;
        Camera2StreamConfigurationMap = i2;
        if (bArr != null) {
            int i3 = i2 + 37;
            getHighSpeedVideoSizes = i3 % 128;
            if (i3 % 2 != 0) {
                int length = bArr.length;
                throw null;
            }
            if (bArr.length != 0) {
                this.getOutputMinFrameDurationlomOqCM = (byte[]) bArr.clone();
                int i4 = Camera2StreamConfigurationMap;
                getHighSpeedVideoSizes = ((i4 ^ 11) + ((i4 & 11) << 1)) % 128;
                return;
            }
        }
        this.getOutputMinFrameDurationlomOqCM = new byte[0];
    }

    /* renamed from: ˎ, reason: contains not printable characters */
    public final byte[] m27322() {
        int i = getHighSpeedVideoSizes;
        Camera2StreamConfigurationMap = (((i | 119) << 1) - (i ^ 119)) % 128;
        byte[] bArr = (byte[]) this.getOutputStallDurationlomOqCM.clone();
        int i2 = getHighSpeedVideoSizes;
        Camera2StreamConfigurationMap = ((i2 & 77) + (i2 | 77)) % 128;
        return bArr;
    }

    /* renamed from: ˋ, reason: contains not printable characters */
    public final void m27317(byte[] bArr) {
        int i = getHighSpeedVideoSizes;
        Camera2StreamConfigurationMap = (i + 25) % 128;
        if (bArr != null) {
            int i2 = i + 39;
            Camera2StreamConfigurationMap = i2 % 128;
            if (i2 % 2 != 0) {
                if (bArr.length != 0) {
                    this.getOutputStallDurationlomOqCM = (byte[]) bArr.clone();
                    getHighSpeedVideoSizes = (Camera2StreamConfigurationMap + 111) % 128;
                }
            } else {
                int length = bArr.length;
                throw null;
            }
        }
        this.getOutputStallDurationlomOqCM = new byte[0];
        getHighSpeedVideoSizes = (Camera2StreamConfigurationMap + 111) % 128;
    }

    /* renamed from: ʽ, reason: contains not printable characters */
    public final byte[] m27306() {
        int i = getHighSpeedVideoSizes + 31;
        Camera2StreamConfigurationMap = i % 128;
        if (i % 2 == 0) {
            throw null;
        }
        byte[] bArr = (byte[]) this.getOutputMinFrameDuration.clone();
        int i2 = Camera2StreamConfigurationMap;
        getHighSpeedVideoSizes = ((i2 ^ 77) + ((i2 & 77) << 1)) % 128;
        return bArr;
    }

    /* renamed from: ˏ, reason: contains not printable characters */
    public final void m27323(java.lang.String str) {
        int i = getHighSpeedVideoSizes;
        Camera2StreamConfigurationMap = ((i ^ 65) + ((i & 65) << 1)) % 128;
        this.getOutputMinFrameDuration = util.h.xy.s.b.m27070(str);
        int i2 = Camera2StreamConfigurationMap;
        int i3 = (i2 & 85) + (i2 | 85);
        getHighSpeedVideoSizes = i3 % 128;
        if (i3 % 2 != 0) {
            throw null;
        }
    }

    /* renamed from: ʼ, reason: contains not printable characters */
    public final byte[] m27304() {
        int i = getHighSpeedVideoSizes;
        Camera2StreamConfigurationMap = ((i & com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CALENDAR_VALUE) + (i | com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CALENDAR_VALUE)) % 128;
        byte[] bArr = (byte[]) this.getOutputFormats.clone();
        int i2 = Camera2StreamConfigurationMap;
        getHighSpeedVideoSizes = ((i2 & 95) + (i2 | 95)) % 128;
        return bArr;
    }

    /* renamed from: ˎ, reason: contains not printable characters */
    public final void m27320(java.lang.String str) {
        int i = Camera2StreamConfigurationMap;
        int i2 = ((i | 95) << 1) - (i ^ 95);
        getHighSpeedVideoSizes = i2 % 128;
        if (i2 % 2 != 0) {
            throw null;
        }
        if (str == null || str.length() == 0) {
            this.getOutputFormats = new byte[]{0};
            getHighSpeedVideoSizes = (Camera2StreamConfigurationMap + 25) % 128;
            return;
        }
        if (str.equals(util.h.xy.al.ra.f361)) {
            int i3 = Camera2StreamConfigurationMap + 49;
            int i4 = i3 % 128;
            getHighSpeedVideoSizes = i4;
            if (i3 % 2 == 0) {
                this.getOutputFormats = new byte[]{1};
                Camera2StreamConfigurationMap = ((i4 ^ 125) + ((i4 & 125) << 1)) % 128;
                return;
            } else {
                this.getOutputFormats = new byte[]{1};
                throw null;
            }
        }
        this.getOutputFormats = new byte[]{0};
    }

    /* renamed from: ι, reason: contains not printable characters */
    public final java.lang.String m27333() {
        int i = Camera2StreamConfigurationMap;
        getHighSpeedVideoSizes = (i + 93) % 128;
        java.lang.String str = this.getOutputSizeshNQ4ISI;
        int i2 = (i ^ 51) + ((i & 51) << 1);
        getHighSpeedVideoSizes = i2 % 128;
        if (i2 % 2 == 0) {
            return str;
        }
        throw null;
    }

    /* renamed from: ᐝ, reason: contains not printable characters */
    public final void m27328(java.lang.String str) {
        int i = Camera2StreamConfigurationMap;
        int i2 = ((i ^ 65) + ((i & 65) << 1)) % 128;
        getHighSpeedVideoSizes = i2;
        this.getOutputSizeshNQ4ISI = str;
        int i3 = (i2 & 101) + (i2 | 101);
        Camera2StreamConfigurationMap = i3 % 128;
        if (i3 % 2 == 0) {
            throw new java.lang.ArithmeticException();
        }
    }

    /* renamed from: ͺ, reason: contains not printable characters */
    public final byte[] m27327() {
        int i = Camera2StreamConfigurationMap + 17;
        getHighSpeedVideoSizes = i % 128;
        byte[] bArr = this.isOutputSupportedFor;
        if (i % 2 == 0) {
            return (byte[]) bArr.clone();
        }
        throw null;
    }

    /* renamed from: ˊ, reason: contains not printable characters */
    public final void m27312(java.lang.String str) {
        int i = Camera2StreamConfigurationMap;
        getHighSpeedVideoSizes = ((i ^ 11) + ((i & 11) << 1)) % 128;
        this.isOutputSupportedFor = util.h.xy.s.b.m27072(str);
        int i2 = Camera2StreamConfigurationMap + 67;
        getHighSpeedVideoSizes = i2 % 128;
        if (i2 % 2 != 0) {
            throw new java.lang.ArithmeticException();
        }
    }

    /* renamed from: ˏ, reason: contains not printable characters */
    public final void m27324(byte[] bArr) {
        int i = getHighSpeedVideoSizes + 31;
        int i2 = i % 128;
        Camera2StreamConfigurationMap = i2;
        if (i % 2 == 0) {
            throw null;
        }
        if (bArr == null || bArr.length == 0) {
            this.unwrapAs = new byte[0];
            getHighSpeedVideoSizes = (((i2 | 65) << 1) - (i2 ^ 65)) % 128;
        } else {
            this.unwrapAs = (byte[]) bArr.clone();
            Camera2StreamConfigurationMap = (getHighSpeedVideoSizes + 43) % 128;
        }
    }

    /* renamed from: ʻ, reason: contains not printable characters */
    public final byte[] m27302() {
        int i = getHighSpeedVideoSizes + 13;
        Camera2StreamConfigurationMap = i % 128;
        if (i % 2 != 0) {
            byte[] bArr = this.unwrapAs;
            if (bArr == null || bArr.length == 0) {
                return new byte[0];
            }
            byte[] bArr2 = (byte[]) bArr.clone();
            getHighSpeedVideoSizes = (Camera2StreamConfigurationMap + 61) % 128;
            return bArr2;
        }
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x003a A[RETURN] */
    /* renamed from: ʽ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m27305(byte[] bArr) {
        int i;
        int i2;
        int i3 = (Camera2StreamConfigurationMap + 7) % 128;
        getHighSpeedVideoSizes = i3;
        if (bArr != null) {
            Camera2StreamConfigurationMap = (i3 + 87) % 128;
            if (bArr.length != 0) {
                this.getHighResolutionOutputSizeshNQ4ISI = (byte[]) bArr.clone();
                i = Camera2StreamConfigurationMap + 9;
                int i4 = i % 128;
                getHighSpeedVideoSizes = i4;
                i2 = (i4 & 51) + (i4 | 51);
                Camera2StreamConfigurationMap = i2 % 128;
                if (i2 % 2 != 0) {
                    throw new java.lang.ArithmeticException();
                }
                return;
            }
        }
        this.getHighResolutionOutputSizeshNQ4ISI = new byte[0];
        i = Camera2StreamConfigurationMap + 89;
        int i42 = i % 128;
        getHighSpeedVideoSizes = i42;
        i2 = (i42 & 51) + (i42 | 51);
        Camera2StreamConfigurationMap = i2 % 128;
        if (i2 % 2 != 0) {
        }
    }

    /* renamed from: ʿ, reason: contains not printable characters */
    public final byte[] m27308() {
        int i = getHighSpeedVideoSizes + 31;
        Camera2StreamConfigurationMap = i % 128;
        if (i % 2 != 0) {
            byte[] bArr = this.getHighResolutionOutputSizeshNQ4ISI;
            if (bArr == null || bArr.length == 0) {
                return new byte[0];
            }
            byte[] bArr2 = (byte[]) bArr.clone();
            int i2 = getHighSpeedVideoSizes;
            Camera2StreamConfigurationMap = (((i2 | 91) << 1) - (i2 ^ 91)) % 128;
            return bArr2;
        }
        throw null;
    }

    /* renamed from: ͺ, reason: contains not printable characters */
    public final void m27326(byte[] bArr) {
        int i;
        int i2 = getHighSpeedVideoSizes;
        int i3 = ((i2 | 59) << 1) - (i2 ^ 59);
        Camera2StreamConfigurationMap = i3 % 128;
        if (i3 % 2 != 0) {
            if (bArr == null || bArr.length == 0) {
                this.getHighSpeedVideoFpsRanges = new byte[0];
                i = (i2 & 35) + (i2 | 35);
            } else {
                this.getHighSpeedVideoFpsRanges = (byte[]) bArr.clone();
                i = getHighSpeedVideoSizes + 125;
            }
            int i4 = i % 128;
            Camera2StreamConfigurationMap = i4;
            getHighSpeedVideoSizes = (i4 + 125) % 128;
            return;
        }
        throw new java.lang.ArithmeticException();
    }

    /* renamed from: ˌ, reason: contains not printable characters */
    public final byte[] m27319() {
        int i = Camera2StreamConfigurationMap;
        int i2 = ((i | 41) << 1) - (i ^ 41);
        getHighSpeedVideoSizes = i2 % 128;
        if (i2 % 2 != 0) {
            throw null;
        }
        byte[] bArr = this.getHighSpeedVideoFpsRanges;
        if (bArr == null || bArr.length == 0) {
            byte[] bArr2 = new byte[0];
            getHighSpeedVideoSizes = (((i | 19) << 1) - (i ^ 19)) % 128;
            return bArr2;
        }
        byte[] bArr3 = (byte[]) bArr.clone();
        int i3 = getHighSpeedVideoSizes;
        Camera2StreamConfigurationMap = ((i3 & 91) + (i3 | 91)) % 128;
        return bArr3;
    }

    /* renamed from: ʼ, reason: contains not printable characters */
    public final void m27303(byte[] bArr) {
        int i = getHighSpeedVideoSizes;
        Camera2StreamConfigurationMap = ((i & 113) + (i | 113)) % 128;
        if (bArr != null) {
            Camera2StreamConfigurationMap = ((i ^ 1) + ((i & 1) << 1)) % 128;
            if (bArr.length != 0) {
                this.getHighSpeedVideoFpsRangesFor = (byte[]) bArr.clone();
                int i2 = getHighSpeedVideoSizes;
                Camera2StreamConfigurationMap = ((i2 & 67) + (i2 | 67)) % 128;
                return;
            }
        }
        this.getHighSpeedVideoFpsRangesFor = new byte[0];
        int i3 = Camera2StreamConfigurationMap;
        getHighSpeedVideoSizes = (((i3 | 41) << 1) - (i3 ^ 41)) % 128;
    }

    /* renamed from: ˉ, reason: contains not printable characters */
    public final byte[] m27311() {
        int i = getHighSpeedVideoSizes;
        int i2 = ((i & 19) + (i | 19)) % 128;
        Camera2StreamConfigurationMap = i2;
        byte[] bArr = this.getHighSpeedVideoFpsRangesFor;
        if (bArr != null) {
            getHighSpeedVideoSizes = (((i2 | 33) << 1) - (i2 ^ 33)) % 128;
            if (bArr.length != 0) {
                byte[] bArr2 = (byte[]) bArr.clone();
                int i3 = getHighSpeedVideoSizes + 11;
                Camera2StreamConfigurationMap = i3 % 128;
                if (i3 % 2 != 0) {
                    return bArr2;
                }
                throw new java.lang.ArithmeticException();
            }
        }
        byte[] bArr3 = new byte[0];
        int i4 = ((i2 | 115) << 1) - (i2 ^ 115);
        getHighSpeedVideoSizes = i4 % 128;
        if (i4 % 2 == 0) {
            return bArr3;
        }
        throw null;
    }

    /* renamed from: ι, reason: contains not printable characters */
    public final void m27334(byte[] bArr) {
        int i = Camera2StreamConfigurationMap + 125;
        getHighSpeedVideoSizes = i % 128;
        if (i % 2 == 0) {
            if (bArr == null || bArr.length == 0) {
                this.isOutputSupportedForhNQ4ISI = new byte[0];
            } else {
                this.isOutputSupportedForhNQ4ISI = (byte[]) bArr.clone();
                getHighSpeedVideoSizes = (Camera2StreamConfigurationMap + 3) % 128;
            }
            int i2 = Camera2StreamConfigurationMap;
            getHighSpeedVideoSizes = (((i2 | 13) << 1) - (i2 ^ 13)) % 128;
            return;
        }
        throw new java.lang.ArithmeticException();
    }

    /* renamed from: ʾ, reason: contains not printable characters */
    public final byte[] m27307() {
        int i = getHighSpeedVideoSizes;
        Camera2StreamConfigurationMap = (i + 107) % 128;
        byte[] bArr = this.isOutputSupportedForhNQ4ISI;
        if (bArr != null) {
            Camera2StreamConfigurationMap = ((i ^ 35) + ((i & 35) << 1)) % 128;
            if (bArr.length != 0) {
                byte[] bArr2 = (byte[]) bArr.clone();
                int i2 = getHighSpeedVideoSizes + 3;
                Camera2StreamConfigurationMap = i2 % 128;
                if (i2 % 2 != 0) {
                    return bArr2;
                }
                throw null;
            }
        }
        byte[] bArr3 = new byte[0];
        Camera2StreamConfigurationMap = (i + 17) % 128;
        return bArr3;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x003f A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0040  */
    /* renamed from: ʻ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m27301(byte[] bArr) {
        int i;
        int i2 = getHighSpeedVideoSizes;
        Camera2StreamConfigurationMap = (i2 + 87) % 128;
        if (bArr != null) {
            int i3 = i2 + 107;
            Camera2StreamConfigurationMap = i3 % 128;
            if (i3 % 2 != 0) {
                if (bArr.length != 0) {
                    this.getOutputStallDuration = (byte[]) bArr.clone();
                    i = getHighSpeedVideoSizes + 45;
                    Camera2StreamConfigurationMap = i % 128;
                    if (i % 2 != 0) {
                        throw null;
                    }
                    return;
                }
            } else {
                int length = bArr.length;
                throw null;
            }
        }
        this.getOutputStallDuration = new byte[0];
        Camera2StreamConfigurationMap = ((i2 ^ 111) + ((i2 & 111) << 1)) % 128;
        i = getHighSpeedVideoSizes + 45;
        Camera2StreamConfigurationMap = i % 128;
        if (i % 2 != 0) {
        }
    }

    /* renamed from: ˈ, reason: contains not printable characters */
    public final byte[] m27309() {
        int i = (getHighSpeedVideoSizes + 55) % 128;
        Camera2StreamConfigurationMap = i;
        byte[] bArr = this.getOutputStallDuration;
        if (bArr != null) {
            int i2 = i + 117;
            getHighSpeedVideoSizes = i2 % 128;
            if (i2 % 2 != 0) {
                int length = bArr.length;
                throw new java.lang.ArithmeticException();
            }
            if (bArr.length != 0) {
                byte[] bArr2 = (byte[]) bArr.clone();
                int i3 = getHighSpeedVideoSizes;
                int i4 = (i3 ^ 41) + ((i3 & 41) << 1);
                Camera2StreamConfigurationMap = i4 % 128;
                if (i4 % 2 != 0) {
                    return bArr2;
                }
                throw new java.lang.ArithmeticException();
            }
        }
        return new byte[0];
    }

    /* renamed from: ˉ, reason: contains not printable characters */
    public final void m27310(byte[] bArr) {
        int i = (Camera2StreamConfigurationMap + com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CALENDAR_VALUE) % 128;
        getHighSpeedVideoSizes = i;
        if (bArr != null) {
            int i2 = i + 109;
            Camera2StreamConfigurationMap = i2 % 128;
            if (i2 % 2 == 0) {
                int length = bArr.length;
                throw new java.lang.ArithmeticException();
            }
            if (bArr.length != 0) {
                this.getInputFormats = (byte[]) bArr.clone();
                Camera2StreamConfigurationMap = (getHighSpeedVideoSizes + 7) % 128;
                Camera2StreamConfigurationMap = (getHighSpeedVideoSizes + 31) % 128;
            }
        }
        this.getInputFormats = new byte[0];
        Camera2StreamConfigurationMap = (getHighSpeedVideoSizes + 31) % 128;
    }

    /* renamed from: ᐨ, reason: contains not printable characters */
    public final byte[] m27332() {
        int i = (getHighSpeedVideoSizes + 11) % 128;
        Camera2StreamConfigurationMap = i;
        byte[] bArr = this.getInputFormats;
        if (bArr != null) {
            getHighSpeedVideoSizes = ((i & 95) + (i | 95)) % 128;
            if (bArr.length != 0) {
                return (byte[]) bArr.clone();
            }
        }
        byte[] bArr2 = new byte[0];
        int i2 = getHighSpeedVideoSizes + 65;
        Camera2StreamConfigurationMap = i2 % 128;
        if (i2 % 2 != 0) {
            return bArr2;
        }
        throw new java.lang.ArithmeticException();
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0046 A[RETURN] */
    /* renamed from: ˌ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m27318(byte[] bArr) {
        int i;
        int i2 = Camera2StreamConfigurationMap;
        int i3 = (i2 & 99) + (i2 | 99);
        getHighSpeedVideoSizes = i3 % 128;
        if (i3 % 2 != 0) {
            throw new java.lang.ArithmeticException();
        }
        if (bArr != null) {
            getHighSpeedVideoSizes = (i2 + 29) % 128;
            if (bArr.length != 0) {
                this.getInputSizeshNQ4ISI = (byte[]) bArr.clone();
                int i4 = getHighSpeedVideoSizes;
                Camera2StreamConfigurationMap = (((i4 | 61) << 1) - (i4 ^ 61)) % 128;
                int i5 = Camera2StreamConfigurationMap;
                i = ((i5 | 97) << 1) - (i5 ^ 97);
                getHighSpeedVideoSizes = i % 128;
                if (i % 2 == 0) {
                    throw null;
                }
                return;
            }
        }
        this.getInputSizeshNQ4ISI = new byte[0];
        int i52 = Camera2StreamConfigurationMap;
        i = ((i52 | 97) << 1) - (i52 ^ 97);
        getHighSpeedVideoSizes = i % 128;
        if (i % 2 == 0) {
        }
    }

    /* renamed from: ᐧ, reason: contains not printable characters */
    public final byte[] m27331() {
        int i = getHighSpeedVideoSizes;
        int i2 = (i & 7) + (i | 7);
        int i3 = i2 % 128;
        Camera2StreamConfigurationMap = i3;
        if (i2 % 2 == 0) {
            throw new java.lang.ArithmeticException();
        }
        byte[] bArr = this.getInputSizeshNQ4ISI;
        if (bArr != null) {
            getHighSpeedVideoSizes = (((i3 | 59) << 1) - (i3 ^ 59)) % 128;
            if (bArr.length != 0) {
                return (byte[]) bArr.clone();
            }
        }
        byte[] bArr2 = new byte[0];
        getHighSpeedVideoSizes = ((i3 & 15) + (i3 | 15)) % 128;
        return bArr2;
    }
}
