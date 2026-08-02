package util.h.xy.j;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* loaded from: classes5.dex */
public final class ma {
    private static int[] Camera2StreamConfigurationMap = null;
    private static int getHighResolutionOutputSizeshNQ4ISI = 1;
    private static int getHighSpeedVideoFpsRanges = 0;
    private static int getHighSpeedVideoFpsRangesFor = 1;
    private static int getHighSpeedVideoSizes;
    private static final /* synthetic */ util.h.xy.j.ma[] getInputFormats;
    private static final java.lang.String getOutputFormats;

    /* renamed from: ᐝ, reason: contains not printable characters */
    public static final util.h.xy.j.ma f2241;
    private com.gemalto.mfs.mwsdk.payment.CHVerificationMethod getHighSpeedVideoSizesFor = null;

    private ma(java.lang.String str) {
    }

    public static util.h.xy.j.ma valueOf(java.lang.String str) {
        getHighResolutionOutputSizeshNQ4ISI = (getHighSpeedVideoFpsRanges + 93) % 128;
        util.h.xy.j.ma maVar = (util.h.xy.j.ma) java.lang.Enum.valueOf(util.h.xy.j.ma.class, str);
        int i = getHighSpeedVideoFpsRanges + 3;
        getHighResolutionOutputSizeshNQ4ISI = i % 128;
        if (i % 2 != 0) {
            return maVar;
        }
        throw null;
    }

    public static util.h.xy.j.ma[] values() {
        getHighSpeedVideoFpsRanges = (getHighResolutionOutputSizeshNQ4ISI + 35) % 128;
        util.h.xy.j.ma[] maVarArr = (util.h.xy.j.ma[]) getInputFormats.clone();
        getHighResolutionOutputSizeshNQ4ISI = (getHighSpeedVideoFpsRanges + 53) % 128;
        return maVarArr;
    }

