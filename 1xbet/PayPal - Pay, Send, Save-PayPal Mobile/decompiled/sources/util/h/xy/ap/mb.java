package util.h.xy.ap;

/* loaded from: classes5.dex */
public class mb {
    private static int getHighResolutionOutputSizeshNQ4ISI = 1;
    private static int getHighSpeedVideoFpsRanges;

    static {
        int i = getHighResolutionOutputSizeshNQ4ISI;
        int i2 = ((i | 33) << 1) - (i ^ 33);
        getHighSpeedVideoFpsRanges = i2 % 128;
        if (i2 % 2 != 0) {
            throw null;
        }
    }

    /* renamed from: ᐝ, reason: contains not printable characters */
    public static byte[] m25038(com.gemalto.mfs.mwsdk.payment.CHVerificationMethod cHVerificationMethod) {
        int i = getHighResolutionOutputSizeshNQ4ISI + 33;
        getHighSpeedVideoFpsRanges = i % 128;
        if (i % 2 == 0) {
            return cHVerificationMethod.toString().getBytes();
        }
        throw null;
    }

    /* renamed from: ᐝ, reason: contains not printable characters */
    public static com.gemalto.mfs.mwsdk.payment.CHVerificationMethod m25037(byte[] bArr) {
        int i = getHighResolutionOutputSizeshNQ4ISI;
        int i2 = i + 99;
        int i3 = i2 % 128;
        getHighSpeedVideoFpsRanges = i3;
        if (i2 % 2 != 0) {
            throw new java.lang.ArithmeticException();
        }
        if (bArr != null) {
            if (bArr.length > 0) {
                if (java.util.Arrays.equals(com.gemalto.mfs.mwsdk.payment.CHVerificationMethod.NONE.toString().getBytes(), bArr)) {
                    int i4 = getHighSpeedVideoFpsRanges + 111;
                    getHighResolutionOutputSizeshNQ4ISI = i4 % 128;
                    if (i4 % 2 != 0) {
                        return com.gemalto.mfs.mwsdk.payment.CHVerificationMethod.NONE;
                    }
                    com.gemalto.mfs.mwsdk.payment.CHVerificationMethod cHVerificationMethod = com.gemalto.mfs.mwsdk.payment.CHVerificationMethod.NONE;
                    throw null;
                }
                if (java.util.Arrays.equals(com.gemalto.mfs.mwsdk.payment.CHVerificationMethod.WALLET_PIN.toString().getBytes(), bArr)) {
                    int i5 = getHighSpeedVideoFpsRanges;
                    getHighResolutionOutputSizeshNQ4ISI = ((i5 ^ 67) + ((i5 & 67) << 1)) % 128;
                    return com.gemalto.mfs.mwsdk.payment.CHVerificationMethod.WALLET_PIN;
                }
                if (java.util.Arrays.equals(com.gemalto.mfs.mwsdk.payment.CHVerificationMethod.DEVICE_KEYGUARD.toString().getBytes(), bArr)) {
                    getHighResolutionOutputSizeshNQ4ISI = (getHighSpeedVideoFpsRanges + 85) % 128;
                    com.gemalto.mfs.mwsdk.payment.CHVerificationMethod cHVerificationMethod2 = com.gemalto.mfs.mwsdk.payment.CHVerificationMethod.DEVICE_KEYGUARD;
                    int i6 = getHighSpeedVideoFpsRanges;
                    getHighResolutionOutputSizeshNQ4ISI = ((i6 & 39) + (i6 | 39)) % 128;
                    return cHVerificationMethod2;
                }
                if (java.util.Arrays.equals(com.gemalto.mfs.mwsdk.payment.CHVerificationMethod.BIOMETRICS.toString().getBytes(), bArr)) {
                    return com.gemalto.mfs.mwsdk.payment.CHVerificationMethod.BIOMETRICS;
                }
                if (java.util.Arrays.equals(util.h.xy.al.ra.f434.getBytes(), bArr)) {
                    return com.gemalto.mfs.mwsdk.payment.CHVerificationMethod.BIOMETRICS;
                }
                return null;
            }
            int i7 = i + 73;
            getHighSpeedVideoFpsRanges = i7 % 128;
            if (i7 % 2 == 0) {
                return null;
            }
            throw null;
        }
        int i8 = (i3 ^ 121) + ((i3 & 121) << 1);
        getHighResolutionOutputSizeshNQ4ISI = i8 % 128;
        if (i8 % 2 != 0) {
            return null;
        }
        throw new java.lang.ArithmeticException();
    }
}
