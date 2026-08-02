package util.h.xy.fb;

/* loaded from: classes18.dex */
public final class mb {
    private static int Camera2StreamConfigurationMap = 0;
    private static int getHighResolutionOutputSizeshNQ4ISI = 1;
    private static final int getHighSpeedVideoFpsRanges;
    private static int getHighSpeedVideoFpsRangesFor = 0;
    private static char getHighSpeedVideoSizes = 0;
    private static char[] getHighSpeedVideoSizesFor = null;
    private static int getInputFormats = 1;
    private static final java.math.BigInteger getOutputFormats;
    private static final java.math.BigInteger getOutputMinFrameDuration;

    /* renamed from: ˊ, reason: contains not printable characters */
    public static final java.math.BigInteger f2215;

    /* renamed from: ˏ, reason: contains not printable characters */
    public static final java.math.BigInteger f2216;

    /* renamed from: ᐝ, reason: contains not printable characters */
    public static final java.math.BigInteger f2217;

    private static void getHighSpeedVideoFpsRangesFor(byte b, java.lang.String str, int i, java.lang.Object[] objArr) {
        int i2;
        char[] charArray = str.toCharArray();
        util.h.xz.b.mc mcVar = new util.h.xz.b.mc();
        char[] cArr = getHighSpeedVideoSizesFor;
        if (cArr != null) {
            getHighSpeedVideoFpsRangesFor = (getHighResolutionOutputSizeshNQ4ISI + 99) % 128;
            int length = cArr.length;
            char[] cArr2 = new char[length];
            for (int i3 = 0; i3 < length; i3++) {
                cArr2[i3] = (char) (cArr[i3] ^ 4042185467053315654L);
            }
            cArr = cArr2;
        }
        char c = (char) (4042185467053315654L ^ getHighSpeedVideoSizes);
        char[] cArr3 = new char[i];
        if (i % 2 != 0) {
            i2 = i - 1;
            cArr3[i2] = (char) (charArray[i2] - b);
        } else {
            i2 = i;
        }
        if (i2 > 1) {
            mcVar.f2638 = 0;
            while (mcVar.f2638 < i2) {
                mcVar.f2641 = charArray[mcVar.f2638];
                mcVar.f2636 = charArray[mcVar.f2638 + 1];
                if (mcVar.f2641 == mcVar.f2636) {
                    cArr3[mcVar.f2638] = (char) (mcVar.f2641 - b);
                    cArr3[mcVar.f2638 + 1] = (char) (mcVar.f2636 - b);
                } else {
                    mcVar.f2639 = mcVar.f2641 / c;
                    mcVar.f2640 = mcVar.f2641 % c;
                    mcVar.f2637 = mcVar.f2636 / c;
                    mcVar.f2635 = mcVar.f2636 % c;
                    if (mcVar.f2640 == mcVar.f2635) {
                        mcVar.f2639 = ((mcVar.f2639 + c) - 1) % c;
                        mcVar.f2637 = ((mcVar.f2637 + c) - 1) % c;
                        int i4 = mcVar.f2639;
                        int i5 = mcVar.f2640;
                        int i6 = mcVar.f2637;
                        int i7 = mcVar.f2635;
                        cArr3[mcVar.f2638] = cArr[(i4 * c) + i5];
                        cArr3[mcVar.f2638 + 1] = cArr[(i6 * c) + i7];
                    } else if (mcVar.f2639 == mcVar.f2637) {
                        mcVar.f2640 = ((mcVar.f2640 + c) - 1) % c;
                        mcVar.f2635 = ((mcVar.f2635 + c) - 1) % c;
                        int i8 = mcVar.f2639;
                        int i9 = mcVar.f2640;
                        int i10 = mcVar.f2637;
                        int i11 = mcVar.f2635;
                        cArr3[mcVar.f2638] = cArr[(i8 * c) + i9];
                        cArr3[mcVar.f2638 + 1] = cArr[(i10 * c) + i11];
                    } else {
                        int i12 = mcVar.f2639;
                        int i13 = mcVar.f2635;
                        int i14 = mcVar.f2637;
                        int i15 = mcVar.f2640;
                        cArr3[mcVar.f2638] = cArr[(i12 * c) + i13];
                        cArr3[mcVar.f2638 + 1] = cArr[(i14 * c) + i15];
                        int i16 = getHighSpeedVideoFpsRangesFor + 53;
                        getHighResolutionOutputSizeshNQ4ISI = i16 % 128;
                        if (i16 % 2 == 0) {
                            int i17 = 3 / 5;
                        }
                    }
                }
                mcVar.f2638 += 2;
                getHighSpeedVideoFpsRangesFor = (getHighResolutionOutputSizeshNQ4ISI + 107) % 128;
            }
        }
        for (int i18 = 0; i18 < i; i18++) {
            cArr3[i18] = (char) (cArr3[i18] ^ 13722);
        }
        objArr[0] = new java.lang.String(cArr3);
    }

