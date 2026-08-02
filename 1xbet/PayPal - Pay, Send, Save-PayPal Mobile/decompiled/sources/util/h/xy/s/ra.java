package util.h.xy.s;

/* loaded from: classes5.dex */
public class ra {
    private static int getHighResolutionOutputSizeshNQ4ISI = 1;
    private static int getHighSpeedVideoFpsRanges;
    private int getHighSpeedVideoFpsRangesFor;

    /* renamed from: ʻ, reason: contains not printable characters */
    public byte[] f2399;

    /* renamed from: ʼ, reason: contains not printable characters */
    public byte[] f2400;

    /* renamed from: ʽ, reason: contains not printable characters */
    public byte[] f2401;

    /* renamed from: ʾ, reason: contains not printable characters */
    public util.h.xy.s.f[] f2402;

    /* renamed from: ˈ, reason: contains not printable characters */
    public byte[] f2403;

    /* renamed from: ˉ, reason: contains not printable characters */
    public byte[] f2404;

    /* renamed from: ˊ, reason: contains not printable characters */
    public byte[] f2405;

    /* renamed from: ˋ, reason: contains not printable characters */
    public byte[] f2406;

    /* renamed from: ˌ, reason: contains not printable characters */
    public byte[] f2407;

    /* renamed from: ˎ, reason: contains not printable characters */
    public byte[] f2408;

    /* renamed from: ˏ, reason: contains not printable characters */
    public byte[] f2409;

    /* renamed from: ͺ, reason: contains not printable characters */
    public byte[] f2410;

    /* renamed from: ᐝ, reason: contains not printable characters */
    public byte[] f2411;

    /* renamed from: ι, reason: contains not printable characters */
    public byte[] f2412;

    static {
        int i = getHighSpeedVideoFpsRanges;
        getHighResolutionOutputSizeshNQ4ISI = ((i & 21) + (i | 21)) % 128;
    }

    /* renamed from: ˎ, reason: contains not printable characters */
    public void m27277(byte[] bArr) {
        int i = (getHighResolutionOutputSizeshNQ4ISI + 83) % 128;
        getHighSpeedVideoFpsRanges = i;
        if (bArr != null) {
            int i2 = i + 49;
            getHighResolutionOutputSizeshNQ4ISI = i2 % 128;
            if (i2 % 2 != 0) {
                if (bArr.length != 0) {
                    this.f2406 = (byte[]) bArr.clone();
                    int i3 = this.getHighSpeedVideoFpsRangesFor;
                    int identityHashCode = java.lang.System.identityHashCode(this);
                    int i4 = i3 * 367;
                    int i5 = (i4 ^ 367) + ((i4 & 367) << 1);
                    int i6 = -(-(((i3 ^ 1) | (i3 & 1)) * (-366)));
                    int i7 = (i5 ^ i6) + ((i6 & i5) << 1);
                    int i8 = ~i3;
                    int i9 = ((~((i8 ^ identityHashCode) | (i8 & identityHashCode))) | 1) * (-366);
                    int i10 = (i7 & i9) + (i9 | i7);
                    int i11 = ~((i3 ^ (-2)) | (i3 & (-2)));
                    int i12 = i8 | 1;
                    int i13 = ~((identityHashCode ^ i12) | (identityHashCode & i12));
                    int i14 = -(-(((i11 ^ i13) | (i11 & i13)) * 366));
                    this.getHighSpeedVideoFpsRangesFor = ((i10 | i14) << 1) - (i14 ^ i10);
                    getHighResolutionOutputSizeshNQ4ISI = (getHighSpeedVideoFpsRanges + 113) % 128;
                }
            } else {
                int length = bArr.length;
                throw null;
            }
        }
        this.f2406 = new byte[0];
        int i15 = getHighResolutionOutputSizeshNQ4ISI;
        getHighSpeedVideoFpsRanges = ((i15 ^ 117) + ((i15 & 117) << 1)) % 128;
        getHighResolutionOutputSizeshNQ4ISI = (getHighSpeedVideoFpsRanges + 113) % 128;
    }

