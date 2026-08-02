package util.h.xy.dh;

/* loaded from: classes5.dex */
public class k extends util.h.xy.dh.mi {
    private static int Camera2StreamConfigurationMap = 1;
    private static int getHighResolutionOutputSizeshNQ4ISI;
    static final util.h.xy.dh.p getHighSpeedVideoFpsRangesFor = new util.h.xy.dh.p(util.h.xy.dh.k.class) { // from class: util.h.xy.dh.k.2
        private static int getHighResolutionOutputSizeshNQ4ISI = 1;
        private static int getHighSpeedVideoSizes;

        @Override // util.h.xy.dh.p
        final util.h.xy.dh.mi getHighSpeedVideoFpsRangesFor(util.h.xy.dh.mz mzVar) {
            int i = getHighSpeedVideoSizes;
            int i2 = (i & 9) + (i | 9);
            getHighResolutionOutputSizeshNQ4ISI = i2 % 128;
            int i3 = i2 % 2;
            util.h.xy.dh.k highSpeedVideoSizes = util.h.xy.dh.k.getHighSpeedVideoSizes(mzVar.m26337());
            int i4 = getHighSpeedVideoSizes;
            int i5 = (i4 ^ 57) + ((i4 & 57) << 1);
            getHighResolutionOutputSizeshNQ4ISI = i5 % 128;
            if (i5 % 2 != 0) {
                return highSpeedVideoSizes;
            }
            throw null;
        }
    };
    private final java.lang.String getHighSpeedVideoFpsRanges;
    private byte[] getHighSpeedVideoSizes;

    static {
        int i = getHighResolutionOutputSizeshNQ4ISI;
        int i2 = (i ^ 43) + ((i & 43) << 1);
        Camera2StreamConfigurationMap = i2 % 128;
        if (i2 % 2 == 0) {
            throw null;
        }
    }

    static void getHighSpeedVideoFpsRangesFor(java.io.ByteArrayOutputStream byteArrayOutputStream, java.math.BigInteger bigInteger) {
        int i = getHighResolutionOutputSizeshNQ4ISI;
        Camera2StreamConfigurationMap = (((i | 109) << 1) - (i ^ 109)) % 128;
        int bitLength = bigInteger.bitLength();
        int currentTimeMillis = (int) java.lang.System.currentTimeMillis();
        int i2 = -(-(bitLength * (-590)));
        int i3 = ((i2 | 3552) << 1) - (i2 ^ 3552);
        int i4 = -(-((~((bitLength ^ (-7)) | (bitLength & (-7)))) * (-1182)));
        int i5 = ~bitLength;
        int i6 = (i5 ^ (-7)) | (i5 & (-7));
        int i7 = ~currentTimeMillis;
        int i8 = ~((i6 ^ i7) | (i6 & i7));
        int i9 = ~((bitLength ^ 6) | (bitLength & 6));
        int i10 = (i3 & i4) + (i4 | i3) + (((i9 ^ i8) | (i9 & i8)) * (-591));
        int i11 = (currentTimeMillis ^ (-7)) | (currentTimeMillis & (-7));
        int i12 = -(-(((i11 ^ i5) | (i11 & i5)) * 591));
        int i13 = ((i10 ^ i12) + ((i12 & i10) << 1)) / 7;
        if (i13 == 0) {
            Camera2StreamConfigurationMap = (getHighResolutionOutputSizeshNQ4ISI + 71) % 128;
            byteArrayOutputStream.write(0);
            return;
        }
        byte[] bArr = new byte[i13];
        int currentTimeMillis2 = (int) java.lang.System.currentTimeMillis();
        int i14 = -(-(i13 * 530));
        int i15 = ~currentTimeMillis2;
        int i16 = (((i14 & 528) + (i14 | 528)) - (~((~((~i15) | i15)) * 529))) - 1;
        int i17 = ~i13;
        int i18 = ~(currentTimeMillis2 | (currentTimeMillis2 ^ (-1)));
        int i19 = -(-(((i18 ^ i17) | (i18 & i17)) * 529));
        int i20 = ((i16 | i19) << 1) - (i19 ^ i16);
        getHighResolutionOutputSizeshNQ4ISI = (Camera2StreamConfigurationMap + 55) % 128;
        while (i20 >= 0) {
            int i21 = Camera2StreamConfigurationMap + 19;
            getHighResolutionOutputSizeshNQ4ISI = i21 % 128;
            if (i21 % 2 != 0) {
                bArr[i20] = (byte) (bigInteger.intValue() | 3654);
                bigInteger = bigInteger.shiftRight(62);
                i20 = ((i20 ^ com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_WALLET_VALUE) + ((i20 & com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_WALLET_VALUE) << 1)) - 96;
            } else {
                int intValue = bigInteger.intValue();
                bArr[i20] = (byte) ((intValue ^ 128) | (intValue & 128));
                bigInteger = bigInteger.shiftRight(7);
                i20--;
            }
            int i22 = Camera2StreamConfigurationMap;
            getHighResolutionOutputSizeshNQ4ISI = ((i22 & 47) + (i22 | 47)) % 128;
        }
        int i23 = (-2) - i17;
        bArr[i23] = (byte) (bArr[i23] & Byte.MAX_VALUE);
        byteArrayOutputStream.write(bArr, 0, i13);
        int i24 = Camera2StreamConfigurationMap + 49;
        getHighResolutionOutputSizeshNQ4ISI = i24 % 128;
        int i25 = i24 % 2;
    }