    static {
        getHighSpeedVideoFpsRanges();
        f2217 = java.math.BigInteger.valueOf(0L);
        f2216 = java.math.BigInteger.valueOf(1L);
        f2215 = java.math.BigInteger.valueOf(2L);
        getOutputMinFrameDuration = java.math.BigInteger.valueOf(3L);
        java.lang.Object[] objArr = new java.lang.Object[1];
        getHighSpeedVideoFpsRangesFor((byte) (android.view.View.resolveSize(0, 0) + 17), "\u0010\u0007#\u0010\u0011\u000f\u001b&\f\u0015\t#\u0019&\u0011\u000f&\u0019㖾㖾\u0010\u0002(#\t*&#\t+*\r&\u0019\u0016\n$&#)-*\u001d\u000f\u0010\u0002\u000f\t%.*\u0015\u0015\n\u0015\u000e\u000e%\r+\u0015$\u0017\n\r*,\u0002\u0015*#\t\u0019&\u0019$\u0017/\u0017\u000f/\u0017\u0013#&)\u001a&\u0017(\u0015\u000f\t\u000f$\u001b\u001d+%\u0014#\u0010㖽㖽\u0016\n$\f\u0017\u0011\u0010\u0007#\u0014㘐㘐*\u0010\u0007$\f\u0017.%\t\u000e\u0010*\u0017\u001b\u0011\u000f%\f$\f\u0015&*\u0014-*\u0007%\u000f%\f#).\t#$\u001a\u0002,#\t\u001b\u0019\u0015$\u0017/\r,*\u000e%(\u0019$%\r\u0016(\u0015\n,\u0002\r#!/\u000b%$\r#\f(\u0015\u0015\u000e(\u0017\t*\t\n\u0012%.)\u0015\n%)(\u0016)$.)\r*\u0010*#\u000f\u0016&\u0015\u0011\u000e%\u000f\t\r,\t*\u0017\u0002$\f\u000f\u0007%\u0007\u0016&+\r$\u001b%+%\u000b\u0012#$($\u001a㘍", 257 - android.text.TextUtils.getOffsetAfter("", 0), objArr);
        getOutputFormats = new java.math.BigInteger(((java.lang.String) objArr[0]).intern(), 16);
        getHighSpeedVideoFpsRanges = java.math.BigInteger.valueOf(743L).bitLength();
        int i = Camera2StreamConfigurationMap + 23;
        getInputFormats = i % 128;
        if (i % 2 == 0) {
            throw new java.lang.ArithmeticException();
        }
    }

