package util.h.xy.s;

/* loaded from: classes5.dex */
public class rf {
    private static int getHighResolutionOutputSizeshNQ4ISI = 1;
    private static int getHighSpeedVideoFpsRanges;
    private byte[] Camera2StreamConfigurationMap;
    private byte[] CoroutineDebuggingKt;
    private int accessartificialFrame;
    private byte[] coroutineBoundary;
    private byte[] getHighSpeedVideoFpsRangesFor;
    private byte[] getHighSpeedVideoSizes;
    private byte[] getHighSpeedVideoSizesFor;
    private byte[] getInputFormats;
    private byte[] getInputSizeshNQ4ISI;
    private byte[] getOutputFormats;
    private byte[] getOutputMinFrameDuration;
    private byte[] getOutputMinFrameDurationlomOqCM;
    private util.h.xy.s.mb getOutputSizes;
    private byte[] getOutputSizeshNQ4ISI;
    private byte[] getOutputStallDuration;
    private byte[] getOutputStallDurationlomOqCM;
    private byte[] getValidOutputFormatsForInputhNQ4ISI;
    private byte[] isOutputSupportedFor;
    private byte[] isOutputSupportedForhNQ4ISI;
    private byte[] toString;
    private byte[] unwrapAs;

    static {
        int i = getHighSpeedVideoFpsRanges;
        getHighResolutionOutputSizeshNQ4ISI = (((i | 51) << 1) - (i ^ 51)) % 128;
    }

    /* renamed from: ˊ, reason: contains not printable characters */
    public void m27391(util.h.xy.s.mb mbVar) {
        int i = getHighSpeedVideoFpsRanges;
        getHighResolutionOutputSizeshNQ4ISI = ((i & 117) + (i | 117)) % 128;
        this.getOutputSizes = mbVar;
        int i2 = ((i | 109) << 1) - (i ^ 109);
        getHighResolutionOutputSizeshNQ4ISI = i2 % 128;
        if (i2 % 2 == 0) {
            throw new java.lang.ArithmeticException();
        }
    }

    /* renamed from: ᐝ, reason: contains not printable characters */
    public byte[] m27403() {
        int i = getHighSpeedVideoFpsRanges;
        int i2 = i + 115;
        getHighResolutionOutputSizeshNQ4ISI = i2 % 128;
        if (i2 % 2 == 0) {
            throw null;
        }
        byte[] bArr = this.getOutputMinFrameDurationlomOqCM;
        int i3 = i + 5;
        getHighResolutionOutputSizeshNQ4ISI = i3 % 128;
        if (i3 % 2 != 0) {
            return bArr;
        }
        throw new java.lang.ArithmeticException();
    }

    /* renamed from: ˎ, reason: contains not printable characters */
    public void m27396(byte[] bArr) {
        int i = getHighSpeedVideoFpsRanges;
        int i2 = ((i | 119) << 1) - (i ^ 119);
        int i3 = i2 % 128;
        getHighResolutionOutputSizeshNQ4ISI = i3;
        if (i2 % 2 != 0) {
            this.getOutputMinFrameDurationlomOqCM = bArr;
            if (bArr != null && bArr.length > 0) {
                getHighSpeedVideoFpsRanges = (i3 + com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CALENDAR_VALUE) % 128;
                int i4 = this.accessartificialFrame;
                int identityHashCode = java.lang.System.identityHashCode(this);
                int i5 = -(-(i4 * (-167)));
                int i6 = ~i4;
                int i7 = ((((i5 | (-167)) << 1) - (i5 ^ (-167))) - (~(-(-(((~(i6 | (-2))) | (~((i6 & identityHashCode) | (i6 ^ identityHashCode)))) * 336))))) - 1;
                int i8 = ((~(i4 | 1)) | (~(identityHashCode | 1))) * (-168);
                int i9 = ((i7 | i8) << 1) - (i8 ^ i7);
                int i10 = ~identityHashCode;
                int i11 = ~((i10 ^ 1) | (i10 & 1));
                int i12 = -(-(((i11 ^ i6) | (i11 & i6)) * com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CODE_ACCOUNT_VERIFICATION_VALUE));
                this.accessartificialFrame = (i9 & i12) + (i12 | i9);
            }
            int i13 = getHighResolutionOutputSizeshNQ4ISI + 1;
            getHighSpeedVideoFpsRanges = i13 % 128;
            if (i13 % 2 != 0) {
                throw null;
            }
            return;
        }
        this.getOutputMinFrameDurationlomOqCM = bArr;
        throw new java.lang.ArithmeticException();
    }

    /* renamed from: ˊ, reason: contains not printable characters */
    public void m27392(byte[] bArr) {
        int i = getHighSpeedVideoFpsRanges;
        int i2 = ((i & 9) + (i | 9)) % 128;
        getHighResolutionOutputSizeshNQ4ISI = i2;
        this.getValidOutputFormatsForInputhNQ4ISI = bArr;
        if (bArr != null) {
            int i3 = ((i2 | 91) << 1) - (i2 ^ 91);
            getHighSpeedVideoFpsRanges = i3 % 128;
            if (i3 % 2 != 0) {
                int length = bArr.length;
                throw null;
            }
            if (bArr.length > 0) {
                int i4 = this.accessartificialFrame;
                this.accessartificialFrame = (i4 & 1) + (i4 | 1);
                getHighSpeedVideoFpsRanges = (i2 + 111) % 128;
            }
        }
        getHighResolutionOutputSizeshNQ4ISI = (getHighSpeedVideoFpsRanges + 89) % 128;
    }

    /* renamed from: ˏ, reason: contains not printable characters */
    public void m27398(byte[] bArr) {
        int i = getHighSpeedVideoFpsRanges + 103;
        int i2 = i % 128;
        getHighResolutionOutputSizeshNQ4ISI = i2;
        if (i % 2 != 0) {
            this.getHighSpeedVideoSizesFor = bArr;
            if (bArr != null) {
                int i3 = (i2 ^ 15) + ((i2 & 15) << 1);
                getHighSpeedVideoFpsRanges = i3 % 128;
                if (i3 % 2 != 0) {
                    int length = bArr.length;
                    throw null;
                }
                if (bArr.length > 0) {
                    int i4 = this.accessartificialFrame;
                    int identityHashCode = java.lang.System.identityHashCode(this);
                    int i5 = ~i4;
                    int i6 = (~identityHashCode) | (~((i5 & (-2)) | (i5 ^ (-2))));
                    int i7 = ~((i4 ^ 1) | (i4 & 1));
                    int i8 = ~((i4 ^ (-2)) | (i4 & (-2)));
                    int i9 = ~(i5 | 1);
                    this.accessartificialFrame = ((-722) - (~(i4 * (-721)))) + (((i6 ^ i7) | (i6 & i7)) * 1444) + (((~((i4 ^ identityHashCode) | (identityHashCode & i4))) | (~((identityHashCode & 1) | (identityHashCode ^ 1))) | i7) * (-1444)) + (((i9 & i8) | (i8 ^ i9)) * 722);
                    int i10 = getHighResolutionOutputSizeshNQ4ISI;
                    getHighSpeedVideoFpsRanges = (((i10 | 69) << 1) - (i10 ^ 69)) % 128;
                }
            }
            int i11 = getHighSpeedVideoFpsRanges + 45;
            getHighResolutionOutputSizeshNQ4ISI = i11 % 128;
            if (i11 % 2 == 0) {
                throw null;
            }
            return;
        }
        this.getHighSpeedVideoSizesFor = bArr;
        throw null;
    }