    static {
        int i;
        getHighSpeedVideoFpsRangesFor();
        int[] iArr = {1656305511, -2042262048, 2041029418, -1476763046};
        int lastIndexOf = android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask) + 9;
        util.h.xz.b.c cVar = new util.h.xz.b.c();
        char[] cArr = new char[4];
        char[] cArr2 = new char[8];
        int[] iArr2 = Camera2StreamConfigurationMap;
        if (iArr2 != null) {
            int length = iArr2.length;
            int[] iArr3 = new int[length];
            for (int i2 = 0; i2 < length; i2++) {
                getHighSpeedVideoSizes = (getHighSpeedVideoFpsRangesFor + 5) % 128;
                iArr3[i2] = (int) (iArr2[i2] ^ (-5569649899877129369L));
            }
            iArr2 = iArr3;
        }
        int length2 = iArr2.length;
        int[] iArr4 = new int[length2];
        int[] iArr5 = Camera2StreamConfigurationMap;
        int i3 = 2;
        if (iArr5 != null) {
            int length3 = iArr5.length;
            int[] iArr6 = new int[length3];
            int i4 = 0;
            while (i4 < length3) {
                int i5 = getHighSpeedVideoFpsRangesFor + 109;
                getHighSpeedVideoSizes = i5 % 128;
                if (i5 % i3 != 0) {
                    i = length3;
                    iArr6[i4] = (int) (iArr5[i4] + 5569649899877129369L);
                } else {
                    i = length3;
                    iArr6[i4] = (int) (iArr5[i4] ^ (-5569649899877129369L));
                    i4++;
                }
                length3 = i;
                i3 = 2;
            }
            iArr5 = iArr6;
        }
        java.lang.System.arraycopy(iArr5, 0, iArr4, 0, length2);
        cVar.f2626 = 0;
        while (cVar.f2626 < 4) {
            getHighSpeedVideoSizes = (getHighSpeedVideoFpsRangesFor + 81) % 128;
            cArr[0] = (char) (iArr[cVar.f2626] >> 16);
            cArr[1] = (char) iArr[cVar.f2626];
            cArr[2] = (char) (iArr[cVar.f2626 + 1] >> 16);
            cArr[3] = (char) iArr[cVar.f2626 + 1];
            cVar.f2627 = (cArr[0] << 16) + cArr[1];
            cVar.f2625 = (cArr[2] << 16) + cArr[3];
            util.h.xz.b.c.m27723(iArr4);
            for (int i6 = 0; i6 < 16; i6++) {
                cVar.f2627 ^= iArr4[i6];
                cVar.f2625 = util.h.xz.b.c.m27724(cVar.f2627) ^ cVar.f2625;
                int i7 = cVar.f2627;
                cVar.f2627 = cVar.f2625;
                cVar.f2625 = i7;
            }
            int i8 = cVar.f2627;
            cVar.f2627 = cVar.f2625;
            cVar.f2625 = i8;
            cVar.f2625 ^= iArr4[16];
            cVar.f2627 ^= iArr4[17];
            int i9 = cVar.f2627;
            int i10 = cVar.f2625;
            cArr[0] = (char) (cVar.f2627 >>> 16);
            cArr[1] = (char) cVar.f2627;
            cArr[2] = (char) (cVar.f2625 >>> 16);
            cArr[3] = (char) cVar.f2625;
            util.h.xz.b.c.m27723(iArr4);
            cArr2[cVar.f2626 * 2] = cArr[0];
            cArr2[(cVar.f2626 * 2) + 1] = cArr[1];
            cArr2[(cVar.f2626 * 2) + 2] = cArr[2];
            cArr2[(cVar.f2626 * 2) + 3] = cArr[3];
            cVar.f2626 += 2;
            getHighSpeedVideoFpsRangesFor = (getHighSpeedVideoSizes + 125) % 128;
        }
        util.h.xy.j.ma maVar = new util.h.xy.j.ma(new java.lang.String(cArr2, 0, lastIndexOf).intern());
        f2241 = maVar;
        int i11 = (getHighSpeedVideoFpsRanges + 53) % 128;
        getHighResolutionOutputSizeshNQ4ISI = i11;
        util.h.xy.j.ma[] maVarArr = {maVar};
        int i12 = i11 + 115;
        getHighSpeedVideoFpsRanges = i12 % 128;
        if (i12 % 2 != 0) {
            throw null;
        }
        getInputFormats = maVarArr;
        getOutputFormats = util.h.xy.j.ma.class.getName();
        int i13 = getHighResolutionOutputSizeshNQ4ISI + 115;
        getHighSpeedVideoFpsRanges = i13 % 128;
        if (i13 % 2 != 0) {
            throw null;
        }
    }

    /* renamed from: ᐝ, reason: contains not printable characters */
    public final boolean m26903(com.gemalto.mfs.mwsdk.payment.CHVerificationMethod cHVerificationMethod) {
        int i = getHighResolutionOutputSizeshNQ4ISI + 51;
        getHighSpeedVideoFpsRanges = i % 128;
        if (i % 2 == 0) {
            return Camera2StreamConfigurationMap(cHVerificationMethod);
        }
        Camera2StreamConfigurationMap(cHVerificationMethod);
        throw null;
    }

    /* renamed from: ˋ, reason: contains not printable characters */
    public final com.gemalto.mfs.mwsdk.payment.CHVerificationMethod m26900() {
        getHighResolutionOutputSizeshNQ4ISI = (getHighSpeedVideoFpsRanges + 19) % 128;
        com.gemalto.mfs.mwsdk.payment.CHVerificationMethod highSpeedVideoFpsRanges = getHighSpeedVideoFpsRanges();
        int i = getHighSpeedVideoFpsRanges + 71;
        getHighResolutionOutputSizeshNQ4ISI = i % 128;
        if (i % 2 != 0) {
            return highSpeedVideoFpsRanges;
        }
        throw new java.lang.ArithmeticException();
    }

    /* renamed from: ˏ, reason: contains not printable characters */
    public final boolean m26902() {
        getHighResolutionOutputSizeshNQ4ISI = (getHighSpeedVideoFpsRanges + 15) % 128;
        try {
            byte[] m24995 = util.h.xy.ak.ma.f84.m24995();
            if (java.util.Arrays.equals(util.h.xy.u.b.f2432.m27489(), m24995)) {
                return false;
            }
            if (!java.util.Arrays.equals(util.h.xy.u.b.f2435.m27489(), m24995)) {
                int i = getHighResolutionOutputSizeshNQ4ISI + 53;
                getHighSpeedVideoFpsRanges = i % 128;
                if (i % 2 == 0) {
                    if (!java.util.Arrays.equals(util.h.xy.u.b.f2433.m27489(), m24995)) {
                        return false;
                    }
                } else {
                    java.util.Arrays.equals(util.h.xy.u.b.f2433.m27489(), m24995);
                    throw new java.lang.ArithmeticException();
                }
            }
            return true;
        } catch (java.lang.Exception e) {
            e.getMessage();
            return false;
        }
    }

    /* renamed from: ˊ, reason: contains not printable characters */
    public final boolean m26899() {
        boolean z;
        if (getHighSpeedVideoFpsRanges() != null) {
            getHighSpeedVideoFpsRanges = (getHighResolutionOutputSizeshNQ4ISI + 121) % 128;
            z = true;
        } else {
            z = false;
        }
        getHighSpeedVideoFpsRanges = (getHighResolutionOutputSizeshNQ4ISI + 37) % 128;
        return z;
    }

    private com.gemalto.mfs.mwsdk.payment.CHVerificationMethod getHighSpeedVideoFpsRanges() {
        com.gemalto.mfs.mwsdk.payment.CHVerificationMethod cHVerificationMethod = this.getHighSpeedVideoSizesFor;
        if (cHVerificationMethod == null) {
            try {
                byte[] m26904 = m26904();
                if (m26904 != null) {
                    getHighResolutionOutputSizeshNQ4ISI = (getHighSpeedVideoFpsRanges + 53) % 128;
                    return util.h.xy.ap.mb.m25037(m26904);
                }
            } catch (java.lang.Exception e) {
                e.getMessage();
            }
            return null;
        }
        int i = getHighSpeedVideoFpsRanges + 45;
        getHighResolutionOutputSizeshNQ4ISI = i % 128;
        if (i % 2 != 0) {
            return cHVerificationMethod;
        }
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:6:0x0061 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0062  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:12:0x0052 -> B:3:0x0055). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private boolean Camera2StreamConfigurationMap(com.gemalto.mfs.mwsdk.payment.CHVerificationMethod cHVerificationMethod) {
        int i;
        cHVerificationMethod.getValue();
        boolean z = true;
        byte[] bArr = {0};
        if (m26902()) {
            try {
                if (cHVerificationMethod == com.gemalto.mfs.mwsdk.payment.CHVerificationMethod.WALLET_PIN) {
                    m26901(com.gemalto.mfs.mwsdk.payment.CHVerificationMethod.WALLET_PIN);
                    bArr[0] = 1;
                    util.h.xy.f.b.f2201.m26764(util.h.xy.f.ma.f2208, bArr, false);
                } else if (cHVerificationMethod == com.gemalto.mfs.mwsdk.payment.CHVerificationMethod.BIOMETRICS) {
                    m26901(com.gemalto.mfs.mwsdk.payment.CHVerificationMethod.BIOMETRICS);
                    bArr[0] = 2;
                    util.h.xy.f.b.f2201.m26764(util.h.xy.f.ma.f2208, bArr, false);
                } else if (cHVerificationMethod == com.gemalto.mfs.mwsdk.payment.CHVerificationMethod.DEVICE_KEYGUARD) {
                    getHighResolutionOutputSizeshNQ4ISI = (getHighSpeedVideoFpsRanges + 3) % 128;
                    m26901(com.gemalto.mfs.mwsdk.payment.CHVerificationMethod.DEVICE_KEYGUARD);
                    bArr[0] = 3;
                    util.h.xy.f.b.f2201.m26764(util.h.xy.f.ma.f2208, bArr, false);
                }
            } catch (com.gemalto.mfs.mwsdk.exception.InternalComponentException e) {
                e.getMessage();
            }
            i = getHighSpeedVideoFpsRanges + 89;
            getHighResolutionOutputSizeshNQ4ISI = i % 128;
            if (i % 2 == 0) {
                return z;
            }
            throw null;
        }
        z = false;
        i = getHighSpeedVideoFpsRanges + 89;
        getHighResolutionOutputSizeshNQ4ISI = i % 128;
        if (i % 2 == 0) {
        }
    }

    /* renamed from: ˊ, reason: contains not printable characters */
    public final void m26898(com.gemalto.mfs.mwsdk.payment.CHVerificationMethod cHVerificationMethod) {
        int i = getHighSpeedVideoFpsRanges;
        int i2 = i + 99;
        getHighResolutionOutputSizeshNQ4ISI = i2 % 128;
        if (i2 % 2 != 0) {
            this.getHighSpeedVideoSizesFor = cHVerificationMethod;
            getHighResolutionOutputSizeshNQ4ISI = (i + 125) % 128;
        } else {
            this.getHighSpeedVideoSizesFor = cHVerificationMethod;
            throw null;
        }
    }

    /* renamed from: ˋ, reason: contains not printable characters */
    public final void m26901(com.gemalto.mfs.mwsdk.payment.CHVerificationMethod cHVerificationMethod) throws com.gemalto.mfs.mwsdk.exception.InternalComponentException {
        int i = getHighSpeedVideoFpsRanges + 51;
        getHighResolutionOutputSizeshNQ4ISI = i % 128;
        if (i % 2 != 0) {
            util.h.xy.ak.ma.f84.m24987(util.h.xy.ap.mb.m25038(cHVerificationMethod));
            getHighSpeedVideoFpsRanges = (getHighResolutionOutputSizeshNQ4ISI + 51) % 128;
        } else {
            util.h.xy.ak.ma.f84.m24987(util.h.xy.ap.mb.m25038(cHVerificationMethod));
            throw null;
        }
    }

    /* renamed from: ᐝ, reason: contains not printable characters */
    public final byte[] m26904() {
        getHighResolutionOutputSizeshNQ4ISI = (getHighSpeedVideoFpsRanges + 79) % 128;
        byte[] m24981 = util.h.xy.ak.ma.f84.m24981();
        getHighResolutionOutputSizeshNQ4ISI = (getHighSpeedVideoFpsRanges + 1) % 128;
        return m24981;
    }

    static void getHighSpeedVideoFpsRangesFor() {
        Camera2StreamConfigurationMap = new int[]{-836579991, -1663194015, -552098509, 79234599, -2016433307, 1694391912, -805242316, 964913152, -3099363, -1713965713, -1277042029, 1205945885, 1380901544, -2107804664, -76137593, 748884060, -670761879, -685335271};
    }
}