    private static byte[] getHighResolutionOutputSizeshNQ4ISI(int i, java.security.SecureRandom secureRandom) throws java.lang.IllegalArgumentException {
        int i2 = Camera2StreamConfigurationMap + 23;
        getInputFormats = i2 % 128;
        if (i2 % 2 != 0 ? i <= 0 : i <= 0) {
            java.lang.Object[] objArr = new java.lang.Object[1];
            getHighSpeedVideoFpsRangesFor((byte) (android.text.AndroidCharacter.getMirror(com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask) + 'E'), "#\u0001$\u001f\u0012,\u0003(\u0010\u0012.\u001f\u0011)\u000f&\u0011\u0012\u001f-\u0014\u0018\u0011\u0017\u0011)\u0010\n", (android.media.AudioTrack.getMaxVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 27, objArr);
            throw new java.lang.IllegalArgumentException(((java.lang.String) objArr[0]).intern());
        }
        int i3 = (i + 7) / 8;
        byte[] bArr = new byte[i3];
        secureRandom.nextBytes(bArr);
        bArr[0] = (byte) (((byte) (255 >>> ((i3 * 8) - i))) & bArr[0]);
        Camera2StreamConfigurationMap = (getInputFormats + 39) % 128;
        return bArr;
    }

    /* renamed from: util.h.xy.fb.mb$mb, reason: collision with other inner class name */
    public static final class C0268mb {
        private static int getHighResolutionOutputSizeshNQ4ISI = 0;
        private static int getHighSpeedVideoSizes = 1;
        private final java.util.Map<java.math.BigInteger, java.lang.Boolean> Camera2StreamConfigurationMap = new java.util.WeakHashMap();
        private final java.math.BigInteger[] getHighSpeedVideoFpsRanges = new java.math.BigInteger[8];
        private int getHighSpeedVideoFpsRangesFor = 0;

        /* renamed from: ˊ, reason: contains not printable characters */
        public final boolean m26837(java.math.BigInteger bigInteger) {
            boolean containsKey;
            synchronized (this) {
                getHighSpeedVideoSizes = (getHighResolutionOutputSizeshNQ4ISI + 1) % 128;
                containsKey = this.Camera2StreamConfigurationMap.containsKey(bigInteger);
                int i = getHighResolutionOutputSizeshNQ4ISI + 5;
                getHighSpeedVideoSizes = i % 128;
                if (i % 2 == 0) {
                    throw null;
                }
            }
            return containsKey;
        }

        /* renamed from: ˏ, reason: contains not printable characters */
        public final void m26838(java.math.BigInteger bigInteger) {
            synchronized (this) {
                getHighResolutionOutputSizeshNQ4ISI = (getHighSpeedVideoSizes + 39) % 128;
                this.Camera2StreamConfigurationMap.put(bigInteger, java.lang.Boolean.TRUE);
                java.math.BigInteger[] bigIntegerArr = this.getHighSpeedVideoFpsRanges;
                int i = this.getHighSpeedVideoFpsRangesFor;
                bigIntegerArr[i] = bigInteger;
                int identityHashCode = java.lang.System.identityHashCode(this);
                int i2 = i * (-520);
                int i3 = ~identityHashCode;
                int i4 = ~((i3 & i) | (i3 ^ i));
                int i5 = (i2 ^ my.com.softspace.ssfasstapsdk.pog.AttestationPOG.POGStatusCodes.RST_POG_ACTIVATION_SCRP_FAIL) + ((i2 & my.com.softspace.ssfasstapsdk.pog.AttestationPOG.POGStatusCodes.RST_POG_ACTIVATION_SCRP_FAIL) << 1) + (((i4 & 1) | (i4 ^ 1)) * (-1042));
                int i6 = -(-(((i ^ identityHashCode) | (i & identityHashCode)) * my.com.softspace.ssfasstapsdk.pog.AttestationPOG.POGStatusCodes.RST_POG_ATTEST_SCRP_FAIL));
                int i7 = (i5 ^ i6) + ((i6 & i5) << 1);
                int i8 = ~i;
                int i9 = ~((i8 ^ (-2)) | (i8 & (-2)));
                int i10 = ~((identityHashCode ^ (-2)) | (identityHashCode & (-2)));
                int i11 = (i10 ^ i9) | (i9 & i10);
                int i12 = ~(i3 | 1 | i);
                int i13 = ((i11 ^ i12) | (i12 & i11)) * my.com.softspace.ssfasstapsdk.pog.AttestationPOG.POGStatusCodes.RST_POG_ATTEST_SCRP_FAIL;
                this.getHighSpeedVideoFpsRangesFor = ((i7 & i13) + (i13 | i7)) % this.getHighSpeedVideoFpsRanges.length;
                getHighResolutionOutputSizeshNQ4ISI = (getHighSpeedVideoSizes + 107) % 128;
            }
        }
    }

    /* renamed from: ᐝ, reason: contains not printable characters */
    public static java.math.BigInteger m26836(int i, java.security.SecureRandom secureRandom) {
        java.math.BigInteger bigInteger = new java.math.BigInteger(1, getHighResolutionOutputSizeshNQ4ISI(i, secureRandom));
        int i2 = Camera2StreamConfigurationMap + 83;
        getInputFormats = i2 % 128;
        if (i2 % 2 != 0) {
            return bigInteger;
        }
        throw new java.lang.ArithmeticException();
    }

    /* renamed from: ˋ, reason: contains not printable characters */
    public static java.math.BigInteger m26834(java.math.BigInteger bigInteger, java.math.BigInteger bigInteger2) {
        if (!bigInteger.testBit(0)) {
            java.lang.Object[] objArr = new java.lang.Object[1];
            getHighSpeedVideoFpsRangesFor((byte) (61 - (android.view.ViewConfiguration.getPressedStateDuration() >> 16)), "\"\u0000\u001f\u000e.\u001f\u0011)\u000f&\u0011\u0012\u0010.㘻", 15 - (android.view.ViewConfiguration.getMaximumFlingVelocity() >> 16), objArr);
            throw new java.lang.IllegalArgumentException(((java.lang.String) objArr[0]).intern());
        }
        if (bigInteger.signum() != 1) {
            java.lang.Object[] objArr2 = new java.lang.Object[1];
            getHighSpeedVideoFpsRangesFor((byte) (79 - android.view.View.MeasureSpec.getMode(0)), "\u0015\u0004\f\u0005-'\u0013\u0002\u000f,\u001f\u0010.\u0011.\u001e\u0019\"\u000e\u0012\u0004\u0019-\u0018\u0019\u0010\u000e\u0006#\u0003\u0002\u000f", android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0) + 33, objArr2);
            throw new java.lang.ArithmeticException(((java.lang.String) objArr2[0]).intern());
        }
        if (bigInteger2.signum() < 0 || bigInteger2.compareTo(bigInteger) >= 0) {
            bigInteger2 = bigInteger2.mod(bigInteger);
        }
        int bitLength = bigInteger.bitLength();
        int[] m26733 = util.h.xy.ex.b.m26733(bitLength, bigInteger);
        int[] m267332 = util.h.xy.ex.b.m26733(bitLength, bigInteger2);
        int length = m26733.length;
        int[] m26732 = util.h.xy.ex.b.m26732(length);
        if (util.h.xy.ex.mb.m26738(m26733, m267332, m26732) != 0) {
            return util.h.xy.ex.b.m26734(length, m26732);
        }
        try {
            java.lang.Object[] objArr3 = new java.lang.Object[1];
            getHighSpeedVideoFpsRangesFor((byte) (4 - (android.view.ViewConfiguration.getWindowTouchSlop() >> 8)), "\u0015\u0004\f\u0005-'\u0013\u0002\u000f,\u0012-\u0011'\u000e\u0003+\u0004\u000f,#\u0003)\u0016\u0011\u0014", 26 - (((java.lang.Integer) java.lang.Class.forName("android.os.Process").getMethod("myTid", null).invoke(null, null)).intValue() >> 22), objArr3);
            throw new java.lang.ArithmeticException(((java.lang.String) objArr3[0]).intern());
        } catch (java.lang.Throwable th) {
            java.lang.Throwable cause = th.getCause();
            if (cause != null) {
                throw cause;
            }
            throw th;
        }
    }