    /* renamed from: ˋ, reason: contains not printable characters */
    public void m27393(byte[] bArr) {
        int i = getHighResolutionOutputSizeshNQ4ISI;
        getHighSpeedVideoFpsRanges = ((i & 35) + (i | 35)) % 128;
        this.CoroutineDebuggingKt = bArr;
        if (bArr != null) {
            int i2 = (i & 67) + (i | 67);
            getHighSpeedVideoFpsRanges = i2 % 128;
            if (i2 % 2 != 0) {
                int length = bArr.length;
                throw new java.lang.ArithmeticException();
            }
            if (bArr.length > 0) {
                getHighSpeedVideoFpsRanges = ((i & 77) + (i | 77)) % 128;
                int i3 = this.accessartificialFrame;
                int identityHashCode = java.lang.System.identityHashCode(this);
                int i4 = i3 * 603;
                int i5 = ((i4 | 302) << 1) - (i4 ^ 302);
                int i6 = ~identityHashCode;
                int i7 = ~((i6 ^ (-2)) | (i6 & (-2)));
                int i8 = -(-(((i7 ^ i3) | (i7 & i3)) * (-602)));
                int i9 = (i5 & i8) + (i5 | i8);
                int i10 = ~i3;
                int i11 = ~((i10 ^ (-2)) | (i10 & (-2)));
                int i12 = ~((identityHashCode ^ (-2)) | (identityHashCode & (-2)));
                int i13 = (i12 ^ i11) | (i12 & i11);
                int i14 = (i6 ^ 1) | (i6 & 1);
                int i15 = ~((i14 ^ i3) | (i14 & i3));
                int i16 = -(-(((i13 ^ i15) | (i13 & i15)) * (-301)));
                int i17 = ((i9 | i16) << 1) - (i16 ^ i9);
                int i18 = -(-((~((i3 ^ i6) | (i3 & i6))) * 301));
                this.accessartificialFrame = ((i17 | i18) << 1) - (i18 ^ i17);
                getHighResolutionOutputSizeshNQ4ISI = (getHighSpeedVideoFpsRanges + 81) % 128;
            }
        }
        getHighResolutionOutputSizeshNQ4ISI = (getHighSpeedVideoFpsRanges + 73) % 128;
    }

    /* renamed from: ᐝ, reason: contains not printable characters */
    public void m27402(byte[] bArr) {
        int i = getHighResolutionOutputSizeshNQ4ISI;
        int i2 = (i ^ 35) + ((i & 35) << 1);
        getHighSpeedVideoFpsRanges = i2 % 128;
        if (i2 % 2 == 0) {
            this.Camera2StreamConfigurationMap = bArr;
            if (bArr != null && bArr.length > 0) {
                getHighSpeedVideoFpsRanges = ((i & 15) + (i | 15)) % 128;
                int i3 = this.accessartificialFrame;
                int identityHashCode = java.lang.System.identityHashCode(this);
                int i4 = -(-(i3 * (-520)));
                int i5 = (i4 ^ my.com.softspace.ssfasstapsdk.pog.AttestationPOG.POGStatusCodes.RST_POG_ACTIVATION_SCRP_FAIL) + ((i4 & my.com.softspace.ssfasstapsdk.pog.AttestationPOG.POGStatusCodes.RST_POG_ACTIVATION_SCRP_FAIL) << 1);
                int i6 = ~identityHashCode;
                int i7 = ~((i6 ^ i3) | (i6 & i3));
                int i8 = ((i7 ^ 1) | (i7 & 1)) * (-1042);
                int i9 = ((i5 | i8) << 1) - (i5 ^ i8);
                int i10 = -(-((i3 | identityHashCode) * my.com.softspace.ssfasstapsdk.pog.AttestationPOG.POGStatusCodes.RST_POG_ATTEST_SCRP_FAIL));
                int i11 = (i9 ^ i10) + ((i10 & i9) << 1);
                int i12 = ~i3;
                int i13 = ~((i12 ^ (-2)) | (i12 & (-2)));
                int i14 = ~((identityHashCode ^ (-2)) | (identityHashCode & (-2)));
                int i15 = (i14 ^ i13) | (i14 & i13);
                int i16 = i6 | 1;
                int i17 = ~((i3 ^ i16) | (i3 & i16));
                int i18 = -(-(((i17 ^ i15) | (i17 & i15)) * my.com.softspace.ssfasstapsdk.pog.AttestationPOG.POGStatusCodes.RST_POG_ATTEST_SCRP_FAIL));
                this.accessartificialFrame = (i11 & i18) + (i18 | i11);
            }
            int i19 = getHighSpeedVideoFpsRanges + 47;
            getHighResolutionOutputSizeshNQ4ISI = i19 % 128;
            if (i19 % 2 == 0) {
                throw null;
            }
            return;
        }
        this.Camera2StreamConfigurationMap = bArr;
        throw null;
    }

    /* renamed from: ʻ, reason: contains not printable characters */
    public void m27384(byte[] bArr) {
        int i = getHighSpeedVideoFpsRanges;
        getHighResolutionOutputSizeshNQ4ISI = ((i & 25) + (i | 25)) % 128;
        this.unwrapAs = bArr;
        if (bArr != null) {
            int i2 = (((i | 59) << 1) - (i ^ 59)) % 128;
            getHighResolutionOutputSizeshNQ4ISI = i2;
            if (bArr.length > 0) {
                getHighSpeedVideoFpsRanges = ((i2 ^ 23) + ((i2 & 23) << 1)) % 128;
                this.accessartificialFrame++;
            }
        }
        int i3 = getHighSpeedVideoFpsRanges + 59;
        getHighResolutionOutputSizeshNQ4ISI = i3 % 128;
        if (i3 % 2 == 0) {
            throw new java.lang.ArithmeticException();
        }
    }

    /* renamed from: ʼ, reason: contains not printable characters */
    public void m27385(byte[] bArr) {
        int i = getHighResolutionOutputSizeshNQ4ISI;
        int i2 = i + 23;
        getHighSpeedVideoFpsRanges = i2 % 128;
        if (i2 % 2 == 0) {
            this.getHighSpeedVideoSizes = bArr;
            if (bArr != null) {
                getHighSpeedVideoFpsRanges = (i + 53) % 128;
                if (bArr.length > 0) {
                    getHighSpeedVideoFpsRanges = ((i & 69) + (i | 69)) % 128;
                    int i3 = this.accessartificialFrame;
                    int identityHashCode = java.lang.System.identityHashCode(this);
                    int i4 = ~i3;
                    int i5 = ~(i4 | (-2));
                    int i6 = ~((i4 ^ identityHashCode) | (i4 & identityHashCode));
                    int i7 = (((i3 * (-575)) - 575) - (~(((i5 ^ i6) | (i5 & i6)) * 576))) - 1;
                    int i8 = ~((i3 & (-2)) | (i3 ^ (-2)));
                    int i9 = ~identityHashCode;
                    int i10 = (i9 ^ i4) | (i9 & i4);
                    int i11 = ~((i10 ^ 1) | (i10 & 1));
                    int i12 = -(-(((i8 ^ i11) | (i11 & i8)) * 576));
                    this.accessartificialFrame = (i7 ^ i12) + ((i12 & i7) << 1) + ((~((i4 & (-2)) | (i4 ^ (-2)))) * 576);
                    int i13 = getHighSpeedVideoFpsRanges;
                    getHighResolutionOutputSizeshNQ4ISI = ((i13 ^ 85) + ((i13 & 85) << 1)) % 128;
                    return;
                }
                return;
            }
            return;
        }
        this.getHighSpeedVideoSizes = bArr;
        throw null;
    }

