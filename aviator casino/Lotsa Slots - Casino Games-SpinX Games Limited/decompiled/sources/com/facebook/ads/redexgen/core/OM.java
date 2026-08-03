package com.facebook.ads.redexgen.core;

/* loaded from: assets/audience_network/classes2.dex */
public final class OM {
    public static byte[] A00;
    public static java.lang.String[] A01 = {"NpBoDzCQyjOF8OFx9MsnsgXANanqzzj6", "RSaml0mwJ5MGBXbUX4Y7eJ496TcnwqpH", "O6M6", "HC1y", "xJAb", "6P21Vz3Cvscq5f42i51asuNZrA3r2siu", "D2rYJRkohSsxhH", "5Vn2BbDuwzZpkNg8pcGLkugAGTBH17kk"};
    public static final java.lang.String A02;

    public static java.lang.String A00(int i, int i2, int i3) {
        byte[] copyOfRange = java.util.Arrays.copyOfRange(A00, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 97);
        }
        return new java.lang.String(copyOfRange);
    }

    public static void A01() {
        A00 = new byte[]{kotlin.io.encoding.Base64.padSymbol, 32, 32, 32, 48, 48, 48, 48, 48, 48, 48, 48, 48, 33, 33, 33, 33, 33, 33, 33, 33, 49, 49, 49, 44, 78, 101, 98, 104, 101, 98, 107, 44, 120, 99, 44, Byte.MAX_VALUE, 105, 126, 122, 101, 111, 105, 44, Byte.MAX_VALUE, 121, 111, 111, 105, Byte.MAX_VALUE, Byte.MAX_VALUE, 44, 49, 44, 44, 85, 66, 89, 83, 91, 82, 72, 82, 79, 67, 69, 86, 68, 72, 92, 82, 78, 73, 78, 72, 69, 73, 95, 72, 76, 83, 89, 95, 69, 95, 66, 78, 72, 91, 73, com.google.common.base.Ascii.DC2, com.google.common.base.Ascii.NAK, 19, com.google.common.base.Ascii.RS, com.google.common.base.Ascii.DC2, 4, 19, com.google.common.base.Ascii.ETB, 8, 2, 4, com.google.common.base.Ascii.RS, com.google.common.base.Ascii.DC2, 5, 10, com.google.common.base.Ascii.RS, com.google.common.base.Ascii.ETB, 4, 19, com.google.common.base.Ascii.DC2, 8, com.google.common.base.Ascii.SO, com.google.common.base.Ascii.SI, 77, 65, 67, 0, 72, 79, 77, 75, 76, 65, 65, 69, 0, 79, 74, 93, 0, 71, com.google.common.primitives.SignedBytes.MAX_POWER_OF_TWO, 90, 75, 92, com.google.common.primitives.SignedBytes.MAX_POWER_OF_TWO, 79, 66, 0, 71, 94, 77, 0, 111, 91, 74, 71, 75, com.google.common.primitives.SignedBytes.MAX_POWER_OF_TWO, 77, 75, 96, 75, 90, 89, 65, 92, 69, 124, 75, 67, 65, 90, 75, 125, 75, 92, 88, 71, 77, 75, com.google.common.base.Ascii.US, 19, 17, 82, com.google.common.base.Ascii.SUB, com.google.common.base.Ascii.GS, com.google.common.base.Ascii.US, com.google.common.base.Ascii.EM, com.google.common.base.Ascii.RS, 19, 19, com.google.common.base.Ascii.ETB, 82, com.google.common.base.Ascii.ETB, com.google.common.base.Ascii.GS, 8, com.google.common.base.Ascii.GS, com.google.common.base.Ascii.DC2, com.google.common.base.Ascii.GS};
    }

    static {
        A01();
        A02 = com.facebook.ads.redexgen.core.OM.class.getSimpleName();
    }

    public static void A02(com.facebook.ads.redexgen.core.C1632ge c1632ge, android.os.Message message) {
        android.os.Bundle bundle = message.getData().getBundle(A00(55, 17, 118));
        if (bundle != null) {
            com.facebook.ads.redexgen.core.U5.A06(c1632ge, bundle.getString(A00(90, 23, 32)), bundle.getString(A00(72, 18, 123)));
        }
    }

    public static boolean A03(android.content.Context context, java.lang.String str) {
        android.content.pm.PackageManager packageManager;
        if (!A00(171, 19, 29).equals(str) || (packageManager = context.getPackageManager()) == null) {
            return false;
        }
        try {
            boolean validationPassed = com.facebook.ads.internal.util.common.FbValidationUtils.isFbSigningCertificateValid(com.facebook.ads.internal.util.common.FbValidationUtils.getSigningCertificate(packageManager.getPackageInfo(str, 64)));
            return validationPassed;
        } catch (android.content.pm.PackageManager.NameNotFoundException unused) {
            return false;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x004f, code lost:
    
        if (r0 != false) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0028, code lost:
    
        if (r3 != false) goto L9;
     */
    /* JADX WARN: Removed duplicated region for block: B:13:0x002d  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00a3 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static boolean A04(com.facebook.ads.redexgen.core.C1632ge c1632ge, boolean z, android.content.ServiceConnection serviceConnection) {
        boolean forceBypassValidation;
        boolean forceBypassValidation2;
        boolean forceBypassValidation3;
        boolean z2 = false;
        if (c1632ge.A05().AAO()) {
            if (!z) {
                boolean A1d = com.facebook.ads.redexgen.core.C1086Up.A1d(c1632ge);
                if (A01[1].charAt(26) == '5') {
                    throw new java.lang.RuntimeException();
                }
                A01[7] = "wVoKdL5DefY3vFtz3wgH19EGFsYG1twM";
            }
            forceBypassValidation = true;
            if (!forceBypassValidation) {
                boolean forceBypassValidation4 = A03(c1632ge, com.facebook.ads.redexgen.core.AbstractC1089Us.A05(z));
                if (!forceBypassValidation4) {
                    forceBypassValidation2 = false;
                    if (!forceBypassValidation2) {
                        return false;
                    }
                    android.content.Intent intent = new android.content.Intent();
                    if (!z) {
                        boolean forceBypassValidation5 = c1632ge.A05().AAO();
                        if (forceBypassValidation5) {
                            boolean forceBypassValidation6 = com.facebook.ads.redexgen.core.C1086Up.A1d(c1632ge);
                        }
                        boolean bindService = c1632ge.bindService(intent.setComponent(new android.content.ComponentName(com.facebook.ads.redexgen.core.AbstractC1089Us.A05(z2), A00(113, 58, 79))), serviceConnection, 1);
                        forceBypassValidation3 = c1632ge.A05().AAO();
                        if (forceBypassValidation3) {
                            java.lang.String str = A00(13, 42, 109) + bindService + A00(0, 13, 124);
                        }
                        return bindService;
                    }
                    z2 = true;
                    boolean bindService2 = c1632ge.bindService(intent.setComponent(new android.content.ComponentName(com.facebook.ads.redexgen.core.AbstractC1089Us.A05(z2), A00(113, 58, 79))), serviceConnection, 1);
                    forceBypassValidation3 = c1632ge.A05().AAO();
                    if (forceBypassValidation3) {
                    }
                    return bindService2;
                }
            }
            forceBypassValidation2 = true;
            if (!forceBypassValidation2) {
            }
        }
        forceBypassValidation = false;
        if (!forceBypassValidation) {
        }
        forceBypassValidation2 = true;
        if (!forceBypassValidation2) {
        }
    }
}
