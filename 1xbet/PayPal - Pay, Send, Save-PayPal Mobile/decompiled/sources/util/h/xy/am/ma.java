package util.h.xy.am;

/* loaded from: classes5.dex */
public final class ma {
    private static util.h.xy.aj.b Camera2StreamConfigurationMap = null;
    private static boolean getHighResolutionOutputSizeshNQ4ISI = false;
    private static int getHighSpeedVideoFpsRangesFor = 1;
    private static int getHighSpeedVideoSizes = 14;

    static {
        int i = 14 % 2;
    }

    /* renamed from: ˋ, reason: contains not printable characters */
    public static com.thalesgroup.gemalto.securelog.SecureLog m25028(com.thalesgroup.gemalto.securelog.SecureLogConfig secureLogConfig) {
        synchronized (util.h.xy.am.ma.class) {
            int i = getHighSpeedVideoSizes;
            getHighSpeedVideoFpsRangesFor = ((i ^ 41) + ((i & 41) << 1)) % 128;
            util.h.xy.aj.b bVar = Camera2StreamConfigurationMap;
            if (bVar != null) {
                getHighSpeedVideoFpsRangesFor = ((i & 79) + (i | 79)) % 128;
                return bVar;
            }
            if (secureLogConfig != null) {
                util.h.xy.aj.b bVar2 = (util.h.xy.aj.b) util.h.xy.am.ra.m25033(secureLogConfig);
                Camera2StreamConfigurationMap = bVar2;
                bVar2.m24958(new util.h.xy.aj.a());
                Camera2StreamConfigurationMap.a1(util.h.xy.al.ra.f443);
                Camera2StreamConfigurationMap.a2(50, util.h.xy.al.ra.f476);
                util.h.xy.v.a.f2437.m27565((com.sun.jna.Pointer) Camera2StreamConfigurationMap.b1(), util.h.xy.al.ra.f476);
                int i2 = getHighSpeedVideoSizes;
                int i3 = (i2 & 43) + (i2 | 43);
                getHighSpeedVideoFpsRangesFor = i3 % 128;
                int i4 = i3 % 2;
            }
            getHighResolutionOutputSizeshNQ4ISI = true;
            util.h.xy.aj.b bVar3 = Camera2StreamConfigurationMap;
            int i5 = getHighSpeedVideoFpsRangesFor;
            getHighSpeedVideoSizes = ((i5 ^ 105) + ((i5 & 105) << 1)) % 128;
            return bVar3;
        }
    }

    /* renamed from: ˊ, reason: contains not printable characters */
    public static void m25027(java.lang.String str, java.lang.String str2) {
        int i = getHighSpeedVideoSizes;
        int i2 = (i & 3) + (i | 3);
        int i3 = i2 % 128;
        getHighSpeedVideoFpsRangesFor = i3;
        if (i2 % 2 == 0) {
            throw null;
        }
        if (Camera2StreamConfigurationMap != null) {
            int i4 = i3 + 5;
            getHighSpeedVideoSizes = i4 % 128;
            if (i4 % 2 != 0) {
                throw null;
            }
            if (str != null && str2 != null) {
                getHighSpeedVideoSizes = ((i3 & 119) + (i3 | 119)) % 128;
                if (str.length() > 0) {
                    getHighSpeedVideoFpsRangesFor = (getHighSpeedVideoSizes + 79) % 128;
                    if (str2.length() > 0) {
                        Camera2StreamConfigurationMap.m(util.h.xy.al.ra.f476, com.thalesgroup.gemalto.securelog.SecureLogLevel.DEBUG, str, str2);
                        return;
                    }
                }
            }
        }
        int i5 = getHighSpeedVideoSizes;
        int i6 = ((i5 | 25) << 1) - (i5 ^ 25);
        getHighSpeedVideoFpsRangesFor = i6 % 128;
        if (i6 % 2 == 0) {
            throw null;
        }
    }

    /* renamed from: ˏ, reason: contains not printable characters */
    public static void m25029(java.lang.String str, java.lang.String str2) {
        int i = getHighSpeedVideoSizes;
        getHighSpeedVideoFpsRangesFor = (((i | 61) << 1) - (i ^ 61)) % 128;
        if (Camera2StreamConfigurationMap != null) {
            int i2 = i + 37;
            int i3 = i2 % 128;
            getHighSpeedVideoFpsRangesFor = i3;
            if (i2 % 2 == 0) {
                throw new java.lang.ArithmeticException();
            }
            if (str != null) {
                int i4 = ((i3 | 9) << 1) - (i3 ^ 9);
                getHighSpeedVideoSizes = i4 % 128;
                if (i4 % 2 != 0) {
                    throw null;
                }
                if (str2 == null || str.length() <= 0) {
                    return;
                }
                int i5 = getHighSpeedVideoSizes + 9;
                getHighSpeedVideoFpsRangesFor = i5 % 128;
                if (i5 % 2 == 0) {
                    throw new java.lang.ArithmeticException();
                }
                if (str2.length() > 0) {
                    Camera2StreamConfigurationMap.m(util.h.xy.al.ra.f476, com.thalesgroup.gemalto.securelog.SecureLogLevel.ERROR, str, str2);
                    int i6 = getHighSpeedVideoSizes;
                    int i7 = ((i6 | 85) << 1) - (i6 ^ 85);
                    getHighSpeedVideoFpsRangesFor = i7 % 128;
                    if (i7 % 2 == 0) {
                        throw null;
                    }
                }
            }
        }
    }