    /* renamed from: ͺ, reason: contains not printable characters */
    public void m27401(byte[] bArr) {
        int i = getHighSpeedVideoFpsRanges;
        int i2 = i + 119;
        getHighResolutionOutputSizeshNQ4ISI = i2 % 128;
        if (i2 % 2 != 0) {
            this.getHighSpeedVideoFpsRangesFor = bArr;
            if (bArr != null) {
                int i3 = i + 29;
                int i4 = i3 % 128;
                getHighResolutionOutputSizeshNQ4ISI = i4;
                if (i3 % 2 == 0) {
                    int length = bArr.length;
                    throw null;
                }
                if (bArr.length > 0) {
                    this.accessartificialFrame++;
                    getHighSpeedVideoFpsRanges = (((i4 | 11) << 1) - (i4 ^ 11)) % 128;
                    return;
                }
                return;
            }
            return;
        }
        this.getHighSpeedVideoFpsRangesFor = bArr;
        throw null;
    }

    /* renamed from: ι, reason: contains not printable characters */
    public void m27406(byte[] bArr) {
        int i = getHighResolutionOutputSizeshNQ4ISI;
        int i2 = (((i | 33) << 1) - (i ^ 33)) % 128;
        getHighSpeedVideoFpsRanges = i2;
        this.getInputFormats = bArr;
        if (bArr != null) {
            int i3 = ((i2 ^ 73) + ((i2 & 73) << 1)) % 128;
            getHighResolutionOutputSizeshNQ4ISI = i3;
            if (bArr.length > 0) {
                int i4 = (i3 + 25) % 128;
                getHighSpeedVideoFpsRanges = i4;
                int i5 = this.accessartificialFrame;
                this.accessartificialFrame = (i5 ^ 1) + ((i5 & 1) << 1);
                getHighResolutionOutputSizeshNQ4ISI = ((i4 ^ 29) + ((i4 & 29) << 1)) % 128;
            }
        }
        int i6 = getHighSpeedVideoFpsRanges;
        getHighResolutionOutputSizeshNQ4ISI = ((i6 & 9) + (i6 | 9)) % 128;
    }

    /* renamed from: ʽ, reason: contains not printable characters */
    public void m27386(byte[] bArr) {
        int i = getHighSpeedVideoFpsRanges;
        int i2 = i + 63;
        getHighResolutionOutputSizeshNQ4ISI = i2 % 128;
        if (i2 % 2 == 0) {
            this.getInputSizeshNQ4ISI = bArr;
            throw null;
        }
        this.getInputSizeshNQ4ISI = bArr;
        if (bArr != null) {
            int i3 = (((i | 25) << 1) - (i ^ 25)) % 128;
            getHighResolutionOutputSizeshNQ4ISI = i3;
            if (bArr.length > 0) {
                getHighSpeedVideoFpsRanges = ((i3 ^ 61) + ((i3 & 61) << 1)) % 128;
                int i4 = this.accessartificialFrame;
                int identityHashCode = java.lang.System.identityHashCode(this);
                int i5 = (i4 * 949) - 947;
                int i6 = ~i4;
                int i7 = ~((i6 ^ identityHashCode) | (i6 & identityHashCode));
                int i8 = -(-(((i7 ^ (-2)) | (i7 & (-2))) * (-948)));
                int i9 = (((i5 ^ i8) + ((i5 & i8) << 1)) - (~((~((~identityHashCode) | ((i6 & (-2)) | (i6 ^ (-2))))) * (-948)))) - 1;
                int i10 = -(-(((i6 & 1) | (i6 ^ 1)) * 948));
                this.accessartificialFrame = (i9 & i10) + (i10 | i9);
                int i11 = getHighSpeedVideoFpsRanges;
                getHighResolutionOutputSizeshNQ4ISI = (((i11 | 87) << 1) - (i11 ^ 87)) % 128;
            }
        }
        getHighSpeedVideoFpsRanges = (getHighResolutionOutputSizeshNQ4ISI + 57) % 128;
    }

    /* renamed from: ˈ, reason: contains not printable characters */
    public void m27389(byte[] bArr) {
        int i = getHighResolutionOutputSizeshNQ4ISI;
        int i2 = ((i | 43) << 1) - (i ^ 43);
        int i3 = i2 % 128;
        getHighSpeedVideoFpsRanges = i3;
        if (i2 % 2 == 0) {
            this.getOutputFormats = bArr;
            if (bArr != null && bArr.length > 0) {
                int i4 = ((i3 | 35) << 1) - (i3 ^ 35);
                getHighResolutionOutputSizeshNQ4ISI = i4 % 128;
                this.accessartificialFrame = i4 % 2 == 0 ? this.accessartificialFrame : this.accessartificialFrame + 1;
            }
            getHighSpeedVideoFpsRanges = (getHighResolutionOutputSizeshNQ4ISI + 93) % 128;
            return;
        }
        this.getOutputFormats = bArr;
        throw null;
    }

    /* renamed from: ˉ, reason: contains not printable characters */
    public void m27390(byte[] bArr) {
        int i = getHighResolutionOutputSizeshNQ4ISI;
        getHighSpeedVideoFpsRanges = ((i ^ 121) + ((i & 121) << 1)) % 128;
        this.getOutputMinFrameDuration = bArr;
        if (bArr != null) {
            int i2 = (i ^ 13) + ((i & 13) << 1);
            getHighSpeedVideoFpsRanges = i2 % 128;
            if (i2 % 2 != 0) {
                int length = bArr.length;
                throw new java.lang.ArithmeticException();
            }
            if (bArr.length > 0) {
                getHighSpeedVideoFpsRanges = (i + 59) % 128;
                int i3 = this.accessartificialFrame;
                int identityHashCode = java.lang.System.identityHashCode(this);
                int i4 = i3 * 421;
                int i5 = (i4 & (-419)) + (i4 | (-419));
                int i6 = (~((i3 ^ identityHashCode) | (i3 & identityHashCode))) * androidx.constraintlayout.core.motion.utils.TypedValues.CycleType.TYPE_EASING;
                int i7 = (i5 & i6) + (i6 | i5);
                int i8 = ((i3 ^ (-2)) | (i3 & (-2))) * (-420);
                int i9 = ((i7 | i8) << 1) - (i8 ^ i7);
                int i10 = ~i3;
                int i11 = ~((i10 ^ (-2)) | (i10 & (-2)));
                int i12 = ~identityHashCode;
                int i13 = ~((i3 ^ i12) | (i3 & i12));
                int i14 = -(-(((i13 ^ i11) | (i13 & i11)) * androidx.constraintlayout.core.motion.utils.TypedValues.CycleType.TYPE_EASING));
                this.accessartificialFrame = (i9 ^ i14) + ((i14 & i9) << 1);
            }
        }
        int i15 = getHighResolutionOutputSizeshNQ4ISI;
        int i16 = (i15 ^ 7) + ((i15 & 7) << 1);
        getHighSpeedVideoFpsRanges = i16 % 128;
        if (i16 % 2 != 0) {
            throw new java.lang.ArithmeticException();
        }
    }