    /* renamed from: ˏ, reason: contains not printable characters */
    public void m27279(byte[] bArr) {
        int i = getHighResolutionOutputSizeshNQ4ISI;
        int i2 = ((i & 105) + (i | 105)) % 128;
        getHighSpeedVideoFpsRanges = i2;
        if (bArr != null) {
            getHighResolutionOutputSizeshNQ4ISI = ((i2 & 121) + (i2 | 121)) % 128;
            if (bArr.length != 0) {
                this.f2409 = (byte[]) bArr.clone();
                int i3 = this.getHighSpeedVideoFpsRangesFor;
                this.getHighSpeedVideoFpsRangesFor = (i3 ^ 1) + ((i3 & 1) << 1);
                int i4 = getHighSpeedVideoFpsRanges;
                getHighResolutionOutputSizeshNQ4ISI = ((i4 ^ 89) + ((i4 & 89) << 1)) % 128;
            }
        }
        this.f2409 = new byte[0];
        int i42 = getHighSpeedVideoFpsRanges;
        getHighResolutionOutputSizeshNQ4ISI = ((i42 ^ 89) + ((i42 & 89) << 1)) % 128;
    }

    /* renamed from: ˊ, reason: contains not printable characters */
    public void m27273(byte[] bArr) {
        int i = getHighSpeedVideoFpsRanges;
        int i2 = (i & 47) + (i | 47);
        getHighResolutionOutputSizeshNQ4ISI = i2 % 128;
        if (i2 % 2 == 0) {
            throw null;
        }
        if (bArr != null) {
            int i3 = ((i | 19) << 1) - (i ^ 19);
            getHighResolutionOutputSizeshNQ4ISI = i3 % 128;
            if (i3 % 2 != 0) {
                if (bArr.length != 0) {
                    this.f2408 = (byte[]) bArr.clone();
                    this.getHighSpeedVideoFpsRangesFor++;
                    int i4 = getHighResolutionOutputSizeshNQ4ISI;
                    getHighSpeedVideoFpsRanges = ((i4 ^ 13) + ((i4 & 13) << 1)) % 128;
                }
            } else {
                int length = bArr.length;
                throw null;
            }
        }
        this.f2408 = new byte[0];
        getHighSpeedVideoFpsRanges = (getHighResolutionOutputSizeshNQ4ISI + 11) % 128;
        int i42 = getHighResolutionOutputSizeshNQ4ISI;
        getHighSpeedVideoFpsRanges = ((i42 ^ 13) + ((i42 & 13) << 1)) % 128;
    }

