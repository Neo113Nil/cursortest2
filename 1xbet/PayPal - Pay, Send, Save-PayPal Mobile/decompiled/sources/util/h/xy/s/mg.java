package util.h.xy.s;

/* loaded from: classes5.dex */
public final class mg extends util.h.xy.s.me {
    private static int getHighSpeedVideoFpsRanges = 0;
    private static int getHighSpeedVideoFpsRangesFor = 1;
    private byte[] Camera2StreamConfigurationMap;
    private byte[] getHighResolutionOutputSizeshNQ4ISI;
    private byte[] getHighSpeedVideoSizes;
    private byte[] getHighSpeedVideoSizesFor;
    private byte[] getInputFormats;
    private byte[] getInputSizeshNQ4ISI;
    private byte[] getOutputFormats;
    private byte[] getOutputMinFrameDuration;
    private byte[] getOutputMinFrameDurationlomOqCM;
    private byte[] getOutputSizes;
    private byte[] getOutputStallDuration;
    private byte[] getOutputStallDurationlomOqCM;

    /* renamed from: ˊ, reason: contains not printable characters */
    public final byte[] m27255() {
        getHighSpeedVideoFpsRangesFor = (getHighSpeedVideoFpsRanges + 107) % 128;
        byte[] bArr = (byte[]) this.getInputFormats.clone();
        int i = getHighSpeedVideoFpsRanges + 115;
        getHighSpeedVideoFpsRangesFor = i % 128;
        if (i % 2 != 0) {
            return bArr;
        }
        throw null;
    }

    /* renamed from: ˋ, reason: contains not printable characters */
    public final void m27256(byte[] bArr) {
        int i = getHighSpeedVideoFpsRangesFor;
        getHighSpeedVideoFpsRanges = ((i & 101) + (i | 101)) % 128;
        if (bArr != null) {
            getHighSpeedVideoFpsRanges = ((i ^ 45) + ((i & 45) << 1)) % 128;
            if (bArr.length != 0) {
                this.getInputFormats = (byte[]) bArr.clone();
                int i2 = getHighSpeedVideoFpsRanges;
                getHighSpeedVideoFpsRangesFor = ((i2 ^ 57) + ((i2 & 57) << 1)) % 128;
                int i3 = getHighSpeedVideoFpsRanges;
                getHighSpeedVideoFpsRangesFor = (((i3 | 113) << 1) - (i3 ^ 113)) % 128;
            }
        }
        this.getInputFormats = new byte[0];
        getHighSpeedVideoFpsRanges = ((i ^ 93) + ((i & 93) << 1)) % 128;
        int i32 = getHighSpeedVideoFpsRanges;
        getHighSpeedVideoFpsRangesFor = (((i32 | 113) << 1) - (i32 ^ 113)) % 128;
    }

    /* renamed from: ᐝ, reason: contains not printable characters */
    public final byte[] m27267() {
        int i = getHighSpeedVideoFpsRangesFor;
        int i2 = (i ^ 67) + ((i & 67) << 1);
        getHighSpeedVideoFpsRanges = i2 % 128;
        if (i2 % 2 != 0) {
            throw null;
        }
        byte[] bArr = (byte[]) this.getInputSizeshNQ4ISI.clone();
        int i3 = getHighSpeedVideoFpsRangesFor + 103;
        getHighSpeedVideoFpsRanges = i3 % 128;
        if (i3 % 2 == 0) {
            return bArr;
        }
        throw null;
    }

    /* renamed from: ˎ, reason: contains not printable characters */
    public final void m27260(byte[] bArr) {
        int i = getHighSpeedVideoFpsRangesFor;
        int i2 = ((i | 21) << 1) - (i ^ 21);
        getHighSpeedVideoFpsRanges = i2 % 128;
        if (i2 % 2 != 0) {
            throw null;
        }
        if (bArr == null || bArr.length == 0) {
            this.getInputSizeshNQ4ISI = new byte[0];
            getHighSpeedVideoFpsRanges = (((i | 19) << 1) - (i ^ 19)) % 128;
        } else {
            this.getInputSizeshNQ4ISI = (byte[]) bArr.clone();
            int i3 = getHighSpeedVideoFpsRangesFor;
            getHighSpeedVideoFpsRanges = (((i3 | 29) << 1) - (i3 ^ 29)) % 128;
        }
    }