    /* renamed from: ˌ, reason: contains not printable characters */
    public void m27394(byte[] bArr) {
        int i = getHighResolutionOutputSizeshNQ4ISI;
        getHighSpeedVideoFpsRanges = ((i ^ 61) + ((i & 61) << 1)) % 128;
        this.getOutputSizeshNQ4ISI = bArr;
        if (bArr != null) {
            getHighSpeedVideoFpsRanges = ((i ^ 67) + ((i & 67) << 1)) % 128;
            if (bArr.length > 0) {
                getHighSpeedVideoFpsRanges = ((i & 119) + (i | 119)) % 128;
                int i2 = this.accessartificialFrame;
                int identityHashCode = java.lang.System.identityHashCode(this);
                int i3 = -(-(i2 * 434));
                int i4 = (i3 & (-432)) + (i3 | (-432));
                int i5 = ~identityHashCode;
                int i6 = (i5 ^ (-2)) | (i5 & (-2));
                int i7 = (~((i6 ^ i2) | (i6 & i2))) * 433;
                int i8 = ~i2;
                int i9 = ~((i8 ^ identityHashCode) | (i8 & identityHashCode));
                int i10 = ~((identityHashCode ^ (-2)) | (identityHashCode & (-2)));
                int i11 = ~((i2 ^ 1) | (i2 & 1));
                this.accessartificialFrame = (((((i4 ^ i7) + ((i7 & i4) << 1)) - (~(((i9 & (-2)) | (i9 ^ (-2))) * (-433)))) - 1) - (~(((i11 ^ i10) | (i11 & i10)) * 433))) - 1;
                getHighResolutionOutputSizeshNQ4ISI = (getHighSpeedVideoFpsRanges + 77) % 128;
            }
        }
        int i12 = getHighSpeedVideoFpsRanges;
        int i13 = ((i12 | 73) << 1) - (i12 ^ 73);
        getHighResolutionOutputSizeshNQ4ISI = i13 % 128;
        if (i13 % 2 == 0) {
            throw new java.lang.ArithmeticException();
        }
    }

    /* renamed from: ˎ, reason: contains not printable characters */
    public byte[] m27397() {
        int i = getHighResolutionOutputSizeshNQ4ISI;
        int i2 = (i & 21) + (i | 21);
        int i3 = i2 % 128;
        getHighSpeedVideoFpsRanges = i3;
        if (i2 % 2 != 0) {
            throw null;
        }
        byte[] bArr = this.coroutineBoundary;
        int i4 = i3 + 19;
        getHighResolutionOutputSizeshNQ4ISI = i4 % 128;
        if (i4 % 2 != 0) {
            return bArr;
        }
        throw null;
    }

    /* renamed from: ʾ, reason: contains not printable characters */
    public void m27387(byte[] bArr) {
        int i = getHighSpeedVideoFpsRanges;
        int i2 = i + 91;
        getHighResolutionOutputSizeshNQ4ISI = i2 % 128;
        if (i2 % 2 != 0) {
            this.coroutineBoundary = bArr;
            if (bArr != null) {
                getHighResolutionOutputSizeshNQ4ISI = (((i | 49) << 1) - (i ^ 49)) % 128;
                if (bArr.length > 0) {
                    int i3 = ((i | 117) << 1) - (i ^ 117);
                    getHighResolutionOutputSizeshNQ4ISI = i3 % 128;
                    this.accessartificialFrame = i3 % 2 == 0 ? this.accessartificialFrame : this.accessartificialFrame + 1;
                    getHighResolutionOutputSizeshNQ4ISI = (((i | 53) << 1) - (i ^ 53)) % 128;
                }
            }
            getHighResolutionOutputSizeshNQ4ISI = (i + 45) % 128;
            return;
        }
        this.coroutineBoundary = bArr;
        throw new java.lang.ArithmeticException();
    }

    /* renamed from: ʿ, reason: contains not printable characters */
    public void m27388(byte[] bArr) {
        int i = getHighSpeedVideoFpsRanges;
        int i2 = i + 27;
        getHighResolutionOutputSizeshNQ4ISI = i2 % 128;
        if (i2 % 2 == 0) {
            this.getOutputStallDurationlomOqCM = bArr;
            throw new java.lang.ArithmeticException();
        }
        this.getOutputStallDurationlomOqCM = bArr;
        if (bArr != null) {
            int i3 = (i + 53) % 128;
            getHighResolutionOutputSizeshNQ4ISI = i3;
            if (bArr.length > 0) {
                getHighSpeedVideoFpsRanges = (((i3 | 99) << 1) - (i3 ^ 99)) % 128;
                int i4 = this.accessartificialFrame;
                int identityHashCode = java.lang.System.identityHashCode(this);
                int i5 = i4 * (-67);
                int i6 = (i5 ^ 69) + ((i5 & 69) << 1);
                int i7 = ~i4;
                int i8 = (i7 & (-2)) | (i7 ^ (-2));
                int i9 = ~identityHashCode;
                int i10 = ~((i8 ^ i9) | (i8 & i9));
                int i11 = ~((i4 ^ 1) | (i4 & 1));
                int i12 = (i10 ^ i11) | (i10 & i11);
                int i13 = ~((identityHashCode & i4) | (i4 ^ identityHashCode));
                int i14 = ((i13 ^ i12) | (i12 & i13)) * (-68);
                int i15 = (i9 ^ (-2)) | (i9 & (-2));
                this.accessartificialFrame = (i6 & i14) + (i14 | i6) + ((~((i4 ^ i15) | (i15 & i4))) * (-68)) + (((~((i7 & i9) | (i7 ^ i9))) | (-2)) * 68);
                int i16 = getHighSpeedVideoFpsRanges;
                getHighResolutionOutputSizeshNQ4ISI = ((i16 ^ 63) + ((i16 & 63) << 1)) % 128;
            }
        }
        int i17 = getHighSpeedVideoFpsRanges;
        getHighResolutionOutputSizeshNQ4ISI = ((i17 & 65) + (i17 | 65)) % 128;
    }

    /* renamed from: ˍ, reason: contains not printable characters */
    public void m27395(byte[] bArr) {
        int i = getHighResolutionOutputSizeshNQ4ISI;
        int i2 = i + 107;
        getHighSpeedVideoFpsRanges = i2 % 128;
        if (i2 % 2 == 0) {
            this.isOutputSupportedForhNQ4ISI = bArr;
            if (bArr == null || bArr.length <= 0) {
                return;
            }
            getHighSpeedVideoFpsRanges = ((i & 91) + (i | 91)) % 128;
            int i3 = this.accessartificialFrame;
            int identityHashCode = java.lang.System.identityHashCode(this);
            int i4 = ~((i3 ^ (-2)) | (i3 & (-2)));
            int i5 = ~(identityHashCode | (-2));
            int i6 = ~i3;
            int i7 = ((((283 - (~(-(-(i3 * (-282)))))) - (~(-(-(((i4 ^ i5) | (i4 & i5)) * (-283)))))) - 1) - (~(-(-((~((i6 ^ 1) | (i6 & 1))) * 283))))) - 1;
            int i8 = (i6 ^ (-2)) | (i6 & (-2));
            int i9 = (~((i8 ^ identityHashCode) | (i8 & identityHashCode))) * 283;
            this.accessartificialFrame = (i7 & i9) + (i9 | i7);
            return;
        }
        this.isOutputSupportedForhNQ4ISI = bArr;
        throw null;
    }

