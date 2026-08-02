package util.h.xy.er;

/* loaded from: classes18.dex */
public abstract class mb {
    private static final java.math.BigInteger Camera2StreamConfigurationMap;
    private static int getHighResolutionOutputSizeshNQ4ISI = 0;
    private static int getHighSpeedVideoFpsRanges = 0;
    private static int getHighSpeedVideoFpsRangesFor = 1;
    private static boolean getHighSpeedVideoSizes = false;
    private static char[] getHighSpeedVideoSizesFor = null;
    private static int getInputFormats = 1;
    private static int getInputSizeshNQ4ISI;
    private static final java.math.BigInteger getOutputFormats;
    private static final java.math.BigInteger getOutputMinFrameDuration;
    private static boolean getOutputMinFrameDurationlomOqCM;

    private static void getHighResolutionOutputSizeshNQ4ISI(int i, java.lang.String str, java.lang.Object[] objArr) {
        getHighResolutionOutputSizeshNQ4ISI = (getHighSpeedVideoFpsRangesFor + 33) % 128;
        byte[] bytes = str.getBytes("ISO-8859-1");
        util.h.xz.b.md mdVar = new util.h.xz.b.md();
        char[] cArr = getHighSpeedVideoSizesFor;
        if (cArr != null) {
            int length = cArr.length;
            char[] cArr2 = new char[length];
            for (int i2 = 0; i2 < length; i2++) {
                getHighSpeedVideoFpsRangesFor = (getHighResolutionOutputSizeshNQ4ISI + 119) % 128;
                cArr2[i2] = (char) (cArr[i2] ^ (-3299939579226817547L));
            }
            cArr = cArr2;
        }
        int i3 = (int) ((-3299939579226817547L) ^ getInputSizeshNQ4ISI);
        if (!getHighSpeedVideoSizes) {
            if (!getOutputMinFrameDurationlomOqCM) {
                throw null;
            }
            throw null;
        }
        mdVar.f2642 = bytes.length;
        char[] cArr3 = new char[mdVar.f2642];
        mdVar.f2643 = 0;
        while (mdVar.f2643 < mdVar.f2642) {
            cArr3[mdVar.f2643] = (char) (cArr[bytes[(mdVar.f2642 - 1) - mdVar.f2643] + i] - i3);
            mdVar.f2643++;
        }
        objArr[0] = new java.lang.String(cArr3);
    }

    public static final class ra {
        private static int Camera2StreamConfigurationMap = 0;
        private static int getHighSpeedVideoFpsRanges = 1;
        private java.math.BigInteger getHighResolutionOutputSizeshNQ4ISI;
        private boolean getHighSpeedVideoSizes;

        static /* synthetic */ util.h.xy.er.mb.ra getHighSpeedVideoSizes() {
            int i = Camera2StreamConfigurationMap + 81;
            getHighSpeedVideoFpsRanges = i % 128;
            if (i % 2 != 0) {
                util.h.xy.er.mb.ra raVar = new util.h.xy.er.mb.ra(true, null);
                getHighSpeedVideoFpsRanges = (Camera2StreamConfigurationMap + 95) % 128;
                return raVar;
            }
            new util.h.xy.er.mb.ra(true, null);
            getHighSpeedVideoFpsRanges = (Camera2StreamConfigurationMap + 95) % 128;
            throw null;
        }

        static /* synthetic */ util.h.xy.er.mb.ra getHighSpeedVideoSizes(java.math.BigInteger bigInteger) {
            Camera2StreamConfigurationMap = (getHighSpeedVideoFpsRanges + 119) % 128;
            util.h.xy.er.mb.ra raVar = new util.h.xy.er.mb.ra(true, bigInteger);
            int i = Camera2StreamConfigurationMap;
            int i2 = ((i | 51) << 1) - (i ^ 51);
            int i3 = i2 % 128;
            getHighSpeedVideoFpsRanges = i3;
            if (i2 % 2 == 0) {
                throw new java.lang.ArithmeticException();
            }
            Camera2StreamConfigurationMap = (((i3 | 43) << 1) - (i3 ^ 43)) % 128;
            return raVar;
        }