    /* renamed from: ˎ, reason: contains not printable characters */
    public final byte[] m27261() {
        int i = getHighSpeedVideoFpsRangesFor;
        int i2 = ((i | 19) << 1) - (i ^ 19);
        getHighSpeedVideoFpsRanges = i2 % 128;
        int i3 = i2 % 2;
        byte[] bArr = (byte[]) this.getOutputStallDuration.clone();
        if (i3 == 0) {
            return bArr;
        }
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x003f A[RETURN] */
    /* renamed from: ᐝ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m27266(byte[] bArr) {
        int i;
        int i2 = getHighSpeedVideoFpsRanges;
        int i3 = (((i2 | 1) << 1) - (i2 ^ 1)) % 128;
        getHighSpeedVideoFpsRangesFor = i3;
        if (bArr != null) {
            getHighSpeedVideoFpsRanges = (i3 + 105) % 128;
            if (bArr.length != 0) {
                this.getOutputStallDuration = (byte[]) bArr.clone();
                int i4 = getHighSpeedVideoFpsRanges;
                i = (i4 ^ 77) + ((i4 & 77) << 1);
                getHighSpeedVideoFpsRangesFor = i % 128;
                if (i % 2 != 0) {
                    throw null;
                }
                return;
            }
        }
        this.getOutputStallDuration = new byte[0];
        getHighSpeedVideoFpsRangesFor = (getHighSpeedVideoFpsRanges + 67) % 128;
        int i42 = getHighSpeedVideoFpsRanges;
        i = (i42 ^ 77) + ((i42 & 77) << 1);
        getHighSpeedVideoFpsRangesFor = i % 128;
        if (i % 2 != 0) {
        }
    }

    /* renamed from: ˏ, reason: contains not printable characters */
    public final byte[] m27263() {
        int i = getHighSpeedVideoFpsRangesFor;
        getHighSpeedVideoFpsRanges = (((i | 21) << 1) - (i ^ 21)) % 128;
        byte[] bArr = (byte[]) this.getOutputMinFrameDurationlomOqCM.clone();
        int i2 = getHighSpeedVideoFpsRangesFor;
        int i3 = (i2 ^ 3) + ((i2 & 3) << 1);
        getHighSpeedVideoFpsRanges = i3 % 128;
        if (i3 % 2 == 0) {
            return bArr;
        }
        throw null;
    }

    /* renamed from: ˏ, reason: contains not printable characters */
    public final void m27262(byte[] bArr) {
        int i = getHighSpeedVideoFpsRangesFor;
        int i2 = ((i & 125) + (i | 125)) % 128;
        getHighSpeedVideoFpsRanges = i2;
        if (bArr != null) {
            getHighSpeedVideoFpsRangesFor = (i2 + 17) % 128;
            if (bArr.length != 0) {
                this.getOutputMinFrameDurationlomOqCM = (byte[]) bArr.clone();
                getHighSpeedVideoFpsRanges = (getHighSpeedVideoFpsRangesFor + 39) % 128;
                return;
            }
        }
        this.getOutputMinFrameDurationlomOqCM = new byte[0];
        getHighSpeedVideoFpsRangesFor = ((i2 ^ 65) + ((i2 & 65) << 1)) % 128;
    }

    /* renamed from: ˋ, reason: contains not printable characters */
    public final byte[] m27257() {
        int i = getHighSpeedVideoFpsRangesFor + 99;
        getHighSpeedVideoFpsRanges = i % 128;
        byte[] bArr = this.getOutputMinFrameDuration;
        if (i % 2 == 0) {
            return (byte[]) bArr.clone();
        }
        throw null;
    }

    /* renamed from: ˊ, reason: contains not printable characters */
    public final void m27254(byte[] bArr) {
        int i = getHighSpeedVideoFpsRangesFor;
        getHighSpeedVideoFpsRanges = ((i & 115) + (i | 115)) % 128;
        if (bArr != null) {
            getHighSpeedVideoFpsRanges = (((i | 97) << 1) - (i ^ 97)) % 128;
            if (bArr.length != 0) {
                this.getOutputMinFrameDuration = (byte[]) bArr.clone();
                int i2 = getHighSpeedVideoFpsRanges;
                getHighSpeedVideoFpsRangesFor = (((i2 | 3) << 1) - (i2 ^ 3)) % 128;
                return;
            }
        }
        this.getOutputMinFrameDuration = new byte[0];
    }

    /* renamed from: ι, reason: contains not printable characters */
    public final byte[] m27269() {
        int i = getHighSpeedVideoFpsRangesFor;
        getHighSpeedVideoFpsRanges = ((i & 119) + (i | 119)) % 128;
        byte[] bArr = (byte[]) this.getHighResolutionOutputSizeshNQ4ISI.clone();
        getHighSpeedVideoFpsRangesFor = (getHighSpeedVideoFpsRanges + 45) % 128;
        return bArr;
    }

    /* renamed from: ͺ, reason: contains not printable characters */
    public final void m27264(byte[] bArr) {
        int i = getHighSpeedVideoFpsRanges;
        int i2 = ((i & 71) + (i | 71)) % 128;
        getHighSpeedVideoFpsRangesFor = i2;
        if (bArr != null) {
            int i3 = i2 + 75;
            getHighSpeedVideoFpsRanges = i3 % 128;
            if (i3 % 2 != 0) {
                int length = bArr.length;
                throw null;
            }
            if (bArr.length != 0) {
                this.getHighResolutionOutputSizeshNQ4ISI = (byte[]) bArr.clone();
                getHighSpeedVideoFpsRanges = (getHighSpeedVideoFpsRangesFor + 99) % 128;
                return;
            }
        }
        this.getHighResolutionOutputSizeshNQ4ISI = new byte[0];
    }

    /* renamed from: ͺ, reason: contains not printable characters */
    public final byte[] m27265() {
        int i = getHighSpeedVideoFpsRangesFor;
        getHighSpeedVideoFpsRanges = ((i ^ 27) + ((i & 27) << 1)) % 128;
        byte[] bArr = (byte[]) this.getOutputStallDurationlomOqCM.clone();
        int i2 = getHighSpeedVideoFpsRanges;
        getHighSpeedVideoFpsRangesFor = ((i2 ^ 37) + ((i2 & 37) << 1)) % 128;
        return bArr;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x004b A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:12:0x004c  */
    /* renamed from: ι, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m27268(byte[] bArr) {
        int i;
        int i2 = getHighSpeedVideoFpsRangesFor;
        getHighSpeedVideoFpsRanges = (i2 + com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CALENDAR_VALUE) % 128;
        if (bArr != null) {
            int i3 = (i2 ^ 111) + ((i2 & 111) << 1);
            getHighSpeedVideoFpsRanges = i3 % 128;
            if (i3 % 2 != 0) {
                int length = bArr.length;
                throw null;
            }
            if (bArr.length != 0) {
                this.getOutputStallDurationlomOqCM = (byte[]) bArr.clone();
                int i4 = getHighSpeedVideoFpsRanges;
                getHighSpeedVideoFpsRangesFor = ((i4 ^ 121) + ((i4 & 121) << 1)) % 128;
                int i5 = getHighSpeedVideoFpsRanges;
                i = ((i5 | 45) << 1) - (i5 ^ 45);
                getHighSpeedVideoFpsRangesFor = i % 128;
                if (i % 2 != 0) {
                    throw null;
                }
                return;
            }
        }
        this.getOutputStallDurationlomOqCM = new byte[0];
        int i52 = getHighSpeedVideoFpsRanges;
        i = ((i52 | 45) << 1) - (i52 ^ 45);
        getHighSpeedVideoFpsRangesFor = i % 128;
        if (i % 2 != 0) {
        }
    }

    /* renamed from: ʽ, reason: contains not printable characters */
    public final byte[] m27251() {
        int i = getHighSpeedVideoFpsRangesFor;
        getHighSpeedVideoFpsRanges = (((i | 107) << 1) - (i ^ 107)) % 128;
        byte[] bArr = (byte[]) this.getOutputSizes.clone();
        int i2 = getHighSpeedVideoFpsRangesFor;
        int i3 = (i2 & 65) + (i2 | 65);
        getHighSpeedVideoFpsRanges = i3 % 128;
        if (i3 % 2 == 0) {
            return bArr;
        }
        throw new java.lang.ArithmeticException();
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0055 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0056  */
    /* renamed from: ʻ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m27246(byte[] bArr) {
        int i;
        int i2 = getHighSpeedVideoFpsRanges;
        int i3 = (i2 & 107) + (i2 | 107);
        getHighSpeedVideoFpsRangesFor = i3 % 128;
        if (i3 % 2 == 0) {
            throw null;
        }
        if (bArr != null) {
            int i4 = ((i2 | 45) << 1) - (i2 ^ 45);
            getHighSpeedVideoFpsRangesFor = i4 % 128;
            if (i4 % 2 != 0) {
                if (bArr.length != 0) {
                    this.getOutputSizes = (byte[]) bArr.clone();
                    int i5 = getHighSpeedVideoFpsRanges;
                    i = ((i5 | 103) << 1) - (i5 ^ 103);
                    getHighSpeedVideoFpsRangesFor = i % 128;
                    if (i % 2 != 0) {
                        throw null;
                    }
                    return;
                }
            } else {
                int length = bArr.length;
                throw new java.lang.ArithmeticException();
            }
        }
        this.getOutputSizes = new byte[0];
        getHighSpeedVideoFpsRangesFor = ((i2 ^ 103) + ((i2 & 103) << 1)) % 128;
        int i52 = getHighSpeedVideoFpsRanges;
        i = ((i52 | 103) << 1) - (i52 ^ 103);
        getHighSpeedVideoFpsRangesFor = i % 128;
        if (i % 2 != 0) {
        }
    }

    /* renamed from: ʻ, reason: contains not printable characters */
    public final byte[] m27247() {
        int i = getHighSpeedVideoFpsRangesFor + 119;
        getHighSpeedVideoFpsRanges = i % 128;
        if (i % 2 != 0) {
            throw null;
        }
        byte[] bArr = (byte[]) this.getHighSpeedVideoSizes.clone();
        int i2 = getHighSpeedVideoFpsRangesFor;
        getHighSpeedVideoFpsRanges = (((i2 | 79) << 1) - (i2 ^ 79)) % 128;
        return bArr;
    }

    /* renamed from: ʽ, reason: contains not printable characters */
    public final void m27250(byte[] bArr) {
        int i = getHighSpeedVideoFpsRangesFor;
        int i2 = ((i | 93) << 1) - (i ^ 93);
        getHighSpeedVideoFpsRanges = i2 % 128;
        if (i2 % 2 == 0) {
            if (bArr == null || bArr.length == 0) {
                this.getHighSpeedVideoSizes = new byte[0];
            } else {
                this.getHighSpeedVideoSizes = (byte[]) bArr.clone();
                getHighSpeedVideoFpsRanges = (getHighSpeedVideoFpsRangesFor + 39) % 128;
            }
            int i3 = getHighSpeedVideoFpsRanges;
            getHighSpeedVideoFpsRangesFor = ((i3 ^ 121) + ((i3 & 121) << 1)) % 128;
            return;
        }
        throw null;
    }

    /* renamed from: ʼ, reason: contains not printable characters */
    public final byte[] m27249() {
        int i = getHighSpeedVideoFpsRanges;
        int i2 = ((i | 1) << 1) - (i ^ 1);
        getHighSpeedVideoFpsRangesFor = i2 % 128;
        int i3 = i2 % 2;
        byte[] bArr = (byte[]) this.Camera2StreamConfigurationMap.clone();
        if (i3 == 0) {
            throw new java.lang.ArithmeticException();
        }
        int i4 = getHighSpeedVideoFpsRanges + 75;
        getHighSpeedVideoFpsRangesFor = i4 % 128;
        if (i4 % 2 != 0) {
            return bArr;
        }
        throw null;
    }

    /* renamed from: ʼ, reason: contains not printable characters */
    public final void m27248(byte[] bArr) {
        getHighSpeedVideoFpsRangesFor = (getHighSpeedVideoFpsRanges + 51) % 128;
        if (bArr == null || bArr.length == 0) {
            this.Camera2StreamConfigurationMap = new byte[0];
        } else {
            this.Camera2StreamConfigurationMap = (byte[]) bArr.clone();
            getHighSpeedVideoFpsRangesFor = (getHighSpeedVideoFpsRanges + 13) % 128;
        }
        int i = getHighSpeedVideoFpsRangesFor;
        getHighSpeedVideoFpsRanges = ((i & 107) + (i | 107)) % 128;
    }

    /* renamed from: ʾ, reason: contains not printable characters */
    public final byte[] m27252() {
        int i = getHighSpeedVideoFpsRanges;
        int i2 = ((i | 119) << 1) - (i ^ 119);
        getHighSpeedVideoFpsRangesFor = i2 % 128;
        int i3 = i2 % 2;
        byte[] bArr = (byte[]) this.getHighSpeedVideoSizesFor.clone();
        if (i3 != 0) {
            return bArr;
        }
        throw null;
    }

    /* renamed from: ˉ, reason: contains not printable characters */
    public final void m27253(byte[] bArr) {
        int i = getHighSpeedVideoFpsRanges;
        int i2 = ((i & 73) + (i | 73)) % 128;
        getHighSpeedVideoFpsRangesFor = i2;
        if (bArr != null) {
            int i3 = i2 + 11;
            getHighSpeedVideoFpsRanges = i3 % 128;
            if (i3 % 2 == 0) {
                if (bArr.length != 0) {
                    this.getHighSpeedVideoSizesFor = (byte[]) bArr.clone();
                    int i4 = getHighSpeedVideoFpsRangesFor;
                    getHighSpeedVideoFpsRanges = (((i4 | 115) << 1) - (i4 ^ 115)) % 128;
                }
            } else {
                int length = bArr.length;
                throw new java.lang.ArithmeticException();
            }
        }
        this.getHighSpeedVideoSizesFor = new byte[0];
        getHighSpeedVideoFpsRanges = ((i2 ^ 41) + ((i2 & 41) << 1)) % 128;
        int i42 = getHighSpeedVideoFpsRangesFor;
        getHighSpeedVideoFpsRanges = (((i42 | 115) << 1) - (i42 ^ 115)) % 128;
    }

    /* renamed from: ˌ, reason: contains not printable characters */
    public final byte[] m27259() {
        int i = getHighSpeedVideoFpsRanges;
        getHighSpeedVideoFpsRangesFor = (((i | 125) << 1) - (i ^ 125)) % 128;
        byte[] bArr = (byte[]) this.getOutputFormats.clone();
        getHighSpeedVideoFpsRanges = (getHighSpeedVideoFpsRangesFor + 87) % 128;
        return bArr;
    }

    /* renamed from: ˌ, reason: contains not printable characters */
    public final void m27258(byte[] bArr) {
        int i = getHighSpeedVideoFpsRanges;
        int i2 = (i & 113) + (i | 113);
        getHighSpeedVideoFpsRangesFor = i2 % 128;
        if (i2 % 2 == 0) {
            throw null;
        }
        if (bArr == null || bArr.length == 0) {
            this.getOutputFormats = new byte[0];
            getHighSpeedVideoFpsRangesFor = (((i | 53) << 1) - (i ^ 53)) % 128;
        } else {
            this.getOutputFormats = (byte[]) bArr.clone();
            int i3 = getHighSpeedVideoFpsRanges;
            getHighSpeedVideoFpsRangesFor = ((i3 ^ 39) + ((i3 & 39) << 1)) % 128;
        }
        int i4 = getHighSpeedVideoFpsRanges;
        int i5 = (i4 ^ 89) + ((i4 & 89) << 1);
        getHighSpeedVideoFpsRangesFor = i5 % 128;
        if (i5 % 2 == 0) {
            throw new java.lang.ArithmeticException();
        }
    }
}