    /* renamed from: ᐝ, reason: contains not printable characters */
    public void m27283(byte[] bArr) {
        int i = getHighSpeedVideoFpsRanges;
        int i2 = ((i | 103) << 1) - (i ^ 103);
        getHighResolutionOutputSizeshNQ4ISI = i2 % 128;
        if (i2 % 2 == 0) {
            throw new java.lang.ArithmeticException();
        }
        if (bArr != null) {
            getHighResolutionOutputSizeshNQ4ISI = (i + 93) % 128;
            util.h.xy.ar.b.m25074(bArr);
            int i3 = getHighResolutionOutputSizeshNQ4ISI;
            getHighSpeedVideoFpsRanges = ((i3 & 41) + (i3 | 41)) % 128;
        }
        if (bArr != null) {
            int i4 = getHighResolutionOutputSizeshNQ4ISI;
            getHighSpeedVideoFpsRanges = (((i4 | 81) << 1) - (i4 ^ 81)) % 128;
            if (bArr.length != 0) {
                this.f2405 = (byte[]) bArr.clone();
                this.getHighSpeedVideoFpsRangesFor++;
                return;
            }
        }
        this.f2405 = new byte[0];
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0088 A[RETURN] */
    /* renamed from: ˋ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void m27275(byte[] bArr) {
        int i;
        int i2 = getHighResolutionOutputSizeshNQ4ISI;
        getHighSpeedVideoFpsRanges = (i2 + 85) % 128;
        if (bArr != null) {
            getHighSpeedVideoFpsRanges = ((i2 ^ 5) + ((i2 & 5) << 1)) % 128;
            if (bArr.length != 0) {
                this.f2411 = (byte[]) bArr.clone();
                int i3 = this.getHighSpeedVideoFpsRangesFor;
                int identityHashCode = java.lang.System.identityHashCode(this);
                int i4 = -(-(i3 * 46));
                int i5 = ((i4 | 46) << 1) - (i4 ^ 46);
                int i6 = ~i3;
                int i7 = ~identityHashCode;
                int i8 = ((~(i7 | i6)) | 1) * (-90);
                int i9 = ~(i6 | identityHashCode);
                int i10 = ~(i3 | 1);
                int i11 = (((i5 & i8) + (i5 | i8)) - (~(((i10 ^ i9) | (i10 & i9)) * (-45)))) - 1;
                int i12 = (~((identityHashCode & (-2)) | (identityHashCode ^ (-2)))) | i6;
                int i13 = ~(i7 | 1);
                int i14 = -(-(((i12 ^ i13) | (i12 & i13)) * 45));
                this.getHighSpeedVideoFpsRangesFor = ((i11 | i14) << 1) - (i14 ^ i11);
                int i15 = getHighSpeedVideoFpsRanges;
                i = (i15 & 109) + (i15 | 109);
                getHighResolutionOutputSizeshNQ4ISI = i % 128;
                if (i % 2 != 0) {
                    throw null;
                }
                return;
            }
        }
        this.f2411 = new byte[0];
        getHighSpeedVideoFpsRanges = ((i2 ^ 103) + ((i2 & 103) << 1)) % 128;
        int i152 = getHighSpeedVideoFpsRanges;
        i = (i152 & 109) + (i152 | 109);
        getHighResolutionOutputSizeshNQ4ISI = i % 128;
        if (i % 2 != 0) {
        }
    }

    /* renamed from: ʻ, reason: contains not printable characters */
    public void m27270(byte[] bArr) {
        int i = (getHighSpeedVideoFpsRanges + 57) % 128;
        getHighResolutionOutputSizeshNQ4ISI = i;
        if (this.f2411 != null) {
            getHighSpeedVideoFpsRanges = (i + 35) % 128;
            if (bArr.length != 0) {
                this.f2401 = (byte[]) bArr.clone();
                int i2 = this.getHighSpeedVideoFpsRangesFor;
                int identityHashCode = java.lang.System.identityHashCode(this);
                int i3 = 318 - (~(-(-(i2 * (-317)))));
                int i4 = ~i2;
                int i5 = ~(identityHashCode | (-2));
                int i6 = -(-(((i5 ^ i4) | (i4 & i5)) * (-318)));
                int i7 = (i3 ^ i6) + ((i3 & i6) << 1);
                int i8 = ~((i4 ^ identityHashCode) | (i4 & identityHashCode));
                int i9 = ~identityHashCode;
                int i10 = (i9 & 1) | (i9 ^ 1);
                int i11 = ~((i10 ^ i2) | (i10 & i2));
                int i12 = ((i8 ^ i11) | (i8 & i11)) * 318;
                int i13 = ~((i4 ^ i9) | (i4 & i9) | 1);
                int i14 = ~((i2 ^ 1) | (i2 & 1) | identityHashCode);
                this.getHighSpeedVideoFpsRangesFor = (i7 & i12) + (i12 | i7) + (((i14 ^ i13) | (i14 & i13)) * 318);
                getHighResolutionOutputSizeshNQ4ISI = (getHighSpeedVideoFpsRanges + 53) % 128;
            }
        }
        this.f2401 = new byte[0];
        getHighSpeedVideoFpsRanges = (((i | 51) << 1) - (i ^ 51)) % 128;
        getHighResolutionOutputSizeshNQ4ISI = (getHighSpeedVideoFpsRanges + 53) % 128;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x00a0 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:12:0x00a1  */
    /* renamed from: ʽ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void m27272(byte[] bArr) {
        int i;
        int i2 = getHighResolutionOutputSizeshNQ4ISI;
        int i3 = ((i2 & 103) + (i2 | 103)) % 128;
        getHighSpeedVideoFpsRanges = i3;
        if (bArr != null) {
            int i4 = ((i3 | 79) << 1) - (i3 ^ 79);
            getHighResolutionOutputSizeshNQ4ISI = i4 % 128;
            if (i4 % 2 == 0) {
                int length = bArr.length;
                throw new java.lang.ArithmeticException();
            }
            if (bArr.length != 0) {
                this.f2412 = (byte[]) bArr.clone();
                int i5 = this.getHighSpeedVideoFpsRangesFor;
                int identityHashCode = java.lang.System.identityHashCode(this);
                int i6 = ~i5;
                int i7 = ~identityHashCode;
                int i8 = ~((i6 ^ i7) | (i6 & i7));
                int i9 = (i8 ^ (-2)) | (i8 & (-2));
                int i10 = ~(i5 | identityHashCode);
                int i11 = (((i5 * 565) - 563) - (~(((i9 ^ i10) | (i9 & i10)) * (-564)))) - 1;
                int i12 = (i5 ^ (-2)) | (i5 & (-2));
                int i13 = (~((identityHashCode ^ i12) | (i12 & identityHashCode))) * 1128;
                int i14 = (i11 & i13) + (i13 | i11);
                int i15 = ~((i7 & (-2)) | (i7 ^ (-2)));
                int i16 = ~((i5 ^ 1) | (i5 & 1));
                int i17 = ((i16 ^ i15) | (i16 & i15)) * 564;
                this.getHighSpeedVideoFpsRangesFor = ((i14 | i17) << 1) - (i17 ^ i14);
                int i18 = getHighResolutionOutputSizeshNQ4ISI;
                getHighSpeedVideoFpsRanges = ((i18 ^ 13) + ((i18 & 13) << 1)) % 128;
                i = getHighResolutionOutputSizeshNQ4ISI + 49;
                getHighSpeedVideoFpsRanges = i % 128;
                if (i % 2 == 0) {
                    throw new java.lang.ArithmeticException();
                }
                return;
            }
        }
        this.f2412 = new byte[0];
        getHighResolutionOutputSizeshNQ4ISI = (i3 + 117) % 128;
        i = getHighResolutionOutputSizeshNQ4ISI + 49;
        getHighSpeedVideoFpsRanges = i % 128;
        if (i % 2 == 0) {
        }
    }

    /* renamed from: ˏ, reason: contains not printable characters */
    public void m27280(util.h.xy.s.f[] fVarArr) {
        int i = getHighSpeedVideoFpsRanges + 33;
        int i2 = i % 128;
        getHighResolutionOutputSizeshNQ4ISI = i2;
        if (i % 2 == 0) {
            throw new java.lang.ArithmeticException();
        }
        if (fVarArr != null) {
            int i3 = (i2 ^ 51) + ((i2 & 51) << 1);
            getHighSpeedVideoFpsRanges = i3 % 128;
            if (i3 % 2 != 0) {
                int length = fVarArr.length;
                throw new java.lang.ArithmeticException();
            }
            if (fVarArr.length > 0) {
                util.h.xy.ar.b.m25074(fVarArr[0].m27210());
                int i4 = getHighResolutionOutputSizeshNQ4ISI;
                getHighSpeedVideoFpsRanges = (((i4 | 5) << 1) - (i4 ^ 5)) % 128;
            }
        }
        if (fVarArr != null) {
            int i5 = getHighResolutionOutputSizeshNQ4ISI;
            getHighSpeedVideoFpsRanges = (((i5 | 57) << 1) - (i5 ^ 57)) % 128;
            if (fVarArr.length != 0) {
                this.f2402 = (util.h.xy.s.f[]) fVarArr.clone();
                int i6 = this.getHighSpeedVideoFpsRangesFor;
                this.getHighSpeedVideoFpsRangesFor = ((i6 | 1) << 1) - (i6 ^ 1);
                int i7 = getHighResolutionOutputSizeshNQ4ISI;
                getHighSpeedVideoFpsRanges = (((i7 | 125) << 1) - (i7 ^ 125)) % 128;
            }
        }
        this.f2402 = null;
        getHighResolutionOutputSizeshNQ4ISI = (getHighSpeedVideoFpsRanges + 97) % 128;
        int i72 = getHighResolutionOutputSizeshNQ4ISI;
        getHighSpeedVideoFpsRanges = (((i72 | 125) << 1) - (i72 ^ 125)) % 128;
    }

    /* renamed from: ι, reason: contains not printable characters */
    public void m27285(byte[] bArr) {
        int i = getHighSpeedVideoFpsRanges;
        int i2 = (i ^ 103) + ((i & 103) << 1);
        int i3 = i2 % 128;
        getHighResolutionOutputSizeshNQ4ISI = i3;
        if (i2 % 2 == 0) {
            throw new java.lang.ArithmeticException();
        }
        if (bArr != null) {
            getHighSpeedVideoFpsRanges = (i3 + 33) % 128;
            if (bArr.length != 0) {
                this.f2407 = (byte[]) bArr.clone();
                int i4 = this.getHighSpeedVideoFpsRangesFor;
                int identityHashCode = java.lang.System.identityHashCode(this);
                int i5 = -(-(i4 * (-159)));
                int i6 = (((i5 & (-159)) + (i5 | (-159))) - (~((i4 | (-2)) * 160))) - 1;
                int i7 = ~identityHashCode;
                int i8 = ~(i7 | 1);
                int i9 = ~((i4 ^ 1) | (i4 & 1));
                int i10 = ((i8 ^ i9) | (i8 & i9)) * (-160);
                int i11 = ~i4;
                int i12 = ~((i11 ^ i7) | (i11 & i7));
                this.getHighSpeedVideoFpsRangesFor = (((i6 | i10) << 1) - (i10 ^ i6)) + (((i12 ^ 1) | (i12 & 1)) * 160);
                getHighResolutionOutputSizeshNQ4ISI = (getHighSpeedVideoFpsRanges + 33) % 128;
                getHighSpeedVideoFpsRanges = (getHighResolutionOutputSizeshNQ4ISI + 117) % 128;
            }
        }
        this.f2407 = new byte[0];
        getHighSpeedVideoFpsRanges = (getHighResolutionOutputSizeshNQ4ISI + 117) % 128;
    }

    /* renamed from: ᐝ, reason: contains not printable characters */
    public byte[] m27284() {
        byte[] bArr;
        int i = getHighSpeedVideoFpsRanges;
        int i2 = i + 71;
        getHighResolutionOutputSizeshNQ4ISI = i2 % 128;
        if (i2 % 2 == 0) {
            throw null;
        }
        byte[] bArr2 = this.f2406;
        if (bArr2 != null) {
            bArr = (byte[]) bArr2.clone();
            int i3 = getHighResolutionOutputSizeshNQ4ISI;
            getHighSpeedVideoFpsRanges = ((i3 & 115) + (i3 | 115)) % 128;
        } else {
            getHighResolutionOutputSizeshNQ4ISI = ((i ^ 53) + ((i & 53) << 1)) % 128;
            bArr = null;
        }
        int i4 = getHighResolutionOutputSizeshNQ4ISI;
        int i5 = (i4 & 79) + (i4 | 79);
        getHighSpeedVideoFpsRanges = i5 % 128;
        if (i5 % 2 == 0) {
            return bArr;
        }
        throw null;
    }

    /* renamed from: ˋ, reason: contains not printable characters */
    public byte[] m27276() {
        int i = getHighResolutionOutputSizeshNQ4ISI;
        int i2 = (((i | 125) << 1) - (i ^ 125)) % 128;
        getHighSpeedVideoFpsRanges = i2;
        byte[] bArr = this.f2409;
        if (bArr == null) {
            getHighSpeedVideoFpsRanges = (i + 35) % 128;
            return null;
        }
        int i3 = ((i2 | 101) << 1) - (i2 ^ 101);
        getHighResolutionOutputSizeshNQ4ISI = i3 % 128;
        byte[] bArr2 = (byte[]) bArr.clone();
        if (i3 % 2 != 0) {
            return bArr2;
        }
        throw new java.lang.ArithmeticException();
    }

    /* renamed from: ˎ, reason: contains not printable characters */
    public byte[] m27278() {
        int i = getHighResolutionOutputSizeshNQ4ISI + 57;
        int i2 = i % 128;
        getHighSpeedVideoFpsRanges = i2;
        if (i % 2 != 0) {
            throw null;
        }
        byte[] bArr = this.f2408;
        if (bArr == null) {
            getHighResolutionOutputSizeshNQ4ISI = (i2 + 69) % 128;
            return null;
        }
        byte[] bArr2 = (byte[]) bArr.clone();
        getHighSpeedVideoFpsRanges = (getHighResolutionOutputSizeshNQ4ISI + 21) % 128;
        return bArr2;
    }

    /* renamed from: ˏ, reason: contains not printable characters */
    public byte[] m27281() {
        int i = getHighSpeedVideoFpsRanges + 115;
        getHighResolutionOutputSizeshNQ4ISI = i % 128;
        byte[] bArr = null;
        if (i % 2 == 0) {
            throw null;
        }
        byte[] bArr2 = this.f2405;
        if (bArr2 != null) {
            bArr = (byte[]) bArr2.clone();
            int i2 = getHighResolutionOutputSizeshNQ4ISI;
            getHighSpeedVideoFpsRanges = ((i2 & 95) + (i2 | 95)) % 128;
        }
        getHighResolutionOutputSizeshNQ4ISI = (getHighSpeedVideoFpsRanges + 67) % 128;
        return bArr;
    }

    /* renamed from: ˊ, reason: contains not printable characters */
    public byte[] m27274() {
        int i = getHighSpeedVideoFpsRanges;
        int i2 = (i + 121) % 128;
        getHighResolutionOutputSizeshNQ4ISI = i2;
        byte[] bArr = this.f2411;
        if (bArr == null) {
            getHighResolutionOutputSizeshNQ4ISI = (((i | 95) << 1) - (i ^ 95)) % 128;
            return null;
        }
        int i3 = ((i2 | 107) << 1) - (i2 ^ 107);
        getHighSpeedVideoFpsRanges = i3 % 128;
        if (i3 % 2 != 0) {
            throw new java.lang.ArithmeticException();
        }
        byte[] bArr2 = (byte[]) bArr.clone();
        getHighSpeedVideoFpsRanges = (getHighResolutionOutputSizeshNQ4ISI + 13) % 128;
        return bArr2;
    }

    /* renamed from: ι, reason: contains not printable characters */
    public util.h.xy.s.f[] m27286() {
        util.h.xy.s.f[] fVarArr;
        int i = getHighResolutionOutputSizeshNQ4ISI;
        int i2 = (i ^ 1) + ((i & 1) << 1);
        int i3 = i2 % 128;
        getHighSpeedVideoFpsRanges = i3;
        if (i2 % 2 != 0) {
            throw null;
        }
        util.h.xy.s.f[] fVarArr2 = this.f2402;
        if (fVarArr2 != null) {
            int i4 = (i ^ 63) + ((i & 63) << 1);
            getHighSpeedVideoFpsRanges = i4 % 128;
            int i5 = i4 % 2;
            fVarArr = (util.h.xy.s.f[]) fVarArr2.clone();
            if (i5 != 0) {
                throw null;
            }
            getHighResolutionOutputSizeshNQ4ISI = (getHighSpeedVideoFpsRanges + 103) % 128;
        } else {
            getHighResolutionOutputSizeshNQ4ISI = ((i3 & 95) + (i3 | 95)) % 128;
            fVarArr = null;
        }
        int i6 = getHighSpeedVideoFpsRanges;
        int i7 = (i6 & 3) + (i6 | 3);
        getHighResolutionOutputSizeshNQ4ISI = i7 % 128;
        if (i7 % 2 != 0) {
            return fVarArr;
        }
        throw null;
    }

    /* renamed from: ͺ, reason: contains not printable characters */
    public byte[] m27282() {
        int i;
        int i2 = getHighSpeedVideoFpsRanges;
        int i3 = (i2 & 75) + (i2 | 75);
        getHighResolutionOutputSizeshNQ4ISI = i3 % 128;
        int length = (i3 % 2 != 0 ? this.f2402 == null : this.f2402 == null) ? 0 : this.f2402.length;
        byte[][] bArr = new byte[length][];
        getHighResolutionOutputSizeshNQ4ISI = (i2 + 5) % 128;
        int i4 = 0;
        int i5 = 0;
        while (i4 < length) {
            int i6 = getHighSpeedVideoFpsRanges;
            getHighResolutionOutputSizeshNQ4ISI = ((i6 & 15) + (i6 | 15)) % 128;
            int i7 = i4 + 1;
            byte[] m27211 = this.f2402[i4].m27211((byte) i7);
            int length2 = m27211.length;
            int identityHashCode = java.lang.System.identityHashCode(this);
            int i8 = length2 * 866;
            int i9 = i5 * (-864);
            int i10 = ~i5;
            int i11 = ~length2;
            int i12 = ~identityHashCode;
            int i13 = ~((i11 ^ i12) | (i11 & i12));
            int i14 = (i8 & i9) + (i8 | i9) + (((i10 & i13) | (i10 ^ i13)) * (-865));
            int i15 = (~((identityHashCode & length2) | (length2 ^ identityHashCode))) * 865;
            int i16 = ~((i10 ^ i12) | (i10 & i12));
            int i17 = ~(length2 | i12);
            i5 = (((i14 ^ i15) + ((i15 & i14) << 1)) - (~(-(-(((i16 ^ i17) | (i16 & i17)) * 865))))) - 1;
            bArr[i4] = m27211;
            i4 = i7;
        }
        byte[] bArr2 = new byte[i5];
        int i18 = 0;
        int i19 = 0;
        while (i18 < length) {
            int i20 = getHighSpeedVideoFpsRanges + 11;
            getHighResolutionOutputSizeshNQ4ISI = i20 % 128;
            if (i20 % 2 == 0) {
                byte[] bArr3 = bArr[i18];
                java.lang.System.arraycopy(bArr3, 1, bArr2, i19, bArr3.length);
                int i21 = -bArr3.length;
                i = (i19 & i21) + (i19 | i21);
                i18 += 125;
            } else {
                byte[] bArr4 = bArr[i18];
                java.lang.System.arraycopy(bArr4, 0, bArr2, i19, bArr4.length);
                int i22 = -(-bArr4.length);
                i = (i19 & i22) + (i19 | i22);
                i18++;
            }
            i19 = i;
            int i23 = getHighResolutionOutputSizeshNQ4ISI;
            int i24 = (i23 ^ 17) + ((i23 & 17) << 1);
            getHighSpeedVideoFpsRanges = i24 % 128;
            int i25 = i24 % 2;
        }
        util.h.xy.ar.b.m25074(bArr2);
        return bArr2;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0106  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0119  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0129  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0141  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0162  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0181  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0039  */
    /* renamed from: ʻ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public byte[] m27271() {
        byte[][] bArr;
        byte[][] bArr2;
        int i;
        byte[] bArr3;
        byte[] bArr4;
        byte[] bArr5;
        byte[] bArr6;
        byte[] bArr7;
        byte[] bArr8;
        util.h.xy.s.f[] fVarArr;
        byte[] bArr9;
        int i2;
        int i3;
        int i4 = getHighResolutionOutputSizeshNQ4ISI;
        int i5 = (i4 ^ 65) + ((i4 & 65) << 1);
        getHighSpeedVideoFpsRanges = i5 % 128;
        byte[] bArr10 = null;
        if (i5 % 2 != 0) {
            int i6 = this.getHighSpeedVideoFpsRangesFor;
            bArr = new byte[i6][];
            bArr2 = new byte[i6][];
            if (this.f2411 == null) {
                i = 1;
                bArr3 = this.f2408;
                if (bArr3 != null) {
                    bArr[i] = new byte[]{2};
                    bArr2[i] = bArr3;
                    i++;
                }
                bArr4 = this.f2406;
                if (bArr4 != null) {
                    bArr[i] = new byte[]{4};
                    int i7 = i - 31;
                    bArr2[i] = bArr4;
                    i = (i7 | 32) + (i7 & 32);
                }
                bArr5 = this.f2409;
                if (bArr5 != null) {
                    bArr[i] = new byte[]{6};
                    bArr2[i] = bArr5;
                    i = (((i | (-125)) << 1) - (i ^ (-125))) + 126;
                }
                bArr6 = this.f2405;
                if (bArr6 != null) {
                }
                bArr7 = this.f2401;
                if (bArr7 != null) {
                }
                bArr8 = this.f2412;
                if (bArr8 != null) {
                    bArr[i] = new byte[]{com.google.common.base.Ascii.ETB};
                    bArr2[i] = bArr8;
                    i++;
                }
                fVarArr = this.f2402;
                if (fVarArr != null) {
                    i2 = getHighSpeedVideoFpsRanges + 61;
                    getHighResolutionOutputSizeshNQ4ISI = i2 % 128;
                    if (i2 % 2 != 0) {
                    }
                }
                bArr9 = this.f2407;
                if (bArr9 != null) {
                }
                if (this.getHighSpeedVideoFpsRangesFor > 0) {
                }
                util.h.xy.ar.b.m25074(bArr10);
                return bArr10;
            }
            i = 1;
            i3 = ((i4 | 121) << 1) - (i4 ^ 121);
            getHighSpeedVideoFpsRanges = i3 % 128;
            if (i3 % 2 == 0) {
                int length = this.f2411.length;
                throw null;
            }
            byte[] bArr11 = this.f2411;
            if (bArr11.length > 0) {
                bArr[i] = new byte[]{1};
                int i8 = (i & 55) + 55;
                bArr2[i] = bArr11;
                i = (i8 | (-54)) + (i8 & (-54));
            }
            bArr3 = this.f2408;
            if (bArr3 != null && bArr3.length > 0) {
                bArr[i] = new byte[]{2};
                bArr2[i] = bArr3;
                i++;
            }
            bArr4 = this.f2406;
            if (bArr4 != null && bArr4.length > 0) {
                bArr[i] = new byte[]{4};
                int i72 = i - 31;
                bArr2[i] = bArr4;
                i = (i72 | 32) + (i72 & 32);
            }
            bArr5 = this.f2409;
            if (bArr5 != null && bArr5.length > 0) {
                bArr[i] = new byte[]{6};
                bArr2[i] = bArr5;
                i = (((i | (-125)) << 1) - (i ^ (-125))) + 126;
            }
            bArr6 = this.f2405;
            if (bArr6 != null) {
                int i9 = getHighSpeedVideoFpsRanges;
                getHighResolutionOutputSizeshNQ4ISI = ((i9 & 59) + (i9 | 59)) % 128;
                if (bArr6.length > 0) {
                    bArr[i] = new byte[]{com.google.common.base.Ascii.NAK};
                    bArr2[i] = bArr6;
                    i = (i & (-66)) + (i | (-66)) + 67;
                }
            }
            bArr7 = this.f2401;
            if (bArr7 != null) {
                int i10 = getHighResolutionOutputSizeshNQ4ISI;
                int i11 = (i10 ^ 115) + ((i10 & 115) << 1);
                int i12 = i11 % 128;
                getHighSpeedVideoFpsRanges = i12;
                if (i11 % 2 != 0) {
                    int length2 = bArr7.length;
                    throw null;
                }
                if (bArr7.length > 0) {
                    int i13 = (i12 & 109) + (i12 | 109);
                    getHighResolutionOutputSizeshNQ4ISI = i13 % 128;
                    if (i13 % 2 == 0) {
                        bArr[i] = new byte[]{com.google.common.base.Ascii.SYN};
                        int i14 = (i & 187) + (i | 187);
                        bArr2[i] = bArr7;
                        i = ((i14 | (-126)) << 1) - (i14 ^ (-126));
                    } else {
                        bArr[i] = new byte[]{com.google.common.base.Ascii.SYN};
                        bArr2[i] = bArr7;
                        i = ((i & 1) << 1) + (i ^ 1);
                    }
                }
            }
            bArr8 = this.f2412;
            if (bArr8 != null && bArr8.length > 0) {
                bArr[i] = new byte[]{com.google.common.base.Ascii.ETB};
                bArr2[i] = bArr8;
                i++;
            }
            fVarArr = this.f2402;
            if (fVarArr != null && fVarArr.length > 0) {
                i2 = getHighSpeedVideoFpsRanges + 61;
                getHighResolutionOutputSizeshNQ4ISI = i2 % 128;
                if (i2 % 2 != 0) {
                    util.h.xy.ar.b.m25074(fVarArr[0].m27210());
                    bArr[i] = new byte[]{38};
                    bArr2[i] = m27282();
                    i += 21;
                } else {
                    util.h.xy.ar.b.m25074(fVarArr[0].m27210());
                    bArr[i] = new byte[]{38};
                    int i15 = i + 48;
                    bArr2[i] = m27282();
                    i = (i15 ^ (-47)) + ((i15 & (-47)) << 1);
                }
            }
            bArr9 = this.f2407;
            if (bArr9 != null) {
                int i16 = getHighSpeedVideoFpsRanges + 125;
                getHighResolutionOutputSizeshNQ4ISI = i16 % 128;
                if (i16 % 2 == 0) {
                    int length3 = bArr9.length;
                    throw null;
                }
                if (bArr9.length > 0) {
                    bArr[i] = new byte[]{com.google.common.base.Ascii.ESC};
                    bArr2[i] = bArr9;
                }
            }
            if (this.getHighSpeedVideoFpsRangesFor > 0) {
                int i17 = getHighSpeedVideoFpsRanges;
                int i18 = (i17 & 45) + (i17 | 45);
                getHighResolutionOutputSizeshNQ4ISI = i18 % 128;
                if (i18 % 2 == 0) {
                    util.h.xy.al.rd.m25024(bArr, bArr2);
                    throw null;
                }
                bArr10 = util.h.xy.al.rd.m25024(bArr, bArr2);
                getHighSpeedVideoFpsRanges = (getHighResolutionOutputSizeshNQ4ISI + 43) % 128;
            }
            util.h.xy.ar.b.m25074(bArr10);
            return bArr10;
        }
        int i19 = this.getHighSpeedVideoFpsRangesFor;
        bArr = new byte[i19][];
        bArr2 = new byte[i19][];
        if (this.f2411 == null) {
            i = 0;
            bArr3 = this.f2408;
            if (bArr3 != null) {
            }
            bArr4 = this.f2406;
            if (bArr4 != null) {
            }
            bArr5 = this.f2409;
            if (bArr5 != null) {
            }
            bArr6 = this.f2405;
            if (bArr6 != null) {
            }
            bArr7 = this.f2401;
            if (bArr7 != null) {
            }
            bArr8 = this.f2412;
            if (bArr8 != null) {
            }
            fVarArr = this.f2402;
            if (fVarArr != null) {
            }
            bArr9 = this.f2407;
            if (bArr9 != null) {
            }
            if (this.getHighSpeedVideoFpsRangesFor > 0) {
            }
            util.h.xy.ar.b.m25074(bArr10);
            return bArr10;
        }
        i = 0;
        i3 = ((i4 | 121) << 1) - (i4 ^ 121);
        getHighSpeedVideoFpsRanges = i3 % 128;
        if (i3 % 2 == 0) {
        }
    }
}