        static /* synthetic */ util.h.xy.er.mb.ra getHighSpeedVideoFpsRangesFor() {
            int i = Camera2StreamConfigurationMap;
            getHighSpeedVideoFpsRanges = (((i | 93) << 1) - (i ^ 93)) % 128;
            util.h.xy.er.mb.ra raVar = new util.h.xy.er.mb.ra(false, null);
            int i2 = getHighSpeedVideoFpsRanges;
            Camera2StreamConfigurationMap = ((i2 & 71) + (i2 | 71)) % 128;
            Camera2StreamConfigurationMap = (((i2 | 99) << 1) - (i2 ^ 99)) % 128;
            return raVar;
        }

        /* renamed from: ˊ, reason: contains not printable characters */
        public final boolean m26702() {
            int i = Camera2StreamConfigurationMap;
            getHighSpeedVideoFpsRanges = (i + 107) % 128;
            boolean z = this.getHighSpeedVideoSizes;
            getHighSpeedVideoFpsRanges = (((i | 13) << 1) - (i ^ 13)) % 128;
            return z;
        }

        private ra(boolean z, java.math.BigInteger bigInteger) {
            this.getHighSpeedVideoSizes = z;
            this.getHighResolutionOutputSizeshNQ4ISI = bigInteger;
        }
    }

    static {
        getHighSpeedVideoFpsRanges();
        getOutputFormats = java.math.BigInteger.valueOf(1L);
        Camera2StreamConfigurationMap = java.math.BigInteger.valueOf(2L);
        getOutputMinFrameDuration = java.math.BigInteger.valueOf(3L);
        int i = getInputFormats + 99;
        getHighSpeedVideoFpsRanges = i % 128;
        if (i % 2 != 0) {
            throw null;
        }
    }