    /* renamed from: ᐧ, reason: contains not printable characters */
    public void m27404(byte[] bArr) {
        int i = getHighSpeedVideoFpsRanges;
        int i2 = ((i | 57) << 1) - (i ^ 57);
        getHighResolutionOutputSizeshNQ4ISI = i2 % 128;
        if (i2 % 2 == 0) {
            this.getOutputStallDuration = bArr;
            throw new java.lang.ArithmeticException();
        }
        this.getOutputStallDuration = bArr;
        if (bArr != null) {
            int i3 = (i + 35) % 128;
            getHighResolutionOutputSizeshNQ4ISI = i3;
            if (bArr.length > 0) {
                getHighSpeedVideoFpsRanges = (i3 + 117) % 128;
                int i4 = this.accessartificialFrame;
                int identityHashCode = java.lang.System.identityHashCode(this);
                int i5 = i4 * 591;
                int i6 = (i5 ^ (-589)) + ((i5 & (-589)) << 1);
                int i7 = ~i4;
                int i8 = ~identityHashCode;
                int i9 = ~((i7 ^ i8) | (i7 & i8));
                int i10 = ~((i7 ^ 1) | (i7 & 1));
                int i11 = (i10 ^ i9) | (i9 & i10);
                int i12 = ~((i8 ^ 1) | (i8 & 1));
                int i13 = (i4 ^ (-2)) | (i4 & (-2));
                int i14 = ((~((identityHashCode ^ i13) | (identityHashCode & i13))) | (i11 ^ i12) | (i11 & i12)) * 590;
                int i15 = ~((i8 ^ (-2)) | (i8 & (-2)));
                int i16 = ~((i4 ^ i8) | (i4 & i8));
                this.accessartificialFrame = ((((i6 ^ i14) + ((i14 & i6) << 1)) - (~(-(-(r1 * (-1180)))))) - 1) + (((i16 ^ i15) | (i16 & i15)) * 590);
                getHighSpeedVideoFpsRanges = (getHighResolutionOutputSizeshNQ4ISI + 65) % 128;
            }
        }
        int i17 = getHighResolutionOutputSizeshNQ4ISI;
        getHighSpeedVideoFpsRanges = ((i17 & 57) + (i17 | 57)) % 128;
    }

    /* renamed from: ˑ, reason: contains not printable characters */
    public void m27400(byte[] bArr) {
        int i = getHighSpeedVideoFpsRanges;
        int i2 = ((i ^ 87) + ((i & 87) << 1)) % 128;
        getHighResolutionOutputSizeshNQ4ISI = i2;
        this.toString = bArr;
        if (bArr != null) {
            int i3 = ((i2 | 57) << 1) - (i2 ^ 57);
            getHighSpeedVideoFpsRanges = i3 % 128;
            if (i3 % 2 == 0) {
                if (bArr.length > 0) {
                    this.accessartificialFrame++;
                }
            } else {
                int length = bArr.length;
                throw null;
            }
        }
        int i4 = getHighSpeedVideoFpsRanges;
        getHighResolutionOutputSizeshNQ4ISI = ((i4 & 3) + (i4 | 3)) % 128;
    }