    /* renamed from: ˋ, reason: contains not printable characters */
    public static java.math.BigInteger m26835(java.math.BigInteger bigInteger, java.math.BigInteger bigInteger2, java.security.SecureRandom secureRandom) {
        int compareTo = bigInteger.compareTo(bigInteger2);
        if (compareTo >= 0) {
            getInputFormats = (Camera2StreamConfigurationMap + 59) % 128;
            if (compareTo <= 0) {
                return bigInteger;
            }
            java.lang.Object[] objArr = new java.lang.Object[1];
            getHighSpeedVideoFpsRangesFor((byte) ((android.view.ViewConfiguration.getTapTimeout() >> 16) + 14), "\u001f*\u0004*\u001f\u000e\u0003\u001f\n\u0014\u0004\u0019-\u0018%\u000f\u0013\u0003,\u000f\u001f-\u000f,\u0018-\u0011\u0016-\u0012\u001f*\u0015-㗋", (android.os.SystemClock.uptimeMillis() > 0L ? 1 : (android.os.SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 34, objArr);
            throw new java.lang.IllegalArgumentException(((java.lang.String) objArr[0]).intern());
        }
        if (bigInteger.bitLength() > bigInteger2.bitLength() / 2) {
            int i = Camera2StreamConfigurationMap + 93;
            getInputFormats = i % 128;
            java.math.BigInteger m26835 = m26835(f2217, bigInteger2.subtract(bigInteger), secureRandom);
            if (i % 2 != 0) {
                return m26835.add(bigInteger);
            }
            m26835.add(bigInteger);
            throw null;
        }
        for (int i2 = 0; i2 < 1000; i2++) {
            java.math.BigInteger m26836 = m26836(bigInteger2.bitLength(), secureRandom);
            if (m26836.compareTo(bigInteger) >= 0) {
                getInputFormats = (Camera2StreamConfigurationMap + 41) % 128;
                if (m26836.compareTo(bigInteger2) <= 0) {
                    return m26836;
                }
            }
        }
        return m26836(bigInteger2.subtract(bigInteger).bitLength() - 1, secureRandom).add(bigInteger);
    }

    static void getHighSpeedVideoFpsRanges() {
        getHighSpeedVideoSizesFor = new char[]{41909, 41898, 41027, 41028, 41025, 41915, 41873, 41914, 41961, 41965, 41031, 41024, 41029, 41893, 41956, 41908, 41913, 41980, 41907, 41970, 41903, 41916, 41966, 41900, 41917, 41886, 41919, 41904, 41979, 41872, 41958, 41038, 41897, 41030, 41026, 41957, 41918, 41967, 41896, 41960, 41962, 41964, 41892, 41902, 41912, 41905, 41906, 41877, 41963};
        getHighSpeedVideoSizes = (char) 38465;
    }
}