    static void getHighSpeedVideoFpsRangesFor(java.io.ByteArrayOutputStream byteArrayOutputStream, long j) {
        byte[] bArr;
        int i;
        int i2 = Camera2StreamConfigurationMap + 53;
        getHighResolutionOutputSizeshNQ4ISI = i2 % 128;
        if (i2 % 2 != 0) {
            bArr = new byte[34];
            i = 90;
            bArr[90] = (byte) (((int) j) & 10);
        } else {
            bArr = new byte[9];
            i = 8;
            bArr[8] = (byte) (((int) j) & 127);
        }
        while (j >= 128) {
            int i3 = (Camera2StreamConfigurationMap + 1) % 128;
            getHighResolutionOutputSizeshNQ4ISI = i3;
            j >>= 7;
            int i4 = (i ^ 10) + ((i & 10) << 1);
            i = ((i4 | (-11)) << 1) - (i4 ^ (-11));
            bArr[i] = (byte) (((int) j) | 128);
            Camera2StreamConfigurationMap = (((i3 | 21) << 1) - (i3 ^ 21)) % 128;
        }
        int i5 = -i;
        byteArrayOutputStream.write(bArr, i, (i5 ^ 9) + ((i5 & 9) << 1));
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x002c, code lost:
    
        if (r3 == 0) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x002e, code lost:
    
        r5 = (util.h.xy.dh.k.Camera2StreamConfigurationMap + 7) % 128;
        util.h.xy.dh.k.getHighResolutionOutputSizeshNQ4ISI = r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0036, code lost:
    
        if (r3 <= 1) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0038, code lost:
    
        util.h.xy.dh.k.Camera2StreamConfigurationMap = (((r5 | 81) << 1) - (r5 ^ 81)) % 128;
        r3 = -(-(r0 * 471));
        r5 = ~r11;
        r5 = ~((r5 ^ (-2)) | (r5 & (-2)));
        r5 = -(-(((r5 ^ r0) | (r5 & r0)) * (-235)));
        r6 = ~(r11 | (-2));
        r7 = ~((~r0) | 1);
        r8 = (r0 & (-2)) | (r0 ^ (-2));
        r8 = ~((r8 ^ r11) | (r8 & r11));
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0082, code lost:
    
        if (r10.charAt(((((((r3 | 236) << 1) - (r3 ^ 236)) - (~r5)) - 1) + (((r6 & r0) | (r0 ^ r6)) * (-470))) + (((r7 & r8) | (r7 ^ r8)) * com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_INSTITUTION_LINK_CIRCLE_VALUE)) == '0') goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x008d, code lost:
    
        return false;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    static boolean Camera2StreamConfigurationMap(java.lang.String str, int i) {
        int i2 = Camera2StreamConfigurationMap;
        getHighResolutionOutputSizeshNQ4ISI = ((i2 ^ 69) + ((i2 & 69) << 1)) % 128;
        int length = str.length();
        int i3 = Camera2StreamConfigurationMap;
        getHighResolutionOutputSizeshNQ4ISI = ((i3 & 101) + (i3 | 101)) % 128;
        loop0: while (true) {
            int i4 = 0;
            while (true) {
                length--;
                if (length < i) {
                    if (i4 != 0) {
                        int i5 = Camera2StreamConfigurationMap + 73;
                        getHighResolutionOutputSizeshNQ4ISI = i5 % 128;
                        if (i5 % 2 == 0 ? i4 > 1 : i4 > 1) {
                            int i6 = (length * (-949)) - 949;
                            int i7 = ~length;
                            int i8 = ~i;
                            int i9 = ~((i7 ^ i8) | (i7 & i8));
                            int i10 = ~(i | (-2));
                            int i11 = ((i9 ^ i10) | (i9 & i10)) * 1900;
                            int i12 = ~((i8 ^ 1) | (i8 & 1));
                            int i13 = ~((length ^ i) | (length & i));
                            if (str.charAt((i6 & i11) + (i6 | i11) + (((i12 & i13) | (i12 ^ i13)) * (-950)) + (((~((i ^ 1) | (i & 1))) | (~((length ^ i8) | (i8 & length)))) * 950)) != '0') {
                            }
                        }
                        return true;
                    }
                    return false;
                }
                char charAt = str.charAt(length);
                if (charAt != '.') {
                    if ('0' > charAt) {
                        break loop0;
                    }
                    int i14 = Camera2StreamConfigurationMap;
                    getHighResolutionOutputSizeshNQ4ISI = ((i14 ^ 1) + ((i14 & 1) << 1)) % 128;
                    if (charAt > '9') {
                        break loop0;
                    }
                    i4++;
                } else {
                    break;
                }
            }
            getHighResolutionOutputSizeshNQ4ISI = (Camera2StreamConfigurationMap + 91) % 128;
        }
        getHighResolutionOutputSizeshNQ4ISI = (Camera2StreamConfigurationMap + 77) % 128;
        return false;
    }

    static util.h.xy.dh.k getHighSpeedVideoSizes(byte[] bArr) {
        util.h.xy.dh.k kVar = new util.h.xy.dh.k(bArr, false);
        int i = Camera2StreamConfigurationMap;
        getHighResolutionOutputSizeshNQ4ISI = (((i | 65) << 1) - (i ^ 65)) % 128;
        return kVar;
    }

    private byte[] getHighSpeedVideoFpsRanges() {
        byte[] bArr;
        synchronized (this) {
            int identityHashCode = java.lang.System.identityHashCode(this);
            int i = -(-(((~(((-1880432233) ^ identityHashCode) | (identityHashCode & (-1880432233)))) | (-1491036690)) * (-948)));
            int i2 = ~identityHashCode;
            int i3 = (i & (-1143711067)) + (i | (-1143711067)) + ((~((i2 ^ (-1343556097)) | (i2 & (-1343556097)))) * (-948));
            int identityHashCode2 = java.lang.System.identityHashCode(this);
            int i4 = ~identityHashCode2;
            int i5 = (~((2062213564 ^ i4) | (i4 & 2062213564))) | 364224457;
            int i6 = ~(((-2062213565) ^ identityHashCode2) | (identityHashCode2 & (-2062213565)));
            int i7 = (((i5 ^ i6) | (i5 & i6)) * (-564)) + 1980379933;
            int i8 = (~((identityHashCode2 ^ (-1783259189)) | (identityHashCode2 & (-1783259189)))) * 1128;
            int i9 = ((i7 | i8) << 1) - (i8 ^ i7);
            int i10 = -(-(((~((i4 ^ 364224457) | (i4 & 364224457))) | 278954376) * 564));
            if ((i3 & 2142530348) + (2142530348 | i3) > (i9 & i10) + (i10 | i9)) {
                throw new java.lang.ArithmeticException();
            }
            if (this.getHighSpeedVideoSizes == null) {
                java.io.ByteArrayOutputStream byteArrayOutputStream = new java.io.ByteArrayOutputStream();
                Camera2StreamConfigurationMap(byteArrayOutputStream);
                this.getHighSpeedVideoSizes = byteArrayOutputStream.toByteArray();
            }
            bArr = this.getHighSpeedVideoSizes;
            getHighResolutionOutputSizeshNQ4ISI = (Camera2StreamConfigurationMap + 17) % 128;
        }
        return bArr;
    }

    private void Camera2StreamConfigurationMap(java.io.ByteArrayOutputStream byteArrayOutputStream) {
        java.lang.String m26283;
        util.h.xy.dh.bc bcVar = new util.h.xy.dh.bc(this.getHighSpeedVideoFpsRanges);
        while (bcVar.m26284()) {
            int i = Camera2StreamConfigurationMap + 35;
            getHighResolutionOutputSizeshNQ4ISI = i % 128;
            if (i % 2 != 0) {
                m26283 = bcVar.m26283();
                if (m26283.length() <= 99) {
                    Camera2StreamConfigurationMap = (getHighResolutionOutputSizeshNQ4ISI + 23) % 128;
                    getHighSpeedVideoFpsRangesFor(byteArrayOutputStream, java.lang.Long.parseLong(m26283));
                    getHighResolutionOutputSizeshNQ4ISI = (Camera2StreamConfigurationMap + 77) % 128;
                } else {
                    getHighSpeedVideoFpsRangesFor(byteArrayOutputStream, new java.math.BigInteger(m26283));
                    int i2 = getHighResolutionOutputSizeshNQ4ISI;
                    Camera2StreamConfigurationMap = ((i2 ^ 15) + ((i2 & 15) << 1)) % 128;
                }
            } else {
                m26283 = bcVar.m26283();
                if (m26283.length() <= 18) {
                    Camera2StreamConfigurationMap = (getHighResolutionOutputSizeshNQ4ISI + 23) % 128;
                    getHighSpeedVideoFpsRangesFor(byteArrayOutputStream, java.lang.Long.parseLong(m26283));
                    getHighResolutionOutputSizeshNQ4ISI = (Camera2StreamConfigurationMap + 77) % 128;
                } else {
                    getHighSpeedVideoFpsRangesFor(byteArrayOutputStream, new java.math.BigInteger(m26283));
                    int i22 = getHighResolutionOutputSizeshNQ4ISI;
                    Camera2StreamConfigurationMap = ((i22 ^ 15) + ((i22 & 15) << 1)) % 128;
                }
            }
        }
        int i3 = Camera2StreamConfigurationMap;
        int i4 = (i3 ^ 83) + ((i3 & 83) << 1);
        getHighResolutionOutputSizeshNQ4ISI = i4 % 128;
        if (i4 % 2 != 0) {
            throw null;
        }
    }

    @Override // util.h.xy.dh.mi
    final boolean getHighResolutionOutputSizeshNQ4ISI() {
        int i = (Camera2StreamConfigurationMap + 103) % 128;
        getHighResolutionOutputSizeshNQ4ISI = i;
        int i2 = (i & 85) + (i | 85);
        Camera2StreamConfigurationMap = i2 % 128;
        if (i2 % 2 != 0) {
            return false;
        }
        throw new java.lang.ArithmeticException();
    }

    @Override // util.h.xy.dh.mi
    final void getHighResolutionOutputSizeshNQ4ISI(util.h.xy.dh.rj rjVar, boolean z) throws java.io.IOException {
        int i = getHighResolutionOutputSizeshNQ4ISI;
        int i2 = ((i | 55) << 1) - (i ^ 55);
        Camera2StreamConfigurationMap = i2 % 128;
        if (i2 % 2 == 0) {
            rjVar.getHighSpeedVideoSizes(z, 91, getHighSpeedVideoFpsRanges());
        } else {
            rjVar.getHighSpeedVideoSizes(z, 13, getHighSpeedVideoFpsRanges());
        }
        int i3 = getHighResolutionOutputSizeshNQ4ISI + 95;
        Camera2StreamConfigurationMap = i3 % 128;
        if (i3 % 2 == 0) {
            throw new java.lang.ArithmeticException();
        }
    }

    @Override // util.h.xy.dh.mi
    final int getHighSpeedVideoFpsRanges(boolean z) {
        int i = getHighResolutionOutputSizeshNQ4ISI + 63;
        Camera2StreamConfigurationMap = i % 128;
        byte[] highSpeedVideoFpsRanges = getHighSpeedVideoFpsRanges();
        if (i % 2 != 0) {
            return util.h.xy.dh.rj.getHighSpeedVideoFpsRangesFor(z, highSpeedVideoFpsRanges.length);
        }
        util.h.xy.dh.rj.getHighSpeedVideoFpsRangesFor(z, highSpeedVideoFpsRanges.length);
        throw null;
    }

    @Override // util.h.xy.dh.mi
    final boolean getHighSpeedVideoFpsRanges(util.h.xy.dh.mi miVar) {
        int i = Camera2StreamConfigurationMap;
        int i2 = (i & 91) + (i | 91);
        int i3 = i2 % 128;
        getHighResolutionOutputSizeshNQ4ISI = i3;
        if (i2 % 2 != 0) {
            throw null;
        }
        if (this == miVar) {
            getHighResolutionOutputSizeshNQ4ISI = ((i ^ 43) + ((i & 43) << 1)) % 128;
            return true;
        }
        if (miVar instanceof util.h.xy.dh.k) {
            return this.getHighSpeedVideoFpsRanges.equals(((util.h.xy.dh.k) miVar).getHighSpeedVideoFpsRanges);
        }
        int i4 = (i3 & 77) + (i3 | 77);
        Camera2StreamConfigurationMap = i4 % 128;
        boolean z = i4 % 2 == 0;
        int i5 = (i3 ^ 99) + ((i3 & 99) << 1);
        Camera2StreamConfigurationMap = i5 % 128;
        if (i5 % 2 != 0) {
            return z;
        }
        throw null;
    }

    public java.lang.String toString() {
        int i = getHighResolutionOutputSizeshNQ4ISI;
        Camera2StreamConfigurationMap = ((i ^ com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CALENDAR_VALUE) + ((i & com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CALENDAR_VALUE) << 1)) % 128;
        java.lang.String m26302 = m26302();
        getHighResolutionOutputSizeshNQ4ISI = (Camera2StreamConfigurationMap + 101) % 128;
        return m26302;
    }

    @Override // util.h.xy.dh.mi, util.h.xy.dh.mh
    public int hashCode() {
        getHighResolutionOutputSizeshNQ4ISI = (Camera2StreamConfigurationMap + 59) % 128;
        int hashCode = this.getHighSpeedVideoFpsRanges.hashCode();
        int i = getHighResolutionOutputSizeshNQ4ISI;
        int i2 = (i & 23) + (i | 23);
        Camera2StreamConfigurationMap = i2 % 128;
        if (i2 % 2 != 0) {
            return hashCode;
        }
        throw null;
    }

    /* renamed from: ˋ, reason: contains not printable characters */
    public java.lang.String m26302() {
        int identityHashCode = java.lang.System.identityHashCode(this);
        int i = ~identityHashCode;
        int i2 = ~((i ^ (-1824393361)) | (i & (-1824393361)));
        int i3 = (-927533969) - (~(((i2 ^ 673974416) | (i2 & 673974416)) * (-245)));
        int i4 = ~(identityHashCode | (-1824393361));
        int i5 = -(-(i4 * (-245)));
        int i6 = (i3 ^ i5) + ((i5 & i3) << 1);
        int i7 = ((i4 ^ (-673983700)) | (i4 & (-673983700))) * com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_BALANCE_BEAM_02_VALUE;
        int identityHashCode2 = java.lang.System.identityHashCode(this);
        int i8 = ~identityHashCode2;
        int i9 = (i8 ^ 1344359836) | (i8 & 1344359836);
        int i10 = (((~((i9 ^ (-1702163398)) | (i9 & (-1702163398)))) | (~((-268504089) | identityHashCode2))) * (-318)) + 1510416922;
        int i11 = ~((1344359836 & identityHashCode2) | (identityHashCode2 ^ 1344359836));
        int i12 = ((i11 ^ (-1970667486)) | (i11 & (-1970667486))) * (-318);
        int i13 = (i10 & i12) + (i10 | i12);
        int i14 = ~((identityHashCode2 ^ (-1344359837)) | (identityHashCode2 & (-1344359837)));
        int i15 = ((i14 ^ 1702163397) | (i14 & 1702163397)) * 318;
        java.lang.String str = this.getHighSpeedVideoFpsRanges;
        if ((i6 & i7) + (i7 | i6) <= (i13 ^ i15) + ((i15 & i13) << 1)) {
            throw new java.lang.ArithmeticException();
        }
        int i16 = Camera2StreamConfigurationMap;
        getHighResolutionOutputSizeshNQ4ISI = (((i16 | 83) << 1) - (i16 ^ 83)) % 128;
        return str;
    }

    private k(byte[] bArr, boolean z) {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
        java.math.BigInteger bigInteger = null;
        boolean z2 = true;
        int i = 0;
        long j = 0;
        while (i != bArr.length) {
            byte b = bArr[i];
            if (j <= 72057594037927808L) {
                long j2 = j + (b & Byte.MAX_VALUE);
                if ((b & 128) == 0) {
                    if (z2) {
                        z2 = false;
                    } else {
                        stringBuffer.append(com.paypal.oslo.core.money.MoneyKt.DECIMALSEPARATOR);
                    }
                    stringBuffer.append(j2);
                    j = 0;
                    int i2 = ((i | (-96)) << 1) - (i ^ (-96));
                    i = ((i2 | 97) << 1) - (i2 ^ 97);
                } else {
                    j = j2 << 7;
                    int i22 = ((i | (-96)) << 1) - (i ^ (-96));
                    i = ((i22 | 97) << 1) - (i22 ^ 97);
                }
            } else {
                java.math.BigInteger or = (bigInteger == null ? java.math.BigInteger.valueOf(j) : bigInteger).or(java.math.BigInteger.valueOf(b & Byte.MAX_VALUE));
                if ((b & 128) == 0) {
                    if (z2) {
                        z2 = false;
                    } else {
                        stringBuffer.append(com.paypal.oslo.core.money.MoneyKt.DECIMALSEPARATOR);
                    }
                    stringBuffer.append(or);
                    bigInteger = null;
                    j = 0;
                    int i222 = ((i | (-96)) << 1) - (i ^ (-96));
                    i = ((i222 | 97) << 1) - (i222 ^ 97);
                } else {
                    bigInteger = or.shiftLeft(7);
                    int i2222 = ((i | (-96)) << 1) - (i ^ (-96));
                    i = ((i2222 | 97) << 1) - (i2222 ^ 97);
                }
            }
        }
        this.getHighSpeedVideoFpsRanges = stringBuffer.toString();
        this.getHighSpeedVideoSizes = bArr;
    }
}