    /* renamed from: ᐨ, reason: contains not printable characters */
    public void m27405(byte[] bArr) {
        int i = getHighSpeedVideoFpsRanges;
        int i2 = (((i | 29) << 1) - (i ^ 29)) % 128;
        getHighResolutionOutputSizeshNQ4ISI = i2;
        this.isOutputSupportedFor = bArr;
        if (bArr != null) {
            int i3 = i2 + 57;
            getHighSpeedVideoFpsRanges = i3 % 128;
            if (i3 % 2 != 0) {
                int length = bArr.length;
                throw null;
            }
            if (bArr.length > 0) {
                getHighSpeedVideoFpsRanges = ((i2 & 99) + (i2 | 99)) % 128;
                int i4 = this.accessartificialFrame;
                int identityHashCode = java.lang.System.identityHashCode(this);
                int i5 = -(-(i4 * 561));
                int i6 = ~identityHashCode;
                int i7 = ~i4;
                int i8 = (i7 ^ 1) | (i7 & 1);
                int i9 = (((i5 | (-559)) << 1) - (i5 ^ (-559))) + ((~((i6 ^ 1) | (i6 & 1))) * (-560)) + ((~((identityHashCode ^ i8) | (identityHashCode & i8))) * (-560));
                int i10 = -(-(((~((i4 ^ (-2)) | (i4 & (-2)))) | (~((i4 & i6) | (i6 ^ i4)))) * 560));
                this.accessartificialFrame = (i9 ^ i10) + ((i10 & i9) << 1);
                int i11 = getHighSpeedVideoFpsRanges;
                int i12 = (i11 & 109) + (i11 | 109);
                getHighResolutionOutputSizeshNQ4ISI = i12 % 128;
                if (i12 % 2 == 0) {
                    int i13 = 5 / 4;
                }
            }
        }
        int i14 = getHighSpeedVideoFpsRanges + 21;
        getHighResolutionOutputSizeshNQ4ISI = i14 % 128;
        if (i14 % 2 == 0) {
            throw null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x0258  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x026a  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x029f  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x02eb  */
    /* JADX WARN: Removed duplicated region for block: B:12:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x014e  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0160  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x017a  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0197  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x01b0  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x01fe  */
    /* renamed from: ˏ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public byte[] m27399() {
        byte[] m27216;
        byte[] bArr;
        byte[] m25090;
        int i;
        byte[] bArr2;
        byte[] bArr3;
        byte[] bArr4;
        byte[] bArr5;
        byte[] bArr6;
        byte[] bArr7;
        byte[] bArr8;
        byte[] bArr9;
        byte[] bArr10;
        byte[] bArr11;
        byte[] bArr12;
        byte[] bArr13;
        byte[] bArr14;
        byte[] bArr15;
        byte[] bArr16;
        byte[] bArr17;
        byte[] bArr18;
        byte[] bArr19;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6 = getHighSpeedVideoFpsRanges;
        int i7 = ((i6 & 3) + (i6 | 3)) % 128;
        getHighResolutionOutputSizeshNQ4ISI = i7;
        byte[][] bArr20 = {new byte[]{33}};
        getHighSpeedVideoFpsRanges = (i7 + 55) % 128;
        int i8 = this.accessartificialFrame;
        byte[][] bArr21 = new byte[i8][];
        byte[][] bArr22 = new byte[i8][];
        if (i8 > 0) {
            byte[] bArr23 = this.getOutputMinFrameDurationlomOqCM;
            if (bArr23 != null) {
                int i9 = (i7 & 101) + (i7 | 101);
                getHighSpeedVideoFpsRanges = i9 % 128;
                if (i9 % 2 != 0) {
                    int length = bArr23.length;
                    throw null;
                }
                if (bArr23.length > 0) {
                    bArr21[0] = new byte[]{1};
                    bArr22[0] = bArr23;
                    i = 1;
                    bArr2 = this.getValidOutputFormatsForInputhNQ4ISI;
                    if (bArr2 != null) {
                        int i10 = getHighSpeedVideoFpsRanges;
                        getHighResolutionOutputSizeshNQ4ISI = (i10 + 93) % 128;
                        if (bArr2.length > 0) {
                            getHighResolutionOutputSizeshNQ4ISI = ((i10 & 81) + (i10 | 81)) % 128;
                            bArr21[i] = new byte[]{19};
                            bArr22[i] = bArr2;
                            i++;
                        }
                    }
                    bArr3 = this.getHighSpeedVideoSizesFor;
                    if (bArr3 != null) {
                        int i11 = getHighResolutionOutputSizeshNQ4ISI;
                        int i12 = i11 + 15;
                        getHighSpeedVideoFpsRanges = i12 % 128;
                        if (i12 % 2 != 0) {
                            int length2 = bArr3.length;
                            throw null;
                        }
                        if (bArr3.length > 0) {
                            bArr21[i] = new byte[]{com.google.common.base.Ascii.EM};
                            bArr22[i] = bArr3;
                            getHighSpeedVideoFpsRanges = (i11 + com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CALENDAR_VALUE) % 128;
                            i = ((i & 1) << 1) + (i ^ 1);
                        }
                    }
                    bArr4 = this.CoroutineDebuggingKt;
                    if (bArr4 != null) {
                        int i13 = getHighResolutionOutputSizeshNQ4ISI;
                        getHighSpeedVideoFpsRanges = ((i13 ^ 67) + ((i13 & 67) << 1)) % 128;
                        if (bArr4.length > 0) {
                            int i14 = i13 + 63;
                            getHighSpeedVideoFpsRanges = i14 % 128;
                            if (i14 % 2 != 0) {
                                bArr21[i] = new byte[]{com.visa.cbp.getEncExpo.getARTIFICIAL_FRAME_PACKAGE_NAME};
                                int i15 = (i & 108) + (i | 108);
                                i5 = (i15 ^ (-25)) + ((i15 & (-25)) << 1);
                                bArr22[i] = bArr4;
                            } else {
                                bArr21[i] = new byte[]{com.visa.cbp.getEncExpo.getARTIFICIAL_FRAME_PACKAGE_NAME};
                                int i16 = (i & 119) + (i | 119);
                                i5 = ((i16 | (-118)) << 1) - (i16 ^ (-118));
                                bArr22[i] = bArr4;
                            }
                            i = i5;
                        }
                    }
                    bArr5 = this.Camera2StreamConfigurationMap;
                    if (bArr5 != null && bArr5.length > 0) {
                        bArr21[i] = new byte[]{91};
                        bArr22[i] = bArr5;
                        i++;
                    }
                    bArr6 = this.unwrapAs;
                    if (bArr6 != null) {
                        int i17 = getHighResolutionOutputSizeshNQ4ISI;
                        int i18 = (i17 & 53) + (i17 | 53);
                        getHighSpeedVideoFpsRanges = i18 % 128;
                        if (i18 % 2 != 0) {
                            int length3 = bArr6.length;
                            throw null;
                        }
                        if (bArr6.length > 0) {
                            bArr21[i] = new byte[]{92};
                            bArr22[i] = bArr6;
                            i = (((i | (-123)) << 1) - (i ^ (-123))) + com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_SIGNATURE_VALUE;
                        }
                    }
                    bArr7 = this.getHighSpeedVideoSizes;
                    if (bArr7 != null && bArr7.length > 0) {
                        bArr21[i] = new byte[]{93};
                        int i19 = (i ^ 9) + ((i & 9) << 1);
                        bArr22[i] = bArr7;
                        i = ((i19 | (-8)) << 1) - (i19 ^ (-8));
                    }
                    bArr8 = this.getHighSpeedVideoFpsRangesFor;
                    if (bArr8 != null && bArr8.length > 0) {
                        i4 = getHighResolutionOutputSizeshNQ4ISI + 67;
                        getHighSpeedVideoFpsRanges = i4 % 128;
                        if (i4 % 2 == 0) {
                            bArr21[i] = new byte[]{com.google.common.base.Ascii.RS};
                            bArr22[i] = bArr8;
                            i = ((i | 64) << 1) - (i ^ 64);
                        } else {
                            bArr21[i] = new byte[]{com.google.common.base.Ascii.RS};
                            int i20 = (i ^ 125) + ((i & 125) << 1);
                            bArr22[i] = bArr8;
                            i = ((i20 | (-124)) << 1) - (i20 ^ (-124));
                        }
                    }
                    bArr9 = this.getInputFormats;
                    if (bArr9 != null) {
                        getHighResolutionOutputSizeshNQ4ISI = (getHighSpeedVideoFpsRanges + 113) % 128;
                        if (bArr9.length > 0) {
                            bArr21[i] = new byte[]{64};
                            bArr22[i] = bArr9;
                            i++;
                        }
                    }
                    bArr10 = this.getInputSizeshNQ4ISI;
                    if (bArr10 != null) {
                        getHighResolutionOutputSizeshNQ4ISI = (getHighSpeedVideoFpsRanges + 49) % 128;
                        if (bArr10.length > 0) {
                            bArr21[i] = new byte[]{65};
                            bArr22[i] = bArr10;
                            i++;
                        }
                    }
                    bArr11 = this.getOutputFormats;
                    if (bArr11 != null) {
                        int i21 = getHighSpeedVideoFpsRanges;
                        int i22 = ((i21 | 33) << 1) - (33 ^ i21);
                        getHighResolutionOutputSizeshNQ4ISI = i22 % 128;
                        if (i22 % 2 == 0) {
                            int length4 = bArr11.length;
                            throw new java.lang.ArithmeticException();
                        }
                        if (bArr11.length > 0) {
                            bArr21[i] = new byte[]{83};
                            int i23 = (i ^ 118) + ((i & 118) << 1);
                            bArr22[i] = bArr11;
                            i = (i23 & (-117)) + (i23 | (-117));
                        }
                    }
                    bArr12 = this.getOutputMinFrameDuration;
                    if (bArr12 != null && bArr12.length > 0) {
                        bArr21[i] = new byte[]{84};
                        int i24 = (i & 78) + (i | 78);
                        bArr22[i] = bArr12;
                        i = (i24 & (-77)) + (i24 | (-77));
                    }
                    bArr13 = this.getOutputSizeshNQ4ISI;
                    if (bArr13 != null) {
                        int i25 = getHighSpeedVideoFpsRanges;
                        getHighResolutionOutputSizeshNQ4ISI = ((i25 ^ 101) + ((i25 & 101) << 1)) % 128;
                        if (bArr13.length > 0) {
                            bArr21[i] = new byte[]{66};
                            bArr22[i] = bArr13;
                            i = ((i & 1) << 1) + (i ^ 1);
                        }
                    }
                    bArr14 = this.coroutineBoundary;
                    if (bArr14 != null && bArr14.length > 0) {
                        int i26 = getHighSpeedVideoFpsRanges;
                        getHighResolutionOutputSizeshNQ4ISI = ((i26 & 25) + (i26 | 25)) % 128;
                        bArr21[i] = new byte[]{85};
                        bArr22[i] = bArr14;
                        getHighResolutionOutputSizeshNQ4ISI = (i26 + 71) % 128;
                        i++;
                    }
                    bArr15 = this.getOutputStallDurationlomOqCM;
                    if (bArr15 != null && bArr15.length > 0) {
                        int i27 = getHighResolutionOutputSizeshNQ4ISI;
                        i3 = ((i27 | 117) << 1) - (i27 ^ 117);
                        int i28 = i3 % 128;
                        getHighSpeedVideoFpsRanges = i28;
                        if (i3 % 2 == 0) {
                            bArr21[i] = new byte[]{86};
                            bArr22[i] = bArr15;
                            i = ((i | 125) << 1) - (i ^ 125);
                        } else {
                            bArr21[i] = new byte[]{86};
                            int i29 = (i ^ (-9)) + ((i & (-9)) << 1);
                            bArr22[i] = bArr15;
                            i = ((i29 | 10) << 1) - (i29 ^ 10);
                        }
                        getHighResolutionOutputSizeshNQ4ISI = (i28 + 93) % 128;
                    }
                    bArr16 = this.isOutputSupportedForhNQ4ISI;
                    if (bArr16 != null && bArr16.length > 0) {
                        bArr21[i] = new byte[]{82};
                        bArr22[i] = bArr16;
                        i = (i | 1) + (i & 1);
                    }
                    bArr17 = this.getOutputStallDuration;
                    if (bArr17 != null) {
                        int i30 = getHighResolutionOutputSizeshNQ4ISI;
                        int i31 = (i30 ^ 97) + ((i30 & 97) << 1);
                        int i32 = i31 % 128;
                        getHighSpeedVideoFpsRanges = i32;
                        if (i31 % 2 != 0) {
                            int length5 = bArr17.length;
                            throw new java.lang.ArithmeticException();
                        }
                        if (bArr17.length > 0) {
                            int i33 = (i32 ^ 43) + ((i32 & 43) << 1);
                            getHighResolutionOutputSizeshNQ4ISI = i33 % 128;
                            if (i33 % 2 == 0) {
                                bArr21[i] = new byte[]{com.google.common.base.Ascii.FS};
                                i2 = (i & (-10)) + (i | (-10)) + 115;
                                bArr22[i] = bArr17;
                            } else {
                                bArr21[i] = new byte[]{com.google.common.base.Ascii.FS};
                                i2 = i + 1;
                                bArr22[i] = bArr17;
                            }
                            i = i2;
                        }
                    }
                    bArr18 = this.toString;
                    if (bArr18 != null) {
                        int i34 = getHighSpeedVideoFpsRanges;
                        int i35 = ((i34 & 67) + (i34 | 67)) % 128;
                        getHighResolutionOutputSizeshNQ4ISI = i35;
                        if (bArr18.length > 0) {
                            getHighSpeedVideoFpsRanges = ((i35 ^ 31) + ((i35 & 31) << 1)) % 128;
                            bArr21[i] = new byte[]{87};
                            bArr22[i] = bArr18;
                            i = ((i & 1) << 1) + (i ^ 1);
                        }
                    }
                    bArr19 = this.isOutputSupportedFor;
                    if (bArr19 != null && bArr19.length > 0) {
                        int i36 = getHighSpeedVideoFpsRanges;
                        getHighResolutionOutputSizeshNQ4ISI = (((i36 | 65) << 1) - (i36 ^ 65)) % 128;
                        bArr21[i] = new byte[]{88};
                        bArr22[i] = bArr19;
                    }
                }
            }
            i = 0;
            bArr2 = this.getValidOutputFormatsForInputhNQ4ISI;
            if (bArr2 != null) {
            }
            bArr3 = this.getHighSpeedVideoSizesFor;
            if (bArr3 != null) {
            }
            bArr4 = this.CoroutineDebuggingKt;
            if (bArr4 != null) {
            }
            bArr5 = this.Camera2StreamConfigurationMap;
            if (bArr5 != null) {
                bArr21[i] = new byte[]{91};
                bArr22[i] = bArr5;
                i++;
            }
            bArr6 = this.unwrapAs;
            if (bArr6 != null) {
            }
            bArr7 = this.getHighSpeedVideoSizes;
            if (bArr7 != null) {
                bArr21[i] = new byte[]{93};
                int i192 = (i ^ 9) + ((i & 9) << 1);
                bArr22[i] = bArr7;
                i = ((i192 | (-8)) << 1) - (i192 ^ (-8));
            }
            bArr8 = this.getHighSpeedVideoFpsRangesFor;
            if (bArr8 != null) {
                i4 = getHighResolutionOutputSizeshNQ4ISI + 67;
                getHighSpeedVideoFpsRanges = i4 % 128;
                if (i4 % 2 == 0) {
                }
            }
            bArr9 = this.getInputFormats;
            if (bArr9 != null) {
            }
            bArr10 = this.getInputSizeshNQ4ISI;
            if (bArr10 != null) {
            }
            bArr11 = this.getOutputFormats;
            if (bArr11 != null) {
            }
            bArr12 = this.getOutputMinFrameDuration;
            if (bArr12 != null) {
                bArr21[i] = new byte[]{84};
                int i242 = (i & 78) + (i | 78);
                bArr22[i] = bArr12;
                i = (i242 & (-77)) + (i242 | (-77));
            }
            bArr13 = this.getOutputSizeshNQ4ISI;
            if (bArr13 != null) {
            }
            bArr14 = this.coroutineBoundary;
            if (bArr14 != null) {
                int i262 = getHighSpeedVideoFpsRanges;
                getHighResolutionOutputSizeshNQ4ISI = ((i262 & 25) + (i262 | 25)) % 128;
                bArr21[i] = new byte[]{85};
                bArr22[i] = bArr14;
                getHighResolutionOutputSizeshNQ4ISI = (i262 + 71) % 128;
                i++;
            }
            bArr15 = this.getOutputStallDurationlomOqCM;
            if (bArr15 != null) {
                int i272 = getHighResolutionOutputSizeshNQ4ISI;
                i3 = ((i272 | 117) << 1) - (i272 ^ 117);
                int i282 = i3 % 128;
                getHighSpeedVideoFpsRanges = i282;
                if (i3 % 2 == 0) {
                }
                getHighResolutionOutputSizeshNQ4ISI = (i282 + 93) % 128;
            }
            bArr16 = this.isOutputSupportedForhNQ4ISI;
            if (bArr16 != null) {
                bArr21[i] = new byte[]{82};
                bArr22[i] = bArr16;
                i = (i | 1) + (i & 1);
            }
            bArr17 = this.getOutputStallDuration;
            if (bArr17 != null) {
            }
            bArr18 = this.toString;
            if (bArr18 != null) {
            }
            bArr19 = this.isOutputSupportedFor;
            if (bArr19 != null) {
                int i362 = getHighSpeedVideoFpsRanges;
                getHighResolutionOutputSizeshNQ4ISI = (((i362 | 65) << 1) - (i362 ^ 65)) % 128;
                bArr21[i] = new byte[]{88};
                bArr22[i] = bArr19;
            }
        }
        byte[] m25024 = util.h.xy.al.rd.m25024(bArr21, bArr22);
        if (m25024 != null) {
            int i37 = getHighSpeedVideoFpsRanges;
            getHighResolutionOutputSizeshNQ4ISI = ((i37 ^ 111) + ((i37 & 111) << 1)) % 128;
            int length6 = m25024.length;
        }
        byte[] m250242 = util.h.xy.al.rd.m25024(bArr20, new byte[][]{m25024});
        int length7 = m250242.length;
        getHighSpeedVideoFpsRanges = (getHighResolutionOutputSizeshNQ4ISI + 13) % 128;
        util.h.xy.s.mb mbVar = this.getOutputSizes;
        if (mbVar == null) {
            int identityHashCode = java.lang.System.identityHashCode(this);
            int i38 = ((((identityHashCode ^ 1735750649) | (identityHashCode & 1735750649)) | (-1847028120)) * (-381)) - 159231638;
            int i39 = ~identityHashCode;
            int i40 = -(-(((~((i39 ^ 1735750649) | (i39 & 1735750649))) | (-157424239)) * 381));
            int identityHashCode2 = java.lang.System.identityHashCode(this);
            int i41 = ~(((-92307605) ^ identityHashCode2) | (identityHashCode2 & (-92307605)));
            int i42 = ~identityHashCode2;
            int i43 = (i42 ^ (-768377493)) | ((-768377493) & i42);
            if (((i38 & i40) + (i40 | i38)) - 351932178 > (((((((-1875826367) & i41) | ((-1875826367) ^ i41)) * (-476)) - 960278655) + (i41 * 952)) - (~(-(-((~((i43 ^ (-1199756479)) | ((-1199756479) & i43))) * 476))))) - 1) {
                m27216 = new byte[1];
                bArr = new byte[1];
            } else {
                m27216 = new byte[0];
                bArr = new byte[0];
            }
            int i44 = getHighSpeedVideoFpsRanges + 55;
            getHighResolutionOutputSizeshNQ4ISI = i44 % 128;
            int i45 = i44 % 2;
        } else {
            m27216 = mbVar.m27216();
            if (m27216 != null) {
                int i46 = getHighSpeedVideoFpsRanges;
                int i47 = (i46 ^ 49) + ((i46 & 49) << 1);
                getHighResolutionOutputSizeshNQ4ISI = i47 % 128;
                if (i47 % 2 == 0) {
                    int length8 = m27216.length;
                    throw null;
                }
                if (m27216.length != 0) {
                    bArr = util.h.xy.al.rd.m25023(new byte[]{34}, m27216);
                    int i48 = getHighResolutionOutputSizeshNQ4ISI;
                    getHighSpeedVideoFpsRanges = (((i48 | 109) << 1) - (i48 ^ 109)) % 128;
                }
            }
            bArr = new byte[0];
        }
        util.h.xy.ar.b.m25074(m27216);
        int length9 = bArr.length;
        util.h.xy.ar.b.m25074(bArr);
        int i49 = getHighResolutionOutputSizeshNQ4ISI;
        int i50 = (((i49 | 21) << 1) - (i49 ^ 21)) % 128;
        getHighSpeedVideoFpsRanges = i50;
        if (bArr != null) {
            getHighResolutionOutputSizeshNQ4ISI = (((i50 | 101) << 1) - (i50 ^ 101)) % 128;
            m25090 = util.h.xy.ar.b.m25090(m250242, bArr);
            getHighSpeedVideoFpsRanges = (getHighResolutionOutputSizeshNQ4ISI + 41) % 128;
        } else {
            m25090 = util.h.xy.ar.b.m25090(m250242);
        }
        int length10 = m25090.length;
        int identityHashCode3 = java.lang.System.identityHashCode(this);
        int i51 = ~identityHashCode3;
        int i52 = (~((i51 & (-1544074269)) | (i51 ^ (-1544074269)))) | 40976;
        int i53 = ~((i51 ^ (-48622483)) | (i51 & (-48622483)));
        int i54 = (((i53 ^ i52) | (i52 & i53)) * 464) + 1218534233;
        int i55 = 48622482 | identityHashCode3;
        int i56 = -(-((((-1544074269) ^ i55) | (i55 & (-1544074269))) * (-464)));
        int i57 = (i54 ^ i56) + ((i54 & i56) << 1);
        int i58 = ~((identityHashCode3 ^ (-48622483)) | (identityHashCode3 & (-48622483)));
        int i59 = ((i58 ^ 40976) | (i58 & 40976)) * 464;
        int identityHashCode4 = java.lang.System.identityHashCode(this);
        int i60 = ~identityHashCode4;
        int i61 = ((i60 ^ 2014712864) | (2014712864 & i60)) * 1324;
        int i62 = ~((2048300193 & identityHashCode4) | (2048300193 ^ identityHashCode4));
        int i63 = ~(identityHashCode4 | 2086624866);
        int i64 = (((((-1586263743) | i61) << 1) - (i61 ^ (-1586263743))) - (~(((i63 ^ i62) | (i63 & i62)) * (-1324)))) - 1;
        if ((i57 ^ i59) + ((i59 & i57) << 1) > (1121080386 & i64) + (1121080386 | i64)) {
            return m25090;
        }
        throw null;
    }

    public java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(util.h.xy.al.ra.f447);
        sb.append(util.h.xy.al.ra.f851);
        sb.append(this.getOutputSizes);
        sb.append(util.h.xy.al.ra.f456);
        sb.append(java.util.Arrays.toString(this.getOutputMinFrameDurationlomOqCM));
        sb.append(util.h.xy.al.ra.f849);
        sb.append(java.util.Arrays.toString(this.getValidOutputFormatsForInputhNQ4ISI));
        sb.append(util.h.xy.al.ra.f311);
        sb.append(java.util.Arrays.toString(this.getHighSpeedVideoSizesFor));
        sb.append(util.h.xy.al.ra.f301);
        sb.append(java.util.Arrays.toString(this.CoroutineDebuggingKt));
        sb.append(util.h.xy.al.ra.f390);
        sb.append(java.util.Arrays.toString(this.Camera2StreamConfigurationMap));
        sb.append(util.h.xy.al.ra.f321);
        sb.append(java.util.Arrays.toString(this.unwrapAs));
        sb.append(util.h.xy.al.ra.f316);
        sb.append(java.util.Arrays.toString(this.getHighSpeedVideoSizes));
        sb.append(util.h.xy.al.ra.f382);
        sb.append(java.util.Arrays.toString(this.getHighSpeedVideoFpsRangesFor));
        sb.append(util.h.xy.al.ra.f387);
        sb.append(java.util.Arrays.toString(this.getInputFormats));
        sb.append(util.h.xy.al.ra.f409);
        sb.append(java.util.Arrays.toString(this.getInputSizeshNQ4ISI));
        sb.append(util.h.xy.al.ra.f406);
        sb.append(java.util.Arrays.toString(this.getOutputFormats));
        sb.append(util.h.xy.al.ra.f401);
        sb.append(java.util.Arrays.toString(this.getOutputMinFrameDuration));
        sb.append(util.h.xy.al.ra.f411);
        sb.append(java.util.Arrays.toString(this.getOutputSizeshNQ4ISI));
        sb.append(util.h.xy.al.ra.f403);
        sb.append(java.util.Arrays.toString(this.coroutineBoundary));
        sb.append(util.h.xy.al.ra.f440);
        sb.append(java.util.Arrays.toString(this.getOutputStallDurationlomOqCM));
        sb.append(util.h.xy.al.ra.f422);
        sb.append(java.util.Arrays.toString(this.getOutputStallDuration));
        sb.append(util.h.xy.al.ra.f424);
        sb.append(java.util.Arrays.toString(this.toString));
        sb.append(util.h.xy.al.ra.f427);
        sb.append(java.util.Arrays.toString(this.isOutputSupportedFor));
        sb.append(util.h.xy.al.ra.f426);
        sb.append(java.util.Arrays.toString(this.isOutputSupportedForhNQ4ISI));
        sb.append(util.h.xy.al.ra.f460);
        sb.append(this.accessartificialFrame);
        sb.append(kotlinx.serialization.json.internal.AbstractJsonLexerKt.END_OBJ);
        java.lang.String obj = sb.toString();
        getHighResolutionOutputSizeshNQ4ISI = (getHighSpeedVideoFpsRanges + 105) % 128;
        return obj;
    }
}