    /* renamed from: ᐝ, reason: contains not printable characters */
    public static void m25031(java.lang.String str, java.lang.String str2) {
        int i = getHighSpeedVideoFpsRangesFor;
        getHighSpeedVideoSizes = (i + 81) % 128;
        if (Camera2StreamConfigurationMap != null) {
            getHighSpeedVideoSizes = ((i ^ 27) + ((i & 27) << 1)) % 128;
            if (str != null) {
                int i2 = (i & 45) + (i | 45);
                getHighSpeedVideoSizes = i2 % 128;
                if (i2 % 2 != 0) {
                    throw null;
                }
                if (str2 != null && str.length() > 0) {
                    getHighSpeedVideoFpsRangesFor = (getHighSpeedVideoSizes + 103) % 128;
                    if (str2.length() > 0) {
                        Camera2StreamConfigurationMap.m(util.h.xy.al.ra.f476, com.thalesgroup.gemalto.securelog.SecureLogLevel.INFO, str, str2);
                        return;
                    }
                }
            }
        }
        int i3 = getHighSpeedVideoSizes;
        getHighSpeedVideoFpsRangesFor = ((i3 & 125) + (i3 | 125)) % 128;
    }

    /* renamed from: ˏ, reason: contains not printable characters */
    public static void m25030(java.lang.String str, byte[] bArr) {
        int i = getHighSpeedVideoSizes;
        int i2 = (i ^ 51) + ((i & 51) << 1);
        getHighSpeedVideoFpsRangesFor = i2 % 128;
        if (i2 % 2 == 0) {
            throw new java.lang.ArithmeticException();
        }
        if (Camera2StreamConfigurationMap != null && str != null && str.length() > 0) {
            java.lang.String str2 = util.h.xy.al.ra.f656;
            if (bArr != null) {
                int i3 = getHighSpeedVideoSizes;
                getHighSpeedVideoFpsRangesFor = (i3 + 71) % 128;
                if (bArr.length > 0) {
                    getHighSpeedVideoFpsRangesFor = ((i3 ^ 93) + ((i3 & 93) << 1)) % 128;
                    str2 = util.h.xy.al.rb.m25016(m25032(bArr));
                    getHighSpeedVideoFpsRangesFor = (getHighSpeedVideoSizes + 85) % 128;
                }
            }
            Camera2StreamConfigurationMap.m(util.h.xy.al.ra.f476, com.thalesgroup.gemalto.securelog.SecureLogLevel.INFO, str, str2);
            int i4 = getHighSpeedVideoSizes + 67;
            getHighSpeedVideoFpsRangesFor = i4 % 128;
            if (i4 % 2 == 0) {
                throw null;
            }
            return;
        }
        int currentTimeMillis = (int) java.lang.System.currentTimeMillis();
        int i5 = ~currentTimeMillis;
        int i6 = ~(((-1295732824) ^ i5) | (i5 & (-1295732824)));
        int i7 = ((i6 ^ 3162114) | (i6 & 3162114)) * com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CODE_ACCOUNT_VERIFICATION_VALUE;
        int i8 = (((i7 ^ (-458803015)) + ((i7 & (-458803015)) << 1)) - (~((~(((-3162115) ^ currentTimeMillis) | (currentTimeMillis & (-3162115)))) * com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CODE_ACCOUNT_VERIFICATION_VALUE))) - 1;
        int i9 = ~((i5 ^ (-275834891)) | (i5 & (-275834891)));
        int i10 = (i9 ^ 272672776) | (i9 & 272672776);
        int i11 = ~((currentTimeMillis ^ (-1292570710)) | (currentTimeMillis & (-1292570710)));
        int i12 = -(-(((i11 ^ i10) | (i11 & i10)) * com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CODE_ACCOUNT_VERIFICATION_VALUE));
        int currentTimeMillis2 = (int) java.lang.System.currentTimeMillis();
        int i13 = ~currentTimeMillis2;
        int i14 = ~((i13 ^ 1710464982) | (i13 & 1710464982));
        int i15 = -(-((402939944 | i14) * (-712)));
        int i16 = (i13 ^ (-2095506237)) | (i13 & (-2095506237));
        int i17 = ~((i16 ^ 1710464982) | (i16 & 1710464982));
        int i18 = ~((currentTimeMillis2 ^ 2113404926) | (currentTimeMillis2 & 2113404926));
        int i19 = ((((i15 | (-1217530174)) << 1) - ((-1217530174) ^ i15)) - (~(-(-(((i18 ^ i17) | (i18 & i17)) * (-712)))))) - 1;
        int i20 = -(-(((i14 & (-2095506237)) | (i14 ^ (-2095506237))) * 712));
        if (((i8 | i12) << 1) - (i12 ^ i8) <= (i19 ^ i20) + ((i20 & i19) << 1)) {
            throw null;
        }
    }

    /* renamed from: ᐝ, reason: contains not printable characters */
    public static byte[] m25032(byte[] bArr) {
        util.h.xy.eh.b bVar = new util.h.xy.eh.b();
        bVar.mo26562(bArr, 0, bArr.length);
        byte[] bArr2 = new byte[bVar.mo26565()];
        bVar.mo26563(bArr2, 0);
        getHighSpeedVideoSizes = (getHighSpeedVideoFpsRangesFor + 89) % 128;
        return bArr2;
    }
}