    /* renamed from: ˋ, reason: contains not printable characters */
    public static util.h.xy.er.mb.ra m26701(java.math.BigInteger bigInteger, java.security.SecureRandom secureRandom, int i) {
        boolean z;
        java.math.BigInteger bigInteger2;
        java.lang.Object[] objArr = new java.lang.Object[1];
        getHighResolutionOutputSizeshNQ4ISI((android.view.ViewConfiguration.getTapTimeout() >> 16) + 127, "\u0087\u0086\u0082\u0084\u0085\u0084\u0083\u0082\u0081", objArr);
        java.lang.String intern = ((java.lang.String) objArr[0]).intern();
        if (bigInteger != null) {
            getHighSpeedVideoFpsRanges = (getInputFormats + 119) % 128;
            if (bigInteger.signum() > 0) {
                getHighSpeedVideoFpsRanges = (getInputFormats + 25) % 128;
                if (bigInteger.bitLength() >= 2) {
                    if (secureRandom == null) {
                        java.lang.Object[] objArr2 = new java.lang.Object[1];
                        getHighResolutionOutputSizeshNQ4ISI(127 - (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), "\u008f\u008f\u008e\u0083\u008c\u0087\u008d\u008c\u0086\u008a\u0083\u0083\u0082\u0081\u008c\u0088\u008b\u008a\u0084\u0083\u0082\u0089\u0088", objArr2);
                        throw new java.lang.IllegalArgumentException(((java.lang.String) objArr2[0]).intern());
                    }
                    if (i <= 0) {
                        java.lang.Object[] objArr3 = new java.lang.Object[1];
                        getHighResolutionOutputSizeshNQ4ISI(127 - android.graphics.Color.alpha(0), "\u0092\u008c\u0091\u008c\u0087\u008d\u008c\u0086\u0090\u008e\u008b\u008c\u0088\u0090\u0083\u008a\u0085\u0086\u0082\u0089\u0087\u0086\u0085\u0088", objArr3);
                        throw new java.lang.IllegalArgumentException(((java.lang.String) objArr3[0]).intern());
                    }
                    if (bigInteger.bitLength() == 2) {
                        getHighSpeedVideoFpsRanges = (getInputFormats + 101) % 128;
                        return util.h.xy.er.mb.ra.getHighSpeedVideoFpsRangesFor();
                    }
                    if (!bigInteger.testBit(0)) {
                        return util.h.xy.er.mb.ra.getHighSpeedVideoSizes(Camera2StreamConfigurationMap);
                    }
                    java.math.BigInteger subtract = bigInteger.subtract(getOutputFormats);
                    java.math.BigInteger subtract2 = bigInteger.subtract(Camera2StreamConfigurationMap);
                    int lowestSetBit = subtract.getLowestSetBit();
                    java.math.BigInteger shiftRight = subtract.shiftRight(lowestSetBit);
                    int i2 = 0;
                    while (i2 < i) {
                        java.math.BigInteger m26835 = util.h.xy.fb.mb.m26835(Camera2StreamConfigurationMap, subtract2, secureRandom);
                        java.math.BigInteger gcd = m26835.gcd(bigInteger);
                        java.math.BigInteger bigInteger3 = getOutputFormats;
                        if (gcd.compareTo(bigInteger3) > 0) {
                            return util.h.xy.er.mb.ra.getHighSpeedVideoSizes(gcd);
                        }
                        java.math.BigInteger modPow = m26835.modPow(shiftRight, bigInteger);
                        if (!modPow.equals(bigInteger3) && !modPow.equals(subtract)) {
                            getHighSpeedVideoFpsRanges = (getInputFormats + 77) % 128;
                            int i3 = 1;
                            while (true) {
                                if (i3 >= lowestSetBit) {
                                    z = false;
                                    bigInteger2 = modPow;
                                    break;
                                }
                                bigInteger2 = modPow.modPow(Camera2StreamConfigurationMap, bigInteger);
                                if (bigInteger2.equals(subtract)) {
                                    getHighSpeedVideoFpsRanges = (getInputFormats + 87) % 128;
                                    z = true;
                                    break;
                                }
                                if (bigInteger2.equals(getOutputFormats)) {
                                    z = false;
                                    break;
                                }
                                i3++;
                                modPow = bigInteger2;
                            }
                            if (!z) {
                                java.math.BigInteger bigInteger4 = getOutputFormats;
                                if (!bigInteger2.equals(bigInteger4)) {
                                    modPow = bigInteger2.modPow(Camera2StreamConfigurationMap, bigInteger);
                                    if (modPow.equals(bigInteger4)) {
                                        modPow = bigInteger2;
                                    } else {
                                        getInputFormats = (getHighSpeedVideoFpsRanges + 1) % 128;
                                    }
                                }
                                java.math.BigInteger gcd2 = modPow.subtract(bigInteger4).gcd(bigInteger);
                                return gcd2.compareTo(bigInteger4) > 0 ? util.h.xy.er.mb.ra.getHighSpeedVideoSizes(gcd2) : util.h.xy.er.mb.ra.getHighSpeedVideoSizes();
                            }
                        }
                        i2++;
                        getInputFormats = (getHighSpeedVideoFpsRanges + 21) % 128;
                    }
                    return util.h.xy.er.mb.ra.getHighSpeedVideoFpsRangesFor();
                }
            }
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        java.lang.Object[] objArr4 = new java.lang.Object[1];
        getHighResolutionOutputSizeshNQ4ISI(android.view.KeyEvent.getDeadChar(0, 0) + 127, "\u0088", objArr4);
        sb.append(((java.lang.String) objArr4[0]).intern());
        sb.append(intern);
        java.lang.Object[] objArr5 = new java.lang.Object[1];
        getHighResolutionOutputSizeshNQ4ISI(android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0) + 128, "\u0095\u008c\u0094\u0091\u008c\u0084\u0083\u0082\u008c\u008f\u008f\u008e\u0083\u0093\u0083\u008a\u0083\u008c\u0087\u008d\u008c\u0086\u0090\u008e\u008b\u008c\u0088", objArr5);
        sb.append(((java.lang.String) objArr5[0]).intern());
        throw new java.lang.IllegalArgumentException(sb.toString());
    }

    static void getHighSpeedVideoFpsRanges() {
        getHighSpeedVideoSizesFor = new char[]{64114, 64112, 64103, 64125, 64120, 64109, 64124, 64190, 64099, 64102, 64100, 64177, 64115, 64108, 64101, 64098, 64151, 64161, 64164, 64148, 64163};
        getInputSizeshNQ4ISI = -1074857263;
        getOutputMinFrameDurationlomOqCM = true;
        getHighSpeedVideoSizes = true;
    }
}
